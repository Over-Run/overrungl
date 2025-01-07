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
package overrungl.opengl.khr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glBlendBarrierKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glBlendBarrierKHR;

    public GLKHRBlendEquationAdvanced(overrungl.opengl.GLLoadFunc func) {
        PFN_glBlendBarrierKHR = func.invoke("glBlendBarrierKHR", "glBlendBarrier");
    }

    public void BlendBarrierKHR() {
        if (!Unmarshal.isNullPointer(PFN_glBlendBarrierKHR)) { try {
            MH_glBlendBarrierKHR.invokeExact(PFN_glBlendBarrierKHR);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendBarrierKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendBarrierKHR"); }
    }

}
