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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_register_combiners}
 */
public interface GLNVRegisterCombiners {
    int GL_REGISTER_COMBINERS_NV = 0x8522;
    int GL_VARIABLE_A_NV = 0x8523;
    int GL_VARIABLE_B_NV = 0x8524;
    int GL_VARIABLE_C_NV = 0x8525;
    int GL_VARIABLE_D_NV = 0x8526;
    int GL_VARIABLE_E_NV = 0x8527;
    int GL_VARIABLE_F_NV = 0x8528;
    int GL_VARIABLE_G_NV = 0x8529;
    int GL_CONSTANT_COLOR0_NV = 0x852A;
    int GL_CONSTANT_COLOR1_NV = 0x852B;
    int GL_SPARE0_NV = 0x852E;
    int GL_SPARE1_NV = 0x852F;
    int GL_DISCARD_NV = 0x8530;
    int GL_E_TIMES_F_NV = 0x8531;
    int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 0x8532;
    int GL_UNSIGNED_IDENTITY_NV = 0x8536;
    int GL_UNSIGNED_INVERT_NV = 0x8537;
    int GL_EXPAND_NORMAL_NV = 0x8538;
    int GL_EXPAND_NEGATE_NV = 0x8539;
    int GL_HALF_BIAS_NORMAL_NV = 0x853A;
    int GL_HALF_BIAS_NEGATE_NV = 0x853B;
    int GL_SIGNED_IDENTITY_NV = 0x853C;
    int GL_SIGNED_NEGATE_NV = 0x853D;
    int GL_SCALE_BY_TWO_NV = 0x853E;
    int GL_SCALE_BY_FOUR_NV = 0x853F;
    int GL_SCALE_BY_ONE_HALF_NV = 0x8540;
    int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 0x8541;
    int GL_COMBINER_INPUT_NV = 0x8542;
    int GL_COMBINER_MAPPING_NV = 0x8543;
    int GL_COMBINER_COMPONENT_USAGE_NV = 0x8544;
    int GL_COMBINER_AB_DOT_PRODUCT_NV = 0x8545;
    int GL_COMBINER_CD_DOT_PRODUCT_NV = 0x8546;
    int GL_COMBINER_MUX_SUM_NV = 0x8547;
    int GL_COMBINER_SCALE_NV = 0x8548;
    int GL_COMBINER_BIAS_NV = 0x8549;
    int GL_COMBINER_AB_OUTPUT_NV = 0x854A;
    int GL_COMBINER_CD_OUTPUT_NV = 0x854B;
    int GL_COMBINER_SUM_OUTPUT_NV = 0x854C;
    int GL_MAX_GENERAL_COMBINERS_NV = 0x854D;
    int GL_NUM_GENERAL_COMBINERS_NV = 0x854E;
    int GL_COLOR_SUM_CLAMP_NV = 0x854F;
    int GL_COMBINER0_NV = 0x8550;
    int GL_COMBINER1_NV = 0x8551;
    int GL_COMBINER2_NV = 0x8552;
    int GL_COMBINER3_NV = 0x8553;
    int GL_COMBINER4_NV = 0x8554;
    int GL_COMBINER5_NV = 0x8555;
    int GL_COMBINER6_NV = 0x8556;
    int GL_COMBINER7_NV = 0x8557;

    void glCombinerParameterfvNV(int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glCombinerParameterfNV(int pname, float param);
    void glCombinerParameterivNV(int pname, @NativeType("const GLint *") MemorySegment params);
    void glCombinerParameteriNV(int pname, int param);
    void glCombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage);
    void glCombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct, boolean cdDotProduct, boolean muxSum);
    void glFinalCombinerInputNV(int variable, int input, int mapping, int componentUsage);
    void glGetCombinerInputParameterfvNV(int stage, int portion, int variable, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetCombinerInputParameterivNV(int stage, int portion, int variable, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetCombinerOutputParameterfvNV(int stage, int portion, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetCombinerOutputParameterivNV(int stage, int portion, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetFinalCombinerInputParameterfvNV(int variable, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetFinalCombinerInputParameterivNV(int variable, int pname, @NativeType("GLint *") MemorySegment params);
}
