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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBMultiBind {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindBuffersBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindBuffersRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindImageTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBindBuffersBase;
        public final MemorySegment PFN_glBindBuffersRange;
        public final MemorySegment PFN_glBindTextures;
        public final MemorySegment PFN_glBindSamplers;
        public final MemorySegment PFN_glBindImageTextures;
        public final MemorySegment PFN_glBindVertexBuffers;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindBuffersBase = func.invoke("glBindBuffersBase");
            PFN_glBindBuffersRange = func.invoke("glBindBuffersRange");
            PFN_glBindTextures = func.invoke("glBindTextures");
            PFN_glBindSamplers = func.invoke("glBindSamplers");
            PFN_glBindImageTextures = func.invoke("glBindImageTextures");
            PFN_glBindVertexBuffers = func.invoke("glBindVertexBuffers");
        }
    }

    public GLARBMultiBind(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindBuffersBase(unsigned int target, unsigned int first, int count, const GLuint* buffers);
    /// ```
    public void BindBuffersBase(int target, int first, int count, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffersBase)) throw new SymbolNotFoundError("Symbol not found: glBindBuffersBase");
        try { Handles.MH_glBindBuffersBase.invokeExact(handles.PFN_glBindBuffersBase, target, first, count, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffersBase", e); }
    }

    /// ```
    /// void glBindBuffersRange(unsigned int target, unsigned int first, int count, const GLuint* buffers, const GLintptr* offsets, const GLsizeiptr* sizes);
    /// ```
    public void BindBuffersRange(int target, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment sizes) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffersRange)) throw new SymbolNotFoundError("Symbol not found: glBindBuffersRange");
        try { Handles.MH_glBindBuffersRange.invokeExact(handles.PFN_glBindBuffersRange, target, first, count, buffers, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffersRange", e); }
    }

    /// ```
    /// void glBindTextures(unsigned int first, int count, const GLuint* textures);
    /// ```
    public void BindTextures(int first, int count, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextures)) throw new SymbolNotFoundError("Symbol not found: glBindTextures");
        try { Handles.MH_glBindTextures.invokeExact(handles.PFN_glBindTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextures", e); }
    }

    /// ```
    /// void glBindSamplers(unsigned int first, int count, const GLuint* samplers);
    /// ```
    public void BindSamplers(int first, int count, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindSamplers)) throw new SymbolNotFoundError("Symbol not found: glBindSamplers");
        try { Handles.MH_glBindSamplers.invokeExact(handles.PFN_glBindSamplers, first, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in BindSamplers", e); }
    }

    /// ```
    /// void glBindImageTextures(unsigned int first, int count, const GLuint* textures);
    /// ```
    public void BindImageTextures(int first, int count, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindImageTextures)) throw new SymbolNotFoundError("Symbol not found: glBindImageTextures");
        try { Handles.MH_glBindImageTextures.invokeExact(handles.PFN_glBindImageTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageTextures", e); }
    }

    /// ```
    /// void glBindVertexBuffers(unsigned int first, int count, const GLuint* buffers, const GLintptr* offsets, const GLsizei* strides);
    /// ```
    public void BindVertexBuffers(int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: glBindVertexBuffers");
        try { Handles.MH_glBindVertexBuffers.invokeExact(handles.PFN_glBindVertexBuffers, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexBuffers", e); }
    }

}
