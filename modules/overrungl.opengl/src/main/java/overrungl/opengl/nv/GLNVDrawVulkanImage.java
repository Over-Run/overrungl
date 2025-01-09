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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVDrawVulkanImage {
    public static final MethodHandle MH_glDrawVkImageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glGetVkProcAddrNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glWaitVkSemaphoreNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_glSignalVkSemaphoreNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_glSignalVkFenceNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glDrawVkImageNV;
    public final MemorySegment PFN_glGetVkProcAddrNV;
    public final MemorySegment PFN_glWaitVkSemaphoreNV;
    public final MemorySegment PFN_glSignalVkSemaphoreNV;
    public final MemorySegment PFN_glSignalVkFenceNV;

    public GLNVDrawVulkanImage(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawVkImageNV = func.invoke("glDrawVkImageNV");
        PFN_glGetVkProcAddrNV = func.invoke("glGetVkProcAddrNV");
        PFN_glWaitVkSemaphoreNV = func.invoke("glWaitVkSemaphoreNV");
        PFN_glSignalVkSemaphoreNV = func.invoke("glSignalVkSemaphoreNV");
        PFN_glSignalVkFenceNV = func.invoke("glSignalVkFenceNV");
    }

    public void DrawVkImageNV(@CType("GLuint64") long vkImage, @CType("GLuint") int sampler, @CType("GLfloat") float x0, @CType("GLfloat") float y0, @CType("GLfloat") float x1, @CType("GLfloat") float y1, @CType("GLfloat") float z, @CType("GLfloat") float s0, @CType("GLfloat") float t0, @CType("GLfloat") float s1, @CType("GLfloat") float t1) {
        if (Unmarshal.isNullPointer(PFN_glDrawVkImageNV)) throw new SymbolNotFoundError("Symbol not found: glDrawVkImageNV");
        try { MH_glDrawVkImageNV.invokeExact(PFN_glDrawVkImageNV, vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawVkImageNV", e); }
    }

    public @CType("GLVULKANPROCNV") java.lang.foreign.MemorySegment GetVkProcAddrNV(@CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glGetVkProcAddrNV)) throw new SymbolNotFoundError("Symbol not found: glGetVkProcAddrNV");
        try { return (java.lang.foreign.MemorySegment) MH_glGetVkProcAddrNV.invokeExact(PFN_glGetVkProcAddrNV, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVkProcAddrNV", e); }
    }

    public void WaitVkSemaphoreNV(@CType("GLuint64") long vkSemaphore) {
        if (Unmarshal.isNullPointer(PFN_glWaitVkSemaphoreNV)) throw new SymbolNotFoundError("Symbol not found: glWaitVkSemaphoreNV");
        try { MH_glWaitVkSemaphoreNV.invokeExact(PFN_glWaitVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in glWaitVkSemaphoreNV", e); }
    }

    public void SignalVkSemaphoreNV(@CType("GLuint64") long vkSemaphore) {
        if (Unmarshal.isNullPointer(PFN_glSignalVkSemaphoreNV)) throw new SymbolNotFoundError("Symbol not found: glSignalVkSemaphoreNV");
        try { MH_glSignalVkSemaphoreNV.invokeExact(PFN_glSignalVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in glSignalVkSemaphoreNV", e); }
    }

    public void SignalVkFenceNV(@CType("GLuint64") long vkFence) {
        if (Unmarshal.isNullPointer(PFN_glSignalVkFenceNV)) throw new SymbolNotFoundError("Symbol not found: glSignalVkFenceNV");
        try { MH_glSignalVkFenceNV.invokeExact(PFN_glSignalVkFenceNV, vkFence); }
        catch (Throwable e) { throw new RuntimeException("error in glSignalVkFenceNV", e); }
    }

}
