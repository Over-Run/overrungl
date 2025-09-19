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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NVX_progress_fence`
public final class GLNVXProgressFence {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateProgressFenceNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSignalSemaphoreui64NVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWaitSemaphoreui64NVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClientWaitSemaphoreui64NVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCreateProgressFenceNVX;
        public final MemorySegment PFN_glSignalSemaphoreui64NVX;
        public final MemorySegment PFN_glWaitSemaphoreui64NVX;
        public final MemorySegment PFN_glClientWaitSemaphoreui64NVX;
        private Handles(GLLoadFunc func) {
            PFN_glCreateProgressFenceNVX = func.invoke("glCreateProgressFenceNVX");
            PFN_glSignalSemaphoreui64NVX = func.invoke("glSignalSemaphoreui64NVX");
            PFN_glWaitSemaphoreui64NVX = func.invoke("glWaitSemaphoreui64NVX");
            PFN_glClientWaitSemaphoreui64NVX = func.invoke("glClientWaitSemaphoreui64NVX");
        }
    }

    public GLNVXProgressFence(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCreateProgressFenceNVX`.
    /// ```
    /// (unsigned int) GLuint glCreateProgressFenceNVX();
    /// ```
    public int CreateProgressFenceNVX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgressFenceNVX)) throw new GLSymbolNotFoundError("Symbol not found: glCreateProgressFenceNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateProgressFenceNVX"); }
        return (int) Handles.MH_glCreateProgressFenceNVX.invokeExact(handles.PFN_glCreateProgressFenceNVX); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgressFenceNVX", e); }
    }

    /// Invokes `glSignalSemaphoreui64NVX`.
    /// ```
    /// void glSignalSemaphoreui64NVX((unsigned int) GLuint signalGpu, (int) GLsizei fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void SignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, @NonNull MemorySegment semaphoreArray, @NonNull MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalSemaphoreui64NVX)) throw new GLSymbolNotFoundError("Symbol not found: glSignalSemaphoreui64NVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalSemaphoreui64NVX", signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        Handles.MH_glSignalSemaphoreui64NVX.invokeExact(handles.PFN_glSignalSemaphoreui64NVX, signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in SignalSemaphoreui64NVX", e); }
    }

    /// Invokes `glWaitSemaphoreui64NVX`.
    /// ```
    /// void glWaitSemaphoreui64NVX((unsigned int) GLuint waitGpu, (int) GLsizei fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void WaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, @NonNull MemorySegment semaphoreArray, @NonNull MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSemaphoreui64NVX)) throw new GLSymbolNotFoundError("Symbol not found: glWaitSemaphoreui64NVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitSemaphoreui64NVX", waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        Handles.MH_glWaitSemaphoreui64NVX.invokeExact(handles.PFN_glWaitSemaphoreui64NVX, waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSemaphoreui64NVX", e); }
    }

    /// Invokes `glClientWaitSemaphoreui64NVX`.
    /// ```
    /// void glClientWaitSemaphoreui64NVX((int) GLsizei fenceObjectCount, const GLuint* semaphoreArray, const GLuint64* fenceValueArray);
    /// ```
    public void ClientWaitSemaphoreui64NVX(int fenceObjectCount, @NonNull MemorySegment semaphoreArray, @NonNull MemorySegment fenceValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientWaitSemaphoreui64NVX)) throw new GLSymbolNotFoundError("Symbol not found: glClientWaitSemaphoreui64NVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClientWaitSemaphoreui64NVX", fenceObjectCount, semaphoreArray, fenceValueArray); }
        Handles.MH_glClientWaitSemaphoreui64NVX.invokeExact(handles.PFN_glClientWaitSemaphoreui64NVX, fenceObjectCount, semaphoreArray, fenceValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in ClientWaitSemaphoreui64NVX", e); }
    }

}
