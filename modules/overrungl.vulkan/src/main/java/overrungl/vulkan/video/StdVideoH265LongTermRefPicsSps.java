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
/// struct StdVideoH265LongTermRefPicsSps {
///     uint32_t used_by_curr_pic_lt_sps_flag;
///     uint32_t lt_ref_pic_poc_lsb_sps[32];
/// };
/// ```
public sealed class StdVideoH265LongTermRefPicsSps extends GroupType {
    /// The struct layout of `StdVideoH265LongTermRefPicsSps`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
        MemoryLayout.sequenceLayout(32L, ValueLayout.JAVA_INT).withName("lt_ref_pic_poc_lsb_sps")
    );
    /// The byte offset of `used_by_curr_pic_lt_sps_flag`.
    public static final long OFFSET_used_by_curr_pic_lt_sps_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    /// The memory layout of `used_by_curr_pic_lt_sps_flag`.
    public static final MemoryLayout LAYOUT_used_by_curr_pic_lt_sps_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    /// The [VarHandle] of `used_by_curr_pic_lt_sps_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_used_by_curr_pic_lt_sps_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    /// The byte offset of `lt_ref_pic_poc_lsb_sps`.
    public static final long OFFSET_lt_ref_pic_poc_lsb_sps = LAYOUT.byteOffset(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));
    /// The memory layout of `lt_ref_pic_poc_lsb_sps`.
    public static final MemoryLayout LAYOUT_lt_ref_pic_poc_lsb_sps = LAYOUT.select(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));
    /// The [VarHandle] of `lt_ref_pic_poc_lsb_sps` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_lt_ref_pic_poc_lsb_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"), PathElement.sequenceElement());

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265LongTermRefPicsSps(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265LongTermRefPicsSps ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH265LongTermRefPicsSps` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265LongTermRefPicsSps` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265LongTermRefPicsSps`
    public static StdVideoH265LongTermRefPicsSps alloc(SegmentAllocator allocator) { return new StdVideoH265LongTermRefPicsSps(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265LongTermRefPicsSps` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265LongTermRefPicsSps`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps copyFrom(StdVideoH265LongTermRefPicsSps src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `used_by_curr_pic_lt_sps_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int used_by_curr_pic_lt_sps_flag(MemorySegment segment, long index) { return (int) VH_used_by_curr_pic_lt_sps_flag.get(segment, 0L, index); }
    /// {@return `used_by_curr_pic_lt_sps_flag`}
    public int used_by_curr_pic_lt_sps_flag() { return used_by_curr_pic_lt_sps_flag(this.segment(), 0L); }
    /// Sets `used_by_curr_pic_lt_sps_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void used_by_curr_pic_lt_sps_flag(MemorySegment segment, long index, int value) { VH_used_by_curr_pic_lt_sps_flag.set(segment, 0L, index, value); }
    /// Sets `used_by_curr_pic_lt_sps_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(int value) { used_by_curr_pic_lt_sps_flag(this.segment(), 0L, value); return this; }

    /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_lt_ref_pic_poc_lsb_sps, index), LAYOUT_lt_ref_pic_poc_lsb_sps); }
    /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index, long index0) { return (int) VH_lt_ref_pic_poc_lsb_sps.get(segment, 0L, index, index0); }
    /// {@return `lt_ref_pic_poc_lsb_sps`}
    public MemorySegment lt_ref_pic_poc_lsb_sps() { return lt_ref_pic_poc_lsb_sps(this.segment(), 0L); }
    /// {@return `lt_ref_pic_poc_lsb_sps`}
    /// @param index0 the Index 0 of the array
    public int lt_ref_pic_poc_lsb_sps(long index0) { return lt_ref_pic_poc_lsb_sps(this.segment(), 0L, index0); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_lt_ref_pic_poc_lsb_sps, index), LAYOUT_lt_ref_pic_poc_lsb_sps.byteSize()); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void lt_ref_pic_poc_lsb_sps(MemorySegment segment, long index, long index0, int value) { VH_lt_ref_pic_poc_lsb_sps.set(segment, 0L, index, index0, value); }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(MemorySegment value) { lt_ref_pic_poc_lsb_sps(this.segment(), 0L, value); return this; }
    /// Sets `lt_ref_pic_poc_lsb_sps` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(long index0, int value) { lt_ref_pic_poc_lsb_sps(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [StdVideoH265LongTermRefPicsSps].
    public static final class Buffer extends StdVideoH265LongTermRefPicsSps {
        private final long elementCount;

        /// Creates `StdVideoH265LongTermRefPicsSps.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265LongTermRefPicsSps`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265LongTermRefPicsSps`
        public StdVideoH265LongTermRefPicsSps asSlice(long index) { return new StdVideoH265LongTermRefPicsSps(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265LongTermRefPicsSps`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265LongTermRefPicsSps`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `used_by_curr_pic_lt_sps_flag` at the given index}
        /// @param index the index of the struct buffer
        public int used_by_curr_pic_lt_sps_flagAt(long index) { return used_by_curr_pic_lt_sps_flag(this.segment(), index); }
        /// Sets `used_by_curr_pic_lt_sps_flag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer used_by_curr_pic_lt_sps_flagAt(long index, int value) { used_by_curr_pic_lt_sps_flag(this.segment(), index, value); return this; }

        /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment lt_ref_pic_poc_lsb_spsAt(long index) { return lt_ref_pic_poc_lsb_sps(this.segment(), index); }
        /// {@return `lt_ref_pic_poc_lsb_sps` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int lt_ref_pic_poc_lsb_spsAt(long index, long index0) { return lt_ref_pic_poc_lsb_sps(this.segment(), index, index0); }
        /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lt_ref_pic_poc_lsb_spsAt(long index, MemorySegment value) { lt_ref_pic_poc_lsb_sps(this.segment(), index, value); return this; }
        /// Sets `lt_ref_pic_poc_lsb_sps` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer lt_ref_pic_poc_lsb_spsAt(long index, long index0, int value) { lt_ref_pic_poc_lsb_sps(this.segment(), index, index0, value); return this; }

    }
}
