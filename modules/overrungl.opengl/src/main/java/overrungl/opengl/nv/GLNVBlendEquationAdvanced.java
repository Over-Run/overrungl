/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVBlendEquationAdvanced {
    public static final int GL_BLEND_OVERLAP_NV = 0x9281;
    public static final int GL_BLEND_PREMULTIPLIED_SRC_NV = 0x9280;
    public static final int GL_BLUE_NV = 0x1905;
    public static final int GL_COLORBURN_NV = 0x929A;
    public static final int GL_COLORDODGE_NV = 0x9299;
    public static final int GL_CONJOINT_NV = 0x9284;
    public static final int GL_CONTRAST_NV = 0x92A1;
    public static final int GL_DARKEN_NV = 0x9297;
    public static final int GL_DIFFERENCE_NV = 0x929E;
    public static final int GL_DISJOINT_NV = 0x9283;
    public static final int GL_DST_ATOP_NV = 0x928F;
    public static final int GL_DST_IN_NV = 0x928B;
    public static final int GL_DST_NV = 0x9287;
    public static final int GL_DST_OUT_NV = 0x928D;
    public static final int GL_DST_OVER_NV = 0x9289;
    public static final int GL_EXCLUSION_NV = 0x92A0;
    public static final int GL_GREEN_NV = 0x1904;
    public static final int GL_HARDLIGHT_NV = 0x929B;
    public static final int GL_HARDMIX_NV = 0x92A9;
    public static final int GL_HSL_COLOR_NV = 0x92AF;
    public static final int GL_HSL_HUE_NV = 0x92AD;
    public static final int GL_HSL_LUMINOSITY_NV = 0x92B0;
    public static final int GL_HSL_SATURATION_NV = 0x92AE;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_INVERT_OVG_NV = 0x92B4;
    public static final int GL_INVERT_RGB_NV = 0x92A3;
    public static final int GL_LIGHTEN_NV = 0x9298;
    public static final int GL_LINEARBURN_NV = 0x92A5;
    public static final int GL_LINEARDODGE_NV = 0x92A4;
    public static final int GL_LINEARLIGHT_NV = 0x92A7;
    public static final int GL_MINUS_CLAMPED_NV = 0x92B3;
    public static final int GL_MINUS_NV = 0x929F;
    public static final int GL_MULTIPLY_NV = 0x9294;
    public static final int GL_OVERLAY_NV = 0x9296;
    public static final int GL_PINLIGHT_NV = 0x92A8;
    public static final int GL_PLUS_CLAMPED_ALPHA_NV = 0x92B2;
    public static final int GL_PLUS_CLAMPED_NV = 0x92B1;
    public static final int GL_PLUS_DARKER_NV = 0x9292;
    public static final int GL_PLUS_NV = 0x9291;
    public static final int GL_RED_NV = 0x1903;
    public static final int GL_SCREEN_NV = 0x9295;
    public static final int GL_SOFTLIGHT_NV = 0x929C;
    public static final int GL_SRC_ATOP_NV = 0x928E;
    public static final int GL_SRC_IN_NV = 0x928A;
    public static final int GL_SRC_NV = 0x9286;
    public static final int GL_SRC_OUT_NV = 0x928C;
    public static final int GL_SRC_OVER_NV = 0x9288;
    public static final int GL_UNCORRELATED_NV = 0x9282;
    public static final int GL_VIVIDLIGHT_NV = 0x92A6;
    public static final int GL_XOR_NV = 0x1506;
    public static final int GL_ZERO = 0;
    public static final MethodHandle MH_glBlendParameteriNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendParameteriNV;
    public static final MethodHandle MH_glBlendBarrierNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glBlendBarrierNV;

    public GLNVBlendEquationAdvanced(overrungl.opengl.GLLoadFunc func) {
        PFN_glBlendParameteriNV = func.invoke("glBlendParameteriNV");
        PFN_glBlendBarrierNV = func.invoke("glBlendBarrierNV", "glBlendBarrier");
    }

    public void BlendParameteriNV(@CType("GLenum") int pname, @CType("GLint") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendParameteriNV))
            MH_glBlendParameteriNV.invokeExact(PFN_glBlendParameteriNV, pname, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendParameteriNV", e); }
    }

    public void BlendBarrierNV() {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendBarrierNV))
            MH_glBlendBarrierNV.invokeExact(PFN_glBlendBarrierNV);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendBarrierNV", e); }
    }

}
