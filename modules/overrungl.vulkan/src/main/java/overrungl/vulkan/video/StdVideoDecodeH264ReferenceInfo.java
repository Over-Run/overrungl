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
/// ### FrameNum
/// [VarHandle][#VH_FrameNum] - [Getter][#FrameNum()] - [Setter][#FrameNum(short)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(short)]
/// ### PicOrderCnt
/// [VarHandle][#VH_PicOrderCnt] - [Getter][#PicOrderCnt()] - [Setter][#PicOrderCnt(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH264ReferenceInfo {
///     StdVideoDecodeH264ReferenceInfoFlags flags;
///     uint16_t FrameNum;
///     uint16_t reserved;
///     int32_t [ ] PicOrderCnt;
/// } StdVideoDecodeH264ReferenceInfo;
/// ```
public sealed class StdVideoDecodeH264ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoDecodeH264ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("FrameNum"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `FrameNum` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_FrameNum = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameNum"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH264ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfo(segment); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264ReferenceInfo`
    public static StdVideoDecodeH264ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264ReferenceInfo`
    public static StdVideoDecodeH264ReferenceInfo allocInit(SegmentAllocator allocator, @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment flags, @CType("uint16_t") short FrameNum, @CType("uint16_t") short reserved, @CType("int32_t [ ]") int PicOrderCnt) { return alloc(allocator).flags(flags).FrameNum(FrameNum).reserved(reserved).PicOrderCnt(PicOrderCnt); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo copyFrom(StdVideoDecodeH264ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment flags() { return StdVideoDecodeH264ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment value) { StdVideoDecodeH264ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo flags(@CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment value) { StdVideoDecodeH264ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `FrameNum` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_FrameNum(MemorySegment segment, long index) { return (short) VH_FrameNum.get(segment, 0L, index); }
    /// {@return `FrameNum`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_FrameNum(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfo.get_FrameNum(segment, 0L); }
    /// {@return `FrameNum`}
    public @CType("uint16_t") short FrameNum() { return StdVideoDecodeH264ReferenceInfo.get_FrameNum(this.segment()); }
    /// Sets `FrameNum` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_FrameNum(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_FrameNum.set(segment, 0L, index, value); }
    /// Sets `FrameNum` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_FrameNum(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_FrameNum(segment, 0L, value); }
    /// Sets `FrameNum` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo FrameNum(@CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_FrameNum(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_reserved(MemorySegment segment, long index) { return (short) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_reserved(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfo.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint16_t") short reserved() { return StdVideoDecodeH264ReferenceInfo.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo reserved(@CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_reserved(this.segment(), value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t [ ]") int get_PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    /// @param segment the segment of the struct
    public static @CType("int32_t [ ]") int get_PicOrderCnt(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfo.get_PicOrderCnt(segment, 0L); }
    /// {@return `PicOrderCnt`}
    public @CType("int32_t [ ]") int PicOrderCnt() { return StdVideoDecodeH264ReferenceInfo.get_PicOrderCnt(this.segment()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, long index, @CType("int32_t [ ]") int value) { VH_PicOrderCnt.set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCnt(MemorySegment segment, @CType("int32_t [ ]") int value) { StdVideoDecodeH264ReferenceInfo.set_PicOrderCnt(segment, 0L, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(@CType("int32_t [ ]") int value) { StdVideoDecodeH264ReferenceInfo.set_PicOrderCnt(this.segment(), value); return this; }

    /// A buffer of [StdVideoDecodeH264ReferenceInfo].
    public static final class Buffer extends StdVideoDecodeH264ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeH264ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeH264ReferenceInfo`
        public StdVideoDecodeH264ReferenceInfo asSlice(long index) { return new StdVideoDecodeH264ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeH264ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment flagsAt(long index) { return StdVideoDecodeH264ReferenceInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoDecodeH264ReferenceInfoFlags") MemorySegment value) { StdVideoDecodeH264ReferenceInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `FrameNum` at the given index}
        /// @param index the index
        public @CType("uint16_t") short FrameNumAt(long index) { return StdVideoDecodeH264ReferenceInfo.get_FrameNum(this.segment(), index); }
        /// Sets `FrameNum` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer FrameNumAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_FrameNum(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint16_t") short reservedAt(long index) { return StdVideoDecodeH264ReferenceInfo.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.set_reserved(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index
        public @CType("int32_t [ ]") int PicOrderCntAt(long index) { return StdVideoDecodeH264ReferenceInfo.get_PicOrderCnt(this.segment(), index); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, @CType("int32_t [ ]") int value) { StdVideoDecodeH264ReferenceInfo.set_PicOrderCnt(this.segment(), index, value); return this; }

    }
}
