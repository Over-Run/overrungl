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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAMDVertexShaderTessellator {
    public static final int GL_SAMPLER_BUFFER_AMD = 0x9001;
    public static final int GL_INT_SAMPLER_BUFFER_AMD = 0x9002;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;
    public static final int GL_TESSELLATION_MODE_AMD = 0x9004;
    public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;
    public static final int GL_DISCRETE_AMD = 0x9006;
    public static final int GL_CONTINUOUS_AMD = 0x9007;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTessellationFactorAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTessellationModeAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTessellationFactorAMD;
        public final MemorySegment PFN_glTessellationModeAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTessellationFactorAMD = func.invoke("glTessellationFactorAMD");
            PFN_glTessellationModeAMD = func.invoke("glTessellationModeAMD");
        }
    }

    public GLAMDVertexShaderTessellator(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTessellationFactorAMD(((float) khronos_float_t) GLfloat factor);
    /// ```
    public void TessellationFactorAMD(float factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTessellationFactorAMD)) throw new GLSymbolNotFoundError("Symbol not found: glTessellationFactorAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTessellationFactorAMD", factor); }
        Handles.MH_glTessellationFactorAMD.invokeExact(handles.PFN_glTessellationFactorAMD, factor); }
        catch (Throwable e) { throw new RuntimeException("error in TessellationFactorAMD", e); }
    }

    /// ```
    /// void glTessellationModeAMD((unsigned int) GLenum mode);
    /// ```
    public void TessellationModeAMD(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTessellationModeAMD)) throw new GLSymbolNotFoundError("Symbol not found: glTessellationModeAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTessellationModeAMD", mode); }
        Handles.MH_glTessellationModeAMD.invokeExact(handles.PFN_glTessellationModeAMD, mode); }
        catch (Throwable e) { throw new RuntimeException("error in TessellationModeAMD", e); }
    }

}
