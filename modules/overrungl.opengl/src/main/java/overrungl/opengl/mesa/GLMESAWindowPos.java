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
package overrungl.opengl.mesa;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLMESAWindowPos {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glWindowPos2dMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glWindowPos2dvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2fMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glWindowPos2fvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2iMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glWindowPos2ivMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos2sMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glWindowPos2svMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3dMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glWindowPos3dvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3fMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glWindowPos3fvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3iMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glWindowPos3ivMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos3sMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glWindowPos3svMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos4dMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glWindowPos4dvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos4fMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glWindowPos4fvMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos4iMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glWindowPos4ivMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glWindowPos4sMESA = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glWindowPos4svMESA = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glWindowPos2dMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2dMESA);
        public static final MethodHandle MH_glWindowPos2dvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2dvMESA);
        public static final MethodHandle MH_glWindowPos2fMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2fMESA);
        public static final MethodHandle MH_glWindowPos2fvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2fvMESA);
        public static final MethodHandle MH_glWindowPos2iMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2iMESA);
        public static final MethodHandle MH_glWindowPos2ivMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2ivMESA);
        public static final MethodHandle MH_glWindowPos2sMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2sMESA);
        public static final MethodHandle MH_glWindowPos2svMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos2svMESA);
        public static final MethodHandle MH_glWindowPos3dMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3dMESA);
        public static final MethodHandle MH_glWindowPos3dvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3dvMESA);
        public static final MethodHandle MH_glWindowPos3fMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3fMESA);
        public static final MethodHandle MH_glWindowPos3fvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3fvMESA);
        public static final MethodHandle MH_glWindowPos3iMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3iMESA);
        public static final MethodHandle MH_glWindowPos3ivMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3ivMESA);
        public static final MethodHandle MH_glWindowPos3sMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3sMESA);
        public static final MethodHandle MH_glWindowPos3svMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos3svMESA);
        public static final MethodHandle MH_glWindowPos4dMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4dMESA);
        public static final MethodHandle MH_glWindowPos4dvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4dvMESA);
        public static final MethodHandle MH_glWindowPos4fMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4fMESA);
        public static final MethodHandle MH_glWindowPos4fvMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4fvMESA);
        public static final MethodHandle MH_glWindowPos4iMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4iMESA);
        public static final MethodHandle MH_glWindowPos4ivMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4ivMESA);
        public static final MethodHandle MH_glWindowPos4sMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4sMESA);
        public static final MethodHandle MH_glWindowPos4svMESA = RuntimeHelper.downcall(Descriptors.FD_glWindowPos4svMESA);
        public final MemorySegment PFN_glWindowPos2dMESA;
        public final MemorySegment PFN_glWindowPos2dvMESA;
        public final MemorySegment PFN_glWindowPos2fMESA;
        public final MemorySegment PFN_glWindowPos2fvMESA;
        public final MemorySegment PFN_glWindowPos2iMESA;
        public final MemorySegment PFN_glWindowPos2ivMESA;
        public final MemorySegment PFN_glWindowPos2sMESA;
        public final MemorySegment PFN_glWindowPos2svMESA;
        public final MemorySegment PFN_glWindowPos3dMESA;
        public final MemorySegment PFN_glWindowPos3dvMESA;
        public final MemorySegment PFN_glWindowPos3fMESA;
        public final MemorySegment PFN_glWindowPos3fvMESA;
        public final MemorySegment PFN_glWindowPos3iMESA;
        public final MemorySegment PFN_glWindowPos3ivMESA;
        public final MemorySegment PFN_glWindowPos3sMESA;
        public final MemorySegment PFN_glWindowPos3svMESA;
        public final MemorySegment PFN_glWindowPos4dMESA;
        public final MemorySegment PFN_glWindowPos4dvMESA;
        public final MemorySegment PFN_glWindowPos4fMESA;
        public final MemorySegment PFN_glWindowPos4fvMESA;
        public final MemorySegment PFN_glWindowPos4iMESA;
        public final MemorySegment PFN_glWindowPos4ivMESA;
        public final MemorySegment PFN_glWindowPos4sMESA;
        public final MemorySegment PFN_glWindowPos4svMESA;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glWindowPos2dMESA = func.invoke("glWindowPos2dMESA", "glWindowPos2d");
            PFN_glWindowPos2dvMESA = func.invoke("glWindowPos2dvMESA", "glWindowPos2dv");
            PFN_glWindowPos2fMESA = func.invoke("glWindowPos2fMESA", "glWindowPos2f");
            PFN_glWindowPos2fvMESA = func.invoke("glWindowPos2fvMESA", "glWindowPos2fv");
            PFN_glWindowPos2iMESA = func.invoke("glWindowPos2iMESA", "glWindowPos2i");
            PFN_glWindowPos2ivMESA = func.invoke("glWindowPos2ivMESA", "glWindowPos2iv");
            PFN_glWindowPos2sMESA = func.invoke("glWindowPos2sMESA", "glWindowPos2s");
            PFN_glWindowPos2svMESA = func.invoke("glWindowPos2svMESA", "glWindowPos2sv");
            PFN_glWindowPos3dMESA = func.invoke("glWindowPos3dMESA", "glWindowPos3d");
            PFN_glWindowPos3dvMESA = func.invoke("glWindowPos3dvMESA", "glWindowPos3dv");
            PFN_glWindowPos3fMESA = func.invoke("glWindowPos3fMESA", "glWindowPos3f");
            PFN_glWindowPos3fvMESA = func.invoke("glWindowPos3fvMESA", "glWindowPos3fv");
            PFN_glWindowPos3iMESA = func.invoke("glWindowPos3iMESA", "glWindowPos3i");
            PFN_glWindowPos3ivMESA = func.invoke("glWindowPos3ivMESA", "glWindowPos3iv");
            PFN_glWindowPos3sMESA = func.invoke("glWindowPos3sMESA", "glWindowPos3s");
            PFN_glWindowPos3svMESA = func.invoke("glWindowPos3svMESA", "glWindowPos3sv");
            PFN_glWindowPos4dMESA = func.invoke("glWindowPos4dMESA");
            PFN_glWindowPos4dvMESA = func.invoke("glWindowPos4dvMESA");
            PFN_glWindowPos4fMESA = func.invoke("glWindowPos4fMESA");
            PFN_glWindowPos4fvMESA = func.invoke("glWindowPos4fvMESA");
            PFN_glWindowPos4iMESA = func.invoke("glWindowPos4iMESA");
            PFN_glWindowPos4ivMESA = func.invoke("glWindowPos4ivMESA");
            PFN_glWindowPos4sMESA = func.invoke("glWindowPos4sMESA");
            PFN_glWindowPos4svMESA = func.invoke("glWindowPos4svMESA");
        }
    }

    public GLMESAWindowPos(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void WindowPos2dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2dMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dMESA");
        try { Handles.MH_glWindowPos2dMESA.invokeExact(handles.PFN_glWindowPos2dMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dMESA", e); }
    }

    public void WindowPos2dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2dvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2dvMESA");
        try { Handles.MH_glWindowPos2dvMESA.invokeExact(handles.PFN_glWindowPos2dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dvMESA", e); }
    }

    public void WindowPos2fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2fMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fMESA");
        try { Handles.MH_glWindowPos2fMESA.invokeExact(handles.PFN_glWindowPos2fMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fMESA", e); }
    }

    public void WindowPos2fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2fvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2fvMESA");
        try { Handles.MH_glWindowPos2fvMESA.invokeExact(handles.PFN_glWindowPos2fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fvMESA", e); }
    }

    public void WindowPos2iMESA(@CType("GLint") int x, @CType("GLint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2iMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2iMESA");
        try { Handles.MH_glWindowPos2iMESA.invokeExact(handles.PFN_glWindowPos2iMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2iMESA", e); }
    }

    public void WindowPos2ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2ivMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2ivMESA");
        try { Handles.MH_glWindowPos2ivMESA.invokeExact(handles.PFN_glWindowPos2ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2ivMESA", e); }
    }

    public void WindowPos2sMESA(@CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2sMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2sMESA");
        try { Handles.MH_glWindowPos2sMESA.invokeExact(handles.PFN_glWindowPos2sMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2sMESA", e); }
    }

    public void WindowPos2svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos2svMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos2svMESA");
        try { Handles.MH_glWindowPos2svMESA.invokeExact(handles.PFN_glWindowPos2svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2svMESA", e); }
    }

    public void WindowPos3dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3dMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dMESA");
        try { Handles.MH_glWindowPos3dMESA.invokeExact(handles.PFN_glWindowPos3dMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dMESA", e); }
    }

    public void WindowPos3dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3dvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3dvMESA");
        try { Handles.MH_glWindowPos3dvMESA.invokeExact(handles.PFN_glWindowPos3dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dvMESA", e); }
    }

    public void WindowPos3fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3fMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fMESA");
        try { Handles.MH_glWindowPos3fMESA.invokeExact(handles.PFN_glWindowPos3fMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fMESA", e); }
    }

    public void WindowPos3fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3fvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3fvMESA");
        try { Handles.MH_glWindowPos3fvMESA.invokeExact(handles.PFN_glWindowPos3fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fvMESA", e); }
    }

    public void WindowPos3iMESA(@CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3iMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3iMESA");
        try { Handles.MH_glWindowPos3iMESA.invokeExact(handles.PFN_glWindowPos3iMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3iMESA", e); }
    }

    public void WindowPos3ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3ivMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3ivMESA");
        try { Handles.MH_glWindowPos3ivMESA.invokeExact(handles.PFN_glWindowPos3ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3ivMESA", e); }
    }

    public void WindowPos3sMESA(@CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3sMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3sMESA");
        try { Handles.MH_glWindowPos3sMESA.invokeExact(handles.PFN_glWindowPos3sMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3sMESA", e); }
    }

    public void WindowPos3svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos3svMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos3svMESA");
        try { Handles.MH_glWindowPos3svMESA.invokeExact(handles.PFN_glWindowPos3svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3svMESA", e); }
    }

    public void WindowPos4dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4dMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4dMESA");
        try { Handles.MH_glWindowPos4dMESA.invokeExact(handles.PFN_glWindowPos4dMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4dMESA", e); }
    }

    public void WindowPos4dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4dvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4dvMESA");
        try { Handles.MH_glWindowPos4dvMESA.invokeExact(handles.PFN_glWindowPos4dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4dvMESA", e); }
    }

    public void WindowPos4fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4fMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4fMESA");
        try { Handles.MH_glWindowPos4fMESA.invokeExact(handles.PFN_glWindowPos4fMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4fMESA", e); }
    }

    public void WindowPos4fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4fvMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4fvMESA");
        try { Handles.MH_glWindowPos4fvMESA.invokeExact(handles.PFN_glWindowPos4fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4fvMESA", e); }
    }

    public void WindowPos4iMESA(@CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4iMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4iMESA");
        try { Handles.MH_glWindowPos4iMESA.invokeExact(handles.PFN_glWindowPos4iMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4iMESA", e); }
    }

    public void WindowPos4ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4ivMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4ivMESA");
        try { Handles.MH_glWindowPos4ivMESA.invokeExact(handles.PFN_glWindowPos4ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4ivMESA", e); }
    }

    public void WindowPos4sMESA(@CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4sMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4sMESA");
        try { Handles.MH_glWindowPos4sMESA.invokeExact(handles.PFN_glWindowPos4sMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4sMESA", e); }
    }

    public void WindowPos4svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glWindowPos4svMESA)) throw new SymbolNotFoundError("Symbol not found: glWindowPos4svMESA");
        try { Handles.MH_glWindowPos4svMESA.invokeExact(handles.PFN_glWindowPos4svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4svMESA", e); }
    }

}
