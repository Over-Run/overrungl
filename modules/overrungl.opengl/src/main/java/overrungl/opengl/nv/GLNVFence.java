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

public final class GLNVFence {
    public static final int GL_ALL_COMPLETED_NV = 0x84F2;
    public static final int GL_FENCE_STATUS_NV = 0x84F3;
    public static final int GL_FENCE_CONDITION_NV = 0x84F4;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDeleteFencesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenFencesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsFenceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTestFenceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFenceivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFinishFenceNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSetFenceNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glDeleteFencesNV((int) GLsizei n, const GLuint* fences);
    /// ```
    public void DeleteFencesNV(int n, MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFencesNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteFencesNV");
        try { Handles.MH_glDeleteFencesNV.invokeExact(handles.PFN_glDeleteFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFencesNV", e); }
    }

    /// ```
    /// void glGenFencesNV((int) GLsizei n, GLuint* fences);
    /// ```
    public void GenFencesNV(int n, MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFencesNV)) throw new SymbolNotFoundError("Symbol not found: glGenFencesNV");
        try { Handles.MH_glGenFencesNV.invokeExact(handles.PFN_glGenFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in GenFencesNV", e); }
    }

    /// ```
    /// GLboolean glIsFenceNV((unsigned int) GLuint fence);
    /// ```
    public boolean IsFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFenceNV)) throw new SymbolNotFoundError("Symbol not found: glIsFenceNV");
        try { return (((byte) Handles.MH_glIsFenceNV.invokeExact(handles.PFN_glIsFenceNV, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFenceNV", e); }
    }

    /// ```
    /// GLboolean glTestFenceNV((unsigned int) GLuint fence);
    /// ```
    public boolean TestFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestFenceNV)) throw new SymbolNotFoundError("Symbol not found: glTestFenceNV");
        try { return (((byte) Handles.MH_glTestFenceNV.invokeExact(handles.PFN_glTestFenceNV, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestFenceNV", e); }
    }

    /// ```
    /// void glGetFenceivNV((unsigned int) GLuint fence, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFenceivNV(int fence, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFenceivNV)) throw new SymbolNotFoundError("Symbol not found: glGetFenceivNV");
        try { Handles.MH_glGetFenceivNV.invokeExact(handles.PFN_glGetFenceivNV, fence, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFenceivNV", e); }
    }

    /// ```
    /// void glFinishFenceNV((unsigned int) GLuint fence);
    /// ```
    public void FinishFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishFenceNV)) throw new SymbolNotFoundError("Symbol not found: glFinishFenceNV");
        try { Handles.MH_glFinishFenceNV.invokeExact(handles.PFN_glFinishFenceNV, fence); }
        catch (Throwable e) { throw new RuntimeException("error in FinishFenceNV", e); }
    }

    /// ```
    /// void glSetFenceNV((unsigned int) GLuint fence, (unsigned int) GLenum condition);
    /// ```
    public void SetFenceNV(int fence, int condition) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetFenceNV)) throw new SymbolNotFoundError("Symbol not found: glSetFenceNV");
        try { Handles.MH_glSetFenceNV.invokeExact(handles.PFN_glSetFenceNV, fence, condition); }
        catch (Throwable e) { throw new RuntimeException("error in SetFenceNV", e); }
    }

}
