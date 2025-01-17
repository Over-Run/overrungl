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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL44 extends GL43 {
    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
    public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;
    public static final int GL_MAP_PERSISTENT_BIT = 0x0040;
    public static final int GL_MAP_COHERENT_BIT = 0x0080;
    public static final int GL_DYNAMIC_STORAGE_BIT = 0x0100;
    public static final int GL_CLIENT_STORAGE_BIT = 0x0200;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 0x821F;
    public static final int GL_BUFFER_STORAGE_FLAGS = 0x8220;
    public static final int GL_CLEAR_TEXTURE = 0x9365;
    public static final int GL_LOCATION_COMPONENT = 0x934A;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_INDEX = 0x934B;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;
    public static final int GL_QUERY_BUFFER = 0x9192;
    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x00008000;
    public static final int GL_QUERY_BUFFER_BINDING = 0x9193;
    public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;
    public static final int GL_MIRROR_CLAMP_TO_EDGE = 0x8743;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBufferStorage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearTexSubImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindBuffersBase = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindBuffersRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindTextures = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindSamplers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindImageTextures = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindVertexBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBufferStorage,
            FD_glClearTexImage,
            FD_glClearTexSubImage,
            FD_glBindBuffersBase,
            FD_glBindBuffersRange,
            FD_glBindTextures,
            FD_glBindSamplers,
            FD_glBindImageTextures,
            FD_glBindVertexBuffers
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBufferStorage = RuntimeHelper.downcall(Descriptors.FD_glBufferStorage);
        public static final MethodHandle MH_glClearTexImage = RuntimeHelper.downcall(Descriptors.FD_glClearTexImage);
        public static final MethodHandle MH_glClearTexSubImage = RuntimeHelper.downcall(Descriptors.FD_glClearTexSubImage);
        public static final MethodHandle MH_glBindBuffersBase = RuntimeHelper.downcall(Descriptors.FD_glBindBuffersBase);
        public static final MethodHandle MH_glBindBuffersRange = RuntimeHelper.downcall(Descriptors.FD_glBindBuffersRange);
        public static final MethodHandle MH_glBindTextures = RuntimeHelper.downcall(Descriptors.FD_glBindTextures);
        public static final MethodHandle MH_glBindSamplers = RuntimeHelper.downcall(Descriptors.FD_glBindSamplers);
        public static final MethodHandle MH_glBindImageTextures = RuntimeHelper.downcall(Descriptors.FD_glBindImageTextures);
        public static final MethodHandle MH_glBindVertexBuffers = RuntimeHelper.downcall(Descriptors.FD_glBindVertexBuffers);
        public final MemorySegment PFN_glBufferStorage;
        public final MemorySegment PFN_glClearTexImage;
        public final MemorySegment PFN_glClearTexSubImage;
        public final MemorySegment PFN_glBindBuffersBase;
        public final MemorySegment PFN_glBindBuffersRange;
        public final MemorySegment PFN_glBindTextures;
        public final MemorySegment PFN_glBindSamplers;
        public final MemorySegment PFN_glBindImageTextures;
        public final MemorySegment PFN_glBindVertexBuffers;
        private Handles(GLLoadFunc func) {
            PFN_glBufferStorage = func.invoke("glBufferStorage", "glBufferStorageEXT");
            PFN_glClearTexImage = func.invoke("glClearTexImage", "glClearTexImageEXT");
            PFN_glClearTexSubImage = func.invoke("glClearTexSubImage", "glClearTexSubImageEXT");
            PFN_glBindBuffersBase = func.invoke("glBindBuffersBase");
            PFN_glBindBuffersRange = func.invoke("glBindBuffersRange");
            PFN_glBindTextures = func.invoke("glBindTextures");
            PFN_glBindSamplers = func.invoke("glBindSamplers");
            PFN_glBindImageTextures = func.invoke("glBindImageTextures");
            PFN_glBindVertexBuffers = func.invoke("glBindVertexBuffers");
        }
    }

    public GL44(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void BufferStorage(@CType("GLenum") int target, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glBufferStorage)) throw new SymbolNotFoundError("Symbol not found: glBufferStorage");
        try { Handles.MH_glBufferStorage.invokeExact(handles.PFN_glBufferStorage, target, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glBufferStorage", e); }
    }

    public void ClearTexImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearTexImage)) throw new SymbolNotFoundError("Symbol not found: glClearTexImage");
        try { Handles.MH_glClearTexImage.invokeExact(handles.PFN_glClearTexImage, texture, level, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearTexImage", e); }
    }

    public void ClearTexSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearTexSubImage)) throw new SymbolNotFoundError("Symbol not found: glClearTexSubImage");
        try { Handles.MH_glClearTexSubImage.invokeExact(handles.PFN_glClearTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearTexSubImage", e); }
    }

    public void BindBuffersBase(@CType("GLenum") int target, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBuffersBase)) throw new SymbolNotFoundError("Symbol not found: glBindBuffersBase");
        try { Handles.MH_glBindBuffersBase.invokeExact(handles.PFN_glBindBuffersBase, target, first, count, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBuffersBase", e); }
    }

    public void BindBuffersRange(@CType("GLenum") int target, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizeiptr *") java.lang.foreign.MemorySegment sizes) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBuffersRange)) throw new SymbolNotFoundError("Symbol not found: glBindBuffersRange");
        try { Handles.MH_glBindBuffersRange.invokeExact(handles.PFN_glBindBuffersRange, target, first, count, buffers, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBuffersRange", e); }
    }

    public void BindTextures(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment textures) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTextures)) throw new SymbolNotFoundError("Symbol not found: glBindTextures");
        try { Handles.MH_glBindTextures.invokeExact(handles.PFN_glBindTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextures", e); }
    }

    public void BindSamplers(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindSamplers)) throw new SymbolNotFoundError("Symbol not found: glBindSamplers");
        try { Handles.MH_glBindSamplers.invokeExact(handles.PFN_glBindSamplers, first, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glBindSamplers", e); }
    }

    public void BindImageTextures(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment textures) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindImageTextures)) throw new SymbolNotFoundError("Symbol not found: glBindImageTextures");
        try { Handles.MH_glBindImageTextures.invokeExact(handles.PFN_glBindImageTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in glBindImageTextures", e); }
    }

    public void BindVertexBuffers(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizei *") java.lang.foreign.MemorySegment strides) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: glBindVertexBuffers");
        try { Handles.MH_glBindVertexBuffers.invokeExact(handles.PFN_glBindVertexBuffers, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexBuffers", e); }
    }

}
