package org.graphics.jana.mypaintlib;

/**
 * Created by ejchoi on 2017-03-13.
 */

import org.graphics.jana.mypaintlib.PaintBrushDefine.PaintBrushSetting;
import org.graphics.jana.mypaintlib.PaintBrushDefine.PaintBrushInput;


public class PaintBrushSetter {
    public static void BasicPaintBrushSetting(PaintBrush sPaintBrush) {
        BasicPaintBrushInfo defaultPaintBrushInfo = new BasicPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, defaultPaintBrushInfo.getBasicSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 1.0f);
    }


    public static void CharcoalPaintBrushSetting(PaintBrush sPaintBrush) {
        CharcoalPaintBrushInfo sCharcoalPaintBrushInfo = new CharcoalPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, sCharcoalPaintBrushInfo.getCharcoalSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, -1.4f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.4f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 1.0f);
    }


    public static void ShortGrassPaintBrushSetting(PaintBrush sPaintBrush) {
        ShortGrassPaintBrushInfo shortGrassPaintBrushInfo = new ShortGrassPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, shortGrassPaintBrushInfo.getShortGrassSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, -0.05f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 0.05f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, -0.004687f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 1.0f, 0.004792f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSL_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSL_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, -0.01f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSL_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 0.01f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, -0.28f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 0.28f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 3);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, -0.23f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 0.5f, 0.23f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2, 1.0f, -0.227604f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, -36.46f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 0.11039f, -4.177708f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2, 0.899351f, 4.5575f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 3, 1.0f, 36.46f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, -1.4f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.4f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 1.0f);
    }


    public static void WatercolorExpressivePaintBrushSetting(PaintBrush sPaintBrush) {
        WatercolorExpressivePaintBrushInfo watercolorExpressivePaintBrushInfo = new WatercolorExpressivePaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, watercolorExpressivePaintBrushInfo.getWatercolorExpressiveSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, -180.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_ANGLE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 180.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.75f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 1.0f, -2.7f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.7f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_ELLIPTICAL_DAB_RATIO.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 4.0f, 0.7f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.746914f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 0.884375f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3, 1.0f, -0.032083f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.75f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OFFSET_BY_RANDOM.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 1.0f, 0.8f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, 1.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.040123f, 0.885417f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 0.138889f, 1.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3, 1.0f, 1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, -2.9f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.845833f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, -0.65f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.5f, -0.358854f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 0.796875f, -0.094792f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3, 1.0f, 0.24375f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.1f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_SMUDGE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 4.0f, 0.1f);
    }


    public static void LeavesPaintBrushSetting(PaintBrush sPaintBrush) {
        LeavesPaintBrushInfo leavesPaintBrushInfo = new LeavesPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, leavesPaintBrushInfo.getLeavesSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 1.0f, -0.12f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 5);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 0.651235f, -0.007889f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2, 0.70679f, 0.115704f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 3, 0.891975f, 0.101241f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_H.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 4, 1.0f, -0.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSV_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSV_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_HSV_S.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 1.0f, 1.69f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, -0.57f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_RANDOM.ordinal(), 1, 1.0f, 0.355f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 5);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 0.080247f, -0.150625f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2, 0.614198f, 0.150625f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 3, 0.753086f, 0.351458f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_CHANGE_COLOR_V.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 4, 1.0f, 0.476979f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 3);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 0.62963f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2, 1.0f, -1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 5);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 1, 0.598765f, -1.4175f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 2, 0.709877f, 0.227813f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 3, 0.898148f, -0.227813f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_STROKE.ordinal(), 4, 1.0f, -2.43f);
    }


    public static void CalligraphyPaintBrushSetting(PaintBrush sPaintBrush) {
        CalligraphyPaintBrushInfo calligraphyPaintBrushInfo = new CalligraphyPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, calligraphyPaintBrushInfo.getCalligraphySettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.05f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 1.0f, -0.09f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.015f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 0.015f, 1.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3, 1.0f, 1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.5f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 1.0f, -0.21f);
    }


    public static void GlowPaintBrushSetting(PaintBrush sPaintBrush) {
        GlowPaintBrushInfo glowPaintBrushInfo = new GlowPaintBrushInfo();
        for(int s = 0; s < PaintBrushSetting.PAINT_BRUSH_SETTINGS_COUNT.ordinal(); s++)
        {
            for(int i = 0; i < PaintBrushInput.PAINT_BRUSH_INPUTS_COUNT.ordinal(); i++)
                sPaintBrush.setMappingN(s, i, 0);

            sPaintBrush.setBaseValue(s, glowPaintBrushInfo.getGlowSettingInfo(s).fDefault);
        }

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.05f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_HARDNESS.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 1.0f, -0.09f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 4);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 0.015f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2, 0.025f, 1.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_OPAQUE_MULTIPLY.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 3, 1.0f, 1.0f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 0, 0.0f, 0.0f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_PRESSURE.ordinal(), 1, 1.0f, 0.5f);

        sPaintBrush.setMappingN(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 2);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 0, 0.0f, -0.219479f);
        sPaintBrush.setMappingPoint(PaintBrushSetting.PAINT_BRUSH_SETTING_RADIUS_LOGARITHMIC.ordinal(), PaintBrushInput.PAINT_BRUSH_INPUT_SPEED1.ordinal(), 1, 1.0f, -0.43f);
    }
}
