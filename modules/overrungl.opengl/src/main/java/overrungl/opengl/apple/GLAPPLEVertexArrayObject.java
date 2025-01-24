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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindVertexArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteVertexArraysAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenVertexArraysAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsVertexArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindVertexArrayAPPLE;
        public final MemorySegment PFN_glDeleteVertexArraysAPPLE;
        public final MemorySegment PFN_glGenVertexArraysAPPLE;
        public final MemorySegment PFN_glIsVertexArrayAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindVertexArrayAPPLE = func.invoke("glBindVertexArrayAPPLE");
            PFN_glDeleteVertexArraysAPPLE = func.invoke("glDeleteVertexArraysAPPLE", "glDeleteVertexArrays");
            PFN_glGenVertexArraysAPPLE = func.invoke("glGenVertexArraysAPPLE", "glGenVertexArrays");
            PFN_glIsVertexArrayAPPLE = func.invoke("glIsVertexArrayAPPLE", "glIsVertexArray");
        }
    }

    public GLAPPLEVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindVertexArrayAPPLE(unsigned int array);
    /// ```
    public void BindVertexArrayAPPLE(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glBindVertexArrayAPPLE");
        try { Handles.MH_glBindVertexArrayAPPLE.invokeExact(handles.PFN_glBindVertexArrayAPPLE, array); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexArrayAPPLE", e); }
    }

    /// ```
    /// void glDeleteVertexArraysAPPLE(int n, const GLuint* arrays);
    /// ```
    public void DeleteVertexArraysAPPLE(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexArraysAPPLE)) throw new SymbolNotFoundError("Symbol not found: glDeleteVertexArraysAPPLE");
        try { Handles.MH_glDeleteVertexArraysAPPLE.invokeExact(handles.PFN_glDeleteVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexArraysAPPLE", e); }
    }

    /// ```
    /// void glGenVertexArraysAPPLE(int n, GLuint* arrays);
    /// ```
    public void GenVertexArraysAPPLE(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexArraysAPPLE)) throw new SymbolNotFoundError("Symbol not found: glGenVertexArraysAPPLE");
        try { Handles.MH_glGenVertexArraysAPPLE.invokeExact(handles.PFN_glGenVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexArraysAPPLE", e); }
    }

    /// ```
    /// GLboolean glIsVertexArrayAPPLE(unsigned int array);
    /// ```
    public boolean IsVertexArrayAPPLE(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glIsVertexArrayAPPLE");
        try { return (((byte) Handles.MH_glIsVertexArrayAPPLE.invokeExact(handles.PFN_glIsVertexArrayAPPLE, array)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexArrayAPPLE", e); }
    }

}
