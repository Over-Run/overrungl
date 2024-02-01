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
 * {@code GL_NV_scissor_exclusive}
 */
public interface GLNVScissorExclusive {
    int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;
    int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;

    default void glScissorExclusiveNV(int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glScissorExclusiveArrayvNV(int first, int count, @NativeType("const GLint *") MemorySegment v) {
        throw new ContextException();
    }

}
