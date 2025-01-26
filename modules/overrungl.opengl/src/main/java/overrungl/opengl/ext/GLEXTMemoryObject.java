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
        public static final MethodHandle MH_glGetUnsignedBytevEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUnsignedBytei_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteMemoryObjectsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsMemoryObjectEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateMemoryObjectsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMemoryObjectParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMemoryObjectParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexStorageMem2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem2DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem3DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBufferStorageMemEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem2DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem3DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glNamedBufferStorageMemEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorageMem1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorageMem1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
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
    /// void glGetUnsignedBytevEXT(GLenum pname, GLubyte* data);
    /// ```
    public void GetUnsignedBytevEXT(int pname, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytevEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT");
        try { Handles.MH_glGetUnsignedBytevEXT.invokeExact(handles.PFN_glGetUnsignedBytevEXT, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytevEXT", e); }
    }

    /// ```
    /// void glGetUnsignedBytei_vEXT(GLenum target, GLuint index, GLubyte* data);
    /// ```
    public void GetUnsignedBytei_vEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytei_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT");
        try { Handles.MH_glGetUnsignedBytei_vEXT.invokeExact(handles.PFN_glGetUnsignedBytei_vEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytei_vEXT", e); }
    }

    /// ```
    /// void glDeleteMemoryObjectsEXT(GLsizei n, const GLuint* memoryObjects);
    /// ```
    public void DeleteMemoryObjectsEXT(int n, MemorySegment memoryObjects) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteMemoryObjectsEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteMemoryObjectsEXT");
        try { Handles.MH_glDeleteMemoryObjectsEXT.invokeExact(handles.PFN_glDeleteMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteMemoryObjectsEXT", e); }
    }

    /// ```
    /// GLboolean glIsMemoryObjectEXT(GLuint memoryObject);
    /// ```
    public boolean IsMemoryObjectEXT(int memoryObject) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsMemoryObjectEXT)) throw new SymbolNotFoundError("Symbol not found: glIsMemoryObjectEXT");
        try { return (((byte) Handles.MH_glIsMemoryObjectEXT.invokeExact(handles.PFN_glIsMemoryObjectEXT, memoryObject)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsMemoryObjectEXT", e); }
    }

    /// ```
    /// void glCreateMemoryObjectsEXT(GLsizei n, GLuint* memoryObjects);
    /// ```
    public void CreateMemoryObjectsEXT(int n, MemorySegment memoryObjects) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateMemoryObjectsEXT)) throw new SymbolNotFoundError("Symbol not found: glCreateMemoryObjectsEXT");
        try { Handles.MH_glCreateMemoryObjectsEXT.invokeExact(handles.PFN_glCreateMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in CreateMemoryObjectsEXT", e); }
    }

    /// ```
    /// void glMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, const GLint* params);
    /// ```
    public void MemoryObjectParameterivEXT(int memoryObject, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryObjectParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glMemoryObjectParameterivEXT");
        try { Handles.MH_glMemoryObjectParameterivEXT.invokeExact(handles.PFN_glMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryObjectParameterivEXT", e); }
    }

    /// ```
    /// void glGetMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint* params);
    /// ```
    public void GetMemoryObjectParameterivEXT(int memoryObject, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMemoryObjectParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMemoryObjectParameterivEXT");
        try { Handles.MH_glGetMemoryObjectParameterivEXT.invokeExact(handles.PFN_glGetMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryObjectParameterivEXT", e); }
    }

    /// ```
    /// void glTexStorageMem2DEXT(GLenum target, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLuint memory, GLuint64 offset);
    /// ```
    public void TexStorageMem2DEXT(int target, int levels, int internalFormat, int width, int height, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem2DEXT");
        try { Handles.MH_glTexStorageMem2DEXT.invokeExact(handles.PFN_glTexStorageMem2DEXT, target, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem2DEXT", e); }
    }

    /// ```
    /// void glTexStorageMem2DMultisampleEXT(GLenum target, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset);
    /// ```
    public void TexStorageMem2DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem2DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem2DMultisampleEXT");
        try { Handles.MH_glTexStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem2DMultisampleEXT, target, samples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem2DMultisampleEXT", e); }
    }

    /// ```
    /// void glTexStorageMem3DEXT(GLenum target, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset);
    /// ```
    public void TexStorageMem3DEXT(int target, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem3DEXT");
        try { Handles.MH_glTexStorageMem3DEXT.invokeExact(handles.PFN_glTexStorageMem3DEXT, target, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem3DEXT", e); }
    }

    /// ```
    /// void glTexStorageMem3DMultisampleEXT(GLenum target, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset);
    /// ```
    public void TexStorageMem3DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem3DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem3DMultisampleEXT");
        try { Handles.MH_glTexStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem3DMultisampleEXT, target, samples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem3DMultisampleEXT", e); }
    }

    /// ```
    /// void glBufferStorageMemEXT(GLenum target, GLsizeiptr size, GLuint memory, GLuint64 offset);
    /// ```
    public void BufferStorageMemEXT(int target, long size, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferStorageMemEXT)) throw new SymbolNotFoundError("Symbol not found: glBufferStorageMemEXT");
        try { Handles.MH_glBufferStorageMemEXT.invokeExact(handles.PFN_glBufferStorageMemEXT, target, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BufferStorageMemEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem2DEXT(GLuint texture, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLuint memory, GLuint64 offset);
    /// ```
    public void TextureStorageMem2DEXT(int texture, int levels, int internalFormat, int width, int height, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem2DEXT");
        try { Handles.MH_glTextureStorageMem2DEXT.invokeExact(handles.PFN_glTextureStorageMem2DEXT, texture, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem2DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem2DMultisampleEXT(GLuint texture, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset);
    /// ```
    public void TextureStorageMem2DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem2DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem2DMultisampleEXT");
        try { Handles.MH_glTextureStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem2DMultisampleEXT, texture, samples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem2DMultisampleEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem3DEXT(GLuint texture, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset);
    /// ```
    public void TextureStorageMem3DEXT(int texture, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem3DEXT");
        try { Handles.MH_glTextureStorageMem3DEXT.invokeExact(handles.PFN_glTextureStorageMem3DEXT, texture, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem3DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem3DMultisampleEXT(GLuint texture, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset);
    /// ```
    public void TextureStorageMem3DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem3DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem3DMultisampleEXT");
        try { Handles.MH_glTextureStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem3DMultisampleEXT, texture, samples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0), memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem3DMultisampleEXT", e); }
    }

    /// ```
    /// void glNamedBufferStorageMemEXT(GLuint buffer, GLsizeiptr size, GLuint memory, GLuint64 offset);
    /// ```
    public void NamedBufferStorageMemEXT(int buffer, long size, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorageMemEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorageMemEXT");
        try { Handles.MH_glNamedBufferStorageMemEXT.invokeExact(handles.PFN_glNamedBufferStorageMemEXT, buffer, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorageMemEXT", e); }
    }

    /// ```
    /// void glTexStorageMem1DEXT(GLenum target, GLsizei levels, GLenum internalFormat, GLsizei width, GLuint memory, GLuint64 offset);
    /// ```
    public void TexStorageMem1DEXT(int target, int levels, int internalFormat, int width, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageMem1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem1DEXT");
        try { Handles.MH_glTexStorageMem1DEXT.invokeExact(handles.PFN_glTexStorageMem1DEXT, target, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageMem1DEXT", e); }
    }

    /// ```
    /// void glTextureStorageMem1DEXT(GLuint texture, GLsizei levels, GLenum internalFormat, GLsizei width, GLuint memory, GLuint64 offset);
    /// ```
    public void TextureStorageMem1DEXT(int texture, int levels, int internalFormat, int width, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageMem1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem1DEXT");
        try { Handles.MH_glTextureStorageMem1DEXT.invokeExact(handles.PFN_glTextureStorageMem1DEXT, texture, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageMem1DEXT", e); }
    }

}
