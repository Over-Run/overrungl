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
/// struct StdVideoH265DecPicBufMgr {
///     uint32_t max_latency_increase_plus1[7];
///     uint8_t max_dec_pic_buffering_minus1[7];
///     uint8_t max_num_reorder_pics[7];
/// };
/// ```
public final class StdVideoH265DecPicBufMgr extends GroupType {
    /// The struct layout of `StdVideoH265DecPicBufMgr`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_INT).withName("max_latency_increase_plus1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("max_dec_pic_buffering_minus1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("max_num_reorder_pics")
    );
    /// The byte offset of `max_latency_increase_plus1`.
    public static final long OFFSET_max_latency_increase_plus1 = LAYOUT.byteOffset(PathElement.groupElement("max_latency_increase_plus1"));
    /// The memory layout of `max_latency_increase_plus1`.
    public static final MemoryLayout LAYOUT_max_latency_increase_plus1 = LAYOUT.select(PathElement.groupElement("max_latency_increase_plus1"));
    /// The [VarHandle] of `max_latency_increase_plus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_max_latency_increase_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_latency_increase_plus1"), PathElement.sequenceElement());
    /// The byte offset of `max_dec_pic_buffering_minus1`.
    public static final long OFFSET_max_dec_pic_buffering_minus1 = LAYOUT.byteOffset(PathElement.groupElement("max_dec_pic_buffering_minus1"));
    /// The memory layout of `max_dec_pic_buffering_minus1`.
    public static final MemoryLayout LAYOUT_max_dec_pic_buffering_minus1 = LAYOUT.select(PathElement.groupElement("max_dec_pic_buffering_minus1"));
    /// The [VarHandle] of `max_dec_pic_buffering_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_max_dec_pic_buffering_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_dec_pic_buffering_minus1"), PathElement.sequenceElement());
    /// The byte offset of `max_num_reorder_pics`.
    public static final long OFFSET_max_num_reorder_pics = LAYOUT.byteOffset(PathElement.groupElement("max_num_reorder_pics"));
    /// The memory layout of `max_num_reorder_pics`.
    public static final MemoryLayout LAYOUT_max_num_reorder_pics = LAYOUT.select(PathElement.groupElement("max_num_reorder_pics"));
    /// The [VarHandle] of `max_num_reorder_pics` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_max_num_reorder_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_reorder_pics"), PathElement.sequenceElement());

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265DecPicBufMgr(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265DecPicBufMgr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265DecPicBufMgr`
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265DecPicBufMgr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265DecPicBufMgr`
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator, long count) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265DecPicBufMgr copyFrom(StdVideoH265DecPicBufMgr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265DecPicBufMgr reinterpret(long count) { return new StdVideoH265DecPicBufMgr(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment max_latency_increase_plus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_max_latency_increase_plus1, index), LAYOUT_max_latency_increase_plus1); }
    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int max_latency_increase_plus1(MemorySegment segment, long index, long index0) { return (int) VH_max_latency_increase_plus1.get(segment, 0L, index, index0); }
    /// {@return `max_latency_increase_plus1`}
    public MemorySegment max_latency_increase_plus1() { return max_latency_increase_plus1(this.segment(), 0L); }
    /// {@return `max_latency_increase_plus1`}
    /// @param index0 the Index 0 of the array
    public int max_latency_increase_plus1(long index0) { return max_latency_increase_plus1(this.segment(), 0L, index0); }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_latency_increase_plus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_max_latency_increase_plus1, index), LAYOUT_max_latency_increase_plus1.byteSize()); }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void max_latency_increase_plus1(MemorySegment segment, long index, long index0, int value) { VH_max_latency_increase_plus1.set(segment, 0L, index, index0, value); }
    /// Sets `max_latency_increase_plus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(MemorySegment value) { max_latency_increase_plus1(this.segment(), 0L, value); return this; }
    /// Sets `max_latency_increase_plus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(long index0, int value) { max_latency_increase_plus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment max_dec_pic_buffering_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_max_dec_pic_buffering_minus1, index), LAYOUT_max_dec_pic_buffering_minus1); }
    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte max_dec_pic_buffering_minus1(MemorySegment segment, long index, long index0) { return (byte) VH_max_dec_pic_buffering_minus1.get(segment, 0L, index, index0); }
    /// {@return `max_dec_pic_buffering_minus1`}
    public MemorySegment max_dec_pic_buffering_minus1() { return max_dec_pic_buffering_minus1(this.segment(), 0L); }
    /// {@return `max_dec_pic_buffering_minus1`}
    /// @param index0 the Index 0 of the array
    public byte max_dec_pic_buffering_minus1(long index0) { return max_dec_pic_buffering_minus1(this.segment(), 0L, index0); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_dec_pic_buffering_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_max_dec_pic_buffering_minus1, index), LAYOUT_max_dec_pic_buffering_minus1.byteSize()); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void max_dec_pic_buffering_minus1(MemorySegment segment, long index, long index0, byte value) { VH_max_dec_pic_buffering_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(MemorySegment value) { max_dec_pic_buffering_minus1(this.segment(), 0L, value); return this; }
    /// Sets `max_dec_pic_buffering_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(long index0, byte value) { max_dec_pic_buffering_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `max_num_reorder_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment max_num_reorder_pics(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_max_num_reorder_pics, index), LAYOUT_max_num_reorder_pics); }
    /// {@return `max_num_reorder_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte max_num_reorder_pics(MemorySegment segment, long index, long index0) { return (byte) VH_max_num_reorder_pics.get(segment, 0L, index, index0); }
    /// {@return `max_num_reorder_pics`}
    public MemorySegment max_num_reorder_pics() { return max_num_reorder_pics(this.segment(), 0L); }
    /// {@return `max_num_reorder_pics`}
    /// @param index0 the Index 0 of the array
    public byte max_num_reorder_pics(long index0) { return max_num_reorder_pics(this.segment(), 0L, index0); }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_num_reorder_pics(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_max_num_reorder_pics, index), LAYOUT_max_num_reorder_pics.byteSize()); }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void max_num_reorder_pics(MemorySegment segment, long index, long index0, byte value) { VH_max_num_reorder_pics.set(segment, 0L, index, index0, value); }
    /// Sets `max_num_reorder_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(MemorySegment value) { max_num_reorder_pics(this.segment(), 0L, value); return this; }
    /// Sets `max_num_reorder_pics` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(long index0, byte value) { max_num_reorder_pics(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoH265DecPicBufMgr`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265DecPicBufMgr`
    public StdVideoH265DecPicBufMgr asSlice(long index) { return new StdVideoH265DecPicBufMgr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265DecPicBufMgr`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265DecPicBufMgr`
    public StdVideoH265DecPicBufMgr asSlice(long index, long count) { return new StdVideoH265DecPicBufMgr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265DecPicBufMgr` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265DecPicBufMgr at(long index, Consumer<StdVideoH265DecPicBufMgr> func) { func.accept(asSlice(index)); return this; }

    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment max_latency_increase_plus1At(long index) { return max_latency_increase_plus1(this.segment(), index); }
    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int max_latency_increase_plus1At(long index, long index0) { return max_latency_increase_plus1(this.segment(), index, index0); }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1At(long index, MemorySegment value) { max_latency_increase_plus1(this.segment(), index, value); return this; }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1At(long index, long index0, int value) { max_latency_increase_plus1(this.segment(), index, index0, value); return this; }

    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment max_dec_pic_buffering_minus1At(long index) { return max_dec_pic_buffering_minus1(this.segment(), index); }
    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte max_dec_pic_buffering_minus1At(long index, long index0) { return max_dec_pic_buffering_minus1(this.segment(), index, index0); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1At(long index, MemorySegment value) { max_dec_pic_buffering_minus1(this.segment(), index, value); return this; }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1At(long index, long index0, byte value) { max_dec_pic_buffering_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `max_num_reorder_pics` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment max_num_reorder_picsAt(long index) { return max_num_reorder_pics(this.segment(), index); }
    /// {@return `max_num_reorder_pics` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte max_num_reorder_picsAt(long index, long index0) { return max_num_reorder_pics(this.segment(), index, index0); }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_picsAt(long index, MemorySegment value) { max_num_reorder_pics(this.segment(), index, value); return this; }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_picsAt(long index, long index0, byte value) { max_num_reorder_pics(this.segment(), index, index0, value); return this; }

}
