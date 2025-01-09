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

    public GLSGIXListPriority(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetListParameterfvSGIX = func.invoke("glGetListParameterfvSGIX");
        PFN_glGetListParameterivSGIX = func.invoke("glGetListParameterivSGIX");
        PFN_glListParameterfSGIX = func.invoke("glListParameterfSGIX");
        PFN_glListParameterfvSGIX = func.invoke("glListParameterfvSGIX");
        PFN_glListParameteriSGIX = func.invoke("glListParameteriSGIX");
        PFN_glListParameterivSGIX = func.invoke("glListParameterivSGIX");
    }

    public void GetListParameterfvSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetListParameterfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetListParameterfvSGIX");
        try { MH_glGetListParameterfvSGIX.invokeExact(PFN_glGetListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetListParameterfvSGIX", e); }
    }

    public void GetListParameterivSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetListParameterivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetListParameterivSGIX");
        try { MH_glGetListParameterivSGIX.invokeExact(PFN_glGetListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetListParameterivSGIX", e); }
    }

    public void ListParameterfSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glListParameterfSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterfSGIX");
        try { MH_glListParameterfSGIX.invokeExact(PFN_glListParameterfSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterfSGIX", e); }
    }

    public void ListParameterfvSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glListParameterfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterfvSGIX");
        try { MH_glListParameterfvSGIX.invokeExact(PFN_glListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterfvSGIX", e); }
    }

    public void ListParameteriSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glListParameteriSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameteriSGIX");
        try { MH_glListParameteriSGIX.invokeExact(PFN_glListParameteriSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameteriSGIX", e); }
    }

    public void ListParameterivSGIX(@CType("GLuint") int list, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glListParameterivSGIX)) throw new SymbolNotFoundError("Symbol not found: glListParameterivSGIX");
        try { MH_glListParameterivSGIX.invokeExact(PFN_glListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glListParameterivSGIX", e); }
    }

}
