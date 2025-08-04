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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH265LongTermRefPics {
///     uint8_t num_long_term_sps;
///     uint8_t num_long_term_pics;
///     uint8_t lt_idx_sps[32];
///     uint8_t poc_lsb_lt[16];
///     uint16_t used_by_curr_pic_lt_flag;
///     uint8_t delta_poc_msb_present_flag[48];
///     uint8_t delta_poc_msb_cycle_lt[48];
/// };
/// ```
public final class StdVideoEncodeH265LongTermRefPics extends GroupType {
    /// The struct layout of `StdVideoEncodeH265LongTermRefPics`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("num_long_term_sps"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_pics"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("lt_idx_sps"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("poc_lsb_lt"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_lt_flag"),
        MemoryLayout.sequenceLayout(48, ValueLayout.JAVA_BYTE).withName("delta_poc_msb_present_flag"),
        MemoryLayout.sequenceLayout(48, ValueLayout.JAVA_BYTE).withName("delta_poc_msb_cycle_lt")
    );
    /// The byte offset of `num_long_term_sps`.
    public static final long OFFSET_num_long_term_sps = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_sps"));
    /// The memory layout of `num_long_term_sps`.
    public static final MemoryLayout LAYOUT_num_long_term_sps = LAYOUT.select(PathElement.groupElement("num_long_term_sps"));
    /// The [VarHandle] of `num_long_term_sps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_long_term_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_sps"));
    /// The byte offset of `num_long_term_pics`.
    public static final long OFFSET_num_long_term_pics = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_pics"));
    /// The memory layout of `num_long_term_pics`.
    public static final MemoryLayout LAYOUT_num_long_term_pics = LAYOUT.select(PathElement.groupElement("num_long_term_pics"));
    /// The [VarHandle] of `num_long_term_pics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_long_term_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_pics"));
    /// The byte offset of `lt_idx_sps`.
    public static final long OFFSET_lt_idx_sps = LAYOUT.byteOffset(PathElement.groupElement("lt_idx_sps"));
    /// The memory layout of `lt_idx_sps`.
    public static final MemoryLayout LAYOUT_lt_idx_sps = LAYOUT.select(PathElement.groupElement("lt_idx_sps"));
    /// The [VarHandle] of `lt_idx_sps` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_lt_idx_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_idx_sps"), PathElement.sequenceElement());
    /// The byte offset of `poc_lsb_lt`.
    public static final long OFFSET_poc_lsb_lt = LAYOUT.byteOffset(PathElement.groupElement("poc_lsb_lt"));
    /// The memory layout of `poc_lsb_lt`.
    public static final MemoryLayout LAYOUT_poc_lsb_lt = LAYOUT.select(PathElement.groupElement("poc_lsb_lt"));
    /// The [VarHandle] of `poc_lsb_lt` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_poc_lsb_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poc_lsb_lt"), PathElement.sequenceElement());
    /// The byte offset of `used_by_curr_pic_lt_flag`.
    public static final long OFFSET_used_by_curr_pic_lt_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    /// The memory layout of `used_by_curr_pic_lt_flag`.
    public static final MemoryLayout LAYOUT_used_by_curr_pic_lt_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    /// The [VarHandle] of `used_by_curr_pic_lt_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_used_by_curr_pic_lt_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    /// The byte offset of `delta_poc_msb_present_flag`.
    public static final long OFFSET_delta_poc_msb_present_flag = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_present_flag"));
    /// The memory layout of `delta_poc_msb_present_flag`.
    public static final MemoryLayout LAYOUT_delta_poc_msb_present_flag = LAYOUT.select(PathElement.groupElement("delta_poc_msb_present_flag"));
    /// The [VarHandle] of `delta_poc_msb_present_flag` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_poc_msb_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_present_flag"), PathElement.sequenceElement());
    /// The byte offset of `delta_poc_msb_cycle_lt`.
    public static final long OFFSET_delta_poc_msb_cycle_lt = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_cycle_lt"));
    /// The memory layout of `delta_poc_msb_cycle_lt`.
    public static final MemoryLayout LAYOUT_delta_poc_msb_cycle_lt = LAYOUT.select(PathElement.groupElement("delta_poc_msb_cycle_lt"));
    /// The [VarHandle] of `delta_poc_msb_cycle_lt` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_poc_msb_cycle_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_cycle_lt"), PathElement.sequenceElement());

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265LongTermRefPics(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265LongTermRefPics of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265LongTermRefPics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265LongTermRefPics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265LongTermRefPics ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265LongTermRefPics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265LongTermRefPics`
    public static StdVideoEncodeH265LongTermRefPics alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265LongTermRefPics(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265LongTermRefPics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265LongTermRefPics`
    public static StdVideoEncodeH265LongTermRefPics alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265LongTermRefPics(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics copyFrom(StdVideoEncodeH265LongTermRefPics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265LongTermRefPics reinterpret(long count) { return new StdVideoEncodeH265LongTermRefPics(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `num_long_term_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_long_term_sps(MemorySegment segment, long index) { return (byte) VH_num_long_term_sps.get(segment, 0L, index); }
    /// {@return `num_long_term_sps`}
    public byte num_long_term_sps() { return num_long_term_sps(this.segment(), 0L); }
    /// Sets `num_long_term_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_long_term_sps(MemorySegment segment, long index, byte value) { VH_num_long_term_sps.set(segment, 0L, index, value); }
    /// Sets `num_long_term_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_sps(byte value) { num_long_term_sps(this.segment(), 0L, value); return this; }

    /// {@return `num_long_term_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_long_term_pics(MemorySegment segment, long index) { return (byte) VH_num_long_term_pics.get(segment, 0L, index); }
    /// {@return `num_long_term_pics`}
    public byte num_long_term_pics() { return num_long_term_pics(this.segment(), 0L); }
    /// Sets `num_long_term_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_long_term_pics(MemorySegment segment, long index, byte value) { VH_num_long_term_pics.set(segment, 0L, index, value); }
    /// Sets `num_long_term_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_pics(byte value) { num_long_term_pics(this.segment(), 0L, value); return this; }

    /// {@return `lt_idx_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment lt_idx_sps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_lt_idx_sps, index), LAYOUT_lt_idx_sps); }
    /// {@return `lt_idx_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte lt_idx_sps(MemorySegment segment, long index, long index0) { return (byte) VH_lt_idx_sps.get(segment, 0L, index, index0); }
    /// {@return `lt_idx_sps`}
    public MemorySegment lt_idx_sps() { return lt_idx_sps(this.segment(), 0L); }
    /// {@return `lt_idx_sps`}
    /// @param index0 the Index 0 of the array
    public byte lt_idx_sps(long index0) { return lt_idx_sps(this.segment(), 0L, index0); }
    /// Sets `lt_idx_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lt_idx_sps(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_lt_idx_sps, index), LAYOUT_lt_idx_sps.byteSize()); }
    /// Sets `lt_idx_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void lt_idx_sps(MemorySegment segment, long index, long index0, byte value) { VH_lt_idx_sps.set(segment, 0L, index, index0, value); }
    /// Sets `lt_idx_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(MemorySegment value) { lt_idx_sps(this.segment(), 0L, value); return this; }
    /// Sets `lt_idx_sps` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(long index0, byte value) { lt_idx_sps(this.segment(), 0L, index0, value); return this; }

    /// {@return `poc_lsb_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment poc_lsb_lt(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_poc_lsb_lt, index), LAYOUT_poc_lsb_lt); }
    /// {@return `poc_lsb_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte poc_lsb_lt(MemorySegment segment, long index, long index0) { return (byte) VH_poc_lsb_lt.get(segment, 0L, index, index0); }
    /// {@return `poc_lsb_lt`}
    public MemorySegment poc_lsb_lt() { return poc_lsb_lt(this.segment(), 0L); }
    /// {@return `poc_lsb_lt`}
    /// @param index0 the Index 0 of the array
    public byte poc_lsb_lt(long index0) { return poc_lsb_lt(this.segment(), 0L, index0); }
    /// Sets `poc_lsb_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void poc_lsb_lt(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_poc_lsb_lt, index), LAYOUT_poc_lsb_lt.byteSize()); }
    /// Sets `poc_lsb_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void poc_lsb_lt(MemorySegment segment, long index, long index0, byte value) { VH_poc_lsb_lt.set(segment, 0L, index, index0, value); }
    /// Sets `poc_lsb_lt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(MemorySegment value) { poc_lsb_lt(this.segment(), 0L, value); return this; }
    /// Sets `poc_lsb_lt` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(long index0, byte value) { poc_lsb_lt(this.segment(), 0L, index0, value); return this; }

    /// {@return `used_by_curr_pic_lt_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short used_by_curr_pic_lt_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_lt_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_lt_flag`}
    public short used_by_curr_pic_lt_flag() { return used_by_curr_pic_lt_flag(this.segment(), 0L); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void used_by_curr_pic_lt_flag(MemorySegment segment, long index, short value) { VH_used_by_curr_pic_lt_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(short value) { used_by_curr_pic_lt_flag(this.segment(), 0L, value); return this; }

    /// {@return `delta_poc_msb_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_poc_msb_present_flag(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_poc_msb_present_flag, index), LAYOUT_delta_poc_msb_present_flag); }
    /// {@return `delta_poc_msb_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte delta_poc_msb_present_flag(MemorySegment segment, long index, long index0) { return (byte) VH_delta_poc_msb_present_flag.get(segment, 0L, index, index0); }
    /// {@return `delta_poc_msb_present_flag`}
    public MemorySegment delta_poc_msb_present_flag() { return delta_poc_msb_present_flag(this.segment(), 0L); }
    /// {@return `delta_poc_msb_present_flag`}
    /// @param index0 the Index 0 of the array
    public byte delta_poc_msb_present_flag(long index0) { return delta_poc_msb_present_flag(this.segment(), 0L, index0); }
    /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_poc_msb_present_flag(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_poc_msb_present_flag, index), LAYOUT_delta_poc_msb_present_flag.byteSize()); }
    /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_poc_msb_present_flag(MemorySegment segment, long index, long index0, byte value) { VH_delta_poc_msb_present_flag.set(segment, 0L, index, index0, value); }
    /// Sets `delta_poc_msb_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(MemorySegment value) { delta_poc_msb_present_flag(this.segment(), 0L, value); return this; }
    /// Sets `delta_poc_msb_present_flag` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(long index0, byte value) { delta_poc_msb_present_flag(this.segment(), 0L, index0, value); return this; }

    /// {@return `delta_poc_msb_cycle_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_poc_msb_cycle_lt(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_poc_msb_cycle_lt, index), LAYOUT_delta_poc_msb_cycle_lt); }
    /// {@return `delta_poc_msb_cycle_lt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte delta_poc_msb_cycle_lt(MemorySegment segment, long index, long index0) { return (byte) VH_delta_poc_msb_cycle_lt.get(segment, 0L, index, index0); }
    /// {@return `delta_poc_msb_cycle_lt`}
    public MemorySegment delta_poc_msb_cycle_lt() { return delta_poc_msb_cycle_lt(this.segment(), 0L); }
    /// {@return `delta_poc_msb_cycle_lt`}
    /// @param index0 the Index 0 of the array
    public byte delta_poc_msb_cycle_lt(long index0) { return delta_poc_msb_cycle_lt(this.segment(), 0L, index0); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_poc_msb_cycle_lt(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_poc_msb_cycle_lt, index), LAYOUT_delta_poc_msb_cycle_lt.byteSize()); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_poc_msb_cycle_lt(MemorySegment segment, long index, long index0, byte value) { VH_delta_poc_msb_cycle_lt.set(segment, 0L, index, index0, value); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(MemorySegment value) { delta_poc_msb_cycle_lt(this.segment(), 0L, value); return this; }
    /// Sets `delta_poc_msb_cycle_lt` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(long index0, byte value) { delta_poc_msb_cycle_lt(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoEncodeH265LongTermRefPics`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265LongTermRefPics`
    public StdVideoEncodeH265LongTermRefPics asSlice(long index) { return new StdVideoEncodeH265LongTermRefPics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265LongTermRefPics`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265LongTermRefPics`
    public StdVideoEncodeH265LongTermRefPics asSlice(long index, long count) { return new StdVideoEncodeH265LongTermRefPics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265LongTermRefPics` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics at(long index, Consumer<StdVideoEncodeH265LongTermRefPics> func) { func.accept(asSlice(index)); return this; }

    /// {@return `num_long_term_sps` at the given index}
    /// @param index the index of the struct buffer
    public byte num_long_term_spsAt(long index) { return num_long_term_sps(this.segment(), index); }
    /// Sets `num_long_term_sps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_spsAt(long index, byte value) { num_long_term_sps(this.segment(), index, value); return this; }

    /// {@return `num_long_term_pics` at the given index}
    /// @param index the index of the struct buffer
    public byte num_long_term_picsAt(long index) { return num_long_term_pics(this.segment(), index); }
    /// Sets `num_long_term_pics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics num_long_term_picsAt(long index, byte value) { num_long_term_pics(this.segment(), index, value); return this; }

    /// {@return `lt_idx_sps` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment lt_idx_spsAt(long index) { return lt_idx_sps(this.segment(), index); }
    /// {@return `lt_idx_sps` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte lt_idx_spsAt(long index, long index0) { return lt_idx_sps(this.segment(), index, index0); }
    /// Sets `lt_idx_sps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics lt_idx_spsAt(long index, MemorySegment value) { lt_idx_sps(this.segment(), index, value); return this; }
    /// Sets `lt_idx_sps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics lt_idx_spsAt(long index, long index0, byte value) { lt_idx_sps(this.segment(), index, index0, value); return this; }

    /// {@return `poc_lsb_lt` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment poc_lsb_ltAt(long index) { return poc_lsb_lt(this.segment(), index); }
    /// {@return `poc_lsb_lt` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte poc_lsb_ltAt(long index, long index0) { return poc_lsb_lt(this.segment(), index, index0); }
    /// Sets `poc_lsb_lt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics poc_lsb_ltAt(long index, MemorySegment value) { poc_lsb_lt(this.segment(), index, value); return this; }
    /// Sets `poc_lsb_lt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics poc_lsb_ltAt(long index, long index0, byte value) { poc_lsb_lt(this.segment(), index, index0, value); return this; }

    /// {@return `used_by_curr_pic_lt_flag` at the given index}
    /// @param index the index of the struct buffer
    public short used_by_curr_pic_lt_flagAt(long index) { return used_by_curr_pic_lt_flag(this.segment(), index); }
    /// Sets `used_by_curr_pic_lt_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flagAt(long index, short value) { used_by_curr_pic_lt_flag(this.segment(), index, value); return this; }

    /// {@return `delta_poc_msb_present_flag` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment delta_poc_msb_present_flagAt(long index) { return delta_poc_msb_present_flag(this.segment(), index); }
    /// {@return `delta_poc_msb_present_flag` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte delta_poc_msb_present_flagAt(long index, long index0) { return delta_poc_msb_present_flag(this.segment(), index, index0); }
    /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flagAt(long index, MemorySegment value) { delta_poc_msb_present_flag(this.segment(), index, value); return this; }
    /// Sets `delta_poc_msb_present_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flagAt(long index, long index0, byte value) { delta_poc_msb_present_flag(this.segment(), index, index0, value); return this; }

    /// {@return `delta_poc_msb_cycle_lt` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment delta_poc_msb_cycle_ltAt(long index) { return delta_poc_msb_cycle_lt(this.segment(), index); }
    /// {@return `delta_poc_msb_cycle_lt` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte delta_poc_msb_cycle_ltAt(long index, long index0) { return delta_poc_msb_cycle_lt(this.segment(), index, index0); }
    /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_ltAt(long index, MemorySegment value) { delta_poc_msb_cycle_lt(this.segment(), index, value); return this; }
    /// Sets `delta_poc_msb_cycle_lt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_ltAt(long index, long index0, byte value) { delta_poc_msb_cycle_lt(this.segment(), index, index0, value); return this; }

}
