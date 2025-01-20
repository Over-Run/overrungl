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
import overrungl.annotation.*;
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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexStream1sATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexStream1svATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream1iATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexStream1ivATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream1fATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexStream1fvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream1dATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexStream1dvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream2sATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexStream2svATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream2iATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexStream2ivATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream2fATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexStream2fvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream2dATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexStream2dvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream3sATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexStream3svATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream3iATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexStream3ivATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream3fATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexStream3fvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream3dATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexStream3dvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream4sATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexStream4svATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream4iATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexStream4ivATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream4fATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexStream4fvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexStream4dATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexStream4dvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalStream3bATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glNormalStream3bvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalStream3sATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glNormalStream3svATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalStream3iATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNormalStream3ivATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalStream3fATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glNormalStream3fvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalStream3dATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glNormalStream3dvATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClientActiveVertexStreamATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexBlendEnviATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexBlendEnvfATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexStream1sATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1sATI);
        public static final MethodHandle MH_glVertexStream1svATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1svATI);
        public static final MethodHandle MH_glVertexStream1iATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1iATI);
        public static final MethodHandle MH_glVertexStream1ivATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1ivATI);
        public static final MethodHandle MH_glVertexStream1fATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1fATI);
        public static final MethodHandle MH_glVertexStream1fvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1fvATI);
        public static final MethodHandle MH_glVertexStream1dATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1dATI);
        public static final MethodHandle MH_glVertexStream1dvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream1dvATI);
        public static final MethodHandle MH_glVertexStream2sATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2sATI);
        public static final MethodHandle MH_glVertexStream2svATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2svATI);
        public static final MethodHandle MH_glVertexStream2iATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2iATI);
        public static final MethodHandle MH_glVertexStream2ivATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2ivATI);
        public static final MethodHandle MH_glVertexStream2fATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2fATI);
        public static final MethodHandle MH_glVertexStream2fvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2fvATI);
        public static final MethodHandle MH_glVertexStream2dATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2dATI);
        public static final MethodHandle MH_glVertexStream2dvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream2dvATI);
        public static final MethodHandle MH_glVertexStream3sATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3sATI);
        public static final MethodHandle MH_glVertexStream3svATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3svATI);
        public static final MethodHandle MH_glVertexStream3iATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3iATI);
        public static final MethodHandle MH_glVertexStream3ivATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3ivATI);
        public static final MethodHandle MH_glVertexStream3fATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3fATI);
        public static final MethodHandle MH_glVertexStream3fvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3fvATI);
        public static final MethodHandle MH_glVertexStream3dATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3dATI);
        public static final MethodHandle MH_glVertexStream3dvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream3dvATI);
        public static final MethodHandle MH_glVertexStream4sATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4sATI);
        public static final MethodHandle MH_glVertexStream4svATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4svATI);
        public static final MethodHandle MH_glVertexStream4iATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4iATI);
        public static final MethodHandle MH_glVertexStream4ivATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4ivATI);
        public static final MethodHandle MH_glVertexStream4fATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4fATI);
        public static final MethodHandle MH_glVertexStream4fvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4fvATI);
        public static final MethodHandle MH_glVertexStream4dATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4dATI);
        public static final MethodHandle MH_glVertexStream4dvATI = RuntimeHelper.downcall(Descriptors.FD_glVertexStream4dvATI);
        public static final MethodHandle MH_glNormalStream3bATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3bATI);
        public static final MethodHandle MH_glNormalStream3bvATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3bvATI);
        public static final MethodHandle MH_glNormalStream3sATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3sATI);
        public static final MethodHandle MH_glNormalStream3svATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3svATI);
        public static final MethodHandle MH_glNormalStream3iATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3iATI);
        public static final MethodHandle MH_glNormalStream3ivATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3ivATI);
        public static final MethodHandle MH_glNormalStream3fATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3fATI);
        public static final MethodHandle MH_glNormalStream3fvATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3fvATI);
        public static final MethodHandle MH_glNormalStream3dATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3dATI);
        public static final MethodHandle MH_glNormalStream3dvATI = RuntimeHelper.downcall(Descriptors.FD_glNormalStream3dvATI);
        public static final MethodHandle MH_glClientActiveVertexStreamATI = RuntimeHelper.downcall(Descriptors.FD_glClientActiveVertexStreamATI);
        public static final MethodHandle MH_glVertexBlendEnviATI = RuntimeHelper.downcall(Descriptors.FD_glVertexBlendEnviATI);
        public static final MethodHandle MH_glVertexBlendEnvfATI = RuntimeHelper.downcall(Descriptors.FD_glVertexBlendEnvfATI);
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

    public void VertexStream1sATI(@CType("GLenum") int stream, @CType("GLshort") short x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1sATI");
        try { Handles.MH_glVertexStream1sATI.invokeExact(handles.PFN_glVertexStream1sATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1sATI", e); }
    }

    public void VertexStream1svATI(@CType("GLenum") int stream, @CType("const GLshort *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1svATI");
        try { Handles.MH_glVertexStream1svATI.invokeExact(handles.PFN_glVertexStream1svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1svATI", e); }
    }

    public void VertexStream1iATI(@CType("GLenum") int stream, @CType("GLint") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1iATI");
        try { Handles.MH_glVertexStream1iATI.invokeExact(handles.PFN_glVertexStream1iATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1iATI", e); }
    }

    public void VertexStream1ivATI(@CType("GLenum") int stream, @CType("const GLint *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1ivATI");
        try { Handles.MH_glVertexStream1ivATI.invokeExact(handles.PFN_glVertexStream1ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1ivATI", e); }
    }

    public void VertexStream1fATI(@CType("GLenum") int stream, @CType("GLfloat") float x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1fATI");
        try { Handles.MH_glVertexStream1fATI.invokeExact(handles.PFN_glVertexStream1fATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1fATI", e); }
    }

    public void VertexStream1fvATI(@CType("GLenum") int stream, @CType("const GLfloat *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1fvATI");
        try { Handles.MH_glVertexStream1fvATI.invokeExact(handles.PFN_glVertexStream1fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1fvATI", e); }
    }

    public void VertexStream1dATI(@CType("GLenum") int stream, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1dATI");
        try { Handles.MH_glVertexStream1dATI.invokeExact(handles.PFN_glVertexStream1dATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1dATI", e); }
    }

    public void VertexStream1dvATI(@CType("GLenum") int stream, @CType("const GLdouble *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream1dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream1dvATI");
        try { Handles.MH_glVertexStream1dvATI.invokeExact(handles.PFN_glVertexStream1dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream1dvATI", e); }
    }

    public void VertexStream2sATI(@CType("GLenum") int stream, @CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2sATI");
        try { Handles.MH_glVertexStream2sATI.invokeExact(handles.PFN_glVertexStream2sATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2sATI", e); }
    }

    public void VertexStream2svATI(@CType("GLenum") int stream, @CType("const GLshort *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2svATI");
        try { Handles.MH_glVertexStream2svATI.invokeExact(handles.PFN_glVertexStream2svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2svATI", e); }
    }

    public void VertexStream2iATI(@CType("GLenum") int stream, @CType("GLint") int x, @CType("GLint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2iATI");
        try { Handles.MH_glVertexStream2iATI.invokeExact(handles.PFN_glVertexStream2iATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2iATI", e); }
    }

    public void VertexStream2ivATI(@CType("GLenum") int stream, @CType("const GLint *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2ivATI");
        try { Handles.MH_glVertexStream2ivATI.invokeExact(handles.PFN_glVertexStream2ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2ivATI", e); }
    }

    public void VertexStream2fATI(@CType("GLenum") int stream, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2fATI");
        try { Handles.MH_glVertexStream2fATI.invokeExact(handles.PFN_glVertexStream2fATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2fATI", e); }
    }

    public void VertexStream2fvATI(@CType("GLenum") int stream, @CType("const GLfloat *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2fvATI");
        try { Handles.MH_glVertexStream2fvATI.invokeExact(handles.PFN_glVertexStream2fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2fvATI", e); }
    }

    public void VertexStream2dATI(@CType("GLenum") int stream, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2dATI");
        try { Handles.MH_glVertexStream2dATI.invokeExact(handles.PFN_glVertexStream2dATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2dATI", e); }
    }

    public void VertexStream2dvATI(@CType("GLenum") int stream, @CType("const GLdouble *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream2dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream2dvATI");
        try { Handles.MH_glVertexStream2dvATI.invokeExact(handles.PFN_glVertexStream2dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream2dvATI", e); }
    }

    public void VertexStream3sATI(@CType("GLenum") int stream, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3sATI");
        try { Handles.MH_glVertexStream3sATI.invokeExact(handles.PFN_glVertexStream3sATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3sATI", e); }
    }

    public void VertexStream3svATI(@CType("GLenum") int stream, @CType("const GLshort *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3svATI");
        try { Handles.MH_glVertexStream3svATI.invokeExact(handles.PFN_glVertexStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3svATI", e); }
    }

    public void VertexStream3iATI(@CType("GLenum") int stream, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3iATI");
        try { Handles.MH_glVertexStream3iATI.invokeExact(handles.PFN_glVertexStream3iATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3iATI", e); }
    }

    public void VertexStream3ivATI(@CType("GLenum") int stream, @CType("const GLint *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3ivATI");
        try { Handles.MH_glVertexStream3ivATI.invokeExact(handles.PFN_glVertexStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3ivATI", e); }
    }

    public void VertexStream3fATI(@CType("GLenum") int stream, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3fATI");
        try { Handles.MH_glVertexStream3fATI.invokeExact(handles.PFN_glVertexStream3fATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3fATI", e); }
    }

    public void VertexStream3fvATI(@CType("GLenum") int stream, @CType("const GLfloat *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3fvATI");
        try { Handles.MH_glVertexStream3fvATI.invokeExact(handles.PFN_glVertexStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3fvATI", e); }
    }

    public void VertexStream3dATI(@CType("GLenum") int stream, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3dATI");
        try { Handles.MH_glVertexStream3dATI.invokeExact(handles.PFN_glVertexStream3dATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3dATI", e); }
    }

    public void VertexStream3dvATI(@CType("GLenum") int stream, @CType("const GLdouble *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream3dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream3dvATI");
        try { Handles.MH_glVertexStream3dvATI.invokeExact(handles.PFN_glVertexStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream3dvATI", e); }
    }

    public void VertexStream4sATI(@CType("GLenum") int stream, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4sATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4sATI");
        try { Handles.MH_glVertexStream4sATI.invokeExact(handles.PFN_glVertexStream4sATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4sATI", e); }
    }

    public void VertexStream4svATI(@CType("GLenum") int stream, @CType("const GLshort *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4svATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4svATI");
        try { Handles.MH_glVertexStream4svATI.invokeExact(handles.PFN_glVertexStream4svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4svATI", e); }
    }

    public void VertexStream4iATI(@CType("GLenum") int stream, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4iATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4iATI");
        try { Handles.MH_glVertexStream4iATI.invokeExact(handles.PFN_glVertexStream4iATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4iATI", e); }
    }

    public void VertexStream4ivATI(@CType("GLenum") int stream, @CType("const GLint *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4ivATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4ivATI");
        try { Handles.MH_glVertexStream4ivATI.invokeExact(handles.PFN_glVertexStream4ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4ivATI", e); }
    }

    public void VertexStream4fATI(@CType("GLenum") int stream, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4fATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4fATI");
        try { Handles.MH_glVertexStream4fATI.invokeExact(handles.PFN_glVertexStream4fATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4fATI", e); }
    }

    public void VertexStream4fvATI(@CType("GLenum") int stream, @CType("const GLfloat *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4fvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4fvATI");
        try { Handles.MH_glVertexStream4fvATI.invokeExact(handles.PFN_glVertexStream4fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4fvATI", e); }
    }

    public void VertexStream4dATI(@CType("GLenum") int stream, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4dATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4dATI");
        try { Handles.MH_glVertexStream4dATI.invokeExact(handles.PFN_glVertexStream4dATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4dATI", e); }
    }

    public void VertexStream4dvATI(@CType("GLenum") int stream, @CType("const GLdouble *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexStream4dvATI)) throw new SymbolNotFoundError("Symbol not found: glVertexStream4dvATI");
        try { Handles.MH_glVertexStream4dvATI.invokeExact(handles.PFN_glVertexStream4dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexStream4dvATI", e); }
    }

    public void NormalStream3bATI(@CType("GLenum") int stream, @CType("GLbyte") byte nx, @CType("GLbyte") byte ny, @CType("GLbyte") byte nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3bATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3bATI");
        try { Handles.MH_glNormalStream3bATI.invokeExact(handles.PFN_glNormalStream3bATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3bATI", e); }
    }

    public void NormalStream3bvATI(@CType("GLenum") int stream, @CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3bvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3bvATI");
        try { Handles.MH_glNormalStream3bvATI.invokeExact(handles.PFN_glNormalStream3bvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3bvATI", e); }
    }

    public void NormalStream3sATI(@CType("GLenum") int stream, @CType("GLshort") short nx, @CType("GLshort") short ny, @CType("GLshort") short nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3sATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3sATI");
        try { Handles.MH_glNormalStream3sATI.invokeExact(handles.PFN_glNormalStream3sATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3sATI", e); }
    }

    public void NormalStream3svATI(@CType("GLenum") int stream, @CType("const GLshort *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3svATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3svATI");
        try { Handles.MH_glNormalStream3svATI.invokeExact(handles.PFN_glNormalStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3svATI", e); }
    }

    public void NormalStream3iATI(@CType("GLenum") int stream, @CType("GLint") int nx, @CType("GLint") int ny, @CType("GLint") int nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3iATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3iATI");
        try { Handles.MH_glNormalStream3iATI.invokeExact(handles.PFN_glNormalStream3iATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3iATI", e); }
    }

    public void NormalStream3ivATI(@CType("GLenum") int stream, @CType("const GLint *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3ivATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3ivATI");
        try { Handles.MH_glNormalStream3ivATI.invokeExact(handles.PFN_glNormalStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3ivATI", e); }
    }

    public void NormalStream3fATI(@CType("GLenum") int stream, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3fATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3fATI");
        try { Handles.MH_glNormalStream3fATI.invokeExact(handles.PFN_glNormalStream3fATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3fATI", e); }
    }

    public void NormalStream3fvATI(@CType("GLenum") int stream, @CType("const GLfloat *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3fvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3fvATI");
        try { Handles.MH_glNormalStream3fvATI.invokeExact(handles.PFN_glNormalStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3fvATI", e); }
    }

    public void NormalStream3dATI(@CType("GLenum") int stream, @CType("GLdouble") double nx, @CType("GLdouble") double ny, @CType("GLdouble") double nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3dATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3dATI");
        try { Handles.MH_glNormalStream3dATI.invokeExact(handles.PFN_glNormalStream3dATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3dATI", e); }
    }

    public void NormalStream3dvATI(@CType("GLenum") int stream, @CType("const GLdouble *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalStream3dvATI)) throw new SymbolNotFoundError("Symbol not found: glNormalStream3dvATI");
        try { Handles.MH_glNormalStream3dvATI.invokeExact(handles.PFN_glNormalStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalStream3dvATI", e); }
    }

    public void ClientActiveVertexStreamATI(@CType("GLenum") int stream) {
        if (Unmarshal.isNullPointer(handles.PFN_glClientActiveVertexStreamATI)) throw new SymbolNotFoundError("Symbol not found: glClientActiveVertexStreamATI");
        try { Handles.MH_glClientActiveVertexStreamATI.invokeExact(handles.PFN_glClientActiveVertexStreamATI, stream); }
        catch (Throwable e) { throw new RuntimeException("error in glClientActiveVertexStreamATI", e); }
    }

    public void VertexBlendEnviATI(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexBlendEnviATI)) throw new SymbolNotFoundError("Symbol not found: glVertexBlendEnviATI");
        try { Handles.MH_glVertexBlendEnviATI.invokeExact(handles.PFN_glVertexBlendEnviATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexBlendEnviATI", e); }
    }

    public void VertexBlendEnvfATI(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexBlendEnvfATI)) throw new SymbolNotFoundError("Symbol not found: glVertexBlendEnvfATI");
        try { Handles.MH_glVertexBlendEnvfATI.invokeExact(handles.PFN_glVertexBlendEnvfATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexBlendEnvfATI", e); }
    }

}
