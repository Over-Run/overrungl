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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
        public static final MethodHandle MH_glVertexAttrib1dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib1dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib1fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib2dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib3dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NbvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NsvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NubARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexAttrib4NubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NusvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4bvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4uivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4usvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribPointerARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableVertexAttribArrayARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexAttribArrayARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramEnvParameter4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramEnvParameter4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramLocalParameter4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramLocalParameter4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribPointervARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
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

    public void VertexAttrib1dARB(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dARB");
        try { Handles.MH_glVertexAttrib1dARB.invokeExact(handles.PFN_glVertexAttrib1dARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dARB", e); }
    }

    public void VertexAttrib1dvARB(@CType("GLuint") int index, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dvARB");
        try { Handles.MH_glVertexAttrib1dvARB.invokeExact(handles.PFN_glVertexAttrib1dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dvARB", e); }
    }

    public void VertexAttrib1fARB(@CType("GLuint") int index, @CType("GLfloat") float x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fARB");
        try { Handles.MH_glVertexAttrib1fARB.invokeExact(handles.PFN_glVertexAttrib1fARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fARB", e); }
    }

    public void VertexAttrib1fvARB(@CType("GLuint") int index, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fvARB");
        try { Handles.MH_glVertexAttrib1fvARB.invokeExact(handles.PFN_glVertexAttrib1fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fvARB", e); }
    }

    public void VertexAttrib1sARB(@CType("GLuint") int index, @CType("GLshort") short x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1sARB");
        try { Handles.MH_glVertexAttrib1sARB.invokeExact(handles.PFN_glVertexAttrib1sARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1sARB", e); }
    }

    public void VertexAttrib1svARB(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1svARB");
        try { Handles.MH_glVertexAttrib1svARB.invokeExact(handles.PFN_glVertexAttrib1svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1svARB", e); }
    }

    public void VertexAttrib2dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dARB");
        try { Handles.MH_glVertexAttrib2dARB.invokeExact(handles.PFN_glVertexAttrib2dARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dARB", e); }
    }

    public void VertexAttrib2dvARB(@CType("GLuint") int index, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dvARB");
        try { Handles.MH_glVertexAttrib2dvARB.invokeExact(handles.PFN_glVertexAttrib2dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dvARB", e); }
    }

    public void VertexAttrib2fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fARB");
        try { Handles.MH_glVertexAttrib2fARB.invokeExact(handles.PFN_glVertexAttrib2fARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fARB", e); }
    }

    public void VertexAttrib2fvARB(@CType("GLuint") int index, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fvARB");
        try { Handles.MH_glVertexAttrib2fvARB.invokeExact(handles.PFN_glVertexAttrib2fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fvARB", e); }
    }

    public void VertexAttrib2sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2sARB");
        try { Handles.MH_glVertexAttrib2sARB.invokeExact(handles.PFN_glVertexAttrib2sARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2sARB", e); }
    }

    public void VertexAttrib2svARB(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2svARB");
        try { Handles.MH_glVertexAttrib2svARB.invokeExact(handles.PFN_glVertexAttrib2svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2svARB", e); }
    }

    public void VertexAttrib3dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dARB");
        try { Handles.MH_glVertexAttrib3dARB.invokeExact(handles.PFN_glVertexAttrib3dARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dARB", e); }
    }

    public void VertexAttrib3dvARB(@CType("GLuint") int index, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dvARB");
        try { Handles.MH_glVertexAttrib3dvARB.invokeExact(handles.PFN_glVertexAttrib3dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dvARB", e); }
    }

    public void VertexAttrib3fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fARB");
        try { Handles.MH_glVertexAttrib3fARB.invokeExact(handles.PFN_glVertexAttrib3fARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fARB", e); }
    }

    public void VertexAttrib3fvARB(@CType("GLuint") int index, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fvARB");
        try { Handles.MH_glVertexAttrib3fvARB.invokeExact(handles.PFN_glVertexAttrib3fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fvARB", e); }
    }

    public void VertexAttrib3sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3sARB");
        try { Handles.MH_glVertexAttrib3sARB.invokeExact(handles.PFN_glVertexAttrib3sARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3sARB", e); }
    }

    public void VertexAttrib3svARB(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3svARB");
        try { Handles.MH_glVertexAttrib3svARB.invokeExact(handles.PFN_glVertexAttrib3svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3svARB", e); }
    }

    public void VertexAttrib4NbvARB(@CType("GLuint") int index, @CType("const GLbyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NbvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NbvARB");
        try { Handles.MH_glVertexAttrib4NbvARB.invokeExact(handles.PFN_glVertexAttrib4NbvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NbvARB", e); }
    }

    public void VertexAttrib4NivARB(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NivARB");
        try { Handles.MH_glVertexAttrib4NivARB.invokeExact(handles.PFN_glVertexAttrib4NivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NivARB", e); }
    }

    public void VertexAttrib4NsvARB(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NsvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NsvARB");
        try { Handles.MH_glVertexAttrib4NsvARB.invokeExact(handles.PFN_glVertexAttrib4NsvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NsvARB", e); }
    }

    public void VertexAttrib4NubARB(@CType("GLuint") int index, @CType("GLubyte") byte x, @CType("GLubyte") byte y, @CType("GLubyte") byte z, @CType("GLubyte") byte w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NubARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NubARB");
        try { Handles.MH_glVertexAttrib4NubARB.invokeExact(handles.PFN_glVertexAttrib4NubARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NubARB", e); }
    }

    public void VertexAttrib4NubvARB(@CType("GLuint") int index, @CType("const GLubyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NubvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NubvARB");
        try { Handles.MH_glVertexAttrib4NubvARB.invokeExact(handles.PFN_glVertexAttrib4NubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NubvARB", e); }
    }

    public void VertexAttrib4NuivARB(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NuivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NuivARB");
        try { Handles.MH_glVertexAttrib4NuivARB.invokeExact(handles.PFN_glVertexAttrib4NuivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NuivARB", e); }
    }

    public void VertexAttrib4NusvARB(@CType("GLuint") int index, @CType("const GLushort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4NusvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NusvARB");
        try { Handles.MH_glVertexAttrib4NusvARB.invokeExact(handles.PFN_glVertexAttrib4NusvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NusvARB", e); }
    }

    public void VertexAttrib4bvARB(@CType("GLuint") int index, @CType("const GLbyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4bvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4bvARB");
        try { Handles.MH_glVertexAttrib4bvARB.invokeExact(handles.PFN_glVertexAttrib4bvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4bvARB", e); }
    }

    public void VertexAttrib4dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dARB");
        try { Handles.MH_glVertexAttrib4dARB.invokeExact(handles.PFN_glVertexAttrib4dARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dARB", e); }
    }

    public void VertexAttrib4dvARB(@CType("GLuint") int index, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dvARB");
        try { Handles.MH_glVertexAttrib4dvARB.invokeExact(handles.PFN_glVertexAttrib4dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dvARB", e); }
    }

    public void VertexAttrib4fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fARB");
        try { Handles.MH_glVertexAttrib4fARB.invokeExact(handles.PFN_glVertexAttrib4fARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fARB", e); }
    }

    public void VertexAttrib4fvARB(@CType("GLuint") int index, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fvARB");
        try { Handles.MH_glVertexAttrib4fvARB.invokeExact(handles.PFN_glVertexAttrib4fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fvARB", e); }
    }

    public void VertexAttrib4ivARB(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4ivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ivARB");
        try { Handles.MH_glVertexAttrib4ivARB.invokeExact(handles.PFN_glVertexAttrib4ivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ivARB", e); }
    }

    public void VertexAttrib4sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4sARB");
        try { Handles.MH_glVertexAttrib4sARB.invokeExact(handles.PFN_glVertexAttrib4sARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4sARB", e); }
    }

    public void VertexAttrib4svARB(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4svARB");
        try { Handles.MH_glVertexAttrib4svARB.invokeExact(handles.PFN_glVertexAttrib4svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4svARB", e); }
    }

    public void VertexAttrib4ubvARB(@CType("GLuint") int index, @CType("const GLubyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4ubvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ubvARB");
        try { Handles.MH_glVertexAttrib4ubvARB.invokeExact(handles.PFN_glVertexAttrib4ubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ubvARB", e); }
    }

    public void VertexAttrib4uivARB(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4uivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4uivARB");
        try { Handles.MH_glVertexAttrib4uivARB.invokeExact(handles.PFN_glVertexAttrib4uivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4uivARB", e); }
    }

    public void VertexAttrib4usvARB(@CType("GLuint") int index, @CType("const GLushort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4usvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4usvARB");
        try { Handles.MH_glVertexAttrib4usvARB.invokeExact(handles.PFN_glVertexAttrib4usvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4usvARB", e); }
    }

    public void VertexAttribPointerARB(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("const void *") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribPointerARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribPointerARB");
        try { Handles.MH_glVertexAttribPointerARB.invokeExact(handles.PFN_glVertexAttribPointerARB, index, size, type, normalized, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribPointerARB", e); }
    }

    public void EnableVertexAttribArrayARB(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVertexAttribArrayARB)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexAttribArrayARB");
        try { Handles.MH_glEnableVertexAttribArrayARB.invokeExact(handles.PFN_glEnableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexAttribArrayARB", e); }
    }

    public void DisableVertexAttribArrayARB(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVertexAttribArrayARB)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexAttribArrayARB");
        try { Handles.MH_glDisableVertexAttribArrayARB.invokeExact(handles.PFN_glDisableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexAttribArrayARB", e); }
    }

    public void ProgramStringARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLsizei") int len, @CType("const void *") MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramStringARB)) throw new SymbolNotFoundError("Symbol not found: glProgramStringARB");
        try { Handles.MH_glProgramStringARB.invokeExact(handles.PFN_glProgramStringARB, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramStringARB", e); }
    }

    public void BindProgramARB(@CType("GLenum") int target, @CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindProgramARB)) throw new SymbolNotFoundError("Symbol not found: glBindProgramARB");
        try { Handles.MH_glBindProgramARB.invokeExact(handles.PFN_glBindProgramARB, target, program); }
        catch (Throwable e) { throw new RuntimeException("error in glBindProgramARB", e); }
    }

    public void DeleteProgramsARB(@CType("GLsizei") int n, @CType("const GLuint *") MemorySegment programs) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteProgramsARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgramsARB");
        try { Handles.MH_glDeleteProgramsARB.invokeExact(handles.PFN_glDeleteProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramsARB", e); }
    }

    public void GenProgramsARB(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment programs) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenProgramsARB)) throw new SymbolNotFoundError("Symbol not found: glGenProgramsARB");
        try { Handles.MH_glGenProgramsARB.invokeExact(handles.PFN_glGenProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in glGenProgramsARB", e); }
    }

    public void ProgramEnvParameter4dARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramEnvParameter4dARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4dARB");
        try { Handles.MH_glProgramEnvParameter4dARB.invokeExact(handles.PFN_glProgramEnvParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4dARB", e); }
    }

    public void ProgramEnvParameter4dvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramEnvParameter4dvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4dvARB");
        try { Handles.MH_glProgramEnvParameter4dvARB.invokeExact(handles.PFN_glProgramEnvParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4dvARB", e); }
    }

    public void ProgramEnvParameter4fARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramEnvParameter4fARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4fARB");
        try { Handles.MH_glProgramEnvParameter4fARB.invokeExact(handles.PFN_glProgramEnvParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4fARB", e); }
    }

    public void ProgramEnvParameter4fvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramEnvParameter4fvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4fvARB");
        try { Handles.MH_glProgramEnvParameter4fvARB.invokeExact(handles.PFN_glProgramEnvParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4fvARB", e); }
    }

    public void ProgramLocalParameter4dARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramLocalParameter4dARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4dARB");
        try { Handles.MH_glProgramLocalParameter4dARB.invokeExact(handles.PFN_glProgramLocalParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4dARB", e); }
    }

    public void ProgramLocalParameter4dvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramLocalParameter4dvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4dvARB");
        try { Handles.MH_glProgramLocalParameter4dvARB.invokeExact(handles.PFN_glProgramLocalParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4dvARB", e); }
    }

    public void ProgramLocalParameter4fARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramLocalParameter4fARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4fARB");
        try { Handles.MH_glProgramLocalParameter4fARB.invokeExact(handles.PFN_glProgramLocalParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4fARB", e); }
    }

    public void ProgramLocalParameter4fvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramLocalParameter4fvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4fvARB");
        try { Handles.MH_glProgramLocalParameter4fvARB.invokeExact(handles.PFN_glProgramLocalParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4fvARB", e); }
    }

    public void GetProgramEnvParameterdvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramEnvParameterdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterdvARB");
        try { Handles.MH_glGetProgramEnvParameterdvARB.invokeExact(handles.PFN_glGetProgramEnvParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterdvARB", e); }
    }

    public void GetProgramEnvParameterfvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramEnvParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterfvARB");
        try { Handles.MH_glGetProgramEnvParameterfvARB.invokeExact(handles.PFN_glGetProgramEnvParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterfvARB", e); }
    }

    public void GetProgramLocalParameterdvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramLocalParameterdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterdvARB");
        try { Handles.MH_glGetProgramLocalParameterdvARB.invokeExact(handles.PFN_glGetProgramLocalParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterdvARB", e); }
    }

    public void GetProgramLocalParameterfvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramLocalParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterfvARB");
        try { Handles.MH_glGetProgramLocalParameterfvARB.invokeExact(handles.PFN_glGetProgramLocalParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterfvARB", e); }
    }

    public void GetProgramivARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramivARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramivARB");
        try { Handles.MH_glGetProgramivARB.invokeExact(handles.PFN_glGetProgramivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramivARB", e); }
    }

    public void GetProgramStringARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("void*") MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramStringARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramStringARB");
        try { Handles.MH_glGetProgramStringARB.invokeExact(handles.PFN_glGetProgramStringARB, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramStringARB", e); }
    }

    public void GetVertexAttribdvARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribdvARB");
        try { Handles.MH_glGetVertexAttribdvARB.invokeExact(handles.PFN_glGetVertexAttribdvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribdvARB", e); }
    }

    public void GetVertexAttribfvARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribfvARB");
        try { Handles.MH_glGetVertexAttribfvARB.invokeExact(handles.PFN_glGetVertexAttribfvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribfvARB", e); }
    }

    public void GetVertexAttribivARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribivARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribivARB");
        try { Handles.MH_glGetVertexAttribivARB.invokeExact(handles.PFN_glGetVertexAttribivARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribivARB", e); }
    }

    public void GetVertexAttribPointervARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribPointervARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribPointervARB");
        try { Handles.MH_glGetVertexAttribPointervARB.invokeExact(handles.PFN_glGetVertexAttribPointervARB, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribPointervARB", e); }
    }

    public @CType("GLboolean") boolean IsProgramARB(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsProgramARB)) throw new SymbolNotFoundError("Symbol not found: glIsProgramARB");
        try { return (boolean) Handles.MH_glIsProgramARB.invokeExact(handles.PFN_glIsProgramARB, program); }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgramARB", e); }
    }

}
