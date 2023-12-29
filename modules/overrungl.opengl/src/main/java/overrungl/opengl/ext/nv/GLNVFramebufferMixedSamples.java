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
 * {@code GL_NV_framebuffer_mixed_samples}
 */
public final class GLNVFramebufferMixedSamples {
    public static final int GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;
    public static final int GL_COLOR_SAMPLES_NV = 0x8E20;
    public static final int GL_DEPTH_SAMPLES_NV = 0x932D;
    public static final int GL_STENCIL_SAMPLES_NV = 0x932E;
    public static final int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 0x932F;
    public static final int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 0x9330;
    public static final int GL_COVERAGE_MODULATION_NV = 0x9332;
    public static final int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 0x9333;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_framebuffer_mixed_samples) return;
        ext.glCoverageModulationTableNV = load.invoke("glCoverageModulationTableNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetCoverageModulationTableNV = load.invoke("glGetCoverageModulationTableNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glCoverageModulationNV = load.invoke("glCoverageModulationNV", ofVoid(JAVA_INT));
    }

    public static void glCoverageModulationTableNV(int n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverageModulationTableNV).invokeExact(n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCoverageModulationTableNV(int bufSize, @NativeType("GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCoverageModulationTableNV).invokeExact(bufSize, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCoverageModulationNV(int components) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverageModulationNV).invokeExact(components);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
