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
 * {@code GL_NV_framebuffer_mixed_samples}
 */
public interface GLNVFramebufferMixedSamples extends overrun.marshal.DirectAccess {
    int GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;
    int GL_COLOR_SAMPLES_NV = 0x8E20;
    int GL_DEPTH_SAMPLES_NV = 0x932D;
    int GL_STENCIL_SAMPLES_NV = 0x932E;
    int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 0x932F;
    int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 0x9330;
    int GL_COVERAGE_MODULATION_NV = 0x9332;
    int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 0x9333;

    default void glCoverageModulationTableNV(int n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glGetCoverageModulationTableNV(int bufSize, @NativeType("GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glCoverageModulationNV(int components) {
        throw new ContextException();
    }

}
