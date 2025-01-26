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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIVertexStreams {
    public static final int GL_MAX_VERTEX_STREAMS_ATI = 0x876B;
    public static final int GL_VERTEX_STREAM0_ATI = 0x876C;
    public static final int GL_VERTEX_STREAM1_ATI = 0x876D;
    public static final int GL_VERTEX_STREAM2_ATI = 0x876E;
    public static final int GL_VERTEX_STREAM3_ATI = 0x876F;
    public static final int GL_VERTEX_STREAM4_ATI = 0x8770;
    public static final int GL_VERTEX_STREAM5_ATI = 0x8771;
    public static final int GL_VERTEX_STREAM6_ATI = 0x8772;
    public static final int GL_VERTEX_STREAM7_ATI = 0x8773;
    public static final int GL_VERTEX_SOURCE_ATI = 0x8774;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexStream1sATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream1svATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1iATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream1ivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1fATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream1fvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1dATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream1dvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2sATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream2svATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2iATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream2ivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2fATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream2fvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2dATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream2dvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3sATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream3svATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3iATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream3ivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3fATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream3fvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3dATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream3dvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4sATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream4svATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4iATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream4ivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4fATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream4fvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4dATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream4dvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3bATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glNormalStream3bvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3sATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glNormalStream3svATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3iATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNormalStream3ivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3fATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glNormalStream3fvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3dATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glNormalStream3dvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClientActiveVertexStreamATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBlendEnviATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBlendEnvfATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glVertexStream1sATI;
        public final MemorySegment PFN_glVertexStream1svATI;
        public final MemorySegment PFN_glVertexStream1iATI;
        public final MemorySegment PFN_glVertexStream1ivATI;
        public final MemorySegment PFN_glVertexStream1fATI;
        public final MemorySegment PFN_glVertexStream1fvATI;
        public final MemorySegment PFN_glVertexStream1dATI;
        public final MemorySegment PFN_glVertexStream1dvATI;
        public final MemorySegment PFN_glVertexStream2sATI;
        public final MemorySegment PFN_glVertexStream2svATI;
        public final MemorySegment PFN_glVertexStream2iATI;
        public final MemorySegment PFN_glVertexStream2ivATI;
        public final MemorySegment PFN_glVertexStream2fATI;
        public final MemorySegment PFN_glVertexStream2fvATI;
        public final MemorySegment PFN_glVertexStream2dATI;
        public final MemorySegment PFN_glVertexStream2dvATI;
        public final MemorySegment PFN_glVertexStream3sATI;
        public final MemorySegment PFN_glVertexStream3svATI;
        public final MemorySegment PFN_glVertexStream3iATI;
        public final MemorySegment PFN_glVertexStream3ivATI;
        public final MemorySegment PFN_glVertexStream3fATI;
        public final MemorySegment PFN_glVertexStream3fvATI;
        public final MemorySegment PFN_glVertexStream3dATI;
        public final MemorySegment PFN_glVertexStream3dvATI;
        public final MemorySegment PFN_glVertexStream4sATI;
        public final MemorySegment PFN_glVertexStream4svATI;
        public final MemorySegment PFN_glVertexStream4iATI;
        public final MemorySegment PFN_glVertexStream4ivATI;
        public final MemorySegment PFN_glVertexStream4fATI;
        public final MemorySegment PFN_glVertexStream4fvATI;
        public final MemorySegment PFN_glVertexStream4dATI;
        public final MemorySegment PFN_glVertexStream4dvATI;
        public final MemorySegment PFN_glNormalStream3bATI;
        public final MemorySegment PFN_glNormalStream3bvATI;
        public final MemorySegment PFN_glNormalStream3sATI;
        public final MemorySegment PFN_glNormalStream3svATI;
        public final MemorySegment PFN_glNormalStream3iATI;
        public final MemorySegment PFN_glNormalStream3ivATI;
        public final MemorySegment PFN_glNormalStream3fATI;
        public final MemorySegment PFN_glNormalStream3fvATI;
        public final MemorySegment PFN_glNormalStream3dATI;
        public final MemorySegment PFN_glNormalStream3dvATI;
        public final MemorySegment PFN_glClientActiveVertexStreamATI;
        public final MemorySegment PFN_glVertexBlendEnviATI;
        public final MemorySegment PFN_glVertexBlendEnvfATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexStream1sATI = func.invoke("glVertexStream1sATI");
            PFN_glVertexStream1svATI = func.invoke("glVertexStream1svATI");
            PFN_glVertexStream1iATI = func.invoke("glVertexStream1iATI");
            PFN_glVertexStream1ivATI = func.invoke("glVertexStream1ivATI");
            PFN_glVertexStream1fATI = func.invoke("glVertexStream1fATI");
            PFN_glVertexStream1fvATI = func.invoke("glVertexStream1fvATI");
            PFN_glVertexStream1dATI = func.invoke("glVertexStream1dATI");
            PFN_glVertexStream1dvATI = func.invoke("glVertexStream1dvATI");
            PFN_glVertexStream2sATI = func.invoke("glVertexStream2sATI");
            PFN_glVertexStream2svATI = func.invoke("glVertexStream2svATI");
            PFN_glVertexStream2iATI = func.invoke("glVertexStream2iATI");
            PFN_glVertexStream2ivATI = func.invoke("glVertexStream2ivATI");
            PFN_glVertexStream2fATI = func.invoke("glVertexStream2fATI");
            PFN_glVertexStream2fvATI = func.invoke("glVertexStream2fvATI");
            PFN_glVertexStream2dATI = func.invoke("glVertexStream2dATI");
            PFN_glVertexStream2dvATI = func.invoke("glVertexStream2dvATI");
            PFN_glVertexStream3sATI = func.invoke("glVertexStream3sATI");
            PFN_glVertexStream3svATI = func.invoke("glVertexStream3svATI");
            PFN_glVertexStream3iATI = func.invoke("glVertexStream3iATI");
            PFN_glVertexStream3ivATI = func.invoke("glVertexStream3ivATI");
            PFN_glVertexStream3fATI = func.invoke("glVertexStream3fATI");
            PFN_glVertexStream3fvATI = func.invoke("glVertexStream3fvATI");
            PFN_glVertexStream3dATI = func.invoke("glVertexStream3dATI");
            PFN_glVertexStream3dvATI = func.invoke("glVertexStream3dvATI");
            PFN_glVertexStream4sATI = func.invoke("glVertexStream4sATI");
            PFN_glVertexStream4svATI = func.invoke("glVertexStream4svATI");
            PFN_glVertexStream4iATI = func.invoke("glVertexStream4iATI");
            PFN_glVertexStream4ivATI = func.invoke("glVertexStream4ivATI");
            PFN_glVertexStream4fATI = func.invoke("glVertexStream4fATI");
            PFN_glVertexStream4fvATI = func.invoke("glVertexStream4fvATI");
            PFN_glVertexStream4dATI = func.invoke("glVertexStream4dATI");
            PFN_glVertexStream4dvATI = func.invoke("glVertexStream4dvATI");
            PFN_glNormalStream3bATI = func.invoke("glNormalStream3bATI");
            PFN_glNormalStream3bvATI = func.invoke("glNormalStream3bvATI");
            PFN_glNormalStream3sATI = func.invoke("glNormalStream3sATI");
            PFN_glNormalStream3svATI = func.invoke("glNormalStream3svATI");
            PFN_glNormalStream3iATI = func.invoke("glNormalStream3iATI");
            PFN_glNormalStream3ivATI = func.invoke("glNormalStream3ivATI");
            PFN_glNormalStream3fATI = func.invoke("glNormalStream3fATI");
            PFN_glNormalStream3fvATI = func.invoke("glNormalStream3fvATI");
            PFN_glNormalStream3dATI = func.invoke("glNormalStream3dATI");
            PFN_glNormalStream3dvATI = func.invoke("glNormalStream3dvATI");
            PFN_glClientActiveVertexStreamATI = func.invoke("glClientActiveVertexStreamATI");
            PFN_glVertexBlendEnviATI = func.invoke("glVertexBlendEnviATI");
            PFN_glVertexBlendEnvfATI = func.invoke("glVertexBlendEnvfATI");
        }
    }

    public GLATIVertexStreams(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexStream1sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexStream1sATI(int stream, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1sATI");
        try { Handles.MH_glVertexStream1sATI.invokeExact(handles.PFN_glVertexStream1sATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1sATI", e); }
    }

    /// ```
    /// void glVertexStream1svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream1svATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1svATI");
        try { Handles.MH_glVertexStream1svATI.invokeExact(handles.PFN_glVertexStream1svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1svATI", e); }
    }

    /// ```
    /// void glVertexStream1iATI((unsigned int) GLenum stream, (int) GLint x);
    /// ```
    public void VertexStream1iATI(int stream, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1iATI");
        try { Handles.MH_glVertexStream1iATI.invokeExact(handles.PFN_glVertexStream1iATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1iATI", e); }
    }

    /// ```
    /// void glVertexStream1ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream1ivATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1ivATI");
        try { Handles.MH_glVertexStream1ivATI.invokeExact(handles.PFN_glVertexStream1ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1ivATI", e); }
    }

    /// ```
    /// void glVertexStream1fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexStream1fATI(int stream, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1fATI");
        try { Handles.MH_glVertexStream1fATI.invokeExact(handles.PFN_glVertexStream1fATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1fATI", e); }
    }

    /// ```
    /// void glVertexStream1fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream1fvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1fvATI");
        try { Handles.MH_glVertexStream1fvATI.invokeExact(handles.PFN_glVertexStream1fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1fvATI", e); }
    }

    /// ```
    /// void glVertexStream1dATI((unsigned int) GLenum stream, (double) GLdouble x);
    /// ```
    public void VertexStream1dATI(int stream, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1dATI");
        try { Handles.MH_glVertexStream1dATI.invokeExact(handles.PFN_glVertexStream1dATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1dATI", e); }
    }

    /// ```
    /// void glVertexStream1dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream1dvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1dvATI");
        try { Handles.MH_glVertexStream1dvATI.invokeExact(handles.PFN_glVertexStream1dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1dvATI", e); }
    }

    /// ```
    /// void glVertexStream2sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexStream2sATI(int stream, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2sATI");
        try { Handles.MH_glVertexStream2sATI.invokeExact(handles.PFN_glVertexStream2sATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2sATI", e); }
    }

    /// ```
    /// void glVertexStream2svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream2svATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2svATI");
        try { Handles.MH_glVertexStream2svATI.invokeExact(handles.PFN_glVertexStream2svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2svATI", e); }
    }

    /// ```
    /// void glVertexStream2iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y);
    /// ```
    public void VertexStream2iATI(int stream, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2iATI");
        try { Handles.MH_glVertexStream2iATI.invokeExact(handles.PFN_glVertexStream2iATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2iATI", e); }
    }

    /// ```
    /// void glVertexStream2ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream2ivATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2ivATI");
        try { Handles.MH_glVertexStream2ivATI.invokeExact(handles.PFN_glVertexStream2ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2ivATI", e); }
    }

    /// ```
    /// void glVertexStream2fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexStream2fATI(int stream, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2fATI");
        try { Handles.MH_glVertexStream2fATI.invokeExact(handles.PFN_glVertexStream2fATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2fATI", e); }
    }

    /// ```
    /// void glVertexStream2fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream2fvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2fvATI");
        try { Handles.MH_glVertexStream2fvATI.invokeExact(handles.PFN_glVertexStream2fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2fvATI", e); }
    }

    /// ```
    /// void glVertexStream2dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexStream2dATI(int stream, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2dATI");
        try { Handles.MH_glVertexStream2dATI.invokeExact(handles.PFN_glVertexStream2dATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2dATI", e); }
    }

    /// ```
    /// void glVertexStream2dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream2dvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2dvATI");
        try { Handles.MH_glVertexStream2dvATI.invokeExact(handles.PFN_glVertexStream2dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2dvATI", e); }
    }

    /// ```
    /// void glVertexStream3sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexStream3sATI(int stream, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3sATI");
        try { Handles.MH_glVertexStream3sATI.invokeExact(handles.PFN_glVertexStream3sATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3sATI", e); }
    }

    /// ```
    /// void glVertexStream3svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream3svATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3svATI");
        try { Handles.MH_glVertexStream3svATI.invokeExact(handles.PFN_glVertexStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3svATI", e); }
    }

    /// ```
    /// void glVertexStream3iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void VertexStream3iATI(int stream, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3iATI");
        try { Handles.MH_glVertexStream3iATI.invokeExact(handles.PFN_glVertexStream3iATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3iATI", e); }
    }

    /// ```
    /// void glVertexStream3ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream3ivATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3ivATI");
        try { Handles.MH_glVertexStream3ivATI.invokeExact(handles.PFN_glVertexStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3ivATI", e); }
    }

    /// ```
    /// void glVertexStream3fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexStream3fATI(int stream, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3fATI");
        try { Handles.MH_glVertexStream3fATI.invokeExact(handles.PFN_glVertexStream3fATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3fATI", e); }
    }

    /// ```
    /// void glVertexStream3fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream3fvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3fvATI");
        try { Handles.MH_glVertexStream3fvATI.invokeExact(handles.PFN_glVertexStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3fvATI", e); }
    }

    /// ```
    /// void glVertexStream3dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexStream3dATI(int stream, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3dATI");
        try { Handles.MH_glVertexStream3dATI.invokeExact(handles.PFN_glVertexStream3dATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3dATI", e); }
    }

    /// ```
    /// void glVertexStream3dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream3dvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3dvATI");
        try { Handles.MH_glVertexStream3dvATI.invokeExact(handles.PFN_glVertexStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3dvATI", e); }
    }

    /// ```
    /// void glVertexStream4sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexStream4sATI(int stream, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4sATI");
        try { Handles.MH_glVertexStream4sATI.invokeExact(handles.PFN_glVertexStream4sATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4sATI", e); }
    }

    /// ```
    /// void glVertexStream4svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream4svATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4svATI");
        try { Handles.MH_glVertexStream4svATI.invokeExact(handles.PFN_glVertexStream4svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4svATI", e); }
    }

    /// ```
    /// void glVertexStream4iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void VertexStream4iATI(int stream, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4iATI");
        try { Handles.MH_glVertexStream4iATI.invokeExact(handles.PFN_glVertexStream4iATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4iATI", e); }
    }

    /// ```
    /// void glVertexStream4ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream4ivATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4ivATI");
        try { Handles.MH_glVertexStream4ivATI.invokeExact(handles.PFN_glVertexStream4ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4ivATI", e); }
    }

    /// ```
    /// void glVertexStream4fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexStream4fATI(int stream, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4fATI");
        try { Handles.MH_glVertexStream4fATI.invokeExact(handles.PFN_glVertexStream4fATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4fATI", e); }
    }

    /// ```
    /// void glVertexStream4fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream4fvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4fvATI");
        try { Handles.MH_glVertexStream4fvATI.invokeExact(handles.PFN_glVertexStream4fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4fvATI", e); }
    }

    /// ```
    /// void glVertexStream4dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexStream4dATI(int stream, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4dATI");
        try { Handles.MH_glVertexStream4dATI.invokeExact(handles.PFN_glVertexStream4dATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4dATI", e); }
    }

    /// ```
    /// void glVertexStream4dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream4dvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4dvATI");
        try { Handles.MH_glVertexStream4dvATI.invokeExact(handles.PFN_glVertexStream4dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4dvATI", e); }
    }

    /// ```
    /// void glNormalStream3bATI((unsigned int) GLenum stream, ((signed char) khronos_int8_t) GLbyte nx, ((signed char) khronos_int8_t) GLbyte ny, ((signed char) khronos_int8_t) GLbyte nz);
    /// ```
    public void NormalStream3bATI(int stream, byte nx, byte ny, byte nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3bATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3bATI");
        try { Handles.MH_glNormalStream3bATI.invokeExact(handles.PFN_glNormalStream3bATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3bATI", e); }
    }

    /// ```
    /// void glNormalStream3bvATI((unsigned int) GLenum stream, const GLbyte* coords);
    /// ```
    public void NormalStream3bvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3bvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3bvATI");
        try { Handles.MH_glNormalStream3bvATI.invokeExact(handles.PFN_glNormalStream3bvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3bvATI", e); }
    }

    /// ```
    /// void glNormalStream3sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort nx, ((signed short) khronos_int16_t) GLshort ny, ((signed short) khronos_int16_t) GLshort nz);
    /// ```
    public void NormalStream3sATI(int stream, short nx, short ny, short nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3sATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3sATI");
        try { Handles.MH_glNormalStream3sATI.invokeExact(handles.PFN_glNormalStream3sATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3sATI", e); }
    }

    /// ```
    /// void glNormalStream3svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void NormalStream3svATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3svATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3svATI");
        try { Handles.MH_glNormalStream3svATI.invokeExact(handles.PFN_glNormalStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3svATI", e); }
    }

    /// ```
    /// void glNormalStream3iATI((unsigned int) GLenum stream, (int) GLint nx, (int) GLint ny, (int) GLint nz);
    /// ```
    public void NormalStream3iATI(int stream, int nx, int ny, int nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3iATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3iATI");
        try { Handles.MH_glNormalStream3iATI.invokeExact(handles.PFN_glNormalStream3iATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3iATI", e); }
    }

    /// ```
    /// void glNormalStream3ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void NormalStream3ivATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3ivATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3ivATI");
        try { Handles.MH_glNormalStream3ivATI.invokeExact(handles.PFN_glNormalStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3ivATI", e); }
    }

    /// ```
    /// void glNormalStream3fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz);
    /// ```
    public void NormalStream3fATI(int stream, float nx, float ny, float nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3fATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3fATI");
        try { Handles.MH_glNormalStream3fATI.invokeExact(handles.PFN_glNormalStream3fATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3fATI", e); }
    }

    /// ```
    /// void glNormalStream3fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void NormalStream3fvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3fvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3fvATI");
        try { Handles.MH_glNormalStream3fvATI.invokeExact(handles.PFN_glNormalStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3fvATI", e); }
    }

    /// ```
    /// void glNormalStream3dATI((unsigned int) GLenum stream, (double) GLdouble nx, (double) GLdouble ny, (double) GLdouble nz);
    /// ```
    public void NormalStream3dATI(int stream, double nx, double ny, double nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3dATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3dATI");
        try { Handles.MH_glNormalStream3dATI.invokeExact(handles.PFN_glNormalStream3dATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3dATI", e); }
    }

    /// ```
    /// void glNormalStream3dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void NormalStream3dvATI(int stream, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3dvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3dvATI");
        try { Handles.MH_glNormalStream3dvATI.invokeExact(handles.PFN_glNormalStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3dvATI", e); }
    }

    /// ```
    /// void glClientActiveVertexStreamATI((unsigned int) GLenum stream);
    /// ```
    public void ClientActiveVertexStreamATI(int stream) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientActiveVertexStreamATI)) throw new SymbolNotFoundError("Symbol not found: glClientActiveVertexStreamATI");
        try { Handles.MH_glClientActiveVertexStreamATI.invokeExact(handles.PFN_glClientActiveVertexStreamATI, stream); }
        catch (Throwable e) { throw new RuntimeException("error in ClientActiveVertexStreamATI", e); }
    }

    /// ```
    /// void glVertexBlendEnviATI((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void VertexBlendEnviATI(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBlendEnviATI)) throw new SymbolNotFoundError("Symbol not found: glVertexBlendEnviATI");
        try { Handles.MH_glVertexBlendEnviATI.invokeExact(handles.PFN_glVertexBlendEnviATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBlendEnviATI", e); }
    }

    /// ```
    /// void glVertexBlendEnvfATI((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void VertexBlendEnvfATI(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBlendEnvfATI)) throw new SymbolNotFoundError("Symbol not found: glVertexBlendEnvfATI");
        try { Handles.MH_glVertexBlendEnvfATI.invokeExact(handles.PFN_glVertexBlendEnvfATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBlendEnvfATI", e); }
    }

}
