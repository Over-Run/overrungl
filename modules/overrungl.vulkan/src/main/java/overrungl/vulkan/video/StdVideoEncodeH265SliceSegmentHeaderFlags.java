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
/// struct StdVideoEncodeH265SliceSegmentHeaderFlags {
///     uint32_t first_slice_segment_in_pic_flag : 1;
///     uint32_t dependent_slice_segment_flag : 1;
///     uint32_t slice_sao_luma_flag : 1;
///     uint32_t slice_sao_chroma_flag : 1;
///     uint32_t num_ref_idx_active_override_flag : 1;
///     uint32_t mvd_l1_zero_flag : 1;
///     uint32_t cabac_init_flag : 1;
///     uint32_t cu_chroma_qp_offset_enabled_flag : 1;
///     uint32_t deblocking_filter_override_flag : 1;
///     uint32_t slice_deblocking_filter_disabled_flag : 1;
///     uint32_t collocated_from_l0_flag : 1;
///     uint32_t slice_loop_filter_across_slices_enabled_flag : 1;
///     uint32_t reserved : 20;
/// };
/// ```
public sealed class StdVideoEncodeH265SliceSegmentHeaderFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("first_slice_segment_in_pic_flag"), 1,
        ValueLayout.JAVA_INT.withName("dependent_slice_segment_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_sao_luma_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_sao_chroma_flag"), 1,
        ValueLayout.JAVA_INT.withName("num_ref_idx_active_override_flag"), 1,
        ValueLayout.JAVA_INT.withName("mvd_l1_zero_flag"), 1,
        ValueLayout.JAVA_INT.withName("cabac_init_flag"), 1,
        ValueLayout.JAVA_INT.withName("cu_chroma_qp_offset_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("deblocking_filter_override_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_deblocking_filter_disabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("collocated_from_l0_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_loop_filter_across_slices_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 20
    );

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265SliceSegmentHeaderFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags copyFrom(StdVideoEncodeH265SliceSegmentHeaderFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoEncodeH265SliceSegmentHeaderFlags].
    public static final class Buffer extends StdVideoEncodeH265SliceSegmentHeaderFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
        public StdVideoEncodeH265SliceSegmentHeaderFlags asSlice(long index) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
