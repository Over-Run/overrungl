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
import overrungl.opengl.*;

public final class GLNVMemoryObjectSparse {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glNamedBufferPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexturePageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public final MemorySegment PFN_glBufferPageCommitmentMemNV;
        public final MemorySegment PFN_glTexPageCommitmentMemNV;
        public final MemorySegment PFN_glNamedBufferPageCommitmentMemNV;
        public final MemorySegment PFN_glTexturePageCommitmentMemNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBufferPageCommitmentMemNV = func.invoke("glBufferPageCommitmentMemNV");
            PFN_glTexPageCommitmentMemNV = func.invoke("glTexPageCommitmentMemNV");PFN_glNamedBufferPageCommitmentMemNV = func.invoke("glNamedBufferPageCommitmentMemNV");
            PFN_glTexturePageCommitmentMemNV = func.invoke("glTexturePageCommitmentMemNV");
        }
    }

    public GLNVMemoryObjectSparse(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBufferPageCommitmentMemNV((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 memOffset, GLboolean commit);
    /// ```
    public void BufferPageCommitmentMemNV(int target, long offset, long size, int memory, long memOffset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glBufferPageCommitmentMemNV");
        try { Handles.MH_glBufferPageCommitmentMemNV.invokeExact(handles.PFN_glBufferPageCommitmentMemNV, target, offset, size, memory, memOffset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in BufferPageCommitmentMemNV", e); }
    }

    /// ```
    /// void glTexPageCommitmentMemNV((unsigned int) GLenum target, (int) GLint layer, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset, GLboolean commit);
    /// ```
    public void TexPageCommitmentMemNV(int target, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexPageCommitmentMemNV");
        try { Handles.MH_glTexPageCommitmentMemNV.invokeExact(handles.PFN_glTexPageCommitmentMemNV, target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexPageCommitmentMemNV", e); }
    }

    /// ```
    /// void glNamedBufferPageCommitmentMemNV((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 memOffset, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentMemNV(int buffer, long offset, long size, int memory, long memOffset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentMemNV");
        try { Handles.MH_glNamedBufferPageCommitmentMemNV.invokeExact(handles.PFN_glNamedBufferPageCommitmentMemNV, buffer, offset, size, memory, memOffset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentMemNV", e); }
    }

    /// ```
    /// void glTexturePageCommitmentMemNV((unsigned int) GLuint texture, (int) GLint layer, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset, GLboolean commit);
    /// ```
    public void TexturePageCommitmentMemNV(int texture, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexturePageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexturePageCommitmentMemNV");
        try { Handles.MH_glTexturePageCommitmentMemNV.invokeExact(handles.PFN_glTexturePageCommitmentMemNV, texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexturePageCommitmentMemNV", e); }
    }

}
