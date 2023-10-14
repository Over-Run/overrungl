/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.khr;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_KHR_blend_equation_advanced}
  */
public final class GLKHRBlendEquationAdvanced {
    public static final int GL_MULTIPLY_KHR = 0x9294;
    public static final int GL_SCREEN_KHR = 0x9295;
    public static final int GL_OVERLAY_KHR = 0x9296;
    public static final int GL_DARKEN_KHR = 0x9297;
    public static final int GL_LIGHTEN_KHR = 0x9298;
    public static final int GL_COLORDODGE_KHR = 0x9299;
    public static final int GL_COLORBURN_KHR = 0x929A;
    public static final int GL_HARDLIGHT_KHR = 0x929B;
    public static final int GL_SOFTLIGHT_KHR = 0x929C;
    public static final int GL_DIFFERENCE_KHR = 0x929E;
    public static final int GL_EXCLUSION_KHR = 0x92A0;
    public static final int GL_HSL_HUE_KHR = 0x92AD;
    public static final int GL_HSL_SATURATION_KHR = 0x92AE;
    public static final int GL_HSL_COLOR_KHR = 0x92AF;
    public static final int GL_HSL_LUMINOSITY_KHR = 0x92B0;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_KHR_blend_equation_advanced) return;
        ext.glBlendBarrierKHR = load.invoke("glBlendBarrierKHR", ofVoid());
    }

    public static void glBlendBarrierKHR() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendBarrierKHR).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}