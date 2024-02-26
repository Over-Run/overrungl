/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_blend_equation_advanced}
 */
public interface GLNVBlendEquationAdvanced extends overrun.marshal.DirectAccess {
    int GL_BLEND_OVERLAP_NV = 0x9281;
    int GL_BLEND_PREMULTIPLIED_SRC_NV = 0x9280;
    int GL_BLUE_NV = 0x1905;
    int GL_COLORBURN_NV = 0x929A;
    int GL_COLORDODGE_NV = 0x9299;
    int GL_CONJOINT_NV = 0x9284;
    int GL_CONTRAST_NV = 0x92A1;
    int GL_DARKEN_NV = 0x9297;
    int GL_DIFFERENCE_NV = 0x929E;
    int GL_DISJOINT_NV = 0x9283;
    int GL_DST_ATOP_NV = 0x928F;
    int GL_DST_IN_NV = 0x928B;
    int GL_DST_NV = 0x9287;
    int GL_DST_OUT_NV = 0x928D;
    int GL_DST_OVER_NV = 0x9289;
    int GL_EXCLUSION_NV = 0x92A0;
    int GL_GREEN_NV = 0x1904;
    int GL_HARDLIGHT_NV = 0x929B;
    int GL_HARDMIX_NV = 0x92A9;
    int GL_HSL_COLOR_NV = 0x92AF;
    int GL_HSL_HUE_NV = 0x92AD;
    int GL_HSL_LUMINOSITY_NV = 0x92B0;
    int GL_HSL_SATURATION_NV = 0x92AE;
    int GL_INVERT_OVG_NV = 0x92B4;
    int GL_INVERT_RGB_NV = 0x92A3;
    int GL_LIGHTEN_NV = 0x9298;
    int GL_LINEARBURN_NV = 0x92A5;
    int GL_LINEARDODGE_NV = 0x92A4;
    int GL_LINEARLIGHT_NV = 0x92A7;
    int GL_MINUS_CLAMPED_NV = 0x92B3;
    int GL_MINUS_NV = 0x929F;
    int GL_MULTIPLY_NV = 0x9294;
    int GL_OVERLAY_NV = 0x9296;
    int GL_PINLIGHT_NV = 0x92A8;
    int GL_PLUS_CLAMPED_ALPHA_NV = 0x92B2;
    int GL_PLUS_CLAMPED_NV = 0x92B1;
    int GL_PLUS_DARKER_NV = 0x9292;
    int GL_PLUS_NV = 0x9291;
    int GL_RED_NV = 0x1903;
    int GL_SCREEN_NV = 0x9295;
    int GL_SOFTLIGHT_NV = 0x929C;
    int GL_SRC_ATOP_NV = 0x928E;
    int GL_SRC_IN_NV = 0x928A;
    int GL_SRC_NV = 0x9286;
    int GL_SRC_OUT_NV = 0x928C;
    int GL_SRC_OVER_NV = 0x9288;
    int GL_UNCORRELATED_NV = 0x9282;
    int GL_VIVIDLIGHT_NV = 0x92A6;
    int GL_XOR_NV = 0x1506;

    default void glBlendParameteriNV(int pname, int value) {
        throw new ContextException();
    }

    default void glBlendBarrierNV() {
        throw new ContextException();
    }

}
