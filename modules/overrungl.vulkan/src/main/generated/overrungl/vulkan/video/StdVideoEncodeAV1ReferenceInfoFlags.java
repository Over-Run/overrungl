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
/// struct StdVideoEncodeAV1ReferenceInfoFlags {
///     uint32_t disable_frame_end_update_cdf : 1;
///     uint32_t segmentation_enabled : 1;
///     uint32_t reserved : 30;
/// };
/// ```
public final class StdVideoEncodeAV1ReferenceInfoFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1ReferenceInfoFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("disable_frame_end_update_cdf"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_enabled"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 30
    );

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeAV1ReferenceInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfoFlags`
    public static StdVideoEncodeAV1ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ReferenceInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfoFlags`
    public static StdVideoEncodeAV1ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1ReferenceInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags copyFrom(StdVideoEncodeAV1ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeAV1ReferenceInfoFlags reinterpret(long count) { return new StdVideoEncodeAV1ReferenceInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeAV1ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeAV1ReferenceInfoFlags`
    public StdVideoEncodeAV1ReferenceInfoFlags asSlice(long index) { return new StdVideoEncodeAV1ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeAV1ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeAV1ReferenceInfoFlags`
    public StdVideoEncodeAV1ReferenceInfoFlags asSlice(long index, long count) { return new StdVideoEncodeAV1ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeAV1ReferenceInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags at(long index, Consumer<StdVideoEncodeAV1ReferenceInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
