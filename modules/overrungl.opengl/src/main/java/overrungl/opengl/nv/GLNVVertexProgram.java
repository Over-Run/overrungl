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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glAreProgramsResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glAreProgramsResidentNV;
    public static final MethodHandle MH_glBindProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindProgramNV;
    public static final MethodHandle MH_glDeleteProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteProgramsNV;
    public static final MethodHandle MH_glExecuteProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glExecuteProgramNV;
    public static final MethodHandle MH_glGenProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenProgramsNV;
    public static final MethodHandle MH_glGetProgramParameterdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramParameterdvNV;
    public static final MethodHandle MH_glGetProgramParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramParameterfvNV;
    public static final MethodHandle MH_glGetProgramivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramivNV;
    public static final MethodHandle MH_glGetProgramStringNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramStringNV;
    public static final MethodHandle MH_glGetTrackMatrixivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTrackMatrixivNV;
    public static final MethodHandle MH_glGetVertexAttribdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribdvNV;
    public static final MethodHandle MH_glGetVertexAttribfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribfvNV;
    public static final MethodHandle MH_glGetVertexAttribivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribivNV;
    public static final MethodHandle MH_glGetVertexAttribPointervNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribPointervNV;
    public static final MethodHandle MH_glIsProgramNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsProgramNV;
    public static final MethodHandle MH_glLoadProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLoadProgramNV;
    public static final MethodHandle MH_glProgramParameter4dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramParameter4dNV;
    public static final MethodHandle MH_glProgramParameter4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramParameter4dvNV;
    public static final MethodHandle MH_glProgramParameter4fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramParameter4fNV;
    public static final MethodHandle MH_glProgramParameter4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramParameter4fvNV;
    public static final MethodHandle MH_glProgramParameters4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramParameters4dvNV;
    public static final MethodHandle MH_glProgramParameters4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramParameters4fvNV;
    public static final MethodHandle MH_glRequestResidentProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glRequestResidentProgramsNV;
    public static final MethodHandle MH_glTrackMatrixNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTrackMatrixNV;
    public static final MethodHandle MH_glVertexAttribPointerNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribPointerNV;
    public static final MethodHandle MH_glVertexAttrib1dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttrib1dNV;
    public static final MethodHandle MH_glVertexAttrib1dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib1dvNV;
    public static final MethodHandle MH_glVertexAttrib1fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glVertexAttrib1fNV;
    public static final MethodHandle MH_glVertexAttrib1fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib1fvNV;
    public static final MethodHandle MH_glVertexAttrib1sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib1sNV;
    public static final MethodHandle MH_glVertexAttrib1svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib1svNV;
    public static final MethodHandle MH_glVertexAttrib2dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttrib2dNV;
    public static final MethodHandle MH_glVertexAttrib2dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib2dvNV;
    public static final MethodHandle MH_glVertexAttrib2fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glVertexAttrib2fNV;
    public static final MethodHandle MH_glVertexAttrib2fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib2fvNV;
    public static final MethodHandle MH_glVertexAttrib2sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib2sNV;
    public static final MethodHandle MH_glVertexAttrib2svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib2svNV;
    public static final MethodHandle MH_glVertexAttrib3dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttrib3dNV;
    public static final MethodHandle MH_glVertexAttrib3dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib3dvNV;
    public static final MethodHandle MH_glVertexAttrib3fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glVertexAttrib3fNV;
    public static final MethodHandle MH_glVertexAttrib3fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib3fvNV;
    public static final MethodHandle MH_glVertexAttrib3sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib3sNV;
    public static final MethodHandle MH_glVertexAttrib3svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib3svNV;
    public static final MethodHandle MH_glVertexAttrib4dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttrib4dNV;
    public static final MethodHandle MH_glVertexAttrib4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib4dvNV;
    public static final MethodHandle MH_glVertexAttrib4fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glVertexAttrib4fNV;
    public static final MethodHandle MH_glVertexAttrib4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib4fvNV;
    public static final MethodHandle MH_glVertexAttrib4sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib4sNV;
    public static final MethodHandle MH_glVertexAttrib4svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib4svNV;
    public static final MethodHandle MH_glVertexAttrib4ubNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glVertexAttrib4ubNV;
    public static final MethodHandle MH_glVertexAttrib4ubvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib4ubvNV;
    public static final MethodHandle MH_glVertexAttribs1dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs1dvNV;
    public static final MethodHandle MH_glVertexAttribs1fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs1fvNV;
    public static final MethodHandle MH_glVertexAttribs1svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs1svNV;
    public static final MethodHandle MH_glVertexAttribs2dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs2dvNV;
    public static final MethodHandle MH_glVertexAttribs2fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs2fvNV;
    public static final MethodHandle MH_glVertexAttribs2svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs2svNV;
    public static final MethodHandle MH_glVertexAttribs3dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs3dvNV;
    public static final MethodHandle MH_glVertexAttribs3fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs3fvNV;
    public static final MethodHandle MH_glVertexAttribs3svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs3svNV;
    public static final MethodHandle MH_glVertexAttribs4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs4dvNV;
    public static final MethodHandle MH_glVertexAttribs4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs4fvNV;
    public static final MethodHandle MH_glVertexAttribs4svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs4svNV;
    public static final MethodHandle MH_glVertexAttribs4ubvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs4ubvNV;

    public GLNVVertexProgram(overrungl.opengl.GLLoadFunc func) {
        PFN_glAreProgramsResidentNV = func.invoke("glAreProgramsResidentNV");
        PFN_glBindProgramNV = func.invoke("glBindProgramNV", "glBindProgramARB");
        PFN_glDeleteProgramsNV = func.invoke("glDeleteProgramsNV", "glDeleteProgramsARB");
        PFN_glExecuteProgramNV = func.invoke("glExecuteProgramNV");
        PFN_glGenProgramsNV = func.invoke("glGenProgramsNV", "glGenProgramsARB");
        PFN_glGetProgramParameterdvNV = func.invoke("glGetProgramParameterdvNV");
        PFN_glGetProgramParameterfvNV = func.invoke("glGetProgramParameterfvNV");
        PFN_glGetProgramivNV = func.invoke("glGetProgramivNV");
        PFN_glGetProgramStringNV = func.invoke("glGetProgramStringNV");
        PFN_glGetTrackMatrixivNV = func.invoke("glGetTrackMatrixivNV");
        PFN_glGetVertexAttribdvNV = func.invoke("glGetVertexAttribdvNV", "glGetVertexAttribdv");
        PFN_glGetVertexAttribfvNV = func.invoke("glGetVertexAttribfvNV", "glGetVertexAttribfv");
        PFN_glGetVertexAttribivNV = func.invoke("glGetVertexAttribivNV", "glGetVertexAttribiv");
        PFN_glGetVertexAttribPointervNV = func.invoke("glGetVertexAttribPointervNV", "glGetVertexAttribPointerv");
        PFN_glIsProgramNV = func.invoke("glIsProgramNV", "glIsProgramARB");
        PFN_glLoadProgramNV = func.invoke("glLoadProgramNV");
        PFN_glProgramParameter4dNV = func.invoke("glProgramParameter4dNV");
        PFN_glProgramParameter4dvNV = func.invoke("glProgramParameter4dvNV");
        PFN_glProgramParameter4fNV = func.invoke("glProgramParameter4fNV");
        PFN_glProgramParameter4fvNV = func.invoke("glProgramParameter4fvNV");
        PFN_glProgramParameters4dvNV = func.invoke("glProgramParameters4dvNV");
        PFN_glProgramParameters4fvNV = func.invoke("glProgramParameters4fvNV");
        PFN_glRequestResidentProgramsNV = func.invoke("glRequestResidentProgramsNV");
        PFN_glTrackMatrixNV = func.invoke("glTrackMatrixNV");
        PFN_glVertexAttribPointerNV = func.invoke("glVertexAttribPointerNV");
        PFN_glVertexAttrib1dNV = func.invoke("glVertexAttrib1dNV", "glVertexAttrib1d");
        PFN_glVertexAttrib1dvNV = func.invoke("glVertexAttrib1dvNV", "glVertexAttrib1dv");
        PFN_glVertexAttrib1fNV = func.invoke("glVertexAttrib1fNV", "glVertexAttrib1f");
        PFN_glVertexAttrib1fvNV = func.invoke("glVertexAttrib1fvNV", "glVertexAttrib1fv");
        PFN_glVertexAttrib1sNV = func.invoke("glVertexAttrib1sNV", "glVertexAttrib1s");
        PFN_glVertexAttrib1svNV = func.invoke("glVertexAttrib1svNV", "glVertexAttrib1sv");
        PFN_glVertexAttrib2dNV = func.invoke("glVertexAttrib2dNV", "glVertexAttrib2d");
        PFN_glVertexAttrib2dvNV = func.invoke("glVertexAttrib2dvNV", "glVertexAttrib2dv");
        PFN_glVertexAttrib2fNV = func.invoke("glVertexAttrib2fNV", "glVertexAttrib2f");
        PFN_glVertexAttrib2fvNV = func.invoke("glVertexAttrib2fvNV", "glVertexAttrib2fv");
        PFN_glVertexAttrib2sNV = func.invoke("glVertexAttrib2sNV", "glVertexAttrib2s");
        PFN_glVertexAttrib2svNV = func.invoke("glVertexAttrib2svNV", "glVertexAttrib2sv");
        PFN_glVertexAttrib3dNV = func.invoke("glVertexAttrib3dNV", "glVertexAttrib3d");
        PFN_glVertexAttrib3dvNV = func.invoke("glVertexAttrib3dvNV", "glVertexAttrib3dv");
        PFN_glVertexAttrib3fNV = func.invoke("glVertexAttrib3fNV", "glVertexAttrib3f");
        PFN_glVertexAttrib3fvNV = func.invoke("glVertexAttrib3fvNV", "glVertexAttrib3fv");
        PFN_glVertexAttrib3sNV = func.invoke("glVertexAttrib3sNV", "glVertexAttrib3s");
        PFN_glVertexAttrib3svNV = func.invoke("glVertexAttrib3svNV", "glVertexAttrib3sv");
        PFN_glVertexAttrib4dNV = func.invoke("glVertexAttrib4dNV", "glVertexAttrib4d");
        PFN_glVertexAttrib4dvNV = func.invoke("glVertexAttrib4dvNV", "glVertexAttrib4dv");
        PFN_glVertexAttrib4fNV = func.invoke("glVertexAttrib4fNV", "glVertexAttrib4f");
        PFN_glVertexAttrib4fvNV = func.invoke("glVertexAttrib4fvNV", "glVertexAttrib4fv");
        PFN_glVertexAttrib4sNV = func.invoke("glVertexAttrib4sNV", "glVertexAttrib4s");
        PFN_glVertexAttrib4svNV = func.invoke("glVertexAttrib4svNV", "glVertexAttrib4sv");
        PFN_glVertexAttrib4ubNV = func.invoke("glVertexAttrib4ubNV", "glVertexAttrib4Nub");
        PFN_glVertexAttrib4ubvNV = func.invoke("glVertexAttrib4ubvNV", "glVertexAttrib4Nubv");
        PFN_glVertexAttribs1dvNV = func.invoke("glVertexAttribs1dvNV");
        PFN_glVertexAttribs1fvNV = func.invoke("glVertexAttribs1fvNV");
        PFN_glVertexAttribs1svNV = func.invoke("glVertexAttribs1svNV");
        PFN_glVertexAttribs2dvNV = func.invoke("glVertexAttribs2dvNV");
        PFN_glVertexAttribs2fvNV = func.invoke("glVertexAttribs2fvNV");
        PFN_glVertexAttribs2svNV = func.invoke("glVertexAttribs2svNV");
        PFN_glVertexAttribs3dvNV = func.invoke("glVertexAttribs3dvNV");
        PFN_glVertexAttribs3fvNV = func.invoke("glVertexAttribs3fvNV");
        PFN_glVertexAttribs3svNV = func.invoke("glVertexAttribs3svNV");
        PFN_glVertexAttribs4dvNV = func.invoke("glVertexAttribs4dvNV");
        PFN_glVertexAttribs4fvNV = func.invoke("glVertexAttribs4fvNV");
        PFN_glVertexAttribs4svNV = func.invoke("glVertexAttribs4svNV");
        PFN_glVertexAttribs4ubvNV = func.invoke("glVertexAttribs4ubvNV");
    }

    public @CType("GLboolean") boolean AreProgramsResidentNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment programs, @CType("GLboolean *") java.lang.foreign.MemorySegment residences) {
        try { if (!Unmarshal.isNullPointer(PFN_glAreProgramsResidentNV))
            return (boolean) MH_glAreProgramsResidentNV.invokeExact(PFN_glAreProgramsResidentNV, n, programs, residences);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glAreProgramsResidentNV", e); }
    }

    public void BindProgramNV(@CType("GLenum") int target, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindProgramNV))
            MH_glBindProgramNV.invokeExact(PFN_glBindProgramNV, target, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindProgramNV", e); }
    }

    public void DeleteProgramsNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment programs) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteProgramsNV))
            MH_glDeleteProgramsNV.invokeExact(PFN_glDeleteProgramsNV, n, programs);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramsNV", e); }
    }

    public void ExecuteProgramNV(@CType("GLenum") int target, @CType("GLuint") int id, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glExecuteProgramNV))
            MH_glExecuteProgramNV.invokeExact(PFN_glExecuteProgramNV, target, id, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glExecuteProgramNV", e); }
    }

    public void GenProgramsNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment programs) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenProgramsNV))
            MH_glGenProgramsNV.invokeExact(PFN_glGenProgramsNV, n, programs);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenProgramsNV", e); }
    }

    public void GetProgramParameterdvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramParameterdvNV))
            MH_glGetProgramParameterdvNV.invokeExact(PFN_glGetProgramParameterdvNV, target, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramParameterdvNV", e); }
    }

    public void GetProgramParameterfvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramParameterfvNV))
            MH_glGetProgramParameterfvNV.invokeExact(PFN_glGetProgramParameterfvNV, target, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramParameterfvNV", e); }
    }

    public void GetProgramivNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramivNV))
            MH_glGetProgramivNV.invokeExact(PFN_glGetProgramivNV, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramivNV", e); }
    }

    public void GetProgramStringNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLubyte *") java.lang.foreign.MemorySegment program) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramStringNV))
            MH_glGetProgramStringNV.invokeExact(PFN_glGetProgramStringNV, id, pname, program);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramStringNV", e); }
    }

    public void GetTrackMatrixivNV(@CType("GLenum") int target, @CType("GLuint") int address, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTrackMatrixivNV))
            MH_glGetTrackMatrixivNV.invokeExact(PFN_glGetTrackMatrixivNV, target, address, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTrackMatrixivNV", e); }
    }

    public void GetVertexAttribdvNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribdvNV))
            MH_glGetVertexAttribdvNV.invokeExact(PFN_glGetVertexAttribdvNV, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribdvNV", e); }
    }

    public void GetVertexAttribfvNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribfvNV))
            MH_glGetVertexAttribfvNV.invokeExact(PFN_glGetVertexAttribfvNV, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribfvNV", e); }
    }

    public void GetVertexAttribivNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribivNV))
            MH_glGetVertexAttribivNV.invokeExact(PFN_glGetVertexAttribivNV, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribivNV", e); }
    }

    public void GetVertexAttribPointervNV(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment pointer) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribPointervNV))
            MH_glGetVertexAttribPointervNV.invokeExact(PFN_glGetVertexAttribPointervNV, index, pname, pointer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribPointervNV", e); }
    }

    public @CType("GLboolean") boolean IsProgramNV(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsProgramNV))
            return (boolean) MH_glIsProgramNV.invokeExact(PFN_glIsProgramNV, id);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgramNV", e); }
    }

    public void LoadProgramNV(@CType("GLenum") int target, @CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment program) {
        try { if (!Unmarshal.isNullPointer(PFN_glLoadProgramNV))
            MH_glLoadProgramNV.invokeExact(PFN_glLoadProgramNV, target, id, len, program);
        }
        catch (Throwable e) { throw new RuntimeException("error in glLoadProgramNV", e); }
    }

    public void ProgramParameter4dNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameter4dNV))
            MH_glProgramParameter4dNV.invokeExact(PFN_glProgramParameter4dNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameter4dNV", e); }
    }

    public void ProgramParameter4dvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameter4dvNV))
            MH_glProgramParameter4dvNV.invokeExact(PFN_glProgramParameter4dvNV, target, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameter4dvNV", e); }
    }

    public void ProgramParameter4fNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameter4fNV))
            MH_glProgramParameter4fNV.invokeExact(PFN_glProgramParameter4fNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameter4fNV", e); }
    }

    public void ProgramParameter4fvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameter4fvNV))
            MH_glProgramParameter4fvNV.invokeExact(PFN_glProgramParameter4fvNV, target, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameter4fvNV", e); }
    }

    public void ProgramParameters4dvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameters4dvNV))
            MH_glProgramParameters4dvNV.invokeExact(PFN_glProgramParameters4dvNV, target, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameters4dvNV", e); }
    }

    public void ProgramParameters4fvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameters4fvNV))
            MH_glProgramParameters4fvNV.invokeExact(PFN_glProgramParameters4fvNV, target, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameters4fvNV", e); }
    }

    public void RequestResidentProgramsNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment programs) {
        try { if (!Unmarshal.isNullPointer(PFN_glRequestResidentProgramsNV))
            MH_glRequestResidentProgramsNV.invokeExact(PFN_glRequestResidentProgramsNV, n, programs);
        }
        catch (Throwable e) { throw new RuntimeException("error in glRequestResidentProgramsNV", e); }
    }

    public void TrackMatrixNV(@CType("GLenum") int target, @CType("GLuint") int address, @CType("GLenum") int matrix, @CType("GLenum") int transform) {
        try { if (!Unmarshal.isNullPointer(PFN_glTrackMatrixNV))
            MH_glTrackMatrixNV.invokeExact(PFN_glTrackMatrixNV, target, address, matrix, transform);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTrackMatrixNV", e); }
    }

    public void VertexAttribPointerNV(@CType("GLuint") int index, @CType("GLint") int fsize, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribPointerNV))
            MH_glVertexAttribPointerNV.invokeExact(PFN_glVertexAttribPointerNV, index, fsize, type, stride, pointer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribPointerNV", e); }
    }

    public void VertexAttrib1dNV(@CType("GLuint") int index, @CType("GLdouble") double x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1dNV))
            MH_glVertexAttrib1dNV.invokeExact(PFN_glVertexAttrib1dNV, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dNV", e); }
    }

    public void VertexAttrib1dvNV(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1dvNV))
            MH_glVertexAttrib1dvNV.invokeExact(PFN_glVertexAttrib1dvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dvNV", e); }
    }

    public void VertexAttrib1fNV(@CType("GLuint") int index, @CType("GLfloat") float x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1fNV))
            MH_glVertexAttrib1fNV.invokeExact(PFN_glVertexAttrib1fNV, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fNV", e); }
    }

    public void VertexAttrib1fvNV(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1fvNV))
            MH_glVertexAttrib1fvNV.invokeExact(PFN_glVertexAttrib1fvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fvNV", e); }
    }

    public void VertexAttrib1sNV(@CType("GLuint") int index, @CType("GLshort") short x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1sNV))
            MH_glVertexAttrib1sNV.invokeExact(PFN_glVertexAttrib1sNV, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1sNV", e); }
    }

    public void VertexAttrib1svNV(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1svNV))
            MH_glVertexAttrib1svNV.invokeExact(PFN_glVertexAttrib1svNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1svNV", e); }
    }

    public void VertexAttrib2dNV(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2dNV))
            MH_glVertexAttrib2dNV.invokeExact(PFN_glVertexAttrib2dNV, index, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dNV", e); }
    }

    public void VertexAttrib2dvNV(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2dvNV))
            MH_glVertexAttrib2dvNV.invokeExact(PFN_glVertexAttrib2dvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dvNV", e); }
    }

    public void VertexAttrib2fNV(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2fNV))
            MH_glVertexAttrib2fNV.invokeExact(PFN_glVertexAttrib2fNV, index, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fNV", e); }
    }

    public void VertexAttrib2fvNV(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2fvNV))
            MH_glVertexAttrib2fvNV.invokeExact(PFN_glVertexAttrib2fvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fvNV", e); }
    }

    public void VertexAttrib2sNV(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2sNV))
            MH_glVertexAttrib2sNV.invokeExact(PFN_glVertexAttrib2sNV, index, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2sNV", e); }
    }

    public void VertexAttrib2svNV(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2svNV))
            MH_glVertexAttrib2svNV.invokeExact(PFN_glVertexAttrib2svNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2svNV", e); }
    }

    public void VertexAttrib3dNV(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3dNV))
            MH_glVertexAttrib3dNV.invokeExact(PFN_glVertexAttrib3dNV, index, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dNV", e); }
    }

    public void VertexAttrib3dvNV(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3dvNV))
            MH_glVertexAttrib3dvNV.invokeExact(PFN_glVertexAttrib3dvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dvNV", e); }
    }

    public void VertexAttrib3fNV(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3fNV))
            MH_glVertexAttrib3fNV.invokeExact(PFN_glVertexAttrib3fNV, index, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fNV", e); }
    }

    public void VertexAttrib3fvNV(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3fvNV))
            MH_glVertexAttrib3fvNV.invokeExact(PFN_glVertexAttrib3fvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fvNV", e); }
    }

    public void VertexAttrib3sNV(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3sNV))
            MH_glVertexAttrib3sNV.invokeExact(PFN_glVertexAttrib3sNV, index, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3sNV", e); }
    }

    public void VertexAttrib3svNV(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3svNV))
            MH_glVertexAttrib3svNV.invokeExact(PFN_glVertexAttrib3svNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3svNV", e); }
    }

    public void VertexAttrib4dNV(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4dNV))
            MH_glVertexAttrib4dNV.invokeExact(PFN_glVertexAttrib4dNV, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dNV", e); }
    }

    public void VertexAttrib4dvNV(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4dvNV))
            MH_glVertexAttrib4dvNV.invokeExact(PFN_glVertexAttrib4dvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dvNV", e); }
    }

    public void VertexAttrib4fNV(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4fNV))
            MH_glVertexAttrib4fNV.invokeExact(PFN_glVertexAttrib4fNV, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fNV", e); }
    }

    public void VertexAttrib4fvNV(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4fvNV))
            MH_glVertexAttrib4fvNV.invokeExact(PFN_glVertexAttrib4fvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fvNV", e); }
    }

    public void VertexAttrib4sNV(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4sNV))
            MH_glVertexAttrib4sNV.invokeExact(PFN_glVertexAttrib4sNV, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4sNV", e); }
    }

    public void VertexAttrib4svNV(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4svNV))
            MH_glVertexAttrib4svNV.invokeExact(PFN_glVertexAttrib4svNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4svNV", e); }
    }

    public void VertexAttrib4ubNV(@CType("GLuint") int index, @CType("GLubyte") byte x, @CType("GLubyte") byte y, @CType("GLubyte") byte z, @CType("GLubyte") byte w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4ubNV))
            MH_glVertexAttrib4ubNV.invokeExact(PFN_glVertexAttrib4ubNV, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ubNV", e); }
    }

    public void VertexAttrib4ubvNV(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4ubvNV))
            MH_glVertexAttrib4ubvNV.invokeExact(PFN_glVertexAttrib4ubvNV, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ubvNV", e); }
    }

    public void VertexAttribs1dvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs1dvNV))
            MH_glVertexAttribs1dvNV.invokeExact(PFN_glVertexAttribs1dvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs1dvNV", e); }
    }

    public void VertexAttribs1fvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs1fvNV))
            MH_glVertexAttribs1fvNV.invokeExact(PFN_glVertexAttribs1fvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs1fvNV", e); }
    }

    public void VertexAttribs1svNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs1svNV))
            MH_glVertexAttribs1svNV.invokeExact(PFN_glVertexAttribs1svNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs1svNV", e); }
    }

    public void VertexAttribs2dvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs2dvNV))
            MH_glVertexAttribs2dvNV.invokeExact(PFN_glVertexAttribs2dvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs2dvNV", e); }
    }

    public void VertexAttribs2fvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs2fvNV))
            MH_glVertexAttribs2fvNV.invokeExact(PFN_glVertexAttribs2fvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs2fvNV", e); }
    }

    public void VertexAttribs2svNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs2svNV))
            MH_glVertexAttribs2svNV.invokeExact(PFN_glVertexAttribs2svNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs2svNV", e); }
    }

    public void VertexAttribs3dvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs3dvNV))
            MH_glVertexAttribs3dvNV.invokeExact(PFN_glVertexAttribs3dvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs3dvNV", e); }
    }

    public void VertexAttribs3fvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs3fvNV))
            MH_glVertexAttribs3fvNV.invokeExact(PFN_glVertexAttribs3fvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs3fvNV", e); }
    }

    public void VertexAttribs3svNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs3svNV))
            MH_glVertexAttribs3svNV.invokeExact(PFN_glVertexAttribs3svNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs3svNV", e); }
    }

    public void VertexAttribs4dvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs4dvNV))
            MH_glVertexAttribs4dvNV.invokeExact(PFN_glVertexAttribs4dvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs4dvNV", e); }
    }

    public void VertexAttribs4fvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs4fvNV))
            MH_glVertexAttribs4fvNV.invokeExact(PFN_glVertexAttribs4fvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs4fvNV", e); }
    }

    public void VertexAttribs4svNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs4svNV))
            MH_glVertexAttribs4svNV.invokeExact(PFN_glVertexAttribs4svNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs4svNV", e); }
    }

    public void VertexAttribs4ubvNV(@CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribs4ubvNV))
            MH_glVertexAttribs4ubvNV.invokeExact(PFN_glVertexAttribs4ubvNV, index, count, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs4ubvNV", e); }
    }

}
