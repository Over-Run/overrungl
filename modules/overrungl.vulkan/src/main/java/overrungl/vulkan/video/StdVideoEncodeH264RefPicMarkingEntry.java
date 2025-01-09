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
/// ### memory_management_control_operation
/// [VarHandle][#VH_memory_management_control_operation] - [Getter][#memory_management_control_operation()] - [Setter][#memory_management_control_operation(int)]
/// ### difference_of_pic_nums_minus1
/// [VarHandle][#VH_difference_of_pic_nums_minus1] - [Getter][#difference_of_pic_nums_minus1()] - [Setter][#difference_of_pic_nums_minus1(short)]
/// ### long_term_pic_num
/// [VarHandle][#VH_long_term_pic_num] - [Getter][#long_term_pic_num()] - [Setter][#long_term_pic_num(short)]
/// ### long_term_frame_idx
/// [VarHandle][#VH_long_term_frame_idx] - [Getter][#long_term_frame_idx()] - [Setter][#long_term_frame_idx(short)]
/// ### max_long_term_frame_idx_plus1
/// [VarHandle][#VH_max_long_term_frame_idx_plus1] - [Getter][#max_long_term_frame_idx_plus1()] - [Setter][#max_long_term_frame_idx_plus1(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264RefPicMarkingEntry {
///     StdVideoH264MemMgmtControlOp memory_management_control_operation;
///     uint16_t difference_of_pic_nums_minus1;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint16_t max_long_term_frame_idx_plus1;
/// } StdVideoEncodeH264RefPicMarkingEntry;
/// ```
public final class StdVideoEncodeH264RefPicMarkingEntry extends Struct {
    /// The struct layout of `StdVideoEncodeH264RefPicMarkingEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memory_management_control_operation"),
        ValueLayout.JAVA_SHORT.withName("difference_of_pic_nums_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_SHORT.withName("max_long_term_frame_idx_plus1")
    );
    /// The [VarHandle] of `memory_management_control_operation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memory_management_control_operation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory_management_control_operation"));
    /// The [VarHandle] of `difference_of_pic_nums_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_difference_of_pic_nums_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("difference_of_pic_nums_minus1"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));
    /// The [VarHandle] of `long_term_frame_idx` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_long_term_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_frame_idx"));
    /// The [VarHandle] of `max_long_term_frame_idx_plus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_max_long_term_frame_idx_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_long_term_frame_idx_plus1"));

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264RefPicMarkingEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefPicMarkingEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefPicMarkingEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefPicMarkingEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefPicMarkingEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264RefPicMarkingEntry(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeH264RefPicMarkingEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264RefPicMarkingEntry`
    public StdVideoEncodeH264RefPicMarkingEntry asSlice(long index) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeH264RefPicMarkingEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264RefPicMarkingEntry`
    public StdVideoEncodeH264RefPicMarkingEntry asSlice(long index, long count) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `memory_management_control_operation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264MemMgmtControlOp") int get_memory_management_control_operation(MemorySegment segment, long index) { return (int) VH_memory_management_control_operation.get(segment, 0L, index); }
    /// {@return `memory_management_control_operation`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264MemMgmtControlOp") int get_memory_management_control_operation(MemorySegment segment) { return StdVideoEncodeH264RefPicMarkingEntry.get_memory_management_control_operation(segment, 0L); }
    /// {@return `memory_management_control_operation` at the given index}
    /// @param index the index
    public @CType("StdVideoH264MemMgmtControlOp") int memory_management_control_operationAt(long index) { return StdVideoEncodeH264RefPicMarkingEntry.get_memory_management_control_operation(this.segment(), index); }
    /// {@return `memory_management_control_operation`}
    public @CType("StdVideoH264MemMgmtControlOp") int memory_management_control_operation() { return StdVideoEncodeH264RefPicMarkingEntry.get_memory_management_control_operation(this.segment()); }
    /// Sets `memory_management_control_operation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory_management_control_operation(MemorySegment segment, long index, @CType("StdVideoH264MemMgmtControlOp") int value) { VH_memory_management_control_operation.set(segment, 0L, index, value); }
    /// Sets `memory_management_control_operation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory_management_control_operation(MemorySegment segment, @CType("StdVideoH264MemMgmtControlOp") int value) { StdVideoEncodeH264RefPicMarkingEntry.set_memory_management_control_operation(segment, 0L, value); }
    /// Sets `memory_management_control_operation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operationAt(long index, @CType("StdVideoH264MemMgmtControlOp") int value) { StdVideoEncodeH264RefPicMarkingEntry.set_memory_management_control_operation(this.segment(), index, value); return this; }
    /// Sets `memory_management_control_operation` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(@CType("StdVideoH264MemMgmtControlOp") int value) { StdVideoEncodeH264RefPicMarkingEntry.set_memory_management_control_operation(this.segment(), value); return this; }

    /// {@return `difference_of_pic_nums_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_difference_of_pic_nums_minus1(MemorySegment segment, long index) { return (short) VH_difference_of_pic_nums_minus1.get(segment, 0L, index); }
    /// {@return `difference_of_pic_nums_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_difference_of_pic_nums_minus1(MemorySegment segment) { return StdVideoEncodeH264RefPicMarkingEntry.get_difference_of_pic_nums_minus1(segment, 0L); }
    /// {@return `difference_of_pic_nums_minus1` at the given index}
    /// @param index the index
    public @CType("uint16_t") short difference_of_pic_nums_minus1At(long index) { return StdVideoEncodeH264RefPicMarkingEntry.get_difference_of_pic_nums_minus1(this.segment(), index); }
    /// {@return `difference_of_pic_nums_minus1`}
    public @CType("uint16_t") short difference_of_pic_nums_minus1() { return StdVideoEncodeH264RefPicMarkingEntry.get_difference_of_pic_nums_minus1(this.segment()); }
    /// Sets `difference_of_pic_nums_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_difference_of_pic_nums_minus1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_difference_of_pic_nums_minus1.set(segment, 0L, index, value); }
    /// Sets `difference_of_pic_nums_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_difference_of_pic_nums_minus1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_difference_of_pic_nums_minus1(segment, 0L, value); }
    /// Sets `difference_of_pic_nums_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1At(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_difference_of_pic_nums_minus1(this.segment(), index, value); return this; }
    /// Sets `difference_of_pic_nums_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(@CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_difference_of_pic_nums_minus1(this.segment(), value); return this; }

    /// {@return `long_term_pic_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment, long index) { return (short) VH_long_term_pic_num.get(segment, 0L, index); }
    /// {@return `long_term_pic_num`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_long_term_pic_num(MemorySegment segment) { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_pic_num(segment, 0L); }
    /// {@return `long_term_pic_num` at the given index}
    /// @param index the index
    public @CType("uint16_t") short long_term_pic_numAt(long index) { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_pic_num(this.segment(), index); }
    /// {@return `long_term_pic_num`}
    public @CType("uint16_t") short long_term_pic_num() { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_pic_num(this.segment()); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_long_term_pic_num.set(segment, 0L, index, value); }
    /// Sets `long_term_pic_num` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_pic_num(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_pic_num(segment, 0L, value); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_numAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_pic_num(this.segment(), index, value); return this; }
    /// Sets `long_term_pic_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(@CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_pic_num(this.segment(), value); return this; }

    /// {@return `long_term_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_long_term_frame_idx(MemorySegment segment, long index) { return (short) VH_long_term_frame_idx.get(segment, 0L, index); }
    /// {@return `long_term_frame_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_long_term_frame_idx(MemorySegment segment) { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_frame_idx(segment, 0L); }
    /// {@return `long_term_frame_idx` at the given index}
    /// @param index the index
    public @CType("uint16_t") short long_term_frame_idxAt(long index) { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_frame_idx(this.segment(), index); }
    /// {@return `long_term_frame_idx`}
    public @CType("uint16_t") short long_term_frame_idx() { return StdVideoEncodeH264RefPicMarkingEntry.get_long_term_frame_idx(this.segment()); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_frame_idx(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_long_term_frame_idx.set(segment, 0L, index, value); }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_frame_idx(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_frame_idx(segment, 0L, value); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idxAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_frame_idx(this.segment(), index, value); return this; }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(@CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_long_term_frame_idx(this.segment(), value); return this; }

    /// {@return `max_long_term_frame_idx_plus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_max_long_term_frame_idx_plus1(MemorySegment segment, long index) { return (short) VH_max_long_term_frame_idx_plus1.get(segment, 0L, index); }
    /// {@return `max_long_term_frame_idx_plus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_max_long_term_frame_idx_plus1(MemorySegment segment) { return StdVideoEncodeH264RefPicMarkingEntry.get_max_long_term_frame_idx_plus1(segment, 0L); }
    /// {@return `max_long_term_frame_idx_plus1` at the given index}
    /// @param index the index
    public @CType("uint16_t") short max_long_term_frame_idx_plus1At(long index) { return StdVideoEncodeH264RefPicMarkingEntry.get_max_long_term_frame_idx_plus1(this.segment(), index); }
    /// {@return `max_long_term_frame_idx_plus1`}
    public @CType("uint16_t") short max_long_term_frame_idx_plus1() { return StdVideoEncodeH264RefPicMarkingEntry.get_max_long_term_frame_idx_plus1(this.segment()); }
    /// Sets `max_long_term_frame_idx_plus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_long_term_frame_idx_plus1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_max_long_term_frame_idx_plus1.set(segment, 0L, index, value); }
    /// Sets `max_long_term_frame_idx_plus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_long_term_frame_idx_plus1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_max_long_term_frame_idx_plus1(segment, 0L, value); }
    /// Sets `max_long_term_frame_idx_plus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1At(long index, @CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_max_long_term_frame_idx_plus1(this.segment(), index, value); return this; }
    /// Sets `max_long_term_frame_idx_plus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(@CType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.set_max_long_term_frame_idx_plus1(this.segment(), value); return this; }

}
