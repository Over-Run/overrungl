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
/// ### buffer_delay_length_minus_1
/// [VarHandle][#VH_buffer_delay_length_minus_1] - [Getter][#buffer_delay_length_minus_1()] - [Setter][#buffer_delay_length_minus_1(byte)]
/// ### buffer_removal_time_length_minus_1
/// [VarHandle][#VH_buffer_removal_time_length_minus_1] - [Getter][#buffer_removal_time_length_minus_1()] - [Setter][#buffer_removal_time_length_minus_1(byte)]
/// ### frame_presentation_time_length_minus_1
/// [VarHandle][#VH_frame_presentation_time_length_minus_1] - [Getter][#frame_presentation_time_length_minus_1()] - [Setter][#frame_presentation_time_length_minus_1(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### num_units_in_decoding_tick
/// [VarHandle][#VH_num_units_in_decoding_tick] - [Getter][#num_units_in_decoding_tick()] - [Setter][#num_units_in_decoding_tick(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1DecoderModelInfo {
///     uint8_t buffer_delay_length_minus_1;
///     uint8_t buffer_removal_time_length_minus_1;
///     uint8_t frame_presentation_time_length_minus_1;
///     uint8_t reserved1;
///     uint32_t num_units_in_decoding_tick;
/// } StdVideoEncodeAV1DecoderModelInfo;
/// ```
public final class StdVideoEncodeAV1DecoderModelInfo extends Struct {
    /// The struct layout of `StdVideoEncodeAV1DecoderModelInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("buffer_delay_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("buffer_removal_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("frame_presentation_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("num_units_in_decoding_tick")
    );
    /// The [VarHandle] of `buffer_delay_length_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_buffer_delay_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer_delay_length_minus_1"));
    /// The [VarHandle] of `buffer_removal_time_length_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_buffer_removal_time_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer_removal_time_length_minus_1"));
    /// The [VarHandle] of `frame_presentation_time_length_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_frame_presentation_time_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_presentation_time_length_minus_1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `num_units_in_decoding_tick` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_units_in_decoding_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_decoding_tick"));

    /// Creates `StdVideoEncodeAV1DecoderModelInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1DecoderModelInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1DecoderModelInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1DecoderModelInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment); }

    /// Creates `StdVideoEncodeAV1DecoderModelInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1DecoderModelInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1DecoderModelInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1DecoderModelInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeAV1DecoderModelInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1DecoderModelInfo`
    public static StdVideoEncodeAV1DecoderModelInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1DecoderModelInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1DecoderModelInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1DecoderModelInfo`
    public static StdVideoEncodeAV1DecoderModelInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1DecoderModelInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `buffer_delay_length_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_buffer_delay_length_minus_1(MemorySegment segment, long index) { return (byte) VH_buffer_delay_length_minus_1.get(segment, 0L, index); }
    /// {@return `buffer_delay_length_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_buffer_delay_length_minus_1(MemorySegment segment) { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_delay_length_minus_1(segment, 0L); }
    /// {@return `buffer_delay_length_minus_1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte buffer_delay_length_minus_1At(long index) { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_delay_length_minus_1(this.segment(), index); }
    /// {@return `buffer_delay_length_minus_1`}
    public @CType("uint8_t") byte buffer_delay_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_delay_length_minus_1(this.segment()); }
    /// Sets `buffer_delay_length_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer_delay_length_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_buffer_delay_length_minus_1.set(segment, 0L, index, value); }
    /// Sets `buffer_delay_length_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer_delay_length_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_delay_length_minus_1(segment, 0L, value); }
    /// Sets `buffer_delay_length_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_delay_length_minus_1(this.segment(), index, value); return this; }
    /// Sets `buffer_delay_length_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(@CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_delay_length_minus_1(this.segment(), value); return this; }

    /// {@return `buffer_removal_time_length_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_buffer_removal_time_length_minus_1(MemorySegment segment, long index) { return (byte) VH_buffer_removal_time_length_minus_1.get(segment, 0L, index); }
    /// {@return `buffer_removal_time_length_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_buffer_removal_time_length_minus_1(MemorySegment segment) { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_removal_time_length_minus_1(segment, 0L); }
    /// {@return `buffer_removal_time_length_minus_1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte buffer_removal_time_length_minus_1At(long index) { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_removal_time_length_minus_1(this.segment(), index); }
    /// {@return `buffer_removal_time_length_minus_1`}
    public @CType("uint8_t") byte buffer_removal_time_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.get_buffer_removal_time_length_minus_1(this.segment()); }
    /// Sets `buffer_removal_time_length_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer_removal_time_length_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_buffer_removal_time_length_minus_1.set(segment, 0L, index, value); }
    /// Sets `buffer_removal_time_length_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer_removal_time_length_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_removal_time_length_minus_1(segment, 0L, value); }
    /// Sets `buffer_removal_time_length_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_removal_time_length_minus_1(this.segment(), index, value); return this; }
    /// Sets `buffer_removal_time_length_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(@CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_buffer_removal_time_length_minus_1(this.segment(), value); return this; }

    /// {@return `frame_presentation_time_length_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_frame_presentation_time_length_minus_1(MemorySegment segment, long index) { return (byte) VH_frame_presentation_time_length_minus_1.get(segment, 0L, index); }
    /// {@return `frame_presentation_time_length_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_frame_presentation_time_length_minus_1(MemorySegment segment) { return StdVideoEncodeAV1DecoderModelInfo.get_frame_presentation_time_length_minus_1(segment, 0L); }
    /// {@return `frame_presentation_time_length_minus_1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte frame_presentation_time_length_minus_1At(long index) { return StdVideoEncodeAV1DecoderModelInfo.get_frame_presentation_time_length_minus_1(this.segment(), index); }
    /// {@return `frame_presentation_time_length_minus_1`}
    public @CType("uint8_t") byte frame_presentation_time_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.get_frame_presentation_time_length_minus_1(this.segment()); }
    /// Sets `frame_presentation_time_length_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_presentation_time_length_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_frame_presentation_time_length_minus_1.set(segment, 0L, index, value); }
    /// Sets `frame_presentation_time_length_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_presentation_time_length_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_frame_presentation_time_length_minus_1(segment, 0L, value); }
    /// Sets `frame_presentation_time_length_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_frame_presentation_time_length_minus_1(this.segment(), index, value); return this; }
    /// Sets `frame_presentation_time_length_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(@CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_frame_presentation_time_length_minus_1(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeAV1DecoderModelInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte reserved1At(long index) { return StdVideoEncodeAV1DecoderModelInfo.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoEncodeAV1DecoderModelInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo reserved1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo reserved1(@CType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `num_units_in_decoding_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_num_units_in_decoding_tick(MemorySegment segment, long index) { return (int) VH_num_units_in_decoding_tick.get(segment, 0L, index); }
    /// {@return `num_units_in_decoding_tick`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_num_units_in_decoding_tick(MemorySegment segment) { return StdVideoEncodeAV1DecoderModelInfo.get_num_units_in_decoding_tick(segment, 0L); }
    /// {@return `num_units_in_decoding_tick` at the given index}
    /// @param index the index
    public @CType("uint32_t") int num_units_in_decoding_tickAt(long index) { return StdVideoEncodeAV1DecoderModelInfo.get_num_units_in_decoding_tick(this.segment(), index); }
    /// {@return `num_units_in_decoding_tick`}
    public @CType("uint32_t") int num_units_in_decoding_tick() { return StdVideoEncodeAV1DecoderModelInfo.get_num_units_in_decoding_tick(this.segment()); }
    /// Sets `num_units_in_decoding_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_units_in_decoding_tick(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_num_units_in_decoding_tick.set(segment, 0L, index, value); }
    /// Sets `num_units_in_decoding_tick` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_units_in_decoding_tick(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1DecoderModelInfo.set_num_units_in_decoding_tick(segment, 0L, value); }
    /// Sets `num_units_in_decoding_tick` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tickAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1DecoderModelInfo.set_num_units_in_decoding_tick(this.segment(), index, value); return this; }
    /// Sets `num_units_in_decoding_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(@CType("uint32_t") int value) { StdVideoEncodeAV1DecoderModelInfo.set_num_units_in_decoding_tick(this.segment(), value); return this; }

}