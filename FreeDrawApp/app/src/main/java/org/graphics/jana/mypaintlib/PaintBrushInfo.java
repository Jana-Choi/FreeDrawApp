package org.graphics.jana.mypaintlib;

/**
 * Created by BlackBean on 2017-03-13.
 */

public class PaintBrushInfo {
    public boolean bConstant;
    public float fMin;
    public float fDefault;
    public float fMax;

    public PaintBrushInfo(boolean bConstant, float fMin, float fDefault, float fMax) {
        this.bConstant = bConstant;
        this.fMin = fMin;
        this.fDefault = fDefault;
        this.fMax = fMax;
    }
}


class BasicPaintBrushInfo {
    private PaintBrushInfo[] arrBasicPaintBrush;

    public BasicPaintBrushInfo() {
        arrBasicPaintBrush = new PaintBrushInfo[45];
        arrBasicPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 1.0f, 2.0f);// opaque
        arrBasicPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrBasicPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.9f, 2.0f);// opaque_linearize
        arrBasicPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 2.5f/*2.0f*/, 6.0f);// radius_logarithmic
        arrBasicPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.8f, 1.0f);// hardness
        arrBasicPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 1.0f, 5.0f);// anti_aliasing
        arrBasicPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrBasicPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 2.5f/*2.0f*/, 6.0f);// dabs_per_actual_radius
        arrBasicPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrBasicPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrBasicPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrBasicPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrBasicPaintBrush[12] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrBasicPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrBasicPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 0.0f, 25.0f);// offset_by_random(Jitter)
        arrBasicPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrBasicPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrBasicPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 0.0f, 10.0f);// slow_tracking
        arrBasicPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);	// slow_tracking_per_dab
        arrBasicPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrBasicPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// color_h(hue)
        arrBasicPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_s(saturation)
        arrBasicPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_v(value)
        arrBasicPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrBasicPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrBasicPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrBasicPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrBasicPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrBasicPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrBasicPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrBasicPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrBasicPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrBasicPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrBasicPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrBasicPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 4.0f, 7.0f);// stroke_duration_logarithmic
        arrBasicPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrBasicPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrBasicPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrBasicPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 1.0f, 10.0f);// elliptical_dab_ratio
        arrBasicPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrBasicPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrBasicPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrBasicPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrBasicPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrBasicPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getBasicSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrBasicPaintBrush[id];
    }
}


class CharcoalPaintBrushInfo {
    private PaintBrushInfo[] arrCharcoalPaintBrush;

    public CharcoalPaintBrushInfo() {
        arrCharcoalPaintBrush = new PaintBrushInfo[45];
        arrCharcoalPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 0.4f, 2.0f);// opaque
        arrCharcoalPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrCharcoalPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.0f, 2.0f);// opaque_linearize
        arrCharcoalPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 2.0f/*0.7f*/, 6.0f);// radius_logarithmic
        arrCharcoalPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.2f, 1.0f);// hardness
        arrCharcoalPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 0.0f, 5.0f);// anti_aliasing
        arrCharcoalPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrCharcoalPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 1.0f/*5.0f*/, 6.0f);// dabs_per_actual_radius
        arrCharcoalPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrCharcoalPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrCharcoalPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrCharcoalPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrCharcoalPaintBrush[12] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrCharcoalPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrCharcoalPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 1.6f, 25.0f);// offset_by_random(Jitter)
        arrCharcoalPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrCharcoalPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrCharcoalPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 2.0f, 10.0f);// slow_tracking
        arrCharcoalPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// slow_tracking_per_dab
        arrCharcoalPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrCharcoalPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.6354166666666666f, 1.0f);// color_h(hue)
        arrCharcoalPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.8807339449541285f, 1.5f);// color_s(saturation)
        arrCharcoalPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.42745098039215684f, 1.5f);// color_v(value)
        arrCharcoalPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrCharcoalPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrCharcoalPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrCharcoalPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrCharcoalPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrCharcoalPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrCharcoalPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrCharcoalPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrCharcoalPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrCharcoalPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrCharcoalPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrCharcoalPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 4.0f, 7.0f);// stroke_duration_logarithmic
        arrCharcoalPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrCharcoalPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrCharcoalPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrCharcoalPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 1.0f, 10.0f);// elliptical_dab_ratio
        arrCharcoalPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrCharcoalPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrCharcoalPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrCharcoalPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrCharcoalPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrCharcoalPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getCharcoalSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrCharcoalPaintBrush[id];
    }
}


