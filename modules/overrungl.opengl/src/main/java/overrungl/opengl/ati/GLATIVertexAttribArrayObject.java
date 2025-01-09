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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIVertexAttribArrayObject {
    public static final MethodHandle MH_glVertexAttribArrayObjectATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetVertexAttribArrayObjectfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVertexAttribArrayObjectivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribArrayObjectATI;
    public final MemorySegment PFN_glGetVertexAttribArrayObjectfvATI;
    public final MemorySegment PFN_glGetVertexAttribArrayObjectivATI;

    public GLATIVertexAttribArrayObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glVertexAttribArrayObjectATI = func.invoke("glVertexAttribArrayObjectATI");
        PFN_glGetVertexAttribArrayObjectfvATI = func.invoke("glGetVertexAttribArrayObjectfvATI");
        PFN_glGetVertexAttribArrayObjectivATI = func.invoke("glGetVertexAttribArrayObjectivATI");
    }

    public void VertexAttribArrayObjectATI(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("GLuint") int buffer, @CType("GLuint") int offset) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribArrayObjectATI)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribArrayObjectATI");
        try { MH_glVertexAttribArrayObjectATI.invokeExact(PFN_glVertexAttribArrayObjectATI, index, size, type, normalized, stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribArrayObjectATI", e); }
    }

    public void GetVertexAttribArrayObjectfvATI(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribArrayObjectfvATI)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectfvATI");
        try { MH_glGetVertexAttribArrayObjectfvATI.invokeExact(PFN_glGetVertexAttribArrayObjectfvATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribArrayObjectfvATI", e); }
    }

    public void GetVertexAttribArrayObjectivATI(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribArrayObjectivATI)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectivATI");
        try { MH_glGetVertexAttribArrayObjectivATI.invokeExact(PFN_glGetVertexAttribArrayObjectivATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribArrayObjectivATI", e); }
    }

}
