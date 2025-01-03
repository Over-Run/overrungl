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
    public static final MethodHandle MH_glUploadGpuMaskNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUploadGpuMaskNVX;
    public static final MethodHandle MH_glMulticastViewportArrayvNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastViewportArrayvNVX;
    public static final MethodHandle MH_glMulticastViewportPositionWScaleNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMulticastViewportPositionWScaleNVX;
    public static final MethodHandle MH_glMulticastScissorArrayvNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastScissorArrayvNVX;
    public static final MethodHandle MH_glAsyncCopyBufferSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glAsyncCopyBufferSubDataNVX;
    public static final MethodHandle MH_glAsyncCopyImageSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glAsyncCopyImageSubDataNVX;

    public GLNVXGpuMulticast2(overrungl.opengl.GLLoadFunc func) {
        PFN_glUploadGpuMaskNVX = func.invoke("glUploadGpuMaskNVX");
        PFN_glMulticastViewportArrayvNVX = func.invoke("glMulticastViewportArrayvNVX");
        PFN_glMulticastViewportPositionWScaleNVX = func.invoke("glMulticastViewportPositionWScaleNVX");
        PFN_glMulticastScissorArrayvNVX = func.invoke("glMulticastScissorArrayvNVX");
        PFN_glAsyncCopyBufferSubDataNVX = func.invoke("glAsyncCopyBufferSubDataNVX");
        PFN_glAsyncCopyImageSubDataNVX = func.invoke("glAsyncCopyImageSubDataNVX");
    }

    public void UploadGpuMaskNVX(@CType("GLbitfield") int mask) {
        try { if (!Unmarshal.isNullPointer(PFN_glUploadGpuMaskNVX))
            MH_glUploadGpuMaskNVX.invokeExact(PFN_glUploadGpuMaskNVX, mask);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUploadGpuMaskNVX", e); }
    }

    public void MulticastViewportArrayvNVX(@CType("GLuint") int gpu, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glMulticastViewportArrayvNVX))
            MH_glMulticastViewportArrayvNVX.invokeExact(PFN_glMulticastViewportArrayvNVX, gpu, first, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastViewportArrayvNVX", e); }
    }

    public void MulticastViewportPositionWScaleNVX(@CType("GLuint") int gpu, @CType("GLuint") int index, @CType("GLfloat") float xcoeff, @CType("GLfloat") float ycoeff) {
        try { if (!Unmarshal.isNullPointer(PFN_glMulticastViewportPositionWScaleNVX))
            MH_glMulticastViewportPositionWScaleNVX.invokeExact(PFN_glMulticastViewportPositionWScaleNVX, gpu, index, xcoeff, ycoeff);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastViewportPositionWScaleNVX", e); }
    }

    public void MulticastScissorArrayvNVX(@CType("GLuint") int gpu, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glMulticastScissorArrayvNVX))
            MH_glMulticastScissorArrayvNVX.invokeExact(PFN_glMulticastScissorArrayvNVX, gpu, first, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastScissorArrayvNVX", e); }
    }

    public @CType("GLuint") int AsyncCopyBufferSubDataNVX(@CType("GLsizei") int waitSemaphoreCount, @CType("const GLuint *") java.lang.foreign.MemorySegment waitSemaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment fenceValueArray, @CType("GLuint") int readGpu, @CType("GLbitfield") int writeGpuMask, @CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size, @CType("GLsizei") int signalSemaphoreCount, @CType("const GLuint *") java.lang.foreign.MemorySegment signalSemaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment signalValueArray) {
        try { if (!Unmarshal.isNullPointer(PFN_glAsyncCopyBufferSubDataNVX))
            return (int) MH_glAsyncCopyBufferSubDataNVX.invokeExact(PFN_glAsyncCopyBufferSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncCopyBufferSubDataNVX", e); }
    }

    public @CType("GLuint") int AsyncCopyImageSubDataNVX(@CType("GLsizei") int waitSemaphoreCount, @CType("const GLuint *") java.lang.foreign.MemorySegment waitSemaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment waitValueArray, @CType("GLuint") int srcGpu, @CType("GLbitfield") int dstGpuMask, @CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srcY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int srcWidth, @CType("GLsizei") int srcHeight, @CType("GLsizei") int srcDepth, @CType("GLsizei") int signalSemaphoreCount, @CType("const GLuint *") java.lang.foreign.MemorySegment signalSemaphoreArray, @CType("const GLuint64 *") java.lang.foreign.MemorySegment signalValueArray) {
        try { if (!Unmarshal.isNullPointer(PFN_glAsyncCopyImageSubDataNVX))
            return (int) MH_glAsyncCopyImageSubDataNVX.invokeExact(PFN_glAsyncCopyImageSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glAsyncCopyImageSubDataNVX", e); }
    }

}
