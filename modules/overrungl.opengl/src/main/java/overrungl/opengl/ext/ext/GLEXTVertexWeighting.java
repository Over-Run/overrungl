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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_vertex_weighting}
 */
public final class GLEXTVertexWeighting {
    public static final int GL_MODELVIEW0_STACK_DEPTH_EXT = 0x0BA3;
    public static final int GL_MODELVIEW1_STACK_DEPTH_EXT = 0x8502;
    public static final int GL_MODELVIEW0_MATRIX_EXT = 0x0BA6;
    public static final int GL_MODELVIEW1_MATRIX_EXT = 0x8506;
    public static final int GL_VERTEX_WEIGHTING_EXT = 0x8509;
    public static final int GL_MODELVIEW0_EXT = 0x1700;
    public static final int GL_MODELVIEW1_EXT = 0x850A;
    public static final int GL_CURRENT_VERTEX_WEIGHT_EXT = 0x850B;
    public static final int GL_VERTEX_WEIGHT_ARRAY_EXT = 0x850C;
    public static final int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = 0x850D;
    public static final int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = 0x850E;
    public static final int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = 0x850F;
    public static final int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = 0x8510;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_vertex_weighting) return;
        ext.glVertexWeightfEXT = load.invoke("glVertexWeightfEXT", ofVoid(JAVA_FLOAT));
        ext.glVertexWeightfvEXT = load.invoke("glVertexWeightfvEXT", ofVoid(ADDRESS));
        ext.glVertexWeightPointerEXT = load.invoke("glVertexWeightPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glVertexWeightfEXT(float weight) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexWeightfEXT).invokeExact(weight);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexWeightfvEXT(@NativeType("const GLfloat *") MemorySegment weight) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexWeightfvEXT).invokeExact(weight);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexWeightPointerEXT(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexWeightPointerEXT).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
