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

public final class GLNVFence {
    public static final int GL_ALL_COMPLETED_NV = 0x84F2;
    public static final int GL_FENCE_STATUS_NV = 0x84F3;
    public static final int GL_FENCE_CONDITION_NV = 0x84F4;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDeleteFencesNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenFencesNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsFenceNV = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTestFenceNV = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFenceivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFinishFenceNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSetFenceNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glDeleteFencesNV,
            FD_glGenFencesNV,
            FD_glIsFenceNV,
            FD_glTestFenceNV,
            FD_glGetFenceivNV,
            FD_glFinishFenceNV,
            FD_glSetFenceNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glDeleteFencesNV = RuntimeHelper.downcall(Descriptors.FD_glDeleteFencesNV);
        public static final MethodHandle MH_glGenFencesNV = RuntimeHelper.downcall(Descriptors.FD_glGenFencesNV);
        public static final MethodHandle MH_glIsFenceNV = RuntimeHelper.downcall(Descriptors.FD_glIsFenceNV);
        public static final MethodHandle MH_glTestFenceNV = RuntimeHelper.downcall(Descriptors.FD_glTestFenceNV);
        public static final MethodHandle MH_glGetFenceivNV = RuntimeHelper.downcall(Descriptors.FD_glGetFenceivNV);
        public static final MethodHandle MH_glFinishFenceNV = RuntimeHelper.downcall(Descriptors.FD_glFinishFenceNV);
        public static final MethodHandle MH_glSetFenceNV = RuntimeHelper.downcall(Descriptors.FD_glSetFenceNV);
        public final MemorySegment PFN_glDeleteFencesNV;
        public final MemorySegment PFN_glGenFencesNV;
        public final MemorySegment PFN_glIsFenceNV;
        public final MemorySegment PFN_glTestFenceNV;
        public final MemorySegment PFN_glGetFenceivNV;
        public final MemorySegment PFN_glFinishFenceNV;
        public final MemorySegment PFN_glSetFenceNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDeleteFencesNV = func.invoke("glDeleteFencesNV");
            PFN_glGenFencesNV = func.invoke("glGenFencesNV");
            PFN_glIsFenceNV = func.invoke("glIsFenceNV");
            PFN_glTestFenceNV = func.invoke("glTestFenceNV");
            PFN_glGetFenceivNV = func.invoke("glGetFenceivNV");
            PFN_glFinishFenceNV = func.invoke("glFinishFenceNV");
            PFN_glSetFenceNV = func.invoke("glSetFenceNV");
        }
    }

    public GLNVFence(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DeleteFencesNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment fences) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteFencesNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteFencesNV");
        try { Handles.MH_glDeleteFencesNV.invokeExact(handles.PFN_glDeleteFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFencesNV", e); }
    }

    public void GenFencesNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment fences) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenFencesNV)) throw new SymbolNotFoundError("Symbol not found: glGenFencesNV");
        try { Handles.MH_glGenFencesNV.invokeExact(handles.PFN_glGenFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in glGenFencesNV", e); }
    }

    public @CType("GLboolean") boolean IsFenceNV(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsFenceNV)) throw new SymbolNotFoundError("Symbol not found: glIsFenceNV");
        try { return (boolean) Handles.MH_glIsFenceNV.invokeExact(handles.PFN_glIsFenceNV, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glIsFenceNV", e); }
    }

    public @CType("GLboolean") boolean TestFenceNV(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(handles.PFN_glTestFenceNV)) throw new SymbolNotFoundError("Symbol not found: glTestFenceNV");
        try { return (boolean) Handles.MH_glTestFenceNV.invokeExact(handles.PFN_glTestFenceNV, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glTestFenceNV", e); }
    }

    public void GetFenceivNV(@CType("GLuint") int fence, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFenceivNV)) throw new SymbolNotFoundError("Symbol not found: glGetFenceivNV");
        try { Handles.MH_glGetFenceivNV.invokeExact(handles.PFN_glGetFenceivNV, fence, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFenceivNV", e); }
    }

    public void FinishFenceNV(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(handles.PFN_glFinishFenceNV)) throw new SymbolNotFoundError("Symbol not found: glFinishFenceNV");
        try { Handles.MH_glFinishFenceNV.invokeExact(handles.PFN_glFinishFenceNV, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glFinishFenceNV", e); }
    }

    public void SetFenceNV(@CType("GLuint") int fence, @CType("GLenum") int condition) {
        if (Unmarshal.isNullPointer(handles.PFN_glSetFenceNV)) throw new SymbolNotFoundError("Symbol not found: glSetFenceNV");
        try { Handles.MH_glSetFenceNV.invokeExact(handles.PFN_glSetFenceNV, fence, condition); }
        catch (Throwable e) { throw new RuntimeException("error in glSetFenceNV", e); }
    }

}
