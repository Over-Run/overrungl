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

public final class GLNVMemoryObjectSparse {
    public static final MethodHandle MH_glBufferPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glBufferPageCommitmentMemNV;
    public static final MethodHandle MH_glTexPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexPageCommitmentMemNV;
    public static final MethodHandle MH_glNamedBufferPageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glNamedBufferPageCommitmentMemNV;
    public static final MethodHandle MH_glTexturePageCommitmentMemNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexturePageCommitmentMemNV;

    public GLNVMemoryObjectSparse(overrungl.opengl.GLLoadFunc func) {
        PFN_glBufferPageCommitmentMemNV = func.invoke("glBufferPageCommitmentMemNV");
        PFN_glTexPageCommitmentMemNV = func.invoke("glTexPageCommitmentMemNV");PFN_glNamedBufferPageCommitmentMemNV = func.invoke("glNamedBufferPageCommitmentMemNV");
        PFN_glTexturePageCommitmentMemNV = func.invoke("glTexturePageCommitmentMemNV");
    }

    public void BufferPageCommitmentMemNV(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLuint") int memory, @CType("GLuint64") long memOffset, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferPageCommitmentMemNV))
            MH_glBufferPageCommitmentMemNV.invokeExact(PFN_glBufferPageCommitmentMemNV, target, offset, size, memory, memOffset, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferPageCommitmentMemNV", e); }
    }

    public void TexPageCommitmentMemNV(@CType("GLenum") int target, @CType("GLint") int layer, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLuint") int memory, @CType("GLuint64") long offset, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexPageCommitmentMemNV))
            MH_glTexPageCommitmentMemNV.invokeExact(PFN_glTexPageCommitmentMemNV, target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexPageCommitmentMemNV", e); }
    }

    public void NamedBufferPageCommitmentMemNV(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLuint") int memory, @CType("GLuint64") long memOffset, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferPageCommitmentMemNV))
            MH_glNamedBufferPageCommitmentMemNV.invokeExact(PFN_glNamedBufferPageCommitmentMemNV, buffer, offset, size, memory, memOffset, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferPageCommitmentMemNV", e); }
    }

    public void TexturePageCommitmentMemNV(@CType("GLuint") int texture, @CType("GLint") int layer, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLuint") int memory, @CType("GLuint64") long offset, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexturePageCommitmentMemNV))
            MH_glTexturePageCommitmentMemNV.invokeExact(PFN_glTexturePageCommitmentMemNV, texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexturePageCommitmentMemNV", e); }
    }

}
