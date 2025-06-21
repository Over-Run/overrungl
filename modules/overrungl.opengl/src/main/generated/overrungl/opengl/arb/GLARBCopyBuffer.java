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

public final class GLARBCopyBuffer {
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCopyBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glCopyBufferSubData;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCopyBufferSubData = func.invoke("glCopyBufferSubData");
        }
    }

    public GLARBCopyBuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCopyBufferSubData((unsigned int) GLenum readTarget, (unsigned int) GLenum writeTarget, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void CopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glCopyBufferSubData");
        try { Handles.MH_glCopyBufferSubData.invokeExact(handles.PFN_glCopyBufferSubData, readTarget, writeTarget, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in CopyBufferSubData", e); }
    }

}
