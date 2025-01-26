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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVTimelineSemaphore {
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;
    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;
    public static final int GL_SEMAPHORE_TYPE_BINARY_NV = 0x95B4;
    public static final int GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateSemaphoresNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSemaphoreParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSemaphoreParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCreateSemaphoresNV;
        public final MemorySegment PFN_glSemaphoreParameterivNV;
        public final MemorySegment PFN_glGetSemaphoreParameterivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCreateSemaphoresNV = func.invoke("glCreateSemaphoresNV");
            PFN_glSemaphoreParameterivNV = func.invoke("glSemaphoreParameterivNV");
            PFN_glGetSemaphoreParameterivNV = func.invoke("glGetSemaphoreParameterivNV");
        }
    }

    public GLNVTimelineSemaphore(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCreateSemaphoresNV((int) GLsizei n, GLuint* semaphores);
    /// ```
    public void CreateSemaphoresNV(int n, MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateSemaphoresNV)) throw new SymbolNotFoundError("Symbol not found: glCreateSemaphoresNV");
        try { Handles.MH_glCreateSemaphoresNV.invokeExact(handles.PFN_glCreateSemaphoresNV, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSemaphoresNV", e); }
    }

    /// ```
    /// void glSemaphoreParameterivNV((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void SemaphoreParameterivNV(int semaphore, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSemaphoreParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glSemaphoreParameterivNV");
        try { Handles.MH_glSemaphoreParameterivNV.invokeExact(handles.PFN_glSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SemaphoreParameterivNV", e); }
    }

    /// ```
    /// void glGetSemaphoreParameterivNV((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSemaphoreParameterivNV(int semaphore, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSemaphoreParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glGetSemaphoreParameterivNV");
        try { Handles.MH_glGetSemaphoreParameterivNV.invokeExact(handles.PFN_glGetSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreParameterivNV", e); }
    }

}
