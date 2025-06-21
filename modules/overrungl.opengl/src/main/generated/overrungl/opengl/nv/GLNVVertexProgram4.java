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
import overrungl.opengl.*;

public final class GLNVVertexProgram4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV = 0x88FD;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribI1iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI2iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI1ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI2ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4ubvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4usvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribIPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttribI1iEXT;
        public final MemorySegment PFN_glVertexAttribI2iEXT;
        public final MemorySegment PFN_glVertexAttribI3iEXT;
        public final MemorySegment PFN_glVertexAttribI4iEXT;
        public final MemorySegment PFN_glVertexAttribI1uiEXT;
        public final MemorySegment PFN_glVertexAttribI2uiEXT;
        public final MemorySegment PFN_glVertexAttribI3uiEXT;
        public final MemorySegment PFN_glVertexAttribI4uiEXT;
        public final MemorySegment PFN_glVertexAttribI1ivEXT;
        public final MemorySegment PFN_glVertexAttribI2ivEXT;
        public final MemorySegment PFN_glVertexAttribI3ivEXT;
        public final MemorySegment PFN_glVertexAttribI4ivEXT;
        public final MemorySegment PFN_glVertexAttribI1uivEXT;
        public final MemorySegment PFN_glVertexAttribI2uivEXT;
        public final MemorySegment PFN_glVertexAttribI3uivEXT;
        public final MemorySegment PFN_glVertexAttribI4uivEXT;
        public final MemorySegment PFN_glVertexAttribI4bvEXT;
        public final MemorySegment PFN_glVertexAttribI4svEXT;
        public final MemorySegment PFN_glVertexAttribI4ubvEXT;
        public final MemorySegment PFN_glVertexAttribI4usvEXT;
        public final MemorySegment PFN_glVertexAttribIPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribIivEXT;
        public final MemorySegment PFN_glGetVertexAttribIuivEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribI1iEXT = func.invoke("glVertexAttribI1iEXT", "glVertexAttribI1i");
            PFN_glVertexAttribI2iEXT = func.invoke("glVertexAttribI2iEXT", "glVertexAttribI2i");
            PFN_glVertexAttribI3iEXT = func.invoke("glVertexAttribI3iEXT", "glVertexAttribI3i");
            PFN_glVertexAttribI4iEXT = func.invoke("glVertexAttribI4iEXT", "glVertexAttribI4i");
            PFN_glVertexAttribI1uiEXT = func.invoke("glVertexAttribI1uiEXT", "glVertexAttribI1ui");
            PFN_glVertexAttribI2uiEXT = func.invoke("glVertexAttribI2uiEXT", "glVertexAttribI2ui");
            PFN_glVertexAttribI3uiEXT = func.invoke("glVertexAttribI3uiEXT", "glVertexAttribI3ui");
            PFN_glVertexAttribI4uiEXT = func.invoke("glVertexAttribI4uiEXT", "glVertexAttribI4ui");
            PFN_glVertexAttribI1ivEXT = func.invoke("glVertexAttribI1ivEXT", "glVertexAttribI1iv");
            PFN_glVertexAttribI2ivEXT = func.invoke("glVertexAttribI2ivEXT", "glVertexAttribI2iv");
            PFN_glVertexAttribI3ivEXT = func.invoke("glVertexAttribI3ivEXT", "glVertexAttribI3iv");
            PFN_glVertexAttribI4ivEXT = func.invoke("glVertexAttribI4ivEXT", "glVertexAttribI4iv");
            PFN_glVertexAttribI1uivEXT = func.invoke("glVertexAttribI1uivEXT", "glVertexAttribI1uiv");
            PFN_glVertexAttribI2uivEXT = func.invoke("glVertexAttribI2uivEXT", "glVertexAttribI2uiv");
            PFN_glVertexAttribI3uivEXT = func.invoke("glVertexAttribI3uivEXT", "glVertexAttribI3uiv");
            PFN_glVertexAttribI4uivEXT = func.invoke("glVertexAttribI4uivEXT", "glVertexAttribI4uiv");
            PFN_glVertexAttribI4bvEXT = func.invoke("glVertexAttribI4bvEXT", "glVertexAttribI4bv");
            PFN_glVertexAttribI4svEXT = func.invoke("glVertexAttribI4svEXT", "glVertexAttribI4sv");
            PFN_glVertexAttribI4ubvEXT = func.invoke("glVertexAttribI4ubvEXT", "glVertexAttribI4ubv");
            PFN_glVertexAttribI4usvEXT = func.invoke("glVertexAttribI4usvEXT", "glVertexAttribI4usv");
            PFN_glVertexAttribIPointerEXT = func.invoke("glVertexAttribIPointerEXT", "glVertexAttribIPointer");
            PFN_glGetVertexAttribIivEXT = func.invoke("glGetVertexAttribIivEXT", "glGetVertexAttribIiv");
            PFN_glGetVertexAttribIuivEXT = func.invoke("glGetVertexAttribIuivEXT", "glGetVertexAttribIuiv");
        }
    }

    public GLNVVertexProgram4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexAttribI1iEXT((unsigned int) GLuint index, (int) GLint x);
    /// ```
    public void VertexAttribI1iEXT(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1iEXT");
        try { Handles.MH_glVertexAttribI1iEXT.invokeExact(handles.PFN_glVertexAttribI1iEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1iEXT", e); }
    }

    /// ```
    /// void glVertexAttribI2iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y);
    /// ```
    public void VertexAttribI2iEXT(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2iEXT");
        try { Handles.MH_glVertexAttribI2iEXT.invokeExact(handles.PFN_glVertexAttribI2iEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2iEXT", e); }
    }

    /// ```
    /// void glVertexAttribI3iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void VertexAttribI3iEXT(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3iEXT");
        try { Handles.MH_glVertexAttribI3iEXT.invokeExact(handles.PFN_glVertexAttribI3iEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3iEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void VertexAttribI4iEXT(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4iEXT");
        try { Handles.MH_glVertexAttribI4iEXT.invokeExact(handles.PFN_glVertexAttribI4iEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4iEXT", e); }
    }

    /// ```
    /// void glVertexAttribI1uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x);
    /// ```
    public void VertexAttribI1uiEXT(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1uiEXT");
        try { Handles.MH_glVertexAttribI1uiEXT.invokeExact(handles.PFN_glVertexAttribI1uiEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1uiEXT", e); }
    }

    /// ```
    /// void glVertexAttribI2uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y);
    /// ```
    public void VertexAttribI2uiEXT(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2uiEXT");
        try { Handles.MH_glVertexAttribI2uiEXT.invokeExact(handles.PFN_glVertexAttribI2uiEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2uiEXT", e); }
    }

    /// ```
    /// void glVertexAttribI3uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z);
    /// ```
    public void VertexAttribI3uiEXT(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3uiEXT");
        try { Handles.MH_glVertexAttribI3uiEXT.invokeExact(handles.PFN_glVertexAttribI3uiEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3uiEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z, (unsigned int) GLuint w);
    /// ```
    public void VertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4uiEXT");
        try { Handles.MH_glVertexAttribI4uiEXT.invokeExact(handles.PFN_glVertexAttribI4uiEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4uiEXT", e); }
    }

    /// ```
    /// void glVertexAttribI1ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI1ivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1ivEXT");
        try { Handles.MH_glVertexAttribI1ivEXT.invokeExact(handles.PFN_glVertexAttribI1ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1ivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI2ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI2ivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2ivEXT");
        try { Handles.MH_glVertexAttribI2ivEXT.invokeExact(handles.PFN_glVertexAttribI2ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2ivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI3ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI3ivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3ivEXT");
        try { Handles.MH_glVertexAttribI3ivEXT.invokeExact(handles.PFN_glVertexAttribI3ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3ivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI4ivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ivEXT");
        try { Handles.MH_glVertexAttribI4ivEXT.invokeExact(handles.PFN_glVertexAttribI4ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI1uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI1uivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1uivEXT");
        try { Handles.MH_glVertexAttribI1uivEXT.invokeExact(handles.PFN_glVertexAttribI1uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1uivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI2uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI2uivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2uivEXT");
        try { Handles.MH_glVertexAttribI2uivEXT.invokeExact(handles.PFN_glVertexAttribI2uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2uivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI3uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI3uivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3uivEXT");
        try { Handles.MH_glVertexAttribI3uivEXT.invokeExact(handles.PFN_glVertexAttribI3uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3uivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI4uivEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4uivEXT");
        try { Handles.MH_glVertexAttribI4uivEXT.invokeExact(handles.PFN_glVertexAttribI4uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4uivEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4bvEXT((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttribI4bvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4bvEXT");
        try { Handles.MH_glVertexAttribI4bvEXT.invokeExact(handles.PFN_glVertexAttribI4bvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4bvEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4svEXT((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttribI4svEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4svEXT");
        try { Handles.MH_glVertexAttribI4svEXT.invokeExact(handles.PFN_glVertexAttribI4svEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4svEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4ubvEXT((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttribI4ubvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ubvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ubvEXT");
        try { Handles.MH_glVertexAttribI4ubvEXT.invokeExact(handles.PFN_glVertexAttribI4ubvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ubvEXT", e); }
    }

    /// ```
    /// void glVertexAttribI4usvEXT((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttribI4usvEXT(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4usvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4usvEXT");
        try { Handles.MH_glVertexAttribI4usvEXT.invokeExact(handles.PFN_glVertexAttribI4usvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4usvEXT", e); }
    }

    /// ```
    /// void glVertexAttribIPointerEXT((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribIPointerEXT(int index, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIPointerEXT");
        try { Handles.MH_glVertexAttribIPointerEXT.invokeExact(handles.PFN_glVertexAttribIPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIPointerEXT", e); }
    }

    /// ```
    /// void glGetVertexAttribIivEXT((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribIivEXT(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIivEXT");
        try { Handles.MH_glGetVertexAttribIivEXT.invokeExact(handles.PFN_glGetVertexAttribIivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIivEXT", e); }
    }

    /// ```
    /// void glGetVertexAttribIuivEXT((unsigned int) GLuint index, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetVertexAttribIuivEXT(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIuivEXT");
        try { Handles.MH_glGetVertexAttribIuivEXT.invokeExact(handles.PFN_glGetVertexAttribIuivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIuivEXT", e); }
    }

}
