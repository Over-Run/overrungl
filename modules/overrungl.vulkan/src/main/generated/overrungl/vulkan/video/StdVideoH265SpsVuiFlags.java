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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265SpsVuiFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265SpsVuiFlags {
///     uint32_t aspect_ratio_info_present_flag : 1;
///     uint32_t overscan_info_present_flag : 1;
///     uint32_t overscan_appropriate_flag : 1;
///     uint32_t video_signal_type_present_flag : 1;
///     uint32_t video_full_range_flag : 1;
///     uint32_t colour_description_present_flag : 1;
///     uint32_t chroma_loc_info_present_flag : 1;
///     uint32_t neutral_chroma_indication_flag : 1;
///     uint32_t field_seq_flag : 1;
///     uint32_t frame_field_info_present_flag : 1;
///     uint32_t default_display_window_flag : 1;
///     uint32_t vui_timing_info_present_flag : 1;
///     uint32_t vui_poc_proportional_to_timing_flag : 1;
///     uint32_t vui_hrd_parameters_present_flag : 1;
///     uint32_t bitstream_restriction_flag : 1;
///     uint32_t tiles_fixed_structure_flag : 1;
///     uint32_t motion_vectors_over_pic_boundaries_flag : 1;
///     uint32_t restricted_ref_pic_lists_flag : 1;
/// };
/// ```
public final class StdVideoH265SpsVuiFlags extends GroupType {
    /// The struct layout of `StdVideoH265SpsVuiFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("aspect_ratio_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("overscan_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("overscan_appropriate_flag"), 1,
        ValueLayout.JAVA_INT.withName("video_signal_type_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("video_full_range_flag"), 1,
        ValueLayout.JAVA_INT.withName("colour_description_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("chroma_loc_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("neutral_chroma_indication_flag"), 1,
        ValueLayout.JAVA_INT.withName("field_seq_flag"), 1,
        ValueLayout.JAVA_INT.withName("frame_field_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("default_display_window_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_timing_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_poc_proportional_to_timing_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("bitstream_restriction_flag"), 1,
        ValueLayout.JAVA_INT.withName("tiles_fixed_structure_flag"), 1,
        ValueLayout.JAVA_INT.withName("motion_vectors_over_pic_boundaries_flag"), 1,
        ValueLayout.JAVA_INT.withName("restricted_ref_pic_lists_flag"), 1
    );

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265SpsVuiFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265SpsVuiFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SpsVuiFlags`
    public static StdVideoH265SpsVuiFlags alloc(SegmentAllocator allocator) { return new StdVideoH265SpsVuiFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265SpsVuiFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SpsVuiFlags`
    public static StdVideoH265SpsVuiFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SpsVuiFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SpsVuiFlags copyFrom(StdVideoH265SpsVuiFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265SpsVuiFlags reinterpret(long count) { return new StdVideoH265SpsVuiFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265SpsVuiFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265SpsVuiFlags`
    public StdVideoH265SpsVuiFlags asSlice(long index) { return new StdVideoH265SpsVuiFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265SpsVuiFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265SpsVuiFlags`
    public StdVideoH265SpsVuiFlags asSlice(long index, long count) { return new StdVideoH265SpsVuiFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265SpsVuiFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265SpsVuiFlags at(long index, Consumer<StdVideoH265SpsVuiFlags> func) { func.accept(asSlice(index)); return this; }

}
