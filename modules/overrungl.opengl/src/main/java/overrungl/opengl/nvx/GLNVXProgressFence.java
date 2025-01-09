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
package overrungl.opengl.nvx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVXProgressFence {
    public static final MethodHandle MH_glCreateProgressFenceNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glSignalSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glWaitSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glClientWaitSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateProgressFenceNVX;
    public final MemorySegment PFN_glSignalSemaphoreui64NVX;
    public final MemorySegment PFN_glWaitSemaphoreui64NVX;
    public final MemorySegment PFN_glClientWaitSemaphoreui64NVX;

    public GLNVXProgressFence(overrungl.opengl.GLLoadFunc func) {
        PFN_glCreateProgressFenceNVX = func.invoke("glCreateProgressFenceNVX");
        PFN_glSignalSemaphoreui64NVX = func.invoke("glSignalSemaphoreui64NVX");
        PFN_glWaitSemaphoreui64NVX = func.invoke("glWaitSemaphoreui64NVX");
        PFN_glClientWaitSemaphoreui64NVX = func.invoke("glClientWaitSemaphoreui64NVX");
    }

    public @CType("GLuint") int CreateProgressFenceNVX() {
        if (Unmarshal.isNullPointer(PFN_glCreateProgressFenceNVX)) throw new SymbolNotFoundError("Symbol not found: glCreateProgressFenceNVX");
        try { return (int) MH_glCreateProgressFenceNVX.invokeExact(PFN_glCreateProgressFenceNVX); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgressFenceNVX", e); }
    }

    public void SignalSemaphoreui64NVX(@CType("GLuint") int signalGpu, @CType("GLsizei") int fenceObjectCount, @CType("const GLuint *") java.lang.foreign.MemorySegment semaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment fenceValueArray) {
        if (Unmarshal.isNullPointer(PFN_glSignalSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glSignalSemaphoreui64NVX");
        try { MH_glSignalSemaphoreui64NVX.invokeExact(PFN_glSignalSemaphoreui64NVX, signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in glSignalSemaphoreui64NVX", e); }
    }

    public void WaitSemaphoreui64NVX(@CType("GLuint") int waitGpu, @CType("GLsizei") int fenceObjectCount, @CType("const GLuint *") java.lang.foreign.MemorySegment semaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment fenceValueArray) {
        if (Unmarshal.isNullPointer(PFN_glWaitSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glWaitSemaphoreui64NVX");
        try { MH_glWaitSemaphoreui64NVX.invokeExact(PFN_glWaitSemaphoreui64NVX, waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in glWaitSemaphoreui64NVX", e); }
    }

    public void ClientWaitSemaphoreui64NVX(@CType("GLsizei") int fenceObjectCount, @CType("const GLuint *") java.lang.foreign.MemorySegment semaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment fenceValueArray) {
        if (Unmarshal.isNullPointer(PFN_glClientWaitSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glClientWaitSemaphoreui64NVX");
        try { MH_glClientWaitSemaphoreui64NVX.invokeExact(PFN_glClientWaitSemaphoreui64NVX, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in glClientWaitSemaphoreui64NVX", e); }
    }

}
