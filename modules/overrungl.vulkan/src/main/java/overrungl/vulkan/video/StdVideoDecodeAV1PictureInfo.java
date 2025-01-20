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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### frame_type
/// [VarHandle][#VH_frame_type] - [Getter][#frame_type()] - [Setter][#frame_type(int)]
/// ### current_frame_id
/// [VarHandle][#VH_current_frame_id] - [Getter][#current_frame_id()] - [Setter][#current_frame_id(int)]
/// ### OrderHint
/// [VarHandle][#VH_OrderHint] - [Getter][#OrderHint()] - [Setter][#OrderHint(byte)]
/// ### primary_ref_frame
/// [VarHandle][#VH_primary_ref_frame] - [Getter][#primary_ref_frame()] - [Setter][#primary_ref_frame(byte)]
/// ### refresh_frame_flags
/// [VarHandle][#VH_refresh_frame_flags] - [Getter][#refresh_frame_flags()] - [Setter][#refresh_frame_flags(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### interpolation_filter
/// [VarHandle][#VH_interpolation_filter] - [Getter][#interpolation_filter()] - [Setter][#interpolation_filter(int)]
/// ### TxMode
/// [VarHandle][#VH_TxMode] - [Getter][#TxMode()] - [Setter][#TxMode(int)]
/// ### delta_q_res
/// [VarHandle][#VH_delta_q_res] - [Getter][#delta_q_res()] - [Setter][#delta_q_res(byte)]
/// ### delta_lf_res
/// [VarHandle][#VH_delta_lf_res] - [Getter][#delta_lf_res()] - [Setter][#delta_lf_res(byte)]
/// ### SkipModeFrame
/// [VarHandle][#VH_SkipModeFrame] - [Getter][#SkipModeFrame()] - [Setter][#SkipModeFrame(byte)]
/// ### coded_denom
/// [VarHandle][#VH_coded_denom] - [Getter][#coded_denom()] - [Setter][#coded_denom(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### OrderHints
/// [VarHandle][#VH_OrderHints] - [Getter][#OrderHints()] - [Setter][#OrderHints(byte)]
/// ### expectedFrameId
/// [VarHandle][#VH_expectedFrameId] - [Getter][#expectedFrameId()] - [Setter][#expectedFrameId(int)]
/// ### pTileInfo
/// [VarHandle][#VH_pTileInfo] - [Getter][#pTileInfo()] - [Setter][#pTileInfo(MemorySegment)]
/// ### pQuantization
/// [VarHandle][#VH_pQuantization] - [Getter][#pQuantization()] - [Setter][#pQuantization(MemorySegment)]
/// ### pSegmentation
/// [VarHandle][#VH_pSegmentation] - [Getter][#pSegmentation()] - [Setter][#pSegmentation(MemorySegment)]
/// ### pLoopFilter
/// [VarHandle][#VH_pLoopFilter] - [Getter][#pLoopFilter()] - [Setter][#pLoopFilter(MemorySegment)]
/// ### pCDEF
/// [VarHandle][#VH_pCDEF] - [Getter][#pCDEF()] - [Setter][#pCDEF(MemorySegment)]
/// ### pLoopRestoration
/// [VarHandle][#VH_pLoopRestoration] - [Getter][#pLoopRestoration()] - [Setter][#pLoopRestoration(MemorySegment)]
/// ### pGlobalMotion
/// [VarHandle][#VH_pGlobalMotion] - [Getter][#pGlobalMotion()] - [Setter][#pGlobalMotion(MemorySegment)]
/// ### pFilmGrain
/// [VarHandle][#VH_pFilmGrain] - [Getter][#pFilmGrain()] - [Setter][#pFilmGrain(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeAV1PictureInfo {
///     StdVideoDecodeAV1PictureInfoFlags flags;
///     StdVideoAV1FrameType frame_type;
///     uint32_t current_frame_id;
///     uint8_t OrderHint;
///     uint8_t primary_ref_frame;
///     uint8_t refresh_frame_flags;
///     uint8_t reserved1;
///     StdVideoAV1InterpolationFilter interpolation_filter;
///     StdVideoAV1TxMode TxMode;
///     uint8_t delta_q_res;
///     uint8_t delta_lf_res;
///     uint8_t [ ] SkipModeFrame;
///     uint8_t coded_denom;
///     uint8_t [3] reserved2;
///     uint8_t [ ] OrderHints;
///     uint32_t [ ] expectedFrameId;
///     const StdVideoAV1TileInfo * pTileInfo;
///     const StdVideoAV1Quantization * pQuantization;
///     const StdVideoAV1Segmentation * pSegmentation;
///     const StdVideoAV1LoopFilter * pLoopFilter;
///     const StdVideoAV1CDEF * pCDEF;
///     const StdVideoAV1LoopRestoration * pLoopRestoration;
///     const StdVideoAV1GlobalMotion * pGlobalMotion;
///     const StdVideoAV1FilmGrain * pFilmGrain;
/// } StdVideoDecodeAV1PictureInfo;
/// ```
public sealed class StdVideoDecodeAV1PictureInfo extends Struct {
    /// The struct layout of `StdVideoDecodeAV1PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_INT.withName("current_frame_id"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        ValueLayout.JAVA_BYTE.withName("primary_ref_frame"),
        ValueLayout.JAVA_BYTE.withName("refresh_frame_flags"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("interpolation_filter"),
        ValueLayout.JAVA_INT.withName("TxMode"),
        ValueLayout.JAVA_BYTE.withName("delta_q_res"),
        ValueLayout.JAVA_BYTE.withName("delta_lf_res"),
        ValueLayout.JAVA_BYTE.withName("SkipModeFrame"),
        ValueLayout.JAVA_BYTE.withName("coded_denom"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_BYTE.withName("OrderHints"),
        ValueLayout.JAVA_INT.withName("expectedFrameId"),
        ValueLayout.ADDRESS.withName("pTileInfo"),
        ValueLayout.ADDRESS.withName("pQuantization"),
        ValueLayout.ADDRESS.withName("pSegmentation"),
        ValueLayout.ADDRESS.withName("pLoopFilter"),
        ValueLayout.ADDRESS.withName("pCDEF"),
        ValueLayout.ADDRESS.withName("pLoopRestoration"),
        ValueLayout.ADDRESS.withName("pGlobalMotion"),
        ValueLayout.ADDRESS.withName("pFilmGrain")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `current_frame_id` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_current_frame_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("current_frame_id"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `primary_ref_frame` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_primary_ref_frame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_ref_frame"));
    /// The [VarHandle] of `refresh_frame_flags` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_refresh_frame_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refresh_frame_flags"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `interpolation_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_interpolation_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("interpolation_filter"));
    /// The [VarHandle] of `TxMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_TxMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TxMode"));
    /// The [VarHandle] of `delta_q_res` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_q_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_res"));
    /// The [VarHandle] of `delta_lf_res` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_lf_res = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_lf_res"));
    /// The [VarHandle] of `SkipModeFrame` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_SkipModeFrame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("SkipModeFrame"));
    /// The [VarHandle] of `coded_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_coded_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coded_denom"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `OrderHints` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_OrderHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHints"));
    /// The [VarHandle] of `expectedFrameId` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_expectedFrameId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectedFrameId"));
    /// The [VarHandle] of `pTileInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTileInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileInfo"));
    /// The [VarHandle] of `pQuantization` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQuantization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQuantization"));
    /// The [VarHandle] of `pSegmentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSegmentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSegmentation"));
    /// The [VarHandle] of `pLoopFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLoopFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopFilter"));
    /// The [VarHandle] of `pCDEF` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCDEF = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCDEF"));
    /// The [VarHandle] of `pLoopRestoration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLoopRestoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLoopRestoration"));
    /// The [VarHandle] of `pGlobalMotion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pGlobalMotion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGlobalMotion"));
    /// The [VarHandle] of `pFilmGrain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFilmGrain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFilmGrain"));

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeAV1PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfo(segment); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfo`
    public static StdVideoDecodeAV1PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeAV1PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfo`
    public static StdVideoDecodeAV1PictureInfo allocInit(SegmentAllocator allocator, @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment flags, @CType("StdVideoAV1FrameType") int frame_type, @CType("uint32_t") int current_frame_id, @CType("uint8_t") byte OrderHint, @CType("uint8_t") byte primary_ref_frame, @CType("uint8_t") byte refresh_frame_flags, @CType("uint8_t") byte reserved1, @CType("StdVideoAV1InterpolationFilter") int interpolation_filter, @CType("StdVideoAV1TxMode") int TxMode, @CType("uint8_t") byte delta_q_res, @CType("uint8_t") byte delta_lf_res, @CType("uint8_t [ ]") byte SkipModeFrame, @CType("uint8_t") byte coded_denom, @CType("uint8_t [3]") byte reserved2, @CType("uint8_t [ ]") byte OrderHints, @CType("uint32_t [ ]") int expectedFrameId, @CType("const StdVideoAV1TileInfo *") MemorySegment pTileInfo, @CType("const StdVideoAV1Quantization *") MemorySegment pQuantization, @CType("const StdVideoAV1Segmentation *") MemorySegment pSegmentation, @CType("const StdVideoAV1LoopFilter *") MemorySegment pLoopFilter, @CType("const StdVideoAV1CDEF *") MemorySegment pCDEF, @CType("const StdVideoAV1LoopRestoration *") MemorySegment pLoopRestoration, @CType("const StdVideoAV1GlobalMotion *") MemorySegment pGlobalMotion, @CType("const StdVideoAV1FilmGrain *") MemorySegment pFilmGrain) { return alloc(allocator).flags(flags).frame_type(frame_type).current_frame_id(current_frame_id).OrderHint(OrderHint).primary_ref_frame(primary_ref_frame).refresh_frame_flags(refresh_frame_flags).reserved1(reserved1).interpolation_filter(interpolation_filter).TxMode(TxMode).delta_q_res(delta_q_res).delta_lf_res(delta_lf_res).SkipModeFrame(SkipModeFrame).coded_denom(coded_denom).reserved2(reserved2).OrderHints(OrderHints).expectedFrameId(expectedFrameId).pTileInfo(pTileInfo).pQuantization(pQuantization).pSegmentation(pSegmentation).pLoopFilter(pLoopFilter).pCDEF(pCDEF).pLoopRestoration(pLoopRestoration).pGlobalMotion(pGlobalMotion).pFilmGrain(pFilmGrain); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo copyFrom(StdVideoDecodeAV1PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment flags() { return StdVideoDecodeAV1PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo flags(@CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment, long index) { return (int) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_frame_type(segment, 0L); }
    /// {@return `frame_type`}
    public @CType("StdVideoAV1FrameType") int frame_type() { return StdVideoDecodeAV1PictureInfo.get_frame_type(this.segment()); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, long index, @CType("StdVideoAV1FrameType") int value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, @CType("StdVideoAV1FrameType") int value) { StdVideoDecodeAV1PictureInfo.set_frame_type(segment, 0L, value); }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo frame_type(@CType("StdVideoAV1FrameType") int value) { StdVideoDecodeAV1PictureInfo.set_frame_type(this.segment(), value); return this; }

    /// {@return `current_frame_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_current_frame_id(MemorySegment segment, long index) { return (int) VH_current_frame_id.get(segment, 0L, index); }
    /// {@return `current_frame_id`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_current_frame_id(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_current_frame_id(segment, 0L); }
    /// {@return `current_frame_id`}
    public @CType("uint32_t") int current_frame_id() { return StdVideoDecodeAV1PictureInfo.get_current_frame_id(this.segment()); }
    /// Sets `current_frame_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_current_frame_id(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_current_frame_id.set(segment, 0L, index, value); }
    /// Sets `current_frame_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_current_frame_id(MemorySegment segment, @CType("uint32_t") int value) { StdVideoDecodeAV1PictureInfo.set_current_frame_id(segment, 0L, value); }
    /// Sets `current_frame_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo current_frame_id(@CType("uint32_t") int value) { StdVideoDecodeAV1PictureInfo.set_current_frame_id(this.segment(), value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment, long index) { return (byte) VH_OrderHint.get(segment, 0L, index); }
    /// {@return `OrderHint`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_OrderHint(segment, 0L); }
    /// {@return `OrderHint`}
    public @CType("uint8_t") byte OrderHint() { return StdVideoDecodeAV1PictureInfo.get_OrderHint(this.segment()); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_OrderHint.set(segment, 0L, index, value); }
    /// Sets `OrderHint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHint(segment, 0L, value); }
    /// Sets `OrderHint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo OrderHint(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHint(this.segment(), value); return this; }

    /// {@return `primary_ref_frame` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_primary_ref_frame(MemorySegment segment, long index) { return (byte) VH_primary_ref_frame.get(segment, 0L, index); }
    /// {@return `primary_ref_frame`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_primary_ref_frame(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_primary_ref_frame(segment, 0L); }
    /// {@return `primary_ref_frame`}
    public @CType("uint8_t") byte primary_ref_frame() { return StdVideoDecodeAV1PictureInfo.get_primary_ref_frame(this.segment()); }
    /// Sets `primary_ref_frame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primary_ref_frame(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_primary_ref_frame.set(segment, 0L, index, value); }
    /// Sets `primary_ref_frame` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primary_ref_frame(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_primary_ref_frame(segment, 0L, value); }
    /// Sets `primary_ref_frame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo primary_ref_frame(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_primary_ref_frame(this.segment(), value); return this; }

    /// {@return `refresh_frame_flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_refresh_frame_flags(MemorySegment segment, long index) { return (byte) VH_refresh_frame_flags.get(segment, 0L, index); }
    /// {@return `refresh_frame_flags`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_refresh_frame_flags(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_refresh_frame_flags(segment, 0L); }
    /// {@return `refresh_frame_flags`}
    public @CType("uint8_t") byte refresh_frame_flags() { return StdVideoDecodeAV1PictureInfo.get_refresh_frame_flags(this.segment()); }
    /// Sets `refresh_frame_flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refresh_frame_flags(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_refresh_frame_flags.set(segment, 0L, index, value); }
    /// Sets `refresh_frame_flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refresh_frame_flags(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_refresh_frame_flags(segment, 0L, value); }
    /// Sets `refresh_frame_flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo refresh_frame_flags(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_refresh_frame_flags(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoDecodeAV1PictureInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo reserved1(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `interpolation_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1InterpolationFilter") int get_interpolation_filter(MemorySegment segment, long index) { return (int) VH_interpolation_filter.get(segment, 0L, index); }
    /// {@return `interpolation_filter`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1InterpolationFilter") int get_interpolation_filter(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_interpolation_filter(segment, 0L); }
    /// {@return `interpolation_filter`}
    public @CType("StdVideoAV1InterpolationFilter") int interpolation_filter() { return StdVideoDecodeAV1PictureInfo.get_interpolation_filter(this.segment()); }
    /// Sets `interpolation_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_interpolation_filter(MemorySegment segment, long index, @CType("StdVideoAV1InterpolationFilter") int value) { VH_interpolation_filter.set(segment, 0L, index, value); }
    /// Sets `interpolation_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_interpolation_filter(MemorySegment segment, @CType("StdVideoAV1InterpolationFilter") int value) { StdVideoDecodeAV1PictureInfo.set_interpolation_filter(segment, 0L, value); }
    /// Sets `interpolation_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo interpolation_filter(@CType("StdVideoAV1InterpolationFilter") int value) { StdVideoDecodeAV1PictureInfo.set_interpolation_filter(this.segment(), value); return this; }

    /// {@return `TxMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1TxMode") int get_TxMode(MemorySegment segment, long index) { return (int) VH_TxMode.get(segment, 0L, index); }
    /// {@return `TxMode`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1TxMode") int get_TxMode(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_TxMode(segment, 0L); }
    /// {@return `TxMode`}
    public @CType("StdVideoAV1TxMode") int TxMode() { return StdVideoDecodeAV1PictureInfo.get_TxMode(this.segment()); }
    /// Sets `TxMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TxMode(MemorySegment segment, long index, @CType("StdVideoAV1TxMode") int value) { VH_TxMode.set(segment, 0L, index, value); }
    /// Sets `TxMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TxMode(MemorySegment segment, @CType("StdVideoAV1TxMode") int value) { StdVideoDecodeAV1PictureInfo.set_TxMode(segment, 0L, value); }
    /// Sets `TxMode` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo TxMode(@CType("StdVideoAV1TxMode") int value) { StdVideoDecodeAV1PictureInfo.set_TxMode(this.segment(), value); return this; }

    /// {@return `delta_q_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_q_res(MemorySegment segment, long index) { return (byte) VH_delta_q_res.get(segment, 0L, index); }
    /// {@return `delta_q_res`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_q_res(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_delta_q_res(segment, 0L); }
    /// {@return `delta_q_res`}
    public @CType("uint8_t") byte delta_q_res() { return StdVideoDecodeAV1PictureInfo.get_delta_q_res(this.segment()); }
    /// Sets `delta_q_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_q_res(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_q_res.set(segment, 0L, index, value); }
    /// Sets `delta_q_res` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_q_res(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_q_res(segment, 0L, value); }
    /// Sets `delta_q_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo delta_q_res(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_q_res(this.segment(), value); return this; }

    /// {@return `delta_lf_res` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_lf_res(MemorySegment segment, long index) { return (byte) VH_delta_lf_res.get(segment, 0L, index); }
    /// {@return `delta_lf_res`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_lf_res(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_delta_lf_res(segment, 0L); }
    /// {@return `delta_lf_res`}
    public @CType("uint8_t") byte delta_lf_res() { return StdVideoDecodeAV1PictureInfo.get_delta_lf_res(this.segment()); }
    /// Sets `delta_lf_res` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_lf_res(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_lf_res.set(segment, 0L, index, value); }
    /// Sets `delta_lf_res` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_lf_res(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_lf_res(segment, 0L, value); }
    /// Sets `delta_lf_res` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo delta_lf_res(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_lf_res(this.segment(), value); return this; }

    /// {@return `SkipModeFrame` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_SkipModeFrame(MemorySegment segment, long index) { return (byte) VH_SkipModeFrame.get(segment, 0L, index); }
    /// {@return `SkipModeFrame`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_SkipModeFrame(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_SkipModeFrame(segment, 0L); }
    /// {@return `SkipModeFrame`}
    public @CType("uint8_t [ ]") byte SkipModeFrame() { return StdVideoDecodeAV1PictureInfo.get_SkipModeFrame(this.segment()); }
    /// Sets `SkipModeFrame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_SkipModeFrame(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_SkipModeFrame.set(segment, 0L, index, value); }
    /// Sets `SkipModeFrame` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_SkipModeFrame(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_SkipModeFrame(segment, 0L, value); }
    /// Sets `SkipModeFrame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo SkipModeFrame(@CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_SkipModeFrame(this.segment(), value); return this; }

    /// {@return `coded_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_coded_denom(MemorySegment segment, long index) { return (byte) VH_coded_denom.get(segment, 0L, index); }
    /// {@return `coded_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_coded_denom(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_coded_denom(segment, 0L); }
    /// {@return `coded_denom`}
    public @CType("uint8_t") byte coded_denom() { return StdVideoDecodeAV1PictureInfo.get_coded_denom(this.segment()); }
    /// Sets `coded_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coded_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_coded_denom.set(segment, 0L, index, value); }
    /// Sets `coded_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coded_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_coded_denom(segment, 0L, value); }
    /// Sets `coded_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo coded_denom(@CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_coded_denom(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [3]") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [3]") byte get_reserved2(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t [3]") byte reserved2() { return StdVideoDecodeAV1PictureInfo.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t [3]") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t [3]") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo reserved2(@CType("uint8_t [3]") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved2(this.segment(), value); return this; }

    /// {@return `OrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_OrderHints(MemorySegment segment, long index) { return (byte) VH_OrderHints.get(segment, 0L, index); }
    /// {@return `OrderHints`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_OrderHints(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_OrderHints(segment, 0L); }
    /// {@return `OrderHints`}
    public @CType("uint8_t [ ]") byte OrderHints() { return StdVideoDecodeAV1PictureInfo.get_OrderHints(this.segment()); }
    /// Sets `OrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_OrderHints(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_OrderHints.set(segment, 0L, index, value); }
    /// Sets `OrderHints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_OrderHints(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHints(segment, 0L, value); }
    /// Sets `OrderHints` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo OrderHints(@CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHints(this.segment(), value); return this; }

    /// {@return `expectedFrameId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_expectedFrameId(MemorySegment segment, long index) { return (int) VH_expectedFrameId.get(segment, 0L, index); }
    /// {@return `expectedFrameId`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_expectedFrameId(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_expectedFrameId(segment, 0L); }
    /// {@return `expectedFrameId`}
    public @CType("uint32_t [ ]") int expectedFrameId() { return StdVideoDecodeAV1PictureInfo.get_expectedFrameId(this.segment()); }
    /// Sets `expectedFrameId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_expectedFrameId(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_expectedFrameId.set(segment, 0L, index, value); }
    /// Sets `expectedFrameId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_expectedFrameId(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoDecodeAV1PictureInfo.set_expectedFrameId(segment, 0L, value); }
    /// Sets `expectedFrameId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo expectedFrameId(@CType("uint32_t [ ]") int value) { StdVideoDecodeAV1PictureInfo.set_expectedFrameId(this.segment(), value); return this; }

    /// {@return `pTileInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1TileInfo *") MemorySegment get_pTileInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pTileInfo.get(segment, 0L, index); }
    /// {@return `pTileInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1TileInfo *") MemorySegment get_pTileInfo(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pTileInfo(segment, 0L); }
    /// {@return `pTileInfo`}
    public @CType("const StdVideoAV1TileInfo *") MemorySegment pTileInfo() { return StdVideoDecodeAV1PictureInfo.get_pTileInfo(this.segment()); }
    /// Sets `pTileInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTileInfo(MemorySegment segment, long index, @CType("const StdVideoAV1TileInfo *") MemorySegment value) { VH_pTileInfo.set(segment, 0L, index, value); }
    /// Sets `pTileInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTileInfo(MemorySegment segment, @CType("const StdVideoAV1TileInfo *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pTileInfo(segment, 0L, value); }
    /// Sets `pTileInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pTileInfo(@CType("const StdVideoAV1TileInfo *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pTileInfo(this.segment(), value); return this; }

    /// {@return `pQuantization` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1Quantization *") MemorySegment get_pQuantization(MemorySegment segment, long index) { return (MemorySegment) VH_pQuantization.get(segment, 0L, index); }
    /// {@return `pQuantization`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1Quantization *") MemorySegment get_pQuantization(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pQuantization(segment, 0L); }
    /// {@return `pQuantization`}
    public @CType("const StdVideoAV1Quantization *") MemorySegment pQuantization() { return StdVideoDecodeAV1PictureInfo.get_pQuantization(this.segment()); }
    /// Sets `pQuantization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQuantization(MemorySegment segment, long index, @CType("const StdVideoAV1Quantization *") MemorySegment value) { VH_pQuantization.set(segment, 0L, index, value); }
    /// Sets `pQuantization` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQuantization(MemorySegment segment, @CType("const StdVideoAV1Quantization *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pQuantization(segment, 0L, value); }
    /// Sets `pQuantization` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pQuantization(@CType("const StdVideoAV1Quantization *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pQuantization(this.segment(), value); return this; }

    /// {@return `pSegmentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1Segmentation *") MemorySegment get_pSegmentation(MemorySegment segment, long index) { return (MemorySegment) VH_pSegmentation.get(segment, 0L, index); }
    /// {@return `pSegmentation`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1Segmentation *") MemorySegment get_pSegmentation(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pSegmentation(segment, 0L); }
    /// {@return `pSegmentation`}
    public @CType("const StdVideoAV1Segmentation *") MemorySegment pSegmentation() { return StdVideoDecodeAV1PictureInfo.get_pSegmentation(this.segment()); }
    /// Sets `pSegmentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSegmentation(MemorySegment segment, long index, @CType("const StdVideoAV1Segmentation *") MemorySegment value) { VH_pSegmentation.set(segment, 0L, index, value); }
    /// Sets `pSegmentation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSegmentation(MemorySegment segment, @CType("const StdVideoAV1Segmentation *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pSegmentation(segment, 0L, value); }
    /// Sets `pSegmentation` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pSegmentation(@CType("const StdVideoAV1Segmentation *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pSegmentation(this.segment(), value); return this; }

    /// {@return `pLoopFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1LoopFilter *") MemorySegment get_pLoopFilter(MemorySegment segment, long index) { return (MemorySegment) VH_pLoopFilter.get(segment, 0L, index); }
    /// {@return `pLoopFilter`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1LoopFilter *") MemorySegment get_pLoopFilter(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pLoopFilter(segment, 0L); }
    /// {@return `pLoopFilter`}
    public @CType("const StdVideoAV1LoopFilter *") MemorySegment pLoopFilter() { return StdVideoDecodeAV1PictureInfo.get_pLoopFilter(this.segment()); }
    /// Sets `pLoopFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLoopFilter(MemorySegment segment, long index, @CType("const StdVideoAV1LoopFilter *") MemorySegment value) { VH_pLoopFilter.set(segment, 0L, index, value); }
    /// Sets `pLoopFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLoopFilter(MemorySegment segment, @CType("const StdVideoAV1LoopFilter *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopFilter(segment, 0L, value); }
    /// Sets `pLoopFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pLoopFilter(@CType("const StdVideoAV1LoopFilter *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopFilter(this.segment(), value); return this; }

    /// {@return `pCDEF` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1CDEF *") MemorySegment get_pCDEF(MemorySegment segment, long index) { return (MemorySegment) VH_pCDEF.get(segment, 0L, index); }
    /// {@return `pCDEF`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1CDEF *") MemorySegment get_pCDEF(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pCDEF(segment, 0L); }
    /// {@return `pCDEF`}
    public @CType("const StdVideoAV1CDEF *") MemorySegment pCDEF() { return StdVideoDecodeAV1PictureInfo.get_pCDEF(this.segment()); }
    /// Sets `pCDEF` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCDEF(MemorySegment segment, long index, @CType("const StdVideoAV1CDEF *") MemorySegment value) { VH_pCDEF.set(segment, 0L, index, value); }
    /// Sets `pCDEF` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCDEF(MemorySegment segment, @CType("const StdVideoAV1CDEF *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pCDEF(segment, 0L, value); }
    /// Sets `pCDEF` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pCDEF(@CType("const StdVideoAV1CDEF *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pCDEF(this.segment(), value); return this; }

    /// {@return `pLoopRestoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1LoopRestoration *") MemorySegment get_pLoopRestoration(MemorySegment segment, long index) { return (MemorySegment) VH_pLoopRestoration.get(segment, 0L, index); }
    /// {@return `pLoopRestoration`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1LoopRestoration *") MemorySegment get_pLoopRestoration(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pLoopRestoration(segment, 0L); }
    /// {@return `pLoopRestoration`}
    public @CType("const StdVideoAV1LoopRestoration *") MemorySegment pLoopRestoration() { return StdVideoDecodeAV1PictureInfo.get_pLoopRestoration(this.segment()); }
    /// Sets `pLoopRestoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLoopRestoration(MemorySegment segment, long index, @CType("const StdVideoAV1LoopRestoration *") MemorySegment value) { VH_pLoopRestoration.set(segment, 0L, index, value); }
    /// Sets `pLoopRestoration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLoopRestoration(MemorySegment segment, @CType("const StdVideoAV1LoopRestoration *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopRestoration(segment, 0L, value); }
    /// Sets `pLoopRestoration` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pLoopRestoration(@CType("const StdVideoAV1LoopRestoration *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopRestoration(this.segment(), value); return this; }

    /// {@return `pGlobalMotion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1GlobalMotion *") MemorySegment get_pGlobalMotion(MemorySegment segment, long index) { return (MemorySegment) VH_pGlobalMotion.get(segment, 0L, index); }
    /// {@return `pGlobalMotion`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1GlobalMotion *") MemorySegment get_pGlobalMotion(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pGlobalMotion(segment, 0L); }
    /// {@return `pGlobalMotion`}
    public @CType("const StdVideoAV1GlobalMotion *") MemorySegment pGlobalMotion() { return StdVideoDecodeAV1PictureInfo.get_pGlobalMotion(this.segment()); }
    /// Sets `pGlobalMotion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGlobalMotion(MemorySegment segment, long index, @CType("const StdVideoAV1GlobalMotion *") MemorySegment value) { VH_pGlobalMotion.set(segment, 0L, index, value); }
    /// Sets `pGlobalMotion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGlobalMotion(MemorySegment segment, @CType("const StdVideoAV1GlobalMotion *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pGlobalMotion(segment, 0L, value); }
    /// Sets `pGlobalMotion` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pGlobalMotion(@CType("const StdVideoAV1GlobalMotion *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pGlobalMotion(this.segment(), value); return this; }

    /// {@return `pFilmGrain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1FilmGrain *") MemorySegment get_pFilmGrain(MemorySegment segment, long index) { return (MemorySegment) VH_pFilmGrain.get(segment, 0L, index); }
    /// {@return `pFilmGrain`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1FilmGrain *") MemorySegment get_pFilmGrain(MemorySegment segment) { return StdVideoDecodeAV1PictureInfo.get_pFilmGrain(segment, 0L); }
    /// {@return `pFilmGrain`}
    public @CType("const StdVideoAV1FilmGrain *") MemorySegment pFilmGrain() { return StdVideoDecodeAV1PictureInfo.get_pFilmGrain(this.segment()); }
    /// Sets `pFilmGrain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFilmGrain(MemorySegment segment, long index, @CType("const StdVideoAV1FilmGrain *") MemorySegment value) { VH_pFilmGrain.set(segment, 0L, index, value); }
    /// Sets `pFilmGrain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFilmGrain(MemorySegment segment, @CType("const StdVideoAV1FilmGrain *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pFilmGrain(segment, 0L, value); }
    /// Sets `pFilmGrain` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pFilmGrain(@CType("const StdVideoAV1FilmGrain *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pFilmGrain(this.segment(), value); return this; }

    /// A buffer of [StdVideoDecodeAV1PictureInfo].
    public static final class Buffer extends StdVideoDecodeAV1PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeAV1PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeAV1PictureInfo`
        public StdVideoDecodeAV1PictureInfo asSlice(long index) { return new StdVideoDecodeAV1PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeAV1PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment flagsAt(long index) { return StdVideoDecodeAV1PictureInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoDecodeAV1PictureInfoFlags") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `frame_type` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1FrameType") int frame_typeAt(long index) { return StdVideoDecodeAV1PictureInfo.get_frame_type(this.segment(), index); }
        /// Sets `frame_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_typeAt(long index, @CType("StdVideoAV1FrameType") int value) { StdVideoDecodeAV1PictureInfo.set_frame_type(this.segment(), index, value); return this; }

        /// {@return `current_frame_id` at the given index}
        /// @param index the index
        public @CType("uint32_t") int current_frame_idAt(long index) { return StdVideoDecodeAV1PictureInfo.get_current_frame_id(this.segment(), index); }
        /// Sets `current_frame_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer current_frame_idAt(long index, @CType("uint32_t") int value) { StdVideoDecodeAV1PictureInfo.set_current_frame_id(this.segment(), index, value); return this; }

        /// {@return `OrderHint` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte OrderHintAt(long index) { return StdVideoDecodeAV1PictureInfo.get_OrderHint(this.segment(), index); }
        /// Sets `OrderHint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHint(this.segment(), index, value); return this; }

        /// {@return `primary_ref_frame` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte primary_ref_frameAt(long index) { return StdVideoDecodeAV1PictureInfo.get_primary_ref_frame(this.segment(), index); }
        /// Sets `primary_ref_frame` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primary_ref_frameAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_primary_ref_frame(this.segment(), index, value); return this; }

        /// {@return `refresh_frame_flags` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte refresh_frame_flagsAt(long index) { return StdVideoDecodeAV1PictureInfo.get_refresh_frame_flags(this.segment(), index); }
        /// Sets `refresh_frame_flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer refresh_frame_flagsAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_refresh_frame_flags(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoDecodeAV1PictureInfo.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `interpolation_filter` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1InterpolationFilter") int interpolation_filterAt(long index) { return StdVideoDecodeAV1PictureInfo.get_interpolation_filter(this.segment(), index); }
        /// Sets `interpolation_filter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer interpolation_filterAt(long index, @CType("StdVideoAV1InterpolationFilter") int value) { StdVideoDecodeAV1PictureInfo.set_interpolation_filter(this.segment(), index, value); return this; }

        /// {@return `TxMode` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1TxMode") int TxModeAt(long index) { return StdVideoDecodeAV1PictureInfo.get_TxMode(this.segment(), index); }
        /// Sets `TxMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer TxModeAt(long index, @CType("StdVideoAV1TxMode") int value) { StdVideoDecodeAV1PictureInfo.set_TxMode(this.segment(), index, value); return this; }

        /// {@return `delta_q_res` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte delta_q_resAt(long index) { return StdVideoDecodeAV1PictureInfo.get_delta_q_res(this.segment(), index); }
        /// Sets `delta_q_res` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_resAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_q_res(this.segment(), index, value); return this; }

        /// {@return `delta_lf_res` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte delta_lf_resAt(long index) { return StdVideoDecodeAV1PictureInfo.get_delta_lf_res(this.segment(), index); }
        /// Sets `delta_lf_res` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_lf_resAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_delta_lf_res(this.segment(), index, value); return this; }

        /// {@return `SkipModeFrame` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte SkipModeFrameAt(long index) { return StdVideoDecodeAV1PictureInfo.get_SkipModeFrame(this.segment(), index); }
        /// Sets `SkipModeFrame` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer SkipModeFrameAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_SkipModeFrame(this.segment(), index, value); return this; }

        /// {@return `coded_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte coded_denomAt(long index) { return StdVideoDecodeAV1PictureInfo.get_coded_denom(this.segment(), index); }
        /// Sets `coded_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer coded_denomAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.set_coded_denom(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t [3]") byte reserved2At(long index) { return StdVideoDecodeAV1PictureInfo.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t [3]") byte value) { StdVideoDecodeAV1PictureInfo.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `OrderHints` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte OrderHintsAt(long index) { return StdVideoDecodeAV1PictureInfo.get_OrderHints(this.segment(), index); }
        /// Sets `OrderHints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintsAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1PictureInfo.set_OrderHints(this.segment(), index, value); return this; }

        /// {@return `expectedFrameId` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int expectedFrameIdAt(long index) { return StdVideoDecodeAV1PictureInfo.get_expectedFrameId(this.segment(), index); }
        /// Sets `expectedFrameId` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer expectedFrameIdAt(long index, @CType("uint32_t [ ]") int value) { StdVideoDecodeAV1PictureInfo.set_expectedFrameId(this.segment(), index, value); return this; }

        /// {@return `pTileInfo` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1TileInfo *") MemorySegment pTileInfoAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pTileInfo(this.segment(), index); }
        /// Sets `pTileInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTileInfoAt(long index, @CType("const StdVideoAV1TileInfo *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pTileInfo(this.segment(), index, value); return this; }

        /// {@return `pQuantization` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1Quantization *") MemorySegment pQuantizationAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pQuantization(this.segment(), index); }
        /// Sets `pQuantization` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pQuantizationAt(long index, @CType("const StdVideoAV1Quantization *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pQuantization(this.segment(), index, value); return this; }

        /// {@return `pSegmentation` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1Segmentation *") MemorySegment pSegmentationAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pSegmentation(this.segment(), index); }
        /// Sets `pSegmentation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSegmentationAt(long index, @CType("const StdVideoAV1Segmentation *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pSegmentation(this.segment(), index, value); return this; }

        /// {@return `pLoopFilter` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1LoopFilter *") MemorySegment pLoopFilterAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pLoopFilter(this.segment(), index); }
        /// Sets `pLoopFilter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLoopFilterAt(long index, @CType("const StdVideoAV1LoopFilter *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopFilter(this.segment(), index, value); return this; }

        /// {@return `pCDEF` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1CDEF *") MemorySegment pCDEFAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pCDEF(this.segment(), index); }
        /// Sets `pCDEF` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCDEFAt(long index, @CType("const StdVideoAV1CDEF *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pCDEF(this.segment(), index, value); return this; }

        /// {@return `pLoopRestoration` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1LoopRestoration *") MemorySegment pLoopRestorationAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pLoopRestoration(this.segment(), index); }
        /// Sets `pLoopRestoration` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLoopRestorationAt(long index, @CType("const StdVideoAV1LoopRestoration *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pLoopRestoration(this.segment(), index, value); return this; }

        /// {@return `pGlobalMotion` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1GlobalMotion *") MemorySegment pGlobalMotionAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pGlobalMotion(this.segment(), index); }
        /// Sets `pGlobalMotion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pGlobalMotionAt(long index, @CType("const StdVideoAV1GlobalMotion *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pGlobalMotion(this.segment(), index, value); return this; }

        /// {@return `pFilmGrain` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1FilmGrain *") MemorySegment pFilmGrainAt(long index) { return StdVideoDecodeAV1PictureInfo.get_pFilmGrain(this.segment(), index); }
        /// Sets `pFilmGrain` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pFilmGrainAt(long index, @CType("const StdVideoAV1FilmGrain *") MemorySegment value) { StdVideoDecodeAV1PictureInfo.set_pFilmGrain(this.segment(), index, value); return this; }

    }
}
