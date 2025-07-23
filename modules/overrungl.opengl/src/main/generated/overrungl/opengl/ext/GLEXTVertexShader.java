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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

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
        public static final MethodHandle MH_glBeginVertexShaderEXT = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glEndVertexShaderEXT = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glBindVertexShaderEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGenVertexShadersEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteVertexShaderEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp1EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp2EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderOp3EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSwizzleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glWriteMaskEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInsertComponentEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glExtractComponentEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGenSymbolsEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSetInvariantEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSetLocalConstantEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantbvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantsvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantfvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantdvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantubvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantusvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantuivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantPointerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableVariantClientStateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVariantClientStateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindLightParameterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindMaterialParameterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTexGenParameterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTextureUnitParameterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindParameterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsVariantEnabledEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVariantBooleanvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantIntegervEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantFloatvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantPointervEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantBooleanvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantIntegervEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInvariantFloatvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantBooleanvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantIntegervEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLocalConstantFloatvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glBeginVertexShaderEXT();
    /// ```
    public void BeginVertexShaderEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginVertexShaderEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBeginVertexShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginVertexShaderEXT"); }
        Handles.MH_glBeginVertexShaderEXT.invokeExact(handles.PFN_glBeginVertexShaderEXT); }
        catch (Throwable e) { throw new RuntimeException("error in BeginVertexShaderEXT", e); }
    }

    /// ```
    /// void glEndVertexShaderEXT();
    /// ```
    public void EndVertexShaderEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndVertexShaderEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEndVertexShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndVertexShaderEXT"); }
        Handles.MH_glEndVertexShaderEXT.invokeExact(handles.PFN_glEndVertexShaderEXT); }
        catch (Throwable e) { throw new RuntimeException("error in EndVertexShaderEXT", e); }
    }

    /// ```
    /// void glBindVertexShaderEXT((unsigned int) GLuint id);
    /// ```
    public void BindVertexShaderEXT(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexShaderEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexShaderEXT", id); }
        Handles.MH_glBindVertexShaderEXT.invokeExact(handles.PFN_glBindVertexShaderEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexShaderEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGenVertexShadersEXT((unsigned int) GLuint range);
    /// ```
    public int GenVertexShadersEXT(int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexShadersEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenVertexShadersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenVertexShadersEXT", range); }
        return (int) Handles.MH_glGenVertexShadersEXT.invokeExact(handles.PFN_glGenVertexShadersEXT, range); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexShadersEXT", e); }
    }

    /// ```
    /// void glDeleteVertexShaderEXT((unsigned int) GLuint id);
    /// ```
    public void DeleteVertexShaderEXT(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexShaderEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteVertexShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteVertexShaderEXT", id); }
        Handles.MH_glDeleteVertexShaderEXT.invokeExact(handles.PFN_glDeleteVertexShaderEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexShaderEXT", e); }
    }

    /// ```
    /// void glShaderOp1EXT((unsigned int) GLenum op, (unsigned int) GLuint res, (unsigned int) GLuint arg1);
    /// ```
    public void ShaderOp1EXT(int op, int res, int arg1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderOp1EXT)) throw new GLSymbolNotFoundError("Symbol not found: glShaderOp1EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderOp1EXT", op, res, arg1); }
        Handles.MH_glShaderOp1EXT.invokeExact(handles.PFN_glShaderOp1EXT, op, res, arg1); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderOp1EXT", e); }
    }

    /// ```
    /// void glShaderOp2EXT((unsigned int) GLenum op, (unsigned int) GLuint res, (unsigned int) GLuint arg1, (unsigned int) GLuint arg2);
    /// ```
    public void ShaderOp2EXT(int op, int res, int arg1, int arg2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderOp2EXT)) throw new GLSymbolNotFoundError("Symbol not found: glShaderOp2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderOp2EXT", op, res, arg1, arg2); }
        Handles.MH_glShaderOp2EXT.invokeExact(handles.PFN_glShaderOp2EXT, op, res, arg1, arg2); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderOp2EXT", e); }
    }

    /// ```
    /// void glShaderOp3EXT((unsigned int) GLenum op, (unsigned int) GLuint res, (unsigned int) GLuint arg1, (unsigned int) GLuint arg2, (unsigned int) GLuint arg3);
    /// ```
    public void ShaderOp3EXT(int op, int res, int arg1, int arg2, int arg3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderOp3EXT)) throw new GLSymbolNotFoundError("Symbol not found: glShaderOp3EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderOp3EXT", op, res, arg1, arg2, arg3); }
        Handles.MH_glShaderOp3EXT.invokeExact(handles.PFN_glShaderOp3EXT, op, res, arg1, arg2, arg3); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderOp3EXT", e); }
    }

    /// ```
    /// void glSwizzleEXT((unsigned int) GLuint res, (unsigned int) GLuint in, (unsigned int) GLenum outX, (unsigned int) GLenum outY, (unsigned int) GLenum outZ, (unsigned int) GLenum outW);
    /// ```
    public void SwizzleEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSwizzleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSwizzleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSwizzleEXT", res, in, outX, outY, outZ, outW); }
        Handles.MH_glSwizzleEXT.invokeExact(handles.PFN_glSwizzleEXT, res, in, outX, outY, outZ, outW); }
        catch (Throwable e) { throw new RuntimeException("error in SwizzleEXT", e); }
    }

    /// ```
    /// void glWriteMaskEXT((unsigned int) GLuint res, (unsigned int) GLuint in, (unsigned int) GLenum outX, (unsigned int) GLenum outY, (unsigned int) GLenum outZ, (unsigned int) GLenum outW);
    /// ```
    public void WriteMaskEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWriteMaskEXT)) throw new GLSymbolNotFoundError("Symbol not found: glWriteMaskEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWriteMaskEXT", res, in, outX, outY, outZ, outW); }
        Handles.MH_glWriteMaskEXT.invokeExact(handles.PFN_glWriteMaskEXT, res, in, outX, outY, outZ, outW); }
        catch (Throwable e) { throw new RuntimeException("error in WriteMaskEXT", e); }
    }

    /// ```
    /// void glInsertComponentEXT((unsigned int) GLuint res, (unsigned int) GLuint src, (unsigned int) GLuint num);
    /// ```
    public void InsertComponentEXT(int res, int src, int num) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInsertComponentEXT)) throw new GLSymbolNotFoundError("Symbol not found: glInsertComponentEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInsertComponentEXT", res, src, num); }
        Handles.MH_glInsertComponentEXT.invokeExact(handles.PFN_glInsertComponentEXT, res, src, num); }
        catch (Throwable e) { throw new RuntimeException("error in InsertComponentEXT", e); }
    }

    /// ```
    /// void glExtractComponentEXT((unsigned int) GLuint res, (unsigned int) GLuint src, (unsigned int) GLuint num);
    /// ```
    public void ExtractComponentEXT(int res, int src, int num) {
        if (MemoryUtil.isNullPointer(handles.PFN_glExtractComponentEXT)) throw new GLSymbolNotFoundError("Symbol not found: glExtractComponentEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glExtractComponentEXT", res, src, num); }
        Handles.MH_glExtractComponentEXT.invokeExact(handles.PFN_glExtractComponentEXT, res, src, num); }
        catch (Throwable e) { throw new RuntimeException("error in ExtractComponentEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGenSymbolsEXT((unsigned int) GLenum datatype, (unsigned int) GLenum storagetype, (unsigned int) GLenum range, (unsigned int) GLuint components);
    /// ```
    public int GenSymbolsEXT(int datatype, int storagetype, int range, int components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSymbolsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenSymbolsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenSymbolsEXT", datatype, storagetype, range, components); }
        return (int) Handles.MH_glGenSymbolsEXT.invokeExact(handles.PFN_glGenSymbolsEXT, datatype, storagetype, range, components); }
        catch (Throwable e) { throw new RuntimeException("error in GenSymbolsEXT", e); }
    }

    /// ```
    /// void glSetInvariantEXT((unsigned int) GLuint id, (unsigned int) GLenum type, const void* addr);
    /// ```
    public void SetInvariantEXT(int id, int type, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetInvariantEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSetInvariantEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetInvariantEXT", id, type, addr); }
        Handles.MH_glSetInvariantEXT.invokeExact(handles.PFN_glSetInvariantEXT, id, type, addr); }
        catch (Throwable e) { throw new RuntimeException("error in SetInvariantEXT", e); }
    }

    /// ```
    /// void glSetLocalConstantEXT((unsigned int) GLuint id, (unsigned int) GLenum type, const void* addr);
    /// ```
    public void SetLocalConstantEXT(int id, int type, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetLocalConstantEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSetLocalConstantEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetLocalConstantEXT", id, type, addr); }
        Handles.MH_glSetLocalConstantEXT.invokeExact(handles.PFN_glSetLocalConstantEXT, id, type, addr); }
        catch (Throwable e) { throw new RuntimeException("error in SetLocalConstantEXT", e); }
    }

    /// ```
    /// void glVariantbvEXT((unsigned int) GLuint id, const GLbyte* addr);
    /// ```
    public void VariantbvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantbvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantbvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantbvEXT", id, addr); }
        Handles.MH_glVariantbvEXT.invokeExact(handles.PFN_glVariantbvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantbvEXT", e); }
    }

    /// ```
    /// void glVariantsvEXT((unsigned int) GLuint id, const GLshort* addr);
    /// ```
    public void VariantsvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantsvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantsvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantsvEXT", id, addr); }
        Handles.MH_glVariantsvEXT.invokeExact(handles.PFN_glVariantsvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantsvEXT", e); }
    }

    /// ```
    /// void glVariantivEXT((unsigned int) GLuint id, const GLint* addr);
    /// ```
    public void VariantivEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantivEXT", id, addr); }
        Handles.MH_glVariantivEXT.invokeExact(handles.PFN_glVariantivEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantivEXT", e); }
    }

    /// ```
    /// void glVariantfvEXT((unsigned int) GLuint id, const GLfloat* addr);
    /// ```
    public void VariantfvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantfvEXT", id, addr); }
        Handles.MH_glVariantfvEXT.invokeExact(handles.PFN_glVariantfvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantfvEXT", e); }
    }

    /// ```
    /// void glVariantdvEXT((unsigned int) GLuint id, const GLdouble* addr);
    /// ```
    public void VariantdvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantdvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantdvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantdvEXT", id, addr); }
        Handles.MH_glVariantdvEXT.invokeExact(handles.PFN_glVariantdvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantdvEXT", e); }
    }

    /// ```
    /// void glVariantubvEXT((unsigned int) GLuint id, const GLubyte* addr);
    /// ```
    public void VariantubvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantubvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantubvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantubvEXT", id, addr); }
        Handles.MH_glVariantubvEXT.invokeExact(handles.PFN_glVariantubvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantubvEXT", e); }
    }

    /// ```
    /// void glVariantusvEXT((unsigned int) GLuint id, const GLushort* addr);
    /// ```
    public void VariantusvEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantusvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantusvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantusvEXT", id, addr); }
        Handles.MH_glVariantusvEXT.invokeExact(handles.PFN_glVariantusvEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantusvEXT", e); }
    }

    /// ```
    /// void glVariantuivEXT((unsigned int) GLuint id, const GLuint* addr);
    /// ```
    public void VariantuivEXT(int id, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantuivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantuivEXT", id, addr); }
        Handles.MH_glVariantuivEXT.invokeExact(handles.PFN_glVariantuivEXT, id, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantuivEXT", e); }
    }

    /// ```
    /// void glVariantPointerEXT((unsigned int) GLuint id, (unsigned int) GLenum type, (unsigned int) GLuint stride, const void* addr);
    /// ```
    public void VariantPointerEXT(int id, int type, int stride, MemorySegment addr) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVariantPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantPointerEXT", id, type, stride, addr); }
        Handles.MH_glVariantPointerEXT.invokeExact(handles.PFN_glVariantPointerEXT, id, type, stride, addr); }
        catch (Throwable e) { throw new RuntimeException("error in VariantPointerEXT", e); }
    }

    /// ```
    /// void glEnableVariantClientStateEXT((unsigned int) GLuint id);
    /// ```
    public void EnableVariantClientStateEXT(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVariantClientStateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVariantClientStateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVariantClientStateEXT", id); }
        Handles.MH_glEnableVariantClientStateEXT.invokeExact(handles.PFN_glEnableVariantClientStateEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVariantClientStateEXT", e); }
    }

    /// ```
    /// void glDisableVariantClientStateEXT((unsigned int) GLuint id);
    /// ```
    public void DisableVariantClientStateEXT(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVariantClientStateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVariantClientStateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVariantClientStateEXT", id); }
        Handles.MH_glDisableVariantClientStateEXT.invokeExact(handles.PFN_glDisableVariantClientStateEXT, id); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVariantClientStateEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glBindLightParameterEXT((unsigned int) GLenum light, (unsigned int) GLenum value);
    /// ```
    public int BindLightParameterEXT(int light, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindLightParameterEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindLightParameterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindLightParameterEXT", light, value); }
        return (int) Handles.MH_glBindLightParameterEXT.invokeExact(handles.PFN_glBindLightParameterEXT, light, value); }
        catch (Throwable e) { throw new RuntimeException("error in BindLightParameterEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glBindMaterialParameterEXT((unsigned int) GLenum face, (unsigned int) GLenum value);
    /// ```
    public int BindMaterialParameterEXT(int face, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindMaterialParameterEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindMaterialParameterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindMaterialParameterEXT", face, value); }
        return (int) Handles.MH_glBindMaterialParameterEXT.invokeExact(handles.PFN_glBindMaterialParameterEXT, face, value); }
        catch (Throwable e) { throw new RuntimeException("error in BindMaterialParameterEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glBindTexGenParameterEXT((unsigned int) GLenum unit, (unsigned int) GLenum coord, (unsigned int) GLenum value);
    /// ```
    public int BindTexGenParameterEXT(int unit, int coord, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTexGenParameterEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindTexGenParameterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTexGenParameterEXT", unit, coord, value); }
        return (int) Handles.MH_glBindTexGenParameterEXT.invokeExact(handles.PFN_glBindTexGenParameterEXT, unit, coord, value); }
        catch (Throwable e) { throw new RuntimeException("error in BindTexGenParameterEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glBindTextureUnitParameterEXT((unsigned int) GLenum unit, (unsigned int) GLenum value);
    /// ```
    public int BindTextureUnitParameterEXT(int unit, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextureUnitParameterEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindTextureUnitParameterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTextureUnitParameterEXT", unit, value); }
        return (int) Handles.MH_glBindTextureUnitParameterEXT.invokeExact(handles.PFN_glBindTextureUnitParameterEXT, unit, value); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextureUnitParameterEXT", e); }
    }

    /// ```
    /// (unsigned int) GLuint glBindParameterEXT((unsigned int) GLenum value);
    /// ```
    public int BindParameterEXT(int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindParameterEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindParameterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindParameterEXT", value); }
        return (int) Handles.MH_glBindParameterEXT.invokeExact(handles.PFN_glBindParameterEXT, value); }
        catch (Throwable e) { throw new RuntimeException("error in BindParameterEXT", e); }
    }

    /// ```
    /// GLboolean glIsVariantEnabledEXT((unsigned int) GLuint id, (unsigned int) GLenum cap);
    /// ```
    public boolean IsVariantEnabledEXT(int id, int cap) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVariantEnabledEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsVariantEnabledEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVariantEnabledEXT", id, cap); }
        return (((byte) Handles.MH_glIsVariantEnabledEXT.invokeExact(handles.PFN_glIsVariantEnabledEXT, id, cap)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVariantEnabledEXT", e); }
    }

    /// ```
    /// void glGetVariantBooleanvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLboolean* data);
    /// ```
    public void GetVariantBooleanvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantBooleanvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantBooleanvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantBooleanvEXT", id, value, data); }
        Handles.MH_glGetVariantBooleanvEXT.invokeExact(handles.PFN_glGetVariantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantBooleanvEXT", e); }
    }

    /// ```
    /// void glGetVariantIntegervEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLint* data);
    /// ```
    public void GetVariantIntegervEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantIntegervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantIntegervEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantIntegervEXT", id, value, data); }
        Handles.MH_glGetVariantIntegervEXT.invokeExact(handles.PFN_glGetVariantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantIntegervEXT", e); }
    }

    /// ```
    /// void glGetVariantFloatvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLfloat* data);
    /// ```
    public void GetVariantFloatvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantFloatvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantFloatvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantFloatvEXT", id, value, data); }
        Handles.MH_glGetVariantFloatvEXT.invokeExact(handles.PFN_glGetVariantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantFloatvEXT", e); }
    }

    /// ```
    /// void glGetVariantPointervEXT((unsigned int) GLuint id, (unsigned int) GLenum value, void** data);
    /// ```
    public void GetVariantPointervEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantPointervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantPointervEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantPointervEXT", id, value, data); }
        Handles.MH_glGetVariantPointervEXT.invokeExact(handles.PFN_glGetVariantPointervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantPointervEXT", e); }
    }

    /// ```
    /// void glGetInvariantBooleanvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLboolean* data);
    /// ```
    public void GetInvariantBooleanvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInvariantBooleanvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetInvariantBooleanvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInvariantBooleanvEXT", id, value, data); }
        Handles.MH_glGetInvariantBooleanvEXT.invokeExact(handles.PFN_glGetInvariantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInvariantBooleanvEXT", e); }
    }

    /// ```
    /// void glGetInvariantIntegervEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLint* data);
    /// ```
    public void GetInvariantIntegervEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInvariantIntegervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetInvariantIntegervEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInvariantIntegervEXT", id, value, data); }
        Handles.MH_glGetInvariantIntegervEXT.invokeExact(handles.PFN_glGetInvariantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInvariantIntegervEXT", e); }
    }

    /// ```
    /// void glGetInvariantFloatvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLfloat* data);
    /// ```
    public void GetInvariantFloatvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInvariantFloatvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetInvariantFloatvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInvariantFloatvEXT", id, value, data); }
        Handles.MH_glGetInvariantFloatvEXT.invokeExact(handles.PFN_glGetInvariantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInvariantFloatvEXT", e); }
    }

    /// ```
    /// void glGetLocalConstantBooleanvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLboolean* data);
    /// ```
    public void GetLocalConstantBooleanvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLocalConstantBooleanvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetLocalConstantBooleanvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetLocalConstantBooleanvEXT", id, value, data); }
        Handles.MH_glGetLocalConstantBooleanvEXT.invokeExact(handles.PFN_glGetLocalConstantBooleanvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetLocalConstantBooleanvEXT", e); }
    }

    /// ```
    /// void glGetLocalConstantIntegervEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLint* data);
    /// ```
    public void GetLocalConstantIntegervEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLocalConstantIntegervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetLocalConstantIntegervEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetLocalConstantIntegervEXT", id, value, data); }
        Handles.MH_glGetLocalConstantIntegervEXT.invokeExact(handles.PFN_glGetLocalConstantIntegervEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetLocalConstantIntegervEXT", e); }
    }

    /// ```
    /// void glGetLocalConstantFloatvEXT((unsigned int) GLuint id, (unsigned int) GLenum value, GLfloat* data);
    /// ```
    public void GetLocalConstantFloatvEXT(int id, int value, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLocalConstantFloatvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetLocalConstantFloatvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetLocalConstantFloatvEXT", id, value, data); }
        Handles.MH_glGetLocalConstantFloatvEXT.invokeExact(handles.PFN_glGetLocalConstantFloatvEXT, id, value, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetLocalConstantFloatvEXT", e); }
    }

}
