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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoAV1FilmGrainFlags {
///     uint32_t chroma_scaling_from_luma;
///     uint32_t overlap_flag;
///     uint32_t clip_to_restricted_range;
///     uint32_t update_grain;
///     uint32_t reserved;
/// };
/// ```
public sealed class StdVideoAV1FilmGrainFlags extends GroupType {
    /// The struct layout of `StdVideoAV1FilmGrainFlags`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.paddingLayout(28)
    );

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1FilmGrainFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static StdVideoAV1FilmGrainFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1FilmGrainFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1FilmGrainFlags copyFrom(StdVideoAV1FilmGrainFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [StdVideoAV1FilmGrainFlags].
    public static final class Buffer extends StdVideoAV1FilmGrainFlags {
        private final long elementCount;

        /// Creates `StdVideoAV1FilmGrainFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1FilmGrainFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1FilmGrainFlags`
        public StdVideoAV1FilmGrainFlags asSlice(long index) { return new StdVideoAV1FilmGrainFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1FilmGrainFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1FilmGrainFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
