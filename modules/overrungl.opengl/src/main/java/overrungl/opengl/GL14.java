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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL14 extends GL13 permits GL15 {
    public static final int GL_BLEND_DST_RGB = 0x80C8;
    public static final int GL_BLEND_SRC_RGB = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
    public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
    public static final int GL_MIRRORED_REPEAT = 0x8370;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
    public static final int GL_INCR_WRAP = 0x8507;
    public static final int GL_DECR_WRAP = 0x8508;
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int GL_BLEND_COLOR = 0x8005;
    public static final int GL_BLEND_EQUATION = 0x8009;
    public static final int GL_CONSTANT_COLOR = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int GL_CONSTANT_ALPHA = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int GL_FUNC_ADD = 0x8006;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int GL_FUNC_SUBTRACT = 0x800A;
    public static final int GL_MIN = 0x8007;
    public static final int GL_MAX = 0x8008;
    public static final MethodHandle MH_glBlendFuncSeparate = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiDrawArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiDrawElements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPointParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glPointParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPointParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPointParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glBlendColor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glBlendEquation = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendFuncSeparate;
    public final MemorySegment PFN_glMultiDrawArrays;
    public final MemorySegment PFN_glMultiDrawElements;
    public final MemorySegment PFN_glPointParameterf;
    public final MemorySegment PFN_glPointParameterfv;
    public final MemorySegment PFN_glPointParameteri;
    public final MemorySegment PFN_glPointParameteriv;
    public final MemorySegment PFN_glBlendColor;
    public final MemorySegment PFN_glBlendEquation;

    public GL14(GLLoadFunc func) {
        super(func);
        PFN_glBlendFuncSeparate = func.invoke("glBlendFuncSeparate", "glBlendFuncSeparateEXT", "glBlendFuncSeparateINGR");
        PFN_glMultiDrawArrays = func.invoke("glMultiDrawArrays", "glMultiDrawArraysEXT");
        PFN_glMultiDrawElements = func.invoke("glMultiDrawElements", "glMultiDrawElementsEXT");
        PFN_glPointParameterf = func.invoke("glPointParameterf", "glPointParameterfARB", "glPointParameterfEXT", "glPointParameterfSGIS");
        PFN_glPointParameterfv = func.invoke("glPointParameterfv", "glPointParameterfvARB", "glPointParameterfvEXT", "glPointParameterfvSGIS");
        PFN_glPointParameteri = func.invoke("glPointParameteri", "glPointParameteriNV");
        PFN_glPointParameteriv = func.invoke("glPointParameteriv", "glPointParameterivNV");
        PFN_glBlendColor = func.invoke("glBlendColor", "glBlendColorEXT");
        PFN_glBlendEquation = func.invoke("glBlendEquation", "glBlendEquationEXT");
    }

    public void BlendFuncSeparate(@CType("GLenum") int sfactorRGB, @CType("GLenum") int dfactorRGB, @CType("GLenum") int sfactorAlpha, @CType("GLenum") int dfactorAlpha) {
        if (Unmarshal.isNullPointer(PFN_glBlendFuncSeparate)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparate");
        try { MH_glBlendFuncSeparate.invokeExact(PFN_glBlendFuncSeparate, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparate", e); }
    }

    public void MultiDrawArrays(@CType("GLenum") int mode, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int drawcount) {
        if (Unmarshal.isNullPointer(PFN_glMultiDrawArrays)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArrays");
        try { MH_glMultiDrawArrays.invokeExact(PFN_glMultiDrawArrays, mode, first, count, drawcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArrays", e); }
    }

    public void MultiDrawElements(@CType("GLenum") int mode, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int drawcount) {
        if (Unmarshal.isNullPointer(PFN_glMultiDrawElements)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElements");
        try { MH_glMultiDrawElements.invokeExact(PFN_glMultiDrawElements, mode, count, type, indices, drawcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElements", e); }
    }

    public void PointParameterf(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterf)) throw new SymbolNotFoundError("Symbol not found: glPointParameterf");
        try { MH_glPointParameterf.invokeExact(PFN_glPointParameterf, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterf", e); }
    }

    public void PointParameterfv(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterfv)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfv");
        try { MH_glPointParameterfv.invokeExact(PFN_glPointParameterfv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfv", e); }
    }

    public void PointParameteri(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glPointParameteri)) throw new SymbolNotFoundError("Symbol not found: glPointParameteri");
        try { MH_glPointParameteri.invokeExact(PFN_glPointParameteri, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameteri", e); }
    }

    public void PointParameteriv(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glPointParameteriv)) throw new SymbolNotFoundError("Symbol not found: glPointParameteriv");
        try { MH_glPointParameteriv.invokeExact(PFN_glPointParameteriv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameteriv", e); }
    }

    public void BlendColor(@CType("GLfloat") float red, @CType("GLfloat") float green, @CType("GLfloat") float blue, @CType("GLfloat") float alpha) {
        if (Unmarshal.isNullPointer(PFN_glBlendColor)) throw new SymbolNotFoundError("Symbol not found: glBlendColor");
        try { MH_glBlendColor.invokeExact(PFN_glBlendColor, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendColor", e); }
    }

    public void BlendEquation(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glBlendEquation)) throw new SymbolNotFoundError("Symbol not found: glBlendEquation");
        try { MH_glBlendEquation.invokeExact(PFN_glBlendEquation, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquation", e); }
    }

}
