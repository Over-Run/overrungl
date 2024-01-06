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
 * {@code GL_NV_fragment_program}
 */
public final class GLNVFragmentProgram {
    public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
    public static final int GL_FRAGMENT_PROGRAM_NV = 0x8870;
    public static final int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
    public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
    public static final int GL_PROGRAM_ERROR_STRING_NV = 0x8874;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_fragment_program) return;
        ext.glProgramNamedParameter4fNV = load.invoke("glProgramNamedParameter4fNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramNamedParameter4fvNV = load.invoke("glProgramNamedParameter4fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glProgramNamedParameter4dNV = load.invoke("glProgramNamedParameter4dNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramNamedParameter4dvNV = load.invoke("glProgramNamedParameter4dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetProgramNamedParameterfvNV = load.invoke("glGetProgramNamedParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetProgramNamedParameterdvNV = load.invoke("glGetProgramNamedParameterdvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glProgramNamedParameter4fNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramNamedParameter4fNV).invokeExact(id, len, name, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramNamedParameter4fvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramNamedParameter4fvNV).invokeExact(id, len, name, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramNamedParameter4dNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramNamedParameter4dNV).invokeExact(id, len, name, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramNamedParameter4dvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramNamedParameter4dvNV).invokeExact(id, len, name, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramNamedParameterfvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramNamedParameterfvNV).invokeExact(id, len, name, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramNamedParameterdvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramNamedParameterdvNV).invokeExact(id, len, name, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
