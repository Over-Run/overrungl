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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_vertex_shader}
 */
public interface GLEXTVertexShader {
    int GL_VERTEX_SHADER_EXT = 0x8780;
    int GL_VERTEX_SHADER_BINDING_EXT = 0x8781;
    int GL_OP_INDEX_EXT = 0x8782;
    int GL_OP_NEGATE_EXT = 0x8783;
    int GL_OP_DOT3_EXT = 0x8784;
    int GL_OP_DOT4_EXT = 0x8785;
    int GL_OP_MUL_EXT = 0x8786;
    int GL_OP_ADD_EXT = 0x8787;
    int GL_OP_MADD_EXT = 0x8788;
    int GL_OP_FRAC_EXT = 0x8789;
    int GL_OP_MAX_EXT = 0x878A;
    int GL_OP_MIN_EXT = 0x878B;
    int GL_OP_SET_GE_EXT = 0x878C;
    int GL_OP_SET_LT_EXT = 0x878D;
    int GL_OP_CLAMP_EXT = 0x878E;
    int GL_OP_FLOOR_EXT = 0x878F;
    int GL_OP_ROUND_EXT = 0x8790;
    int GL_OP_EXP_BASE_2_EXT = 0x8791;
    int GL_OP_LOG_BASE_2_EXT = 0x8792;
    int GL_OP_POWER_EXT = 0x8793;
    int GL_OP_RECIP_EXT = 0x8794;
    int GL_OP_RECIP_SQRT_EXT = 0x8795;
    int GL_OP_SUB_EXT = 0x8796;
    int GL_OP_CROSS_PRODUCT_EXT = 0x8797;
    int GL_OP_MULTIPLY_MATRIX_EXT = 0x8798;
    int GL_OP_MOV_EXT = 0x8799;
    int GL_OUTPUT_VERTEX_EXT = 0x879A;
    int GL_OUTPUT_COLOR0_EXT = 0x879B;
    int GL_OUTPUT_COLOR1_EXT = 0x879C;
    int GL_OUTPUT_TEXTURE_COORD0_EXT = 0x879D;
    int GL_OUTPUT_TEXTURE_COORD1_EXT = 0x879E;
    int GL_OUTPUT_TEXTURE_COORD2_EXT = 0x879F;
    int GL_OUTPUT_TEXTURE_COORD3_EXT = 0x87A0;
    int GL_OUTPUT_TEXTURE_COORD4_EXT = 0x87A1;
    int GL_OUTPUT_TEXTURE_COORD5_EXT = 0x87A2;
    int GL_OUTPUT_TEXTURE_COORD6_EXT = 0x87A3;
    int GL_OUTPUT_TEXTURE_COORD7_EXT = 0x87A4;
    int GL_OUTPUT_TEXTURE_COORD8_EXT = 0x87A5;
    int GL_OUTPUT_TEXTURE_COORD9_EXT = 0x87A6;
    int GL_OUTPUT_TEXTURE_COORD10_EXT = 0x87A7;
    int GL_OUTPUT_TEXTURE_COORD11_EXT = 0x87A8;
    int GL_OUTPUT_TEXTURE_COORD12_EXT = 0x87A9;
    int GL_OUTPUT_TEXTURE_COORD13_EXT = 0x87AA;
    int GL_OUTPUT_TEXTURE_COORD14_EXT = 0x87AB;
    int GL_OUTPUT_TEXTURE_COORD15_EXT = 0x87AC;
    int GL_OUTPUT_TEXTURE_COORD16_EXT = 0x87AD;
    int GL_OUTPUT_TEXTURE_COORD17_EXT = 0x87AE;
    int GL_OUTPUT_TEXTURE_COORD18_EXT = 0x87AF;
    int GL_OUTPUT_TEXTURE_COORD19_EXT = 0x87B0;
    int GL_OUTPUT_TEXTURE_COORD20_EXT = 0x87B1;
    int GL_OUTPUT_TEXTURE_COORD21_EXT = 0x87B2;
    int GL_OUTPUT_TEXTURE_COORD22_EXT = 0x87B3;
    int GL_OUTPUT_TEXTURE_COORD23_EXT = 0x87B4;
    int GL_OUTPUT_TEXTURE_COORD24_EXT = 0x87B5;
    int GL_OUTPUT_TEXTURE_COORD25_EXT = 0x87B6;
    int GL_OUTPUT_TEXTURE_COORD26_EXT = 0x87B7;
    int GL_OUTPUT_TEXTURE_COORD27_EXT = 0x87B8;
    int GL_OUTPUT_TEXTURE_COORD28_EXT = 0x87B9;
    int GL_OUTPUT_TEXTURE_COORD29_EXT = 0x87BA;
    int GL_OUTPUT_TEXTURE_COORD30_EXT = 0x87BB;
    int GL_OUTPUT_TEXTURE_COORD31_EXT = 0x87BC;
    int GL_OUTPUT_FOG_EXT = 0x87BD;
    int GL_SCALAR_EXT = 0x87BE;
    int GL_VECTOR_EXT = 0x87BF;
    int GL_MATRIX_EXT = 0x87C0;
    int GL_VARIANT_EXT = 0x87C1;
    int GL_INVARIANT_EXT = 0x87C2;
    int GL_LOCAL_CONSTANT_EXT = 0x87C3;
    int GL_LOCAL_EXT = 0x87C4;
    int GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87C5;
    int GL_MAX_VERTEX_SHADER_VARIANTS_EXT = 0x87C6;
    int GL_MAX_VERTEX_SHADER_INVARIANTS_EXT = 0x87C7;
    int GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87C8;
    int GL_MAX_VERTEX_SHADER_LOCALS_EXT = 0x87C9;
    int GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CA;
    int GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT = 0x87CB;
    int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87CC;
    int GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT = 0x87CD;
    int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT = 0x87CE;
    int GL_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CF;
    int GL_VERTEX_SHADER_VARIANTS_EXT = 0x87D0;
    int GL_VERTEX_SHADER_INVARIANTS_EXT = 0x87D1;
    int GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87D2;
    int GL_VERTEX_SHADER_LOCALS_EXT = 0x87D3;
    int GL_VERTEX_SHADER_OPTIMIZED_EXT = 0x87D4;
    int GL_X_EXT = 0x87D5;
    int GL_Y_EXT = 0x87D6;
    int GL_Z_EXT = 0x87D7;
    int GL_W_EXT = 0x87D8;
    int GL_NEGATIVE_X_EXT = 0x87D9;
    int GL_NEGATIVE_Y_EXT = 0x87DA;
    int GL_NEGATIVE_Z_EXT = 0x87DB;
    int GL_NEGATIVE_W_EXT = 0x87DC;
    int GL_ZERO_EXT = 0x87DD;
    int GL_ONE_EXT = 0x87DE;
    int GL_NEGATIVE_ONE_EXT = 0x87DF;
    int GL_NORMALIZED_RANGE_EXT = 0x87E0;
    int GL_FULL_RANGE_EXT = 0x87E1;
    int GL_CURRENT_VERTEX_EXT = 0x87E2;
    int GL_MVP_MATRIX_EXT = 0x87E3;
    int GL_VARIANT_VALUE_EXT = 0x87E4;
    int GL_VARIANT_DATATYPE_EXT = 0x87E5;
    int GL_VARIANT_ARRAY_STRIDE_EXT = 0x87E6;
    int GL_VARIANT_ARRAY_TYPE_EXT = 0x87E7;
    int GL_VARIANT_ARRAY_EXT = 0x87E8;
    int GL_VARIANT_ARRAY_POINTER_EXT = 0x87E9;
    int GL_INVARIANT_VALUE_EXT = 0x87EA;
    int GL_INVARIANT_DATATYPE_EXT = 0x87EB;
    int GL_LOCAL_CONSTANT_VALUE_EXT = 0x87EC;
    int GL_LOCAL_CONSTANT_DATATYPE_EXT = 0x87ED;

