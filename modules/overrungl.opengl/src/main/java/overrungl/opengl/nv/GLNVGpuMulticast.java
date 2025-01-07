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
    public static final MethodHandle MH_glRenderGpuMaskNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRenderGpuMaskNV;
    public static final MethodHandle MH_glMulticastBufferSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastBufferSubDataNV;
    public static final MethodHandle MH_glMulticastCopyBufferSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMulticastCopyBufferSubDataNV;
    public static final MethodHandle MH_glMulticastCopyImageSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMulticastCopyImageSubDataNV;
    public static final MethodHandle MH_glMulticastBlitFramebufferNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMulticastBlitFramebufferNV;
    public static final MethodHandle MH_glMulticastFramebufferSampleLocationsfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastFramebufferSampleLocationsfvNV;
    public static final MethodHandle MH_glMulticastBarrierNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glMulticastBarrierNV;
    public static final MethodHandle MH_glMulticastWaitSyncNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMulticastWaitSyncNV;
    public static final MethodHandle MH_glMulticastGetQueryObjectivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastGetQueryObjectivNV;
    public static final MethodHandle MH_glMulticastGetQueryObjectuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastGetQueryObjectuivNV;
    public static final MethodHandle MH_glMulticastGetQueryObjecti64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastGetQueryObjecti64vNV;
    public static final MethodHandle MH_glMulticastGetQueryObjectui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMulticastGetQueryObjectui64vNV;

    public GLNVGpuMulticast(overrungl.opengl.GLLoadFunc func) {
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

    public void RenderGpuMaskNV(@CType("GLbitfield") int mask) {
        if (!Unmarshal.isNullPointer(PFN_glRenderGpuMaskNV)) { try {
            MH_glRenderGpuMaskNV.invokeExact(PFN_glRenderGpuMaskNV, mask);
        } catch (Throwable e) { throw new RuntimeException("error in glRenderGpuMaskNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRenderGpuMaskNV"); }
    }

    public void MulticastBufferSubDataNV(@CType("GLbitfield") int gpuMask, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastBufferSubDataNV)) { try {
            MH_glMulticastBufferSubDataNV.invokeExact(PFN_glMulticastBufferSubDataNV, gpuMask, buffer, offset, size, data);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastBufferSubDataNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastBufferSubDataNV"); }
    }

    public void MulticastCopyBufferSubDataNV(@CType("GLuint") int readGpu, @CType("GLbitfield") int writeGpuMask, @CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastCopyBufferSubDataNV)) { try {
            MH_glMulticastCopyBufferSubDataNV.invokeExact(PFN_glMulticastCopyBufferSubDataNV, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastCopyBufferSubDataNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastCopyBufferSubDataNV"); }
    }

    public void MulticastCopyImageSubDataNV(@CType("GLuint") int srcGpu, @CType("GLbitfield") int dstGpuMask, @CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srcY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int srcWidth, @CType("GLsizei") int srcHeight, @CType("GLsizei") int srcDepth) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastCopyImageSubDataNV)) { try {
            MH_glMulticastCopyImageSubDataNV.invokeExact(PFN_glMulticastCopyImageSubDataNV, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastCopyImageSubDataNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastCopyImageSubDataNV"); }
    }

    public void MulticastBlitFramebufferNV(@CType("GLuint") int srcGpu, @CType("GLuint") int dstGpu, @CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastBlitFramebufferNV)) { try {
            MH_glMulticastBlitFramebufferNV.invokeExact(PFN_glMulticastBlitFramebufferNV, srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastBlitFramebufferNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastBlitFramebufferNV"); }
    }

    public void MulticastFramebufferSampleLocationsfvNV(@CType("GLuint") int gpu, @CType("GLuint") int framebuffer, @CType("GLuint") int start, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastFramebufferSampleLocationsfvNV)) { try {
            MH_glMulticastFramebufferSampleLocationsfvNV.invokeExact(PFN_glMulticastFramebufferSampleLocationsfvNV, gpu, framebuffer, start, count, v);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastFramebufferSampleLocationsfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastFramebufferSampleLocationsfvNV"); }
    }

    public void MulticastBarrierNV() {
        if (!Unmarshal.isNullPointer(PFN_glMulticastBarrierNV)) { try {
            MH_glMulticastBarrierNV.invokeExact(PFN_glMulticastBarrierNV);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastBarrierNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastBarrierNV"); }
    }

    public void MulticastWaitSyncNV(@CType("GLuint") int signalGpu, @CType("GLbitfield") int waitGpuMask) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastWaitSyncNV)) { try {
            MH_glMulticastWaitSyncNV.invokeExact(PFN_glMulticastWaitSyncNV, signalGpu, waitGpuMask);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastWaitSyncNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastWaitSyncNV"); }
    }

    public void MulticastGetQueryObjectivNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastGetQueryObjectivNV)) { try {
            MH_glMulticastGetQueryObjectivNV.invokeExact(PFN_glMulticastGetQueryObjectivNV, gpu, id, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectivNV"); }
    }

    public void MulticastGetQueryObjectuivNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastGetQueryObjectuivNV)) { try {
            MH_glMulticastGetQueryObjectuivNV.invokeExact(PFN_glMulticastGetQueryObjectuivNV, gpu, id, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectuivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectuivNV"); }
    }

    public void MulticastGetQueryObjecti64vNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastGetQueryObjecti64vNV)) { try {
            MH_glMulticastGetQueryObjecti64vNV.invokeExact(PFN_glMulticastGetQueryObjecti64vNV, gpu, id, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjecti64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjecti64vNV"); }
    }

    public void MulticastGetQueryObjectui64vNV(@CType("GLuint") int gpu, @CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMulticastGetQueryObjectui64vNV)) { try {
            MH_glMulticastGetQueryObjectui64vNV.invokeExact(PFN_glMulticastGetQueryObjectui64vNV, gpu, id, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMulticastGetQueryObjectui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectui64vNV"); }
    }

}
