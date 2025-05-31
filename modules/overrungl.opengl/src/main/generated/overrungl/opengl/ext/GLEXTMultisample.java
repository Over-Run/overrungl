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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTMultisample {
    public static final int GL_MULTISAMPLE_EXT = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_MASK_EXT = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_EXT = 0x809F;
    public static final int GL_SAMPLE_MASK_EXT = 0x80A0;
    public static final int GL_1PASS_EXT = 0x80A1;
    public static final int GL_2PASS_0_EXT = 0x80A2;
    public static final int GL_2PASS_1_EXT = 0x80A3;
    public static final int GL_4PASS_0_EXT = 0x80A4;
    public static final int GL_4PASS_1_EXT = 0x80A5;
    public static final int GL_4PASS_2_EXT = 0x80A6;
    public static final int GL_4PASS_3_EXT = 0x80A7;
    public static final int GL_SAMPLE_BUFFERS_EXT = 0x80A8;
    public static final int GL_SAMPLES_EXT = 0x80A9;
    public static final int GL_SAMPLE_MASK_VALUE_EXT = 0x80AA;
    public static final int GL_SAMPLE_MASK_INVERT_EXT = 0x80AB;
    public static final int GL_SAMPLE_PATTERN_EXT = 0x80AC;
    public static final int GL_MULTISAMPLE_BIT_EXT = 0x20000000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSampleMaskEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glSamplePatternEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glSampleMaskEXT;
        public final MemorySegment PFN_glSamplePatternEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSampleMaskEXT = func.invoke("glSampleMaskEXT");
            PFN_glSamplePatternEXT = func.invoke("glSamplePatternEXT");
        }
    }

    public GLEXTMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSampleMaskEXT(((float) khronos_float_t) GLclampf value, GLboolean invert);
    /// ```
    public void SampleMaskEXT(float value, boolean invert) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMaskEXT)) throw new SymbolNotFoundError("Symbol not found: glSampleMaskEXT");
        try { Handles.MH_glSampleMaskEXT.invokeExact(handles.PFN_glSampleMaskEXT, value, ((invert) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMaskEXT", e); }
    }

    /// ```
    /// void glSamplePatternEXT((unsigned int) GLenum pattern);
    /// ```
    public void SamplePatternEXT(int pattern) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplePatternEXT)) throw new SymbolNotFoundError("Symbol not found: glSamplePatternEXT");
        try { Handles.MH_glSamplePatternEXT.invokeExact(handles.PFN_glSamplePatternEXT, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in SamplePatternEXT", e); }
    }

}
