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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVBindlessMultiDrawIndirectCount {
    public static final MethodHandle MH_glMultiDrawArraysIndirectBindlessCountNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiDrawElementsIndirectBindlessCountNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawArraysIndirectBindlessCountNV;
    public final MemorySegment PFN_glMultiDrawElementsIndirectBindlessCountNV;

    public GLNVBindlessMultiDrawIndirectCount(overrungl.opengl.GLLoadFunc func) {
        PFN_glMultiDrawArraysIndirectBindlessCountNV = func.invoke("glMultiDrawArraysIndirectBindlessCountNV");
        PFN_glMultiDrawElementsIndirectBindlessCountNV = func.invoke("glMultiDrawElementsIndirectBindlessCountNV");
    }

    public void MultiDrawArraysIndirectBindlessCountNV(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawCount, @CType("GLsizei") int maxDrawCount, @CType("GLsizei") int stride, @CType("GLint") int vertexBufferCount) {
        if (Unmarshal.isNullPointer(PFN_glMultiDrawArraysIndirectBindlessCountNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectBindlessCountNV");
        try { MH_glMultiDrawArraysIndirectBindlessCountNV.invokeExact(PFN_glMultiDrawArraysIndirectBindlessCountNV, mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirectBindlessCountNV", e); }
    }

    public void MultiDrawElementsIndirectBindlessCountNV(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawCount, @CType("GLsizei") int maxDrawCount, @CType("GLsizei") int stride, @CType("GLint") int vertexBufferCount) {
        if (Unmarshal.isNullPointer(PFN_glMultiDrawElementsIndirectBindlessCountNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectBindlessCountNV");
        try { MH_glMultiDrawElementsIndirectBindlessCountNV.invokeExact(PFN_glMultiDrawElementsIndirectBindlessCountNV, mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirectBindlessCountNV", e); }
    }

}
