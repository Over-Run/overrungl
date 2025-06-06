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
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTransformMatrixKHR {
///     float matrix[3][4];
/// };
/// ```
public sealed class VkTransformMatrixKHR extends GroupType {
    /// The struct layout of `VkTransformMatrixKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_FLOAT)).withName("matrix")
    );
    /// The byte offset of `matrix`.
    public static final long OFFSET_matrix = LAYOUT.byteOffset(PathElement.groupElement("matrix"));
    /// The memory layout of `matrix`.
    public static final MemoryLayout LAYOUT_matrix = LAYOUT.select(PathElement.groupElement("matrix"));
    /// The [VarHandle] of `matrix` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_matrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    public VkTransformMatrixKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR alloc(SegmentAllocator allocator) { return new VkTransformMatrixKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTransformMatrixKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param matrix `matrix`
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR allocInit(SegmentAllocator allocator, MemorySegment matrix) {
        return alloc(allocator).matrix(matrix);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTransformMatrixKHR copyFrom(VkTransformMatrixKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `matrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment matrix(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_matrix, index), LAYOUT_matrix); }
    /// {@return `matrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static float matrix(MemorySegment segment, long index, long index0, long index1) { return (float) VH_matrix.get(segment, 0L, index, index0, index1); }
    /// {@return `matrix`}
    public MemorySegment matrix() { return matrix(this.segment(), 0L); }
    /// {@return `matrix`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public float matrix(long index0, long index1) { return matrix(this.segment(), 0L, index0, index1); }
    /// Sets `matrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matrix(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_matrix, index), LAYOUT_matrix.byteSize()); }
    /// Sets `matrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void matrix(MemorySegment segment, long index, long index0, long index1, float value) { VH_matrix.set(segment, 0L, index, index0, index1, value); }
    /// Sets `matrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTransformMatrixKHR matrix(MemorySegment value) { matrix(this.segment(), 0L, value); return this; }
    /// Sets `matrix` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public VkTransformMatrixKHR matrix(long index0, long index1, float value) { matrix(this.segment(), 0L, index0, index1, value); return this; }

    /// A buffer of [VkTransformMatrixKHR].
    public static final class Buffer extends VkTransformMatrixKHR {
        private final long elementCount;

        /// Creates `VkTransformMatrixKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkTransformMatrixKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkTransformMatrixKHR`
        public VkTransformMatrixKHR asSlice(long index) { return new VkTransformMatrixKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkTransformMatrixKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkTransformMatrixKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `matrix` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment matrixAt(long index) { return matrix(this.segment(), index); }
        /// {@return `matrix` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public float matrixAt(long index, long index0, long index1) { return matrix(this.segment(), index, index0, index1); }
        /// Sets `matrix` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer matrixAt(long index, MemorySegment value) { matrix(this.segment(), index, value); return this; }
        /// Sets `matrix` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer matrixAt(long index, long index0, long index1, float value) { matrix(this.segment(), index, index0, index1, value); return this; }

    }
}
