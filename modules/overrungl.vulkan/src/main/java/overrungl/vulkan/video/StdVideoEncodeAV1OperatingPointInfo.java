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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### operating_point_idc
/// [VarHandle][#VH_operating_point_idc] - [Getter][#operating_point_idc()] - [Setter][#operating_point_idc(short)]
/// ### seq_level_idx
/// [VarHandle][#VH_seq_level_idx] - [Getter][#seq_level_idx()] - [Setter][#seq_level_idx(byte)]
/// ### seq_tier
/// [VarHandle][#VH_seq_tier] - [Getter][#seq_tier()] - [Setter][#seq_tier(byte)]
/// ### decoder_buffer_delay
/// [VarHandle][#VH_decoder_buffer_delay] - [Getter][#decoder_buffer_delay()] - [Setter][#decoder_buffer_delay(int)]
/// ### encoder_buffer_delay
/// [VarHandle][#VH_encoder_buffer_delay] - [Getter][#encoder_buffer_delay()] - [Setter][#encoder_buffer_delay(int)]
/// ### initial_display_delay_minus_1
/// [VarHandle][#VH_initial_display_delay_minus_1] - [Getter][#initial_display_delay_minus_1()] - [Setter][#initial_display_delay_minus_1(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1OperatingPointInfo {
///     StdVideoEncodeAV1OperatingPointInfoFlags flags;
///     uint16_t operating_point_idc;
///     uint8_t seq_level_idx;
///     uint8_t seq_tier;
///     uint32_t decoder_buffer_delay;
///     uint32_t encoder_buffer_delay;
///     uint8_t initial_display_delay_minus_1;
/// } StdVideoEncodeAV1OperatingPointInfo;
/// ```
public sealed class StdVideoEncodeAV1OperatingPointInfo extends Struct {
    /// The struct layout of `StdVideoEncodeAV1OperatingPointInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("operating_point_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_level_idx"),
        ValueLayout.JAVA_BYTE.withName("seq_tier"),
        ValueLayout.JAVA_INT.withName("decoder_buffer_delay"),
        ValueLayout.JAVA_INT.withName("encoder_buffer_delay"),
        ValueLayout.JAVA_BYTE.withName("initial_display_delay_minus_1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `operating_point_idc` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_operating_point_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operating_point_idc"));
    /// The [VarHandle] of `seq_level_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_level_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_level_idx"));
    /// The [VarHandle] of `seq_tier` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_tier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_tier"));
    /// The [VarHandle] of `decoder_buffer_delay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_decoder_buffer_delay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decoder_buffer_delay"));
    /// The [VarHandle] of `encoder_buffer_delay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_encoder_buffer_delay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("encoder_buffer_delay"));
    /// The [VarHandle] of `initial_display_delay_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_initial_display_delay_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_display_delay_minus_1"));

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1OperatingPointInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfo(segment); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1OperatingPointInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment flags, @CType("uint16_t") short operating_point_idc, @CType("uint8_t") byte seq_level_idx, @CType("uint8_t") byte seq_tier, @CType("uint32_t") int decoder_buffer_delay, @CType("uint32_t") int encoder_buffer_delay, @CType("uint8_t") byte initial_display_delay_minus_1) { return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx).seq_tier(seq_tier).decoder_buffer_delay(decoder_buffer_delay).encoder_buffer_delay(encoder_buffer_delay).initial_display_delay_minus_1(initial_display_delay_minus_1); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo copyFrom(StdVideoEncodeAV1OperatingPointInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment flags() { return StdVideoEncodeAV1OperatingPointInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment value) { StdVideoEncodeAV1OperatingPointInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo flags(@CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment value) { StdVideoEncodeAV1OperatingPointInfo.set_flags(this.segment(), value); return this; }

    /// {@return `operating_point_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_operating_point_idc(MemorySegment segment, long index) { return (short) VH_operating_point_idc.get(segment, 0L, index); }
    /// {@return `operating_point_idc`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_operating_point_idc(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_operating_point_idc(segment, 0L); }
    /// {@return `operating_point_idc`}
    public @CType("uint16_t") short operating_point_idc() { return StdVideoEncodeAV1OperatingPointInfo.get_operating_point_idc(this.segment()); }
    /// Sets `operating_point_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_operating_point_idc(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_operating_point_idc.set(segment, 0L, index, value); }
    /// Sets `operating_point_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_operating_point_idc(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeAV1OperatingPointInfo.set_operating_point_idc(segment, 0L, value); }
    /// Sets `operating_point_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo operating_point_idc(@CType("uint16_t") short value) { StdVideoEncodeAV1OperatingPointInfo.set_operating_point_idc(this.segment(), value); return this; }

    /// {@return `seq_level_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_level_idx(MemorySegment segment, long index) { return (byte) VH_seq_level_idx.get(segment, 0L, index); }
    /// {@return `seq_level_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_level_idx(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_seq_level_idx(segment, 0L); }
    /// {@return `seq_level_idx`}
    public @CType("uint8_t") byte seq_level_idx() { return StdVideoEncodeAV1OperatingPointInfo.get_seq_level_idx(this.segment()); }
    /// Sets `seq_level_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_level_idx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_level_idx.set(segment, 0L, index, value); }
    /// Sets `seq_level_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_level_idx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_level_idx(segment, 0L, value); }
    /// Sets `seq_level_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo seq_level_idx(@CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_level_idx(this.segment(), value); return this; }

    /// {@return `seq_tier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_tier(MemorySegment segment, long index) { return (byte) VH_seq_tier.get(segment, 0L, index); }
    /// {@return `seq_tier`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_tier(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_seq_tier(segment, 0L); }
    /// {@return `seq_tier`}
    public @CType("uint8_t") byte seq_tier() { return StdVideoEncodeAV1OperatingPointInfo.get_seq_tier(this.segment()); }
    /// Sets `seq_tier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_tier(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_tier.set(segment, 0L, index, value); }
    /// Sets `seq_tier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_tier(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_tier(segment, 0L, value); }
    /// Sets `seq_tier` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo seq_tier(@CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_tier(this.segment(), value); return this; }

    /// {@return `decoder_buffer_delay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_decoder_buffer_delay(MemorySegment segment, long index) { return (int) VH_decoder_buffer_delay.get(segment, 0L, index); }
    /// {@return `decoder_buffer_delay`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_decoder_buffer_delay(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_decoder_buffer_delay(segment, 0L); }
    /// {@return `decoder_buffer_delay`}
    public @CType("uint32_t") int decoder_buffer_delay() { return StdVideoEncodeAV1OperatingPointInfo.get_decoder_buffer_delay(this.segment()); }
    /// Sets `decoder_buffer_delay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decoder_buffer_delay(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_decoder_buffer_delay.set(segment, 0L, index, value); }
    /// Sets `decoder_buffer_delay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decoder_buffer_delay(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_decoder_buffer_delay(segment, 0L, value); }
    /// Sets `decoder_buffer_delay` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo decoder_buffer_delay(@CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_decoder_buffer_delay(this.segment(), value); return this; }

    /// {@return `encoder_buffer_delay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_encoder_buffer_delay(MemorySegment segment, long index) { return (int) VH_encoder_buffer_delay.get(segment, 0L, index); }
    /// {@return `encoder_buffer_delay`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_encoder_buffer_delay(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_encoder_buffer_delay(segment, 0L); }
    /// {@return `encoder_buffer_delay`}
    public @CType("uint32_t") int encoder_buffer_delay() { return StdVideoEncodeAV1OperatingPointInfo.get_encoder_buffer_delay(this.segment()); }
    /// Sets `encoder_buffer_delay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_encoder_buffer_delay(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_encoder_buffer_delay.set(segment, 0L, index, value); }
    /// Sets `encoder_buffer_delay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_encoder_buffer_delay(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_encoder_buffer_delay(segment, 0L, value); }
    /// Sets `encoder_buffer_delay` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo encoder_buffer_delay(@CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_encoder_buffer_delay(this.segment(), value); return this; }

    /// {@return `initial_display_delay_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_initial_display_delay_minus_1(MemorySegment segment, long index) { return (byte) VH_initial_display_delay_minus_1.get(segment, 0L, index); }
    /// {@return `initial_display_delay_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_initial_display_delay_minus_1(MemorySegment segment) { return StdVideoEncodeAV1OperatingPointInfo.get_initial_display_delay_minus_1(segment, 0L); }
    /// {@return `initial_display_delay_minus_1`}
    public @CType("uint8_t") byte initial_display_delay_minus_1() { return StdVideoEncodeAV1OperatingPointInfo.get_initial_display_delay_minus_1(this.segment()); }
    /// Sets `initial_display_delay_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initial_display_delay_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_initial_display_delay_minus_1.set(segment, 0L, index, value); }
    /// Sets `initial_display_delay_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initial_display_delay_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_initial_display_delay_minus_1(segment, 0L, value); }
    /// Sets `initial_display_delay_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo initial_display_delay_minus_1(@CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_initial_display_delay_minus_1(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeAV1OperatingPointInfo].
    public static final class Buffer extends StdVideoEncodeAV1OperatingPointInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeAV1OperatingPointInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeAV1OperatingPointInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeAV1OperatingPointInfo`
        public StdVideoEncodeAV1OperatingPointInfo asSlice(long index) { return new StdVideoEncodeAV1OperatingPointInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeAV1OperatingPointInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeAV1OperatingPointInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment flagsAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeAV1OperatingPointInfoFlags") MemorySegment value) { StdVideoEncodeAV1OperatingPointInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `operating_point_idc` at the given index}
        /// @param index the index
        public @CType("uint16_t") short operating_point_idcAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_operating_point_idc(this.segment(), index); }
        /// Sets `operating_point_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer operating_point_idcAt(long index, @CType("uint16_t") short value) { StdVideoEncodeAV1OperatingPointInfo.set_operating_point_idc(this.segment(), index, value); return this; }

        /// {@return `seq_level_idx` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_level_idxAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_seq_level_idx(this.segment(), index); }
        /// Sets `seq_level_idx` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_level_idxAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_level_idx(this.segment(), index, value); return this; }

        /// {@return `seq_tier` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_tierAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_seq_tier(this.segment(), index); }
        /// Sets `seq_tier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_tierAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_seq_tier(this.segment(), index, value); return this; }

        /// {@return `decoder_buffer_delay` at the given index}
        /// @param index the index
        public @CType("uint32_t") int decoder_buffer_delayAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_decoder_buffer_delay(this.segment(), index); }
        /// Sets `decoder_buffer_delay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer decoder_buffer_delayAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_decoder_buffer_delay(this.segment(), index, value); return this; }

        /// {@return `encoder_buffer_delay` at the given index}
        /// @param index the index
        public @CType("uint32_t") int encoder_buffer_delayAt(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_encoder_buffer_delay(this.segment(), index); }
        /// Sets `encoder_buffer_delay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer encoder_buffer_delayAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.set_encoder_buffer_delay(this.segment(), index, value); return this; }

        /// {@return `initial_display_delay_minus_1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte initial_display_delay_minus_1At(long index) { return StdVideoEncodeAV1OperatingPointInfo.get_initial_display_delay_minus_1(this.segment(), index); }
        /// Sets `initial_display_delay_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer initial_display_delay_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.set_initial_display_delay_minus_1(this.segment(), index, value); return this; }

    }
}
