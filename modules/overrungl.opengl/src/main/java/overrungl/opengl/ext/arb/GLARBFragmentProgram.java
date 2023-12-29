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
 * {@code GL_ARB_fragment_program}
 */
public final class GLARBFragmentProgram {
    public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;
    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
    public static final int GL_PROGRAM_LENGTH_ARB = 0x8627;
    public static final int GL_PROGRAM_FORMAT_ARB = 0x8876;
    public static final int GL_PROGRAM_BINDING_ARB = 0x8677;
    public static final int GL_PROGRAM_INSTRUCTIONS_ARB = 0x88A0;
    public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 0x88A1;
    public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A2;
    public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A3;
    public static final int GL_PROGRAM_TEMPORARIES_ARB = 0x88A4;
    public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = 0x88A5;
    public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A6;
    public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A7;
    public static final int GL_PROGRAM_PARAMETERS_ARB = 0x88A8;
    public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = 0x88A9;
    public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AA;
    public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AB;
    public static final int GL_PROGRAM_ATTRIBS_ARB = 0x88AC;
    public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = 0x88AD;
    public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AE;
    public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AF;
    public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
    public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
    public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
    public static final int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x8805;
    public static final int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x8806;
    public static final int GL_PROGRAM_TEX_INDIRECTIONS_ARB = 0x8807;
    public static final int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x8808;
    public static final int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x8809;
    public static final int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x880A;
    public static final int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x880B;
    public static final int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x880C;
    public static final int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = 0x880D;
    public static final int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;
    public static final int GL_PROGRAM_STRING_ARB = 0x8628;
    public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
    public static final int GL_CURRENT_MATRIX_ARB = 0x8641;
    public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
    public static final int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
    public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
    public static final int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
    public static final int GL_MATRIX0_ARB = 0x88C0;
    public static final int GL_MATRIX1_ARB = 0x88C1;
    public static final int GL_MATRIX2_ARB = 0x88C2;
    public static final int GL_MATRIX3_ARB = 0x88C3;
    public static final int GL_MATRIX4_ARB = 0x88C4;
    public static final int GL_MATRIX5_ARB = 0x88C5;
    public static final int GL_MATRIX6_ARB = 0x88C6;
    public static final int GL_MATRIX7_ARB = 0x88C7;
    public static final int GL_MATRIX8_ARB = 0x88C8;
    public static final int GL_MATRIX9_ARB = 0x88C9;
    public static final int GL_MATRIX10_ARB = 0x88CA;
    public static final int GL_MATRIX11_ARB = 0x88CB;
    public static final int GL_MATRIX12_ARB = 0x88CC;
    public static final int GL_MATRIX13_ARB = 0x88CD;
    public static final int GL_MATRIX14_ARB = 0x88CE;
    public static final int GL_MATRIX15_ARB = 0x88CF;
    public static final int GL_MATRIX16_ARB = 0x88D0;
    public static final int GL_MATRIX17_ARB = 0x88D1;
    public static final int GL_MATRIX18_ARB = 0x88D2;
    public static final int GL_MATRIX19_ARB = 0x88D3;
    public static final int GL_MATRIX20_ARB = 0x88D4;
    public static final int GL_MATRIX21_ARB = 0x88D5;
    public static final int GL_MATRIX22_ARB = 0x88D6;
    public static final int GL_MATRIX23_ARB = 0x88D7;
    public static final int GL_MATRIX24_ARB = 0x88D8;
    public static final int GL_MATRIX25_ARB = 0x88D9;
    public static final int GL_MATRIX26_ARB = 0x88DA;
    public static final int GL_MATRIX27_ARB = 0x88DB;
    public static final int GL_MATRIX28_ARB = 0x88DC;
    public static final int GL_MATRIX29_ARB = 0x88DD;
    public static final int GL_MATRIX30_ARB = 0x88DE;
    public static final int GL_MATRIX31_ARB = 0x88DF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_fragment_program) return;
        ext.glProgramStringARB = load.invoke("glProgramStringARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glBindProgramARB = load.invoke("glBindProgramARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteProgramsARB = load.invoke("glDeleteProgramsARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenProgramsARB = load.invoke("glGenProgramsARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glProgramEnvParameter4dARB = load.invoke("glProgramEnvParameter4dARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramEnvParameter4dvARB = load.invoke("glProgramEnvParameter4dvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramEnvParameter4fARB = load.invoke("glProgramEnvParameter4fARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramEnvParameter4fvARB = load.invoke("glProgramEnvParameter4fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramLocalParameter4dARB = load.invoke("glProgramLocalParameter4dARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramLocalParameter4dvARB = load.invoke("glProgramLocalParameter4dvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramLocalParameter4fARB = load.invoke("glProgramLocalParameter4fARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramLocalParameter4fvARB = load.invoke("glProgramLocalParameter4fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramEnvParameterdvARB = load.invoke("glGetProgramEnvParameterdvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramEnvParameterfvARB = load.invoke("glGetProgramEnvParameterfvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramLocalParameterdvARB = load.invoke("glGetProgramLocalParameterdvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramLocalParameterfvARB = load.invoke("glGetProgramLocalParameterfvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramivARB = load.invoke("glGetProgramivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramStringARB = load.invoke("glGetProgramStringARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsProgramARB = load.invoke("glIsProgramARB", of(JAVA_BYTE, JAVA_INT));
    }

    public static void glProgramStringARB(int target, int format, int len, @NativeType("const void *") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramStringARB).invokeExact(target, format, len, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindProgramARB(int target, int program) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindProgramARB).invokeExact(target, program);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteProgramsARB(int n, @NativeType("const GLuint *") MemorySegment programs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteProgramsARB).invokeExact(n, programs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenProgramsARB(int n, @NativeType("GLuint *") MemorySegment programs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenProgramsARB).invokeExact(n, programs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameter4dARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameter4dvARB(int target, int index, @NativeType("const GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameter4dvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameter4fARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramEnvParameter4fvARB(int target, int index, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramEnvParameter4fvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameter4dARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameter4dvARB(int target, int index, @NativeType("const GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameter4dvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameter4fARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramLocalParameter4fvARB(int target, int index, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramLocalParameter4fvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramEnvParameterdvARB(int target, int index, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramEnvParameterdvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramEnvParameterfvARB(int target, int index, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramEnvParameterfvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramLocalParameterdvARB(int target, int index, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramLocalParameterdvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramLocalParameterfvARB(int target, int index, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramLocalParameterfvARB).invokeExact(target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramivARB(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramivARB).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramStringARB(int target, int pname, @NativeType("void *") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramStringARB).invokeExact(target, pname, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsProgramARB(int program) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsProgramARB).invokeExact(program);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
