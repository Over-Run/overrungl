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
 * {@code GL_NV_vertex_array_range}
 */
public interface GLNVVertexArrayRange {
    int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;
    int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 0x851E;
    int GL_VERTEX_ARRAY_RANGE_VALID_NV = 0x851F;
    int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;
    int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;

    default void glFlushVertexArrayRangeNV() {
        throw new ContextException();
    }

    default void glVertexArrayRangeNV(int length, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

}
