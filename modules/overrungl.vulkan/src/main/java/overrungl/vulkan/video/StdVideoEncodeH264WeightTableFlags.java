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
/// struct StdVideoEncodeH264WeightTableFlags {
///     uint32_t luma_weight_l0_flag;
///     uint32_t chroma_weight_l0_flag;
///     uint32_t luma_weight_l1_flag;
///     uint32_t chroma_weight_l1_flag;
/// };
/// ```
public sealed class StdVideoEncodeH264WeightTableFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH264WeightTableFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("luma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("luma_weight_l1_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l1_flag")
    );
    /// The byte offset of `luma_weight_l0_flag`.
    public static final long OFFSET_luma_weight_l0_flag = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0_flag"));
    /// The memory layout of `luma_weight_l0_flag`.
    public static final MemoryLayout LAYOUT_luma_weight_l0_flag = LAYOUT.select(PathElement.groupElement("luma_weight_l0_flag"));
    /// The [VarHandle] of `luma_weight_l0_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_luma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0_flag"));
    /// The byte offset of `chroma_weight_l0_flag`.
    public static final long OFFSET_chroma_weight_l0_flag = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0_flag"));
    /// The memory layout of `chroma_weight_l0_flag`.
    public static final MemoryLayout LAYOUT_chroma_weight_l0_flag = LAYOUT.select(PathElement.groupElement("chroma_weight_l0_flag"));
    /// The [VarHandle] of `chroma_weight_l0_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0_flag"));
    /// The byte offset of `luma_weight_l1_flag`.
    public static final long OFFSET_luma_weight_l1_flag = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1_flag"));
    /// The memory layout of `luma_weight_l1_flag`.
    public static final MemoryLayout LAYOUT_luma_weight_l1_flag = LAYOUT.select(PathElement.groupElement("luma_weight_l1_flag"));
    /// The [VarHandle] of `luma_weight_l1_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_luma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1_flag"));
    /// The byte offset of `chroma_weight_l1_flag`.
    public static final long OFFSET_chroma_weight_l1_flag = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1_flag"));
    /// The memory layout of `chroma_weight_l1_flag`.
    public static final MemoryLayout LAYOUT_chroma_weight_l1_flag = LAYOUT.select(PathElement.groupElement("chroma_weight_l1_flag"));
    /// The [VarHandle] of `chroma_weight_l1_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1_flag"));

    /// Creates `StdVideoEncodeH264WeightTableFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264WeightTableFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264WeightTableFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264WeightTableFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264WeightTableFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTableFlags(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264WeightTableFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264WeightTableFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264WeightTableFlags`
    public static StdVideoEncodeH264WeightTableFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264WeightTableFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264WeightTableFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264WeightTableFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264WeightTableFlags copyFrom(StdVideoEncodeH264WeightTableFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `luma_weight_l0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int luma_weight_l0_flag(MemorySegment segment, long index) { return (int) VH_luma_weight_l0_flag.get(segment, 0L, index); }
    /// {@return `luma_weight_l0_flag`}
    public int luma_weight_l0_flag() { return luma_weight_l0_flag(this.segment(), 0L); }
    /// Sets `luma_weight_l0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_weight_l0_flag(MemorySegment segment, long index, int value) { VH_luma_weight_l0_flag.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTableFlags luma_weight_l0_flag(int value) { luma_weight_l0_flag(this.segment(), 0L, value); return this; }

    /// {@return `chroma_weight_l0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chroma_weight_l0_flag(MemorySegment segment, long index) { return (int) VH_chroma_weight_l0_flag.get(segment, 0L, index); }
    /// {@return `chroma_weight_l0_flag`}
    public int chroma_weight_l0_flag() { return chroma_weight_l0_flag(this.segment(), 0L); }
    /// Sets `chroma_weight_l0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_weight_l0_flag(MemorySegment segment, long index, int value) { VH_chroma_weight_l0_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l0_flag(int value) { chroma_weight_l0_flag(this.segment(), 0L, value); return this; }

    /// {@return `luma_weight_l1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int luma_weight_l1_flag(MemorySegment segment, long index) { return (int) VH_luma_weight_l1_flag.get(segment, 0L, index); }
    /// {@return `luma_weight_l1_flag`}
    public int luma_weight_l1_flag() { return luma_weight_l1_flag(this.segment(), 0L); }
    /// Sets `luma_weight_l1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_weight_l1_flag(MemorySegment segment, long index, int value) { VH_luma_weight_l1_flag.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTableFlags luma_weight_l1_flag(int value) { luma_weight_l1_flag(this.segment(), 0L, value); return this; }

    /// {@return `chroma_weight_l1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chroma_weight_l1_flag(MemorySegment segment, long index) { return (int) VH_chroma_weight_l1_flag.get(segment, 0L, index); }
    /// {@return `chroma_weight_l1_flag`}
    public int chroma_weight_l1_flag() { return chroma_weight_l1_flag(this.segment(), 0L); }
    /// Sets `chroma_weight_l1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_weight_l1_flag(MemorySegment segment, long index, int value) { VH_chroma_weight_l1_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l1_flag(int value) { chroma_weight_l1_flag(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH264WeightTableFlags].
    public static final class Buffer extends StdVideoEncodeH264WeightTableFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264WeightTableFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264WeightTableFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264WeightTableFlags`
        public StdVideoEncodeH264WeightTableFlags asSlice(long index) { return new StdVideoEncodeH264WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264WeightTableFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264WeightTableFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `luma_weight_l0_flag` at the given index}
        /// @param index the index of the struct buffer
        public int luma_weight_l0_flagAt(long index) { return luma_weight_l0_flag(this.segment(), index); }
        /// Sets `luma_weight_l0_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l0_flagAt(long index, int value) { luma_weight_l0_flag(this.segment(), index, value); return this; }

        /// {@return `chroma_weight_l0_flag` at the given index}
        /// @param index the index of the struct buffer
        public int chroma_weight_l0_flagAt(long index) { return chroma_weight_l0_flag(this.segment(), index); }
        /// Sets `chroma_weight_l0_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l0_flagAt(long index, int value) { chroma_weight_l0_flag(this.segment(), index, value); return this; }

        /// {@return `luma_weight_l1_flag` at the given index}
        /// @param index the index of the struct buffer
        public int luma_weight_l1_flagAt(long index) { return luma_weight_l1_flag(this.segment(), index); }
        /// Sets `luma_weight_l1_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l1_flagAt(long index, int value) { luma_weight_l1_flag(this.segment(), index, value); return this; }

        /// {@return `chroma_weight_l1_flag` at the given index}
        /// @param index the index of the struct buffer
        public int chroma_weight_l1_flagAt(long index) { return chroma_weight_l1_flag(this.segment(), index); }
        /// Sets `chroma_weight_l1_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l1_flagAt(long index, int value) { chroma_weight_l1_flag(this.segment(), index, value); return this; }

    }
}