    default void glBeginVertexShaderEXT() {
        throw new ContextException();
    }

    default void glEndVertexShaderEXT() {
        throw new ContextException();
    }

    default void glBindVertexShaderEXT(int id) {
        throw new ContextException();
    }

    default int glGenVertexShadersEXT(int range) {
        throw new ContextException();
    }

    default void glDeleteVertexShaderEXT(int id) {
        throw new ContextException();
    }

    default void glShaderOp1EXT(int op, int res, int arg1) {
        throw new ContextException();
    }

    default void glShaderOp2EXT(int op, int res, int arg1, int arg2) {
        throw new ContextException();
    }

    default void glShaderOp3EXT(int op, int res, int arg1, int arg2, int arg3) {
        throw new ContextException();
    }

    default void glSwizzleEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        throw new ContextException();
    }

    default void glWriteMaskEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        throw new ContextException();
    }

    default void glInsertComponentEXT(int res, int src, int num) {
        throw new ContextException();
    }

    default void glExtractComponentEXT(int res, int src, int num) {
        throw new ContextException();
    }

    default int glGenSymbolsEXT(int datatype, int storagetype, int range, int components) {
        throw new ContextException();
    }

    default void glSetInvariantEXT(int id, int type, @NativeType("const void *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glSetLocalConstantEXT(int id, int type, @NativeType("const void *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantbvEXT(int id, @NativeType("const GLbyte *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantsvEXT(int id, @NativeType("const GLshort *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantivEXT(int id, @NativeType("const GLint *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantfvEXT(int id, @NativeType("const GLfloat *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantdvEXT(int id, @NativeType("const GLdouble *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantubvEXT(int id, @NativeType("const GLubyte *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantusvEXT(int id, @NativeType("const GLushort *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantuivEXT(int id, @NativeType("const GLuint *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glVariantPointerEXT(int id, int type, int stride, @NativeType("const void *") MemorySegment addr) {
        throw new ContextException();
    }

    default void glEnableVariantClientStateEXT(int id) {
        throw new ContextException();
    }

    default void glDisableVariantClientStateEXT(int id) {
        throw new ContextException();
    }

    default int glBindLightParameterEXT(int light, int value) {
        throw new ContextException();
    }

    default int glBindMaterialParameterEXT(int face, int value) {
        throw new ContextException();
    }

    default int glBindTexGenParameterEXT(int unit, int coord, int value) {
        throw new ContextException();
    }

    default int glBindTextureUnitParameterEXT(int unit, int value) {
        throw new ContextException();
    }

    default int glBindParameterEXT(int value) {
        throw new ContextException();
    }

    default boolean glIsVariantEnabledEXT(int id, int cap) {
        throw new ContextException();
    }

    default void glGetVariantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetVariantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetVariantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetVariantPointervEXT(int id, int value, @NativeType("void **") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetInvariantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetInvariantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetInvariantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetLocalConstantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetLocalConstantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetLocalConstantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        throw new ContextException();
    }

}
