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
/// struct StdVideoAV1TimingInfoFlags {
///     uint32_t equal_picture_interval : 1;
///     uint32_t reserved : 31;
/// };
/// ```
public final class StdVideoAV1TimingInfoFlags extends GroupType {
    /// The struct layout of `StdVideoAV1TimingInfoFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("equal_picture_interval"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 31
    );

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1TimingInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1TimingInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TimingInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TimingInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1TimingInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TimingInfoFlags`
    public static StdVideoAV1TimingInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1TimingInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1TimingInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TimingInfoFlags`
    public static StdVideoAV1TimingInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TimingInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TimingInfoFlags copyFrom(StdVideoAV1TimingInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1TimingInfoFlags reinterpret(long count) { return new StdVideoAV1TimingInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoAV1TimingInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1TimingInfoFlags`
    public StdVideoAV1TimingInfoFlags asSlice(long index) { return new StdVideoAV1TimingInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1TimingInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1TimingInfoFlags`
    public StdVideoAV1TimingInfoFlags asSlice(long index, long count) { return new StdVideoAV1TimingInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1TimingInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1TimingInfoFlags at(long index, Consumer<StdVideoAV1TimingInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
