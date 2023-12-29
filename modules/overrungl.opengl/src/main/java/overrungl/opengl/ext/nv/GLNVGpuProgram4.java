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
 * {@code GL_NV_gpu_program4}
 */
public final class GLNVGpuProgram4 {
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = 0x8905;
    public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8906;
    public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = 0x8907;
    public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8908;
    public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 0x8909;
    public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 0x8DA5;
    public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 0x8DA6;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_gpu_program4) return;
        ext.glProgramLocalParameterI4iNV = load.invoke("glProgramLocalParameterI4iNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramLocalParameterI4ivNV = load.invoke("glProgramLocalParameterI4ivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramLocalParametersI4ivNV = load.invoke("glProgramLocalParametersI4ivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramLocalParameterI4uiNV = load.invoke("glProgramLocalParameterI4uiNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramLocalParameterI4uivNV = load.invoke("glProgramLocalParameterI4uivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramLocalParametersI4uivNV = load.invoke("glProgramLocalParametersI4uivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramEnvParameterI4iNV = load.invoke("glProgramEnvParameterI4iNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramEnvParameterI4ivNV = load.invoke("glProgramEnvParameterI4ivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramEnvParametersI4ivNV = load.invoke("glProgramEnvParametersI4ivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramEnvParameterI4uiNV = load.invoke("glProgramEnvParameterI4uiNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramEnvParameterI4uivNV = load.invoke("glProgramEnvParameterI4uivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramEnvParametersI4uivNV = load.invoke("glProgramEnvParametersI4uivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramLocalParameterIivNV = load.invoke("glGetProgramLocalParameterIivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramLocalParameterIuivNV = load.invoke("glGetProgramLocalParameterIuivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramEnvParameterIivNV = load.invoke("glGetProgramEnvParameterIivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramEnvParameterIuivNV = load.invoke("glGetProgramEnvParameterIuivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glProgramLocalParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameterI4iNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameterI4ivNV(int target, int index, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameterI4ivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParametersI4ivNV(int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParametersI4ivNV).invokeExact(target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameterI4uiNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameterI4uivNV(int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameterI4uivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParametersI4uivNV(int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParametersI4uivNV).invokeExact(target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameterI4iNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameterI4ivNV(int target, int index, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameterI4ivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParametersI4ivNV(int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParametersI4ivNV).invokeExact(target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameterI4uiNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameterI4uivNV(int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameterI4uivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParametersI4uivNV(int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParametersI4uivNV).invokeExact(target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramLocalParameterIivNV(int target, int index, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramLocalParameterIivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramLocalParameterIuivNV(int target, int index, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramLocalParameterIuivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramEnvParameterIivNV(int target, int index, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramEnvParameterIivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramEnvParameterIuivNV(int target, int index, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramEnvParameterIuivNV).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
