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

public final class GLARBVertexAttribBinding {
    public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    public static final MethodHandle MH_glBindVertexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindVertexBuffer;
    public static final MethodHandle MH_glVertexAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribFormat;
    public static final MethodHandle MH_glVertexAttribIFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribIFormat;
    public static final MethodHandle MH_glVertexAttribLFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribLFormat;
    public static final MethodHandle MH_glVertexAttribBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribBinding;
    public static final MethodHandle MH_glVertexBindingDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexBindingDivisor;

    public GLARBVertexAttribBinding(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindVertexBuffer = func.invoke("glBindVertexBuffer");
        PFN_glVertexAttribFormat = func.invoke("glVertexAttribFormat");
        PFN_glVertexAttribIFormat = func.invoke("glVertexAttribIFormat");
        PFN_glVertexAttribLFormat = func.invoke("glVertexAttribLFormat");
        PFN_glVertexAttribBinding = func.invoke("glVertexAttribBinding");
        PFN_glVertexBindingDivisor = func.invoke("glVertexBindingDivisor");
    }

    public void BindVertexBuffer(@CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glBindVertexBuffer)) { try {
            MH_glBindVertexBuffer.invokeExact(PFN_glBindVertexBuffer, bindingindex, buffer, offset, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glBindVertexBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindVertexBuffer"); }
    }

    public void VertexAttribFormat(@CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribFormat)) { try {
            MH_glVertexAttribFormat.invokeExact(PFN_glVertexAttribFormat, attribindex, size, type, normalized, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribFormat"); }
    }

    public void VertexAttribIFormat(@CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribIFormat)) { try {
            MH_glVertexAttribIFormat.invokeExact(PFN_glVertexAttribIFormat, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribIFormat"); }
    }

    public void VertexAttribLFormat(@CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribLFormat)) { try {
            MH_glVertexAttribLFormat.invokeExact(PFN_glVertexAttribLFormat, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribLFormat"); }
    }

    public void VertexAttribBinding(@CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribBinding)) { try {
            MH_glVertexAttribBinding.invokeExact(PFN_glVertexAttribBinding, attribindex, bindingindex);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribBinding", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribBinding"); }
    }

    public void VertexBindingDivisor(@CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        if (!Unmarshal.isNullPointer(PFN_glVertexBindingDivisor)) { try {
            MH_glVertexBindingDivisor.invokeExact(PFN_glVertexBindingDivisor, bindingindex, divisor);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexBindingDivisor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexBindingDivisor"); }
    }

}
