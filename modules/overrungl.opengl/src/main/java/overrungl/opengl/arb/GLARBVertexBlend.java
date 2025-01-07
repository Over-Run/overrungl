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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBVertexBlend {
    public static final int GL_MAX_VERTEX_UNITS_ARB = 0x86A4;
    public static final int GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;
    public static final int GL_WEIGHT_SUM_UNITY_ARB = 0x86A6;
    public static final int GL_VERTEX_BLEND_ARB = 0x86A7;
    public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;
    public static final int GL_WEIGHT_ARRAY_TYPE_ARB = 0x86A9;
    public static final int GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA;
    public static final int GL_WEIGHT_ARRAY_SIZE_ARB = 0x86AB;
    public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;
    public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;
    public static final int GL_MODELVIEW0_ARB = 0x1700;
    public static final int GL_MODELVIEW1_ARB = 0x850A;
    public static final int GL_MODELVIEW2_ARB = 0x8722;
    public static final int GL_MODELVIEW3_ARB = 0x8723;
    public static final int GL_MODELVIEW4_ARB = 0x8724;
    public static final int GL_MODELVIEW5_ARB = 0x8725;
    public static final int GL_MODELVIEW6_ARB = 0x8726;
    public static final int GL_MODELVIEW7_ARB = 0x8727;
    public static final int GL_MODELVIEW8_ARB = 0x8728;
    public static final int GL_MODELVIEW9_ARB = 0x8729;
    public static final int GL_MODELVIEW10_ARB = 0x872A;
    public static final int GL_MODELVIEW11_ARB = 0x872B;
    public static final int GL_MODELVIEW12_ARB = 0x872C;
    public static final int GL_MODELVIEW13_ARB = 0x872D;
    public static final int GL_MODELVIEW14_ARB = 0x872E;
    public static final int GL_MODELVIEW15_ARB = 0x872F;
    public static final int GL_MODELVIEW16_ARB = 0x8730;
    public static final int GL_MODELVIEW17_ARB = 0x8731;
    public static final int GL_MODELVIEW18_ARB = 0x8732;
    public static final int GL_MODELVIEW19_ARB = 0x8733;
    public static final int GL_MODELVIEW20_ARB = 0x8734;
    public static final int GL_MODELVIEW21_ARB = 0x8735;
    public static final int GL_MODELVIEW22_ARB = 0x8736;
    public static final int GL_MODELVIEW23_ARB = 0x8737;
    public static final int GL_MODELVIEW24_ARB = 0x8738;
    public static final int GL_MODELVIEW25_ARB = 0x8739;
    public static final int GL_MODELVIEW26_ARB = 0x873A;
    public static final int GL_MODELVIEW27_ARB = 0x873B;
    public static final int GL_MODELVIEW28_ARB = 0x873C;
    public static final int GL_MODELVIEW29_ARB = 0x873D;
    public static final int GL_MODELVIEW30_ARB = 0x873E;
    public static final int GL_MODELVIEW31_ARB = 0x873F;
    public static final MethodHandle MH_glWeightbvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightbvARB;
    public static final MethodHandle MH_glWeightsvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightsvARB;
    public static final MethodHandle MH_glWeightivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightivARB;
    public static final MethodHandle MH_glWeightfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightfvARB;
    public static final MethodHandle MH_glWeightdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightdvARB;
    public static final MethodHandle MH_glWeightubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightubvARB;
    public static final MethodHandle MH_glWeightusvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightusvARB;
    public static final MethodHandle MH_glWeightuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightuivARB;
    public static final MethodHandle MH_glWeightPointerARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWeightPointerARB;
    public static final MethodHandle MH_glVertexBlendARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexBlendARB;

    public GLARBVertexBlend(overrungl.opengl.GLLoadFunc func) {
        PFN_glWeightbvARB = func.invoke("glWeightbvARB");
        PFN_glWeightsvARB = func.invoke("glWeightsvARB");
        PFN_glWeightivARB = func.invoke("glWeightivARB");
        PFN_glWeightfvARB = func.invoke("glWeightfvARB");
        PFN_glWeightdvARB = func.invoke("glWeightdvARB");
        PFN_glWeightubvARB = func.invoke("glWeightubvARB");
        PFN_glWeightusvARB = func.invoke("glWeightusvARB");
        PFN_glWeightuivARB = func.invoke("glWeightuivARB");
        PFN_glWeightPointerARB = func.invoke("glWeightPointerARB");
        PFN_glVertexBlendARB = func.invoke("glVertexBlendARB");
    }

    public void WeightbvARB(@CType("GLint") int size, @CType("const GLbyte *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightbvARB)) { try {
            MH_glWeightbvARB.invokeExact(PFN_glWeightbvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightbvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightbvARB"); }
    }

    public void WeightsvARB(@CType("GLint") int size, @CType("const GLshort *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightsvARB)) { try {
            MH_glWeightsvARB.invokeExact(PFN_glWeightsvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightsvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightsvARB"); }
    }

    public void WeightivARB(@CType("GLint") int size, @CType("const GLint *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightivARB)) { try {
            MH_glWeightivARB.invokeExact(PFN_glWeightivARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightivARB"); }
    }

    public void WeightfvARB(@CType("GLint") int size, @CType("const GLfloat *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightfvARB)) { try {
            MH_glWeightfvARB.invokeExact(PFN_glWeightfvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightfvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightfvARB"); }
    }

    public void WeightdvARB(@CType("GLint") int size, @CType("const GLdouble *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightdvARB)) { try {
            MH_glWeightdvARB.invokeExact(PFN_glWeightdvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightdvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightdvARB"); }
    }

    public void WeightubvARB(@CType("GLint") int size, @CType("const GLubyte *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightubvARB)) { try {
            MH_glWeightubvARB.invokeExact(PFN_glWeightubvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightubvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightubvARB"); }
    }

    public void WeightusvARB(@CType("GLint") int size, @CType("const GLushort *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightusvARB)) { try {
            MH_glWeightusvARB.invokeExact(PFN_glWeightusvARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightusvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightusvARB"); }
    }

    public void WeightuivARB(@CType("GLint") int size, @CType("const GLuint *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glWeightuivARB)) { try {
            MH_glWeightuivARB.invokeExact(PFN_glWeightuivARB, size, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightuivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightuivARB"); }
    }

    public void WeightPointerARB(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glWeightPointerARB)) { try {
            MH_glWeightPointerARB.invokeExact(PFN_glWeightPointerARB, size, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glWeightPointerARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWeightPointerARB"); }
    }

    public void VertexBlendARB(@CType("GLint") int count) {
        if (!Unmarshal.isNullPointer(PFN_glVertexBlendARB)) { try {
            MH_glVertexBlendARB.invokeExact(PFN_glVertexBlendARB, count);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexBlendARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexBlendARB"); }
    }

}
