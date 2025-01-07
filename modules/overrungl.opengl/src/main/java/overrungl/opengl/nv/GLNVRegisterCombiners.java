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
    public static final int GL_PRIMARY_COLOR_NV = 0x852C;
    public static final int GL_SECONDARY_COLOR_NV = 0x852D;
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
    public static final int GL_TEXTURE0_ARB = 0x84C0;
    public static final int GL_TEXTURE1_ARB = 0x84C1;
    public static final int GL_ZERO = 0;
    public static final int GL_NONE = 0;
    public static final int GL_FOG = 0x0B60;
    public static final MethodHandle MH_glCombinerParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCombinerParameterfvNV;
    public static final MethodHandle MH_glCombinerParameterfNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glCombinerParameterfNV;
    public static final MethodHandle MH_glCombinerParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCombinerParameterivNV;
    public static final MethodHandle MH_glCombinerParameteriNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCombinerParameteriNV;
    public static final MethodHandle MH_glCombinerInputNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCombinerInputNV;
    public static final MethodHandle MH_glCombinerOutputNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glCombinerOutputNV;
    public static final MethodHandle MH_glFinalCombinerInputNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFinalCombinerInputNV;
    public static final MethodHandle MH_glGetCombinerInputParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCombinerInputParameterfvNV;
    public static final MethodHandle MH_glGetCombinerInputParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCombinerInputParameterivNV;
    public static final MethodHandle MH_glGetCombinerOutputParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCombinerOutputParameterfvNV;
    public static final MethodHandle MH_glGetCombinerOutputParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCombinerOutputParameterivNV;
    public static final MethodHandle MH_glGetFinalCombinerInputParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFinalCombinerInputParameterfvNV;
    public static final MethodHandle MH_glGetFinalCombinerInputParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFinalCombinerInputParameterivNV;

    public GLNVRegisterCombiners(overrungl.opengl.GLLoadFunc func) {
        PFN_glCombinerParameterfvNV = func.invoke("glCombinerParameterfvNV");
        PFN_glCombinerParameterfNV = func.invoke("glCombinerParameterfNV");
        PFN_glCombinerParameterivNV = func.invoke("glCombinerParameterivNV");
        PFN_glCombinerParameteriNV = func.invoke("glCombinerParameteriNV");
        PFN_glCombinerInputNV = func.invoke("glCombinerInputNV");
        PFN_glCombinerOutputNV = func.invoke("glCombinerOutputNV");
        PFN_glFinalCombinerInputNV = func.invoke("glFinalCombinerInputNV");
        PFN_glGetCombinerInputParameterfvNV = func.invoke("glGetCombinerInputParameterfvNV");
        PFN_glGetCombinerInputParameterivNV = func.invoke("glGetCombinerInputParameterivNV");
        PFN_glGetCombinerOutputParameterfvNV = func.invoke("glGetCombinerOutputParameterfvNV");
        PFN_glGetCombinerOutputParameterivNV = func.invoke("glGetCombinerOutputParameterivNV");
        PFN_glGetFinalCombinerInputParameterfvNV = func.invoke("glGetFinalCombinerInputParameterfvNV");
        PFN_glGetFinalCombinerInputParameterivNV = func.invoke("glGetFinalCombinerInputParameterivNV");
    }

    public void CombinerParameterfvNV(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerParameterfvNV)) { try {
            MH_glCombinerParameterfvNV.invokeExact(PFN_glCombinerParameterfvNV, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerParameterfvNV"); }
    }

    public void CombinerParameterfNV(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerParameterfNV)) { try {
            MH_glCombinerParameterfNV.invokeExact(PFN_glCombinerParameterfNV, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerParameterfNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerParameterfNV"); }
    }

    public void CombinerParameterivNV(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerParameterivNV)) { try {
            MH_glCombinerParameterivNV.invokeExact(PFN_glCombinerParameterivNV, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerParameterivNV"); }
    }

    public void CombinerParameteriNV(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerParameteriNV)) { try {
            MH_glCombinerParameteriNV.invokeExact(PFN_glCombinerParameteriNV, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerParameteriNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerParameteriNV"); }
    }

    public void CombinerInputNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int variable, @CType("GLenum") int input, @CType("GLenum") int mapping, @CType("GLenum") int componentUsage) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerInputNV)) { try {
            MH_glCombinerInputNV.invokeExact(PFN_glCombinerInputNV, stage, portion, variable, input, mapping, componentUsage);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerInputNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerInputNV"); }
    }

    public void CombinerOutputNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int abOutput, @CType("GLenum") int cdOutput, @CType("GLenum") int sumOutput, @CType("GLenum") int scale, @CType("GLenum") int bias, @CType("GLboolean") boolean abDotProduct, @CType("GLboolean") boolean cdDotProduct, @CType("GLboolean") boolean muxSum) {
        if (!Unmarshal.isNullPointer(PFN_glCombinerOutputNV)) { try {
            MH_glCombinerOutputNV.invokeExact(PFN_glCombinerOutputNV, stage, portion, abOutput, cdOutput, sumOutput, scale, bias, abDotProduct, cdDotProduct, muxSum);
        } catch (Throwable e) { throw new RuntimeException("error in glCombinerOutputNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCombinerOutputNV"); }
    }

    public void FinalCombinerInputNV(@CType("GLenum") int variable, @CType("GLenum") int input, @CType("GLenum") int mapping, @CType("GLenum") int componentUsage) {
        if (!Unmarshal.isNullPointer(PFN_glFinalCombinerInputNV)) { try {
            MH_glFinalCombinerInputNV.invokeExact(PFN_glFinalCombinerInputNV, variable, input, mapping, componentUsage);
        } catch (Throwable e) { throw new RuntimeException("error in glFinalCombinerInputNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFinalCombinerInputNV"); }
    }

    public void GetCombinerInputParameterfvNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int variable, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetCombinerInputParameterfvNV)) { try {
            MH_glGetCombinerInputParameterfvNV.invokeExact(PFN_glGetCombinerInputParameterfvNV, stage, portion, variable, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCombinerInputParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCombinerInputParameterfvNV"); }
    }

    public void GetCombinerInputParameterivNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int variable, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetCombinerInputParameterivNV)) { try {
            MH_glGetCombinerInputParameterivNV.invokeExact(PFN_glGetCombinerInputParameterivNV, stage, portion, variable, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCombinerInputParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCombinerInputParameterivNV"); }
    }

    public void GetCombinerOutputParameterfvNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetCombinerOutputParameterfvNV)) { try {
            MH_glGetCombinerOutputParameterfvNV.invokeExact(PFN_glGetCombinerOutputParameterfvNV, stage, portion, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCombinerOutputParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCombinerOutputParameterfvNV"); }
    }

    public void GetCombinerOutputParameterivNV(@CType("GLenum") int stage, @CType("GLenum") int portion, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetCombinerOutputParameterivNV)) { try {
            MH_glGetCombinerOutputParameterivNV.invokeExact(PFN_glGetCombinerOutputParameterivNV, stage, portion, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCombinerOutputParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCombinerOutputParameterivNV"); }
    }

    public void GetFinalCombinerInputParameterfvNV(@CType("GLenum") int variable, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetFinalCombinerInputParameterfvNV)) { try {
            MH_glGetFinalCombinerInputParameterfvNV.invokeExact(PFN_glGetFinalCombinerInputParameterfvNV, variable, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFinalCombinerInputParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFinalCombinerInputParameterfvNV"); }
    }

    public void GetFinalCombinerInputParameterivNV(@CType("GLenum") int variable, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetFinalCombinerInputParameterivNV)) { try {
            MH_glGetFinalCombinerInputParameterivNV.invokeExact(PFN_glGetFinalCombinerInputParameterivNV, variable, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFinalCombinerInputParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFinalCombinerInputParameterivNV"); }
    }

}
