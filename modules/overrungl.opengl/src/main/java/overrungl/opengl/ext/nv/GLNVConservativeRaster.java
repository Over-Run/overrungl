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
 * {@code GL_NV_conservative_raster}
 */
public interface GLNVConservativeRaster extends overrun.marshal.DirectAccess {
    int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;
    int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 0x9347;
    int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 0x9348;
    int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;

    default void glSubpixelPrecisionBiasNV(int xbits, int ybits) {
        throw new ContextException();
    }

}
