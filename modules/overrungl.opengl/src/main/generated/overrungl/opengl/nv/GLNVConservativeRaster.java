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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVConservativeRaster {
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 0x9347;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 0x9348;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSubpixelPrecisionBiasNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glSubpixelPrecisionBiasNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSubpixelPrecisionBiasNV = func.invoke("glSubpixelPrecisionBiasNV");
        }
    }

    public GLNVConservativeRaster(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSubpixelPrecisionBiasNV((unsigned int) GLuint xbits, (unsigned int) GLuint ybits);
    /// ```
    public void SubpixelPrecisionBiasNV(int xbits, int ybits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSubpixelPrecisionBiasNV)) throw new GLSymbolNotFoundError("Symbol not found: glSubpixelPrecisionBiasNV");
        try { Handles.MH_glSubpixelPrecisionBiasNV.invokeExact(handles.PFN_glSubpixelPrecisionBiasNV, xbits, ybits); }
        catch (Throwable e) { throw new RuntimeException("error in SubpixelPrecisionBiasNV", e); }
    }

}
