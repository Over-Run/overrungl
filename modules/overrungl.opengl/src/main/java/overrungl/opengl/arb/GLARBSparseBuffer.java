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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferPageCommitmentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glNamedBufferPageCommitmentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glNamedBufferPageCommitmentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE));
        public final MemorySegment PFN_glBufferPageCommitmentARB;
        public final MemorySegment PFN_glNamedBufferPageCommitmentEXT;
        public final MemorySegment PFN_glNamedBufferPageCommitmentARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBufferPageCommitmentARB = func.invoke("glBufferPageCommitmentARB");PFN_glNamedBufferPageCommitmentEXT = func.invoke("glNamedBufferPageCommitmentEXT");PFN_glNamedBufferPageCommitmentARB = func.invoke("glNamedBufferPageCommitmentARB");
        }
    }

    public GLARBSparseBuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBufferPageCommitmentARB(GLenum target, GLintptr offset, GLsizeiptr size, GLboolean commit);
    /// ```
    public void BufferPageCommitmentARB(int target, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferPageCommitmentARB)) throw new SymbolNotFoundError("Symbol not found: glBufferPageCommitmentARB");
        try { Handles.MH_glBufferPageCommitmentARB.invokeExact(handles.PFN_glBufferPageCommitmentARB, target, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in BufferPageCommitmentARB", e); }
    }

    /// ```
    /// void glNamedBufferPageCommitmentEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentEXT");
        try { Handles.MH_glNamedBufferPageCommitmentEXT.invokeExact(handles.PFN_glNamedBufferPageCommitmentEXT, buffer, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentEXT", e); }
    }

    /// ```
    /// void glNamedBufferPageCommitmentARB(GLuint buffer, GLintptr offset, GLsizeiptr size, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentARB)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentARB");
        try { Handles.MH_glNamedBufferPageCommitmentARB.invokeExact(handles.PFN_glNamedBufferPageCommitmentARB, buffer, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentARB", e); }
    }

}
