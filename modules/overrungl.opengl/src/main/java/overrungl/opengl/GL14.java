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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL14 extends GL13 {
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
    private final Handles handles;
    public static final class Handles {
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
        private Handles(GLLoadFunc func) {
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
    }

    public GL14(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBlendFuncSeparate(unsigned int sfactorRGB, unsigned int dfactorRGB, unsigned int sfactorAlpha, unsigned int dfactorAlpha);
    /// ```
    public void BlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparate)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparate");
        try { Handles.MH_glBlendFuncSeparate.invokeExact(handles.PFN_glBlendFuncSeparate, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparate", e); }
    }

    /// ```
    /// void glMultiDrawArrays(unsigned int mode, const GLint* first, const GLsizei* count, int drawcount);
    /// ```
    public void MultiDrawArrays(int mode, MemorySegment first, MemorySegment count, int drawcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArrays)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArrays");
        try { Handles.MH_glMultiDrawArrays.invokeExact(handles.PFN_glMultiDrawArrays, mode, first, count, drawcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArrays", e); }
    }

    /// ```
    /// void glMultiDrawElements(unsigned int mode, const GLsizei* count, unsigned int type, const void* const * indices, int drawcount);
    /// ```
    public void MultiDrawElements(int mode, MemorySegment count, int type, MemorySegment indices, int drawcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElements)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElements");
        try { Handles.MH_glMultiDrawElements.invokeExact(handles.PFN_glMultiDrawElements, mode, count, type, indices, drawcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElements", e); }
    }

    /// ```
    /// void glPointParameterf(unsigned int pname, float param);
    /// ```
    public void PointParameterf(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterf)) throw new SymbolNotFoundError("Symbol not found: glPointParameterf");
        try { Handles.MH_glPointParameterf.invokeExact(handles.PFN_glPointParameterf, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterf", e); }
    }

    /// ```
    /// void glPointParameterfv(unsigned int pname, const GLfloat* params);
    /// ```
    public void PointParameterfv(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfv)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfv");
        try { Handles.MH_glPointParameterfv.invokeExact(handles.PFN_glPointParameterfv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfv", e); }
    }

    /// ```
    /// void glPointParameteri(unsigned int pname, int param);
    /// ```
    public void PointParameteri(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameteri)) throw new SymbolNotFoundError("Symbol not found: glPointParameteri");
        try { Handles.MH_glPointParameteri.invokeExact(handles.PFN_glPointParameteri, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameteri", e); }
    }

    /// ```
    /// void glPointParameteriv(unsigned int pname, const GLint* params);
    /// ```
    public void PointParameteriv(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameteriv)) throw new SymbolNotFoundError("Symbol not found: glPointParameteriv");
        try { Handles.MH_glPointParameteriv.invokeExact(handles.PFN_glPointParameteriv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameteriv", e); }
    }

    /// ```
    /// void glBlendColor(float red, float green, float blue, float alpha);
    /// ```
    public void BlendColor(float red, float green, float blue, float alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColor)) throw new SymbolNotFoundError("Symbol not found: glBlendColor");
        try { Handles.MH_glBlendColor.invokeExact(handles.PFN_glBlendColor, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColor", e); }
    }

    /// ```
    /// void glBlendEquation(unsigned int mode);
    /// ```
    public void BlendEquation(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquation)) throw new SymbolNotFoundError("Symbol not found: glBlendEquation");
        try { Handles.MH_glBlendEquation.invokeExact(handles.PFN_glBlendEquation, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquation", e); }
    }

}
