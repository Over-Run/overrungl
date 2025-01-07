/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBSparseTexture {
    public static final int GL_TEXTURE_SPARSE_ARB = 0x91A6;
    public static final int GL_VIRTUAL_PAGE_SIZE_INDEX_ARB = 0x91A7;
    public static final int GL_NUM_SPARSE_LEVELS_ARB = 0x91AA;
    public static final int GL_NUM_VIRTUAL_PAGE_SIZES_ARB = 0x91A8;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_ARB = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_ARB = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_ARB = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_ARB = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB = 0x919A;
    public static final int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB = 0x91A9;
    public static final MethodHandle MH_glTexPageCommitmentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexPageCommitmentARB;

    public GLARBSparseTexture(overrungl.opengl.GLLoadFunc func) {
        PFN_glTexPageCommitmentARB = func.invoke("glTexPageCommitmentARB");
    }

    public void TexPageCommitmentARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean commit) {
        if (!Unmarshal.isNullPointer(PFN_glTexPageCommitmentARB)) { try {
            MH_glTexPageCommitmentARB.invokeExact(PFN_glTexPageCommitmentARB, target, level, xoffset, yoffset, zoffset, width, height, depth, commit);
        } catch (Throwable e) { throw new RuntimeException("error in glTexPageCommitmentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexPageCommitmentARB"); }
    }

}
