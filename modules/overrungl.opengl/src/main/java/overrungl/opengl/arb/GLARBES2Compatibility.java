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
import overrungl.annotation.*;
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
    public static final MethodHandle MH_glReleaseShaderCompiler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glReleaseShaderCompiler;
    public static final MethodHandle MH_glShaderBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glShaderBinary;
    public static final MethodHandle MH_glGetShaderPrecisionFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetShaderPrecisionFormat;
    public static final MethodHandle MH_glDepthRangef = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glDepthRangef;
    public static final MethodHandle MH_glClearDepthf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glClearDepthf;

    public GLARBES2Compatibility(overrungl.opengl.GLLoadFunc func) {
        PFN_glReleaseShaderCompiler = func.invoke("glReleaseShaderCompiler");
        PFN_glShaderBinary = func.invoke("glShaderBinary");
        PFN_glGetShaderPrecisionFormat = func.invoke("glGetShaderPrecisionFormat");
        PFN_glDepthRangef = func.invoke("glDepthRangef");
        PFN_glClearDepthf = func.invoke("glClearDepthf");
    }

    public void ReleaseShaderCompiler() {
        if (!Unmarshal.isNullPointer(PFN_glReleaseShaderCompiler)) { try {
            MH_glReleaseShaderCompiler.invokeExact(PFN_glReleaseShaderCompiler);
        } catch (Throwable e) { throw new RuntimeException("error in glReleaseShaderCompiler", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReleaseShaderCompiler"); }
    }

    public void ShaderBinary(@CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment shaders, @CType("GLenum") int binaryFormat, @CType("const void *") java.lang.foreign.MemorySegment binary, @CType("GLsizei") int length) {
        if (!Unmarshal.isNullPointer(PFN_glShaderBinary)) { try {
            MH_glShaderBinary.invokeExact(PFN_glShaderBinary, count, shaders, binaryFormat, binary, length);
        } catch (Throwable e) { throw new RuntimeException("error in glShaderBinary", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glShaderBinary"); }
    }

    public void GetShaderPrecisionFormat(@CType("GLenum") int shadertype, @CType("GLenum") int precisiontype, @CType("GLint *") java.lang.foreign.MemorySegment range, @CType("GLint *") java.lang.foreign.MemorySegment precision) {
        if (!Unmarshal.isNullPointer(PFN_glGetShaderPrecisionFormat)) { try {
            MH_glGetShaderPrecisionFormat.invokeExact(PFN_glGetShaderPrecisionFormat, shadertype, precisiontype, range, precision);
        } catch (Throwable e) { throw new RuntimeException("error in glGetShaderPrecisionFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetShaderPrecisionFormat"); }
    }

    public void DepthRangef(@CType("GLfloat") float n, @CType("GLfloat") float f) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangef)) { try {
            MH_glDepthRangef.invokeExact(PFN_glDepthRangef, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangef", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangef"); }
    }

    public void ClearDepthf(@CType("GLfloat") float d) {
        if (!Unmarshal.isNullPointer(PFN_glClearDepthf)) { try {
            MH_glClearDepthf.invokeExact(PFN_glClearDepthf, d);
        } catch (Throwable e) { throw new RuntimeException("error in glClearDepthf", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearDepthf"); }
    }

}
