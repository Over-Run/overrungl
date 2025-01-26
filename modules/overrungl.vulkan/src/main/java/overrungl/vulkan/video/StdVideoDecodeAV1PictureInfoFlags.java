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
/// struct StdVideoDecodeAV1PictureInfoFlags {
///     uint32_t error_resilient_mode;
///     uint32_t disable_cdf_update;
///     uint32_t use_superres;
///     uint32_t render_and_frame_size_different;
///     uint32_t allow_screen_content_tools;
///     uint32_t is_filter_switchable;
///     uint32_t force_integer_mv;
///     uint32_t frame_size_override_flag;
///     uint32_t buffer_removal_time_present_flag;
///     uint32_t allow_intrabc;
///     uint32_t frame_refs_short_signaling;
///     uint32_t allow_high_precision_mv;
///     uint32_t is_motion_mode_switchable;
///     uint32_t use_ref_frame_mvs;
///     uint32_t disable_frame_end_update_cdf;
///     uint32_t allow_warped_motion;
///     uint32_t reduced_tx_set;
///     uint32_t reference_select;
///     uint32_t skip_mode_present;
///     uint32_t delta_q_present;
///     uint32_t delta_lf_present;
///     uint32_t delta_lf_multi;
///     uint32_t segmentation_enabled;
///     uint32_t segmentation_update_map;
///     uint32_t segmentation_temporal_update;
///     uint32_t segmentation_update_data;
///     uint32_t UsesLr;
///     uint32_t usesChromaLr;
///     uint32_t apply_grain;
///     uint32_t reserved;
/// };
/// ```
public sealed class StdVideoDecodeAV1PictureInfoFlags extends GroupType {
    /// The struct layout of `StdVideoDecodeAV1PictureInfoFlags`.
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
        MemoryLayout.paddingLayout(3)
    );

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeAV1PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static StdVideoDecodeAV1PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags copyFrom(StdVideoDecodeAV1PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoDecodeAV1PictureInfoFlags].
    public static final class Buffer extends StdVideoDecodeAV1PictureInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoDecodeAV1PictureInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
        public StdVideoDecodeAV1PictureInfoFlags asSlice(long index) { return new StdVideoDecodeAV1PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
