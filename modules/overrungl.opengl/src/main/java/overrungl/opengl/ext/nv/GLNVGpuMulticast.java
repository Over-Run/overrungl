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
 * {@code GL_NV_gpu_multicast}
 */
public final class GLNVGpuMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x0800;
    public static final int GL_MULTICAST_GPUS_NV = 0x92BA;
    public static final int GL_RENDER_GPU_MASK_NV = 0x9558;
    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_gpu_multicast) return;
        ext.glRenderGpuMaskNV = load.invoke("glRenderGpuMaskNV", ofVoid(JAVA_INT));
        ext.glMulticastBufferSubDataNV = load.invoke("glMulticastBufferSubDataNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glMulticastCopyBufferSubDataNV = load.invoke("glMulticastCopyBufferSubDataNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glMulticastCopyImageSubDataNV = load.invoke("glMulticastCopyImageSubDataNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMulticastBlitFramebufferNV = load.invoke("glMulticastBlitFramebufferNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMulticastFramebufferSampleLocationsfvNV = load.invoke("glMulticastFramebufferSampleLocationsfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMulticastBarrierNV = load.invoke("glMulticastBarrierNV", ofVoid());
        ext.glMulticastWaitSyncNV = load.invoke("glMulticastWaitSyncNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glMulticastGetQueryObjectivNV = load.invoke("glMulticastGetQueryObjectivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMulticastGetQueryObjectuivNV = load.invoke("glMulticastGetQueryObjectuivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMulticastGetQueryObjecti64vNV = load.invoke("glMulticastGetQueryObjecti64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMulticastGetQueryObjectui64vNV = load.invoke("glMulticastGetQueryObjectui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glRenderGpuMaskNV(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRenderGpuMaskNV).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastBufferSubDataNV).invokeExact(gpuMask, buffer, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastCopyBufferSubDataNV(int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastCopyBufferSubDataNV).invokeExact(readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastCopyImageSubDataNV(int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastCopyImageSubDataNV).invokeExact(srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastBlitFramebufferNV(int srcGpu, int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastBlitFramebufferNV).invokeExact(srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastFramebufferSampleLocationsfvNV).invokeExact(gpu, framebuffer, start, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastBarrierNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastBarrierNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastWaitSyncNV(int signalGpu, int waitGpuMask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastWaitSyncNV).invokeExact(signalGpu, waitGpuMask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastGetQueryObjectivNV(int gpu, int id, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastGetQueryObjectivNV).invokeExact(gpu, id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastGetQueryObjectuivNV(int gpu, int id, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastGetQueryObjectuivNV).invokeExact(gpu, id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, @NativeType("GLint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastGetQueryObjecti64vNV).invokeExact(gpu, id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, @NativeType("GLuint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMulticastGetQueryObjectui64vNV).invokeExact(gpu, id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
