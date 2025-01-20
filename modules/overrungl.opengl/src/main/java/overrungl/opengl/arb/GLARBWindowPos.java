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

public final class GLARBWindowPos {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glWindowPos2dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glWindowPos2dvARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glWindowPos2fvARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glWindowPos2ivARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glWindowPos2svARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glWindowPos3dvARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glWindowPos3fvARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glWindowPos3ivARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glWindowPos3svARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glWindowPos2dARB,
            FD_glWindowPos2dvARB,
            FD_glWindowPos2fARB,
            FD_glWindowPos2fvARB,
            FD_glWindowPos2iARB,
            FD_glWindowPos2ivARB,
            FD_glWindowPos2sARB,
            FD_glWindowPos2svARB,
            FD_glWindowPos3dARB,
            FD_glWindowPos3dvARB,
            FD_glWindowPos3fARB,
            FD_glWindowPos3fvARB,
            FD_glWindowPos3iARB,
            FD_glWindowPos3ivARB,
            FD_glWindowPos3sARB,
            FD_glWindowPos3svARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glWindowPos2dARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2dARB);
        public static final MethodHandle MH_glWindowPos2dvARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2dvARB);
        public static final MethodHandle MH_glWindowPos2fARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2fARB);
        public static final MethodHandle MH_glWindowPos2fvARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2fvARB);
        public static final MethodHandle MH_glWindowPos2iARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2iARB);
        public static final MethodHandle MH_glWindowPos2ivARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2ivARB);
        public static final MethodHandle MH_glWindowPos2sARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2sARB);
        public static final MethodHandle MH_glWindowPos2svARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2svARB);
        public static final MethodHandle MH_glWindowPos3dARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3dARB);
        public static final MethodHandle MH_glWindowPos3dvARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3dvARB);
        public static final MethodHandle MH_glWindowPos3fARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3fARB);
        public static final MethodHandle MH_glWindowPos3fvARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3fvARB);
        public static final MethodHandle MH_glWindowPos3iARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3iARB);
        public static final MethodHandle MH_glWindowPos3ivARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3ivARB);
        public static final MethodHandle MH_glWindowPos3sARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3sARB);
        public static final MethodHandle MH_glWindowPos3svARB = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3svARB);
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

    public void WindowPos2dARB(@CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2dARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dARB");
        try { Handles.MH_glWindowPos2dARB.invokeExact(handles.PFN_glWindowPos2dARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dARB", e); }
    }

    public void WindowPos2dvARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2dvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dvARB");
        try { Handles.MH_glWindowPos2dvARB.invokeExact(handles.PFN_glWindowPos2dvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dvARB", e); }
    }

    public void WindowPos2fARB(@CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2fARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fARB");
        try { Handles.MH_glWindowPos2fARB.invokeExact(handles.PFN_glWindowPos2fARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fARB", e); }
    }

    public void WindowPos2fvARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2fvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fvARB");
        try { Handles.MH_glWindowPos2fvARB.invokeExact(handles.PFN_glWindowPos2fvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fvARB", e); }
    }

    public void WindowPos2iARB(@CType("GLint") int x, @CType("GLint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2iARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2iARB");
        try { Handles.MH_glWindowPos2iARB.invokeExact(handles.PFN_glWindowPos2iARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2iARB", e); }
    }

    public void WindowPos2ivARB(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2ivARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2ivARB");
        try { Handles.MH_glWindowPos2ivARB.invokeExact(handles.PFN_glWindowPos2ivARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2ivARB", e); }
    }

    public void WindowPos2sARB(@CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2sARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2sARB");
        try { Handles.MH_glWindowPos2sARB.invokeExact(handles.PFN_glWindowPos2sARB, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2sARB", e); }
    }

    public void WindowPos2svARB(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2svARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2svARB");
        try { Handles.MH_glWindowPos2svARB.invokeExact(handles.PFN_glWindowPos2svARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2svARB", e); }
    }

    public void WindowPos3dARB(@CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3dARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dARB");
        try { Handles.MH_glWindowPos3dARB.invokeExact(handles.PFN_glWindowPos3dARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dARB", e); }
    }

    public void WindowPos3dvARB(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3dvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dvARB");
        try { Handles.MH_glWindowPos3dvARB.invokeExact(handles.PFN_glWindowPos3dvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dvARB", e); }
    }

    public void WindowPos3fARB(@CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3fARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fARB");
        try { Handles.MH_glWindowPos3fARB.invokeExact(handles.PFN_glWindowPos3fARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fARB", e); }
    }

    public void WindowPos3fvARB(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3fvARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fvARB");
        try { Handles.MH_glWindowPos3fvARB.invokeExact(handles.PFN_glWindowPos3fvARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fvARB", e); }
    }

    public void WindowPos3iARB(@CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3iARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3iARB");
        try { Handles.MH_glWindowPos3iARB.invokeExact(handles.PFN_glWindowPos3iARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3iARB", e); }
    }

    public void WindowPos3ivARB(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3ivARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3ivARB");
        try { Handles.MH_glWindowPos3ivARB.invokeExact(handles.PFN_glWindowPos3ivARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3ivARB", e); }
    }

    public void WindowPos3sARB(@CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3sARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3sARB");
        try { Handles.MH_glWindowPos3sARB.invokeExact(handles.PFN_glWindowPos3sARB, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3sARB", e); }
    }

    public void WindowPos3svARB(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3svARB)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3svARB");
        try { Handles.MH_glWindowPos3svARB.invokeExact(handles.PFN_glWindowPos3svARB, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3svARB", e); }
    }

}
