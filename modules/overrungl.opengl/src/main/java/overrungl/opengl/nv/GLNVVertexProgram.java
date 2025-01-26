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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAreProgramsResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glExecuteProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramParameterdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStringNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTrackMatrixivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribPointervNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLoadProgramNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramParameter4dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramParameter4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramParameter4fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramParameter4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramParameters4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramParameters4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRequestResidentProgramsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTrackMatrixNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribPointerNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib1dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib1fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib2dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib2fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib3dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib3fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4sNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ubNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexAttrib4ubvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs1dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs1fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs1svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs2dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs2fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs2svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs3dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs3fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs3svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs4svNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs4ubvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glAreProgramsResidentNV;
        public final MemorySegment PFN_glBindProgramNV;
        public final MemorySegment PFN_glDeleteProgramsNV;
        public final MemorySegment PFN_glExecuteProgramNV;
        public final MemorySegment PFN_glGenProgramsNV;
        public final MemorySegment PFN_glGetProgramParameterdvNV;
        public final MemorySegment PFN_glGetProgramParameterfvNV;
        public final MemorySegment PFN_glGetProgramivNV;
        public final MemorySegment PFN_glGetProgramStringNV;
        public final MemorySegment PFN_glGetTrackMatrixivNV;
        public final MemorySegment PFN_glGetVertexAttribdvNV;
        public final MemorySegment PFN_glGetVertexAttribfvNV;
        public final MemorySegment PFN_glGetVertexAttribivNV;
        public final MemorySegment PFN_glGetVertexAttribPointervNV;
        public final MemorySegment PFN_glIsProgramNV;
        public final MemorySegment PFN_glLoadProgramNV;
        public final MemorySegment PFN_glProgramParameter4dNV;
        public final MemorySegment PFN_glProgramParameter4dvNV;
        public final MemorySegment PFN_glProgramParameter4fNV;
        public final MemorySegment PFN_glProgramParameter4fvNV;
        public final MemorySegment PFN_glProgramParameters4dvNV;
        public final MemorySegment PFN_glProgramParameters4fvNV;
        public final MemorySegment PFN_glRequestResidentProgramsNV;
        public final MemorySegment PFN_glTrackMatrixNV;
        public final MemorySegment PFN_glVertexAttribPointerNV;
        public final MemorySegment PFN_glVertexAttrib1dNV;
        public final MemorySegment PFN_glVertexAttrib1dvNV;
        public final MemorySegment PFN_glVertexAttrib1fNV;
        public final MemorySegment PFN_glVertexAttrib1fvNV;
        public final MemorySegment PFN_glVertexAttrib1sNV;
        public final MemorySegment PFN_glVertexAttrib1svNV;
        public final MemorySegment PFN_glVertexAttrib2dNV;
        public final MemorySegment PFN_glVertexAttrib2dvNV;
        public final MemorySegment PFN_glVertexAttrib2fNV;
        public final MemorySegment PFN_glVertexAttrib2fvNV;
        public final MemorySegment PFN_glVertexAttrib2sNV;
        public final MemorySegment PFN_glVertexAttrib2svNV;
        public final MemorySegment PFN_glVertexAttrib3dNV;
        public final MemorySegment PFN_glVertexAttrib3dvNV;
        public final MemorySegment PFN_glVertexAttrib3fNV;
        public final MemorySegment PFN_glVertexAttrib3fvNV;
        public final MemorySegment PFN_glVertexAttrib3sNV;
        public final MemorySegment PFN_glVertexAttrib3svNV;
        public final MemorySegment PFN_glVertexAttrib4dNV;
        public final MemorySegment PFN_glVertexAttrib4dvNV;
        public final MemorySegment PFN_glVertexAttrib4fNV;
        public final MemorySegment PFN_glVertexAttrib4fvNV;
        public final MemorySegment PFN_glVertexAttrib4sNV;
        public final MemorySegment PFN_glVertexAttrib4svNV;
        public final MemorySegment PFN_glVertexAttrib4ubNV;
        public final MemorySegment PFN_glVertexAttrib4ubvNV;
        public final MemorySegment PFN_glVertexAttribs1dvNV;
        public final MemorySegment PFN_glVertexAttribs1fvNV;
        public final MemorySegment PFN_glVertexAttribs1svNV;
        public final MemorySegment PFN_glVertexAttribs2dvNV;
        public final MemorySegment PFN_glVertexAttribs2fvNV;
        public final MemorySegment PFN_glVertexAttribs2svNV;
        public final MemorySegment PFN_glVertexAttribs3dvNV;
        public final MemorySegment PFN_glVertexAttribs3fvNV;
        public final MemorySegment PFN_glVertexAttribs3svNV;
        public final MemorySegment PFN_glVertexAttribs4dvNV;
        public final MemorySegment PFN_glVertexAttribs4fvNV;
        public final MemorySegment PFN_glVertexAttribs4svNV;
        public final MemorySegment PFN_glVertexAttribs4ubvNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLNVVertexProgram(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// GLboolean glAreProgramsResidentNV(GLsizei n, const GLuint* programs, GLboolean* residences);
    /// ```
    public boolean AreProgramsResidentNV(int n, MemorySegment programs, MemorySegment residences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAreProgramsResidentNV)) throw new SymbolNotFoundError("Symbol not found: glAreProgramsResidentNV");
        try { return (((byte) Handles.MH_glAreProgramsResidentNV.invokeExact(handles.PFN_glAreProgramsResidentNV, n, programs, residences)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AreProgramsResidentNV", e); }
    }

    /// ```
    /// void glBindProgramNV(GLenum target, GLuint id);
    /// ```
    public void BindProgramNV(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramNV)) throw new SymbolNotFoundError("Symbol not found: glBindProgramNV");
        try { Handles.MH_glBindProgramNV.invokeExact(handles.PFN_glBindProgramNV, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramNV", e); }
    }

    /// ```
    /// void glDeleteProgramsNV(GLsizei n, const GLuint* programs);
    /// ```
    public void DeleteProgramsNV(int n, MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramsNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgramsNV");
        try { Handles.MH_glDeleteProgramsNV.invokeExact(handles.PFN_glDeleteProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramsNV", e); }
    }

    /// ```
    /// void glExecuteProgramNV(GLenum target, GLuint id, const GLfloat* params);
    /// ```
    public void ExecuteProgramNV(int target, int id, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glExecuteProgramNV)) throw new SymbolNotFoundError("Symbol not found: glExecuteProgramNV");
        try { Handles.MH_glExecuteProgramNV.invokeExact(handles.PFN_glExecuteProgramNV, target, id, params); }
        catch (Throwable e) { throw new RuntimeException("error in ExecuteProgramNV", e); }
    }

    /// ```
    /// void glGenProgramsNV(GLsizei n, GLuint* programs);
    /// ```
    public void GenProgramsNV(int n, MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramsNV)) throw new SymbolNotFoundError("Symbol not found: glGenProgramsNV");
        try { Handles.MH_glGenProgramsNV.invokeExact(handles.PFN_glGenProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramsNV", e); }
    }

    /// ```
    /// void glGetProgramParameterdvNV(GLenum target, GLuint index, GLenum pname, GLdouble* params);
    /// ```
    public void GetProgramParameterdvNV(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramParameterdvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramParameterdvNV");
        try { Handles.MH_glGetProgramParameterdvNV.invokeExact(handles.PFN_glGetProgramParameterdvNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramParameterdvNV", e); }
    }

    /// ```
    /// void glGetProgramParameterfvNV(GLenum target, GLuint index, GLenum pname, GLfloat* params);
    /// ```
    public void GetProgramParameterfvNV(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramParameterfvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramParameterfvNV");
        try { Handles.MH_glGetProgramParameterfvNV.invokeExact(handles.PFN_glGetProgramParameterfvNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramParameterfvNV", e); }
    }

    /// ```
    /// void glGetProgramivNV(GLuint id, GLenum pname, GLint* params);
    /// ```
    public void GetProgramivNV(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramivNV");
        try { Handles.MH_glGetProgramivNV.invokeExact(handles.PFN_glGetProgramivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramivNV", e); }
    }

    /// ```
    /// void glGetProgramStringNV(GLuint id, GLenum pname, GLubyte* program);
    /// ```
    public void GetProgramStringNV(int id, int pname, MemorySegment program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStringNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramStringNV");
        try { Handles.MH_glGetProgramStringNV.invokeExact(handles.PFN_glGetProgramStringNV, id, pname, program); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStringNV", e); }
    }

    /// ```
    /// void glGetTrackMatrixivNV(GLenum target, GLuint address, GLenum pname, GLint* params);
    /// ```
    public void GetTrackMatrixivNV(int target, int address, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTrackMatrixivNV)) throw new SymbolNotFoundError("Symbol not found: glGetTrackMatrixivNV");
        try { Handles.MH_glGetTrackMatrixivNV.invokeExact(handles.PFN_glGetTrackMatrixivNV, target, address, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTrackMatrixivNV", e); }
    }

    /// ```
    /// void glGetVertexAttribdvNV(GLuint index, GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribdvNV(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribdvNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribdvNV");
        try { Handles.MH_glGetVertexAttribdvNV.invokeExact(handles.PFN_glGetVertexAttribdvNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribdvNV", e); }
    }

    /// ```
    /// void glGetVertexAttribfvNV(GLuint index, GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribfvNV(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribfvNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribfvNV");
        try { Handles.MH_glGetVertexAttribfvNV.invokeExact(handles.PFN_glGetVertexAttribfvNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribfvNV", e); }
    }

    /// ```
    /// void glGetVertexAttribivNV(GLuint index, GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribivNV(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribivNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribivNV");
        try { Handles.MH_glGetVertexAttribivNV.invokeExact(handles.PFN_glGetVertexAttribivNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribivNV", e); }
    }

    /// ```
    /// void glGetVertexAttribPointervNV(GLuint index, GLenum pname, void** pointer);
    /// ```
    public void GetVertexAttribPointervNV(int index, int pname, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribPointervNV)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribPointervNV");
        try { Handles.MH_glGetVertexAttribPointervNV.invokeExact(handles.PFN_glGetVertexAttribPointervNV, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribPointervNV", e); }
    }

    /// ```
    /// GLboolean glIsProgramNV(GLuint id);
    /// ```
    public boolean IsProgramNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramNV)) throw new SymbolNotFoundError("Symbol not found: glIsProgramNV");
        try { return (((byte) Handles.MH_glIsProgramNV.invokeExact(handles.PFN_glIsProgramNV, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramNV", e); }
    }

    /// ```
    /// void glLoadProgramNV(GLenum target, GLuint id, GLsizei len, const GLubyte* program);
    /// ```
    public void LoadProgramNV(int target, int id, int len, MemorySegment program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadProgramNV)) throw new SymbolNotFoundError("Symbol not found: glLoadProgramNV");
        try { Handles.MH_glLoadProgramNV.invokeExact(handles.PFN_glLoadProgramNV, target, id, len, program); }
        catch (Throwable e) { throw new RuntimeException("error in LoadProgramNV", e); }
    }

    /// ```
    /// void glProgramParameter4dNV(GLenum target, GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w);
    /// ```
    public void ProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4dNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameter4dNV");
        try { Handles.MH_glProgramParameter4dNV.invokeExact(handles.PFN_glProgramParameter4dNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4dNV", e); }
    }

    /// ```
    /// void glProgramParameter4dvNV(GLenum target, GLuint index, const GLdouble* v);
    /// ```
    public void ProgramParameter4dvNV(int target, int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4dvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameter4dvNV");
        try { Handles.MH_glProgramParameter4dvNV.invokeExact(handles.PFN_glProgramParameter4dvNV, target, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4dvNV", e); }
    }

    /// ```
    /// void glProgramParameter4fNV(GLenum target, GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w);
    /// ```
    public void ProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4fNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameter4fNV");
        try { Handles.MH_glProgramParameter4fNV.invokeExact(handles.PFN_glProgramParameter4fNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4fNV", e); }
    }

    /// ```
    /// void glProgramParameter4fvNV(GLenum target, GLuint index, const GLfloat* v);
    /// ```
    public void ProgramParameter4fvNV(int target, int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4fvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameter4fvNV");
        try { Handles.MH_glProgramParameter4fvNV.invokeExact(handles.PFN_glProgramParameter4fvNV, target, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4fvNV", e); }
    }

    /// ```
    /// void glProgramParameters4dvNV(GLenum target, GLuint index, GLsizei count, const GLdouble* v);
    /// ```
    public void ProgramParameters4dvNV(int target, int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameters4dvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameters4dvNV");
        try { Handles.MH_glProgramParameters4dvNV.invokeExact(handles.PFN_glProgramParameters4dvNV, target, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameters4dvNV", e); }
    }

    /// ```
    /// void glProgramParameters4fvNV(GLenum target, GLuint index, GLsizei count, const GLfloat* v);
    /// ```
    public void ProgramParameters4fvNV(int target, int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameters4fvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramParameters4fvNV");
        try { Handles.MH_glProgramParameters4fvNV.invokeExact(handles.PFN_glProgramParameters4fvNV, target, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameters4fvNV", e); }
    }

    /// ```
    /// void glRequestResidentProgramsNV(GLsizei n, const GLuint* programs);
    /// ```
    public void RequestResidentProgramsNV(int n, MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRequestResidentProgramsNV)) throw new SymbolNotFoundError("Symbol not found: glRequestResidentProgramsNV");
        try { Handles.MH_glRequestResidentProgramsNV.invokeExact(handles.PFN_glRequestResidentProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in RequestResidentProgramsNV", e); }
    }

    /// ```
    /// void glTrackMatrixNV(GLenum target, GLuint address, GLenum matrix, GLenum transform);
    /// ```
    public void TrackMatrixNV(int target, int address, int matrix, int transform) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTrackMatrixNV)) throw new SymbolNotFoundError("Symbol not found: glTrackMatrixNV");
        try { Handles.MH_glTrackMatrixNV.invokeExact(handles.PFN_glTrackMatrixNV, target, address, matrix, transform); }
        catch (Throwable e) { throw new RuntimeException("error in TrackMatrixNV", e); }
    }

    /// ```
    /// void glVertexAttribPointerNV(GLuint index, GLint fsize, GLenum type, GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribPointerNV(int index, int fsize, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribPointerNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribPointerNV");
        try { Handles.MH_glVertexAttribPointerNV.invokeExact(handles.PFN_glVertexAttribPointerNV, index, fsize, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribPointerNV", e); }
    }

    /// ```
    /// void glVertexAttrib1dNV(GLuint index, GLdouble x);
    /// ```
    public void VertexAttrib1dNV(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dNV");
        try { Handles.MH_glVertexAttrib1dNV.invokeExact(handles.PFN_glVertexAttrib1dNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dNV", e); }
    }

    /// ```
    /// void glVertexAttrib1dvNV(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib1dvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dvNV");
        try { Handles.MH_glVertexAttrib1dvNV.invokeExact(handles.PFN_glVertexAttrib1dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dvNV", e); }
    }

    /// ```
    /// void glVertexAttrib1fNV(GLuint index, GLfloat x);
    /// ```
    public void VertexAttrib1fNV(int index, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fNV");
        try { Handles.MH_glVertexAttrib1fNV.invokeExact(handles.PFN_glVertexAttrib1fNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fNV", e); }
    }

    /// ```
    /// void glVertexAttrib1fvNV(GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib1fvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fvNV");
        try { Handles.MH_glVertexAttrib1fvNV.invokeExact(handles.PFN_glVertexAttrib1fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fvNV", e); }
    }

    /// ```
    /// void glVertexAttrib1sNV(GLuint index, GLshort x);
    /// ```
    public void VertexAttrib1sNV(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1sNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1sNV");
        try { Handles.MH_glVertexAttrib1sNV.invokeExact(handles.PFN_glVertexAttrib1sNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1sNV", e); }
    }

    /// ```
    /// void glVertexAttrib1svNV(GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib1svNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1svNV");
        try { Handles.MH_glVertexAttrib1svNV.invokeExact(handles.PFN_glVertexAttrib1svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1svNV", e); }
    }

    /// ```
    /// void glVertexAttrib2dNV(GLuint index, GLdouble x, GLdouble y);
    /// ```
    public void VertexAttrib2dNV(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dNV");
        try { Handles.MH_glVertexAttrib2dNV.invokeExact(handles.PFN_glVertexAttrib2dNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dNV", e); }
    }

    /// ```
    /// void glVertexAttrib2dvNV(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib2dvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dvNV");
        try { Handles.MH_glVertexAttrib2dvNV.invokeExact(handles.PFN_glVertexAttrib2dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dvNV", e); }
    }

    /// ```
    /// void glVertexAttrib2fNV(GLuint index, GLfloat x, GLfloat y);
    /// ```
    public void VertexAttrib2fNV(int index, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fNV");
        try { Handles.MH_glVertexAttrib2fNV.invokeExact(handles.PFN_glVertexAttrib2fNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fNV", e); }
    }

    /// ```
    /// void glVertexAttrib2fvNV(GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib2fvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fvNV");
        try { Handles.MH_glVertexAttrib2fvNV.invokeExact(handles.PFN_glVertexAttrib2fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fvNV", e); }
    }

    /// ```
    /// void glVertexAttrib2sNV(GLuint index, GLshort x, GLshort y);
    /// ```
    public void VertexAttrib2sNV(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2sNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2sNV");
        try { Handles.MH_glVertexAttrib2sNV.invokeExact(handles.PFN_glVertexAttrib2sNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2sNV", e); }
    }

    /// ```
    /// void glVertexAttrib2svNV(GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib2svNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2svNV");
        try { Handles.MH_glVertexAttrib2svNV.invokeExact(handles.PFN_glVertexAttrib2svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2svNV", e); }
    }

    /// ```
    /// void glVertexAttrib3dNV(GLuint index, GLdouble x, GLdouble y, GLdouble z);
    /// ```
    public void VertexAttrib3dNV(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dNV");
        try { Handles.MH_glVertexAttrib3dNV.invokeExact(handles.PFN_glVertexAttrib3dNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dNV", e); }
    }

    /// ```
    /// void glVertexAttrib3dvNV(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib3dvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dvNV");
        try { Handles.MH_glVertexAttrib3dvNV.invokeExact(handles.PFN_glVertexAttrib3dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dvNV", e); }
    }

    /// ```
    /// void glVertexAttrib3fNV(GLuint index, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void VertexAttrib3fNV(int index, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fNV");
        try { Handles.MH_glVertexAttrib3fNV.invokeExact(handles.PFN_glVertexAttrib3fNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fNV", e); }
    }

    /// ```
    /// void glVertexAttrib3fvNV(GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib3fvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fvNV");
        try { Handles.MH_glVertexAttrib3fvNV.invokeExact(handles.PFN_glVertexAttrib3fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fvNV", e); }
    }

    /// ```
    /// void glVertexAttrib3sNV(GLuint index, GLshort x, GLshort y, GLshort z);
    /// ```
    public void VertexAttrib3sNV(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3sNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3sNV");
        try { Handles.MH_glVertexAttrib3sNV.invokeExact(handles.PFN_glVertexAttrib3sNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3sNV", e); }
    }

    /// ```
    /// void glVertexAttrib3svNV(GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib3svNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3svNV");
        try { Handles.MH_glVertexAttrib3svNV.invokeExact(handles.PFN_glVertexAttrib3svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3svNV", e); }
    }

    /// ```
    /// void glVertexAttrib4dNV(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w);
    /// ```
    public void VertexAttrib4dNV(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dNV");
        try { Handles.MH_glVertexAttrib4dNV.invokeExact(handles.PFN_glVertexAttrib4dNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dNV", e); }
    }

    /// ```
    /// void glVertexAttrib4dvNV(GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib4dvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dvNV");
        try { Handles.MH_glVertexAttrib4dvNV.invokeExact(handles.PFN_glVertexAttrib4dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dvNV", e); }
    }

    /// ```
    /// void glVertexAttrib4fNV(GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w);
    /// ```
    public void VertexAttrib4fNV(int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fNV");
        try { Handles.MH_glVertexAttrib4fNV.invokeExact(handles.PFN_glVertexAttrib4fNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fNV", e); }
    }

    /// ```
    /// void glVertexAttrib4fvNV(GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib4fvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fvNV");
        try { Handles.MH_glVertexAttrib4fvNV.invokeExact(handles.PFN_glVertexAttrib4fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fvNV", e); }
    }

    /// ```
    /// void glVertexAttrib4sNV(GLuint index, GLshort x, GLshort y, GLshort z, GLshort w);
    /// ```
    public void VertexAttrib4sNV(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4sNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4sNV");
        try { Handles.MH_glVertexAttrib4sNV.invokeExact(handles.PFN_glVertexAttrib4sNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4sNV", e); }
    }

    /// ```
    /// void glVertexAttrib4svNV(GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4svNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4svNV");
        try { Handles.MH_glVertexAttrib4svNV.invokeExact(handles.PFN_glVertexAttrib4svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4svNV", e); }
    }

    /// ```
    /// void glVertexAttrib4ubNV(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w);
    /// ```
    public void VertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ubNV");
        try { Handles.MH_glVertexAttrib4ubNV.invokeExact(handles.PFN_glVertexAttrib4ubNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubNV", e); }
    }

    /// ```
    /// void glVertexAttrib4ubvNV(GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4ubvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ubvNV");
        try { Handles.MH_glVertexAttrib4ubvNV.invokeExact(handles.PFN_glVertexAttrib4ubvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubvNV", e); }
    }

    /// ```
    /// void glVertexAttribs1dvNV(GLuint index, GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs1dvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs1dvNV");
        try { Handles.MH_glVertexAttribs1dvNV.invokeExact(handles.PFN_glVertexAttribs1dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1dvNV", e); }
    }

    /// ```
    /// void glVertexAttribs1fvNV(GLuint index, GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs1fvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs1fvNV");
        try { Handles.MH_glVertexAttribs1fvNV.invokeExact(handles.PFN_glVertexAttribs1fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1fvNV", e); }
    }

    /// ```
    /// void glVertexAttribs1svNV(GLuint index, GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs1svNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs1svNV");
        try { Handles.MH_glVertexAttribs1svNV.invokeExact(handles.PFN_glVertexAttribs1svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1svNV", e); }
    }

    /// ```
    /// void glVertexAttribs2dvNV(GLuint index, GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs2dvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs2dvNV");
        try { Handles.MH_glVertexAttribs2dvNV.invokeExact(handles.PFN_glVertexAttribs2dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2dvNV", e); }
    }

    /// ```
    /// void glVertexAttribs2fvNV(GLuint index, GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs2fvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs2fvNV");
        try { Handles.MH_glVertexAttribs2fvNV.invokeExact(handles.PFN_glVertexAttribs2fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2fvNV", e); }
    }

    /// ```
    /// void glVertexAttribs2svNV(GLuint index, GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs2svNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs2svNV");
        try { Handles.MH_glVertexAttribs2svNV.invokeExact(handles.PFN_glVertexAttribs2svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2svNV", e); }
    }

    /// ```
    /// void glVertexAttribs3dvNV(GLuint index, GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs3dvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs3dvNV");
        try { Handles.MH_glVertexAttribs3dvNV.invokeExact(handles.PFN_glVertexAttribs3dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3dvNV", e); }
    }

    /// ```
    /// void glVertexAttribs3fvNV(GLuint index, GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs3fvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs3fvNV");
        try { Handles.MH_glVertexAttribs3fvNV.invokeExact(handles.PFN_glVertexAttribs3fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3fvNV", e); }
    }

    /// ```
    /// void glVertexAttribs3svNV(GLuint index, GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs3svNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs3svNV");
        try { Handles.MH_glVertexAttribs3svNV.invokeExact(handles.PFN_glVertexAttribs3svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3svNV", e); }
    }

    /// ```
    /// void glVertexAttribs4dvNV(GLuint index, GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs4dvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4dvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4dvNV");
        try { Handles.MH_glVertexAttribs4dvNV.invokeExact(handles.PFN_glVertexAttribs4dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4dvNV", e); }
    }

    /// ```
    /// void glVertexAttribs4fvNV(GLuint index, GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs4fvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4fvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4fvNV");
        try { Handles.MH_glVertexAttribs4fvNV.invokeExact(handles.PFN_glVertexAttribs4fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4fvNV", e); }
    }

    /// ```
    /// void glVertexAttribs4svNV(GLuint index, GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs4svNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4svNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4svNV");
        try { Handles.MH_glVertexAttribs4svNV.invokeExact(handles.PFN_glVertexAttribs4svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4svNV", e); }
    }

    /// ```
    /// void glVertexAttribs4ubvNV(GLuint index, GLsizei count, const GLubyte* v);
    /// ```
    public void VertexAttribs4ubvNV(int index, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4ubvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4ubvNV");
        try { Handles.MH_glVertexAttribs4ubvNV.invokeExact(handles.PFN_glVertexAttribs4ubvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4ubvNV", e); }
    }

}
