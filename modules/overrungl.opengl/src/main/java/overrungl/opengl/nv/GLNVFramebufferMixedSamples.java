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

public final class GLNVFramebufferMixedSamples {
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    public static final int GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;
    public static final int GL_RASTER_SAMPLES_EXT = 0x9328;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;
    public static final int GL_COLOR_SAMPLES_NV = 0x8E20;
    public static final int GL_DEPTH_SAMPLES_NV = 0x932D;
    public static final int GL_STENCIL_SAMPLES_NV = 0x932E;
    public static final int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 0x932F;
    public static final int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 0x9330;
    public static final int GL_COVERAGE_MODULATION_NV = 0x9332;
    public static final int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 0x9333;
    public static final MethodHandle MH_glRasterSamplesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glRasterSamplesEXT;
    public static final MethodHandle MH_glCoverageModulationTableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCoverageModulationTableNV;
    public static final MethodHandle MH_glGetCoverageModulationTableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCoverageModulationTableNV;
    public static final MethodHandle MH_glCoverageModulationNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCoverageModulationNV;

    public GLNVFramebufferMixedSamples(overrungl.opengl.GLLoadFunc func) {
        PFN_glRasterSamplesEXT = func.invoke("glRasterSamplesEXT");
        PFN_glCoverageModulationTableNV = func.invoke("glCoverageModulationTableNV");
        PFN_glGetCoverageModulationTableNV = func.invoke("glGetCoverageModulationTableNV");
        PFN_glCoverageModulationNV = func.invoke("glCoverageModulationNV");
    }

    public void RasterSamplesEXT(@CType("GLuint") int samples, @CType("GLboolean") boolean fixedsamplelocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glRasterSamplesEXT))
            MH_glRasterSamplesEXT.invokeExact(PFN_glRasterSamplesEXT, samples, fixedsamplelocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glRasterSamplesEXT", e); }
    }

    public void CoverageModulationTableNV(@CType("GLsizei") int n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glCoverageModulationTableNV))
            MH_glCoverageModulationTableNV.invokeExact(PFN_glCoverageModulationTableNV, n, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCoverageModulationTableNV", e); }
    }

    public void GetCoverageModulationTableNV(@CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetCoverageModulationTableNV))
            MH_glGetCoverageModulationTableNV.invokeExact(PFN_glGetCoverageModulationTableNV, bufSize, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetCoverageModulationTableNV", e); }
    }

    public void CoverageModulationNV(@CType("GLenum") int components) {
        try { if (!Unmarshal.isNullPointer(PFN_glCoverageModulationNV))
            MH_glCoverageModulationNV.invokeExact(PFN_glCoverageModulationNV, components);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCoverageModulationNV", e); }
    }

}
