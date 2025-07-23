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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryCounter = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryObjecti64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectui64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glQueryCounter;
        public final MemorySegment PFN_glGetQueryObjecti64v;
        public final MemorySegment PFN_glGetQueryObjectui64v;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glQueryCounter = func.invoke("glQueryCounter");
            PFN_glGetQueryObjecti64v = func.invoke("glGetQueryObjecti64v");
            PFN_glGetQueryObjectui64v = func.invoke("glGetQueryObjectui64v");
        }
    }

    public GLARBTimerQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glQueryCounter((unsigned int) GLuint id, (unsigned int) GLenum target);
    /// ```
    public void QueryCounter(int id, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryCounter)) throw new GLSymbolNotFoundError("Symbol not found: glQueryCounter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryCounter", id, target); }
        Handles.MH_glQueryCounter.invokeExact(handles.PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in QueryCounter", e); }
    }

    /// ```
    /// void glGetQueryObjecti64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetQueryObjecti64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjecti64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjecti64v", id, pname, params); }
        Handles.MH_glGetQueryObjecti64v.invokeExact(handles.PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjecti64v", e); }
    }

    /// ```
    /// void glGetQueryObjectui64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void GetQueryObjectui64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectui64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectui64v", id, pname, params); }
        Handles.MH_glGetQueryObjectui64v.invokeExact(handles.PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectui64v", e); }
    }

}
