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
/// ### equal_picture_interval
/// [VarHandle][#VH_equal_picture_interval] - [Getter][#equal_picture_interval()] - [Setter][#equal_picture_interval(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1TimingInfoFlags {
///     uint32_t : 1 equal_picture_interval;
///     uint32_t : 31 reserved;
/// } StdVideoAV1TimingInfoFlags;
/// ```
public final class StdVideoAV1TimingInfoFlags extends Struct {
    /// The struct layout of `StdVideoAV1TimingInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("equal_picture_interval"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `equal_picture_interval` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_equal_picture_interval = LAYOUT.arrayElementVarHandle(PathElement.groupElement("equal_picture_interval"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1TimingInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1TimingInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TimingInfoFlags`
    public static StdVideoAV1TimingInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1TimingInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1TimingInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TimingInfoFlags`
    public static StdVideoAV1TimingInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TimingInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoAV1TimingInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1TimingInfoFlags`
    public StdVideoAV1TimingInfoFlags asSlice(long index) { return new StdVideoAV1TimingInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoAV1TimingInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1TimingInfoFlags`
    public StdVideoAV1TimingInfoFlags asSlice(long index, long count) { return new StdVideoAV1TimingInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `equal_picture_interval` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_equal_picture_interval(MemorySegment segment, long index) { return (int) VH_equal_picture_interval.get(segment, 0L, index); }
    /// {@return `equal_picture_interval`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_equal_picture_interval(MemorySegment segment) { return StdVideoAV1TimingInfoFlags.get_equal_picture_interval(segment, 0L); }
    /// {@return `equal_picture_interval` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int equal_picture_intervalAt(long index) { return StdVideoAV1TimingInfoFlags.get_equal_picture_interval(this.segment(), index); }
    /// {@return `equal_picture_interval`}
    public @CType("uint32_t : 1") int equal_picture_interval() { return StdVideoAV1TimingInfoFlags.get_equal_picture_interval(this.segment()); }
    /// Sets `equal_picture_interval` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_equal_picture_interval(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_equal_picture_interval.set(segment, 0L, index, value); }
    /// Sets `equal_picture_interval` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_equal_picture_interval(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1TimingInfoFlags.set_equal_picture_interval(segment, 0L, value); }
    /// Sets `equal_picture_interval` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfoFlags equal_picture_intervalAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1TimingInfoFlags.set_equal_picture_interval(this.segment(), index, value); return this; }
    /// Sets `equal_picture_interval` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfoFlags equal_picture_interval(@CType("uint32_t : 1") int value) { StdVideoAV1TimingInfoFlags.set_equal_picture_interval(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment) { return StdVideoAV1TimingInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 31") int reservedAt(long index) { return StdVideoAV1TimingInfoFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 31") int reserved() { return StdVideoAV1TimingInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 31") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 31") int value) { StdVideoAV1TimingInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfoFlags reservedAt(long index, @CType("uint32_t : 31") int value) { StdVideoAV1TimingInfoFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TimingInfoFlags reserved(@CType("uint32_t : 31") int value) { StdVideoAV1TimingInfoFlags.set_reserved(this.segment(), value); return this; }

}
