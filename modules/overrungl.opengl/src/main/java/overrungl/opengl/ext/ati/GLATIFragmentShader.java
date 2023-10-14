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
package overrungl.opengl.ext.ati;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ATI_fragment_shader}
  */
public final class GLATIFragmentShader {
    public static final int GL_FRAGMENT_SHADER_ATI = 0x8920;
    public static final int GL_REG_0_ATI = 0x8921;
    public static final int GL_REG_1_ATI = 0x8922;
    public static final int GL_REG_2_ATI = 0x8923;
    public static final int GL_REG_3_ATI = 0x8924;
    public static final int GL_REG_4_ATI = 0x8925;
    public static final int GL_REG_5_ATI = 0x8926;
    public static final int GL_REG_6_ATI = 0x8927;
    public static final int GL_REG_7_ATI = 0x8928;
    public static final int GL_REG_8_ATI = 0x8929;
    public static final int GL_REG_9_ATI = 0x892A;
    public static final int GL_REG_10_ATI = 0x892B;
    public static final int GL_REG_11_ATI = 0x892C;
    public static final int GL_REG_12_ATI = 0x892D;
    public static final int GL_REG_13_ATI = 0x892E;
    public static final int GL_REG_14_ATI = 0x892F;
    public static final int GL_REG_15_ATI = 0x8930;
    public static final int GL_REG_16_ATI = 0x8931;
    public static final int GL_REG_17_ATI = 0x8932;
    public static final int GL_REG_18_ATI = 0x8933;
    public static final int GL_REG_19_ATI = 0x8934;
    public static final int GL_REG_20_ATI = 0x8935;
    public static final int GL_REG_21_ATI = 0x8936;
    public static final int GL_REG_22_ATI = 0x8937;
    public static final int GL_REG_23_ATI = 0x8938;
    public static final int GL_REG_24_ATI = 0x8939;
    public static final int GL_REG_25_ATI = 0x893A;
    public static final int GL_REG_26_ATI = 0x893B;
    public static final int GL_REG_27_ATI = 0x893C;
    public static final int GL_REG_28_ATI = 0x893D;
    public static final int GL_REG_29_ATI = 0x893E;
    public static final int GL_REG_30_ATI = 0x893F;
    public static final int GL_REG_31_ATI = 0x8940;
    public static final int GL_CON_0_ATI = 0x8941;
    public static final int GL_CON_1_ATI = 0x8942;
    public static final int GL_CON_2_ATI = 0x8943;
    public static final int GL_CON_3_ATI = 0x8944;
    public static final int GL_CON_4_ATI = 0x8945;
    public static final int GL_CON_5_ATI = 0x8946;
    public static final int GL_CON_6_ATI = 0x8947;
    public static final int GL_CON_7_ATI = 0x8948;
    public static final int GL_CON_8_ATI = 0x8949;
    public static final int GL_CON_9_ATI = 0x894A;
    public static final int GL_CON_10_ATI = 0x894B;
    public static final int GL_CON_11_ATI = 0x894C;
    public static final int GL_CON_12_ATI = 0x894D;
    public static final int GL_CON_13_ATI = 0x894E;
    public static final int GL_CON_14_ATI = 0x894F;
    public static final int GL_CON_15_ATI = 0x8950;
    public static final int GL_CON_16_ATI = 0x8951;
    public static final int GL_CON_17_ATI = 0x8952;
    public static final int GL_CON_18_ATI = 0x8953;
    public static final int GL_CON_19_ATI = 0x8954;
    public static final int GL_CON_20_ATI = 0x8955;
    public static final int GL_CON_21_ATI = 0x8956;
    public static final int GL_CON_22_ATI = 0x8957;
    public static final int GL_CON_23_ATI = 0x8958;
    public static final int GL_CON_24_ATI = 0x8959;
    public static final int GL_CON_25_ATI = 0x895A;
    public static final int GL_CON_26_ATI = 0x895B;
    public static final int GL_CON_27_ATI = 0x895C;
    public static final int GL_CON_28_ATI = 0x895D;
    public static final int GL_CON_29_ATI = 0x895E;
    public static final int GL_CON_30_ATI = 0x895F;
    public static final int GL_CON_31_ATI = 0x8960;
    public static final int GL_MOV_ATI = 0x8961;
    public static final int GL_ADD_ATI = 0x8963;
    public static final int GL_MUL_ATI = 0x8964;
    public static final int GL_SUB_ATI = 0x8965;
    public static final int GL_DOT3_ATI = 0x8966;
    public static final int GL_DOT4_ATI = 0x8967;
    public static final int GL_MAD_ATI = 0x8968;
    public static final int GL_LERP_ATI = 0x8969;
    public static final int GL_CND_ATI = 0x896A;
    public static final int GL_CND0_ATI = 0x896B;
    public static final int GL_DOT2_ADD_ATI = 0x896C;
    public static final int GL_SECONDARY_INTERPOLATOR_ATI = 0x896D;
    public static final int GL_NUM_FRAGMENT_REGISTERS_ATI = 0x896E;
    public static final int GL_NUM_FRAGMENT_CONSTANTS_ATI = 0x896F;
    public static final int GL_NUM_PASSES_ATI = 0x8970;
    public static final int GL_NUM_INSTRUCTIONS_PER_PASS_ATI = 0x8971;
    public static final int GL_NUM_INSTRUCTIONS_TOTAL_ATI = 0x8972;
    public static final int GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI = 0x8973;
    public static final int GL_NUM_LOOPBACK_COMPONENTS_ATI = 0x8974;
    public static final int GL_COLOR_ALPHA_PAIRING_ATI = 0x8975;
    public static final int GL_SWIZZLE_STR_ATI = 0x8976;
    public static final int GL_SWIZZLE_STQ_ATI = 0x8977;
    public static final int GL_SWIZZLE_STR_DR_ATI = 0x8978;
    public static final int GL_SWIZZLE_STQ_DQ_ATI = 0x8979;
    public static final int GL_SWIZZLE_STRQ_ATI = 0x897A;
    public static final int GL_SWIZZLE_STRQ_DQ_ATI = 0x897B;
    public static final int GL_RED_BIT_ATI = 0x00000001;
    public static final int GL_GREEN_BIT_ATI = 0x00000002;
    public static final int GL_BLUE_BIT_ATI = 0x00000004;
    public static final int GL_2X_BIT_ATI = 0x00000001;
    public static final int GL_4X_BIT_ATI = 0x00000002;
    public static final int GL_8X_BIT_ATI = 0x00000004;
    public static final int GL_HALF_BIT_ATI = 0x00000008;
    public static final int GL_QUARTER_BIT_ATI = 0x00000010;
    public static final int GL_EIGHTH_BIT_ATI = 0x00000020;
    public static final int GL_SATURATE_BIT_ATI = 0x00000040;
    public static final int GL_COMP_BIT_ATI = 0x00000002;
    public static final int GL_NEGATE_BIT_ATI = 0x00000004;
    public static final int GL_BIAS_BIT_ATI = 0x00000008;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_fragment_shader) return;
        ext.glGenFragmentShadersATI = load.invoke("glGenFragmentShadersATI", of(JAVA_INT, JAVA_INT));
        ext.glBindFragmentShaderATI = load.invoke("glBindFragmentShaderATI", ofVoid(JAVA_INT));
        ext.glDeleteFragmentShaderATI = load.invoke("glDeleteFragmentShaderATI", ofVoid(JAVA_INT));
        ext.glBeginFragmentShaderATI = load.invoke("glBeginFragmentShaderATI", ofVoid());
        ext.glEndFragmentShaderATI = load.invoke("glEndFragmentShaderATI", ofVoid());
        ext.glPassTexCoordATI = load.invoke("glPassTexCoordATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSampleMapATI = load.invoke("glSampleMapATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glColorFragmentOp1ATI = load.invoke("glColorFragmentOp1ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glColorFragmentOp2ATI = load.invoke("glColorFragmentOp2ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glColorFragmentOp3ATI = load.invoke("glColorFragmentOp3ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glAlphaFragmentOp1ATI = load.invoke("glAlphaFragmentOp1ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glAlphaFragmentOp2ATI = load.invoke("glAlphaFragmentOp2ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glAlphaFragmentOp3ATI = load.invoke("glAlphaFragmentOp3ATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSetFragmentShaderConstantATI = load.invoke("glSetFragmentShaderConstantATI", ofVoid(JAVA_INT, ADDRESS));
    }

    public static int glGenFragmentShadersATI(int range) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGenFragmentShadersATI).invokeExact(range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindFragmentShaderATI(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindFragmentShaderATI).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteFragmentShaderATI(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteFragmentShaderATI).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBeginFragmentShaderATI() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginFragmentShaderATI).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndFragmentShaderATI() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndFragmentShaderATI).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPassTexCoordATI(int dst, int coord, int swizzle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPassTexCoordATI).invokeExact(dst, coord, swizzle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSampleMapATI(int dst, int interp, int swizzle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSampleMapATI).invokeExact(dst, interp, swizzle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorFragmentOp1ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorFragmentOp1ATI).invokeExact(op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorFragmentOp2ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorFragmentOp2ATI).invokeExact(op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorFragmentOp3ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod, int arg3, int arg3Rep, int arg3Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorFragmentOp3ATI).invokeExact(op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glAlphaFragmentOp1ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAlphaFragmentOp1ATI).invokeExact(op, dst, dstMod, arg1, arg1Rep, arg1Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glAlphaFragmentOp2ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAlphaFragmentOp2ATI).invokeExact(op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glAlphaFragmentOp3ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod, int arg3, int arg3Rep, int arg3Mod) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAlphaFragmentOp3ATI).invokeExact(op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSetFragmentShaderConstantATI(int dst, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSetFragmentShaderConstantATI).invokeExact(dst, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
