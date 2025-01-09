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

public final class GLARBRobustness {
    public static final int GL_NO_ERROR = 0;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final MethodHandle MH_glGetGraphicsResetStatusARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetnTexImageARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glReadnPixelsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnCompressedTexImageARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnUniformfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnUniformivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnUniformuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnUniformdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnMapdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnMapfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnMapivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnPixelMapfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnPixelMapuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnPixelMapusvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnPolygonStippleARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnColorTableARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnConvolutionFilterARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnSeparableFilterARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnHistogramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetnMinmaxARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    public GLARBRobustness(overrungl.opengl.GLLoadFunc func) {
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

    public @CType("GLenum") int GetGraphicsResetStatusARB() {
        if (Unmarshal.isNullPointer(PFN_glGetGraphicsResetStatusARB)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusARB");
        try { return (int) MH_glGetGraphicsResetStatusARB.invokeExact(PFN_glGetGraphicsResetStatusARB); }
        catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatusARB", e); }
    }

    public void GetnTexImageARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(PFN_glGetnTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnTexImageARB");
        try { MH_glGetnTexImageARB.invokeExact(PFN_glGetnTexImageARB, target, level, format, type, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnTexImageARB", e); }
    }

    public void ReadnPixelsARB(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(PFN_glReadnPixelsARB)) throw new SymbolNotFoundError("Symbol not found: glReadnPixelsARB");
        try { MH_glReadnPixelsARB.invokeExact(PFN_glReadnPixelsARB, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glReadnPixelsARB", e); }
    }

    public void GetnCompressedTexImageARB(@CType("GLenum") int target, @CType("GLint") int lod, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(PFN_glGetnCompressedTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnCompressedTexImageARB");
        try { MH_glGetnCompressedTexImageARB.invokeExact(PFN_glGetnCompressedTexImageARB, target, lod, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnCompressedTexImageARB", e); }
    }

    public void GetnUniformfvARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetnUniformfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfvARB");
        try { MH_glGetnUniformfvARB.invokeExact(PFN_glGetnUniformfvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfvARB", e); }
    }

    public void GetnUniformivARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetnUniformivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformivARB");
        try { MH_glGetnUniformivARB.invokeExact(PFN_glGetnUniformivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformivARB", e); }
    }

    public void GetnUniformuivARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetnUniformuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuivARB");
        try { MH_glGetnUniformuivARB.invokeExact(PFN_glGetnUniformuivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuivARB", e); }
    }

    public void GetnUniformdvARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetnUniformdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformdvARB");
        try { MH_glGetnUniformdvARB.invokeExact(PFN_glGetnUniformdvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformdvARB", e); }
    }

    public void GetnMapdvARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glGetnMapdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapdvARB");
        try { MH_glGetnMapdvARB.invokeExact(PFN_glGetnMapdvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapdvARB", e); }
    }

    public void GetnMapfvARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glGetnMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapfvARB");
        try { MH_glGetnMapfvARB.invokeExact(PFN_glGetnMapfvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapfvARB", e); }
    }

    public void GetnMapivARB(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glGetnMapivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapivARB");
        try { MH_glGetnMapivARB.invokeExact(PFN_glGetnMapivARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMapivARB", e); }
    }

    public void GetnPixelMapfvARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetnPixelMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapfvARB");
        try { MH_glGetnPixelMapfvARB.invokeExact(PFN_glGetnPixelMapfvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapfvARB", e); }
    }

    public void GetnPixelMapuivARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetnPixelMapuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapuivARB");
        try { MH_glGetnPixelMapuivARB.invokeExact(PFN_glGetnPixelMapuivARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapuivARB", e); }
    }

    public void GetnPixelMapusvARB(@CType("GLenum") int map, @CType("GLsizei") int bufSize, @CType("GLushort *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetnPixelMapusvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapusvARB");
        try { MH_glGetnPixelMapusvARB.invokeExact(PFN_glGetnPixelMapusvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPixelMapusvARB", e); }
    }

    public void GetnPolygonStippleARB(@CType("GLsizei") int bufSize, @CType("GLubyte *") java.lang.foreign.MemorySegment pattern) {
        if (Unmarshal.isNullPointer(PFN_glGetnPolygonStippleARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPolygonStippleARB");
        try { MH_glGetnPolygonStippleARB.invokeExact(PFN_glGetnPolygonStippleARB, bufSize, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnPolygonStippleARB", e); }
    }

    public void GetnColorTableARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment table) {
        if (Unmarshal.isNullPointer(PFN_glGetnColorTableARB)) throw new SymbolNotFoundError("Symbol not found: glGetnColorTableARB");
        try { MH_glGetnColorTableARB.invokeExact(PFN_glGetnColorTableARB, target, format, type, bufSize, table); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnColorTableARB", e); }
    }

    public void GetnConvolutionFilterARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment image) {
        if (Unmarshal.isNullPointer(PFN_glGetnConvolutionFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnConvolutionFilterARB");
        try { MH_glGetnConvolutionFilterARB.invokeExact(PFN_glGetnConvolutionFilterARB, target, format, type, bufSize, image); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnConvolutionFilterARB", e); }
    }

    public void GetnSeparableFilterARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int rowBufSize, @CType("void*") java.lang.foreign.MemorySegment row, @CType("GLsizei") int columnBufSize, @CType("void*") java.lang.foreign.MemorySegment column, @CType("void*") java.lang.foreign.MemorySegment span) {
        if (Unmarshal.isNullPointer(PFN_glGetnSeparableFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnSeparableFilterARB");
        try { MH_glGetnSeparableFilterARB.invokeExact(PFN_glGetnSeparableFilterARB, target, format, type, rowBufSize, row, columnBufSize, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnSeparableFilterARB", e); }
    }

    public void GetnHistogramARB(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetnHistogramARB)) throw new SymbolNotFoundError("Symbol not found: glGetnHistogramARB");
        try { MH_glGetnHistogramARB.invokeExact(PFN_glGetnHistogramARB, target, reset, format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnHistogramARB", e); }
    }

    public void GetnMinmaxARB(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetnMinmaxARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMinmaxARB");
        try { MH_glGetnMinmaxARB.invokeExact(PFN_glGetnMinmaxARB, target, reset, format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnMinmaxARB", e); }
    }

}
