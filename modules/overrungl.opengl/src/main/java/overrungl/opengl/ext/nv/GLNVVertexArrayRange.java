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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_vertex_array_range}
 */
public final class GLNVVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 0x851E;
    public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 0x851F;
    public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_vertex_array_range) return;
        ext.glFlushVertexArrayRangeNV = load.invoke("glFlushVertexArrayRangeNV", ofVoid());
        ext.glVertexArrayRangeNV = load.invoke("glVertexArrayRangeNV", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glFlushVertexArrayRangeNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushVertexArrayRangeNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayRangeNV(int length, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayRangeNV).invokeExact(length, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
