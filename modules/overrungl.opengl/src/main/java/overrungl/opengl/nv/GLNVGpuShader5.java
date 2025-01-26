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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVGpuShader5 {
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
    public static final int GL_PATCHES = 0x000E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUniform1i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform2i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform3i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform4i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform1i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform2ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform3ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform4ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform1ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformi64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform2i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform3i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform4i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform1i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform2ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform3ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform4ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform1ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUniform1i64NV;
        public final MemorySegment PFN_glUniform2i64NV;
        public final MemorySegment PFN_glUniform3i64NV;
        public final MemorySegment PFN_glUniform4i64NV;
        public final MemorySegment PFN_glUniform1i64vNV;
        public final MemorySegment PFN_glUniform2i64vNV;
        public final MemorySegment PFN_glUniform3i64vNV;
        public final MemorySegment PFN_glUniform4i64vNV;
        public final MemorySegment PFN_glUniform1ui64NV;
        public final MemorySegment PFN_glUniform2ui64NV;
        public final MemorySegment PFN_glUniform3ui64NV;
        public final MemorySegment PFN_glUniform4ui64NV;
        public final MemorySegment PFN_glUniform1ui64vNV;
        public final MemorySegment PFN_glUniform2ui64vNV;
        public final MemorySegment PFN_glUniform3ui64vNV;
        public final MemorySegment PFN_glUniform4ui64vNV;
        public final MemorySegment PFN_glGetUniformi64vNV;
        public final MemorySegment PFN_glProgramUniform1i64NV;
        public final MemorySegment PFN_glProgramUniform2i64NV;
        public final MemorySegment PFN_glProgramUniform3i64NV;
        public final MemorySegment PFN_glProgramUniform4i64NV;
        public final MemorySegment PFN_glProgramUniform1i64vNV;
        public final MemorySegment PFN_glProgramUniform2i64vNV;
        public final MemorySegment PFN_glProgramUniform3i64vNV;
        public final MemorySegment PFN_glProgramUniform4i64vNV;
        public final MemorySegment PFN_glProgramUniform1ui64NV;
        public final MemorySegment PFN_glProgramUniform2ui64NV;
        public final MemorySegment PFN_glProgramUniform3ui64NV;
        public final MemorySegment PFN_glProgramUniform4ui64NV;
        public final MemorySegment PFN_glProgramUniform1ui64vNV;
        public final MemorySegment PFN_glProgramUniform2ui64vNV;
        public final MemorySegment PFN_glProgramUniform3ui64vNV;
        public final MemorySegment PFN_glProgramUniform4ui64vNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
            PFN_glGetUniformi64vNV = func.invoke("glGetUniformi64vNV");PFN_glProgramUniform1i64NV = func.invoke("glProgramUniform1i64NV");
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
    }

    public GLNVGpuShader5(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glUniform1i64NV(GLint location, GLint64EXT x);
    /// ```
    public void Uniform1i64NV(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform1i64NV");
        try { Handles.MH_glUniform1i64NV.invokeExact(handles.PFN_glUniform1i64NV, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64NV", e); }
    }

    /// ```
    /// void glUniform2i64NV(GLint location, GLint64EXT x, GLint64EXT y);
    /// ```
    public void Uniform2i64NV(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform2i64NV");
        try { Handles.MH_glUniform2i64NV.invokeExact(handles.PFN_glUniform2i64NV, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64NV", e); }
    }

    /// ```
    /// void glUniform3i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z);
    /// ```
    public void Uniform3i64NV(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform3i64NV");
        try { Handles.MH_glUniform3i64NV.invokeExact(handles.PFN_glUniform3i64NV, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64NV", e); }
    }

    /// ```
    /// void glUniform4i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w);
    /// ```
    public void Uniform4i64NV(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform4i64NV");
        try { Handles.MH_glUniform4i64NV.invokeExact(handles.PFN_glUniform4i64NV, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64NV", e); }
    }

    /// ```
    /// void glUniform1i64vNV(GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform1i64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform1i64vNV");
        try { Handles.MH_glUniform1i64vNV.invokeExact(handles.PFN_glUniform1i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64vNV", e); }
    }

    /// ```
    /// void glUniform2i64vNV(GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform2i64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform2i64vNV");
        try { Handles.MH_glUniform2i64vNV.invokeExact(handles.PFN_glUniform2i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64vNV", e); }
    }

    /// ```
    /// void glUniform3i64vNV(GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform3i64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform3i64vNV");
        try { Handles.MH_glUniform3i64vNV.invokeExact(handles.PFN_glUniform3i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64vNV", e); }
    }

    /// ```
    /// void glUniform4i64vNV(GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform4i64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform4i64vNV");
        try { Handles.MH_glUniform4i64vNV.invokeExact(handles.PFN_glUniform4i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64vNV", e); }
    }

    /// ```
    /// void glUniform1ui64NV(GLint location, GLuint64EXT x);
    /// ```
    public void Uniform1ui64NV(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform1ui64NV");
        try { Handles.MH_glUniform1ui64NV.invokeExact(handles.PFN_glUniform1ui64NV, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64NV", e); }
    }

    /// ```
    /// void glUniform2ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y);
    /// ```
    public void Uniform2ui64NV(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform2ui64NV");
        try { Handles.MH_glUniform2ui64NV.invokeExact(handles.PFN_glUniform2ui64NV, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64NV", e); }
    }

    /// ```
    /// void glUniform3ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z);
    /// ```
    public void Uniform3ui64NV(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform3ui64NV");
        try { Handles.MH_glUniform3ui64NV.invokeExact(handles.PFN_glUniform3ui64NV, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64NV", e); }
    }

    /// ```
    /// void glUniform4ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w);
    /// ```
    public void Uniform4ui64NV(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniform4ui64NV");
        try { Handles.MH_glUniform4ui64NV.invokeExact(handles.PFN_glUniform4ui64NV, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64NV", e); }
    }

    /// ```
    /// void glUniform1ui64vNV(GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform1ui64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform1ui64vNV");
        try { Handles.MH_glUniform1ui64vNV.invokeExact(handles.PFN_glUniform1ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64vNV", e); }
    }

    /// ```
    /// void glUniform2ui64vNV(GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform2ui64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform2ui64vNV");
        try { Handles.MH_glUniform2ui64vNV.invokeExact(handles.PFN_glUniform2ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64vNV", e); }
    }

    /// ```
    /// void glUniform3ui64vNV(GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform3ui64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform3ui64vNV");
        try { Handles.MH_glUniform3ui64vNV.invokeExact(handles.PFN_glUniform3ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64vNV", e); }
    }

    /// ```
    /// void glUniform4ui64vNV(GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform4ui64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniform4ui64vNV");
        try { Handles.MH_glUniform4ui64vNV.invokeExact(handles.PFN_glUniform4ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64vNV", e); }
    }

    /// ```
    /// void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT* params);
    /// ```
    public void GetUniformi64vNV(int program, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformi64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetUniformi64vNV");
        try { Handles.MH_glGetUniformi64vNV.invokeExact(handles.PFN_glGetUniformi64vNV, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformi64vNV", e); }
    }

    /// ```
    /// void glProgramUniform1i64NV(GLuint program, GLint location, GLint64EXT x);
    /// ```
    public void ProgramUniform1i64NV(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i64NV");
        try { Handles.MH_glProgramUniform1i64NV.invokeExact(handles.PFN_glProgramUniform1i64NV, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64NV", e); }
    }

    /// ```
    /// void glProgramUniform2i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y);
    /// ```
    public void ProgramUniform2i64NV(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i64NV");
        try { Handles.MH_glProgramUniform2i64NV.invokeExact(handles.PFN_glProgramUniform2i64NV, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64NV", e); }
    }

    /// ```
    /// void glProgramUniform3i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z);
    /// ```
    public void ProgramUniform3i64NV(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i64NV");
        try { Handles.MH_glProgramUniform3i64NV.invokeExact(handles.PFN_glProgramUniform3i64NV, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64NV", e); }
    }

    /// ```
    /// void glProgramUniform4i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w);
    /// ```
    public void ProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i64NV");
        try { Handles.MH_glProgramUniform4i64NV.invokeExact(handles.PFN_glProgramUniform4i64NV, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64NV", e); }
    }

    /// ```
    /// void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform1i64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i64vNV");
        try { Handles.MH_glProgramUniform1i64vNV.invokeExact(handles.PFN_glProgramUniform1i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64vNV", e); }
    }

    /// ```
    /// void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform2i64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i64vNV");
        try { Handles.MH_glProgramUniform2i64vNV.invokeExact(handles.PFN_glProgramUniform2i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64vNV", e); }
    }

    /// ```
    /// void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform3i64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i64vNV");
        try { Handles.MH_glProgramUniform3i64vNV.invokeExact(handles.PFN_glProgramUniform3i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64vNV", e); }
    }

    /// ```
    /// void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform4i64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i64vNV");
        try { Handles.MH_glProgramUniform4i64vNV.invokeExact(handles.PFN_glProgramUniform4i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64vNV", e); }
    }

    /// ```
    /// void glProgramUniform1ui64NV(GLuint program, GLint location, GLuint64EXT x);
    /// ```
    public void ProgramUniform1ui64NV(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui64NV");
        try { Handles.MH_glProgramUniform1ui64NV.invokeExact(handles.PFN_glProgramUniform1ui64NV, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64NV", e); }
    }

    /// ```
    /// void glProgramUniform2ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y);
    /// ```
    public void ProgramUniform2ui64NV(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui64NV");
        try { Handles.MH_glProgramUniform2ui64NV.invokeExact(handles.PFN_glProgramUniform2ui64NV, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64NV", e); }
    }

    /// ```
    /// void glProgramUniform3ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z);
    /// ```
    public void ProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui64NV");
        try { Handles.MH_glProgramUniform3ui64NV.invokeExact(handles.PFN_glProgramUniform3ui64NV, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64NV", e); }
    }

    /// ```
    /// void glProgramUniform4ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w);
    /// ```
    public void ProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui64NV");
        try { Handles.MH_glProgramUniform4ui64NV.invokeExact(handles.PFN_glProgramUniform4ui64NV, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64NV", e); }
    }

    /// ```
    /// void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform1ui64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui64vNV");
        try { Handles.MH_glProgramUniform1ui64vNV.invokeExact(handles.PFN_glProgramUniform1ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64vNV", e); }
    }

    /// ```
    /// void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform2ui64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui64vNV");
        try { Handles.MH_glProgramUniform2ui64vNV.invokeExact(handles.PFN_glProgramUniform2ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64vNV", e); }
    }

    /// ```
    /// void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform3ui64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui64vNV");
        try { Handles.MH_glProgramUniform3ui64vNV.invokeExact(handles.PFN_glProgramUniform3ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64vNV", e); }
    }

    /// ```
    /// void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform4ui64vNV(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui64vNV");
        try { Handles.MH_glProgramUniform4ui64vNV.invokeExact(handles.PFN_glProgramUniform4ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64vNV", e); }
    }

}
