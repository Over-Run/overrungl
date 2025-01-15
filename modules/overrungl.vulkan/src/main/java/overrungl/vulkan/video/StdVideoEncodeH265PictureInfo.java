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
/// ### pic_type
/// [VarHandle][#VH_pic_type] - [Getter][#pic_type()] - [Setter][#pic_type(int)]
/// ### sps_video_parameter_set_id
/// [VarHandle][#VH_sps_video_parameter_set_id] - [Getter][#sps_video_parameter_set_id()] - [Setter][#sps_video_parameter_set_id(byte)]
/// ### pps_seq_parameter_set_id
/// [VarHandle][#VH_pps_seq_parameter_set_id] - [Getter][#pps_seq_parameter_set_id()] - [Setter][#pps_seq_parameter_set_id(byte)]
/// ### pps_pic_parameter_set_id
/// [VarHandle][#VH_pps_pic_parameter_set_id] - [Getter][#pps_pic_parameter_set_id()] - [Setter][#pps_pic_parameter_set_id(byte)]
/// ### short_term_ref_pic_set_idx
/// [VarHandle][#VH_short_term_ref_pic_set_idx] - [Getter][#short_term_ref_pic_set_idx()] - [Setter][#short_term_ref_pic_set_idx(byte)]
/// ### PicOrderCntVal
/// [VarHandle][#VH_PicOrderCntVal] - [Getter][#PicOrderCntVal()] - [Setter][#PicOrderCntVal(int)]
/// ### TemporalId
/// [VarHandle][#VH_TemporalId] - [Getter][#TemporalId()] - [Setter][#TemporalId(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pRefLists
/// [VarHandle][#VH_pRefLists] - [Getter][#pRefLists()] - [Setter][#pRefLists(java.lang.foreign.MemorySegment)]
/// ### pShortTermRefPicSet
/// [VarHandle][#VH_pShortTermRefPicSet] - [Getter][#pShortTermRefPicSet()] - [Setter][#pShortTermRefPicSet(java.lang.foreign.MemorySegment)]
/// ### pLongTermRefPics
/// [VarHandle][#VH_pLongTermRefPics] - [Getter][#pLongTermRefPics()] - [Setter][#pLongTermRefPics(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265PictureInfo {
///     StdVideoEncodeH265PictureInfoFlags flags;
///     StdVideoH265PictureType pic_type;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t pps_seq_parameter_set_id;
///     uint8_t pps_pic_parameter_set_id;
///     uint8_t short_term_ref_pic_set_idx;
///     int32_t PicOrderCntVal;
///     uint8_t TemporalId;
///     uint8_t [7] reserved1;
///     const StdVideoEncodeH265ReferenceListsInfo * pRefLists;
///     const StdVideoH265ShortTermRefPicSet * pShortTermRefPicSet;
///     const StdVideoEncodeH265LongTermRefPics * pLongTermRefPics;
/// } StdVideoEncodeH265PictureInfo;
/// ```
public sealed class StdVideoEncodeH265PictureInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH265PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH265PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pic_type"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("short_term_ref_pic_set_idx"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_BYTE.withName("TemporalId"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefLists"),
        ValueLayout.ADDRESS.withName("pShortTermRefPicSet"),
        ValueLayout.ADDRESS.withName("pLongTermRefPics")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pic_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_type"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `pps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The [VarHandle] of `pps_pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The [VarHandle] of `short_term_ref_pic_set_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_short_term_ref_pic_set_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("short_term_ref_pic_set_idx"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `TemporalId` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_TemporalId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TemporalId"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pRefLists` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRefLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefLists"));
    /// The [VarHandle] of `pShortTermRefPicSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShortTermRefPicSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShortTermRefPicSet"));
    /// The [VarHandle] of `pLongTermRefPics` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLongTermRefPics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLongTermRefPics"));

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfo(segment); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265PictureInfo`
    public static StdVideoEncodeH265PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265PictureInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265PictureInfo`
    public static StdVideoEncodeH265PictureInfo allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment flags, @CType("StdVideoH265PictureType") int pic_type, @CType("uint8_t") byte sps_video_parameter_set_id, @CType("uint8_t") byte pps_seq_parameter_set_id, @CType("uint8_t") byte pps_pic_parameter_set_id, @CType("uint8_t") byte short_term_ref_pic_set_idx, @CType("int32_t") int PicOrderCntVal, @CType("uint8_t") byte TemporalId, @CType("uint8_t [7]") byte reserved1, @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefLists, @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment pShortTermRefPicSet, @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment pLongTermRefPics) { return alloc(allocator).flags(flags).pic_type(pic_type).sps_video_parameter_set_id(sps_video_parameter_set_id).pps_seq_parameter_set_id(pps_seq_parameter_set_id).pps_pic_parameter_set_id(pps_pic_parameter_set_id).short_term_ref_pic_set_idx(short_term_ref_pic_set_idx).PicOrderCntVal(PicOrderCntVal).TemporalId(TemporalId).reserved1(reserved1).pRefLists(pRefLists).pShortTermRefPicSet(pShortTermRefPicSet).pLongTermRefPics(pLongTermRefPics); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265PictureInfo copyFrom(StdVideoEncodeH265PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH265PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo flags(@CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265PictureType") int get_pic_type(MemorySegment segment, long index) { return (int) VH_pic_type.get(segment, 0L, index); }
    /// {@return `pic_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265PictureType") int get_pic_type(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pic_type(segment, 0L); }
    /// {@return `pic_type`}
    public @CType("StdVideoH265PictureType") int pic_type() { return StdVideoEncodeH265PictureInfo.get_pic_type(this.segment()); }
    /// Sets `pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_type(MemorySegment segment, long index, @CType("StdVideoH265PictureType") int value) { VH_pic_type.set(segment, 0L, index, value); }
    /// Sets `pic_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_type(MemorySegment segment, @CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265PictureInfo.set_pic_type(segment, 0L, value); }
    /// Sets `pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pic_type(@CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265PictureInfo.set_pic_type(this.segment(), value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_sps_video_parameter_set_id(segment, 0L); }
    /// {@return `sps_video_parameter_set_id`}
    public @CType("uint8_t") byte sps_video_parameter_set_id() { return StdVideoEncodeH265PictureInfo.get_sps_video_parameter_set_id(this.segment()); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_sps_video_parameter_set_id(segment, 0L, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(@CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_sps_video_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pps_seq_parameter_set_id(segment, 0L); }
    /// {@return `pps_seq_parameter_set_id`}
    public @CType("uint8_t") byte pps_seq_parameter_set_id() { return StdVideoEncodeH265PictureInfo.get_pps_seq_parameter_set_id(this.segment()); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pps_pic_parameter_set_id(segment, 0L); }
    /// {@return `pps_pic_parameter_set_id`}
    public @CType("uint8_t") byte pps_pic_parameter_set_id() { return StdVideoEncodeH265PictureInfo.get_pps_pic_parameter_set_id(this.segment()); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `short_term_ref_pic_set_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_short_term_ref_pic_set_idx(MemorySegment segment, long index) { return (byte) VH_short_term_ref_pic_set_idx.get(segment, 0L, index); }
    /// {@return `short_term_ref_pic_set_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_short_term_ref_pic_set_idx(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_short_term_ref_pic_set_idx(segment, 0L); }
    /// {@return `short_term_ref_pic_set_idx`}
    public @CType("uint8_t") byte short_term_ref_pic_set_idx() { return StdVideoEncodeH265PictureInfo.get_short_term_ref_pic_set_idx(this.segment()); }
    /// Sets `short_term_ref_pic_set_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_short_term_ref_pic_set_idx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_short_term_ref_pic_set_idx.set(segment, 0L, index, value); }
    /// Sets `short_term_ref_pic_set_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_short_term_ref_pic_set_idx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_short_term_ref_pic_set_idx(segment, 0L, value); }
    /// Sets `short_term_ref_pic_set_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(@CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_short_term_ref_pic_set_idx(this.segment(), value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_PicOrderCntVal(segment, 0L); }
    /// {@return `PicOrderCntVal`}
    public @CType("int32_t") int PicOrderCntVal() { return StdVideoEncodeH265PictureInfo.get_PicOrderCntVal(this.segment()); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, @CType("int32_t") int value) { StdVideoEncodeH265PictureInfo.set_PicOrderCntVal(segment, 0L, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo PicOrderCntVal(@CType("int32_t") int value) { StdVideoEncodeH265PictureInfo.set_PicOrderCntVal(this.segment(), value); return this; }

    /// {@return `TemporalId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_TemporalId(MemorySegment segment, long index) { return (byte) VH_TemporalId.get(segment, 0L, index); }
    /// {@return `TemporalId`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_TemporalId(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_TemporalId(segment, 0L); }
    /// {@return `TemporalId`}
    public @CType("uint8_t") byte TemporalId() { return StdVideoEncodeH265PictureInfo.get_TemporalId(this.segment()); }
    /// Sets `TemporalId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TemporalId(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_TemporalId.set(segment, 0L, index, value); }
    /// Sets `TemporalId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TemporalId(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_TemporalId(segment, 0L, value); }
    /// Sets `TemporalId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo TemporalId(@CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_TemporalId(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t [7]") byte reserved1() { return StdVideoEncodeH265PictureInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [7]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [7]") byte value) { StdVideoEncodeH265PictureInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo reserved1(@CType("uint8_t [7]") byte value) { StdVideoEncodeH265PictureInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment get_pRefLists(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRefLists.get(segment, 0L, index); }
    /// {@return `pRefLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment get_pRefLists(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pRefLists(segment, 0L); }
    /// {@return `pRefLists`}
    public @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefLists() { return StdVideoEncodeH265PictureInfo.get_pRefLists(this.segment()); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRefLists(MemorySegment segment, long index, @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { VH_pRefLists.set(segment, 0L, index, value); }
    /// Sets `pRefLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRefLists(MemorySegment segment, @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pRefLists(segment, 0L, value); }
    /// Sets `pRefLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pRefLists(@CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pRefLists(this.segment(), value); return this; }

    /// {@return `pShortTermRefPicSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment get_pShortTermRefPicSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShortTermRefPicSet.get(segment, 0L, index); }
    /// {@return `pShortTermRefPicSet`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment get_pShortTermRefPicSet(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pShortTermRefPicSet(segment, 0L); }
    /// {@return `pShortTermRefPicSet`}
    public @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment pShortTermRefPicSet() { return StdVideoEncodeH265PictureInfo.get_pShortTermRefPicSet(this.segment()); }
    /// Sets `pShortTermRefPicSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShortTermRefPicSet(MemorySegment segment, long index, @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment value) { VH_pShortTermRefPicSet.set(segment, 0L, index, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShortTermRefPicSet(MemorySegment segment, @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pShortTermRefPicSet(segment, 0L, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pShortTermRefPicSet(@CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pShortTermRefPicSet(this.segment(), value); return this; }

    /// {@return `pLongTermRefPics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment get_pLongTermRefPics(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLongTermRefPics.get(segment, 0L, index); }
    /// {@return `pLongTermRefPics`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment get_pLongTermRefPics(MemorySegment segment) { return StdVideoEncodeH265PictureInfo.get_pLongTermRefPics(segment, 0L); }
    /// {@return `pLongTermRefPics`}
    public @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment pLongTermRefPics() { return StdVideoEncodeH265PictureInfo.get_pLongTermRefPics(this.segment()); }
    /// Sets `pLongTermRefPics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLongTermRefPics(MemorySegment segment, long index, @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment value) { VH_pLongTermRefPics.set(segment, 0L, index, value); }
    /// Sets `pLongTermRefPics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLongTermRefPics(MemorySegment segment, @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pLongTermRefPics(segment, 0L, value); }
    /// Sets `pLongTermRefPics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pLongTermRefPics(@CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pLongTermRefPics(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265PictureInfo].
    public static final class Buffer extends StdVideoEncodeH265PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265PictureInfo`
        public StdVideoEncodeH265PictureInfo asSlice(long index) { return new StdVideoEncodeH265PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH265PictureInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `pic_type` at the given index}
        /// @param index the index
        public @CType("StdVideoH265PictureType") int pic_typeAt(long index) { return StdVideoEncodeH265PictureInfo.get_pic_type(this.segment(), index); }
        /// Sets `pic_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_typeAt(long index, @CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265PictureInfo.set_pic_type(this.segment(), index, value); return this; }

        /// {@return `sps_video_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_video_parameter_set_idAt(long index) { return StdVideoEncodeH265PictureInfo.get_sps_video_parameter_set_id(this.segment(), index); }
        /// Sets `sps_video_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_video_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_sps_video_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pps_seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pps_seq_parameter_set_idAt(long index) { return StdVideoEncodeH265PictureInfo.get_pps_seq_parameter_set_id(this.segment(), index); }
        /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pps_pic_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pps_pic_parameter_set_idAt(long index) { return StdVideoEncodeH265PictureInfo.get_pps_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_pps_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `short_term_ref_pic_set_idx` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte short_term_ref_pic_set_idxAt(long index) { return StdVideoEncodeH265PictureInfo.get_short_term_ref_pic_set_idx(this.segment(), index); }
        /// Sets `short_term_ref_pic_set_idx` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer short_term_ref_pic_set_idxAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_short_term_ref_pic_set_idx(this.segment(), index, value); return this; }

        /// {@return `PicOrderCntVal` at the given index}
        /// @param index the index
        public @CType("int32_t") int PicOrderCntValAt(long index) { return StdVideoEncodeH265PictureInfo.get_PicOrderCntVal(this.segment(), index); }
        /// Sets `PicOrderCntVal` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntValAt(long index, @CType("int32_t") int value) { StdVideoEncodeH265PictureInfo.set_PicOrderCntVal(this.segment(), index, value); return this; }

        /// {@return `TemporalId` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte TemporalIdAt(long index) { return StdVideoEncodeH265PictureInfo.get_TemporalId(this.segment(), index); }
        /// Sets `TemporalId` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer TemporalIdAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.set_TemporalId(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t [7]") byte reserved1At(long index) { return StdVideoEncodeH265PictureInfo.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t [7]") byte value) { StdVideoEncodeH265PictureInfo.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pRefLists` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefListsAt(long index) { return StdVideoEncodeH265PictureInfo.get_pRefLists(this.segment(), index); }
        /// Sets `pRefLists` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRefListsAt(long index, @CType("const StdVideoEncodeH265ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pRefLists(this.segment(), index, value); return this; }

        /// {@return `pShortTermRefPicSet` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment pShortTermRefPicSetAt(long index) { return StdVideoEncodeH265PictureInfo.get_pShortTermRefPicSet(this.segment(), index); }
        /// Sets `pShortTermRefPicSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pShortTermRefPicSetAt(long index, @CType("const StdVideoH265ShortTermRefPicSet *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pShortTermRefPicSet(this.segment(), index, value); return this; }

        /// {@return `pLongTermRefPics` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment pLongTermRefPicsAt(long index) { return StdVideoEncodeH265PictureInfo.get_pLongTermRefPics(this.segment(), index); }
        /// Sets `pLongTermRefPics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLongTermRefPicsAt(long index, @CType("const StdVideoEncodeH265LongTermRefPics *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265PictureInfo.set_pLongTermRefPics(this.segment(), index, value); return this; }

    }
}
