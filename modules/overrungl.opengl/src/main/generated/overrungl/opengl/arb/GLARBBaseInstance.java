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

public final class GLARBBaseInstance {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedBaseInstance = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseInstance = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseVertexBaseInstance = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawArraysInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertexBaseInstance;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawArraysInstancedBaseInstance = func.invoke("glDrawArraysInstancedBaseInstance");
            PFN_glDrawElementsInstancedBaseInstance = func.invoke("glDrawElementsInstancedBaseInstance");
            PFN_glDrawElementsInstancedBaseVertexBaseInstance = func.invoke("glDrawElementsInstancedBaseVertexBaseInstance");
        }
    }

    public GLARBBaseInstance(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawArraysInstancedBaseInstance((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count, (int) GLsizei instancecount, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawArraysInstancedBaseInstance(int mode, int first, int count, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysInstancedBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysInstancedBaseInstance", mode, first, count, instancecount, baseinstance); }
        Handles.MH_glDrawArraysInstancedBaseInstance.invokeExact(handles.PFN_glDrawArraysInstancedBaseInstance, mode, first, count, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedBaseInstance", e); }
    }

    /// ```
    /// void glDrawElementsInstancedBaseInstance((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseInstance(int mode, int count, int type, MemorySegment indices, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseInstance", mode, count, type, indices, instancecount, baseinstance); }
        Handles.MH_glDrawElementsInstancedBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseInstance, mode, count, type, indices, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseInstance", e); }
    }

    /// ```
    /// void glDrawElementsInstancedBaseVertexBaseInstance((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (int) GLint basevertex, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, MemorySegment indices, int instancecount, int basevertex, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertexBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseVertexBaseInstance", mode, count, type, indices, instancecount, basevertex, baseinstance); }
        Handles.MH_glDrawElementsInstancedBaseVertexBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance, mode, count, type, indices, instancecount, basevertex, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseVertexBaseInstance", e); }
    }

}
