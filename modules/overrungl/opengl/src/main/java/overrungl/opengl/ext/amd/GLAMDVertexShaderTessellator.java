/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl.ext.amd;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

/**
 * {@code GL_AMD_vertex_shader_tessellator}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDVertexShaderTessellator {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_vertex_shader_tessellator) return;
        ext.glTessellationFactorAMD = load.invoke("glTessellationFactorAMD", FunctionDescriptors.FV);
        ext.glTessellationModeAMD = load.invoke("glTessellationModeAMD", FunctionDescriptors.IV);
    }

    public static void glTessellationFactorAMD(float factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTessellationFactorAMD).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTessellationModeAMD(int mode) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTessellationModeAMD).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
