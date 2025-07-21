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
/// struct StdVideoEncodeH265ReferenceInfoFlags {
///     uint32_t used_for_long_term_reference : 1;
///     uint32_t unused_for_reference : 1;
///     uint32_t reserved : 30;
/// };
/// ```
public final class StdVideoEncodeH265ReferenceInfoFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH265ReferenceInfoFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"), 1,
        ValueLayout.JAVA_INT.withName("unused_for_reference"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 30
    );

    /// Creates `StdVideoEncodeH265ReferenceInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265ReferenceInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceInfoFlags`
    public static StdVideoEncodeH265ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceInfoFlags`
    public static StdVideoEncodeH265ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265ReferenceInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfoFlags copyFrom(StdVideoEncodeH265ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265ReferenceInfoFlags reinterpret(long count) { return new StdVideoEncodeH265ReferenceInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeH265ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265ReferenceInfoFlags`
    public StdVideoEncodeH265ReferenceInfoFlags asSlice(long index) { return new StdVideoEncodeH265ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265ReferenceInfoFlags`
    public StdVideoEncodeH265ReferenceInfoFlags asSlice(long index, long count) { return new StdVideoEncodeH265ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265ReferenceInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfoFlags at(long index, Consumer<StdVideoEncodeH265ReferenceInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
