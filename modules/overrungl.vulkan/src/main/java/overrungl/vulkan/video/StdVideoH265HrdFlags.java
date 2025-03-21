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
/// struct StdVideoH265HrdFlags {
///     uint32_t nal_hrd_parameters_present_flag : 1;
///     uint32_t vcl_hrd_parameters_present_flag : 1;
///     uint32_t sub_pic_hrd_params_present_flag : 1;
///     uint32_t sub_pic_cpb_params_in_pic_timing_sei_flag : 1;
///     uint32_t fixed_pic_rate_general_flag : 8;
///     uint32_t fixed_pic_rate_within_cvs_flag : 8;
///     uint32_t low_delay_hrd_flag : 8;
/// };
/// ```
public sealed class StdVideoH265HrdFlags extends GroupType {
    /// The struct layout of `StdVideoH265HrdFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("nal_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vcl_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sub_pic_hrd_params_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sub_pic_cpb_params_in_pic_timing_sei_flag"), 1,
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_general_flag"), 8,
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_within_cvs_flag"), 8,
        ValueLayout.JAVA_INT.withName("low_delay_hrd_flag"), 8
    );

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265HrdFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdFlags`
    public static StdVideoH265HrdFlags alloc(SegmentAllocator allocator) { return new StdVideoH265HrdFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265HrdFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265HrdFlags copyFrom(StdVideoH265HrdFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoH265HrdFlags].
    public static final class Buffer extends StdVideoH265HrdFlags {
        private final long elementCount;

        /// Creates `StdVideoH265HrdFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265HrdFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265HrdFlags`
        public StdVideoH265HrdFlags asSlice(long index) { return new StdVideoH265HrdFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265HrdFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265HrdFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
