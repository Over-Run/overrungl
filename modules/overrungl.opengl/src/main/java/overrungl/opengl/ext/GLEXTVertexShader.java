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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glEndVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glBindVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGenVertexShadersEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteVertexShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp1EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp3EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSwizzleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glWriteMaskEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInsertComponentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glExtractComponentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGenSymbolsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSetInvariantEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSetLocalConstantEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantbvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantsvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantubvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantusvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableVariantClientStateEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVariantClientStateEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindLightParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindMaterialParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTexGenParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTextureUnitParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindParameterEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsVariantEnabledEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVariantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantBooleanvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantFloatvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBeginVertexShaderEXT;
        public final MemorySegment PFN_glEndVertexShaderEXT;
        public final MemorySegment PFN_glBindVertexShaderEXT;
        public final MemorySegment PFN_glGenVertexShadersEXT;
        public final MemorySegment PFN_glDeleteVertexShaderEXT;
        public final MemorySegment PFN_glShaderOp1EXT;
        public final MemorySegment PFN_glShaderOp2EXT;
        public final MemorySegment PFN_glShaderOp3EXT;
        public final MemorySegment PFN_glSwizzleEXT;
        public final MemorySegment PFN_glWriteMaskEXT;
        public final MemorySegment PFN_glInsertComponentEXT;
        public final MemorySegment PFN_glExtractComponentEXT;
        public final MemorySegment PFN_glGenSymbolsEXT;
        public final MemorySegment PFN_glSetInvariantEXT;
        public final MemorySegment PFN_glSetLocalConstantEXT;
        public final MemorySegment PFN_glVariantbvEXT;
        public final MemorySegment PFN_glVariantsvEXT;
        public final MemorySegment PFN_glVariantivEXT;
        public final MemorySegment PFN_glVariantfvEXT;
        public final MemorySegment PFN_glVariantdvEXT;
        public final MemorySegment PFN_glVariantubvEXT;
        public final MemorySegment PFN_glVariantusvEXT;
        public final MemorySegment PFN_glVariantuivEXT;
        public final MemorySegment PFN_glVariantPointerEXT;
        public final MemorySegment PFN_glEnableVariantClientStateEXT;
        public final MemorySegment PFN_glDisableVariantClientStateEXT;
        public final MemorySegment PFN_glBindLightParameterEXT;
        public final MemorySegment PFN_glBindMaterialParameterEXT;
        public final MemorySegment PFN_glBindTexGenParameterEXT;
        public final MemorySegment PFN_glBindTextureUnitParameterEXT;
        public final MemorySegment PFN_glBindParameterEXT;
        public final MemorySegment PFN_glIsVariantEnabledEXT;
        public final MemorySegment PFN_glGetVariantBooleanvEXT;
        public final MemorySegment PFN_glGetVariantIntegervEXT;
        public final MemorySegment PFN_glGetVariantFloatvEXT;
        public final MemorySegment PFN_glGetVariantPointervEXT;
        public final MemorySegment PFN_glGetInvariantBooleanvEXT;
        public final MemorySegment PFN_glGetInvariantIntegervEXT;
        public final MemorySegment PFN_glGetInvariantFloatvEXT;
        public final MemorySegment PFN_glGetLocalConstantBooleanvEXT;
        public final MemorySegment PFN_glGetLocalConstantIntegervEXT;
        public final MemorySegment PFN_glGetLocalConstantFloatvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLEXTVertexShader(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BeginVertexShaderEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginVertexShaderEXT)) throw new SymbolNotFoundError("Symbol not found: glBeginVertexShaderEXT");
        try { Handles.MH_glBeginVertexShaderEXT.invokeExact(handles.PFN_glBeginVertexShaderEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginVertexShaderEXT", e); }
    }

    public void EndVertexShaderEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glEndVertexShaderEXT)) throw new SymbolNotFoundError("Symbol not found: glEndVertexShaderEXT");
        try { Handles.MH_glEndVertexShaderEXT.invokeExact(handles.PFN_glEndVertexShaderEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glEndVertexShaderEXT", e); }
    }

    public void BindVertexShaderEXT(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindVertexShaderEXT)) throw new SymbolNotFoundError("Symbol not found: glBindVertexShaderEXT");
        try { Handles.MH_glBindVertexShaderEXT.invokeExact(handles.PFN_glBindVertexShaderEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexShaderEXT", e); }
    }

    public @CType("GLuint") int GenVertexShadersEXT(@CType("GLuint") int range) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenVertexShadersEXT)) throw new SymbolNotFoundError("Symbol not found: glGenVertexShadersEXT");
        try { return (int) Handles.MH_glGenVertexShadersEXT.invokeExact(handles.PFN_glGenVertexShadersEXT, range); }
        catch (Throwable e) { throw new RuntimeException("error in glGenVertexShadersEXT", e); }
    }

    public void DeleteVertexShaderEXT(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteVertexShaderEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteVertexShaderEXT");
        try { Handles.MH_glDeleteVertexShaderEXT.invokeExact(handles.PFN_glDeleteVertexShaderEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexShaderEXT", e); }
    }

    public void ShaderOp1EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderOp1EXT)) throw new SymbolNotFoundError("Symbol not found: glShaderOp1EXT");
        try { Handles.MH_glShaderOp1EXT.invokeExact(handles.PFN_glShaderOp1EXT, op, res, arg1); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp1EXT", e); }
    }

    public void ShaderOp2EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1, @CType("GLuint") int arg2) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderOp2EXT)) throw new SymbolNotFoundError("Symbol not found: glShaderOp2EXT");
        try { Handles.MH_glShaderOp2EXT.invokeExact(handles.PFN_glShaderOp2EXT, op, res, arg1, arg2); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp2EXT", e); }
    }

    public void ShaderOp3EXT(@CType("GLenum") int op, @CType("GLuint") int res, @CType("GLuint") int arg1, @CType("GLuint") int arg2, @CType("GLuint") int arg3) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderOp3EXT)) throw new SymbolNotFoundError("Symbol not found: glShaderOp3EXT");
        try { Handles.MH_glShaderOp3EXT.invokeExact(handles.PFN_glShaderOp3EXT, op, res, arg1, arg2, arg3); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderOp3EXT", e); }
    }

    public void SwizzleEXT(@CType("GLuint") int res, @CType("GLuint") int in, @CType("GLenum") int outX, @CType("GLenum") int outY, @CType("GLenum") int outZ, @CType("GLenum") int outW) {
        if (Unmarshal.isNullPointer(handles.PFN_glSwizzleEXT)) throw new SymbolNotFoundError("Symbol not found: glSwizzleEXT");
        try { Handles.MH_glSwizzleEXT.invokeExact(handles.PFN_glSwizzleEXT, res, in, outX, outY, outZ, outW); }
        catch (Throwable e) { throw new RuntimeException("error in glSwizzleEXT", e); }
    }

    public void WriteMaskEXT(@CType("GLuint") int res, @CType("GLuint") int in, @CType("GLenum") int outX, @CType("GLenum") int outY, @CType("GLenum") int outZ, @CType("GLenum") int outW) {
        if (Unmarshal.isNullPointer(handles.PFN_glWriteMaskEXT)) throw new SymbolNotFoundError("Symbol not found: glWriteMaskEXT");
        try { Handles.MH_glWriteMaskEXT.invokeExact(handles.PFN_glWriteMaskEXT, res, in, outX, outY, outZ, outW); }
        catch (Throwable e) { throw new RuntimeException("error in glWriteMaskEXT", e); }
    }

    public void InsertComponentEXT(@CType("GLuint") int res, @CType("GLuint") int src, @CType("GLuint") int num) {
        if (Unmarshal.isNullPointer(handles.PFN_glInsertComponentEXT)) throw new SymbolNotFoundError("Symbol not found: glInsertComponentEXT");
        try { Handles.MH_glInsertComponentEXT.invokeExact(handles.PFN_glInsertComponentEXT, res, src, num); }
        catch (Throwable e) { throw new RuntimeException("error in glInsertComponentEXT", e); }
    }

    public void ExtractComponentEXT(@CType("GLuint") int res, @CType("GLuint") int src, @CType("GLuint") int num) {
        if (Unmarshal.isNullPointer(handles.PFN_glExtractComponentEXT)) throw new SymbolNotFoundError("Symbol not found: glExtractComponentEXT");
        try { Handles.MH_glExtractComponentEXT.invokeExact(handles.PFN_glExtractComponentEXT, res, src, num); }
        catch (Throwable e) { throw new RuntimeException("error in glExtractComponentEXT", e); }
    }

    public @CType("GLuint") int GenSymbolsEXT(@CType("GLenum") int datatype, @CType("GLenum") int storagetype, @CType("GLenum") int range, @CType("GLuint") int components) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenSymbolsEXT)) throw new SymbolNotFoundError("Symbol not found: glGenSymbolsEXT");
        try { return (int) Handles.MH_glGenSymbolsEXT.invokeExact(handles.PFN_glGenSymbolsEXT, datatype, storagetype, range, components); }
        catch (Throwable e) { throw new RuntimeException("error in glGenSymbolsEXT", e); }
    }

    public void SetInvariantEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("const void *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glSetInvariantEXT)) throw new SymbolNotFoundError("Symbol not found: glSetInvariantEXT");
        try { Handles.MH_glSetInvariantEXT.invokeExact(handles.PFN_glSetInvariantEXT, id, type, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glSetInvariantEXT", e); }
    }

    public void SetLocalConstantEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("const void *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glSetLocalConstantEXT)) throw new SymbolNotFoundError("Symbol not found: glSetLocalConstantEXT");
        try { Handles.MH_glSetLocalConstantEXT.invokeExact(handles.PFN_glSetLocalConstantEXT, id, type, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glSetLocalConstantEXT", e); }
    }

    public void VariantbvEXT(@CType("GLuint") int id, @CType("const GLbyte *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantbvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantbvEXT");
        try { Handles.MH_glVariantbvEXT.invokeExact(handles.PFN_glVariantbvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantbvEXT", e); }
    }

    public void VariantsvEXT(@CType("GLuint") int id, @CType("const GLshort *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantsvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantsvEXT");
        try { Handles.MH_glVariantsvEXT.invokeExact(handles.PFN_glVariantsvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantsvEXT", e); }
    }

    public void VariantivEXT(@CType("GLuint") int id, @CType("const GLint *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantivEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantivEXT");
        try { Handles.MH_glVariantivEXT.invokeExact(handles.PFN_glVariantivEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantivEXT", e); }
    }

    public void VariantfvEXT(@CType("GLuint") int id, @CType("const GLfloat *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantfvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantfvEXT");
        try { Handles.MH_glVariantfvEXT.invokeExact(handles.PFN_glVariantfvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantfvEXT", e); }
    }

    public void VariantdvEXT(@CType("GLuint") int id, @CType("const GLdouble *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantdvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantdvEXT");
        try { Handles.MH_glVariantdvEXT.invokeExact(handles.PFN_glVariantdvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantdvEXT", e); }
    }

    public void VariantubvEXT(@CType("GLuint") int id, @CType("const GLubyte *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantubvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantubvEXT");
        try { Handles.MH_glVariantubvEXT.invokeExact(handles.PFN_glVariantubvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantubvEXT", e); }
    }

    public void VariantusvEXT(@CType("GLuint") int id, @CType("const GLushort *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantusvEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantusvEXT");
        try { Handles.MH_glVariantusvEXT.invokeExact(handles.PFN_glVariantusvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantusvEXT", e); }
    }

    public void VariantuivEXT(@CType("GLuint") int id, @CType("const GLuint *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantuivEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantuivEXT");
        try { Handles.MH_glVariantuivEXT.invokeExact(handles.PFN_glVariantuivEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantuivEXT", e); }
    }

    public void VariantPointerEXT(@CType("GLuint") int id, @CType("GLenum") int type, @CType("GLuint") int stride, @CType("const void *") MemorySegment addr) {
        if (Unmarshal.isNullPointer(handles.PFN_glVariantPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVariantPointerEXT");
        try { Handles.MH_glVariantPointerEXT.invokeExact(handles.PFN_glVariantPointerEXT, id, type, stride, addr); }
        catch (Throwable e) { throw new RuntimeException("error in glVariantPointerEXT", e); }
    }

    public void EnableVariantClientStateEXT(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVariantClientStateEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableVariantClientStateEXT");
        try { Handles.MH_glEnableVariantClientStateEXT.invokeExact(handles.PFN_glEnableVariantClientStateEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVariantClientStateEXT", e); }
    }

    public void DisableVariantClientStateEXT(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVariantClientStateEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableVariantClientStateEXT");
        try { Handles.MH_glDisableVariantClientStateEXT.invokeExact(handles.PFN_glDisableVariantClientStateEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVariantClientStateEXT", e); }
    }

    public @CType("GLuint") int BindLightParameterEXT(@CType("GLenum") int light, @CType("GLenum") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindLightParameterEXT)) throw new SymbolNotFoundError("Symbol not found: glBindLightParameterEXT");
        try { return (int) Handles.MH_glBindLightParameterEXT.invokeExact(handles.PFN_glBindLightParameterEXT, light, value); }
        catch (Throwable e) { throw new RuntimeException("error in glBindLightParameterEXT", e); }
    }

    public @CType("GLuint") int BindMaterialParameterEXT(@CType("GLenum") int face, @CType("GLenum") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindMaterialParameterEXT)) throw new SymbolNotFoundError("Symbol not found: glBindMaterialParameterEXT");
        try { return (int) Handles.MH_glBindMaterialParameterEXT.invokeExact(handles.PFN_glBindMaterialParameterEXT, face, value); }
        catch (Throwable e) { throw new RuntimeException("error in glBindMaterialParameterEXT", e); }
    }

    public @CType("GLuint") int BindTexGenParameterEXT(@CType("GLenum") int unit, @CType("GLenum") int coord, @CType("GLenum") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTexGenParameterEXT)) throw new SymbolNotFoundError("Symbol not found: glBindTexGenParameterEXT");
        try { return (int) Handles.MH_glBindTexGenParameterEXT.invokeExact(handles.PFN_glBindTexGenParameterEXT, unit, coord, value); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTexGenParameterEXT", e); }
    }

    public @CType("GLuint") int BindTextureUnitParameterEXT(@CType("GLenum") int unit, @CType("GLenum") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTextureUnitParameterEXT)) throw new SymbolNotFoundError("Symbol not found: glBindTextureUnitParameterEXT");
        try { return (int) Handles.MH_glBindTextureUnitParameterEXT.invokeExact(handles.PFN_glBindTextureUnitParameterEXT, unit, value); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextureUnitParameterEXT", e); }
    }

    public @CType("GLuint") int BindParameterEXT(@CType("GLenum") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindParameterEXT)) throw new SymbolNotFoundError("Symbol not found: glBindParameterEXT");
        try { return (int) Handles.MH_glBindParameterEXT.invokeExact(handles.PFN_glBindParameterEXT, value); }
        catch (Throwable e) { throw new RuntimeException("error in glBindParameterEXT", e); }
    }

    public @CType("GLboolean") boolean IsVariantEnabledEXT(@CType("GLuint") int id, @CType("GLenum") int cap) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsVariantEnabledEXT)) throw new SymbolNotFoundError("Symbol not found: glIsVariantEnabledEXT");
        try { return (boolean) Handles.MH_glIsVariantEnabledEXT.invokeExact(handles.PFN_glIsVariantEnabledEXT, id, cap); }
        catch (Throwable e) { throw new RuntimeException("error in glIsVariantEnabledEXT", e); }
    }

    public void GetVariantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVariantBooleanvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVariantBooleanvEXT");
        try { Handles.MH_glGetVariantBooleanvEXT.invokeExact(handles.PFN_glGetVariantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantBooleanvEXT", e); }
    }

    public void GetVariantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVariantIntegervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVariantIntegervEXT");
        try { Handles.MH_glGetVariantIntegervEXT.invokeExact(handles.PFN_glGetVariantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantIntegervEXT", e); }
    }

    public void GetVariantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVariantFloatvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVariantFloatvEXT");
        try { Handles.MH_glGetVariantFloatvEXT.invokeExact(handles.PFN_glGetVariantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantFloatvEXT", e); }
    }

    public void GetVariantPointervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("void **") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVariantPointervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVariantPointervEXT");
        try { Handles.MH_glGetVariantPointervEXT.invokeExact(handles.PFN_glGetVariantPointervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVariantPointervEXT", e); }
    }

    public void GetInvariantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInvariantBooleanvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetInvariantBooleanvEXT");
        try { Handles.MH_glGetInvariantBooleanvEXT.invokeExact(handles.PFN_glGetInvariantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantBooleanvEXT", e); }
    }

    public void GetInvariantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInvariantIntegervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetInvariantIntegervEXT");
        try { Handles.MH_glGetInvariantIntegervEXT.invokeExact(handles.PFN_glGetInvariantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantIntegervEXT", e); }
    }

    public void GetInvariantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInvariantFloatvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetInvariantFloatvEXT");
        try { Handles.MH_glGetInvariantFloatvEXT.invokeExact(handles.PFN_glGetInvariantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInvariantFloatvEXT", e); }
    }

    public void GetLocalConstantBooleanvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLboolean *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetLocalConstantBooleanvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetLocalConstantBooleanvEXT");
        try { Handles.MH_glGetLocalConstantBooleanvEXT.invokeExact(handles.PFN_glGetLocalConstantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantBooleanvEXT", e); }
    }

    public void GetLocalConstantIntegervEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLint *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetLocalConstantIntegervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetLocalConstantIntegervEXT");
        try { Handles.MH_glGetLocalConstantIntegervEXT.invokeExact(handles.PFN_glGetLocalConstantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantIntegervEXT", e); }
    }

    public void GetLocalConstantFloatvEXT(@CType("GLuint") int id, @CType("GLenum") int value, @CType("GLfloat *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetLocalConstantFloatvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetLocalConstantFloatvEXT");
        try { Handles.MH_glGetLocalConstantFloatvEXT.invokeExact(handles.PFN_glGetLocalConstantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLocalConstantFloatvEXT", e); }
    }

}
