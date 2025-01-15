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
/// ### num_long_term_sps
/// [VarHandle][#VH_num_long_term_sps] - [Getter][#num_long_term_sps()] - [Setter][#num_long_term_sps(byte)]
/// ### num_long_term_pics
/// [VarHandle][#VH_num_long_term_pics] - [Getter][#num_long_term_pics()] - [Setter][#num_long_term_pics(byte)]
/// ### lt_idx_sps
/// [VarHandle][#VH_lt_idx_sps] - [Getter][#lt_idx_sps()] - [Setter][#lt_idx_sps(byte)]
/// ### poc_lsb_lt
/// [VarHandle][#VH_poc_lsb_lt] - [Getter][#poc_lsb_lt()] - [Setter][#poc_lsb_lt(byte)]
/// ### used_by_curr_pic_lt_flag
/// [VarHandle][#VH_used_by_curr_pic_lt_flag] - [Getter][#used_by_curr_pic_lt_flag()] - [Setter][#used_by_curr_pic_lt_flag(short)]
/// ### delta_poc_msb_present_flag
/// [VarHandle][#VH_delta_poc_msb_present_flag] - [Getter][#delta_poc_msb_present_flag()] - [Setter][#delta_poc_msb_present_flag(byte)]
/// ### delta_poc_msb_cycle_lt
/// [VarHandle][#VH_delta_poc_msb_cycle_lt] - [Getter][#delta_poc_msb_cycle_lt()] - [Setter][#delta_poc_msb_cycle_lt(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265LongTermRefPics {
///     uint8_t num_long_term_sps;
///     uint8_t num_long_term_pics;
///     uint8_t [ ] lt_idx_sps;
///     uint8_t [ ] poc_lsb_lt;
///     uint16_t used_by_curr_pic_lt_flag;
///     uint8_t [ ] delta_poc_msb_present_flag;
///     uint8_t [ ] delta_poc_msb_cycle_lt;
/// } StdVideoEncodeH265LongTermRefPics;
/// ```
public sealed class StdVideoEncodeH265LongTermRefPics extends Struct {
    /// The struct layout of `StdVideoEncodeH265LongTermRefPics`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("num_long_term_sps"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_pics"),
        ValueLayout.JAVA_BYTE.withName("lt_idx_sps"),
        ValueLayout.JAVA_BYTE.withName("poc_lsb_lt"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_lt_flag"),
        ValueLayout.JAVA_BYTE.withName("delta_poc_msb_present_flag"),
        ValueLayout.JAVA_BYTE.withName("delta_poc_msb_cycle_lt")
    );
    /// The [VarHandle] of `num_long_term_sps` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_long_term_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_sps"));
    /// The [VarHandle] of `num_long_term_pics` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_long_term_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_pics"));
    /// The [VarHandle] of `lt_idx_sps` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_lt_idx_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_idx_sps"));
    /// The [VarHandle] of `poc_lsb_lt` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_poc_lsb_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poc_lsb_lt"));
    /// The [VarHandle] of `used_by_curr_pic_lt_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_used_by_curr_pic_lt_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    /// The [VarHandle] of `delta_poc_msb_present_flag` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_poc_msb_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_present_flag"));
    /// The [VarHandle] of `delta_poc_msb_cycle_lt` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_poc_msb_cycle_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_cycle_lt"));

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265LongTermRefPics(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265LongTermRefPics of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265LongTermRefPics ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265LongTermRefPics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265LongTermRefPics`
    public static StdVideoEncodeH265LongTermRefPics alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265LongTermRefPics(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265LongTermRefPics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265LongTermRefPics`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265LongTermRefPics` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265LongTermRefPics`
    public static StdVideoEncodeH265LongTermRefPics allocInit(SegmentAllocator allocator, @CType("uint8_t") byte num_long_term_sps, @CType("uint8_t") byte num_long_term_pics, @CType("uint8_t [ ]") byte lt_idx_sps, @CType("uint8_t [ ]") byte poc_lsb_lt, @CType("uint16_t") short used_by_curr_pic_lt_flag, @CType("uint8_t [ ]") byte delta_poc_msb_present_flag, @CType("uint8_t [ ]") byte delta_poc_msb_cycle_lt) { return alloc(allocator).num_long_term_sps(num_long_term_sps).num_long_term_pics(num_long_term_pics).lt_idx_sps(lt_idx_sps).poc_lsb_lt(poc_lsb_lt).used_by_curr_pic_lt_flag(used_by_curr_pic_lt_flag).delta_poc_msb_present_flag(delta_poc_msb_present_flag).delta_poc_msb_cycle_lt(delta_poc_msb_cycle_lt); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics copyFrom(StdVideoEncodeH265LongTermRefPics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `num_long_term_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_long_term_sps(MemorySegment segment, long index) { return (byte) VH_num_long_term_sps.get(segment, 0L, index); }
    /// {@return `num_long_term_sps`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_long_term_sps(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_sps(segment, 0L); }
    /// {@return `num_long_term_sps`}
    public @CType("uint8_t") byte num_long_term_sps() { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_sps(this.segment()); }
    /// Sets `num_long_term_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_long_term_sps(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_long_term_sps.set(segment, 0L, index, value); }
    /// Sets `num_long_term_sps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_long_term_sps(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_sps(segment, 0L, value); }
    /// Sets `num_long_term_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_sps(@CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_sps(this.segment(), value); return this; }

    /// {@return `num_long_term_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_long_term_pics(MemorySegment segment, long index) { return (byte) VH_num_long_term_pics.get(segment, 0L, index); }
    /// {@return `num_long_term_pics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_long_term_pics(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_pics(segment, 0L); }
    /// {@return `num_long_term_pics`}
    public @CType("uint8_t") byte num_long_term_pics() { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_pics(this.segment()); }
    /// Sets `num_long_term_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_long_term_pics(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_long_term_pics.set(segment, 0L, index, value); }
    /// Sets `num_long_term_pics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_long_term_pics(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_pics(segment, 0L, value); }
    /// Sets `num_long_term_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_pics(@CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_pics(this.segment(), value); return this; }

    /// {@return `lt_idx_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_lt_idx_sps(MemorySegment segment, long index) { return (byte) VH_lt_idx_sps.get(segment, 0L, index); }
    /// {@return `lt_idx_sps`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_lt_idx_sps(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_lt_idx_sps(segment, 0L); }
    /// {@return `lt_idx_sps`}
    public @CType("uint8_t [ ]") byte lt_idx_sps() { return StdVideoEncodeH265LongTermRefPics.get_lt_idx_sps(this.segment()); }
    /// Sets `lt_idx_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lt_idx_sps(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_lt_idx_sps.set(segment, 0L, index, value); }
    /// Sets `lt_idx_sps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lt_idx_sps(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_lt_idx_sps(segment, 0L, value); }
    /// Sets `lt_idx_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(@CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_lt_idx_sps(this.segment(), value); return this; }

    /// {@return `poc_lsb_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_poc_lsb_lt(MemorySegment segment, long index) { return (byte) VH_poc_lsb_lt.get(segment, 0L, index); }
    /// {@return `poc_lsb_lt`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_poc_lsb_lt(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_poc_lsb_lt(segment, 0L); }
    /// {@return `poc_lsb_lt`}
    public @CType("uint8_t [ ]") byte poc_lsb_lt() { return StdVideoEncodeH265LongTermRefPics.get_poc_lsb_lt(this.segment()); }
    /// Sets `poc_lsb_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_poc_lsb_lt(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_poc_lsb_lt.set(segment, 0L, index, value); }
    /// Sets `poc_lsb_lt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_poc_lsb_lt(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_poc_lsb_lt(segment, 0L, value); }
    /// Sets `poc_lsb_lt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(@CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_poc_lsb_lt(this.segment(), value); return this; }

    /// {@return `used_by_curr_pic_lt_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_used_by_curr_pic_lt_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_lt_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_lt_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_used_by_curr_pic_lt_flag(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_used_by_curr_pic_lt_flag(segment, 0L); }
    /// {@return `used_by_curr_pic_lt_flag`}
    public @CType("uint16_t") short used_by_curr_pic_lt_flag() { return StdVideoEncodeH265LongTermRefPics.get_used_by_curr_pic_lt_flag(this.segment()); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_by_curr_pic_lt_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_used_by_curr_pic_lt_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_by_curr_pic_lt_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265LongTermRefPics.set_used_by_curr_pic_lt_flag(segment, 0L, value); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(@CType("uint16_t") short value) { StdVideoEncodeH265LongTermRefPics.set_used_by_curr_pic_lt_flag(this.segment(), value); return this; }

    /// {@return `delta_poc_msb_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_delta_poc_msb_present_flag(MemorySegment segment, long index) { return (byte) VH_delta_poc_msb_present_flag.get(segment, 0L, index); }
    /// {@return `delta_poc_msb_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_delta_poc_msb_present_flag(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_present_flag(segment, 0L); }
    /// {@return `delta_poc_msb_present_flag`}
    public @CType("uint8_t [ ]") byte delta_poc_msb_present_flag() { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_present_flag(this.segment()); }
    /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_poc_msb_present_flag(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_delta_poc_msb_present_flag.set(segment, 0L, index, value); }
    /// Sets `delta_poc_msb_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_poc_msb_present_flag(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_present_flag(segment, 0L, value); }
    /// Sets `delta_poc_msb_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(@CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_present_flag(this.segment(), value); return this; }

    /// {@return `delta_poc_msb_cycle_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_delta_poc_msb_cycle_lt(MemorySegment segment, long index) { return (byte) VH_delta_poc_msb_cycle_lt.get(segment, 0L, index); }
    /// {@return `delta_poc_msb_cycle_lt`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_delta_poc_msb_cycle_lt(MemorySegment segment) { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_cycle_lt(segment, 0L); }
    /// {@return `delta_poc_msb_cycle_lt`}
    public @CType("uint8_t [ ]") byte delta_poc_msb_cycle_lt() { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_cycle_lt(this.segment()); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_poc_msb_cycle_lt(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_delta_poc_msb_cycle_lt.set(segment, 0L, index, value); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_poc_msb_cycle_lt(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_cycle_lt(segment, 0L, value); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(@CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_cycle_lt(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265LongTermRefPics].
    public static final class Buffer extends StdVideoEncodeH265LongTermRefPics {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265LongTermRefPics.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265LongTermRefPics`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265LongTermRefPics`
        public StdVideoEncodeH265LongTermRefPics asSlice(long index) { return new StdVideoEncodeH265LongTermRefPics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265LongTermRefPics`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265LongTermRefPics`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `num_long_term_sps` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_long_term_spsAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_sps(this.segment(), index); }
        /// Sets `num_long_term_sps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_long_term_spsAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_sps(this.segment(), index, value); return this; }

        /// {@return `num_long_term_pics` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_long_term_picsAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_num_long_term_pics(this.segment(), index); }
        /// Sets `num_long_term_pics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_long_term_picsAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265LongTermRefPics.set_num_long_term_pics(this.segment(), index, value); return this; }

        /// {@return `lt_idx_sps` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte lt_idx_spsAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_lt_idx_sps(this.segment(), index); }
        /// Sets `lt_idx_sps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lt_idx_spsAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_lt_idx_sps(this.segment(), index, value); return this; }

        /// {@return `poc_lsb_lt` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte poc_lsb_ltAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_poc_lsb_lt(this.segment(), index); }
        /// Sets `poc_lsb_lt` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer poc_lsb_ltAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_poc_lsb_lt(this.segment(), index, value); return this; }

        /// {@return `used_by_curr_pic_lt_flag` at the given index}
        /// @param index the index
        public @CType("uint16_t") short used_by_curr_pic_lt_flagAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_used_by_curr_pic_lt_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_lt_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_lt_flagAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH265LongTermRefPics.set_used_by_curr_pic_lt_flag(this.segment(), index, value); return this; }

        /// {@return `delta_poc_msb_present_flag` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte delta_poc_msb_present_flagAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_present_flag(this.segment(), index); }
        /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_poc_msb_present_flagAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_present_flag(this.segment(), index, value); return this; }

        /// {@return `delta_poc_msb_cycle_lt` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte delta_poc_msb_cycle_ltAt(long index) { return StdVideoEncodeH265LongTermRefPics.get_delta_poc_msb_cycle_lt(this.segment(), index); }
        /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_poc_msb_cycle_ltAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoEncodeH265LongTermRefPics.set_delta_poc_msb_cycle_lt(this.segment(), index, value); return this; }

    }
}
