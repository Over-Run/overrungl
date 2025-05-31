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
/// struct StdVideoH264SpsFlags {
///     uint32_t constraint_set0_flag : 1;
///     uint32_t constraint_set1_flag : 1;
///     uint32_t constraint_set2_flag : 1;
///     uint32_t constraint_set3_flag : 1;
///     uint32_t constraint_set4_flag : 1;
///     uint32_t constraint_set5_flag : 1;
///     uint32_t direct_8x8_inference_flag : 1;
///     uint32_t mb_adaptive_frame_field_flag : 1;
///     uint32_t frame_mbs_only_flag : 1;
///     uint32_t delta_pic_order_always_zero_flag : 1;
///     uint32_t separate_colour_plane_flag : 1;
///     uint32_t gaps_in_frame_num_value_allowed_flag : 1;
///     uint32_t qpprime_y_zero_transform_bypass_flag : 1;
///     uint32_t frame_cropping_flag : 1;
///     uint32_t seq_scaling_matrix_present_flag : 1;
///     uint32_t vui_parameters_present_flag : 1;
/// };
/// ```
public sealed class StdVideoH264SpsFlags extends GroupType {
    /// The struct layout of `StdVideoH264SpsFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("constraint_set0_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set1_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set2_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set3_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set4_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set5_flag"), 1,
        ValueLayout.JAVA_INT.withName("direct_8x8_inference_flag"), 1,
        ValueLayout.JAVA_INT.withName("mb_adaptive_frame_field_flag"), 1,
        ValueLayout.JAVA_INT.withName("frame_mbs_only_flag"), 1,
        ValueLayout.JAVA_INT.withName("delta_pic_order_always_zero_flag"), 1,
        ValueLayout.JAVA_INT.withName("separate_colour_plane_flag"), 1,
        ValueLayout.JAVA_INT.withName("gaps_in_frame_num_value_allowed_flag"), 1,
        ValueLayout.JAVA_INT.withName("qpprime_y_zero_transform_bypass_flag"), 1,
        ValueLayout.JAVA_INT.withName("frame_cropping_flag"), 1,
        ValueLayout.JAVA_INT.withName("seq_scaling_matrix_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_parameters_present_flag"), 1
    );

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264SpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SpsFlags`
    public static StdVideoH264SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH264SpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SpsFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SpsFlags copyFrom(StdVideoH264SpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoH264SpsFlags].
    public static final class Buffer extends StdVideoH264SpsFlags {
        private final long elementCount;

        /// Creates `StdVideoH264SpsFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH264SpsFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH264SpsFlags`
        public StdVideoH264SpsFlags asSlice(long index) { return new StdVideoH264SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH264SpsFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH264SpsFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
