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
package overrungl.opengl.ext.intel;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_INTEL_parallel_arrays}
  */
public final class GLINTELParallelArrays {
    public static final int GL_PARALLEL_ARRAYS_INTEL = 0x83F4;
    public static final int GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F5;
    public static final int GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F6;
    public static final int GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F7;
    public static final int GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F8;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_parallel_arrays) return;
        ext.glVertexPointervINTEL = load.invoke("glVertexPointervINTEL", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNormalPointervINTEL = load.invoke("glNormalPointervINTEL", ofVoid(JAVA_INT, ADDRESS));
        ext.glColorPointervINTEL = load.invoke("glColorPointervINTEL", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexCoordPointervINTEL = load.invoke("glTexCoordPointervINTEL", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glVertexPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalPointervINTEL(int type, @NativeType("const void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalPointervINTEL).invokeExact(type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoordPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoordPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
