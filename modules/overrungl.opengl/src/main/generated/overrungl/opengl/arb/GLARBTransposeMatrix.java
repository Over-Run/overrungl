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

public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glLoadTransposeMatrixfARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLoadTransposeMatrixdARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultTransposeMatrixfARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultTransposeMatrixdARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glLoadTransposeMatrixfARB;
        public final MemorySegment PFN_glLoadTransposeMatrixdARB;
        public final MemorySegment PFN_glMultTransposeMatrixfARB;
        public final MemorySegment PFN_glMultTransposeMatrixdARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLoadTransposeMatrixfARB = func.invoke("glLoadTransposeMatrixfARB", "glLoadTransposeMatrixf");
            PFN_glLoadTransposeMatrixdARB = func.invoke("glLoadTransposeMatrixdARB", "glLoadTransposeMatrixd");
            PFN_glMultTransposeMatrixfARB = func.invoke("glMultTransposeMatrixfARB", "glMultTransposeMatrixf");
            PFN_glMultTransposeMatrixdARB = func.invoke("glMultTransposeMatrixdARB", "glMultTransposeMatrixd");
        }
    }

    public GLARBTransposeMatrix(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glLoadTransposeMatrixfARB(const GLfloat* m);
    /// ```
    public void LoadTransposeMatrixfARB(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixfARB)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixfARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadTransposeMatrixfARB", m); }
        Handles.MH_glLoadTransposeMatrixfARB.invokeExact(handles.PFN_glLoadTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixfARB", e); }
    }

    /// ```
    /// void glLoadTransposeMatrixdARB(const GLdouble* m);
    /// ```
    public void LoadTransposeMatrixdARB(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixdARB)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixdARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadTransposeMatrixdARB", m); }
        Handles.MH_glLoadTransposeMatrixdARB.invokeExact(handles.PFN_glLoadTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixdARB", e); }
    }

    /// ```
    /// void glMultTransposeMatrixfARB(const GLfloat* m);
    /// ```
    public void MultTransposeMatrixfARB(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixfARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixfARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultTransposeMatrixfARB", m); }
        Handles.MH_glMultTransposeMatrixfARB.invokeExact(handles.PFN_glMultTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixfARB", e); }
    }

    /// ```
    /// void glMultTransposeMatrixdARB(const GLdouble* m);
    /// ```
    public void MultTransposeMatrixdARB(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixdARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixdARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultTransposeMatrixdARB", m); }
        Handles.MH_glMultTransposeMatrixdARB.invokeExact(handles.PFN_glMultTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixdARB", e); }
    }

}
