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
 * {@code GL_NV_parameter_buffer_object}
 */
public final class GLNVParameterBufferObject {
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 0x8DA0;
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 0x8DA1;
    public static final int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA2;
    public static final int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA3;
    public static final int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA4;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_parameter_buffer_object) return;
        ext.glProgramBufferParametersfvNV = load.invoke("glProgramBufferParametersfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramBufferParametersIivNV = load.invoke("glProgramBufferParametersIivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramBufferParametersIuivNV = load.invoke("glProgramBufferParametersIuivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glProgramBufferParametersfvNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramBufferParametersfvNV).invokeExact(target, bindingIndex, wordIndex, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramBufferParametersIivNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramBufferParametersIivNV).invokeExact(target, bindingIndex, wordIndex, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramBufferParametersIuivNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramBufferParametersIuivNV).invokeExact(target, bindingIndex, wordIndex, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
