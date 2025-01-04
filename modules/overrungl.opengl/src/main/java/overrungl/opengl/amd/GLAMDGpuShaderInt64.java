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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDGpuShaderInt64 {
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    public static final int GL_INT8_NV = 0x8FE0;
    public static final int GL_INT8_VEC2_NV = 0x8FE1;
    public static final int GL_INT8_VEC3_NV = 0x8FE2;
    public static final int GL_INT8_VEC4_NV = 0x8FE3;
    public static final int GL_INT16_NV = 0x8FE4;
    public static final int GL_INT16_VEC2_NV = 0x8FE5;
    public static final int GL_INT16_VEC3_NV = 0x8FE6;
    public static final int GL_INT16_VEC4_NV = 0x8FE7;
    public static final int GL_INT64_VEC2_NV = 0x8FE9;
    public static final int GL_INT64_VEC3_NV = 0x8FEA;
    public static final int GL_INT64_VEC4_NV = 0x8FEB;
    public static final int GL_UNSIGNED_INT8_NV = 0x8FEC;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
    public static final int GL_UNSIGNED_INT16_NV = 0x8FF0;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;
    public static final int GL_FLOAT16_NV = 0x8FF8;
    public static final int GL_FLOAT16_VEC2_NV = 0x8FF9;
    public static final int GL_FLOAT16_VEC3_NV = 0x8FFA;
    public static final int GL_FLOAT16_VEC4_NV = 0x8FFB;
    public static final MethodHandle MH_glUniform1i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform1i64NV;
    public static final MethodHandle MH_glUniform2i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform2i64NV;
    public static final MethodHandle MH_glUniform3i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform3i64NV;
    public static final MethodHandle MH_glUniform4i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform4i64NV;
    public static final MethodHandle MH_glUniform1i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1i64vNV;
    public static final MethodHandle MH_glUniform2i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2i64vNV;
    public static final MethodHandle MH_glUniform3i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3i64vNV;
    public static final MethodHandle MH_glUniform4i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4i64vNV;
    public static final MethodHandle MH_glUniform1ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform1ui64NV;
    public static final MethodHandle MH_glUniform2ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform2ui64NV;
    public static final MethodHandle MH_glUniform3ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform3ui64NV;
    public static final MethodHandle MH_glUniform4ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniform4ui64NV;
    public static final MethodHandle MH_glUniform1ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1ui64vNV;
    public static final MethodHandle MH_glUniform2ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2ui64vNV;
    public static final MethodHandle MH_glUniform3ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3ui64vNV;
    public static final MethodHandle MH_glUniform4ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4ui64vNV;
    public static final MethodHandle MH_glGetUniformi64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformi64vNV;
    public static final MethodHandle MH_glGetUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformui64vNV;
    public static final MethodHandle MH_glProgramUniform1i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform1i64NV;
    public static final MethodHandle MH_glProgramUniform2i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform2i64NV;
    public static final MethodHandle MH_glProgramUniform3i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform3i64NV;
    public static final MethodHandle MH_glProgramUniform4i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform4i64NV;
    public static final MethodHandle MH_glProgramUniform1i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1i64vNV;
    public static final MethodHandle MH_glProgramUniform2i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2i64vNV;
    public static final MethodHandle MH_glProgramUniform3i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3i64vNV;
    public static final MethodHandle MH_glProgramUniform4i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4i64vNV;
    public static final MethodHandle MH_glProgramUniform1ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform1ui64NV;
    public static final MethodHandle MH_glProgramUniform2ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform2ui64NV;
    public static final MethodHandle MH_glProgramUniform3ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform3ui64NV;
    public static final MethodHandle MH_glProgramUniform4ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniform4ui64NV;
    public static final MethodHandle MH_glProgramUniform1ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1ui64vNV;
    public static final MethodHandle MH_glProgramUniform2ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2ui64vNV;
    public static final MethodHandle MH_glProgramUniform3ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3ui64vNV;
    public static final MethodHandle MH_glProgramUniform4ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4ui64vNV;

    public GLAMDGpuShaderInt64(overrungl.opengl.GLLoadFunc func) {
        PFN_glUniform1i64NV = func.invoke("glUniform1i64NV");
        PFN_glUniform2i64NV = func.invoke("glUniform2i64NV");
        PFN_glUniform3i64NV = func.invoke("glUniform3i64NV");
        PFN_glUniform4i64NV = func.invoke("glUniform4i64NV");
        PFN_glUniform1i64vNV = func.invoke("glUniform1i64vNV");
        PFN_glUniform2i64vNV = func.invoke("glUniform2i64vNV");
        PFN_glUniform3i64vNV = func.invoke("glUniform3i64vNV");
        PFN_glUniform4i64vNV = func.invoke("glUniform4i64vNV");
        PFN_glUniform1ui64NV = func.invoke("glUniform1ui64NV");
        PFN_glUniform2ui64NV = func.invoke("glUniform2ui64NV");
        PFN_glUniform3ui64NV = func.invoke("glUniform3ui64NV");
        PFN_glUniform4ui64NV = func.invoke("glUniform4ui64NV");
        PFN_glUniform1ui64vNV = func.invoke("glUniform1ui64vNV");
        PFN_glUniform2ui64vNV = func.invoke("glUniform2ui64vNV");
        PFN_glUniform3ui64vNV = func.invoke("glUniform3ui64vNV");
        PFN_glUniform4ui64vNV = func.invoke("glUniform4ui64vNV");
        PFN_glGetUniformi64vNV = func.invoke("glGetUniformi64vNV");
        PFN_glGetUniformui64vNV = func.invoke("glGetUniformui64vNV");PFN_glProgramUniform1i64NV = func.invoke("glProgramUniform1i64NV");
        PFN_glProgramUniform2i64NV = func.invoke("glProgramUniform2i64NV");
        PFN_glProgramUniform3i64NV = func.invoke("glProgramUniform3i64NV");
        PFN_glProgramUniform4i64NV = func.invoke("glProgramUniform4i64NV");
        PFN_glProgramUniform1i64vNV = func.invoke("glProgramUniform1i64vNV");
        PFN_glProgramUniform2i64vNV = func.invoke("glProgramUniform2i64vNV");
        PFN_glProgramUniform3i64vNV = func.invoke("glProgramUniform3i64vNV");
        PFN_glProgramUniform4i64vNV = func.invoke("glProgramUniform4i64vNV");
        PFN_glProgramUniform1ui64NV = func.invoke("glProgramUniform1ui64NV");
        PFN_glProgramUniform2ui64NV = func.invoke("glProgramUniform2ui64NV");
        PFN_glProgramUniform3ui64NV = func.invoke("glProgramUniform3ui64NV");
        PFN_glProgramUniform4ui64NV = func.invoke("glProgramUniform4ui64NV");
        PFN_glProgramUniform1ui64vNV = func.invoke("glProgramUniform1ui64vNV");
        PFN_glProgramUniform2ui64vNV = func.invoke("glProgramUniform2ui64vNV");
        PFN_glProgramUniform3ui64vNV = func.invoke("glProgramUniform3ui64vNV");
        PFN_glProgramUniform4ui64vNV = func.invoke("glProgramUniform4ui64vNV");
    }

    public void Uniform1i64NV(@CType("GLint") int location, @CType("GLint64EXT") long x) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1i64NV))
            MH_glUniform1i64NV.invokeExact(PFN_glUniform1i64NV, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1i64NV", e); }
    }

    public void Uniform2i64NV(@CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2i64NV))
            MH_glUniform2i64NV.invokeExact(PFN_glUniform2i64NV, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2i64NV", e); }
    }

    public void Uniform3i64NV(@CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3i64NV))
            MH_glUniform3i64NV.invokeExact(PFN_glUniform3i64NV, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3i64NV", e); }
    }

    public void Uniform4i64NV(@CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z, @CType("GLint64EXT") long w) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4i64NV))
            MH_glUniform4i64NV.invokeExact(PFN_glUniform4i64NV, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4i64NV", e); }
    }

    public void Uniform1i64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1i64vNV))
            MH_glUniform1i64vNV.invokeExact(PFN_glUniform1i64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1i64vNV", e); }
    }

    public void Uniform2i64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2i64vNV))
            MH_glUniform2i64vNV.invokeExact(PFN_glUniform2i64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2i64vNV", e); }
    }

    public void Uniform3i64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3i64vNV))
            MH_glUniform3i64vNV.invokeExact(PFN_glUniform3i64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3i64vNV", e); }
    }

    public void Uniform4i64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4i64vNV))
            MH_glUniform4i64vNV.invokeExact(PFN_glUniform4i64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4i64vNV", e); }
    }

    public void Uniform1ui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long x) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1ui64NV))
            MH_glUniform1ui64NV.invokeExact(PFN_glUniform1ui64NV, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1ui64NV", e); }
    }

    public void Uniform2ui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2ui64NV))
            MH_glUniform2ui64NV.invokeExact(PFN_glUniform2ui64NV, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2ui64NV", e); }
    }

    public void Uniform3ui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3ui64NV))
            MH_glUniform3ui64NV.invokeExact(PFN_glUniform3ui64NV, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3ui64NV", e); }
    }

    public void Uniform4ui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z, @CType("GLuint64EXT") long w) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4ui64NV))
            MH_glUniform4ui64NV.invokeExact(PFN_glUniform4ui64NV, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4ui64NV", e); }
    }

    public void Uniform1ui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1ui64vNV))
            MH_glUniform1ui64vNV.invokeExact(PFN_glUniform1ui64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1ui64vNV", e); }
    }

    public void Uniform2ui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2ui64vNV))
            MH_glUniform2ui64vNV.invokeExact(PFN_glUniform2ui64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2ui64vNV", e); }
    }

    public void Uniform3ui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3ui64vNV))
            MH_glUniform3ui64vNV.invokeExact(PFN_glUniform3ui64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3ui64vNV", e); }
    }

    public void Uniform4ui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4ui64vNV))
            MH_glUniform4ui64vNV.invokeExact(PFN_glUniform4ui64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4ui64vNV", e); }
    }

    public void GetUniformi64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint64EXT *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformi64vNV))
            MH_glGetUniformi64vNV.invokeExact(PFN_glGetUniformi64vNV, program, location, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformi64vNV", e); }
    }

    public void GetUniformui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformui64vNV))
            MH_glGetUniformui64vNV.invokeExact(PFN_glGetUniformui64vNV, program, location, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformui64vNV", e); }
    }

    public void ProgramUniform1i64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint64EXT") long x) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1i64NV))
            MH_glProgramUniform1i64NV.invokeExact(PFN_glProgramUniform1i64NV, program, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1i64NV", e); }
    }

    public void ProgramUniform2i64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2i64NV))
            MH_glProgramUniform2i64NV.invokeExact(PFN_glProgramUniform2i64NV, program, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2i64NV", e); }
    }

    public void ProgramUniform3i64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3i64NV))
            MH_glProgramUniform3i64NV.invokeExact(PFN_glProgramUniform3i64NV, program, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3i64NV", e); }
    }

    public void ProgramUniform4i64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z, @CType("GLint64EXT") long w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4i64NV))
            MH_glProgramUniform4i64NV.invokeExact(PFN_glProgramUniform4i64NV, program, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4i64NV", e); }
    }

    public void ProgramUniform1i64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1i64vNV))
            MH_glProgramUniform1i64vNV.invokeExact(PFN_glProgramUniform1i64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1i64vNV", e); }
    }

    public void ProgramUniform2i64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2i64vNV))
            MH_glProgramUniform2i64vNV.invokeExact(PFN_glProgramUniform2i64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2i64vNV", e); }
    }

    public void ProgramUniform3i64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3i64vNV))
            MH_glProgramUniform3i64vNV.invokeExact(PFN_glProgramUniform3i64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3i64vNV", e); }
    }

    public void ProgramUniform4i64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4i64vNV))
            MH_glProgramUniform4i64vNV.invokeExact(PFN_glProgramUniform4i64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4i64vNV", e); }
    }

    public void ProgramUniform1ui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long x) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ui64NV))
            MH_glProgramUniform1ui64NV.invokeExact(PFN_glProgramUniform1ui64NV, program, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ui64NV", e); }
    }

    public void ProgramUniform2ui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ui64NV))
            MH_glProgramUniform2ui64NV.invokeExact(PFN_glProgramUniform2ui64NV, program, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ui64NV", e); }
    }

    public void ProgramUniform3ui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ui64NV))
            MH_glProgramUniform3ui64NV.invokeExact(PFN_glProgramUniform3ui64NV, program, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ui64NV", e); }
    }

    public void ProgramUniform4ui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z, @CType("GLuint64EXT") long w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ui64NV))
            MH_glProgramUniform4ui64NV.invokeExact(PFN_glProgramUniform4ui64NV, program, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ui64NV", e); }
    }

    public void ProgramUniform1ui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ui64vNV))
            MH_glProgramUniform1ui64vNV.invokeExact(PFN_glProgramUniform1ui64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ui64vNV", e); }
    }

    public void ProgramUniform2ui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ui64vNV))
            MH_glProgramUniform2ui64vNV.invokeExact(PFN_glProgramUniform2ui64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ui64vNV", e); }
    }

    public void ProgramUniform3ui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ui64vNV))
            MH_glProgramUniform3ui64vNV.invokeExact(PFN_glProgramUniform3ui64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ui64vNV", e); }
    }

    public void ProgramUniform4ui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ui64vNV))
            MH_glProgramUniform4ui64vNV.invokeExact(PFN_glProgramUniform4ui64vNV, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ui64vNV", e); }
    }

}
