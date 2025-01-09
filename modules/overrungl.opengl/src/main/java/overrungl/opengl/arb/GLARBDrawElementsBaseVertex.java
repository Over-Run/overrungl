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

public final class GLARBDrawElementsBaseVertex {
    public static final MethodHandle MH_glDrawElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDrawRangeElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDrawElementsInstancedBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiDrawElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDrawElementsBaseVertex;
    public final MemorySegment PFN_glDrawRangeElementsBaseVertex;
    public final MemorySegment PFN_glDrawElementsInstancedBaseVertex;
    public final MemorySegment PFN_glMultiDrawElementsBaseVertex;

    public GLARBDrawElementsBaseVertex(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawElementsBaseVertex = func.invoke("glDrawElementsBaseVertex");
        PFN_glDrawRangeElementsBaseVertex = func.invoke("glDrawRangeElementsBaseVertex");
        PFN_glDrawElementsInstancedBaseVertex = func.invoke("glDrawElementsInstancedBaseVertex");
        PFN_glMultiDrawElementsBaseVertex = func.invoke("glMultiDrawElementsBaseVertex");
    }

    public void DrawElementsBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(PFN_glDrawElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsBaseVertex");
        try { MH_glDrawElementsBaseVertex.invokeExact(PFN_glDrawElementsBaseVertex, mode, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsBaseVertex", e); }
    }

    public void DrawRangeElementsBaseVertex(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(PFN_glDrawRangeElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementsBaseVertex");
        try { MH_glDrawRangeElementsBaseVertex.invokeExact(PFN_glDrawRangeElementsBaseVertex, mode, start, end, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementsBaseVertex", e); }
    }

    public void DrawElementsInstancedBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int instancecount, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(PFN_glDrawElementsInstancedBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertex");
        try { MH_glDrawElementsInstancedBaseVertex.invokeExact(PFN_glDrawElementsInstancedBaseVertex, mode, count, type, indices, instancecount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedBaseVertex", e); }
    }

    public void MultiDrawElementsBaseVertex(@CType("GLenum") int mode, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int drawcount, @CType("const GLint *") java.lang.foreign.MemorySegment basevertex) {
        if (Unmarshal.isNullPointer(PFN_glMultiDrawElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsBaseVertex");
        try { MH_glMultiDrawElementsBaseVertex.invokeExact(PFN_glMultiDrawElementsBaseVertex, mode, count, type, indices, drawcount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsBaseVertex", e); }
    }

}
