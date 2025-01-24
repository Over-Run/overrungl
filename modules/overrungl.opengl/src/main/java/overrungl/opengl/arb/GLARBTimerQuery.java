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

public final class GLARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryCounter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryObjecti64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectui64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
    /// void glQueryCounter(unsigned int id, unsigned int target);
    /// ```
    public void QueryCounter(int id, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryCounter)) throw new SymbolNotFoundError("Symbol not found: glQueryCounter");
        try { Handles.MH_glQueryCounter.invokeExact(handles.PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in QueryCounter", e); }
    }

    /// ```
    /// void glGetQueryObjecti64v(unsigned int id, unsigned int pname, GLint64* params);
    /// ```
    public void GetQueryObjecti64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjecti64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { Handles.MH_glGetQueryObjecti64v.invokeExact(handles.PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjecti64v", e); }
    }

    /// ```
    /// void glGetQueryObjectui64v(unsigned int id, unsigned int pname, GLuint64* params);
    /// ```
    public void GetQueryObjectui64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectui64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { Handles.MH_glGetQueryObjectui64v.invokeExact(handles.PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectui64v", e); }
    }

}
