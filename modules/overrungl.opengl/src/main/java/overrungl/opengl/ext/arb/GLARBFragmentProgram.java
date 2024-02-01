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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_fragment_program}
 */
public interface GLARBFragmentProgram {
    int GL_FRAGMENT_PROGRAM_ARB = 0x8804;
    int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
    int GL_PROGRAM_LENGTH_ARB = 0x8627;
    int GL_PROGRAM_FORMAT_ARB = 0x8876;
    int GL_PROGRAM_BINDING_ARB = 0x8677;
    int GL_PROGRAM_INSTRUCTIONS_ARB = 0x88A0;
    int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 0x88A1;
    int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A2;
    int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A3;
    int GL_PROGRAM_TEMPORARIES_ARB = 0x88A4;
    int GL_MAX_PROGRAM_TEMPORARIES_ARB = 0x88A5;
    int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A6;
    int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A7;
    int GL_PROGRAM_PARAMETERS_ARB = 0x88A8;
    int GL_MAX_PROGRAM_PARAMETERS_ARB = 0x88A9;
    int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AA;
    int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AB;
    int GL_PROGRAM_ATTRIBS_ARB = 0x88AC;
    int GL_MAX_PROGRAM_ATTRIBS_ARB = 0x88AD;
    int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AE;
    int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AF;
    int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
    int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
    int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
    int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x8805;
    int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x8806;
    int GL_PROGRAM_TEX_INDIRECTIONS_ARB = 0x8807;
    int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x8808;
    int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x8809;
    int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x880A;
    int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x880B;
    int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x880C;
    int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = 0x880D;
    int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E;
    int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F;
    int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;
    int GL_PROGRAM_STRING_ARB = 0x8628;
    int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
    int GL_CURRENT_MATRIX_ARB = 0x8641;
    int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
    int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
    int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
    int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
    int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
    int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
    int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
    int GL_MATRIX0_ARB = 0x88C0;
    int GL_MATRIX1_ARB = 0x88C1;
    int GL_MATRIX2_ARB = 0x88C2;
    int GL_MATRIX3_ARB = 0x88C3;
    int GL_MATRIX4_ARB = 0x88C4;
    int GL_MATRIX5_ARB = 0x88C5;
    int GL_MATRIX6_ARB = 0x88C6;
    int GL_MATRIX7_ARB = 0x88C7;
    int GL_MATRIX8_ARB = 0x88C8;
    int GL_MATRIX9_ARB = 0x88C9;
    int GL_MATRIX10_ARB = 0x88CA;
    int GL_MATRIX11_ARB = 0x88CB;
    int GL_MATRIX12_ARB = 0x88CC;
    int GL_MATRIX13_ARB = 0x88CD;
    int GL_MATRIX14_ARB = 0x88CE;
    int GL_MATRIX15_ARB = 0x88CF;
    int GL_MATRIX16_ARB = 0x88D0;
    int GL_MATRIX17_ARB = 0x88D1;
    int GL_MATRIX18_ARB = 0x88D2;
    int GL_MATRIX19_ARB = 0x88D3;
    int GL_MATRIX20_ARB = 0x88D4;
    int GL_MATRIX21_ARB = 0x88D5;
    int GL_MATRIX22_ARB = 0x88D6;
    int GL_MATRIX23_ARB = 0x88D7;
    int GL_MATRIX24_ARB = 0x88D8;
    int GL_MATRIX25_ARB = 0x88D9;
    int GL_MATRIX26_ARB = 0x88DA;
    int GL_MATRIX27_ARB = 0x88DB;
    int GL_MATRIX28_ARB = 0x88DC;
    int GL_MATRIX29_ARB = 0x88DD;
    int GL_MATRIX30_ARB = 0x88DE;
    int GL_MATRIX31_ARB = 0x88DF;

    void glProgramStringARB(int target, int format, int len, @NativeType("const void *") MemorySegment string);
    void glBindProgramARB(int target, int program);
    void glDeleteProgramsARB(int n, @NativeType("const GLuint *") MemorySegment programs);
    void glGenProgramsARB(int n, @NativeType("GLuint *") MemorySegment programs);
    void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w);
    void glProgramEnvParameter4dvARB(int target, int index, @NativeType("const GLdouble *") MemorySegment params);
    void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w);
    void glProgramEnvParameter4fvARB(int target, int index, @NativeType("const GLfloat *") MemorySegment params);
    void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w);
    void glProgramLocalParameter4dvARB(int target, int index, @NativeType("const GLdouble *") MemorySegment params);
    void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w);
    void glProgramLocalParameter4fvARB(int target, int index, @NativeType("const GLfloat *") MemorySegment params);
    void glGetProgramEnvParameterdvARB(int target, int index, @NativeType("GLdouble *") MemorySegment params);
    void glGetProgramEnvParameterfvARB(int target, int index, @NativeType("GLfloat *") MemorySegment params);
    void glGetProgramLocalParameterdvARB(int target, int index, @NativeType("GLdouble *") MemorySegment params);
    void glGetProgramLocalParameterfvARB(int target, int index, @NativeType("GLfloat *") MemorySegment params);
    void glGetProgramivARB(int target, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetProgramStringARB(int target, int pname, @NativeType("void *") MemorySegment string);
    boolean glIsProgramARB(int program);
}
