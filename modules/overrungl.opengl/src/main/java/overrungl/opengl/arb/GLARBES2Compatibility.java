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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBES2Compatibility {
    public static final int GL_FIXED = 0x140C;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    public static final int GL_LOW_FLOAT = 0x8DF0;
    public static final int GL_MEDIUM_FLOAT = 0x8DF1;
    public static final int GL_HIGH_FLOAT = 0x8DF2;
    public static final int GL_LOW_INT = 0x8DF3;
    public static final int GL_MEDIUM_INT = 0x8DF4;
    public static final int GL_HIGH_INT = 0x8DF5;
    public static final int GL_SHADER_COMPILER = 0x8DFA;
    public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    public static final int GL_RGB565 = 0x8D62;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glReleaseShaderCompiler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glShaderBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetShaderPrecisionFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangef = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glClearDepthf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glReleaseShaderCompiler;
        public final MemorySegment PFN_glShaderBinary;
        public final MemorySegment PFN_glGetShaderPrecisionFormat;
        public final MemorySegment PFN_glDepthRangef;
        public final MemorySegment PFN_glClearDepthf;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glReleaseShaderCompiler = func.invoke("glReleaseShaderCompiler");
            PFN_glShaderBinary = func.invoke("glShaderBinary");
            PFN_glGetShaderPrecisionFormat = func.invoke("glGetShaderPrecisionFormat");
            PFN_glDepthRangef = func.invoke("glDepthRangef");
            PFN_glClearDepthf = func.invoke("glClearDepthf");
        }
    }

    public GLARBES2Compatibility(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glReleaseShaderCompiler();
    /// ```
    public void ReleaseShaderCompiler() {
        if (MemoryUtil.isNullPointer(handles.PFN_glReleaseShaderCompiler)) throw new SymbolNotFoundError("Symbol not found: glReleaseShaderCompiler");
        try { Handles.MH_glReleaseShaderCompiler.invokeExact(handles.PFN_glReleaseShaderCompiler); }
        catch (Throwable e) { throw new RuntimeException("error in ReleaseShaderCompiler", e); }
    }

    /// ```
    /// void glShaderBinary(int count, const GLuint* shaders, unsigned int binaryFormat, const void* binary, int length);
    /// ```
    public void ShaderBinary(int count, MemorySegment shaders, int binaryFormat, MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderBinary)) throw new SymbolNotFoundError("Symbol not found: glShaderBinary");
        try { Handles.MH_glShaderBinary.invokeExact(handles.PFN_glShaderBinary, count, shaders, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderBinary", e); }
    }

    /// ```
    /// void glGetShaderPrecisionFormat(unsigned int shadertype, unsigned int precisiontype, GLint* range, GLint* precision);
    /// ```
    public void GetShaderPrecisionFormat(int shadertype, int precisiontype, MemorySegment range, MemorySegment precision) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderPrecisionFormat)) throw new SymbolNotFoundError("Symbol not found: glGetShaderPrecisionFormat");
        try { Handles.MH_glGetShaderPrecisionFormat.invokeExact(handles.PFN_glGetShaderPrecisionFormat, shadertype, precisiontype, range, precision); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderPrecisionFormat", e); }
    }

    /// ```
    /// void glDepthRangef(float n, float f);
    /// ```
    public void DepthRangef(float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangef)) throw new SymbolNotFoundError("Symbol not found: glDepthRangef");
        try { Handles.MH_glDepthRangef.invokeExact(handles.PFN_glDepthRangef, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangef", e); }
    }

    /// ```
    /// void glClearDepthf(float d);
    /// ```
    public void ClearDepthf(float d) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthf)) throw new SymbolNotFoundError("Symbol not found: glClearDepthf");
        try { Handles.MH_glClearDepthf.invokeExact(handles.PFN_glClearDepthf, d); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthf", e); }
    }

}
