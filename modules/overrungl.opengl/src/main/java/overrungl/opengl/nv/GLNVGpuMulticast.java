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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVGpuMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x0800;
    public static final int GL_MULTICAST_GPUS_NV = 0x92BA;
    public static final int GL_RENDER_GPU_MASK_NV = 0x9558;
    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderGpuMaskNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastBufferSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastCopyBufferSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMulticastCopyImageSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastBlitFramebufferNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastFramebufferSampleLocationsfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastBarrierNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glMulticastWaitSyncNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastGetQueryObjectivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjectuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjecti64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjectui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glRenderGpuMaskNV;
        public final MemorySegment PFN_glMulticastBufferSubDataNV;
        public final MemorySegment PFN_glMulticastCopyBufferSubDataNV;
        public final MemorySegment PFN_glMulticastCopyImageSubDataNV;
        public final MemorySegment PFN_glMulticastBlitFramebufferNV;
        public final MemorySegment PFN_glMulticastFramebufferSampleLocationsfvNV;
        public final MemorySegment PFN_glMulticastBarrierNV;
        public final MemorySegment PFN_glMulticastWaitSyncNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectivNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectuivNV;
        public final MemorySegment PFN_glMulticastGetQueryObjecti64vNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectui64vNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glRenderGpuMaskNV = func.invoke("glRenderGpuMaskNV");
            PFN_glMulticastBufferSubDataNV = func.invoke("glMulticastBufferSubDataNV");
            PFN_glMulticastCopyBufferSubDataNV = func.invoke("glMulticastCopyBufferSubDataNV");
            PFN_glMulticastCopyImageSubDataNV = func.invoke("glMulticastCopyImageSubDataNV");
            PFN_glMulticastBlitFramebufferNV = func.invoke("glMulticastBlitFramebufferNV");
            PFN_glMulticastFramebufferSampleLocationsfvNV = func.invoke("glMulticastFramebufferSampleLocationsfvNV");
            PFN_glMulticastBarrierNV = func.invoke("glMulticastBarrierNV");
            PFN_glMulticastWaitSyncNV = func.invoke("glMulticastWaitSyncNV");
            PFN_glMulticastGetQueryObjectivNV = func.invoke("glMulticastGetQueryObjectivNV");
            PFN_glMulticastGetQueryObjectuivNV = func.invoke("glMulticastGetQueryObjectuivNV");
            PFN_glMulticastGetQueryObjecti64vNV = func.invoke("glMulticastGetQueryObjecti64vNV");
            PFN_glMulticastGetQueryObjectui64vNV = func.invoke("glMulticastGetQueryObjectui64vNV");
        }
    }

    public GLNVGpuMulticast(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glRenderGpuMaskNV(unsigned int mask);
    /// ```
    public void RenderGpuMaskNV(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderGpuMaskNV)) throw new SymbolNotFoundError("Symbol not found: glRenderGpuMaskNV");
        try { Handles.MH_glRenderGpuMaskNV.invokeExact(handles.PFN_glRenderGpuMaskNV, mask); }
        catch (Throwable e) { throw new RuntimeException("error in RenderGpuMaskNV", e); }
    }

    /// ```
    /// void glMulticastBufferSubDataNV(unsigned int gpuMask, unsigned int buffer, signed long long offset, signed long long size, const void* data);
    /// ```
    public void MulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBufferSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBufferSubDataNV");
        try { Handles.MH_glMulticastBufferSubDataNV.invokeExact(handles.PFN_glMulticastBufferSubDataNV, gpuMask, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBufferSubDataNV", e); }
    }

    /// ```
    /// void glMulticastCopyBufferSubDataNV(unsigned int readGpu, unsigned int writeGpuMask, unsigned int readBuffer, unsigned int writeBuffer, signed long long readOffset, signed long long writeOffset, signed long long size);
    /// ```
    public void MulticastCopyBufferSubDataNV(int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastCopyBufferSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastCopyBufferSubDataNV");
        try { Handles.MH_glMulticastCopyBufferSubDataNV.invokeExact(handles.PFN_glMulticastCopyBufferSubDataNV, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastCopyBufferSubDataNV", e); }
    }

    /// ```
    /// void glMulticastCopyImageSubDataNV(unsigned int srcGpu, unsigned int dstGpuMask, unsigned int srcName, unsigned int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, unsigned int dstName, unsigned int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);
    /// ```
    public void MulticastCopyImageSubDataNV(int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastCopyImageSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastCopyImageSubDataNV");
        try { Handles.MH_glMulticastCopyImageSubDataNV.invokeExact(handles.PFN_glMulticastCopyImageSubDataNV, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastCopyImageSubDataNV", e); }
    }

    /// ```
    /// void glMulticastBlitFramebufferNV(unsigned int srcGpu, unsigned int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, unsigned int mask, unsigned int filter);
    /// ```
    public void MulticastBlitFramebufferNV(int srcGpu, int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBlitFramebufferNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBlitFramebufferNV");
        try { Handles.MH_glMulticastBlitFramebufferNV.invokeExact(handles.PFN_glMulticastBlitFramebufferNV, srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBlitFramebufferNV", e); }
    }

    /// ```
    /// void glMulticastFramebufferSampleLocationsfvNV(unsigned int gpu, unsigned int framebuffer, unsigned int start, int count, const GLfloat* v);
    /// ```
    public void MulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastFramebufferSampleLocationsfvNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastFramebufferSampleLocationsfvNV");
        try { Handles.MH_glMulticastFramebufferSampleLocationsfvNV.invokeExact(handles.PFN_glMulticastFramebufferSampleLocationsfvNV, gpu, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastFramebufferSampleLocationsfvNV", e); }
    }

    /// ```
    /// void glMulticastBarrierNV();
    /// ```
    public void MulticastBarrierNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBarrierNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBarrierNV");
        try { Handles.MH_glMulticastBarrierNV.invokeExact(handles.PFN_glMulticastBarrierNV); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBarrierNV", e); }
    }

    /// ```
    /// void glMulticastWaitSyncNV(unsigned int signalGpu, unsigned int waitGpuMask);
    /// ```
    public void MulticastWaitSyncNV(int signalGpu, int waitGpuMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastWaitSyncNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastWaitSyncNV");
        try { Handles.MH_glMulticastWaitSyncNV.invokeExact(handles.PFN_glMulticastWaitSyncNV, signalGpu, waitGpuMask); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastWaitSyncNV", e); }
    }

    /// ```
    /// void glMulticastGetQueryObjectivNV(unsigned int gpu, unsigned int id, unsigned int pname, GLint* params);
    /// ```
    public void MulticastGetQueryObjectivNV(int gpu, int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectivNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectivNV");
        try { Handles.MH_glMulticastGetQueryObjectivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectivNV", e); }
    }

    /// ```
    /// void glMulticastGetQueryObjectuivNV(unsigned int gpu, unsigned int id, unsigned int pname, GLuint* params);
    /// ```
    public void MulticastGetQueryObjectuivNV(int gpu, int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectuivNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectuivNV");
        try { Handles.MH_glMulticastGetQueryObjectuivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectuivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectuivNV", e); }
    }

    /// ```
    /// void glMulticastGetQueryObjecti64vNV(unsigned int gpu, unsigned int id, unsigned int pname, GLint64* params);
    /// ```
    public void MulticastGetQueryObjecti64vNV(int gpu, int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjecti64vNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjecti64vNV");
        try { Handles.MH_glMulticastGetQueryObjecti64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjecti64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjecti64vNV", e); }
    }

    /// ```
    /// void glMulticastGetQueryObjectui64vNV(unsigned int gpu, unsigned int id, unsigned int pname, GLuint64* params);
    /// ```
    public void MulticastGetQueryObjectui64vNV(int gpu, int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectui64vNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectui64vNV");
        try { Handles.MH_glMulticastGetQueryObjectui64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjectui64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectui64vNV", e); }
    }

}