class ShortGrassPaintBrushInfo {
    private PaintBrushInfo[] arrShortGrassPaintBrush;

    public ShortGrassPaintBrushInfo() {
        arrShortGrassPaintBrush = new PaintBrushInfo[45];
        arrShortGrassPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 0.78f, 2.0f);// opaque
        arrShortGrassPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrShortGrassPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.56f, 2.0f);// opaque_linearize
        arrShortGrassPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 2.5f, 6.0f);// radius_logarithmic
        arrShortGrassPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.91f, 1.0f);// hardness
        arrShortGrassPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 1.0f, 5.0f);// anti_aliasing
        arrShortGrassPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrShortGrassPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 0.8f/*3.24f*/, 6.0f);// dabs_per_actual_radius
        arrShortGrassPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrShortGrassPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrShortGrassPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrShortGrassPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrShortGrassPaintBrush[12] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrShortGrassPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrShortGrassPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 1.79f, 25.0f);// offset_by_random(Jitter)
        arrShortGrassPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrShortGrassPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrShortGrassPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 2.0f, 10.0f);// slow_tracking
        arrShortGrassPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// slow_tracking_per_dab
        arrShortGrassPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrShortGrassPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// color_h(hue)
        arrShortGrassPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_s(saturation)
        arrShortGrassPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_v(value)
        arrShortGrassPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrShortGrassPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrShortGrassPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrShortGrassPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrShortGrassPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrShortGrassPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrShortGrassPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrShortGrassPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrShortGrassPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrShortGrassPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrShortGrassPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrShortGrassPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 5.96f, 7.0f);// stroke_duration_logarithmic
        arrShortGrassPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrShortGrassPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrShortGrassPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrShortGrassPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 3.91f, 10.0f);// elliptical_dab_ratio
        arrShortGrassPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrShortGrassPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrShortGrassPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrShortGrassPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrShortGrassPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrShortGrassPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getShortGrassSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrShortGrassPaintBrush[id];
    }
}


class WatercolorExpressivePaintBrushInfo {
    private PaintBrushInfo[] arrWatercolorExpressivePaintBrush;

