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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBVertexAttrib64bit {
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_DOUBLE_VEC2 = 0x8FFC;
    public static final int GL_DOUBLE_VEC3 = 0x8FFD;
    public static final int GL_DOUBLE_VEC4 = 0x8FFE;
    public static final int GL_DOUBLE_MAT2 = 0x8F46;
    public static final int GL_DOUBLE_MAT3 = 0x8F47;
    public static final int GL_DOUBLE_MAT4 = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexAttribL1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribLPointer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribLdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glVertexAttribL1d,
            FD_glVertexAttribL2d,
            FD_glVertexAttribL3d,
            FD_glVertexAttribL4d,
            FD_glVertexAttribL1dv,
            FD_glVertexAttribL2dv,
            FD_glVertexAttribL3dv,
            FD_glVertexAttribL4dv,
            FD_glVertexAttribLPointer,
            FD_glGetVertexAttribLdv
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribL1d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1d);
        public static final MethodHandle MH_glVertexAttribL2d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2d);
        public static final MethodHandle MH_glVertexAttribL3d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3d);
        public static final MethodHandle MH_glVertexAttribL4d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4d);
        public static final MethodHandle MH_glVertexAttribL1dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1dv);
        public static final MethodHandle MH_glVertexAttribL2dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2dv);
        public static final MethodHandle MH_glVertexAttribL3dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3dv);
        public static final MethodHandle MH_glVertexAttribL4dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4dv);
        public static final MethodHandle MH_glVertexAttribLPointer = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribLPointer);
        public static final MethodHandle MH_glGetVertexAttribLdv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribLdv);
        public final MemorySegment PFN_glVertexAttribL1d;
        public final MemorySegment PFN_glVertexAttribL2d;
        public final MemorySegment PFN_glVertexAttribL3d;
        public final MemorySegment PFN_glVertexAttribL4d;
        public final MemorySegment PFN_glVertexAttribL1dv;
        public final MemorySegment PFN_glVertexAttribL2dv;
        public final MemorySegment PFN_glVertexAttribL3dv;
        public final MemorySegment PFN_glVertexAttribL4dv;
        public final MemorySegment PFN_glVertexAttribLPointer;
        public final MemorySegment PFN_glGetVertexAttribLdv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribL1d = func.invoke("glVertexAttribL1d");
            PFN_glVertexAttribL2d = func.invoke("glVertexAttribL2d");
            PFN_glVertexAttribL3d = func.invoke("glVertexAttribL3d");
            PFN_glVertexAttribL4d = func.invoke("glVertexAttribL4d");
            PFN_glVertexAttribL1dv = func.invoke("glVertexAttribL1dv");
            PFN_glVertexAttribL2dv = func.invoke("glVertexAttribL2dv");
            PFN_glVertexAttribL3dv = func.invoke("glVertexAttribL3dv");
            PFN_glVertexAttribL4dv = func.invoke("glVertexAttribL4dv");
            PFN_glVertexAttribLPointer = func.invoke("glVertexAttribLPointer");
            PFN_glGetVertexAttribLdv = func.invoke("glGetVertexAttribLdv");
        }
    }

    public GLARBVertexAttrib64bit(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexAttribL1d(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1d");
        try { Handles.MH_glVertexAttribL1d.invokeExact(handles.PFN_glVertexAttribL1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1d", e); }
    }

    public void VertexAttribL2d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2d");
        try { Handles.MH_glVertexAttribL2d.invokeExact(handles.PFN_glVertexAttribL2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2d", e); }
    }

    public void VertexAttribL3d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3d");
        try { Handles.MH_glVertexAttribL3d.invokeExact(handles.PFN_glVertexAttribL3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3d", e); }
    }

    public void VertexAttribL4d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4d");
        try { Handles.MH_glVertexAttribL4d.invokeExact(handles.PFN_glVertexAttribL4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4d", e); }
    }

    public void VertexAttribL1dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dv");
        try { Handles.MH_glVertexAttribL1dv.invokeExact(handles.PFN_glVertexAttribL1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1dv", e); }
    }

    public void VertexAttribL2dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dv");
        try { Handles.MH_glVertexAttribL2dv.invokeExact(handles.PFN_glVertexAttribL2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2dv", e); }
    }

    public void VertexAttribL3dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dv");
        try { Handles.MH_glVertexAttribL3dv.invokeExact(handles.PFN_glVertexAttribL3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3dv", e); }
    }

    public void VertexAttribL4dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dv");
        try { Handles.MH_glVertexAttribL4dv.invokeExact(handles.PFN_glVertexAttribL4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4dv", e); }
    }

    public void VertexAttribLPointer(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribLPointer)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLPointer");
        try { Handles.MH_glVertexAttribLPointer.invokeExact(handles.PFN_glVertexAttribLPointer, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLPointer", e); }
    }

    public void GetVertexAttribLdv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribLdv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLdv");
        try { Handles.MH_glGetVertexAttribLdv.invokeExact(handles.PFN_glGetVertexAttribLdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLdv", e); }
    }

}
