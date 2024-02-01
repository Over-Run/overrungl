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

package overrungl.joml;

import org.joml.*;
import overrun.marshal.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

/**
 * The matrix-to-native-memory util.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Matrixn {
    /**
     * The {@code Matrix2f} layout.
     */
    public static final SequenceLayout MAT2F = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
    /**
     * The {@code Matrix2d} layout.
     */
    public static final SequenceLayout MAT2D = MemoryLayout.sequenceLayout(4, JAVA_DOUBLE);
    /**
     * The {@code Matrix3x2f} layout.
     */
    public static final SequenceLayout MAT3X2F = MemoryLayout.sequenceLayout(6, JAVA_FLOAT);
    /**
     * The {@code Matrix3x2d} layout.
     */
    public static final SequenceLayout MAT3X2D = MemoryLayout.sequenceLayout(6, JAVA_DOUBLE);
    /**
     * The {@code Matrix3f} layout.
     */
    public static final SequenceLayout MAT3F = MemoryLayout.sequenceLayout(9, JAVA_FLOAT);
    /**
     * The {@code Matrix3d} layout.
     */
    public static final SequenceLayout MAT3D = MemoryLayout.sequenceLayout(9, JAVA_DOUBLE);
    /**
     * The {@code Matrix4x3f} layout.
     */
    public static final SequenceLayout MAT4X3F = MemoryLayout.sequenceLayout(12, JAVA_FLOAT);
    /**
     * The {@code Matrix4x3d} layout.
     */
    public static final SequenceLayout MAT4X3D = MemoryLayout.sequenceLayout(12, JAVA_DOUBLE);
    /**
     * The {@code Matrix4f} layout.
     */
    public static final SequenceLayout MAT4F = MemoryLayout.sequenceLayout(16, JAVA_FLOAT);
    /**
     * The {@code Matrix4d} layout.
     */
    public static final SequenceLayout MAT4D = MemoryLayout.sequenceLayout(16, JAVA_DOUBLE);

    private Matrixn() {
        //no instance
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix2fc mat) {
        return put(mat, allocator.allocate(MAT2F));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix2dc mat) {
        return put(mat, allocator.allocate(MAT2D));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix3x2fc mat) {
        return put(mat, allocator.allocate(MAT3X2F));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix3x2dc mat) {
        return put(mat, allocator.allocate(MAT3X2D));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix3fc mat) {
        return put(mat, allocator.allocate(MAT3F));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix3dc mat) {
        return put(mat, allocator.allocate(MAT3D));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix4x3fc mat) {
        return put(mat, allocator.allocate(MAT4X3F));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix4x3dc mat) {
        return put(mat, allocator.allocate(MAT4X3D));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix4fc mat) {
        return put(mat, allocator.allocate(MAT4F));
    }

    /**
     * Allocates the matrix.
     *
     * @param allocator the segment allocator.
     * @param mat       the matrix.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Matrix4dc mat) {
        return put(mat, allocator.allocate(MAT4D));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix2fc mat) {
        return put(mat, MemoryUtil.malloc(MAT2F));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix2dc mat) {
        return put(mat, MemoryUtil.malloc(MAT2D));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix3x2fc mat) {
        return put(mat, MemoryUtil.malloc(MAT3X2F));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix3x2dc mat) {
        return put(mat, MemoryUtil.malloc(MAT3X2D));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix3fc mat) {
        return put(mat, MemoryUtil.malloc(MAT3F));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix3dc mat) {
        return put(mat, MemoryUtil.malloc(MAT3D));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix4x3fc mat) {
        return put(mat, MemoryUtil.malloc(MAT4X3F));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix4x3dc mat) {
        return put(mat, MemoryUtil.malloc(MAT4X3D));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix4fc mat) {
        return put(mat, MemoryUtil.malloc(MAT4F));
    }

    /**
     * Allocates the matrix by C memory function.
     *
     * @param mat the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(Matrix4dc mat) {
        return put(mat, MemoryUtil.malloc(MAT4D));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix2fc mat) {
        return put(mat, stack.malloc(MAT2F));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix2dc mat) {
        return put(mat, stack.malloc(MAT2D));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix3x2fc mat) {
        return put(mat, stack.malloc(MAT3X2F));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix3x2dc mat) {
        return put(mat, stack.malloc(MAT3X2D));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix3fc mat) {
        return put(mat, stack.malloc(MAT3F));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix3dc mat) {
        return put(mat, stack.malloc(MAT3D));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix4x3fc mat) {
        return put(mat, stack.malloc(MAT4X3F));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix4x3dc mat) {
        return put(mat, stack.malloc(MAT4X3D));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix4fc mat) {
        return put(mat, stack.malloc(MAT4F));
    }

    /**
     * Allocates the matrix on stack.
     *
     * @param stack the memory stack
     * @param mat   the matrix
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Matrix4dc mat) {
        return put(mat, stack.malloc(MAT4D));
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix2fc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, mat.m00());
        dest.set(JAVA_FLOAT, offset + 4, mat.m01());
        dest.set(JAVA_FLOAT, offset + 8, mat.m10());
        dest.set(JAVA_FLOAT, offset + 12, mat.m11());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix2dc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, mat.m00());
        dest.set(JAVA_DOUBLE, offset + 8, mat.m01());
        dest.set(JAVA_DOUBLE, offset + 16, mat.m10());
        dest.set(JAVA_DOUBLE, offset + 24, mat.m11());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3x2fc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, mat.m00());
        dest.set(JAVA_FLOAT, offset + 4, mat.m01());
        dest.set(JAVA_FLOAT, offset + 8, mat.m10());
        dest.set(JAVA_FLOAT, offset + 12, mat.m11());
        dest.set(JAVA_FLOAT, offset + 16, mat.m20());
        dest.set(JAVA_FLOAT, offset + 20, mat.m21());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3x2dc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, mat.m00());
        dest.set(JAVA_DOUBLE, offset + 8, mat.m01());
        dest.set(JAVA_DOUBLE, offset + 16, mat.m10());
        dest.set(JAVA_DOUBLE, offset + 24, mat.m11());
        dest.set(JAVA_DOUBLE, offset + 32, mat.m20());
        dest.set(JAVA_DOUBLE, offset + 40, mat.m21());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3fc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, mat.m00());
        dest.set(JAVA_FLOAT, offset + 4, mat.m01());
        dest.set(JAVA_FLOAT, offset + 8, mat.m02());
        dest.set(JAVA_FLOAT, offset + 12, mat.m10());
        dest.set(JAVA_FLOAT, offset + 16, mat.m11());
        dest.set(JAVA_FLOAT, offset + 20, mat.m12());
        dest.set(JAVA_FLOAT, offset + 24, mat.m20());
        dest.set(JAVA_FLOAT, offset + 28, mat.m21());
        dest.set(JAVA_FLOAT, offset + 32, mat.m22());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3dc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, mat.m00());
        dest.set(JAVA_DOUBLE, offset + 8, mat.m01());
        dest.set(JAVA_DOUBLE, offset + 16, mat.m02());
        dest.set(JAVA_DOUBLE, offset + 24, mat.m10());
        dest.set(JAVA_DOUBLE, offset + 32, mat.m11());
        dest.set(JAVA_DOUBLE, offset + 40, mat.m12());
        dest.set(JAVA_DOUBLE, offset + 48, mat.m20());
        dest.set(JAVA_DOUBLE, offset + 56, mat.m21());
        dest.set(JAVA_DOUBLE, offset + 64, mat.m22());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4x3fc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, mat.m00());
        dest.set(JAVA_FLOAT, offset + 4, mat.m01());
        dest.set(JAVA_FLOAT, offset + 8, mat.m02());
        dest.set(JAVA_FLOAT, offset + 12, mat.m10());
        dest.set(JAVA_FLOAT, offset + 16, mat.m11());
        dest.set(JAVA_FLOAT, offset + 20, mat.m12());
        dest.set(JAVA_FLOAT, offset + 24, mat.m20());
        dest.set(JAVA_FLOAT, offset + 28, mat.m21());
        dest.set(JAVA_FLOAT, offset + 32, mat.m22());
        dest.set(JAVA_FLOAT, offset + 36, mat.m30());
        dest.set(JAVA_FLOAT, offset + 40, mat.m31());
        dest.set(JAVA_FLOAT, offset + 44, mat.m32());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4x3dc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, mat.m00());
        dest.set(JAVA_DOUBLE, offset + 8, mat.m01());
        dest.set(JAVA_DOUBLE, offset + 16, mat.m02());
        dest.set(JAVA_DOUBLE, offset + 24, mat.m10());
        dest.set(JAVA_DOUBLE, offset + 32, mat.m11());
        dest.set(JAVA_DOUBLE, offset + 40, mat.m12());
        dest.set(JAVA_DOUBLE, offset + 48, mat.m20());
        dest.set(JAVA_DOUBLE, offset + 56, mat.m21());
        dest.set(JAVA_DOUBLE, offset + 64, mat.m22());
        dest.set(JAVA_DOUBLE, offset + 72, mat.m30());
        dest.set(JAVA_DOUBLE, offset + 80, mat.m31());
        dest.set(JAVA_DOUBLE, offset + 88, mat.m32());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4fc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, mat.m00());
        dest.set(JAVA_FLOAT, offset + 4, mat.m01());
        dest.set(JAVA_FLOAT, offset + 8, mat.m02());
        dest.set(JAVA_FLOAT, offset + 12, mat.m03());
        dest.set(JAVA_FLOAT, offset + 16, mat.m10());
        dest.set(JAVA_FLOAT, offset + 20, mat.m11());
        dest.set(JAVA_FLOAT, offset + 24, mat.m12());
        dest.set(JAVA_FLOAT, offset + 28, mat.m13());
        dest.set(JAVA_FLOAT, offset + 32, mat.m20());
        dest.set(JAVA_FLOAT, offset + 36, mat.m21());
        dest.set(JAVA_FLOAT, offset + 40, mat.m22());
        dest.set(JAVA_FLOAT, offset + 44, mat.m23());
        dest.set(JAVA_FLOAT, offset + 48, mat.m30());
        dest.set(JAVA_FLOAT, offset + 52, mat.m31());
        dest.set(JAVA_FLOAT, offset + 56, mat.m32());
        dest.set(JAVA_FLOAT, offset + 60, mat.m33());
        return dest;
    }

    /**
     * Puts the matrix at the given offset.
     *
     * @param mat    the matrix
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4dc mat, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, mat.m00());
        dest.set(JAVA_DOUBLE, offset + 8, mat.m01());
        dest.set(JAVA_DOUBLE, offset + 16, mat.m02());
        dest.set(JAVA_DOUBLE, offset + 24, mat.m03());
        dest.set(JAVA_DOUBLE, offset + 32, mat.m10());
        dest.set(JAVA_DOUBLE, offset + 40, mat.m11());
        dest.set(JAVA_DOUBLE, offset + 48, mat.m12());
        dest.set(JAVA_DOUBLE, offset + 56, mat.m13());
        dest.set(JAVA_DOUBLE, offset + 64, mat.m20());
        dest.set(JAVA_DOUBLE, offset + 72, mat.m21());
        dest.set(JAVA_DOUBLE, offset + 80, mat.m22());
        dest.set(JAVA_DOUBLE, offset + 88, mat.m23());
        dest.set(JAVA_DOUBLE, offset + 96, mat.m30());
        dest.set(JAVA_DOUBLE, offset + 104, mat.m31());
        dest.set(JAVA_DOUBLE, offset + 112, mat.m32());
        dest.set(JAVA_DOUBLE, offset + 120, mat.m33());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix2fc mat, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, mat.m00());
        dest.set(JAVA_FLOAT, 4, mat.m01());
        dest.set(JAVA_FLOAT, 8, mat.m10());
        dest.set(JAVA_FLOAT, 12, mat.m11());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix2dc mat, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, mat.m00());
        dest.set(JAVA_DOUBLE, 8, mat.m01());
        dest.set(JAVA_DOUBLE, 16, mat.m10());
        dest.set(JAVA_DOUBLE, 24, mat.m11());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3x2fc mat, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, mat.m00());
        dest.set(JAVA_FLOAT, 4, mat.m01());
        dest.set(JAVA_FLOAT, 8, mat.m10());
        dest.set(JAVA_FLOAT, 12, mat.m11());
        dest.set(JAVA_FLOAT, 16, mat.m20());
        dest.set(JAVA_FLOAT, 20, mat.m21());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3x2dc mat, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, mat.m00());
        dest.set(JAVA_DOUBLE, 8, mat.m01());
        dest.set(JAVA_DOUBLE, 16, mat.m10());
        dest.set(JAVA_DOUBLE, 24, mat.m11());
        dest.set(JAVA_DOUBLE, 32, mat.m20());
        dest.set(JAVA_DOUBLE, 40, mat.m21());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3fc mat, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, mat.m00());
        dest.set(JAVA_FLOAT, 4, mat.m01());
        dest.set(JAVA_FLOAT, 8, mat.m02());
        dest.set(JAVA_FLOAT, 12, mat.m10());
        dest.set(JAVA_FLOAT, 16, mat.m11());
        dest.set(JAVA_FLOAT, 20, mat.m12());
        dest.set(JAVA_FLOAT, 24, mat.m20());
        dest.set(JAVA_FLOAT, 28, mat.m21());
        dest.set(JAVA_FLOAT, 32, mat.m22());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix3dc mat, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, mat.m00());
        dest.set(JAVA_DOUBLE, 8, mat.m01());
        dest.set(JAVA_DOUBLE, 16, mat.m02());
        dest.set(JAVA_DOUBLE, 24, mat.m10());
        dest.set(JAVA_DOUBLE, 32, mat.m11());
        dest.set(JAVA_DOUBLE, 40, mat.m12());
        dest.set(JAVA_DOUBLE, 48, mat.m20());
        dest.set(JAVA_DOUBLE, 56, mat.m21());
        dest.set(JAVA_DOUBLE, 64, mat.m22());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4x3fc mat, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, mat.m00());
        dest.set(JAVA_FLOAT, 4, mat.m01());
        dest.set(JAVA_FLOAT, 8, mat.m02());
        dest.set(JAVA_FLOAT, 12, mat.m10());
        dest.set(JAVA_FLOAT, 16, mat.m11());
        dest.set(JAVA_FLOAT, 20, mat.m12());
        dest.set(JAVA_FLOAT, 24, mat.m20());
        dest.set(JAVA_FLOAT, 28, mat.m21());
        dest.set(JAVA_FLOAT, 32, mat.m22());
        dest.set(JAVA_FLOAT, 36, mat.m30());
        dest.set(JAVA_FLOAT, 40, mat.m31());
        dest.set(JAVA_FLOAT, 44, mat.m32());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4x3dc mat, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, mat.m00());
        dest.set(JAVA_DOUBLE, 8, mat.m01());
        dest.set(JAVA_DOUBLE, 16, mat.m02());
        dest.set(JAVA_DOUBLE, 24, mat.m10());
        dest.set(JAVA_DOUBLE, 32, mat.m11());
        dest.set(JAVA_DOUBLE, 40, mat.m12());
        dest.set(JAVA_DOUBLE, 48, mat.m20());
        dest.set(JAVA_DOUBLE, 56, mat.m21());
        dest.set(JAVA_DOUBLE, 64, mat.m22());
        dest.set(JAVA_DOUBLE, 72, mat.m30());
        dest.set(JAVA_DOUBLE, 80, mat.m31());
        dest.set(JAVA_DOUBLE, 88, mat.m32());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4fc mat, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, mat.m00());
        dest.set(JAVA_FLOAT, 4, mat.m01());
        dest.set(JAVA_FLOAT, 8, mat.m02());
        dest.set(JAVA_FLOAT, 12, mat.m03());
        dest.set(JAVA_FLOAT, 16, mat.m10());
        dest.set(JAVA_FLOAT, 20, mat.m11());
        dest.set(JAVA_FLOAT, 24, mat.m12());
        dest.set(JAVA_FLOAT, 28, mat.m13());
        dest.set(JAVA_FLOAT, 32, mat.m20());
        dest.set(JAVA_FLOAT, 36, mat.m21());
        dest.set(JAVA_FLOAT, 40, mat.m22());
        dest.set(JAVA_FLOAT, 44, mat.m23());
        dest.set(JAVA_FLOAT, 48, mat.m30());
        dest.set(JAVA_FLOAT, 52, mat.m31());
        dest.set(JAVA_FLOAT, 56, mat.m32());
        dest.set(JAVA_FLOAT, 60, mat.m33());
        return dest;
    }

    /**
     * Puts the matrix.
     *
     * @param mat  the matrix
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Matrix4dc mat, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, mat.m00());
        dest.set(JAVA_DOUBLE, 8, mat.m01());
        dest.set(JAVA_DOUBLE, 16, mat.m02());
        dest.set(JAVA_DOUBLE, 24, mat.m03());
        dest.set(JAVA_DOUBLE, 32, mat.m10());
        dest.set(JAVA_DOUBLE, 40, mat.m11());
        dest.set(JAVA_DOUBLE, 48, mat.m12());
        dest.set(JAVA_DOUBLE, 56, mat.m13());
        dest.set(JAVA_DOUBLE, 64, mat.m20());
        dest.set(JAVA_DOUBLE, 72, mat.m21());
        dest.set(JAVA_DOUBLE, 80, mat.m22());
        dest.set(JAVA_DOUBLE, 88, mat.m23());
        dest.set(JAVA_DOUBLE, 96, mat.m30());
        dest.set(JAVA_DOUBLE, 104, mat.m31());
        dest.set(JAVA_DOUBLE, 112, mat.m32());
        dest.set(JAVA_DOUBLE, 120, mat.m33());
        return dest;
    }
}
