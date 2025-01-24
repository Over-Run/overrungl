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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetUnsignedBytevEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUnsignedBytei_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenSemaphoresEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteSemaphoresEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSemaphoreParameterui64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSemaphoreParameterui64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWaitSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSignalSemaphoreEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetUnsignedBytevEXT;
        public final MemorySegment PFN_glGetUnsignedBytei_vEXT;
        public final MemorySegment PFN_glGenSemaphoresEXT;
        public final MemorySegment PFN_glDeleteSemaphoresEXT;
        public final MemorySegment PFN_glIsSemaphoreEXT;
        public final MemorySegment PFN_glSemaphoreParameterui64vEXT;
        public final MemorySegment PFN_glGetSemaphoreParameterui64vEXT;
        public final MemorySegment PFN_glWaitSemaphoreEXT;
        public final MemorySegment PFN_glSignalSemaphoreEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLEXTSemaphore(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetUnsignedBytevEXT(unsigned int pname, GLubyte* data);
    /// ```
    public void GetUnsignedBytevEXT(int pname, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytevEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT");
        try { Handles.MH_glGetUnsignedBytevEXT.invokeExact(handles.PFN_glGetUnsignedBytevEXT, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytevEXT", e); }
    }

    /// ```
    /// void glGetUnsignedBytei_vEXT(unsigned int target, unsigned int index, GLubyte* data);
    /// ```
    public void GetUnsignedBytei_vEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytei_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT");
        try { Handles.MH_glGetUnsignedBytei_vEXT.invokeExact(handles.PFN_glGetUnsignedBytei_vEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytei_vEXT", e); }
    }

    /// ```
    /// void glGenSemaphoresEXT(int n, GLuint* semaphores);
    /// ```
    public void GenSemaphoresEXT(int n, MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSemaphoresEXT)) throw new SymbolNotFoundError("Symbol not found: glGenSemaphoresEXT");
        try { Handles.MH_glGenSemaphoresEXT.invokeExact(handles.PFN_glGenSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in GenSemaphoresEXT", e); }
    }

    /// ```
    /// void glDeleteSemaphoresEXT(int n, const GLuint* semaphores);
    /// ```
    public void DeleteSemaphoresEXT(int n, MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSemaphoresEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteSemaphoresEXT");
        try { Handles.MH_glDeleteSemaphoresEXT.invokeExact(handles.PFN_glDeleteSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSemaphoresEXT", e); }
    }

    /// ```
    /// GLboolean glIsSemaphoreEXT(unsigned int semaphore);
    /// ```
    public boolean IsSemaphoreEXT(int semaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glIsSemaphoreEXT");
        try { return (((byte) Handles.MH_glIsSemaphoreEXT.invokeExact(handles.PFN_glIsSemaphoreEXT, semaphore)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSemaphoreEXT", e); }
    }

    /// ```
    /// void glSemaphoreParameterui64vEXT(unsigned int semaphore, unsigned int pname, const GLuint64* params);
    /// ```
    public void SemaphoreParameterui64vEXT(int semaphore, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSemaphoreParameterui64vEXT)) throw new SymbolNotFoundError("Symbol not found: glSemaphoreParameterui64vEXT");
        try { Handles.MH_glSemaphoreParameterui64vEXT.invokeExact(handles.PFN_glSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SemaphoreParameterui64vEXT", e); }
    }

    /// ```
    /// void glGetSemaphoreParameterui64vEXT(unsigned int semaphore, unsigned int pname, GLuint64* params);
    /// ```
    public void GetSemaphoreParameterui64vEXT(int semaphore, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSemaphoreParameterui64vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetSemaphoreParameterui64vEXT");
        try { Handles.MH_glGetSemaphoreParameterui64vEXT.invokeExact(handles.PFN_glGetSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreParameterui64vEXT", e); }
    }

    /// ```
    /// void glWaitSemaphoreEXT(unsigned int semaphore, unsigned int numBufferBarriers, const GLuint* buffers, unsigned int numTextureBarriers, const GLuint* textures, const GLenum* srcLayouts);
    /// ```
    public void WaitSemaphoreEXT(int semaphore, int numBufferBarriers, MemorySegment buffers, int numTextureBarriers, MemorySegment textures, MemorySegment srcLayouts) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glWaitSemaphoreEXT");
        try { Handles.MH_glWaitSemaphoreEXT.invokeExact(handles.PFN_glWaitSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSemaphoreEXT", e); }
    }

    /// ```
    /// void glSignalSemaphoreEXT(unsigned int semaphore, unsigned int numBufferBarriers, const GLuint* buffers, unsigned int numTextureBarriers, const GLuint* textures, const GLenum* dstLayouts);
    /// ```
    public void SignalSemaphoreEXT(int semaphore, int numBufferBarriers, MemorySegment buffers, int numTextureBarriers, MemorySegment textures, MemorySegment dstLayouts) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glSignalSemaphoreEXT");
        try { Handles.MH_glSignalSemaphoreEXT.invokeExact(handles.PFN_glSignalSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in SignalSemaphoreEXT", e); }
    }

}
