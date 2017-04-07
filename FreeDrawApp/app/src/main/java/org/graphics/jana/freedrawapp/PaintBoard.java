package org.graphics.jana.freedrawapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Environment;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import org.graphics.jana.mypaintlib.PaintBrush;
import org.graphics.jana.mypaintlib.PaintBrushDefine;
import org.graphics.jana.mypaintlib.PaintBrushSetter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by ejchoi on 2017-03-22.
 */

public class PaintBoard extends View {
    private Bitmap m_Bitmap;
    private Canvas m_Canvas;

    private PaintBrush m_Brush;
    private Paint m_Paint;

    private int m_nPen = 0;
    private int m_nColor = 0xff000000;
    private int m_nSize = 2;

    private float m_fLastX = -1;
    private float m_fLastY = -1;

    private final Path m_Path = new Path();

    private float m_fCurveEndX;
    private float m_fCurveEndY;

    private int m_nInvalidateExtraBorder = 10;
    static final float TOUCH_TOLERANCE = 8;


    public PaintBoard(Context context) {
        super(context);

        m_Paint = new Paint();
        m_Paint.setAntiAlias(true);
        m_Paint.setDither(true);
        m_Paint.setStyle(Paint.Style.STROKE);
        m_Paint.setStrokeJoin(Paint.Join.ROUND);
        m_Paint.setStrokeCap(Paint.Cap.ROUND);

        m_Paint.setColor(m_nColor);
        m_Paint.setStrokeWidth(m_nSize);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        m_Bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        m_Canvas = new Canvas();
        m_Canvas.setBitmap(m_Bitmap);
        m_Canvas.drawColor(getResources().getColor(R.color.colorBaseBackground));
    }

    public void clear() {
        m_Canvas.drawColor(getResources().getColor(R.color.colorBaseBackground));
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(m_Bitmap != null)
            canvas.drawBitmap(m_Bitmap, 0, 0, null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN: {
                if(m_nPen == 0) {
                    Rect rect = touchDown(event);
                    if(rect != null)
                        invalidate(rect);
                }
                else {
                    m_Brush = new PaintBrush(m_Bitmap);
                    initPaintBrush(m_Brush, m_nPen);
                    m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
                    invalidate();
                }

                return true;
            }

            case MotionEvent.ACTION_MOVE: {
                if(m_nPen == 0) {
                    Rect rect = touchMove(event);
                    if (rect != null)
                        invalidate(rect);
                }
                else {
                    m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
                    invalidate();
                }

                return true;
            }

            case MotionEvent.ACTION_UP: {
                if(m_nPen == 0) {
                    Rect rect = touchUp(event, false);
                    if(rect != null)
                        invalidate(rect);
                    m_Path.rewind();
                }
                else {
                    m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
                    invalidate();
                }

                return true;
            }
        }

        return false;
    }

    private Rect touchDown(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        m_fLastX = x;
        m_fLastY = y;

        Rect mInvalidRect = new Rect();
        m_Path.moveTo(x, y);

        final int border = m_nInvalidateExtraBorder;
        mInvalidRect.set((int) x - border, (int) y - border, (int) x + border, (int) y + border);

        m_fCurveEndX = x;
        m_fCurveEndY = y;

        m_Canvas.drawPath(m_Path, m_Paint);

        return mInvalidRect;
    }

    private Rect touchMove(MotionEvent event) {
        return processMove(event);
    }

    private Rect touchUp(MotionEvent event, boolean cancel) {
        return processMove(event);
    }

    private Rect processMove(MotionEvent event) {
        final float x = event.getX();
        final float y = event.getY();

        final float dx = Math.abs(x - m_fLastX);
        final float dy = Math.abs(y - m_fLastY);

        Rect mInvalidRect = new Rect();
        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
            final int border = m_nInvalidateExtraBorder;
            mInvalidRect.set((int) m_fCurveEndX - border, (int) m_fCurveEndY - border,
                    (int) m_fCurveEndX + border, (int) m_fCurveEndY + border);

            float cX = m_fCurveEndX = (x + m_fLastX) / 2;
            float cY = m_fCurveEndY = (y + m_fLastY) / 2;

            m_Path.quadTo(m_fLastX, m_fLastY, cX, cY);

            // union with the control point of the new curve
            mInvalidRect.union((int) m_fLastX - border, (int) m_fLastY - border,
                    (int) m_fLastX + border, (int) m_fLastY + border);

            // union with the end point of the new curve
            mInvalidRect.union((int) cX - border, (int) cY - border,
                    (int) cX + border, (int) cY + border);

            m_fLastX = x;
            m_fLastY = y;

            m_Canvas.drawPath(m_Path, m_Paint);
        }

        return mInvalidRect;
    }

    private void initPaintBrush(PaintBrush sPaintBrush, int nPen) {
        switch (nPen) {
            case 1: PaintBrushSetter.BasicPaintBrushSetting(m_Brush); break;
            case 2: PaintBrushSetter.CharcoalPaintBrushSetting(m_Brush); break;
            case 3: PaintBrushSetter.ShortGrassPaintBrushSetting(m_Brush); break;
            case 4: PaintBrushSetter.WatercolorExpressivePaintBrushSetting(m_Brush); break;
            case 5: PaintBrushSetter.LeavesPaintBrushSetting(m_Brush); break;
            case 6: PaintBrushSetter.CalligraphyPaintBrushSetting(m_Brush); break;
            case 7: PaintBrushSetter.GlowPaintBrushSetting(m_Brush); break;
            default: assert (nPen >= 1 && nPen <= 7); break;
        }
    }

    public void setPen(int pen) {
        m_nPen = pen;
    }

    public void setColor(int color) {
        m_nColor = color;
        m_Paint.setColor(m_nColor);
    }

    public void setSize(int size) {
        m_nSize = size;
        m_Paint.setStrokeWidth(m_nSize);
    }

    public void save() {
        String storage = Environment.getExternalStorageDirectory().getAbsolutePath();
        String folder_name = "/FreeDrawApp/";
        String file_name = "save_image.jpg";
        String string_path = storage + folder_name;

        try {
            File file_path = new File(string_path);
            if(!file_path.exists())
                file_path.mkdirs();

            File fileCacheItem = new File(string_path, file_name);
            fileCacheItem.createNewFile();

            OutputStream out = new FileOutputStream(fileCacheItem);
            m_Bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.close();
            Toast.makeText(getContext(), "Save Complete", Toast.LENGTH_SHORT).show();;
        } catch (FileNotFoundException exception) {
            Log.e("FileNotFoundException", exception.getMessage());
            Toast.makeText(getContext(), "Save Fail", Toast.LENGTH_SHORT).show();;
        } catch (IOException exception) {
            Log.e("IOException", exception.getMessage());
            Toast.makeText(getContext(), "Save Fail", Toast.LENGTH_SHORT).show();;
        }
    }
}
