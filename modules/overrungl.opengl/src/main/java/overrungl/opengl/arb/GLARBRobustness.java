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

public final class GLARBRobustness {
    public static final int GL_NO_ERROR = 0;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetGraphicsResetStatusARB = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetnTexImageARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReadnPixelsARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnCompressedTexImageARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformuivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformdvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnMapdvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnMapfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnMapivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnPixelMapfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnPixelMapuivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnPixelMapusvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnPolygonStippleARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnColorTableARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnConvolutionFilterARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnSeparableFilterARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnHistogramARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnMinmaxARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetGraphicsResetStatusARB,
            FD_glGetnTexImageARB,
            FD_glReadnPixelsARB,
            FD_glGetnCompressedTexImageARB,
            FD_glGetnUniformfvARB,
            FD_glGetnUniformivARB,
            FD_glGetnUniformuivARB,
            FD_glGetnUniformdvARB,
            FD_glGetnMapdvARB,
            FD_glGetnMapfvARB,
            FD_glGetnMapivARB,
            FD_glGetnPixelMapfvARB,
            FD_glGetnPixelMapuivARB,
            FD_glGetnPixelMapusvARB,
            FD_glGetnPolygonStippleARB,
            FD_glGetnColorTableARB,
            FD_glGetnConvolutionFilterARB,
            FD_glGetnSeparableFilterARB,
            FD_glGetnHistogramARB,
            FD_glGetnMinmaxARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetGraphicsResetStatusARB = RuntimeHelper.downcall(Descriptors.FD_glGetGraphicsResetStatusARB);
        public static final MethodHandle MH_glGetnTexImageARB = RuntimeHelper.downcall(Descriptors.FD_glGetnTexImageARB);
        public static final MethodHandle MH_glReadnPixelsARB = RuntimeHelper.downcall(Descriptors.FD_glReadnPixelsARB);
        public static final MethodHandle MH_glGetnCompressedTexImageARB = RuntimeHelper.downcall(Descriptors.FD_glGetnCompressedTexImageARB);
        public static final MethodHandle MH_glGetnUniformfvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformfvARB);
        public static final MethodHandle MH_glGetnUniformivARB = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformivARB);
        public static final MethodHandle MH_glGetnUniformuivARB = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformuivARB);
        public static final MethodHandle MH_glGetnUniformdvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformdvARB);
        public static final MethodHandle MH_glGetnMapdvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnMapdvARB);
        public static final MethodHandle MH_glGetnMapfvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnMapfvARB);
        public static final MethodHandle MH_glGetnMapivARB = RuntimeHelper.downcall(Descriptors.FD_glGetnMapivARB);
        public static final MethodHandle MH_glGetnPixelMapfvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnPixelMapfvARB);
        public static final MethodHandle MH_glGetnPixelMapuivARB = RuntimeHelper.downcall(Descriptors.FD_glGetnPixelMapuivARB);
        public static final MethodHandle MH_glGetnPixelMapusvARB = RuntimeHelper.downcall(Descriptors.FD_glGetnPixelMapusvARB);
        public static final MethodHandle MH_glGetnPolygonStippleARB = RuntimeHelper.downcall(Descriptors.FD_glGetnPolygonStippleARB);
        public static final MethodHandle MH_glGetnColorTableARB = RuntimeHelper.downcall(Descriptors.FD_glGetnColorTableARB);
        public static final MethodHandle MH_glGetnConvolutionFilterARB = RuntimeHelper.downcall(Descriptors.FD_glGetnConvolutionFilterARB);
        public static final MethodHandle MH_glGetnSeparableFilterARB = RuntimeHelper.downcall(Descriptors.FD_glGetnSeparableFilterARB);
        public static final MethodHandle MH_glGetnHistogramARB = RuntimeHelper.downcall(Descriptors.FD_glGetnHistogramARB);
        public static final MethodHandle MH_glGetnMinmaxARB = RuntimeHelper.downcall(Descriptors.FD_glGetnMinmaxARB);
        public final MemorySegment PFN_glGetGraphicsResetStatusARB;
        public final MemorySegment PFN_glGetnTexImageARB;
        public final MemorySegment PFN_glReadnPixelsARB;
        public final MemorySegment PFN_glGetnCompressedTexImageARB;
        public final MemorySegment PFN_glGetnUniformfvARB;
        public final MemorySegment PFN_glGetnUniformivARB;
        public final MemorySegment PFN_glGetnUniformuivARB;
        public final MemorySegment PFN_glGetnUniformdvARB;
        public final MemorySegment PFN_glGetnMapdvARB;
        public final MemorySegment PFN_glGetnMapfvARB;
        public final MemorySegment PFN_glGetnMapivARB;
        public final MemorySegment PFN_glGetnPixelMapfvARB;
        public final MemorySegment PFN_glGetnPixelMapuivARB;
        public final MemorySegment PFN_glGetnPixelMapusvARB;
        public final MemorySegment PFN_glGetnPolygonStippleARB;
        public final MemorySegment PFN_glGetnColorTableARB;
        public final MemorySegment PFN_glGetnConvolutionFilterARB;
        public final MemorySegment PFN_glGetnSeparableFilterARB;
        public final MemorySegment PFN_glGetnHistogramARB;
        public final MemorySegment PFN_glGetnMinmaxARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetGraphicsResetStatusARB = func.invoke("glGetGraphicsResetStatusARB");
            PFN_glGetnTexImageARB = func.invoke("glGetnTexImageARB");
            PFN_glReadnPixelsARB = func.invoke("glReadnPixelsARB", "glReadnPixels");
            PFN_glGetnCompressedTexImageARB = func.invoke("glGetnCompressedTexImageARB");
            PFN_glGetnUniformfvARB = func.invoke("glGetnUniformfvARB");
            PFN_glGetnUniformivARB = func.invoke("glGetnUniformivARB");
            PFN_glGetnUniformuivARB = func.invoke("glGetnUniformuivARB");
            PFN_glGetnUniformdvARB = func.invoke("glGetnUniformdvARB");PFN_glGetnMapdvARB = func.invoke("glGetnMapdvARB");
            PFN_glGetnMapfvARB = func.invoke("glGetnMapfvARB");
            PFN_glGetnMapivARB = func.invoke("glGetnMapivARB");
            PFN_glGetnPixelMapfvARB = func.invoke("glGetnPixelMapfvARB");
            PFN_glGetnPixelMapuivARB = func.invoke("glGetnPixelMapuivARB");
            PFN_glGetnPixelMapusvARB = func.invoke("glGetnPixelMapusvARB");
            PFN_glGetnPolygonStippleARB = func.invoke("glGetnPolygonStippleARB");
            PFN_glGetnColorTableARB = func.invoke("glGetnColorTableARB");
            PFN_glGetnConvolutionFilterARB = func.invoke("glGetnConvolutionFilterARB");
            PFN_glGetnSeparableFilterARB = func.invoke("glGetnSeparableFilterARB");
            PFN_glGetnHistogramARB = func.invoke("glGetnHistogramARB");
            PFN_glGetnMinmaxARB = func.invoke("glGetnMinmaxARB");
        }
    }

    public GLARBRobustness(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLenum") int GetGraphicsResetStatusARB() {
        if (Unmarshal.isNullPointer(handles.PFN_glGetGraphicsResetStatusARB)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusARB");
        try { return (int) Handles.MH_glGetGraphicsResetStatusARB.invokeExact(handles.PFN_glGetGraphicsResetStatusARB); }
        catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatusARB", e); }
    }

    public void GetnTexImageARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnTexImageARB");
        try { Handles.MH_glGetnTexImageARB.invokeExact(handles.PFN_glGetnTexImageARB, target, level, format, type, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnTexImageARB", e); }
    }

    public void ReadnPixelsARB(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glReadnPixelsARB)) throw new SymbolNotFoundError("Symbol not found: glReadnPixelsARB");
        try { Handles.MH_glReadnPixelsARB.invokeExact(handles.PFN_glReadnPixelsARB, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glReadnPixelsARB", e); }
    }

    public void GetnCompressedTexImageARB(@CType("GLenum") int target, @CType("GLint") int lod, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnCompressedTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnCompressedTexImageARB");
        try { Handles.MH_glGetnCompressedTexImageARB.invokeExact(handles.PFN_glGetnCompressedTexImageARB, target, lod, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnCompressedTexImageARB", e); }
    }

    public void GetnUniformfvARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfvARB");
        try { Handles.MH_glGetnUniformfvARB.invokeExact(handles.PFN_glGetnUniformfvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfvARB", e); }
    }

    public void GetnUniformivARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformivARB");
        try { Handles.MH_glGetnUniformivARB.invokeExact(handles.PFN_glGetnUniformivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformivARB", e); }
    }

    public void GetnUniformuivARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuivARB");
        try { Handles.MH_glGetnUniformuivARB.invokeExact(handles.PFN_glGetnUniformuivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuivARB", e); }
    }

    public void GetnUniformdvARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformdvARB");
        try { Handles.MH_glGetnUniformdvARB.invokeExact(handles.PFN_glGetnUniformdvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformdvARB", e); }
    }

    public void GetnMapdvARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnMapdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapdvARB");
        try { Handles.MH_glGetnMapdvARB.invokeExact(handles.PFN_glGetnMapdvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapdvARB", e); }
    }

    public void GetnMapfvARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapfvARB");
        try { Handles.MH_glGetnMapfvARB.invokeExact(handles.PFN_glGetnMapfvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapfvARB", e); }
    }

    public void GetnMapivARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnMapivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapivARB");
        try { Handles.MH_glGetnMapivARB.invokeExact(handles.PFN_glGetnMapivARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapivARB", e); }
    }

    public void GetnPixelMapfvARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnPixelMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapfvARB");
        try { Handles.MH_glGetnPixelMapfvARB.invokeExact(handles.PFN_glGetnPixelMapfvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapfvARB", e); }
    }

    public void GetnPixelMapuivARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnPixelMapuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapuivARB");
        try { Handles.MH_glGetnPixelMapuivARB.invokeExact(handles.PFN_glGetnPixelMapuivARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapuivARB", e); }
    }

    public void GetnPixelMapusvARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLushort *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnPixelMapusvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapusvARB");
        try { Handles.MH_glGetnPixelMapusvARB.invokeExact(handles.PFN_glGetnPixelMapusvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapusvARB", e); }
    }

    public void GetnPolygonStippleARB(@CType("GLsizei") int bufSize, @CType("GLubyte *") java.lang.foreign.MemorySegment pattern) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnPolygonStippleARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPolygonStippleARB");
        try { Handles.MH_glGetnPolygonStippleARB.invokeExact(handles.PFN_glGetnPolygonStippleARB, bufSize, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPolygonStippleARB", e); }
    }

    public void GetnColorTableARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment table) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnColorTableARB)) throw new SymbolNotFoundError("Symbol not found: glGetnColorTableARB");
        try { Handles.MH_glGetnColorTableARB.invokeExact(handles.PFN_glGetnColorTableARB, target, format, type, bufSize, table); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnColorTableARB", e); }
    }

    public void GetnConvolutionFilterARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnConvolutionFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnConvolutionFilterARB");
        try { Handles.MH_glGetnConvolutionFilterARB.invokeExact(handles.PFN_glGetnConvolutionFilterARB, target, format, type, bufSize, image); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnConvolutionFilterARB", e); }
    }

    public void GetnSeparableFilterARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int rowBufSize, @CType("void*") java.lang.foreign.MemorySegment row, @CType("GLsizei") int columnBufSize, @CType("void*") java.lang.foreign.MemorySegment column, @CType("void*") java.lang.foreign.MemorySegment span) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnSeparableFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnSeparableFilterARB");
        try { Handles.MH_glGetnSeparableFilterARB.invokeExact(handles.PFN_glGetnSeparableFilterARB, target, format, type, rowBufSize, row, columnBufSize, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnSeparableFilterARB", e); }
    }

    public void GetnHistogramARB(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnHistogramARB)) throw new SymbolNotFoundError("Symbol not found: glGetnHistogramARB");
        try { Handles.MH_glGetnHistogramARB.invokeExact(handles.PFN_glGetnHistogramARB, target, reset, format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnHistogramARB", e); }
    }

    public void GetnMinmaxARB(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnMinmaxARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMinmaxARB");
        try { Handles.MH_glGetnMinmaxARB.invokeExact(handles.PFN_glGetnMinmaxARB, target, reset, format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMinmaxARB", e); }
    }

}
