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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTVertexShader {
    public static final int GL_VERTEX_SHADER_EXT = 0x8780;
    public static final int GL_VERTEX_SHADER_BINDING_EXT = 0x8781;
    public static final int GL_OP_INDEX_EXT = 0x8782;
    public static final int GL_OP_NEGATE_EXT = 0x8783;
    public static final int GL_OP_DOT3_EXT = 0x8784;
    public static final int GL_OP_DOT4_EXT = 0x8785;
    public static final int GL_OP_MUL_EXT = 0x8786;
    public static final int GL_OP_ADD_EXT = 0x8787;
    public static final int GL_OP_MADD_EXT = 0x8788;
    public static final int GL_OP_FRAC_EXT = 0x8789;
    public static final int GL_OP_MAX_EXT = 0x878A;
    public static final int GL_OP_MIN_EXT = 0x878B;
    public static final int GL_OP_SET_GE_EXT = 0x878C;
    public static final int GL_OP_SET_LT_EXT = 0x878D;
    public static final int GL_OP_CLAMP_EXT = 0x878E;
    public static final int GL_OP_FLOOR_EXT = 0x878F;
    public static final int GL_OP_ROUND_EXT = 0x8790;
    public static final int GL_OP_EXP_BASE_2_EXT = 0x8791;
    public static final int GL_OP_LOG_BASE_2_EXT = 0x8792;
    public static final int GL_OP_POWER_EXT = 0x8793;
    public static final int GL_OP_RECIP_EXT = 0x8794;
    public static final int GL_OP_RECIP_SQRT_EXT = 0x8795;
    public static final int GL_OP_SUB_EXT = 0x8796;
    public static final int GL_OP_CROSS_PRODUCT_EXT = 0x8797;
    public static final int GL_OP_MULTIPLY_MATRIX_EXT = 0x8798;
    public static final int GL_OP_MOV_EXT = 0x8799;
    public static final int GL_OUTPUT_VERTEX_EXT = 0x879A;
    public static final int GL_OUTPUT_COLOR0_EXT = 0x879B;
    public static final int GL_OUTPUT_COLOR1_EXT = 0x879C;
    public static final int GL_OUTPUT_TEXTURE_COORD0_EXT = 0x879D;
    public static final int GL_OUTPUT_TEXTURE_COORD1_EXT = 0x879E;
    public static final int GL_OUTPUT_TEXTURE_COORD2_EXT = 0x879F;
    public static final int GL_OUTPUT_TEXTURE_COORD3_EXT = 0x87A0;
    public static final int GL_OUTPUT_TEXTURE_COORD4_EXT = 0x87A1;
    public static final int GL_OUTPUT_TEXTURE_COORD5_EXT = 0x87A2;
    public static final int GL_OUTPUT_TEXTURE_COORD6_EXT = 0x87A3;
    public static final int GL_OUTPUT_TEXTURE_COORD7_EXT = 0x87A4;
    public static final int GL_OUTPUT_TEXTURE_COORD8_EXT = 0x87A5;
    public static final int GL_OUTPUT_TEXTURE_COORD9_EXT = 0x87A6;
    public static final int GL_OUTPUT_TEXTURE_COORD10_EXT = 0x87A7;
    public static final int GL_OUTPUT_TEXTURE_COORD11_EXT = 0x87A8;
    public static final int GL_OUTPUT_TEXTURE_COORD12_EXT = 0x87A9;
    public static final int GL_OUTPUT_TEXTURE_COORD13_EXT = 0x87AA;
    public static final int GL_OUTPUT_TEXTURE_COORD14_EXT = 0x87AB;
    public static final int GL_OUTPUT_TEXTURE_COORD15_EXT = 0x87AC;
    public static final int GL_OUTPUT_TEXTURE_COORD16_EXT = 0x87AD;
    public static final int GL_OUTPUT_TEXTURE_COORD17_EXT = 0x87AE;
    public static final int GL_OUTPUT_TEXTURE_COORD18_EXT = 0x87AF;
    public static final int GL_OUTPUT_TEXTURE_COORD19_EXT = 0x87B0;
    public static final int GL_OUTPUT_TEXTURE_COORD20_EXT = 0x87B1;
    public static final int GL_OUTPUT_TEXTURE_COORD21_EXT = 0x87B2;
    public static final int GL_OUTPUT_TEXTURE_COORD22_EXT = 0x87B3;
    public static final int GL_OUTPUT_TEXTURE_COORD23_EXT = 0x87B4;
    public static final int GL_OUTPUT_TEXTURE_COORD24_EXT = 0x87B5;
    public static final int GL_OUTPUT_TEXTURE_COORD25_EXT = 0x87B6;
    public static final int GL_OUTPUT_TEXTURE_COORD26_EXT = 0x87B7;
    public static final int GL_OUTPUT_TEXTURE_COORD27_EXT = 0x87B8;
    public static final int GL_OUTPUT_TEXTURE_COORD28_EXT = 0x87B9;
    public static final int GL_OUTPUT_TEXTURE_COORD29_EXT = 0x87BA;
    public static final int GL_OUTPUT_TEXTURE_COORD30_EXT = 0x87BB;
    public static final int GL_OUTPUT_TEXTURE_COORD31_EXT = 0x87BC;
    public static final int GL_OUTPUT_FOG_EXT = 0x87BD;
    public static final int GL_SCALAR_EXT = 0x87BE;
    public static final int GL_VECTOR_EXT = 0x87BF;
    public static final int GL_MATRIX_EXT = 0x87C0;
    public static final int GL_VARIANT_EXT = 0x87C1;
    public static final int GL_INVARIANT_EXT = 0x87C2;
    public static final int GL_LOCAL_CONSTANT_EXT = 0x87C3;
    public static final int GL_LOCAL_EXT = 0x87C4;
    public static final int GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87C5;
    public static final int GL_MAX_VERTEX_SHADER_VARIANTS_EXT = 0x87C6;
    public static final int GL_MAX_VERTEX_SHADER_INVARIANTS_EXT = 0x87C7;
    public static final int GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87C8;
    public static final int GL_MAX_VERTEX_SHADER_LOCALS_EXT = 0x87C9;
    public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CA;
    public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT = 0x87CB;
    public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87CC;
    public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT = 0x87CD;
    public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT = 0x87CE;
    public static final int GL_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CF;
    public static final int GL_VERTEX_SHADER_VARIANTS_EXT = 0x87D0;
    public static final int GL_VERTEX_SHADER_INVARIANTS_EXT = 0x87D1;
    public static final int GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87D2;
    public static final int GL_VERTEX_SHADER_LOCALS_EXT = 0x87D3;
    public static final int GL_VERTEX_SHADER_OPTIMIZED_EXT = 0x87D4;
    public static final int GL_X_EXT = 0x87D5;
    public static final int GL_Y_EXT = 0x87D6;
    public static final int GL_Z_EXT = 0x87D7;
    public static final int GL_W_EXT = 0x87D8;
    public static final int GL_NEGATIVE_X_EXT = 0x87D9;
    public static final int GL_NEGATIVE_Y_EXT = 0x87DA;
    public static final int GL_NEGATIVE_Z_EXT = 0x87DB;
    public static final int GL_NEGATIVE_W_EXT = 0x87DC;
    public static final int GL_ZERO_EXT = 0x87DD;
    public static final int GL_ONE_EXT = 0x87DE;
    public static final int GL_NEGATIVE_ONE_EXT = 0x87DF;
    public static final int GL_NORMALIZED_RANGE_EXT = 0x87E0;
    public static final int GL_FULL_RANGE_EXT = 0x87E1;
    public static final int GL_CURRENT_VERTEX_EXT = 0x87E2;
    public static final int GL_MVP_MATRIX_EXT = 0x87E3;
    public static final int GL_VARIANT_VALUE_EXT = 0x87E4;
    public static final int GL_VARIANT_DATATYPE_EXT = 0x87E5;
    public static final int GL_VARIANT_ARRAY_STRIDE_EXT = 0x87E6;
    public static final int GL_VARIANT_ARRAY_TYPE_EXT = 0x87E7;
    public static final int GL_VARIANT_ARRAY_EXT = 0x87E8;
    public static final int GL_VARIANT_ARRAY_POINTER_EXT = 0x87E9;
    public static final int GL_INVARIANT_VALUE_EXT = 0x87EA;
    public static final int GL_INVARIANT_DATATYPE_EXT = 0x87EB;
    public static final int GL_LOCAL_CONSTANT_VALUE_EXT = 0x87EC;
    public static final int GL_LOCAL_CONSTANT_DATATYPE_EXT = 0x87ED;
    public static final MethodHandle MH_glBeginVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glBeginVertexShaderEXT;
    public static final MethodHandle MH_glEndVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndVertexShaderEXT;
    public static final MethodHandle MH_glBindVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindVertexShaderEXT;
    public static final MethodHandle MH_glGenVertexShadersEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenVertexShadersEXT;
    public static final MethodHandle MH_glDeleteVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDeleteVertexShaderEXT;
    public static final MethodHandle MH_glShaderOp1EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glShaderOp1EXT;
    public static final MethodHandle MH_glShaderOp2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glShaderOp2EXT;
    public static final MethodHandle MH_glShaderOp3EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glShaderOp3EXT;
    public static final MethodHandle MH_glSwizzleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSwizzleEXT;
    public static final MethodHandle MH_glWriteMaskEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glWriteMaskEXT;
    public static final MethodHandle MH_glInsertComponentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glInsertComponentEXT;
    public static final MethodHandle MH_glExtractComponentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glExtractComponentEXT;
    public static final MethodHandle MH_glGenSymbolsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenSymbolsEXT;
    public static final MethodHandle MH_glSetInvariantEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSetInvariantEXT;
    public static final MethodHandle MH_glSetLocalConstantEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSetLocalConstantEXT;
    public static final MethodHandle MH_glVariantbvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantbvEXT;
    public static final MethodHandle MH_glVariantsvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantsvEXT;
    public static final MethodHandle MH_glVariantivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantivEXT;
    public static final MethodHandle MH_glVariantfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantfvEXT;
    public static final MethodHandle MH_glVariantdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantdvEXT;
    public static final MethodHandle MH_glVariantubvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantubvEXT;
    public static final MethodHandle MH_glVariantusvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantusvEXT;
    public static final MethodHandle MH_glVariantuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantuivEXT;
    public static final MethodHandle MH_glVariantPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVariantPointerEXT;
    public static final MethodHandle MH_glEnableVariantClientStateEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableVariantClientStateEXT;
    public static final MethodHandle MH_glDisableVariantClientStateEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableVariantClientStateEXT;
    public static final MethodHandle MH_glBindLightParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindLightParameterEXT;
    public static final MethodHandle MH_glBindMaterialParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindMaterialParameterEXT;
    public static final MethodHandle MH_glBindTexGenParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTexGenParameterEXT;
    public static final MethodHandle MH_glBindTextureUnitParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTextureUnitParameterEXT;
    public static final MethodHandle MH_glBindParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindParameterEXT;
    public static final MethodHandle MH_glIsVariantEnabledEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsVariantEnabledEXT;
    public static final MethodHandle MH_glGetVariantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVariantBooleanvEXT;
    public static final MethodHandle MH_glGetVariantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVariantIntegervEXT;
    public static final MethodHandle MH_glGetVariantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVariantFloatvEXT;
    public static final MethodHandle MH_glGetVariantPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVariantPointervEXT;
    public static final MethodHandle MH_glGetInvariantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInvariantBooleanvEXT;
    public static final MethodHandle MH_glGetInvariantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInvariantIntegervEXT;
    public static final MethodHandle MH_glGetInvariantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInvariantFloatvEXT;
    public static final MethodHandle MH_glGetLocalConstantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetLocalConstantBooleanvEXT;
    public static final MethodHandle MH_glGetLocalConstantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetLocalConstantIntegervEXT;
    public static final MethodHandle MH_glGetLocalConstantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetLocalConstantFloatvEXT;

    public GLEXTVertexShader(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginVertexShaderEXT = func.invoke("glBeginVertexShaderEXT");
        PFN_glEndVertexShaderEXT = func.invoke("glEndVertexShaderEXT");
        PFN_glBindVertexShaderEXT = func.invoke("glBindVertexShaderEXT");
        PFN_glGenVertexShadersEXT = func.invoke("glGenVertexShadersEXT");
        PFN_glDeleteVertexShaderEXT = func.invoke("glDeleteVertexShaderEXT");
        PFN_glShaderOp1EXT = func.invoke("glShaderOp1EXT");
        PFN_glShaderOp2EXT = func.invoke("glShaderOp2EXT");
        PFN_glShaderOp3EXT = func.invoke("glShaderOp3EXT");
        PFN_glSwizzleEXT = func.invoke("glSwizzleEXT");
        PFN_glWriteMaskEXT = func.invoke("glWriteMaskEXT");
        PFN_glInsertComponentEXT = func.invoke("glInsertComponentEXT");
        PFN_glExtractComponentEXT = func.invoke("glExtractComponentEXT");
        PFN_glGenSymbolsEXT = func.invoke("glGenSymbolsEXT");
        PFN_glSetInvariantEXT = func.invoke("glSetInvariantEXT");
        PFN_glSetLocalConstantEXT = func.invoke("glSetLocalConstantEXT");
        PFN_glVariantbvEXT = func.invoke("glVariantbvEXT");
        PFN_glVariantsvEXT = func.invoke("glVariantsvEXT");
        PFN_glVariantivEXT = func.invoke("glVariantivEXT");
        PFN_glVariantfvEXT = func.invoke("glVariantfvEXT");
        PFN_glVariantdvEXT = func.invoke("glVariantdvEXT");
        PFN_glVariantubvEXT = func.invoke("glVariantubvEXT");
        PFN_glVariantusvEXT = func.invoke("glVariantusvEXT");
        PFN_glVariantuivEXT = func.invoke("glVariantuivEXT");
        PFN_glVariantPointerEXT = func.invoke("glVariantPointerEXT");
        PFN_glEnableVariantClientStateEXT = func.invoke("glEnableVariantClientStateEXT");
        PFN_glDisableVariantClientStateEXT = func.invoke("glDisableVariantClientStateEXT");
        PFN_glBindLightParameterEXT = func.invoke("glBindLightParameterEXT");
        PFN_glBindMaterialParameterEXT = func.invoke("glBindMaterialParameterEXT");
        PFN_glBindTexGenParameterEXT = func.invoke("glBindTexGenParameterEXT");
        PFN_glBindTextureUnitParameterEXT = func.invoke("glBindTextureUnitParameterEXT");
        PFN_glBindParameterEXT = func.invoke("glBindParameterEXT");
        PFN_glIsVariantEnabledEXT = func.invoke("glIsVariantEnabledEXT");
        PFN_glGetVariantBooleanvEXT = func.invoke("glGetVariantBooleanvEXT");
        PFN_glGetVariantIntegervEXT = func.invoke("glGetVariantIntegervEXT");
        PFN_glGetVariantFloatvEXT = func.invoke("glGetVariantFloatvEXT");
        PFN_glGetVariantPointervEXT = func.invoke("glGetVariantPointervEXT");
        PFN_glGetInvariantBooleanvEXT = func.invoke("glGetInvariantBooleanvEXT");
        PFN_glGetInvariantIntegervEXT = func.invoke("glGetInvariantIntegervEXT");
        PFN_glGetInvariantFloatvEXT = func.invoke("glGetInvariantFloatvEXT");
        PFN_glGetLocalConstantBooleanvEXT = func.invoke("glGetLocalConstantBooleanvEXT");
        PFN_glGetLocalConstantIntegervEXT = func.invoke("glGetLocalConstantIntegervEXT");
        PFN_glGetLocalConstantFloatvEXT = func.invoke("glGetLocalConstantFloatvEXT");
    }

    public void BeginVertexShaderEXT() {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginVertexShaderEXT))
            MH_glBeginVertexShaderEXT.invokeExact(PFN_glBeginVertexShaderEXT);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginVertexShaderEXT", e); }
    }

    public void EndVertexShaderEXT() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndVertexShaderEXT))
            MH_glEndVertexShaderEXT.invokeExact(PFN_glEndVertexShaderEXT);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndVertexShaderEXT", e); }
    }

    public void BindVertexShaderEXT(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindVertexShaderEXT))
            MH_glBindVertexShaderEXT.invokeExact(PFN_glBindVertexShaderEXT, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexShaderEXT", e); }
    }

    public @CType("GLuint") int GenVertexShadersEXT(@CType("GLuint") int range) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenVertexShadersEXT))
            return (int) MH_glGenVertexShadersEXT.invokeExact(PFN_glGenVertexShadersEXT, range);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenVertexShadersEXT", e); }
    }

    public void DeleteVertexShaderEXT(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteVertexShaderEXT))
            MH_glDeleteVertexShaderEXT.invokeExact(PFN_glDeleteVertexShaderEXT, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexShaderEXT", e); }
    }

    public void ShaderOp1EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1) {
        try { if (!Unmarshal.isNullPointer(PFN_glShaderOp1EXT))
            MH_glShaderOp1EXT.invokeExact(PFN_glShaderOp1EXT, op, res, arg1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp1EXT", e); }
    }

    public void ShaderOp2EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1, @CType("GLuint") int arg2) {
        try { if (!Unmarshal.isNullPointer(PFN_glShaderOp2EXT))
            MH_glShaderOp2EXT.invokeExact(PFN_glShaderOp2EXT, op, res, arg1, arg2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp2EXT", e); }
    }

    public void ShaderOp3EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1, @CType("GLuint") int arg2, @CType("GLuint") int arg3) {
        try { if (!Unmarshal.isNullPointer(PFN_glShaderOp3EXT))
            MH_glShaderOp3EXT.invokeExact(PFN_glShaderOp3EXT, op, res, arg1, arg2, arg3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp3EXT", e); }
    }

    public void SwizzleEXT(@CType("GLuint") int res, @CType("GLuint") int in, @CType("GLenum") int outX, @CType("GLenum") int outY, @CType("GLenum") int outZ, @CType("GLenum") int outW) {
        try { if (!Unmarshal.isNullPointer(PFN_glSwizzleEXT))
            MH_glSwizzleEXT.invokeExact(PFN_glSwizzleEXT, res, in, outX, outY, outZ, outW);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSwizzleEXT", e); }
    }

    public void WriteMaskEXT(@CType("GLuint") int res, @CType("GLuint") int in, @CType("GLenum") int outX, @CType("GLenum") int outY, @CType("GLenum") int outZ, @CType("GLenum") int outW) {
        try { if (!Unmarshal.isNullPointer(PFN_glWriteMaskEXT))
            MH_glWriteMaskEXT.invokeExact(PFN_glWriteMaskEXT, res, in, outX, outY, outZ, outW);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWriteMaskEXT", e); }
    }

    public void InsertComponentEXT(@CType("GLuint") int res, @CType("GLuint") int src, @CType("GLuint") int num) {
        try { if (!Unmarshal.isNullPointer(PFN_glInsertComponentEXT))
            MH_glInsertComponentEXT.invokeExact(PFN_glInsertComponentEXT, res, src, num);
        }
        catch (Throwable e) { throw new RuntimeException("error in glInsertComponentEXT", e); }
    }

    public void ExtractComponentEXT(@CType("GLuint") int res, @CType("GLuint") int src, @CType("GLuint") int num) {
        try { if (!Unmarshal.isNullPointer(PFN_glExtractComponentEXT))
            MH_glExtractComponentEXT.invokeExact(PFN_glExtractComponentEXT, res, src, num);
        }
        catch (Throwable e) { throw new RuntimeException("error in glExtractComponentEXT", e); }
    }

    public @CType("GLuint") int GenSymbolsEXT(@CType("GLenum") int datatype, @CType("GLenum") int storagetype, @CType("GLenum") int range, @CType("GLuint") int components) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenSymbolsEXT))
            return (int) MH_glGenSymbolsEXT.invokeExact(PFN_glGenSymbolsEXT, datatype, storagetype, range, components);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenSymbolsEXT", e); }
    }

    public void SetInvariantEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glSetInvariantEXT))
            MH_glSetInvariantEXT.invokeExact(PFN_glSetInvariantEXT, id, type, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSetInvariantEXT", e); }
    }

    public void SetLocalConstantEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glSetLocalConstantEXT))
            MH_glSetLocalConstantEXT.invokeExact(PFN_glSetLocalConstantEXT, id, type, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSetLocalConstantEXT", e); }
    }

    public void VariantbvEXT(@CType("GLuint") int id, @CType("const GLbyte *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantbvEXT))
            MH_glVariantbvEXT.invokeExact(PFN_glVariantbvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantbvEXT", e); }
    }

    public void VariantsvEXT(@CType("GLuint") int id, @CType("const GLshort *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantsvEXT))
            MH_glVariantsvEXT.invokeExact(PFN_glVariantsvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantsvEXT", e); }
    }

    public void VariantivEXT(@CType("GLuint") int id, @CType("const GLint *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantivEXT))
            MH_glVariantivEXT.invokeExact(PFN_glVariantivEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantivEXT", e); }
    }

    public void VariantfvEXT(@CType("GLuint") int id, @CType("const GLfloat *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantfvEXT))
            MH_glVariantfvEXT.invokeExact(PFN_glVariantfvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantfvEXT", e); }
    }

    public void VariantdvEXT(@CType("GLuint") int id, @CType("const GLdouble *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantdvEXT))
            MH_glVariantdvEXT.invokeExact(PFN_glVariantdvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantdvEXT", e); }
    }

    public void VariantubvEXT(@CType("GLuint") int id, @CType("const GLubyte *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantubvEXT))
            MH_glVariantubvEXT.invokeExact(PFN_glVariantubvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantubvEXT", e); }
    }

    public void VariantusvEXT(@CType("GLuint") int id, @CType("const GLushort *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantusvEXT))
            MH_glVariantusvEXT.invokeExact(PFN_glVariantusvEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantusvEXT", e); }
    }

    public void VariantuivEXT(@CType("GLuint") int id, @CType("const GLuint *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantuivEXT))
            MH_glVariantuivEXT.invokeExact(PFN_glVariantuivEXT, id, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantuivEXT", e); }
    }

    public void VariantPointerEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("GLuint") int stride, @CType("const void *") java.lang.foreign.MemorySegment addr) {
        try { if (!Unmarshal.isNullPointer(PFN_glVariantPointerEXT))
            MH_glVariantPointerEXT.invokeExact(PFN_glVariantPointerEXT, id, type, stride, addr);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVariantPointerEXT", e); }
    }

    public void EnableVariantClientStateEXT(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableVariantClientStateEXT))
            MH_glEnableVariantClientStateEXT.invokeExact(PFN_glEnableVariantClientStateEXT, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVariantClientStateEXT", e); }
    }

    public void DisableVariantClientStateEXT(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableVariantClientStateEXT))
            MH_glDisableVariantClientStateEXT.invokeExact(PFN_glDisableVariantClientStateEXT, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVariantClientStateEXT", e); }
    }

    public @CType("GLuint") int BindLightParameterEXT(@CType("GLenum") int light, @CType("GLenum") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindLightParameterEXT))
            return (int) MH_glBindLightParameterEXT.invokeExact(PFN_glBindLightParameterEXT, light, value);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindLightParameterEXT", e); }
    }

    public @CType("GLuint") int BindMaterialParameterEXT(@CType("GLenum") int face, @CType("GLenum") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindMaterialParameterEXT))
            return (int) MH_glBindMaterialParameterEXT.invokeExact(PFN_glBindMaterialParameterEXT, face, value);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindMaterialParameterEXT", e); }
    }

    public @CType("GLuint") int BindTexGenParameterEXT(@CType("GLenum") int unit, @CType("GLenum") int coord, @CType("GLenum") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindTexGenParameterEXT))
            return (int) MH_glBindTexGenParameterEXT.invokeExact(PFN_glBindTexGenParameterEXT, unit, coord, value);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindTexGenParameterEXT", e); }
    }

    public @CType("GLuint") int BindTextureUnitParameterEXT(@CType("GLenum") int unit, @CType("GLenum") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindTextureUnitParameterEXT))
            return (int) MH_glBindTextureUnitParameterEXT.invokeExact(PFN_glBindTextureUnitParameterEXT, unit, value);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextureUnitParameterEXT", e); }
    }

    public @CType("GLuint") int BindParameterEXT(@CType("GLenum") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindParameterEXT))
            return (int) MH_glBindParameterEXT.invokeExact(PFN_glBindParameterEXT, value);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindParameterEXT", e); }
    }

    public @CType("GLboolean") boolean IsVariantEnabledEXT(@CType("GLuint") int id, @CType("GLenum") int cap) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsVariantEnabledEXT))
            return (boolean) MH_glIsVariantEnabledEXT.invokeExact(PFN_glIsVariantEnabledEXT, id, cap);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsVariantEnabledEXT", e); }
    }

    public void GetVariantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVariantBooleanvEXT))
            MH_glGetVariantBooleanvEXT.invokeExact(PFN_glGetVariantBooleanvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantBooleanvEXT", e); }
    }

    public void GetVariantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVariantIntegervEXT))
            MH_glGetVariantIntegervEXT.invokeExact(PFN_glGetVariantIntegervEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantIntegervEXT", e); }
    }

    public void GetVariantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVariantFloatvEXT))
            MH_glGetVariantFloatvEXT.invokeExact(PFN_glGetVariantFloatvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantFloatvEXT", e); }
    }

    public void GetVariantPointervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("void **") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVariantPointervEXT))
            MH_glGetVariantPointervEXT.invokeExact(PFN_glGetVariantPointervEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantPointervEXT", e); }
    }

    public void GetInvariantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetInvariantBooleanvEXT))
            MH_glGetInvariantBooleanvEXT.invokeExact(PFN_glGetInvariantBooleanvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantBooleanvEXT", e); }
    }

    public void GetInvariantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetInvariantIntegervEXT))
            MH_glGetInvariantIntegervEXT.invokeExact(PFN_glGetInvariantIntegervEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantIntegervEXT", e); }
    }

    public void GetInvariantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetInvariantFloatvEXT))
            MH_glGetInvariantFloatvEXT.invokeExact(PFN_glGetInvariantFloatvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantFloatvEXT", e); }
    }

    public void GetLocalConstantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetLocalConstantBooleanvEXT))
            MH_glGetLocalConstantBooleanvEXT.invokeExact(PFN_glGetLocalConstantBooleanvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantBooleanvEXT", e); }
    }

    public void GetLocalConstantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetLocalConstantIntegervEXT))
            MH_glGetLocalConstantIntegervEXT.invokeExact(PFN_glGetLocalConstantIntegervEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantIntegervEXT", e); }
    }

    public void GetLocalConstantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetLocalConstantFloatvEXT))
            MH_glGetLocalConstantFloatvEXT.invokeExact(PFN_glGetLocalConstantFloatvEXT, id, value, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantFloatvEXT", e); }
    }

}
