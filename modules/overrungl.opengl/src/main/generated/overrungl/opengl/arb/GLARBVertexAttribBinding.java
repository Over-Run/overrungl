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

public final class GLARBVertexAttribBinding {
    public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindVertexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribIFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribLFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBindingDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindVertexBuffer;
        public final MemorySegment PFN_glVertexAttribFormat;
        public final MemorySegment PFN_glVertexAttribIFormat;
        public final MemorySegment PFN_glVertexAttribLFormat;
        public final MemorySegment PFN_glVertexAttribBinding;
        public final MemorySegment PFN_glVertexBindingDivisor;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindVertexBuffer = func.invoke("glBindVertexBuffer");
            PFN_glVertexAttribFormat = func.invoke("glVertexAttribFormat");
            PFN_glVertexAttribIFormat = func.invoke("glVertexAttribIFormat");
            PFN_glVertexAttribLFormat = func.invoke("glVertexAttribLFormat");
            PFN_glVertexAttribBinding = func.invoke("glVertexAttribBinding");
            PFN_glVertexBindingDivisor = func.invoke("glVertexBindingDivisor");
        }
    }

    public GLARBVertexAttribBinding(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindVertexBuffer((unsigned int) GLuint bindingindex, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, (int) GLsizei stride);
    /// ```
    public void BindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexBuffer");
        try { Handles.MH_glBindVertexBuffer.invokeExact(handles.PFN_glBindVertexBuffer, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexBuffer", e); }
    }

    /// ```
    /// void glVertexAttribFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribFormat");
        try { Handles.MH_glVertexAttribFormat.invokeExact(handles.PFN_glVertexAttribFormat, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribFormat", e); }
    }

    /// ```
    /// void glVertexAttribIFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIFormat");
        try { Handles.MH_glVertexAttribIFormat.invokeExact(handles.PFN_glVertexAttribIFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIFormat", e); }
    }

    /// ```
    /// void glVertexAttribLFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribLFormat");
        try { Handles.MH_glVertexAttribLFormat.invokeExact(handles.PFN_glVertexAttribLFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLFormat", e); }
    }

    /// ```
    /// void glVertexAttribBinding((unsigned int) GLuint attribindex, (unsigned int) GLuint bindingindex);
    /// ```
    public void VertexAttribBinding(int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribBinding)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribBinding");
        try { Handles.MH_glVertexAttribBinding.invokeExact(handles.PFN_glVertexAttribBinding, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribBinding", e); }
    }

    /// ```
    /// void glVertexBindingDivisor((unsigned int) GLuint bindingindex, (unsigned int) GLuint divisor);
    /// ```
    public void VertexBindingDivisor(int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBindingDivisor)) throw new GLSymbolNotFoundError("Symbol not found: glVertexBindingDivisor");
        try { Handles.MH_glVertexBindingDivisor.invokeExact(handles.PFN_glVertexBindingDivisor, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBindingDivisor", e); }
    }

}
