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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_memory_object_sparse}
 */
public interface GLNVMemoryObjectSparse {

    default void glBufferPageCommitmentMemNV(int target, long offset, long size, int memory, long memOffset, boolean commit) {
        throw new ContextException();
    }

    default void glTexPageCommitmentMemNV(int target, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        throw new ContextException();
    }

    default void glNamedBufferPageCommitmentMemNV(int buffer, long offset, long size, int memory, long memOffset, boolean commit) {
        throw new ContextException();
    }

    default void glTexturePageCommitmentMemNV(int texture, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        throw new ContextException();
    }

}
