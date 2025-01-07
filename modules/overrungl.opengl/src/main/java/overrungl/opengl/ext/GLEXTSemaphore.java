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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTSemaphore {
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 0x9596;
    public static final int GL_DEVICE_UUID_EXT = 0x9597;
    public static final int GL_DRIVER_UUID_EXT = 0x9598;
    public static final int GL_UUID_SIZE_EXT = 16;
    public static final int GL_LAYOUT_GENERAL_EXT = 0x958D;
    public static final int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 0x958E;
    public static final int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 0x958F;
    public static final int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 0x9590;
    public static final int GL_LAYOUT_SHADER_READ_ONLY_EXT = 0x9591;
    public static final int GL_LAYOUT_TRANSFER_SRC_EXT = 0x9592;
    public static final int GL_LAYOUT_TRANSFER_DST_EXT = 0x9593;
    public static final int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530;
    public static final int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;
    public static final MethodHandle MH_glGetUnsignedBytevEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUnsignedBytevEXT;
    public static final MethodHandle MH_glGetUnsignedBytei_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUnsignedBytei_vEXT;
    public static final MethodHandle MH_glGenSemaphoresEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenSemaphoresEXT;
    public static final MethodHandle MH_glDeleteSemaphoresEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteSemaphoresEXT;
    public static final MethodHandle MH_glIsSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsSemaphoreEXT;
    public static final MethodHandle MH_glSemaphoreParameterui64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSemaphoreParameterui64vEXT;
    public static final MethodHandle MH_glGetSemaphoreParameterui64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSemaphoreParameterui64vEXT;
    public static final MethodHandle MH_glWaitSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWaitSemaphoreEXT;
    public static final MethodHandle MH_glSignalSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSignalSemaphoreEXT;

    public GLEXTSemaphore(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetUnsignedBytevEXT = func.invoke("glGetUnsignedBytevEXT");
        PFN_glGetUnsignedBytei_vEXT = func.invoke("glGetUnsignedBytei_vEXT");
        PFN_glGenSemaphoresEXT = func.invoke("glGenSemaphoresEXT");
        PFN_glDeleteSemaphoresEXT = func.invoke("glDeleteSemaphoresEXT");
        PFN_glIsSemaphoreEXT = func.invoke("glIsSemaphoreEXT");
        PFN_glSemaphoreParameterui64vEXT = func.invoke("glSemaphoreParameterui64vEXT");
        PFN_glGetSemaphoreParameterui64vEXT = func.invoke("glGetSemaphoreParameterui64vEXT");
        PFN_glWaitSemaphoreEXT = func.invoke("glWaitSemaphoreEXT");
        PFN_glSignalSemaphoreEXT = func.invoke("glSignalSemaphoreEXT");
    }

    public void GetUnsignedBytevEXT(@CType("GLenum") int pname, @CType("GLubyte *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetUnsignedBytevEXT)) { try {
            MH_glGetUnsignedBytevEXT.invokeExact(PFN_glGetUnsignedBytevEXT, pname, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUnsignedBytevEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT"); }
    }

    public void GetUnsignedBytei_vEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLubyte *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetUnsignedBytei_vEXT)) { try {
            MH_glGetUnsignedBytei_vEXT.invokeExact(PFN_glGetUnsignedBytei_vEXT, target, index, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUnsignedBytei_vEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT"); }
    }

    public void GenSemaphoresEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment semaphores) {
        if (!Unmarshal.isNullPointer(PFN_glGenSemaphoresEXT)) { try {
            MH_glGenSemaphoresEXT.invokeExact(PFN_glGenSemaphoresEXT, n, semaphores);
        } catch (Throwable e) { throw new RuntimeException("error in glGenSemaphoresEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenSemaphoresEXT"); }
    }

    public void DeleteSemaphoresEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment semaphores) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteSemaphoresEXT)) { try {
            MH_glDeleteSemaphoresEXT.invokeExact(PFN_glDeleteSemaphoresEXT, n, semaphores);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteSemaphoresEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteSemaphoresEXT"); }
    }

    public @CType("GLboolean") boolean IsSemaphoreEXT(@CType("GLuint") int semaphore) {
        if (!Unmarshal.isNullPointer(PFN_glIsSemaphoreEXT)) { try {
            return (boolean) MH_glIsSemaphoreEXT.invokeExact(PFN_glIsSemaphoreEXT, semaphore);
        } catch (Throwable e) { throw new RuntimeException("error in glIsSemaphoreEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsSemaphoreEXT"); }
    }

    public void SemaphoreParameterui64vEXT(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("const GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glSemaphoreParameterui64vEXT)) { try {
            MH_glSemaphoreParameterui64vEXT.invokeExact(PFN_glSemaphoreParameterui64vEXT, semaphore, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glSemaphoreParameterui64vEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSemaphoreParameterui64vEXT"); }
    }

    public void GetSemaphoreParameterui64vEXT(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetSemaphoreParameterui64vEXT)) { try {
            MH_glGetSemaphoreParameterui64vEXT.invokeExact(PFN_glGetSemaphoreParameterui64vEXT, semaphore, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetSemaphoreParameterui64vEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetSemaphoreParameterui64vEXT"); }
    }

    public void WaitSemaphoreEXT(@CType("GLuint") int semaphore, @CType("GLuint") int numBufferBarriers, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("GLuint") int numTextureBarriers, @CType("const GLuint *") java.lang.foreign.MemorySegment textures, @CType("const GLenum *") java.lang.foreign.MemorySegment srcLayouts) {
        if (!Unmarshal.isNullPointer(PFN_glWaitSemaphoreEXT)) { try {
            MH_glWaitSemaphoreEXT.invokeExact(PFN_glWaitSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts);
        } catch (Throwable e) { throw new RuntimeException("error in glWaitSemaphoreEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWaitSemaphoreEXT"); }
    }

    public void SignalSemaphoreEXT(@CType("GLuint") int semaphore, @CType("GLuint") int numBufferBarriers, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("GLuint") int numTextureBarriers, @CType("const GLuint *") java.lang.foreign.MemorySegment textures, @CType("const GLenum *") java.lang.foreign.MemorySegment dstLayouts) {
        if (!Unmarshal.isNullPointer(PFN_glSignalSemaphoreEXT)) { try {
            MH_glSignalSemaphoreEXT.invokeExact(PFN_glSignalSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts);
        } catch (Throwable e) { throw new RuntimeException("error in glSignalSemaphoreEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSignalSemaphoreEXT"); }
    }

}
