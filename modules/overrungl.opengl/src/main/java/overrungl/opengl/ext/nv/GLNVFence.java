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
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_fence}
 */
public interface GLNVFence extends overrun.marshal.DirectAccess {
    int GL_ALL_COMPLETED_NV = 0x84F2;
    int GL_FENCE_STATUS_NV = 0x84F3;
    int GL_FENCE_CONDITION_NV = 0x84F4;

    default void glDeleteFencesNV(int n, @NativeType("const GLuint *") MemorySegment fences) {
        throw new ContextException();
    }

    default void glGenFencesNV(int n, @NativeType("GLuint *") MemorySegment fences) {
        throw new ContextException();
    }

    default boolean glIsFenceNV(int fence) {
        throw new ContextException();
    }

    default boolean glTestFenceNV(int fence) {
        throw new ContextException();
    }

    default void glGetFenceivNV(int fence, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glFinishFenceNV(int fence) {
        throw new ContextException();
    }

    default void glSetFenceNV(int fence, int condition) {
        throw new ContextException();
    }

}
