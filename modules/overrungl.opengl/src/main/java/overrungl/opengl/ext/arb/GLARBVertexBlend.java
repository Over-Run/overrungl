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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_vertex_blend}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_vertex_blend) return;
        ext.glWeightbvARB = load.invoke("glWeightbvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightsvARB = load.invoke("glWeightsvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightivARB = load.invoke("glWeightivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightfvARB = load.invoke("glWeightfvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightdvARB = load.invoke("glWeightdvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightubvARB = load.invoke("glWeightubvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightusvARB = load.invoke("glWeightusvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightuivARB = load.invoke("glWeightuivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glWeightPointerARB = load.invoke("glWeightPointerARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexBlendARB = load.invoke("glVertexBlendARB", ofVoid(JAVA_INT));
    }

    public static void glWeightbvARB(int size, @NativeType("const GLbyte*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightbvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightsvARB(int size, @NativeType("const GLshort*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightsvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightivARB(int size, @NativeType("const GLint*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightivARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightfvARB(int size, @NativeType("const GLfloat*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightfvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightdvARB(int size, @NativeType("const GLdouble*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightdvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightubvARB(int size, @NativeType("const GLubyte*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightubvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightusvARB(int size, @NativeType("const GLushort*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightusvARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightuivARB(int size, @NativeType("const GLuint*") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightuivARB).invokeExact(size, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightPointerARB(int size, int type, int stride, @NativeType("const void*") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightPointerARB).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexBlendARB(int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexBlendARB).invokeExact(count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
