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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_vertex_shader_tessellator}
  */
public final class GLAMDVertexShaderTessellator {
    public static final int GL_SAMPLER_BUFFER_AMD = 0x9001;
    public static final int GL_INT_SAMPLER_BUFFER_AMD = 0x9002;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;
    public static final int GL_TESSELLATION_MODE_AMD = 0x9004;
    public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;
    public static final int GL_DISCRETE_AMD = 0x9006;
    public static final int GL_CONTINUOUS_AMD = 0x9007;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_vertex_shader_tessellator) return;
        ext.glTessellationFactorAMD = load.invoke("glTessellationFactorAMD", ofVoid(JAVA_FLOAT));
        ext.glTessellationModeAMD = load.invoke("glTessellationModeAMD", ofVoid(JAVA_INT));
    }

    public static void glTessellationFactorAMD(float factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTessellationFactorAMD).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTessellationModeAMD(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTessellationModeAMD).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
