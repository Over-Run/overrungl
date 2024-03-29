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
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_sparse_texture}
 */
public interface GLARBSparseTexture extends overrun.marshal.DirectAccess {
    int GL_TEXTURE_SPARSE_ARB = 0x91A6;
    int GL_VIRTUAL_PAGE_SIZE_INDEX_ARB = 0x91A7;
    int GL_NUM_SPARSE_LEVELS_ARB = 0x91AA;
    int GL_NUM_VIRTUAL_PAGE_SIZES_ARB = 0x91A8;
    int GL_VIRTUAL_PAGE_SIZE_X_ARB = 0x9195;
    int GL_VIRTUAL_PAGE_SIZE_Y_ARB = 0x9196;
    int GL_VIRTUAL_PAGE_SIZE_Z_ARB = 0x9197;
    int GL_MAX_SPARSE_TEXTURE_SIZE_ARB = 0x9198;
    int GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB = 0x9199;
    int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB = 0x919A;
    int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB = 0x91A9;

    default void glTexPageCommitmentARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
        throw new ContextException();
    }

}
