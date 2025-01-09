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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glBindShadingRateImageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetShadingRateImagePaletteNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetShadingRateSampleLocationivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glShadingRateImageBarrierNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
    public static final MethodHandle MH_glShadingRateImagePaletteNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glShadingRateSampleOrderNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glShadingRateSampleOrderCustomNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindShadingRateImageNV;
    public final MemorySegment PFN_glGetShadingRateImagePaletteNV;
    public final MemorySegment PFN_glGetShadingRateSampleLocationivNV;
    public final MemorySegment PFN_glShadingRateImageBarrierNV;
    public final MemorySegment PFN_glShadingRateImagePaletteNV;
    public final MemorySegment PFN_glShadingRateSampleOrderNV;
    public final MemorySegment PFN_glShadingRateSampleOrderCustomNV;

    public GLNVShadingRateImage(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindShadingRateImageNV = func.invoke("glBindShadingRateImageNV");
        PFN_glGetShadingRateImagePaletteNV = func.invoke("glGetShadingRateImagePaletteNV");
        PFN_glGetShadingRateSampleLocationivNV = func.invoke("glGetShadingRateSampleLocationivNV");
        PFN_glShadingRateImageBarrierNV = func.invoke("glShadingRateImageBarrierNV");
        PFN_glShadingRateImagePaletteNV = func.invoke("glShadingRateImagePaletteNV");
        PFN_glShadingRateSampleOrderNV = func.invoke("glShadingRateSampleOrderNV");
        PFN_glShadingRateSampleOrderCustomNV = func.invoke("glShadingRateSampleOrderCustomNV");
    }

    public void BindShadingRateImageNV(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(PFN_glBindShadingRateImageNV)) throw new SymbolNotFoundError("Symbol not found: glBindShadingRateImageNV");
        try { MH_glBindShadingRateImageNV.invokeExact(PFN_glBindShadingRateImageNV, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glBindShadingRateImageNV", e); }
    }

    public void GetShadingRateImagePaletteNV(@CType("GLuint") int viewport, @CType("GLuint") int entry, @CType("GLenum *") java.lang.foreign.MemorySegment rate) {
        if (Unmarshal.isNullPointer(PFN_glGetShadingRateImagePaletteNV)) throw new SymbolNotFoundError("Symbol not found: glGetShadingRateImagePaletteNV");
        try { MH_glGetShadingRateImagePaletteNV.invokeExact(PFN_glGetShadingRateImagePaletteNV, viewport, entry, rate); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShadingRateImagePaletteNV", e); }
    }

    public void GetShadingRateSampleLocationivNV(@CType("GLenum") int rate, @CType("GLuint") int samples, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment location) {
        if (Unmarshal.isNullPointer(PFN_glGetShadingRateSampleLocationivNV)) throw new SymbolNotFoundError("Symbol not found: glGetShadingRateSampleLocationivNV");
        try { MH_glGetShadingRateSampleLocationivNV.invokeExact(PFN_glGetShadingRateSampleLocationivNV, rate, samples, index, location); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShadingRateSampleLocationivNV", e); }
    }

    public void ShadingRateImageBarrierNV(@CType("GLboolean") boolean synchronize) {
        if (Unmarshal.isNullPointer(PFN_glShadingRateImageBarrierNV)) throw new SymbolNotFoundError("Symbol not found: glShadingRateImageBarrierNV");
        try { MH_glShadingRateImageBarrierNV.invokeExact(PFN_glShadingRateImageBarrierNV, synchronize); }
        catch (Throwable e) { throw new RuntimeException("error in glShadingRateImageBarrierNV", e); }
    }

    public void ShadingRateImagePaletteNV(@CType("GLuint") int viewport, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLenum *") java.lang.foreign.MemorySegment rates) {
        if (Unmarshal.isNullPointer(PFN_glShadingRateImagePaletteNV)) throw new SymbolNotFoundError("Symbol not found: glShadingRateImagePaletteNV");
        try { MH_glShadingRateImagePaletteNV.invokeExact(PFN_glShadingRateImagePaletteNV, viewport, first, count, rates); }
        catch (Throwable e) { throw new RuntimeException("error in glShadingRateImagePaletteNV", e); }
    }

    public void ShadingRateSampleOrderNV(@CType("GLenum") int order) {
        if (Unmarshal.isNullPointer(PFN_glShadingRateSampleOrderNV)) throw new SymbolNotFoundError("Symbol not found: glShadingRateSampleOrderNV");
        try { MH_glShadingRateSampleOrderNV.invokeExact(PFN_glShadingRateSampleOrderNV, order); }
        catch (Throwable e) { throw new RuntimeException("error in glShadingRateSampleOrderNV", e); }
    }

    public void ShadingRateSampleOrderCustomNV(@CType("GLenum") int rate, @CType("GLuint") int samples, @CType("const GLint *") java.lang.foreign.MemorySegment locations) {
        if (Unmarshal.isNullPointer(PFN_glShadingRateSampleOrderCustomNV)) throw new SymbolNotFoundError("Symbol not found: glShadingRateSampleOrderCustomNV");
        try { MH_glShadingRateSampleOrderCustomNV.invokeExact(PFN_glShadingRateSampleOrderCustomNV, rate, samples, locations); }
        catch (Throwable e) { throw new RuntimeException("error in glShadingRateSampleOrderCustomNV", e); }
    }

}
