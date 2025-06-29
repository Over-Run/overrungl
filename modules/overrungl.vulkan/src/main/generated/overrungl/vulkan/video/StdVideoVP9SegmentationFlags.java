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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoVP9SegmentationFlags {
///     uint32_t segmentation_update_map : 1;
///     uint32_t segmentation_temporal_update : 1;
///     uint32_t segmentation_update_data : 1;
///     uint32_t segmentation_abs_or_delta_update : 1;
///     uint32_t reserved : 28;
/// };
/// ```
public sealed class StdVideoVP9SegmentationFlags extends GroupType {
    /// The struct layout of `StdVideoVP9SegmentationFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("segmentation_update_map"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_temporal_update"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_update_data"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_abs_or_delta_update"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 28
    );

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoVP9SegmentationFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9SegmentationFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9SegmentationFlags(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9SegmentationFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9SegmentationFlags`
    public static StdVideoVP9SegmentationFlags alloc(SegmentAllocator allocator) { return new StdVideoVP9SegmentationFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoVP9SegmentationFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9SegmentationFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9SegmentationFlags copyFrom(StdVideoVP9SegmentationFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoVP9SegmentationFlags].
    public static final class Buffer extends StdVideoVP9SegmentationFlags {
        private final long elementCount;

        /// Creates `StdVideoVP9SegmentationFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoVP9SegmentationFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoVP9SegmentationFlags`
        public StdVideoVP9SegmentationFlags asSlice(long index) { return new StdVideoVP9SegmentationFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoVP9SegmentationFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoVP9SegmentationFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
