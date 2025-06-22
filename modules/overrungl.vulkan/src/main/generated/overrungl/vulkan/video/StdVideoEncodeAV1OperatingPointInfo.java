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
import java.util.function.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeAV1OperatingPointInfo {
///     (struct StdVideoEncodeAV1OperatingPointInfoFlags) StdVideoEncodeAV1OperatingPointInfoFlags flags;
///     uint16_t operating_point_idc;
///     uint8_t seq_level_idx;
///     uint8_t seq_tier;
///     uint32_t decoder_buffer_delay;
///     uint32_t encoder_buffer_delay;
///     uint8_t initial_display_delay_minus_1;
/// };
/// ```
public sealed class StdVideoEncodeAV1OperatingPointInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1OperatingPointInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("operating_point_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_level_idx"),
        ValueLayout.JAVA_BYTE.withName("seq_tier"),
        ValueLayout.JAVA_INT.withName("decoder_buffer_delay"),
        ValueLayout.JAVA_INT.withName("encoder_buffer_delay"),
        ValueLayout.JAVA_BYTE.withName("initial_display_delay_minus_1")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `operating_point_idc`.
    public static final long OFFSET_operating_point_idc = LAYOUT.byteOffset(PathElement.groupElement("operating_point_idc"));
    /// The memory layout of `operating_point_idc`.
    public static final MemoryLayout LAYOUT_operating_point_idc = LAYOUT.select(PathElement.groupElement("operating_point_idc"));
    /// The [VarHandle] of `operating_point_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_operating_point_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operating_point_idc"));
    /// The byte offset of `seq_level_idx`.
    public static final long OFFSET_seq_level_idx = LAYOUT.byteOffset(PathElement.groupElement("seq_level_idx"));
    /// The memory layout of `seq_level_idx`.
    public static final MemoryLayout LAYOUT_seq_level_idx = LAYOUT.select(PathElement.groupElement("seq_level_idx"));
    /// The [VarHandle] of `seq_level_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_level_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_level_idx"));
    /// The byte offset of `seq_tier`.
    public static final long OFFSET_seq_tier = LAYOUT.byteOffset(PathElement.groupElement("seq_tier"));
    /// The memory layout of `seq_tier`.
    public static final MemoryLayout LAYOUT_seq_tier = LAYOUT.select(PathElement.groupElement("seq_tier"));
    /// The [VarHandle] of `seq_tier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_tier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_tier"));
    /// The byte offset of `decoder_buffer_delay`.
    public static final long OFFSET_decoder_buffer_delay = LAYOUT.byteOffset(PathElement.groupElement("decoder_buffer_delay"));
    /// The memory layout of `decoder_buffer_delay`.
    public static final MemoryLayout LAYOUT_decoder_buffer_delay = LAYOUT.select(PathElement.groupElement("decoder_buffer_delay"));
    /// The [VarHandle] of `decoder_buffer_delay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_decoder_buffer_delay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decoder_buffer_delay"));
    /// The byte offset of `encoder_buffer_delay`.
    public static final long OFFSET_encoder_buffer_delay = LAYOUT.byteOffset(PathElement.groupElement("encoder_buffer_delay"));
    /// The memory layout of `encoder_buffer_delay`.
    public static final MemoryLayout LAYOUT_encoder_buffer_delay = LAYOUT.select(PathElement.groupElement("encoder_buffer_delay"));
    /// The [VarHandle] of `encoder_buffer_delay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_encoder_buffer_delay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("encoder_buffer_delay"));
    /// The byte offset of `initial_display_delay_minus_1`.
    public static final long OFFSET_initial_display_delay_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("initial_display_delay_minus_1"));
    /// The memory layout of `initial_display_delay_minus_1`.
    public static final MemoryLayout LAYOUT_initial_display_delay_minus_1 = LAYOUT.select(PathElement.groupElement("initial_display_delay_minus_1"));
    /// The [VarHandle] of `initial_display_delay_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initial_display_delay_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_display_delay_minus_1"));

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1OperatingPointInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1OperatingPointInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @param seq_level_idx `seq_level_idx`
    /// @param seq_tier `seq_tier`
    /// @param decoder_buffer_delay `decoder_buffer_delay`
    /// @param encoder_buffer_delay `encoder_buffer_delay`
    /// @param initial_display_delay_minus_1 `initial_display_delay_minus_1`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc, byte seq_level_idx, byte seq_tier, int decoder_buffer_delay, int encoder_buffer_delay, byte initial_display_delay_minus_1) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx).seq_tier(seq_tier).decoder_buffer_delay(decoder_buffer_delay).encoder_buffer_delay(encoder_buffer_delay).initial_display_delay_minus_1(initial_display_delay_minus_1);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @param seq_level_idx `seq_level_idx`
    /// @param seq_tier `seq_tier`
    /// @param decoder_buffer_delay `decoder_buffer_delay`
    /// @param encoder_buffer_delay `encoder_buffer_delay`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc, byte seq_level_idx, byte seq_tier, int decoder_buffer_delay, int encoder_buffer_delay) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx).seq_tier(seq_tier).decoder_buffer_delay(decoder_buffer_delay).encoder_buffer_delay(encoder_buffer_delay);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @param seq_level_idx `seq_level_idx`
    /// @param seq_tier `seq_tier`
    /// @param decoder_buffer_delay `decoder_buffer_delay`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc, byte seq_level_idx, byte seq_tier, int decoder_buffer_delay) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx).seq_tier(seq_tier).decoder_buffer_delay(decoder_buffer_delay);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @param seq_level_idx `seq_level_idx`
    /// @param seq_tier `seq_tier`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc, byte seq_level_idx, byte seq_tier) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx).seq_tier(seq_tier);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @param seq_level_idx `seq_level_idx`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc, byte seq_level_idx) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc).seq_level_idx(seq_level_idx);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param operating_point_idc `operating_point_idc`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags, short operating_point_idc) {
        return alloc(allocator).flags(flags).operating_point_idc(operating_point_idc);
    }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfo`
    public static StdVideoEncodeAV1OperatingPointInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo copyFrom(StdVideoEncodeAV1OperatingPointInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoEncodeAV1OperatingPointInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeAV1OperatingPointInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeAV1OperatingPointInfoFlags.of(flags())); return this; }

    /// {@return `operating_point_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short operating_point_idc(MemorySegment segment, long index) { return (short) VH_operating_point_idc.get(segment, 0L, index); }
    /// {@return `operating_point_idc`}
    public short operating_point_idc() { return operating_point_idc(this.segment(), 0L); }
    /// Sets `operating_point_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void operating_point_idc(MemorySegment segment, long index, short value) { VH_operating_point_idc.set(segment, 0L, index, value); }
    /// Sets `operating_point_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo operating_point_idc(short value) { operating_point_idc(this.segment(), 0L, value); return this; }

    /// {@return `seq_level_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_level_idx(MemorySegment segment, long index) { return (byte) VH_seq_level_idx.get(segment, 0L, index); }
    /// {@return `seq_level_idx`}
    public byte seq_level_idx() { return seq_level_idx(this.segment(), 0L); }
    /// Sets `seq_level_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_level_idx(MemorySegment segment, long index, byte value) { VH_seq_level_idx.set(segment, 0L, index, value); }
    /// Sets `seq_level_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo seq_level_idx(byte value) { seq_level_idx(this.segment(), 0L, value); return this; }

    /// {@return `seq_tier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_tier(MemorySegment segment, long index) { return (byte) VH_seq_tier.get(segment, 0L, index); }
    /// {@return `seq_tier`}
    public byte seq_tier() { return seq_tier(this.segment(), 0L); }
    /// Sets `seq_tier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_tier(MemorySegment segment, long index, byte value) { VH_seq_tier.set(segment, 0L, index, value); }
    /// Sets `seq_tier` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo seq_tier(byte value) { seq_tier(this.segment(), 0L, value); return this; }

    /// {@return `decoder_buffer_delay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int decoder_buffer_delay(MemorySegment segment, long index) { return (int) VH_decoder_buffer_delay.get(segment, 0L, index); }
    /// {@return `decoder_buffer_delay`}
    public int decoder_buffer_delay() { return decoder_buffer_delay(this.segment(), 0L); }
    /// Sets `decoder_buffer_delay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void decoder_buffer_delay(MemorySegment segment, long index, int value) { VH_decoder_buffer_delay.set(segment, 0L, index, value); }
    /// Sets `decoder_buffer_delay` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo decoder_buffer_delay(int value) { decoder_buffer_delay(this.segment(), 0L, value); return this; }

    /// {@return `encoder_buffer_delay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int encoder_buffer_delay(MemorySegment segment, long index) { return (int) VH_encoder_buffer_delay.get(segment, 0L, index); }
    /// {@return `encoder_buffer_delay`}
    public int encoder_buffer_delay() { return encoder_buffer_delay(this.segment(), 0L); }
    /// Sets `encoder_buffer_delay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void encoder_buffer_delay(MemorySegment segment, long index, int value) { VH_encoder_buffer_delay.set(segment, 0L, index, value); }
    /// Sets `encoder_buffer_delay` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo encoder_buffer_delay(int value) { encoder_buffer_delay(this.segment(), 0L, value); return this; }

    /// {@return `initial_display_delay_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte initial_display_delay_minus_1(MemorySegment segment, long index) { return (byte) VH_initial_display_delay_minus_1.get(segment, 0L, index); }
    /// {@return `initial_display_delay_minus_1`}
    public byte initial_display_delay_minus_1() { return initial_display_delay_minus_1(this.segment(), 0L); }
    /// Sets `initial_display_delay_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initial_display_delay_minus_1(MemorySegment segment, long index, byte value) { VH_initial_display_delay_minus_1.set(segment, 0L, index, value); }
    /// Sets `initial_display_delay_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfo initial_display_delay_minus_1(byte value) { initial_display_delay_minus_1(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
        /// Accepts `flags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeAV1OperatingPointInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeAV1OperatingPointInfoFlags.of(flagsAt(index))); return this; }

        /// {@return `operating_point_idc` at the given index}
        /// @param index the index of the struct buffer
        public short operating_point_idcAt(long index) { return operating_point_idc(this.segment(), index); }
        /// Sets `operating_point_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer operating_point_idcAt(long index, short value) { operating_point_idc(this.segment(), index, value); return this; }

        /// {@return `seq_level_idx` at the given index}
        /// @param index the index of the struct buffer
        public byte seq_level_idxAt(long index) { return seq_level_idx(this.segment(), index); }
        /// Sets `seq_level_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer seq_level_idxAt(long index, byte value) { seq_level_idx(this.segment(), index, value); return this; }

        /// {@return `seq_tier` at the given index}
        /// @param index the index of the struct buffer
        public byte seq_tierAt(long index) { return seq_tier(this.segment(), index); }
        /// Sets `seq_tier` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer seq_tierAt(long index, byte value) { seq_tier(this.segment(), index, value); return this; }

        /// {@return `decoder_buffer_delay` at the given index}
        /// @param index the index of the struct buffer
        public int decoder_buffer_delayAt(long index) { return decoder_buffer_delay(this.segment(), index); }
        /// Sets `decoder_buffer_delay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer decoder_buffer_delayAt(long index, int value) { decoder_buffer_delay(this.segment(), index, value); return this; }

        /// {@return `encoder_buffer_delay` at the given index}
        /// @param index the index of the struct buffer
        public int encoder_buffer_delayAt(long index) { return encoder_buffer_delay(this.segment(), index); }
        /// Sets `encoder_buffer_delay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer encoder_buffer_delayAt(long index, int value) { encoder_buffer_delay(this.segment(), index, value); return this; }

        /// {@return `initial_display_delay_minus_1` at the given index}
        /// @param index the index of the struct buffer
        public byte initial_display_delay_minus_1At(long index) { return initial_display_delay_minus_1(this.segment(), index); }
        /// Sets `initial_display_delay_minus_1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer initial_display_delay_minus_1At(long index, byte value) { initial_display_delay_minus_1(this.segment(), index, value); return this; }

    }
}
