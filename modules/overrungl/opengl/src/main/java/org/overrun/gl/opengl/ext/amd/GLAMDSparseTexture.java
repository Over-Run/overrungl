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

package org.overrun.gl.opengl.ext.amd;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.FunctionDescriptors;

/**
 * {@code GL_AMD_sparse_texture}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDSparseTexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_sparse_texture) return;
        ext.glTexStorageSparseAMD = load.invoke("glTexStorageSparseAMD", FunctionDescriptors.IIIIIIIV);
        ext.glTextureStorageSparseAMD = load.invoke("glTextureStorageSparseAMD", FunctionDescriptors.IIIIIIIIV);
    }

    public static void glTexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTexStorageSparseAMD).invokeExact(target, internalFormat, width, height, depth, layers, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTexStorageSparseAMD).invokeExact(texture, target, internalFormat, width, height, depth, layers, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
