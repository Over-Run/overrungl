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

public final class GLNVXGpuMulticast2 {
    public static final int GL_UPLOAD_GPU_MASK_NVX = 0x954A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUploadGpuMaskNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastViewportArrayvNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastViewportPositionWScaleNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMulticastScissorArrayvNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glAsyncCopyBufferSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glAsyncCopyImageSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUploadGpuMaskNVX;
        public final MemorySegment PFN_glMulticastViewportArrayvNVX;
        public final MemorySegment PFN_glMulticastViewportPositionWScaleNVX;
        public final MemorySegment PFN_glMulticastScissorArrayvNVX;
        public final MemorySegment PFN_glAsyncCopyBufferSubDataNVX;
        public final MemorySegment PFN_glAsyncCopyImageSubDataNVX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glUploadGpuMaskNVX = func.invoke("glUploadGpuMaskNVX");
            PFN_glMulticastViewportArrayvNVX = func.invoke("glMulticastViewportArrayvNVX");
            PFN_glMulticastViewportPositionWScaleNVX = func.invoke("glMulticastViewportPositionWScaleNVX");
            PFN_glMulticastScissorArrayvNVX = func.invoke("glMulticastScissorArrayvNVX");
            PFN_glAsyncCopyBufferSubDataNVX = func.invoke("glAsyncCopyBufferSubDataNVX");
            PFN_glAsyncCopyImageSubDataNVX = func.invoke("glAsyncCopyImageSubDataNVX");
        }
    }

    public GLNVXGpuMulticast2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void UploadGpuMaskNVX(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glUploadGpuMaskNVX)) throw new SymbolNotFoundError("Symbol not found: glUploadGpuMaskNVX");
        try { Handles.MH_glUploadGpuMaskNVX.invokeExact(handles.PFN_glUploadGpuMaskNVX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glUploadGpuMaskNVX", e); }
    }

    public void MulticastViewportArrayvNVX(@CType("GLuint") int gpu, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastViewportArrayvNVX)) throw new SymbolNotFoundError("Symbol not found: glMulticastViewportArrayvNVX");
        try { Handles.MH_glMulticastViewportArrayvNVX.invokeExact(handles.PFN_glMulticastViewportArrayvNVX, gpu, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastViewportArrayvNVX", e); }
    }

    public void MulticastViewportPositionWScaleNVX(@CType("GLuint") int gpu, @CType("GLuint") int index, @CType("GLfloat") float xcoeff, @CType("GLfloat") float ycoeff) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastViewportPositionWScaleNVX)) throw new SymbolNotFoundError("Symbol not found: glMulticastViewportPositionWScaleNVX");
        try { Handles.MH_glMulticastViewportPositionWScaleNVX.invokeExact(handles.PFN_glMulticastViewportPositionWScaleNVX, gpu, index, xcoeff, ycoeff); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastViewportPositionWScaleNVX", e); }
    }

    public void MulticastScissorArrayvNVX(@CType("GLuint") int gpu, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastScissorArrayvNVX)) throw new SymbolNotFoundError("Symbol not found: glMulticastScissorArrayvNVX");
        try { Handles.MH_glMulticastScissorArrayvNVX.invokeExact(handles.PFN_glMulticastScissorArrayvNVX, gpu, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastScissorArrayvNVX", e); }
    }

    public @CType("GLuint") int AsyncCopyBufferSubDataNVX(@CType("GLsizei") int waitSemaphoreCount, @CType("const GLuint *") MemorySegment waitSemaphoreArray, @CType("const GLuint64 *") MemorySegment fenceValueArray, @CType("GLuint") int readGpu, @CType("GLbitfield") int writeGpuMask, @CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size, @CType("GLsizei") int signalSemaphoreCount, @CType("const GLuint *") MemorySegment signalSemaphoreArray, @CType("const GLuint64 *") MemorySegment signalValueArray) {
        if (Unmarshal.isNullPointer(handles.PFN_glAsyncCopyBufferSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glAsyncCopyBufferSubDataNVX");
        try { return (int) Handles.MH_glAsyncCopyBufferSubDataNVX.invokeExact(handles.PFN_glAsyncCopyBufferSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncCopyBufferSubDataNVX", e); }
    }

    public @CType("GLuint") int AsyncCopyImageSubDataNVX(@CType("GLsizei") int waitSemaphoreCount, @CType("const GLuint *") MemorySegment waitSemaphoreArray, @CType("const GLuint64 *") MemorySegment waitValueArray, @CType("GLuint") int srcGpu, @CType("GLbitfield") int dstGpuMask, @CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srcY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int srcWidth, @CType("GLsizei") int srcHeight, @CType("GLsizei") int srcDepth, @CType("GLsizei") int signalSemaphoreCount, @CType("const GLuint *") MemorySegment signalSemaphoreArray, @CType("const GLuint64 *") MemorySegment signalValueArray) {
        if (Unmarshal.isNullPointer(handles.PFN_glAsyncCopyImageSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glAsyncCopyImageSubDataNVX");
        try { return (int) Handles.MH_glAsyncCopyImageSubDataNVX.invokeExact(handles.PFN_glAsyncCopyImageSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncCopyImageSubDataNVX", e); }
    }

}
