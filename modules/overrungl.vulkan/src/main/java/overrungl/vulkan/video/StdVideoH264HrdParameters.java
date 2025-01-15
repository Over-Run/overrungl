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
/// ### cpb_cnt_minus1
/// [VarHandle][#VH_cpb_cnt_minus1] - [Getter][#cpb_cnt_minus1()] - [Setter][#cpb_cnt_minus1(byte)]
/// ### bit_rate_scale
/// [VarHandle][#VH_bit_rate_scale] - [Getter][#bit_rate_scale()] - [Setter][#bit_rate_scale(byte)]
/// ### cpb_size_scale
/// [VarHandle][#VH_cpb_size_scale] - [Getter][#cpb_size_scale()] - [Setter][#cpb_size_scale(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### bit_rate_value_minus1
/// [VarHandle][#VH_bit_rate_value_minus1] - [Getter][#bit_rate_value_minus1()] - [Setter][#bit_rate_value_minus1(int)]
/// ### cpb_size_value_minus1
/// [VarHandle][#VH_cpb_size_value_minus1] - [Getter][#cpb_size_value_minus1()] - [Setter][#cpb_size_value_minus1(int)]
/// ### cbr_flag
/// [VarHandle][#VH_cbr_flag] - [Getter][#cbr_flag()] - [Setter][#cbr_flag(byte)]
/// ### initial_cpb_removal_delay_length_minus1
/// [VarHandle][#VH_initial_cpb_removal_delay_length_minus1] - [Getter][#initial_cpb_removal_delay_length_minus1()] - [Setter][#initial_cpb_removal_delay_length_minus1(int)]
/// ### cpb_removal_delay_length_minus1
/// [VarHandle][#VH_cpb_removal_delay_length_minus1] - [Getter][#cpb_removal_delay_length_minus1()] - [Setter][#cpb_removal_delay_length_minus1(int)]
/// ### dpb_output_delay_length_minus1
/// [VarHandle][#VH_dpb_output_delay_length_minus1] - [Getter][#dpb_output_delay_length_minus1()] - [Setter][#dpb_output_delay_length_minus1(int)]
/// ### time_offset_length
/// [VarHandle][#VH_time_offset_length] - [Getter][#time_offset_length()] - [Setter][#time_offset_length(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264HrdParameters {
///     uint8_t cpb_cnt_minus1;
///     uint8_t bit_rate_scale;
///     uint8_t cpb_size_scale;
///     uint8_t reserved1;
///     uint32_t [ ] bit_rate_value_minus1;
///     uint32_t [ ] cpb_size_value_minus1;
///     uint8_t [ ] cbr_flag;
///     uint32_t initial_cpb_removal_delay_length_minus1;
///     uint32_t cpb_removal_delay_length_minus1;
///     uint32_t dpb_output_delay_length_minus1;
///     uint32_t time_offset_length;
/// } StdVideoH264HrdParameters;
/// ```
public sealed class StdVideoH264HrdParameters extends Struct {
    /// The struct layout of `StdVideoH264HrdParameters`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("bit_rate_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_value_minus1"),
        ValueLayout.JAVA_BYTE.withName("cbr_flag"),
        ValueLayout.JAVA_INT.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("dpb_output_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("time_offset_length")
    );
    /// The [VarHandle] of `cpb_cnt_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cpb_cnt_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_cnt_minus1"));
    /// The [VarHandle] of `bit_rate_scale` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_rate_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_scale"));
    /// The [VarHandle] of `cpb_size_scale` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cpb_size_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_scale"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `bit_rate_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"));
    /// The [VarHandle] of `cpb_size_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"));
    /// The [VarHandle] of `cbr_flag` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"));
    /// The [VarHandle] of `initial_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initial_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dpb_output_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The [VarHandle] of `time_offset_length` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_time_offset_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_offset_length"));

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264HrdParameters(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264HrdParameters of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264HrdParameters ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH264HrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264HrdParameters`
    public static StdVideoH264HrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH264HrdParameters(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264HrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264HrdParameters`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH264HrdParameters` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264HrdParameters`
    public static StdVideoH264HrdParameters allocInit(SegmentAllocator allocator, @CType("uint8_t") byte cpb_cnt_minus1, @CType("uint8_t") byte bit_rate_scale, @CType("uint8_t") byte cpb_size_scale, @CType("uint8_t") byte reserved1, @CType("uint32_t [ ]") int bit_rate_value_minus1, @CType("uint32_t [ ]") int cpb_size_value_minus1, @CType("uint8_t [ ]") byte cbr_flag, @CType("uint32_t") int initial_cpb_removal_delay_length_minus1, @CType("uint32_t") int cpb_removal_delay_length_minus1, @CType("uint32_t") int dpb_output_delay_length_minus1, @CType("uint32_t") int time_offset_length) { return alloc(allocator).cpb_cnt_minus1(cpb_cnt_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).reserved1(reserved1).bit_rate_value_minus1(bit_rate_value_minus1).cpb_size_value_minus1(cpb_size_value_minus1).cbr_flag(cbr_flag).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).cpb_removal_delay_length_minus1(cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).time_offset_length(time_offset_length); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264HrdParameters copyFrom(StdVideoH264HrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `cpb_cnt_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cpb_cnt_minus1(MemorySegment segment, long index) { return (byte) VH_cpb_cnt_minus1.get(segment, 0L, index); }
    /// {@return `cpb_cnt_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cpb_cnt_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_cpb_cnt_minus1(segment, 0L); }
    /// {@return `cpb_cnt_minus1`}
    public @CType("uint8_t") byte cpb_cnt_minus1() { return StdVideoH264HrdParameters.get_cpb_cnt_minus1(this.segment()); }
    /// Sets `cpb_cnt_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_cnt_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cpb_cnt_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_cnt_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_cnt_minus1(segment, 0L, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_cnt_minus1(@CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_cnt_minus1(this.segment(), value); return this; }

    /// {@return `bit_rate_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_rate_scale(MemorySegment segment, long index) { return (byte) VH_bit_rate_scale.get(segment, 0L, index); }
    /// {@return `bit_rate_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_rate_scale(MemorySegment segment) { return StdVideoH264HrdParameters.get_bit_rate_scale(segment, 0L); }
    /// {@return `bit_rate_scale`}
    public @CType("uint8_t") byte bit_rate_scale() { return StdVideoH264HrdParameters.get_bit_rate_scale(this.segment()); }
    /// Sets `bit_rate_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_rate_scale(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_rate_scale.set(segment, 0L, index, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_rate_scale(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_bit_rate_scale(segment, 0L, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters bit_rate_scale(@CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_bit_rate_scale(this.segment(), value); return this; }

    /// {@return `cpb_size_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cpb_size_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cpb_size_scale(MemorySegment segment) { return StdVideoH264HrdParameters.get_cpb_size_scale(segment, 0L); }
    /// {@return `cpb_size_scale`}
    public @CType("uint8_t") byte cpb_size_scale() { return StdVideoH264HrdParameters.get_cpb_size_scale(this.segment()); }
    /// Sets `cpb_size_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_scale(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cpb_size_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_scale(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_size_scale(segment, 0L, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_size_scale(@CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_size_scale(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH264HrdParameters.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH264HrdParameters.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters reserved1(@CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_reserved1(this.segment(), value); return this; }

    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_bit_rate_value_minus1(MemorySegment segment, long index) { return (int) VH_bit_rate_value_minus1.get(segment, 0L, index); }
    /// {@return `bit_rate_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_bit_rate_value_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_bit_rate_value_minus1(segment, 0L); }
    /// {@return `bit_rate_value_minus1`}
    public @CType("uint32_t [ ]") int bit_rate_value_minus1() { return StdVideoH264HrdParameters.get_bit_rate_value_minus1(this.segment()); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_rate_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_bit_rate_value_minus1.set(segment, 0L, index, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_rate_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_bit_rate_value_minus1(segment, 0L, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters bit_rate_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_bit_rate_value_minus1(this.segment(), value); return this; }

    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_cpb_size_value_minus1(MemorySegment segment, long index) { return (int) VH_cpb_size_value_minus1.get(segment, 0L, index); }
    /// {@return `cpb_size_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_cpb_size_value_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_cpb_size_value_minus1(segment, 0L); }
    /// {@return `cpb_size_value_minus1`}
    public @CType("uint32_t [ ]") int cpb_size_value_minus1() { return StdVideoH264HrdParameters.get_cpb_size_value_minus1(this.segment()); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_cpb_size_value_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_cpb_size_value_minus1(segment, 0L, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_size_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_cpb_size_value_minus1(this.segment(), value); return this; }

    /// {@return `cbr_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cbr_flag(MemorySegment segment, long index) { return (byte) VH_cbr_flag.get(segment, 0L, index); }
    /// {@return `cbr_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cbr_flag(MemorySegment segment) { return StdVideoH264HrdParameters.get_cbr_flag(segment, 0L); }
    /// {@return `cbr_flag`}
    public @CType("uint8_t [ ]") byte cbr_flag() { return StdVideoH264HrdParameters.get_cbr_flag(this.segment()); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cbr_flag(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cbr_flag.set(segment, 0L, index, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cbr_flag(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH264HrdParameters.set_cbr_flag(segment, 0L, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cbr_flag(@CType("uint8_t [ ]") byte value) { StdVideoH264HrdParameters.set_cbr_flag(this.segment(), value); return this; }

    /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_initial_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_initial_cpb_removal_delay_length_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_initial_cpb_removal_delay_length_minus1(segment, 0L); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    public @CType("uint32_t") int initial_cpb_removal_delay_length_minus1() { return StdVideoH264HrdParameters.get_initial_cpb_removal_delay_length_minus1(this.segment()); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_initial_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initial_cpb_removal_delay_length_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_initial_cpb_removal_delay_length_minus1(segment, 0L, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(@CType("uint32_t") int value) { StdVideoH264HrdParameters.set_initial_cpb_removal_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `cpb_removal_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cpb_removal_delay_length_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_cpb_removal_delay_length_minus1(segment, 0L); }
    /// {@return `cpb_removal_delay_length_minus1`}
    public @CType("uint32_t") int cpb_removal_delay_length_minus1() { return StdVideoH264HrdParameters.get_cpb_removal_delay_length_minus1(this.segment()); }
    /// Sets `cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_removal_delay_length_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_removal_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_removal_delay_length_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_cpb_removal_delay_length_minus1(segment, 0L, value); }
    /// Sets `cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(@CType("uint32_t") int value) { StdVideoH264HrdParameters.set_cpb_removal_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `dpb_output_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dpb_output_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_dpb_output_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dpb_output_delay_length_minus1(MemorySegment segment) { return StdVideoH264HrdParameters.get_dpb_output_delay_length_minus1(segment, 0L); }
    /// {@return `dpb_output_delay_length_minus1`}
    public @CType("uint32_t") int dpb_output_delay_length_minus1() { return StdVideoH264HrdParameters.get_dpb_output_delay_length_minus1(this.segment()); }
    /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dpb_output_delay_length_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dpb_output_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dpb_output_delay_length_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_dpb_output_delay_length_minus1(segment, 0L, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(@CType("uint32_t") int value) { StdVideoH264HrdParameters.set_dpb_output_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `time_offset_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_time_offset_length(MemorySegment segment, long index) { return (int) VH_time_offset_length.get(segment, 0L, index); }
    /// {@return `time_offset_length`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_time_offset_length(MemorySegment segment) { return StdVideoH264HrdParameters.get_time_offset_length(segment, 0L); }
    /// {@return `time_offset_length`}
    public @CType("uint32_t") int time_offset_length() { return StdVideoH264HrdParameters.get_time_offset_length(this.segment()); }
    /// Sets `time_offset_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_time_offset_length(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_time_offset_length.set(segment, 0L, index, value); }
    /// Sets `time_offset_length` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_time_offset_length(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_time_offset_length(segment, 0L, value); }
    /// Sets `time_offset_length` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters time_offset_length(@CType("uint32_t") int value) { StdVideoH264HrdParameters.set_time_offset_length(this.segment(), value); return this; }

    /// A buffer of [StdVideoH264HrdParameters].
    public static final class Buffer extends StdVideoH264HrdParameters {
        private final long elementCount;

        /// Creates `StdVideoH264HrdParameters.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH264HrdParameters`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH264HrdParameters`
        public StdVideoH264HrdParameters asSlice(long index) { return new StdVideoH264HrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH264HrdParameters`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH264HrdParameters`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `cpb_cnt_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cpb_cnt_minus1At(long index) { return StdVideoH264HrdParameters.get_cpb_cnt_minus1(this.segment(), index); }
        /// Sets `cpb_cnt_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_cnt_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_cnt_minus1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_scale` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte bit_rate_scaleAt(long index) { return StdVideoH264HrdParameters.get_bit_rate_scale(this.segment(), index); }
        /// Sets `bit_rate_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_scaleAt(long index, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_bit_rate_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_scale` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cpb_size_scaleAt(long index) { return StdVideoH264HrdParameters.get_cpb_size_scale(this.segment(), index); }
        /// Sets `cpb_size_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_scaleAt(long index, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_cpb_size_scale(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH264HrdParameters.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH264HrdParameters.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int bit_rate_value_minus1At(long index) { return StdVideoH264HrdParameters.get_bit_rate_value_minus1(this.segment(), index); }
        /// Sets `bit_rate_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_bit_rate_value_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_size_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int cpb_size_value_minus1At(long index) { return StdVideoH264HrdParameters.get_cpb_size_value_minus1(this.segment(), index); }
        /// Sets `cpb_size_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH264HrdParameters.set_cpb_size_value_minus1(this.segment(), index, value); return this; }

        /// {@return `cbr_flag` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte cbr_flagAt(long index) { return StdVideoH264HrdParameters.get_cbr_flag(this.segment(), index); }
        /// Sets `cbr_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cbr_flagAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoH264HrdParameters.set_cbr_flag(this.segment(), index, value); return this; }

        /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int initial_cpb_removal_delay_length_minus1At(long index) { return StdVideoH264HrdParameters.get_initial_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer initial_cpb_removal_delay_length_minus1At(long index, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_initial_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int cpb_removal_delay_length_minus1At(long index) { return StdVideoH264HrdParameters.get_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_removal_delay_length_minus1At(long index, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dpb_output_delay_length_minus1At(long index) { return StdVideoH264HrdParameters.get_dpb_output_delay_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_length_minus1At(long index, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_dpb_output_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `time_offset_length` at the given index}
        /// @param index the index
        public @CType("uint32_t") int time_offset_lengthAt(long index) { return StdVideoH264HrdParameters.get_time_offset_length(this.segment(), index); }
        /// Sets `time_offset_length` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer time_offset_lengthAt(long index, @CType("uint32_t") int value) { StdVideoH264HrdParameters.set_time_offset_length(this.segment(), index, value); return this; }

    }
}
