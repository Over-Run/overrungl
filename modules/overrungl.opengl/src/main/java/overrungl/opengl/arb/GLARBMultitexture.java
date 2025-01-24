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

public final class GLARBMultitexture {
    public static final int GL_TEXTURE0_ARB = 0x84C0;
    public static final int GL_TEXTURE1_ARB = 0x84C1;
    public static final int GL_TEXTURE2_ARB = 0x84C2;
    public static final int GL_TEXTURE3_ARB = 0x84C3;
    public static final int GL_TEXTURE4_ARB = 0x84C4;
    public static final int GL_TEXTURE5_ARB = 0x84C5;
    public static final int GL_TEXTURE6_ARB = 0x84C6;
    public static final int GL_TEXTURE7_ARB = 0x84C7;
    public static final int GL_TEXTURE8_ARB = 0x84C8;
    public static final int GL_TEXTURE9_ARB = 0x84C9;
    public static final int GL_TEXTURE10_ARB = 0x84CA;
    public static final int GL_TEXTURE11_ARB = 0x84CB;
    public static final int GL_TEXTURE12_ARB = 0x84CC;
    public static final int GL_TEXTURE13_ARB = 0x84CD;
    public static final int GL_TEXTURE14_ARB = 0x84CE;
    public static final int GL_TEXTURE15_ARB = 0x84CF;
    public static final int GL_TEXTURE16_ARB = 0x84D0;
    public static final int GL_TEXTURE17_ARB = 0x84D1;
    public static final int GL_TEXTURE18_ARB = 0x84D2;
    public static final int GL_TEXTURE19_ARB = 0x84D3;
    public static final int GL_TEXTURE20_ARB = 0x84D4;
    public static final int GL_TEXTURE21_ARB = 0x84D5;
    public static final int GL_TEXTURE22_ARB = 0x84D6;
    public static final int GL_TEXTURE23_ARB = 0x84D7;
    public static final int GL_TEXTURE24_ARB = 0x84D8;
    public static final int GL_TEXTURE25_ARB = 0x84D9;
    public static final int GL_TEXTURE26_ARB = 0x84DA;
    public static final int GL_TEXTURE27_ARB = 0x84DB;
    public static final int GL_TEXTURE28_ARB = 0x84DC;
    public static final int GL_TEXTURE29_ARB = 0x84DD;
    public static final int GL_TEXTURE30_ARB = 0x84DE;
    public static final int GL_TEXTURE31_ARB = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE_ARB = 0x84E0;
    public static final int GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1;
    public static final int GL_MAX_TEXTURE_UNITS_ARB = 0x84E2;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glActiveTextureARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClientActiveTextureARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord1dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord1dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord1fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord1ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord1svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord2dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord2ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord2svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord3dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord3ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord3svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord4ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord4svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glActiveTextureARB;
        public final MemorySegment PFN_glClientActiveTextureARB;
        public final MemorySegment PFN_glMultiTexCoord1dARB;
        public final MemorySegment PFN_glMultiTexCoord1dvARB;
        public final MemorySegment PFN_glMultiTexCoord1fARB;
        public final MemorySegment PFN_glMultiTexCoord1fvARB;
        public final MemorySegment PFN_glMultiTexCoord1iARB;
        public final MemorySegment PFN_glMultiTexCoord1ivARB;
        public final MemorySegment PFN_glMultiTexCoord1sARB;
        public final MemorySegment PFN_glMultiTexCoord1svARB;
        public final MemorySegment PFN_glMultiTexCoord2dARB;
        public final MemorySegment PFN_glMultiTexCoord2dvARB;
        public final MemorySegment PFN_glMultiTexCoord2fARB;
        public final MemorySegment PFN_glMultiTexCoord2fvARB;
        public final MemorySegment PFN_glMultiTexCoord2iARB;
        public final MemorySegment PFN_glMultiTexCoord2ivARB;
        public final MemorySegment PFN_glMultiTexCoord2sARB;
        public final MemorySegment PFN_glMultiTexCoord2svARB;
        public final MemorySegment PFN_glMultiTexCoord3dARB;
        public final MemorySegment PFN_glMultiTexCoord3dvARB;
        public final MemorySegment PFN_glMultiTexCoord3fARB;
        public final MemorySegment PFN_glMultiTexCoord3fvARB;
        public final MemorySegment PFN_glMultiTexCoord3iARB;
        public final MemorySegment PFN_glMultiTexCoord3ivARB;
        public final MemorySegment PFN_glMultiTexCoord3sARB;
        public final MemorySegment PFN_glMultiTexCoord3svARB;
        public final MemorySegment PFN_glMultiTexCoord4dARB;
        public final MemorySegment PFN_glMultiTexCoord4dvARB;
        public final MemorySegment PFN_glMultiTexCoord4fARB;
        public final MemorySegment PFN_glMultiTexCoord4fvARB;
        public final MemorySegment PFN_glMultiTexCoord4iARB;
        public final MemorySegment PFN_glMultiTexCoord4ivARB;
        public final MemorySegment PFN_glMultiTexCoord4sARB;
        public final MemorySegment PFN_glMultiTexCoord4svARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glActiveTextureARB = func.invoke("glActiveTextureARB", "glActiveTexture");
            PFN_glClientActiveTextureARB = func.invoke("glClientActiveTextureARB", "glClientActiveTexture");
            PFN_glMultiTexCoord1dARB = func.invoke("glMultiTexCoord1dARB", "glMultiTexCoord1d");
            PFN_glMultiTexCoord1dvARB = func.invoke("glMultiTexCoord1dvARB", "glMultiTexCoord1dv");
            PFN_glMultiTexCoord1fARB = func.invoke("glMultiTexCoord1fARB", "glMultiTexCoord1f");
            PFN_glMultiTexCoord1fvARB = func.invoke("glMultiTexCoord1fvARB", "glMultiTexCoord1fv");
            PFN_glMultiTexCoord1iARB = func.invoke("glMultiTexCoord1iARB", "glMultiTexCoord1i");
            PFN_glMultiTexCoord1ivARB = func.invoke("glMultiTexCoord1ivARB", "glMultiTexCoord1iv");
            PFN_glMultiTexCoord1sARB = func.invoke("glMultiTexCoord1sARB", "glMultiTexCoord1s");
            PFN_glMultiTexCoord1svARB = func.invoke("glMultiTexCoord1svARB", "glMultiTexCoord1sv");
            PFN_glMultiTexCoord2dARB = func.invoke("glMultiTexCoord2dARB", "glMultiTexCoord2d");
            PFN_glMultiTexCoord2dvARB = func.invoke("glMultiTexCoord2dvARB", "glMultiTexCoord2dv");
            PFN_glMultiTexCoord2fARB = func.invoke("glMultiTexCoord2fARB", "glMultiTexCoord2f");
            PFN_glMultiTexCoord2fvARB = func.invoke("glMultiTexCoord2fvARB", "glMultiTexCoord2fv");
            PFN_glMultiTexCoord2iARB = func.invoke("glMultiTexCoord2iARB", "glMultiTexCoord2i");
            PFN_glMultiTexCoord2ivARB = func.invoke("glMultiTexCoord2ivARB", "glMultiTexCoord2iv");
            PFN_glMultiTexCoord2sARB = func.invoke("glMultiTexCoord2sARB", "glMultiTexCoord2s");
            PFN_glMultiTexCoord2svARB = func.invoke("glMultiTexCoord2svARB", "glMultiTexCoord2sv");
            PFN_glMultiTexCoord3dARB = func.invoke("glMultiTexCoord3dARB", "glMultiTexCoord3d");
            PFN_glMultiTexCoord3dvARB = func.invoke("glMultiTexCoord3dvARB", "glMultiTexCoord3dv");
            PFN_glMultiTexCoord3fARB = func.invoke("glMultiTexCoord3fARB", "glMultiTexCoord3f");
            PFN_glMultiTexCoord3fvARB = func.invoke("glMultiTexCoord3fvARB", "glMultiTexCoord3fv");
            PFN_glMultiTexCoord3iARB = func.invoke("glMultiTexCoord3iARB", "glMultiTexCoord3i");
            PFN_glMultiTexCoord3ivARB = func.invoke("glMultiTexCoord3ivARB", "glMultiTexCoord3iv");
            PFN_glMultiTexCoord3sARB = func.invoke("glMultiTexCoord3sARB", "glMultiTexCoord3s");
            PFN_glMultiTexCoord3svARB = func.invoke("glMultiTexCoord3svARB", "glMultiTexCoord3sv");
            PFN_glMultiTexCoord4dARB = func.invoke("glMultiTexCoord4dARB", "glMultiTexCoord4d");
            PFN_glMultiTexCoord4dvARB = func.invoke("glMultiTexCoord4dvARB", "glMultiTexCoord4dv");
            PFN_glMultiTexCoord4fARB = func.invoke("glMultiTexCoord4fARB", "glMultiTexCoord4f");
            PFN_glMultiTexCoord4fvARB = func.invoke("glMultiTexCoord4fvARB", "glMultiTexCoord4fv");
            PFN_glMultiTexCoord4iARB = func.invoke("glMultiTexCoord4iARB", "glMultiTexCoord4i");
            PFN_glMultiTexCoord4ivARB = func.invoke("glMultiTexCoord4ivARB", "glMultiTexCoord4iv");
            PFN_glMultiTexCoord4sARB = func.invoke("glMultiTexCoord4sARB", "glMultiTexCoord4s");
            PFN_glMultiTexCoord4svARB = func.invoke("glMultiTexCoord4svARB", "glMultiTexCoord4sv");
        }
    }

    public GLARBMultitexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glActiveTextureARB(unsigned int texture);
    /// ```
    public void ActiveTextureARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveTextureARB)) throw new SymbolNotFoundError("Symbol not found: glActiveTextureARB");
        try { Handles.MH_glActiveTextureARB.invokeExact(handles.PFN_glActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveTextureARB", e); }
    }

    /// ```
    /// void glClientActiveTextureARB(unsigned int texture);
    /// ```
    public void ClientActiveTextureARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientActiveTextureARB)) throw new SymbolNotFoundError("Symbol not found: glClientActiveTextureARB");
        try { Handles.MH_glClientActiveTextureARB.invokeExact(handles.PFN_glClientActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in ClientActiveTextureARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1dARB(unsigned int target, double s);
    /// ```
    public void MultiTexCoord1dARB(int target, double s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1dARB");
        try { Handles.MH_glMultiTexCoord1dARB.invokeExact(handles.PFN_glMultiTexCoord1dARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1dvARB(unsigned int target, const GLdouble* v);
    /// ```
    public void MultiTexCoord1dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1dvARB");
        try { Handles.MH_glMultiTexCoord1dvARB.invokeExact(handles.PFN_glMultiTexCoord1dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1fARB(unsigned int target, float s);
    /// ```
    public void MultiTexCoord1fARB(int target, float s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1fARB");
        try { Handles.MH_glMultiTexCoord1fARB.invokeExact(handles.PFN_glMultiTexCoord1fARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1fvARB(unsigned int target, const GLfloat* v);
    /// ```
    public void MultiTexCoord1fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1fvARB");
        try { Handles.MH_glMultiTexCoord1fvARB.invokeExact(handles.PFN_glMultiTexCoord1fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1iARB(unsigned int target, int s);
    /// ```
    public void MultiTexCoord1iARB(int target, int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1iARB");
        try { Handles.MH_glMultiTexCoord1iARB.invokeExact(handles.PFN_glMultiTexCoord1iARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1ivARB(unsigned int target, const GLint* v);
    /// ```
    public void MultiTexCoord1ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1ivARB");
        try { Handles.MH_glMultiTexCoord1ivARB.invokeExact(handles.PFN_glMultiTexCoord1ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1sARB(unsigned int target, signed short s);
    /// ```
    public void MultiTexCoord1sARB(int target, short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1sARB");
        try { Handles.MH_glMultiTexCoord1sARB.invokeExact(handles.PFN_glMultiTexCoord1sARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1svARB(unsigned int target, const GLshort* v);
    /// ```
    public void MultiTexCoord1svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1svARB");
        try { Handles.MH_glMultiTexCoord1svARB.invokeExact(handles.PFN_glMultiTexCoord1svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2dARB(unsigned int target, double s, double t);
    /// ```
    public void MultiTexCoord2dARB(int target, double s, double t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2dARB");
        try { Handles.MH_glMultiTexCoord2dARB.invokeExact(handles.PFN_glMultiTexCoord2dARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2dvARB(unsigned int target, const GLdouble* v);
    /// ```
    public void MultiTexCoord2dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2dvARB");
        try { Handles.MH_glMultiTexCoord2dvARB.invokeExact(handles.PFN_glMultiTexCoord2dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2fARB(unsigned int target, float s, float t);
    /// ```
    public void MultiTexCoord2fARB(int target, float s, float t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2fARB");
        try { Handles.MH_glMultiTexCoord2fARB.invokeExact(handles.PFN_glMultiTexCoord2fARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2fvARB(unsigned int target, const GLfloat* v);
    /// ```
    public void MultiTexCoord2fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2fvARB");
        try { Handles.MH_glMultiTexCoord2fvARB.invokeExact(handles.PFN_glMultiTexCoord2fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2iARB(unsigned int target, int s, int t);
    /// ```
    public void MultiTexCoord2iARB(int target, int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2iARB");
        try { Handles.MH_glMultiTexCoord2iARB.invokeExact(handles.PFN_glMultiTexCoord2iARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2ivARB(unsigned int target, const GLint* v);
    /// ```
    public void MultiTexCoord2ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2ivARB");
        try { Handles.MH_glMultiTexCoord2ivARB.invokeExact(handles.PFN_glMultiTexCoord2ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2sARB(unsigned int target, signed short s, signed short t);
    /// ```
    public void MultiTexCoord2sARB(int target, short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2sARB");
        try { Handles.MH_glMultiTexCoord2sARB.invokeExact(handles.PFN_glMultiTexCoord2sARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2svARB(unsigned int target, const GLshort* v);
    /// ```
    public void MultiTexCoord2svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2svARB");
        try { Handles.MH_glMultiTexCoord2svARB.invokeExact(handles.PFN_glMultiTexCoord2svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3dARB(unsigned int target, double s, double t, double r);
    /// ```
    public void MultiTexCoord3dARB(int target, double s, double t, double r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3dARB");
        try { Handles.MH_glMultiTexCoord3dARB.invokeExact(handles.PFN_glMultiTexCoord3dARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3dvARB(unsigned int target, const GLdouble* v);
    /// ```
    public void MultiTexCoord3dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3dvARB");
        try { Handles.MH_glMultiTexCoord3dvARB.invokeExact(handles.PFN_glMultiTexCoord3dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3fARB(unsigned int target, float s, float t, float r);
    /// ```
    public void MultiTexCoord3fARB(int target, float s, float t, float r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3fARB");
        try { Handles.MH_glMultiTexCoord3fARB.invokeExact(handles.PFN_glMultiTexCoord3fARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3fvARB(unsigned int target, const GLfloat* v);
    /// ```
    public void MultiTexCoord3fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3fvARB");
        try { Handles.MH_glMultiTexCoord3fvARB.invokeExact(handles.PFN_glMultiTexCoord3fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3iARB(unsigned int target, int s, int t, int r);
    /// ```
    public void MultiTexCoord3iARB(int target, int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3iARB");
        try { Handles.MH_glMultiTexCoord3iARB.invokeExact(handles.PFN_glMultiTexCoord3iARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3ivARB(unsigned int target, const GLint* v);
    /// ```
    public void MultiTexCoord3ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3ivARB");
        try { Handles.MH_glMultiTexCoord3ivARB.invokeExact(handles.PFN_glMultiTexCoord3ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3sARB(unsigned int target, signed short s, signed short t, signed short r);
    /// ```
    public void MultiTexCoord3sARB(int target, short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3sARB");
        try { Handles.MH_glMultiTexCoord3sARB.invokeExact(handles.PFN_glMultiTexCoord3sARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3svARB(unsigned int target, const GLshort* v);
    /// ```
    public void MultiTexCoord3svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3svARB");
        try { Handles.MH_glMultiTexCoord3svARB.invokeExact(handles.PFN_glMultiTexCoord3svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4dARB(unsigned int target, double s, double t, double r, double q);
    /// ```
    public void MultiTexCoord4dARB(int target, double s, double t, double r, double q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4dARB");
        try { Handles.MH_glMultiTexCoord4dARB.invokeExact(handles.PFN_glMultiTexCoord4dARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4dvARB(unsigned int target, const GLdouble* v);
    /// ```
    public void MultiTexCoord4dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4dvARB");
        try { Handles.MH_glMultiTexCoord4dvARB.invokeExact(handles.PFN_glMultiTexCoord4dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4fARB(unsigned int target, float s, float t, float r, float q);
    /// ```
    public void MultiTexCoord4fARB(int target, float s, float t, float r, float q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4fARB");
        try { Handles.MH_glMultiTexCoord4fARB.invokeExact(handles.PFN_glMultiTexCoord4fARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4fvARB(unsigned int target, const GLfloat* v);
    /// ```
    public void MultiTexCoord4fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4fvARB");
        try { Handles.MH_glMultiTexCoord4fvARB.invokeExact(handles.PFN_glMultiTexCoord4fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4iARB(unsigned int target, int s, int t, int r, int q);
    /// ```
    public void MultiTexCoord4iARB(int target, int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4iARB");
        try { Handles.MH_glMultiTexCoord4iARB.invokeExact(handles.PFN_glMultiTexCoord4iARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4ivARB(unsigned int target, const GLint* v);
    /// ```
    public void MultiTexCoord4ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4ivARB");
        try { Handles.MH_glMultiTexCoord4ivARB.invokeExact(handles.PFN_glMultiTexCoord4ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4sARB(unsigned int target, signed short s, signed short t, signed short r, signed short q);
    /// ```
    public void MultiTexCoord4sARB(int target, short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4sARB");
        try { Handles.MH_glMultiTexCoord4sARB.invokeExact(handles.PFN_glMultiTexCoord4sARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4svARB(unsigned int target, const GLshort* v);
    /// ```
    public void MultiTexCoord4svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4svARB");
        try { Handles.MH_glMultiTexCoord4svARB.invokeExact(handles.PFN_glMultiTexCoord4svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4svARB", e); }
    }

}
