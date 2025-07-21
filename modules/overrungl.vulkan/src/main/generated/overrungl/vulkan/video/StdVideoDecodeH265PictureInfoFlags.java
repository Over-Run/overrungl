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
/// struct StdVideoDecodeH265PictureInfoFlags {
///     uint32_t IrapPicFlag : 1;
///     uint32_t IdrPicFlag : 1;
///     uint32_t IsReference : 1;
///     uint32_t short_term_ref_pic_set_sps_flag : 1;
/// };
/// ```
public final class StdVideoDecodeH265PictureInfoFlags extends GroupType {
    /// The struct layout of `StdVideoDecodeH265PictureInfoFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("IrapPicFlag"), 1,
        ValueLayout.JAVA_INT.withName("IdrPicFlag"), 1,
        ValueLayout.JAVA_INT.withName("IsReference"), 1,
        ValueLayout.JAVA_INT.withName("short_term_ref_pic_set_sps_flag"), 1
    );

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeH265PictureInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeH265PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265PictureInfoFlags`
    public static StdVideoDecodeH265PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265PictureInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeH265PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265PictureInfoFlags`
    public static StdVideoDecodeH265PictureInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265PictureInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags copyFrom(StdVideoDecodeH265PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeH265PictureInfoFlags reinterpret(long count) { return new StdVideoDecodeH265PictureInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoDecodeH265PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH265PictureInfoFlags`
    public StdVideoDecodeH265PictureInfoFlags asSlice(long index) { return new StdVideoDecodeH265PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeH265PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH265PictureInfoFlags`
    public StdVideoDecodeH265PictureInfoFlags asSlice(long index, long count) { return new StdVideoDecodeH265PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeH265PictureInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags at(long index, Consumer<StdVideoDecodeH265PictureInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
