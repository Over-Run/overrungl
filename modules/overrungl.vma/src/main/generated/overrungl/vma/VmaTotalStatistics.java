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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

import static overrungl.vulkan.VK10.*;

/// ## Layout
/// ```
/// struct VmaTotalStatistics {
///     (struct VmaDetailedStatistics) VmaDetailedStatistics memoryType[VK_MAX_MEMORY_TYPES];
///     (struct VmaDetailedStatistics) VmaDetailedStatistics memoryHeap[VK_MAX_MEMORY_HEAPS];
///     (struct VmaDetailedStatistics) VmaDetailedStatistics total;
/// };
/// ```
public sealed class VmaTotalStatistics extends GroupType {
    /// The struct layout of `VmaTotalStatistics`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_TYPES, VmaDetailedStatistics.LAYOUT).withName("memoryType"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, VmaDetailedStatistics.LAYOUT).withName("memoryHeap"),
        VmaDetailedStatistics.LAYOUT.withName("total")
    );
    /// The byte offset of `memoryType`.
    public static final long OFFSET_memoryType = LAYOUT.byteOffset(PathElement.groupElement("memoryType"));
    /// The memory layout of `memoryType`.
    public static final MemoryLayout LAYOUT_memoryType = LAYOUT.select(PathElement.groupElement("memoryType"));
    /// The byte offset of `memoryHeap`.
    public static final long OFFSET_memoryHeap = LAYOUT.byteOffset(PathElement.groupElement("memoryHeap"));
    /// The memory layout of `memoryHeap`.
    public static final MemoryLayout LAYOUT_memoryHeap = LAYOUT.select(PathElement.groupElement("memoryHeap"));
    /// The byte offset of `total`.
    public static final long OFFSET_total = LAYOUT.byteOffset(PathElement.groupElement("total"));
    /// The memory layout of `total`.
    public static final MemoryLayout LAYOUT_total = LAYOUT.select(PathElement.groupElement("total"));

    /// Creates `VmaTotalStatistics` with the given segment.
    /// @param segment the memory segment
    public VmaTotalStatistics(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VmaTotalStatistics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaTotalStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaTotalStatistics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaTotalStatistics(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VmaTotalStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics alloc(SegmentAllocator allocator) { return new VmaTotalStatistics(allocator.allocate(LAYOUT)); }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaTotalStatistics`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryType `memoryType`
    /// @param memoryHeap `memoryHeap`
    /// @param total `total`
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics allocInit(SegmentAllocator allocator, MemorySegment memoryType, MemorySegment memoryHeap, MemorySegment total) {
        return alloc(allocator).memoryType(memoryType).memoryHeap(memoryHeap).total(total);
    }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryType `memoryType`
    /// @param memoryHeap `memoryHeap`
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics allocInit(SegmentAllocator allocator, MemorySegment memoryType, MemorySegment memoryHeap) {
        return alloc(allocator).memoryType(memoryType).memoryHeap(memoryHeap);
    }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryType `memoryType`
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics allocInit(SegmentAllocator allocator, MemorySegment memoryType) {
        return alloc(allocator).memoryType(memoryType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaTotalStatistics copyFrom(VmaTotalStatistics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `memoryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryType(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryType, index), LAYOUT_memoryType); }
    /// {@return `memoryType`}
    public MemorySegment memoryType() { return memoryType(this.segment(), 0L); }
    /// Sets `memoryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryType(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryType, index), LAYOUT_memoryType.byteSize()); }
    /// Sets `memoryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryType(MemorySegment value) { memoryType(this.segment(), 0L, value); return this; }

    /// {@return `memoryHeap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryHeap(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryHeap, index), LAYOUT_memoryHeap); }
    /// {@return `memoryHeap`}
    public MemorySegment memoryHeap() { return memoryHeap(this.segment(), 0L); }
    /// Sets `memoryHeap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryHeap(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryHeap, index), LAYOUT_memoryHeap.byteSize()); }
    /// Sets `memoryHeap` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryHeap(MemorySegment value) { memoryHeap(this.segment(), 0L, value); return this; }

    /// {@return `total` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment total(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_total, index), LAYOUT_total); }
    /// {@return `total`}
    public MemorySegment total() { return total(this.segment(), 0L); }
    /// Sets `total` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void total(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_total, index), LAYOUT_total.byteSize()); }
    /// Sets `total` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics total(MemorySegment value) { total(this.segment(), 0L, value); return this; }

    /// A buffer of [VmaTotalStatistics].
    public static final class Buffer extends VmaTotalStatistics {
        private final long elementCount;

        /// Creates `VmaTotalStatistics.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VmaTotalStatistics`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VmaTotalStatistics`
        public VmaTotalStatistics asSlice(long index) { return new VmaTotalStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VmaTotalStatistics`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VmaTotalStatistics`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `memoryType` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment memoryTypeAt(long index) { return memoryType(this.segment(), index); }
        /// Sets `memoryType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryTypeAt(long index, MemorySegment value) { memoryType(this.segment(), index, value); return this; }

        /// {@return `memoryHeap` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment memoryHeapAt(long index) { return memoryHeap(this.segment(), index); }
        /// Sets `memoryHeap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryHeapAt(long index, MemorySegment value) { memoryHeap(this.segment(), index, value); return this; }

        /// {@return `total` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment totalAt(long index) { return total(this.segment(), index); }
        /// Sets `total` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer totalAt(long index, MemorySegment value) { total(this.segment(), index, value); return this; }

    }
}
