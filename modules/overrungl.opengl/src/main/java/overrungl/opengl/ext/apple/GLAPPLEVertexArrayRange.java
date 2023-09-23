/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_APPLE_vertex_array_range}
  */
public final class GLAPPLEVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 0x851E;
    public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;
    public static final int GL_STORAGE_CLIENT_APPLE = 0x85B4;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_vertex_array_range) return;
        ext.glVertexArrayRangeAPPLE = load.invoke("glVertexArrayRangeAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glFlushVertexArrayRangeAPPLE = load.invoke("glFlushVertexArrayRangeAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexArrayParameteriAPPLE = load.invoke("glVertexArrayParameteriAPPLE", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glVertexArrayRangeAPPLE(int length, @NativeType("void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayRangeAPPLE).invokeExact(length, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFlushVertexArrayRangeAPPLE(int length, @NativeType("void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushVertexArrayRangeAPPLE).invokeExact(length, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayParameteriAPPLE(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayParameteriAPPLE).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
