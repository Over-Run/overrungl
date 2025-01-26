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
/// struct VkSparseImageMemoryBind {
///     VkImageSubresource subresource;
///     VkOffset3D offset;
///     VkExtent3D extent;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags;
/// };
/// ```
public sealed class VkSparseImageMemoryBind extends GroupType {
    /// The struct layout of `VkSparseImageMemoryBind`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("subresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `subresource`.
    public static final long OFFSET_subresource = LAYOUT.byteOffset(PathElement.groupElement("subresource"));
    /// The memory layout of `subresource`.
    public static final MemoryLayout LAYOUT_subresource = LAYOUT.select(PathElement.groupElement("subresource"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The byte offset of `memoryOffset`.
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    /// The memory layout of `memoryOffset`.
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageMemoryBind(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBind ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSparseImageMemoryBind` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryBind`
    public static VkSparseImageMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryBind(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageMemoryBind` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryBind`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageMemoryBind copyFrom(VkSparseImageMemoryBind src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `subresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment subresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresource, index), LAYOUT_subresource); }
    /// {@return `subresource`}
    public MemorySegment subresource() { return subresource(this.segment(), 0L); }
    /// Sets `subresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresource, index), LAYOUT_subresource.byteSize()); }
    /// Sets `subresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind subresource(MemorySegment value) { subresource(this.segment(), 0L, value); return this; }

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
    public VkSparseImageMemoryBind offset(MemorySegment value) { offset(this.segment(), 0L, value); return this; }

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
    public VkSparseImageMemoryBind extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    public long memoryOffset() { return memoryOffset(this.segment(), 0L); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryOffset(MemorySegment segment, long index, long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memoryOffset(long value) { memoryOffset(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSparseImageMemoryBind].
    public static final class Buffer extends VkSparseImageMemoryBind {
        private final long elementCount;

        /// Creates `VkSparseImageMemoryBind.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSparseImageMemoryBind`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSparseImageMemoryBind`
        public VkSparseImageMemoryBind asSlice(long index) { return new VkSparseImageMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSparseImageMemoryBind`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSparseImageMemoryBind`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `subresource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment subresourceAt(long index) { return subresource(this.segment(), index); }
        /// Sets `subresource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subresourceAt(long index, MemorySegment value) { subresource(this.segment(), index, value); return this; }

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

        /// {@return `memory` at the given index}
        /// @param index the index of the struct buffer
        public long memoryAt(long index) { return memory(this.segment(), index); }
        /// Sets `memory` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

        /// {@return `memoryOffset` at the given index}
        /// @param index the index of the struct buffer
        public long memoryOffsetAt(long index) { return memoryOffset(this.segment(), index); }
        /// Sets `memoryOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryOffsetAt(long index, long value) { memoryOffset(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    }
}
