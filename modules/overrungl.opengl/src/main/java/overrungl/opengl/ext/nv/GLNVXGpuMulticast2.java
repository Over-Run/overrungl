/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NVX_gpu_multicast2}
 */
public final class GLNVXGpuMulticast2 {
    public static final int GL_UPLOAD_GPU_MASK_NVX = 0x954A;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NVX_gpu_multicast2) return;
        ext.glUploadGpuMaskNVX = load.invoke("glUploadGpuMaskNVX", ofVoid(JAVA_INT));
        ext.glMulticastViewportArrayvNVX = load.invoke("glMulticastViewportArrayvNVX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMulticastViewportPositionWScaleNVX = load.invoke("glMulticastViewportPositionWScaleNVX", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glMulticastScissorArrayvNVX = load.invoke("glMulticastScissorArrayvNVX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glAsyncCopyBufferSubDataNVX = load.invoke("glAsyncCopyBufferSubDataNVX", of(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS));
        ext.glAsyncCopyImageSubDataNVX = load.invoke("glAsyncCopyImageSubDataNVX", of(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glUploadGpuMaskNVX(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUploadGpuMaskNVX).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastViewportArrayvNVX(int gpu, int first, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastViewportArrayvNVX).invokeExact(gpu, first, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastViewportPositionWScaleNVX(int gpu, int index, float xcoeff, float ycoeff) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastViewportPositionWScaleNVX).invokeExact(gpu, index, xcoeff, ycoeff);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastScissorArrayvNVX(int gpu, int first, int count, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastScissorArrayvNVX).invokeExact(gpu, first, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glAsyncCopyBufferSubDataNVX(int waitSemaphoreCount, @NativeType("const GLuint *") MemorySegment waitSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, @NativeType("const GLuint *") MemorySegment signalSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment signalValueArray) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glAsyncCopyBufferSubDataNVX).invokeExact(waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glAsyncCopyImageSubDataNVX(int waitSemaphoreCount, @NativeType("const GLuint *") MemorySegment waitSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, @NativeType("const GLuint *") MemorySegment signalSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment signalValueArray) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glAsyncCopyImageSubDataNVX).invokeExact(waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
