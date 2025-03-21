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
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH264HrdParameters {
///     uint8_t cpb_cnt_minus1;
///     uint8_t bit_rate_scale;
///     uint8_t cpb_size_scale;
///     uint8_t reserved1;
///     uint32_t bit_rate_value_minus1[32];
///     uint32_t cpb_size_value_minus1[32];
///     uint8_t cbr_flag[32];
///     uint32_t initial_cpb_removal_delay_length_minus1;
///     uint32_t cpb_removal_delay_length_minus1;
///     uint32_t dpb_output_delay_length_minus1;
///     uint32_t time_offset_length;
/// };
/// ```
public sealed class StdVideoH264HrdParameters extends GroupType {
    /// The struct layout of `StdVideoH264HrdParameters`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        MemoryLayout.sequenceLayout(32L, ValueLayout.JAVA_INT).withName("bit_rate_value_minus1"),
        MemoryLayout.sequenceLayout(32L, ValueLayout.JAVA_INT).withName("cpb_size_value_minus1"),
        MemoryLayout.sequenceLayout(32L, ValueLayout.JAVA_BYTE).withName("cbr_flag"),
        ValueLayout.JAVA_INT.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("dpb_output_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("time_offset_length")
    );
    /// The byte offset of `cpb_cnt_minus1`.
    public static final long OFFSET_cpb_cnt_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_cnt_minus1"));
    /// The memory layout of `cpb_cnt_minus1`.
    public static final MemoryLayout LAYOUT_cpb_cnt_minus1 = LAYOUT.select(PathElement.groupElement("cpb_cnt_minus1"));
    /// The [VarHandle] of `cpb_cnt_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cpb_cnt_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_cnt_minus1"));
    /// The byte offset of `bit_rate_scale`.
    public static final long OFFSET_bit_rate_scale = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_scale"));
    /// The memory layout of `bit_rate_scale`.
    public static final MemoryLayout LAYOUT_bit_rate_scale = LAYOUT.select(PathElement.groupElement("bit_rate_scale"));
    /// The [VarHandle] of `bit_rate_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_rate_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_scale"));
    /// The byte offset of `cpb_size_scale`.
    public static final long OFFSET_cpb_size_scale = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_scale"));
    /// The memory layout of `cpb_size_scale`.
    public static final MemoryLayout LAYOUT_cpb_size_scale = LAYOUT.select(PathElement.groupElement("cpb_size_scale"));
    /// The [VarHandle] of `cpb_size_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cpb_size_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_scale"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `bit_rate_value_minus1`.
    public static final long OFFSET_bit_rate_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
    /// The memory layout of `bit_rate_value_minus1`.
    public static final MemoryLayout LAYOUT_bit_rate_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_value_minus1"));
    /// The [VarHandle] of `bit_rate_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `cpb_size_value_minus1`.
    public static final long OFFSET_cpb_size_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
    /// The memory layout of `cpb_size_value_minus1`.
    public static final MemoryLayout LAYOUT_cpb_size_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_value_minus1"));
    /// The [VarHandle] of `cpb_size_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `cbr_flag`.
    public static final long OFFSET_cbr_flag = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
    /// The memory layout of `cbr_flag`.
    public static final MemoryLayout LAYOUT_cbr_flag = LAYOUT.select(PathElement.groupElement("cbr_flag"));
    /// The [VarHandle] of `cbr_flag` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"), PathElement.sequenceElement());
    /// The byte offset of `initial_cpb_removal_delay_length_minus1`.
    public static final long OFFSET_initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The memory layout of `initial_cpb_removal_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_initial_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `initial_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initial_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The byte offset of `cpb_removal_delay_length_minus1`.
    public static final long OFFSET_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    /// The memory layout of `cpb_removal_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    /// The byte offset of `dpb_output_delay_length_minus1`.
    public static final long OFFSET_dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The memory layout of `dpb_output_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_dpb_output_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dpb_output_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The byte offset of `time_offset_length`.
    public static final long OFFSET_time_offset_length = LAYOUT.byteOffset(PathElement.groupElement("time_offset_length"));
    /// The memory layout of `time_offset_length`.
    public static final MemoryLayout LAYOUT_time_offset_length = LAYOUT.select(PathElement.groupElement("time_offset_length"));
    /// The [VarHandle] of `time_offset_length` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_time_offset_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_offset_length"));

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264HrdParameters(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264HrdParameters ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH264HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264HrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264HrdParameters`
    public static StdVideoH264HrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH264HrdParameters(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264HrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264HrdParameters`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264HrdParameters copyFrom(StdVideoH264HrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `cpb_cnt_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cpb_cnt_minus1(MemorySegment segment, long index) { return (byte) VH_cpb_cnt_minus1.get(segment, 0L, index); }
    /// {@return `cpb_cnt_minus1`}
    public byte cpb_cnt_minus1() { return cpb_cnt_minus1(this.segment(), 0L); }
    /// Sets `cpb_cnt_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_cnt_minus1(MemorySegment segment, long index, byte value) { VH_cpb_cnt_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_cnt_minus1(byte value) { cpb_cnt_minus1(this.segment(), 0L, value); return this; }

    /// {@return `bit_rate_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_rate_scale(MemorySegment segment, long index) { return (byte) VH_bit_rate_scale.get(segment, 0L, index); }
    /// {@return `bit_rate_scale`}
    public byte bit_rate_scale() { return bit_rate_scale(this.segment(), 0L); }
    /// Sets `bit_rate_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_rate_scale(MemorySegment segment, long index, byte value) { VH_bit_rate_scale.set(segment, 0L, index, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters bit_rate_scale(byte value) { bit_rate_scale(this.segment(), 0L, value); return this; }

    /// {@return `cpb_size_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cpb_size_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_scale`}
    public byte cpb_size_scale() { return cpb_size_scale(this.segment(), 0L); }
    /// Sets `cpb_size_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_scale(MemorySegment segment, long index, byte value) { VH_cpb_size_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_size_scale(byte value) { cpb_size_scale(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment bit_rate_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1); }
    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int bit_rate_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_bit_rate_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `bit_rate_value_minus1`}
    public MemorySegment bit_rate_value_minus1() { return bit_rate_value_minus1(this.segment(), 0L); }
    /// {@return `bit_rate_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int bit_rate_value_minus1(long index0) { return bit_rate_value_minus1(this.segment(), 0L, index0); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_rate_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1.byteSize()); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void bit_rate_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_bit_rate_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters bit_rate_value_minus1(MemorySegment value) { bit_rate_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters bit_rate_value_minus1(long index0, int value) { bit_rate_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cpb_size_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1); }
    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int cpb_size_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_cpb_size_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `cpb_size_value_minus1`}
    public MemorySegment cpb_size_value_minus1() { return cpb_size_value_minus1(this.segment(), 0L); }
    /// {@return `cpb_size_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int cpb_size_value_minus1(long index0) { return cpb_size_value_minus1(this.segment(), 0L, index0); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1.byteSize()); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cpb_size_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_cpb_size_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_size_value_minus1(MemorySegment value) { cpb_size_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_size_value_minus1(long index0, int value) { cpb_size_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `cbr_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cbr_flag(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cbr_flag, index), LAYOUT_cbr_flag); }
    /// {@return `cbr_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cbr_flag(MemorySegment segment, long index, long index0) { return (byte) VH_cbr_flag.get(segment, 0L, index, index0); }
    /// {@return `cbr_flag`}
    public MemorySegment cbr_flag() { return cbr_flag(this.segment(), 0L); }
    /// {@return `cbr_flag`}
    /// @param index0 the Index 0 of the array
    public byte cbr_flag(long index0) { return cbr_flag(this.segment(), 0L, index0); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cbr_flag(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cbr_flag, index), LAYOUT_cbr_flag.byteSize()); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cbr_flag(MemorySegment segment, long index, long index0, byte value) { VH_cbr_flag.set(segment, 0L, index, index0, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cbr_flag(MemorySegment value) { cbr_flag(this.segment(), 0L, value); return this; }
    /// Sets `cbr_flag` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cbr_flag(long index0, byte value) { cbr_flag(this.segment(), 0L, index0, value); return this; }

    /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_initial_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    public int initial_cpb_removal_delay_length_minus1() { return initial_cpb_removal_delay_length_minus1(this.segment(), 0L); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index, int value) { VH_initial_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(int value) { initial_cpb_removal_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `cpb_removal_delay_length_minus1`}
    public int cpb_removal_delay_length_minus1() { return cpb_removal_delay_length_minus1(this.segment(), 0L); }
    /// Sets `cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_removal_delay_length_minus1(MemorySegment segment, long index, int value) { VH_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(int value) { cpb_removal_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `dpb_output_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dpb_output_delay_length_minus1(MemorySegment segment, long index) { return (int) VH_dpb_output_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_length_minus1`}
    public int dpb_output_delay_length_minus1() { return dpb_output_delay_length_minus1(this.segment(), 0L); }
    /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dpb_output_delay_length_minus1(MemorySegment segment, long index, int value) { VH_dpb_output_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(int value) { dpb_output_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `time_offset_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int time_offset_length(MemorySegment segment, long index) { return (int) VH_time_offset_length.get(segment, 0L, index); }
    /// {@return `time_offset_length`}
    public int time_offset_length() { return time_offset_length(this.segment(), 0L); }
    /// Sets `time_offset_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void time_offset_length(MemorySegment segment, long index, int value) { VH_time_offset_length.set(segment, 0L, index, value); }
    /// Sets `time_offset_length` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264HrdParameters time_offset_length(int value) { time_offset_length(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public byte cpb_cnt_minus1At(long index) { return cpb_cnt_minus1(this.segment(), index); }
        /// Sets `cpb_cnt_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_cnt_minus1At(long index, byte value) { cpb_cnt_minus1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_scale` at the given index}
        /// @param index the index of the struct buffer
        public byte bit_rate_scaleAt(long index) { return bit_rate_scale(this.segment(), index); }
        /// Sets `bit_rate_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_scaleAt(long index, byte value) { bit_rate_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_scale` at the given index}
        /// @param index the index of the struct buffer
        public byte cpb_size_scaleAt(long index) { return cpb_size_scale(this.segment(), index); }
        /// Sets `cpb_size_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_scaleAt(long index, byte value) { cpb_size_scale(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved1At(long index) { return reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_value_minus1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment bit_rate_value_minus1At(long index) { return bit_rate_value_minus1(this.segment(), index); }
        /// {@return `bit_rate_value_minus1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int bit_rate_value_minus1At(long index, long index0) { return bit_rate_value_minus1(this.segment(), index, index0); }
        /// Sets `bit_rate_value_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_value_minus1At(long index, MemorySegment value) { bit_rate_value_minus1(this.segment(), index, value); return this; }
        /// Sets `bit_rate_value_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_value_minus1At(long index, long index0, int value) { bit_rate_value_minus1(this.segment(), index, index0, value); return this; }

        /// {@return `cpb_size_value_minus1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cpb_size_value_minus1At(long index) { return cpb_size_value_minus1(this.segment(), index); }
        /// {@return `cpb_size_value_minus1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int cpb_size_value_minus1At(long index, long index0) { return cpb_size_value_minus1(this.segment(), index, index0); }
        /// Sets `cpb_size_value_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_value_minus1At(long index, MemorySegment value) { cpb_size_value_minus1(this.segment(), index, value); return this; }
        /// Sets `cpb_size_value_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_value_minus1At(long index, long index0, int value) { cpb_size_value_minus1(this.segment(), index, index0, value); return this; }

        /// {@return `cbr_flag` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cbr_flagAt(long index) { return cbr_flag(this.segment(), index); }
        /// {@return `cbr_flag` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cbr_flagAt(long index, long index0) { return cbr_flag(this.segment(), index, index0); }
        /// Sets `cbr_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cbr_flagAt(long index, MemorySegment value) { cbr_flag(this.segment(), index, value); return this; }
        /// Sets `cbr_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cbr_flagAt(long index, long index0, byte value) { cbr_flag(this.segment(), index, index0, value); return this; }

        /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public int initial_cpb_removal_delay_length_minus1At(long index) { return initial_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer initial_cpb_removal_delay_length_minus1At(long index, int value) { initial_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public int cpb_removal_delay_length_minus1At(long index) { return cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_removal_delay_length_minus1At(long index, int value) { cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public int dpb_output_delay_length_minus1At(long index) { return dpb_output_delay_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_length_minus1At(long index, int value) { dpb_output_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `time_offset_length` at the given index}
        /// @param index the index of the struct buffer
        public int time_offset_lengthAt(long index) { return time_offset_length(this.segment(), index); }
        /// Sets `time_offset_length` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer time_offset_lengthAt(long index, int value) { time_offset_length(this.segment(), index, value); return this; }

    }
}
