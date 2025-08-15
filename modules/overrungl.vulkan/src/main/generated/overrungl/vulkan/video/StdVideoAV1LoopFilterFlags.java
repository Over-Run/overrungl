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

/// Represents `StdVideoAV1LoopFilterFlags`.
/// ## Layout
/// ```
/// struct StdVideoAV1LoopFilterFlags {
///     uint32_t loop_filter_delta_enabled : 1;
///     uint32_t loop_filter_delta_update : 1;
///     uint32_t reserved : 30;
/// };
/// ```
public final class StdVideoAV1LoopFilterFlags extends GroupType {
    /// The struct layout of `StdVideoAV1LoopFilterFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("loop_filter_delta_enabled"), 1,
        ValueLayout.JAVA_INT.withName("loop_filter_delta_update"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 30
    );

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1LoopFilterFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1LoopFilterFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopFilterFlags`
    public static StdVideoAV1LoopFilterFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopFilterFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1LoopFilterFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopFilterFlags`
    public static StdVideoAV1LoopFilterFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1LoopFilterFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1LoopFilterFlags copyFrom(StdVideoAV1LoopFilterFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1LoopFilterFlags reinterpret(long count) { return new StdVideoAV1LoopFilterFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoAV1LoopFilterFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1LoopFilterFlags`
    public StdVideoAV1LoopFilterFlags asSlice(long index) { return new StdVideoAV1LoopFilterFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1LoopFilterFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1LoopFilterFlags`
    public StdVideoAV1LoopFilterFlags asSlice(long index, long count) { return new StdVideoAV1LoopFilterFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1LoopFilterFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1LoopFilterFlags at(long index, Consumer<StdVideoAV1LoopFilterFlags> func) { func.accept(asSlice(index)); return this; }

}
