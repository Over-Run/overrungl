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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBMultiBind {
    public static final MethodHandle MH_glBindBuffersBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindBuffersBase;
    public static final MethodHandle MH_glBindBuffersRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindBuffersRange;
    public static final MethodHandle MH_glBindTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindTextures;
    public static final MethodHandle MH_glBindSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindSamplers;
    public static final MethodHandle MH_glBindImageTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindImageTextures;
    public static final MethodHandle MH_glBindVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindVertexBuffers;

    public GLARBMultiBind(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindBuffersBase = func.invoke("glBindBuffersBase");
        PFN_glBindBuffersRange = func.invoke("glBindBuffersRange");
        PFN_glBindTextures = func.invoke("glBindTextures");
        PFN_glBindSamplers = func.invoke("glBindSamplers");
        PFN_glBindImageTextures = func.invoke("glBindImageTextures");
        PFN_glBindVertexBuffers = func.invoke("glBindVertexBuffers");
    }

    public void BindBuffersBase(@CType("GLenum") int target, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBuffersBase))
            MH_glBindBuffersBase.invokeExact(PFN_glBindBuffersBase, target, first, count, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBuffersBase", e); }
    }

    public void BindBuffersRange(@CType("GLenum") int target, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizeiptr *") java.lang.foreign.MemorySegment sizes) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBuffersRange))
            MH_glBindBuffersRange.invokeExact(PFN_glBindBuffersRange, target, first, count, buffers, offsets, sizes);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBuffersRange", e); }
    }

    public void BindTextures(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment textures) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindTextures))
            MH_glBindTextures.invokeExact(PFN_glBindTextures, first, count, textures);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextures", e); }
    }

    public void BindSamplers(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment samplers) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindSamplers))
            MH_glBindSamplers.invokeExact(PFN_glBindSamplers, first, count, samplers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindSamplers", e); }
    }

    public void BindImageTextures(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment textures) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindImageTextures))
            MH_glBindImageTextures.invokeExact(PFN_glBindImageTextures, first, count, textures);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindImageTextures", e); }
    }

    public void BindVertexBuffers(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizei *") java.lang.foreign.MemorySegment strides) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindVertexBuffers))
            MH_glBindVertexBuffers.invokeExact(PFN_glBindVertexBuffers, first, count, buffers, offsets, strides);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexBuffers", e); }
    }

}
