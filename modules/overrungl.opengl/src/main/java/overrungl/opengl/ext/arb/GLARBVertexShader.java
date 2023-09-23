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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_vertex_shader}
  */
public final class GLARBVertexShader {
    public static final int GL_VERTEX_SHADER_ARB = 0x8B31;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS_ARB = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D;
    public static final int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = 0x8B89;
    public static final int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_vertex_shader) return;
        ext.glBindAttribLocationARB = load.invoke("glBindAttribLocationARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetActiveAttribARB = load.invoke("glGetActiveAttribARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glGetAttribLocationARB = load.invoke("glGetAttribLocationARB", of(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBindAttribLocationARB(int programObj, int index, @NativeType("const GLcharARB *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindAttribLocationARB).invokeExact(programObj, index, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetActiveAttribARB(int programObj, int index, int maxLength, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLint *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLcharARB *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetActiveAttribARB).invokeExact(programObj, index, maxLength, length, size, type, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetAttribLocationARB(int programObj, @NativeType("const GLcharARB *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetAttribLocationARB).invokeExact(programObj, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
