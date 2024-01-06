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
 * {@code GL_NV_vertex_program}
 */
public final class GLNVVertexProgram {
    public static final int GL_VERTEX_PROGRAM_NV = 0x8620;
    public static final int GL_VERTEX_STATE_PROGRAM_NV = 0x8621;
    public static final int GL_ATTRIB_ARRAY_SIZE_NV = 0x8623;
    public static final int GL_ATTRIB_ARRAY_STRIDE_NV = 0x8624;
    public static final int GL_ATTRIB_ARRAY_TYPE_NV = 0x8625;
    public static final int GL_CURRENT_ATTRIB_NV = 0x8626;
    public static final int GL_PROGRAM_LENGTH_NV = 0x8627;
    public static final int GL_PROGRAM_STRING_NV = 0x8628;
    public static final int GL_MODELVIEW_PROJECTION_NV = 0x8629;
    public static final int GL_IDENTITY_NV = 0x862A;
    public static final int GL_INVERSE_NV = 0x862B;
    public static final int GL_TRANSPOSE_NV = 0x862C;
    public static final int GL_INVERSE_TRANSPOSE_NV = 0x862D;
    public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 0x862E;
    public static final int GL_MAX_TRACK_MATRICES_NV = 0x862F;
    public static final int GL_MATRIX0_NV = 0x8630;
    public static final int GL_MATRIX1_NV = 0x8631;
    public static final int GL_MATRIX2_NV = 0x8632;
    public static final int GL_MATRIX3_NV = 0x8633;
    public static final int GL_MATRIX4_NV = 0x8634;
    public static final int GL_MATRIX5_NV = 0x8635;
    public static final int GL_MATRIX6_NV = 0x8636;
    public static final int GL_MATRIX7_NV = 0x8637;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 0x8640;
    public static final int GL_CURRENT_MATRIX_NV = 0x8641;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 0x8643;
    public static final int GL_PROGRAM_PARAMETER_NV = 0x8644;
    public static final int GL_ATTRIB_ARRAY_POINTER_NV = 0x8645;
    public static final int GL_PROGRAM_TARGET_NV = 0x8646;
    public static final int GL_PROGRAM_RESIDENT_NV = 0x8647;
    public static final int GL_TRACK_MATRIX_NV = 0x8648;
    public static final int GL_TRACK_MATRIX_TRANSFORM_NV = 0x8649;
    public static final int GL_VERTEX_PROGRAM_BINDING_NV = 0x864A;
    public static final int GL_PROGRAM_ERROR_POSITION_NV = 0x864B;
    public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = 0x8650;
    public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = 0x8651;
    public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = 0x8652;
    public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = 0x8653;
    public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = 0x8654;
    public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = 0x8655;
    public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = 0x8656;
    public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = 0x8657;
    public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = 0x8658;
    public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = 0x8659;
    public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = 0x865A;
    public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = 0x865B;
    public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = 0x865C;
    public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = 0x865D;
    public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = 0x865E;
    public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = 0x865F;
    public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = 0x8660;
    public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = 0x8661;
    public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = 0x8662;
    public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = 0x8663;
    public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = 0x8664;
    public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = 0x8665;
    public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = 0x8666;
    public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = 0x8667;
    public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = 0x8668;
    public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = 0x8669;
    public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = 0x866A;
    public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = 0x866B;
    public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = 0x866C;
    public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = 0x866D;
    public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = 0x866E;
    public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = 0x866F;
    public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = 0x8670;
    public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = 0x8671;
    public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = 0x8672;
    public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = 0x8673;
    public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = 0x8674;
    public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = 0x8675;
    public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = 0x8676;
    public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = 0x8677;
    public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = 0x8678;
    public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = 0x8679;
    public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = 0x867A;
    public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = 0x867B;
    public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = 0x867C;
    public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = 0x867D;
    public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = 0x867E;
    public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = 0x867F;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_vertex_program) return;
        ext.glAreProgramsResidentNV = load.invoke("glAreProgramsResidentNV", of(JAVA_BYTE, JAVA_INT, ADDRESS, ADDRESS));
        ext.glBindProgramNV = load.invoke("glBindProgramNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteProgramsNV = load.invoke("glDeleteProgramsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glExecuteProgramNV = load.invoke("glExecuteProgramNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGenProgramsNV = load.invoke("glGenProgramsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetProgramParameterdvNV = load.invoke("glGetProgramParameterdvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramParameterfvNV = load.invoke("glGetProgramParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramivNV = load.invoke("glGetProgramivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramStringNV = load.invoke("glGetProgramStringNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTrackMatrixivNV = load.invoke("glGetTrackMatrixivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribdvNV = load.invoke("glGetVertexAttribdvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribfvNV = load.invoke("glGetVertexAttribfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribivNV = load.invoke("glGetVertexAttribivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribPointervNV = load.invoke("glGetVertexAttribPointervNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsProgramNV = load.invoke("glIsProgramNV", of(JAVA_BYTE, JAVA_INT));
        ext.glLoadProgramNV = load.invoke("glLoadProgramNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramParameter4dNV = load.invoke("glProgramParameter4dNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramParameter4dvNV = load.invoke("glProgramParameter4dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramParameter4fNV = load.invoke("glProgramParameter4fNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramParameter4fvNV = load.invoke("glProgramParameter4fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramParameters4dvNV = load.invoke("glProgramParameters4dvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramParameters4fvNV = load.invoke("glProgramParameters4fvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glRequestResidentProgramsNV = load.invoke("glRequestResidentProgramsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glTrackMatrixNV = load.invoke("glTrackMatrixNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribPointerNV = load.invoke("glVertexAttribPointerNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttrib1dNV = load.invoke("glVertexAttrib1dNV", ofVoid(JAVA_INT, JAVA_DOUBLE));
        ext.glVertexAttrib1dvNV = load.invoke("glVertexAttrib1dvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib1fNV = load.invoke("glVertexAttrib1fNV", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glVertexAttrib1fvNV = load.invoke("glVertexAttrib1fvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib1sNV = load.invoke("glVertexAttrib1sNV", ofVoid(JAVA_INT, JAVA_SHORT));
        ext.glVertexAttrib1svNV = load.invoke("glVertexAttrib1svNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2dNV = load.invoke("glVertexAttrib2dNV", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib2dvNV = load.invoke("glVertexAttrib2dvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2fNV = load.invoke("glVertexAttrib2fNV", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib2fvNV = load.invoke("glVertexAttrib2fvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2sNV = load.invoke("glVertexAttrib2sNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib2svNV = load.invoke("glVertexAttrib2svNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3dNV = load.invoke("glVertexAttrib3dNV", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib3dvNV = load.invoke("glVertexAttrib3dvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3fNV = load.invoke("glVertexAttrib3fNV", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib3fvNV = load.invoke("glVertexAttrib3fvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3sNV = load.invoke("glVertexAttrib3sNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib3svNV = load.invoke("glVertexAttrib3svNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4dNV = load.invoke("glVertexAttrib4dNV", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib4dvNV = load.invoke("glVertexAttrib4dvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4fNV = load.invoke("glVertexAttrib4fNV", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib4fvNV = load.invoke("glVertexAttrib4fvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4sNV = load.invoke("glVertexAttrib4sNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib4svNV = load.invoke("glVertexAttrib4svNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4ubNV = load.invoke("glVertexAttrib4ubNV", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glVertexAttrib4ubvNV = load.invoke("glVertexAttrib4ubvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribs1dvNV = load.invoke("glVertexAttribs1dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs1fvNV = load.invoke("glVertexAttribs1fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs1svNV = load.invoke("glVertexAttribs1svNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs2dvNV = load.invoke("glVertexAttribs2dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs2fvNV = load.invoke("glVertexAttribs2fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs2svNV = load.invoke("glVertexAttribs2svNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs3dvNV = load.invoke("glVertexAttribs3dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs3fvNV = load.invoke("glVertexAttribs3fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs3svNV = load.invoke("glVertexAttribs3svNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs4dvNV = load.invoke("glVertexAttribs4dvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs4fvNV = load.invoke("glVertexAttribs4fvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs4svNV = load.invoke("glVertexAttribs4svNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs4ubvNV = load.invoke("glVertexAttribs4ubvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static boolean glAreProgramsResidentNV(int n, @NativeType("const GLuint *") MemorySegment programs, @NativeType("GLboolean *") MemorySegment residences) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glAreProgramsResidentNV).invokeExact(n, programs, residences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindProgramNV(int target, int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindProgramNV).invokeExact(target, id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteProgramsNV(int n, @NativeType("const GLuint *") MemorySegment programs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteProgramsNV).invokeExact(n, programs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glExecuteProgramNV(int target, int id, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glExecuteProgramNV).invokeExact(target, id, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenProgramsNV(int n, @NativeType("GLuint *") MemorySegment programs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenProgramsNV).invokeExact(n, programs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramParameterdvNV(int target, int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramParameterdvNV).invokeExact(target, index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramParameterfvNV(int target, int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramParameterfvNV).invokeExact(target, index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramivNV(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramivNV).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramStringNV(int id, int pname, @NativeType("GLubyte *") MemorySegment program) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramStringNV).invokeExact(id, pname, program);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTrackMatrixivNV(int target, int address, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTrackMatrixivNV).invokeExact(target, address, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribdvNV(int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribdvNV).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribfvNV(int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribfvNV).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribivNV(int index, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribivNV).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribPointervNV(int index, int pname, @NativeType("void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribPointervNV).invokeExact(index, pname, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsProgramNV(int id) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsProgramNV).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLoadProgramNV(int target, int id, int len, @NativeType("const GLubyte *") MemorySegment program) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadProgramNV).invokeExact(target, id, len, program);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameter4dNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameter4dvNV(int target, int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameter4dvNV).invokeExact(target, index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameter4fNV).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameter4fvNV(int target, int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameter4fvNV).invokeExact(target, index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameters4dvNV(int target, int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameters4dvNV).invokeExact(target, index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramParameters4fvNV(int target, int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameters4fvNV).invokeExact(target, index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRequestResidentProgramsNV(int n, @NativeType("const GLuint *") MemorySegment programs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRequestResidentProgramsNV).invokeExact(n, programs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTrackMatrixNV(int target, int address, int matrix, int transform) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTrackMatrixNV).invokeExact(target, address, matrix, transform);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribPointerNV(int index, int fsize, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribPointerNV).invokeExact(index, fsize, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1dNV(int index, double x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1dNV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1dvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1fNV(int index, float x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1fNV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1fvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1sNV(int index, short x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1sNV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1svNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2dNV(int index, double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2dNV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2dvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2fNV(int index, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2fNV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2fvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2sNV(int index, short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2sNV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2svNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3dNV(int index, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3dNV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3dvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3fNV(int index, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3fNV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3fvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3sNV(int index, short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3sNV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3svNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4dNV(int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4dNV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4dvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4fNV(int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4fNV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4fvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4sNV(int index, short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4sNV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4svNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4ubNV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4ubvNV(int index, @NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4ubvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs1dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs1dvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs1fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs1fvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs1svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs1svNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs2dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs2dvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs2fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs2fvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs2svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs2svNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs3dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs3dvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs3fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs3fvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs3svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs3svNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs4dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs4dvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs4fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs4fvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs4svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs4svNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs4ubvNV(int index, int count, @NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs4ubvNV).invokeExact(index, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
