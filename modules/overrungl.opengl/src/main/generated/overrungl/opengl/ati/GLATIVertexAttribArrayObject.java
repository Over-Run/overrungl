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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLATIVertexAttribArrayObject {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribArrayObjectATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVertexAttribArrayObjectfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribArrayObjectivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttribArrayObjectATI;
        public final MemorySegment PFN_glGetVertexAttribArrayObjectfvATI;
        public final MemorySegment PFN_glGetVertexAttribArrayObjectivATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribArrayObjectATI = func.invoke("glVertexAttribArrayObjectATI");
            PFN_glGetVertexAttribArrayObjectfvATI = func.invoke("glGetVertexAttribArrayObjectfvATI");
            PFN_glGetVertexAttribArrayObjectivATI = func.invoke("glGetVertexAttribArrayObjectivATI");
        }
    }

    public GLATIVertexAttribArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexAttribArrayObjectATI((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void VertexAttribArrayObjectATI(int index, int size, int type, boolean normalized, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribArrayObjectATI");
        try { Handles.MH_glVertexAttribArrayObjectATI.invokeExact(handles.PFN_glVertexAttribArrayObjectATI, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribArrayObjectATI", e); }
    }

    /// ```
    /// void glGetVertexAttribArrayObjectfvATI((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribArrayObjectfvATI(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectfvATI");
        try { Handles.MH_glGetVertexAttribArrayObjectfvATI.invokeExact(handles.PFN_glGetVertexAttribArrayObjectfvATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribArrayObjectfvATI", e); }
    }

    /// ```
    /// void glGetVertexAttribArrayObjectivATI((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribArrayObjectivATI(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectivATI");
        try { Handles.MH_glGetVertexAttribArrayObjectivATI.invokeExact(handles.PFN_glGetVertexAttribArrayObjectivATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribArrayObjectivATI", e); }
    }

}
