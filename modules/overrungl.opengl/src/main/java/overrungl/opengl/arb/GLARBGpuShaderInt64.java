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

public final class GLARBGpuShaderInt64 {
    public static final int GL_INT64_ARB = 0x140E;
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    public static final int GL_INT64_VEC2_ARB = 0x8FE9;
    public static final int GL_INT64_VEC3_ARB = 0x8FEA;
    public static final int GL_INT64_VEC4_ARB = 0x8FEB;
    public static final int GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUniform1i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform2i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform3i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform4i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform1i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform2ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform3ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform4ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniform1ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformi64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformi64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform2i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform3i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform4i64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform1i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4i64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform2ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform3ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform4ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniform1ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUniform1i64ARB;
        public final MemorySegment PFN_glUniform2i64ARB;
        public final MemorySegment PFN_glUniform3i64ARB;
        public final MemorySegment PFN_glUniform4i64ARB;
        public final MemorySegment PFN_glUniform1i64vARB;
        public final MemorySegment PFN_glUniform2i64vARB;
        public final MemorySegment PFN_glUniform3i64vARB;
        public final MemorySegment PFN_glUniform4i64vARB;
        public final MemorySegment PFN_glUniform1ui64ARB;
        public final MemorySegment PFN_glUniform2ui64ARB;
        public final MemorySegment PFN_glUniform3ui64ARB;
        public final MemorySegment PFN_glUniform4ui64ARB;
        public final MemorySegment PFN_glUniform1ui64vARB;
        public final MemorySegment PFN_glUniform2ui64vARB;
        public final MemorySegment PFN_glUniform3ui64vARB;
        public final MemorySegment PFN_glUniform4ui64vARB;
        public final MemorySegment PFN_glGetUniformi64vARB;
        public final MemorySegment PFN_glGetUniformui64vARB;
        public final MemorySegment PFN_glGetnUniformi64vARB;
        public final MemorySegment PFN_glGetnUniformui64vARB;
        public final MemorySegment PFN_glProgramUniform1i64ARB;
        public final MemorySegment PFN_glProgramUniform2i64ARB;
        public final MemorySegment PFN_glProgramUniform3i64ARB;
        public final MemorySegment PFN_glProgramUniform4i64ARB;
        public final MemorySegment PFN_glProgramUniform1i64vARB;
        public final MemorySegment PFN_glProgramUniform2i64vARB;
        public final MemorySegment PFN_glProgramUniform3i64vARB;
        public final MemorySegment PFN_glProgramUniform4i64vARB;
        public final MemorySegment PFN_glProgramUniform1ui64ARB;
        public final MemorySegment PFN_glProgramUniform2ui64ARB;
        public final MemorySegment PFN_glProgramUniform3ui64ARB;
        public final MemorySegment PFN_glProgramUniform4ui64ARB;
        public final MemorySegment PFN_glProgramUniform1ui64vARB;
        public final MemorySegment PFN_glProgramUniform2ui64vARB;
        public final MemorySegment PFN_glProgramUniform3ui64vARB;
        public final MemorySegment PFN_glProgramUniform4ui64vARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glUniform1i64ARB = func.invoke("glUniform1i64ARB");
            PFN_glUniform2i64ARB = func.invoke("glUniform2i64ARB");
            PFN_glUniform3i64ARB = func.invoke("glUniform3i64ARB");
            PFN_glUniform4i64ARB = func.invoke("glUniform4i64ARB");
            PFN_glUniform1i64vARB = func.invoke("glUniform1i64vARB");
            PFN_glUniform2i64vARB = func.invoke("glUniform2i64vARB");
            PFN_glUniform3i64vARB = func.invoke("glUniform3i64vARB");
            PFN_glUniform4i64vARB = func.invoke("glUniform4i64vARB");
            PFN_glUniform1ui64ARB = func.invoke("glUniform1ui64ARB");
            PFN_glUniform2ui64ARB = func.invoke("glUniform2ui64ARB");
            PFN_glUniform3ui64ARB = func.invoke("glUniform3ui64ARB");
            PFN_glUniform4ui64ARB = func.invoke("glUniform4ui64ARB");
            PFN_glUniform1ui64vARB = func.invoke("glUniform1ui64vARB");
            PFN_glUniform2ui64vARB = func.invoke("glUniform2ui64vARB");
            PFN_glUniform3ui64vARB = func.invoke("glUniform3ui64vARB");
            PFN_glUniform4ui64vARB = func.invoke("glUniform4ui64vARB");
            PFN_glGetUniformi64vARB = func.invoke("glGetUniformi64vARB");
            PFN_glGetUniformui64vARB = func.invoke("glGetUniformui64vARB");
            PFN_glGetnUniformi64vARB = func.invoke("glGetnUniformi64vARB");
            PFN_glGetnUniformui64vARB = func.invoke("glGetnUniformui64vARB");
            PFN_glProgramUniform1i64ARB = func.invoke("glProgramUniform1i64ARB");
            PFN_glProgramUniform2i64ARB = func.invoke("glProgramUniform2i64ARB");
            PFN_glProgramUniform3i64ARB = func.invoke("glProgramUniform3i64ARB");
            PFN_glProgramUniform4i64ARB = func.invoke("glProgramUniform4i64ARB");
            PFN_glProgramUniform1i64vARB = func.invoke("glProgramUniform1i64vARB");
            PFN_glProgramUniform2i64vARB = func.invoke("glProgramUniform2i64vARB");
            PFN_glProgramUniform3i64vARB = func.invoke("glProgramUniform3i64vARB");
            PFN_glProgramUniform4i64vARB = func.invoke("glProgramUniform4i64vARB");
            PFN_glProgramUniform1ui64ARB = func.invoke("glProgramUniform1ui64ARB");
            PFN_glProgramUniform2ui64ARB = func.invoke("glProgramUniform2ui64ARB");
            PFN_glProgramUniform3ui64ARB = func.invoke("glProgramUniform3ui64ARB");
            PFN_glProgramUniform4ui64ARB = func.invoke("glProgramUniform4ui64ARB");
            PFN_glProgramUniform1ui64vARB = func.invoke("glProgramUniform1ui64vARB");
            PFN_glProgramUniform2ui64vARB = func.invoke("glProgramUniform2ui64vARB");
            PFN_glProgramUniform3ui64vARB = func.invoke("glProgramUniform3ui64vARB");
            PFN_glProgramUniform4ui64vARB = func.invoke("glProgramUniform4ui64vARB");
        }
    }

    public GLARBGpuShaderInt64(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glUniform1i64ARB((int) GLint location, ((int64_t) khronos_int64_t) GLint64 x);
    /// ```
    public void Uniform1i64ARB(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1i64ARB");
        try { Handles.MH_glUniform1i64ARB.invokeExact(handles.PFN_glUniform1i64ARB, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64ARB", e); }
    }

    /// ```
    /// void glUniform2i64ARB((int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y);
    /// ```
    public void Uniform2i64ARB(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2i64ARB");
        try { Handles.MH_glUniform2i64ARB.invokeExact(handles.PFN_glUniform2i64ARB, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64ARB", e); }
    }

    /// ```
    /// void glUniform3i64ARB((int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y, ((int64_t) khronos_int64_t) GLint64 z);
    /// ```
    public void Uniform3i64ARB(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3i64ARB");
        try { Handles.MH_glUniform3i64ARB.invokeExact(handles.PFN_glUniform3i64ARB, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64ARB", e); }
    }

    /// ```
    /// void glUniform4i64ARB((int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y, ((int64_t) khronos_int64_t) GLint64 z, ((int64_t) khronos_int64_t) GLint64 w);
    /// ```
    public void Uniform4i64ARB(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4i64ARB");
        try { Handles.MH_glUniform4i64ARB.invokeExact(handles.PFN_glUniform4i64ARB, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64ARB", e); }
    }

    /// ```
    /// void glUniform1i64vARB((int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void Uniform1i64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1i64vARB");
        try { Handles.MH_glUniform1i64vARB.invokeExact(handles.PFN_glUniform1i64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64vARB", e); }
    }

    /// ```
    /// void glUniform2i64vARB((int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void Uniform2i64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2i64vARB");
        try { Handles.MH_glUniform2i64vARB.invokeExact(handles.PFN_glUniform2i64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64vARB", e); }
    }

    /// ```
    /// void glUniform3i64vARB((int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void Uniform3i64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3i64vARB");
        try { Handles.MH_glUniform3i64vARB.invokeExact(handles.PFN_glUniform3i64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64vARB", e); }
    }

    /// ```
    /// void glUniform4i64vARB((int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void Uniform4i64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4i64vARB");
        try { Handles.MH_glUniform4i64vARB.invokeExact(handles.PFN_glUniform4i64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64vARB", e); }
    }

    /// ```
    /// void glUniform1ui64ARB((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x);
    /// ```
    public void Uniform1ui64ARB(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1ui64ARB");
        try { Handles.MH_glUniform1ui64ARB.invokeExact(handles.PFN_glUniform1ui64ARB, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64ARB", e); }
    }

    /// ```
    /// void glUniform2ui64ARB((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y);
    /// ```
    public void Uniform2ui64ARB(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2ui64ARB");
        try { Handles.MH_glUniform2ui64ARB.invokeExact(handles.PFN_glUniform2ui64ARB, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64ARB", e); }
    }

    /// ```
    /// void glUniform3ui64ARB((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y, ((uint64_t) khronos_uint64_t) GLuint64 z);
    /// ```
    public void Uniform3ui64ARB(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3ui64ARB");
        try { Handles.MH_glUniform3ui64ARB.invokeExact(handles.PFN_glUniform3ui64ARB, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64ARB", e); }
    }

    /// ```
    /// void glUniform4ui64ARB((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y, ((uint64_t) khronos_uint64_t) GLuint64 z, ((uint64_t) khronos_uint64_t) GLuint64 w);
    /// ```
    public void Uniform4ui64ARB(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4ui64ARB");
        try { Handles.MH_glUniform4ui64ARB.invokeExact(handles.PFN_glUniform4ui64ARB, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64ARB", e); }
    }

    /// ```
    /// void glUniform1ui64vARB((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void Uniform1ui64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1ui64vARB");
        try { Handles.MH_glUniform1ui64vARB.invokeExact(handles.PFN_glUniform1ui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64vARB", e); }
    }

    /// ```
    /// void glUniform2ui64vARB((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void Uniform2ui64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2ui64vARB");
        try { Handles.MH_glUniform2ui64vARB.invokeExact(handles.PFN_glUniform2ui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64vARB", e); }
    }

    /// ```
    /// void glUniform3ui64vARB((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void Uniform3ui64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3ui64vARB");
        try { Handles.MH_glUniform3ui64vARB.invokeExact(handles.PFN_glUniform3ui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64vARB", e); }
    }

    /// ```
    /// void glUniform4ui64vARB((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void Uniform4ui64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4ui64vARB");
        try { Handles.MH_glUniform4ui64vARB.invokeExact(handles.PFN_glUniform4ui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64vARB", e); }
    }

    /// ```
    /// void glGetUniformi64vARB((unsigned int) GLuint program, (int) GLint location, GLint64* params);
    /// ```
    public void GetUniformi64vARB(int program, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformi64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetUniformi64vARB");
        try { Handles.MH_glGetUniformi64vARB.invokeExact(handles.PFN_glGetUniformi64vARB, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformi64vARB", e); }
    }

    /// ```
    /// void glGetUniformui64vARB((unsigned int) GLuint program, (int) GLint location, GLuint64* params);
    /// ```
    public void GetUniformui64vARB(int program, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformui64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetUniformui64vARB");
        try { Handles.MH_glGetUniformui64vARB.invokeExact(handles.PFN_glGetUniformui64vARB, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformui64vARB", e); }
    }

    /// ```
    /// void glGetnUniformi64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLint64* params);
    /// ```
    public void GetnUniformi64vARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformi64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformi64vARB");
        try { Handles.MH_glGetnUniformi64vARB.invokeExact(handles.PFN_glGetnUniformi64vARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformi64vARB", e); }
    }

    /// ```
    /// void glGetnUniformui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLuint64* params);
    /// ```
    public void GetnUniformui64vARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformui64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformui64vARB");
        try { Handles.MH_glGetnUniformui64vARB.invokeExact(handles.PFN_glGetnUniformui64vARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformui64vARB", e); }
    }

    /// ```
    /// void glProgramUniform1i64ARB((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64 x);
    /// ```
    public void ProgramUniform1i64ARB(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i64ARB");
        try { Handles.MH_glProgramUniform1i64ARB.invokeExact(handles.PFN_glProgramUniform1i64ARB, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64ARB", e); }
    }

    /// ```
    /// void glProgramUniform2i64ARB((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y);
    /// ```
    public void ProgramUniform2i64ARB(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i64ARB");
        try { Handles.MH_glProgramUniform2i64ARB.invokeExact(handles.PFN_glProgramUniform2i64ARB, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64ARB", e); }
    }

    /// ```
    /// void glProgramUniform3i64ARB((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y, ((int64_t) khronos_int64_t) GLint64 z);
    /// ```
    public void ProgramUniform3i64ARB(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i64ARB");
        try { Handles.MH_glProgramUniform3i64ARB.invokeExact(handles.PFN_glProgramUniform3i64ARB, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64ARB", e); }
    }

    /// ```
    /// void glProgramUniform4i64ARB((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64 x, ((int64_t) khronos_int64_t) GLint64 y, ((int64_t) khronos_int64_t) GLint64 z, ((int64_t) khronos_int64_t) GLint64 w);
    /// ```
    public void ProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i64ARB");
        try { Handles.MH_glProgramUniform4i64ARB.invokeExact(handles.PFN_glProgramUniform4i64ARB, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64ARB", e); }
    }

    /// ```
    /// void glProgramUniform1i64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void ProgramUniform1i64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i64vARB");
        try { Handles.MH_glProgramUniform1i64vARB.invokeExact(handles.PFN_glProgramUniform1i64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64vARB", e); }
    }

    /// ```
    /// void glProgramUniform2i64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void ProgramUniform2i64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i64vARB");
        try { Handles.MH_glProgramUniform2i64vARB.invokeExact(handles.PFN_glProgramUniform2i64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64vARB", e); }
    }

    /// ```
    /// void glProgramUniform3i64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void ProgramUniform3i64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i64vARB");
        try { Handles.MH_glProgramUniform3i64vARB.invokeExact(handles.PFN_glProgramUniform3i64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64vARB", e); }
    }

    /// ```
    /// void glProgramUniform4i64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64* value);
    /// ```
    public void ProgramUniform4i64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i64vARB");
        try { Handles.MH_glProgramUniform4i64vARB.invokeExact(handles.PFN_glProgramUniform4i64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64vARB", e); }
    }

    /// ```
    /// void glProgramUniform1ui64ARB((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x);
    /// ```
    public void ProgramUniform1ui64ARB(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui64ARB");
        try { Handles.MH_glProgramUniform1ui64ARB.invokeExact(handles.PFN_glProgramUniform1ui64ARB, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64ARB", e); }
    }

    /// ```
    /// void glProgramUniform2ui64ARB((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y);
    /// ```
    public void ProgramUniform2ui64ARB(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui64ARB");
        try { Handles.MH_glProgramUniform2ui64ARB.invokeExact(handles.PFN_glProgramUniform2ui64ARB, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64ARB", e); }
    }

    /// ```
    /// void glProgramUniform3ui64ARB((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y, ((uint64_t) khronos_uint64_t) GLuint64 z);
    /// ```
    public void ProgramUniform3ui64ARB(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui64ARB");
        try { Handles.MH_glProgramUniform3ui64ARB.invokeExact(handles.PFN_glProgramUniform3ui64ARB, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64ARB", e); }
    }

    /// ```
    /// void glProgramUniform4ui64ARB((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 x, ((uint64_t) khronos_uint64_t) GLuint64 y, ((uint64_t) khronos_uint64_t) GLuint64 z, ((uint64_t) khronos_uint64_t) GLuint64 w);
    /// ```
    public void ProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui64ARB");
        try { Handles.MH_glProgramUniform4ui64ARB.invokeExact(handles.PFN_glProgramUniform4ui64ARB, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64ARB", e); }
    }

    /// ```
    /// void glProgramUniform1ui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void ProgramUniform1ui64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui64vARB");
        try { Handles.MH_glProgramUniform1ui64vARB.invokeExact(handles.PFN_glProgramUniform1ui64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64vARB", e); }
    }

    /// ```
    /// void glProgramUniform2ui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void ProgramUniform2ui64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui64vARB");
        try { Handles.MH_glProgramUniform2ui64vARB.invokeExact(handles.PFN_glProgramUniform2ui64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64vARB", e); }
    }

    /// ```
    /// void glProgramUniform3ui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void ProgramUniform3ui64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui64vARB");
        try { Handles.MH_glProgramUniform3ui64vARB.invokeExact(handles.PFN_glProgramUniform3ui64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64vARB", e); }
    }

    /// ```
    /// void glProgramUniform4ui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void ProgramUniform4ui64vARB(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui64vARB");
        try { Handles.MH_glProgramUniform4ui64vARB.invokeExact(handles.PFN_glProgramUniform4ui64vARB, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64vARB", e); }
    }

}
