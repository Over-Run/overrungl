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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVGpuMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x0800;
    public static final int GL_MULTICAST_GPUS_NV = 0x92BA;
    public static final int GL_RENDER_GPU_MASK_NV = 0x9558;
    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glRenderGpuMaskNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMulticastBufferSubDataNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMulticastCopyBufferSubDataNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glMulticastCopyImageSubDataNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMulticastBlitFramebufferNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMulticastFramebufferSampleLocationsfvNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMulticastBarrierNV = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glMulticastWaitSyncNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMulticastGetQueryObjectivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMulticastGetQueryObjectuivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMulticastGetQueryObjecti64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMulticastGetQueryObjectui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glRenderGpuMaskNV = RuntimeHelper.downcall(Descriptors.FD_glRenderGpuMaskNV);
        public static final MethodHandle MH_glMulticastBufferSubDataNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastBufferSubDataNV);
        public static final MethodHandle MH_glMulticastCopyBufferSubDataNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastCopyBufferSubDataNV);
        public static final MethodHandle MH_glMulticastCopyImageSubDataNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastCopyImageSubDataNV);
        public static final MethodHandle MH_glMulticastBlitFramebufferNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastBlitFramebufferNV);
        public static final MethodHandle MH_glMulticastFramebufferSampleLocationsfvNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastFramebufferSampleLocationsfvNV);
        public static final MethodHandle MH_glMulticastBarrierNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastBarrierNV);
        public static final MethodHandle MH_glMulticastWaitSyncNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastWaitSyncNV);
        public static final MethodHandle MH_glMulticastGetQueryObjectivNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastGetQueryObjectivNV);
        public static final MethodHandle MH_glMulticastGetQueryObjectuivNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastGetQueryObjectuivNV);
        public static final MethodHandle MH_glMulticastGetQueryObjecti64vNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastGetQueryObjecti64vNV);
        public static final MethodHandle MH_glMulticastGetQueryObjectui64vNV = RuntimeHelper.downcall(Descriptors.FD_glMulticastGetQueryObjectui64vNV);
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

    public void RenderGpuMaskNV(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderGpuMaskNV)) throw new SymbolNotFoundError("Symbol not found: glRenderGpuMaskNV");
        try { Handles.MH_glRenderGpuMaskNV.invokeExact(handles.PFN_glRenderGpuMaskNV, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderGpuMaskNV", e); }
    }

    public void MulticastBufferSubDataNV(@CType("GLbitfield") int gpuMask, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastBufferSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBufferSubDataNV");
        try { Handles.MH_glMulticastBufferSubDataNV.invokeExact(handles.PFN_glMulticastBufferSubDataNV, gpuMask, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastBufferSubDataNV", e); }
    }

    public void MulticastCopyBufferSubDataNV(@CType("GLuint") int readGpu, @CType("GLbitfield") int writeGpuMask, @CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastCopyBufferSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastCopyBufferSubDataNV");
        try { Handles.MH_glMulticastCopyBufferSubDataNV.invokeExact(handles.PFN_glMulticastCopyBufferSubDataNV, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastCopyBufferSubDataNV", e); }
    }

    public void MulticastCopyImageSubDataNV(@CType("GLuint") int srcGpu, @CType("GLbitfield") int dstGpuMask, @CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srcY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int srcWidth, @CType("GLsizei") int srcHeight, @CType("GLsizei") int srcDepth) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastCopyImageSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastCopyImageSubDataNV");
        try { Handles.MH_glMulticastCopyImageSubDataNV.invokeExact(handles.PFN_glMulticastCopyImageSubDataNV, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastCopyImageSubDataNV", e); }
    }

    public void MulticastBlitFramebufferNV(@CType("GLuint") int srcGpu, @CType("GLuint") int dstGpu, @CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastBlitFramebufferNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBlitFramebufferNV");
        try { Handles.MH_glMulticastBlitFramebufferNV.invokeExact(handles.PFN_glMulticastBlitFramebufferNV, srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastBlitFramebufferNV", e); }
    }

    public void MulticastFramebufferSampleLocationsfvNV(@CType("GLuint") int gpu, @CType("GLuint") int framebuffer, @CType("GLuint") int start, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastFramebufferSampleLocationsfvNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastFramebufferSampleLocationsfvNV");
        try { Handles.MH_glMulticastFramebufferSampleLocationsfvNV.invokeExact(handles.PFN_glMulticastFramebufferSampleLocationsfvNV, gpu, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastFramebufferSampleLocationsfvNV", e); }
    }

    public void MulticastBarrierNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastBarrierNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastBarrierNV");
        try { Handles.MH_glMulticastBarrierNV.invokeExact(handles.PFN_glMulticastBarrierNV); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastBarrierNV", e); }
    }

    public void MulticastWaitSyncNV(@CType("GLuint") int signalGpu, @CType("GLbitfield") int waitGpuMask) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastWaitSyncNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastWaitSyncNV");
        try { Handles.MH_glMulticastWaitSyncNV.invokeExact(handles.PFN_glMulticastWaitSyncNV, signalGpu, waitGpuMask); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastWaitSyncNV", e); }
    }

    public void MulticastGetQueryObjectivNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastGetQueryObjectivNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectivNV");
        try { Handles.MH_glMulticastGetQueryObjectivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectivNV", e); }
    }

    public void MulticastGetQueryObjectuivNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastGetQueryObjectuivNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectuivNV");
        try { Handles.MH_glMulticastGetQueryObjectuivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectuivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectuivNV", e); }
    }

    public void MulticastGetQueryObjecti64vNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastGetQueryObjecti64vNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjecti64vNV");
        try { Handles.MH_glMulticastGetQueryObjecti64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjecti64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjecti64vNV", e); }
    }

    public void MulticastGetQueryObjectui64vNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMulticastGetQueryObjectui64vNV)) throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectui64vNV");
        try { Handles.MH_glMulticastGetQueryObjectui64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjectui64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectui64vNV", e); }
    }

}
