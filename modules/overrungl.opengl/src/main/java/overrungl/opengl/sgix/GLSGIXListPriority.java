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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXListPriority {
    public static final int GL_LIST_PRIORITY_SGIX = 0x8182;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetListParameterfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetListParameterivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glListParameterfSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glListParameterfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glListParameteriSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glListParameterivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetListParameterfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetListParameterfvSGIX);
        public static final MethodHandle MH_glGetListParameterivSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetListParameterivSGIX);
        public static final MethodHandle MH_glListParameterfSGIX = RuntimeHelper.downcall(Descriptors.FD_glListParameterfSGIX);
        public static final MethodHandle MH_glListParameterfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glListParameterfvSGIX);
        public static final MethodHandle MH_glListParameteriSGIX = RuntimeHelper.downcall(Descriptors.FD_glListParameteriSGIX);
        public static final MethodHandle MH_glListParameterivSGIX = RuntimeHelper.downcall(Descriptors.FD_glListParameterivSGIX);
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

    public void GetListParameterfvSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetListParameterfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetListParameterfvSGIX");
        try { Handles.MH_glGetListParameterfvSGIX.invokeExact(handles.PFN_glGetListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetListParameterfvSGIX", e); }
    }

    public void GetListParameterivSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetListParameterivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetListParameterivSGIX");
        try { Handles.MH_glGetListParameterivSGIX.invokeExact(handles.PFN_glGetListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetListParameterivSGIX", e); }
    }

    public void ListParameterfSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glListParameterfSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterfSGIX");
        try { Handles.MH_glListParameterfSGIX.invokeExact(handles.PFN_glListParameterfSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterfSGIX", e); }
    }

    public void ListParameterfvSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glListParameterfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterfvSGIX");
        try { Handles.MH_glListParameterfvSGIX.invokeExact(handles.PFN_glListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterfvSGIX", e); }
    }

    public void ListParameteriSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glListParameteriSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameteriSGIX");
        try { Handles.MH_glListParameteriSGIX.invokeExact(handles.PFN_glListParameteriSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameteriSGIX", e); }
    }

    public void ListParameterivSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glListParameterivSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterivSGIX");
        try { Handles.MH_glListParameterivSGIX.invokeExact(handles.PFN_glListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterivSGIX", e); }
    }

}
