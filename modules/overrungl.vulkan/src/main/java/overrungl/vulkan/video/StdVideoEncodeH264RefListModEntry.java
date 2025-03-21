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
/// struct StdVideoEncodeH264RefListModEntry {
///     (int) StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc;
///     uint16_t abs_diff_pic_num_minus1;
///     uint16_t long_term_pic_num;
/// };
/// ```
public sealed class StdVideoEncodeH264RefListModEntry extends GroupType {
    /// The struct layout of `StdVideoEncodeH264RefListModEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("modification_of_pic_nums_idc"),
        ValueLayout.JAVA_SHORT.withName("abs_diff_pic_num_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num")
    );
    /// The byte offset of `modification_of_pic_nums_idc`.
    public static final long OFFSET_modification_of_pic_nums_idc = LAYOUT.byteOffset(PathElement.groupElement("modification_of_pic_nums_idc"));
    /// The memory layout of `modification_of_pic_nums_idc`.
    public static final MemoryLayout LAYOUT_modification_of_pic_nums_idc = LAYOUT.select(PathElement.groupElement("modification_of_pic_nums_idc"));
    /// The [VarHandle] of `modification_of_pic_nums_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_modification_of_pic_nums_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modification_of_pic_nums_idc"));
    /// The byte offset of `abs_diff_pic_num_minus1`.
    public static final long OFFSET_abs_diff_pic_num_minus1 = LAYOUT.byteOffset(PathElement.groupElement("abs_diff_pic_num_minus1"));
    /// The memory layout of `abs_diff_pic_num_minus1`.
    public static final MemoryLayout LAYOUT_abs_diff_pic_num_minus1 = LAYOUT.select(PathElement.groupElement("abs_diff_pic_num_minus1"));
    /// The [VarHandle] of `abs_diff_pic_num_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_abs_diff_pic_num_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("abs_diff_pic_num_minus1"));
    /// The byte offset of `long_term_pic_num`.
    public static final long OFFSET_long_term_pic_num = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
    /// The memory layout of `long_term_pic_num`.
    public static final MemoryLayout LAYOUT_long_term_pic_num = LAYOUT.select(PathElement.groupElement("long_term_pic_num"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264RefListModEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264RefListModEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264RefListModEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264RefListModEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264RefListModEntry`
    public static StdVideoEncodeH264RefListModEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefListModEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264RefListModEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264RefListModEntry`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry copyFrom(StdVideoEncodeH264RefListModEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `modification_of_pic_nums_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int modification_of_pic_nums_idc(MemorySegment segment, long index) { return (int) VH_modification_of_pic_nums_idc.get(segment, 0L, index); }
    /// {@return `modification_of_pic_nums_idc`}
    public int modification_of_pic_nums_idc() { return modification_of_pic_nums_idc(this.segment(), 0L); }
    /// Sets `modification_of_pic_nums_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void modification_of_pic_nums_idc(MemorySegment segment, long index, int value) { VH_modification_of_pic_nums_idc.set(segment, 0L, index, value); }
    /// Sets `modification_of_pic_nums_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(int value) { modification_of_pic_nums_idc(this.segment(), 0L, value); return this; }

    /// {@return `abs_diff_pic_num_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short abs_diff_pic_num_minus1(MemorySegment segment, long index) { return (short) VH_abs_diff_pic_num_minus1.get(segment, 0L, index); }
    /// {@return `abs_diff_pic_num_minus1`}
    public short abs_diff_pic_num_minus1() { return abs_diff_pic_num_minus1(this.segment(), 0L); }
    /// Sets `abs_diff_pic_num_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void abs_diff_pic_num_minus1(MemorySegment segment, long index, short value) { VH_abs_diff_pic_num_minus1.set(segment, 0L, index, value); }
    /// Sets `abs_diff_pic_num_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(short value) { abs_diff_pic_num_minus1(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264RefListModEntry long_term_pic_num(short value) { long_term_pic_num(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH264RefListModEntry].
    public static final class Buffer extends StdVideoEncodeH264RefListModEntry {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264RefListModEntry.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264RefListModEntry`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264RefListModEntry`
        public StdVideoEncodeH264RefListModEntry asSlice(long index) { return new StdVideoEncodeH264RefListModEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264RefListModEntry`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264RefListModEntry`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `modification_of_pic_nums_idc` at the given index}
        /// @param index the index of the struct buffer
        public int modification_of_pic_nums_idcAt(long index) { return modification_of_pic_nums_idc(this.segment(), index); }
        /// Sets `modification_of_pic_nums_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer modification_of_pic_nums_idcAt(long index, int value) { modification_of_pic_nums_idc(this.segment(), index, value); return this; }

        /// {@return `abs_diff_pic_num_minus1` at the given index}
        /// @param index the index of the struct buffer
        public short abs_diff_pic_num_minus1At(long index) { return abs_diff_pic_num_minus1(this.segment(), index); }
        /// Sets `abs_diff_pic_num_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer abs_diff_pic_num_minus1At(long index, short value) { abs_diff_pic_num_minus1(this.segment(), index, value); return this; }

        /// {@return `long_term_pic_num` at the given index}
        /// @param index the index of the struct buffer
        public short long_term_pic_numAt(long index) { return long_term_pic_num(this.segment(), index); }
        /// Sets `long_term_pic_num` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer long_term_pic_numAt(long index, short value) { long_term_pic_num(this.segment(), index, value); return this; }

    }
}