    public WatercolorExpressivePaintBrushInfo() {
        arrWatercolorExpressivePaintBrush = new PaintBrushInfo[45];
        arrWatercolorExpressivePaintBrush[0] = new PaintBrushInfo(false, 0.0f, 2.0f, 2.0f);// opaque
        arrWatercolorExpressivePaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrWatercolorExpressivePaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.9f, 2.0f);// opaque_linearize
        arrWatercolorExpressivePaintBrush[3] = new PaintBrushInfo(false, -2.0f, 5.0f/*3.5f*/, 6.0f);// radius_logarithmic
        arrWatercolorExpressivePaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.23f, 1.0f);// hardness
        arrWatercolorExpressivePaintBrush[5] = new PaintBrushInfo(false, 0.0f, 0.0f, 5.0f);// anti_aliasing
        arrWatercolorExpressivePaintBrush[6] = new PaintBrushInfo(true, 0.0f, 3.0f/*6.0f*/, 6.0f);// dabs_per_basic_radius
        arrWatercolorExpressivePaintBrush[7] = new PaintBrushInfo(true, 0.0f, 2.0f, 6.0f);// dabs_per_actual_radius
        arrWatercolorExpressivePaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrWatercolorExpressivePaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrWatercolorExpressivePaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrWatercolorExpressivePaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrWatercolorExpressivePaintBrush[12] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrWatercolorExpressivePaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrWatercolorExpressivePaintBrush[14] = new PaintBrushInfo(false, 0.0f, 0.0f, 25.0f);// offset_by_random(Jitter)
        arrWatercolorExpressivePaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrWatercolorExpressivePaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrWatercolorExpressivePaintBrush[17] = new PaintBrushInfo(true, 0.0f, 0.0f, 10.0f);// slow_tracking
        arrWatercolorExpressivePaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// slow_tracking_per_dab
        arrWatercolorExpressivePaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrWatercolorExpressivePaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.150621805142f, 1.0f);// color_h(hue)
        arrWatercolorExpressivePaintBrush[21] = new PaintBrushInfo(true, -0.5f, 1.0f, 1.5f);// color_s(saturation)
        arrWatercolorExpressivePaintBrush[22] = new PaintBrushInfo(true, -0.5f, 1.0f, 1.5f);// color_v(value)
        arrWatercolorExpressivePaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrWatercolorExpressivePaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrWatercolorExpressivePaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrWatercolorExpressivePaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrWatercolorExpressivePaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrWatercolorExpressivePaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrWatercolorExpressivePaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.71f, 1.0f);// smudge
        arrWatercolorExpressivePaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.1f, 1.0f);// smudge_length
        arrWatercolorExpressivePaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrWatercolorExpressivePaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrWatercolorExpressivePaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrWatercolorExpressivePaintBrush[34] = new PaintBrushInfo(false, -1.0f, 6.5f, 7.0f);// stroke_duration_logarithmic
        arrWatercolorExpressivePaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrWatercolorExpressivePaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrWatercolorExpressivePaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrWatercolorExpressivePaintBrush[38] = new PaintBrushInfo(false, 1.0f, 4.0f, 10.0f);// elliptical_dab_ratio
        arrWatercolorExpressivePaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrWatercolorExpressivePaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrWatercolorExpressivePaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrWatercolorExpressivePaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrWatercolorExpressivePaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrWatercolorExpressivePaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getWatercolorExpressiveSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrWatercolorExpressivePaintBrush[id];
    }
}


class LeavesPaintBrushInfo {
    private PaintBrushInfo[] arrLeavesPaintBrush;

    public LeavesPaintBrushInfo() {
        arrLeavesPaintBrush = new PaintBrushInfo[45];
        arrLeavesPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 1.0f, 2.0f);// opaque
        arrLeavesPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrLeavesPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.0f, 2.0f);// opaque_linearize
        arrLeavesPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 2.5f/*1.89f*/, 6.0f);// radius_logarithmic
        arrLeavesPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.8f, 1.0f);// hardness
        arrLeavesPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 1.0f, 5.0f);// anti_aliasing
        arrLeavesPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrLeavesPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 2.5f/*2.0f*/, 6.0f);// dabs_per_actual_radius
        arrLeavesPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);	// dabs_per_second
        arrLeavesPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrLeavesPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrLeavesPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrLeavesPaintBrush[12] = new PaintBrushInfo(true, -8.0f, -7.16f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrLeavesPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrLeavesPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 0.0f, 25.0f);// offset_by_random(Jitter)
        arrLeavesPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrLeavesPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrLeavesPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 0.0f, 10.0f);// slow_tracking
        arrLeavesPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// slow_tracking_per_dab
        arrLeavesPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrLeavesPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);	// color_h(hue)
        arrLeavesPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_s(saturation)
        arrLeavesPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_v(value)
        arrLeavesPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);	// restore_color
        arrLeavesPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrLeavesPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrLeavesPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrLeavesPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.195f, 2.0f);// change_color_v(HSV)
        arrLeavesPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrLeavesPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrLeavesPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrLeavesPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrLeavesPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrLeavesPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);	// stroke_threshold
        arrLeavesPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 2.76f, 7.0f);// stroke_duration_logarithmic
        arrLeavesPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 10.0f, 10.0f);// stroke_holdtime
        arrLeavesPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrLeavesPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrLeavesPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 1.0f, 10.0f);// elliptical_dab_ratio
        arrLeavesPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrLeavesPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrLeavesPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrLeavesPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrLeavesPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrLeavesPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getLeavesSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrLeavesPaintBrush[id];
    }
}


class CalligraphyPaintBrushInfo {
    private PaintBrushInfo[] arrCalligraphyPaintBrush;

