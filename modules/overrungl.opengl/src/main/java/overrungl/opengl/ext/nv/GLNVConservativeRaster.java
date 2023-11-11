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
 * {@code GL_NV_conservative_raster}
 */
public final class GLNVConservativeRaster {
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 0x9347;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 0x9348;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_conservative_raster) return;
        ext.glSubpixelPrecisionBiasNV = load.invoke("glSubpixelPrecisionBiasNV", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glSubpixelPrecisionBiasNV(int xbits, int ybits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSubpixelPrecisionBiasNV).invokeExact(xbits, ybits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
