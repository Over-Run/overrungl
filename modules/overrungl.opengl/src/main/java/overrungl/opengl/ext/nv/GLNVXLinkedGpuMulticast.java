/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
 * {@code GL_NVX_linked_gpu_multicast}
 */
public interface GLNVXLinkedGpuMulticast extends overrun.marshal.DirectAccess {
    int GL_LGPU_SEPARATE_STORAGE_BIT_NVX = 0x0800;
    int GL_MAX_LGPU_GPUS_NVX = 0x92BA;

    default void glLGPUNamedBufferSubDataNVX(int gpuMask, int buffer, long offset, long size, @NativeType("const void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glLGPUCopyImageSubDataNVX(int sourceGpu, int destinationGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
        throw new ContextException();
    }

    default void glLGPUInterlockNVX() {
        throw new ContextException();
    }

}
