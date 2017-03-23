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

        //testDrawing();
    }

    private void testDrawing() {
        int x1 = 100, y1 = 100, x2 = 300, y2 = 100;
        m_Brush = new PaintBrush(m_Bitmap);
        //PaintBrushSetter.LeavesPaintBrushSetting(m_Brush);
        PaintBrushSetter.DefaultPaintBrushSetting(m_Brush);
        m_Brush.strokeTo(x1, y1, PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
        m_Brush.strokeTo(x2, y2, PaintBrushDefine.PAINT_BRUSH_PRESSURE, PaintBrushDefine.PAINT_BRUSH_XTILT, PaintBrushDefine.PAINT_BRUSH_YTILT, PaintBrushDefine.PAINT_BRUSH_DTIME);
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
        switch(action) {
            case MotionEvent.ACTION_DOWN: {
                m_Brush = new PaintBrush(m_Bitmap);
                PaintBrushSetter.DefaultPaintBrushSetting(m_Brush);
                //PaintBrushSetter.CharcoalPaintBrushSetting(m_Brush);
                //PaintBrushSetter.ShortGrassPaintBrushSetting(m_Brush);
                //PaintBrushSetter.WatercolorExpressivePaintBrushSetting(m_Brush);
                //PaintBrushSetter.LeavesPaintBrushSetting(m_Brush);
                //PaintBrushSetter.CalligraphyPaintBrushSetting(m_Brush);
                //PaintBrushSetter.GlowPaintBrushSetting(m_Brush);

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
}
