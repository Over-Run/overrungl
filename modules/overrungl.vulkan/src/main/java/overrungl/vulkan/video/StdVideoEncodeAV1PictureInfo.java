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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### frame_type
/// [VarHandle][#VH_frame_type] - [Getter][#frame_type()] - [Setter][#frame_type(int)]
/// ### frame_presentation_time
/// [VarHandle][#VH_frame_presentation_time] - [Getter][#frame_presentation_time()] - [Setter][#frame_presentation_time(int)]
/// ### current_frame_id
/// [VarHandle][#VH_current_frame_id] - [Getter][#current_frame_id()] - [Setter][#current_frame_id(int)]
/// ### order_hint
/// [VarHandle][#VH_order_hint] - [Getter][#order_hint()] - [Setter][#order_hint(byte)]
/// ### primary_ref_frame
/// [VarHandle][#VH_primary_ref_frame] - [Getter][#primary_ref_frame()] - [Setter][#primary_ref_frame(byte)]
/// ### refresh_frame_flags
/// [VarHandle][#VH_refresh_frame_flags] - [Getter][#refresh_frame_flags()] - [Setter][#refresh_frame_flags(byte)]
/// ### coded_denom
/// [VarHandle][#VH_coded_denom] - [Getter][#coded_denom()] - [Setter][#coded_denom(byte)]
/// ### render_width_minus_1
/// [VarHandle][#VH_render_width_minus_1] - [Getter][#render_width_minus_1()] - [Setter][#render_width_minus_1(short)]
/// ### render_height_minus_1
/// [VarHandle][#VH_render_height_minus_1] - [Getter][#render_height_minus_1()] - [Setter][#render_height_minus_1(short)]
/// ### interpolation_filter
/// [VarHandle][#VH_interpolation_filter] - [Getter][#interpolation_filter()] - [Setter][#interpolation_filter(int)]
/// ### TxMode
/// [VarHandle][#VH_TxMode] - [Getter][#TxMode()] - [Setter][#TxMode(int)]
/// ### delta_q_res
/// [VarHandle][#VH_delta_q_res] - [Getter][#delta_q_res()] - [Setter][#delta_q_res(byte)]
/// ### delta_lf_res
/// [VarHandle][#VH_delta_lf_res] - [Getter][#delta_lf_res()] - [Setter][#delta_lf_res(byte)]
/// ### ref_order_hint
/// [VarHandle][#VH_ref_order_hint] - [Getter][#ref_order_hint()] - [Setter][#ref_order_hint(byte)]
/// ### ref_frame_idx
/// [VarHandle][#VH_ref_frame_idx] - [Getter][#ref_frame_idx()] - [Setter][#ref_frame_idx(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### delta_frame_id_minus_1
/// [VarHandle][#VH_delta_frame_id_minus_1] - [Getter][#delta_frame_id_minus_1()] - [Setter][#delta_frame_id_minus_1(int)]
/// ### pTileInfo
/// [VarHandle][#VH_pTileInfo] - [Getter][#pTileInfo()] - [Setter][#pTileInfo(java.lang.foreign.MemorySegment)]
/// ### pQuantization
/// [VarHandle][#VH_pQuantization] - [Getter][#pQuantization()] - [Setter][#pQuantization(java.lang.foreign.MemorySegment)]
/// ### pSegmentation
/// [VarHandle][#VH_pSegmentation] - [Getter][#pSegmentation()] - [Setter][#pSegmentation(java.lang.foreign.MemorySegment)]
/// ### pLoopFilter
/// [VarHandle][#VH_pLoopFilter] - [Getter][#pLoopFilter()] - [Setter][#pLoopFilter(java.lang.foreign.MemorySegment)]
/// ### pCDEF
/// [VarHandle][#VH_pCDEF] - [Getter][#pCDEF()] - [Setter][#pCDEF(java.lang.foreign.MemorySegment)]
/// ### pLoopRestoration
/// [VarHandle][#VH_pLoopRestoration] - [Getter][#pLoopRestoration()] - [Setter][#pLoopRestoration(java.lang.foreign.MemorySegment)]
/// ### pGlobalMotion
/// [VarHandle][#VH_pGlobalMotion] - [Getter][#pGlobalMotion()] - [Setter][#pGlobalMotion(java.lang.foreign.MemorySegment)]
/// ### pExtensionHeader
/// [VarHandle][#VH_pExtensionHeader] - [Getter][#pExtensionHeader()] - [Setter][#pExtensionHeader(java.lang.foreign.MemorySegment)]
/// ### pBufferRemovalTimes
/// [VarHandle][#VH_pBufferRemovalTimes] - [Getter][#pBufferRemovalTimes()] - [Setter][#pBufferRemovalTimes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1PictureInfo {
///     StdVideoEncodeAV1PictureInfoFlags flags;
///     StdVideoAV1FrameType frame_type;
///     uint32_t frame_presentation_time;
///     uint32_t current_frame_id;
///     uint8_t order_hint;
///     uint8_t primary_ref_frame;
///     uint8_t refresh_frame_flags;
///     uint8_t coded_denom;
///     uint16_t render_width_minus_1;
///     uint16_t render_height_minus_1;
///     StdVideoAV1InterpolationFilter interpolation_filter;
///     StdVideoAV1TxMode TxMode;
///     uint8_t delta_q_res;
///     uint8_t delta_lf_res;
///     uint8_t [ ] ref_order_hint;
///     int8_t [ ] ref_frame_idx;
///     uint8_t [3] reserved1;
///     uint32_t [ ] delta_frame_id_minus_1;
///     const StdVideoAV1TileInfo * pTileInfo;
///     const StdVideoAV1Quantization * pQuantization;
///     const StdVideoAV1Segmentation * pSegmentation;
///     const StdVideoAV1LoopFilter * pLoopFilter;
///     const StdVideoAV1CDEF * pCDEF;
///     const StdVideoAV1LoopRestoration * pLoopRestoration;
///     const StdVideoAV1GlobalMotion * pGlobalMotion;
///     const StdVideoEncodeAV1ExtensionHeader * pExtensionHeader;
///     const uint32_t * pBufferRemovalTimes;
/// } StdVideoEncodeAV1PictureInfo;
/// ```
public final class StdVideoEncodeAV1PictureInfo extends Struct {
    /// The struct layout of `StdVideoEncodeAV1PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
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
        ValueLayout.JAVA_BYTE.withName("ref_order_hint"),
        ValueLayout.JAVA_BYTE.withName("ref_frame_idx"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("delta_frame_id_minus_1"),
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
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `frame_presentation_time` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_presentation_time = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_presentation_time"));
    /// The [VarHandle] of `current_frame_id` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_current_frame_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("current_frame_id"));
    /// The [VarHandle] of `order_hint` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_order_hint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("order_hint"));
    /// The [VarHandle] of `primary_ref_frame` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_primary_ref_frame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_ref_frame"));
    /// The [VarHandle] of `refresh_frame_flags` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_refresh_frame_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refresh_frame_flags"));
    /// The [VarHandle] of `coded_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_coded_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coded_denom"));
    /// The [VarHandle] of `render_width_minus_1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_render_width_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("render_width_minus_1"));
    /// The [VarHandle] of `render_height_minus_1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_render_height_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("render_height_minus_1"));
    /// The [VarHandle] of `interpolation_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_interpolation_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("interpolation_filter"));
    /// The [VarHandle] of `TxMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_TxMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TxMode"));
    /// The [VarHandle] of `delta_q_res` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_q_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_res"));
    /// The [VarHandle] of `delta_lf_res` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_lf_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_lf_res"));
    /// The [VarHandle] of `ref_order_hint` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ref_order_hint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_order_hint"));
    /// The [VarHandle] of `ref_frame_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ref_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_frame_idx"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `delta_frame_id_minus_1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_frame_id_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_frame_id_minus_1"));
    /// The [VarHandle] of `pTileInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTileInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileInfo"));
    /// The [VarHandle] of `pQuantization` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQuantization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQuantization"));
    /// The [VarHandle] of `pSegmentation` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSegmentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSegmentation"));
    /// The [VarHandle] of `pLoopFilter` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLoopFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopFilter"));
    /// The [VarHandle] of `pCDEF` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCDEF = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCDEF"));
    /// The [VarHandle] of `pLoopRestoration` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLoopRestoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopRestoration"));
    /// The [VarHandle] of `pGlobalMotion` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pGlobalMotion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGlobalMotion"));
    /// The [VarHandle] of `pExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtensionHeader"));
    /// The [VarHandle] of `pBufferRemovalTimes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBufferRemovalTimes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferRemovalTimes"));

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1PictureInfo(segment); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1PictureInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1PictureInfo`
    public static StdVideoEncodeAV1PictureInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1PictureInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeAV1PictureInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeAV1PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo flagsAt(long index, @CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo flags(@CType("StdVideoEncodeAV1PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment, long index) { return (int) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_frame_type(segment, 0L); }
    /// {@return `frame_type` at the given index}
    /// @param index the index
    public @CType("StdVideoAV1FrameType") int frame_typeAt(long index) { return StdVideoEncodeAV1PictureInfo.get_frame_type(this.segment(), index); }
    /// {@return `frame_type`}
    public @CType("StdVideoAV1FrameType") int frame_type() { return StdVideoEncodeAV1PictureInfo.get_frame_type(this.segment()); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, long index, @CType("StdVideoAV1FrameType") int value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, @CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1PictureInfo.set_frame_type(segment, 0L, value); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo frame_typeAt(long index, @CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1PictureInfo.set_frame_type(this.segment(), index, value); return this; }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo frame_type(@CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1PictureInfo.set_frame_type(this.segment(), value); return this; }

    /// {@return `frame_presentation_time` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_presentation_time(MemorySegment segment, long index) { return (int) VH_frame_presentation_time.get(segment, 0L, index); }
    /// {@return `frame_presentation_time`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_presentation_time(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_frame_presentation_time(segment, 0L); }
    /// {@return `frame_presentation_time` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frame_presentation_timeAt(long index) { return StdVideoEncodeAV1PictureInfo.get_frame_presentation_time(this.segment(), index); }
    /// {@return `frame_presentation_time`}
    public @CType("uint32_t") int frame_presentation_time() { return StdVideoEncodeAV1PictureInfo.get_frame_presentation_time(this.segment()); }
    /// Sets `frame_presentation_time` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_presentation_time(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_presentation_time.set(segment, 0L, index, value); }
    /// Sets `frame_presentation_time` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_presentation_time(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_frame_presentation_time(segment, 0L, value); }
    /// Sets `frame_presentation_time` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo frame_presentation_timeAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_frame_presentation_time(this.segment(), index, value); return this; }
    /// Sets `frame_presentation_time` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo frame_presentation_time(@CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_frame_presentation_time(this.segment(), value); return this; }

    /// {@return `current_frame_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_current_frame_id(MemorySegment segment, long index) { return (int) VH_current_frame_id.get(segment, 0L, index); }
    /// {@return `current_frame_id`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_current_frame_id(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_current_frame_id(segment, 0L); }
    /// {@return `current_frame_id` at the given index}
    /// @param index the index
    public @CType("uint32_t") int current_frame_idAt(long index) { return StdVideoEncodeAV1PictureInfo.get_current_frame_id(this.segment(), index); }
    /// {@return `current_frame_id`}
    public @CType("uint32_t") int current_frame_id() { return StdVideoEncodeAV1PictureInfo.get_current_frame_id(this.segment()); }
    /// Sets `current_frame_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_current_frame_id(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_current_frame_id.set(segment, 0L, index, value); }
    /// Sets `current_frame_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_current_frame_id(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_current_frame_id(segment, 0L, value); }
    /// Sets `current_frame_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo current_frame_idAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_current_frame_id(this.segment(), index, value); return this; }
    /// Sets `current_frame_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo current_frame_id(@CType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.set_current_frame_id(this.segment(), value); return this; }

    /// {@return `order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_order_hint(MemorySegment segment, long index) { return (byte) VH_order_hint.get(segment, 0L, index); }
    /// {@return `order_hint`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_order_hint(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_order_hint(segment, 0L); }
    /// {@return `order_hint` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte order_hintAt(long index) { return StdVideoEncodeAV1PictureInfo.get_order_hint(this.segment(), index); }
    /// {@return `order_hint`}
    public @CType("uint8_t") byte order_hint() { return StdVideoEncodeAV1PictureInfo.get_order_hint(this.segment()); }
    /// Sets `order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_order_hint(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_order_hint.set(segment, 0L, index, value); }
    /// Sets `order_hint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_order_hint(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_order_hint(segment, 0L, value); }
    /// Sets `order_hint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo order_hintAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_order_hint(this.segment(), index, value); return this; }
    /// Sets `order_hint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo order_hint(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_order_hint(this.segment(), value); return this; }

    /// {@return `primary_ref_frame` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_primary_ref_frame(MemorySegment segment, long index) { return (byte) VH_primary_ref_frame.get(segment, 0L, index); }
    /// {@return `primary_ref_frame`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_primary_ref_frame(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_primary_ref_frame(segment, 0L); }
    /// {@return `primary_ref_frame` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte primary_ref_frameAt(long index) { return StdVideoEncodeAV1PictureInfo.get_primary_ref_frame(this.segment(), index); }
    /// {@return `primary_ref_frame`}
    public @CType("uint8_t") byte primary_ref_frame() { return StdVideoEncodeAV1PictureInfo.get_primary_ref_frame(this.segment()); }
    /// Sets `primary_ref_frame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primary_ref_frame(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_primary_ref_frame.set(segment, 0L, index, value); }
    /// Sets `primary_ref_frame` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primary_ref_frame(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_primary_ref_frame(segment, 0L, value); }
    /// Sets `primary_ref_frame` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo primary_ref_frameAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_primary_ref_frame(this.segment(), index, value); return this; }
    /// Sets `primary_ref_frame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo primary_ref_frame(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_primary_ref_frame(this.segment(), value); return this; }

    /// {@return `refresh_frame_flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_refresh_frame_flags(MemorySegment segment, long index) { return (byte) VH_refresh_frame_flags.get(segment, 0L, index); }
    /// {@return `refresh_frame_flags`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_refresh_frame_flags(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_refresh_frame_flags(segment, 0L); }
    /// {@return `refresh_frame_flags` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte refresh_frame_flagsAt(long index) { return StdVideoEncodeAV1PictureInfo.get_refresh_frame_flags(this.segment(), index); }
    /// {@return `refresh_frame_flags`}
    public @CType("uint8_t") byte refresh_frame_flags() { return StdVideoEncodeAV1PictureInfo.get_refresh_frame_flags(this.segment()); }
    /// Sets `refresh_frame_flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refresh_frame_flags(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_refresh_frame_flags.set(segment, 0L, index, value); }
    /// Sets `refresh_frame_flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refresh_frame_flags(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_refresh_frame_flags(segment, 0L, value); }
    /// Sets `refresh_frame_flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo refresh_frame_flagsAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_refresh_frame_flags(this.segment(), index, value); return this; }
    /// Sets `refresh_frame_flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo refresh_frame_flags(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_refresh_frame_flags(this.segment(), value); return this; }

    /// {@return `coded_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_coded_denom(MemorySegment segment, long index) { return (byte) VH_coded_denom.get(segment, 0L, index); }
    /// {@return `coded_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_coded_denom(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_coded_denom(segment, 0L); }
    /// {@return `coded_denom` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte coded_denomAt(long index) { return StdVideoEncodeAV1PictureInfo.get_coded_denom(this.segment(), index); }
    /// {@return `coded_denom`}
    public @CType("uint8_t") byte coded_denom() { return StdVideoEncodeAV1PictureInfo.get_coded_denom(this.segment()); }
    /// Sets `coded_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coded_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_coded_denom.set(segment, 0L, index, value); }
    /// Sets `coded_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coded_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_coded_denom(segment, 0L, value); }
    /// Sets `coded_denom` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo coded_denomAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_coded_denom(this.segment(), index, value); return this; }
    /// Sets `coded_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo coded_denom(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_coded_denom(this.segment(), value); return this; }

    /// {@return `render_width_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_render_width_minus_1(MemorySegment segment, long index) { return (short) VH_render_width_minus_1.get(segment, 0L, index); }
    /// {@return `render_width_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_render_width_minus_1(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_render_width_minus_1(segment, 0L); }
    /// {@return `render_width_minus_1` at the given index}
    /// @param index the index
    public @CType("uint16_t") short render_width_minus_1At(long index) { return StdVideoEncodeAV1PictureInfo.get_render_width_minus_1(this.segment(), index); }
    /// {@return `render_width_minus_1`}
    public @CType("uint16_t") short render_width_minus_1() { return StdVideoEncodeAV1PictureInfo.get_render_width_minus_1(this.segment()); }
    /// Sets `render_width_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_render_width_minus_1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_render_width_minus_1.set(segment, 0L, index, value); }
    /// Sets `render_width_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_render_width_minus_1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_width_minus_1(segment, 0L, value); }
    /// Sets `render_width_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_width_minus_1At(long index, @CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_width_minus_1(this.segment(), index, value); return this; }
    /// Sets `render_width_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_width_minus_1(@CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_width_minus_1(this.segment(), value); return this; }

    /// {@return `render_height_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_render_height_minus_1(MemorySegment segment, long index) { return (short) VH_render_height_minus_1.get(segment, 0L, index); }
    /// {@return `render_height_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_render_height_minus_1(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_render_height_minus_1(segment, 0L); }
    /// {@return `render_height_minus_1` at the given index}
    /// @param index the index
    public @CType("uint16_t") short render_height_minus_1At(long index) { return StdVideoEncodeAV1PictureInfo.get_render_height_minus_1(this.segment(), index); }
    /// {@return `render_height_minus_1`}
    public @CType("uint16_t") short render_height_minus_1() { return StdVideoEncodeAV1PictureInfo.get_render_height_minus_1(this.segment()); }
    /// Sets `render_height_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_render_height_minus_1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_render_height_minus_1.set(segment, 0L, index, value); }
    /// Sets `render_height_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_render_height_minus_1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_height_minus_1(segment, 0L, value); }
    /// Sets `render_height_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_height_minus_1At(long index, @CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_height_minus_1(this.segment(), index, value); return this; }
    /// Sets `render_height_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo render_height_minus_1(@CType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.set_render_height_minus_1(this.segment(), value); return this; }

    /// {@return `interpolation_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1InterpolationFilter") int get_interpolation_filter(MemorySegment segment, long index) { return (int) VH_interpolation_filter.get(segment, 0L, index); }
    /// {@return `interpolation_filter`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1InterpolationFilter") int get_interpolation_filter(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_interpolation_filter(segment, 0L); }
    /// {@return `interpolation_filter` at the given index}
    /// @param index the index
    public @CType("StdVideoAV1InterpolationFilter") int interpolation_filterAt(long index) { return StdVideoEncodeAV1PictureInfo.get_interpolation_filter(this.segment(), index); }
    /// {@return `interpolation_filter`}
    public @CType("StdVideoAV1InterpolationFilter") int interpolation_filter() { return StdVideoEncodeAV1PictureInfo.get_interpolation_filter(this.segment()); }
    /// Sets `interpolation_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_interpolation_filter(MemorySegment segment, long index, @CType("StdVideoAV1InterpolationFilter") int value) { VH_interpolation_filter.set(segment, 0L, index, value); }
    /// Sets `interpolation_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_interpolation_filter(MemorySegment segment, @CType("StdVideoAV1InterpolationFilter") int value) { StdVideoEncodeAV1PictureInfo.set_interpolation_filter(segment, 0L, value); }
    /// Sets `interpolation_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo interpolation_filterAt(long index, @CType("StdVideoAV1InterpolationFilter") int value) { StdVideoEncodeAV1PictureInfo.set_interpolation_filter(this.segment(), index, value); return this; }
    /// Sets `interpolation_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo interpolation_filter(@CType("StdVideoAV1InterpolationFilter") int value) { StdVideoEncodeAV1PictureInfo.set_interpolation_filter(this.segment(), value); return this; }

    /// {@return `TxMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1TxMode") int get_TxMode(MemorySegment segment, long index) { return (int) VH_TxMode.get(segment, 0L, index); }
    /// {@return `TxMode`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1TxMode") int get_TxMode(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_TxMode(segment, 0L); }
    /// {@return `TxMode` at the given index}
    /// @param index the index
    public @CType("StdVideoAV1TxMode") int TxModeAt(long index) { return StdVideoEncodeAV1PictureInfo.get_TxMode(this.segment(), index); }
    /// {@return `TxMode`}
    public @CType("StdVideoAV1TxMode") int TxMode() { return StdVideoEncodeAV1PictureInfo.get_TxMode(this.segment()); }
    /// Sets `TxMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TxMode(MemorySegment segment, long index, @CType("StdVideoAV1TxMode") int value) { VH_TxMode.set(segment, 0L, index, value); }
    /// Sets `TxMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TxMode(MemorySegment segment, @CType("StdVideoAV1TxMode") int value) { StdVideoEncodeAV1PictureInfo.set_TxMode(segment, 0L, value); }
    /// Sets `TxMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo TxModeAt(long index, @CType("StdVideoAV1TxMode") int value) { StdVideoEncodeAV1PictureInfo.set_TxMode(this.segment(), index, value); return this; }
    /// Sets `TxMode` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo TxMode(@CType("StdVideoAV1TxMode") int value) { StdVideoEncodeAV1PictureInfo.set_TxMode(this.segment(), value); return this; }

    /// {@return `delta_q_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_q_res(MemorySegment segment, long index) { return (byte) VH_delta_q_res.get(segment, 0L, index); }
    /// {@return `delta_q_res`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_q_res(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_delta_q_res(segment, 0L); }
    /// {@return `delta_q_res` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte delta_q_resAt(long index) { return StdVideoEncodeAV1PictureInfo.get_delta_q_res(this.segment(), index); }
    /// {@return `delta_q_res`}
    public @CType("uint8_t") byte delta_q_res() { return StdVideoEncodeAV1PictureInfo.get_delta_q_res(this.segment()); }
    /// Sets `delta_q_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_q_res(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_q_res.set(segment, 0L, index, value); }
    /// Sets `delta_q_res` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_q_res(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_q_res(segment, 0L, value); }
    /// Sets `delta_q_res` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_q_resAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_q_res(this.segment(), index, value); return this; }
    /// Sets `delta_q_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_q_res(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_q_res(this.segment(), value); return this; }

    /// {@return `delta_lf_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_lf_res(MemorySegment segment, long index) { return (byte) VH_delta_lf_res.get(segment, 0L, index); }
    /// {@return `delta_lf_res`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_lf_res(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_delta_lf_res(segment, 0L); }
    /// {@return `delta_lf_res` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte delta_lf_resAt(long index) { return StdVideoEncodeAV1PictureInfo.get_delta_lf_res(this.segment(), index); }
    /// {@return `delta_lf_res`}
    public @CType("uint8_t") byte delta_lf_res() { return StdVideoEncodeAV1PictureInfo.get_delta_lf_res(this.segment()); }
    /// Sets `delta_lf_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_lf_res(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_lf_res.set(segment, 0L, index, value); }
    /// Sets `delta_lf_res` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_lf_res(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_lf_res(segment, 0L, value); }
    /// Sets `delta_lf_res` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_lf_resAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_lf_res(this.segment(), index, value); return this; }
    /// Sets `delta_lf_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_lf_res(@CType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.set_delta_lf_res(this.segment(), value); return this; }

    /// {@return `ref_order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_ref_order_hint(MemorySegment segment, long index) { return (byte) VH_ref_order_hint.get(segment, 0L, index); }
    /// {@return `ref_order_hint`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_ref_order_hint(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_ref_order_hint(segment, 0L); }
    /// {@return `ref_order_hint` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte ref_order_hintAt(long index) { return StdVideoEncodeAV1PictureInfo.get_ref_order_hint(this.segment(), index); }
    /// {@return `ref_order_hint`}
    public @CType("uint8_t [ ]") byte ref_order_hint() { return StdVideoEncodeAV1PictureInfo.get_ref_order_hint(this.segment()); }
    /// Sets `ref_order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ref_order_hint(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_ref_order_hint.set(segment, 0L, index, value); }
    /// Sets `ref_order_hint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ref_order_hint(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_order_hint(segment, 0L, value); }
    /// Sets `ref_order_hint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_order_hintAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_order_hint(this.segment(), index, value); return this; }
    /// Sets `ref_order_hint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_order_hint(@CType("uint8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_order_hint(this.segment(), value); return this; }

    /// {@return `ref_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_ref_frame_idx(MemorySegment segment, long index) { return (byte) VH_ref_frame_idx.get(segment, 0L, index); }
    /// {@return `ref_frame_idx`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_ref_frame_idx(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_ref_frame_idx(segment, 0L); }
    /// {@return `ref_frame_idx` at the given index}
    /// @param index the index
    public @CType("int8_t [ ]") byte ref_frame_idxAt(long index) { return StdVideoEncodeAV1PictureInfo.get_ref_frame_idx(this.segment(), index); }
    /// {@return `ref_frame_idx`}
    public @CType("int8_t [ ]") byte ref_frame_idx() { return StdVideoEncodeAV1PictureInfo.get_ref_frame_idx(this.segment()); }
    /// Sets `ref_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ref_frame_idx(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_ref_frame_idx.set(segment, 0L, index, value); }
    /// Sets `ref_frame_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ref_frame_idx(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_frame_idx(segment, 0L, value); }
    /// Sets `ref_frame_idx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_frame_idxAt(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_frame_idx(this.segment(), index, value); return this; }
    /// Sets `ref_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(@CType("int8_t [ ]") byte value) { StdVideoEncodeAV1PictureInfo.set_ref_frame_idx(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t [3]") byte reserved1At(long index) { return StdVideoEncodeAV1PictureInfo.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t [3]") byte reserved1() { return StdVideoEncodeAV1PictureInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [3]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [3]") byte value) { StdVideoEncodeAV1PictureInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo reserved1At(long index, @CType("uint8_t [3]") byte value) { StdVideoEncodeAV1PictureInfo.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo reserved1(@CType("uint8_t [3]") byte value) { StdVideoEncodeAV1PictureInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `delta_frame_id_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_delta_frame_id_minus_1(MemorySegment segment, long index) { return (int) VH_delta_frame_id_minus_1.get(segment, 0L, index); }
    /// {@return `delta_frame_id_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_delta_frame_id_minus_1(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_delta_frame_id_minus_1(segment, 0L); }
    /// {@return `delta_frame_id_minus_1` at the given index}
    /// @param index the index
    public @CType("uint32_t [ ]") int delta_frame_id_minus_1At(long index) { return StdVideoEncodeAV1PictureInfo.get_delta_frame_id_minus_1(this.segment(), index); }
    /// {@return `delta_frame_id_minus_1`}
    public @CType("uint32_t [ ]") int delta_frame_id_minus_1() { return StdVideoEncodeAV1PictureInfo.get_delta_frame_id_minus_1(this.segment()); }
    /// Sets `delta_frame_id_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_frame_id_minus_1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_delta_frame_id_minus_1.set(segment, 0L, index, value); }
    /// Sets `delta_frame_id_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_frame_id_minus_1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoEncodeAV1PictureInfo.set_delta_frame_id_minus_1(segment, 0L, value); }
    /// Sets `delta_frame_id_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1At(long index, @CType("uint32_t [ ]") int value) { StdVideoEncodeAV1PictureInfo.set_delta_frame_id_minus_1(this.segment(), index, value); return this; }
    /// Sets `delta_frame_id_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(@CType("uint32_t [ ]") int value) { StdVideoEncodeAV1PictureInfo.set_delta_frame_id_minus_1(this.segment(), value); return this; }

    /// {@return `pTileInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment get_pTileInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTileInfo.get(segment, 0L, index); }
    /// {@return `pTileInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment get_pTileInfo(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pTileInfo(segment, 0L); }
    /// {@return `pTileInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment pTileInfoAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pTileInfo(this.segment(), index); }
    /// {@return `pTileInfo`}
    public @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment pTileInfo() { return StdVideoEncodeAV1PictureInfo.get_pTileInfo(this.segment()); }
    /// Sets `pTileInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTileInfo(MemorySegment segment, long index, @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment value) { VH_pTileInfo.set(segment, 0L, index, value); }
    /// Sets `pTileInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTileInfo(MemorySegment segment, @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pTileInfo(segment, 0L, value); }
    /// Sets `pTileInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pTileInfoAt(long index, @CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pTileInfo(this.segment(), index, value); return this; }
    /// Sets `pTileInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pTileInfo(@CType("const StdVideoAV1TileInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pTileInfo(this.segment(), value); return this; }

    /// {@return `pQuantization` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment get_pQuantization(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQuantization.get(segment, 0L, index); }
    /// {@return `pQuantization`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment get_pQuantization(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pQuantization(segment, 0L); }
    /// {@return `pQuantization` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment pQuantizationAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pQuantization(this.segment(), index); }
    /// {@return `pQuantization`}
    public @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment pQuantization() { return StdVideoEncodeAV1PictureInfo.get_pQuantization(this.segment()); }
    /// Sets `pQuantization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQuantization(MemorySegment segment, long index, @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment value) { VH_pQuantization.set(segment, 0L, index, value); }
    /// Sets `pQuantization` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQuantization(MemorySegment segment, @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pQuantization(segment, 0L, value); }
    /// Sets `pQuantization` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pQuantizationAt(long index, @CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pQuantization(this.segment(), index, value); return this; }
    /// Sets `pQuantization` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pQuantization(@CType("const StdVideoAV1Quantization *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pQuantization(this.segment(), value); return this; }

    /// {@return `pSegmentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment get_pSegmentation(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSegmentation.get(segment, 0L, index); }
    /// {@return `pSegmentation`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment get_pSegmentation(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pSegmentation(segment, 0L); }
    /// {@return `pSegmentation` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment pSegmentationAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pSegmentation(this.segment(), index); }
    /// {@return `pSegmentation`}
    public @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment pSegmentation() { return StdVideoEncodeAV1PictureInfo.get_pSegmentation(this.segment()); }
    /// Sets `pSegmentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSegmentation(MemorySegment segment, long index, @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment value) { VH_pSegmentation.set(segment, 0L, index, value); }
    /// Sets `pSegmentation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSegmentation(MemorySegment segment, @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pSegmentation(segment, 0L, value); }
    /// Sets `pSegmentation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pSegmentationAt(long index, @CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pSegmentation(this.segment(), index, value); return this; }
    /// Sets `pSegmentation` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pSegmentation(@CType("const StdVideoAV1Segmentation *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pSegmentation(this.segment(), value); return this; }

    /// {@return `pLoopFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment get_pLoopFilter(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLoopFilter.get(segment, 0L, index); }
    /// {@return `pLoopFilter`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment get_pLoopFilter(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pLoopFilter(segment, 0L); }
    /// {@return `pLoopFilter` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment pLoopFilterAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pLoopFilter(this.segment(), index); }
    /// {@return `pLoopFilter`}
    public @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment pLoopFilter() { return StdVideoEncodeAV1PictureInfo.get_pLoopFilter(this.segment()); }
    /// Sets `pLoopFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLoopFilter(MemorySegment segment, long index, @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment value) { VH_pLoopFilter.set(segment, 0L, index, value); }
    /// Sets `pLoopFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLoopFilter(MemorySegment segment, @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopFilter(segment, 0L, value); }
    /// Sets `pLoopFilter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pLoopFilterAt(long index, @CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopFilter(this.segment(), index, value); return this; }
    /// Sets `pLoopFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pLoopFilter(@CType("const StdVideoAV1LoopFilter *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopFilter(this.segment(), value); return this; }

    /// {@return `pCDEF` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment get_pCDEF(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCDEF.get(segment, 0L, index); }
    /// {@return `pCDEF`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment get_pCDEF(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pCDEF(segment, 0L); }
    /// {@return `pCDEF` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment pCDEFAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pCDEF(this.segment(), index); }
    /// {@return `pCDEF`}
    public @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment pCDEF() { return StdVideoEncodeAV1PictureInfo.get_pCDEF(this.segment()); }
    /// Sets `pCDEF` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCDEF(MemorySegment segment, long index, @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment value) { VH_pCDEF.set(segment, 0L, index, value); }
    /// Sets `pCDEF` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCDEF(MemorySegment segment, @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pCDEF(segment, 0L, value); }
    /// Sets `pCDEF` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pCDEFAt(long index, @CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pCDEF(this.segment(), index, value); return this; }
    /// Sets `pCDEF` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pCDEF(@CType("const StdVideoAV1CDEF *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pCDEF(this.segment(), value); return this; }

    /// {@return `pLoopRestoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment get_pLoopRestoration(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLoopRestoration.get(segment, 0L, index); }
    /// {@return `pLoopRestoration`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment get_pLoopRestoration(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pLoopRestoration(segment, 0L); }
    /// {@return `pLoopRestoration` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment pLoopRestorationAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pLoopRestoration(this.segment(), index); }
    /// {@return `pLoopRestoration`}
    public @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment pLoopRestoration() { return StdVideoEncodeAV1PictureInfo.get_pLoopRestoration(this.segment()); }
    /// Sets `pLoopRestoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLoopRestoration(MemorySegment segment, long index, @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment value) { VH_pLoopRestoration.set(segment, 0L, index, value); }
    /// Sets `pLoopRestoration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLoopRestoration(MemorySegment segment, @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopRestoration(segment, 0L, value); }
    /// Sets `pLoopRestoration` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pLoopRestorationAt(long index, @CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopRestoration(this.segment(), index, value); return this; }
    /// Sets `pLoopRestoration` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pLoopRestoration(@CType("const StdVideoAV1LoopRestoration *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pLoopRestoration(this.segment(), value); return this; }

    /// {@return `pGlobalMotion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment get_pGlobalMotion(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pGlobalMotion.get(segment, 0L, index); }
    /// {@return `pGlobalMotion`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment get_pGlobalMotion(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pGlobalMotion(segment, 0L); }
    /// {@return `pGlobalMotion` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment pGlobalMotionAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pGlobalMotion(this.segment(), index); }
    /// {@return `pGlobalMotion`}
    public @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment pGlobalMotion() { return StdVideoEncodeAV1PictureInfo.get_pGlobalMotion(this.segment()); }
    /// Sets `pGlobalMotion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGlobalMotion(MemorySegment segment, long index, @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment value) { VH_pGlobalMotion.set(segment, 0L, index, value); }
    /// Sets `pGlobalMotion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGlobalMotion(MemorySegment segment, @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pGlobalMotion(segment, 0L, value); }
    /// Sets `pGlobalMotion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pGlobalMotionAt(long index, @CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pGlobalMotion(this.segment(), index, value); return this; }
    /// Sets `pGlobalMotion` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pGlobalMotion(@CType("const StdVideoAV1GlobalMotion *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pGlobalMotion(this.segment(), value); return this; }

    /// {@return `pExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment get_pExtensionHeader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pExtensionHeader.get(segment, 0L, index); }
    /// {@return `pExtensionHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment get_pExtensionHeader(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pExtensionHeader(segment, 0L); }
    /// {@return `pExtensionHeader` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment pExtensionHeaderAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pExtensionHeader(this.segment(), index); }
    /// {@return `pExtensionHeader`}
    public @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment pExtensionHeader() { return StdVideoEncodeAV1PictureInfo.get_pExtensionHeader(this.segment()); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pExtensionHeader(MemorySegment segment, long index, @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment value) { VH_pExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `pExtensionHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pExtensionHeader(MemorySegment segment, @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pExtensionHeader(segment, 0L, value); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pExtensionHeaderAt(long index, @CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pExtensionHeader(this.segment(), index, value); return this; }
    /// Sets `pExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pExtensionHeader(@CType("const StdVideoEncodeAV1ExtensionHeader *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pExtensionHeader(this.segment(), value); return this; }

    /// {@return `pBufferRemovalTimes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pBufferRemovalTimes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBufferRemovalTimes.get(segment, 0L, index); }
    /// {@return `pBufferRemovalTimes`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pBufferRemovalTimes(MemorySegment segment) { return StdVideoEncodeAV1PictureInfo.get_pBufferRemovalTimes(segment, 0L); }
    /// {@return `pBufferRemovalTimes` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pBufferRemovalTimesAt(long index) { return StdVideoEncodeAV1PictureInfo.get_pBufferRemovalTimes(this.segment(), index); }
    /// {@return `pBufferRemovalTimes`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pBufferRemovalTimes() { return StdVideoEncodeAV1PictureInfo.get_pBufferRemovalTimes(this.segment()); }
    /// Sets `pBufferRemovalTimes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferRemovalTimes(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pBufferRemovalTimes.set(segment, 0L, index, value); }
    /// Sets `pBufferRemovalTimes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferRemovalTimes(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pBufferRemovalTimes(segment, 0L, value); }
    /// Sets `pBufferRemovalTimes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pBufferRemovalTimes(this.segment(), index, value); return this; }
    /// Sets `pBufferRemovalTimes` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimes(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { StdVideoEncodeAV1PictureInfo.set_pBufferRemovalTimes(this.segment(), value); return this; }

}
