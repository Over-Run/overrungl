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
/// struct VkImageResolve {
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffset;
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffset;
///     VkExtent3D extent;
/// };
/// ```
public sealed class VkImageResolve extends GroupType {
    /// The struct layout of `VkImageResolve`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("srcOffset"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("dstOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent")
    );
    /// The byte offset of `srcSubresource`.
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    /// The memory layout of `srcSubresource`.
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    /// The byte offset of `srcOffset`.
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    /// The memory layout of `srcOffset`.
    public static final MemoryLayout LAYOUT_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    /// The byte offset of `dstSubresource`.
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    /// The memory layout of `dstSubresource`.
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    /// The byte offset of `dstOffset`.
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    /// The memory layout of `dstOffset`.
    public static final MemoryLayout LAYOUT_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));

    /// Creates `VkImageResolve` with the given segment.
    /// @param segment the memory segment
    public VkImageResolve(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageResolve` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageResolve(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageResolve` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageResolve`
    public static VkImageResolve alloc(SegmentAllocator allocator) { return new VkImageResolve(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageResolve` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageResolve`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageResolve copyFrom(VkImageResolve src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    /// {@return `srcSubresource`}
    public MemorySegment srcSubresource() { return srcSubresource(this.segment(), 0L); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcSubresource(MemorySegment value) { srcSubresource(this.segment(), 0L, value); return this; }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffset, index), LAYOUT_srcOffset); }
    /// {@return `srcOffset`}
    public MemorySegment srcOffset() { return srcOffset(this.segment(), 0L); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffset, index), LAYOUT_srcOffset.byteSize()); }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcOffset(MemorySegment value) { srcOffset(this.segment(), 0L, value); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    /// {@return `dstSubresource`}
    public MemorySegment dstSubresource() { return dstSubresource(this.segment(), 0L); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstSubresource(MemorySegment value) { dstSubresource(this.segment(), 0L, value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffset, index), LAYOUT_dstOffset); }
    /// {@return `dstOffset`}
    public MemorySegment dstOffset() { return dstOffset(this.segment(), 0L); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffset, index), LAYOUT_dstOffset.byteSize()); }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstOffset(MemorySegment value) { dstOffset(this.segment(), 0L, value); return this; }

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
    public VkImageResolve extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageResolve].
    public static final class Buffer extends VkImageResolve {
        private final long elementCount;

        /// Creates `VkImageResolve.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageResolve`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageResolve`
        public VkImageResolve asSlice(long index) { return new VkImageResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageResolve`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageResolve`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcSubresource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcSubresourceAt(long index) { return srcSubresource(this.segment(), index); }
        /// Sets `srcSubresource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcSubresourceAt(long index, MemorySegment value) { srcSubresource(this.segment(), index, value); return this; }

        /// {@return `srcOffset` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcOffsetAt(long index) { return srcOffset(this.segment(), index); }
        /// Sets `srcOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcOffsetAt(long index, MemorySegment value) { srcOffset(this.segment(), index, value); return this; }

        /// {@return `dstSubresource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstSubresourceAt(long index) { return dstSubresource(this.segment(), index); }
        /// Sets `dstSubresource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstSubresourceAt(long index, MemorySegment value) { dstSubresource(this.segment(), index, value); return this; }

        /// {@return `dstOffset` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstOffsetAt(long index) { return dstOffset(this.segment(), index); }
        /// Sets `dstOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstOffsetAt(long index, MemorySegment value) { dstOffset(this.segment(), index, value); return this; }

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
