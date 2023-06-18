/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

// this file is auto-generated. DO NOT EDIT!
package org.overrun.gl.opengl.ext.arb;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import static org.overrun.gl.FunctionDescriptors.FV;

/**
 * {@code GL_ARB_sample_shading}
 */
public final class GLARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sample_shading) return;
        ext.glMinSampleShadingARB = load.invoke("glMinSampleShadingARB", FV);
    }

    public static void glMinSampleShadingARB(float value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMinSampleShadingARB).invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
