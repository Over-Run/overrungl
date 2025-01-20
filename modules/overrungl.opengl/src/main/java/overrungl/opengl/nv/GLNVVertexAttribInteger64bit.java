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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVVertexAttribInteger64bit {
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexAttribL1i64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL2i64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL3i64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL4i64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL1i64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL2i64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL3i64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL4i64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL1ui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL2ui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL3ui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL4ui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL1ui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL2ui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL3ui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL4ui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribLi64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribLui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribLFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribL1i64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1i64NV);
        public static final MethodHandle MH_glVertexAttribL2i64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2i64NV);
        public static final MethodHandle MH_glVertexAttribL3i64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3i64NV);
        public static final MethodHandle MH_glVertexAttribL4i64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4i64NV);
        public static final MethodHandle MH_glVertexAttribL1i64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1i64vNV);
        public static final MethodHandle MH_glVertexAttribL2i64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2i64vNV);
        public static final MethodHandle MH_glVertexAttribL3i64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3i64vNV);
        public static final MethodHandle MH_glVertexAttribL4i64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4i64vNV);
        public static final MethodHandle MH_glVertexAttribL1ui64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1ui64NV);
        public static final MethodHandle MH_glVertexAttribL2ui64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2ui64NV);
        public static final MethodHandle MH_glVertexAttribL3ui64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3ui64NV);
        public static final MethodHandle MH_glVertexAttribL4ui64NV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4ui64NV);
        public static final MethodHandle MH_glVertexAttribL1ui64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1ui64vNV);
        public static final MethodHandle MH_glVertexAttribL2ui64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2ui64vNV);
        public static final MethodHandle MH_glVertexAttribL3ui64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3ui64vNV);
        public static final MethodHandle MH_glVertexAttribL4ui64vNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4ui64vNV);
        public static final MethodHandle MH_glGetVertexAttribLi64vNV = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribLi64vNV);
        public static final MethodHandle MH_glGetVertexAttribLui64vNV = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribLui64vNV);
        public static final MethodHandle MH_glVertexAttribLFormatNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribLFormatNV);
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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

    public GLNVVertexAttribInteger64bit(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexAttribL1i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1i64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1i64NV");
        try { Handles.MH_glVertexAttribL1i64NV.invokeExact(handles.PFN_glVertexAttribL1i64NV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1i64NV", e); }
    }

    public void VertexAttribL2i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2i64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2i64NV");
        try { Handles.MH_glVertexAttribL2i64NV.invokeExact(handles.PFN_glVertexAttribL2i64NV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2i64NV", e); }
    }

    public void VertexAttribL3i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3i64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3i64NV");
        try { Handles.MH_glVertexAttribL3i64NV.invokeExact(handles.PFN_glVertexAttribL3i64NV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3i64NV", e); }
    }

    public void VertexAttribL4i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z, @CType("GLint64EXT") long w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4i64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4i64NV");
        try { Handles.MH_glVertexAttribL4i64NV.invokeExact(handles.PFN_glVertexAttribL4i64NV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4i64NV", e); }
    }

    public void VertexAttribL1i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1i64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1i64vNV");
        try { Handles.MH_glVertexAttribL1i64vNV.invokeExact(handles.PFN_glVertexAttribL1i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1i64vNV", e); }
    }

    public void VertexAttribL2i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2i64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2i64vNV");
        try { Handles.MH_glVertexAttribL2i64vNV.invokeExact(handles.PFN_glVertexAttribL2i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2i64vNV", e); }
    }

    public void VertexAttribL3i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3i64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3i64vNV");
        try { Handles.MH_glVertexAttribL3i64vNV.invokeExact(handles.PFN_glVertexAttribL3i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3i64vNV", e); }
    }

    public void VertexAttribL4i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4i64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4i64vNV");
        try { Handles.MH_glVertexAttribL4i64vNV.invokeExact(handles.PFN_glVertexAttribL4i64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4i64vNV", e); }
    }

    public void VertexAttribL1ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1ui64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64NV");
        try { Handles.MH_glVertexAttribL1ui64NV.invokeExact(handles.PFN_glVertexAttribL1ui64NV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64NV", e); }
    }

    public void VertexAttribL2ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2ui64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2ui64NV");
        try { Handles.MH_glVertexAttribL2ui64NV.invokeExact(handles.PFN_glVertexAttribL2ui64NV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2ui64NV", e); }
    }

    public void VertexAttribL3ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3ui64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3ui64NV");
        try { Handles.MH_glVertexAttribL3ui64NV.invokeExact(handles.PFN_glVertexAttribL3ui64NV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3ui64NV", e); }
    }

    public void VertexAttribL4ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z, @CType("GLuint64EXT") long w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4ui64NV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4ui64NV");
        try { Handles.MH_glVertexAttribL4ui64NV.invokeExact(handles.PFN_glVertexAttribL4ui64NV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4ui64NV", e); }
    }

    public void VertexAttribL1ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vNV");
        try { Handles.MH_glVertexAttribL1ui64vNV.invokeExact(handles.PFN_glVertexAttribL1ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64vNV", e); }
    }

    public void VertexAttribL2ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2ui64vNV");
        try { Handles.MH_glVertexAttribL2ui64vNV.invokeExact(handles.PFN_glVertexAttribL2ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2ui64vNV", e); }
    }

    public void VertexAttribL3ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3ui64vNV");
        try { Handles.MH_glVertexAttribL3ui64vNV.invokeExact(handles.PFN_glVertexAttribL3ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3ui64vNV", e); }
    }

    public void VertexAttribL4ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4ui64vNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4ui64vNV");
        try { Handles.MH_glVertexAttribL4ui64vNV.invokeExact(handles.PFN_glVertexAttribL4ui64vNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4ui64vNV", e); }
    }

    public void GetVertexAttribLi64vNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64EXT *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribLi64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLi64vNV");
        try { Handles.MH_glGetVertexAttribLi64vNV.invokeExact(handles.PFN_glGetVertexAttribLi64vNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLi64vNV", e); }
    }

    public void GetVertexAttribLui64vNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint64EXT *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribLui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vNV");
        try { Handles.MH_glGetVertexAttribLui64vNV.invokeExact(handles.PFN_glGetVertexAttribLui64vNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLui64vNV", e); }
    }

    public void VertexAttribLFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribLFormatNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLFormatNV");
        try { Handles.MH_glVertexAttribLFormatNV.invokeExact(handles.PFN_glVertexAttribLFormatNV, index, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLFormatNV", e); }
    }

}
