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
 * {@code GL_NV_framebuffer_multisample_coverage}
 */
public final class GLNVFramebufferMultisampleCoverage {
    public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
    public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
    public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
    public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_framebuffer_multisample_coverage) return;
        ext.glRenderbufferStorageMultisampleCoverageNV = load.invoke("glRenderbufferStorageMultisampleCoverageNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glRenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRenderbufferStorageMultisampleCoverageNV).invokeExact(target, coverageSamples, colorSamples, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
