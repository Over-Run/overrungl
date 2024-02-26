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
package overrungl.opengl.ext.apple;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_APPLE_fence}
 */
public interface GLAPPLEFence extends overrun.marshal.DirectAccess {
    int GL_DRAW_PIXELS_APPLE = 0x8A0A;
    int GL_FENCE_APPLE = 0x8A0B;

    default void glGenFencesAPPLE(int n, @NativeType("GLuint *") MemorySegment fences) {
        throw new ContextException();
    }

    default void glDeleteFencesAPPLE(int n, @NativeType("const GLuint *") MemorySegment fences) {
        throw new ContextException();
    }

    default void glSetFenceAPPLE(int fence) {
        throw new ContextException();
    }

    default boolean glIsFenceAPPLE(int fence) {
        throw new ContextException();
    }

    default boolean glTestFenceAPPLE(int fence) {
        throw new ContextException();
    }

    default void glFinishFenceAPPLE(int fence) {
        throw new ContextException();
    }

    default boolean glTestObjectAPPLE(int object, int name) {
        throw new ContextException();
    }

    default void glFinishObjectAPPLE(int object, int name) {
        throw new ContextException();
    }

}
