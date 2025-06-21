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
import overrungl.opengl.*;

public final class GLSGIXInstruments {
    public static final int GL_INSTRUMENT_BUFFER_POINTER_SGIX = 0x8180;
    public static final int GL_INSTRUMENT_MEASUREMENTS_SGIX = 0x8181;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetInstrumentsSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInstrumentsBufferSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPollInstrumentsSGIX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReadInstrumentsSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStartInstrumentsSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glStopInstrumentsSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetInstrumentsSGIX;
        public final MemorySegment PFN_glInstrumentsBufferSGIX;
        public final MemorySegment PFN_glPollInstrumentsSGIX;
        public final MemorySegment PFN_glReadInstrumentsSGIX;
        public final MemorySegment PFN_glStartInstrumentsSGIX;
        public final MemorySegment PFN_glStopInstrumentsSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetInstrumentsSGIX = func.invoke("glGetInstrumentsSGIX");
            PFN_glInstrumentsBufferSGIX = func.invoke("glInstrumentsBufferSGIX");
            PFN_glPollInstrumentsSGIX = func.invoke("glPollInstrumentsSGIX");
            PFN_glReadInstrumentsSGIX = func.invoke("glReadInstrumentsSGIX");
            PFN_glStartInstrumentsSGIX = func.invoke("glStartInstrumentsSGIX");
            PFN_glStopInstrumentsSGIX = func.invoke("glStopInstrumentsSGIX");
        }
    }

    public GLSGIXInstruments(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (int) GLint glGetInstrumentsSGIX();
    /// ```
    public int GetInstrumentsSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetInstrumentsSGIX");
        try { return (int) Handles.MH_glGetInstrumentsSGIX.invokeExact(handles.PFN_glGetInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in GetInstrumentsSGIX", e); }
    }

    /// ```
    /// void glInstrumentsBufferSGIX((int) GLsizei size, GLint* buffer);
    /// ```
    public void InstrumentsBufferSGIX(int size, MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInstrumentsBufferSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glInstrumentsBufferSGIX");
        try { Handles.MH_glInstrumentsBufferSGIX.invokeExact(handles.PFN_glInstrumentsBufferSGIX, size, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in InstrumentsBufferSGIX", e); }
    }

    /// ```
    /// (int) GLint glPollInstrumentsSGIX(GLint* marker_p);
    /// ```
    public int PollInstrumentsSGIX(MemorySegment marker_p) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPollInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glPollInstrumentsSGIX");
        try { return (int) Handles.MH_glPollInstrumentsSGIX.invokeExact(handles.PFN_glPollInstrumentsSGIX, marker_p); }
        catch (Throwable e) { throw new RuntimeException("error in PollInstrumentsSGIX", e); }
    }

    /// ```
    /// void glReadInstrumentsSGIX((int) GLint marker);
    /// ```
    public void ReadInstrumentsSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glReadInstrumentsSGIX");
        try { Handles.MH_glReadInstrumentsSGIX.invokeExact(handles.PFN_glReadInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in ReadInstrumentsSGIX", e); }
    }

    /// ```
    /// void glStartInstrumentsSGIX();
    /// ```
    public void StartInstrumentsSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glStartInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glStartInstrumentsSGIX");
        try { Handles.MH_glStartInstrumentsSGIX.invokeExact(handles.PFN_glStartInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in StartInstrumentsSGIX", e); }
    }

    /// ```
    /// void glStopInstrumentsSGIX((int) GLint marker);
    /// ```
    public void StopInstrumentsSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStopInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glStopInstrumentsSGIX");
        try { Handles.MH_glStopInstrumentsSGIX.invokeExact(handles.PFN_glStopInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in StopInstrumentsSGIX", e); }
    }

}
