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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMultiDrawArraysIndirectBindlessCountNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawElementsIndirectBindlessCountNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirectBindlessCountNV = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawArraysIndirectBindlessCountNV);
        public static final MethodHandle MH_glMultiDrawElementsIndirectBindlessCountNV = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawElementsIndirectBindlessCountNV);
        public final MemorySegment PFN_glMultiDrawArraysIndirectBindlessCountNV;
        public final MemorySegment PFN_glMultiDrawElementsIndirectBindlessCountNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectBindlessCountNV = func.invoke("glMultiDrawArraysIndirectBindlessCountNV");
            PFN_glMultiDrawElementsIndirectBindlessCountNV = func.invoke("glMultiDrawElementsIndirectBindlessCountNV");
        }
    }

    public GLNVBindlessMultiDrawIndirectCount(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MultiDrawArraysIndirectBindlessCountNV(@CType("GLenum") int mode, @CType("const void *") MemorySegment indirect, @CType("GLsizei") int drawCount, @CType("GLsizei") int maxDrawCount, @CType("GLsizei") int stride, @CType("GLint") int vertexBufferCount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawArraysIndirectBindlessCountNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectBindlessCountNV");
        try { Handles.MH_glMultiDrawArraysIndirectBindlessCountNV.invokeExact(handles.PFN_glMultiDrawArraysIndirectBindlessCountNV, mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirectBindlessCountNV", e); }
    }

    public void MultiDrawElementsIndirectBindlessCountNV(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") MemorySegment indirect, @CType("GLsizei") int drawCount, @CType("GLsizei") int maxDrawCount, @CType("GLsizei") int stride, @CType("GLint") int vertexBufferCount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawElementsIndirectBindlessCountNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectBindlessCountNV");
        try { Handles.MH_glMultiDrawElementsIndirectBindlessCountNV.invokeExact(handles.PFN_glMultiDrawElementsIndirectBindlessCountNV, mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirectBindlessCountNV", e); }
    }

}
