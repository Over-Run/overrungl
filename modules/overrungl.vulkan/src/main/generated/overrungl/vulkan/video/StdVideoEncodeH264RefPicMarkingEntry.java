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
/// struct StdVideoEncodeH264RefPicMarkingEntry {
///     (int) StdVideoH264MemMgmtControlOp memory_management_control_operation;
///     uint16_t difference_of_pic_nums_minus1;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint16_t max_long_term_frame_idx_plus1;
/// };
/// ```
public sealed class StdVideoEncodeH264RefPicMarkingEntry extends GroupType {
    /// The struct layout of `StdVideoEncodeH264RefPicMarkingEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memory_management_control_operation"),
        ValueLayout.JAVA_SHORT.withName("difference_of_pic_nums_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_SHORT.withName("max_long_term_frame_idx_plus1")
    );
    /// The byte offset of `memory_management_control_operation`.
    public static final long OFFSET_memory_management_control_operation = LAYOUT.byteOffset(PathElement.groupElement("memory_management_control_operation"));
    /// The memory layout of `memory_management_control_operation`.
    public static final MemoryLayout LAYOUT_memory_management_control_operation = LAYOUT.select(PathElement.groupElement("memory_management_control_operation"));
    /// The [VarHandle] of `memory_management_control_operation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory_management_control_operation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory_management_control_operation"));
    /// The byte offset of `difference_of_pic_nums_minus1`.
    public static final long OFFSET_difference_of_pic_nums_minus1 = LAYOUT.byteOffset(PathElement.groupElement("difference_of_pic_nums_minus1"));
    /// The memory layout of `difference_of_pic_nums_minus1`.
    public static final MemoryLayout LAYOUT_difference_of_pic_nums_minus1 = LAYOUT.select(PathElement.groupElement("difference_of_pic_nums_minus1"));
    /// The [VarHandle] of `difference_of_pic_nums_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_difference_of_pic_nums_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("difference_of_pic_nums_minus1"));
    /// The byte offset of `long_term_pic_num`.
    public static final long OFFSET_long_term_pic_num = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
    /// The memory layout of `long_term_pic_num`.
    public static final MemoryLayout LAYOUT_long_term_pic_num = LAYOUT.select(PathElement.groupElement("long_term_pic_num"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));
    /// The byte offset of `long_term_frame_idx`.
    public static final long OFFSET_long_term_frame_idx = LAYOUT.byteOffset(PathElement.groupElement("long_term_frame_idx"));
    /// The memory layout of `long_term_frame_idx`.
    public static final MemoryLayout LAYOUT_long_term_frame_idx = LAYOUT.select(PathElement.groupElement("long_term_frame_idx"));
    /// The [VarHandle] of `long_term_frame_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_long_term_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_frame_idx"));
    /// The byte offset of `max_long_term_frame_idx_plus1`.
    public static final long OFFSET_max_long_term_frame_idx_plus1 = LAYOUT.byteOffset(PathElement.groupElement("max_long_term_frame_idx_plus1"));
    /// The memory layout of `max_long_term_frame_idx_plus1`.
    public static final MemoryLayout LAYOUT_max_long_term_frame_idx_plus1 = LAYOUT.select(PathElement.groupElement("max_long_term_frame_idx_plus1"));
    /// The [VarHandle] of `max_long_term_frame_idx_plus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_long_term_frame_idx_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_long_term_frame_idx_plus1"));

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264RefPicMarkingEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefPicMarkingEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264RefPicMarkingEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefPicMarkingEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memory_management_control_operation `memory_management_control_operation`
    /// @param difference_of_pic_nums_minus1 `difference_of_pic_nums_minus1`
    /// @param long_term_pic_num `long_term_pic_num`
    /// @param long_term_frame_idx `long_term_frame_idx`
    /// @param max_long_term_frame_idx_plus1 `max_long_term_frame_idx_plus1`
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry allocInit(SegmentAllocator allocator, int memory_management_control_operation, short difference_of_pic_nums_minus1, short long_term_pic_num, short long_term_frame_idx, short max_long_term_frame_idx_plus1) {
        return alloc(allocator).memory_management_control_operation(memory_management_control_operation).difference_of_pic_nums_minus1(difference_of_pic_nums_minus1).long_term_pic_num(long_term_pic_num).long_term_frame_idx(long_term_frame_idx).max_long_term_frame_idx_plus1(max_long_term_frame_idx_plus1);
    }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memory_management_control_operation `memory_management_control_operation`
    /// @param difference_of_pic_nums_minus1 `difference_of_pic_nums_minus1`
    /// @param long_term_pic_num `long_term_pic_num`
    /// @param long_term_frame_idx `long_term_frame_idx`
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry allocInit(SegmentAllocator allocator, int memory_management_control_operation, short difference_of_pic_nums_minus1, short long_term_pic_num, short long_term_frame_idx) {
        return alloc(allocator).memory_management_control_operation(memory_management_control_operation).difference_of_pic_nums_minus1(difference_of_pic_nums_minus1).long_term_pic_num(long_term_pic_num).long_term_frame_idx(long_term_frame_idx);
    }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memory_management_control_operation `memory_management_control_operation`
    /// @param difference_of_pic_nums_minus1 `difference_of_pic_nums_minus1`
    /// @param long_term_pic_num `long_term_pic_num`
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry allocInit(SegmentAllocator allocator, int memory_management_control_operation, short difference_of_pic_nums_minus1, short long_term_pic_num) {
        return alloc(allocator).memory_management_control_operation(memory_management_control_operation).difference_of_pic_nums_minus1(difference_of_pic_nums_minus1).long_term_pic_num(long_term_pic_num);
    }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memory_management_control_operation `memory_management_control_operation`
    /// @param difference_of_pic_nums_minus1 `difference_of_pic_nums_minus1`
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry allocInit(SegmentAllocator allocator, int memory_management_control_operation, short difference_of_pic_nums_minus1) {
        return alloc(allocator).memory_management_control_operation(memory_management_control_operation).difference_of_pic_nums_minus1(difference_of_pic_nums_minus1);
    }

