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
 * {@code GL_EXT_geometry_shader4}
 */
public final class GLEXTGeometryShader4 {
    public static final int GL_GEOMETRY_SHADER_EXT = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT_EXT = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_EXT = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 0x8C29;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT = 0x8DDD;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_EXT = 0x8DDE;
    public static final int GL_MAX_VARYING_COMPONENTS_EXT = 0x8B4B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 0x8DE1;
    public static final int GL_LINES_ADJACENCY_EXT = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_EXT = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_EXT = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 0x000D;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = 0x8DA9;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 0x8DA7;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;
    public static final int GL_PROGRAM_POINT_SIZE_EXT = 0x8642;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_geometry_shader4) return;
        ext.glProgramParameteriEXT = load.invoke("glProgramParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glProgramParameteriEXT(int program, int pname, int value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameteriEXT).invokeExact(program, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
