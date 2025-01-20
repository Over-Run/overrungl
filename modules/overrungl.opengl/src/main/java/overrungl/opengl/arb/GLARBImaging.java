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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBlendColor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glBlendEquation = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColorTable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColorTableParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColorTableParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyColorTable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetColorTable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetColorTableParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetColorTableParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColorSubTable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyColorSubTable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glConvolutionFilter1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glConvolutionFilter2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glConvolutionParameterf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glConvolutionParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glConvolutionParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glConvolutionParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyConvolutionFilter1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyConvolutionFilter2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetConvolutionFilter = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetConvolutionParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetConvolutionParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSeparableFilter = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSeparableFilter2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogramParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogramParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmax = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmaxParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmaxParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glHistogram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glMinmax = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glResetHistogram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glResetMinmax = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glBlendColor = RuntimeHelper.downcall(Descriptors.FD_glBlendColor);
        public static final MethodHandle MH_glBlendEquation = RuntimeHelper.downcall(Descriptors.FD_glBlendEquation);
        public static final MethodHandle MH_glColorTable = RuntimeHelper.downcall(Descriptors.FD_glColorTable);
        public static final MethodHandle MH_glColorTableParameterfv = RuntimeHelper.downcall(Descriptors.FD_glColorTableParameterfv);
        public static final MethodHandle MH_glColorTableParameteriv = RuntimeHelper.downcall(Descriptors.FD_glColorTableParameteriv);
        public static final MethodHandle MH_glCopyColorTable = RuntimeHelper.downcall(Descriptors.FD_glCopyColorTable);
        public static final MethodHandle MH_glGetColorTable = RuntimeHelper.downcall(Descriptors.FD_glGetColorTable);
        public static final MethodHandle MH_glGetColorTableParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetColorTableParameterfv);
        public static final MethodHandle MH_glGetColorTableParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetColorTableParameteriv);
        public static final MethodHandle MH_glColorSubTable = RuntimeHelper.downcall(Descriptors.FD_glColorSubTable);
        public static final MethodHandle MH_glCopyColorSubTable = RuntimeHelper.downcall(Descriptors.FD_glCopyColorSubTable);
        public static final MethodHandle MH_glConvolutionFilter1D = RuntimeHelper.downcall(Descriptors.FD_glConvolutionFilter1D);
        public static final MethodHandle MH_glConvolutionFilter2D = RuntimeHelper.downcall(Descriptors.FD_glConvolutionFilter2D);
        public static final MethodHandle MH_glConvolutionParameterf = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameterf);
        public static final MethodHandle MH_glConvolutionParameterfv = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameterfv);
        public static final MethodHandle MH_glConvolutionParameteri = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameteri);
        public static final MethodHandle MH_glConvolutionParameteriv = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameteriv);
        public static final MethodHandle MH_glCopyConvolutionFilter1D = RuntimeHelper.downcall(Descriptors.FD_glCopyConvolutionFilter1D);
        public static final MethodHandle MH_glCopyConvolutionFilter2D = RuntimeHelper.downcall(Descriptors.FD_glCopyConvolutionFilter2D);
        public static final MethodHandle MH_glGetConvolutionFilter = RuntimeHelper.downcall(Descriptors.FD_glGetConvolutionFilter);
        public static final MethodHandle MH_glGetConvolutionParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetConvolutionParameterfv);
        public static final MethodHandle MH_glGetConvolutionParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetConvolutionParameteriv);
        public static final MethodHandle MH_glGetSeparableFilter = RuntimeHelper.downcall(Descriptors.FD_glGetSeparableFilter);
        public static final MethodHandle MH_glSeparableFilter2D = RuntimeHelper.downcall(Descriptors.FD_glSeparableFilter2D);
        public static final MethodHandle MH_glGetHistogram = RuntimeHelper.downcall(Descriptors.FD_glGetHistogram);
        public static final MethodHandle MH_glGetHistogramParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramParameterfv);
        public static final MethodHandle MH_glGetHistogramParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramParameteriv);
        public static final MethodHandle MH_glGetMinmax = RuntimeHelper.downcall(Descriptors.FD_glGetMinmax);
        public static final MethodHandle MH_glGetMinmaxParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetMinmaxParameterfv);
        public static final MethodHandle MH_glGetMinmaxParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetMinmaxParameteriv);
        public static final MethodHandle MH_glHistogram = RuntimeHelper.downcall(Descriptors.FD_glHistogram);
        public static final MethodHandle MH_glMinmax = RuntimeHelper.downcall(Descriptors.FD_glMinmax);
        public static final MethodHandle MH_glResetHistogram = RuntimeHelper.downcall(Descriptors.FD_glResetHistogram);
        public static final MethodHandle MH_glResetMinmax = RuntimeHelper.downcall(Descriptors.FD_glResetMinmax);
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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

    public GLARBImaging(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BlendColor(@CType("GLfloat") float red, @CType("GLfloat") float green, @CType("GLfloat") float blue, @CType("GLfloat") float alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendColor)) throw new SymbolNotFoundError("Symbol not found: glBlendColor");
        try { Handles.MH_glBlendColor.invokeExact(handles.PFN_glBlendColor, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendColor", e); }
    }

    public void BlendEquation(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendEquation)) throw new SymbolNotFoundError("Symbol not found: glBlendEquation");
        try { Handles.MH_glBlendEquation.invokeExact(handles.PFN_glBlendEquation, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquation", e); }
    }

    public void ColorTable(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment table) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorTable)) throw new SymbolNotFoundError("Symbol not found: glColorTable");
        try { Handles.MH_glColorTable.invokeExact(handles.PFN_glColorTable, target, internalformat, width, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in glColorTable", e); }
    }

    public void ColorTableParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorTableParameterfv)) throw new SymbolNotFoundError("Symbol not found: glColorTableParameterfv");
        try { Handles.MH_glColorTableParameterfv.invokeExact(handles.PFN_glColorTableParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glColorTableParameterfv", e); }
    }

    public void ColorTableParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorTableParameteriv)) throw new SymbolNotFoundError("Symbol not found: glColorTableParameteriv");
        try { Handles.MH_glColorTableParameteriv.invokeExact(handles.PFN_glColorTableParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glColorTableParameteriv", e); }
    }

    public void CopyColorTable(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyColorTable)) throw new SymbolNotFoundError("Symbol not found: glCopyColorTable");
        try { Handles.MH_glCopyColorTable.invokeExact(handles.PFN_glCopyColorTable, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyColorTable", e); }
    }

    public void GetColorTable(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment table) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetColorTable)) throw new SymbolNotFoundError("Symbol not found: glGetColorTable");
        try { Handles.MH_glGetColorTable.invokeExact(handles.PFN_glGetColorTable, target, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTable", e); }
    }

    public void GetColorTableParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetColorTableParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameterfv");
        try { Handles.MH_glGetColorTableParameterfv.invokeExact(handles.PFN_glGetColorTableParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameterfv", e); }
    }

    public void GetColorTableParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetColorTableParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameteriv");
        try { Handles.MH_glGetColorTableParameteriv.invokeExact(handles.PFN_glGetColorTableParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameteriv", e); }
    }

    public void ColorSubTable(@CType("GLenum") int target, @CType("GLsizei") int start, @CType("GLsizei") int count, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorSubTable)) throw new SymbolNotFoundError("Symbol not found: glColorSubTable");
        try { Handles.MH_glColorSubTable.invokeExact(handles.PFN_glColorSubTable, target, start, count, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glColorSubTable", e); }
    }

    public void CopyColorSubTable(@CType("GLenum") int target, @CType("GLsizei") int start, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyColorSubTable)) throw new SymbolNotFoundError("Symbol not found: glCopyColorSubTable");
        try { Handles.MH_glCopyColorSubTable.invokeExact(handles.PFN_glCopyColorSubTable, target, start, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyColorSubTable", e); }
    }

    public void ConvolutionFilter1D(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionFilter1D)) throw new SymbolNotFoundError("Symbol not found: glConvolutionFilter1D");
        try { Handles.MH_glConvolutionFilter1D.invokeExact(handles.PFN_glConvolutionFilter1D, target, internalformat, width, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionFilter1D", e); }
    }

    public void ConvolutionFilter2D(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionFilter2D)) throw new SymbolNotFoundError("Symbol not found: glConvolutionFilter2D");
        try { Handles.MH_glConvolutionFilter2D.invokeExact(handles.PFN_glConvolutionFilter2D, target, internalformat, width, height, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionFilter2D", e); }
    }

    public void ConvolutionParameterf(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterf)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterf");
        try { Handles.MH_glConvolutionParameterf.invokeExact(handles.PFN_glConvolutionParameterf, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterf", e); }
    }

    public void ConvolutionParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterfv)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterfv");
        try { Handles.MH_glConvolutionParameterfv.invokeExact(handles.PFN_glConvolutionParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterfv", e); }
    }

    public void ConvolutionParameteri(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameteri)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameteri");
        try { Handles.MH_glConvolutionParameteri.invokeExact(handles.PFN_glConvolutionParameteri, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameteri", e); }
    }

    public void ConvolutionParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameteriv)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameteriv");
        try { Handles.MH_glConvolutionParameteriv.invokeExact(handles.PFN_glConvolutionParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameteriv", e); }
    }

    public void CopyConvolutionFilter1D(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyConvolutionFilter1D)) throw new SymbolNotFoundError("Symbol not found: glCopyConvolutionFilter1D");
        try { Handles.MH_glCopyConvolutionFilter1D.invokeExact(handles.PFN_glCopyConvolutionFilter1D, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyConvolutionFilter1D", e); }
    }

    public void CopyConvolutionFilter2D(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyConvolutionFilter2D)) throw new SymbolNotFoundError("Symbol not found: glCopyConvolutionFilter2D");
        try { Handles.MH_glCopyConvolutionFilter2D.invokeExact(handles.PFN_glCopyConvolutionFilter2D, target, internalformat, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyConvolutionFilter2D", e); }
    }

    public void GetConvolutionFilter(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionFilter)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionFilter");
        try { Handles.MH_glGetConvolutionFilter.invokeExact(handles.PFN_glGetConvolutionFilter, target, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionFilter", e); }
    }

    public void GetConvolutionParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterfv");
        try { Handles.MH_glGetConvolutionParameterfv.invokeExact(handles.PFN_glGetConvolutionParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterfv", e); }
    }

    public void GetConvolutionParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameteriv");
        try { Handles.MH_glGetConvolutionParameteriv.invokeExact(handles.PFN_glGetConvolutionParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameteriv", e); }
    }

    public void GetSeparableFilter(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment row, @CType("void*") java.lang.foreign.MemorySegment column, @CType("void*") java.lang.foreign.MemorySegment span) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSeparableFilter)) throw new SymbolNotFoundError("Symbol not found: glGetSeparableFilter");
        try { Handles.MH_glGetSeparableFilter.invokeExact(handles.PFN_glGetSeparableFilter, target, format, type, row, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSeparableFilter", e); }
    }

    public void SeparableFilter2D(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment row, @CType("const void *") java.lang.foreign.MemorySegment column) {
        if (Unmarshal.isNullPointer(handles.PFN_glSeparableFilter2D)) throw new SymbolNotFoundError("Symbol not found: glSeparableFilter2D");
        try { Handles.MH_glSeparableFilter2D.invokeExact(handles.PFN_glSeparableFilter2D, target, internalformat, width, height, format, type, row, column); }
        catch (Throwable e) { throw new RuntimeException("error in glSeparableFilter2D", e); }
    }

    public void GetHistogram(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogram)) throw new SymbolNotFoundError("Symbol not found: glGetHistogram");
        try { Handles.MH_glGetHistogram.invokeExact(handles.PFN_glGetHistogram, target, reset, format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogram", e); }
    }

    public void GetHistogramParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterfv");
        try { Handles.MH_glGetHistogramParameterfv.invokeExact(handles.PFN_glGetHistogramParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterfv", e); }
    }

    public void GetHistogramParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameteriv");
        try { Handles.MH_glGetHistogramParameteriv.invokeExact(handles.PFN_glGetHistogramParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameteriv", e); }
    }

    public void GetMinmax(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmax)) throw new SymbolNotFoundError("Symbol not found: glGetMinmax");
        try { Handles.MH_glGetMinmax.invokeExact(handles.PFN_glGetMinmax, target, reset, format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmax", e); }
    }

    public void GetMinmaxParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmaxParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameterfv");
        try { Handles.MH_glGetMinmaxParameterfv.invokeExact(handles.PFN_glGetMinmaxParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmaxParameterfv", e); }
    }

    public void GetMinmaxParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmaxParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameteriv");
        try { Handles.MH_glGetMinmaxParameteriv.invokeExact(handles.PFN_glGetMinmaxParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmaxParameteriv", e); }
    }

    public void Histogram(@CType("GLenum") int target, @CType("GLsizei") int width, @CType("GLenum") int internalformat, @CType("GLboolean") boolean sink) {
        if (Unmarshal.isNullPointer(handles.PFN_glHistogram)) throw new SymbolNotFoundError("Symbol not found: glHistogram");
        try { Handles.MH_glHistogram.invokeExact(handles.PFN_glHistogram, target, width, internalformat, sink); }
        catch (Throwable e) { throw new RuntimeException("error in glHistogram", e); }
    }

    public void Minmax(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLboolean") boolean sink) {
        if (Unmarshal.isNullPointer(handles.PFN_glMinmax)) throw new SymbolNotFoundError("Symbol not found: glMinmax");
        try { Handles.MH_glMinmax.invokeExact(handles.PFN_glMinmax, target, internalformat, sink); }
        catch (Throwable e) { throw new RuntimeException("error in glMinmax", e); }
    }

    public void ResetHistogram(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glResetHistogram)) throw new SymbolNotFoundError("Symbol not found: glResetHistogram");
        try { Handles.MH_glResetHistogram.invokeExact(handles.PFN_glResetHistogram, target); }
        catch (Throwable e) { throw new RuntimeException("error in glResetHistogram", e); }
    }

    public void ResetMinmax(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glResetMinmax)) throw new SymbolNotFoundError("Symbol not found: glResetMinmax");
        try { Handles.MH_glResetMinmax.invokeExact(handles.PFN_glResetMinmax, target); }
        catch (Throwable e) { throw new RuntimeException("error in glResetMinmax", e); }
    }

}
