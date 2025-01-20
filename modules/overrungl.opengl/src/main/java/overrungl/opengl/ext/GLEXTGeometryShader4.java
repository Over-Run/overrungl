/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glProgramParameteriEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glProgramParameteriEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramParameteriEXT);
        public final MemorySegment PFN_glProgramParameteriEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramParameteriEXT = func.invoke("glProgramParameteriEXT", "glProgramParameteri");
        }
    }

    public GLEXTGeometryShader4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ProgramParameteriEXT(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteriEXT");
        try { Handles.MH_glProgramParameteriEXT.invokeExact(handles.PFN_glProgramParameteriEXT, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteriEXT", e); }
    }

}
