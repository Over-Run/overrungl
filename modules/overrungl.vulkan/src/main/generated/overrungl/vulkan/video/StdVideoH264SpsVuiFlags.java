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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH264SpsVuiFlags {
///     uint32_t aspect_ratio_info_present_flag : 1;
///     uint32_t overscan_info_present_flag : 1;
///     uint32_t overscan_appropriate_flag : 1;
///     uint32_t video_signal_type_present_flag : 1;
///     uint32_t video_full_range_flag : 1;
///     uint32_t color_description_present_flag : 1;
///     uint32_t chroma_loc_info_present_flag : 1;
///     uint32_t timing_info_present_flag : 1;
///     uint32_t fixed_frame_rate_flag : 1;
///     uint32_t bitstream_restriction_flag : 1;
///     uint32_t nal_hrd_parameters_present_flag : 1;
///     uint32_t vcl_hrd_parameters_present_flag : 1;
/// };
/// ```
public final class StdVideoH264SpsVuiFlags extends GroupType {
    /// The struct layout of `StdVideoH264SpsVuiFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("aspect_ratio_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("overscan_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("overscan_appropriate_flag"), 1,
        ValueLayout.JAVA_INT.withName("video_signal_type_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("video_full_range_flag"), 1,
        ValueLayout.JAVA_INT.withName("color_description_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("chroma_loc_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("timing_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("fixed_frame_rate_flag"), 1,
        ValueLayout.JAVA_INT.withName("bitstream_restriction_flag"), 1,
        ValueLayout.JAVA_INT.withName("nal_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vcl_hrd_parameters_present_flag"), 1
    );

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264SpsVuiFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264SpsVuiFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SpsVuiFlags`
    public static StdVideoH264SpsVuiFlags alloc(SegmentAllocator allocator) { return new StdVideoH264SpsVuiFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264SpsVuiFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SpsVuiFlags`
    public static StdVideoH264SpsVuiFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SpsVuiFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SpsVuiFlags copyFrom(StdVideoH264SpsVuiFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264SpsVuiFlags reinterpret(long count) { return new StdVideoH264SpsVuiFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH264SpsVuiFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264SpsVuiFlags`
    public StdVideoH264SpsVuiFlags asSlice(long index) { return new StdVideoH264SpsVuiFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264SpsVuiFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264SpsVuiFlags`
    public StdVideoH264SpsVuiFlags asSlice(long index, long count) { return new StdVideoH264SpsVuiFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264SpsVuiFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264SpsVuiFlags at(long index, Consumer<StdVideoH264SpsVuiFlags> func) { func.accept(asSlice(index)); return this; }

}
