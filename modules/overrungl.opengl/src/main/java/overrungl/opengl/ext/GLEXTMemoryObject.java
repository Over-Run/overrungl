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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetUnsignedBytevEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUnsignedBytei_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteMemoryObjectsEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsMemoryObjectEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateMemoryObjectsEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMemoryObjectParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMemoryObjectParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexStorageMem2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTexStorageMem2DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTexStorageMem3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTexStorageMem3DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBufferStorageMemEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorageMem2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorageMem2DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorageMem3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorageMem3DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glNamedBufferStorageMemEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTexStorageMem1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorageMem1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetUnsignedBytevEXT = RuntimeHelper.downcall(Descriptors.FD_glGetUnsignedBytevEXT);
        public static final MethodHandle MH_glGetUnsignedBytei_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetUnsignedBytei_vEXT);
        public static final MethodHandle MH_glDeleteMemoryObjectsEXT = RuntimeHelper.downcall(Descriptors.FD_glDeleteMemoryObjectsEXT);
        public static final MethodHandle MH_glIsMemoryObjectEXT = RuntimeHelper.downcall(Descriptors.FD_glIsMemoryObjectEXT);
        public static final MethodHandle MH_glCreateMemoryObjectsEXT = RuntimeHelper.downcall(Descriptors.FD_glCreateMemoryObjectsEXT);
        public static final MethodHandle MH_glMemoryObjectParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glMemoryObjectParameterivEXT);
        public static final MethodHandle MH_glGetMemoryObjectParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMemoryObjectParameterivEXT);
        public static final MethodHandle MH_glTexStorageMem2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorageMem2DEXT);
        public static final MethodHandle MH_glTexStorageMem2DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorageMem2DMultisampleEXT);
        public static final MethodHandle MH_glTexStorageMem3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorageMem3DEXT);
        public static final MethodHandle MH_glTexStorageMem3DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorageMem3DMultisampleEXT);
        public static final MethodHandle MH_glBufferStorageMemEXT = RuntimeHelper.downcall(Descriptors.FD_glBufferStorageMemEXT);
        public static final MethodHandle MH_glTextureStorageMem2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorageMem2DEXT);
        public static final MethodHandle MH_glTextureStorageMem2DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorageMem2DMultisampleEXT);
        public static final MethodHandle MH_glTextureStorageMem3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorageMem3DEXT);
        public static final MethodHandle MH_glTextureStorageMem3DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorageMem3DMultisampleEXT);
        public static final MethodHandle MH_glNamedBufferStorageMemEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferStorageMemEXT);
        public static final MethodHandle MH_glTexStorageMem1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorageMem1DEXT);
        public static final MethodHandle MH_glTextureStorageMem1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorageMem1DEXT);
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

    public void DeleteMemoryObjectsEXT(@CType("GLsizei") int n, @CType("const GLuint *") MemorySegment memoryObjects) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteMemoryObjectsEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteMemoryObjectsEXT");
        try { Handles.MH_glDeleteMemoryObjectsEXT.invokeExact(handles.PFN_glDeleteMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteMemoryObjectsEXT", e); }
    }

    public @CType("GLboolean") boolean IsMemoryObjectEXT(@CType("GLuint") int memoryObject) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsMemoryObjectEXT)) throw new SymbolNotFoundError("Symbol not found: glIsMemoryObjectEXT");
        try { return (boolean) Handles.MH_glIsMemoryObjectEXT.invokeExact(handles.PFN_glIsMemoryObjectEXT, memoryObject); }
        catch (Throwable e) { throw new RuntimeException("error in glIsMemoryObjectEXT", e); }
    }

    public void CreateMemoryObjectsEXT(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment memoryObjects) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateMemoryObjectsEXT)) throw new SymbolNotFoundError("Symbol not found: glCreateMemoryObjectsEXT");
        try { Handles.MH_glCreateMemoryObjectsEXT.invokeExact(handles.PFN_glCreateMemoryObjectsEXT, n, memoryObjects); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateMemoryObjectsEXT", e); }
    }

    public void MemoryObjectParameterivEXT(@CType("GLuint") int memoryObject, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMemoryObjectParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glMemoryObjectParameterivEXT");
        try { Handles.MH_glMemoryObjectParameterivEXT.invokeExact(handles.PFN_glMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMemoryObjectParameterivEXT", e); }
    }

    public void GetMemoryObjectParameterivEXT(@CType("GLuint") int memoryObject, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMemoryObjectParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMemoryObjectParameterivEXT");
        try { Handles.MH_glGetMemoryObjectParameterivEXT.invokeExact(handles.PFN_glGetMemoryObjectParameterivEXT, memoryObject, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMemoryObjectParameterivEXT", e); }
    }

    public void TexStorageMem2DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorageMem2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem2DEXT");
        try { Handles.MH_glTexStorageMem2DEXT.invokeExact(handles.PFN_glTexStorageMem2DEXT, target, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorageMem2DEXT", e); }
    }

    public void TexStorageMem2DMultisampleEXT(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorageMem2DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem2DMultisampleEXT");
        try { Handles.MH_glTexStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem2DMultisampleEXT, target, samples, internalFormat, width, height, fixedSampleLocations, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorageMem2DMultisampleEXT", e); }
    }

    public void TexStorageMem3DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorageMem3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem3DEXT");
        try { Handles.MH_glTexStorageMem3DEXT.invokeExact(handles.PFN_glTexStorageMem3DEXT, target, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorageMem3DEXT", e); }
    }

    public void TexStorageMem3DMultisampleEXT(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorageMem3DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem3DMultisampleEXT");
        try { Handles.MH_glTexStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTexStorageMem3DMultisampleEXT, target, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorageMem3DMultisampleEXT", e); }
    }

    public void BufferStorageMemEXT(@CType("GLenum") int target, @CType("GLsizeiptr") long size, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glBufferStorageMemEXT)) throw new SymbolNotFoundError("Symbol not found: glBufferStorageMemEXT");
        try { Handles.MH_glBufferStorageMemEXT.invokeExact(handles.PFN_glBufferStorageMemEXT, target, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glBufferStorageMemEXT", e); }
    }

    public void TextureStorageMem2DEXT(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorageMem2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem2DEXT");
        try { Handles.MH_glTextureStorageMem2DEXT.invokeExact(handles.PFN_glTextureStorageMem2DEXT, texture, levels, internalFormat, width, height, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorageMem2DEXT", e); }
    }

    public void TextureStorageMem2DMultisampleEXT(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorageMem2DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem2DMultisampleEXT");
        try { Handles.MH_glTextureStorageMem2DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem2DMultisampleEXT, texture, samples, internalFormat, width, height, fixedSampleLocations, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorageMem2DMultisampleEXT", e); }
    }

    public void TextureStorageMem3DEXT(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorageMem3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem3DEXT");
        try { Handles.MH_glTextureStorageMem3DEXT.invokeExact(handles.PFN_glTextureStorageMem3DEXT, texture, levels, internalFormat, width, height, depth, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorageMem3DEXT", e); }
    }

    public void TextureStorageMem3DMultisampleEXT(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorageMem3DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem3DMultisampleEXT");
        try { Handles.MH_glTextureStorageMem3DMultisampleEXT.invokeExact(handles.PFN_glTextureStorageMem3DMultisampleEXT, texture, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorageMem3DMultisampleEXT", e); }
    }

    public void NamedBufferStorageMemEXT(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferStorageMemEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorageMemEXT");
        try { Handles.MH_glNamedBufferStorageMemEXT.invokeExact(handles.PFN_glNamedBufferStorageMemEXT, buffer, size, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorageMemEXT", e); }
    }

    public void TexStorageMem1DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorageMem1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorageMem1DEXT");
        try { Handles.MH_glTexStorageMem1DEXT.invokeExact(handles.PFN_glTexStorageMem1DEXT, target, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorageMem1DEXT", e); }
    }

    public void TextureStorageMem1DEXT(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLuint") int memory, @CType("GLuint64") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorageMem1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageMem1DEXT");
        try { Handles.MH_glTextureStorageMem1DEXT.invokeExact(handles.PFN_glTextureStorageMem1DEXT, texture, levels, internalFormat, width, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorageMem1DEXT", e); }
    }

}
