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
/// ### num_units_in_display_tick
/// [VarHandle][#VH_num_units_in_display_tick] - [Getter][#num_units_in_display_tick()] - [Setter][#num_units_in_display_tick(int)]
/// ### time_scale
/// [VarHandle][#VH_time_scale] - [Getter][#time_scale()] - [Setter][#time_scale(int)]
/// ### num_ticks_per_picture_minus_1
/// [VarHandle][#VH_num_ticks_per_picture_minus_1] - [Getter][#num_ticks_per_picture_minus_1()] - [Setter][#num_ticks_per_picture_minus_1(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1TimingInfo {
///     StdVideoAV1TimingInfoFlags flags;
///     uint32_t num_units_in_display_tick;
///     uint32_t time_scale;
///     uint32_t num_ticks_per_picture_minus_1;
/// } StdVideoAV1TimingInfo;
/// ```
public sealed class StdVideoAV1TimingInfo extends Struct {
    /// The struct layout of `StdVideoAV1TimingInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1TimingInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("num_units_in_display_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_INT.withName("num_ticks_per_picture_minus_1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `num_units_in_display_tick` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_units_in_display_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_display_tick"));
    /// The [VarHandle] of `time_scale` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_scale"));
    /// The [VarHandle] of `num_ticks_per_picture_minus_1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_ticks_per_picture_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ticks_per_picture_minus_1"));

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1TimingInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TimingInfo(segment); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TimingInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo alloc(SegmentAllocator allocator) { return new StdVideoAV1TimingInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo allocInit(SegmentAllocator allocator, @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment flags, @CType("uint32_t") int num_units_in_display_tick, @CType("uint32_t") int time_scale, @CType("uint32_t") int num_ticks_per_picture_minus_1) { return alloc(allocator).flags(flags).num_units_in_display_tick(num_units_in_display_tick).time_scale(time_scale).num_ticks_per_picture_minus_1(num_ticks_per_picture_minus_1); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TimingInfo copyFrom(StdVideoAV1TimingInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1TimingInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1TimingInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TimingInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo flags(@CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TimingInfo.set_flags(this.segment(), value); return this; }

    /// {@return `num_units_in_display_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_num_units_in_display_tick(MemorySegment segment, long index) { return (int) VH_num_units_in_display_tick.get(segment, 0L, index); }
    /// {@return `num_units_in_display_tick`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_num_units_in_display_tick(MemorySegment segment) { return StdVideoAV1TimingInfo.get_num_units_in_display_tick(segment, 0L); }
    /// {@return `num_units_in_display_tick`}
    public @CType("uint32_t") int num_units_in_display_tick() { return StdVideoAV1TimingInfo.get_num_units_in_display_tick(this.segment()); }
    /// Sets `num_units_in_display_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_units_in_display_tick(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_num_units_in_display_tick.set(segment, 0L, index, value); }
    /// Sets `num_units_in_display_tick` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_units_in_display_tick(MemorySegment segment, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_units_in_display_tick(segment, 0L, value); }
    /// Sets `num_units_in_display_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_units_in_display_tick(@CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_units_in_display_tick(this.segment(), value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_time_scale(MemorySegment segment, long index) { return (int) VH_time_scale.get(segment, 0L, index); }
    /// {@return `time_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_time_scale(MemorySegment segment) { return StdVideoAV1TimingInfo.get_time_scale(segment, 0L); }
    /// {@return `time_scale`}
    public @CType("uint32_t") int time_scale() { return StdVideoAV1TimingInfo.get_time_scale(this.segment()); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_time_scale(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_time_scale.set(segment, 0L, index, value); }
    /// Sets `time_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_time_scale(MemorySegment segment, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_time_scale(segment, 0L, value); }
    /// Sets `time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo time_scale(@CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_time_scale(this.segment(), value); return this; }

    /// {@return `num_ticks_per_picture_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_num_ticks_per_picture_minus_1(MemorySegment segment, long index) { return (int) VH_num_ticks_per_picture_minus_1.get(segment, 0L, index); }
    /// {@return `num_ticks_per_picture_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_num_ticks_per_picture_minus_1(MemorySegment segment) { return StdVideoAV1TimingInfo.get_num_ticks_per_picture_minus_1(segment, 0L); }
    /// {@return `num_ticks_per_picture_minus_1`}
    public @CType("uint32_t") int num_ticks_per_picture_minus_1() { return StdVideoAV1TimingInfo.get_num_ticks_per_picture_minus_1(this.segment()); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ticks_per_picture_minus_1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_num_ticks_per_picture_minus_1.set(segment, 0L, index, value); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ticks_per_picture_minus_1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_ticks_per_picture_minus_1(segment, 0L, value); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1(@CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_ticks_per_picture_minus_1(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1TimingInfo].
    public static final class Buffer extends StdVideoAV1TimingInfo {
        private final long elementCount;

        /// Creates `StdVideoAV1TimingInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1TimingInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1TimingInfo`
        public StdVideoAV1TimingInfo asSlice(long index) { return new StdVideoAV1TimingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1TimingInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1TimingInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1TimingInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoAV1TimingInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TimingInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `num_units_in_display_tick` at the given index}
        /// @param index the index
        public @CType("uint32_t") int num_units_in_display_tickAt(long index) { return StdVideoAV1TimingInfo.get_num_units_in_display_tick(this.segment(), index); }
        /// Sets `num_units_in_display_tick` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_units_in_display_tickAt(long index, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_units_in_display_tick(this.segment(), index, value); return this; }

        /// {@return `time_scale` at the given index}
        /// @param index the index
        public @CType("uint32_t") int time_scaleAt(long index) { return StdVideoAV1TimingInfo.get_time_scale(this.segment(), index); }
        /// Sets `time_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer time_scaleAt(long index, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_time_scale(this.segment(), index, value); return this; }

        /// {@return `num_ticks_per_picture_minus_1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int num_ticks_per_picture_minus_1At(long index) { return StdVideoAV1TimingInfo.get_num_ticks_per_picture_minus_1(this.segment(), index); }
        /// Sets `num_ticks_per_picture_minus_1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_ticks_per_picture_minus_1At(long index, @CType("uint32_t") int value) { StdVideoAV1TimingInfo.set_num_ticks_per_picture_minus_1(this.segment(), index, value); return this; }

    }
}
