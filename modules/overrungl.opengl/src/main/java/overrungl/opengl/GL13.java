/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.opengl;

import overrun.marshal.gen.Entrypoint;
import overrungl.opengl.ext.arb.GLARBTransposeMatrix;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 1.3 functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBTransposeMatrix GL_ARB_transpose_matrix}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL13 extends GL13C permits GLLegacy {
    int CLIENT_ACTIVE_TEXTURE = 0x84E1;
    int MAX_TEXTURE_UNITS = 0x84E2;
    int TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    int TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    int TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    int TRANSPOSE_COLOR_MATRIX = 0x84E6;
    int MULTISAMPLE_BIT = 0x20000000;
    int NORMAL_MAP = 0x8511;
    int REFLECTION_MAP = 0x8512;
    int COMPRESSED_ALPHA = 0x84E9;
    int COMPRESSED_LUMINANCE = 0x84EA;
    int COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    int COMPRESSED_INTENSITY = 0x84EC;
    int COMBINE = 0x8570;
    int COMBINE_RGB = 0x8571;
    int COMBINE_ALPHA = 0x8572;
    int SOURCE0_RGB = 0x8580;
    int SOURCE1_RGB = 0x8581;
    int SOURCE2_RGB = 0x8582;
    int SOURCE0_ALPHA = 0x8588;
    int SOURCE1_ALPHA = 0x8589;
    int SOURCE2_ALPHA = 0x858A;
    int OPERAND0_RGB = 0x8590;
    int OPERAND1_RGB = 0x8591;
    int OPERAND2_RGB = 0x8592;
    int OPERAND0_ALPHA = 0x8598;
    int OPERAND1_ALPHA = 0x8599;
    int OPERAND2_ALPHA = 0x859A;
    int RGB_SCALE = 0x8573;
    int ADD_SIGNED = 0x8574;
    int INTERPOLATE = 0x8575;
    int SUBTRACT = 0x84E7;
    int CONSTANT = 0x8576;
    int PRIMARY_COLOR = 0x8577;
    int PREVIOUS = 0x8578;
    int DOT3_RGB = 0x86AE;
    int DOT3_RGBA = 0x86AF;

    @Entrypoint("glClientActiveTexture")
    default void clientActiveTexture(int texture) {
        throw new ContextException();
    }

    @Entrypoint("glLoadTransposeMatrixd")
    default void loadTransposeMatrixd(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadTransposeMatrixd")
    default void loadTransposeMatrixd(SegmentAllocator allocator, double[] m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadTransposeMatrixf")
    default void loadTransposeMatrixf(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadTransposeMatrixf")
    default void loadTransposeMatrixf(SegmentAllocator allocator, float[] m) {
        throw new ContextException();
    }

    @Entrypoint("glMultTransposeMatrixd")
    default void multTransposeMatrixd(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glMultTransposeMatrixd")
    default void multTransposeMatrixd(SegmentAllocator allocator, double[] m) {
        throw new ContextException();
    }

    @Entrypoint("glMultTransposeMatrixf")
    default void multTransposeMatrixf(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glMultTransposeMatrixf")
    default void multTransposeMatrixf(SegmentAllocator allocator, float[] m) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1d")
    default void multiTexCoord1d(int target, double s) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1dv")
    default void multiTexCoord1dv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1dv")
    default void multiTexCoord1dv(SegmentAllocator allocator, int target, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1f")
    default void multiTexCoord1f(int target, float s) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1fv")
    default void multiTexCoord1fv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1fv")
    default void multiTexCoord1fv(SegmentAllocator allocator, int target, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1i")
    default void multiTexCoord1i(int target, int s) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1iv")
    default void multiTexCoord1iv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1iv")
    default void multiTexCoord1iv(SegmentAllocator allocator, int target, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1s")
    default void multiTexCoord1s(int target, short s) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1sv")
    default void multiTexCoord1sv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord1sv")
    default void multiTexCoord1sv(SegmentAllocator allocator, int target, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2d")
    default void multiTexCoord2d(int target, double s, double t) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2dv")
    default void multiTexCoord2dv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2dv")
    default void multiTexCoord2dv(SegmentAllocator allocator, int target, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2f")
    default void multiTexCoord2f(int target, float s, float t) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2fv")
    default void multiTexCoord2fv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2fv")
    default void multiTexCoord2fv(SegmentAllocator allocator, int target, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2i")
    default void multiTexCoord2i(int target, int s, int t) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2iv")
    default void multiTexCoord2iv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2iv")
    default void multiTexCoord2iv(SegmentAllocator allocator, int target, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2s")
    default void multiTexCoord2s(int target, short s, short t) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2sv")
    default void multiTexCoord2sv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord2sv")
    default void multiTexCoord2sv(SegmentAllocator allocator, int target, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3d")
    default void multiTexCoord3d(int target, double s, double t, double r) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3dv")
    default void multiTexCoord3dv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3dv")
    default void multiTexCoord3dv(SegmentAllocator allocator, int target, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3f")
    default void multiTexCoord3f(int target, float s, float t, float r) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3fv")
    default void multiTexCoord3fv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3fv")
    default void multiTexCoord3fv(SegmentAllocator allocator, int target, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3i")
    default void multiTexCoord3i(int target, int s, int t, int r) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3iv")
    default void multiTexCoord3iv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3iv")
    default void multiTexCoord3iv(SegmentAllocator allocator, int target, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3s")
    default void multiTexCoord3s(int target, short s, short t, short r) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3sv")
    default void multiTexCoord3sv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord3sv")
    default void multiTexCoord3sv(SegmentAllocator allocator, int target, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4d")
    default void multiTexCoord4d(int target, double s, double t, double r, double q) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4dv")
    default void multiTexCoord4dv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4dv")
    default void multiTexCoord4dv(SegmentAllocator allocator, int target, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4f")
    default void multiTexCoord4f(int target, float s, float t, float r, float q) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4fv")
    default void multiTexCoord4fv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4fv")
    default void multiTexCoord4fv(SegmentAllocator allocator, int target, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4i")
    default void multiTexCoord4i(int target, int s, int t, int r, int q) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4iv")
    default void multiTexCoord4iv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4iv")
    default void multiTexCoord4iv(SegmentAllocator allocator, int target, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4s")
    default void multiTexCoord4s(int target, short s, short t, short r, short q) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4sv")
    default void multiTexCoord4sv(int target, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glMultiTexCoord4sv")
    default void multiTexCoord4sv(SegmentAllocator allocator, int target, short[] v) {
        throw new ContextException();
    }
}
