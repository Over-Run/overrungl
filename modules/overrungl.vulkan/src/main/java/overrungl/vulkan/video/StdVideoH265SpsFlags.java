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
/// struct StdVideoH265SpsFlags {
///     uint32_t sps_temporal_id_nesting_flag;
///     uint32_t separate_colour_plane_flag;
///     uint32_t conformance_window_flag;
///     uint32_t sps_sub_layer_ordering_info_present_flag;
///     uint32_t scaling_list_enabled_flag;
///     uint32_t sps_scaling_list_data_present_flag;
///     uint32_t amp_enabled_flag;
///     uint32_t sample_adaptive_offset_enabled_flag;
///     uint32_t pcm_enabled_flag;
///     uint32_t pcm_loop_filter_disabled_flag;
///     uint32_t long_term_ref_pics_present_flag;
///     uint32_t sps_temporal_mvp_enabled_flag;
///     uint32_t strong_intra_smoothing_enabled_flag;
///     uint32_t vui_parameters_present_flag;
///     uint32_t sps_extension_present_flag;
///     uint32_t sps_range_extension_flag;
///     uint32_t transform_skip_rotation_enabled_flag;
///     uint32_t transform_skip_context_enabled_flag;
///     uint32_t implicit_rdpcm_enabled_flag;
///     uint32_t explicit_rdpcm_enabled_flag;
///     uint32_t extended_precision_processing_flag;
///     uint32_t intra_smoothing_disabled_flag;
///     uint32_t high_precision_offsets_enabled_flag;
///     uint32_t persistent_rice_adaptation_enabled_flag;
///     uint32_t cabac_bypass_alignment_enabled_flag;
///     uint32_t sps_scc_extension_flag;
///     uint32_t sps_curr_pic_ref_enabled_flag;
///     uint32_t palette_mode_enabled_flag;
///     uint32_t sps_palette_predictor_initializers_present_flag;
///     uint32_t intra_boundary_filtering_disabled_flag;
/// };
/// ```
public sealed class StdVideoH265SpsFlags extends GroupType {
    /// The struct layout of `StdVideoH265SpsFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1)
    );

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SpsFlags`
    public static StdVideoH265SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265SpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SpsFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SpsFlags copyFrom(StdVideoH265SpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoH265SpsFlags].
    public static final class Buffer extends StdVideoH265SpsFlags {
        private final long elementCount;

        /// Creates `StdVideoH265SpsFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265SpsFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265SpsFlags`
        public StdVideoH265SpsFlags asSlice(long index) { return new StdVideoH265SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265SpsFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265SpsFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
