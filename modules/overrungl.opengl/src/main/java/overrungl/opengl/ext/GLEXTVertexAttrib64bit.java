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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTVertexAttrib64bit {
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_DOUBLE_VEC2_EXT = 0x8FFC;
    public static final int GL_DOUBLE_VEC3_EXT = 0x8FFD;
    public static final int GL_DOUBLE_VEC4_EXT = 0x8FFE;
    public static final int GL_DOUBLE_MAT2_EXT = 0x8F46;
    public static final int GL_DOUBLE_MAT3_EXT = 0x8F47;
    public static final int GL_DOUBLE_MAT4_EXT = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribL1dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL2dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL1dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribLPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttribL1dEXT;
        public final MemorySegment PFN_glVertexAttribL2dEXT;
        public final MemorySegment PFN_glVertexAttribL3dEXT;
        public final MemorySegment PFN_glVertexAttribL4dEXT;
        public final MemorySegment PFN_glVertexAttribL1dvEXT;
        public final MemorySegment PFN_glVertexAttribL2dvEXT;
        public final MemorySegment PFN_glVertexAttribL3dvEXT;
        public final MemorySegment PFN_glVertexAttribL4dvEXT;
        public final MemorySegment PFN_glVertexAttribLPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribLdvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribL1dEXT = func.invoke("glVertexAttribL1dEXT", "glVertexAttribL1d");
            PFN_glVertexAttribL2dEXT = func.invoke("glVertexAttribL2dEXT", "glVertexAttribL2d");
            PFN_glVertexAttribL3dEXT = func.invoke("glVertexAttribL3dEXT", "glVertexAttribL3d");
            PFN_glVertexAttribL4dEXT = func.invoke("glVertexAttribL4dEXT", "glVertexAttribL4d");
            PFN_glVertexAttribL1dvEXT = func.invoke("glVertexAttribL1dvEXT", "glVertexAttribL1dv");
            PFN_glVertexAttribL2dvEXT = func.invoke("glVertexAttribL2dvEXT", "glVertexAttribL2dv");
            PFN_glVertexAttribL3dvEXT = func.invoke("glVertexAttribL3dvEXT", "glVertexAttribL3dv");
            PFN_glVertexAttribL4dvEXT = func.invoke("glVertexAttribL4dvEXT", "glVertexAttribL4dv");
            PFN_glVertexAttribLPointerEXT = func.invoke("glVertexAttribLPointerEXT", "glVertexAttribLPointer");
            PFN_glGetVertexAttribLdvEXT = func.invoke("glGetVertexAttribLdvEXT", "glGetVertexAttribLdv");
        }
    }

    public GLEXTVertexAttrib64bit(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexAttribL1dEXT(GLuint index, GLdouble x);
    /// ```
    public void VertexAttribL1dEXT(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dEXT");
        try { Handles.MH_glVertexAttribL1dEXT.invokeExact(handles.PFN_glVertexAttribL1dEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dEXT", e); }
    }

    /// ```
    /// void glVertexAttribL2dEXT(GLuint index, GLdouble x, GLdouble y);
    /// ```
    public void VertexAttribL2dEXT(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dEXT");
        try { Handles.MH_glVertexAttribL2dEXT.invokeExact(handles.PFN_glVertexAttribL2dEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dEXT", e); }
    }

    /// ```
    /// void glVertexAttribL3dEXT(GLuint index, GLdouble x, GLdouble y, GLdouble z);
    /// ```
    public void VertexAttribL3dEXT(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dEXT");
        try { Handles.MH_glVertexAttribL3dEXT.invokeExact(handles.PFN_glVertexAttribL3dEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dEXT", e); }
    }

    /// ```
    /// void glVertexAttribL4dEXT(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w);
    /// ```
    public void VertexAttribL4dEXT(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dEXT");
        try { Handles.MH_glVertexAttribL4dEXT.invokeExact(handles.PFN_glVertexAttribL4dEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dEXT", e); }
    }

    /// ```
    /// void glVertexAttribL1dvEXT(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL1dvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dvEXT");
        try { Handles.MH_glVertexAttribL1dvEXT.invokeExact(handles.PFN_glVertexAttribL1dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dvEXT", e); }
    }

    /// ```
    /// void glVertexAttribL2dvEXT(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL2dvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dvEXT");
        try { Handles.MH_glVertexAttribL2dvEXT.invokeExact(handles.PFN_glVertexAttribL2dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dvEXT", e); }
    }

    /// ```
    /// void glVertexAttribL3dvEXT(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL3dvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dvEXT");
        try { Handles.MH_glVertexAttribL3dvEXT.invokeExact(handles.PFN_glVertexAttribL3dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dvEXT", e); }
    }

    /// ```
    /// void glVertexAttribL4dvEXT(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL4dvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dvEXT");
        try { Handles.MH_glVertexAttribL4dvEXT.invokeExact(handles.PFN_glVertexAttribL4dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dvEXT", e); }
    }

    /// ```
    /// void glVertexAttribLPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribLPointerEXT(int index, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLPointerEXT");
        try { Handles.MH_glVertexAttribLPointerEXT.invokeExact(handles.PFN_glVertexAttribLPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLPointerEXT", e); }
    }

    /// ```
    /// void glGetVertexAttribLdvEXT(GLuint index, GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribLdvEXT(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLdvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLdvEXT");
        try { Handles.MH_glGetVertexAttribLdvEXT.invokeExact(handles.PFN_glGetVertexAttribLdvEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLdvEXT", e); }
    }

}
