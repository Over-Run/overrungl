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
/// ### max_latency_increase_plus1
/// [VarHandle][#VH_max_latency_increase_plus1] - [Getter][#max_latency_increase_plus1()] - [Setter][#max_latency_increase_plus1(int)]
/// ### max_dec_pic_buffering_minus1
/// [VarHandle][#VH_max_dec_pic_buffering_minus1] - [Getter][#max_dec_pic_buffering_minus1()] - [Setter][#max_dec_pic_buffering_minus1(byte)]
/// ### max_num_reorder_pics
/// [VarHandle][#VH_max_num_reorder_pics] - [Getter][#max_num_reorder_pics()] - [Setter][#max_num_reorder_pics(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265DecPicBufMgr {
///     uint32_t [ ] max_latency_increase_plus1;
///     uint8_t [ ] max_dec_pic_buffering_minus1;
///     uint8_t [ ] max_num_reorder_pics;
/// } StdVideoH265DecPicBufMgr;
/// ```
public final class StdVideoH265DecPicBufMgr extends Struct {
    /// The struct layout of `StdVideoH265DecPicBufMgr`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("max_latency_increase_plus1"),
        ValueLayout.JAVA_BYTE.withName("max_dec_pic_buffering_minus1"),
        ValueLayout.JAVA_BYTE.withName("max_num_reorder_pics")
    );
    /// The [VarHandle] of `max_latency_increase_plus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_max_latency_increase_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_latency_increase_plus1"));
    /// The [VarHandle] of `max_dec_pic_buffering_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_dec_pic_buffering_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_dec_pic_buffering_minus1"));
    /// The [VarHandle] of `max_num_reorder_pics` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_num_reorder_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_reorder_pics"));

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265DecPicBufMgr(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265DecPicBufMgr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265DecPicBufMgr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265DecPicBufMgr`
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265DecPicBufMgr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265DecPicBufMgr`
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator, long count) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT, count)); }

    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_max_latency_increase_plus1(MemorySegment segment, long index) { return (int) VH_max_latency_increase_plus1.get(segment, 0L, index); }
    /// {@return `max_latency_increase_plus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_max_latency_increase_plus1(MemorySegment segment) { return StdVideoH265DecPicBufMgr.get_max_latency_increase_plus1(segment, 0L); }
    /// {@return `max_latency_increase_plus1` at the given index}
    /// @param index the index
    public @CType("uint32_t [ ]") int max_latency_increase_plus1At(long index) { return StdVideoH265DecPicBufMgr.get_max_latency_increase_plus1(this.segment(), index); }
    /// {@return `max_latency_increase_plus1`}
    public @CType("uint32_t [ ]") int max_latency_increase_plus1() { return StdVideoH265DecPicBufMgr.get_max_latency_increase_plus1(this.segment()); }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_latency_increase_plus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_max_latency_increase_plus1.set(segment, 0L, index, value); }
    /// Sets `max_latency_increase_plus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_latency_increase_plus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265DecPicBufMgr.set_max_latency_increase_plus1(segment, 0L, value); }
    /// Sets `max_latency_increase_plus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH265DecPicBufMgr.set_max_latency_increase_plus1(this.segment(), index, value); return this; }
    /// Sets `max_latency_increase_plus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(@CType("uint32_t [ ]") int value) { StdVideoH265DecPicBufMgr.set_max_latency_increase_plus1(this.segment(), value); return this; }

    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_max_dec_pic_buffering_minus1(MemorySegment segment, long index) { return (byte) VH_max_dec_pic_buffering_minus1.get(segment, 0L, index); }
    /// {@return `max_dec_pic_buffering_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_max_dec_pic_buffering_minus1(MemorySegment segment) { return StdVideoH265DecPicBufMgr.get_max_dec_pic_buffering_minus1(segment, 0L); }
    /// {@return `max_dec_pic_buffering_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte max_dec_pic_buffering_minus1At(long index) { return StdVideoH265DecPicBufMgr.get_max_dec_pic_buffering_minus1(this.segment(), index); }
    /// {@return `max_dec_pic_buffering_minus1`}
    public @CType("uint8_t [ ]") byte max_dec_pic_buffering_minus1() { return StdVideoH265DecPicBufMgr.get_max_dec_pic_buffering_minus1(this.segment()); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_dec_pic_buffering_minus1(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_max_dec_pic_buffering_minus1.set(segment, 0L, index, value); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_dec_pic_buffering_minus1(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_dec_pic_buffering_minus1(segment, 0L, value); }
    /// Sets `max_dec_pic_buffering_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1At(long index, @CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_dec_pic_buffering_minus1(this.segment(), index, value); return this; }
    /// Sets `max_dec_pic_buffering_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(@CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_dec_pic_buffering_minus1(this.segment(), value); return this; }

    /// {@return `max_num_reorder_pics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_max_num_reorder_pics(MemorySegment segment, long index) { return (byte) VH_max_num_reorder_pics.get(segment, 0L, index); }
    /// {@return `max_num_reorder_pics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_max_num_reorder_pics(MemorySegment segment) { return StdVideoH265DecPicBufMgr.get_max_num_reorder_pics(segment, 0L); }
    /// {@return `max_num_reorder_pics` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte max_num_reorder_picsAt(long index) { return StdVideoH265DecPicBufMgr.get_max_num_reorder_pics(this.segment(), index); }
    /// {@return `max_num_reorder_pics`}
    public @CType("uint8_t [ ]") byte max_num_reorder_pics() { return StdVideoH265DecPicBufMgr.get_max_num_reorder_pics(this.segment()); }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_num_reorder_pics(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_max_num_reorder_pics.set(segment, 0L, index, value); }
    /// Sets `max_num_reorder_pics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_num_reorder_pics(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_num_reorder_pics(segment, 0L, value); }
    /// Sets `max_num_reorder_pics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_picsAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_num_reorder_pics(this.segment(), index, value); return this; }
    /// Sets `max_num_reorder_pics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(@CType("uint8_t [ ]") byte value) { StdVideoH265DecPicBufMgr.set_max_num_reorder_pics(this.segment(), value); return this; }

}
