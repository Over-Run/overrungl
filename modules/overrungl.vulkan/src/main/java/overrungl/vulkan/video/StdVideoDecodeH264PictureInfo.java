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
/// ### seq_parameter_set_id
/// [VarHandle][#VH_seq_parameter_set_id] - [Getter][#seq_parameter_set_id()] - [Setter][#seq_parameter_set_id(byte)]
/// ### pic_parameter_set_id
/// [VarHandle][#VH_pic_parameter_set_id] - [Getter][#pic_parameter_set_id()] - [Setter][#pic_parameter_set_id(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### frame_num
/// [VarHandle][#VH_frame_num] - [Getter][#frame_num()] - [Setter][#frame_num(short)]
/// ### idr_pic_id
/// [VarHandle][#VH_idr_pic_id] - [Getter][#idr_pic_id()] - [Setter][#idr_pic_id(short)]
/// ### PicOrderCnt
/// [VarHandle][#VH_PicOrderCnt] - [Getter][#PicOrderCnt()] - [Setter][#PicOrderCnt(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH264PictureInfo {
///     StdVideoDecodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t frame_num;
///     uint16_t idr_pic_id;
///     int32_t [ ] PicOrderCnt;
/// } StdVideoDecodeH264PictureInfo;
/// ```
public sealed class StdVideoDecodeH264PictureInfo extends Struct {
    /// The struct layout of `StdVideoDecodeH264PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("frame_num"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `frame_num` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_frame_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_num"));
    /// The [VarHandle] of `idr_pic_id` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_idr_pic_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idr_pic_id"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH264PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfo(segment); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoDecodeH264PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264PictureInfo`
    public static StdVideoDecodeH264PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH264PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeH264PictureInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264PictureInfo`
    public static StdVideoDecodeH264PictureInfo allocInit(SegmentAllocator allocator, @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment flags, @CType("uint8_t") byte seq_parameter_set_id, @CType("uint8_t") byte pic_parameter_set_id, @CType("uint8_t") byte reserved1, @CType("uint8_t") byte reserved2, @CType("uint16_t") short frame_num, @CType("uint16_t") short idr_pic_id, @CType("int32_t [ ]") int PicOrderCnt) { return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).reserved1(reserved1).reserved2(reserved2).frame_num(frame_num).idr_pic_id(idr_pic_id).PicOrderCnt(PicOrderCnt); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH264PictureInfo copyFrom(StdVideoDecodeH264PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment flags() { return StdVideoDecodeH264PictureInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment value) { StdVideoDecodeH264PictureInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo flags(@CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment value) { StdVideoDecodeH264PictureInfo.set_flags(this.segment(), value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_seq_parameter_set_id(segment, 0L); }
    /// {@return `seq_parameter_set_id`}
    public @CType("uint8_t") byte seq_parameter_set_id() { return StdVideoDecodeH264PictureInfo.get_seq_parameter_set_id(this.segment()); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_pic_parameter_set_id(segment, 0L); }
    /// {@return `pic_parameter_set_id`}
    public @CType("uint8_t") byte pic_parameter_set_id() { return StdVideoDecodeH264PictureInfo.get_pic_parameter_set_id(this.segment()); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoDecodeH264PictureInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved1(@CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoDecodeH264PictureInfo.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved2(@CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved2(this.segment(), value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_frame_num(MemorySegment segment, long index) { return (short) VH_frame_num.get(segment, 0L, index); }
    /// {@return `frame_num`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_frame_num(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_frame_num(segment, 0L); }
    /// {@return `frame_num`}
    public @CType("uint16_t") short frame_num() { return StdVideoDecodeH264PictureInfo.get_frame_num(this.segment()); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_num(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_frame_num.set(segment, 0L, index, value); }
    /// Sets `frame_num` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_num(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_frame_num(segment, 0L, value); }
    /// Sets `frame_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo frame_num(@CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_frame_num(this.segment(), value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_idr_pic_id(MemorySegment segment, long index) { return (short) VH_idr_pic_id.get(segment, 0L, index); }
    /// {@return `idr_pic_id`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_idr_pic_id(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_idr_pic_id(segment, 0L); }
    /// {@return `idr_pic_id`}
    public @CType("uint16_t") short idr_pic_id() { return StdVideoDecodeH264PictureInfo.get_idr_pic_id(this.segment()); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_idr_pic_id(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_idr_pic_id.set(segment, 0L, index, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_idr_pic_id(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_idr_pic_id(segment, 0L, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo idr_pic_id(@CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_idr_pic_id(this.segment(), value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t [ ]") int get_PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    /// @param segment the segment of the struct
    public static @CType("int32_t [ ]") int get_PicOrderCnt(MemorySegment segment) { return StdVideoDecodeH264PictureInfo.get_PicOrderCnt(segment, 0L); }
    /// {@return `PicOrderCnt`}
    public @CType("int32_t [ ]") int PicOrderCnt() { return StdVideoDecodeH264PictureInfo.get_PicOrderCnt(this.segment()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, long index, @CType("int32_t [ ]") int value) { VH_PicOrderCnt.set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, @CType("int32_t [ ]") int value) { StdVideoDecodeH264PictureInfo.set_PicOrderCnt(segment, 0L, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo PicOrderCnt(@CType("int32_t [ ]") int value) { StdVideoDecodeH264PictureInfo.set_PicOrderCnt(this.segment(), value); return this; }

    /// A buffer of [StdVideoDecodeH264PictureInfo].
    public static final class Buffer extends StdVideoDecodeH264PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeH264PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeH264PictureInfo`
        public StdVideoDecodeH264PictureInfo asSlice(long index) { return new StdVideoDecodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeH264PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment flagsAt(long index) { return StdVideoDecodeH264PictureInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoDecodeH264PictureInfoFlags") MemorySegment value) { StdVideoDecodeH264PictureInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_parameter_set_idAt(long index) { return StdVideoDecodeH264PictureInfo.get_seq_parameter_set_id(this.segment(), index); }
        /// Sets `seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pic_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pic_parameter_set_idAt(long index) { return StdVideoDecodeH264PictureInfo.get_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pic_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoDecodeH264PictureInfo.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved2At(long index) { return StdVideoDecodeH264PictureInfo.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `frame_num` at the given index}
        /// @param index the index
        public @CType("uint16_t") short frame_numAt(long index) { return StdVideoDecodeH264PictureInfo.get_frame_num(this.segment(), index); }
        /// Sets `frame_num` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_numAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_frame_num(this.segment(), index, value); return this; }

        /// {@return `idr_pic_id` at the given index}
        /// @param index the index
        public @CType("uint16_t") short idr_pic_idAt(long index) { return StdVideoDecodeH264PictureInfo.get_idr_pic_id(this.segment(), index); }
        /// Sets `idr_pic_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer idr_pic_idAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.set_idr_pic_id(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index
        public @CType("int32_t [ ]") int PicOrderCntAt(long index) { return StdVideoDecodeH264PictureInfo.get_PicOrderCnt(this.segment(), index); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, @CType("int32_t [ ]") int value) { StdVideoDecodeH264PictureInfo.set_PicOrderCnt(this.segment(), index, value); return this; }

    }
}
