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
/// ### modification_of_pic_nums_idc
/// [VarHandle][#VH_modification_of_pic_nums_idc] - [Getter][#modification_of_pic_nums_idc()] - [Setter][#modification_of_pic_nums_idc(int)]
/// ### abs_diff_pic_num_minus1
/// [VarHandle][#VH_abs_diff_pic_num_minus1] - [Getter][#abs_diff_pic_num_minus1()] - [Setter][#abs_diff_pic_num_minus1(short)]
/// ### long_term_pic_num
/// [VarHandle][#VH_long_term_pic_num] - [Getter][#long_term_pic_num()] - [Setter][#long_term_pic_num(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264RefListModEntry {
///     StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc;
///     uint16_t abs_diff_pic_num_minus1;
///     uint16_t long_term_pic_num;
/// } StdVideoEncodeH264RefListModEntry;
/// ```
public final class StdVideoEncodeH264RefListModEntry extends Struct {
    /// The struct layout of `StdVideoEncodeH264RefListModEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("modification_of_pic_nums_idc"),
        ValueLayout.JAVA_SHORT.withName("abs_diff_pic_num_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num")
    );
    /// The [VarHandle] of `modification_of_pic_nums_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_modification_of_pic_nums_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modification_of_pic_nums_idc"));
    /// The [VarHandle] of `abs_diff_pic_num_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_abs_diff_pic_num_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("abs_diff_pic_num_minus1"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264RefListModEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefListModEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefListModEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefListModEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264RefListModEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264RefListModEntry`
    public static StdVideoEncodeH264RefListModEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefListModEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264RefListModEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264RefListModEntry`
    public static StdVideoEncodeH264RefListModEntry alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264RefListModEntry(allocator.allocate(LAYOUT, count)); }

    /// {@return `modification_of_pic_nums_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264ModificationOfPicNumsIdc") int get_modification_of_pic_nums_idc(MemorySegment segment, long index) { return (int) VH_modification_of_pic_nums_idc.get(segment, 0L, index); }
    /// {@return `modification_of_pic_nums_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264ModificationOfPicNumsIdc") int get_modification_of_pic_nums_idc(MemorySegment segment) { return StdVideoEncodeH264RefListModEntry.get_modification_of_pic_nums_idc(segment, 0L); }
    /// {@return `modification_of_pic_nums_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264ModificationOfPicNumsIdc") int modification_of_pic_nums_idcAt(long index) { return StdVideoEncodeH264RefListModEntry.get_modification_of_pic_nums_idc(this.segment(), index); }
    /// {@return `modification_of_pic_nums_idc`}
    public @CType("StdVideoH264ModificationOfPicNumsIdc") int modification_of_pic_nums_idc() { return StdVideoEncodeH264RefListModEntry.get_modification_of_pic_nums_idc(this.segment()); }
    /// Sets `modification_of_pic_nums_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_modification_of_pic_nums_idc(MemorySegment segment, long index, @CType("StdVideoH264ModificationOfPicNumsIdc") int value) { VH_modification_of_pic_nums_idc.set(segment, 0L, index, value); }
    /// Sets `modification_of_pic_nums_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_modification_of_pic_nums_idc(MemorySegment segment, @CType("StdVideoH264ModificationOfPicNumsIdc") int value) { StdVideoEncodeH264RefListModEntry.set_modification_of_pic_nums_idc(segment, 0L, value); }
    /// Sets `modification_of_pic_nums_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idcAt(long index, @CType("StdVideoH264ModificationOfPicNumsIdc") int value) { StdVideoEncodeH264RefListModEntry.set_modification_of_pic_nums_idc(this.segment(), index, value); return this; }
    /// Sets `modification_of_pic_nums_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(@CType("StdVideoH264ModificationOfPicNumsIdc") int value) { StdVideoEncodeH264RefListModEntry.set_modification_of_pic_nums_idc(this.segment(), value); return this; }

    /// {@return `abs_diff_pic_num_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_abs_diff_pic_num_minus1(MemorySegment segment, long index) { return (short) VH_abs_diff_pic_num_minus1.get(segment, 0L, index); }
    /// {@return `abs_diff_pic_num_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_abs_diff_pic_num_minus1(MemorySegment segment) { return StdVideoEncodeH264RefListModEntry.get_abs_diff_pic_num_minus1(segment, 0L); }
    /// {@return `abs_diff_pic_num_minus1` at the given index}
    /// @param index the index
    public @CType("uint16_t") short abs_diff_pic_num_minus1At(long index) { return StdVideoEncodeH264RefListModEntry.get_abs_diff_pic_num_minus1(this.segment(), index); }
    /// {@return `abs_diff_pic_num_minus1`}
    public @CType("uint16_t") short abs_diff_pic_num_minus1() { return StdVideoEncodeH264RefListModEntry.get_abs_diff_pic_num_minus1(this.segment()); }
    /// Sets `abs_diff_pic_num_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_abs_diff_pic_num_minus1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_abs_diff_pic_num_minus1.set(segment, 0L, index, value); }
    /// Sets `abs_diff_pic_num_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_abs_diff_pic_num_minus1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_abs_diff_pic_num_minus1(segment, 0L, value); }
    /// Sets `abs_diff_pic_num_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1At(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_abs_diff_pic_num_minus1(this.segment(), index, value); return this; }
    /// Sets `abs_diff_pic_num_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(@CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_abs_diff_pic_num_minus1(this.segment(), value); return this; }

    /// {@return `long_term_pic_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment, long index) { return (short) VH_long_term_pic_num.get(segment, 0L, index); }
    /// {@return `long_term_pic_num`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment) { return StdVideoEncodeH264RefListModEntry.get_long_term_pic_num(segment, 0L); }
    /// {@return `long_term_pic_num` at the given index}
    /// @param index the index
    public @CType("uint16_t") short long_term_pic_numAt(long index) { return StdVideoEncodeH264RefListModEntry.get_long_term_pic_num(this.segment(), index); }
    /// {@return `long_term_pic_num`}
    public @CType("uint16_t") short long_term_pic_num() { return StdVideoEncodeH264RefListModEntry.get_long_term_pic_num(this.segment()); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_long_term_pic_num.set(segment, 0L, index, value); }
    /// Sets `long_term_pic_num` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_long_term_pic_num(segment, 0L, value); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry long_term_pic_numAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_long_term_pic_num(this.segment(), index, value); return this; }
    /// Sets `long_term_pic_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry long_term_pic_num(@CType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.set_long_term_pic_num(this.segment(), value); return this; }

}
