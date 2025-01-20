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

public final class GLSGIXAsync {
    public static final int GL_ASYNC_MARKER_SGIX = 0x8329;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glAsyncMarkerSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFinishAsyncSGIX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPollAsyncSGIX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenAsyncMarkersSGIX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteAsyncMarkersSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsAsyncMarkerSGIX = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glAsyncMarkerSGIX = RuntimeHelper.downcall(Descriptors.FD_glAsyncMarkerSGIX);
        public static final MethodHandle MH_glFinishAsyncSGIX = RuntimeHelper.downcall(Descriptors.FD_glFinishAsyncSGIX);
        public static final MethodHandle MH_glPollAsyncSGIX = RuntimeHelper.downcall(Descriptors.FD_glPollAsyncSGIX);
        public static final MethodHandle MH_glGenAsyncMarkersSGIX = RuntimeHelper.downcall(Descriptors.FD_glGenAsyncMarkersSGIX);
        public static final MethodHandle MH_glDeleteAsyncMarkersSGIX = RuntimeHelper.downcall(Descriptors.FD_glDeleteAsyncMarkersSGIX);
        public static final MethodHandle MH_glIsAsyncMarkerSGIX = RuntimeHelper.downcall(Descriptors.FD_glIsAsyncMarkerSGIX);
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

    public void AsyncMarkerSGIX(@CType("GLuint") int marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glAsyncMarkerSGIX)) throw new SymbolNotFoundError("Symbol not found: glAsyncMarkerSGIX");
        try { Handles.MH_glAsyncMarkerSGIX.invokeExact(handles.PFN_glAsyncMarkerSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncMarkerSGIX", e); }
    }

    public @CType("GLint") int FinishAsyncSGIX(@CType("GLuint *") java.lang.foreign.MemorySegment markerp) {
        if (Unmarshal.isNullPointer(handles.PFN_glFinishAsyncSGIX)) throw new SymbolNotFoundError("Symbol not found: glFinishAsyncSGIX");
        try { return (int) Handles.MH_glFinishAsyncSGIX.invokeExact(handles.PFN_glFinishAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in glFinishAsyncSGIX", e); }
    }

    public @CType("GLint") int PollAsyncSGIX(@CType("GLuint *") java.lang.foreign.MemorySegment markerp) {
        if (Unmarshal.isNullPointer(handles.PFN_glPollAsyncSGIX)) throw new SymbolNotFoundError("Symbol not found: glPollAsyncSGIX");
        try { return (int) Handles.MH_glPollAsyncSGIX.invokeExact(handles.PFN_glPollAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in glPollAsyncSGIX", e); }
    }

    public @CType("GLuint") int GenAsyncMarkersSGIX(@CType("GLsizei") int range) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenAsyncMarkersSGIX)) throw new SymbolNotFoundError("Symbol not found: glGenAsyncMarkersSGIX");
        try { return (int) Handles.MH_glGenAsyncMarkersSGIX.invokeExact(handles.PFN_glGenAsyncMarkersSGIX, range); }
        catch (Throwable e) { throw new RuntimeException("error in glGenAsyncMarkersSGIX", e); }
    }

    public void DeleteAsyncMarkersSGIX(@CType("GLuint") int marker, @CType("GLsizei") int range) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteAsyncMarkersSGIX)) throw new SymbolNotFoundError("Symbol not found: glDeleteAsyncMarkersSGIX");
        try { Handles.MH_glDeleteAsyncMarkersSGIX.invokeExact(handles.PFN_glDeleteAsyncMarkersSGIX, marker, range); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteAsyncMarkersSGIX", e); }
    }

    public @CType("GLboolean") boolean IsAsyncMarkerSGIX(@CType("GLuint") int marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsAsyncMarkerSGIX)) throw new SymbolNotFoundError("Symbol not found: glIsAsyncMarkerSGIX");
        try { return (boolean) Handles.MH_glIsAsyncMarkerSGIX.invokeExact(handles.PFN_glIsAsyncMarkerSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glIsAsyncMarkerSGIX", e); }
    }

}
