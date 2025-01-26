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

public final class GLARBVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindVertexArray = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsVertexArray = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindVertexArray;
        public final MemorySegment PFN_glDeleteVertexArrays;
        public final MemorySegment PFN_glGenVertexArrays;
        public final MemorySegment PFN_glIsVertexArray;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindVertexArray = func.invoke("glBindVertexArray");
            PFN_glDeleteVertexArrays = func.invoke("glDeleteVertexArrays");
            PFN_glGenVertexArrays = func.invoke("glGenVertexArrays");
            PFN_glIsVertexArray = func.invoke("glIsVertexArray");
        }
    }

    public GLARBVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindVertexArray(GLuint array);
    /// ```
    public void BindVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexArray)) throw new SymbolNotFoundError("Symbol not found: glBindVertexArray");
        try { Handles.MH_glBindVertexArray.invokeExact(handles.PFN_glBindVertexArray, array); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexArray", e); }
    }

    /// ```
    /// void glDeleteVertexArrays(GLsizei n, const GLuint* arrays);
    /// ```
    public void DeleteVertexArrays(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glDeleteVertexArrays");
        try { Handles.MH_glDeleteVertexArrays.invokeExact(handles.PFN_glDeleteVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexArrays", e); }
    }

    /// ```
    /// void glGenVertexArrays(GLsizei n, GLuint* arrays);
    /// ```
    public void GenVertexArrays(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glGenVertexArrays");
        try { Handles.MH_glGenVertexArrays.invokeExact(handles.PFN_glGenVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexArrays", e); }
    }

    /// ```
    /// GLboolean glIsVertexArray(GLuint array);
    /// ```
    public boolean IsVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexArray)) throw new SymbolNotFoundError("Symbol not found: glIsVertexArray");
        try { return (((byte) Handles.MH_glIsVertexArray.invokeExact(handles.PFN_glIsVertexArray, array)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexArray", e); }
    }

}
