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
/// struct StdVideoAV1TimingInfo {
///     (struct StdVideoAV1TimingInfoFlags) StdVideoAV1TimingInfoFlags flags;
///     uint32_t num_units_in_display_tick;
///     uint32_t time_scale;
///     uint32_t num_ticks_per_picture_minus_1;
/// };
/// ```
public final class StdVideoAV1TimingInfo extends GroupType {
    /// The struct layout of `StdVideoAV1TimingInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1TimingInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("num_units_in_display_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_INT.withName("num_ticks_per_picture_minus_1")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `num_units_in_display_tick`.
    public static final long OFFSET_num_units_in_display_tick = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_display_tick"));
    /// The memory layout of `num_units_in_display_tick`.
    public static final MemoryLayout LAYOUT_num_units_in_display_tick = LAYOUT.select(PathElement.groupElement("num_units_in_display_tick"));
    /// The [VarHandle] of `num_units_in_display_tick` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_units_in_display_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_display_tick"));
    /// The byte offset of `time_scale`.
    public static final long OFFSET_time_scale = LAYOUT.byteOffset(PathElement.groupElement("time_scale"));
    /// The memory layout of `time_scale`.
    public static final MemoryLayout LAYOUT_time_scale = LAYOUT.select(PathElement.groupElement("time_scale"));
    /// The [VarHandle] of `time_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_scale"));
    /// The byte offset of `num_ticks_per_picture_minus_1`.
    public static final long OFFSET_num_ticks_per_picture_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("num_ticks_per_picture_minus_1"));
    /// The memory layout of `num_ticks_per_picture_minus_1`.
    public static final MemoryLayout LAYOUT_num_ticks_per_picture_minus_1 = LAYOUT.select(PathElement.groupElement("num_ticks_per_picture_minus_1"));
    /// The [VarHandle] of `num_ticks_per_picture_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ticks_per_picture_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ticks_per_picture_minus_1"));

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1TimingInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1TimingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo alloc(SegmentAllocator allocator) { return new StdVideoAV1TimingInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TimingInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param num_units_in_display_tick `num_units_in_display_tick`
    /// @param time_scale `time_scale`
    /// @param num_ticks_per_picture_minus_1 `num_ticks_per_picture_minus_1`
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int num_units_in_display_tick, int time_scale, int num_ticks_per_picture_minus_1) {
        return alloc(allocator).flags(flags).num_units_in_display_tick(num_units_in_display_tick).time_scale(time_scale).num_ticks_per_picture_minus_1(num_ticks_per_picture_minus_1);
    }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param num_units_in_display_tick `num_units_in_display_tick`
    /// @param time_scale `time_scale`
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int num_units_in_display_tick, int time_scale) {
        return alloc(allocator).flags(flags).num_units_in_display_tick(num_units_in_display_tick).time_scale(time_scale);
    }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param num_units_in_display_tick `num_units_in_display_tick`
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int num_units_in_display_tick) {
        return alloc(allocator).flags(flags).num_units_in_display_tick(num_units_in_display_tick);
    }

    /// Allocates a `StdVideoAV1TimingInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoAV1TimingInfo`
    public static StdVideoAV1TimingInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TimingInfo copyFrom(StdVideoAV1TimingInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1TimingInfo reinterpret(long count) { return new StdVideoAV1TimingInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoAV1TimingInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoAV1TimingInfo flags(Consumer<overrungl.vulkan.video.StdVideoAV1TimingInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1TimingInfoFlags.of(flags())); return this; }

    /// {@return `num_units_in_display_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int num_units_in_display_tick(MemorySegment segment, long index) { return (int) VH_num_units_in_display_tick.get(segment, 0L, index); }
    /// {@return `num_units_in_display_tick`}
    public int num_units_in_display_tick() { return num_units_in_display_tick(this.segment(), 0L); }
    /// Sets `num_units_in_display_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_units_in_display_tick(MemorySegment segment, long index, int value) { VH_num_units_in_display_tick.set(segment, 0L, index, value); }
    /// Sets `num_units_in_display_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_units_in_display_tick(int value) { num_units_in_display_tick(this.segment(), 0L, value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int time_scale(MemorySegment segment, long index) { return (int) VH_time_scale.get(segment, 0L, index); }
    /// {@return `time_scale`}
    public int time_scale() { return time_scale(this.segment(), 0L); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void time_scale(MemorySegment segment, long index, int value) { VH_time_scale.set(segment, 0L, index, value); }
    /// Sets `time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo time_scale(int value) { time_scale(this.segment(), 0L, value); return this; }

    /// {@return `num_ticks_per_picture_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int num_ticks_per_picture_minus_1(MemorySegment segment, long index) { return (int) VH_num_ticks_per_picture_minus_1.get(segment, 0L, index); }
    /// {@return `num_ticks_per_picture_minus_1`}
    public int num_ticks_per_picture_minus_1() { return num_ticks_per_picture_minus_1(this.segment(), 0L); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ticks_per_picture_minus_1(MemorySegment segment, long index, int value) { VH_num_ticks_per_picture_minus_1.set(segment, 0L, index, value); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1(int value) { num_ticks_per_picture_minus_1(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoAV1TimingInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1TimingInfo`
    public StdVideoAV1TimingInfo asSlice(long index) { return new StdVideoAV1TimingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1TimingInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1TimingInfo`
    public StdVideoAV1TimingInfo asSlice(long index, long count) { return new StdVideoAV1TimingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1TimingInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1TimingInfo at(long index, Consumer<StdVideoAV1TimingInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoAV1TimingInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoAV1TimingInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1TimingInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `num_units_in_display_tick` at the given index}
    /// @param index the index of the struct buffer
    public int num_units_in_display_tickAt(long index) { return num_units_in_display_tick(this.segment(), index); }
    /// Sets `num_units_in_display_tick` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_units_in_display_tickAt(long index, int value) { num_units_in_display_tick(this.segment(), index, value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param index the index of the struct buffer
    public int time_scaleAt(long index) { return time_scale(this.segment(), index); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo time_scaleAt(long index, int value) { time_scale(this.segment(), index, value); return this; }

    /// {@return `num_ticks_per_picture_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public int num_ticks_per_picture_minus_1At(long index) { return num_ticks_per_picture_minus_1(this.segment(), index); }
    /// Sets `num_ticks_per_picture_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1At(long index, int value) { num_ticks_per_picture_minus_1(this.segment(), index, value); return this; }

}
