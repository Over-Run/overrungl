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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_vertex_program}
 */
public interface GLNVVertexProgram {
    int GL_VERTEX_PROGRAM_NV = 0x8620;
    int GL_VERTEX_STATE_PROGRAM_NV = 0x8621;
    int GL_ATTRIB_ARRAY_SIZE_NV = 0x8623;
    int GL_ATTRIB_ARRAY_STRIDE_NV = 0x8624;
    int GL_ATTRIB_ARRAY_TYPE_NV = 0x8625;
    int GL_CURRENT_ATTRIB_NV = 0x8626;
    int GL_PROGRAM_LENGTH_NV = 0x8627;
    int GL_PROGRAM_STRING_NV = 0x8628;
    int GL_MODELVIEW_PROJECTION_NV = 0x8629;
    int GL_IDENTITY_NV = 0x862A;
    int GL_INVERSE_NV = 0x862B;
    int GL_TRANSPOSE_NV = 0x862C;
    int GL_INVERSE_TRANSPOSE_NV = 0x862D;
    int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 0x862E;
    int GL_MAX_TRACK_MATRICES_NV = 0x862F;
    int GL_MATRIX0_NV = 0x8630;
    int GL_MATRIX1_NV = 0x8631;
    int GL_MATRIX2_NV = 0x8632;
    int GL_MATRIX3_NV = 0x8633;
    int GL_MATRIX4_NV = 0x8634;
    int GL_MATRIX5_NV = 0x8635;
    int GL_MATRIX6_NV = 0x8636;
    int GL_MATRIX7_NV = 0x8637;
    int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 0x8640;
    int GL_CURRENT_MATRIX_NV = 0x8641;
    int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 0x8642;
    int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 0x8643;
    int GL_PROGRAM_PARAMETER_NV = 0x8644;
    int GL_ATTRIB_ARRAY_POINTER_NV = 0x8645;
    int GL_PROGRAM_TARGET_NV = 0x8646;
    int GL_PROGRAM_RESIDENT_NV = 0x8647;
    int GL_TRACK_MATRIX_NV = 0x8648;
    int GL_TRACK_MATRIX_TRANSFORM_NV = 0x8649;
    int GL_VERTEX_PROGRAM_BINDING_NV = 0x864A;
    int GL_PROGRAM_ERROR_POSITION_NV = 0x864B;
    int GL_VERTEX_ATTRIB_ARRAY0_NV = 0x8650;
    int GL_VERTEX_ATTRIB_ARRAY1_NV = 0x8651;
    int GL_VERTEX_ATTRIB_ARRAY2_NV = 0x8652;
    int GL_VERTEX_ATTRIB_ARRAY3_NV = 0x8653;
    int GL_VERTEX_ATTRIB_ARRAY4_NV = 0x8654;
    int GL_VERTEX_ATTRIB_ARRAY5_NV = 0x8655;
    int GL_VERTEX_ATTRIB_ARRAY6_NV = 0x8656;
    int GL_VERTEX_ATTRIB_ARRAY7_NV = 0x8657;
    int GL_VERTEX_ATTRIB_ARRAY8_NV = 0x8658;
    int GL_VERTEX_ATTRIB_ARRAY9_NV = 0x8659;
    int GL_VERTEX_ATTRIB_ARRAY10_NV = 0x865A;
    int GL_VERTEX_ATTRIB_ARRAY11_NV = 0x865B;
    int GL_VERTEX_ATTRIB_ARRAY12_NV = 0x865C;
    int GL_VERTEX_ATTRIB_ARRAY13_NV = 0x865D;
    int GL_VERTEX_ATTRIB_ARRAY14_NV = 0x865E;
    int GL_VERTEX_ATTRIB_ARRAY15_NV = 0x865F;
    int GL_MAP1_VERTEX_ATTRIB0_4_NV = 0x8660;
    int GL_MAP1_VERTEX_ATTRIB1_4_NV = 0x8661;
    int GL_MAP1_VERTEX_ATTRIB2_4_NV = 0x8662;
    int GL_MAP1_VERTEX_ATTRIB3_4_NV = 0x8663;
    int GL_MAP1_VERTEX_ATTRIB4_4_NV = 0x8664;
    int GL_MAP1_VERTEX_ATTRIB5_4_NV = 0x8665;
    int GL_MAP1_VERTEX_ATTRIB6_4_NV = 0x8666;
    int GL_MAP1_VERTEX_ATTRIB7_4_NV = 0x8667;
    int GL_MAP1_VERTEX_ATTRIB8_4_NV = 0x8668;
    int GL_MAP1_VERTEX_ATTRIB9_4_NV = 0x8669;
    int GL_MAP1_VERTEX_ATTRIB10_4_NV = 0x866A;
    int GL_MAP1_VERTEX_ATTRIB11_4_NV = 0x866B;
    int GL_MAP1_VERTEX_ATTRIB12_4_NV = 0x866C;
    int GL_MAP1_VERTEX_ATTRIB13_4_NV = 0x866D;
    int GL_MAP1_VERTEX_ATTRIB14_4_NV = 0x866E;
    int GL_MAP1_VERTEX_ATTRIB15_4_NV = 0x866F;
    int GL_MAP2_VERTEX_ATTRIB0_4_NV = 0x8670;
    int GL_MAP2_VERTEX_ATTRIB1_4_NV = 0x8671;
    int GL_MAP2_VERTEX_ATTRIB2_4_NV = 0x8672;
    int GL_MAP2_VERTEX_ATTRIB3_4_NV = 0x8673;
    int GL_MAP2_VERTEX_ATTRIB4_4_NV = 0x8674;
    int GL_MAP2_VERTEX_ATTRIB5_4_NV = 0x8675;
    int GL_MAP2_VERTEX_ATTRIB6_4_NV = 0x8676;
    int GL_MAP2_VERTEX_ATTRIB7_4_NV = 0x8677;
    int GL_MAP2_VERTEX_ATTRIB8_4_NV = 0x8678;
    int GL_MAP2_VERTEX_ATTRIB9_4_NV = 0x8679;
    int GL_MAP2_VERTEX_ATTRIB10_4_NV = 0x867A;
    int GL_MAP2_VERTEX_ATTRIB11_4_NV = 0x867B;
    int GL_MAP2_VERTEX_ATTRIB12_4_NV = 0x867C;
    int GL_MAP2_VERTEX_ATTRIB13_4_NV = 0x867D;
    int GL_MAP2_VERTEX_ATTRIB14_4_NV = 0x867E;
    int GL_MAP2_VERTEX_ATTRIB15_4_NV = 0x867F;

