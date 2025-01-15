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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### matrix
/// [Byte offset][#OFFSET_matrix] - [Memory layout][#ML_matrix] - [Getter][#matrix()] - [Setter][#matrix(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTransformMatrixKHR {
///     float[3] matrix;
/// } VkTransformMatrixKHR;
/// ```
public sealed class VkTransformMatrixKHR extends Struct {
    /// The struct layout of `VkTransformMatrixKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_FLOAT).withName("matrix")
    );
    /// The byte offset of `matrix`.
    public static final long OFFSET_matrix = LAYOUT.byteOffset(PathElement.groupElement("matrix"));
    /// The memory layout of `matrix`.
    public static final MemoryLayout ML_matrix = LAYOUT.select(PathElement.groupElement("matrix"));

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    public VkTransformMatrixKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR alloc(SegmentAllocator allocator) { return new VkTransformMatrixKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTransformMatrixKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR allocInit(SegmentAllocator allocator, @CType("float[3]") java.lang.foreign.MemorySegment matrix) { return alloc(allocator).matrix(matrix); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTransformMatrixKHR copyFrom(VkTransformMatrixKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `matrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[3]") java.lang.foreign.MemorySegment get_matrix(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_matrix, index), ML_matrix); }
    /// {@return `matrix`}
    /// @param segment the segment of the struct
    public static @CType("float[3]") java.lang.foreign.MemorySegment get_matrix(MemorySegment segment) { return VkTransformMatrixKHR.get_matrix(segment, 0L); }
    /// {@return `matrix`}
    public @CType("float[3]") java.lang.foreign.MemorySegment matrix() { return VkTransformMatrixKHR.get_matrix(this.segment()); }
    /// Sets `matrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matrix(MemorySegment segment, long index, @CType("float[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_matrix, index), ML_matrix.byteSize()); }
    /// Sets `matrix` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matrix(MemorySegment segment, @CType("float[3]") java.lang.foreign.MemorySegment value) { VkTransformMatrixKHR.set_matrix(segment, 0L, value); }
    /// Sets `matrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTransformMatrixKHR matrix(@CType("float[3]") java.lang.foreign.MemorySegment value) { VkTransformMatrixKHR.set_matrix(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("float[3]") java.lang.foreign.MemorySegment matrixAt(long index) { return VkTransformMatrixKHR.get_matrix(this.segment(), index); }
        /// Sets `matrix` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer matrixAt(long index, @CType("float[3]") java.lang.foreign.MemorySegment value) { VkTransformMatrixKHR.set_matrix(this.segment(), index, value); return this; }

    }
}
