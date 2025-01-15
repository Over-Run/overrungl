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
/// ### used_by_curr_pic_lt_sps_flag
/// [VarHandle][#VH_used_by_curr_pic_lt_sps_flag] - [Getter][#used_by_curr_pic_lt_sps_flag()] - [Setter][#used_by_curr_pic_lt_sps_flag(int)]
/// ### lt_ref_pic_poc_lsb_sps
/// [VarHandle][#VH_lt_ref_pic_poc_lsb_sps] - [Getter][#lt_ref_pic_poc_lsb_sps()] - [Setter][#lt_ref_pic_poc_lsb_sps(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265LongTermRefPicsSps {
///     uint32_t used_by_curr_pic_lt_sps_flag;
///     uint32_t [ ] lt_ref_pic_poc_lsb_sps;
/// } StdVideoH265LongTermRefPicsSps;
/// ```
public sealed class StdVideoH265LongTermRefPicsSps extends Struct {
    /// The struct layout of `StdVideoH265LongTermRefPicsSps`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
        ValueLayout.JAVA_INT.withName("lt_ref_pic_poc_lsb_sps")
    );
    /// The [VarHandle] of `used_by_curr_pic_lt_sps_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_used_by_curr_pic_lt_sps_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    /// The [VarHandle] of `lt_ref_pic_poc_lsb_sps` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lt_ref_pic_poc_lsb_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265LongTermRefPicsSps(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265LongTermRefPicsSps of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265LongTermRefPicsSps ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265LongTermRefPicsSps` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265LongTermRefPicsSps`
    public static StdVideoH265LongTermRefPicsSps alloc(SegmentAllocator allocator) { return new StdVideoH265LongTermRefPicsSps(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265LongTermRefPicsSps` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265LongTermRefPicsSps`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265LongTermRefPicsSps` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265LongTermRefPicsSps`
    public static StdVideoH265LongTermRefPicsSps allocInit(SegmentAllocator allocator, @CType("uint32_t") int used_by_curr_pic_lt_sps_flag, @CType("uint32_t [ ]") int lt_ref_pic_poc_lsb_sps) { return alloc(allocator).used_by_curr_pic_lt_sps_flag(used_by_curr_pic_lt_sps_flag).lt_ref_pic_poc_lsb_sps(lt_ref_pic_poc_lsb_sps); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps copyFrom(StdVideoH265LongTermRefPicsSps src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `used_by_curr_pic_lt_sps_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_used_by_curr_pic_lt_sps_flag(MemorySegment segment, long index) { return (int) VH_used_by_curr_pic_lt_sps_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_lt_sps_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_used_by_curr_pic_lt_sps_flag(MemorySegment segment) { return StdVideoH265LongTermRefPicsSps.get_used_by_curr_pic_lt_sps_flag(segment, 0L); }
    /// {@return `used_by_curr_pic_lt_sps_flag`}
    public @CType("uint32_t") int used_by_curr_pic_lt_sps_flag() { return StdVideoH265LongTermRefPicsSps.get_used_by_curr_pic_lt_sps_flag(this.segment()); }
    /// Sets `used_by_curr_pic_lt_sps_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_by_curr_pic_lt_sps_flag(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_used_by_curr_pic_lt_sps_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_lt_sps_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_by_curr_pic_lt_sps_flag(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265LongTermRefPicsSps.set_used_by_curr_pic_lt_sps_flag(segment, 0L, value); }
    /// Sets `used_by_curr_pic_lt_sps_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(@CType("uint32_t") int value) { StdVideoH265LongTermRefPicsSps.set_used_by_curr_pic_lt_sps_flag(this.segment(), value); return this; }

    /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index) { return (int) VH_lt_ref_pic_poc_lsb_sps.get(segment, 0L, index); }
    /// {@return `lt_ref_pic_poc_lsb_sps`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_lt_ref_pic_poc_lsb_sps(MemorySegment segment) { return StdVideoH265LongTermRefPicsSps.get_lt_ref_pic_poc_lsb_sps(segment, 0L); }
    /// {@return `lt_ref_pic_poc_lsb_sps`}
    public @CType("uint32_t [ ]") int lt_ref_pic_poc_lsb_sps() { return StdVideoH265LongTermRefPicsSps.get_lt_ref_pic_poc_lsb_sps(this.segment()); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_lt_ref_pic_poc_lsb_sps.set(segment, 0L, index, value); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lt_ref_pic_poc_lsb_sps(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265LongTermRefPicsSps.set_lt_ref_pic_poc_lsb_sps(segment, 0L, value); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(@CType("uint32_t [ ]") int value) { StdVideoH265LongTermRefPicsSps.set_lt_ref_pic_poc_lsb_sps(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265LongTermRefPicsSps].
    public static final class Buffer extends StdVideoH265LongTermRefPicsSps {
        private final long elementCount;

        /// Creates `StdVideoH265LongTermRefPicsSps.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265LongTermRefPicsSps`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265LongTermRefPicsSps`
        public StdVideoH265LongTermRefPicsSps asSlice(long index) { return new StdVideoH265LongTermRefPicsSps(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265LongTermRefPicsSps`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265LongTermRefPicsSps`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `used_by_curr_pic_lt_sps_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t") int used_by_curr_pic_lt_sps_flagAt(long index) { return StdVideoH265LongTermRefPicsSps.get_used_by_curr_pic_lt_sps_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_lt_sps_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_lt_sps_flagAt(long index, @CType("uint32_t") int value) { StdVideoH265LongTermRefPicsSps.set_used_by_curr_pic_lt_sps_flag(this.segment(), index, value); return this; }

        /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int lt_ref_pic_poc_lsb_spsAt(long index) { return StdVideoH265LongTermRefPicsSps.get_lt_ref_pic_poc_lsb_sps(this.segment(), index); }
        /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lt_ref_pic_poc_lsb_spsAt(long index, @CType("uint32_t [ ]") int value) { StdVideoH265LongTermRefPicsSps.set_lt_ref_pic_poc_lsb_sps(this.segment(), index, value); return this; }

    }
}
