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

public final class GLARBBaseInstance {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseVertexBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    public void DrawArraysInstancedBaseInstance(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count, @CType("GLsizei") int instancecount, @CType("GLuint") int baseinstance) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysInstancedBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedBaseInstance");
        try { Handles.MH_glDrawArraysInstancedBaseInstance.invokeExact(handles.PFN_glDrawArraysInstancedBaseInstance, mode, first, count, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstancedBaseInstance", e); }
    }

    public void DrawElementsInstancedBaseInstance(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices, @CType("GLsizei") int instancecount, @CType("GLuint") int baseinstance) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstancedBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseInstance");
        try { Handles.MH_glDrawElementsInstancedBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseInstance, mode, count, type, indices, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedBaseInstance", e); }
    }

    public void DrawElementsInstancedBaseVertexBaseInstance(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices, @CType("GLsizei") int instancecount, @CType("GLint") int basevertex, @CType("GLuint") int baseinstance) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertexBaseInstance");
        try { Handles.MH_glDrawElementsInstancedBaseVertexBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance, mode, count, type, indices, instancecount, basevertex, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedBaseVertexBaseInstance", e); }
    }

}
