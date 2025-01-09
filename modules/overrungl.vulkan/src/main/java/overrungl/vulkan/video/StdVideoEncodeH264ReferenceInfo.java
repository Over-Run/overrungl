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
/// ### primary_pic_type
/// [VarHandle][#VH_primary_pic_type] - [Getter][#primary_pic_type()] - [Setter][#primary_pic_type(int)]
/// ### FrameNum
/// [VarHandle][#VH_FrameNum] - [Getter][#FrameNum()] - [Setter][#FrameNum(int)]
/// ### PicOrderCnt
/// [VarHandle][#VH_PicOrderCnt] - [Getter][#PicOrderCnt()] - [Setter][#PicOrderCnt(int)]
/// ### long_term_pic_num
/// [VarHandle][#VH_long_term_pic_num] - [Getter][#long_term_pic_num()] - [Setter][#long_term_pic_num(short)]
/// ### long_term_frame_idx
/// [VarHandle][#VH_long_term_frame_idx] - [Getter][#long_term_frame_idx()] - [Setter][#long_term_frame_idx(short)]
/// ### temporal_id
/// [VarHandle][#VH_temporal_id] - [Getter][#temporal_id()] - [Setter][#temporal_id(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264ReferenceInfo {
///     StdVideoEncodeH264ReferenceInfoFlags flags;
///     StdVideoH264PictureType primary_pic_type;
///     uint32_t FrameNum;
///     int32_t PicOrderCnt;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint8_t temporal_id;
/// } StdVideoEncodeH264ReferenceInfo;
/// ```
public final class StdVideoEncodeH264ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH264ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("FrameNum"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_BYTE.withName("temporal_id")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `primary_pic_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primary_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_pic_type"));
    /// The [VarHandle] of `FrameNum` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_FrameNum = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameNum"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));
    /// The [VarHandle] of `long_term_frame_idx` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_long_term_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_frame_idx"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfo(segment); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceInfo`
    public static StdVideoEncodeH264ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceInfo`
    public static StdVideoEncodeH264ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264ReferenceInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH264ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo flagsAt(long index, @CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo flags(@CType("StdVideoEncodeH264ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `primary_pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264PictureType") int get_primary_pic_type(MemorySegment segment, long index) { return (int) VH_primary_pic_type.get(segment, 0L, index); }
    /// {@return `primary_pic_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264PictureType") int get_primary_pic_type(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_primary_pic_type(segment, 0L); }
    /// {@return `primary_pic_type` at the given index}
    /// @param index the index
    public @CType("StdVideoH264PictureType") int primary_pic_typeAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_primary_pic_type(this.segment(), index); }
    /// {@return `primary_pic_type`}
    public @CType("StdVideoH264PictureType") int primary_pic_type() { return StdVideoEncodeH264ReferenceInfo.get_primary_pic_type(this.segment()); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primary_pic_type(MemorySegment segment, long index, @CType("StdVideoH264PictureType") int value) { VH_primary_pic_type.set(segment, 0L, index, value); }
    /// Sets `primary_pic_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primary_pic_type(MemorySegment segment, @CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264ReferenceInfo.set_primary_pic_type(segment, 0L, value); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo primary_pic_typeAt(long index, @CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264ReferenceInfo.set_primary_pic_type(this.segment(), index, value); return this; }
    /// Sets `primary_pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo primary_pic_type(@CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264ReferenceInfo.set_primary_pic_type(this.segment(), value); return this; }

    /// {@return `FrameNum` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_FrameNum(MemorySegment segment, long index) { return (int) VH_FrameNum.get(segment, 0L, index); }
    /// {@return `FrameNum`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_FrameNum(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_FrameNum(segment, 0L); }
    /// {@return `FrameNum` at the given index}
    /// @param index the index
    public @CType("uint32_t") int FrameNumAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_FrameNum(this.segment(), index); }
    /// {@return `FrameNum`}
    public @CType("uint32_t") int FrameNum() { return StdVideoEncodeH264ReferenceInfo.get_FrameNum(this.segment()); }
    /// Sets `FrameNum` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_FrameNum(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_FrameNum.set(segment, 0L, index, value); }
    /// Sets `FrameNum` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_FrameNum(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_FrameNum(segment, 0L, value); }
    /// Sets `FrameNum` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo FrameNumAt(long index, @CType("uint32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_FrameNum(this.segment(), index, value); return this; }
    /// Sets `FrameNum` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo FrameNum(@CType("uint32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_FrameNum(this.segment(), value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCnt(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_PicOrderCnt(segment, 0L); }
    /// {@return `PicOrderCnt` at the given index}
    /// @param index the index
    public @CType("int32_t") int PicOrderCntAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_PicOrderCnt(this.segment(), index); }
    /// {@return `PicOrderCnt`}
    public @CType("int32_t") int PicOrderCnt() { return StdVideoEncodeH264ReferenceInfo.get_PicOrderCnt(this.segment()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCnt.set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, @CType("int32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_PicOrderCnt(segment, 0L, value); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo PicOrderCntAt(long index, @CType("int32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_PicOrderCnt(this.segment(), index, value); return this; }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo PicOrderCnt(@CType("int32_t") int value) { StdVideoEncodeH264ReferenceInfo.set_PicOrderCnt(this.segment(), value); return this; }

    /// {@return `long_term_pic_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment, long index) { return (short) VH_long_term_pic_num.get(segment, 0L, index); }
    /// {@return `long_term_pic_num`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_long_term_pic_num(segment, 0L); }
    /// {@return `long_term_pic_num` at the given index}
    /// @param index the index
    public @CType("uint16_t") short long_term_pic_numAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_long_term_pic_num(this.segment(), index); }
    /// {@return `long_term_pic_num`}
    public @CType("uint16_t") short long_term_pic_num() { return StdVideoEncodeH264ReferenceInfo.get_long_term_pic_num(this.segment()); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_long_term_pic_num.set(segment, 0L, index, value); }
    /// Sets `long_term_pic_num` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_pic_num(segment, 0L, value); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_pic_numAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_pic_num(this.segment(), index, value); return this; }
    /// Sets `long_term_pic_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(@CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_pic_num(this.segment(), value); return this; }

    /// {@return `long_term_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_long_term_frame_idx(MemorySegment segment, long index) { return (short) VH_long_term_frame_idx.get(segment, 0L, index); }
    /// {@return `long_term_frame_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_long_term_frame_idx(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_long_term_frame_idx(segment, 0L); }
    /// {@return `long_term_frame_idx` at the given index}
    /// @param index the index
    public @CType("uint16_t") short long_term_frame_idxAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_long_term_frame_idx(this.segment(), index); }
    /// {@return `long_term_frame_idx`}
    public @CType("uint16_t") short long_term_frame_idx() { return StdVideoEncodeH264ReferenceInfo.get_long_term_frame_idx(this.segment()); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_frame_idx(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_long_term_frame_idx.set(segment, 0L, index, value); }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_frame_idx(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_frame_idx(segment, 0L, value); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idxAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_frame_idx(this.segment(), index, value); return this; }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(@CType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.set_long_term_frame_idx(this.segment(), value); return this; }

    /// {@return `temporal_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment, long index) { return (byte) VH_temporal_id.get(segment, 0L, index); }
    /// {@return `temporal_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfo.get_temporal_id(segment, 0L); }
    /// {@return `temporal_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte temporal_idAt(long index) { return StdVideoEncodeH264ReferenceInfo.get_temporal_id(this.segment(), index); }
    /// {@return `temporal_id`}
    public @CType("uint8_t") byte temporal_id() { return StdVideoEncodeH264ReferenceInfo.get_temporal_id(this.segment()); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_temporal_id.set(segment, 0L, index, value); }
    /// Sets `temporal_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceInfo.set_temporal_id(segment, 0L, value); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo temporal_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceInfo.set_temporal_id(this.segment(), index, value); return this; }
    /// Sets `temporal_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo temporal_id(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceInfo.set_temporal_id(this.segment(), value); return this; }

}
