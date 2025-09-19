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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265ShortTermRefPicSet`.
/// ## Layout
/// ```
/// struct StdVideoH265ShortTermRefPicSet {
///     (struct StdVideoH265ShortTermRefPicSetFlags) StdVideoH265ShortTermRefPicSetFlags flags;
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
///     uint16_t delta_poc_s0_minus1[16];
///     uint16_t delta_poc_s1_minus1[16];
/// };
/// ```
public final class StdVideoH265ShortTermRefPicSet extends GroupType {
    /// The struct layout of `StdVideoH265ShortTermRefPicSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.LAYOUT.withName("flags"),
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
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_SHORT).withName("delta_poc_s0_minus1"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_SHORT).withName("delta_poc_s1_minus1")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `delta_idx_minus1`.
    public static final long OFFSET_delta_idx_minus1 = LAYOUT.byteOffset(PathElement.groupElement("delta_idx_minus1"));
    /// The memory layout of `delta_idx_minus1`.
    public static final MemoryLayout LAYOUT_delta_idx_minus1 = LAYOUT.select(PathElement.groupElement("delta_idx_minus1"));
    /// The [VarHandle] of `delta_idx_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_idx_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_idx_minus1"));
    /// The byte offset of `use_delta_flag`.
    public static final long OFFSET_use_delta_flag = LAYOUT.byteOffset(PathElement.groupElement("use_delta_flag"));
    /// The memory layout of `use_delta_flag`.
    public static final MemoryLayout LAYOUT_use_delta_flag = LAYOUT.select(PathElement.groupElement("use_delta_flag"));
    /// The [VarHandle] of `use_delta_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_use_delta_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_delta_flag"));
    /// The byte offset of `abs_delta_rps_minus1`.
    public static final long OFFSET_abs_delta_rps_minus1 = LAYOUT.byteOffset(PathElement.groupElement("abs_delta_rps_minus1"));
    /// The memory layout of `abs_delta_rps_minus1`.
    public static final MemoryLayout LAYOUT_abs_delta_rps_minus1 = LAYOUT.select(PathElement.groupElement("abs_delta_rps_minus1"));
    /// The [VarHandle] of `abs_delta_rps_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_abs_delta_rps_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("abs_delta_rps_minus1"));
    /// The byte offset of `used_by_curr_pic_flag`.
    public static final long OFFSET_used_by_curr_pic_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_flag"));
    /// The memory layout of `used_by_curr_pic_flag`.
    public static final MemoryLayout LAYOUT_used_by_curr_pic_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_flag"));
    /// The [VarHandle] of `used_by_curr_pic_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_used_by_curr_pic_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_flag"));
    /// The byte offset of `used_by_curr_pic_s0_flag`.
    public static final long OFFSET_used_by_curr_pic_s0_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_s0_flag"));
    /// The memory layout of `used_by_curr_pic_s0_flag`.
    public static final MemoryLayout LAYOUT_used_by_curr_pic_s0_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_s0_flag"));
    /// The [VarHandle] of `used_by_curr_pic_s0_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_used_by_curr_pic_s0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_s0_flag"));
    /// The byte offset of `used_by_curr_pic_s1_flag`.
    public static final long OFFSET_used_by_curr_pic_s1_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_s1_flag"));
    /// The memory layout of `used_by_curr_pic_s1_flag`.
    public static final MemoryLayout LAYOUT_used_by_curr_pic_s1_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_s1_flag"));
    /// The [VarHandle] of `used_by_curr_pic_s1_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_used_by_curr_pic_s1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_s1_flag"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `reserved3`.
    public static final long OFFSET_reserved3 = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
    /// The memory layout of `reserved3`.
    public static final MemoryLayout LAYOUT_reserved3 = LAYOUT.select(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The byte offset of `num_negative_pics`.
    public static final long OFFSET_num_negative_pics = LAYOUT.byteOffset(PathElement.groupElement("num_negative_pics"));
    /// The memory layout of `num_negative_pics`.
    public static final MemoryLayout LAYOUT_num_negative_pics = LAYOUT.select(PathElement.groupElement("num_negative_pics"));
    /// The [VarHandle] of `num_negative_pics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_negative_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_negative_pics"));
    /// The byte offset of `num_positive_pics`.
    public static final long OFFSET_num_positive_pics = LAYOUT.byteOffset(PathElement.groupElement("num_positive_pics"));
    /// The memory layout of `num_positive_pics`.
    public static final MemoryLayout LAYOUT_num_positive_pics = LAYOUT.select(PathElement.groupElement("num_positive_pics"));
    /// The [VarHandle] of `num_positive_pics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_positive_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_positive_pics"));
    /// The byte offset of `delta_poc_s0_minus1`.
    public static final long OFFSET_delta_poc_s0_minus1 = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_s0_minus1"));
    /// The memory layout of `delta_poc_s0_minus1`.
    public static final MemoryLayout LAYOUT_delta_poc_s0_minus1 = LAYOUT.select(PathElement.groupElement("delta_poc_s0_minus1"));
    /// The [VarHandle] of `delta_poc_s0_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_poc_s0_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_s0_minus1"), PathElement.sequenceElement());
    /// The byte offset of `delta_poc_s1_minus1`.
    public static final long OFFSET_delta_poc_s1_minus1 = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_s1_minus1"));
    /// The memory layout of `delta_poc_s1_minus1`.
    public static final MemoryLayout LAYOUT_delta_poc_s1_minus1 = LAYOUT.select(PathElement.groupElement("delta_poc_s1_minus1"));
    /// The [VarHandle] of `delta_poc_s1_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_poc_s1_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_s1_minus1"), PathElement.sequenceElement());

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265ShortTermRefPicSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265ShortTermRefPicSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSet`
    public static StdVideoH265ShortTermRefPicSet alloc(SegmentAllocator allocator) { return new StdVideoH265ShortTermRefPicSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265ShortTermRefPicSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ShortTermRefPicSet`
    public static StdVideoH265ShortTermRefPicSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ShortTermRefPicSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet copyFrom(StdVideoH265ShortTermRefPicSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265ShortTermRefPicSet reinterpret(long count) { return new StdVideoH265ShortTermRefPicSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet flags(Consumer<overrungl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.of(flags())); return this; }

    /// {@return `delta_idx_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int delta_idx_minus1(MemorySegment segment, long index) { return (int) VH_delta_idx_minus1.get(segment, 0L, index); }
    /// {@return `delta_idx_minus1`}
    public int delta_idx_minus1() { return delta_idx_minus1(this.segment(), 0L); }
    /// Sets `delta_idx_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_idx_minus1(MemorySegment segment, long index, int value) { VH_delta_idx_minus1.set(segment, 0L, index, value); }
    /// Sets `delta_idx_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_idx_minus1(int value) { delta_idx_minus1(this.segment(), 0L, value); return this; }

    /// {@return `use_delta_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short use_delta_flag(MemorySegment segment, long index) { return (short) VH_use_delta_flag.get(segment, 0L, index); }
    /// {@return `use_delta_flag`}
    public short use_delta_flag() { return use_delta_flag(this.segment(), 0L); }
    /// Sets `use_delta_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void use_delta_flag(MemorySegment segment, long index, short value) { VH_use_delta_flag.set(segment, 0L, index, value); }
    /// Sets `use_delta_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet use_delta_flag(short value) { use_delta_flag(this.segment(), 0L, value); return this; }

    /// {@return `abs_delta_rps_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short abs_delta_rps_minus1(MemorySegment segment, long index) { return (short) VH_abs_delta_rps_minus1.get(segment, 0L, index); }
    /// {@return `abs_delta_rps_minus1`}
    public short abs_delta_rps_minus1() { return abs_delta_rps_minus1(this.segment(), 0L); }
    /// Sets `abs_delta_rps_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void abs_delta_rps_minus1(MemorySegment segment, long index, short value) { VH_abs_delta_rps_minus1.set(segment, 0L, index, value); }
    /// Sets `abs_delta_rps_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(short value) { abs_delta_rps_minus1(this.segment(), 0L, value); return this; }

    /// {@return `used_by_curr_pic_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short used_by_curr_pic_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_flag`}
    public short used_by_curr_pic_flag() { return used_by_curr_pic_flag(this.segment(), 0L); }
    /// Sets `used_by_curr_pic_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void used_by_curr_pic_flag(MemorySegment segment, long index, short value) { VH_used_by_curr_pic_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(short value) { used_by_curr_pic_flag(this.segment(), 0L, value); return this; }

    /// {@return `used_by_curr_pic_s0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short used_by_curr_pic_s0_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_s0_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_s0_flag`}
    public short used_by_curr_pic_s0_flag() { return used_by_curr_pic_s0_flag(this.segment(), 0L); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void used_by_curr_pic_s0_flag(MemorySegment segment, long index, short value) { VH_used_by_curr_pic_s0_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(short value) { used_by_curr_pic_s0_flag(this.segment(), 0L, value); return this; }

    /// {@return `used_by_curr_pic_s1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short used_by_curr_pic_s1_flag(MemorySegment segment, long index) { return (short) VH_used_by_curr_pic_s1_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_s1_flag`}
    public short used_by_curr_pic_s1_flag() { return used_by_curr_pic_s1_flag(this.segment(), 0L); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void used_by_curr_pic_s1_flag(MemorySegment segment, long index, short value) { VH_used_by_curr_pic_s1_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(short value) { used_by_curr_pic_s1_flag(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short reserved1(MemorySegment segment, long index) { return (short) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public short reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, short value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved1(short value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public byte reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved3(MemorySegment segment, long index) { return (byte) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    public byte reserved3() { return reserved3(this.segment(), 0L); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved3(MemorySegment segment, long index, byte value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved3(byte value) { reserved3(this.segment(), 0L, value); return this; }

    /// {@return `num_negative_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_negative_pics(MemorySegment segment, long index) { return (byte) VH_num_negative_pics.get(segment, 0L, index); }
    /// {@return `num_negative_pics`}
    public byte num_negative_pics() { return num_negative_pics(this.segment(), 0L); }
    /// Sets `num_negative_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_negative_pics(MemorySegment segment, long index, byte value) { VH_num_negative_pics.set(segment, 0L, index, value); }
    /// Sets `num_negative_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_negative_pics(byte value) { num_negative_pics(this.segment(), 0L, value); return this; }

    /// {@return `num_positive_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_positive_pics(MemorySegment segment, long index) { return (byte) VH_num_positive_pics.get(segment, 0L, index); }
    /// {@return `num_positive_pics`}
    public byte num_positive_pics() { return num_positive_pics(this.segment(), 0L); }
    /// Sets `num_positive_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_positive_pics(MemorySegment segment, long index, byte value) { VH_num_positive_pics.set(segment, 0L, index, value); }
    /// Sets `num_positive_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_positive_pics(byte value) { num_positive_pics(this.segment(), 0L, value); return this; }

    /// {@return `delta_poc_s0_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_poc_s0_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_poc_s0_minus1, index), LAYOUT_delta_poc_s0_minus1); }
    /// {@return `delta_poc_s0_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short delta_poc_s0_minus1(MemorySegment segment, long index, long index0) { return (short) VH_delta_poc_s0_minus1.get(segment, 0L, index, index0); }
    /// {@return `delta_poc_s0_minus1`}
    public MemorySegment delta_poc_s0_minus1() { return delta_poc_s0_minus1(this.segment(), 0L); }
    /// {@return `delta_poc_s0_minus1`}
    /// @param index0 the Index 0 of the array
    public short delta_poc_s0_minus1(long index0) { return delta_poc_s0_minus1(this.segment(), 0L, index0); }
    /// Sets `delta_poc_s0_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_poc_s0_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_poc_s0_minus1, index), LAYOUT_delta_poc_s0_minus1.byteSize()); }
    /// Sets `delta_poc_s0_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_poc_s0_minus1(MemorySegment segment, long index, long index0, short value) { VH_delta_poc_s0_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `delta_poc_s0_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(MemorySegment value) { delta_poc_s0_minus1(this.segment(), 0L, value); return this; }
    /// Sets `delta_poc_s0_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(long index0, short value) { delta_poc_s0_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `delta_poc_s1_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_poc_s1_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_poc_s1_minus1, index), LAYOUT_delta_poc_s1_minus1); }
    /// {@return `delta_poc_s1_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short delta_poc_s1_minus1(MemorySegment segment, long index, long index0) { return (short) VH_delta_poc_s1_minus1.get(segment, 0L, index, index0); }
    /// {@return `delta_poc_s1_minus1`}
    public MemorySegment delta_poc_s1_minus1() { return delta_poc_s1_minus1(this.segment(), 0L); }
    /// {@return `delta_poc_s1_minus1`}
    /// @param index0 the Index 0 of the array
    public short delta_poc_s1_minus1(long index0) { return delta_poc_s1_minus1(this.segment(), 0L, index0); }
    /// Sets `delta_poc_s1_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_poc_s1_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_poc_s1_minus1, index), LAYOUT_delta_poc_s1_minus1.byteSize()); }
    /// Sets `delta_poc_s1_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_poc_s1_minus1(MemorySegment segment, long index, long index0, short value) { VH_delta_poc_s1_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `delta_poc_s1_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(MemorySegment value) { delta_poc_s1_minus1(this.segment(), 0L, value); return this; }
    /// Sets `delta_poc_s1_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(long index0, short value) { delta_poc_s1_minus1(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoH265ShortTermRefPicSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ShortTermRefPicSet`
    public StdVideoH265ShortTermRefPicSet asSlice(long index) { return new StdVideoH265ShortTermRefPicSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265ShortTermRefPicSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ShortTermRefPicSet`
    public StdVideoH265ShortTermRefPicSet asSlice(long index, long count) { return new StdVideoH265ShortTermRefPicSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265ShortTermRefPicSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet at(long index, Consumer<StdVideoH265ShortTermRefPicSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.of(flagsAt(index))); return this; }

    /// {@return `delta_idx_minus1` at the given index}
    /// @param index the index of the struct buffer
    public int delta_idx_minus1At(long index) { return delta_idx_minus1(this.segment(), index); }
    /// Sets `delta_idx_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_idx_minus1At(long index, int value) { delta_idx_minus1(this.segment(), index, value); return this; }

    /// {@return `use_delta_flag` at the given index}
    /// @param index the index of the struct buffer
    public short use_delta_flagAt(long index) { return use_delta_flag(this.segment(), index); }
    /// Sets `use_delta_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet use_delta_flagAt(long index, short value) { use_delta_flag(this.segment(), index, value); return this; }

    /// {@return `abs_delta_rps_minus1` at the given index}
    /// @param index the index of the struct buffer
    public short abs_delta_rps_minus1At(long index) { return abs_delta_rps_minus1(this.segment(), index); }
    /// Sets `abs_delta_rps_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1At(long index, short value) { abs_delta_rps_minus1(this.segment(), index, value); return this; }

    /// {@return `used_by_curr_pic_flag` at the given index}
    /// @param index the index of the struct buffer
    public short used_by_curr_pic_flagAt(long index) { return used_by_curr_pic_flag(this.segment(), index); }
    /// Sets `used_by_curr_pic_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flagAt(long index, short value) { used_by_curr_pic_flag(this.segment(), index, value); return this; }

    /// {@return `used_by_curr_pic_s0_flag` at the given index}
    /// @param index the index of the struct buffer
    public short used_by_curr_pic_s0_flagAt(long index) { return used_by_curr_pic_s0_flag(this.segment(), index); }
    /// Sets `used_by_curr_pic_s0_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flagAt(long index, short value) { used_by_curr_pic_s0_flag(this.segment(), index, value); return this; }

    /// {@return `used_by_curr_pic_s1_flag` at the given index}
    /// @param index the index of the struct buffer
    public short used_by_curr_pic_s1_flagAt(long index) { return used_by_curr_pic_s1_flag(this.segment(), index); }
    /// Sets `used_by_curr_pic_s1_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flagAt(long index, short value) { used_by_curr_pic_s1_flag(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public short reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved1At(long index, short value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved2At(long index) { return reserved2(this.segment(), index); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved3At(long index) { return reserved3(this.segment(), index); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet reserved3At(long index, byte value) { reserved3(this.segment(), index, value); return this; }

    /// {@return `num_negative_pics` at the given index}
    /// @param index the index of the struct buffer
    public byte num_negative_picsAt(long index) { return num_negative_pics(this.segment(), index); }
    /// Sets `num_negative_pics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_negative_picsAt(long index, byte value) { num_negative_pics(this.segment(), index, value); return this; }

    /// {@return `num_positive_pics` at the given index}
    /// @param index the index of the struct buffer
    public byte num_positive_picsAt(long index) { return num_positive_pics(this.segment(), index); }
    /// Sets `num_positive_pics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet num_positive_picsAt(long index, byte value) { num_positive_pics(this.segment(), index, value); return this; }

    /// {@return `delta_poc_s0_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment delta_poc_s0_minus1At(long index) { return delta_poc_s0_minus1(this.segment(), index); }
    /// {@return `delta_poc_s0_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public short delta_poc_s0_minus1At(long index, long index0) { return delta_poc_s0_minus1(this.segment(), index, index0); }
    /// Sets `delta_poc_s0_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1At(long index, MemorySegment value) { delta_poc_s0_minus1(this.segment(), index, value); return this; }
    /// Sets `delta_poc_s0_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1At(long index, long index0, short value) { delta_poc_s0_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `delta_poc_s1_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment delta_poc_s1_minus1At(long index) { return delta_poc_s1_minus1(this.segment(), index); }
    /// {@return `delta_poc_s1_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public short delta_poc_s1_minus1At(long index, long index0) { return delta_poc_s1_minus1(this.segment(), index, index0); }
    /// Sets `delta_poc_s1_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1At(long index, MemorySegment value) { delta_poc_s1_minus1(this.segment(), index, value); return this; }
    /// Sets `delta_poc_s1_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1At(long index, long index0, short value) { delta_poc_s1_minus1(this.segment(), index, index0, value); return this; }

}
