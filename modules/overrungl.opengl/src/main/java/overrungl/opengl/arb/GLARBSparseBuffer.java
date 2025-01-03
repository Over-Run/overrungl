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

public final class GLARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;
    public static final MethodHandle MH_glBufferPageCommitmentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glBufferPageCommitmentARB;
    public static final MethodHandle MH_glNamedBufferPageCommitmentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glNamedBufferPageCommitmentEXT;
    public static final MethodHandle MH_glNamedBufferPageCommitmentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glNamedBufferPageCommitmentARB;

    public GLARBSparseBuffer(overrungl.opengl.GLLoadFunc func) {
        PFN_glBufferPageCommitmentARB = func.invoke("glBufferPageCommitmentARB");PFN_glNamedBufferPageCommitmentEXT = func.invoke("glNamedBufferPageCommitmentEXT");PFN_glNamedBufferPageCommitmentARB = func.invoke("glNamedBufferPageCommitmentARB");
    }

    public void BufferPageCommitmentARB(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferPageCommitmentARB))
            MH_glBufferPageCommitmentARB.invokeExact(PFN_glBufferPageCommitmentARB, target, offset, size, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferPageCommitmentARB", e); }
    }

    public void NamedBufferPageCommitmentEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferPageCommitmentEXT))
            MH_glNamedBufferPageCommitmentEXT.invokeExact(PFN_glNamedBufferPageCommitmentEXT, buffer, offset, size, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferPageCommitmentEXT", e); }
    }

    public void NamedBufferPageCommitmentARB(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferPageCommitmentARB))
            MH_glNamedBufferPageCommitmentARB.invokeExact(PFN_glNamedBufferPageCommitmentARB, buffer, offset, size, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferPageCommitmentARB", e); }
    }

}
