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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glLoadTransposeMatrixfARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLoadTransposeMatrixdARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultTransposeMatrixfARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultTransposeMatrixdARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glLoadTransposeMatrixfARB,
            FD_glLoadTransposeMatrixdARB,
            FD_glMultTransposeMatrixfARB,
            FD_glMultTransposeMatrixdARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glLoadTransposeMatrixfARB = RuntimeHelper.downcall(Descriptors.FD_glLoadTransposeMatrixfARB);
        public static final MethodHandle MH_glLoadTransposeMatrixdARB = RuntimeHelper.downcall(Descriptors.FD_glLoadTransposeMatrixdARB);
        public static final MethodHandle MH_glMultTransposeMatrixfARB = RuntimeHelper.downcall(Descriptors.FD_glMultTransposeMatrixfARB);
        public static final MethodHandle MH_glMultTransposeMatrixdARB = RuntimeHelper.downcall(Descriptors.FD_glMultTransposeMatrixdARB);
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

    public void LoadTransposeMatrixfARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glLoadTransposeMatrixfARB)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixfARB");
        try { Handles.MH_glLoadTransposeMatrixfARB.invokeExact(handles.PFN_glLoadTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixfARB", e); }
    }

    public void LoadTransposeMatrixdARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glLoadTransposeMatrixdARB)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixdARB");
        try { Handles.MH_glLoadTransposeMatrixdARB.invokeExact(handles.PFN_glLoadTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixdARB", e); }
    }

    public void MultTransposeMatrixfARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultTransposeMatrixfARB)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixfARB");
        try { Handles.MH_glMultTransposeMatrixfARB.invokeExact(handles.PFN_glMultTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixfARB", e); }
    }

    public void MultTransposeMatrixdARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultTransposeMatrixdARB)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixdARB");
        try { Handles.MH_glMultTransposeMatrixdARB.invokeExact(handles.PFN_glMultTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixdARB", e); }
    }

}
