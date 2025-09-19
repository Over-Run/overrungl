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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_external_buffer`
public final class GLEXTExternalBuffer {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferStorageExternalEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferStorageExternalEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBufferStorageExternalEXT;
        public final MemorySegment PFN_glNamedBufferStorageExternalEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBufferStorageExternalEXT = func.invoke("glBufferStorageExternalEXT");
            PFN_glNamedBufferStorageExternalEXT = func.invoke("glNamedBufferStorageExternalEXT");
        }
    }

    public GLEXTExternalBuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBufferStorageExternalEXT`.
    /// ```
    /// void glBufferStorageExternalEXT((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (void*) GLeglClientBufferEXT clientBuffer, (unsigned int) GLbitfield flags);
    /// ```
    public void BufferStorageExternalEXT(int target, long offset, long size, @NonNull MemorySegment clientBuffer, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferStorageExternalEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBufferStorageExternalEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferStorageExternalEXT", target, offset, size, clientBuffer, flags); }
        Handles.MH_glBufferStorageExternalEXT.invokeExact(handles.PFN_glBufferStorageExternalEXT, target, offset, size, clientBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in BufferStorageExternalEXT", e); }
    }

    /// Invokes `glNamedBufferStorageExternalEXT`.
    /// ```
    /// void glNamedBufferStorageExternalEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (void*) GLeglClientBufferEXT clientBuffer, (unsigned int) GLbitfield flags);
    /// ```
    public void NamedBufferStorageExternalEXT(int buffer, long offset, long size, @NonNull MemorySegment clientBuffer, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorageExternalEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferStorageExternalEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferStorageExternalEXT", buffer, offset, size, clientBuffer, flags); }
        Handles.MH_glNamedBufferStorageExternalEXT.invokeExact(handles.PFN_glNamedBufferStorageExternalEXT, buffer, offset, size, clientBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorageExternalEXT", e); }
    }

}