    default boolean glAreProgramsResidentNV(int n, @NativeType("const GLuint *") MemorySegment programs, @NativeType("GLboolean *") MemorySegment residences) {
        throw new ContextException();
    }

    default void glBindProgramNV(int target, int id) {
        throw new ContextException();
    }

    default void glDeleteProgramsNV(int n, @NativeType("const GLuint *") MemorySegment programs) {
        throw new ContextException();
    }

    default void glExecuteProgramNV(int target, int id, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGenProgramsNV(int n, @NativeType("GLuint *") MemorySegment programs) {
        throw new ContextException();
    }

    default void glGetProgramParameterdvNV(int target, int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramParameterfvNV(int target, int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramivNV(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramStringNV(int id, int pname, @NativeType("GLubyte *") MemorySegment program) {
        throw new ContextException();
    }

    default void glGetTrackMatrixivNV(int target, int address, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVertexAttribdvNV(int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVertexAttribfvNV(int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVertexAttribivNV(int index, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVertexAttribPointervNV(int index, int pname, @NativeType("void **") MemorySegment pointer) {
        throw new ContextException();
    }

    default boolean glIsProgramNV(int id) {
        throw new ContextException();
    }

    default void glLoadProgramNV(int target, int id, int len, @NativeType("const GLubyte *") MemorySegment program) {
        throw new ContextException();
    }

    default void glProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glProgramParameter4dvNV(int target, int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glProgramParameter4fvNV(int target, int index, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glProgramParameters4dvNV(int target, int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glProgramParameters4fvNV(int target, int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glRequestResidentProgramsNV(int n, @NativeType("const GLuint *") MemorySegment programs) {
        throw new ContextException();
    }

    default void glTrackMatrixNV(int target, int address, int matrix, int transform) {
        throw new ContextException();
    }

    default void glVertexAttribPointerNV(int index, int fsize, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glVertexAttrib1dNV(int index, double x) {
        throw new ContextException();
    }

    default void glVertexAttrib1dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib1fNV(int index, float x) {
        throw new ContextException();
    }

    default void glVertexAttrib1fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib1sNV(int index, short x) {
        throw new ContextException();
    }

    default void glVertexAttrib1svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib2dNV(int index, double x, double y) {
        throw new ContextException();
    }

    default void glVertexAttrib2dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib2fNV(int index, float x, float y) {
        throw new ContextException();
    }

    default void glVertexAttrib2fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib2sNV(int index, short x, short y) {
        throw new ContextException();
    }

    default void glVertexAttrib2svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib3dNV(int index, double x, double y, double z) {
        throw new ContextException();
    }

    default void glVertexAttrib3dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib3fNV(int index, float x, float y, float z) {
        throw new ContextException();
    }

    default void glVertexAttrib3fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib3sNV(int index, short x, short y, short z) {
        throw new ContextException();
    }

    default void glVertexAttrib3svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib4dNV(int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glVertexAttrib4dvNV(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib4fNV(int index, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glVertexAttrib4fvNV(int index, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib4sNV(int index, short x, short y, short z, short w) {
        throw new ContextException();
    }

    default void glVertexAttrib4svNV(int index, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
        throw new ContextException();
    }

    default void glVertexAttrib4ubvNV(int index, @NativeType("const GLubyte *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs1dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs1fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs1svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs2dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs2fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs2svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs3dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs3fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs3svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs4dvNV(int index, int count, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs4fvNV(int index, int count, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs4svNV(int index, int count, @NativeType("const GLshort *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs4ubvNV(int index, int count, @NativeType("const GLubyte *") MemorySegment v) {
        throw new ContextException();
    }

}
