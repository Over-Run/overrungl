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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTMemoryObject {
    public static final int GL_TEXTURE_TILING_EXT = 0x9580;
    public static final int GL_DEDICATED_MEMORY_OBJECT_EXT = 0x9581;
    public static final int GL_PROTECTED_MEMORY_OBJECT_EXT = 0x959B;
    public static final int GL_NUM_TILING_TYPES_EXT = 0x9582;
    public static final int GL_TILING_TYPES_EXT = 0x9583;
    public static final int GL_OPTIMAL_TILING_EXT = 0x9584;
    public static final int GL_LINEAR_TILING_EXT = 0x9585;
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 0x9596;
    public static final int GL_DEVICE_UUID_EXT = 0x9597;
    public static final int GL_DRIVER_UUID_EXT = 0x9598;
    public static final int GL_UUID_SIZE_EXT = 16;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetUnsignedBytevEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUnsignedBytei_vEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteMemoryObjectsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsMemoryObjectEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateMemoryObjectsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMemoryObjectParameterivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMemoryObjectParameterivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexStorageMem2DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem2DMultisampleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem3DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem3DMultisampleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBufferStorageMemEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem2DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem2DMultisampleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem3DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem3DMultisampleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glNamedBufferStorageMemEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem1DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem1DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glGetUnsignedBytevEXT;
        public final MemorySegment PFN_glGetUnsignedBytei_vEXT;
        public final MemorySegment PFN_glDeleteMemoryObjectsEXT;
        public final MemorySegment PFN_glIsMemoryObjectEXT;
        public final MemorySegment PFN_glCreateMemoryObjectsEXT;
        public final MemorySegment PFN_glMemoryObjectParameterivEXT;
        public final MemorySegment PFN_glGetMemoryObjectParameterivEXT;
        public final MemorySegment PFN_glTexStorageMem2DEXT;
        public final MemorySegment PFN_glTexStorageMem2DMultisampleEXT;
        public final MemorySegment PFN_glTexStorageMem3DEXT;
        public final MemorySegment PFN_glTexStorageMem3DMultisampleEXT;
        public final MemorySegment PFN_glBufferStorageMemEXT;
        public final MemorySegment PFN_glTextureStorageMem2DEXT;
        public final MemorySegment PFN_glTextureStorageMem2DMultisampleEXT;
        public final MemorySegment PFN_glTextureStorageMem3DEXT;
        public final MemorySegment PFN_glTextureStorageMem3DMultisampleEXT;
        public final MemorySegment PFN_glNamedBufferStorageMemEXT;
        public final MemorySegment PFN_glTexStorageMem1DEXT;
        public final MemorySegment PFN_glTextureStorageMem1DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetUnsignedBytevEXT = func.invoke("glGetUnsignedBytevEXT");
            PFN_glGetUnsignedBytei_vEXT = func.invoke("glGetUnsignedBytei_vEXT");
            PFN_glDeleteMemoryObjectsEXT = func.invoke("glDeleteMemoryObjectsEXT");
            PFN_glIsMemoryObjectEXT = func.invoke("glIsMemoryObjectEXT");
            PFN_glCreateMemoryObjectsEXT = func.invoke("glCreateMemoryObjectsEXT");
            PFN_glMemoryObjectParameterivEXT = func.invoke("glMemoryObjectParameterivEXT");
            PFN_glGetMemoryObjectParameterivEXT = func.invoke("glGetMemoryObjectParameterivEXT");
            PFN_glTexStorageMem2DEXT = func.invoke("glTexStorageMem2DEXT");
            PFN_glTexStorageMem2DMultisampleEXT = func.invoke("glTexStorageMem2DMultisampleEXT");
            PFN_glTexStorageMem3DEXT = func.invoke("glTexStorageMem3DEXT");
            PFN_glTexStorageMem3DMultisampleEXT = func.invoke("glTexStorageMem3DMultisampleEXT");
            PFN_glBufferStorageMemEXT = func.invoke("glBufferStorageMemEXT");PFN_glTextureStorageMem2DEXT = func.invoke("glTextureStorageMem2DEXT");
            PFN_glTextureStorageMem2DMultisampleEXT = func.invoke("glTextureStorageMem2DMultisampleEXT");
            PFN_glTextureStorageMem3DEXT = func.invoke("glTextureStorageMem3DEXT");
            PFN_glTextureStorageMem3DMultisampleEXT = func.invoke("glTextureStorageMem3DMultisampleEXT");
            PFN_glNamedBufferStorageMemEXT = func.invoke("glNamedBufferStorageMemEXT");PFN_glTexStorageMem1DEXT = func.invoke("glTexStorageMem1DEXT");PFN_glTextureStorageMem1DEXT = func.invoke("glTextureStorageMem1DEXT");
        }
    }

    public GLEXTMemoryObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetUnsignedBytevEXT((unsigned int) GLenum pname, GLubyte* data);
    /// ```
    public void GetUnsignedBytevEXT(int pname, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytevEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUnsignedBytevEXT", pname, data); }
        Handles.MH_glGetUnsignedBytevEXT.invokeExact(handles.PFN_glGetUnsignedBytevEXT, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytevEXT", e); }
    }

    /// ```
    /// void glGetUnsignedBytei_vEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLubyte* data);
    /// ```
    public void GetUnsignedBytei_vEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytei_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUnsignedBytei_vEXT", target, index, data); }
        Handles.MH_glGetUnsignedBytei_vEXT.invokeExact(handles.PFN_glGetUnsignedBytei_vEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytei_vEXT", e); }
    }

    /// ```
    /// void glDeleteMemoryObjectsEXT((int) GLsizei n, const GLuint* memoryObjects);
    /// ```
    public void DeleteMemoryObjectsEXT(int n, MemorySegment memoryObjects) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteMemoryObjectsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteMemoryObjectsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteMemoryObjectsEXT", n, memoryObjects); }
        Handles.MH_glDeleteMemoryObjectsEXT.invokeExact(handles.PFN_glDeleteMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteMemoryObjectsEXT", e); }
    }

    /// ```
    /// GLboolean glIsMemoryObjectEXT((unsigned int) GLuint memoryObject);
    /// ```
    public boolean IsMemoryObjectEXT(int memoryObject) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsMemoryObjectEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsMemoryObjectEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsMemoryObjectEXT", memoryObject); }
        return (((byte) Handles.MH_glIsMemoryObjectEXT.invokeExact(handles.PFN_glIsMemoryObjectEXT, memoryObject)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsMemoryObjectEXT", e); }
    }

    /// ```
    /// void glCreateMemoryObjectsEXT((int) GLsizei n, GLuint* memoryObjects);
    /// ```
    public void CreateMemoryObjectsEXT(int n, MemorySegment memoryObjects) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateMemoryObjectsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCreateMemoryObjectsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateMemoryObjectsEXT", n, memoryObjects); }
        Handles.MH_glCreateMemoryObjectsEXT.invokeExact(handles.PFN_glCreateMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in CreateMemoryObjectsEXT", e); }
    }

    /// ```
    /// void glMemoryObjectParameterivEXT((unsigned int) GLuint memoryObject, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MemoryObjectParameterivEXT(int memoryObject, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryObjectParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMemoryObjectParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMemoryObjectParameterivEXT", memoryObject, pname, params); }
        Handles.MH_glMemoryObjectParameterivEXT.invokeExact(handles.PFN_glMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryObjectParameterivEXT", e); }
    }

    /// ```
    /// void glGetMemoryObjectParameterivEXT((unsigned int) GLuint memoryObject, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMemoryObjectParameterivEXT(int memoryObject, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMemoryObjectParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMemoryObjectParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMemoryObjectParameterivEXT", memoryObject, pname, params); }
        Handles.MH_glGetMemoryObjectParameterivEXT.invokeExact(handles.PFN_glGetMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryObjectParameterivEXT", e); }
    }

    /// ```
    /// void glTexStorageMem2DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexStorageMem2DEXT(int target, int levels, int internalFormat, int width, int height, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageMem2DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageMem2DEXT", target, levels, internalFormat, width, height, memory, offset); }
        Handles.MH_glTexStorageMem2DEXT.invokeExact(handles.PFN_glTexStorageMem2DEXT, target, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem2DEXT", e); }
    }

    /// ```
    /// void glTexStorageMem2DMultisampleEXT((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedSampleLocations, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexStorageMem2DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem2DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageMem2DMultisampleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageMem2DMultisampleEXT", target, samples, internalFormat, width, height, fixedSampleLocations, memory, offset); }
        Handles.MH_glTexStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem2DMultisampleEXT, target, samples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem2DMultisampleEXT", e); }
    }

    /// ```
    /// void glTexStorageMem3DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexStorageMem3DEXT(int target, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageMem3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageMem3DEXT", target, levels, internalFormat, width, height, depth, memory, offset); }
        Handles.MH_glTexStorageMem3DEXT.invokeExact(handles.PFN_glTexStorageMem3DEXT, target, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem3DEXT", e); }
    }

    /// ```
    /// void glTexStorageMem3DMultisampleEXT((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedSampleLocations, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexStorageMem3DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem3DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageMem3DMultisampleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageMem3DMultisampleEXT", target, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset); }
        Handles.MH_glTexStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem3DMultisampleEXT, target, samples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem3DMultisampleEXT", e); }
    }

    /// ```
    /// void glBufferStorageMemEXT((unsigned int) GLenum target, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void BufferStorageMemEXT(int target, long size, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferStorageMemEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBufferStorageMemEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferStorageMemEXT", target, size, memory, offset); }
        Handles.MH_glBufferStorageMemEXT.invokeExact(handles.PFN_glBufferStorageMemEXT, target, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BufferStorageMemEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem2DEXT((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureStorageMem2DEXT(int texture, int levels, int internalFormat, int width, int height, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageMem2DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageMem2DEXT", texture, levels, internalFormat, width, height, memory, offset); }
        Handles.MH_glTextureStorageMem2DEXT.invokeExact(handles.PFN_glTextureStorageMem2DEXT, texture, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem2DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem2DMultisampleEXT((unsigned int) GLuint texture, (int) GLsizei samples, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedSampleLocations, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureStorageMem2DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem2DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageMem2DMultisampleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageMem2DMultisampleEXT", texture, samples, internalFormat, width, height, fixedSampleLocations, memory, offset); }
        Handles.MH_glTextureStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem2DMultisampleEXT, texture, samples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem2DMultisampleEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem3DEXT((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureStorageMem3DEXT(int texture, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageMem3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageMem3DEXT", texture, levels, internalFormat, width, height, depth, memory, offset); }
        Handles.MH_glTextureStorageMem3DEXT.invokeExact(handles.PFN_glTextureStorageMem3DEXT, texture, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem3DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem3DMultisampleEXT((unsigned int) GLuint texture, (int) GLsizei samples, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedSampleLocations, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureStorageMem3DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem3DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageMem3DMultisampleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageMem3DMultisampleEXT", texture, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset); }
        Handles.MH_glTextureStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem3DMultisampleEXT, texture, samples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem3DMultisampleEXT", e); }
    }

    /// ```
    /// void glNamedBufferStorageMemEXT((unsigned int) GLuint buffer, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void NamedBufferStorageMemEXT(int buffer, long size, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorageMemEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferStorageMemEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferStorageMemEXT", buffer, size, memory, offset); }
        Handles.MH_glNamedBufferStorageMemEXT.invokeExact(handles.PFN_glNamedBufferStorageMemEXT, buffer, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorageMemEXT", e); }
    }

    /// ```
    /// void glTexStorageMem1DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexStorageMem1DEXT(int target, int levels, int internalFormat, int width, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageMem1DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageMem1DEXT", target, levels, internalFormat, width, memory, offset); }
        Handles.MH_glTexStorageMem1DEXT.invokeExact(handles.PFN_glTexStorageMem1DEXT, target, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem1DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem1DEXT((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalFormat, (int) GLsizei width, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureStorageMem1DEXT(int texture, int levels, int internalFormat, int width, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageMem1DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageMem1DEXT", texture, levels, internalFormat, width, memory, offset); }
        Handles.MH_glTextureStorageMem1DEXT.invokeExact(handles.PFN_glTextureStorageMem1DEXT, texture, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem1DEXT", e); }
    }

}
