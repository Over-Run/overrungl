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
/// struct StdVideoDecodeAV1PictureInfo {
///     (struct StdVideoDecodeAV1PictureInfoFlags) StdVideoDecodeAV1PictureInfoFlags flags;
///     (int) StdVideoAV1FrameType frame_type;
///     uint32_t current_frame_id;
///     uint8_t OrderHint;
///     uint8_t primary_ref_frame;
///     uint8_t refresh_frame_flags;
///     uint8_t reserved1;
///     (int) StdVideoAV1InterpolationFilter interpolation_filter;
///     (int) StdVideoAV1TxMode TxMode;
///     uint8_t delta_q_res;
///     uint8_t delta_lf_res;
///     uint8_t SkipModeFrame[2];
///     uint8_t coded_denom;
///     uint8_t reserved2[3];
///     uint8_t OrderHints[8];
///     uint32_t expectedFrameId[8];
///     const StdVideoAV1TileInfo* pTileInfo;
///     const StdVideoAV1Quantization* pQuantization;
///     const StdVideoAV1Segmentation* pSegmentation;
///     const StdVideoAV1LoopFilter* pLoopFilter;
///     const StdVideoAV1CDEF* pCDEF;
///     const StdVideoAV1LoopRestoration* pLoopRestoration;
///     const StdVideoAV1GlobalMotion* pGlobalMotion;
///     const StdVideoAV1FilmGrain* pFilmGrain;
/// };
/// ```
public sealed class StdVideoDecodeAV1PictureInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeAV1PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
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
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE).withName("SkipModeFrame"),
        ValueLayout.JAVA_BYTE.withName("coded_denom"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved2"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("OrderHints"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_INT).withName("expectedFrameId"),
        ValueLayout.ADDRESS.withName("pTileInfo"),
        ValueLayout.ADDRESS.withName("pQuantization"),
        ValueLayout.ADDRESS.withName("pSegmentation"),
        ValueLayout.ADDRESS.withName("pLoopFilter"),
        ValueLayout.ADDRESS.withName("pCDEF"),
        ValueLayout.ADDRESS.withName("pLoopRestoration"),
        ValueLayout.ADDRESS.withName("pGlobalMotion"),
        ValueLayout.ADDRESS.withName("pFilmGrain")
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
    /// The byte offset of `current_frame_id`.
    public static final long OFFSET_current_frame_id = LAYOUT.byteOffset(PathElement.groupElement("current_frame_id"));
    /// The memory layout of `current_frame_id`.
    public static final MemoryLayout LAYOUT_current_frame_id = LAYOUT.select(PathElement.groupElement("current_frame_id"));
    /// The [VarHandle] of `current_frame_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_current_frame_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("current_frame_id"));
    /// The byte offset of `OrderHint`.
    public static final long OFFSET_OrderHint = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
    /// The memory layout of `OrderHint`.
    public static final MemoryLayout LAYOUT_OrderHint = LAYOUT.select(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
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
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
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
    /// The byte offset of `SkipModeFrame`.
    public static final long OFFSET_SkipModeFrame = LAYOUT.byteOffset(PathElement.groupElement("SkipModeFrame"));
    /// The memory layout of `SkipModeFrame`.
    public static final MemoryLayout LAYOUT_SkipModeFrame = LAYOUT.select(PathElement.groupElement("SkipModeFrame"));
    /// The [VarHandle] of `SkipModeFrame` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_SkipModeFrame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("SkipModeFrame"), PathElement.sequenceElement());
    /// The byte offset of `coded_denom`.
    public static final long OFFSET_coded_denom = LAYOUT.byteOffset(PathElement.groupElement("coded_denom"));
    /// The memory layout of `coded_denom`.
    public static final MemoryLayout LAYOUT_coded_denom = LAYOUT.select(PathElement.groupElement("coded_denom"));
    /// The [VarHandle] of `coded_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coded_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coded_denom"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"), PathElement.sequenceElement());
    /// The byte offset of `OrderHints`.
    public static final long OFFSET_OrderHints = LAYOUT.byteOffset(PathElement.groupElement("OrderHints"));
    /// The memory layout of `OrderHints`.
    public static final MemoryLayout LAYOUT_OrderHints = LAYOUT.select(PathElement.groupElement("OrderHints"));
    /// The [VarHandle] of `OrderHints` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_OrderHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHints"), PathElement.sequenceElement());
    /// The byte offset of `expectedFrameId`.
    public static final long OFFSET_expectedFrameId = LAYOUT.byteOffset(PathElement.groupElement("expectedFrameId"));
    /// The memory layout of `expectedFrameId`.
    public static final MemoryLayout LAYOUT_expectedFrameId = LAYOUT.select(PathElement.groupElement("expectedFrameId"));
    /// The [VarHandle] of `expectedFrameId` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_expectedFrameId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectedFrameId"), PathElement.sequenceElement());
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
    /// The byte offset of `pFilmGrain`.
    public static final long OFFSET_pFilmGrain = LAYOUT.byteOffset(PathElement.groupElement("pFilmGrain"));
    /// The memory layout of `pFilmGrain`.
    public static final MemoryLayout LAYOUT_pFilmGrain = LAYOUT.select(PathElement.groupElement("pFilmGrain"));
    /// The [VarHandle] of `pFilmGrain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFilmGrain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFilmGrain"));

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeAV1PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoDecodeAV1PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfo`
    public static StdVideoDecodeAV1PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeAV1PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo copyFrom(StdVideoDecodeAV1PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoDecodeAV1PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo frame_type(int value) { frame_type(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo current_frame_id(int value) { current_frame_id(this.segment(), 0L, value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte OrderHint(MemorySegment segment, long index) { return (byte) VH_OrderHint.get(segment, 0L, index); }
    /// {@return `OrderHint`}
    public byte OrderHint() { return OrderHint(this.segment(), 0L); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void OrderHint(MemorySegment segment, long index, byte value) { VH_OrderHint.set(segment, 0L, index, value); }
    /// Sets `OrderHint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo OrderHint(byte value) { OrderHint(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo primary_ref_frame(byte value) { primary_ref_frame(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo refresh_frame_flags(byte value) { refresh_frame_flags(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo interpolation_filter(int value) { interpolation_filter(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo TxMode(int value) { TxMode(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo delta_q_res(byte value) { delta_q_res(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo delta_lf_res(byte value) { delta_lf_res(this.segment(), 0L, value); return this; }

    /// {@return `SkipModeFrame` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment SkipModeFrame(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_SkipModeFrame, index), LAYOUT_SkipModeFrame); }
    /// {@return `SkipModeFrame` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte SkipModeFrame(MemorySegment segment, long index, long index0) { return (byte) VH_SkipModeFrame.get(segment, 0L, index, index0); }
    /// {@return `SkipModeFrame`}
    public MemorySegment SkipModeFrame() { return SkipModeFrame(this.segment(), 0L); }
    /// {@return `SkipModeFrame`}
    /// @param index0 the Index 0 of the array
    public byte SkipModeFrame(long index0) { return SkipModeFrame(this.segment(), 0L, index0); }
    /// Sets `SkipModeFrame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void SkipModeFrame(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_SkipModeFrame, index), LAYOUT_SkipModeFrame.byteSize()); }
    /// Sets `SkipModeFrame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void SkipModeFrame(MemorySegment segment, long index, long index0, byte value) { VH_SkipModeFrame.set(segment, 0L, index, index0, value); }
    /// Sets `SkipModeFrame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo SkipModeFrame(MemorySegment value) { SkipModeFrame(this.segment(), 0L, value); return this; }
    /// Sets `SkipModeFrame` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo SkipModeFrame(long index0, byte value) { SkipModeFrame(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo coded_denom(byte value) { coded_denom(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved2(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved2, index), LAYOUT_reserved2); }
    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved2(MemorySegment segment, long index, long index0) { return (byte) VH_reserved2.get(segment, 0L, index, index0); }
    /// {@return `reserved2`}
    public MemorySegment reserved2() { return reserved2(this.segment(), 0L); }
    /// {@return `reserved2`}
    /// @param index0 the Index 0 of the array
    public byte reserved2(long index0) { return reserved2(this.segment(), 0L, index0); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved2, index), LAYOUT_reserved2.byteSize()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, long index0, byte value) { VH_reserved2.set(segment, 0L, index, index0, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo reserved2(MemorySegment value) { reserved2(this.segment(), 0L, value); return this; }
    /// Sets `reserved2` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo reserved2(long index0, byte value) { reserved2(this.segment(), 0L, index0, value); return this; }

    /// {@return `OrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment OrderHints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_OrderHints, index), LAYOUT_OrderHints); }
    /// {@return `OrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte OrderHints(MemorySegment segment, long index, long index0) { return (byte) VH_OrderHints.get(segment, 0L, index, index0); }
    /// {@return `OrderHints`}
    public MemorySegment OrderHints() { return OrderHints(this.segment(), 0L); }
    /// {@return `OrderHints`}
    /// @param index0 the Index 0 of the array
    public byte OrderHints(long index0) { return OrderHints(this.segment(), 0L, index0); }
    /// Sets `OrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void OrderHints(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_OrderHints, index), LAYOUT_OrderHints.byteSize()); }
    /// Sets `OrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void OrderHints(MemorySegment segment, long index, long index0, byte value) { VH_OrderHints.set(segment, 0L, index, index0, value); }
    /// Sets `OrderHints` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo OrderHints(MemorySegment value) { OrderHints(this.segment(), 0L, value); return this; }
    /// Sets `OrderHints` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo OrderHints(long index0, byte value) { OrderHints(this.segment(), 0L, index0, value); return this; }

    /// {@return `expectedFrameId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment expectedFrameId(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_expectedFrameId, index), LAYOUT_expectedFrameId); }
    /// {@return `expectedFrameId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int expectedFrameId(MemorySegment segment, long index, long index0) { return (int) VH_expectedFrameId.get(segment, 0L, index, index0); }
    /// {@return `expectedFrameId`}
    public MemorySegment expectedFrameId() { return expectedFrameId(this.segment(), 0L); }
    /// {@return `expectedFrameId`}
    /// @param index0 the Index 0 of the array
    public int expectedFrameId(long index0) { return expectedFrameId(this.segment(), 0L, index0); }
    /// Sets `expectedFrameId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void expectedFrameId(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_expectedFrameId, index), LAYOUT_expectedFrameId.byteSize()); }
    /// Sets `expectedFrameId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void expectedFrameId(MemorySegment segment, long index, long index0, int value) { VH_expectedFrameId.set(segment, 0L, index, index0, value); }
    /// Sets `expectedFrameId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo expectedFrameId(MemorySegment value) { expectedFrameId(this.segment(), 0L, value); return this; }
    /// Sets `expectedFrameId` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo expectedFrameId(long index0, int value) { expectedFrameId(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pTileInfo(MemorySegment value) { pTileInfo(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pQuantization(MemorySegment value) { pQuantization(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pSegmentation(MemorySegment value) { pSegmentation(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pLoopFilter(MemorySegment value) { pLoopFilter(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pCDEF(MemorySegment value) { pCDEF(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pLoopRestoration(MemorySegment value) { pLoopRestoration(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeAV1PictureInfo pGlobalMotion(MemorySegment value) { pGlobalMotion(this.segment(), 0L, value); return this; }

    /// {@return `pFilmGrain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFilmGrain(MemorySegment segment, long index) { return (MemorySegment) VH_pFilmGrain.get(segment, 0L, index); }
    /// {@return `pFilmGrain`}
    public MemorySegment pFilmGrain() { return pFilmGrain(this.segment(), 0L); }
    /// Sets `pFilmGrain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFilmGrain(MemorySegment segment, long index, MemorySegment value) { VH_pFilmGrain.set(segment, 0L, index, value); }
    /// Sets `pFilmGrain` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfo pFilmGrain(MemorySegment value) { pFilmGrain(this.segment(), 0L, value); return this; }

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

        /// {@return `current_frame_id` at the given index}
        /// @param index the index of the struct buffer
        public int current_frame_idAt(long index) { return current_frame_id(this.segment(), index); }
        /// Sets `current_frame_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer current_frame_idAt(long index, int value) { current_frame_id(this.segment(), index, value); return this; }

        /// {@return `OrderHint` at the given index}
        /// @param index the index of the struct buffer
        public byte OrderHintAt(long index) { return OrderHint(this.segment(), index); }
        /// Sets `OrderHint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintAt(long index, byte value) { OrderHint(this.segment(), index, value); return this; }

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

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved1At(long index) { return reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

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

        /// {@return `SkipModeFrame` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment SkipModeFrameAt(long index) { return SkipModeFrame(this.segment(), index); }
        /// {@return `SkipModeFrame` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte SkipModeFrameAt(long index, long index0) { return SkipModeFrame(this.segment(), index, index0); }
        /// Sets `SkipModeFrame` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer SkipModeFrameAt(long index, MemorySegment value) { SkipModeFrame(this.segment(), index, value); return this; }
        /// Sets `SkipModeFrame` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer SkipModeFrameAt(long index, long index0, byte value) { SkipModeFrame(this.segment(), index, index0, value); return this; }

        /// {@return `coded_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte coded_denomAt(long index) { return coded_denom(this.segment(), index); }
        /// Sets `coded_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer coded_denomAt(long index, byte value) { coded_denom(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reserved2At(long index) { return reserved2(this.segment(), index); }
        /// {@return `reserved2` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte reserved2At(long index, long index0) { return reserved2(this.segment(), index, index0); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, MemorySegment value) { reserved2(this.segment(), index, value); return this; }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, long index0, byte value) { reserved2(this.segment(), index, index0, value); return this; }

        /// {@return `OrderHints` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment OrderHintsAt(long index) { return OrderHints(this.segment(), index); }
        /// {@return `OrderHints` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte OrderHintsAt(long index, long index0) { return OrderHints(this.segment(), index, index0); }
        /// Sets `OrderHints` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintsAt(long index, MemorySegment value) { OrderHints(this.segment(), index, value); return this; }
        /// Sets `OrderHints` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintsAt(long index, long index0, byte value) { OrderHints(this.segment(), index, index0, value); return this; }

        /// {@return `expectedFrameId` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment expectedFrameIdAt(long index) { return expectedFrameId(this.segment(), index); }
        /// {@return `expectedFrameId` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int expectedFrameIdAt(long index, long index0) { return expectedFrameId(this.segment(), index, index0); }
        /// Sets `expectedFrameId` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer expectedFrameIdAt(long index, MemorySegment value) { expectedFrameId(this.segment(), index, value); return this; }
        /// Sets `expectedFrameId` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer expectedFrameIdAt(long index, long index0, int value) { expectedFrameId(this.segment(), index, index0, value); return this; }

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

        /// {@return `pFilmGrain` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pFilmGrainAt(long index) { return pFilmGrain(this.segment(), index); }
        /// Sets `pFilmGrain` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pFilmGrainAt(long index, MemorySegment value) { pFilmGrain(this.segment(), index, value); return this; }

    }
}
