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

public final class GLNVConservativeRasterDilate {
    public static final int GL_CONSERVATIVE_RASTER_DILATE_NV = 0x9379;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 0x937A;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;
    public static final MethodHandle MH_glConservativeRasterParameterfNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glConservativeRasterParameterfNV;

    public GLNVConservativeRasterDilate(overrungl.opengl.GLLoadFunc func) {
        PFN_glConservativeRasterParameterfNV = func.invoke("glConservativeRasterParameterfNV");
    }

    public void ConservativeRasterParameterfNV(@CType("GLenum") int pname, @CType("GLfloat") float value) {
        try { if (!Unmarshal.isNullPointer(PFN_glConservativeRasterParameterfNV))
            MH_glConservativeRasterParameterfNV.invokeExact(PFN_glConservativeRasterParameterfNV, pname, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glConservativeRasterParameterfNV", e); }
    }

}
