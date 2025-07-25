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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAPPLEFence {
    public static final int GL_DRAW_PIXELS_APPLE = 0x8A0A;
    public static final int GL_FENCE_APPLE = 0x8A0B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenFencesAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteFencesAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSetFenceAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsFenceAPPLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTestFenceAPPLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFinishFenceAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTestObjectAPPLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFinishObjectAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGenFencesAPPLE;
        public final MemorySegment PFN_glDeleteFencesAPPLE;
        public final MemorySegment PFN_glSetFenceAPPLE;
        public final MemorySegment PFN_glIsFenceAPPLE;
        public final MemorySegment PFN_glTestFenceAPPLE;
        public final MemorySegment PFN_glFinishFenceAPPLE;
        public final MemorySegment PFN_glTestObjectAPPLE;
        public final MemorySegment PFN_glFinishObjectAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenFencesAPPLE = func.invoke("glGenFencesAPPLE");
            PFN_glDeleteFencesAPPLE = func.invoke("glDeleteFencesAPPLE");
            PFN_glSetFenceAPPLE = func.invoke("glSetFenceAPPLE");
            PFN_glIsFenceAPPLE = func.invoke("glIsFenceAPPLE");
            PFN_glTestFenceAPPLE = func.invoke("glTestFenceAPPLE");
            PFN_glFinishFenceAPPLE = func.invoke("glFinishFenceAPPLE");
            PFN_glTestObjectAPPLE = func.invoke("glTestObjectAPPLE");
            PFN_glFinishObjectAPPLE = func.invoke("glFinishObjectAPPLE");
        }
    }

    public GLAPPLEFence(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenFencesAPPLE((int) GLsizei n, GLuint* fences);
    /// ```
    public void GenFencesAPPLE(int n, MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFencesAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGenFencesAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFencesAPPLE", n, fences); }
        Handles.MH_glGenFencesAPPLE.invokeExact(handles.PFN_glGenFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in GenFencesAPPLE", e); }
    }

    /// ```
    /// void glDeleteFencesAPPLE((int) GLsizei n, const GLuint* fences);
    /// ```
    public void DeleteFencesAPPLE(int n, MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFencesAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFencesAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFencesAPPLE", n, fences); }
        Handles.MH_glDeleteFencesAPPLE.invokeExact(handles.PFN_glDeleteFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFencesAPPLE", e); }
    }

    /// ```
    /// void glSetFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public void SetFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glSetFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetFenceAPPLE", fence); }
        Handles.MH_glSetFenceAPPLE.invokeExact(handles.PFN_glSetFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in SetFenceAPPLE", e); }
    }

    /// ```
    /// GLboolean glIsFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public boolean IsFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glIsFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsFenceAPPLE", fence); }
        return (((byte) Handles.MH_glIsFenceAPPLE.invokeExact(handles.PFN_glIsFenceAPPLE, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFenceAPPLE", e); }
    }

    /// ```
    /// GLboolean glTestFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public boolean TestFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glTestFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTestFenceAPPLE", fence); }
        return (((byte) Handles.MH_glTestFenceAPPLE.invokeExact(handles.PFN_glTestFenceAPPLE, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestFenceAPPLE", e); }
    }

    /// ```
    /// void glFinishFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public void FinishFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glFinishFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishFenceAPPLE", fence); }
        Handles.MH_glFinishFenceAPPLE.invokeExact(handles.PFN_glFinishFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in FinishFenceAPPLE", e); }
    }

    /// ```
    /// GLboolean glTestObjectAPPLE((unsigned int) GLenum object, (unsigned int) GLuint name);
    /// ```
    public boolean TestObjectAPPLE(int object, int name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestObjectAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glTestObjectAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTestObjectAPPLE", object, name); }
        return (((byte) Handles.MH_glTestObjectAPPLE.invokeExact(handles.PFN_glTestObjectAPPLE, object, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestObjectAPPLE", e); }
    }

    /// ```
    /// void glFinishObjectAPPLE((unsigned int) GLenum object, (int) GLint name);
    /// ```
    public void FinishObjectAPPLE(int object, int name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishObjectAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glFinishObjectAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishObjectAPPLE", object, name); }
        Handles.MH_glFinishObjectAPPLE.invokeExact(handles.PFN_glFinishObjectAPPLE, object, name); }
        catch (Throwable e) { throw new RuntimeException("error in FinishObjectAPPLE", e); }
    }

}
