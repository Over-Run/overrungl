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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glQueryCounter = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetQueryObjecti64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetQueryObjectui64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glQueryCounter,
            FD_glGetQueryObjecti64v,
            FD_glGetQueryObjectui64v
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glQueryCounter = RuntimeHelper.downcall(Descriptors.FD_glQueryCounter);
        public static final MethodHandle MH_glGetQueryObjecti64v = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjecti64v);
        public static final MethodHandle MH_glGetQueryObjectui64v = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjectui64v);
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

    public void QueryCounter(@CType("GLuint") int id, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glQueryCounter)) throw new SymbolNotFoundError("Symbol not found: glQueryCounter");
        try { Handles.MH_glQueryCounter.invokeExact(handles.PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in glQueryCounter", e); }
    }

    public void GetQueryObjecti64v(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjecti64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { Handles.MH_glGetQueryObjecti64v.invokeExact(handles.PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjecti64v", e); }
    }

    public void GetQueryObjectui64v(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjectui64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { Handles.MH_glGetQueryObjectui64v.invokeExact(handles.PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectui64v", e); }
    }

}