    /// Allocates a `StdVideoEncodeH264RefPicMarkingEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memory_management_control_operation `memory_management_control_operation`
    /// @return the allocated `StdVideoEncodeH264RefPicMarkingEntry`
    public static StdVideoEncodeH264RefPicMarkingEntry allocInit(SegmentAllocator allocator, int memory_management_control_operation) {
        return alloc(allocator).memory_management_control_operation(memory_management_control_operation);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry copyFrom(StdVideoEncodeH264RefPicMarkingEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `memory_management_control_operation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memory_management_control_operation(MemorySegment segment, long index) { return (int) VH_memory_management_control_operation.get(segment, 0L, index); }
    /// {@return `memory_management_control_operation`}
    public int memory_management_control_operation() { return memory_management_control_operation(this.segment(), 0L); }
    /// Sets `memory_management_control_operation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory_management_control_operation(MemorySegment segment, long index, int value) { VH_memory_management_control_operation.set(segment, 0L, index, value); }
    /// Sets `memory_management_control_operation` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(int value) { memory_management_control_operation(this.segment(), 0L, value); return this; }

    /// {@return `difference_of_pic_nums_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short difference_of_pic_nums_minus1(MemorySegment segment, long index) { return (short) VH_difference_of_pic_nums_minus1.get(segment, 0L, index); }
    /// {@return `difference_of_pic_nums_minus1`}
    public short difference_of_pic_nums_minus1() { return difference_of_pic_nums_minus1(this.segment(), 0L); }
    /// Sets `difference_of_pic_nums_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void difference_of_pic_nums_minus1(MemorySegment segment, long index, short value) { VH_difference_of_pic_nums_minus1.set(segment, 0L, index, value); }
    /// Sets `difference_of_pic_nums_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(short value) { difference_of_pic_nums_minus1(this.segment(), 0L, value); return this; }

    /// {@return `long_term_pic_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short long_term_pic_num(MemorySegment segment, long index) { return (short) VH_long_term_pic_num.get(segment, 0L, index); }
    /// {@return `long_term_pic_num`}
    public short long_term_pic_num() { return long_term_pic_num(this.segment(), 0L); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void long_term_pic_num(MemorySegment segment, long index, short value) { VH_long_term_pic_num.set(segment, 0L, index, value); }
    /// Sets `long_term_pic_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(short value) { long_term_pic_num(this.segment(), 0L, value); return this; }

    /// {@return `long_term_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short long_term_frame_idx(MemorySegment segment, long index) { return (short) VH_long_term_frame_idx.get(segment, 0L, index); }
    /// {@return `long_term_frame_idx`}
    public short long_term_frame_idx() { return long_term_frame_idx(this.segment(), 0L); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void long_term_frame_idx(MemorySegment segment, long index, short value) { VH_long_term_frame_idx.set(segment, 0L, index, value); }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(short value) { long_term_frame_idx(this.segment(), 0L, value); return this; }

    /// {@return `max_long_term_frame_idx_plus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short max_long_term_frame_idx_plus1(MemorySegment segment, long index) { return (short) VH_max_long_term_frame_idx_plus1.get(segment, 0L, index); }
    /// {@return `max_long_term_frame_idx_plus1`}
    public short max_long_term_frame_idx_plus1() { return max_long_term_frame_idx_plus1(this.segment(), 0L); }
    /// Sets `max_long_term_frame_idx_plus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_long_term_frame_idx_plus1(MemorySegment segment, long index, short value) { VH_max_long_term_frame_idx_plus1.set(segment, 0L, index, value); }
    /// Sets `max_long_term_frame_idx_plus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(short value) { max_long_term_frame_idx_plus1(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH264RefPicMarkingEntry].
    public static final class Buffer extends StdVideoEncodeH264RefPicMarkingEntry {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264RefPicMarkingEntry.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264RefPicMarkingEntry`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264RefPicMarkingEntry`
        public StdVideoEncodeH264RefPicMarkingEntry asSlice(long index) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264RefPicMarkingEntry`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264RefPicMarkingEntry`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `memory_management_control_operation` at the given index}
        /// @param index the index of the struct buffer
        public int memory_management_control_operationAt(long index) { return memory_management_control_operation(this.segment(), index); }
        /// Sets `memory_management_control_operation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memory_management_control_operationAt(long index, int value) { memory_management_control_operation(this.segment(), index, value); return this; }

        /// {@return `difference_of_pic_nums_minus1` at the given index}
        /// @param index the index of the struct buffer
        public short difference_of_pic_nums_minus1At(long index) { return difference_of_pic_nums_minus1(this.segment(), index); }
        /// Sets `difference_of_pic_nums_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer difference_of_pic_nums_minus1At(long index, short value) { difference_of_pic_nums_minus1(this.segment(), index, value); return this; }

        /// {@return `long_term_pic_num` at the given index}
        /// @param index the index of the struct buffer
        public short long_term_pic_numAt(long index) { return long_term_pic_num(this.segment(), index); }
        /// Sets `long_term_pic_num` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer long_term_pic_numAt(long index, short value) { long_term_pic_num(this.segment(), index, value); return this; }

        /// {@return `long_term_frame_idx` at the given index}
        /// @param index the index of the struct buffer
        public short long_term_frame_idxAt(long index) { return long_term_frame_idx(this.segment(), index); }
        /// Sets `long_term_frame_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer long_term_frame_idxAt(long index, short value) { long_term_frame_idx(this.segment(), index, value); return this; }

        /// {@return `max_long_term_frame_idx_plus1` at the given index}
        /// @param index the index of the struct buffer
        public short max_long_term_frame_idx_plus1At(long index) { return max_long_term_frame_idx_plus1(this.segment(), index); }
        /// Sets `max_long_term_frame_idx_plus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer max_long_term_frame_idx_plus1At(long index, short value) { max_long_term_frame_idx_plus1(this.segment(), index, value); return this; }

    }
}
