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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVTimelineSemaphore {
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;
    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;
    public static final int GL_SEMAPHORE_TYPE_BINARY_NV = 0x95B4;
    public static final int GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glCreateSemaphoresNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSemaphoreParameterivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSemaphoreParameterivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glCreateSemaphoresNV,
            FD_glSemaphoreParameterivNV,
            FD_glGetSemaphoreParameterivNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glCreateSemaphoresNV = RuntimeHelper.downcall(Descriptors.FD_glCreateSemaphoresNV);
        public static final MethodHandle MH_glSemaphoreParameterivNV = RuntimeHelper.downcall(Descriptors.FD_glSemaphoreParameterivNV);
        public static final MethodHandle MH_glGetSemaphoreParameterivNV = RuntimeHelper.downcall(Descriptors.FD_glGetSemaphoreParameterivNV);
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

    public void CreateSemaphoresNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment semaphores) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateSemaphoresNV)) throw new SymbolNotFoundError("Symbol not found: glCreateSemaphoresNV");
        try { Handles.MH_glCreateSemaphoresNV.invokeExact(handles.PFN_glCreateSemaphoresNV, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateSemaphoresNV", e); }
    }

    public void SemaphoreParameterivNV(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glSemaphoreParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glSemaphoreParameterivNV");
        try { Handles.MH_glSemaphoreParameterivNV.invokeExact(handles.PFN_glSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glSemaphoreParameterivNV", e); }
    }

    public void GetSemaphoreParameterivNV(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSemaphoreParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glGetSemaphoreParameterivNV");
        try { Handles.MH_glGetSemaphoreParameterivNV.invokeExact(handles.PFN_glGetSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSemaphoreParameterivNV", e); }
    }

}
