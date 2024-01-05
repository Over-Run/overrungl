/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_shading_rate_image}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_shading_rate_image) return;
        ext.glBindShadingRateImageNV = load.invoke("glBindShadingRateImageNV", ofVoid(JAVA_INT));
        ext.glGetShadingRateImagePaletteNV = load.invoke("glGetShadingRateImagePaletteNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetShadingRateSampleLocationivNV = load.invoke("glGetShadingRateSampleLocationivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glShadingRateImageBarrierNV = load.invoke("glShadingRateImageBarrierNV", ofVoid(JAVA_BYTE));
        ext.glShadingRateImagePaletteNV = load.invoke("glShadingRateImagePaletteNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glShadingRateSampleOrderNV = load.invoke("glShadingRateSampleOrderNV", ofVoid(JAVA_INT));
        ext.glShadingRateSampleOrderCustomNV = load.invoke("glShadingRateSampleOrderCustomNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBindShadingRateImageNV(int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindShadingRateImageNV).invokeExact(texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetShadingRateImagePaletteNV(int viewport, int entry, @NativeType("GLenum *") MemorySegment rate) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetShadingRateImagePaletteNV).invokeExact(viewport, entry, rate);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetShadingRateSampleLocationivNV(int rate, int samples, int index, @NativeType("GLint *") MemorySegment location) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetShadingRateSampleLocationivNV).invokeExact(rate, samples, index, location);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShadingRateImageBarrierNV(boolean synchronize) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShadingRateImageBarrierNV).invokeExact(synchronize);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShadingRateImagePaletteNV(int viewport, int first, int count, @NativeType("const GLenum *") MemorySegment rates) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShadingRateImagePaletteNV).invokeExact(viewport, first, count, rates);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShadingRateSampleOrderNV(int order) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShadingRateSampleOrderNV).invokeExact(order);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShadingRateSampleOrderCustomNV(int rate, int samples, @NativeType("const GLint *") MemorySegment locations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShadingRateSampleOrderCustomNV).invokeExact(rate, samples, locations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
