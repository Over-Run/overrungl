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

public final class GLSGIXInstruments {
    public static final int GL_INSTRUMENT_BUFFER_POINTER_SGIX = 0x8180;
    public static final int GL_INSTRUMENT_MEASUREMENTS_SGIX = 0x8181;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetInstrumentsSGIX = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glInstrumentsBufferSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPollInstrumentsSGIX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReadInstrumentsSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glStartInstrumentsSGIX = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glStopInstrumentsSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetInstrumentsSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetInstrumentsSGIX);
        public static final MethodHandle MH_glInstrumentsBufferSGIX = RuntimeHelper.downcall(Descriptors.FD_glInstrumentsBufferSGIX);
        public static final MethodHandle MH_glPollInstrumentsSGIX = RuntimeHelper.downcall(Descriptors.FD_glPollInstrumentsSGIX);
        public static final MethodHandle MH_glReadInstrumentsSGIX = RuntimeHelper.downcall(Descriptors.FD_glReadInstrumentsSGIX);
        public static final MethodHandle MH_glStartInstrumentsSGIX = RuntimeHelper.downcall(Descriptors.FD_glStartInstrumentsSGIX);
        public static final MethodHandle MH_glStopInstrumentsSGIX = RuntimeHelper.downcall(Descriptors.FD_glStopInstrumentsSGIX);
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

    public @CType("GLint") int GetInstrumentsSGIX() {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetInstrumentsSGIX");
        try { return (int) Handles.MH_glGetInstrumentsSGIX.invokeExact(handles.PFN_glGetInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInstrumentsSGIX", e); }
    }

    public void InstrumentsBufferSGIX(@CType("GLsizei") int size, @CType("GLint *") MemorySegment buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glInstrumentsBufferSGIX)) throw new SymbolNotFoundError("Symbol not found: glInstrumentsBufferSGIX");
        try { Handles.MH_glInstrumentsBufferSGIX.invokeExact(handles.PFN_glInstrumentsBufferSGIX, size, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glInstrumentsBufferSGIX", e); }
    }

    public @CType("GLint") int PollInstrumentsSGIX(@CType("GLint *") MemorySegment marker_p) {
        if (Unmarshal.isNullPointer(handles.PFN_glPollInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glPollInstrumentsSGIX");
        try { return (int) Handles.MH_glPollInstrumentsSGIX.invokeExact(handles.PFN_glPollInstrumentsSGIX, marker_p); }
        catch (Throwable e) { throw new RuntimeException("error in glPollInstrumentsSGIX", e); }
    }

    public void ReadInstrumentsSGIX(@CType("GLint") int marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glReadInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glReadInstrumentsSGIX");
        try { Handles.MH_glReadInstrumentsSGIX.invokeExact(handles.PFN_glReadInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glReadInstrumentsSGIX", e); }
    }

    public void StartInstrumentsSGIX() {
        if (Unmarshal.isNullPointer(handles.PFN_glStartInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glStartInstrumentsSGIX");
        try { Handles.MH_glStartInstrumentsSGIX.invokeExact(handles.PFN_glStartInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in glStartInstrumentsSGIX", e); }
    }

    public void StopInstrumentsSGIX(@CType("GLint") int marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glStopInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glStopInstrumentsSGIX");
        try { Handles.MH_glStopInstrumentsSGIX.invokeExact(handles.PFN_glStopInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glStopInstrumentsSGIX", e); }
    }

}
