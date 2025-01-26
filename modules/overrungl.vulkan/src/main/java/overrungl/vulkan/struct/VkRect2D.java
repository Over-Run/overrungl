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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRect2D {
///     (struct VkOffset2D) VkOffset2D offset;
///     (struct VkExtent2D) VkExtent2D extent;
/// };
/// ```
public sealed class VkRect2D extends GroupType {
    /// The struct layout of `VkRect2D`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));

    /// Creates `VkRect2D` with the given segment.
    /// @param segment the memory segment
    public VkRect2D(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRect2D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRect2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRect2D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRect2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRect2D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRect2D`
    public static VkRect2D alloc(SegmentAllocator allocator) { return new VkRect2D(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRect2D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRect2D`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRect2D copyFrom(VkRect2D src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment offset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    /// {@return `offset`}
    public MemorySegment offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset.byteSize()); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRect2D offset(MemorySegment value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    /// {@return `extent`}
    public MemorySegment extent() { return extent(this.segment(), 0L); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRect2D extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRect2D].
    public static final class Buffer extends VkRect2D {
        private final long elementCount;

        /// Creates `VkRect2D.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRect2D`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRect2D`
        public VkRect2D asSlice(long index) { return new VkRect2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRect2D`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRect2D`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `offset` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment offsetAt(long index) { return offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, MemorySegment value) { offset(this.segment(), index, value); return this; }

        /// {@return `extent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment extentAt(long index) { return extent(this.segment(), index); }
        /// Sets `extent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extentAt(long index, MemorySegment value) { extent(this.segment(), index, value); return this; }

    }
}
