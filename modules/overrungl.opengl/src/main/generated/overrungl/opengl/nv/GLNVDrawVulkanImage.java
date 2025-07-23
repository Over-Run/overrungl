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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVDrawVulkanImage {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawVkImageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGetVkProcAddrNV = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWaitVkSemaphoreNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glSignalVkSemaphoreNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glSignalVkFenceNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glDrawVkImageNV;
        public final MemorySegment PFN_glGetVkProcAddrNV;
        public final MemorySegment PFN_glWaitVkSemaphoreNV;
        public final MemorySegment PFN_glSignalVkSemaphoreNV;
        public final MemorySegment PFN_glSignalVkFenceNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawVkImageNV = func.invoke("glDrawVkImageNV");
            PFN_glGetVkProcAddrNV = func.invoke("glGetVkProcAddrNV");
            PFN_glWaitVkSemaphoreNV = func.invoke("glWaitVkSemaphoreNV");
            PFN_glSignalVkSemaphoreNV = func.invoke("glSignalVkSemaphoreNV");
            PFN_glSignalVkFenceNV = func.invoke("glSignalVkFenceNV");
        }
    }

    public GLNVDrawVulkanImage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawVkImageNV(((uint64_t) khronos_uint64_t) GLuint64 vkImage, (unsigned int) GLuint sampler, ((float) khronos_float_t) GLfloat x0, ((float) khronos_float_t) GLfloat y0, ((float) khronos_float_t) GLfloat x1, ((float) khronos_float_t) GLfloat y1, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat s0, ((float) khronos_float_t) GLfloat t0, ((float) khronos_float_t) GLfloat s1, ((float) khronos_float_t) GLfloat t1);
    /// ```
    public void DrawVkImageNV(long vkImage, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawVkImageNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawVkImageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawVkImageNV", vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        Handles.MH_glDrawVkImageNV.invokeExact(handles.PFN_glDrawVkImageNV, vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        catch (Throwable e) { throw new RuntimeException("error in DrawVkImageNV", e); }
    }

    /// ```
    /// (void*) GLVULKANPROCNV glGetVkProcAddrNV(const GLchar* name);
    /// ```
    public MemorySegment GetVkProcAddrNV(MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVkProcAddrNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVkProcAddrNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVkProcAddrNV", name); }
        return (MemorySegment) Handles.MH_glGetVkProcAddrNV.invokeExact(handles.PFN_glGetVkProcAddrNV, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetVkProcAddrNV", e); }
    }

    /// ```
    /// void glWaitVkSemaphoreNV(((uint64_t) khronos_uint64_t) GLuint64 vkSemaphore);
    /// ```
    public void WaitVkSemaphoreNV(long vkSemaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitVkSemaphoreNV)) throw new GLSymbolNotFoundError("Symbol not found: glWaitVkSemaphoreNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitVkSemaphoreNV", vkSemaphore); }
        Handles.MH_glWaitVkSemaphoreNV.invokeExact(handles.PFN_glWaitVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in WaitVkSemaphoreNV", e); }
    }

    /// ```
    /// void glSignalVkSemaphoreNV(((uint64_t) khronos_uint64_t) GLuint64 vkSemaphore);
    /// ```
    public void SignalVkSemaphoreNV(long vkSemaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalVkSemaphoreNV)) throw new GLSymbolNotFoundError("Symbol not found: glSignalVkSemaphoreNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalVkSemaphoreNV", vkSemaphore); }
        Handles.MH_glSignalVkSemaphoreNV.invokeExact(handles.PFN_glSignalVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in SignalVkSemaphoreNV", e); }
    }

    /// ```
    /// void glSignalVkFenceNV(((uint64_t) khronos_uint64_t) GLuint64 vkFence);
    /// ```
    public void SignalVkFenceNV(long vkFence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalVkFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glSignalVkFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalVkFenceNV", vkFence); }
        Handles.MH_glSignalVkFenceNV.invokeExact(handles.PFN_glSignalVkFenceNV, vkFence); }
        catch (Throwable e) { throw new RuntimeException("error in SignalVkFenceNV", e); }
    }

}
