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
 * {@code GL_NV_framebuffer_multisample_coverage}
 */
public interface GLNVFramebufferMultisampleCoverage extends overrun.marshal.DirectAccess {
    int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
    int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
    int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
    int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;

    default void glRenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        throw new ContextException();
    }

}
