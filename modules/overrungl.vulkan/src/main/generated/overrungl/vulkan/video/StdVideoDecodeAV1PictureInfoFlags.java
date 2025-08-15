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

/// Represents `StdVideoDecodeAV1PictureInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoDecodeAV1PictureInfoFlags {
///     uint32_t error_resilient_mode : 1;
///     uint32_t disable_cdf_update : 1;
///     uint32_t use_superres : 1;
///     uint32_t render_and_frame_size_different : 1;
///     uint32_t allow_screen_content_tools : 1;
///     uint32_t is_filter_switchable : 1;
///     uint32_t force_integer_mv : 1;
///     uint32_t frame_size_override_flag : 1;
///     uint32_t buffer_removal_time_present_flag : 1;
///     uint32_t allow_intrabc : 1;
///     uint32_t frame_refs_short_signaling : 1;
///     uint32_t allow_high_precision_mv : 1;
///     uint32_t is_motion_mode_switchable : 1;
///     uint32_t use_ref_frame_mvs : 1;
///     uint32_t disable_frame_end_update_cdf : 1;
///     uint32_t allow_warped_motion : 1;
///     uint32_t reduced_tx_set : 1;
///     uint32_t reference_select : 1;
///     uint32_t skip_mode_present : 1;
///     uint32_t delta_q_present : 1;
///     uint32_t delta_lf_present : 1;
///     uint32_t delta_lf_multi : 1;
///     uint32_t segmentation_enabled : 1;
///     uint32_t segmentation_update_map : 1;
///     uint32_t segmentation_temporal_update : 1;
///     uint32_t segmentation_update_data : 1;
///     uint32_t UsesLr : 1;
///     uint32_t usesChromaLr : 1;
///     uint32_t apply_grain : 1;
///     uint32_t reserved : 3;
/// };
/// ```
public final class StdVideoDecodeAV1PictureInfoFlags extends GroupType {
    /// The struct layout of `StdVideoDecodeAV1PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("error_resilient_mode"), 1,
        ValueLayout.JAVA_INT.withName("disable_cdf_update"), 1,
        ValueLayout.JAVA_INT.withName("use_superres"), 1,
        ValueLayout.JAVA_INT.withName("render_and_frame_size_different"), 1,
        ValueLayout.JAVA_INT.withName("allow_screen_content_tools"), 1,
        ValueLayout.JAVA_INT.withName("is_filter_switchable"), 1,
        ValueLayout.JAVA_INT.withName("force_integer_mv"), 1,
        ValueLayout.JAVA_INT.withName("frame_size_override_flag"), 1,
        ValueLayout.JAVA_INT.withName("buffer_removal_time_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("allow_intrabc"), 1,
        ValueLayout.JAVA_INT.withName("frame_refs_short_signaling"), 1,
        ValueLayout.JAVA_INT.withName("allow_high_precision_mv"), 1,
        ValueLayout.JAVA_INT.withName("is_motion_mode_switchable"), 1,
        ValueLayout.JAVA_INT.withName("use_ref_frame_mvs"), 1,
        ValueLayout.JAVA_INT.withName("disable_frame_end_update_cdf"), 1,
        ValueLayout.JAVA_INT.withName("allow_warped_motion"), 1,
        ValueLayout.JAVA_INT.withName("reduced_tx_set"), 1,
        ValueLayout.JAVA_INT.withName("reference_select"), 1,
        ValueLayout.JAVA_INT.withName("skip_mode_present"), 1,
        ValueLayout.JAVA_INT.withName("delta_q_present"), 1,
        ValueLayout.JAVA_INT.withName("delta_lf_present"), 1,
        ValueLayout.JAVA_INT.withName("delta_lf_multi"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_enabled"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_update_map"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_temporal_update"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_update_data"), 1,
        ValueLayout.JAVA_INT.withName("UsesLr"), 1,
        ValueLayout.JAVA_INT.withName("usesChromaLr"), 1,
        ValueLayout.JAVA_INT.withName("apply_grain"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 3
    );

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeAV1PictureInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static StdVideoDecodeAV1PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1PictureInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static StdVideoDecodeAV1PictureInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeAV1PictureInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags copyFrom(StdVideoDecodeAV1PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeAV1PictureInfoFlags reinterpret(long count) { return new StdVideoDecodeAV1PictureInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
    public StdVideoDecodeAV1PictureInfoFlags asSlice(long index) { return new StdVideoDecodeAV1PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
    public StdVideoDecodeAV1PictureInfoFlags asSlice(long index, long count) { return new StdVideoDecodeAV1PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeAV1PictureInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags at(long index, Consumer<StdVideoDecodeAV1PictureInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
