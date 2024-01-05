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
 * {@code GL_NV_register_combiners}
 */
public final class GLNVRegisterCombiners {
    public static final int GL_REGISTER_COMBINERS_NV = 0x8522;
    public static final int GL_VARIABLE_A_NV = 0x8523;
    public static final int GL_VARIABLE_B_NV = 0x8524;
    public static final int GL_VARIABLE_C_NV = 0x8525;
    public static final int GL_VARIABLE_D_NV = 0x8526;
    public static final int GL_VARIABLE_E_NV = 0x8527;
    public static final int GL_VARIABLE_F_NV = 0x8528;
    public static final int GL_VARIABLE_G_NV = 0x8529;
    public static final int GL_CONSTANT_COLOR0_NV = 0x852A;
    public static final int GL_CONSTANT_COLOR1_NV = 0x852B;
    public static final int GL_SPARE0_NV = 0x852E;
    public static final int GL_SPARE1_NV = 0x852F;
    public static final int GL_DISCARD_NV = 0x8530;
    public static final int GL_E_TIMES_F_NV = 0x8531;
    public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 0x8532;
    public static final int GL_UNSIGNED_IDENTITY_NV = 0x8536;
    public static final int GL_UNSIGNED_INVERT_NV = 0x8537;
    public static final int GL_EXPAND_NORMAL_NV = 0x8538;
    public static final int GL_EXPAND_NEGATE_NV = 0x8539;
    public static final int GL_HALF_BIAS_NORMAL_NV = 0x853A;
    public static final int GL_HALF_BIAS_NEGATE_NV = 0x853B;
    public static final int GL_SIGNED_IDENTITY_NV = 0x853C;
    public static final int GL_SIGNED_NEGATE_NV = 0x853D;
    public static final int GL_SCALE_BY_TWO_NV = 0x853E;
    public static final int GL_SCALE_BY_FOUR_NV = 0x853F;
    public static final int GL_SCALE_BY_ONE_HALF_NV = 0x8540;
    public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 0x8541;
    public static final int GL_COMBINER_INPUT_NV = 0x8542;
    public static final int GL_COMBINER_MAPPING_NV = 0x8543;
    public static final int GL_COMBINER_COMPONENT_USAGE_NV = 0x8544;
    public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = 0x8545;
    public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = 0x8546;
    public static final int GL_COMBINER_MUX_SUM_NV = 0x8547;
    public static final int GL_COMBINER_SCALE_NV = 0x8548;
    public static final int GL_COMBINER_BIAS_NV = 0x8549;
    public static final int GL_COMBINER_AB_OUTPUT_NV = 0x854A;
    public static final int GL_COMBINER_CD_OUTPUT_NV = 0x854B;
    public static final int GL_COMBINER_SUM_OUTPUT_NV = 0x854C;
    public static final int GL_MAX_GENERAL_COMBINERS_NV = 0x854D;
    public static final int GL_NUM_GENERAL_COMBINERS_NV = 0x854E;
    public static final int GL_COLOR_SUM_CLAMP_NV = 0x854F;
    public static final int GL_COMBINER0_NV = 0x8550;
    public static final int GL_COMBINER1_NV = 0x8551;
    public static final int GL_COMBINER2_NV = 0x8552;
    public static final int GL_COMBINER3_NV = 0x8553;
    public static final int GL_COMBINER4_NV = 0x8554;
    public static final int GL_COMBINER5_NV = 0x8555;
    public static final int GL_COMBINER6_NV = 0x8556;
    public static final int GL_COMBINER7_NV = 0x8557;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_register_combiners) return;
        ext.glCombinerParameterfvNV = load.invoke("glCombinerParameterfvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glCombinerParameterfNV = load.invoke("glCombinerParameterfNV", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glCombinerParameterivNV = load.invoke("glCombinerParameterivNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glCombinerParameteriNV = load.invoke("glCombinerParameteriNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glCombinerInputNV = load.invoke("glCombinerInputNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCombinerOutputNV = load.invoke("glCombinerOutputNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glFinalCombinerInputNV = load.invoke("glFinalCombinerInputNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetCombinerInputParameterfvNV = load.invoke("glGetCombinerInputParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCombinerInputParameterivNV = load.invoke("glGetCombinerInputParameterivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCombinerOutputParameterfvNV = load.invoke("glGetCombinerOutputParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCombinerOutputParameterivNV = load.invoke("glGetCombinerOutputParameterivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFinalCombinerInputParameterfvNV = load.invoke("glGetFinalCombinerInputParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFinalCombinerInputParameterivNV = load.invoke("glGetFinalCombinerInputParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glCombinerParameterfvNV(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerParameterfvNV).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCombinerParameterfNV(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerParameterfNV).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCombinerParameterivNV(int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerParameterivNV).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCombinerParameteriNV(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerParameteriNV).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerInputNV).invokeExact(stage, portion, variable, input, mapping, componentUsage);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct, boolean cdDotProduct, boolean muxSum) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerOutputNV).invokeExact(stage, portion, abOutput, cdOutput, sumOutput, scale, bias, abDotProduct, cdDotProduct, muxSum);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFinalCombinerInputNV(int variable, int input, int mapping, int componentUsage) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFinalCombinerInputNV).invokeExact(variable, input, mapping, componentUsage);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCombinerInputParameterfvNV(int stage, int portion, int variable, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCombinerInputParameterfvNV).invokeExact(stage, portion, variable, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCombinerInputParameterivNV(int stage, int portion, int variable, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCombinerInputParameterivNV).invokeExact(stage, portion, variable, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCombinerOutputParameterfvNV(int stage, int portion, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCombinerOutputParameterfvNV).invokeExact(stage, portion, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCombinerOutputParameterivNV(int stage, int portion, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCombinerOutputParameterivNV).invokeExact(stage, portion, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFinalCombinerInputParameterfvNV(int variable, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFinalCombinerInputParameterfvNV).invokeExact(variable, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFinalCombinerInputParameterivNV(int variable, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFinalCombinerInputParameterivNV).invokeExact(variable, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
