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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_APPLE_vertex_array_object}
 */
public interface GLAPPLEVertexArrayObject {
    int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;

    void glBindVertexArrayAPPLE(int array);
    void glDeleteVertexArraysAPPLE(int n, @NativeType("const GLuint *") MemorySegment arrays);
    void glGenVertexArraysAPPLE(int n, @NativeType("GLuint *") MemorySegment arrays);
    boolean glIsVertexArrayAPPLE(int array);
}
