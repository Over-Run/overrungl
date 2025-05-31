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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
///     uint32_t geometryIndex : 24;
///     uint32_t reserved : 5;
///     uint32_t geometryFlags : 3;
/// };
/// ```
public sealed class VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("geometryIndex"), 24,
        ValueLayout.JAVA_INT.withName("reserved"), 5,
        ValueLayout.JAVA_INT.withName("geometryFlags"), 3
    );

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    /// @param segment the memory segment
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV copyFrom(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV].
    public static final class Buffer extends VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
        private final long elementCount;

        /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV asSlice(long index) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
