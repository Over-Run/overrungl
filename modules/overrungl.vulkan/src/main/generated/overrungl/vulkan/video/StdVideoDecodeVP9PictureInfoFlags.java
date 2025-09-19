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

/// Represents `StdVideoDecodeVP9PictureInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoDecodeVP9PictureInfoFlags {
///     uint32_t error_resilient_mode : 1;
///     uint32_t intra_only : 1;
///     uint32_t allow_high_precision_mv : 1;
///     uint32_t refresh_frame_context : 1;
///     uint32_t frame_parallel_decoding_mode : 1;
///     uint32_t segmentation_enabled : 1;
///     uint32_t show_frame : 1;
///     uint32_t UsePrevFrameMvs : 1;
///     uint32_t reserved : 24;
/// };
/// ```
public final class StdVideoDecodeVP9PictureInfoFlags extends GroupType {
    /// The struct layout of `StdVideoDecodeVP9PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("error_resilient_mode"), 1,
        ValueLayout.JAVA_INT.withName("intra_only"), 1,
        ValueLayout.JAVA_INT.withName("allow_high_precision_mv"), 1,
        ValueLayout.JAVA_INT.withName("refresh_frame_context"), 1,
        ValueLayout.JAVA_INT.withName("frame_parallel_decoding_mode"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_enabled"), 1,
        ValueLayout.JAVA_INT.withName("show_frame"), 1,
        ValueLayout.JAVA_INT.withName("UsePrevFrameMvs"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 24
    );

    /// Creates `StdVideoDecodeVP9PictureInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeVP9PictureInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeVP9PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeVP9PictureInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeVP9PictureInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeVP9PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeVP9PictureInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeVP9PictureInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeVP9PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeVP9PictureInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeVP9PictureInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeVP9PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeVP9PictureInfoFlags`
    public static StdVideoDecodeVP9PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeVP9PictureInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeVP9PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeVP9PictureInfoFlags`
    public static StdVideoDecodeVP9PictureInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeVP9PictureInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeVP9PictureInfoFlags copyFrom(StdVideoDecodeVP9PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeVP9PictureInfoFlags reinterpret(long count) { return new StdVideoDecodeVP9PictureInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoDecodeVP9PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeVP9PictureInfoFlags`
    public StdVideoDecodeVP9PictureInfoFlags asSlice(long index) { return new StdVideoDecodeVP9PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeVP9PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeVP9PictureInfoFlags`
    public StdVideoDecodeVP9PictureInfoFlags asSlice(long index, long count) { return new StdVideoDecodeVP9PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeVP9PictureInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeVP9PictureInfoFlags at(long index, Consumer<StdVideoDecodeVP9PictureInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
