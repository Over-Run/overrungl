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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1SequenceHeader`.
/// ## Layout
/// ```
/// struct StdVideoAV1SequenceHeader {
///     (struct StdVideoAV1SequenceHeaderFlags) StdVideoAV1SequenceHeaderFlags flags;
///     (int) StdVideoAV1Profile seq_profile;
///     uint8_t frame_width_bits_minus_1;
///     uint8_t frame_height_bits_minus_1;
///     uint16_t max_frame_width_minus_1;
///     uint16_t max_frame_height_minus_1;
///     uint8_t delta_frame_id_length_minus_2;
///     uint8_t additional_frame_id_length_minus_1;
///     uint8_t order_hint_bits_minus_1;
///     uint8_t seq_force_integer_mv;
///     uint8_t seq_force_screen_content_tools;
///     uint8_t reserved1[5];
///     const StdVideoAV1ColorConfig* pColorConfig;
///     const StdVideoAV1TimingInfo* pTimingInfo;
/// };
/// ```
public final class StdVideoAV1SequenceHeader extends GroupType {
    /// The struct layout of `StdVideoAV1SequenceHeader`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1SequenceHeaderFlags.LAYOUT.withName("flags"),
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
        MemoryLayout.sequenceLayout(5, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pColorConfig"),
        ValueLayout.ADDRESS.withName("pTimingInfo")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `seq_profile`.
    public static final long OFFSET_seq_profile = LAYOUT.byteOffset(PathElement.groupElement("seq_profile"));
    /// The memory layout of `seq_profile`.
    public static final MemoryLayout LAYOUT_seq_profile = LAYOUT.select(PathElement.groupElement("seq_profile"));
    /// The [VarHandle] of `seq_profile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_profile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_profile"));
    /// The byte offset of `frame_width_bits_minus_1`.
    public static final long OFFSET_frame_width_bits_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("frame_width_bits_minus_1"));
    /// The memory layout of `frame_width_bits_minus_1`.
    public static final MemoryLayout LAYOUT_frame_width_bits_minus_1 = LAYOUT.select(PathElement.groupElement("frame_width_bits_minus_1"));
    /// The [VarHandle] of `frame_width_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_width_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_width_bits_minus_1"));
    /// The byte offset of `frame_height_bits_minus_1`.
    public static final long OFFSET_frame_height_bits_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("frame_height_bits_minus_1"));
    /// The memory layout of `frame_height_bits_minus_1`.
    public static final MemoryLayout LAYOUT_frame_height_bits_minus_1 = LAYOUT.select(PathElement.groupElement("frame_height_bits_minus_1"));
    /// The [VarHandle] of `frame_height_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_height_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_height_bits_minus_1"));
    /// The byte offset of `max_frame_width_minus_1`.
    public static final long OFFSET_max_frame_width_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("max_frame_width_minus_1"));
    /// The memory layout of `max_frame_width_minus_1`.
    public static final MemoryLayout LAYOUT_max_frame_width_minus_1 = LAYOUT.select(PathElement.groupElement("max_frame_width_minus_1"));
    /// The [VarHandle] of `max_frame_width_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_frame_width_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_width_minus_1"));
    /// The byte offset of `max_frame_height_minus_1`.
    public static final long OFFSET_max_frame_height_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("max_frame_height_minus_1"));
    /// The memory layout of `max_frame_height_minus_1`.
    public static final MemoryLayout LAYOUT_max_frame_height_minus_1 = LAYOUT.select(PathElement.groupElement("max_frame_height_minus_1"));
    /// The [VarHandle] of `max_frame_height_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_frame_height_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_height_minus_1"));
    /// The byte offset of `delta_frame_id_length_minus_2`.
    public static final long OFFSET_delta_frame_id_length_minus_2 = LAYOUT.byteOffset(PathElement.groupElement("delta_frame_id_length_minus_2"));
    /// The memory layout of `delta_frame_id_length_minus_2`.
    public static final MemoryLayout LAYOUT_delta_frame_id_length_minus_2 = LAYOUT.select(PathElement.groupElement("delta_frame_id_length_minus_2"));
    /// The [VarHandle] of `delta_frame_id_length_minus_2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_frame_id_length_minus_2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_frame_id_length_minus_2"));
    /// The byte offset of `additional_frame_id_length_minus_1`.
    public static final long OFFSET_additional_frame_id_length_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("additional_frame_id_length_minus_1"));
    /// The memory layout of `additional_frame_id_length_minus_1`.
    public static final MemoryLayout LAYOUT_additional_frame_id_length_minus_1 = LAYOUT.select(PathElement.groupElement("additional_frame_id_length_minus_1"));
    /// The [VarHandle] of `additional_frame_id_length_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_additional_frame_id_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("additional_frame_id_length_minus_1"));
    /// The byte offset of `order_hint_bits_minus_1`.
    public static final long OFFSET_order_hint_bits_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("order_hint_bits_minus_1"));
    /// The memory layout of `order_hint_bits_minus_1`.
    public static final MemoryLayout LAYOUT_order_hint_bits_minus_1 = LAYOUT.select(PathElement.groupElement("order_hint_bits_minus_1"));
    /// The [VarHandle] of `order_hint_bits_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_order_hint_bits_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("order_hint_bits_minus_1"));
    /// The byte offset of `seq_force_integer_mv`.
    public static final long OFFSET_seq_force_integer_mv = LAYOUT.byteOffset(PathElement.groupElement("seq_force_integer_mv"));
    /// The memory layout of `seq_force_integer_mv`.
    public static final MemoryLayout LAYOUT_seq_force_integer_mv = LAYOUT.select(PathElement.groupElement("seq_force_integer_mv"));
    /// The [VarHandle] of `seq_force_integer_mv` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_force_integer_mv = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_force_integer_mv"));
    /// The byte offset of `seq_force_screen_content_tools`.
    public static final long OFFSET_seq_force_screen_content_tools = LAYOUT.byteOffset(PathElement.groupElement("seq_force_screen_content_tools"));
    /// The memory layout of `seq_force_screen_content_tools`.
    public static final MemoryLayout LAYOUT_seq_force_screen_content_tools = LAYOUT.select(PathElement.groupElement("seq_force_screen_content_tools"));
    /// The [VarHandle] of `seq_force_screen_content_tools` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_force_screen_content_tools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_force_screen_content_tools"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pColorConfig`.
    public static final long OFFSET_pColorConfig = LAYOUT.byteOffset(PathElement.groupElement("pColorConfig"));
    /// The memory layout of `pColorConfig`.
    public static final MemoryLayout LAYOUT_pColorConfig = LAYOUT.select(PathElement.groupElement("pColorConfig"));
    /// The [VarHandle] of `pColorConfig` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorConfig = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorConfig"));
    /// The byte offset of `pTimingInfo`.
    public static final long OFFSET_pTimingInfo = LAYOUT.byteOffset(PathElement.groupElement("pTimingInfo"));
    /// The memory layout of `pTimingInfo`.
    public static final MemoryLayout LAYOUT_pTimingInfo = LAYOUT.select(PathElement.groupElement("pTimingInfo"));
    /// The [VarHandle] of `pTimingInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTimingInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimingInfo"));

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1SequenceHeader(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeader of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeader(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeader(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1SequenceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeader ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeader(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1SequenceHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1SequenceHeader`
    public static StdVideoAV1SequenceHeader alloc(SegmentAllocator allocator) { return new StdVideoAV1SequenceHeader(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1SequenceHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1SequenceHeader`
    public static StdVideoAV1SequenceHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1SequenceHeader(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1SequenceHeader copyFrom(StdVideoAV1SequenceHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1SequenceHeader reinterpret(long count) { return new StdVideoAV1SequenceHeader(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoAV1SequenceHeader flags(Consumer<overrungl.vulkan.video.StdVideoAV1SequenceHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1SequenceHeaderFlags.of(flags())); return this; }

    /// {@return `seq_profile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int seq_profile(MemorySegment segment, long index) { return (int) VH_seq_profile.get(segment, 0L, index); }
    /// {@return `seq_profile`}
    public int seq_profile() { return seq_profile(this.segment(), 0L); }
    /// Sets `seq_profile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_profile(MemorySegment segment, long index, int value) { VH_seq_profile.set(segment, 0L, index, value); }
    /// Sets `seq_profile` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_profile(int value) { seq_profile(this.segment(), 0L, value); return this; }

    /// {@return `frame_width_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte frame_width_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_frame_width_bits_minus_1.get(segment, 0L, index); }
    /// {@return `frame_width_bits_minus_1`}
    public byte frame_width_bits_minus_1() { return frame_width_bits_minus_1(this.segment(), 0L); }
    /// Sets `frame_width_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_width_bits_minus_1(MemorySegment segment, long index, byte value) { VH_frame_width_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `frame_width_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_width_bits_minus_1(byte value) { frame_width_bits_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `frame_height_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte frame_height_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_frame_height_bits_minus_1.get(segment, 0L, index); }
    /// {@return `frame_height_bits_minus_1`}
    public byte frame_height_bits_minus_1() { return frame_height_bits_minus_1(this.segment(), 0L); }
    /// Sets `frame_height_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_height_bits_minus_1(MemorySegment segment, long index, byte value) { VH_frame_height_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `frame_height_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_height_bits_minus_1(byte value) { frame_height_bits_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `max_frame_width_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short max_frame_width_minus_1(MemorySegment segment, long index) { return (short) VH_max_frame_width_minus_1.get(segment, 0L, index); }
    /// {@return `max_frame_width_minus_1`}
    public short max_frame_width_minus_1() { return max_frame_width_minus_1(this.segment(), 0L); }
    /// Sets `max_frame_width_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_frame_width_minus_1(MemorySegment segment, long index, short value) { VH_max_frame_width_minus_1.set(segment, 0L, index, value); }
    /// Sets `max_frame_width_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_width_minus_1(short value) { max_frame_width_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `max_frame_height_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short max_frame_height_minus_1(MemorySegment segment, long index) { return (short) VH_max_frame_height_minus_1.get(segment, 0L, index); }
    /// {@return `max_frame_height_minus_1`}
    public short max_frame_height_minus_1() { return max_frame_height_minus_1(this.segment(), 0L); }
    /// Sets `max_frame_height_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_frame_height_minus_1(MemorySegment segment, long index, short value) { VH_max_frame_height_minus_1.set(segment, 0L, index, value); }
    /// Sets `max_frame_height_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_height_minus_1(short value) { max_frame_height_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `delta_frame_id_length_minus_2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_frame_id_length_minus_2(MemorySegment segment, long index) { return (byte) VH_delta_frame_id_length_minus_2.get(segment, 0L, index); }
    /// {@return `delta_frame_id_length_minus_2`}
    public byte delta_frame_id_length_minus_2() { return delta_frame_id_length_minus_2(this.segment(), 0L); }
    /// Sets `delta_frame_id_length_minus_2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_frame_id_length_minus_2(MemorySegment segment, long index, byte value) { VH_delta_frame_id_length_minus_2.set(segment, 0L, index, value); }
    /// Sets `delta_frame_id_length_minus_2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(byte value) { delta_frame_id_length_minus_2(this.segment(), 0L, value); return this; }

    /// {@return `additional_frame_id_length_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte additional_frame_id_length_minus_1(MemorySegment segment, long index) { return (byte) VH_additional_frame_id_length_minus_1.get(segment, 0L, index); }
    /// {@return `additional_frame_id_length_minus_1`}
    public byte additional_frame_id_length_minus_1() { return additional_frame_id_length_minus_1(this.segment(), 0L); }
    /// Sets `additional_frame_id_length_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void additional_frame_id_length_minus_1(MemorySegment segment, long index, byte value) { VH_additional_frame_id_length_minus_1.set(segment, 0L, index, value); }
    /// Sets `additional_frame_id_length_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(byte value) { additional_frame_id_length_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `order_hint_bits_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte order_hint_bits_minus_1(MemorySegment segment, long index) { return (byte) VH_order_hint_bits_minus_1.get(segment, 0L, index); }
    /// {@return `order_hint_bits_minus_1`}
    public byte order_hint_bits_minus_1() { return order_hint_bits_minus_1(this.segment(), 0L); }
    /// Sets `order_hint_bits_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void order_hint_bits_minus_1(MemorySegment segment, long index, byte value) { VH_order_hint_bits_minus_1.set(segment, 0L, index, value); }
    /// Sets `order_hint_bits_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader order_hint_bits_minus_1(byte value) { order_hint_bits_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `seq_force_integer_mv` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_force_integer_mv(MemorySegment segment, long index) { return (byte) VH_seq_force_integer_mv.get(segment, 0L, index); }
    /// {@return `seq_force_integer_mv`}
    public byte seq_force_integer_mv() { return seq_force_integer_mv(this.segment(), 0L); }
    /// Sets `seq_force_integer_mv` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_force_integer_mv(MemorySegment segment, long index, byte value) { VH_seq_force_integer_mv.set(segment, 0L, index, value); }
    /// Sets `seq_force_integer_mv` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_integer_mv(byte value) { seq_force_integer_mv(this.segment(), 0L, value); return this; }

    /// {@return `seq_force_screen_content_tools` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_force_screen_content_tools(MemorySegment segment, long index) { return (byte) VH_seq_force_screen_content_tools.get(segment, 0L, index); }
    /// {@return `seq_force_screen_content_tools`}
    public byte seq_force_screen_content_tools() { return seq_force_screen_content_tools(this.segment(), 0L); }
    /// Sets `seq_force_screen_content_tools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_force_screen_content_tools(MemorySegment segment, long index, byte value) { VH_seq_force_screen_content_tools.set(segment, 0L, index, value); }
    /// Sets `seq_force_screen_content_tools` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_screen_content_tools(byte value) { seq_force_screen_content_tools(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pColorConfig` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorConfig(MemorySegment segment, long index) { return (MemorySegment) VH_pColorConfig.get(segment, 0L, index); }
    /// {@return `pColorConfig`}
    public MemorySegment pColorConfig() { return pColorConfig(this.segment(), 0L); }
    /// Sets `pColorConfig` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorConfig(MemorySegment segment, long index, MemorySegment value) { VH_pColorConfig.set(segment, 0L, index, value); }
    /// Sets `pColorConfig` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pColorConfig(MemorySegment value) { pColorConfig(this.segment(), 0L, value); return this; }

    /// {@return `pTimingInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTimingInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pTimingInfo.get(segment, 0L, index); }
    /// {@return `pTimingInfo`}
    public MemorySegment pTimingInfo() { return pTimingInfo(this.segment(), 0L); }
    /// Sets `pTimingInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTimingInfo(MemorySegment segment, long index, MemorySegment value) { VH_pTimingInfo.set(segment, 0L, index, value); }
    /// Sets `pTimingInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pTimingInfo(MemorySegment value) { pTimingInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoAV1SequenceHeader`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1SequenceHeader`
    public StdVideoAV1SequenceHeader asSlice(long index) { return new StdVideoAV1SequenceHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1SequenceHeader`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1SequenceHeader`
    public StdVideoAV1SequenceHeader asSlice(long index, long count) { return new StdVideoAV1SequenceHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1SequenceHeader` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1SequenceHeader at(long index, Consumer<StdVideoAV1SequenceHeader> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoAV1SequenceHeader flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoAV1SequenceHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1SequenceHeaderFlags.of(flagsAt(index))); return this; }

    /// {@return `seq_profile` at the given index}
    /// @param index the index of the struct buffer
    public int seq_profileAt(long index) { return seq_profile(this.segment(), index); }
    /// Sets `seq_profile` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_profileAt(long index, int value) { seq_profile(this.segment(), index, value); return this; }

    /// {@return `frame_width_bits_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public byte frame_width_bits_minus_1At(long index) { return frame_width_bits_minus_1(this.segment(), index); }
    /// Sets `frame_width_bits_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_width_bits_minus_1At(long index, byte value) { frame_width_bits_minus_1(this.segment(), index, value); return this; }

    /// {@return `frame_height_bits_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public byte frame_height_bits_minus_1At(long index) { return frame_height_bits_minus_1(this.segment(), index); }
    /// Sets `frame_height_bits_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader frame_height_bits_minus_1At(long index, byte value) { frame_height_bits_minus_1(this.segment(), index, value); return this; }

    /// {@return `max_frame_width_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public short max_frame_width_minus_1At(long index) { return max_frame_width_minus_1(this.segment(), index); }
    /// Sets `max_frame_width_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_width_minus_1At(long index, short value) { max_frame_width_minus_1(this.segment(), index, value); return this; }

    /// {@return `max_frame_height_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public short max_frame_height_minus_1At(long index) { return max_frame_height_minus_1(this.segment(), index); }
    /// Sets `max_frame_height_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader max_frame_height_minus_1At(long index, short value) { max_frame_height_minus_1(this.segment(), index, value); return this; }

    /// {@return `delta_frame_id_length_minus_2` at the given index}
    /// @param index the index of the struct buffer
    public byte delta_frame_id_length_minus_2At(long index) { return delta_frame_id_length_minus_2(this.segment(), index); }
    /// Sets `delta_frame_id_length_minus_2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2At(long index, byte value) { delta_frame_id_length_minus_2(this.segment(), index, value); return this; }

    /// {@return `additional_frame_id_length_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public byte additional_frame_id_length_minus_1At(long index) { return additional_frame_id_length_minus_1(this.segment(), index); }
    /// Sets `additional_frame_id_length_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1At(long index, byte value) { additional_frame_id_length_minus_1(this.segment(), index, value); return this; }

    /// {@return `order_hint_bits_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public byte order_hint_bits_minus_1At(long index) { return order_hint_bits_minus_1(this.segment(), index); }
    /// Sets `order_hint_bits_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader order_hint_bits_minus_1At(long index, byte value) { order_hint_bits_minus_1(this.segment(), index, value); return this; }

    /// {@return `seq_force_integer_mv` at the given index}
    /// @param index the index of the struct buffer
    public byte seq_force_integer_mvAt(long index) { return seq_force_integer_mv(this.segment(), index); }
    /// Sets `seq_force_integer_mv` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_integer_mvAt(long index, byte value) { seq_force_integer_mv(this.segment(), index, value); return this; }

    /// {@return `seq_force_screen_content_tools` at the given index}
    /// @param index the index of the struct buffer
    public byte seq_force_screen_content_toolsAt(long index) { return seq_force_screen_content_tools(this.segment(), index); }
    /// Sets `seq_force_screen_content_tools` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader seq_force_screen_content_toolsAt(long index, byte value) { seq_force_screen_content_tools(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pColorConfig` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorConfigAt(long index) { return pColorConfig(this.segment(), index); }
    /// Sets `pColorConfig` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pColorConfigAt(long index, MemorySegment value) { pColorConfig(this.segment(), index, value); return this; }

    /// {@return `pTimingInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTimingInfoAt(long index) { return pTimingInfo(this.segment(), index); }
    /// Sets `pTimingInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeader pTimingInfoAt(long index, MemorySegment value) { pTimingInfo(this.segment(), index, value); return this; }

}
