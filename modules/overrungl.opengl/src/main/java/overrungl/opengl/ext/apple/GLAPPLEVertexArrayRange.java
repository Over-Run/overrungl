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
 * {@code GL_APPLE_vertex_array_range}
 */
public interface GLAPPLEVertexArrayRange extends overrun.marshal.DirectAccess {
    int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;
    int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 0x851E;
    int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;
    int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;
    int GL_STORAGE_CLIENT_APPLE = 0x85B4;

    default void glVertexArrayRangeAPPLE(int length, @NativeType("void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glFlushVertexArrayRangeAPPLE(int length, @NativeType("void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glVertexArrayParameteriAPPLE(int pname, int param) {
        throw new ContextException();
    }

}
