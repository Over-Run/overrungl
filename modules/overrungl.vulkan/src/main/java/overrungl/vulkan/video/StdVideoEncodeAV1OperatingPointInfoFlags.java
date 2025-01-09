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
/// ### decoder_model_present_for_this_op
/// [VarHandle][#VH_decoder_model_present_for_this_op] - [Getter][#decoder_model_present_for_this_op()] - [Setter][#decoder_model_present_for_this_op(int)]
/// ### low_delay_mode_flag
/// [VarHandle][#VH_low_delay_mode_flag] - [Getter][#low_delay_mode_flag()] - [Setter][#low_delay_mode_flag(int)]
/// ### initial_display_delay_present_for_this_op
/// [VarHandle][#VH_initial_display_delay_present_for_this_op] - [Getter][#initial_display_delay_present_for_this_op()] - [Setter][#initial_display_delay_present_for_this_op(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1OperatingPointInfoFlags {
///     uint32_t : 1 decoder_model_present_for_this_op;
///     uint32_t : 1 low_delay_mode_flag;
///     uint32_t : 1 initial_display_delay_present_for_this_op;
///     uint32_t : 29 reserved;
/// } StdVideoEncodeAV1OperatingPointInfoFlags;
/// ```
public final class StdVideoEncodeAV1OperatingPointInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeAV1OperatingPointInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("decoder_model_present_for_this_op"),
        ValueLayout.JAVA_INT.withName("low_delay_mode_flag"),
        ValueLayout.JAVA_INT.withName("initial_display_delay_present_for_this_op"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `decoder_model_present_for_this_op` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_decoder_model_present_for_this_op = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decoder_model_present_for_this_op"));
    /// The [VarHandle] of `low_delay_mode_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_low_delay_mode_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("low_delay_mode_flag"));
    /// The [VarHandle] of `initial_display_delay_present_for_this_op` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initial_display_delay_present_for_this_op = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_display_delay_present_for_this_op"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1OperatingPointInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfoFlags`
    public static StdVideoEncodeAV1OperatingPointInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1OperatingPointInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfoFlags`
    public static StdVideoEncodeAV1OperatingPointInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1OperatingPointInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `decoder_model_present_for_this_op` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_decoder_model_present_for_this_op(MemorySegment segment, long index) { return (int) VH_decoder_model_present_for_this_op.get(segment, 0L, index); }
    /// {@return `decoder_model_present_for_this_op`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_decoder_model_present_for_this_op(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_decoder_model_present_for_this_op(segment, 0L); }
    /// {@return `decoder_model_present_for_this_op` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int decoder_model_present_for_this_opAt(long index) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_decoder_model_present_for_this_op(this.segment(), index); }
    /// {@return `decoder_model_present_for_this_op`}
    public @CType("uint32_t : 1") int decoder_model_present_for_this_op() { return StdVideoEncodeAV1OperatingPointInfoFlags.get_decoder_model_present_for_this_op(this.segment()); }
    /// Sets `decoder_model_present_for_this_op` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decoder_model_present_for_this_op(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_decoder_model_present_for_this_op.set(segment, 0L, index, value); }
    /// Sets `decoder_model_present_for_this_op` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decoder_model_present_for_this_op(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_decoder_model_present_for_this_op(segment, 0L, value); }
    /// Sets `decoder_model_present_for_this_op` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags decoder_model_present_for_this_opAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_decoder_model_present_for_this_op(this.segment(), index, value); return this; }
    /// Sets `decoder_model_present_for_this_op` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags decoder_model_present_for_this_op(@CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_decoder_model_present_for_this_op(this.segment(), value); return this; }

    /// {@return `low_delay_mode_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_low_delay_mode_flag(MemorySegment segment, long index) { return (int) VH_low_delay_mode_flag.get(segment, 0L, index); }
    /// {@return `low_delay_mode_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_low_delay_mode_flag(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_low_delay_mode_flag(segment, 0L); }
    /// {@return `low_delay_mode_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int low_delay_mode_flagAt(long index) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_low_delay_mode_flag(this.segment(), index); }
    /// {@return `low_delay_mode_flag`}
    public @CType("uint32_t : 1") int low_delay_mode_flag() { return StdVideoEncodeAV1OperatingPointInfoFlags.get_low_delay_mode_flag(this.segment()); }
    /// Sets `low_delay_mode_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_low_delay_mode_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_low_delay_mode_flag.set(segment, 0L, index, value); }
    /// Sets `low_delay_mode_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_low_delay_mode_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_low_delay_mode_flag(segment, 0L, value); }
    /// Sets `low_delay_mode_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags low_delay_mode_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_low_delay_mode_flag(this.segment(), index, value); return this; }
    /// Sets `low_delay_mode_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags low_delay_mode_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_low_delay_mode_flag(this.segment(), value); return this; }

    /// {@return `initial_display_delay_present_for_this_op` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_initial_display_delay_present_for_this_op(MemorySegment segment, long index) { return (int) VH_initial_display_delay_present_for_this_op.get(segment, 0L, index); }
    /// {@return `initial_display_delay_present_for_this_op`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_initial_display_delay_present_for_this_op(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_initial_display_delay_present_for_this_op(segment, 0L); }
    /// {@return `initial_display_delay_present_for_this_op` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int initial_display_delay_present_for_this_opAt(long index) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_initial_display_delay_present_for_this_op(this.segment(), index); }
    /// {@return `initial_display_delay_present_for_this_op`}
    public @CType("uint32_t : 1") int initial_display_delay_present_for_this_op() { return StdVideoEncodeAV1OperatingPointInfoFlags.get_initial_display_delay_present_for_this_op(this.segment()); }
    /// Sets `initial_display_delay_present_for_this_op` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initial_display_delay_present_for_this_op(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_initial_display_delay_present_for_this_op.set(segment, 0L, index, value); }
    /// Sets `initial_display_delay_present_for_this_op` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initial_display_delay_present_for_this_op(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_initial_display_delay_present_for_this_op(segment, 0L, value); }
    /// Sets `initial_display_delay_present_for_this_op` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags initial_display_delay_present_for_this_opAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_initial_display_delay_present_for_this_op(this.segment(), index, value); return this; }
    /// Sets `initial_display_delay_present_for_this_op` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags initial_display_delay_present_for_this_op(@CType("uint32_t : 1") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_initial_display_delay_present_for_this_op(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 29") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 29") int get_reserved(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 29") int reservedAt(long index) { return StdVideoEncodeAV1OperatingPointInfoFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 29") int reserved() { return StdVideoEncodeAV1OperatingPointInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 29") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 29") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags reservedAt(long index, @CType("uint32_t : 29") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags reserved(@CType("uint32_t : 29") int value) { StdVideoEncodeAV1OperatingPointInfoFlags.set_reserved(this.segment(), value); return this; }

}