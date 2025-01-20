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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glActiveTextureARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClientActiveTextureARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord1dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMultiTexCoord1dvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord1fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexCoord1fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord1iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord1ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord1sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glMultiTexCoord1svARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord2dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMultiTexCoord2dvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord2fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexCoord2fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord2iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord2ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord2sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glMultiTexCoord2svARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord3dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMultiTexCoord3dvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord3fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexCoord3fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord3iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord3ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord3sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glMultiTexCoord3svARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4dARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMultiTexCoord4dvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexCoord4fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord4ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4sARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glMultiTexCoord4svARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glActiveTextureARB,
            FD_glClientActiveTextureARB,
            FD_glMultiTexCoord1dARB,
            FD_glMultiTexCoord1dvARB,
            FD_glMultiTexCoord1fARB,
            FD_glMultiTexCoord1fvARB,
            FD_glMultiTexCoord1iARB,
            FD_glMultiTexCoord1ivARB,
            FD_glMultiTexCoord1sARB,
            FD_glMultiTexCoord1svARB,
            FD_glMultiTexCoord2dARB,
            FD_glMultiTexCoord2dvARB,
            FD_glMultiTexCoord2fARB,
            FD_glMultiTexCoord2fvARB,
            FD_glMultiTexCoord2iARB,
            FD_glMultiTexCoord2ivARB,
            FD_glMultiTexCoord2sARB,
            FD_glMultiTexCoord2svARB,
            FD_glMultiTexCoord3dARB,
            FD_glMultiTexCoord3dvARB,
            FD_glMultiTexCoord3fARB,
            FD_glMultiTexCoord3fvARB,
            FD_glMultiTexCoord3iARB,
            FD_glMultiTexCoord3ivARB,
            FD_glMultiTexCoord3sARB,
            FD_glMultiTexCoord3svARB,
            FD_glMultiTexCoord4dARB,
            FD_glMultiTexCoord4dvARB,
            FD_glMultiTexCoord4fARB,
            FD_glMultiTexCoord4fvARB,
            FD_glMultiTexCoord4iARB,
            FD_glMultiTexCoord4ivARB,
            FD_glMultiTexCoord4sARB,
            FD_glMultiTexCoord4svARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glActiveTextureARB = RuntimeHelper.downcall(Descriptors.FD_glActiveTextureARB);
        public static final MethodHandle MH_glClientActiveTextureARB = RuntimeHelper.downcall(Descriptors.FD_glClientActiveTextureARB);
        public static final MethodHandle MH_glMultiTexCoord1dARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1dARB);
        public static final MethodHandle MH_glMultiTexCoord1dvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1dvARB);
        public static final MethodHandle MH_glMultiTexCoord1fARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1fARB);
        public static final MethodHandle MH_glMultiTexCoord1fvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1fvARB);
        public static final MethodHandle MH_glMultiTexCoord1iARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1iARB);
        public static final MethodHandle MH_glMultiTexCoord1ivARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1ivARB);
        public static final MethodHandle MH_glMultiTexCoord1sARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1sARB);
        public static final MethodHandle MH_glMultiTexCoord1svARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1svARB);
        public static final MethodHandle MH_glMultiTexCoord2dARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2dARB);
        public static final MethodHandle MH_glMultiTexCoord2dvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2dvARB);
        public static final MethodHandle MH_glMultiTexCoord2fARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2fARB);
        public static final MethodHandle MH_glMultiTexCoord2fvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2fvARB);
        public static final MethodHandle MH_glMultiTexCoord2iARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2iARB);
        public static final MethodHandle MH_glMultiTexCoord2ivARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2ivARB);
        public static final MethodHandle MH_glMultiTexCoord2sARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2sARB);
        public static final MethodHandle MH_glMultiTexCoord2svARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2svARB);
        public static final MethodHandle MH_glMultiTexCoord3dARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3dARB);
        public static final MethodHandle MH_glMultiTexCoord3dvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3dvARB);
        public static final MethodHandle MH_glMultiTexCoord3fARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3fARB);
        public static final MethodHandle MH_glMultiTexCoord3fvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3fvARB);
        public static final MethodHandle MH_glMultiTexCoord3iARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3iARB);
        public static final MethodHandle MH_glMultiTexCoord3ivARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3ivARB);
        public static final MethodHandle MH_glMultiTexCoord3sARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3sARB);
        public static final MethodHandle MH_glMultiTexCoord3svARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3svARB);
        public static final MethodHandle MH_glMultiTexCoord4dARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4dARB);
        public static final MethodHandle MH_glMultiTexCoord4dvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4dvARB);
        public static final MethodHandle MH_glMultiTexCoord4fARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4fARB);
        public static final MethodHandle MH_glMultiTexCoord4fvARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4fvARB);
        public static final MethodHandle MH_glMultiTexCoord4iARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4iARB);
        public static final MethodHandle MH_glMultiTexCoord4ivARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4ivARB);
        public static final MethodHandle MH_glMultiTexCoord4sARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4sARB);
        public static final MethodHandle MH_glMultiTexCoord4svARB = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4svARB);
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

    public void ActiveTextureARB(@CType("GLenum") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glActiveTextureARB)) throw new SymbolNotFoundError("Symbol not found: glActiveTextureARB");
        try { Handles.MH_glActiveTextureARB.invokeExact(handles.PFN_glActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glActiveTextureARB", e); }
    }

    public void ClientActiveTextureARB(@CType("GLenum") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glClientActiveTextureARB)) throw new SymbolNotFoundError("Symbol not found: glClientActiveTextureARB");
        try { Handles.MH_glClientActiveTextureARB.invokeExact(handles.PFN_glClientActiveTextureARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glClientActiveTextureARB", e); }
    }

    public void MultiTexCoord1dARB(@CType("GLenum") int target, @CType("GLdouble") double s) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1dARB");
        try { Handles.MH_glMultiTexCoord1dARB.invokeExact(handles.PFN_glMultiTexCoord1dARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1dARB", e); }
    }

    public void MultiTexCoord1dvARB(@CType("GLenum") int target, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1dvARB");
        try { Handles.MH_glMultiTexCoord1dvARB.invokeExact(handles.PFN_glMultiTexCoord1dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1dvARB", e); }
    }

    public void MultiTexCoord1fARB(@CType("GLenum") int target, @CType("GLfloat") float s) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1fARB");
        try { Handles.MH_glMultiTexCoord1fARB.invokeExact(handles.PFN_glMultiTexCoord1fARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1fARB", e); }
    }

    public void MultiTexCoord1fvARB(@CType("GLenum") int target, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1fvARB");
        try { Handles.MH_glMultiTexCoord1fvARB.invokeExact(handles.PFN_glMultiTexCoord1fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1fvARB", e); }
    }

    public void MultiTexCoord1iARB(@CType("GLenum") int target, @CType("GLint") int s) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1iARB");
        try { Handles.MH_glMultiTexCoord1iARB.invokeExact(handles.PFN_glMultiTexCoord1iARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1iARB", e); }
    }

    public void MultiTexCoord1ivARB(@CType("GLenum") int target, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1ivARB");
        try { Handles.MH_glMultiTexCoord1ivARB.invokeExact(handles.PFN_glMultiTexCoord1ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1ivARB", e); }
    }

    public void MultiTexCoord1sARB(@CType("GLenum") int target, @CType("GLshort") short s) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1sARB");
        try { Handles.MH_glMultiTexCoord1sARB.invokeExact(handles.PFN_glMultiTexCoord1sARB, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1sARB", e); }
    }

    public void MultiTexCoord1svARB(@CType("GLenum") int target, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1svARB");
        try { Handles.MH_glMultiTexCoord1svARB.invokeExact(handles.PFN_glMultiTexCoord1svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1svARB", e); }
    }

    public void MultiTexCoord2dARB(@CType("GLenum") int target, @CType("GLdouble") double s, @CType("GLdouble") double t) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2dARB");
        try { Handles.MH_glMultiTexCoord2dARB.invokeExact(handles.PFN_glMultiTexCoord2dARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2dARB", e); }
    }

    public void MultiTexCoord2dvARB(@CType("GLenum") int target, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2dvARB");
        try { Handles.MH_glMultiTexCoord2dvARB.invokeExact(handles.PFN_glMultiTexCoord2dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2dvARB", e); }
    }

    public void MultiTexCoord2fARB(@CType("GLenum") int target, @CType("GLfloat") float s, @CType("GLfloat") float t) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2fARB");
        try { Handles.MH_glMultiTexCoord2fARB.invokeExact(handles.PFN_glMultiTexCoord2fARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2fARB", e); }
    }

    public void MultiTexCoord2fvARB(@CType("GLenum") int target, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2fvARB");
        try { Handles.MH_glMultiTexCoord2fvARB.invokeExact(handles.PFN_glMultiTexCoord2fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2fvARB", e); }
    }

    public void MultiTexCoord2iARB(@CType("GLenum") int target, @CType("GLint") int s, @CType("GLint") int t) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2iARB");
        try { Handles.MH_glMultiTexCoord2iARB.invokeExact(handles.PFN_glMultiTexCoord2iARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2iARB", e); }
    }

    public void MultiTexCoord2ivARB(@CType("GLenum") int target, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2ivARB");
        try { Handles.MH_glMultiTexCoord2ivARB.invokeExact(handles.PFN_glMultiTexCoord2ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2ivARB", e); }
    }

    public void MultiTexCoord2sARB(@CType("GLenum") int target, @CType("GLshort") short s, @CType("GLshort") short t) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2sARB");
        try { Handles.MH_glMultiTexCoord2sARB.invokeExact(handles.PFN_glMultiTexCoord2sARB, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2sARB", e); }
    }

    public void MultiTexCoord2svARB(@CType("GLenum") int target, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2svARB");
        try { Handles.MH_glMultiTexCoord2svARB.invokeExact(handles.PFN_glMultiTexCoord2svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2svARB", e); }
    }

    public void MultiTexCoord3dARB(@CType("GLenum") int target, @CType("GLdouble") double s, @CType("GLdouble") double t, @CType("GLdouble") double r) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3dARB");
        try { Handles.MH_glMultiTexCoord3dARB.invokeExact(handles.PFN_glMultiTexCoord3dARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3dARB", e); }
    }

    public void MultiTexCoord3dvARB(@CType("GLenum") int target, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3dvARB");
        try { Handles.MH_glMultiTexCoord3dvARB.invokeExact(handles.PFN_glMultiTexCoord3dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3dvARB", e); }
    }

    public void MultiTexCoord3fARB(@CType("GLenum") int target, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3fARB");
        try { Handles.MH_glMultiTexCoord3fARB.invokeExact(handles.PFN_glMultiTexCoord3fARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3fARB", e); }
    }

    public void MultiTexCoord3fvARB(@CType("GLenum") int target, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3fvARB");
        try { Handles.MH_glMultiTexCoord3fvARB.invokeExact(handles.PFN_glMultiTexCoord3fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3fvARB", e); }
    }

    public void MultiTexCoord3iARB(@CType("GLenum") int target, @CType("GLint") int s, @CType("GLint") int t, @CType("GLint") int r) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3iARB");
        try { Handles.MH_glMultiTexCoord3iARB.invokeExact(handles.PFN_glMultiTexCoord3iARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3iARB", e); }
    }

    public void MultiTexCoord3ivARB(@CType("GLenum") int target, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3ivARB");
        try { Handles.MH_glMultiTexCoord3ivARB.invokeExact(handles.PFN_glMultiTexCoord3ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3ivARB", e); }
    }

    public void MultiTexCoord3sARB(@CType("GLenum") int target, @CType("GLshort") short s, @CType("GLshort") short t, @CType("GLshort") short r) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3sARB");
        try { Handles.MH_glMultiTexCoord3sARB.invokeExact(handles.PFN_glMultiTexCoord3sARB, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3sARB", e); }
    }

    public void MultiTexCoord3svARB(@CType("GLenum") int target, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3svARB");
        try { Handles.MH_glMultiTexCoord3svARB.invokeExact(handles.PFN_glMultiTexCoord3svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3svARB", e); }
    }

    public void MultiTexCoord4dARB(@CType("GLenum") int target, @CType("GLdouble") double s, @CType("GLdouble") double t, @CType("GLdouble") double r, @CType("GLdouble") double q) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4dARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4dARB");
        try { Handles.MH_glMultiTexCoord4dARB.invokeExact(handles.PFN_glMultiTexCoord4dARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4dARB", e); }
    }

    public void MultiTexCoord4dvARB(@CType("GLenum") int target, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4dvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4dvARB");
        try { Handles.MH_glMultiTexCoord4dvARB.invokeExact(handles.PFN_glMultiTexCoord4dvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4dvARB", e); }
    }

    public void MultiTexCoord4fARB(@CType("GLenum") int target, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float q) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4fARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4fARB");
        try { Handles.MH_glMultiTexCoord4fARB.invokeExact(handles.PFN_glMultiTexCoord4fARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4fARB", e); }
    }

    public void MultiTexCoord4fvARB(@CType("GLenum") int target, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4fvARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4fvARB");
        try { Handles.MH_glMultiTexCoord4fvARB.invokeExact(handles.PFN_glMultiTexCoord4fvARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4fvARB", e); }
    }

    public void MultiTexCoord4iARB(@CType("GLenum") int target, @CType("GLint") int s, @CType("GLint") int t, @CType("GLint") int r, @CType("GLint") int q) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4iARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4iARB");
        try { Handles.MH_glMultiTexCoord4iARB.invokeExact(handles.PFN_glMultiTexCoord4iARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4iARB", e); }
    }

    public void MultiTexCoord4ivARB(@CType("GLenum") int target, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4ivARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4ivARB");
        try { Handles.MH_glMultiTexCoord4ivARB.invokeExact(handles.PFN_glMultiTexCoord4ivARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4ivARB", e); }
    }

    public void MultiTexCoord4sARB(@CType("GLenum") int target, @CType("GLshort") short s, @CType("GLshort") short t, @CType("GLshort") short r, @CType("GLshort") short q) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4sARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4sARB");
        try { Handles.MH_glMultiTexCoord4sARB.invokeExact(handles.PFN_glMultiTexCoord4sARB, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4sARB", e); }
    }

    public void MultiTexCoord4svARB(@CType("GLenum") int target, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4svARB)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4svARB");
        try { Handles.MH_glMultiTexCoord4svARB.invokeExact(handles.PFN_glMultiTexCoord4svARB, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4svARB", e); }
    }

}
