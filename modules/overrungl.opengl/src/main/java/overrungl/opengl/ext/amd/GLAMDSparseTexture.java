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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_sparse_texture}
 */
public interface GLAMDSparseTexture {
    int GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195;
    int GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196;
    int GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;
    int GL_MAX_SPARSE_TEXTURE_SIZE_AMD = 0x9198;
    int GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD = 0x9199;
    int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;
    int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;
    int GL_MIN_LOD_WARNING_AMD = 0x919C;
    int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x00000001;

    void glTexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags);
    void glTextureStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags);
}
