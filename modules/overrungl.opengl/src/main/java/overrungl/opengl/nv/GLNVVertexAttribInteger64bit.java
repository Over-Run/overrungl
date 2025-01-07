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
    public static final MethodHandle MH_glVertexAttribL1i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL1i64NV;
    public static final MethodHandle MH_glVertexAttribL2i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL2i64NV;
    public static final MethodHandle MH_glVertexAttribL3i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL3i64NV;
    public static final MethodHandle MH_glVertexAttribL4i64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL4i64NV;
    public static final MethodHandle MH_glVertexAttribL1i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL1i64vNV;
    public static final MethodHandle MH_glVertexAttribL2i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL2i64vNV;
    public static final MethodHandle MH_glVertexAttribL3i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL3i64vNV;
    public static final MethodHandle MH_glVertexAttribL4i64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL4i64vNV;
    public static final MethodHandle MH_glVertexAttribL1ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL1ui64NV;
    public static final MethodHandle MH_glVertexAttribL2ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL2ui64NV;
    public static final MethodHandle MH_glVertexAttribL3ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL3ui64NV;
    public static final MethodHandle MH_glVertexAttribL4ui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL4ui64NV;
    public static final MethodHandle MH_glVertexAttribL1ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL1ui64vNV;
    public static final MethodHandle MH_glVertexAttribL2ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL2ui64vNV;
    public static final MethodHandle MH_glVertexAttribL3ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL3ui64vNV;
    public static final MethodHandle MH_glVertexAttribL4ui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL4ui64vNV;
    public static final MethodHandle MH_glGetVertexAttribLi64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribLi64vNV;
    public static final MethodHandle MH_glGetVertexAttribLui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribLui64vNV;
    public static final MethodHandle MH_glVertexAttribLFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribLFormatNV;

    public GLNVVertexAttribInteger64bit(overrungl.opengl.GLLoadFunc func) {
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

    public void VertexAttribL1i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1i64NV)) { try {
            MH_glVertexAttribL1i64NV.invokeExact(PFN_glVertexAttribL1i64NV, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1i64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1i64NV"); }
    }

    public void VertexAttribL2i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2i64NV)) { try {
            MH_glVertexAttribL2i64NV.invokeExact(PFN_glVertexAttribL2i64NV, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2i64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2i64NV"); }
    }

    public void VertexAttribL3i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3i64NV)) { try {
            MH_glVertexAttribL3i64NV.invokeExact(PFN_glVertexAttribL3i64NV, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3i64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3i64NV"); }
    }

    public void VertexAttribL4i64NV(@CType("GLuint") int index, @CType("GLint64EXT") long x, @CType("GLint64EXT") long y, @CType("GLint64EXT") long z, @CType("GLint64EXT") long w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4i64NV)) { try {
            MH_glVertexAttribL4i64NV.invokeExact(PFN_glVertexAttribL4i64NV, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4i64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4i64NV"); }
    }

    public void VertexAttribL1i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1i64vNV)) { try {
            MH_glVertexAttribL1i64vNV.invokeExact(PFN_glVertexAttribL1i64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1i64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1i64vNV"); }
    }

    public void VertexAttribL2i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2i64vNV)) { try {
            MH_glVertexAttribL2i64vNV.invokeExact(PFN_glVertexAttribL2i64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2i64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2i64vNV"); }
    }

    public void VertexAttribL3i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3i64vNV)) { try {
            MH_glVertexAttribL3i64vNV.invokeExact(PFN_glVertexAttribL3i64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3i64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3i64vNV"); }
    }

    public void VertexAttribL4i64vNV(@CType("GLuint") int index, @CType("const GLint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4i64vNV)) { try {
            MH_glVertexAttribL4i64vNV.invokeExact(PFN_glVertexAttribL4i64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4i64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4i64vNV"); }
    }

    public void VertexAttribL1ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64NV)) { try {
            MH_glVertexAttribL1ui64NV.invokeExact(PFN_glVertexAttribL1ui64NV, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64NV"); }
    }

    public void VertexAttribL2ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2ui64NV)) { try {
            MH_glVertexAttribL2ui64NV.invokeExact(PFN_glVertexAttribL2ui64NV, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2ui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2ui64NV"); }
    }

    public void VertexAttribL3ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3ui64NV)) { try {
            MH_glVertexAttribL3ui64NV.invokeExact(PFN_glVertexAttribL3ui64NV, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3ui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3ui64NV"); }
    }

    public void VertexAttribL4ui64NV(@CType("GLuint") int index, @CType("GLuint64EXT") long x, @CType("GLuint64EXT") long y, @CType("GLuint64EXT") long z, @CType("GLuint64EXT") long w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4ui64NV)) { try {
            MH_glVertexAttribL4ui64NV.invokeExact(PFN_glVertexAttribL4ui64NV, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4ui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4ui64NV"); }
    }

    public void VertexAttribL1ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64vNV)) { try {
            MH_glVertexAttribL1ui64vNV.invokeExact(PFN_glVertexAttribL1ui64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vNV"); }
    }

    public void VertexAttribL2ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2ui64vNV)) { try {
            MH_glVertexAttribL2ui64vNV.invokeExact(PFN_glVertexAttribL2ui64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2ui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2ui64vNV"); }
    }

    public void VertexAttribL3ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3ui64vNV)) { try {
            MH_glVertexAttribL3ui64vNV.invokeExact(PFN_glVertexAttribL3ui64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3ui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3ui64vNV"); }
    }

    public void VertexAttribL4ui64vNV(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4ui64vNV)) { try {
            MH_glVertexAttribL4ui64vNV.invokeExact(PFN_glVertexAttribL4ui64vNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4ui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4ui64vNV"); }
    }

    public void GetVertexAttribLi64vNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribLi64vNV)) { try {
            MH_glGetVertexAttribLi64vNV.invokeExact(PFN_glGetVertexAttribLi64vNV, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLi64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLi64vNV"); }
    }

    public void GetVertexAttribLui64vNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribLui64vNV)) { try {
            MH_glGetVertexAttribLui64vNV.invokeExact(PFN_glGetVertexAttribLui64vNV, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vNV"); }
    }

    public void VertexAttribLFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribLFormatNV)) { try {
            MH_glVertexAttribLFormatNV.invokeExact(PFN_glVertexAttribLFormatNV, index, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribLFormatNV"); }
    }

}
