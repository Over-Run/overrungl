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
/// struct StdVideoH265PpsFlags {
///     uint32_t dependent_slice_segments_enabled_flag : 1;
///     uint32_t output_flag_present_flag : 1;
///     uint32_t sign_data_hiding_enabled_flag : 1;
///     uint32_t cabac_init_present_flag : 1;
///     uint32_t constrained_intra_pred_flag : 1;
///     uint32_t transform_skip_enabled_flag : 1;
///     uint32_t cu_qp_delta_enabled_flag : 1;
///     uint32_t pps_slice_chroma_qp_offsets_present_flag : 1;
///     uint32_t weighted_pred_flag : 1;
///     uint32_t weighted_bipred_flag : 1;
///     uint32_t transquant_bypass_enabled_flag : 1;
///     uint32_t tiles_enabled_flag : 1;
///     uint32_t entropy_coding_sync_enabled_flag : 1;
///     uint32_t uniform_spacing_flag : 1;
///     uint32_t loop_filter_across_tiles_enabled_flag : 1;
///     uint32_t pps_loop_filter_across_slices_enabled_flag : 1;
///     uint32_t deblocking_filter_control_present_flag : 1;
///     uint32_t deblocking_filter_override_enabled_flag : 1;
///     uint32_t pps_deblocking_filter_disabled_flag : 1;
///     uint32_t pps_scaling_list_data_present_flag : 1;
///     uint32_t lists_modification_present_flag : 1;
///     uint32_t slice_segment_header_extension_present_flag : 1;
///     uint32_t pps_extension_present_flag : 1;
///     uint32_t cross_component_prediction_enabled_flag : 1;
///     uint32_t chroma_qp_offset_list_enabled_flag : 1;
///     uint32_t pps_curr_pic_ref_enabled_flag : 1;
///     uint32_t residual_adaptive_colour_transform_enabled_flag : 1;
///     uint32_t pps_slice_act_qp_offsets_present_flag : 1;
///     uint32_t pps_palette_predictor_initializers_present_flag : 1;
///     uint32_t monochrome_palette_flag : 1;
///     uint32_t pps_range_extension_flag : 1;
/// };
/// ```
public final class StdVideoH265PpsFlags extends GroupType {
    /// The struct layout of `StdVideoH265PpsFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("dependent_slice_segments_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("output_flag_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sign_data_hiding_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("cabac_init_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("constrained_intra_pred_flag"), 1,
        ValueLayout.JAVA_INT.withName("transform_skip_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("cu_qp_delta_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_slice_chroma_qp_offsets_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("weighted_pred_flag"), 1,
        ValueLayout.JAVA_INT.withName("weighted_bipred_flag"), 1,
        ValueLayout.JAVA_INT.withName("transquant_bypass_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("tiles_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("entropy_coding_sync_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("uniform_spacing_flag"), 1,
        ValueLayout.JAVA_INT.withName("loop_filter_across_tiles_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_loop_filter_across_slices_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("deblocking_filter_control_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("deblocking_filter_override_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_deblocking_filter_disabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_scaling_list_data_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("lists_modification_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_segment_header_extension_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_extension_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("cross_component_prediction_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("chroma_qp_offset_list_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_curr_pic_ref_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("residual_adaptive_colour_transform_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_slice_act_qp_offsets_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_palette_predictor_initializers_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("monochrome_palette_flag"), 1,
        ValueLayout.JAVA_INT.withName("pps_range_extension_flag"), 1
    );

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265PpsFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265PpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PpsFlags`
    public static StdVideoH265PpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265PpsFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265PpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PpsFlags`
    public static StdVideoH265PpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265PpsFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265PpsFlags copyFrom(StdVideoH265PpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265PpsFlags reinterpret(long count) { return new StdVideoH265PpsFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265PpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265PpsFlags`
    public StdVideoH265PpsFlags asSlice(long index) { return new StdVideoH265PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265PpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265PpsFlags`
    public StdVideoH265PpsFlags asSlice(long index, long count) { return new StdVideoH265PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265PpsFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265PpsFlags at(long index, Consumer<StdVideoH265PpsFlags> func) { func.accept(asSlice(index)); return this; }

}
