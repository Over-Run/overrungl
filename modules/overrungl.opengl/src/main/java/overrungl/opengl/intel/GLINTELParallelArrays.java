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
package overrungl.opengl.intel;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLINTELParallelArrays {
    public static final int GL_PARALLEL_ARRAYS_INTEL = 0x83F4;
    public static final int GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F5;
    public static final int GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F6;
    public static final int GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F7;
    public static final int GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F8;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexPointervINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalPointervINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorPointervINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordPointervINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexPointervINTEL;
        public final MemorySegment PFN_glNormalPointervINTEL;
        public final MemorySegment PFN_glColorPointervINTEL;
        public final MemorySegment PFN_glTexCoordPointervINTEL;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexPointervINTEL = func.invoke("glVertexPointervINTEL");
            PFN_glNormalPointervINTEL = func.invoke("glNormalPointervINTEL");
            PFN_glColorPointervINTEL = func.invoke("glColorPointervINTEL");
            PFN_glTexCoordPointervINTEL = func.invoke("glTexCoordPointervINTEL");
        }
    }

    public GLINTELParallelArrays(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexPointervINTEL(@CType("GLint") int size, @CType("GLenum") int type, @CType("const void **") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexPointervINTEL)) throw new SymbolNotFoundError("Symbol not found: glVertexPointervINTEL");
        try { Handles.MH_glVertexPointervINTEL.invokeExact(handles.PFN_glVertexPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexPointervINTEL", e); }
    }

    public void NormalPointervINTEL(@CType("GLenum") int type, @CType("const void **") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalPointervINTEL)) throw new SymbolNotFoundError("Symbol not found: glNormalPointervINTEL");
        try { Handles.MH_glNormalPointervINTEL.invokeExact(handles.PFN_glNormalPointervINTEL, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalPointervINTEL", e); }
    }

    public void ColorPointervINTEL(@CType("GLint") int size, @CType("GLenum") int type, @CType("const void **") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorPointervINTEL)) throw new SymbolNotFoundError("Symbol not found: glColorPointervINTEL");
        try { Handles.MH_glColorPointervINTEL.invokeExact(handles.PFN_glColorPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glColorPointervINTEL", e); }
    }

    public void TexCoordPointervINTEL(@CType("GLint") int size, @CType("GLenum") int type, @CType("const void **") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordPointervINTEL)) throw new SymbolNotFoundError("Symbol not found: glTexCoordPointervINTEL");
        try { Handles.MH_glTexCoordPointervINTEL.invokeExact(handles.PFN_glTexCoordPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordPointervINTEL", e); }
    }

}