    public CalligraphyPaintBrushInfo() {
        arrCalligraphyPaintBrush = new PaintBrushInfo[45];
        arrCalligraphyPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 1.0f, 2.0f);// opaque
        arrCalligraphyPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrCalligraphyPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.0f, 2.0f);// opaque_linearize
        arrCalligraphyPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 2.1f/*2.02f*/, 6.0f);// radius_logarithmic
        arrCalligraphyPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.74f, 1.0f);// hardness
        arrCalligraphyPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 3.53f, 5.0f);// anti_aliasing
        arrCalligraphyPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrCalligraphyPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 0.7f/*2.2f*/, 6.0f);// dabs_per_actual_radius
        arrCalligraphyPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrCalligraphyPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrCalligraphyPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrCalligraphyPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrCalligraphyPaintBrush[12] = new PaintBrushInfo(true, -8.0f, 2.87f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrCalligraphyPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrCalligraphyPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 0.0f, 25.0f);// offset_by_random(Jitter)
        arrCalligraphyPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrCalligraphyPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrCalligraphyPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 0.65f, 10.0f);// slow_tracking
        arrCalligraphyPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.8f, 10.0f);// slow_tracking_per_dab
        arrCalligraphyPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrCalligraphyPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// color_h(hue)
        arrCalligraphyPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_s(saturation)
        arrCalligraphyPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_v(value)
        arrCalligraphyPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrCalligraphyPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrCalligraphyPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrCalligraphyPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrCalligraphyPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrCalligraphyPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrCalligraphyPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrCalligraphyPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrCalligraphyPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrCalligraphyPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrCalligraphyPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrCalligraphyPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 4.0f, 7.0f);// stroke_duration_logarithmic
        arrCalligraphyPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrCalligraphyPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrCalligraphyPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrCalligraphyPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 5.46f, 10.0f);// elliptical_dab_ratio
        arrCalligraphyPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 45.92f, 180.0f);// elliptical_dab_angle
        arrCalligraphyPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrCalligraphyPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrCalligraphyPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrCalligraphyPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrCalligraphyPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getCalligraphySettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrCalligraphyPaintBrush[id];
    }
}


class GlowPaintBrushInfo {
    private PaintBrushInfo[] arrGlowPaintBrush;

