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
import overrungl.opengl.*;

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
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribL1d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL2d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL3d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL4d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL1dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribLPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLdv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glVertexAttribL1d((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttribL1d(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1d");
        try { Handles.MH_glVertexAttribL1d.invokeExact(handles.PFN_glVertexAttribL1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1d", e); }
    }

    /// ```
    /// void glVertexAttribL2d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttribL2d(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2d");
        try { Handles.MH_glVertexAttribL2d.invokeExact(handles.PFN_glVertexAttribL2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2d", e); }
    }

    /// ```
    /// void glVertexAttribL3d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttribL3d(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3d");
        try { Handles.MH_glVertexAttribL3d.invokeExact(handles.PFN_glVertexAttribL3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3d", e); }
    }

    /// ```
    /// void glVertexAttribL4d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttribL4d(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4d");
        try { Handles.MH_glVertexAttribL4d.invokeExact(handles.PFN_glVertexAttribL4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4d", e); }
    }

    /// ```
    /// void glVertexAttribL1dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL1dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1dv");
        try { Handles.MH_glVertexAttribL1dv.invokeExact(handles.PFN_glVertexAttribL1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dv", e); }
    }

    /// ```
    /// void glVertexAttribL2dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL2dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2dv");
        try { Handles.MH_glVertexAttribL2dv.invokeExact(handles.PFN_glVertexAttribL2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dv", e); }
    }

    /// ```
    /// void glVertexAttribL3dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL3dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3dv");
        try { Handles.MH_glVertexAttribL3dv.invokeExact(handles.PFN_glVertexAttribL3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dv", e); }
    }

    /// ```
    /// void glVertexAttribL4dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL4dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4dv");
        try { Handles.MH_glVertexAttribL4dv.invokeExact(handles.PFN_glVertexAttribL4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dv", e); }
    }

    /// ```
    /// void glVertexAttribLPointer((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribLPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLPointer)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribLPointer");
        try { Handles.MH_glVertexAttribLPointer.invokeExact(handles.PFN_glVertexAttribLPointer, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLPointer", e); }
    }

    /// ```
    /// void glGetVertexAttribLdv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribLdv(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLdv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribLdv");
        try { Handles.MH_glGetVertexAttribLdv.invokeExact(handles.PFN_glGetVertexAttribLdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLdv", e); }
    }

}
