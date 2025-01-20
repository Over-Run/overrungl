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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTRasterMultisample {
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    public static final int GL_RASTER_SAMPLES_EXT = 0x9328;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRasterSamplesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
        public final MemorySegment PFN_glRasterSamplesEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glRasterSamplesEXT = func.invoke("glRasterSamplesEXT");
        }
    }

    public GLEXTRasterMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void RasterSamplesEXT(@CType("GLuint") int samples, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterSamplesEXT)) throw new SymbolNotFoundError("Symbol not found: glRasterSamplesEXT");
        try { Handles.MH_glRasterSamplesEXT.invokeExact(handles.PFN_glRasterSamplesEXT, samples, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterSamplesEXT", e); }
    }

}
