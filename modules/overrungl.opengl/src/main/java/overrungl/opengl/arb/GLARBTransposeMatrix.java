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

public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    public static final MethodHandle MH_glLoadTransposeMatrixfARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLoadTransposeMatrixdARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultTransposeMatrixfARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultTransposeMatrixdARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLoadTransposeMatrixfARB;
    public final MemorySegment PFN_glLoadTransposeMatrixdARB;
    public final MemorySegment PFN_glMultTransposeMatrixfARB;
    public final MemorySegment PFN_glMultTransposeMatrixdARB;

    public GLARBTransposeMatrix(overrungl.opengl.GLLoadFunc func) {
        PFN_glLoadTransposeMatrixfARB = func.invoke("glLoadTransposeMatrixfARB", "glLoadTransposeMatrixf");
        PFN_glLoadTransposeMatrixdARB = func.invoke("glLoadTransposeMatrixdARB", "glLoadTransposeMatrixd");
        PFN_glMultTransposeMatrixfARB = func.invoke("glMultTransposeMatrixfARB", "glMultTransposeMatrixf");
        PFN_glMultTransposeMatrixdARB = func.invoke("glMultTransposeMatrixdARB", "glMultTransposeMatrixd");
    }

    public void LoadTransposeMatrixfARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glLoadTransposeMatrixfARB)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixfARB");
        try { MH_glLoadTransposeMatrixfARB.invokeExact(PFN_glLoadTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixfARB", e); }
    }

    public void LoadTransposeMatrixdARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glLoadTransposeMatrixdARB)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixdARB");
        try { MH_glLoadTransposeMatrixdARB.invokeExact(PFN_glLoadTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixdARB", e); }
    }

    public void MultTransposeMatrixfARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glMultTransposeMatrixfARB)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixfARB");
        try { MH_glMultTransposeMatrixfARB.invokeExact(PFN_glMultTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixfARB", e); }
    }

    public void MultTransposeMatrixdARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glMultTransposeMatrixdARB)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixdARB");
        try { MH_glMultTransposeMatrixdARB.invokeExact(PFN_glMultTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixdARB", e); }
    }

}
