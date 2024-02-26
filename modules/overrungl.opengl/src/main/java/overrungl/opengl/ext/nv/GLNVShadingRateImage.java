/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_shading_rate_image}
 */
public interface GLNVShadingRateImage extends overrun.marshal.DirectAccess {
    int GL_SHADING_RATE_IMAGE_NV = 0x9563;
    int GL_SHADING_RATE_NO_INVOCATIONS_NV = 0x9564;
    int GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0x9565;
    int GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 0x9566;
    int GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 0x9567;
    int GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 0x9568;
    int GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 0x9569;
    int GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 0x956A;
    int GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 0x956B;
    int GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 0x956C;
    int GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 0x956D;
    int GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 0x956E;
    int GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 0x956F;
    int GL_SHADING_RATE_IMAGE_BINDING_NV = 0x955B;
    int GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV = 0x955C;
    int GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 0x955D;
    int GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 0x955E;
    int GL_MAX_COARSE_FRAGMENT_SAMPLES_NV = 0x955F;
    int GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV = 0x95AE;
    int GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV = 0x95AF;
    int GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 0x95B0;

    default void glBindShadingRateImageNV(int texture) {
        throw new ContextException();
    }

    default void glGetShadingRateImagePaletteNV(int viewport, int entry, @NativeType("GLenum *") MemorySegment rate) {
        throw new ContextException();
    }

    default void glGetShadingRateSampleLocationivNV(int rate, int samples, int index, @NativeType("GLint *") MemorySegment location) {
        throw new ContextException();
    }

    default void glShadingRateImageBarrierNV(boolean synchronize) {
        throw new ContextException();
    }

    default void glShadingRateImagePaletteNV(int viewport, int first, int count, @NativeType("const GLenum *") MemorySegment rates) {
        throw new ContextException();
    }

    default void glShadingRateSampleOrderNV(int order) {
        throw new ContextException();
    }

    default void glShadingRateSampleOrderCustomNV(int rate, int samples, @NativeType("const GLint *") MemorySegment locations) {
        throw new ContextException();
    }

}