    public GlowPaintBrushInfo() {
        arrGlowPaintBrush = new PaintBrushInfo[45];
        arrGlowPaintBrush[0] = new PaintBrushInfo(false, 0.0f, 0.43f, 2.0f);// opaque
        arrGlowPaintBrush[1] = new PaintBrushInfo(false, 0.0f, 0.0f, 2.0f);// opaque_multiply
        arrGlowPaintBrush[2] = new PaintBrushInfo(true, 0.0f, 0.0f, 2.0f);// opaque_linearize
        arrGlowPaintBrush[3] = new PaintBrushInfo(false, -2.0f, 3.0f/*2.19f*/, 6.0f);// radius_logarithmic
        arrGlowPaintBrush[4] = new PaintBrushInfo(false, 0.0f, 0.16f, 1.0f);// hardness
        arrGlowPaintBrush[5] = new PaintBrushInfo(false, 0.0f, 0.0f, 5.0f);// anti_aliasing
        arrGlowPaintBrush[6] = new PaintBrushInfo(true, 0.0f, 0.0f, 6.0f);// dabs_per_basic_radius
        arrGlowPaintBrush[7] = new PaintBrushInfo(true, 0.0f, 3.0f/*5.5f*/, 6.0f);// dabs_per_actual_radius
        arrGlowPaintBrush[8] = new PaintBrushInfo(true, 0.0f, 0.0f, 80.0f);// dabs_per_second
        arrGlowPaintBrush[9] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.5f);// radius_by_random
        arrGlowPaintBrush[10] = new PaintBrushInfo(false, 0.0f, 0.04f, 0.2f);// speed1_slowness(Fine speed filter)
        arrGlowPaintBrush[11] = new PaintBrushInfo(false, 0.0f, 0.8f, 3.0f);// speed2_slowness(Gross speed filter)
        arrGlowPaintBrush[12] = new PaintBrushInfo(true, -8.0f, 2.87f, 8.0f);// speed1_gamma(Fine speed gamma)
        arrGlowPaintBrush[13] = new PaintBrushInfo(true, -8.0f, 4.0f, 8.0f);// speed2_gamma(Gross speed gamma)
        arrGlowPaintBrush[14] = new PaintBrushInfo(false, 0.0f, 0.0f, 25.0f);// offset_by_random(Jitter)
        arrGlowPaintBrush[15] = new PaintBrushInfo(false, -3.0f, 0.0f, 3.0f);// offset_by_speed
        arrGlowPaintBrush[16] = new PaintBrushInfo(false, 0.0f, 1.0f, 15.0f);// offset_by_speed_slowness
        arrGlowPaintBrush[17] = new PaintBrushInfo(true, 0.0f, 0.65f, 10.0f);// slow_tracking
        arrGlowPaintBrush[18] = new PaintBrushInfo(false, 0.0f, 0.8f, 10.0f);// slow_tracking_per_dab
        arrGlowPaintBrush[19] = new PaintBrushInfo(true, 0.0f, 0.0f, 12.0f);// tracking_noise
        arrGlowPaintBrush[20] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// color_h(hue)
        arrGlowPaintBrush[21] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_s(saturation)
        arrGlowPaintBrush[22] = new PaintBrushInfo(true, -0.5f, 0.0f, 1.5f);// color_v(value)
        arrGlowPaintBrush[23] = new PaintBrushInfo(true, 0.0f, 0.0f, 1.0f);// restore_color
        arrGlowPaintBrush[24] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_h
        arrGlowPaintBrush[25] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_l(lightness)(HSL)
        arrGlowPaintBrush[26] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsl_s(HSL)
        arrGlowPaintBrush[27] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_v(HSV)
        arrGlowPaintBrush[28] = new PaintBrushInfo(false, -2.0f, 0.0f, 2.0f);// change_color_hsv_s(HSV)
        arrGlowPaintBrush[29] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// smudge
        arrGlowPaintBrush[30] = new PaintBrushInfo(false, 0.0f, 0.5f, 1.0f);// smudge_length
        arrGlowPaintBrush[31] = new PaintBrushInfo(false, -1.6f, 0.0f, 1.6f);// smudge_radius_log
        arrGlowPaintBrush[32] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// eraser
        arrGlowPaintBrush[33] = new PaintBrushInfo(true, 0.0f, 0.0f, 0.5f);// stroke_threshold
        arrGlowPaintBrush[34] = new PaintBrushInfo(false, -1.0f, 4.0f, 7.0f);// stroke_duration_logarithmic
        arrGlowPaintBrush[35] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// stroke_holdtime
        arrGlowPaintBrush[36] = new PaintBrushInfo(false, -5.0f, 0.0f, 5.0f);// custom_input
        arrGlowPaintBrush[37] = new PaintBrushInfo(false, 0.0f, 0.0f, 10.0f);// custom_input_slowness
        arrGlowPaintBrush[38] = new PaintBrushInfo(false, 1.0f, 1.0f, 10.0f);// elliptical_dab_ratio
        arrGlowPaintBrush[39] = new PaintBrushInfo(false, 0.0f, 90.0f, 180.0f);// elliptical_dab_angle
        arrGlowPaintBrush[40] = new PaintBrushInfo(false, 0.0f, 2.0f, 10.0f);// direction_filter
        arrGlowPaintBrush[41] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// lock_alpha
        arrGlowPaintBrush[42] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// colorize
        arrGlowPaintBrush[43] = new PaintBrushInfo(false, 0.0f, 0.0f, 1.0f);// snap_to_pixel
        arrGlowPaintBrush[44] = new PaintBrushInfo(true, -1.8f, 0.0f, 1.8f);// pressure_gain_log
    }

    public PaintBrushInfo getGlowSettingInfo(int id) {
        PBUtil.CHECK_SETTING_ID(id);
        return arrGlowPaintBrush[id];
    }
}
