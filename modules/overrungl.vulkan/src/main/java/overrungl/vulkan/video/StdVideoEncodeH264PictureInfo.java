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
/// ### seq_parameter_set_id
/// [VarHandle][#VH_seq_parameter_set_id] - [Getter][#seq_parameter_set_id()] - [Setter][#seq_parameter_set_id(byte)]
/// ### pic_parameter_set_id
/// [VarHandle][#VH_pic_parameter_set_id] - [Getter][#pic_parameter_set_id()] - [Setter][#pic_parameter_set_id(byte)]
/// ### idr_pic_id
/// [VarHandle][#VH_idr_pic_id] - [Getter][#idr_pic_id()] - [Setter][#idr_pic_id(short)]
/// ### primary_pic_type
/// [VarHandle][#VH_primary_pic_type] - [Getter][#primary_pic_type()] - [Setter][#primary_pic_type(int)]
/// ### frame_num
/// [VarHandle][#VH_frame_num] - [Getter][#frame_num()] - [Setter][#frame_num(int)]
/// ### PicOrderCnt
/// [VarHandle][#VH_PicOrderCnt] - [Getter][#PicOrderCnt()] - [Setter][#PicOrderCnt(int)]
/// ### temporal_id
/// [VarHandle][#VH_temporal_id] - [Getter][#temporal_id()] - [Setter][#temporal_id(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pRefLists
/// [VarHandle][#VH_pRefLists] - [Getter][#pRefLists()] - [Setter][#pRefLists(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264PictureInfo {
///     StdVideoEncodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint16_t idr_pic_id;
///     StdVideoH264PictureType primary_pic_type;
///     uint32_t frame_num;
///     int32_t PicOrderCnt;
///     uint8_t temporal_id;
///     uint8_t [3] reserved1;
///     const StdVideoEncodeH264ReferenceListsInfo * pRefLists;
/// } StdVideoEncodeH264PictureInfo;
/// ```
public sealed class StdVideoEncodeH264PictureInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH264PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("frame_num"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefLists")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `idr_pic_id` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_idr_pic_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idr_pic_id"));
    /// The [VarHandle] of `primary_pic_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primary_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_pic_type"));
    /// The [VarHandle] of `frame_num` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_num"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pRefLists` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRefLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefLists"));

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static StdVideoEncodeH264PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static StdVideoEncodeH264PictureInfo allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment flags, @CType("uint8_t") byte seq_parameter_set_id, @CType("uint8_t") byte pic_parameter_set_id, @CType("uint16_t") short idr_pic_id, @CType("StdVideoH264PictureType") int primary_pic_type, @CType("uint32_t") int frame_num, @CType("int32_t") int PicOrderCnt, @CType("uint8_t") byte temporal_id, @CType("uint8_t [3]") byte reserved1, @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefLists) { return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).idr_pic_id(idr_pic_id).primary_pic_type(primary_pic_type).frame_num(frame_num).PicOrderCnt(PicOrderCnt).temporal_id(temporal_id).reserved1(reserved1).pRefLists(pRefLists); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264PictureInfo copyFrom(StdVideoEncodeH264PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH264PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo flags(@CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_seq_parameter_set_id(segment, 0L); }
    /// {@return `seq_parameter_set_id`}
    public @CType("uint8_t") byte seq_parameter_set_id() { return StdVideoEncodeH264PictureInfo.get_seq_parameter_set_id(this.segment()); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_pic_parameter_set_id(segment, 0L); }
    /// {@return `pic_parameter_set_id`}
    public @CType("uint8_t") byte pic_parameter_set_id() { return StdVideoEncodeH264PictureInfo.get_pic_parameter_set_id(this.segment()); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_idr_pic_id(MemorySegment segment, long index) { return (short) VH_idr_pic_id.get(segment, 0L, index); }
    /// {@return `idr_pic_id`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_idr_pic_id(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_idr_pic_id(segment, 0L); }
    /// {@return `idr_pic_id`}
    public @CType("uint16_t") short idr_pic_id() { return StdVideoEncodeH264PictureInfo.get_idr_pic_id(this.segment()); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_idr_pic_id(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_idr_pic_id.set(segment, 0L, index, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_idr_pic_id(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.set_idr_pic_id(segment, 0L, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo idr_pic_id(@CType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.set_idr_pic_id(this.segment(), value); return this; }

    /// {@return `primary_pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264PictureType") int get_primary_pic_type(MemorySegment segment, long index) { return (int) VH_primary_pic_type.get(segment, 0L, index); }
    /// {@return `primary_pic_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264PictureType") int get_primary_pic_type(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_primary_pic_type(segment, 0L); }
    /// {@return `primary_pic_type`}
    public @CType("StdVideoH264PictureType") int primary_pic_type() { return StdVideoEncodeH264PictureInfo.get_primary_pic_type(this.segment()); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primary_pic_type(MemorySegment segment, long index, @CType("StdVideoH264PictureType") int value) { VH_primary_pic_type.set(segment, 0L, index, value); }
    /// Sets `primary_pic_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primary_pic_type(MemorySegment segment, @CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264PictureInfo.set_primary_pic_type(segment, 0L, value); }
    /// Sets `primary_pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo primary_pic_type(@CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264PictureInfo.set_primary_pic_type(this.segment(), value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_num(MemorySegment segment, long index) { return (int) VH_frame_num.get(segment, 0L, index); }
    /// {@return `frame_num`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_num(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_frame_num(segment, 0L); }
    /// {@return `frame_num`}
    public @CType("uint32_t") int frame_num() { return StdVideoEncodeH264PictureInfo.get_frame_num(this.segment()); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_num(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_num.set(segment, 0L, index, value); }
    /// Sets `frame_num` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_num(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.set_frame_num(segment, 0L, value); }
    /// Sets `frame_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo frame_num(@CType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.set_frame_num(this.segment(), value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCnt(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_PicOrderCnt(segment, 0L); }
    /// {@return `PicOrderCnt`}
    public @CType("int32_t") int PicOrderCnt() { return StdVideoEncodeH264PictureInfo.get_PicOrderCnt(this.segment()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCnt.set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, @CType("int32_t") int value) { StdVideoEncodeH264PictureInfo.set_PicOrderCnt(segment, 0L, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo PicOrderCnt(@CType("int32_t") int value) { StdVideoEncodeH264PictureInfo.set_PicOrderCnt(this.segment(), value); return this; }

    /// {@return `temporal_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment, long index) { return (byte) VH_temporal_id.get(segment, 0L, index); }
    /// {@return `temporal_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_temporal_id(segment, 0L); }
    /// {@return `temporal_id`}
    public @CType("uint8_t") byte temporal_id() { return StdVideoEncodeH264PictureInfo.get_temporal_id(this.segment()); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_temporal_id.set(segment, 0L, index, value); }
    /// Sets `temporal_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_temporal_id(segment, 0L, value); }
    /// Sets `temporal_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo temporal_id(@CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_temporal_id(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t [3]") byte reserved1() { return StdVideoEncodeH264PictureInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [3]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [3]") byte value) { StdVideoEncodeH264PictureInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1(@CType("uint8_t [3]") byte value) { StdVideoEncodeH264PictureInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment get_pRefLists(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRefLists.get(segment, 0L, index); }
    /// {@return `pRefLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment get_pRefLists(MemorySegment segment) { return StdVideoEncodeH264PictureInfo.get_pRefLists(segment, 0L); }
    /// {@return `pRefLists`}
    public @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefLists() { return StdVideoEncodeH264PictureInfo.get_pRefLists(this.segment()); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRefLists(MemorySegment segment, long index, @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { VH_pRefLists.set(segment, 0L, index, value); }
    /// Sets `pRefLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRefLists(MemorySegment segment, @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_pRefLists(segment, 0L, value); }
    /// Sets `pRefLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pRefLists(@CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_pRefLists(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH264PictureInfo].
    public static final class Buffer extends StdVideoEncodeH264PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264PictureInfo`
        public StdVideoEncodeH264PictureInfo asSlice(long index) { return new StdVideoEncodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH264PictureInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH264PictureInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_parameter_set_idAt(long index) { return StdVideoEncodeH264PictureInfo.get_seq_parameter_set_id(this.segment(), index); }
        /// Sets `seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pic_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pic_parameter_set_idAt(long index) { return StdVideoEncodeH264PictureInfo.get_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pic_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `idr_pic_id` at the given index}
        /// @param index the index
        public @CType("uint16_t") short idr_pic_idAt(long index) { return StdVideoEncodeH264PictureInfo.get_idr_pic_id(this.segment(), index); }
        /// Sets `idr_pic_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer idr_pic_idAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.set_idr_pic_id(this.segment(), index, value); return this; }

        /// {@return `primary_pic_type` at the given index}
        /// @param index the index
        public @CType("StdVideoH264PictureType") int primary_pic_typeAt(long index) { return StdVideoEncodeH264PictureInfo.get_primary_pic_type(this.segment(), index); }
        /// Sets `primary_pic_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primary_pic_typeAt(long index, @CType("StdVideoH264PictureType") int value) { StdVideoEncodeH264PictureInfo.set_primary_pic_type(this.segment(), index, value); return this; }

        /// {@return `frame_num` at the given index}
        /// @param index the index
        public @CType("uint32_t") int frame_numAt(long index) { return StdVideoEncodeH264PictureInfo.get_frame_num(this.segment(), index); }
        /// Sets `frame_num` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_numAt(long index, @CType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.set_frame_num(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index
        public @CType("int32_t") int PicOrderCntAt(long index) { return StdVideoEncodeH264PictureInfo.get_PicOrderCnt(this.segment(), index); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, @CType("int32_t") int value) { StdVideoEncodeH264PictureInfo.set_PicOrderCnt(this.segment(), index, value); return this; }

        /// {@return `temporal_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte temporal_idAt(long index) { return StdVideoEncodeH264PictureInfo.get_temporal_id(this.segment(), index); }
        /// Sets `temporal_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer temporal_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.set_temporal_id(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t [3]") byte reserved1At(long index) { return StdVideoEncodeH264PictureInfo.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t [3]") byte value) { StdVideoEncodeH264PictureInfo.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pRefLists` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment pRefListsAt(long index) { return StdVideoEncodeH264PictureInfo.get_pRefLists(this.segment(), index); }
        /// Sets `pRefLists` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRefListsAt(long index, @CType("const StdVideoEncodeH264ReferenceListsInfo *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264PictureInfo.set_pRefLists(this.segment(), index, value); return this; }

    }
}
