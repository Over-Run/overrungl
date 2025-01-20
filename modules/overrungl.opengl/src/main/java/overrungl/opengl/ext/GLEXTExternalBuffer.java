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

public final class GLEXTExternalBuffer {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferStorageExternalEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferStorageExternalEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBufferStorageExternalEXT;
        public final MemorySegment PFN_glNamedBufferStorageExternalEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBufferStorageExternalEXT = func.invoke("glBufferStorageExternalEXT");
            PFN_glNamedBufferStorageExternalEXT = func.invoke("glNamedBufferStorageExternalEXT");
        }
    }

    public GLEXTExternalBuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BufferStorageExternalEXT(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLeglClientBufferEXT") MemorySegment clientBuffer, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glBufferStorageExternalEXT)) throw new SymbolNotFoundError("Symbol not found: glBufferStorageExternalEXT");
        try { Handles.MH_glBufferStorageExternalEXT.invokeExact(handles.PFN_glBufferStorageExternalEXT, target, offset, size, clientBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glBufferStorageExternalEXT", e); }
    }

    public void NamedBufferStorageExternalEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLeglClientBufferEXT") MemorySegment clientBuffer, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferStorageExternalEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorageExternalEXT");
        try { Handles.MH_glNamedBufferStorageExternalEXT.invokeExact(handles.PFN_glNamedBufferStorageExternalEXT, buffer, offset, size, clientBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorageExternalEXT", e); }
    }

}
