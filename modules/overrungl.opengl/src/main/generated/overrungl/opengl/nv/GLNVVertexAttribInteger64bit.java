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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vertex_attrib_integer_64bit`
public final class GLNVVertexAttribInteger64bit {
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribL1i64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL2i64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL3i64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL4i64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1i64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL2i64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL3i64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL4i64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL1ui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL2ui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL3ui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL4ui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1ui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL2ui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL3ui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL4ui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLi64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribLFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glVertexAttribL1i64NV;
        public final MemorySegment PFN_glVertexAttribL2i64NV;
        public final MemorySegment PFN_glVertexAttribL3i64NV;
        public final MemorySegment PFN_glVertexAttribL4i64NV;
        public final MemorySegment PFN_glVertexAttribL1i64vNV;
        public final MemorySegment PFN_glVertexAttribL2i64vNV;
        public final MemorySegment PFN_glVertexAttribL3i64vNV;
        public final MemorySegment PFN_glVertexAttribL4i64vNV;
        public final MemorySegment PFN_glVertexAttribL1ui64NV;
        public final MemorySegment PFN_glVertexAttribL2ui64NV;
        public final MemorySegment PFN_glVertexAttribL3ui64NV;
        public final MemorySegment PFN_glVertexAttribL4ui64NV;
        public final MemorySegment PFN_glVertexAttribL1ui64vNV;
        public final MemorySegment PFN_glVertexAttribL2ui64vNV;
        public final MemorySegment PFN_glVertexAttribL3ui64vNV;
        public final MemorySegment PFN_glVertexAttribL4ui64vNV;
        public final MemorySegment PFN_glGetVertexAttribLi64vNV;
        public final MemorySegment PFN_glGetVertexAttribLui64vNV;
        public final MemorySegment PFN_glVertexAttribLFormatNV;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribL1i64NV = func.invoke("glVertexAttribL1i64NV");
            PFN_glVertexAttribL2i64NV = func.invoke("glVertexAttribL2i64NV");
            PFN_glVertexAttribL3i64NV = func.invoke("glVertexAttribL3i64NV");
            PFN_glVertexAttribL4i64NV = func.invoke("glVertexAttribL4i64NV");
            PFN_glVertexAttribL1i64vNV = func.invoke("glVertexAttribL1i64vNV");
            PFN_glVertexAttribL2i64vNV = func.invoke("glVertexAttribL2i64vNV");
            PFN_glVertexAttribL3i64vNV = func.invoke("glVertexAttribL3i64vNV");
            PFN_glVertexAttribL4i64vNV = func.invoke("glVertexAttribL4i64vNV");
            PFN_glVertexAttribL1ui64NV = func.invoke("glVertexAttribL1ui64NV");
            PFN_glVertexAttribL2ui64NV = func.invoke("glVertexAttribL2ui64NV");
            PFN_glVertexAttribL3ui64NV = func.invoke("glVertexAttribL3ui64NV");
            PFN_glVertexAttribL4ui64NV = func.invoke("glVertexAttribL4ui64NV");
            PFN_glVertexAttribL1ui64vNV = func.invoke("glVertexAttribL1ui64vNV");
            PFN_glVertexAttribL2ui64vNV = func.invoke("glVertexAttribL2ui64vNV");
            PFN_glVertexAttribL3ui64vNV = func.invoke("glVertexAttribL3ui64vNV");
            PFN_glVertexAttribL4ui64vNV = func.invoke("glVertexAttribL4ui64vNV");
            PFN_glGetVertexAttribLi64vNV = func.invoke("glGetVertexAttribLi64vNV");
            PFN_glGetVertexAttribLui64vNV = func.invoke("glGetVertexAttribLui64vNV");
            PFN_glVertexAttribLFormatNV = func.invoke("glVertexAttribLFormatNV");
        }
    }

    public GLNVVertexAttribInteger64bit(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribL1i64NV`.
    /// ```
    /// void glVertexAttribL1i64NV((unsigned int) GLuint index, ((int64_t) khronos_int64_t) GLint64EXT x);
    /// ```
    public void VertexAttribL1i64NV(int index, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1i64NV", index, x); }
        Handles.MH_glVertexAttribL1i64NV.invokeExact(handles.PFN_glVertexAttribL1i64NV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1i64NV", e); }
    }

    /// Invokes `glVertexAttribL2i64NV`.
    /// ```
    /// void glVertexAttribL2i64NV((unsigned int) GLuint index, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y);
    /// ```
    public void VertexAttribL2i64NV(int index, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2i64NV", index, x, y); }
        Handles.MH_glVertexAttribL2i64NV.invokeExact(handles.PFN_glVertexAttribL2i64NV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2i64NV", e); }
    }

    /// Invokes `glVertexAttribL3i64NV`.
    /// ```
    /// void glVertexAttribL3i64NV((unsigned int) GLuint index, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z);
    /// ```
    public void VertexAttribL3i64NV(int index, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3i64NV", index, x, y, z); }
        Handles.MH_glVertexAttribL3i64NV.invokeExact(handles.PFN_glVertexAttribL3i64NV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3i64NV", e); }
    }

    /// Invokes `glVertexAttribL4i64NV`.
    /// ```
    /// void glVertexAttribL4i64NV((unsigned int) GLuint index, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z, ((int64_t) khronos_int64_t) GLint64EXT w);
    /// ```
    public void VertexAttribL4i64NV(int index, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4i64NV", index, x, y, z, w); }
        Handles.MH_glVertexAttribL4i64NV.invokeExact(handles.PFN_glVertexAttribL4i64NV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4i64NV", e); }
    }

    /// Invokes `glVertexAttribL1i64vNV`.
    /// ```
    /// void glVertexAttribL1i64vNV((unsigned int) GLuint index, const GLint64EXT* v);
    /// ```
    public void VertexAttribL1i64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1i64vNV", index, v); }
        Handles.MH_glVertexAttribL1i64vNV.invokeExact(handles.PFN_glVertexAttribL1i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1i64vNV", e); }
    }

    /// Invokes `glVertexAttribL2i64vNV`.
    /// ```
    /// void glVertexAttribL2i64vNV((unsigned int) GLuint index, const GLint64EXT* v);
    /// ```
    public void VertexAttribL2i64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2i64vNV", index, v); }
        Handles.MH_glVertexAttribL2i64vNV.invokeExact(handles.PFN_glVertexAttribL2i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2i64vNV", e); }
    }

    /// Invokes `glVertexAttribL3i64vNV`.
    /// ```
    /// void glVertexAttribL3i64vNV((unsigned int) GLuint index, const GLint64EXT* v);
    /// ```
    public void VertexAttribL3i64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3i64vNV", index, v); }
        Handles.MH_glVertexAttribL3i64vNV.invokeExact(handles.PFN_glVertexAttribL3i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3i64vNV", e); }
    }

    /// Invokes `glVertexAttribL4i64vNV`.
    /// ```
    /// void glVertexAttribL4i64vNV((unsigned int) GLuint index, const GLint64EXT* v);
    /// ```
    public void VertexAttribL4i64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4i64vNV", index, v); }
        Handles.MH_glVertexAttribL4i64vNV.invokeExact(handles.PFN_glVertexAttribL4i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4i64vNV", e); }
    }

    /// Invokes `glVertexAttribL1ui64NV`.
    /// ```
    /// void glVertexAttribL1ui64NV((unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT x);
    /// ```
    public void VertexAttribL1ui64NV(int index, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1ui64NV", index, x); }
        Handles.MH_glVertexAttribL1ui64NV.invokeExact(handles.PFN_glVertexAttribL1ui64NV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64NV", e); }
    }

    /// Invokes `glVertexAttribL2ui64NV`.
    /// ```
    /// void glVertexAttribL2ui64NV((unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y);
    /// ```
    public void VertexAttribL2ui64NV(int index, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2ui64NV", index, x, y); }
        Handles.MH_glVertexAttribL2ui64NV.invokeExact(handles.PFN_glVertexAttribL2ui64NV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2ui64NV", e); }
    }

    /// Invokes `glVertexAttribL3ui64NV`.
    /// ```
    /// void glVertexAttribL3ui64NV((unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z);
    /// ```
    public void VertexAttribL3ui64NV(int index, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3ui64NV", index, x, y, z); }
        Handles.MH_glVertexAttribL3ui64NV.invokeExact(handles.PFN_glVertexAttribL3ui64NV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3ui64NV", e); }
    }

    /// Invokes `glVertexAttribL4ui64NV`.
    /// ```
    /// void glVertexAttribL4ui64NV((unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z, ((uint64_t) khronos_uint64_t) GLuint64EXT w);
    /// ```
    public void VertexAttribL4ui64NV(int index, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4ui64NV", index, x, y, z, w); }
        Handles.MH_glVertexAttribL4ui64NV.invokeExact(handles.PFN_glVertexAttribL4ui64NV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4ui64NV", e); }
    }

    /// Invokes `glVertexAttribL1ui64vNV`.
    /// ```
    /// void glVertexAttribL1ui64vNV((unsigned int) GLuint index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL1ui64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1ui64vNV", index, v); }
        Handles.MH_glVertexAttribL1ui64vNV.invokeExact(handles.PFN_glVertexAttribL1ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64vNV", e); }
    }

    /// Invokes `glVertexAttribL2ui64vNV`.
    /// ```
    /// void glVertexAttribL2ui64vNV((unsigned int) GLuint index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL2ui64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2ui64vNV", index, v); }
        Handles.MH_glVertexAttribL2ui64vNV.invokeExact(handles.PFN_glVertexAttribL2ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2ui64vNV", e); }
    }

    /// Invokes `glVertexAttribL3ui64vNV`.
    /// ```
    /// void glVertexAttribL3ui64vNV((unsigned int) GLuint index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL3ui64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3ui64vNV", index, v); }
        Handles.MH_glVertexAttribL3ui64vNV.invokeExact(handles.PFN_glVertexAttribL3ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3ui64vNV", e); }
    }

    /// Invokes `glVertexAttribL4ui64vNV`.
    /// ```
    /// void glVertexAttribL4ui64vNV((unsigned int) GLuint index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL4ui64vNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4ui64vNV", index, v); }
        Handles.MH_glVertexAttribL4ui64vNV.invokeExact(handles.PFN_glVertexAttribL4ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4ui64vNV", e); }
    }

    /// Invokes `glGetVertexAttribLi64vNV`.
    /// ```
    /// void glGetVertexAttribLi64vNV((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint64EXT* params);
    /// ```
    public void GetVertexAttribLi64vNV(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLi64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribLi64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribLi64vNV", index, pname, params); }
        Handles.MH_glGetVertexAttribLi64vNV.invokeExact(handles.PFN_glGetVertexAttribLi64vNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLi64vNV", e); }
    }

    /// Invokes `glGetVertexAttribLui64vNV`.
    /// ```
    /// void glGetVertexAttribLui64vNV((unsigned int) GLuint index, (unsigned int) GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetVertexAttribLui64vNV(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribLui64vNV", index, pname, params); }
        Handles.MH_glGetVertexAttribLui64vNV.invokeExact(handles.PFN_glGetVertexAttribLui64vNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLui64vNV", e); }
    }

    /// Invokes `glVertexAttribLFormatNV`.
    /// ```
    /// void glVertexAttribLFormatNV((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void VertexAttribLFormatNV(int index, int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribLFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribLFormatNV", index, size, type, stride); }
        Handles.MH_glVertexAttribLFormatNV.invokeExact(handles.PFN_glVertexAttribLFormatNV, index, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLFormatNV", e); }
    }

}
