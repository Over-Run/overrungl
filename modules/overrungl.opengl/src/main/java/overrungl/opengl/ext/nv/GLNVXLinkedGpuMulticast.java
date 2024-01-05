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
 * {@code GL_NVX_linked_gpu_multicast}
 */
public final class GLNVXLinkedGpuMulticast {
    public static final int GL_LGPU_SEPARATE_STORAGE_BIT_NVX = 0x0800;
    public static final int GL_MAX_LGPU_GPUS_NVX = 0x92BA;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NVX_linked_gpu_multicast) return;
        ext.glLGPUNamedBufferSubDataNVX = load.invoke("glLGPUNamedBufferSubDataNVX", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glLGPUCopyImageSubDataNVX = load.invoke("glLGPUCopyImageSubDataNVX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glLGPUInterlockNVX = load.invoke("glLGPUInterlockNVX", ofVoid());
    }

    public static void glLGPUNamedBufferSubDataNVX(int gpuMask, int buffer, long offset, long size, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLGPUNamedBufferSubDataNVX).invokeExact(gpuMask, buffer, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLGPUCopyImageSubDataNVX(int sourceGpu, int destinationGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLGPUCopyImageSubDataNVX).invokeExact(sourceGpu, destinationGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLGPUInterlockNVX() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLGPUInterlockNVX).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
