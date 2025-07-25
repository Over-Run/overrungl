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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBDrawElementsBaseVertex {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawElementsBaseVertex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawRangeElementsBaseVertex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseVertex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsBaseVertex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawElementsBaseVertex;
        public final MemorySegment PFN_glDrawRangeElementsBaseVertex;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertex;
        public final MemorySegment PFN_glMultiDrawElementsBaseVertex;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawElementsBaseVertex = func.invoke("glDrawElementsBaseVertex");
            PFN_glDrawRangeElementsBaseVertex = func.invoke("glDrawRangeElementsBaseVertex");
            PFN_glDrawElementsInstancedBaseVertex = func.invoke("glDrawElementsInstancedBaseVertex");
            PFN_glMultiDrawElementsBaseVertex = func.invoke("glMultiDrawElementsBaseVertex");
        }
    }

    public GLARBDrawElementsBaseVertex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawElementsBaseVertex((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLint basevertex);
    /// ```
    public void DrawElementsBaseVertex(int mode, int count, int type, MemorySegment indices, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsBaseVertex", mode, count, type, indices, basevertex); }
        Handles.MH_glDrawElementsBaseVertex.invokeExact(handles.PFN_glDrawElementsBaseVertex, mode, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsBaseVertex", e); }
    }

    /// ```
    /// void glDrawRangeElementsBaseVertex((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLint basevertex);
    /// ```
    public void DrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, MemorySegment indices, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawRangeElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawRangeElementsBaseVertex", mode, start, end, count, type, indices, basevertex); }
        Handles.MH_glDrawRangeElementsBaseVertex.invokeExact(handles.PFN_glDrawRangeElementsBaseVertex, mode, start, end, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementsBaseVertex", e); }
    }

    /// ```
    /// void glDrawElementsInstancedBaseVertex((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (int) GLint basevertex);
    /// ```
    public void DrawElementsInstancedBaseVertex(int mode, int count, int type, MemorySegment indices, int instancecount, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseVertex", mode, count, type, indices, instancecount, basevertex); }
        Handles.MH_glDrawElementsInstancedBaseVertex.invokeExact(handles.PFN_glDrawElementsInstancedBaseVertex, mode, count, type, indices, instancecount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseVertex", e); }
    }

    /// ```
    /// void glMultiDrawElementsBaseVertex((unsigned int) GLenum mode, const GLsizei* count, (unsigned int) GLenum type, const void* const * indices, (int) GLsizei drawcount, const GLint* basevertex);
    /// ```
    public void MultiDrawElementsBaseVertex(int mode, MemorySegment count, int type, MemorySegment indices, int drawcount, MemorySegment basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsBaseVertex", mode, count, type, indices, drawcount, basevertex); }
        Handles.MH_glMultiDrawElementsBaseVertex.invokeExact(handles.PFN_glMultiDrawElementsBaseVertex, mode, count, type, indices, drawcount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsBaseVertex", e); }
    }

}
