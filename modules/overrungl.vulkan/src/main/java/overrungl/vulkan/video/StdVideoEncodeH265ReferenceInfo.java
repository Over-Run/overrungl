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
/// ### PicOrderCntVal
/// [VarHandle][#VH_PicOrderCntVal] - [Getter][#PicOrderCntVal()] - [Setter][#PicOrderCntVal(int)]
/// ### TemporalId
/// [VarHandle][#VH_TemporalId] - [Getter][#TemporalId()] - [Setter][#TemporalId(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265ReferenceInfo {
///     StdVideoEncodeH265ReferenceInfoFlags flags;
///     StdVideoH265PictureType pic_type;
///     int32_t PicOrderCntVal;
///     uint8_t TemporalId;
/// } StdVideoEncodeH265ReferenceInfo;
/// ```
public sealed class StdVideoEncodeH265ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH265ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pic_type"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_BYTE.withName("TemporalId")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pic_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_type"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `TemporalId` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_TemporalId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TemporalId"));

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfo(segment); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceInfo`
    public static StdVideoEncodeH265ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceInfo`
    public static StdVideoEncodeH265ReferenceInfo allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment flags, @CType("StdVideoH265PictureType") int pic_type, @CType("int32_t") int PicOrderCntVal, @CType("uint8_t") byte TemporalId) { return alloc(allocator).flags(flags).pic_type(pic_type).PicOrderCntVal(PicOrderCntVal).TemporalId(TemporalId); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo copyFrom(StdVideoEncodeH265ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH265ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH265ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo flags(@CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265PictureType") int get_pic_type(MemorySegment segment, long index) { return (int) VH_pic_type.get(segment, 0L, index); }
    /// {@return `pic_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265PictureType") int get_pic_type(MemorySegment segment) { return StdVideoEncodeH265ReferenceInfo.get_pic_type(segment, 0L); }
    /// {@return `pic_type`}
    public @CType("StdVideoH265PictureType") int pic_type() { return StdVideoEncodeH265ReferenceInfo.get_pic_type(this.segment()); }
    /// Sets `pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_type(MemorySegment segment, long index, @CType("StdVideoH265PictureType") int value) { VH_pic_type.set(segment, 0L, index, value); }
    /// Sets `pic_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_type(MemorySegment segment, @CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265ReferenceInfo.set_pic_type(segment, 0L, value); }
    /// Sets `pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo pic_type(@CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265ReferenceInfo.set_pic_type(this.segment(), value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment) { return StdVideoEncodeH265ReferenceInfo.get_PicOrderCntVal(segment, 0L); }
    /// {@return `PicOrderCntVal`}
    public @CType("int32_t") int PicOrderCntVal() { return StdVideoEncodeH265ReferenceInfo.get_PicOrderCntVal(this.segment()); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, @CType("int32_t") int value) { StdVideoEncodeH265ReferenceInfo.set_PicOrderCntVal(segment, 0L, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo PicOrderCntVal(@CType("int32_t") int value) { StdVideoEncodeH265ReferenceInfo.set_PicOrderCntVal(this.segment(), value); return this; }

    /// {@return `TemporalId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_TemporalId(MemorySegment segment, long index) { return (byte) VH_TemporalId.get(segment, 0L, index); }
    /// {@return `TemporalId`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_TemporalId(MemorySegment segment) { return StdVideoEncodeH265ReferenceInfo.get_TemporalId(segment, 0L); }
    /// {@return `TemporalId`}
    public @CType("uint8_t") byte TemporalId() { return StdVideoEncodeH265ReferenceInfo.get_TemporalId(this.segment()); }
    /// Sets `TemporalId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TemporalId(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_TemporalId.set(segment, 0L, index, value); }
    /// Sets `TemporalId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TemporalId(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceInfo.set_TemporalId(segment, 0L, value); }
    /// Sets `TemporalId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo TemporalId(@CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceInfo.set_TemporalId(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265ReferenceInfo].
    public static final class Buffer extends StdVideoEncodeH265ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265ReferenceInfo`
        public StdVideoEncodeH265ReferenceInfo asSlice(long index) { return new StdVideoEncodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH265ReferenceInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `pic_type` at the given index}
        /// @param index the index
        public @CType("StdVideoH265PictureType") int pic_typeAt(long index) { return StdVideoEncodeH265ReferenceInfo.get_pic_type(this.segment(), index); }
        /// Sets `pic_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_typeAt(long index, @CType("StdVideoH265PictureType") int value) { StdVideoEncodeH265ReferenceInfo.set_pic_type(this.segment(), index, value); return this; }

        /// {@return `PicOrderCntVal` at the given index}
        /// @param index the index
        public @CType("int32_t") int PicOrderCntValAt(long index) { return StdVideoEncodeH265ReferenceInfo.get_PicOrderCntVal(this.segment(), index); }
        /// Sets `PicOrderCntVal` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntValAt(long index, @CType("int32_t") int value) { StdVideoEncodeH265ReferenceInfo.set_PicOrderCntVal(this.segment(), index, value); return this; }

        /// {@return `TemporalId` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte TemporalIdAt(long index) { return StdVideoEncodeH265ReferenceInfo.get_TemporalId(this.segment(), index); }
        /// Sets `TemporalId` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer TemporalIdAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceInfo.set_TemporalId(this.segment(), index, value); return this; }

    }
}
