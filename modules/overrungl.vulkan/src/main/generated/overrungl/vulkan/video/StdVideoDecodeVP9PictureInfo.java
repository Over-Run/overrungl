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
import java.util.function.*;

/// ## Layout
/// ```
/// struct StdVideoDecodeVP9PictureInfo {
///     (struct StdVideoDecodeVP9PictureInfoFlags) StdVideoDecodeVP9PictureInfoFlags flags;
///     (int) StdVideoVP9Profile profile;
///     (int) StdVideoVP9FrameType frame_type;
///     uint8_t frame_context_idx;
///     uint8_t reset_frame_context;
///     uint8_t refresh_frame_flags;
///     uint8_t ref_frame_sign_bias_mask;
///     (int) StdVideoVP9InterpolationFilter interpolation_filter;
///     uint8_t base_q_idx;
///     int8_t delta_q_y_dc;
///     int8_t delta_q_uv_dc;
///     int8_t delta_q_uv_ac;
///     uint8_t tile_cols_log2;
///     uint8_t tile_rows_log2;
///     uint16_t reserved1[3];
///     const StdVideoVP9ColorConfig* pColorConfig;
///     const StdVideoVP9LoopFilter* pLoopFilter;
///     const StdVideoVP9Segmentation* pSegmentation;
/// };
/// ```
public sealed class StdVideoDecodeVP9PictureInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeVP9PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("profile"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("frame_context_idx"),
        ValueLayout.JAVA_BYTE.withName("reset_frame_context"),
        ValueLayout.JAVA_BYTE.withName("refresh_frame_flags"),
        ValueLayout.JAVA_BYTE.withName("ref_frame_sign_bias_mask"),
        ValueLayout.JAVA_INT.withName("interpolation_filter"),
        ValueLayout.JAVA_BYTE.withName("base_q_idx"),
        ValueLayout.JAVA_BYTE.withName("delta_q_y_dc"),
        ValueLayout.JAVA_BYTE.withName("delta_q_uv_dc"),
        ValueLayout.JAVA_BYTE.withName("delta_q_uv_ac"),
        ValueLayout.JAVA_BYTE.withName("tile_cols_log2"),
        ValueLayout.JAVA_BYTE.withName("tile_rows_log2"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pColorConfig"),
        ValueLayout.ADDRESS.withName("pLoopFilter"),
        ValueLayout.ADDRESS.withName("pSegmentation")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `profile`.
    public static final long OFFSET_profile = LAYOUT.byteOffset(PathElement.groupElement("profile"));
    /// The memory layout of `profile`.
    public static final MemoryLayout LAYOUT_profile = LAYOUT.select(PathElement.groupElement("profile"));
    /// The [VarHandle] of `profile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_profile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profile"));
    /// The byte offset of `frame_type`.
    public static final long OFFSET_frame_type = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
    /// The memory layout of `frame_type`.
    public static final MemoryLayout LAYOUT_frame_type = LAYOUT.select(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The byte offset of `frame_context_idx`.
    public static final long OFFSET_frame_context_idx = LAYOUT.byteOffset(PathElement.groupElement("frame_context_idx"));
    /// The memory layout of `frame_context_idx`.
    public static final MemoryLayout LAYOUT_frame_context_idx = LAYOUT.select(PathElement.groupElement("frame_context_idx"));
    /// The [VarHandle] of `frame_context_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_context_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_context_idx"));
    /// The byte offset of `reset_frame_context`.
    public static final long OFFSET_reset_frame_context = LAYOUT.byteOffset(PathElement.groupElement("reset_frame_context"));
    /// The memory layout of `reset_frame_context`.
    public static final MemoryLayout LAYOUT_reset_frame_context = LAYOUT.select(PathElement.groupElement("reset_frame_context"));
    /// The [VarHandle] of `reset_frame_context` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reset_frame_context = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reset_frame_context"));
    /// The byte offset of `refresh_frame_flags`.
    public static final long OFFSET_refresh_frame_flags = LAYOUT.byteOffset(PathElement.groupElement("refresh_frame_flags"));
    /// The memory layout of `refresh_frame_flags`.
    public static final MemoryLayout LAYOUT_refresh_frame_flags = LAYOUT.select(PathElement.groupElement("refresh_frame_flags"));
    /// The [VarHandle] of `refresh_frame_flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refresh_frame_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refresh_frame_flags"));
    /// The byte offset of `ref_frame_sign_bias_mask`.
    public static final long OFFSET_ref_frame_sign_bias_mask = LAYOUT.byteOffset(PathElement.groupElement("ref_frame_sign_bias_mask"));
    /// The memory layout of `ref_frame_sign_bias_mask`.
    public static final MemoryLayout LAYOUT_ref_frame_sign_bias_mask = LAYOUT.select(PathElement.groupElement("ref_frame_sign_bias_mask"));
    /// The [VarHandle] of `ref_frame_sign_bias_mask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ref_frame_sign_bias_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_frame_sign_bias_mask"));
    /// The byte offset of `interpolation_filter`.
    public static final long OFFSET_interpolation_filter = LAYOUT.byteOffset(PathElement.groupElement("interpolation_filter"));
    /// The memory layout of `interpolation_filter`.
    public static final MemoryLayout LAYOUT_interpolation_filter = LAYOUT.select(PathElement.groupElement("interpolation_filter"));
    /// The [VarHandle] of `interpolation_filter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_interpolation_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("interpolation_filter"));
    /// The byte offset of `base_q_idx`.
    public static final long OFFSET_base_q_idx = LAYOUT.byteOffset(PathElement.groupElement("base_q_idx"));
    /// The memory layout of `base_q_idx`.
    public static final MemoryLayout LAYOUT_base_q_idx = LAYOUT.select(PathElement.groupElement("base_q_idx"));
    /// The [VarHandle] of `base_q_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_base_q_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("base_q_idx"));
    /// The byte offset of `delta_q_y_dc`.
    public static final long OFFSET_delta_q_y_dc = LAYOUT.byteOffset(PathElement.groupElement("delta_q_y_dc"));
    /// The memory layout of `delta_q_y_dc`.
    public static final MemoryLayout LAYOUT_delta_q_y_dc = LAYOUT.select(PathElement.groupElement("delta_q_y_dc"));
    /// The [VarHandle] of `delta_q_y_dc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_q_y_dc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_y_dc"));
    /// The byte offset of `delta_q_uv_dc`.
    public static final long OFFSET_delta_q_uv_dc = LAYOUT.byteOffset(PathElement.groupElement("delta_q_uv_dc"));
    /// The memory layout of `delta_q_uv_dc`.
    public static final MemoryLayout LAYOUT_delta_q_uv_dc = LAYOUT.select(PathElement.groupElement("delta_q_uv_dc"));
    /// The [VarHandle] of `delta_q_uv_dc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_q_uv_dc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_uv_dc"));
    /// The byte offset of `delta_q_uv_ac`.
    public static final long OFFSET_delta_q_uv_ac = LAYOUT.byteOffset(PathElement.groupElement("delta_q_uv_ac"));
    /// The memory layout of `delta_q_uv_ac`.
    public static final MemoryLayout LAYOUT_delta_q_uv_ac = LAYOUT.select(PathElement.groupElement("delta_q_uv_ac"));
    /// The [VarHandle] of `delta_q_uv_ac` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_q_uv_ac = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_uv_ac"));
    /// The byte offset of `tile_cols_log2`.
    public static final long OFFSET_tile_cols_log2 = LAYOUT.byteOffset(PathElement.groupElement("tile_cols_log2"));
    /// The memory layout of `tile_cols_log2`.
    public static final MemoryLayout LAYOUT_tile_cols_log2 = LAYOUT.select(PathElement.groupElement("tile_cols_log2"));
    /// The [VarHandle] of `tile_cols_log2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tile_cols_log2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tile_cols_log2"));
    /// The byte offset of `tile_rows_log2`.
    public static final long OFFSET_tile_rows_log2 = LAYOUT.byteOffset(PathElement.groupElement("tile_rows_log2"));
    /// The memory layout of `tile_rows_log2`.
    public static final MemoryLayout LAYOUT_tile_rows_log2 = LAYOUT.select(PathElement.groupElement("tile_rows_log2"));
    /// The [VarHandle] of `tile_rows_log2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tile_rows_log2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tile_rows_log2"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pColorConfig`.
    public static final long OFFSET_pColorConfig = LAYOUT.byteOffset(PathElement.groupElement("pColorConfig"));
    /// The memory layout of `pColorConfig`.
    public static final MemoryLayout LAYOUT_pColorConfig = LAYOUT.select(PathElement.groupElement("pColorConfig"));
    /// The [VarHandle] of `pColorConfig` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorConfig = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorConfig"));
    /// The byte offset of `pLoopFilter`.
    public static final long OFFSET_pLoopFilter = LAYOUT.byteOffset(PathElement.groupElement("pLoopFilter"));
    /// The memory layout of `pLoopFilter`.
    public static final MemoryLayout LAYOUT_pLoopFilter = LAYOUT.select(PathElement.groupElement("pLoopFilter"));
    /// The [VarHandle] of `pLoopFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLoopFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopFilter"));
    /// The byte offset of `pSegmentation`.
    public static final long OFFSET_pSegmentation = LAYOUT.byteOffset(PathElement.groupElement("pSegmentation"));
    /// The memory layout of `pSegmentation`.
    public static final MemoryLayout LAYOUT_pSegmentation = LAYOUT.select(PathElement.groupElement("pSegmentation"));
    /// The [VarHandle] of `pSegmentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSegmentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSegmentation"));

    /// Creates `StdVideoDecodeVP9PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeVP9PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeVP9PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeVP9PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeVP9PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeVP9PictureInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoDecodeVP9PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeVP9PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @param tile_rows_log2 `tile_rows_log2`
    /// @param reserved1 `reserved1`
    /// @param pColorConfig `pColorConfig`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pSegmentation `pSegmentation`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2, MemorySegment reserved1, MemorySegment pColorConfig, MemorySegment pLoopFilter, MemorySegment pSegmentation) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2).tile_rows_log2(tile_rows_log2).reserved1(reserved1).pColorConfig(pColorConfig).pLoopFilter(pLoopFilter).pSegmentation(pSegmentation);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @param tile_rows_log2 `tile_rows_log2`
    /// @param reserved1 `reserved1`
    /// @param pColorConfig `pColorConfig`
    /// @param pLoopFilter `pLoopFilter`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2, MemorySegment reserved1, MemorySegment pColorConfig, MemorySegment pLoopFilter) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2).tile_rows_log2(tile_rows_log2).reserved1(reserved1).pColorConfig(pColorConfig).pLoopFilter(pLoopFilter);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @param tile_rows_log2 `tile_rows_log2`
    /// @param reserved1 `reserved1`
    /// @param pColorConfig `pColorConfig`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2, MemorySegment reserved1, MemorySegment pColorConfig) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2).tile_rows_log2(tile_rows_log2).reserved1(reserved1).pColorConfig(pColorConfig);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @param tile_rows_log2 `tile_rows_log2`
    /// @param reserved1 `reserved1`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2, MemorySegment reserved1) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2).tile_rows_log2(tile_rows_log2).reserved1(reserved1);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @param tile_rows_log2 `tile_rows_log2`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2).tile_rows_log2(tile_rows_log2);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @param tile_cols_log2 `tile_cols_log2`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac).tile_cols_log2(tile_cols_log2);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @param delta_q_uv_ac `delta_q_uv_ac`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc).delta_q_uv_ac(delta_q_uv_ac);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @param delta_q_uv_dc `delta_q_uv_dc`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc).delta_q_uv_dc(delta_q_uv_dc);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @param delta_q_y_dc `delta_q_y_dc`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx).delta_q_y_dc(delta_q_y_dc);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @param base_q_idx `base_q_idx`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter).base_q_idx(base_q_idx);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @param interpolation_filter `interpolation_filter`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask).interpolation_filter(interpolation_filter);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param ref_frame_sign_bias_mask `ref_frame_sign_bias_mask`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags).ref_frame_sign_bias_mask(ref_frame_sign_bias_mask);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context).refresh_frame_flags(refresh_frame_flags);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @param reset_frame_context `reset_frame_context`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx).reset_frame_context(reset_frame_context);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @param frame_context_idx `frame_context_idx`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type, byte frame_context_idx) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type).frame_context_idx(frame_context_idx);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @param frame_type `frame_type`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile, int frame_type) {
        return alloc(allocator).flags(flags).profile(profile).frame_type(frame_type);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param profile `profile`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int profile) {
        return alloc(allocator).flags(flags).profile(profile);
    }

    /// Allocates a `StdVideoDecodeVP9PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoDecodeVP9PictureInfo`
    public static StdVideoDecodeVP9PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo copyFrom(StdVideoDecodeVP9PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo flags(Consumer<overrungl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.of(flags())); return this; }

    /// {@return `profile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int profile(MemorySegment segment, long index) { return (int) VH_profile.get(segment, 0L, index); }
    /// {@return `profile`}
    public int profile() { return profile(this.segment(), 0L); }
    /// Sets `profile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void profile(MemorySegment segment, long index, int value) { VH_profile.set(segment, 0L, index, value); }
    /// Sets `profile` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo profile(int value) { profile(this.segment(), 0L, value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_type(MemorySegment segment, long index) { return (int) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    public int frame_type() { return frame_type(this.segment(), 0L); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_type(MemorySegment segment, long index, int value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo frame_type(int value) { frame_type(this.segment(), 0L, value); return this; }

    /// {@return `frame_context_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte frame_context_idx(MemorySegment segment, long index) { return (byte) VH_frame_context_idx.get(segment, 0L, index); }
    /// {@return `frame_context_idx`}
    public byte frame_context_idx() { return frame_context_idx(this.segment(), 0L); }
    /// Sets `frame_context_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_context_idx(MemorySegment segment, long index, byte value) { VH_frame_context_idx.set(segment, 0L, index, value); }
    /// Sets `frame_context_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo frame_context_idx(byte value) { frame_context_idx(this.segment(), 0L, value); return this; }

    /// {@return `reset_frame_context` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reset_frame_context(MemorySegment segment, long index) { return (byte) VH_reset_frame_context.get(segment, 0L, index); }
    /// {@return `reset_frame_context`}
    public byte reset_frame_context() { return reset_frame_context(this.segment(), 0L); }
    /// Sets `reset_frame_context` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reset_frame_context(MemorySegment segment, long index, byte value) { VH_reset_frame_context.set(segment, 0L, index, value); }
    /// Sets `reset_frame_context` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo reset_frame_context(byte value) { reset_frame_context(this.segment(), 0L, value); return this; }

    /// {@return `refresh_frame_flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte refresh_frame_flags(MemorySegment segment, long index) { return (byte) VH_refresh_frame_flags.get(segment, 0L, index); }
    /// {@return `refresh_frame_flags`}
    public byte refresh_frame_flags() { return refresh_frame_flags(this.segment(), 0L); }
    /// Sets `refresh_frame_flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refresh_frame_flags(MemorySegment segment, long index, byte value) { VH_refresh_frame_flags.set(segment, 0L, index, value); }
    /// Sets `refresh_frame_flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo refresh_frame_flags(byte value) { refresh_frame_flags(this.segment(), 0L, value); return this; }

    /// {@return `ref_frame_sign_bias_mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte ref_frame_sign_bias_mask(MemorySegment segment, long index) { return (byte) VH_ref_frame_sign_bias_mask.get(segment, 0L, index); }
    /// {@return `ref_frame_sign_bias_mask`}
    public byte ref_frame_sign_bias_mask() { return ref_frame_sign_bias_mask(this.segment(), 0L); }
    /// Sets `ref_frame_sign_bias_mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ref_frame_sign_bias_mask(MemorySegment segment, long index, byte value) { VH_ref_frame_sign_bias_mask.set(segment, 0L, index, value); }
    /// Sets `ref_frame_sign_bias_mask` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo ref_frame_sign_bias_mask(byte value) { ref_frame_sign_bias_mask(this.segment(), 0L, value); return this; }

    /// {@return `interpolation_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int interpolation_filter(MemorySegment segment, long index) { return (int) VH_interpolation_filter.get(segment, 0L, index); }
    /// {@return `interpolation_filter`}
    public int interpolation_filter() { return interpolation_filter(this.segment(), 0L); }
    /// Sets `interpolation_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void interpolation_filter(MemorySegment segment, long index, int value) { VH_interpolation_filter.set(segment, 0L, index, value); }
    /// Sets `interpolation_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo interpolation_filter(int value) { interpolation_filter(this.segment(), 0L, value); return this; }

    /// {@return `base_q_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte base_q_idx(MemorySegment segment, long index) { return (byte) VH_base_q_idx.get(segment, 0L, index); }
    /// {@return `base_q_idx`}
    public byte base_q_idx() { return base_q_idx(this.segment(), 0L); }
    /// Sets `base_q_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void base_q_idx(MemorySegment segment, long index, byte value) { VH_base_q_idx.set(segment, 0L, index, value); }
    /// Sets `base_q_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo base_q_idx(byte value) { base_q_idx(this.segment(), 0L, value); return this; }

    /// {@return `delta_q_y_dc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_q_y_dc(MemorySegment segment, long index) { return (byte) VH_delta_q_y_dc.get(segment, 0L, index); }
    /// {@return `delta_q_y_dc`}
    public byte delta_q_y_dc() { return delta_q_y_dc(this.segment(), 0L); }
    /// Sets `delta_q_y_dc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_q_y_dc(MemorySegment segment, long index, byte value) { VH_delta_q_y_dc.set(segment, 0L, index, value); }
    /// Sets `delta_q_y_dc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo delta_q_y_dc(byte value) { delta_q_y_dc(this.segment(), 0L, value); return this; }

    /// {@return `delta_q_uv_dc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_q_uv_dc(MemorySegment segment, long index) { return (byte) VH_delta_q_uv_dc.get(segment, 0L, index); }
    /// {@return `delta_q_uv_dc`}
    public byte delta_q_uv_dc() { return delta_q_uv_dc(this.segment(), 0L); }
    /// Sets `delta_q_uv_dc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_q_uv_dc(MemorySegment segment, long index, byte value) { VH_delta_q_uv_dc.set(segment, 0L, index, value); }
    /// Sets `delta_q_uv_dc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo delta_q_uv_dc(byte value) { delta_q_uv_dc(this.segment(), 0L, value); return this; }

    /// {@return `delta_q_uv_ac` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_q_uv_ac(MemorySegment segment, long index) { return (byte) VH_delta_q_uv_ac.get(segment, 0L, index); }
    /// {@return `delta_q_uv_ac`}
    public byte delta_q_uv_ac() { return delta_q_uv_ac(this.segment(), 0L); }
    /// Sets `delta_q_uv_ac` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_q_uv_ac(MemorySegment segment, long index, byte value) { VH_delta_q_uv_ac.set(segment, 0L, index, value); }
    /// Sets `delta_q_uv_ac` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo delta_q_uv_ac(byte value) { delta_q_uv_ac(this.segment(), 0L, value); return this; }

    /// {@return `tile_cols_log2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte tile_cols_log2(MemorySegment segment, long index) { return (byte) VH_tile_cols_log2.get(segment, 0L, index); }
    /// {@return `tile_cols_log2`}
    public byte tile_cols_log2() { return tile_cols_log2(this.segment(), 0L); }
    /// Sets `tile_cols_log2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tile_cols_log2(MemorySegment segment, long index, byte value) { VH_tile_cols_log2.set(segment, 0L, index, value); }
    /// Sets `tile_cols_log2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo tile_cols_log2(byte value) { tile_cols_log2(this.segment(), 0L, value); return this; }

    /// {@return `tile_rows_log2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte tile_rows_log2(MemorySegment segment, long index) { return (byte) VH_tile_rows_log2.get(segment, 0L, index); }
    /// {@return `tile_rows_log2`}
    public byte tile_rows_log2() { return tile_rows_log2(this.segment(), 0L); }
    /// Sets `tile_rows_log2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tile_rows_log2(MemorySegment segment, long index, byte value) { VH_tile_rows_log2.set(segment, 0L, index, value); }
    /// Sets `tile_rows_log2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo tile_rows_log2(byte value) { tile_rows_log2(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short reserved1(MemorySegment segment, long index, long index0) { return (short) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public short reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, short value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo reserved1(long index0, short value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pColorConfig` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorConfig(MemorySegment segment, long index) { return (MemorySegment) VH_pColorConfig.get(segment, 0L, index); }
    /// {@return `pColorConfig`}
    public MemorySegment pColorConfig() { return pColorConfig(this.segment(), 0L); }
    /// Sets `pColorConfig` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorConfig(MemorySegment segment, long index, MemorySegment value) { VH_pColorConfig.set(segment, 0L, index, value); }
    /// Sets `pColorConfig` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo pColorConfig(MemorySegment value) { pColorConfig(this.segment(), 0L, value); return this; }

    /// {@return `pLoopFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLoopFilter(MemorySegment segment, long index) { return (MemorySegment) VH_pLoopFilter.get(segment, 0L, index); }
    /// {@return `pLoopFilter`}
    public MemorySegment pLoopFilter() { return pLoopFilter(this.segment(), 0L); }
    /// Sets `pLoopFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLoopFilter(MemorySegment segment, long index, MemorySegment value) { VH_pLoopFilter.set(segment, 0L, index, value); }
    /// Sets `pLoopFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo pLoopFilter(MemorySegment value) { pLoopFilter(this.segment(), 0L, value); return this; }

    /// {@return `pSegmentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSegmentation(MemorySegment segment, long index) { return (MemorySegment) VH_pSegmentation.get(segment, 0L, index); }
    /// {@return `pSegmentation`}
    public MemorySegment pSegmentation() { return pSegmentation(this.segment(), 0L); }
    /// Sets `pSegmentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSegmentation(MemorySegment segment, long index, MemorySegment value) { VH_pSegmentation.set(segment, 0L, index, value); }
    /// Sets `pSegmentation` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeVP9PictureInfo pSegmentation(MemorySegment value) { pSegmentation(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoDecodeVP9PictureInfo].
    public static final class Buffer extends StdVideoDecodeVP9PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeVP9PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeVP9PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeVP9PictureInfo`
        public StdVideoDecodeVP9PictureInfo asSlice(long index) { return new StdVideoDecodeVP9PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeVP9PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeVP9PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
        /// Accepts `flags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.of(flagsAt(index))); return this; }

        /// {@return `profile` at the given index}
        /// @param index the index of the struct buffer
        public int profileAt(long index) { return profile(this.segment(), index); }
        /// Sets `profile` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer profileAt(long index, int value) { profile(this.segment(), index, value); return this; }

        /// {@return `frame_type` at the given index}
        /// @param index the index of the struct buffer
        public int frame_typeAt(long index) { return frame_type(this.segment(), index); }
        /// Sets `frame_type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frame_typeAt(long index, int value) { frame_type(this.segment(), index, value); return this; }

        /// {@return `frame_context_idx` at the given index}
        /// @param index the index of the struct buffer
        public byte frame_context_idxAt(long index) { return frame_context_idx(this.segment(), index); }
        /// Sets `frame_context_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frame_context_idxAt(long index, byte value) { frame_context_idx(this.segment(), index, value); return this; }

        /// {@return `reset_frame_context` at the given index}
        /// @param index the index of the struct buffer
        public byte reset_frame_contextAt(long index) { return reset_frame_context(this.segment(), index); }
        /// Sets `reset_frame_context` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reset_frame_contextAt(long index, byte value) { reset_frame_context(this.segment(), index, value); return this; }

        /// {@return `refresh_frame_flags` at the given index}
        /// @param index the index of the struct buffer
        public byte refresh_frame_flagsAt(long index) { return refresh_frame_flags(this.segment(), index); }
        /// Sets `refresh_frame_flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer refresh_frame_flagsAt(long index, byte value) { refresh_frame_flags(this.segment(), index, value); return this; }

        /// {@return `ref_frame_sign_bias_mask` at the given index}
        /// @param index the index of the struct buffer
        public byte ref_frame_sign_bias_maskAt(long index) { return ref_frame_sign_bias_mask(this.segment(), index); }
        /// Sets `ref_frame_sign_bias_mask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ref_frame_sign_bias_maskAt(long index, byte value) { ref_frame_sign_bias_mask(this.segment(), index, value); return this; }

        /// {@return `interpolation_filter` at the given index}
        /// @param index the index of the struct buffer
        public int interpolation_filterAt(long index) { return interpolation_filter(this.segment(), index); }
        /// Sets `interpolation_filter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer interpolation_filterAt(long index, int value) { interpolation_filter(this.segment(), index, value); return this; }

        /// {@return `base_q_idx` at the given index}
        /// @param index the index of the struct buffer
        public byte base_q_idxAt(long index) { return base_q_idx(this.segment(), index); }
        /// Sets `base_q_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer base_q_idxAt(long index, byte value) { base_q_idx(this.segment(), index, value); return this; }

        /// {@return `delta_q_y_dc` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_q_y_dcAt(long index) { return delta_q_y_dc(this.segment(), index); }
        /// Sets `delta_q_y_dc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_y_dcAt(long index, byte value) { delta_q_y_dc(this.segment(), index, value); return this; }

        /// {@return `delta_q_uv_dc` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_q_uv_dcAt(long index) { return delta_q_uv_dc(this.segment(), index); }
        /// Sets `delta_q_uv_dc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_uv_dcAt(long index, byte value) { delta_q_uv_dc(this.segment(), index, value); return this; }

        /// {@return `delta_q_uv_ac` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_q_uv_acAt(long index) { return delta_q_uv_ac(this.segment(), index); }
        /// Sets `delta_q_uv_ac` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_uv_acAt(long index, byte value) { delta_q_uv_ac(this.segment(), index, value); return this; }

        /// {@return `tile_cols_log2` at the given index}
        /// @param index the index of the struct buffer
        public byte tile_cols_log2At(long index) { return tile_cols_log2(this.segment(), index); }
        /// Sets `tile_cols_log2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tile_cols_log2At(long index, byte value) { tile_cols_log2(this.segment(), index, value); return this; }

        /// {@return `tile_rows_log2` at the given index}
        /// @param index the index of the struct buffer
        public byte tile_rows_log2At(long index) { return tile_rows_log2(this.segment(), index); }
        /// Sets `tile_rows_log2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tile_rows_log2At(long index, byte value) { tile_rows_log2(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public short reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, long index0, short value) { reserved1(this.segment(), index, index0, value); return this; }

        /// {@return `pColorConfig` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pColorConfigAt(long index) { return pColorConfig(this.segment(), index); }
        /// Sets `pColorConfig` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pColorConfigAt(long index, MemorySegment value) { pColorConfig(this.segment(), index, value); return this; }

        /// {@return `pLoopFilter` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLoopFilterAt(long index) { return pLoopFilter(this.segment(), index); }
        /// Sets `pLoopFilter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLoopFilterAt(long index, MemorySegment value) { pLoopFilter(this.segment(), index, value); return this; }

        /// {@return `pSegmentation` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSegmentationAt(long index) { return pSegmentation(this.segment(), index); }
        /// Sets `pSegmentation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSegmentationAt(long index, MemorySegment value) { pSegmentation(this.segment(), index, value); return this; }

    }
}
