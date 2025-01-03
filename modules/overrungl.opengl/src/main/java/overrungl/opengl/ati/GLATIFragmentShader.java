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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glGenFragmentShadersATI = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenFragmentShadersATI;
    public static final MethodHandle MH_glBindFragmentShaderATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindFragmentShaderATI;
    public static final MethodHandle MH_glDeleteFragmentShaderATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDeleteFragmentShaderATI;
    public static final MethodHandle MH_glBeginFragmentShaderATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glBeginFragmentShaderATI;
    public static final MethodHandle MH_glEndFragmentShaderATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndFragmentShaderATI;
    public static final MethodHandle MH_glPassTexCoordATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPassTexCoordATI;
    public static final MethodHandle MH_glSampleMapATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSampleMapATI;
    public static final MethodHandle MH_glColorFragmentOp1ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColorFragmentOp1ATI;
    public static final MethodHandle MH_glColorFragmentOp2ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColorFragmentOp2ATI;
    public static final MethodHandle MH_glColorFragmentOp3ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColorFragmentOp3ATI;
    public static final MethodHandle MH_glAlphaFragmentOp1ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAlphaFragmentOp1ATI;
    public static final MethodHandle MH_glAlphaFragmentOp2ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAlphaFragmentOp2ATI;
    public static final MethodHandle MH_glAlphaFragmentOp3ATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAlphaFragmentOp3ATI;
    public static final MethodHandle MH_glSetFragmentShaderConstantATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSetFragmentShaderConstantATI;

    public GLATIFragmentShader(overrungl.opengl.GLLoadFunc func) {
        PFN_glGenFragmentShadersATI = func.invoke("glGenFragmentShadersATI");
        PFN_glBindFragmentShaderATI = func.invoke("glBindFragmentShaderATI");
        PFN_glDeleteFragmentShaderATI = func.invoke("glDeleteFragmentShaderATI");
        PFN_glBeginFragmentShaderATI = func.invoke("glBeginFragmentShaderATI");
        PFN_glEndFragmentShaderATI = func.invoke("glEndFragmentShaderATI");
        PFN_glPassTexCoordATI = func.invoke("glPassTexCoordATI");
        PFN_glSampleMapATI = func.invoke("glSampleMapATI");
        PFN_glColorFragmentOp1ATI = func.invoke("glColorFragmentOp1ATI");
        PFN_glColorFragmentOp2ATI = func.invoke("glColorFragmentOp2ATI");
        PFN_glColorFragmentOp3ATI = func.invoke("glColorFragmentOp3ATI");
        PFN_glAlphaFragmentOp1ATI = func.invoke("glAlphaFragmentOp1ATI");
        PFN_glAlphaFragmentOp2ATI = func.invoke("glAlphaFragmentOp2ATI");
        PFN_glAlphaFragmentOp3ATI = func.invoke("glAlphaFragmentOp3ATI");
        PFN_glSetFragmentShaderConstantATI = func.invoke("glSetFragmentShaderConstantATI");
    }

    public @CType("GLuint") int GenFragmentShadersATI(@CType("GLuint") int range) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenFragmentShadersATI))
            return (int) MH_glGenFragmentShadersATI.invokeExact(PFN_glGenFragmentShadersATI, range);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenFragmentShadersATI", e); }
    }

    public void BindFragmentShaderATI(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindFragmentShaderATI))
            MH_glBindFragmentShaderATI.invokeExact(PFN_glBindFragmentShaderATI, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindFragmentShaderATI", e); }
    }

    public void DeleteFragmentShaderATI(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteFragmentShaderATI))
            MH_glDeleteFragmentShaderATI.invokeExact(PFN_glDeleteFragmentShaderATI, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFragmentShaderATI", e); }
    }

    public void BeginFragmentShaderATI() {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginFragmentShaderATI))
            MH_glBeginFragmentShaderATI.invokeExact(PFN_glBeginFragmentShaderATI);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginFragmentShaderATI", e); }
    }

    public void EndFragmentShaderATI() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndFragmentShaderATI))
            MH_glEndFragmentShaderATI.invokeExact(PFN_glEndFragmentShaderATI);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndFragmentShaderATI", e); }
    }

    public void PassTexCoordATI(@CType("GLuint") int dst, @CType("GLuint") int coord, @CType("GLenum") int swizzle) {
        try { if (!Unmarshal.isNullPointer(PFN_glPassTexCoordATI))
            MH_glPassTexCoordATI.invokeExact(PFN_glPassTexCoordATI, dst, coord, swizzle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPassTexCoordATI", e); }
    }

    public void SampleMapATI(@CType("GLuint") int dst, @CType("GLuint") int interp, @CType("GLenum") int swizzle) {
        try { if (!Unmarshal.isNullPointer(PFN_glSampleMapATI))
            MH_glSampleMapATI.invokeExact(PFN_glSampleMapATI, dst, interp, swizzle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSampleMapATI", e); }
    }

    public void ColorFragmentOp1ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMask, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glColorFragmentOp1ATI))
            MH_glColorFragmentOp1ATI.invokeExact(PFN_glColorFragmentOp1ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glColorFragmentOp1ATI", e); }
    }

    public void ColorFragmentOp2ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMask, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod, @CType("GLuint") int arg2, @CType("GLuint") int arg2Rep, @CType("GLuint") int arg2Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glColorFragmentOp2ATI))
            MH_glColorFragmentOp2ATI.invokeExact(PFN_glColorFragmentOp2ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glColorFragmentOp2ATI", e); }
    }

    public void ColorFragmentOp3ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMask, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod, @CType("GLuint") int arg2, @CType("GLuint") int arg2Rep, @CType("GLuint") int arg2Mod, @CType("GLuint") int arg3, @CType("GLuint") int arg3Rep, @CType("GLuint") int arg3Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glColorFragmentOp3ATI))
            MH_glColorFragmentOp3ATI.invokeExact(PFN_glColorFragmentOp3ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glColorFragmentOp3ATI", e); }
    }

    public void AlphaFragmentOp1ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glAlphaFragmentOp1ATI))
            MH_glAlphaFragmentOp1ATI.invokeExact(PFN_glAlphaFragmentOp1ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaFragmentOp1ATI", e); }
    }

    public void AlphaFragmentOp2ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod, @CType("GLuint") int arg2, @CType("GLuint") int arg2Rep, @CType("GLuint") int arg2Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glAlphaFragmentOp2ATI))
            MH_glAlphaFragmentOp2ATI.invokeExact(PFN_glAlphaFragmentOp2ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaFragmentOp2ATI", e); }
    }

    public void AlphaFragmentOp3ATI(@CType("GLenum") int op, @CType("GLuint") int dst, @CType("GLuint") int dstMod, @CType("GLuint") int arg1, @CType("GLuint") int arg1Rep, @CType("GLuint") int arg1Mod, @CType("GLuint") int arg2, @CType("GLuint") int arg2Rep, @CType("GLuint") int arg2Mod, @CType("GLuint") int arg3, @CType("GLuint") int arg3Rep, @CType("GLuint") int arg3Mod) {
        try { if (!Unmarshal.isNullPointer(PFN_glAlphaFragmentOp3ATI))
            MH_glAlphaFragmentOp3ATI.invokeExact(PFN_glAlphaFragmentOp3ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod);
        }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaFragmentOp3ATI", e); }
    }

    public void SetFragmentShaderConstantATI(@CType("GLuint") int dst, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glSetFragmentShaderConstantATI))
            MH_glSetFragmentShaderConstantATI.invokeExact(PFN_glSetFragmentShaderConstantATI, dst, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSetFragmentShaderConstantATI", e); }
    }

}
