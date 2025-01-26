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

public final class GLARBWindowPos {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glWindowPos2dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glWindowPos2dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos2fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glWindowPos2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos2iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glWindowPos2ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos2sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glWindowPos2svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos3dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glWindowPos3dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos3fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glWindowPos3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos3iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glWindowPos3ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWindowPos3sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glWindowPos3svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glWindowPos2dARB;
        public final MemorySegment PFN_glWindowPos2dvARB;
        public final MemorySegment PFN_glWindowPos2fARB;
        public final MemorySegment PFN_glWindowPos2fvARB;
        public final MemorySegment PFN_glWindowPos2iARB;
        public final MemorySegment PFN_glWindowPos2ivARB;
        public final MemorySegment PFN_glWindowPos2sARB;
        public final MemorySegment PFN_glWindowPos2svARB;
        public final MemorySegment PFN_glWindowPos3dARB;
        public final MemorySegment PFN_glWindowPos3dvARB;
        public final MemorySegment PFN_glWindowPos3fARB;
        public final MemorySegment PFN_glWindowPos3fvARB;
        public final MemorySegment PFN_glWindowPos3iARB;
        public final MemorySegment PFN_glWindowPos3ivARB;
        public final MemorySegment PFN_glWindowPos3sARB;
        public final MemorySegment PFN_glWindowPos3svARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glWindowPos2dARB = func.invoke("glWindowPos2dARB", "glWindowPos2d");
            PFN_glWindowPos2dvARB = func.invoke("glWindowPos2dvARB", "glWindowPos2dv");
            PFN_glWindowPos2fARB = func.invoke("glWindowPos2fARB", "glWindowPos2f");
            PFN_glWindowPos2fvARB = func.invoke("glWindowPos2fvARB", "glWindowPos2fv");
            PFN_glWindowPos2iARB = func.invoke("glWindowPos2iARB", "glWindowPos2i");
            PFN_glWindowPos2ivARB = func.invoke("glWindowPos2ivARB", "glWindowPos2iv");
            PFN_glWindowPos2sARB = func.invoke("glWindowPos2sARB", "glWindowPos2s");
            PFN_glWindowPos2svARB = func.invoke("glWindowPos2svARB", "glWindowPos2sv");
            PFN_glWindowPos3dARB = func.invoke("glWindowPos3dARB", "glWindowPos3d");
            PFN_glWindowPos3dvARB = func.invoke("glWindowPos3dvARB", "glWindowPos3dv");
            PFN_glWindowPos3fARB = func.invoke("glWindowPos3fARB", "glWindowPos3f");
            PFN_glWindowPos3fvARB = func.invoke("glWindowPos3fvARB", "glWindowPos3fv");
            PFN_glWindowPos3iARB = func.invoke("glWindowPos3iARB", "glWindowPos3i");
            PFN_glWindowPos3ivARB = func.invoke("glWindowPos3ivARB", "glWindowPos3iv");
            PFN_glWindowPos3sARB = func.invoke("glWindowPos3sARB", "glWindowPos3s");
            PFN_glWindowPos3svARB = func.invoke("glWindowPos3svARB", "glWindowPos3sv");
        }
    }

    public GLARBWindowPos(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glWindowPos2dARB((double) GLdouble x, (double) GLdouble y);
    /// ```
    public void WindowPos2dARB(double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2dARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dARB");
        try { Handles.MH_glWindowPos2dARB.invokeExact(handles.PFN_glWindowPos2dARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2dARB", e); }
    }

    /// ```
    /// void glWindowPos2dvARB(const GLdouble* v);
    /// ```
    public void WindowPos2dvARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2dvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dvARB");
        try { Handles.MH_glWindowPos2dvARB.invokeExact(handles.PFN_glWindowPos2dvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2dvARB", e); }
    }

    /// ```
    /// void glWindowPos2fARB(((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void WindowPos2fARB(float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2fARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fARB");
        try { Handles.MH_glWindowPos2fARB.invokeExact(handles.PFN_glWindowPos2fARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2fARB", e); }
    }

    /// ```
    /// void glWindowPos2fvARB(const GLfloat* v);
    /// ```
    public void WindowPos2fvARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2fvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fvARB");
        try { Handles.MH_glWindowPos2fvARB.invokeExact(handles.PFN_glWindowPos2fvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2fvARB", e); }
    }

    /// ```
    /// void glWindowPos2iARB((int) GLint x, (int) GLint y);
    /// ```
    public void WindowPos2iARB(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2iARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2iARB");
        try { Handles.MH_glWindowPos2iARB.invokeExact(handles.PFN_glWindowPos2iARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2iARB", e); }
    }

    /// ```
    /// void glWindowPos2ivARB(const GLint* v);
    /// ```
    public void WindowPos2ivARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2ivARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2ivARB");
        try { Handles.MH_glWindowPos2ivARB.invokeExact(handles.PFN_glWindowPos2ivARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2ivARB", e); }
    }

    /// ```
    /// void glWindowPos2sARB(((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void WindowPos2sARB(short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2sARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2sARB");
        try { Handles.MH_glWindowPos2sARB.invokeExact(handles.PFN_glWindowPos2sARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2sARB", e); }
    }

    /// ```
    /// void glWindowPos2svARB(const GLshort* v);
    /// ```
    public void WindowPos2svARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2svARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2svARB");
        try { Handles.MH_glWindowPos2svARB.invokeExact(handles.PFN_glWindowPos2svARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2svARB", e); }
    }

    /// ```
    /// void glWindowPos3dARB((double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void WindowPos3dARB(double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3dARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dARB");
        try { Handles.MH_glWindowPos3dARB.invokeExact(handles.PFN_glWindowPos3dARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3dARB", e); }
    }

    /// ```
    /// void glWindowPos3dvARB(const GLdouble* v);
    /// ```
    public void WindowPos3dvARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3dvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dvARB");
        try { Handles.MH_glWindowPos3dvARB.invokeExact(handles.PFN_glWindowPos3dvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3dvARB", e); }
    }

    /// ```
    /// void glWindowPos3fARB(((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void WindowPos3fARB(float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3fARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fARB");
        try { Handles.MH_glWindowPos3fARB.invokeExact(handles.PFN_glWindowPos3fARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3fARB", e); }
    }

    /// ```
    /// void glWindowPos3fvARB(const GLfloat* v);
    /// ```
    public void WindowPos3fvARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3fvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fvARB");
        try { Handles.MH_glWindowPos3fvARB.invokeExact(handles.PFN_glWindowPos3fvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3fvARB", e); }
    }

    /// ```
    /// void glWindowPos3iARB((int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void WindowPos3iARB(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3iARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3iARB");
        try { Handles.MH_glWindowPos3iARB.invokeExact(handles.PFN_glWindowPos3iARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3iARB", e); }
    }

    /// ```
    /// void glWindowPos3ivARB(const GLint* v);
    /// ```
    public void WindowPos3ivARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3ivARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3ivARB");
        try { Handles.MH_glWindowPos3ivARB.invokeExact(handles.PFN_glWindowPos3ivARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3ivARB", e); }
    }

    /// ```
    /// void glWindowPos3sARB(((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void WindowPos3sARB(short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3sARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3sARB");
        try { Handles.MH_glWindowPos3sARB.invokeExact(handles.PFN_glWindowPos3sARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3sARB", e); }
    }

    /// ```
    /// void glWindowPos3svARB(const GLshort* v);
    /// ```
    public void WindowPos3svARB(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3svARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3svARB");
        try { Handles.MH_glWindowPos3svARB.invokeExact(handles.PFN_glWindowPos3svARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3svARB", e); }
    }

}
