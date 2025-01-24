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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVXLinkedGpuMulticast {
    public static final int GL_LGPU_SEPARATE_STORAGE_BIT_NVX = 0x0800;
    public static final int GL_MAX_LGPU_GPUS_NVX = 0x92BA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glLGPUNamedBufferSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLGPUCopyImageSubDataNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLGPUInterlockNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glLGPUNamedBufferSubDataNVX;
        public final MemorySegment PFN_glLGPUCopyImageSubDataNVX;
        public final MemorySegment PFN_glLGPUInterlockNVX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLGPUNamedBufferSubDataNVX = func.invoke("glLGPUNamedBufferSubDataNVX");
            PFN_glLGPUCopyImageSubDataNVX = func.invoke("glLGPUCopyImageSubDataNVX");
            PFN_glLGPUInterlockNVX = func.invoke("glLGPUInterlockNVX");
        }
    }

    public GLNVXLinkedGpuMulticast(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glLGPUNamedBufferSubDataNVX(unsigned int gpuMask, unsigned int buffer, signed long long offset, signed long long size, const void* data);
    /// ```
    public void LGPUNamedBufferSubDataNVX(int gpuMask, int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLGPUNamedBufferSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUNamedBufferSubDataNVX");
        try { Handles.MH_glLGPUNamedBufferSubDataNVX.invokeExact(handles.PFN_glLGPUNamedBufferSubDataNVX, gpuMask, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in LGPUNamedBufferSubDataNVX", e); }
    }

    /// ```
    /// void glLGPUCopyImageSubDataNVX(unsigned int sourceGpu, unsigned int destinationGpuMask, unsigned int srcName, unsigned int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, unsigned int dstName, unsigned int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth);
    /// ```
    public void LGPUCopyImageSubDataNVX(int sourceGpu, int destinationGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLGPUCopyImageSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUCopyImageSubDataNVX");
        try { Handles.MH_glLGPUCopyImageSubDataNVX.invokeExact(handles.PFN_glLGPUCopyImageSubDataNVX, sourceGpu, destinationGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in LGPUCopyImageSubDataNVX", e); }
    }

    /// ```
    /// void glLGPUInterlockNVX();
    /// ```
    public void LGPUInterlockNVX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glLGPUInterlockNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUInterlockNVX");
        try { Handles.MH_glLGPUInterlockNVX.invokeExact(handles.PFN_glLGPUInterlockNVX); }
        catch (Throwable e) { throw new RuntimeException("error in LGPUInterlockNVX", e); }
    }

}
