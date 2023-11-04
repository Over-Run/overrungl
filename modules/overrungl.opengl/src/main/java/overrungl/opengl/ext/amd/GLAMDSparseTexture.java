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
 * {@code GL_AMD_sparse_texture}
 */
public final class GLAMDSparseTexture {
    public static final int GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_AMD = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;
    public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;
    public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;
    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x00000001;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_sparse_texture) return;
        ext.glTexStorageSparseAMD = load.invoke("glTexStorageSparseAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureStorageSparseAMD = load.invoke("glTextureStorageSparseAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glTexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageSparseAMD).invokeExact(target, internalFormat, width, height, depth, layers, flags);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageSparseAMD).invokeExact(texture, target, internalFormat, width, height, depth, layers, flags);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
