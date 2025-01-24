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
    public static final class Handles {
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
        public static final MethodHandle MH_glGetnHistogramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnMinmaxARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// unsigned int glGetGraphicsResetStatusARB();
    /// ```
    public int GetGraphicsResetStatusARB() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetGraphicsResetStatusARB)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusARB");
        try { return (int) Handles.MH_glGetGraphicsResetStatusARB.invokeExact(handles.PFN_glGetGraphicsResetStatusARB); }
        catch (Throwable e) { throw new RuntimeException("error in GetGraphicsResetStatusARB", e); }
    }

    /// ```
    /// void glGetnTexImageARB(unsigned int target, int level, unsigned int format, unsigned int type, int bufSize, void* img);
    /// ```
    public void GetnTexImageARB(int target, int level, int format, int type, int bufSize, MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnTexImageARB");
        try { Handles.MH_glGetnTexImageARB.invokeExact(handles.PFN_glGetnTexImageARB, target, level, format, type, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetnTexImageARB", e); }
    }

    /// ```
    /// void glReadnPixelsARB(int x, int y, int width, int height, unsigned int format, unsigned int type, int bufSize, void* data);
    /// ```
    public void ReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadnPixelsARB)) throw new SymbolNotFoundError("Symbol not found: glReadnPixelsARB");
        try { Handles.MH_glReadnPixelsARB.invokeExact(handles.PFN_glReadnPixelsARB, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in ReadnPixelsARB", e); }
    }

    /// ```
    /// void glGetnCompressedTexImageARB(unsigned int target, int lod, int bufSize, void* img);
    /// ```
    public void GetnCompressedTexImageARB(int target, int lod, int bufSize, MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnCompressedTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetnCompressedTexImageARB");
        try { Handles.MH_glGetnCompressedTexImageARB.invokeExact(handles.PFN_glGetnCompressedTexImageARB, target, lod, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetnCompressedTexImageARB", e); }
    }

    /// ```
    /// void glGetnUniformfvARB(unsigned int program, int location, int bufSize, GLfloat* params);
    /// ```
    public void GetnUniformfvARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfvARB");
        try { Handles.MH_glGetnUniformfvARB.invokeExact(handles.PFN_glGetnUniformfvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformfvARB", e); }
    }

    /// ```
    /// void glGetnUniformivARB(unsigned int program, int location, int bufSize, GLint* params);
    /// ```
    public void GetnUniformivARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformivARB");
        try { Handles.MH_glGetnUniformivARB.invokeExact(handles.PFN_glGetnUniformivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformivARB", e); }
    }

    /// ```
    /// void glGetnUniformuivARB(unsigned int program, int location, int bufSize, GLuint* params);
    /// ```
    public void GetnUniformuivARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuivARB");
        try { Handles.MH_glGetnUniformuivARB.invokeExact(handles.PFN_glGetnUniformuivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformuivARB", e); }
    }

    /// ```
    /// void glGetnUniformdvARB(unsigned int program, int location, int bufSize, GLdouble* params);
    /// ```
    public void GetnUniformdvARB(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformdvARB");
        try { Handles.MH_glGetnUniformdvARB.invokeExact(handles.PFN_glGetnUniformdvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformdvARB", e); }
    }

    /// ```
    /// void glGetnMapdvARB(unsigned int target, unsigned int query, int bufSize, GLdouble* v);
    /// ```
    public void GetnMapdvARB(int target, int query, int bufSize, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapdvARB");
        try { Handles.MH_glGetnMapdvARB.invokeExact(handles.PFN_glGetnMapdvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapdvARB", e); }
    }

    /// ```
    /// void glGetnMapfvARB(unsigned int target, unsigned int query, int bufSize, GLfloat* v);
    /// ```
    public void GetnMapfvARB(int target, int query, int bufSize, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapfvARB");
        try { Handles.MH_glGetnMapfvARB.invokeExact(handles.PFN_glGetnMapfvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapfvARB", e); }
    }

    /// ```
    /// void glGetnMapivARB(unsigned int target, unsigned int query, int bufSize, GLint* v);
    /// ```
    public void GetnMapivARB(int target, int query, int bufSize, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMapivARB");
        try { Handles.MH_glGetnMapivARB.invokeExact(handles.PFN_glGetnMapivARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapivARB", e); }
    }

    /// ```
    /// void glGetnPixelMapfvARB(unsigned int map, int bufSize, GLfloat* values);
    /// ```
    public void GetnPixelMapfvARB(int map, int bufSize, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapfvARB");
        try { Handles.MH_glGetnPixelMapfvARB.invokeExact(handles.PFN_glGetnPixelMapfvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapfvARB", e); }
    }

    /// ```
    /// void glGetnPixelMapuivARB(unsigned int map, int bufSize, GLuint* values);
    /// ```
    public void GetnPixelMapuivARB(int map, int bufSize, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapuivARB");
        try { Handles.MH_glGetnPixelMapuivARB.invokeExact(handles.PFN_glGetnPixelMapuivARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapuivARB", e); }
    }

    /// ```
    /// void glGetnPixelMapusvARB(unsigned int map, int bufSize, GLushort* values);
    /// ```
    public void GetnPixelMapusvARB(int map, int bufSize, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapusvARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPixelMapusvARB");
        try { Handles.MH_glGetnPixelMapusvARB.invokeExact(handles.PFN_glGetnPixelMapusvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapusvARB", e); }
    }

    /// ```
    /// void glGetnPolygonStippleARB(int bufSize, GLubyte* pattern);
    /// ```
    public void GetnPolygonStippleARB(int bufSize, MemorySegment pattern) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPolygonStippleARB)) throw new SymbolNotFoundError("Symbol not found: glGetnPolygonStippleARB");
        try { Handles.MH_glGetnPolygonStippleARB.invokeExact(handles.PFN_glGetnPolygonStippleARB, bufSize, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPolygonStippleARB", e); }
    }

    /// ```
    /// void glGetnColorTableARB(unsigned int target, unsigned int format, unsigned int type, int bufSize, void* table);
    /// ```
    public void GetnColorTableARB(int target, int format, int type, int bufSize, MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnColorTableARB)) throw new SymbolNotFoundError("Symbol not found: glGetnColorTableARB");
        try { Handles.MH_glGetnColorTableARB.invokeExact(handles.PFN_glGetnColorTableARB, target, format, type, bufSize, table); }
        catch (Throwable e) { throw new RuntimeException("error in GetnColorTableARB", e); }
    }

    /// ```
    /// void glGetnConvolutionFilterARB(unsigned int target, unsigned int format, unsigned int type, int bufSize, void* image);
    /// ```
    public void GetnConvolutionFilterARB(int target, int format, int type, int bufSize, MemorySegment image) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnConvolutionFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnConvolutionFilterARB");
        try { Handles.MH_glGetnConvolutionFilterARB.invokeExact(handles.PFN_glGetnConvolutionFilterARB, target, format, type, bufSize, image); }
        catch (Throwable e) { throw new RuntimeException("error in GetnConvolutionFilterARB", e); }
    }

    /// ```
    /// void glGetnSeparableFilterARB(unsigned int target, unsigned int format, unsigned int type, int rowBufSize, void* row, int columnBufSize, void* column, void* span);
    /// ```
    public void GetnSeparableFilterARB(int target, int format, int type, int rowBufSize, MemorySegment row, int columnBufSize, MemorySegment column, MemorySegment span) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnSeparableFilterARB)) throw new SymbolNotFoundError("Symbol not found: glGetnSeparableFilterARB");
        try { Handles.MH_glGetnSeparableFilterARB.invokeExact(handles.PFN_glGetnSeparableFilterARB, target, format, type, rowBufSize, row, columnBufSize, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in GetnSeparableFilterARB", e); }
    }

    /// ```
    /// void glGetnHistogramARB(unsigned int target, GLboolean reset, unsigned int format, unsigned int type, int bufSize, void* values);
    /// ```
    public void GetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnHistogramARB)) throw new SymbolNotFoundError("Symbol not found: glGetnHistogramARB");
        try { Handles.MH_glGetnHistogramARB.invokeExact(handles.PFN_glGetnHistogramARB, target, ((reset) ? (byte)1 : (byte)0), format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnHistogramARB", e); }
    }

    /// ```
    /// void glGetnMinmaxARB(unsigned int target, GLboolean reset, unsigned int format, unsigned int type, int bufSize, void* values);
    /// ```
    public void GetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMinmaxARB)) throw new SymbolNotFoundError("Symbol not found: glGetnMinmaxARB");
        try { Handles.MH_glGetnMinmaxARB.invokeExact(handles.PFN_glGetnMinmaxARB, target, ((reset) ? (byte)1 : (byte)0), format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMinmaxARB", e); }
    }

}
