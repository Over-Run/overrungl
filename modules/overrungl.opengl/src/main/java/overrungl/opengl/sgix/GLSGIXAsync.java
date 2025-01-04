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
    public static final MethodHandle MH_glAsyncMarkerSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAsyncMarkerSGIX;
    public static final MethodHandle MH_glFinishAsyncSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFinishAsyncSGIX;
    public static final MethodHandle MH_glPollAsyncSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPollAsyncSGIX;
    public static final MethodHandle MH_glGenAsyncMarkersSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenAsyncMarkersSGIX;
    public static final MethodHandle MH_glDeleteAsyncMarkersSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDeleteAsyncMarkersSGIX;
    public static final MethodHandle MH_glIsAsyncMarkerSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsAsyncMarkerSGIX;

    public GLSGIXAsync(overrungl.opengl.GLLoadFunc func) {
        PFN_glAsyncMarkerSGIX = func.invoke("glAsyncMarkerSGIX");
        PFN_glFinishAsyncSGIX = func.invoke("glFinishAsyncSGIX");
        PFN_glPollAsyncSGIX = func.invoke("glPollAsyncSGIX");
        PFN_glGenAsyncMarkersSGIX = func.invoke("glGenAsyncMarkersSGIX");
        PFN_glDeleteAsyncMarkersSGIX = func.invoke("glDeleteAsyncMarkersSGIX");
        PFN_glIsAsyncMarkerSGIX = func.invoke("glIsAsyncMarkerSGIX");
    }

    public void AsyncMarkerSGIX(@CType("GLuint") int marker) {
        try { if (!Unmarshal.isNullPointer(PFN_glAsyncMarkerSGIX))
            MH_glAsyncMarkerSGIX.invokeExact(PFN_glAsyncMarkerSGIX, marker);
        }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncMarkerSGIX", e); }
    }

    public @CType("GLint") int FinishAsyncSGIX(@CType("GLuint *") java.lang.foreign.MemorySegment markerp) {
        try { if (!Unmarshal.isNullPointer(PFN_glFinishAsyncSGIX))
            return (int) MH_glFinishAsyncSGIX.invokeExact(PFN_glFinishAsyncSGIX, markerp);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glFinishAsyncSGIX", e); }
    }

    public @CType("GLint") int PollAsyncSGIX(@CType("GLuint *") java.lang.foreign.MemorySegment markerp) {
        try { if (!Unmarshal.isNullPointer(PFN_glPollAsyncSGIX))
            return (int) MH_glPollAsyncSGIX.invokeExact(PFN_glPollAsyncSGIX, markerp);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glPollAsyncSGIX", e); }
    }

    public @CType("GLuint") int GenAsyncMarkersSGIX(@CType("GLsizei") int range) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenAsyncMarkersSGIX))
            return (int) MH_glGenAsyncMarkersSGIX.invokeExact(PFN_glGenAsyncMarkersSGIX, range);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenAsyncMarkersSGIX", e); }
    }

    public void DeleteAsyncMarkersSGIX(@CType("GLuint") int marker, @CType("GLsizei") int range) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteAsyncMarkersSGIX))
            MH_glDeleteAsyncMarkersSGIX.invokeExact(PFN_glDeleteAsyncMarkersSGIX, marker, range);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteAsyncMarkersSGIX", e); }
    }

    public @CType("GLboolean") boolean IsAsyncMarkerSGIX(@CType("GLuint") int marker) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsAsyncMarkerSGIX))
            return (boolean) MH_glIsAsyncMarkerSGIX.invokeExact(PFN_glIsAsyncMarkerSGIX, marker);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsAsyncMarkerSGIX", e); }
    }

}
