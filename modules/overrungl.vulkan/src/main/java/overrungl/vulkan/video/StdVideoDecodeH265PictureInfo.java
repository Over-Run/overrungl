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
/// ### sps_video_parameter_set_id
/// [VarHandle][#VH_sps_video_parameter_set_id] - [Getter][#sps_video_parameter_set_id()] - [Setter][#sps_video_parameter_set_id(byte)]
/// ### pps_seq_parameter_set_id
/// [VarHandle][#VH_pps_seq_parameter_set_id] - [Getter][#pps_seq_parameter_set_id()] - [Setter][#pps_seq_parameter_set_id(byte)]
/// ### pps_pic_parameter_set_id
/// [VarHandle][#VH_pps_pic_parameter_set_id] - [Getter][#pps_pic_parameter_set_id()] - [Setter][#pps_pic_parameter_set_id(byte)]
/// ### NumDeltaPocsOfRefRpsIdx
/// [VarHandle][#VH_NumDeltaPocsOfRefRpsIdx] - [Getter][#NumDeltaPocsOfRefRpsIdx()] - [Setter][#NumDeltaPocsOfRefRpsIdx(byte)]
/// ### PicOrderCntVal
/// [VarHandle][#VH_PicOrderCntVal] - [Getter][#PicOrderCntVal()] - [Setter][#PicOrderCntVal(int)]
/// ### NumBitsForSTRefPicSetInSlice
/// [VarHandle][#VH_NumBitsForSTRefPicSetInSlice] - [Getter][#NumBitsForSTRefPicSetInSlice()] - [Setter][#NumBitsForSTRefPicSetInSlice(short)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(short)]
/// ### RefPicSetStCurrBefore
/// [VarHandle][#VH_RefPicSetStCurrBefore] - [Getter][#RefPicSetStCurrBefore()] - [Setter][#RefPicSetStCurrBefore(byte)]
/// ### RefPicSetStCurrAfter
/// [VarHandle][#VH_RefPicSetStCurrAfter] - [Getter][#RefPicSetStCurrAfter()] - [Setter][#RefPicSetStCurrAfter(byte)]
/// ### RefPicSetLtCurr
/// [VarHandle][#VH_RefPicSetLtCurr] - [Getter][#RefPicSetLtCurr()] - [Setter][#RefPicSetLtCurr(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH265PictureInfo {
///     StdVideoDecodeH265PictureInfoFlags flags;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t pps_seq_parameter_set_id;
///     uint8_t pps_pic_parameter_set_id;
///     uint8_t NumDeltaPocsOfRefRpsIdx;
///     int32_t PicOrderCntVal;
///     uint16_t NumBitsForSTRefPicSetInSlice;
///     uint16_t reserved;
///     uint8_t [ ] RefPicSetStCurrBefore;
///     uint8_t [ ] RefPicSetStCurrAfter;
///     uint8_t [ ] RefPicSetLtCurr;
/// } StdVideoDecodeH265PictureInfo;
/// ```
public final class StdVideoDecodeH265PictureInfo extends Struct {
    /// The struct layout of `StdVideoDecodeH265PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeH265PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("NumDeltaPocsOfRefRpsIdx"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_SHORT.withName("NumBitsForSTRefPicSetInSlice"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        ValueLayout.JAVA_BYTE.withName("RefPicSetStCurrBefore"),
        ValueLayout.JAVA_BYTE.withName("RefPicSetStCurrAfter"),
        ValueLayout.JAVA_BYTE.withName("RefPicSetLtCurr")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `pps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The [VarHandle] of `pps_pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The [VarHandle] of `NumDeltaPocsOfRefRpsIdx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_NumDeltaPocsOfRefRpsIdx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `NumBitsForSTRefPicSetInSlice` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_NumBitsForSTRefPicSetInSlice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `RefPicSetStCurrBefore` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefPicSetStCurrBefore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetStCurrBefore"));
    /// The [VarHandle] of `RefPicSetStCurrAfter` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefPicSetStCurrAfter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetStCurrAfter"));
    /// The [VarHandle] of `RefPicSetLtCurr` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefPicSetLtCurr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetLtCurr"));

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH265PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfo(segment); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH265PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265PictureInfo`
    public static StdVideoDecodeH265PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH265PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265PictureInfo`
    public static StdVideoDecodeH265PictureInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265PictureInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoDecodeH265PictureInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoDecodeH265PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo flagsAt(long index, @CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265PictureInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo flags(@CType("StdVideoDecodeH265PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_sps_video_parameter_set_id(segment, 0L); }
    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte sps_video_parameter_set_idAt(long index) { return StdVideoDecodeH265PictureInfo.get_sps_video_parameter_set_id(this.segment(), index); }
    /// {@return `sps_video_parameter_set_id`}
    public @CType("uint8_t") byte sps_video_parameter_set_id() { return StdVideoDecodeH265PictureInfo.get_sps_video_parameter_set_id(this.segment()); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_sps_video_parameter_set_id(segment, 0L, value); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo sps_video_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_sps_video_parameter_set_id(this.segment(), index, value); return this; }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo sps_video_parameter_set_id(@CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_sps_video_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_pps_seq_parameter_set_id(segment, 0L); }
    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte pps_seq_parameter_set_idAt(long index) { return StdVideoDecodeH265PictureInfo.get_pps_seq_parameter_set_id(this.segment(), index); }
    /// {@return `pps_seq_parameter_set_id`}
    public @CType("uint8_t") byte pps_seq_parameter_set_id() { return StdVideoDecodeH265PictureInfo.get_pps_seq_parameter_set_id(this.segment()); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_seq_parameter_set_id(this.segment(), index, value); return this; }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_pps_pic_parameter_set_id(segment, 0L); }
    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte pps_pic_parameter_set_idAt(long index) { return StdVideoDecodeH265PictureInfo.get_pps_pic_parameter_set_id(this.segment(), index); }
    /// {@return `pps_pic_parameter_set_id`}
    public @CType("uint8_t") byte pps_pic_parameter_set_id() { return StdVideoDecodeH265PictureInfo.get_pps_pic_parameter_set_id(this.segment()); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_pic_parameter_set_id(this.segment(), index, value); return this; }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_pps_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `NumDeltaPocsOfRefRpsIdx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_NumDeltaPocsOfRefRpsIdx(MemorySegment segment, long index) { return (byte) VH_NumDeltaPocsOfRefRpsIdx.get(segment, 0L, index); }
    /// {@return `NumDeltaPocsOfRefRpsIdx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_NumDeltaPocsOfRefRpsIdx(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_NumDeltaPocsOfRefRpsIdx(segment, 0L); }
    /// {@return `NumDeltaPocsOfRefRpsIdx` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte NumDeltaPocsOfRefRpsIdxAt(long index) { return StdVideoDecodeH265PictureInfo.get_NumDeltaPocsOfRefRpsIdx(this.segment(), index); }
    /// {@return `NumDeltaPocsOfRefRpsIdx`}
    public @CType("uint8_t") byte NumDeltaPocsOfRefRpsIdx() { return StdVideoDecodeH265PictureInfo.get_NumDeltaPocsOfRefRpsIdx(this.segment()); }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_NumDeltaPocsOfRefRpsIdx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_NumDeltaPocsOfRefRpsIdx.set(segment, 0L, index, value); }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_NumDeltaPocsOfRefRpsIdx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_NumDeltaPocsOfRefRpsIdx(segment, 0L, value); }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumDeltaPocsOfRefRpsIdxAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_NumDeltaPocsOfRefRpsIdx(this.segment(), index, value); return this; }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumDeltaPocsOfRefRpsIdx(@CType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.set_NumDeltaPocsOfRefRpsIdx(this.segment(), value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_PicOrderCntVal(segment, 0L); }
    /// {@return `PicOrderCntVal` at the given index}
    /// @param index the index
    public @CType("int32_t") int PicOrderCntValAt(long index) { return StdVideoDecodeH265PictureInfo.get_PicOrderCntVal(this.segment(), index); }
    /// {@return `PicOrderCntVal`}
    public @CType("int32_t") int PicOrderCntVal() { return StdVideoDecodeH265PictureInfo.get_PicOrderCntVal(this.segment()); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, @CType("int32_t") int value) { StdVideoDecodeH265PictureInfo.set_PicOrderCntVal(segment, 0L, value); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo PicOrderCntValAt(long index, @CType("int32_t") int value) { StdVideoDecodeH265PictureInfo.set_PicOrderCntVal(this.segment(), index, value); return this; }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo PicOrderCntVal(@CType("int32_t") int value) { StdVideoDecodeH265PictureInfo.set_PicOrderCntVal(this.segment(), value); return this; }

    /// {@return `NumBitsForSTRefPicSetInSlice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_NumBitsForSTRefPicSetInSlice(MemorySegment segment, long index) { return (short) VH_NumBitsForSTRefPicSetInSlice.get(segment, 0L, index); }
    /// {@return `NumBitsForSTRefPicSetInSlice`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_NumBitsForSTRefPicSetInSlice(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_NumBitsForSTRefPicSetInSlice(segment, 0L); }
    /// {@return `NumBitsForSTRefPicSetInSlice` at the given index}
    /// @param index the index
    public @CType("uint16_t") short NumBitsForSTRefPicSetInSliceAt(long index) { return StdVideoDecodeH265PictureInfo.get_NumBitsForSTRefPicSetInSlice(this.segment(), index); }
    /// {@return `NumBitsForSTRefPicSetInSlice`}
    public @CType("uint16_t") short NumBitsForSTRefPicSetInSlice() { return StdVideoDecodeH265PictureInfo.get_NumBitsForSTRefPicSetInSlice(this.segment()); }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_NumBitsForSTRefPicSetInSlice(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_NumBitsForSTRefPicSetInSlice.set(segment, 0L, index, value); }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_NumBitsForSTRefPicSetInSlice(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_NumBitsForSTRefPicSetInSlice(segment, 0L, value); }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumBitsForSTRefPicSetInSliceAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_NumBitsForSTRefPicSetInSlice(this.segment(), index, value); return this; }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumBitsForSTRefPicSetInSlice(@CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_NumBitsForSTRefPicSetInSlice(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_reserved(MemorySegment segment, long index) { return (short) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_reserved(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint16_t") short reservedAt(long index) { return StdVideoDecodeH265PictureInfo.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint16_t") short reserved() { return StdVideoDecodeH265PictureInfo.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo reservedAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo reserved(@CType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.set_reserved(this.segment(), value); return this; }

    /// {@return `RefPicSetStCurrBefore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_RefPicSetStCurrBefore(MemorySegment segment, long index) { return (byte) VH_RefPicSetStCurrBefore.get(segment, 0L, index); }
    /// {@return `RefPicSetStCurrBefore`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_RefPicSetStCurrBefore(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrBefore(segment, 0L); }
    /// {@return `RefPicSetStCurrBefore` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte RefPicSetStCurrBeforeAt(long index) { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrBefore(this.segment(), index); }
    /// {@return `RefPicSetStCurrBefore`}
    public @CType("uint8_t [ ]") byte RefPicSetStCurrBefore() { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrBefore(this.segment()); }
    /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicSetStCurrBefore(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_RefPicSetStCurrBefore.set(segment, 0L, index, value); }
    /// Sets `RefPicSetStCurrBefore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicSetStCurrBefore(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrBefore(segment, 0L, value); }
    /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBeforeAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrBefore(this.segment(), index, value); return this; }
    /// Sets `RefPicSetStCurrBefore` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(@CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrBefore(this.segment(), value); return this; }

    /// {@return `RefPicSetStCurrAfter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_RefPicSetStCurrAfter(MemorySegment segment, long index) { return (byte) VH_RefPicSetStCurrAfter.get(segment, 0L, index); }
    /// {@return `RefPicSetStCurrAfter`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_RefPicSetStCurrAfter(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrAfter(segment, 0L); }
    /// {@return `RefPicSetStCurrAfter` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte RefPicSetStCurrAfterAt(long index) { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrAfter(this.segment(), index); }
    /// {@return `RefPicSetStCurrAfter`}
    public @CType("uint8_t [ ]") byte RefPicSetStCurrAfter() { return StdVideoDecodeH265PictureInfo.get_RefPicSetStCurrAfter(this.segment()); }
    /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicSetStCurrAfter(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_RefPicSetStCurrAfter.set(segment, 0L, index, value); }
    /// Sets `RefPicSetStCurrAfter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicSetStCurrAfter(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrAfter(segment, 0L, value); }
    /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfterAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrAfter(this.segment(), index, value); return this; }
    /// Sets `RefPicSetStCurrAfter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(@CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetStCurrAfter(this.segment(), value); return this; }

    /// {@return `RefPicSetLtCurr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_RefPicSetLtCurr(MemorySegment segment, long index) { return (byte) VH_RefPicSetLtCurr.get(segment, 0L, index); }
    /// {@return `RefPicSetLtCurr`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_RefPicSetLtCurr(MemorySegment segment) { return StdVideoDecodeH265PictureInfo.get_RefPicSetLtCurr(segment, 0L); }
    /// {@return `RefPicSetLtCurr` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte RefPicSetLtCurrAt(long index) { return StdVideoDecodeH265PictureInfo.get_RefPicSetLtCurr(this.segment(), index); }
    /// {@return `RefPicSetLtCurr`}
    public @CType("uint8_t [ ]") byte RefPicSetLtCurr() { return StdVideoDecodeH265PictureInfo.get_RefPicSetLtCurr(this.segment()); }
    /// Sets `RefPicSetLtCurr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicSetLtCurr(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_RefPicSetLtCurr.set(segment, 0L, index, value); }
    /// Sets `RefPicSetLtCurr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicSetLtCurr(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetLtCurr(segment, 0L, value); }
    /// Sets `RefPicSetLtCurr` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurrAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetLtCurr(this.segment(), index, value); return this; }
    /// Sets `RefPicSetLtCurr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(@CType("uint8_t [ ]") byte value) { StdVideoDecodeH265PictureInfo.set_RefPicSetLtCurr(this.segment(), value); return this; }

}
