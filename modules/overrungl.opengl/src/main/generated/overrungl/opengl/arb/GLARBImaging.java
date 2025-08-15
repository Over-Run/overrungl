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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_imaging`
public final class GLARBImaging {
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
    public static final int GL_CONVOLUTION_1D = 0x8010;
    public static final int GL_CONVOLUTION_2D = 0x8011;
    public static final int GL_SEPARABLE_2D = 0x8012;
    public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;
    public static final int GL_CONVOLUTION_FILTER_SCALE = 0x8014;
    public static final int GL_CONVOLUTION_FILTER_BIAS = 0x8015;
    public static final int GL_REDUCE = 0x8016;
    public static final int GL_CONVOLUTION_FORMAT = 0x8017;
    public static final int GL_CONVOLUTION_WIDTH = 0x8018;
    public static final int GL_CONVOLUTION_HEIGHT = 0x8019;
    public static final int GL_MAX_CONVOLUTION_WIDTH = 0x801A;
    public static final int GL_MAX_CONVOLUTION_HEIGHT = 0x801B;
    public static final int GL_POST_CONVOLUTION_RED_SCALE = 0x801C;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 0x801E;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F;
    public static final int GL_POST_CONVOLUTION_RED_BIAS = 0x8020;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 0x8021;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 0x8022;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 0x8023;
    public static final int GL_HISTOGRAM = 0x8024;
    public static final int GL_PROXY_HISTOGRAM = 0x8025;
    public static final int GL_HISTOGRAM_WIDTH = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C;
    public static final int GL_HISTOGRAM_SINK = 0x802D;
    public static final int GL_MINMAX = 0x802E;
    public static final int GL_MINMAX_FORMAT = 0x802F;
    public static final int GL_MINMAX_SINK = 0x8030;
    public static final int GL_TABLE_TOO_LARGE = 0x8031;
    public static final int GL_COLOR_MATRIX = 0x80B1;
    public static final int GL_COLOR_MATRIX_STACK_DEPTH = 0x80B2;
    public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;
    public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 0x80B4;
    public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5;
    public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 0x80B6;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7;
    public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 0x80B8;
    public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 0x80B9;
    public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 0x80BA;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 0x80BB;
    public static final int GL_COLOR_TABLE = 0x80D0;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 0x80D1;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;
    public static final int GL_PROXY_COLOR_TABLE = 0x80D3;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 0x80D4;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;
    public static final int GL_COLOR_TABLE_SCALE = 0x80D6;
    public static final int GL_COLOR_TABLE_BIAS = 0x80D7;
    public static final int GL_COLOR_TABLE_FORMAT = 0x80D8;
    public static final int GL_COLOR_TABLE_WIDTH = 0x80D9;
    public static final int GL_COLOR_TABLE_RED_SIZE = 0x80DA;
    public static final int GL_COLOR_TABLE_GREEN_SIZE = 0x80DB;
    public static final int GL_COLOR_TABLE_BLUE_SIZE = 0x80DC;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE = 0x80DD;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;
    public static final int GL_CONSTANT_BORDER = 0x8151;
    public static final int GL_REPLICATE_BORDER = 0x8153;
    public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendColor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glBlendEquation = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColorTable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorTableParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorTableParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyColorTable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetColorTable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorSubTable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyColorSubTable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glConvolutionFilter1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionFilter2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionParameterf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glConvolutionParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glConvolutionParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyConvolutionFilter1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyConvolutionFilter2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetConvolutionFilter = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetConvolutionParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetConvolutionParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSeparableFilter = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSeparableFilter2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogramParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogramParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmax = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmaxParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmaxParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glHistogram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMinmax = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glResetHistogram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glResetMinmax = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendColor;
        public final MemorySegment PFN_glBlendEquation;
        public final MemorySegment PFN_glColorTable;
        public final MemorySegment PFN_glColorTableParameterfv;
        public final MemorySegment PFN_glColorTableParameteriv;
        public final MemorySegment PFN_glCopyColorTable;
        public final MemorySegment PFN_glGetColorTable;
        public final MemorySegment PFN_glGetColorTableParameterfv;
        public final MemorySegment PFN_glGetColorTableParameteriv;
        public final MemorySegment PFN_glColorSubTable;
        public final MemorySegment PFN_glCopyColorSubTable;
        public final MemorySegment PFN_glConvolutionFilter1D;
        public final MemorySegment PFN_glConvolutionFilter2D;
        public final MemorySegment PFN_glConvolutionParameterf;
        public final MemorySegment PFN_glConvolutionParameterfv;
        public final MemorySegment PFN_glConvolutionParameteri;
        public final MemorySegment PFN_glConvolutionParameteriv;
        public final MemorySegment PFN_glCopyConvolutionFilter1D;
        public final MemorySegment PFN_glCopyConvolutionFilter2D;
        public final MemorySegment PFN_glGetConvolutionFilter;
        public final MemorySegment PFN_glGetConvolutionParameterfv;
        public final MemorySegment PFN_glGetConvolutionParameteriv;
        public final MemorySegment PFN_glGetSeparableFilter;
        public final MemorySegment PFN_glSeparableFilter2D;
        public final MemorySegment PFN_glGetHistogram;
        public final MemorySegment PFN_glGetHistogramParameterfv;
        public final MemorySegment PFN_glGetHistogramParameteriv;
        public final MemorySegment PFN_glGetMinmax;
        public final MemorySegment PFN_glGetMinmaxParameterfv;
        public final MemorySegment PFN_glGetMinmaxParameteriv;
        public final MemorySegment PFN_glHistogram;
        public final MemorySegment PFN_glMinmax;
        public final MemorySegment PFN_glResetHistogram;
        public final MemorySegment PFN_glResetMinmax;
        private Handles(GLLoadFunc func) {
            PFN_glBlendColor = func.invoke("glBlendColor");
            PFN_glBlendEquation = func.invoke("glBlendEquation");PFN_glColorTable = func.invoke("glColorTable");
            PFN_glColorTableParameterfv = func.invoke("glColorTableParameterfv");
            PFN_glColorTableParameteriv = func.invoke("glColorTableParameteriv");
            PFN_glCopyColorTable = func.invoke("glCopyColorTable");
            PFN_glGetColorTable = func.invoke("glGetColorTable");
            PFN_glGetColorTableParameterfv = func.invoke("glGetColorTableParameterfv");
            PFN_glGetColorTableParameteriv = func.invoke("glGetColorTableParameteriv");
            PFN_glColorSubTable = func.invoke("glColorSubTable");
            PFN_glCopyColorSubTable = func.invoke("glCopyColorSubTable");
            PFN_glConvolutionFilter1D = func.invoke("glConvolutionFilter1D");
            PFN_glConvolutionFilter2D = func.invoke("glConvolutionFilter2D");
            PFN_glConvolutionParameterf = func.invoke("glConvolutionParameterf");
            PFN_glConvolutionParameterfv = func.invoke("glConvolutionParameterfv");
            PFN_glConvolutionParameteri = func.invoke("glConvolutionParameteri");
            PFN_glConvolutionParameteriv = func.invoke("glConvolutionParameteriv");
            PFN_glCopyConvolutionFilter1D = func.invoke("glCopyConvolutionFilter1D");
            PFN_glCopyConvolutionFilter2D = func.invoke("glCopyConvolutionFilter2D");
            PFN_glGetConvolutionFilter = func.invoke("glGetConvolutionFilter");
            PFN_glGetConvolutionParameterfv = func.invoke("glGetConvolutionParameterfv");
            PFN_glGetConvolutionParameteriv = func.invoke("glGetConvolutionParameteriv");
            PFN_glGetSeparableFilter = func.invoke("glGetSeparableFilter");
            PFN_glSeparableFilter2D = func.invoke("glSeparableFilter2D");
            PFN_glGetHistogram = func.invoke("glGetHistogram");
            PFN_glGetHistogramParameterfv = func.invoke("glGetHistogramParameterfv");
            PFN_glGetHistogramParameteriv = func.invoke("glGetHistogramParameteriv");
            PFN_glGetMinmax = func.invoke("glGetMinmax");
            PFN_glGetMinmaxParameterfv = func.invoke("glGetMinmaxParameterfv");
            PFN_glGetMinmaxParameteriv = func.invoke("glGetMinmaxParameteriv");
            PFN_glHistogram = func.invoke("glHistogram");
            PFN_glMinmax = func.invoke("glMinmax");
            PFN_glResetHistogram = func.invoke("glResetHistogram");
            PFN_glResetMinmax = func.invoke("glResetMinmax");
        }
    }

    public GLARBImaging(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendColor`.
    /// ```
    /// void glBlendColor(((float) khronos_float_t) GLfloat red, ((float) khronos_float_t) GLfloat green, ((float) khronos_float_t) GLfloat blue, ((float) khronos_float_t) GLfloat alpha);
    /// ```
    public void BlendColor(float red, float green, float blue, float alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColor)) throw new GLSymbolNotFoundError("Symbol not found: glBlendColor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendColor", red, green, blue, alpha); }
        Handles.MH_glBlendColor.invokeExact(handles.PFN_glBlendColor, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColor", e); }
    }

    /// Invokes `glBlendEquation`.
    /// ```
    /// void glBlendEquation((unsigned int) GLenum mode);
    /// ```
    public void BlendEquation(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquation)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquation", mode); }
        Handles.MH_glBlendEquation.invokeExact(handles.PFN_glBlendEquation, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquation", e); }
    }

    /// Invokes `glColorTable`.
    /// ```
    /// void glColorTable((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* table);
    /// ```
    public void ColorTable(int target, int internalformat, int width, int format, int type, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTable)) throw new GLSymbolNotFoundError("Symbol not found: glColorTable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTable", target, internalformat, width, format, type, table); }
        Handles.MH_glColorTable.invokeExact(handles.PFN_glColorTable, target, internalformat, width, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTable", e); }
    }

    /// Invokes `glColorTableParameterfv`.
    /// ```
    /// void glColorTableParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ColorTableParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableParameterfv", target, pname, params); }
        Handles.MH_glColorTableParameterfv.invokeExact(handles.PFN_glColorTableParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableParameterfv", e); }
    }

    /// Invokes `glColorTableParameteriv`.
    /// ```
    /// void glColorTableParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ColorTableParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableParameteriv", target, pname, params); }
        Handles.MH_glColorTableParameteriv.invokeExact(handles.PFN_glColorTableParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableParameteriv", e); }
    }

    /// Invokes `glCopyColorTable`.
    /// ```
    /// void glCopyColorTable((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyColorTable(int target, int internalformat, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyColorTable)) throw new GLSymbolNotFoundError("Symbol not found: glCopyColorTable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyColorTable", target, internalformat, x, y, width); }
        Handles.MH_glCopyColorTable.invokeExact(handles.PFN_glCopyColorTable, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyColorTable", e); }
    }

    /// Invokes `glGetColorTable`.
    /// ```
    /// void glGetColorTable((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, void* table);
    /// ```
    public void GetColorTable(int target, int format, int type, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTable)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTable", target, format, type, table); }
        Handles.MH_glGetColorTable.invokeExact(handles.PFN_glGetColorTable, target, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTable", e); }
    }

    /// Invokes `glGetColorTableParameterfv`.
    /// ```
    /// void glGetColorTableParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetColorTableParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameterfv", target, pname, params); }
        Handles.MH_glGetColorTableParameterfv.invokeExact(handles.PFN_glGetColorTableParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterfv", e); }
    }

    /// Invokes `glGetColorTableParameteriv`.
    /// ```
    /// void glGetColorTableParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetColorTableParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameteriv", target, pname, params); }
        Handles.MH_glGetColorTableParameteriv.invokeExact(handles.PFN_glGetColorTableParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameteriv", e); }
    }

    /// Invokes `glColorSubTable`.
    /// ```
    /// void glColorSubTable((unsigned int) GLenum target, (int) GLsizei start, (int) GLsizei count, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ColorSubTable(int target, int start, int count, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorSubTable)) throw new GLSymbolNotFoundError("Symbol not found: glColorSubTable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorSubTable", target, start, count, format, type, data); }
        Handles.MH_glColorSubTable.invokeExact(handles.PFN_glColorSubTable, target, start, count, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ColorSubTable", e); }
    }

    /// Invokes `glCopyColorSubTable`.
    /// ```
    /// void glCopyColorSubTable((unsigned int) GLenum target, (int) GLsizei start, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyColorSubTable(int target, int start, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyColorSubTable)) throw new GLSymbolNotFoundError("Symbol not found: glCopyColorSubTable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyColorSubTable", target, start, x, y, width); }
        Handles.MH_glCopyColorSubTable.invokeExact(handles.PFN_glCopyColorSubTable, target, start, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyColorSubTable", e); }
    }

    /// Invokes `glConvolutionFilter1D`.
    /// ```
    /// void glConvolutionFilter1D((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* image);
    /// ```
    public void ConvolutionFilter1D(int target, int internalformat, int width, int format, int type, @NonNull MemorySegment image) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionFilter1D)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionFilter1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionFilter1D", target, internalformat, width, format, type, image); }
        Handles.MH_glConvolutionFilter1D.invokeExact(handles.PFN_glConvolutionFilter1D, target, internalformat, width, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionFilter1D", e); }
    }

    /// Invokes `glConvolutionFilter2D`.
    /// ```
    /// void glConvolutionFilter2D((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* image);
    /// ```
    public void ConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, @NonNull MemorySegment image) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionFilter2D)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionFilter2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionFilter2D", target, internalformat, width, height, format, type, image); }
        Handles.MH_glConvolutionFilter2D.invokeExact(handles.PFN_glConvolutionFilter2D, target, internalformat, width, height, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionFilter2D", e); }
    }

    /// Invokes `glConvolutionParameterf`.
    /// ```
    /// void glConvolutionParameterf((unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat params);
    /// ```
    public void ConvolutionParameterf(int target, int pname, float params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterf)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameterf", target, pname, params); }
        Handles.MH_glConvolutionParameterf.invokeExact(handles.PFN_glConvolutionParameterf, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterf", e); }
    }

    /// Invokes `glConvolutionParameterfv`.
    /// ```
    /// void glConvolutionParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ConvolutionParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameterfv", target, pname, params); }
        Handles.MH_glConvolutionParameterfv.invokeExact(handles.PFN_glConvolutionParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterfv", e); }
    }

    /// Invokes `glConvolutionParameteri`.
    /// ```
    /// void glConvolutionParameteri((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint params);
    /// ```
    public void ConvolutionParameteri(int target, int pname, int params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameteri", target, pname, params); }
        Handles.MH_glConvolutionParameteri.invokeExact(handles.PFN_glConvolutionParameteri, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameteri", e); }
    }

    /// Invokes `glConvolutionParameteriv`.
    /// ```
    /// void glConvolutionParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ConvolutionParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameteriv", target, pname, params); }
        Handles.MH_glConvolutionParameteriv.invokeExact(handles.PFN_glConvolutionParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameteriv", e); }
    }

    /// Invokes `glCopyConvolutionFilter1D`.
    /// ```
    /// void glCopyConvolutionFilter1D((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyConvolutionFilter1D)) throw new GLSymbolNotFoundError("Symbol not found: glCopyConvolutionFilter1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyConvolutionFilter1D", target, internalformat, x, y, width); }
        Handles.MH_glCopyConvolutionFilter1D.invokeExact(handles.PFN_glCopyConvolutionFilter1D, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyConvolutionFilter1D", e); }
    }

    /// Invokes `glCopyConvolutionFilter2D`.
    /// ```
    /// void glCopyConvolutionFilter2D((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyConvolutionFilter2D)) throw new GLSymbolNotFoundError("Symbol not found: glCopyConvolutionFilter2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyConvolutionFilter2D", target, internalformat, x, y, width, height); }
        Handles.MH_glCopyConvolutionFilter2D.invokeExact(handles.PFN_glCopyConvolutionFilter2D, target, internalformat, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyConvolutionFilter2D", e); }
    }

    /// Invokes `glGetConvolutionFilter`.
    /// ```
    /// void glGetConvolutionFilter((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, void* image);
    /// ```
    public void GetConvolutionFilter(int target, int format, int type, @NonNull MemorySegment image) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetConvolutionFilter)) throw new GLSymbolNotFoundError("Symbol not found: glGetConvolutionFilter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetConvolutionFilter", target, format, type, image); }
        Handles.MH_glGetConvolutionFilter.invokeExact(handles.PFN_glGetConvolutionFilter, target, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in GetConvolutionFilter", e); }
    }

    /// Invokes `glGetConvolutionParameterfv`.
    /// ```
    /// void glGetConvolutionParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetConvolutionParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetConvolutionParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetConvolutionParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetConvolutionParameterfv", target, pname, params); }
        Handles.MH_glGetConvolutionParameterfv.invokeExact(handles.PFN_glGetConvolutionParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetConvolutionParameterfv", e); }
    }

    /// Invokes `glGetConvolutionParameteriv`.
    /// ```
    /// void glGetConvolutionParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetConvolutionParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetConvolutionParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetConvolutionParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetConvolutionParameteriv", target, pname, params); }
        Handles.MH_glGetConvolutionParameteriv.invokeExact(handles.PFN_glGetConvolutionParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetConvolutionParameteriv", e); }
    }

    /// Invokes `glGetSeparableFilter`.
    /// ```
    /// void glGetSeparableFilter((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, void* row, void* column, void* span);
    /// ```
    public void GetSeparableFilter(int target, int format, int type, @NonNull MemorySegment row, @NonNull MemorySegment column, @NonNull MemorySegment span) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSeparableFilter)) throw new GLSymbolNotFoundError("Symbol not found: glGetSeparableFilter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSeparableFilter", target, format, type, row, column, span); }
        Handles.MH_glGetSeparableFilter.invokeExact(handles.PFN_glGetSeparableFilter, target, format, type, row, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in GetSeparableFilter", e); }
    }

    /// Invokes `glSeparableFilter2D`.
    /// ```
    /// void glSeparableFilter2D((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* row, const void* column);
    /// ```
    public void SeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, @NonNull MemorySegment row, @NonNull MemorySegment column) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSeparableFilter2D)) throw new GLSymbolNotFoundError("Symbol not found: glSeparableFilter2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSeparableFilter2D", target, internalformat, width, height, format, type, row, column); }
        Handles.MH_glSeparableFilter2D.invokeExact(handles.PFN_glSeparableFilter2D, target, internalformat, width, height, format, type, row, column); }
        catch (Throwable e) { throw new RuntimeException("error in SeparableFilter2D", e); }
    }

    /// Invokes `glGetHistogram`.
    /// ```
    /// void glGetHistogram((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, void* values);
    /// ```
    public void GetHistogram(int target, boolean reset, int format, int type, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogram)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogram", target, reset, format, type, values); }
        Handles.MH_glGetHistogram.invokeExact(handles.PFN_glGetHistogram, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogram", e); }
    }

    /// Invokes `glGetHistogramParameterfv`.
    /// ```
    /// void glGetHistogramParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetHistogramParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramParameterfv", target, pname, params); }
        Handles.MH_glGetHistogramParameterfv.invokeExact(handles.PFN_glGetHistogramParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterfv", e); }
    }

    /// Invokes `glGetHistogramParameteriv`.
    /// ```
    /// void glGetHistogramParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetHistogramParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramParameteriv", target, pname, params); }
        Handles.MH_glGetHistogramParameteriv.invokeExact(handles.PFN_glGetHistogramParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameteriv", e); }
    }

    /// Invokes `glGetMinmax`.
    /// ```
    /// void glGetMinmax((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, void* values);
    /// ```
    public void GetMinmax(int target, boolean reset, int format, int type, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmax)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmax");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmax", target, reset, format, type, values); }
        Handles.MH_glGetMinmax.invokeExact(handles.PFN_glGetMinmax, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmax", e); }
    }

    /// Invokes `glGetMinmaxParameterfv`.
    /// ```
    /// void glGetMinmaxParameterfv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMinmaxParameterfv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmaxParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmaxParameterfv", target, pname, params); }
        Handles.MH_glGetMinmaxParameterfv.invokeExact(handles.PFN_glGetMinmaxParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameterfv", e); }
    }

    /// Invokes `glGetMinmaxParameteriv`.
    /// ```
    /// void glGetMinmaxParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMinmaxParameteriv(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmaxParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmaxParameteriv", target, pname, params); }
        Handles.MH_glGetMinmaxParameteriv.invokeExact(handles.PFN_glGetMinmaxParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameteriv", e); }
    }

    /// Invokes `glHistogram`.
    /// ```
    /// void glHistogram((unsigned int) GLenum target, (int) GLsizei width, (unsigned int) GLenum internalformat, GLboolean sink);
    /// ```
    public void Histogram(int target, int width, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glHistogram)) throw new GLSymbolNotFoundError("Symbol not found: glHistogram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glHistogram", target, width, internalformat, sink); }
        Handles.MH_glHistogram.invokeExact(handles.PFN_glHistogram, target, width, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in Histogram", e); }
    }

    /// Invokes `glMinmax`.
    /// ```
    /// void glMinmax((unsigned int) GLenum target, (unsigned int) GLenum internalformat, GLboolean sink);
    /// ```
    public void Minmax(int target, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinmax)) throw new GLSymbolNotFoundError("Symbol not found: glMinmax");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMinmax", target, internalformat, sink); }
        Handles.MH_glMinmax.invokeExact(handles.PFN_glMinmax, target, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in Minmax", e); }
    }

    /// Invokes `glResetHistogram`.
    /// ```
    /// void glResetHistogram((unsigned int) GLenum target);
    /// ```
    public void ResetHistogram(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetHistogram)) throw new GLSymbolNotFoundError("Symbol not found: glResetHistogram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResetHistogram", target); }
        Handles.MH_glResetHistogram.invokeExact(handles.PFN_glResetHistogram, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetHistogram", e); }
    }

    /// Invokes `glResetMinmax`.
    /// ```
    /// void glResetMinmax((unsigned int) GLenum target);
    /// ```
    public void ResetMinmax(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetMinmax)) throw new GLSymbolNotFoundError("Symbol not found: glResetMinmax");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResetMinmax", target); }
        Handles.MH_glResetMinmax.invokeExact(handles.PFN_glResetMinmax, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetMinmax", e); }
    }

}
