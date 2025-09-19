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

/// Represents `StdVideoEncodeAV1OperatingPointInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeAV1OperatingPointInfoFlags {
///     uint32_t decoder_model_present_for_this_op : 1;
///     uint32_t low_delay_mode_flag : 1;
///     uint32_t initial_display_delay_present_for_this_op : 1;
///     uint32_t reserved : 29;
/// };
/// ```
public final class StdVideoEncodeAV1OperatingPointInfoFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1OperatingPointInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("decoder_model_present_for_this_op"), 1,
        ValueLayout.JAVA_INT.withName("low_delay_mode_flag"), 1,
        ValueLayout.JAVA_INT.withName("initial_display_delay_present_for_this_op"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 29
    );

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeAV1OperatingPointInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1OperatingPointInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfoFlags`
    public static StdVideoEncodeAV1OperatingPointInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1OperatingPointInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeAV1OperatingPointInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1OperatingPointInfoFlags`
    public static StdVideoEncodeAV1OperatingPointInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1OperatingPointInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags copyFrom(StdVideoEncodeAV1OperatingPointInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeAV1OperatingPointInfoFlags reinterpret(long count) { return new StdVideoEncodeAV1OperatingPointInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeAV1OperatingPointInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeAV1OperatingPointInfoFlags`
    public StdVideoEncodeAV1OperatingPointInfoFlags asSlice(long index) { return new StdVideoEncodeAV1OperatingPointInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeAV1OperatingPointInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeAV1OperatingPointInfoFlags`
    public StdVideoEncodeAV1OperatingPointInfoFlags asSlice(long index, long count) { return new StdVideoEncodeAV1OperatingPointInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeAV1OperatingPointInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeAV1OperatingPointInfoFlags at(long index, Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
