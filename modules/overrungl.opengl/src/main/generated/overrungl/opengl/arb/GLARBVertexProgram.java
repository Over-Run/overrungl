/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBVertexProgram {
    public static final int GL_COLOR_SUM_ARB = 0x8458;
    public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 0x8626;
    public static final int GL_PROGRAM_LENGTH_ARB = 0x8627;
    public static final int GL_PROGRAM_STRING_ARB = 0x8628;
    public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
    public static final int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
    public static final int GL_CURRENT_MATRIX_ARB = 0x8641;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 0x8643;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;
    public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
    public static final int GL_PROGRAM_BINDING_ARB = 0x8677;
    public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A;
    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
    public static final int GL_PROGRAM_FORMAT_ARB = 0x8876;
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
    public static final int GL_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B0;
    public static final int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B1;
    public static final int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B2;
    public static final int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3;
    public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
    public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
    public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
    public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttrib1dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib1dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib1fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib2dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib2fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib3dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib3fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NbvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NsvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NubARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexAttrib4NubvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NuivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NusvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4bvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ubvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4uivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4usvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribPointerARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableVertexAttribArrayARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexAttribArrayARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramsARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramsARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramEnvParameter4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramEnvParameter4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramLocalParameter4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramLocalParameter4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribPointervARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glVertexAttrib1dARB;
        public final MemorySegment PFN_glVertexAttrib1dvARB;
        public final MemorySegment PFN_glVertexAttrib1fARB;
        public final MemorySegment PFN_glVertexAttrib1fvARB;
        public final MemorySegment PFN_glVertexAttrib1sARB;
        public final MemorySegment PFN_glVertexAttrib1svARB;
        public final MemorySegment PFN_glVertexAttrib2dARB;
        public final MemorySegment PFN_glVertexAttrib2dvARB;
        public final MemorySegment PFN_glVertexAttrib2fARB;
        public final MemorySegment PFN_glVertexAttrib2fvARB;
        public final MemorySegment PFN_glVertexAttrib2sARB;
        public final MemorySegment PFN_glVertexAttrib2svARB;
        public final MemorySegment PFN_glVertexAttrib3dARB;
        public final MemorySegment PFN_glVertexAttrib3dvARB;
        public final MemorySegment PFN_glVertexAttrib3fARB;
        public final MemorySegment PFN_glVertexAttrib3fvARB;
        public final MemorySegment PFN_glVertexAttrib3sARB;
        public final MemorySegment PFN_glVertexAttrib3svARB;
        public final MemorySegment PFN_glVertexAttrib4NbvARB;
        public final MemorySegment PFN_glVertexAttrib4NivARB;
        public final MemorySegment PFN_glVertexAttrib4NsvARB;
        public final MemorySegment PFN_glVertexAttrib4NubARB;
        public final MemorySegment PFN_glVertexAttrib4NubvARB;
        public final MemorySegment PFN_glVertexAttrib4NuivARB;
        public final MemorySegment PFN_glVertexAttrib4NusvARB;
        public final MemorySegment PFN_glVertexAttrib4bvARB;
        public final MemorySegment PFN_glVertexAttrib4dARB;
        public final MemorySegment PFN_glVertexAttrib4dvARB;
        public final MemorySegment PFN_glVertexAttrib4fARB;
        public final MemorySegment PFN_glVertexAttrib4fvARB;
        public final MemorySegment PFN_glVertexAttrib4ivARB;
        public final MemorySegment PFN_glVertexAttrib4sARB;
        public final MemorySegment PFN_glVertexAttrib4svARB;
        public final MemorySegment PFN_glVertexAttrib4ubvARB;
        public final MemorySegment PFN_glVertexAttrib4uivARB;
        public final MemorySegment PFN_glVertexAttrib4usvARB;
        public final MemorySegment PFN_glVertexAttribPointerARB;
        public final MemorySegment PFN_glEnableVertexAttribArrayARB;
        public final MemorySegment PFN_glDisableVertexAttribArrayARB;
        public final MemorySegment PFN_glProgramStringARB;
        public final MemorySegment PFN_glBindProgramARB;
        public final MemorySegment PFN_glDeleteProgramsARB;
        public final MemorySegment PFN_glGenProgramsARB;
        public final MemorySegment PFN_glProgramEnvParameter4dARB;
        public final MemorySegment PFN_glProgramEnvParameter4dvARB;
        public final MemorySegment PFN_glProgramEnvParameter4fARB;
        public final MemorySegment PFN_glProgramEnvParameter4fvARB;
        public final MemorySegment PFN_glProgramLocalParameter4dARB;
        public final MemorySegment PFN_glProgramLocalParameter4dvARB;
        public final MemorySegment PFN_glProgramLocalParameter4fARB;
        public final MemorySegment PFN_glProgramLocalParameter4fvARB;
        public final MemorySegment PFN_glGetProgramEnvParameterdvARB;
        public final MemorySegment PFN_glGetProgramEnvParameterfvARB;
        public final MemorySegment PFN_glGetProgramLocalParameterdvARB;
        public final MemorySegment PFN_glGetProgramLocalParameterfvARB;
        public final MemorySegment PFN_glGetProgramivARB;
        public final MemorySegment PFN_glGetProgramStringARB;
        public final MemorySegment PFN_glGetVertexAttribdvARB;
        public final MemorySegment PFN_glGetVertexAttribfvARB;
        public final MemorySegment PFN_glGetVertexAttribivARB;
        public final MemorySegment PFN_glGetVertexAttribPointervARB;
        public final MemorySegment PFN_glIsProgramARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttrib1dARB = func.invoke("glVertexAttrib1dARB", "glVertexAttrib1d");
            PFN_glVertexAttrib1dvARB = func.invoke("glVertexAttrib1dvARB", "glVertexAttrib1dv");
            PFN_glVertexAttrib1fARB = func.invoke("glVertexAttrib1fARB", "glVertexAttrib1f");
            PFN_glVertexAttrib1fvARB = func.invoke("glVertexAttrib1fvARB", "glVertexAttrib1fv");
            PFN_glVertexAttrib1sARB = func.invoke("glVertexAttrib1sARB", "glVertexAttrib1s");
            PFN_glVertexAttrib1svARB = func.invoke("glVertexAttrib1svARB", "glVertexAttrib1sv");
            PFN_glVertexAttrib2dARB = func.invoke("glVertexAttrib2dARB", "glVertexAttrib2d");
            PFN_glVertexAttrib2dvARB = func.invoke("glVertexAttrib2dvARB", "glVertexAttrib2dv");
            PFN_glVertexAttrib2fARB = func.invoke("glVertexAttrib2fARB", "glVertexAttrib2f");
            PFN_glVertexAttrib2fvARB = func.invoke("glVertexAttrib2fvARB", "glVertexAttrib2fv");
            PFN_glVertexAttrib2sARB = func.invoke("glVertexAttrib2sARB", "glVertexAttrib2s");
            PFN_glVertexAttrib2svARB = func.invoke("glVertexAttrib2svARB", "glVertexAttrib2sv");
            PFN_glVertexAttrib3dARB = func.invoke("glVertexAttrib3dARB", "glVertexAttrib3d");
            PFN_glVertexAttrib3dvARB = func.invoke("glVertexAttrib3dvARB", "glVertexAttrib3dv");
            PFN_glVertexAttrib3fARB = func.invoke("glVertexAttrib3fARB", "glVertexAttrib3f");
            PFN_glVertexAttrib3fvARB = func.invoke("glVertexAttrib3fvARB", "glVertexAttrib3fv");
            PFN_glVertexAttrib3sARB = func.invoke("glVertexAttrib3sARB", "glVertexAttrib3s");
            PFN_glVertexAttrib3svARB = func.invoke("glVertexAttrib3svARB", "glVertexAttrib3sv");
            PFN_glVertexAttrib4NbvARB = func.invoke("glVertexAttrib4NbvARB", "glVertexAttrib4Nbv");
            PFN_glVertexAttrib4NivARB = func.invoke("glVertexAttrib4NivARB", "glVertexAttrib4Niv");
            PFN_glVertexAttrib4NsvARB = func.invoke("glVertexAttrib4NsvARB", "glVertexAttrib4Nsv");
            PFN_glVertexAttrib4NubARB = func.invoke("glVertexAttrib4NubARB", "glVertexAttrib4Nub");
            PFN_glVertexAttrib4NubvARB = func.invoke("glVertexAttrib4NubvARB", "glVertexAttrib4Nubv");
            PFN_glVertexAttrib4NuivARB = func.invoke("glVertexAttrib4NuivARB", "glVertexAttrib4Nuiv");
            PFN_glVertexAttrib4NusvARB = func.invoke("glVertexAttrib4NusvARB", "glVertexAttrib4Nusv");
            PFN_glVertexAttrib4bvARB = func.invoke("glVertexAttrib4bvARB", "glVertexAttrib4bv");
            PFN_glVertexAttrib4dARB = func.invoke("glVertexAttrib4dARB", "glVertexAttrib4d");
            PFN_glVertexAttrib4dvARB = func.invoke("glVertexAttrib4dvARB", "glVertexAttrib4dv");
            PFN_glVertexAttrib4fARB = func.invoke("glVertexAttrib4fARB", "glVertexAttrib4f");
            PFN_glVertexAttrib4fvARB = func.invoke("glVertexAttrib4fvARB", "glVertexAttrib4fv");
            PFN_glVertexAttrib4ivARB = func.invoke("glVertexAttrib4ivARB", "glVertexAttrib4iv");
            PFN_glVertexAttrib4sARB = func.invoke("glVertexAttrib4sARB", "glVertexAttrib4s");
            PFN_glVertexAttrib4svARB = func.invoke("glVertexAttrib4svARB", "glVertexAttrib4sv");
            PFN_glVertexAttrib4ubvARB = func.invoke("glVertexAttrib4ubvARB", "glVertexAttrib4ubv");
            PFN_glVertexAttrib4uivARB = func.invoke("glVertexAttrib4uivARB", "glVertexAttrib4uiv");
            PFN_glVertexAttrib4usvARB = func.invoke("glVertexAttrib4usvARB", "glVertexAttrib4usv");
            PFN_glVertexAttribPointerARB = func.invoke("glVertexAttribPointerARB", "glVertexAttribPointer");
            PFN_glEnableVertexAttribArrayARB = func.invoke("glEnableVertexAttribArrayARB", "glEnableVertexAttribArray");
            PFN_glDisableVertexAttribArrayARB = func.invoke("glDisableVertexAttribArrayARB", "glDisableVertexAttribArray");
            PFN_glProgramStringARB = func.invoke("glProgramStringARB");
            PFN_glBindProgramARB = func.invoke("glBindProgramARB");
            PFN_glDeleteProgramsARB = func.invoke("glDeleteProgramsARB");
            PFN_glGenProgramsARB = func.invoke("glGenProgramsARB");
            PFN_glProgramEnvParameter4dARB = func.invoke("glProgramEnvParameter4dARB");
            PFN_glProgramEnvParameter4dvARB = func.invoke("glProgramEnvParameter4dvARB");
            PFN_glProgramEnvParameter4fARB = func.invoke("glProgramEnvParameter4fARB");
            PFN_glProgramEnvParameter4fvARB = func.invoke("glProgramEnvParameter4fvARB");
            PFN_glProgramLocalParameter4dARB = func.invoke("glProgramLocalParameter4dARB");
            PFN_glProgramLocalParameter4dvARB = func.invoke("glProgramLocalParameter4dvARB");
            PFN_glProgramLocalParameter4fARB = func.invoke("glProgramLocalParameter4fARB");
            PFN_glProgramLocalParameter4fvARB = func.invoke("glProgramLocalParameter4fvARB");
            PFN_glGetProgramEnvParameterdvARB = func.invoke("glGetProgramEnvParameterdvARB");
            PFN_glGetProgramEnvParameterfvARB = func.invoke("glGetProgramEnvParameterfvARB");
            PFN_glGetProgramLocalParameterdvARB = func.invoke("glGetProgramLocalParameterdvARB");
            PFN_glGetProgramLocalParameterfvARB = func.invoke("glGetProgramLocalParameterfvARB");
            PFN_glGetProgramivARB = func.invoke("glGetProgramivARB");
            PFN_glGetProgramStringARB = func.invoke("glGetProgramStringARB");
            PFN_glGetVertexAttribdvARB = func.invoke("glGetVertexAttribdvARB", "glGetVertexAttribdv");
            PFN_glGetVertexAttribfvARB = func.invoke("glGetVertexAttribfvARB", "glGetVertexAttribfv");
            PFN_glGetVertexAttribivARB = func.invoke("glGetVertexAttribivARB", "glGetVertexAttribiv");
            PFN_glGetVertexAttribPointervARB = func.invoke("glGetVertexAttribPointervARB", "glGetVertexAttribPointerv");
            PFN_glIsProgramARB = func.invoke("glIsProgramARB");
        }
    }

    public GLARBVertexProgram(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexAttrib1dARB((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttrib1dARB(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dARB", index, x); }
        Handles.MH_glVertexAttrib1dARB.invokeExact(handles.PFN_glVertexAttrib1dARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dARB", e); }
    }

    /// ```
    /// void glVertexAttrib1dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib1dvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dvARB", index, v); }
        Handles.MH_glVertexAttrib1dvARB.invokeExact(handles.PFN_glVertexAttrib1dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dvARB", e); }
    }

    /// ```
    /// void glVertexAttrib1fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexAttrib1fARB(int index, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fARB", index, x); }
        Handles.MH_glVertexAttrib1fARB.invokeExact(handles.PFN_glVertexAttrib1fARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fARB", e); }
    }

    /// ```
    /// void glVertexAttrib1fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib1fvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fvARB", index, v); }
        Handles.MH_glVertexAttrib1fvARB.invokeExact(handles.PFN_glVertexAttrib1fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fvARB", e); }
    }

    /// ```
    /// void glVertexAttrib1sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexAttrib1sARB(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1sARB", index, x); }
        Handles.MH_glVertexAttrib1sARB.invokeExact(handles.PFN_glVertexAttrib1sARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1sARB", e); }
    }

    /// ```
    /// void glVertexAttrib1svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib1svARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1svARB", index, v); }
        Handles.MH_glVertexAttrib1svARB.invokeExact(handles.PFN_glVertexAttrib1svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1svARB", e); }
    }

    /// ```
    /// void glVertexAttrib2dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttrib2dARB(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dARB", index, x, y); }
        Handles.MH_glVertexAttrib2dARB.invokeExact(handles.PFN_glVertexAttrib2dARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dARB", e); }
    }

    /// ```
    /// void glVertexAttrib2dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib2dvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dvARB", index, v); }
        Handles.MH_glVertexAttrib2dvARB.invokeExact(handles.PFN_glVertexAttrib2dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dvARB", e); }
    }

    /// ```
    /// void glVertexAttrib2fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexAttrib2fARB(int index, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fARB", index, x, y); }
        Handles.MH_glVertexAttrib2fARB.invokeExact(handles.PFN_glVertexAttrib2fARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fARB", e); }
    }

    /// ```
    /// void glVertexAttrib2fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib2fvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fvARB", index, v); }
        Handles.MH_glVertexAttrib2fvARB.invokeExact(handles.PFN_glVertexAttrib2fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fvARB", e); }
    }

    /// ```
    /// void glVertexAttrib2sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexAttrib2sARB(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2sARB", index, x, y); }
        Handles.MH_glVertexAttrib2sARB.invokeExact(handles.PFN_glVertexAttrib2sARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2sARB", e); }
    }

    /// ```
    /// void glVertexAttrib2svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib2svARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2svARB", index, v); }
        Handles.MH_glVertexAttrib2svARB.invokeExact(handles.PFN_glVertexAttrib2svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2svARB", e); }
    }

    /// ```
    /// void glVertexAttrib3dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttrib3dARB(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3dARB.invokeExact(handles.PFN_glVertexAttrib3dARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dARB", e); }
    }

    /// ```
    /// void glVertexAttrib3dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib3dvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dvARB", index, v); }
        Handles.MH_glVertexAttrib3dvARB.invokeExact(handles.PFN_glVertexAttrib3dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dvARB", e); }
    }

    /// ```
    /// void glVertexAttrib3fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexAttrib3fARB(int index, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3fARB.invokeExact(handles.PFN_glVertexAttrib3fARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fARB", e); }
    }

    /// ```
    /// void glVertexAttrib3fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib3fvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fvARB", index, v); }
        Handles.MH_glVertexAttrib3fvARB.invokeExact(handles.PFN_glVertexAttrib3fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fvARB", e); }
    }

    /// ```
    /// void glVertexAttrib3sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexAttrib3sARB(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3sARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3sARB.invokeExact(handles.PFN_glVertexAttrib3sARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3sARB", e); }
    }

    /// ```
    /// void glVertexAttrib3svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib3svARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3svARB", index, v); }
        Handles.MH_glVertexAttrib3svARB.invokeExact(handles.PFN_glVertexAttrib3svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3svARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NbvARB((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4NbvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NbvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NbvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NbvARB", index, v); }
        Handles.MH_glVertexAttrib4NbvARB.invokeExact(handles.PFN_glVertexAttrib4NbvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NbvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NivARB((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4NivARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NivARB", index, v); }
        Handles.MH_glVertexAttrib4NivARB.invokeExact(handles.PFN_glVertexAttrib4NivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NivARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NsvARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4NsvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NsvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NsvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NsvARB", index, v); }
        Handles.MH_glVertexAttrib4NsvARB.invokeExact(handles.PFN_glVertexAttrib4NsvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NsvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NubARB((unsigned int) GLuint index, ((unsigned char) khronos_uint8_t) GLubyte x, ((unsigned char) khronos_uint8_t) GLubyte y, ((unsigned char) khronos_uint8_t) GLubyte z, ((unsigned char) khronos_uint8_t) GLubyte w);
    /// ```
    public void VertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NubARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NubARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NubARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4NubARB.invokeExact(handles.PFN_glVertexAttrib4NubARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NubARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NubvARB((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4NubvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NubvARB", index, v); }
        Handles.MH_glVertexAttrib4NubvARB.invokeExact(handles.PFN_glVertexAttrib4NubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NubvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NuivARB((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4NuivARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NuivARB", index, v); }
        Handles.MH_glVertexAttrib4NuivARB.invokeExact(handles.PFN_glVertexAttrib4NuivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NuivARB", e); }
    }

    /// ```
    /// void glVertexAttrib4NusvARB((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4NusvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NusvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NusvARB", index, v); }
        Handles.MH_glVertexAttrib4NusvARB.invokeExact(handles.PFN_glVertexAttrib4NusvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NusvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4bvARB((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4bvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4bvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4bvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4bvARB", index, v); }
        Handles.MH_glVertexAttrib4bvARB.invokeExact(handles.PFN_glVertexAttrib4bvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4bvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttrib4dARB(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4dARB.invokeExact(handles.PFN_glVertexAttrib4dARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dARB", e); }
    }

    /// ```
    /// void glVertexAttrib4dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib4dvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dvARB", index, v); }
        Handles.MH_glVertexAttrib4dvARB.invokeExact(handles.PFN_glVertexAttrib4dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexAttrib4fARB(int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4fARB.invokeExact(handles.PFN_glVertexAttrib4fARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fARB", e); }
    }

    /// ```
    /// void glVertexAttrib4fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib4fvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fvARB", index, v); }
        Handles.MH_glVertexAttrib4fvARB.invokeExact(handles.PFN_glVertexAttrib4fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4ivARB((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4ivARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ivARB", index, v); }
        Handles.MH_glVertexAttrib4ivARB.invokeExact(handles.PFN_glVertexAttrib4ivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ivARB", e); }
    }

    /// ```
    /// void glVertexAttrib4sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexAttrib4sARB(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4sARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4sARB.invokeExact(handles.PFN_glVertexAttrib4sARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4sARB", e); }
    }

    /// ```
    /// void glVertexAttrib4svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4svARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4svARB", index, v); }
        Handles.MH_glVertexAttrib4svARB.invokeExact(handles.PFN_glVertexAttrib4svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4svARB", e); }
    }

    /// ```
    /// void glVertexAttrib4ubvARB((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4ubvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ubvARB", index, v); }
        Handles.MH_glVertexAttrib4ubvARB.invokeExact(handles.PFN_glVertexAttrib4ubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubvARB", e); }
    }

    /// ```
    /// void glVertexAttrib4uivARB((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4uivARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4uivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4uivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4uivARB", index, v); }
        Handles.MH_glVertexAttrib4uivARB.invokeExact(handles.PFN_glVertexAttrib4uivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4uivARB", e); }
    }

    /// ```
    /// void glVertexAttrib4usvARB((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4usvARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4usvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4usvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4usvARB", index, v); }
        Handles.MH_glVertexAttrib4usvARB.invokeExact(handles.PFN_glVertexAttrib4usvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4usvARB", e); }
    }

    /// ```
    /// void glVertexAttribPointerARB((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribPointerARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribPointerARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribPointerARB", index, size, type, normalized, stride, pointer); }
        Handles.MH_glVertexAttribPointerARB.invokeExact(handles.PFN_glVertexAttribPointerARB, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribPointerARB", e); }
    }

    /// ```
    /// void glEnableVertexAttribArrayARB((unsigned int) GLuint index);
    /// ```
    public void EnableVertexAttribArrayARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexAttribArrayARB)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexAttribArrayARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexAttribArrayARB", index); }
        Handles.MH_glEnableVertexAttribArrayARB.invokeExact(handles.PFN_glEnableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexAttribArrayARB", e); }
    }

    /// ```
    /// void glDisableVertexAttribArrayARB((unsigned int) GLuint index);
    /// ```
    public void DisableVertexAttribArrayARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexAttribArrayARB)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexAttribArrayARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexAttribArrayARB", index); }
        Handles.MH_glDisableVertexAttribArrayARB.invokeExact(handles.PFN_glDisableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexAttribArrayARB", e); }
    }

    /// ```
    /// void glProgramStringARB((unsigned int) GLenum target, (unsigned int) GLenum format, (int) GLsizei len, const void* string);
    /// ```
    public void ProgramStringARB(int target, int format, int len, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramStringARB", target, format, len, string); }
        Handles.MH_glProgramStringARB.invokeExact(handles.PFN_glProgramStringARB, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramStringARB", e); }
    }

    /// ```
    /// void glBindProgramARB((unsigned int) GLenum target, (unsigned int) GLuint program);
    /// ```
    public void BindProgramARB(int target, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glBindProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindProgramARB", target, program); }
        Handles.MH_glBindProgramARB.invokeExact(handles.PFN_glBindProgramARB, target, program); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramARB", e); }
    }

    /// ```
    /// void glDeleteProgramsARB((int) GLsizei n, const GLuint* programs);
    /// ```
    public void DeleteProgramsARB(int n, MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramsARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgramsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgramsARB", n, programs); }
        Handles.MH_glDeleteProgramsARB.invokeExact(handles.PFN_glDeleteProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramsARB", e); }
    }

    /// ```
    /// void glGenProgramsARB((int) GLsizei n, GLuint* programs);
    /// ```
    public void GenProgramsARB(int n, MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramsARB)) throw new GLSymbolNotFoundError("Symbol not found: glGenProgramsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenProgramsARB", n, programs); }
        Handles.MH_glGenProgramsARB.invokeExact(handles.PFN_glGenProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramsARB", e); }
    }

    /// ```
    /// void glProgramEnvParameter4dARB((unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4dARB", target, index, x, y, z, w); }
        Handles.MH_glProgramEnvParameter4dARB.invokeExact(handles.PFN_glProgramEnvParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4dARB", e); }
    }

    /// ```
    /// void glProgramEnvParameter4dvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* params);
    /// ```
    public void ProgramEnvParameter4dvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4dvARB", target, index, params); }
        Handles.MH_glProgramEnvParameter4dvARB.invokeExact(handles.PFN_glProgramEnvParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4dvARB", e); }
    }

    /// ```
    /// void glProgramEnvParameter4fARB((unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4fARB", target, index, x, y, z, w); }
        Handles.MH_glProgramEnvParameter4fARB.invokeExact(handles.PFN_glProgramEnvParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4fARB", e); }
    }

    /// ```
    /// void glProgramEnvParameter4fvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* params);
    /// ```
    public void ProgramEnvParameter4fvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4fvARB", target, index, params); }
        Handles.MH_glProgramEnvParameter4fvARB.invokeExact(handles.PFN_glProgramEnvParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4fvARB", e); }
    }

    /// ```
    /// void glProgramLocalParameter4dARB((unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4dARB", target, index, x, y, z, w); }
        Handles.MH_glProgramLocalParameter4dARB.invokeExact(handles.PFN_glProgramLocalParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4dARB", e); }
    }

    /// ```
    /// void glProgramLocalParameter4dvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* params);
    /// ```
    public void ProgramLocalParameter4dvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4dvARB", target, index, params); }
        Handles.MH_glProgramLocalParameter4dvARB.invokeExact(handles.PFN_glProgramLocalParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4dvARB", e); }
    }

    /// ```
    /// void glProgramLocalParameter4fARB((unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4fARB", target, index, x, y, z, w); }
        Handles.MH_glProgramLocalParameter4fARB.invokeExact(handles.PFN_glProgramLocalParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4fARB", e); }
    }

    /// ```
    /// void glProgramLocalParameter4fvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* params);
    /// ```
    public void ProgramLocalParameter4fvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4fvARB", target, index, params); }
        Handles.MH_glProgramLocalParameter4fvARB.invokeExact(handles.PFN_glProgramLocalParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4fvARB", e); }
    }

    /// ```
    /// void glGetProgramEnvParameterdvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetProgramEnvParameterdvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramEnvParameterdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramEnvParameterdvARB", target, index, params); }
        Handles.MH_glGetProgramEnvParameterdvARB.invokeExact(handles.PFN_glGetProgramEnvParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterdvARB", e); }
    }

    /// ```
    /// void glGetProgramEnvParameterfvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetProgramEnvParameterfvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramEnvParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramEnvParameterfvARB", target, index, params); }
        Handles.MH_glGetProgramEnvParameterfvARB.invokeExact(handles.PFN_glGetProgramEnvParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterfvARB", e); }
    }

    /// ```
    /// void glGetProgramLocalParameterdvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetProgramLocalParameterdvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramLocalParameterdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramLocalParameterdvARB", target, index, params); }
        Handles.MH_glGetProgramLocalParameterdvARB.invokeExact(handles.PFN_glGetProgramLocalParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterdvARB", e); }
    }

    /// ```
    /// void glGetProgramLocalParameterfvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetProgramLocalParameterfvARB(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramLocalParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramLocalParameterfvARB", target, index, params); }
        Handles.MH_glGetProgramLocalParameterfvARB.invokeExact(handles.PFN_glGetProgramLocalParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterfvARB", e); }
    }

    /// ```
    /// void glGetProgramivARB((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramivARB(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramivARB", target, pname, params); }
        Handles.MH_glGetProgramivARB.invokeExact(handles.PFN_glGetProgramivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramivARB", e); }
    }

    /// ```
    /// void glGetProgramStringARB((unsigned int) GLenum target, (unsigned int) GLenum pname, void* string);
    /// ```
    public void GetProgramStringARB(int target, int pname, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramStringARB", target, pname, string); }
        Handles.MH_glGetProgramStringARB.invokeExact(handles.PFN_glGetProgramStringARB, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStringARB", e); }
    }

    /// ```
    /// void glGetVertexAttribdvARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribdvARB(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribdvARB", index, pname, params); }
        Handles.MH_glGetVertexAttribdvARB.invokeExact(handles.PFN_glGetVertexAttribdvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribdvARB", e); }
    }

    /// ```
    /// void glGetVertexAttribfvARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribfvARB(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribfvARB", index, pname, params); }
        Handles.MH_glGetVertexAttribfvARB.invokeExact(handles.PFN_glGetVertexAttribfvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribfvARB", e); }
    }

    /// ```
    /// void glGetVertexAttribivARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribivARB(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribivARB", index, pname, params); }
        Handles.MH_glGetVertexAttribivARB.invokeExact(handles.PFN_glGetVertexAttribivARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribivARB", e); }
    }

    /// ```
    /// void glGetVertexAttribPointervARB((unsigned int) GLuint index, (unsigned int) GLenum pname, void** pointer);
    /// ```
    public void GetVertexAttribPointervARB(int index, int pname, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribPointervARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribPointervARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribPointervARB", index, pname, pointer); }
        Handles.MH_glGetVertexAttribPointervARB.invokeExact(handles.PFN_glGetVertexAttribPointervARB, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribPointervARB", e); }
    }

    /// ```
    /// GLboolean glIsProgramARB((unsigned int) GLuint program);
    /// ```
    public boolean IsProgramARB(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgramARB", program); }
        return (((byte) Handles.MH_glIsProgramARB.invokeExact(handles.PFN_glIsProgramARB, program)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramARB", e); }
    }

}
