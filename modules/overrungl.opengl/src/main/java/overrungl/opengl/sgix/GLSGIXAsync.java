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

public final class GLSGIXAsync {
    public static final int GL_ASYNC_MARKER_SGIX = 0x8329;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAsyncMarkerSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFinishAsyncSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPollAsyncSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenAsyncMarkersSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteAsyncMarkersSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsAsyncMarkerSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glAsyncMarkerSGIX;
        public final MemorySegment PFN_glFinishAsyncSGIX;
        public final MemorySegment PFN_glPollAsyncSGIX;
        public final MemorySegment PFN_glGenAsyncMarkersSGIX;
        public final MemorySegment PFN_glDeleteAsyncMarkersSGIX;
        public final MemorySegment PFN_glIsAsyncMarkerSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glAsyncMarkerSGIX = func.invoke("glAsyncMarkerSGIX");
            PFN_glFinishAsyncSGIX = func.invoke("glFinishAsyncSGIX");
            PFN_glPollAsyncSGIX = func.invoke("glPollAsyncSGIX");
            PFN_glGenAsyncMarkersSGIX = func.invoke("glGenAsyncMarkersSGIX");
            PFN_glDeleteAsyncMarkersSGIX = func.invoke("glDeleteAsyncMarkersSGIX");
            PFN_glIsAsyncMarkerSGIX = func.invoke("glIsAsyncMarkerSGIX");
        }
    }

    public GLSGIXAsync(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glAsyncMarkerSGIX((unsigned int) GLuint marker);
    /// ```
    public void AsyncMarkerSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAsyncMarkerSGIX)) throw new SymbolNotFoundError("Symbol not found: glAsyncMarkerSGIX");
        try { Handles.MH_glAsyncMarkerSGIX.invokeExact(handles.PFN_glAsyncMarkerSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in AsyncMarkerSGIX", e); }
    }

    /// ```
    /// (int) GLint glFinishAsyncSGIX(GLuint* markerp);
    /// ```
    public int FinishAsyncSGIX(MemorySegment markerp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishAsyncSGIX)) throw new SymbolNotFoundError("Symbol not found: glFinishAsyncSGIX");
        try { return (int) Handles.MH_glFinishAsyncSGIX.invokeExact(handles.PFN_glFinishAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in FinishAsyncSGIX", e); }
    }

    /// ```
    /// (int) GLint glPollAsyncSGIX(GLuint* markerp);
    /// ```
    public int PollAsyncSGIX(MemorySegment markerp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPollAsyncSGIX)) throw new SymbolNotFoundError("Symbol not found: glPollAsyncSGIX");
        try { return (int) Handles.MH_glPollAsyncSGIX.invokeExact(handles.PFN_glPollAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in PollAsyncSGIX", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGenAsyncMarkersSGIX((int) GLsizei range);
    /// ```
    public int GenAsyncMarkersSGIX(int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenAsyncMarkersSGIX)) throw new SymbolNotFoundError("Symbol not found: glGenAsyncMarkersSGIX");
        try { return (int) Handles.MH_glGenAsyncMarkersSGIX.invokeExact(handles.PFN_glGenAsyncMarkersSGIX, range); }
        catch (Throwable e) { throw new RuntimeException("error in GenAsyncMarkersSGIX", e); }
    }

    /// ```
    /// void glDeleteAsyncMarkersSGIX((unsigned int) GLuint marker, (int) GLsizei range);
    /// ```
    public void DeleteAsyncMarkersSGIX(int marker, int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteAsyncMarkersSGIX)) throw new SymbolNotFoundError("Symbol not found: glDeleteAsyncMarkersSGIX");
        try { Handles.MH_glDeleteAsyncMarkersSGIX.invokeExact(handles.PFN_glDeleteAsyncMarkersSGIX, marker, range); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteAsyncMarkersSGIX", e); }
    }

    /// ```
    /// GLboolean glIsAsyncMarkerSGIX((unsigned int) GLuint marker);
    /// ```
    public boolean IsAsyncMarkerSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsAsyncMarkerSGIX)) throw new SymbolNotFoundError("Symbol not found: glIsAsyncMarkerSGIX");
        try { return (((byte) Handles.MH_glIsAsyncMarkerSGIX.invokeExact(handles.PFN_glIsAsyncMarkerSGIX, marker)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsAsyncMarkerSGIX", e); }
    }

}
