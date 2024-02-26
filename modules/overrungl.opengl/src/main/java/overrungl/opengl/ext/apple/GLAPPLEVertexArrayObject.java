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
 * {@code GL_APPLE_vertex_array_object}
 */
public interface GLAPPLEVertexArrayObject extends overrun.marshal.DirectAccess {
    int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;

    default void glBindVertexArrayAPPLE(int array) {
        throw new ContextException();
    }

    default void glDeleteVertexArraysAPPLE(int n, @NativeType("const GLuint *") MemorySegment arrays) {
        throw new ContextException();
    }

    default void glGenVertexArraysAPPLE(int n, @NativeType("GLuint *") MemorySegment arrays) {
        throw new ContextException();
    }

    default boolean glIsVertexArrayAPPLE(int array) {
        throw new ContextException();
    }

}
