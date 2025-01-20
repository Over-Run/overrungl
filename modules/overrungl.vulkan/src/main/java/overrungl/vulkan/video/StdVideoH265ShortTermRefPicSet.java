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
/// ### delta_idx_minus1
/// [VarHandle][#VH_delta_idx_minus1] - [Getter][#delta_idx_minus1()] - [Setter][#delta_idx_minus1(int)]
/// ### use_delta_flag
/// [VarHandle][#VH_use_delta_flag] - [Getter][#use_delta_flag()] - [Setter][#use_delta_flag(short)]
/// ### abs_delta_rps_minus1
/// [VarHandle][#VH_abs_delta_rps_minus1] - [Getter][#abs_delta_rps_minus1()] - [Setter][#abs_delta_rps_minus1(short)]
/// ### used_by_curr_pic_flag
/// [VarHandle][#VH_used_by_curr_pic_flag] - [Getter][#used_by_curr_pic_flag()] - [Setter][#used_by_curr_pic_flag(short)]
/// ### used_by_curr_pic_s0_flag
/// [VarHandle][#VH_used_by_curr_pic_s0_flag] - [Getter][#used_by_curr_pic_s0_flag()] - [Setter][#used_by_curr_pic_s0_flag(short)]
/// ### used_by_curr_pic_s1_flag
/// [VarHandle][#VH_used_by_curr_pic_s1_flag] - [Getter][#used_by_curr_pic_s1_flag()] - [Setter][#used_by_curr_pic_s1_flag(short)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(short)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### reserved3
/// [VarHandle][#VH_reserved3] - [Getter][#reserved3()] - [Setter][#reserved3(byte)]
/// ### num_negative_pics
/// [VarHandle][#VH_num_negative_pics] - [Getter][#num_negative_pics()] - [Setter][#num_negative_pics(byte)]
/// ### num_positive_pics
/// [VarHandle][#VH_num_positive_pics] - [Getter][#num_positive_pics()] - [Setter][#num_positive_pics(byte)]
/// ### delta_poc_s0_minus1
/// [VarHandle][#VH_delta_poc_s0_minus1] - [Getter][#delta_poc_s0_minus1()] - [Setter][#delta_poc_s0_minus1(short)]
/// ### delta_poc_s1_minus1
/// [VarHandle][#VH_delta_poc_s1_minus1] - [Getter][#delta_poc_s1_minus1()] - [Setter][#delta_poc_s1_minus1(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265ShortTermRefPicSet {
///     StdVideoH265ShortTermRefPicSetFlags flags;
///     uint32_t delta_idx_minus1;
///     uint16_t use_delta_flag;
///     uint16_t abs_delta_rps_minus1;
///     uint16_t used_by_curr_pic_flag;
///     uint16_t used_by_curr_pic_s0_flag;
///     uint16_t used_by_curr_pic_s1_flag;
///     uint16_t reserved1;
///     uint8_t reserved2;
///     uint8_t reserved3;
///     uint8_t num_negative_pics;
///     uint8_t num_positive_pics;
///     uint16_t [ ] delta_poc_s0_minus1;
///     uint16_t [ ] delta_poc_s1_minus1;
/// } StdVideoH265ShortTermRefPicSet;
/// ```
public sealed class StdVideoH265ShortTermRefPicSet extends Struct {
    /// The struct layout of `StdVideoH265ShortTermRefPicSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265ShortTermRefPicSetFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("delta_idx_minus1"),
        ValueLayout.JAVA_SHORT.withName("use_delta_flag"),
        ValueLayout.JAVA_SHORT.withName("abs_delta_rps_minus1"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_flag"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_s0_flag"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_s1_flag"),
        ValueLayout.JAVA_SHORT.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_BYTE.withName("reserved3"),
        ValueLayout.JAVA_BYTE.withName("num_negative_pics"),
        ValueLayout.JAVA_BYTE.withName("num_positive_pics"),
        ValueLayout.JAVA_SHORT.withName("delta_poc_s0_minus1"),
        ValueLayout.JAVA_SHORT.withName("delta_poc_s1_minus1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `delta_idx_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_idx_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_idx_minus1"));
    /// The [VarHandle] of `use_delta_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_use_delta_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_delta_flag"));
    /// The [VarHandle] of `abs_delta_rps_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_abs_delta_rps_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("abs_delta_rps_minus1"));
    /// The [VarHandle] of `used_by_curr_pic_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_used_by_curr_pic_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_flag"));
    /// The [VarHandle] of `used_by_curr_pic_s0_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_used_by_curr_pic_s0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_s0_flag"));
    /// The [VarHandle] of `used_by_curr_pic_s1_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_used_by_curr_pic_s1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_s1_flag"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `num_negative_pics` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_negative_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_negative_pics"));
    /// The [VarHandle] of `num_positive_pics` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_positive_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_positive_pics"));
    /// The [VarHandle] of `delta_poc_s0_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_delta_poc_s0_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_s0_minus1"));
    /// The [VarHandle] of `delta_poc_s1_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_delta_poc_s1_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_s1_minus1"));

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ShortTermRefPicSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSet(segment); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSet`
    public static StdVideoH265ShortTermRefPicSet alloc(SegmentAllocator allocator) { return new StdVideoH265ShortTermRefPicSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ShortTermRefPicSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ShortTermRefPicSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSet`
    public static StdVideoH265ShortTermRefPicSet allocInit(SegmentAllocator allocator, @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment flags, @CType("uint32_t") int delta_idx_minus1, @CType("uint16_t") short use_delta_flag, @CType("uint16_t") short abs_delta_rps_minus1, @CType("uint16_t") short used_by_curr_pic_flag, @CType("uint16_t") short used_by_curr_pic_s0_flag, @CType("uint16_t") short used_by_curr_pic_s1_flag, @CType("uint16_t") short reserved1, @CType("uint8_t") byte reserved2, @CType("uint8_t") byte reserved3, @CType("uint8_t") byte num_negative_pics, @CType("uint8_t") byte num_positive_pics, @CType("uint16_t [ ]") short delta_poc_s0_minus1, @CType("uint16_t [ ]") short delta_poc_s1_minus1) { return alloc(allocator).flags(flags).delta_idx_minus1(delta_idx_minus1).use_delta_flag(use_delta_flag).abs_delta_rps_minus1(abs_delta_rps_minus1).used_by_curr_pic_flag(used_by_curr_pic_flag).used_by_curr_pic_s0_flag(used_by_curr_pic_s0_flag).used_by_curr_pic_s1_flag(used_by_curr_pic_s1_flag).reserved1(reserved1).reserved2(reserved2).reserved3(reserved3).num_negative_pics(num_negative_pics).num_positive_pics(num_positive_pics).delta_poc_s0_minus1(delta_poc_s0_minus1).delta_poc_s1_minus1(delta_poc_s1_minus1); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet copyFrom(StdVideoH265ShortTermRefPicSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment flags() { return StdVideoH265ShortTermRefPicSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment value) { StdVideoH265ShortTermRefPicSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet flags(@CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment value) { StdVideoH265ShortTermRefPicSet.set_flags(this.segment(), value); return this; }

    /// {@return `delta_idx_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_delta_idx_minus1(MemorySegment segment, long index) { return (int) VH_delta_idx_minus1.get(segment, 0L, index); }
    /// {@return `delta_idx_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_delta_idx_minus1(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_delta_idx_minus1(segment, 0L); }
    /// {@return `delta_idx_minus1`}
    public @CType("uint32_t") int delta_idx_minus1() { return StdVideoH265ShortTermRefPicSet.get_delta_idx_minus1(this.segment()); }
    /// Sets `delta_idx_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_idx_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_delta_idx_minus1.set(segment, 0L, index, value); }
    /// Sets `delta_idx_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_idx_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265ShortTermRefPicSet.set_delta_idx_minus1(segment, 0L, value); }
    /// Sets `delta_idx_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_idx_minus1(@CType("uint32_t") int value) { StdVideoH265ShortTermRefPicSet.set_delta_idx_minus1(this.segment(), value); return this; }

    /// {@return `use_delta_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_use_delta_flag(MemorySegment segment, long index) { return (short) VH_use_delta_flag.get(segment, 0L, index); }
    /// {@return `use_delta_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_use_delta_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_use_delta_flag(segment, 0L); }
    /// {@return `use_delta_flag`}
    public @CType("uint16_t") short use_delta_flag() { return StdVideoH265ShortTermRefPicSet.get_use_delta_flag(this.segment()); }
    /// Sets `use_delta_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_use_delta_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_use_delta_flag.set(segment, 0L, index, value); }
    /// Sets `use_delta_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_use_delta_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_use_delta_flag(segment, 0L, value); }
    /// Sets `use_delta_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet use_delta_flag(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_use_delta_flag(this.segment(), value); return this; }

    /// {@return `abs_delta_rps_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_abs_delta_rps_minus1(MemorySegment segment, long index) { return (short) VH_abs_delta_rps_minus1.get(segment, 0L, index); }
    /// {@return `abs_delta_rps_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_abs_delta_rps_minus1(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_abs_delta_rps_minus1(segment, 0L); }
    /// {@return `abs_delta_rps_minus1`}
    public @CType("uint16_t") short abs_delta_rps_minus1() { return StdVideoH265ShortTermRefPicSet.get_abs_delta_rps_minus1(this.segment()); }
    /// Sets `abs_delta_rps_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_abs_delta_rps_minus1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_abs_delta_rps_minus1.set(segment, 0L, index, value); }
    /// Sets `abs_delta_rps_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_abs_delta_rps_minus1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_abs_delta_rps_minus1(segment, 0L, value); }
    /// Sets `abs_delta_rps_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_abs_delta_rps_minus1(this.segment(), value); return this; }

    /// {@return `used_by_curr_pic_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_used_by_curr_pic_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_used_by_curr_pic_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_flag(segment, 0L); }
    /// {@return `used_by_curr_pic_flag`}
    public @CType("uint16_t") short used_by_curr_pic_flag() { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_flag(this.segment()); }
    /// Sets `used_by_curr_pic_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_by_curr_pic_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_used_by_curr_pic_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_by_curr_pic_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_flag(segment, 0L, value); }
    /// Sets `used_by_curr_pic_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_flag(this.segment(), value); return this; }

    /// {@return `used_by_curr_pic_s0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_used_by_curr_pic_s0_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_s0_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_s0_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_used_by_curr_pic_s0_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s0_flag(segment, 0L); }
    /// {@return `used_by_curr_pic_s0_flag`}
    public @CType("uint16_t") short used_by_curr_pic_s0_flag() { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s0_flag(this.segment()); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_by_curr_pic_s0_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_used_by_curr_pic_s0_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_by_curr_pic_s0_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s0_flag(segment, 0L, value); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s0_flag(this.segment(), value); return this; }

    /// {@return `used_by_curr_pic_s1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_used_by_curr_pic_s1_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_s1_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_s1_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_used_by_curr_pic_s1_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s1_flag(segment, 0L); }
    /// {@return `used_by_curr_pic_s1_flag`}
    public @CType("uint16_t") short used_by_curr_pic_s1_flag() { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s1_flag(this.segment()); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_by_curr_pic_s1_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_used_by_curr_pic_s1_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_by_curr_pic_s1_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s1_flag(segment, 0L, value); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s1_flag(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_reserved1(MemorySegment segment, long index) { return (short) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_reserved1(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint16_t") short reserved1() { return StdVideoH265ShortTermRefPicSet.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved1(@CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoH265ShortTermRefPicSet.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved2(@CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved2(this.segment(), value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved3(MemorySegment segment, long index) { return (byte) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved3(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_reserved3(segment, 0L); }
    /// {@return `reserved3`}
    public @CType("uint8_t") byte reserved3() { return StdVideoH265ShortTermRefPicSet.get_reserved3(this.segment()); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved3(segment, 0L, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved3(@CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved3(this.segment(), value); return this; }

    /// {@return `num_negative_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_negative_pics(MemorySegment segment, long index) { return (byte) VH_num_negative_pics.get(segment, 0L, index); }
    /// {@return `num_negative_pics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_negative_pics(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_num_negative_pics(segment, 0L); }
    /// {@return `num_negative_pics`}
    public @CType("uint8_t") byte num_negative_pics() { return StdVideoH265ShortTermRefPicSet.get_num_negative_pics(this.segment()); }
    /// Sets `num_negative_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_negative_pics(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_negative_pics.set(segment, 0L, index, value); }
    /// Sets `num_negative_pics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_negative_pics(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_negative_pics(segment, 0L, value); }
    /// Sets `num_negative_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_negative_pics(@CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_negative_pics(this.segment(), value); return this; }

    /// {@return `num_positive_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_positive_pics(MemorySegment segment, long index) { return (byte) VH_num_positive_pics.get(segment, 0L, index); }
    /// {@return `num_positive_pics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_positive_pics(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_num_positive_pics(segment, 0L); }
    /// {@return `num_positive_pics`}
    public @CType("uint8_t") byte num_positive_pics() { return StdVideoH265ShortTermRefPicSet.get_num_positive_pics(this.segment()); }
    /// Sets `num_positive_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_positive_pics(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_positive_pics.set(segment, 0L, index, value); }
    /// Sets `num_positive_pics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_positive_pics(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_positive_pics(segment, 0L, value); }
    /// Sets `num_positive_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_positive_pics(@CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_positive_pics(this.segment(), value); return this; }

    /// {@return `delta_poc_s0_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_delta_poc_s0_minus1(MemorySegment segment, long index) { return (short) VH_delta_poc_s0_minus1.get(segment, 0L, index); }
    /// {@return `delta_poc_s0_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_delta_poc_s0_minus1(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s0_minus1(segment, 0L); }
    /// {@return `delta_poc_s0_minus1`}
    public @CType("uint16_t [ ]") short delta_poc_s0_minus1() { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s0_minus1(this.segment()); }
    /// Sets `delta_poc_s0_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_poc_s0_minus1(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_delta_poc_s0_minus1.set(segment, 0L, index, value); }
    /// Sets `delta_poc_s0_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_poc_s0_minus1(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s0_minus1(segment, 0L, value); }
    /// Sets `delta_poc_s0_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(@CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s0_minus1(this.segment(), value); return this; }

    /// {@return `delta_poc_s1_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_delta_poc_s1_minus1(MemorySegment segment, long index) { return (short) VH_delta_poc_s1_minus1.get(segment, 0L, index); }
    /// {@return `delta_poc_s1_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_delta_poc_s1_minus1(MemorySegment segment) { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s1_minus1(segment, 0L); }
    /// {@return `delta_poc_s1_minus1`}
    public @CType("uint16_t [ ]") short delta_poc_s1_minus1() { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s1_minus1(this.segment()); }
    /// Sets `delta_poc_s1_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_poc_s1_minus1(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_delta_poc_s1_minus1.set(segment, 0L, index, value); }
    /// Sets `delta_poc_s1_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_poc_s1_minus1(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s1_minus1(segment, 0L, value); }
    /// Sets `delta_poc_s1_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(@CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s1_minus1(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265ShortTermRefPicSet].
    public static final class Buffer extends StdVideoH265ShortTermRefPicSet {
        private final long elementCount;

        /// Creates `StdVideoH265ShortTermRefPicSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265ShortTermRefPicSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265ShortTermRefPicSet`
        public StdVideoH265ShortTermRefPicSet asSlice(long index) { return new StdVideoH265ShortTermRefPicSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265ShortTermRefPicSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265ShortTermRefPicSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment flagsAt(long index) { return StdVideoH265ShortTermRefPicSet.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265ShortTermRefPicSetFlags") MemorySegment value) { StdVideoH265ShortTermRefPicSet.set_flags(this.segment(), index, value); return this; }

        /// {@return `delta_idx_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int delta_idx_minus1At(long index) { return StdVideoH265ShortTermRefPicSet.get_delta_idx_minus1(this.segment(), index); }
        /// Sets `delta_idx_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_idx_minus1At(long index, @CType("uint32_t") int value) { StdVideoH265ShortTermRefPicSet.set_delta_idx_minus1(this.segment(), index, value); return this; }

        /// {@return `use_delta_flag` at the given index}
        /// @param index the index
        public @CType("uint16_t") short use_delta_flagAt(long index) { return StdVideoH265ShortTermRefPicSet.get_use_delta_flag(this.segment(), index); }
        /// Sets `use_delta_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer use_delta_flagAt(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_use_delta_flag(this.segment(), index, value); return this; }

        /// {@return `abs_delta_rps_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t") short abs_delta_rps_minus1At(long index) { return StdVideoH265ShortTermRefPicSet.get_abs_delta_rps_minus1(this.segment(), index); }
        /// Sets `abs_delta_rps_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer abs_delta_rps_minus1At(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_abs_delta_rps_minus1(this.segment(), index, value); return this; }

        /// {@return `used_by_curr_pic_flag` at the given index}
        /// @param index the index
        public @CType("uint16_t") short used_by_curr_pic_flagAt(long index) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_flagAt(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_flag(this.segment(), index, value); return this; }

        /// {@return `used_by_curr_pic_s0_flag` at the given index}
        /// @param index the index
        public @CType("uint16_t") short used_by_curr_pic_s0_flagAt(long index) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s0_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_s0_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_s0_flagAt(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s0_flag(this.segment(), index, value); return this; }

        /// {@return `used_by_curr_pic_s1_flag` at the given index}
        /// @param index the index
        public @CType("uint16_t") short used_by_curr_pic_s1_flagAt(long index) { return StdVideoH265ShortTermRefPicSet.get_used_by_curr_pic_s1_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_s1_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_s1_flagAt(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_used_by_curr_pic_s1_flag(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint16_t") short reserved1At(long index) { return StdVideoH265ShortTermRefPicSet.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved2At(long index) { return StdVideoH265ShortTermRefPicSet.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `reserved3` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved3At(long index) { return StdVideoH265ShortTermRefPicSet.get_reserved3(this.segment(), index); }
        /// Sets `reserved3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved3At(long index, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_reserved3(this.segment(), index, value); return this; }

        /// {@return `num_negative_pics` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_negative_picsAt(long index) { return StdVideoH265ShortTermRefPicSet.get_num_negative_pics(this.segment(), index); }
        /// Sets `num_negative_pics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_negative_picsAt(long index, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_negative_pics(this.segment(), index, value); return this; }

        /// {@return `num_positive_pics` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_positive_picsAt(long index) { return StdVideoH265ShortTermRefPicSet.get_num_positive_pics(this.segment(), index); }
        /// Sets `num_positive_pics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_positive_picsAt(long index, @CType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.set_num_positive_pics(this.segment(), index, value); return this; }

        /// {@return `delta_poc_s0_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short delta_poc_s0_minus1At(long index) { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s0_minus1(this.segment(), index); }
        /// Sets `delta_poc_s0_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_poc_s0_minus1At(long index, @CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s0_minus1(this.segment(), index, value); return this; }

        /// {@return `delta_poc_s1_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short delta_poc_s1_minus1At(long index) { return StdVideoH265ShortTermRefPicSet.get_delta_poc_s1_minus1(this.segment(), index); }
        /// Sets `delta_poc_s1_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_poc_s1_minus1At(long index, @CType("uint16_t [ ]") short value) { StdVideoH265ShortTermRefPicSet.set_delta_poc_s1_minus1(this.segment(), index, value); return this; }

    }
}
