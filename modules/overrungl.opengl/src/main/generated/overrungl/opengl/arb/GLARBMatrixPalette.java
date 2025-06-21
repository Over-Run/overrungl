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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBMatrixPalette {
    public static final int GL_MATRIX_PALETTE_ARB = 0x8840;
    public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841;
    public static final int GL_MAX_PALETTE_MATRICES_ARB = 0x8842;
    public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 0x8843;
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 0x8846;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 0x8847;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCurrentPaletteMatrixARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixIndexubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixIndexusvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixIndexuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixIndexPointerARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCurrentPaletteMatrixARB;
        public final MemorySegment PFN_glMatrixIndexubvARB;
        public final MemorySegment PFN_glMatrixIndexusvARB;
        public final MemorySegment PFN_glMatrixIndexuivARB;
        public final MemorySegment PFN_glMatrixIndexPointerARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCurrentPaletteMatrixARB = func.invoke("glCurrentPaletteMatrixARB");
            PFN_glMatrixIndexubvARB = func.invoke("glMatrixIndexubvARB");
            PFN_glMatrixIndexusvARB = func.invoke("glMatrixIndexusvARB");
            PFN_glMatrixIndexuivARB = func.invoke("glMatrixIndexuivARB");
            PFN_glMatrixIndexPointerARB = func.invoke("glMatrixIndexPointerARB");
        }
    }

    public GLARBMatrixPalette(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCurrentPaletteMatrixARB((int) GLint index);
    /// ```
    public void CurrentPaletteMatrixARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCurrentPaletteMatrixARB)) throw new GLSymbolNotFoundError("Symbol not found: glCurrentPaletteMatrixARB");
        try { Handles.MH_glCurrentPaletteMatrixARB.invokeExact(handles.PFN_glCurrentPaletteMatrixARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in CurrentPaletteMatrixARB", e); }
    }

    /// ```
    /// void glMatrixIndexubvARB((int) GLint size, const GLubyte* indices);
    /// ```
    public void MatrixIndexubvARB(int size, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexubvARB");
        try { Handles.MH_glMatrixIndexubvARB.invokeExact(handles.PFN_glMatrixIndexubvARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexubvARB", e); }
    }

    /// ```
    /// void glMatrixIndexusvARB((int) GLint size, const GLushort* indices);
    /// ```
    public void MatrixIndexusvARB(int size, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexusvARB");
        try { Handles.MH_glMatrixIndexusvARB.invokeExact(handles.PFN_glMatrixIndexusvARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexusvARB", e); }
    }

    /// ```
    /// void glMatrixIndexuivARB((int) GLint size, const GLuint* indices);
    /// ```
    public void MatrixIndexuivARB(int size, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexuivARB");
        try { Handles.MH_glMatrixIndexuivARB.invokeExact(handles.PFN_glMatrixIndexuivARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexuivARB", e); }
    }

    /// ```
    /// void glMatrixIndexPointerARB((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void MatrixIndexPointerARB(int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexPointerARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexPointerARB");
        try { Handles.MH_glMatrixIndexPointerARB.invokeExact(handles.PFN_glMatrixIndexPointerARB, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexPointerARB", e); }
    }

}
