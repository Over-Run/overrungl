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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetUnsignedBytevEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUnsignedBytei_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenSemaphoresEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteSemaphoresEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsSemaphoreEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSemaphoreParameterui64vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSemaphoreParameterui64vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWaitSemaphoreEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSignalSemaphoreEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetUnsignedBytevEXT = RuntimeHelper.downcall(Descriptors.FD_glGetUnsignedBytevEXT);
        public static final MethodHandle MH_glGetUnsignedBytei_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetUnsignedBytei_vEXT);
        public static final MethodHandle MH_glGenSemaphoresEXT = RuntimeHelper.downcall(Descriptors.FD_glGenSemaphoresEXT);
        public static final MethodHandle MH_glDeleteSemaphoresEXT = RuntimeHelper.downcall(Descriptors.FD_glDeleteSemaphoresEXT);
        public static final MethodHandle MH_glIsSemaphoreEXT = RuntimeHelper.downcall(Descriptors.FD_glIsSemaphoreEXT);
        public static final MethodHandle MH_glSemaphoreParameterui64vEXT = RuntimeHelper.downcall(Descriptors.FD_glSemaphoreParameterui64vEXT);
        public static final MethodHandle MH_glGetSemaphoreParameterui64vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetSemaphoreParameterui64vEXT);
        public static final MethodHandle MH_glWaitSemaphoreEXT = RuntimeHelper.downcall(Descriptors.FD_glWaitSemaphoreEXT);
        public static final MethodHandle MH_glSignalSemaphoreEXT = RuntimeHelper.downcall(Descriptors.FD_glSignalSemaphoreEXT);
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

    public void GetUnsignedBytevEXT(@CType("GLenum") int pname, @CType("GLubyte *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUnsignedBytevEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT");
        try { Handles.MH_glGetUnsignedBytevEXT.invokeExact(handles.PFN_glGetUnsignedBytevEXT, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUnsignedBytevEXT", e); }
    }

    public void GetUnsignedBytei_vEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLubyte *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUnsignedBytei_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT");
        try { Handles.MH_glGetUnsignedBytei_vEXT.invokeExact(handles.PFN_glGetUnsignedBytei_vEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUnsignedBytei_vEXT", e); }
    }

    public void GenSemaphoresEXT(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment semaphores) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenSemaphoresEXT)) throw new SymbolNotFoundError("Symbol not found: glGenSemaphoresEXT");
        try { Handles.MH_glGenSemaphoresEXT.invokeExact(handles.PFN_glGenSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in glGenSemaphoresEXT", e); }
    }

    public void DeleteSemaphoresEXT(@CType("GLsizei") int n, @CType("const GLuint *") MemorySegment semaphores) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteSemaphoresEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteSemaphoresEXT");
        try { Handles.MH_glDeleteSemaphoresEXT.invokeExact(handles.PFN_glDeleteSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSemaphoresEXT", e); }
    }

    public @CType("GLboolean") boolean IsSemaphoreEXT(@CType("GLuint") int semaphore) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glIsSemaphoreEXT");
        try { return (boolean) Handles.MH_glIsSemaphoreEXT.invokeExact(handles.PFN_glIsSemaphoreEXT, semaphore); }
        catch (Throwable e) { throw new RuntimeException("error in glIsSemaphoreEXT", e); }
    }

    public void SemaphoreParameterui64vEXT(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("const GLuint64 *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glSemaphoreParameterui64vEXT)) throw new SymbolNotFoundError("Symbol not found: glSemaphoreParameterui64vEXT");
        try { Handles.MH_glSemaphoreParameterui64vEXT.invokeExact(handles.PFN_glSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glSemaphoreParameterui64vEXT", e); }
    }

    public void GetSemaphoreParameterui64vEXT(@CType("GLuint") int semaphore, @CType("GLenum") int pname, @CType("GLuint64 *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSemaphoreParameterui64vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetSemaphoreParameterui64vEXT");
        try { Handles.MH_glGetSemaphoreParameterui64vEXT.invokeExact(handles.PFN_glGetSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSemaphoreParameterui64vEXT", e); }
    }

    public void WaitSemaphoreEXT(@CType("GLuint") int semaphore, @CType("GLuint") int numBufferBarriers, @CType("const GLuint *") MemorySegment buffers, @CType("GLuint") int numTextureBarriers, @CType("const GLuint *") MemorySegment textures, @CType("const GLenum *") MemorySegment srcLayouts) {
        if (Unmarshal.isNullPointer(handles.PFN_glWaitSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glWaitSemaphoreEXT");
        try { Handles.MH_glWaitSemaphoreEXT.invokeExact(handles.PFN_glWaitSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in glWaitSemaphoreEXT", e); }
    }

    public void SignalSemaphoreEXT(@CType("GLuint") int semaphore, @CType("GLuint") int numBufferBarriers, @CType("const GLuint *") MemorySegment buffers, @CType("GLuint") int numTextureBarriers, @CType("const GLuint *") MemorySegment textures, @CType("const GLenum *") MemorySegment dstLayouts) {
        if (Unmarshal.isNullPointer(handles.PFN_glSignalSemaphoreEXT)) throw new SymbolNotFoundError("Symbol not found: glSignalSemaphoreEXT");
        try { Handles.MH_glSignalSemaphoreEXT.invokeExact(handles.PFN_glSignalSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in glSignalSemaphoreEXT", e); }
    }

}
