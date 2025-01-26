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
/// struct StdVideoAV1SequenceHeaderFlags {
///     uint32_t still_picture : 1;
///     uint32_t reduced_still_picture_header : 1;
///     uint32_t use_128x128_superblock : 1;
///     uint32_t enable_filter_intra : 1;
///     uint32_t enable_intra_edge_filter : 1;
///     uint32_t enable_interintra_compound : 1;
///     uint32_t enable_masked_compound : 1;
///     uint32_t enable_warped_motion : 1;
///     uint32_t enable_dual_filter : 1;
///     uint32_t enable_order_hint : 1;
///     uint32_t enable_jnt_comp : 1;
///     uint32_t enable_ref_frame_mvs : 1;
///     uint32_t frame_id_numbers_present_flag : 1;
///     uint32_t enable_superres : 1;
///     uint32_t enable_cdef : 1;
///     uint32_t enable_restoration : 1;
///     uint32_t film_grain_params_present : 1;
///     uint32_t timing_info_present_flag : 1;
///     uint32_t initial_display_delay_present_flag : 1;
///     uint32_t reserved : 13;
/// };
/// ```
public sealed class StdVideoAV1SequenceHeaderFlags extends GroupType {
    /// The struct layout of `StdVideoAV1SequenceHeaderFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("still_picture"), 1,
        ValueLayout.JAVA_INT.withName("reduced_still_picture_header"), 1,
        ValueLayout.JAVA_INT.withName("use_128x128_superblock"), 1,
        ValueLayout.JAVA_INT.withName("enable_filter_intra"), 1,
        ValueLayout.JAVA_INT.withName("enable_intra_edge_filter"), 1,
        ValueLayout.JAVA_INT.withName("enable_interintra_compound"), 1,
        ValueLayout.JAVA_INT.withName("enable_masked_compound"), 1,
        ValueLayout.JAVA_INT.withName("enable_warped_motion"), 1,
        ValueLayout.JAVA_INT.withName("enable_dual_filter"), 1,
        ValueLayout.JAVA_INT.withName("enable_order_hint"), 1,
        ValueLayout.JAVA_INT.withName("enable_jnt_comp"), 1,
        ValueLayout.JAVA_INT.withName("enable_ref_frame_mvs"), 1,
        ValueLayout.JAVA_INT.withName("frame_id_numbers_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("enable_superres"), 1,
        ValueLayout.JAVA_INT.withName("enable_cdef"), 1,
        ValueLayout.JAVA_INT.withName("enable_restoration"), 1,
        ValueLayout.JAVA_INT.withName("film_grain_params_present"), 1,
        ValueLayout.JAVA_INT.withName("timing_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("initial_display_delay_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 13
    );

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1SequenceHeaderFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeaderFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1SequenceHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1SequenceHeaderFlags`
    public static StdVideoAV1SequenceHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1SequenceHeaderFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1SequenceHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1SequenceHeaderFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags copyFrom(StdVideoAV1SequenceHeaderFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoAV1SequenceHeaderFlags].
    public static final class Buffer extends StdVideoAV1SequenceHeaderFlags {
        private final long elementCount;

        /// Creates `StdVideoAV1SequenceHeaderFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1SequenceHeaderFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1SequenceHeaderFlags`
        public StdVideoAV1SequenceHeaderFlags asSlice(long index) { return new StdVideoAV1SequenceHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1SequenceHeaderFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1SequenceHeaderFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
