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
import overrungl.opengl.*;

public final class GLARBMapBufferRange {
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMapBufferRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glMapBufferRange;
        public final MemorySegment PFN_glFlushMappedBufferRange;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMapBufferRange = func.invoke("glMapBufferRange");
            PFN_glFlushMappedBufferRange = func.invoke("glFlushMappedBufferRange");
        }
    }

    public GLARBMapBufferRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void* glMapBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length, (unsigned int) GLbitfield access);
    /// ```
    public MemorySegment MapBufferRange(int target, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glMapBufferRange");
        try { return (MemorySegment) Handles.MH_glMapBufferRange.invokeExact(handles.PFN_glMapBufferRange, target, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBufferRange", e); }
    }

    /// ```
    /// void glFlushMappedBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void FlushMappedBufferRange(int target, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glFlushMappedBufferRange");
        try { Handles.MH_glFlushMappedBufferRange.invokeExact(handles.PFN_glFlushMappedBufferRange, target, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedBufferRange", e); }
    }

}
