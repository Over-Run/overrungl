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

    public GLSGIXInstruments(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetInstrumentsSGIX = func.invoke("glGetInstrumentsSGIX");
        PFN_glInstrumentsBufferSGIX = func.invoke("glInstrumentsBufferSGIX");
        PFN_glPollInstrumentsSGIX = func.invoke("glPollInstrumentsSGIX");
        PFN_glReadInstrumentsSGIX = func.invoke("glReadInstrumentsSGIX");
        PFN_glStartInstrumentsSGIX = func.invoke("glStartInstrumentsSGIX");
        PFN_glStopInstrumentsSGIX = func.invoke("glStopInstrumentsSGIX");
    }

    public @CType("GLint") int GetInstrumentsSGIX() {
        if (Unmarshal.isNullPointer(PFN_glGetInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetInstrumentsSGIX");
        try { return (int) MH_glGetInstrumentsSGIX.invokeExact(PFN_glGetInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInstrumentsSGIX", e); }
    }

    public void InstrumentsBufferSGIX(@CType("GLsizei") int size, @CType("GLint *") java.lang.foreign.MemorySegment buffer) {
        if (Unmarshal.isNullPointer(PFN_glInstrumentsBufferSGIX)) throw new SymbolNotFoundError("Symbol not found: glInstrumentsBufferSGIX");
        try { MH_glInstrumentsBufferSGIX.invokeExact(PFN_glInstrumentsBufferSGIX, size, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glInstrumentsBufferSGIX", e); }
    }

    public @CType("GLint") int PollInstrumentsSGIX(@CType("GLint *") java.lang.foreign.MemorySegment marker_p) {
        if (Unmarshal.isNullPointer(PFN_glPollInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glPollInstrumentsSGIX");
        try { return (int) MH_glPollInstrumentsSGIX.invokeExact(PFN_glPollInstrumentsSGIX, marker_p); }
        catch (Throwable e) { throw new RuntimeException("error in glPollInstrumentsSGIX", e); }
    }

    public void ReadInstrumentsSGIX(@CType("GLint") int marker) {
        if (Unmarshal.isNullPointer(PFN_glReadInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glReadInstrumentsSGIX");
        try { MH_glReadInstrumentsSGIX.invokeExact(PFN_glReadInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glReadInstrumentsSGIX", e); }
    }

    public void StartInstrumentsSGIX() {
        if (Unmarshal.isNullPointer(PFN_glStartInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glStartInstrumentsSGIX");
        try { MH_glStartInstrumentsSGIX.invokeExact(PFN_glStartInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in glStartInstrumentsSGIX", e); }
    }

    public void StopInstrumentsSGIX(@CType("GLint") int marker) {
        if (Unmarshal.isNullPointer(PFN_glStopInstrumentsSGIX)) throw new SymbolNotFoundError("Symbol not found: glStopInstrumentsSGIX");
        try { MH_glStopInstrumentsSGIX.invokeExact(PFN_glStopInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glStopInstrumentsSGIX", e); }
    }

}
