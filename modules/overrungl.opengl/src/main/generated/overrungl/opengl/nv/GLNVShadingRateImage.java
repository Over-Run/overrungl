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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVShadingRateImage {
    public static final int GL_SHADING_RATE_IMAGE_NV = 0x9563;
    public static final int GL_SHADING_RATE_NO_INVOCATIONS_NV = 0x9564;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0x9565;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 0x9566;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 0x9567;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 0x9568;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 0x9569;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 0x956A;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 0x956B;
    public static final int GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 0x956C;
    public static final int GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 0x956D;
    public static final int GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 0x956E;
    public static final int GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 0x956F;
    public static final int GL_SHADING_RATE_IMAGE_BINDING_NV = 0x955B;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV = 0x955C;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 0x955D;
    public static final int GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 0x955E;
    public static final int GL_MAX_COARSE_FRAGMENT_SAMPLES_NV = 0x955F;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV = 0x95AE;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV = 0x95AF;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 0x95B0;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindShadingRateImageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetShadingRateImagePaletteNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetShadingRateSampleLocationivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glShadingRateImageBarrierNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glShadingRateImagePaletteNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glShadingRateSampleOrderNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShadingRateSampleOrderCustomNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBindShadingRateImageNV;
        public final MemorySegment PFN_glGetShadingRateImagePaletteNV;
        public final MemorySegment PFN_glGetShadingRateSampleLocationivNV;
        public final MemorySegment PFN_glShadingRateImageBarrierNV;
        public final MemorySegment PFN_glShadingRateImagePaletteNV;
        public final MemorySegment PFN_glShadingRateSampleOrderNV;
        public final MemorySegment PFN_glShadingRateSampleOrderCustomNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindShadingRateImageNV = func.invoke("glBindShadingRateImageNV");
            PFN_glGetShadingRateImagePaletteNV = func.invoke("glGetShadingRateImagePaletteNV");
            PFN_glGetShadingRateSampleLocationivNV = func.invoke("glGetShadingRateSampleLocationivNV");
            PFN_glShadingRateImageBarrierNV = func.invoke("glShadingRateImageBarrierNV");
            PFN_glShadingRateImagePaletteNV = func.invoke("glShadingRateImagePaletteNV");
            PFN_glShadingRateSampleOrderNV = func.invoke("glShadingRateSampleOrderNV");
            PFN_glShadingRateSampleOrderCustomNV = func.invoke("glShadingRateSampleOrderCustomNV");
        }
    }

    public GLNVShadingRateImage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindShadingRateImageNV((unsigned int) GLuint texture);
    /// ```
    public void BindShadingRateImageNV(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindShadingRateImageNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindShadingRateImageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindShadingRateImageNV", texture); }
        Handles.MH_glBindShadingRateImageNV.invokeExact(handles.PFN_glBindShadingRateImageNV, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindShadingRateImageNV", e); }
    }

    /// ```
    /// void glGetShadingRateImagePaletteNV((unsigned int) GLuint viewport, (unsigned int) GLuint entry, GLenum* rate);
    /// ```
    public void GetShadingRateImagePaletteNV(int viewport, int entry, MemorySegment rate) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShadingRateImagePaletteNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetShadingRateImagePaletteNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShadingRateImagePaletteNV", viewport, entry, rate); }
        Handles.MH_glGetShadingRateImagePaletteNV.invokeExact(handles.PFN_glGetShadingRateImagePaletteNV, viewport, entry, rate); }
        catch (Throwable e) { throw new RuntimeException("error in GetShadingRateImagePaletteNV", e); }
    }

    /// ```
    /// void glGetShadingRateSampleLocationivNV((unsigned int) GLenum rate, (unsigned int) GLuint samples, (unsigned int) GLuint index, GLint* location);
    /// ```
    public void GetShadingRateSampleLocationivNV(int rate, int samples, int index, MemorySegment location) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShadingRateSampleLocationivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetShadingRateSampleLocationivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShadingRateSampleLocationivNV", rate, samples, index, location); }
        Handles.MH_glGetShadingRateSampleLocationivNV.invokeExact(handles.PFN_glGetShadingRateSampleLocationivNV, rate, samples, index, location); }
        catch (Throwable e) { throw new RuntimeException("error in GetShadingRateSampleLocationivNV", e); }
    }

    /// ```
    /// void glShadingRateImageBarrierNV(GLboolean synchronize);
    /// ```
    public void ShadingRateImageBarrierNV(boolean synchronize) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateImageBarrierNV)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateImageBarrierNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateImageBarrierNV", synchronize); }
        Handles.MH_glShadingRateImageBarrierNV.invokeExact(handles.PFN_glShadingRateImageBarrierNV, ((synchronize) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateImageBarrierNV", e); }
    }

    /// ```
    /// void glShadingRateImagePaletteNV((unsigned int) GLuint viewport, (unsigned int) GLuint first, (int) GLsizei count, const GLenum* rates);
    /// ```
    public void ShadingRateImagePaletteNV(int viewport, int first, int count, MemorySegment rates) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateImagePaletteNV)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateImagePaletteNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateImagePaletteNV", viewport, first, count, rates); }
        Handles.MH_glShadingRateImagePaletteNV.invokeExact(handles.PFN_glShadingRateImagePaletteNV, viewport, first, count, rates); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateImagePaletteNV", e); }
    }

    /// ```
    /// void glShadingRateSampleOrderNV((unsigned int) GLenum order);
    /// ```
    public void ShadingRateSampleOrderNV(int order) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateSampleOrderNV)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateSampleOrderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateSampleOrderNV", order); }
        Handles.MH_glShadingRateSampleOrderNV.invokeExact(handles.PFN_glShadingRateSampleOrderNV, order); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateSampleOrderNV", e); }
    }

    /// ```
    /// void glShadingRateSampleOrderCustomNV((unsigned int) GLenum rate, (unsigned int) GLuint samples, const GLint* locations);
    /// ```
    public void ShadingRateSampleOrderCustomNV(int rate, int samples, MemorySegment locations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateSampleOrderCustomNV)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateSampleOrderCustomNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateSampleOrderCustomNV", rate, samples, locations); }
        Handles.MH_glShadingRateSampleOrderCustomNV.invokeExact(handles.PFN_glShadingRateSampleOrderCustomNV, rate, samples, locations); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateSampleOrderCustomNV", e); }
    }

}
