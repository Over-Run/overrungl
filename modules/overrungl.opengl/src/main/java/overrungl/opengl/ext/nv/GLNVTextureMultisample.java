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
 * {@code GL_NV_texture_multisample}
 */
public final class GLNVTextureMultisample {
    public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045;
    public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 0x9046;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_texture_multisample) return;
        ext.glTexImage2DMultisampleCoverageNV = load.invoke("glTexImage2DMultisampleCoverageNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTexImage3DMultisampleCoverageNV = load.invoke("glTexImage3DMultisampleCoverageNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTextureImage2DMultisampleNV = load.invoke("glTextureImage2DMultisampleNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTextureImage3DMultisampleNV = load.invoke("glTextureImage3DMultisampleNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTextureImage2DMultisampleCoverageNV = load.invoke("glTextureImage2DMultisampleCoverageNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTextureImage3DMultisampleCoverageNV = load.invoke("glTextureImage3DMultisampleCoverageNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
    }

    public static void glTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexImage2DMultisampleCoverageNV).invokeExact(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexImage3DMultisampleCoverageNV).invokeExact(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage2DMultisampleNV).invokeExact(texture, target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage3DMultisampleNV).invokeExact(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage2DMultisampleCoverageNV).invokeExact(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage3DMultisampleCoverageNV).invokeExact(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
