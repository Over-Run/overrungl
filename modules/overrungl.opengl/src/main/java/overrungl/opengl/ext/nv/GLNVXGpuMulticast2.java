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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NVX_gpu_multicast2}
 */
public interface GLNVXGpuMulticast2 {
    int GL_UPLOAD_GPU_MASK_NVX = 0x954A;

    default void glUploadGpuMaskNVX(int mask) {
        throw new ContextException();
    }

    default void glMulticastViewportArrayvNVX(int gpu, int first, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glMulticastViewportPositionWScaleNVX(int gpu, int index, float xcoeff, float ycoeff) {
        throw new ContextException();
    }

    default void glMulticastScissorArrayvNVX(int gpu, int first, int count, @NativeType("const GLint *") MemorySegment v) {
        throw new ContextException();
    }

    default int glAsyncCopyBufferSubDataNVX(int waitSemaphoreCount, @NativeType("const GLuint *") MemorySegment waitSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, @NativeType("const GLuint *") MemorySegment signalSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment signalValueArray) {
        throw new ContextException();
    }

    default int glAsyncCopyImageSubDataNVX(int waitSemaphoreCount, @NativeType("const GLuint *") MemorySegment waitSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, @NativeType("const GLuint *") MemorySegment signalSemaphoreArray, @NativeType("const GLuint64 *") MemorySegment signalValueArray) {
        throw new ContextException();
    }

}
