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
/// struct StdVideoEncodeAV1PictureInfo {
///     (struct StdVideoEncodeAV1PictureInfoFlags) StdVideoEncodeAV1PictureInfoFlags flags;
///     (int) StdVideoAV1FrameType frame_type;
///     uint32_t frame_presentation_time;
///     uint32_t current_frame_id;
///     uint8_t order_hint;
///     uint8_t primary_ref_frame;
///     uint8_t refresh_frame_flags;
///     uint8_t coded_denom;
///     uint16_t render_width_minus_1;
///     uint16_t render_height_minus_1;
///     (int) StdVideoAV1InterpolationFilter interpolation_filter;
///     (int) StdVideoAV1TxMode TxMode;
///     uint8_t delta_q_res;
///     uint8_t delta_lf_res;
///     uint8_t ref_order_hint[8];
///     int8_t ref_frame_idx[7];
///     uint8_t reserved1[3];
///     uint32_t delta_frame_id_minus_1[7];
///     const StdVideoAV1TileInfo* pTileInfo;
///     const StdVideoAV1Quantization* pQuantization;
///     const StdVideoAV1Segmentation* pSegmentation;
///     const StdVideoAV1LoopFilter* pLoopFilter;
///     const StdVideoAV1CDEF* pCDEF;
///     const StdVideoAV1LoopRestoration* pLoopRestoration;
///     const StdVideoAV1GlobalMotion* pGlobalMotion;
///     const StdVideoEncodeAV1ExtensionHeader* pExtensionHeader;
///     const uint32_t* pBufferRemovalTimes;
/// };
/// ```
public sealed class StdVideoEncodeAV1PictureInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_INT.withName("frame_presentation_time"),
        ValueLayout.JAVA_INT.withName("current_frame_id"),
        ValueLayout.JAVA_BYTE.withName("order_hint"),
        ValueLayout.JAVA_BYTE.withName("primary_ref_frame"),
        ValueLayout.JAVA_BYTE.withName("refresh_frame_flags"),
        ValueLayout.JAVA_BYTE.withName("coded_denom"),
        ValueLayout.JAVA_SHORT.withName("render_width_minus_1"),
        ValueLayout.JAVA_SHORT.withName("render_height_minus_1"),
        ValueLayout.JAVA_INT.withName("interpolation_filter"),
        ValueLayout.JAVA_INT.withName("TxMode"),
        ValueLayout.JAVA_BYTE.withName("delta_q_res"),
        ValueLayout.JAVA_BYTE.withName("delta_lf_res"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("ref_order_hint"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("ref_frame_idx"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_INT).withName("delta_frame_id_minus_1"),
        ValueLayout.ADDRESS.withName("pTileInfo"),
        ValueLayout.ADDRESS.withName("pQuantization"),
        ValueLayout.ADDRESS.withName("pSegmentation"),
        ValueLayout.ADDRESS.withName("pLoopFilter"),
        ValueLayout.ADDRESS.withName("pCDEF"),
        ValueLayout.ADDRESS.withName("pLoopRestoration"),
        ValueLayout.ADDRESS.withName("pGlobalMotion"),
        ValueLayout.ADDRESS.withName("pExtensionHeader"),
        ValueLayout.ADDRESS.withName("pBufferRemovalTimes")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `frame_type`.
    public static final long OFFSET_frame_type = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
    /// The memory layout of `frame_type`.
    public static final MemoryLayout LAYOUT_frame_type = LAYOUT.select(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The byte offset of `frame_presentation_time`.
    public static final long OFFSET_frame_presentation_time = LAYOUT.byteOffset(PathElement.groupElement("frame_presentation_time"));
    /// The memory layout of `frame_presentation_time`.
    public static final MemoryLayout LAYOUT_frame_presentation_time = LAYOUT.select(PathElement.groupElement("frame_presentation_time"));
    /// The [VarHandle] of `frame_presentation_time` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_presentation_time = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_presentation_time"));
    /// The byte offset of `current_frame_id`.
    public static final long OFFSET_current_frame_id = LAYOUT.byteOffset(PathElement.groupElement("current_frame_id"));
    /// The memory layout of `current_frame_id`.
    public static final MemoryLayout LAYOUT_current_frame_id = LAYOUT.select(PathElement.groupElement("current_frame_id"));
    /// The [VarHandle] of `current_frame_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_current_frame_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("current_frame_id"));
    /// The byte offset of `order_hint`.
    public static final long OFFSET_order_hint = LAYOUT.byteOffset(PathElement.groupElement("order_hint"));
    /// The memory layout of `order_hint`.
    public static final MemoryLayout LAYOUT_order_hint = LAYOUT.select(PathElement.groupElement("order_hint"));
    /// The [VarHandle] of `order_hint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_order_hint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("order_hint"));
    /// The byte offset of `primary_ref_frame`.
    public static final long OFFSET_primary_ref_frame = LAYOUT.byteOffset(PathElement.groupElement("primary_ref_frame"));
    /// The memory layout of `primary_ref_frame`.
    public static final MemoryLayout LAYOUT_primary_ref_frame = LAYOUT.select(PathElement.groupElement("primary_ref_frame"));
    /// The [VarHandle] of `primary_ref_frame` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primary_ref_frame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_ref_frame"));
    /// The byte offset of `refresh_frame_flags`.
    public static final long OFFSET_refresh_frame_flags = LAYOUT.byteOffset(PathElement.groupElement("refresh_frame_flags"));
    /// The memory layout of `refresh_frame_flags`.
    public static final MemoryLayout LAYOUT_refresh_frame_flags = LAYOUT.select(PathElement.groupElement("refresh_frame_flags"));
    /// The [VarHandle] of `refresh_frame_flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refresh_frame_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refresh_frame_flags"));
    /// The byte offset of `coded_denom`.
    public static final long OFFSET_coded_denom = LAYOUT.byteOffset(PathElement.groupElement("coded_denom"));
    /// The memory layout of `coded_denom`.
    public static final MemoryLayout LAYOUT_coded_denom = LAYOUT.select(PathElement.groupElement("coded_denom"));
    /// The [VarHandle] of `coded_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coded_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coded_denom"));
    /// The byte offset of `render_width_minus_1`.
    public static final long OFFSET_render_width_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("render_width_minus_1"));
    /// The memory layout of `render_width_minus_1`.
    public static final MemoryLayout LAYOUT_render_width_minus_1 = LAYOUT.select(PathElement.groupElement("render_width_minus_1"));
    /// The [VarHandle] of `render_width_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_render_width_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("render_width_minus_1"));
    /// The byte offset of `render_height_minus_1`.
    public static final long OFFSET_render_height_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("render_height_minus_1"));
    /// The memory layout of `render_height_minus_1`.
    public static final MemoryLayout LAYOUT_render_height_minus_1 = LAYOUT.select(PathElement.groupElement("render_height_minus_1"));
    /// The [VarHandle] of `render_height_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_render_height_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("render_height_minus_1"));
    /// The byte offset of `interpolation_filter`.
    public static final long OFFSET_interpolation_filter = LAYOUT.byteOffset(PathElement.groupElement("interpolation_filter"));
    /// The memory layout of `interpolation_filter`.
    public static final MemoryLayout LAYOUT_interpolation_filter = LAYOUT.select(PathElement.groupElement("interpolation_filter"));
    /// The [VarHandle] of `interpolation_filter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_interpolation_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("interpolation_filter"));
    /// The byte offset of `TxMode`.
    public static final long OFFSET_TxMode = LAYOUT.byteOffset(PathElement.groupElement("TxMode"));
    /// The memory layout of `TxMode`.
    public static final MemoryLayout LAYOUT_TxMode = LAYOUT.select(PathElement.groupElement("TxMode"));
    /// The [VarHandle] of `TxMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_TxMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TxMode"));
    /// The byte offset of `delta_q_res`.
    public static final long OFFSET_delta_q_res = LAYOUT.byteOffset(PathElement.groupElement("delta_q_res"));
    /// The memory layout of `delta_q_res`.
    public static final MemoryLayout LAYOUT_delta_q_res = LAYOUT.select(PathElement.groupElement("delta_q_res"));
    /// The [VarHandle] of `delta_q_res` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_q_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_res"));
    /// The byte offset of `delta_lf_res`.
    public static final long OFFSET_delta_lf_res = LAYOUT.byteOffset(PathElement.groupElement("delta_lf_res"));
    /// The memory layout of `delta_lf_res`.
    public static final MemoryLayout LAYOUT_delta_lf_res = LAYOUT.select(PathElement.groupElement("delta_lf_res"));
    /// The [VarHandle] of `delta_lf_res` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_lf_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_lf_res"));
    /// The byte offset of `ref_order_hint`.
    public static final long OFFSET_ref_order_hint = LAYOUT.byteOffset(PathElement.groupElement("ref_order_hint"));
    /// The memory layout of `ref_order_hint`.
    public static final MemoryLayout LAYOUT_ref_order_hint = LAYOUT.select(PathElement.groupElement("ref_order_hint"));
    /// The [VarHandle] of `ref_order_hint` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_ref_order_hint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_order_hint"), PathElement.sequenceElement());
    /// The byte offset of `ref_frame_idx`.
    public static final long OFFSET_ref_frame_idx = LAYOUT.byteOffset(PathElement.groupElement("ref_frame_idx"));
    /// The memory layout of `ref_frame_idx`.
    public static final MemoryLayout LAYOUT_ref_frame_idx = LAYOUT.select(PathElement.groupElement("ref_frame_idx"));
    /// The [VarHandle] of `ref_frame_idx` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_ref_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_frame_idx"), PathElement.sequenceElement());
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `delta_frame_id_minus_1`.
    public static final long OFFSET_delta_frame_id_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("delta_frame_id_minus_1"));
    /// The memory layout of `delta_frame_id_minus_1`.
    public static final MemoryLayout LAYOUT_delta_frame_id_minus_1 = LAYOUT.select(PathElement.groupElement("delta_frame_id_minus_1"));
    /// The [VarHandle] of `delta_frame_id_minus_1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_frame_id_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_frame_id_minus_1"), PathElement.sequenceElement());
    /// The byte offset of `pTileInfo`.
    public static final long OFFSET_pTileInfo = LAYOUT.byteOffset(PathElement.groupElement("pTileInfo"));
    /// The memory layout of `pTileInfo`.
    public static final MemoryLayout LAYOUT_pTileInfo = LAYOUT.select(PathElement.groupElement("pTileInfo"));
    /// The [VarHandle] of `pTileInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTileInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileInfo"));
    /// The byte offset of `pQuantization`.
    public static final long OFFSET_pQuantization = LAYOUT.byteOffset(PathElement.groupElement("pQuantization"));
    /// The memory layout of `pQuantization`.
    public static final MemoryLayout LAYOUT_pQuantization = LAYOUT.select(PathElement.groupElement("pQuantization"));
    /// The [VarHandle] of `pQuantization` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQuantization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQuantization"));
    /// The byte offset of `pSegmentation`.
    public static final long OFFSET_pSegmentation = LAYOUT.byteOffset(PathElement.groupElement("pSegmentation"));
    /// The memory layout of `pSegmentation`.
    public static final MemoryLayout LAYOUT_pSegmentation = LAYOUT.select(PathElement.groupElement("pSegmentation"));
    /// The [VarHandle] of `pSegmentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSegmentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSegmentation"));
    /// The byte offset of `pLoopFilter`.
    public static final long OFFSET_pLoopFilter = LAYOUT.byteOffset(PathElement.groupElement("pLoopFilter"));
    /// The memory layout of `pLoopFilter`.
    public static final MemoryLayout LAYOUT_pLoopFilter = LAYOUT.select(PathElement.groupElement("pLoopFilter"));
    /// The [VarHandle] of `pLoopFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLoopFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopFilter"));
    /// The byte offset of `pCDEF`.
    public static final long OFFSET_pCDEF = LAYOUT.byteOffset(PathElement.groupElement("pCDEF"));
    /// The memory layout of `pCDEF`.
    public static final MemoryLayout LAYOUT_pCDEF = LAYOUT.select(PathElement.groupElement("pCDEF"));
    /// The [VarHandle] of `pCDEF` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCDEF = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCDEF"));
    /// The byte offset of `pLoopRestoration`.
    public static final long OFFSET_pLoopRestoration = LAYOUT.byteOffset(PathElement.groupElement("pLoopRestoration"));
    /// The memory layout of `pLoopRestoration`.
    public static final MemoryLayout LAYOUT_pLoopRestoration = LAYOUT.select(PathElement.groupElement("pLoopRestoration"));
    /// The [VarHandle] of `pLoopRestoration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLoopRestoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopRestoration"));
    /// The byte offset of `pGlobalMotion`.
    public static final long OFFSET_pGlobalMotion = LAYOUT.byteOffset(PathElement.groupElement("pGlobalMotion"));
    /// The memory layout of `pGlobalMotion`.
    public static final MemoryLayout LAYOUT_pGlobalMotion = LAYOUT.select(PathElement.groupElement("pGlobalMotion"));
    /// The [VarHandle] of `pGlobalMotion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pGlobalMotion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGlobalMotion"));
    /// The byte offset of `pExtensionHeader`.
    public static final long OFFSET_pExtensionHeader = LAYOUT.byteOffset(PathElement.groupElement("pExtensionHeader"));
    /// The memory layout of `pExtensionHeader`.
    public static final MemoryLayout LAYOUT_pExtensionHeader = LAYOUT.select(PathElement.groupElement("pExtensionHeader"));
    /// The [VarHandle] of `pExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtensionHeader"));
    /// The byte offset of `pBufferRemovalTimes`.
    public static final long OFFSET_pBufferRemovalTimes = LAYOUT.byteOffset(PathElement.groupElement("pBufferRemovalTimes"));
    /// The memory layout of `pBufferRemovalTimes`.
    public static final MemoryLayout LAYOUT_pBufferRemovalTimes = LAYOUT.select(PathElement.groupElement("pBufferRemovalTimes"));
    /// The [VarHandle] of `pBufferRemovalTimes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferRemovalTimes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferRemovalTimes"));

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1PictureInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pCDEF `pCDEF`
    /// @param pLoopRestoration `pLoopRestoration`
    /// @param pGlobalMotion `pGlobalMotion`
    /// @param pExtensionHeader `pExtensionHeader`
    /// @param pBufferRemovalTimes `pBufferRemovalTimes`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter, MemorySegment pCDEF, MemorySegment pLoopRestoration, MemorySegment pGlobalMotion, MemorySegment pExtensionHeader, MemorySegment pBufferRemovalTimes) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF).pLoopRestoration(pLoopRestoration).pGlobalMotion(pGlobalMotion).pExtensionHeader(pExtensionHeader).pBufferRemovalTimes(pBufferRemovalTimes);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pCDEF `pCDEF`
    /// @param pLoopRestoration `pLoopRestoration`
    /// @param pGlobalMotion `pGlobalMotion`
    /// @param pExtensionHeader `pExtensionHeader`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter, MemorySegment pCDEF, MemorySegment pLoopRestoration, MemorySegment pGlobalMotion, MemorySegment pExtensionHeader) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF).pLoopRestoration(pLoopRestoration).pGlobalMotion(pGlobalMotion).pExtensionHeader(pExtensionHeader);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pCDEF `pCDEF`
    /// @param pLoopRestoration `pLoopRestoration`
    /// @param pGlobalMotion `pGlobalMotion`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter, MemorySegment pCDEF, MemorySegment pLoopRestoration, MemorySegment pGlobalMotion) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF).pLoopRestoration(pLoopRestoration).pGlobalMotion(pGlobalMotion);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pCDEF `pCDEF`
    /// @param pLoopRestoration `pLoopRestoration`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter, MemorySegment pCDEF, MemorySegment pLoopRestoration) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF).pLoopRestoration(pLoopRestoration);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @param pCDEF `pCDEF`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter, MemorySegment pCDEF) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @param pLoopFilter `pLoopFilter`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation, MemorySegment pLoopFilter) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @param pSegmentation `pSegmentation`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization, MemorySegment pSegmentation) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @param pQuantization `pQuantization`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo, MemorySegment pQuantization) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo).pQuantization(pQuantization);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @param pTileInfo `pTileInfo`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1, MemorySegment pTileInfo) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1).pTileInfo(pTileInfo);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @param delta_frame_id_minus_1 `delta_frame_id_minus_1`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1, MemorySegment delta_frame_id_minus_1) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1).delta_frame_id_minus_1(delta_frame_id_minus_1);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @param reserved1 `reserved1`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx, MemorySegment reserved1) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx).reserved1(reserved1);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @param ref_frame_idx `ref_frame_idx`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint, MemorySegment ref_frame_idx) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint).ref_frame_idx(ref_frame_idx);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @param ref_order_hint `ref_order_hint`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, MemorySegment ref_order_hint) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).ref_order_hint(ref_order_hint);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @param delta_lf_res `delta_lf_res`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @param delta_q_res `delta_q_res`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @param TxMode `TxMode`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter).TxMode(TxMode);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @param interpolation_filter `interpolation_filter`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1).interpolation_filter(interpolation_filter);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @param render_height_minus_1 `render_height_minus_1`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1).render_height_minus_1(render_height_minus_1);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @param render_width_minus_1 `render_width_minus_1`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom).render_width_minus_1(render_width_minus_1);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @param coded_denom `coded_denom`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).coded_denom(coded_denom);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @param refresh_frame_flags `refresh_frame_flags`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @param primary_ref_frame `primary_ref_frame`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint).primary_ref_frame(primary_ref_frame);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @param order_hint `order_hint`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id).order_hint(order_hint);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @param current_frame_id `current_frame_id`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time, int current_frame_id) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time).current_frame_id(current_frame_id);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param frame_presentation_time `frame_presentation_time`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type, int frame_presentation_time) {
        return alloc(allocator).flags(flags).frame_type(frame_type).frame_presentation_time(frame_presentation_time);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int frame_type) {
        return alloc(allocator).flags(flags).frame_type(frame_type);
    }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo copyFrom(StdVideoEncodeAV1PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoEncodeAV1PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1PictureInfo frame_type(int value) { frame_type(this.segment(), 0L, value); return this; }

    /// {@return `frame_presentation_time` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_presentation_time(MemorySegment segment, long index) { return (int) VH_frame_presentation_time.get(segment, 0L, index); }
    /// {@return `frame_presentation_time`}
    public int frame_presentation_time() { return frame_presentation_time(this.segment(), 0L); }
    /// Sets `frame_presentation_time` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_presentation_time(MemorySegment segment, long index, int value) { VH_frame_presentation_time.set(segment, 0L, index, value); }
    /// Sets `frame_presentation_time` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo frame_presentation_time(int value) { frame_presentation_time(this.segment(), 0L, value); return this; }

    /// {@return `current_frame_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int current_frame_id(MemorySegment segment, long index) { return (int) VH_current_frame_id.get(segment, 0L, index); }
    /// {@return `current_frame_id`}
    public int current_frame_id() { return current_frame_id(this.segment(), 0L); }
    /// Sets `current_frame_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void current_frame_id(MemorySegment segment, long index, int value) { VH_current_frame_id.set(segment, 0L, index, value); }
    /// Sets `current_frame_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo current_frame_id(int value) { current_frame_id(this.segment(), 0L, value); return this; }

    /// {@return `order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte order_hint(MemorySegment segment, long index) { return (byte) VH_order_hint.get(segment, 0L, index); }
    /// {@return `order_hint`}
    public byte order_hint() { return order_hint(this.segment(), 0L); }
    /// Sets `order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void order_hint(MemorySegment segment, long index, byte value) { VH_order_hint.set(segment, 0L, index, value); }
    /// Sets `order_hint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo order_hint(byte value) { order_hint(this.segment(), 0L, value); return this; }

    /// {@return `primary_ref_frame` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte primary_ref_frame(MemorySegment segment, long index) { return (byte) VH_primary_ref_frame.get(segment, 0L, index); }
    /// {@return `primary_ref_frame`}
    public byte primary_ref_frame() { return primary_ref_frame(this.segment(), 0L); }
    /// Sets `primary_ref_frame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primary_ref_frame(MemorySegment segment, long index, byte value) { VH_primary_ref_frame.set(segment, 0L, index, value); }
    /// Sets `primary_ref_frame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo primary_ref_frame(byte value) { primary_ref_frame(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1PictureInfo refresh_frame_flags(byte value) { refresh_frame_flags(this.segment(), 0L, value); return this; }

    /// {@return `coded_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte coded_denom(MemorySegment segment, long index) { return (byte) VH_coded_denom.get(segment, 0L, index); }
    /// {@return `coded_denom`}
    public byte coded_denom() { return coded_denom(this.segment(), 0L); }
    /// Sets `coded_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coded_denom(MemorySegment segment, long index, byte value) { VH_coded_denom.set(segment, 0L, index, value); }
    /// Sets `coded_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo coded_denom(byte value) { coded_denom(this.segment(), 0L, value); return this; }

    /// {@return `render_width_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short render_width_minus_1(MemorySegment segment, long index) { return (short) VH_render_width_minus_1.get(segment, 0L, index); }
    /// {@return `render_width_minus_1`}
    public short render_width_minus_1() { return render_width_minus_1(this.segment(), 0L); }
    /// Sets `render_width_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void render_width_minus_1(MemorySegment segment, long index, short value) { VH_render_width_minus_1.set(segment, 0L, index, value); }
    /// Sets `render_width_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_width_minus_1(short value) { render_width_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `render_height_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short render_height_minus_1(MemorySegment segment, long index) { return (short) VH_render_height_minus_1.get(segment, 0L, index); }
    /// {@return `render_height_minus_1`}
    public short render_height_minus_1() { return render_height_minus_1(this.segment(), 0L); }
    /// Sets `render_height_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void render_height_minus_1(MemorySegment segment, long index, short value) { VH_render_height_minus_1.set(segment, 0L, index, value); }
    /// Sets `render_height_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_height_minus_1(short value) { render_height_minus_1(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1PictureInfo interpolation_filter(int value) { interpolation_filter(this.segment(), 0L, value); return this; }

    /// {@return `TxMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int TxMode(MemorySegment segment, long index) { return (int) VH_TxMode.get(segment, 0L, index); }
    /// {@return `TxMode`}
    public int TxMode() { return TxMode(this.segment(), 0L); }
    /// Sets `TxMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void TxMode(MemorySegment segment, long index, int value) { VH_TxMode.set(segment, 0L, index, value); }
    /// Sets `TxMode` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo TxMode(int value) { TxMode(this.segment(), 0L, value); return this; }

    /// {@return `delta_q_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_q_res(MemorySegment segment, long index) { return (byte) VH_delta_q_res.get(segment, 0L, index); }
    /// {@return `delta_q_res`}
    public byte delta_q_res() { return delta_q_res(this.segment(), 0L); }
    /// Sets `delta_q_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_q_res(MemorySegment segment, long index, byte value) { VH_delta_q_res.set(segment, 0L, index, value); }
    /// Sets `delta_q_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_q_res(byte value) { delta_q_res(this.segment(), 0L, value); return this; }

    /// {@return `delta_lf_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_lf_res(MemorySegment segment, long index) { return (byte) VH_delta_lf_res.get(segment, 0L, index); }
    /// {@return `delta_lf_res`}
    public byte delta_lf_res() { return delta_lf_res(this.segment(), 0L); }
    /// Sets `delta_lf_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_lf_res(MemorySegment segment, long index, byte value) { VH_delta_lf_res.set(segment, 0L, index, value); }
    /// Sets `delta_lf_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_lf_res(byte value) { delta_lf_res(this.segment(), 0L, value); return this; }

    /// {@return `ref_order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ref_order_hint(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ref_order_hint, index), LAYOUT_ref_order_hint); }
    /// {@return `ref_order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ref_order_hint(MemorySegment segment, long index, long index0) { return (byte) VH_ref_order_hint.get(segment, 0L, index, index0); }
    /// {@return `ref_order_hint`}
    public MemorySegment ref_order_hint() { return ref_order_hint(this.segment(), 0L); }
    /// {@return `ref_order_hint`}
    /// @param index0 the Index 0 of the array
    public byte ref_order_hint(long index0) { return ref_order_hint(this.segment(), 0L, index0); }
    /// Sets `ref_order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ref_order_hint(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ref_order_hint, index), LAYOUT_ref_order_hint.byteSize()); }
    /// Sets `ref_order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ref_order_hint(MemorySegment segment, long index, long index0, byte value) { VH_ref_order_hint.set(segment, 0L, index, index0, value); }
    /// Sets `ref_order_hint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_order_hint(MemorySegment value) { ref_order_hint(this.segment(), 0L, value); return this; }
    /// Sets `ref_order_hint` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_order_hint(long index0, byte value) { ref_order_hint(this.segment(), 0L, index0, value); return this; }

    /// {@return `ref_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ref_frame_idx(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ref_frame_idx, index), LAYOUT_ref_frame_idx); }
    /// {@return `ref_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ref_frame_idx(MemorySegment segment, long index, long index0) { return (byte) VH_ref_frame_idx.get(segment, 0L, index, index0); }
    /// {@return `ref_frame_idx`}
    public MemorySegment ref_frame_idx() { return ref_frame_idx(this.segment(), 0L); }
    /// {@return `ref_frame_idx`}
    /// @param index0 the Index 0 of the array
    public byte ref_frame_idx(long index0) { return ref_frame_idx(this.segment(), 0L, index0); }
    /// Sets `ref_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ref_frame_idx(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ref_frame_idx, index), LAYOUT_ref_frame_idx.byteSize()); }
    /// Sets `ref_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ref_frame_idx(MemorySegment segment, long index, long index0, byte value) { VH_ref_frame_idx.set(segment, 0L, index, index0, value); }
    /// Sets `ref_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(MemorySegment value) { ref_frame_idx(this.segment(), 0L, value); return this; }
    /// Sets `ref_frame_idx` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(long index0, byte value) { ref_frame_idx(this.segment(), 0L, index0, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
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
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `delta_frame_id_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_frame_id_minus_1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_frame_id_minus_1, index), LAYOUT_delta_frame_id_minus_1); }
    /// {@return `delta_frame_id_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int delta_frame_id_minus_1(MemorySegment segment, long index, long index0) { return (int) VH_delta_frame_id_minus_1.get(segment, 0L, index, index0); }
    /// {@return `delta_frame_id_minus_1`}
    public MemorySegment delta_frame_id_minus_1() { return delta_frame_id_minus_1(this.segment(), 0L); }
    /// {@return `delta_frame_id_minus_1`}
    /// @param index0 the Index 0 of the array
    public int delta_frame_id_minus_1(long index0) { return delta_frame_id_minus_1(this.segment(), 0L, index0); }
    /// Sets `delta_frame_id_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_frame_id_minus_1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_frame_id_minus_1, index), LAYOUT_delta_frame_id_minus_1.byteSize()); }
    /// Sets `delta_frame_id_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_frame_id_minus_1(MemorySegment segment, long index, long index0, int value) { VH_delta_frame_id_minus_1.set(segment, 0L, index, index0, value); }
    /// Sets `delta_frame_id_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(MemorySegment value) { delta_frame_id_minus_1(this.segment(), 0L, value); return this; }
    /// Sets `delta_frame_id_minus_1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(long index0, int value) { delta_frame_id_minus_1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pTileInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTileInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pTileInfo.get(segment, 0L, index); }
    /// {@return `pTileInfo`}
    public MemorySegment pTileInfo() { return pTileInfo(this.segment(), 0L); }
    /// Sets `pTileInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTileInfo(MemorySegment segment, long index, MemorySegment value) { VH_pTileInfo.set(segment, 0L, index, value); }
    /// Sets `pTileInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pTileInfo(MemorySegment value) { pTileInfo(this.segment(), 0L, value); return this; }

    /// {@return `pQuantization` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQuantization(MemorySegment segment, long index) { return (MemorySegment) VH_pQuantization.get(segment, 0L, index); }
    /// {@return `pQuantization`}
    public MemorySegment pQuantization() { return pQuantization(this.segment(), 0L); }
    /// Sets `pQuantization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQuantization(MemorySegment segment, long index, MemorySegment value) { VH_pQuantization.set(segment, 0L, index, value); }
    /// Sets `pQuantization` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pQuantization(MemorySegment value) { pQuantization(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1PictureInfo pSegmentation(MemorySegment value) { pSegmentation(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1PictureInfo pLoopFilter(MemorySegment value) { pLoopFilter(this.segment(), 0L, value); return this; }

    /// {@return `pCDEF` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCDEF(MemorySegment segment, long index) { return (MemorySegment) VH_pCDEF.get(segment, 0L, index); }
    /// {@return `pCDEF`}
    public MemorySegment pCDEF() { return pCDEF(this.segment(), 0L); }
    /// Sets `pCDEF` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCDEF(MemorySegment segment, long index, MemorySegment value) { VH_pCDEF.set(segment, 0L, index, value); }
    /// Sets `pCDEF` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pCDEF(MemorySegment value) { pCDEF(this.segment(), 0L, value); return this; }

    /// {@return `pLoopRestoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLoopRestoration(MemorySegment segment, long index) { return (MemorySegment) VH_pLoopRestoration.get(segment, 0L, index); }
    /// {@return `pLoopRestoration`}
    public MemorySegment pLoopRestoration() { return pLoopRestoration(this.segment(), 0L); }
    /// Sets `pLoopRestoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLoopRestoration(MemorySegment segment, long index, MemorySegment value) { VH_pLoopRestoration.set(segment, 0L, index, value); }
    /// Sets `pLoopRestoration` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pLoopRestoration(MemorySegment value) { pLoopRestoration(this.segment(), 0L, value); return this; }

    /// {@return `pGlobalMotion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pGlobalMotion(MemorySegment segment, long index) { return (MemorySegment) VH_pGlobalMotion.get(segment, 0L, index); }
    /// {@return `pGlobalMotion`}
    public MemorySegment pGlobalMotion() { return pGlobalMotion(this.segment(), 0L); }
    /// Sets `pGlobalMotion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pGlobalMotion(MemorySegment segment, long index, MemorySegment value) { VH_pGlobalMotion.set(segment, 0L, index, value); }
    /// Sets `pGlobalMotion` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pGlobalMotion(MemorySegment value) { pGlobalMotion(this.segment(), 0L, value); return this; }

    /// {@return `pExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pExtensionHeader(MemorySegment segment, long index) { return (MemorySegment) VH_pExtensionHeader.get(segment, 0L, index); }
    /// {@return `pExtensionHeader`}
    public MemorySegment pExtensionHeader() { return pExtensionHeader(this.segment(), 0L); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pExtensionHeader(MemorySegment segment, long index, MemorySegment value) { VH_pExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `pExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pExtensionHeader(MemorySegment value) { pExtensionHeader(this.segment(), 0L, value); return this; }

    /// {@return `pBufferRemovalTimes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferRemovalTimes(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferRemovalTimes.get(segment, 0L, index); }
    /// {@return `pBufferRemovalTimes`}
    public MemorySegment pBufferRemovalTimes() { return pBufferRemovalTimes(this.segment(), 0L); }
    /// Sets `pBufferRemovalTimes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferRemovalTimes(MemorySegment segment, long index, MemorySegment value) { VH_pBufferRemovalTimes.set(segment, 0L, index, value); }
    /// Sets `pBufferRemovalTimes` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimes(MemorySegment value) { pBufferRemovalTimes(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeAV1PictureInfo].
    public static final class Buffer extends StdVideoEncodeAV1PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeAV1PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeAV1PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeAV1PictureInfo`
        public StdVideoEncodeAV1PictureInfo asSlice(long index) { return new StdVideoEncodeAV1PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeAV1PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeAV1PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `frame_type` at the given index}
        /// @param index the index of the struct buffer
        public int frame_typeAt(long index) { return frame_type(this.segment(), index); }
        /// Sets `frame_type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frame_typeAt(long index, int value) { frame_type(this.segment(), index, value); return this; }

        /// {@return `frame_presentation_time` at the given index}
        /// @param index the index of the struct buffer
        public int frame_presentation_timeAt(long index) { return frame_presentation_time(this.segment(), index); }
        /// Sets `frame_presentation_time` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frame_presentation_timeAt(long index, int value) { frame_presentation_time(this.segment(), index, value); return this; }

        /// {@return `current_frame_id` at the given index}
        /// @param index the index of the struct buffer
        public int current_frame_idAt(long index) { return current_frame_id(this.segment(), index); }
        /// Sets `current_frame_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer current_frame_idAt(long index, int value) { current_frame_id(this.segment(), index, value); return this; }

        /// {@return `order_hint` at the given index}
        /// @param index the index of the struct buffer
        public byte order_hintAt(long index) { return order_hint(this.segment(), index); }
        /// Sets `order_hint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer order_hintAt(long index, byte value) { order_hint(this.segment(), index, value); return this; }

        /// {@return `primary_ref_frame` at the given index}
        /// @param index the index of the struct buffer
        public byte primary_ref_frameAt(long index) { return primary_ref_frame(this.segment(), index); }
        /// Sets `primary_ref_frame` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primary_ref_frameAt(long index, byte value) { primary_ref_frame(this.segment(), index, value); return this; }

        /// {@return `refresh_frame_flags` at the given index}
        /// @param index the index of the struct buffer
        public byte refresh_frame_flagsAt(long index) { return refresh_frame_flags(this.segment(), index); }
        /// Sets `refresh_frame_flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer refresh_frame_flagsAt(long index, byte value) { refresh_frame_flags(this.segment(), index, value); return this; }

        /// {@return `coded_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte coded_denomAt(long index) { return coded_denom(this.segment(), index); }
        /// Sets `coded_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer coded_denomAt(long index, byte value) { coded_denom(this.segment(), index, value); return this; }

        /// {@return `render_width_minus_1` at the given index}
        /// @param index the index of the struct buffer
        public short render_width_minus_1At(long index) { return render_width_minus_1(this.segment(), index); }
        /// Sets `render_width_minus_1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer render_width_minus_1At(long index, short value) { render_width_minus_1(this.segment(), index, value); return this; }

        /// {@return `render_height_minus_1` at the given index}
        /// @param index the index of the struct buffer
        public short render_height_minus_1At(long index) { return render_height_minus_1(this.segment(), index); }
        /// Sets `render_height_minus_1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer render_height_minus_1At(long index, short value) { render_height_minus_1(this.segment(), index, value); return this; }

        /// {@return `interpolation_filter` at the given index}
        /// @param index the index of the struct buffer
        public int interpolation_filterAt(long index) { return interpolation_filter(this.segment(), index); }
        /// Sets `interpolation_filter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer interpolation_filterAt(long index, int value) { interpolation_filter(this.segment(), index, value); return this; }

        /// {@return `TxMode` at the given index}
        /// @param index the index of the struct buffer
        public int TxModeAt(long index) { return TxMode(this.segment(), index); }
        /// Sets `TxMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer TxModeAt(long index, int value) { TxMode(this.segment(), index, value); return this; }

        /// {@return `delta_q_res` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_q_resAt(long index) { return delta_q_res(this.segment(), index); }
        /// Sets `delta_q_res` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_resAt(long index, byte value) { delta_q_res(this.segment(), index, value); return this; }

        /// {@return `delta_lf_res` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_lf_resAt(long index) { return delta_lf_res(this.segment(), index); }
        /// Sets `delta_lf_res` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_lf_resAt(long index, byte value) { delta_lf_res(this.segment(), index, value); return this; }

        /// {@return `ref_order_hint` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment ref_order_hintAt(long index) { return ref_order_hint(this.segment(), index); }
        /// {@return `ref_order_hint` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte ref_order_hintAt(long index, long index0) { return ref_order_hint(this.segment(), index, index0); }
        /// Sets `ref_order_hint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ref_order_hintAt(long index, MemorySegment value) { ref_order_hint(this.segment(), index, value); return this; }
        /// Sets `ref_order_hint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer ref_order_hintAt(long index, long index0, byte value) { ref_order_hint(this.segment(), index, index0, value); return this; }

        /// {@return `ref_frame_idx` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment ref_frame_idxAt(long index) { return ref_frame_idx(this.segment(), index); }
        /// {@return `ref_frame_idx` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte ref_frame_idxAt(long index, long index0) { return ref_frame_idx(this.segment(), index, index0); }
        /// Sets `ref_frame_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ref_frame_idxAt(long index, MemorySegment value) { ref_frame_idx(this.segment(), index, value); return this; }
        /// Sets `ref_frame_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer ref_frame_idxAt(long index, long index0, byte value) { ref_frame_idx(this.segment(), index, index0, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
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
        public Buffer reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

        /// {@return `delta_frame_id_minus_1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_frame_id_minus_1At(long index) { return delta_frame_id_minus_1(this.segment(), index); }
        /// {@return `delta_frame_id_minus_1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int delta_frame_id_minus_1At(long index, long index0) { return delta_frame_id_minus_1(this.segment(), index, index0); }
        /// Sets `delta_frame_id_minus_1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_frame_id_minus_1At(long index, MemorySegment value) { delta_frame_id_minus_1(this.segment(), index, value); return this; }
        /// Sets `delta_frame_id_minus_1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_frame_id_minus_1At(long index, long index0, int value) { delta_frame_id_minus_1(this.segment(), index, index0, value); return this; }

        /// {@return `pTileInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pTileInfoAt(long index) { return pTileInfo(this.segment(), index); }
        /// Sets `pTileInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pTileInfoAt(long index, MemorySegment value) { pTileInfo(this.segment(), index, value); return this; }

        /// {@return `pQuantization` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pQuantizationAt(long index) { return pQuantization(this.segment(), index); }
        /// Sets `pQuantization` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pQuantizationAt(long index, MemorySegment value) { pQuantization(this.segment(), index, value); return this; }

        /// {@return `pSegmentation` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSegmentationAt(long index) { return pSegmentation(this.segment(), index); }
        /// Sets `pSegmentation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSegmentationAt(long index, MemorySegment value) { pSegmentation(this.segment(), index, value); return this; }

        /// {@return `pLoopFilter` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLoopFilterAt(long index) { return pLoopFilter(this.segment(), index); }
        /// Sets `pLoopFilter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLoopFilterAt(long index, MemorySegment value) { pLoopFilter(this.segment(), index, value); return this; }

        /// {@return `pCDEF` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCDEFAt(long index) { return pCDEF(this.segment(), index); }
        /// Sets `pCDEF` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCDEFAt(long index, MemorySegment value) { pCDEF(this.segment(), index, value); return this; }

        /// {@return `pLoopRestoration` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLoopRestorationAt(long index) { return pLoopRestoration(this.segment(), index); }
        /// Sets `pLoopRestoration` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLoopRestorationAt(long index, MemorySegment value) { pLoopRestoration(this.segment(), index, value); return this; }

        /// {@return `pGlobalMotion` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pGlobalMotionAt(long index) { return pGlobalMotion(this.segment(), index); }
        /// Sets `pGlobalMotion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pGlobalMotionAt(long index, MemorySegment value) { pGlobalMotion(this.segment(), index, value); return this; }

        /// {@return `pExtensionHeader` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pExtensionHeaderAt(long index) { return pExtensionHeader(this.segment(), index); }
        /// Sets `pExtensionHeader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pExtensionHeaderAt(long index, MemorySegment value) { pExtensionHeader(this.segment(), index, value); return this; }

        /// {@return `pBufferRemovalTimes` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pBufferRemovalTimesAt(long index) { return pBufferRemovalTimes(this.segment(), index); }
        /// Sets `pBufferRemovalTimes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pBufferRemovalTimesAt(long index, MemorySegment value) { pBufferRemovalTimes(this.segment(), index, value); return this; }

    }
}
