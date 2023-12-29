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
 * {@code GL_NV_shader_buffer_load}
 */
public final class GLNVShaderBufferLoad {
    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    public static final int GL_GPU_ADDRESS_NV = 0x8F34;
    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_shader_buffer_load) return;
        ext.glMakeBufferResidentNV = load.invoke("glMakeBufferResidentNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glMakeBufferNonResidentNV = load.invoke("glMakeBufferNonResidentNV", ofVoid(JAVA_INT));
        ext.glIsBufferResidentNV = load.invoke("glIsBufferResidentNV", of(JAVA_BYTE, JAVA_INT));
        ext.glMakeNamedBufferResidentNV = load.invoke("glMakeNamedBufferResidentNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glMakeNamedBufferNonResidentNV = load.invoke("glMakeNamedBufferNonResidentNV", ofVoid(JAVA_INT));
        ext.glIsNamedBufferResidentNV = load.invoke("glIsNamedBufferResidentNV", of(JAVA_BYTE, JAVA_INT));
        ext.glGetBufferParameterui64vNV = load.invoke("glGetBufferParameterui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedBufferParameterui64vNV = load.invoke("glGetNamedBufferParameterui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetIntegerui64vNV = load.invoke("glGetIntegerui64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glUniformui64NV = load.invoke("glUniformui64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniformui64vNV = load.invoke("glUniformui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniformui64NV = load.invoke("glProgramUniformui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniformui64vNV = load.invoke("glProgramUniformui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glMakeBufferResidentNV(int target, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeBufferResidentNV).invokeExact(target, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeBufferNonResidentNV(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeBufferNonResidentNV).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsBufferResidentNV(int target) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsBufferResidentNV).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeNamedBufferResidentNV(int buffer, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeNamedBufferResidentNV).invokeExact(buffer, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeNamedBufferNonResidentNV(int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeNamedBufferNonResidentNV).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsNamedBufferResidentNV(int buffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsNamedBufferResidentNV).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetBufferParameterui64vNV(int target, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetBufferParameterui64vNV).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedBufferParameterui64vNV(int buffer, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedBufferParameterui64vNV).invokeExact(buffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetIntegerui64vNV(int value, @NativeType("GLuint64EXT *") MemorySegment result) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetIntegerui64vNV).invokeExact(value, result);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformui64NV(int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformui64NV).invokeExact(location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformui64NV(int program, int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformui64NV).invokeExact(program, location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformui64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
