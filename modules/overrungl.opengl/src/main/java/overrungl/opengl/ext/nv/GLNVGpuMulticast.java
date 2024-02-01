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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_gpu_multicast}
 */
public interface GLNVGpuMulticast {
    int GL_PER_GPU_STORAGE_BIT_NV = 0x0800;
    int GL_MULTICAST_GPUS_NV = 0x92BA;
    int GL_RENDER_GPU_MASK_NV = 0x9558;
    int GL_PER_GPU_STORAGE_NV = 0x9548;
    int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;

    void glRenderGpuMaskNV(int mask);
    void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, @NativeType("const void *") MemorySegment data);
    void glMulticastCopyBufferSubDataNV(int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size);
    void glMulticastCopyImageSubDataNV(int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);
    void glMulticastBlitFramebufferNV(int srcGpu, int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);
    void glMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, @NativeType("const GLfloat *") MemorySegment v);
    void glMulticastBarrierNV();
    void glMulticastWaitSyncNV(int signalGpu, int waitGpuMask);
    void glMulticastGetQueryObjectivNV(int gpu, int id, int pname, @NativeType("GLint *") MemorySegment params);
    void glMulticastGetQueryObjectuivNV(int gpu, int id, int pname, @NativeType("GLuint *") MemorySegment params);
    void glMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, @NativeType("GLint64 *") MemorySegment params);
    void glMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, @NativeType("GLuint64 *") MemorySegment params);
}
