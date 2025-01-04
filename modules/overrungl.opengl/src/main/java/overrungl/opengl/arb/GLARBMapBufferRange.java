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

public final class GLARBMapBufferRange {
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final MethodHandle MH_glMapBufferRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapBufferRange;
    public static final MethodHandle MH_glFlushMappedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glFlushMappedBufferRange;

    public GLARBMapBufferRange(overrungl.opengl.GLLoadFunc func) {
        PFN_glMapBufferRange = func.invoke("glMapBufferRange");
        PFN_glFlushMappedBufferRange = func.invoke("glFlushMappedBufferRange");
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapBufferRange(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapBufferRange))
            return (java.lang.foreign.MemorySegment) MH_glMapBufferRange.invokeExact(PFN_glMapBufferRange, target, offset, length, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapBufferRange", e); }
    }

    public void FlushMappedBufferRange(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushMappedBufferRange))
            MH_glFlushMappedBufferRange.invokeExact(PFN_glFlushMappedBufferRange, target, offset, length);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedBufferRange", e); }
    }

}
