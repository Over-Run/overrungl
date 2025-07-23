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
        public static final MethodHandle MH_glActiveTextureARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClientActiveTextureARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord1dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord1dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord1fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord1ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord1svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord2dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord2fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord2ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord2svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord3dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord3fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord3ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord3svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexCoord4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexCoord4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord4ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord4svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
    /// void glActiveTextureARB((unsigned int) GLenum texture);
    /// ```
    public void ActiveTextureARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveTextureARB)) throw new GLSymbolNotFoundError("Symbol not found: glActiveTextureARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveTextureARB", texture); }
        Handles.MH_glActiveTextureARB.invokeExact(handles.PFN_glActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveTextureARB", e); }
    }

    /// ```
    /// void glClientActiveTextureARB((unsigned int) GLenum texture);
    /// ```
    public void ClientActiveTextureARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientActiveTextureARB)) throw new GLSymbolNotFoundError("Symbol not found: glClientActiveTextureARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClientActiveTextureARB", texture); }
        Handles.MH_glClientActiveTextureARB.invokeExact(handles.PFN_glClientActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in ClientActiveTextureARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1dARB((unsigned int) GLenum target, (double) GLdouble s);
    /// ```
    public void MultiTexCoord1dARB(int target, double s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1dARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1dARB", target, s); }
        Handles.MH_glMultiTexCoord1dARB.invokeExact(handles.PFN_glMultiTexCoord1dARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1dvARB((unsigned int) GLenum target, const GLdouble* v);
    /// ```
    public void MultiTexCoord1dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1dvARB", target, v); }
        Handles.MH_glMultiTexCoord1dvARB.invokeExact(handles.PFN_glMultiTexCoord1dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1fARB((unsigned int) GLenum target, ((float) khronos_float_t) GLfloat s);
    /// ```
    public void MultiTexCoord1fARB(int target, float s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1fARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1fARB", target, s); }
        Handles.MH_glMultiTexCoord1fARB.invokeExact(handles.PFN_glMultiTexCoord1fARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1fvARB((unsigned int) GLenum target, const GLfloat* v);
    /// ```
    public void MultiTexCoord1fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1fvARB", target, v); }
        Handles.MH_glMultiTexCoord1fvARB.invokeExact(handles.PFN_glMultiTexCoord1fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1iARB((unsigned int) GLenum target, (int) GLint s);
    /// ```
    public void MultiTexCoord1iARB(int target, int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1iARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1iARB", target, s); }
        Handles.MH_glMultiTexCoord1iARB.invokeExact(handles.PFN_glMultiTexCoord1iARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1ivARB((unsigned int) GLenum target, const GLint* v);
    /// ```
    public void MultiTexCoord1ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1ivARB", target, v); }
        Handles.MH_glMultiTexCoord1ivARB.invokeExact(handles.PFN_glMultiTexCoord1ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1sARB((unsigned int) GLenum target, ((signed short) khronos_int16_t) GLshort s);
    /// ```
    public void MultiTexCoord1sARB(int target, short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1sARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1sARB", target, s); }
        Handles.MH_glMultiTexCoord1sARB.invokeExact(handles.PFN_glMultiTexCoord1sARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord1svARB((unsigned int) GLenum target, const GLshort* v);
    /// ```
    public void MultiTexCoord1svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1svARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1svARB", target, v); }
        Handles.MH_glMultiTexCoord1svARB.invokeExact(handles.PFN_glMultiTexCoord1svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2dARB((unsigned int) GLenum target, (double) GLdouble s, (double) GLdouble t);
    /// ```
    public void MultiTexCoord2dARB(int target, double s, double t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2dARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2dARB", target, s, t); }
        Handles.MH_glMultiTexCoord2dARB.invokeExact(handles.PFN_glMultiTexCoord2dARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2dvARB((unsigned int) GLenum target, const GLdouble* v);
    /// ```
    public void MultiTexCoord2dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2dvARB", target, v); }
        Handles.MH_glMultiTexCoord2dvARB.invokeExact(handles.PFN_glMultiTexCoord2dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2fARB((unsigned int) GLenum target, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t);
    /// ```
    public void MultiTexCoord2fARB(int target, float s, float t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2fARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2fARB", target, s, t); }
        Handles.MH_glMultiTexCoord2fARB.invokeExact(handles.PFN_glMultiTexCoord2fARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2fvARB((unsigned int) GLenum target, const GLfloat* v);
    /// ```
    public void MultiTexCoord2fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2fvARB", target, v); }
        Handles.MH_glMultiTexCoord2fvARB.invokeExact(handles.PFN_glMultiTexCoord2fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2iARB((unsigned int) GLenum target, (int) GLint s, (int) GLint t);
    /// ```
    public void MultiTexCoord2iARB(int target, int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2iARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2iARB", target, s, t); }
        Handles.MH_glMultiTexCoord2iARB.invokeExact(handles.PFN_glMultiTexCoord2iARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2ivARB((unsigned int) GLenum target, const GLint* v);
    /// ```
    public void MultiTexCoord2ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2ivARB", target, v); }
        Handles.MH_glMultiTexCoord2ivARB.invokeExact(handles.PFN_glMultiTexCoord2ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2sARB((unsigned int) GLenum target, ((signed short) khronos_int16_t) GLshort s, ((signed short) khronos_int16_t) GLshort t);
    /// ```
    public void MultiTexCoord2sARB(int target, short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2sARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2sARB", target, s, t); }
        Handles.MH_glMultiTexCoord2sARB.invokeExact(handles.PFN_glMultiTexCoord2sARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord2svARB((unsigned int) GLenum target, const GLshort* v);
    /// ```
    public void MultiTexCoord2svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2svARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2svARB", target, v); }
        Handles.MH_glMultiTexCoord2svARB.invokeExact(handles.PFN_glMultiTexCoord2svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3dARB((unsigned int) GLenum target, (double) GLdouble s, (double) GLdouble t, (double) GLdouble r);
    /// ```
    public void MultiTexCoord3dARB(int target, double s, double t, double r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3dARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3dARB", target, s, t, r); }
        Handles.MH_glMultiTexCoord3dARB.invokeExact(handles.PFN_glMultiTexCoord3dARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3dvARB((unsigned int) GLenum target, const GLdouble* v);
    /// ```
    public void MultiTexCoord3dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3dvARB", target, v); }
        Handles.MH_glMultiTexCoord3dvARB.invokeExact(handles.PFN_glMultiTexCoord3dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3fARB((unsigned int) GLenum target, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat r);
    /// ```
    public void MultiTexCoord3fARB(int target, float s, float t, float r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3fARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3fARB", target, s, t, r); }
        Handles.MH_glMultiTexCoord3fARB.invokeExact(handles.PFN_glMultiTexCoord3fARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3fvARB((unsigned int) GLenum target, const GLfloat* v);
    /// ```
    public void MultiTexCoord3fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3fvARB", target, v); }
        Handles.MH_glMultiTexCoord3fvARB.invokeExact(handles.PFN_glMultiTexCoord3fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3iARB((unsigned int) GLenum target, (int) GLint s, (int) GLint t, (int) GLint r);
    /// ```
    public void MultiTexCoord3iARB(int target, int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3iARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3iARB", target, s, t, r); }
        Handles.MH_glMultiTexCoord3iARB.invokeExact(handles.PFN_glMultiTexCoord3iARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3ivARB((unsigned int) GLenum target, const GLint* v);
    /// ```
    public void MultiTexCoord3ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3ivARB", target, v); }
        Handles.MH_glMultiTexCoord3ivARB.invokeExact(handles.PFN_glMultiTexCoord3ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3sARB((unsigned int) GLenum target, ((signed short) khronos_int16_t) GLshort s, ((signed short) khronos_int16_t) GLshort t, ((signed short) khronos_int16_t) GLshort r);
    /// ```
    public void MultiTexCoord3sARB(int target, short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3sARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3sARB", target, s, t, r); }
        Handles.MH_glMultiTexCoord3sARB.invokeExact(handles.PFN_glMultiTexCoord3sARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord3svARB((unsigned int) GLenum target, const GLshort* v);
    /// ```
    public void MultiTexCoord3svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3svARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3svARB", target, v); }
        Handles.MH_glMultiTexCoord3svARB.invokeExact(handles.PFN_glMultiTexCoord3svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3svARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4dARB((unsigned int) GLenum target, (double) GLdouble s, (double) GLdouble t, (double) GLdouble r, (double) GLdouble q);
    /// ```
    public void MultiTexCoord4dARB(int target, double s, double t, double r, double q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4dARB", target, s, t, r, q); }
        Handles.MH_glMultiTexCoord4dARB.invokeExact(handles.PFN_glMultiTexCoord4dARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4dARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4dvARB((unsigned int) GLenum target, const GLdouble* v);
    /// ```
    public void MultiTexCoord4dvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4dvARB", target, v); }
        Handles.MH_glMultiTexCoord4dvARB.invokeExact(handles.PFN_glMultiTexCoord4dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4dvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4fARB((unsigned int) GLenum target, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat q);
    /// ```
    public void MultiTexCoord4fARB(int target, float s, float t, float r, float q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4fARB", target, s, t, r, q); }
        Handles.MH_glMultiTexCoord4fARB.invokeExact(handles.PFN_glMultiTexCoord4fARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4fARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4fvARB((unsigned int) GLenum target, const GLfloat* v);
    /// ```
    public void MultiTexCoord4fvARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4fvARB", target, v); }
        Handles.MH_glMultiTexCoord4fvARB.invokeExact(handles.PFN_glMultiTexCoord4fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4fvARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4iARB((unsigned int) GLenum target, (int) GLint s, (int) GLint t, (int) GLint r, (int) GLint q);
    /// ```
    public void MultiTexCoord4iARB(int target, int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4iARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4iARB", target, s, t, r, q); }
        Handles.MH_glMultiTexCoord4iARB.invokeExact(handles.PFN_glMultiTexCoord4iARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4iARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4ivARB((unsigned int) GLenum target, const GLint* v);
    /// ```
    public void MultiTexCoord4ivARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4ivARB", target, v); }
        Handles.MH_glMultiTexCoord4ivARB.invokeExact(handles.PFN_glMultiTexCoord4ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4ivARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4sARB((unsigned int) GLenum target, ((signed short) khronos_int16_t) GLshort s, ((signed short) khronos_int16_t) GLshort t, ((signed short) khronos_int16_t) GLshort r, ((signed short) khronos_int16_t) GLshort q);
    /// ```
    public void MultiTexCoord4sARB(int target, short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4sARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4sARB", target, s, t, r, q); }
        Handles.MH_glMultiTexCoord4sARB.invokeExact(handles.PFN_glMultiTexCoord4sARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4sARB", e); }
    }

    /// ```
    /// void glMultiTexCoord4svARB((unsigned int) GLenum target, const GLshort* v);
    /// ```
    public void MultiTexCoord4svARB(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4svARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4svARB", target, v); }
        Handles.MH_glMultiTexCoord4svARB.invokeExact(handles.PFN_glMultiTexCoord4svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4svARB", e); }
    }

}
