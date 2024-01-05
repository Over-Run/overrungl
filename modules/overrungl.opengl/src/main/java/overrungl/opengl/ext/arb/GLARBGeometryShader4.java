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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_geometry_shader4}
 */
public final class GLARBGeometryShader4 {
    public static final int GL_LINES_ADJACENCY_ARB = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_ARB = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_ARB = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
    public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_geometry_shader4) return;
        ext.glProgramParameteriARB = load.invoke("glProgramParameteriARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTextureARB = load.invoke("glFramebufferTextureARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTextureLayerARB = load.invoke("glFramebufferTextureLayerARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTextureFaceARB = load.invoke("glFramebufferTextureFaceARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glProgramParameteriARB(int program, int pname, int value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameteriARB).invokeExact(program, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTextureARB(int target, int attachment, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureARB).invokeExact(target, attachment, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureLayerARB).invokeExact(target, attachment, texture, level, layer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureFaceARB).invokeExact(target, attachment, texture, level, face);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
