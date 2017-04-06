package org.graphics.jana.freedrawapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import org.graphics.jana.mypaintlib.PaintBrush;
import org.graphics.jana.mypaintlib.PaintBrushDefine;
import org.graphics.jana.mypaintlib.PaintBrushSetter;

/**
 * Created by ejchoi on 2017-03-22.
 */

public class PaintBoard extends View {
    private Bitmap m_Bitmap;
    private Canvas m_Canvas;
    private PaintBrush m_Brush;

    private int m_nPenType = 0;


    public PaintBoard(Context context) {
        super(context);
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
                m_Brush = new PaintBrush(m_Bitmap);
                initPaintBrush(m_Brush);

                m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
            }
            break;

            case MotionEvent.ACTION_MOVE: {
                m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
            }
            break;

            case MotionEvent.ACTION_UP: {
                m_Brush.strokeTo(event.getX(), event.getY(), PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
            }
            break;
        }

        invalidate();
        return true;
    }

    private void initPaintBrush(PaintBrush sPaintBrush) {
        switch (m_nPenType) {
            case 0:
            case 1: PaintBrushSetter.BasicPaintBrushSetting(m_Brush); break;
            case 2: PaintBrushSetter.CharcoalPaintBrushSetting(m_Brush); break;
            case 3: PaintBrushSetter.ShortGrassPaintBrushSetting(m_Brush); break;
            case 4: PaintBrushSetter.WatercolorExpressivePaintBrushSetting(m_Brush); break;
            case 5: PaintBrushSetter.LeavesPaintBrushSetting(m_Brush); break;
            case 6: PaintBrushSetter.CalligraphyPaintBrushSetting(m_Brush); break;
            case 7: PaintBrushSetter.GlowPaintBrushSetting(m_Brush); break;
            default: assert (m_nPenType >= 0 && m_nPenType <= 7); break;
        }
    }

    public void setPenType(int pen) {
        m_nPenType = pen;
    }
}
