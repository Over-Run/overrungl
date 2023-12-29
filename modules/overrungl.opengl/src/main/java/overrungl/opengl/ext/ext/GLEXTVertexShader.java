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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_vertex_shader}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_vertex_shader) return;
        ext.glBeginVertexShaderEXT = load.invoke("glBeginVertexShaderEXT", ofVoid());
        ext.glEndVertexShaderEXT = load.invoke("glEndVertexShaderEXT", ofVoid());
        ext.glBindVertexShaderEXT = load.invoke("glBindVertexShaderEXT", ofVoid(JAVA_INT));
        ext.glGenVertexShadersEXT = load.invoke("glGenVertexShadersEXT", of(JAVA_INT, JAVA_INT));
        ext.glDeleteVertexShaderEXT = load.invoke("glDeleteVertexShaderEXT", ofVoid(JAVA_INT));
        ext.glShaderOp1EXT = load.invoke("glShaderOp1EXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glShaderOp2EXT = load.invoke("glShaderOp2EXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glShaderOp3EXT = load.invoke("glShaderOp3EXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSwizzleEXT = load.invoke("glSwizzleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glWriteMaskEXT = load.invoke("glWriteMaskEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glInsertComponentEXT = load.invoke("glInsertComponentEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glExtractComponentEXT = load.invoke("glExtractComponentEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGenSymbolsEXT = load.invoke("glGenSymbolsEXT", of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSetInvariantEXT = load.invoke("glSetInvariantEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glSetLocalConstantEXT = load.invoke("glSetLocalConstantEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVariantbvEXT = load.invoke("glVariantbvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantsvEXT = load.invoke("glVariantsvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantivEXT = load.invoke("glVariantivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantfvEXT = load.invoke("glVariantfvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantdvEXT = load.invoke("glVariantdvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantubvEXT = load.invoke("glVariantubvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantusvEXT = load.invoke("glVariantusvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantuivEXT = load.invoke("glVariantuivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVariantPointerEXT = load.invoke("glVariantPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glEnableVariantClientStateEXT = load.invoke("glEnableVariantClientStateEXT", ofVoid(JAVA_INT));
        ext.glDisableVariantClientStateEXT = load.invoke("glDisableVariantClientStateEXT", ofVoid(JAVA_INT));
        ext.glBindLightParameterEXT = load.invoke("glBindLightParameterEXT", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBindMaterialParameterEXT = load.invoke("glBindMaterialParameterEXT", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBindTexGenParameterEXT = load.invoke("glBindTexGenParameterEXT", of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBindTextureUnitParameterEXT = load.invoke("glBindTextureUnitParameterEXT", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBindParameterEXT = load.invoke("glBindParameterEXT", of(JAVA_INT, JAVA_INT));
        ext.glIsVariantEnabledEXT = load.invoke("glIsVariantEnabledEXT", of(JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glGetVariantBooleanvEXT = load.invoke("glGetVariantBooleanvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVariantIntegervEXT = load.invoke("glGetVariantIntegervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVariantFloatvEXT = load.invoke("glGetVariantFloatvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVariantPointervEXT = load.invoke("glGetVariantPointervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetInvariantBooleanvEXT = load.invoke("glGetInvariantBooleanvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetInvariantIntegervEXT = load.invoke("glGetInvariantIntegervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetInvariantFloatvEXT = load.invoke("glGetInvariantFloatvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetLocalConstantBooleanvEXT = load.invoke("glGetLocalConstantBooleanvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetLocalConstantIntegervEXT = load.invoke("glGetLocalConstantIntegervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetLocalConstantFloatvEXT = load.invoke("glGetLocalConstantFloatvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBeginVertexShaderEXT() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginVertexShaderEXT).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndVertexShaderEXT() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndVertexShaderEXT).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindVertexShaderEXT(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindVertexShaderEXT).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGenVertexShadersEXT(int range) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGenVertexShadersEXT).invokeExact(range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteVertexShaderEXT(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteVertexShaderEXT).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShaderOp1EXT(int op, int res, int arg1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShaderOp1EXT).invokeExact(op, res, arg1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShaderOp2EXT(int op, int res, int arg1, int arg2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShaderOp2EXT).invokeExact(op, res, arg1, arg2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShaderOp3EXT(int op, int res, int arg1, int arg2, int arg3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShaderOp3EXT).invokeExact(op, res, arg1, arg2, arg3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSwizzleEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSwizzleEXT).invokeExact(res, in, outX, outY, outZ, outW);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWriteMaskEXT(int res, int in, int outX, int outY, int outZ, int outW) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWriteMaskEXT).invokeExact(res, in, outX, outY, outZ, outW);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glInsertComponentEXT(int res, int src, int num) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glInsertComponentEXT).invokeExact(res, src, num);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glExtractComponentEXT(int res, int src, int num) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glExtractComponentEXT).invokeExact(res, src, num);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGenSymbolsEXT(int datatype, int storagetype, int range, int components) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGenSymbolsEXT).invokeExact(datatype, storagetype, range, components);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSetInvariantEXT(int id, int type, @NativeType("const void *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSetInvariantEXT).invokeExact(id, type, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSetLocalConstantEXT(int id, int type, @NativeType("const void *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSetLocalConstantEXT).invokeExact(id, type, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantbvEXT(int id, @NativeType("const GLbyte *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantbvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantsvEXT(int id, @NativeType("const GLshort *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantsvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantivEXT(int id, @NativeType("const GLint *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantivEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantfvEXT(int id, @NativeType("const GLfloat *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantfvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantdvEXT(int id, @NativeType("const GLdouble *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantdvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantubvEXT(int id, @NativeType("const GLubyte *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantubvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantusvEXT(int id, @NativeType("const GLushort *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantusvEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantuivEXT(int id, @NativeType("const GLuint *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantuivEXT).invokeExact(id, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantPointerEXT(int id, int type, int stride, @NativeType("const void *") MemorySegment addr) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantPointerEXT).invokeExact(id, type, stride, addr);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableVariantClientStateEXT(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableVariantClientStateEXT).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableVariantClientStateEXT(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableVariantClientStateEXT).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glBindLightParameterEXT(int light, int value) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glBindLightParameterEXT).invokeExact(light, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glBindMaterialParameterEXT(int face, int value) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glBindMaterialParameterEXT).invokeExact(face, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glBindTexGenParameterEXT(int unit, int coord, int value) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glBindTexGenParameterEXT).invokeExact(unit, coord, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glBindTextureUnitParameterEXT(int unit, int value) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glBindTextureUnitParameterEXT).invokeExact(unit, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glBindParameterEXT(int value) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glBindParameterEXT).invokeExact(value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsVariantEnabledEXT(int id, int cap) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsVariantEnabledEXT).invokeExact(id, cap);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantBooleanvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantIntegervEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantFloatvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantPointervEXT(int id, int value, @NativeType("void **") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantPointervEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetInvariantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetInvariantBooleanvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetInvariantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetInvariantIntegervEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetInvariantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetInvariantFloatvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetLocalConstantBooleanvEXT(int id, int value, @NativeType("GLboolean *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetLocalConstantBooleanvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetLocalConstantIntegervEXT(int id, int value, @NativeType("GLint *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetLocalConstantIntegervEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetLocalConstantFloatvEXT(int id, int value, @NativeType("GLfloat *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetLocalConstantFloatvEXT).invokeExact(id, value, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
