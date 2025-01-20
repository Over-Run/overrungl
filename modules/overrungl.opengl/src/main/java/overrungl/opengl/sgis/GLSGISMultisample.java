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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISMultisample {
    public static final int GL_MULTISAMPLE_SGIS = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_MASK_SGIS = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_SGIS = 0x809F;
    public static final int GL_SAMPLE_MASK_SGIS = 0x80A0;
    public static final int GL_1PASS_SGIS = 0x80A1;
    public static final int GL_2PASS_0_SGIS = 0x80A2;
    public static final int GL_2PASS_1_SGIS = 0x80A3;
    public static final int GL_4PASS_0_SGIS = 0x80A4;
    public static final int GL_4PASS_1_SGIS = 0x80A5;
    public static final int GL_4PASS_2_SGIS = 0x80A6;
    public static final int GL_4PASS_3_SGIS = 0x80A7;
    public static final int GL_SAMPLE_BUFFERS_SGIS = 0x80A8;
    public static final int GL_SAMPLES_SGIS = 0x80A9;
    public static final int GL_SAMPLE_MASK_VALUE_SGIS = 0x80AA;
    public static final int GL_SAMPLE_MASK_INVERT_SGIS = 0x80AB;
    public static final int GL_SAMPLE_PATTERN_SGIS = 0x80AC;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSampleMaskSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glSamplePatternSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glSampleMaskSGIS,
            FD_glSamplePatternSGIS
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glSampleMaskSGIS = RuntimeHelper.downcall(Descriptors.FD_glSampleMaskSGIS);
        public static final MethodHandle MH_glSamplePatternSGIS = RuntimeHelper.downcall(Descriptors.FD_glSamplePatternSGIS);
        public final MemorySegment PFN_glSampleMaskSGIS;
        public final MemorySegment PFN_glSamplePatternSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSampleMaskSGIS = func.invoke("glSampleMaskSGIS", "glSampleMaskEXT");
            PFN_glSamplePatternSGIS = func.invoke("glSamplePatternSGIS", "glSamplePatternEXT");
        }
    }

    public GLSGISMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SampleMaskSGIS(@CType("GLclampf") float value, @CType("GLboolean") boolean invert) {
        if (Unmarshal.isNullPointer(handles.PFN_glSampleMaskSGIS)) throw new SymbolNotFoundError("Symbol not found: glSampleMaskSGIS");
        try { Handles.MH_glSampleMaskSGIS.invokeExact(handles.PFN_glSampleMaskSGIS, value, invert); }
        catch (Throwable e) { throw new RuntimeException("error in glSampleMaskSGIS", e); }
    }

    public void SamplePatternSGIS(@CType("GLenum") int pattern) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplePatternSGIS)) throw new SymbolNotFoundError("Symbol not found: glSamplePatternSGIS");
        try { Handles.MH_glSamplePatternSGIS.invokeExact(handles.PFN_glSamplePatternSGIS, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplePatternSGIS", e); }
    }

}
