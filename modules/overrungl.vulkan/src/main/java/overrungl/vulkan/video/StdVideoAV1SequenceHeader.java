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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### seq_profile
/// [VarHandle][#VH_seq_profile] - [Getter][#seq_profile()] - [Setter][#seq_profile(int)]
/// ### frame_width_bits_minus_1
/// [VarHandle][#VH_frame_width_bits_minus_1] - [Getter][#frame_width_bits_minus_1()] - [Setter][#frame_width_bits_minus_1(byte)]
/// ### frame_height_bits_minus_1
/// [VarHandle][#VH_frame_height_bits_minus_1] - [Getter][#frame_height_bits_minus_1()] - [Setter][#frame_height_bits_minus_1(byte)]
/// ### max_frame_width_minus_1
/// [VarHandle][#VH_max_frame_width_minus_1] - [Getter][#max_frame_width_minus_1()] - [Setter][#max_frame_width_minus_1(short)]
/// ### max_frame_height_minus_1
/// [VarHandle][#VH_max_frame_height_minus_1] - [Getter][#max_frame_height_minus_1()] - [Setter][#max_frame_height_minus_1(short)]
/// ### delta_frame_id_length_minus_2
/// [VarHandle][#VH_delta_frame_id_length_minus_2] - [Getter][#delta_frame_id_length_minus_2()] - [Setter][#delta_frame_id_length_minus_2(byte)]
/// ### additional_frame_id_length_minus_1
/// [VarHandle][#VH_additional_frame_id_length_minus_1] - [Getter][#additional_frame_id_length_minus_1()] - [Setter][#additional_frame_id_length_minus_1(byte)]
/// ### order_hint_bits_minus_1
/// [VarHandle][#VH_order_hint_bits_minus_1] - [Getter][#order_hint_bits_minus_1()] - [Setter][#order_hint_bits_minus_1(byte)]
/// ### seq_force_integer_mv
/// [VarHandle][#VH_seq_force_integer_mv] - [Getter][#seq_force_integer_mv()] - [Setter][#seq_force_integer_mv(byte)]
/// ### seq_force_screen_content_tools
/// [VarHandle][#VH_seq_force_screen_content_tools] - [Getter][#seq_force_screen_content_tools()] - [Setter][#seq_force_screen_content_tools(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pColorConfig
/// [VarHandle][#VH_pColorConfig] - [Getter][#pColorConfig()] - [Setter][#pColorConfig(java.lang.foreign.MemorySegment)]
/// ### pTimingInfo
/// [VarHandle][#VH_pTimingInfo] - [Getter][#pTimingInfo()] - [Setter][#pTimingInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1SequenceHeader {
///     StdVideoAV1SequenceHeaderFlags flags;
///     StdVideoAV1Profile seq_profile;
///     uint8_t frame_width_bits_minus_1;
///     uint8_t frame_height_bits_minus_1;
///     uint16_t max_frame_width_minus_1;
///     uint16_t max_frame_height_minus_1;
///     uint8_t delta_frame_id_length_minus_2;
///     uint8_t additional_frame_id_length_minus_1;
///     uint8_t order_hint_bits_minus_1;
///     uint8_t seq_force_integer_mv;
///     uint8_t seq_force_screen_content_tools;
///     uint8_t [5] reserved1;
///     const StdVideoAV1ColorConfig * pColorConfig;
///     const StdVideoAV1TimingInfo * pTimingInfo;
/// } StdVideoAV1SequenceHeader;
/// ```
public sealed class StdVideoAV1SequenceHeader extends Struct {
    /// The struct layout of `StdVideoAV1SequenceHeader`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1SequenceHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("seq_profile"),
        ValueLayout.JAVA_BYTE.withName("frame_width_bits_minus_1"),
        ValueLayout.JAVA_BYTE.withName("frame_height_bits_minus_1"),
        ValueLayout.JAVA_SHORT.withName("max_frame_width_minus_1"),
        ValueLayout.JAVA_SHORT.withName("max_frame_height_minus_1"),
        ValueLayout.JAVA_BYTE.withName("delta_frame_id_length_minus_2"),
        ValueLayout.JAVA_BYTE.withName("additional_frame_id_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("order_hint_bits_minus_1"),
        ValueLayout.JAVA_BYTE.withName("seq_force_integer_mv"),
        ValueLayout.JAVA_BYTE.withName("seq_force_screen_content_tools"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pColorConfig"),
        ValueLayout.ADDRESS.withName("pTimingInfo")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `seq_profile` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_seq_profile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_profile"));
    /// The [VarHandle] of `frame_width_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_frame_width_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_width_bits_minus_1"));
    /// The [VarHandle] of `frame_height_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_frame_height_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_height_bits_minus_1"));
    /// The [VarHandle] of `max_frame_width_minus_1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_max_frame_width_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_width_minus_1"));
    /// The [VarHandle] of `max_frame_height_minus_1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_max_frame_height_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_height_minus_1"));
    /// The [VarHandle] of `delta_frame_id_length_minus_2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_frame_id_length_minus_2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_frame_id_length_minus_2"));
    /// The [VarHandle] of `additional_frame_id_length_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_additional_frame_id_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("additional_frame_id_length_minus_1"));
    /// The [VarHandle] of `order_hint_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_order_hint_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("order_hint_bits_minus_1"));
    /// The [VarHandle] of `seq_force_integer_mv` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_force_integer_mv = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_force_integer_mv"));
    /// The [VarHandle] of `seq_force_screen_content_tools` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_force_screen_content_tools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_force_screen_content_tools"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pColorConfig` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorConfig = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorConfig"));
    /// The [VarHandle] of `pTimingInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTimingInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimingInfo"));

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1SequenceHeader(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeader of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeader(segment); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeader ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1SequenceHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1SequenceHeader`
    public static StdVideoAV1SequenceHeader alloc(SegmentAllocator allocator) { return new StdVideoAV1SequenceHeader(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1SequenceHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1SequenceHeader`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1SequenceHeader` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1SequenceHeader`
    public static StdVideoAV1SequenceHeader allocInit(SegmentAllocator allocator, @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment flags, @CType("StdVideoAV1Profile") int seq_profile, @CType("uint8_t") byte frame_width_bits_minus_1, @CType("uint8_t") byte frame_height_bits_minus_1, @CType("uint16_t") short max_frame_width_minus_1, @CType("uint16_t") short max_frame_height_minus_1, @CType("uint8_t") byte delta_frame_id_length_minus_2, @CType("uint8_t") byte additional_frame_id_length_minus_1, @CType("uint8_t") byte order_hint_bits_minus_1, @CType("uint8_t") byte seq_force_integer_mv, @CType("uint8_t") byte seq_force_screen_content_tools, @CType("uint8_t [5]") byte reserved1, @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment pColorConfig, @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment pTimingInfo) { return alloc(allocator).flags(flags).seq_profile(seq_profile).frame_width_bits_minus_1(frame_width_bits_minus_1).frame_height_bits_minus_1(frame_height_bits_minus_1).max_frame_width_minus_1(max_frame_width_minus_1).max_frame_height_minus_1(max_frame_height_minus_1).delta_frame_id_length_minus_2(delta_frame_id_length_minus_2).additional_frame_id_length_minus_1(additional_frame_id_length_minus_1).order_hint_bits_minus_1(order_hint_bits_minus_1).seq_force_integer_mv(seq_force_integer_mv).seq_force_screen_content_tools(seq_force_screen_content_tools).reserved1(reserved1).pColorConfig(pColorConfig).pTimingInfo(pTimingInfo); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1SequenceHeader copyFrom(StdVideoAV1SequenceHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1SequenceHeader.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader flags(@CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_flags(this.segment(), value); return this; }

    /// {@return `seq_profile` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1Profile") int get_seq_profile(MemorySegment segment, long index) { return (int) VH_seq_profile.get(segment, 0L, index); }
    /// {@return `seq_profile`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1Profile") int get_seq_profile(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_seq_profile(segment, 0L); }
    /// {@return `seq_profile`}
    public @CType("StdVideoAV1Profile") int seq_profile() { return StdVideoAV1SequenceHeader.get_seq_profile(this.segment()); }
    /// Sets `seq_profile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_profile(MemorySegment segment, long index, @CType("StdVideoAV1Profile") int value) { VH_seq_profile.set(segment, 0L, index, value); }
    /// Sets `seq_profile` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_profile(MemorySegment segment, @CType("StdVideoAV1Profile") int value) { StdVideoAV1SequenceHeader.set_seq_profile(segment, 0L, value); }
    /// Sets `seq_profile` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_profile(@CType("StdVideoAV1Profile") int value) { StdVideoAV1SequenceHeader.set_seq_profile(this.segment(), value); return this; }

    /// {@return `frame_width_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_frame_width_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_frame_width_bits_minus_1.get(segment, 0L, index); }
    /// {@return `frame_width_bits_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_frame_width_bits_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_frame_width_bits_minus_1(segment, 0L); }
    /// {@return `frame_width_bits_minus_1`}
    public @CType("uint8_t") byte frame_width_bits_minus_1() { return StdVideoAV1SequenceHeader.get_frame_width_bits_minus_1(this.segment()); }
    /// Sets `frame_width_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_width_bits_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_frame_width_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `frame_width_bits_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_width_bits_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_width_bits_minus_1(segment, 0L, value); }
    /// Sets `frame_width_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_width_bits_minus_1(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_width_bits_minus_1(this.segment(), value); return this; }

    /// {@return `frame_height_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_frame_height_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_frame_height_bits_minus_1.get(segment, 0L, index); }
    /// {@return `frame_height_bits_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_frame_height_bits_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_frame_height_bits_minus_1(segment, 0L); }
    /// {@return `frame_height_bits_minus_1`}
    public @CType("uint8_t") byte frame_height_bits_minus_1() { return StdVideoAV1SequenceHeader.get_frame_height_bits_minus_1(this.segment()); }
    /// Sets `frame_height_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_height_bits_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_frame_height_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `frame_height_bits_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_height_bits_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_height_bits_minus_1(segment, 0L, value); }
    /// Sets `frame_height_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_height_bits_minus_1(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_height_bits_minus_1(this.segment(), value); return this; }

    /// {@return `max_frame_width_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_max_frame_width_minus_1(MemorySegment segment, long index) { return (short) VH_max_frame_width_minus_1.get(segment, 0L, index); }
    /// {@return `max_frame_width_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_max_frame_width_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_max_frame_width_minus_1(segment, 0L); }
    /// {@return `max_frame_width_minus_1`}
    public @CType("uint16_t") short max_frame_width_minus_1() { return StdVideoAV1SequenceHeader.get_max_frame_width_minus_1(this.segment()); }
    /// Sets `max_frame_width_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_frame_width_minus_1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_max_frame_width_minus_1.set(segment, 0L, index, value); }
    /// Sets `max_frame_width_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_frame_width_minus_1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_width_minus_1(segment, 0L, value); }
    /// Sets `max_frame_width_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_width_minus_1(@CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_width_minus_1(this.segment(), value); return this; }

    /// {@return `max_frame_height_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_max_frame_height_minus_1(MemorySegment segment, long index) { return (short) VH_max_frame_height_minus_1.get(segment, 0L, index); }
    /// {@return `max_frame_height_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_max_frame_height_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_max_frame_height_minus_1(segment, 0L); }
    /// {@return `max_frame_height_minus_1`}
    public @CType("uint16_t") short max_frame_height_minus_1() { return StdVideoAV1SequenceHeader.get_max_frame_height_minus_1(this.segment()); }
    /// Sets `max_frame_height_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_frame_height_minus_1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_max_frame_height_minus_1.set(segment, 0L, index, value); }
    /// Sets `max_frame_height_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_frame_height_minus_1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_height_minus_1(segment, 0L, value); }
    /// Sets `max_frame_height_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_height_minus_1(@CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_height_minus_1(this.segment(), value); return this; }

    /// {@return `delta_frame_id_length_minus_2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_frame_id_length_minus_2(MemorySegment segment, long index) { return (byte) VH_delta_frame_id_length_minus_2.get(segment, 0L, index); }
    /// {@return `delta_frame_id_length_minus_2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_frame_id_length_minus_2(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_delta_frame_id_length_minus_2(segment, 0L); }
    /// {@return `delta_frame_id_length_minus_2`}
    public @CType("uint8_t") byte delta_frame_id_length_minus_2() { return StdVideoAV1SequenceHeader.get_delta_frame_id_length_minus_2(this.segment()); }
    /// Sets `delta_frame_id_length_minus_2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_frame_id_length_minus_2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_frame_id_length_minus_2.set(segment, 0L, index, value); }
    /// Sets `delta_frame_id_length_minus_2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_frame_id_length_minus_2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_delta_frame_id_length_minus_2(segment, 0L, value); }
    /// Sets `delta_frame_id_length_minus_2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_delta_frame_id_length_minus_2(this.segment(), value); return this; }

    /// {@return `additional_frame_id_length_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_additional_frame_id_length_minus_1(MemorySegment segment, long index) { return (byte) VH_additional_frame_id_length_minus_1.get(segment, 0L, index); }
    /// {@return `additional_frame_id_length_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_additional_frame_id_length_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_additional_frame_id_length_minus_1(segment, 0L); }
    /// {@return `additional_frame_id_length_minus_1`}
    public @CType("uint8_t") byte additional_frame_id_length_minus_1() { return StdVideoAV1SequenceHeader.get_additional_frame_id_length_minus_1(this.segment()); }
    /// Sets `additional_frame_id_length_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_additional_frame_id_length_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_additional_frame_id_length_minus_1.set(segment, 0L, index, value); }
    /// Sets `additional_frame_id_length_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_additional_frame_id_length_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_additional_frame_id_length_minus_1(segment, 0L, value); }
    /// Sets `additional_frame_id_length_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_additional_frame_id_length_minus_1(this.segment(), value); return this; }

    /// {@return `order_hint_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_order_hint_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_order_hint_bits_minus_1.get(segment, 0L, index); }
    /// {@return `order_hint_bits_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_order_hint_bits_minus_1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_order_hint_bits_minus_1(segment, 0L); }
    /// {@return `order_hint_bits_minus_1`}
    public @CType("uint8_t") byte order_hint_bits_minus_1() { return StdVideoAV1SequenceHeader.get_order_hint_bits_minus_1(this.segment()); }
    /// Sets `order_hint_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_order_hint_bits_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_order_hint_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `order_hint_bits_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_order_hint_bits_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_order_hint_bits_minus_1(segment, 0L, value); }
    /// Sets `order_hint_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader order_hint_bits_minus_1(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_order_hint_bits_minus_1(this.segment(), value); return this; }

    /// {@return `seq_force_integer_mv` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_force_integer_mv(MemorySegment segment, long index) { return (byte) VH_seq_force_integer_mv.get(segment, 0L, index); }
    /// {@return `seq_force_integer_mv`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_force_integer_mv(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_seq_force_integer_mv(segment, 0L); }
    /// {@return `seq_force_integer_mv`}
    public @CType("uint8_t") byte seq_force_integer_mv() { return StdVideoAV1SequenceHeader.get_seq_force_integer_mv(this.segment()); }
    /// Sets `seq_force_integer_mv` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_force_integer_mv(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_force_integer_mv.set(segment, 0L, index, value); }
    /// Sets `seq_force_integer_mv` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_force_integer_mv(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_integer_mv(segment, 0L, value); }
    /// Sets `seq_force_integer_mv` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_integer_mv(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_integer_mv(this.segment(), value); return this; }

    /// {@return `seq_force_screen_content_tools` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_force_screen_content_tools(MemorySegment segment, long index) { return (byte) VH_seq_force_screen_content_tools.get(segment, 0L, index); }
    /// {@return `seq_force_screen_content_tools`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_force_screen_content_tools(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_seq_force_screen_content_tools(segment, 0L); }
    /// {@return `seq_force_screen_content_tools`}
    public @CType("uint8_t") byte seq_force_screen_content_tools() { return StdVideoAV1SequenceHeader.get_seq_force_screen_content_tools(this.segment()); }
    /// Sets `seq_force_screen_content_tools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_force_screen_content_tools(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_force_screen_content_tools.set(segment, 0L, index, value); }
    /// Sets `seq_force_screen_content_tools` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_force_screen_content_tools(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_screen_content_tools(segment, 0L, value); }
    /// Sets `seq_force_screen_content_tools` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_screen_content_tools(@CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_screen_content_tools(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [5]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [5]") byte get_reserved1(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t [5]") byte reserved1() { return StdVideoAV1SequenceHeader.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [5]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [5]") byte value) { StdVideoAV1SequenceHeader.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader reserved1(@CType("uint8_t [5]") byte value) { StdVideoAV1SequenceHeader.set_reserved1(this.segment(), value); return this; }

    /// {@return `pColorConfig` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment get_pColorConfig(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorConfig.get(segment, 0L, index); }
    /// {@return `pColorConfig`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment get_pColorConfig(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_pColorConfig(segment, 0L); }
    /// {@return `pColorConfig`}
    public @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment pColorConfig() { return StdVideoAV1SequenceHeader.get_pColorConfig(this.segment()); }
    /// Sets `pColorConfig` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorConfig(MemorySegment segment, long index, @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment value) { VH_pColorConfig.set(segment, 0L, index, value); }
    /// Sets `pColorConfig` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorConfig(MemorySegment segment, @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pColorConfig(segment, 0L, value); }
    /// Sets `pColorConfig` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pColorConfig(@CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pColorConfig(this.segment(), value); return this; }

    /// {@return `pTimingInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment get_pTimingInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTimingInfo.get(segment, 0L, index); }
    /// {@return `pTimingInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment get_pTimingInfo(MemorySegment segment) { return StdVideoAV1SequenceHeader.get_pTimingInfo(segment, 0L); }
    /// {@return `pTimingInfo`}
    public @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment pTimingInfo() { return StdVideoAV1SequenceHeader.get_pTimingInfo(this.segment()); }
    /// Sets `pTimingInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTimingInfo(MemorySegment segment, long index, @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment value) { VH_pTimingInfo.set(segment, 0L, index, value); }
    /// Sets `pTimingInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTimingInfo(MemorySegment segment, @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pTimingInfo(segment, 0L, value); }
    /// Sets `pTimingInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pTimingInfo(@CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pTimingInfo(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1SequenceHeader].
    public static final class Buffer extends StdVideoAV1SequenceHeader {
        private final long elementCount;

        /// Creates `StdVideoAV1SequenceHeader.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1SequenceHeader`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1SequenceHeader`
        public StdVideoAV1SequenceHeader asSlice(long index) { return new StdVideoAV1SequenceHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1SequenceHeader`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1SequenceHeader`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1SequenceHeader.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoAV1SequenceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_flags(this.segment(), index, value); return this; }

        /// {@return `seq_profile` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1Profile") int seq_profileAt(long index) { return StdVideoAV1SequenceHeader.get_seq_profile(this.segment(), index); }
        /// Sets `seq_profile` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_profileAt(long index, @CType("StdVideoAV1Profile") int value) { StdVideoAV1SequenceHeader.set_seq_profile(this.segment(), index, value); return this; }

        /// {@return `frame_width_bits_minus_1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte frame_width_bits_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_frame_width_bits_minus_1(this.segment(), index); }
        /// Sets `frame_width_bits_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_width_bits_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_width_bits_minus_1(this.segment(), index, value); return this; }

        /// {@return `frame_height_bits_minus_1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte frame_height_bits_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_frame_height_bits_minus_1(this.segment(), index); }
        /// Sets `frame_height_bits_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_height_bits_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_frame_height_bits_minus_1(this.segment(), index, value); return this; }

        /// {@return `max_frame_width_minus_1` at the given index}
        /// @param index the index
        public @CType("uint16_t") short max_frame_width_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_max_frame_width_minus_1(this.segment(), index); }
        /// Sets `max_frame_width_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_frame_width_minus_1At(long index, @CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_width_minus_1(this.segment(), index, value); return this; }

        /// {@return `max_frame_height_minus_1` at the given index}
        /// @param index the index
        public @CType("uint16_t") short max_frame_height_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_max_frame_height_minus_1(this.segment(), index); }
        /// Sets `max_frame_height_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_frame_height_minus_1At(long index, @CType("uint16_t") short value) { StdVideoAV1SequenceHeader.set_max_frame_height_minus_1(this.segment(), index, value); return this; }

        /// {@return `delta_frame_id_length_minus_2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte delta_frame_id_length_minus_2At(long index) { return StdVideoAV1SequenceHeader.get_delta_frame_id_length_minus_2(this.segment(), index); }
        /// Sets `delta_frame_id_length_minus_2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_frame_id_length_minus_2At(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_delta_frame_id_length_minus_2(this.segment(), index, value); return this; }

        /// {@return `additional_frame_id_length_minus_1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte additional_frame_id_length_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_additional_frame_id_length_minus_1(this.segment(), index); }
        /// Sets `additional_frame_id_length_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer additional_frame_id_length_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_additional_frame_id_length_minus_1(this.segment(), index, value); return this; }

        /// {@return `order_hint_bits_minus_1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte order_hint_bits_minus_1At(long index) { return StdVideoAV1SequenceHeader.get_order_hint_bits_minus_1(this.segment(), index); }
        /// Sets `order_hint_bits_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer order_hint_bits_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_order_hint_bits_minus_1(this.segment(), index, value); return this; }

        /// {@return `seq_force_integer_mv` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_force_integer_mvAt(long index) { return StdVideoAV1SequenceHeader.get_seq_force_integer_mv(this.segment(), index); }
        /// Sets `seq_force_integer_mv` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_force_integer_mvAt(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_integer_mv(this.segment(), index, value); return this; }

        /// {@return `seq_force_screen_content_tools` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_force_screen_content_toolsAt(long index) { return StdVideoAV1SequenceHeader.get_seq_force_screen_content_tools(this.segment(), index); }
        /// Sets `seq_force_screen_content_tools` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_force_screen_content_toolsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1SequenceHeader.set_seq_force_screen_content_tools(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t [5]") byte reserved1At(long index) { return StdVideoAV1SequenceHeader.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t [5]") byte value) { StdVideoAV1SequenceHeader.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pColorConfig` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment pColorConfigAt(long index) { return StdVideoAV1SequenceHeader.get_pColorConfig(this.segment(), index); }
        /// Sets `pColorConfig` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorConfigAt(long index, @CType("const StdVideoAV1ColorConfig *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pColorConfig(this.segment(), index, value); return this; }

        /// {@return `pTimingInfo` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment pTimingInfoAt(long index) { return StdVideoAV1SequenceHeader.get_pTimingInfo(this.segment(), index); }
        /// Sets `pTimingInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTimingInfoAt(long index, @CType("const StdVideoAV1TimingInfo *") java.lang.foreign.MemorySegment value) { StdVideoAV1SequenceHeader.set_pTimingInfo(this.segment(), index, value); return this; }

    }
}
