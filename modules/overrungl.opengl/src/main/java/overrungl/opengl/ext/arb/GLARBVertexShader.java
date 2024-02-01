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
 * {@code GL_ARB_vertex_shader}
 */
public interface GLARBVertexShader {
    int GL_VERTEX_SHADER_ARB = 0x8B31;
    int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = 0x8B4A;
    int GL_MAX_VARYING_FLOATS_ARB = 0x8B4B;
    int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = 0x8B4C;
    int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D;
    int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = 0x8B89;
    int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;

    default void glBindAttribLocationARB(int programObj, int index, @NativeType("const GLcharARB *") MemorySegment name) {
        throw new ContextException();
    }

    default void glGetActiveAttribARB(int programObj, int index, int maxLength, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLint *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLcharARB *") MemorySegment name) {
        throw new ContextException();
    }

    default int glGetAttribLocationARB(int programObj, @NativeType("const GLcharARB *") MemorySegment name) {
        throw new ContextException();
    }

}
