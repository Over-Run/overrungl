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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSGIXListPriority {
    public static final int GL_LIST_PRIORITY_SGIX = 0x8182;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetListParameterfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetListParameterivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glListParameterfSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glListParameterfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glListParameteriSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glListParameterivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetListParameterfvSGIX;
        public final MemorySegment PFN_glGetListParameterivSGIX;
        public final MemorySegment PFN_glListParameterfSGIX;
        public final MemorySegment PFN_glListParameterfvSGIX;
        public final MemorySegment PFN_glListParameteriSGIX;
        public final MemorySegment PFN_glListParameterivSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetListParameterfvSGIX = func.invoke("glGetListParameterfvSGIX");
            PFN_glGetListParameterivSGIX = func.invoke("glGetListParameterivSGIX");
            PFN_glListParameterfSGIX = func.invoke("glListParameterfSGIX");
            PFN_glListParameterfvSGIX = func.invoke("glListParameterfvSGIX");
            PFN_glListParameteriSGIX = func.invoke("glListParameteriSGIX");
            PFN_glListParameterivSGIX = func.invoke("glListParameterivSGIX");
        }
    }

    public GLSGIXListPriority(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetListParameterfvSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetListParameterfvSGIX(int list, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetListParameterfvSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetListParameterfvSGIX");
        try { Handles.MH_glGetListParameterfvSGIX.invokeExact(handles.PFN_glGetListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetListParameterfvSGIX", e); }
    }

    /// ```
    /// void glGetListParameterivSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetListParameterivSGIX(int list, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetListParameterivSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetListParameterivSGIX");
        try { Handles.MH_glGetListParameterivSGIX.invokeExact(handles.PFN_glGetListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetListParameterivSGIX", e); }
    }

    /// ```
    /// void glListParameterfSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void ListParameterfSGIX(int list, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterfSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterfSGIX");
        try { Handles.MH_glListParameterfSGIX.invokeExact(handles.PFN_glListParameterfSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterfSGIX", e); }
    }

    /// ```
    /// void glListParameterfvSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ListParameterfvSGIX(int list, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterfvSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterfvSGIX");
        try { Handles.MH_glListParameterfvSGIX.invokeExact(handles.PFN_glListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterfvSGIX", e); }
    }

    /// ```
    /// void glListParameteriSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void ListParameteriSGIX(int list, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameteriSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameteriSGIX");
        try { Handles.MH_glListParameteriSGIX.invokeExact(handles.PFN_glListParameteriSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameteriSGIX", e); }
    }

    /// ```
    /// void glListParameterivSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ListParameterivSGIX(int list, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterivSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterivSGIX");
        try { Handles.MH_glListParameterivSGIX.invokeExact(handles.PFN_glListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterivSGIX", e); }
    }

}
