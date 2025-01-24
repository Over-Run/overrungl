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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVXProgressFence {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateProgressFenceNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSignalSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWaitSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClientWaitSemaphoreui64NVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCreateProgressFenceNVX;
        public final MemorySegment PFN_glSignalSemaphoreui64NVX;
        public final MemorySegment PFN_glWaitSemaphoreui64NVX;
        public final MemorySegment PFN_glClientWaitSemaphoreui64NVX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCreateProgressFenceNVX = func.invoke("glCreateProgressFenceNVX");
            PFN_glSignalSemaphoreui64NVX = func.invoke("glSignalSemaphoreui64NVX");
            PFN_glWaitSemaphoreui64NVX = func.invoke("glWaitSemaphoreui64NVX");
            PFN_glClientWaitSemaphoreui64NVX = func.invoke("glClientWaitSemaphoreui64NVX");
        }
    }

    public GLNVXProgressFence(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// unsigned int glCreateProgressFenceNVX();
    /// ```
    public int CreateProgressFenceNVX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgressFenceNVX)) throw new SymbolNotFoundError("Symbol not found: glCreateProgressFenceNVX");
        try { return (int) Handles.MH_glCreateProgressFenceNVX.invokeExact(handles.PFN_glCreateProgressFenceNVX); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgressFenceNVX", e); }
    }

    /// ```
    /// void glSignalSemaphoreui64NVX(unsigned int signalGpu, int fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void SignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, MemorySegment semaphoreArray, MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glSignalSemaphoreui64NVX");
        try { Handles.MH_glSignalSemaphoreui64NVX.invokeExact(handles.PFN_glSignalSemaphoreui64NVX, signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in SignalSemaphoreui64NVX", e); }
    }

    /// ```
    /// void glWaitSemaphoreui64NVX(unsigned int waitGpu, int fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void WaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, MemorySegment semaphoreArray, MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glWaitSemaphoreui64NVX");
        try { Handles.MH_glWaitSemaphoreui64NVX.invokeExact(handles.PFN_glWaitSemaphoreui64NVX, waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSemaphoreui64NVX", e); }
    }

    /// ```
    /// void glClientWaitSemaphoreui64NVX(int fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void ClientWaitSemaphoreui64NVX(int fenceObjectCount, MemorySegment semaphoreArray, MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientWaitSemaphoreui64NVX)) throw new SymbolNotFoundError("Symbol not found: glClientWaitSemaphoreui64NVX");
        try { Handles.MH_glClientWaitSemaphoreui64NVX.invokeExact(handles.PFN_glClientWaitSemaphoreui64NVX, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in ClientWaitSemaphoreui64NVX", e); }
    }

}
