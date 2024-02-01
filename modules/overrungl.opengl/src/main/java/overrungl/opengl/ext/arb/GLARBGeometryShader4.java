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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_geometry_shader4}
 */
public interface GLARBGeometryShader4 {
    int GL_LINES_ADJACENCY_ARB = 0x000A;
    int GL_LINE_STRIP_ADJACENCY_ARB = 0x000B;
    int GL_TRIANGLES_ADJACENCY_ARB = 0x000C;
    int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0x000D;
    int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
    int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
    int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
    int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
    int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
    int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
    int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
    int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
    int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
    int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
    int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
    int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
    int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
    int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;

    default void glProgramParameteriARB(int program, int pname, int value) {
        throw new ContextException();
    }

    default void glFramebufferTextureARB(int target, int attachment, int texture, int level) {
        throw new ContextException();
    }

    default void glFramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
        throw new ContextException();
    }

    default void glFramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
        throw new ContextException();
    }

}
