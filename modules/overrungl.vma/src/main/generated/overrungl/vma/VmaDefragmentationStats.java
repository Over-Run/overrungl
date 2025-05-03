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

/// ## Layout
/// ```
/// struct VmaDefragmentationStats {
///     (uint64_t) VkDeviceSize bytesMoved;
///     (uint64_t) VkDeviceSize bytesFreed;
///     uint32_t allocationsMoved;
///     uint32_t deviceMemoryBlocksFreed;
/// };
/// ```
public sealed class VmaDefragmentationStats extends GroupType {
    /// The struct layout of `VmaDefragmentationStats`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bytesMoved"),
        ValueLayout.JAVA_LONG.withName("bytesFreed"),
        ValueLayout.JAVA_INT.withName("allocationsMoved"),
        ValueLayout.JAVA_INT.withName("deviceMemoryBlocksFreed")
    );
    /// The byte offset of `bytesMoved`.
    public static final long OFFSET_bytesMoved = LAYOUT.byteOffset(PathElement.groupElement("bytesMoved"));
    /// The memory layout of `bytesMoved`.
    public static final MemoryLayout LAYOUT_bytesMoved = LAYOUT.select(PathElement.groupElement("bytesMoved"));
    /// The [VarHandle] of `bytesMoved` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bytesMoved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bytesMoved"));
    /// The byte offset of `bytesFreed`.
    public static final long OFFSET_bytesFreed = LAYOUT.byteOffset(PathElement.groupElement("bytesFreed"));
    /// The memory layout of `bytesFreed`.
    public static final MemoryLayout LAYOUT_bytesFreed = LAYOUT.select(PathElement.groupElement("bytesFreed"));
    /// The [VarHandle] of `bytesFreed` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bytesFreed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bytesFreed"));
    /// The byte offset of `allocationsMoved`.
    public static final long OFFSET_allocationsMoved = LAYOUT.byteOffset(PathElement.groupElement("allocationsMoved"));
    /// The memory layout of `allocationsMoved`.
    public static final MemoryLayout LAYOUT_allocationsMoved = LAYOUT.select(PathElement.groupElement("allocationsMoved"));
    /// The [VarHandle] of `allocationsMoved` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_allocationsMoved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationsMoved"));
    /// The byte offset of `deviceMemoryBlocksFreed`.
    public static final long OFFSET_deviceMemoryBlocksFreed = LAYOUT.byteOffset(PathElement.groupElement("deviceMemoryBlocksFreed"));
    /// The memory layout of `deviceMemoryBlocksFreed`.
    public static final MemoryLayout LAYOUT_deviceMemoryBlocksFreed = LAYOUT.select(PathElement.groupElement("deviceMemoryBlocksFreed"));
    /// The [VarHandle] of `deviceMemoryBlocksFreed` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMemoryBlocksFreed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMemoryBlocksFreed"));

    /// Creates `VmaDefragmentationStats` with the given segment.
    /// @param segment the memory segment
    public VmaDefragmentationStats(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VmaDefragmentationStats` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDefragmentationStats` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationStats ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationStats(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VmaDefragmentationStats` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDefragmentationStats` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDefragmentationStats`
    public static VmaDefragmentationStats alloc(SegmentAllocator allocator) { return new VmaDefragmentationStats(allocator.allocate(LAYOUT)); }

    /// Allocates a `VmaDefragmentationStats` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDefragmentationStats`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDefragmentationStats copyFrom(VmaDefragmentationStats src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `bytesMoved` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bytesMoved(MemorySegment segment, long index) { return (long) VH_bytesMoved.get(segment, 0L, index); }
    /// {@return `bytesMoved`}
    public long bytesMoved() { return bytesMoved(this.segment(), 0L); }
    /// Sets `bytesMoved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bytesMoved(MemorySegment segment, long index, long value) { VH_bytesMoved.set(segment, 0L, index, value); }
    /// Sets `bytesMoved` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationStats bytesMoved(long value) { bytesMoved(this.segment(), 0L, value); return this; }

    /// {@return `bytesFreed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bytesFreed(MemorySegment segment, long index) { return (long) VH_bytesFreed.get(segment, 0L, index); }
    /// {@return `bytesFreed`}
    public long bytesFreed() { return bytesFreed(this.segment(), 0L); }
    /// Sets `bytesFreed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bytesFreed(MemorySegment segment, long index, long value) { VH_bytesFreed.set(segment, 0L, index, value); }
    /// Sets `bytesFreed` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationStats bytesFreed(long value) { bytesFreed(this.segment(), 0L, value); return this; }

    /// {@return `allocationsMoved` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int allocationsMoved(MemorySegment segment, long index) { return (int) VH_allocationsMoved.get(segment, 0L, index); }
    /// {@return `allocationsMoved`}
    public int allocationsMoved() { return allocationsMoved(this.segment(), 0L); }
    /// Sets `allocationsMoved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationsMoved(MemorySegment segment, long index, int value) { VH_allocationsMoved.set(segment, 0L, index, value); }
    /// Sets `allocationsMoved` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationStats allocationsMoved(int value) { allocationsMoved(this.segment(), 0L, value); return this; }

    /// {@return `deviceMemoryBlocksFreed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceMemoryBlocksFreed(MemorySegment segment, long index) { return (int) VH_deviceMemoryBlocksFreed.get(segment, 0L, index); }
    /// {@return `deviceMemoryBlocksFreed`}
    public int deviceMemoryBlocksFreed() { return deviceMemoryBlocksFreed(this.segment(), 0L); }
    /// Sets `deviceMemoryBlocksFreed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMemoryBlocksFreed(MemorySegment segment, long index, int value) { VH_deviceMemoryBlocksFreed.set(segment, 0L, index, value); }
    /// Sets `deviceMemoryBlocksFreed` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationStats deviceMemoryBlocksFreed(int value) { deviceMemoryBlocksFreed(this.segment(), 0L, value); return this; }

    /// A buffer of [VmaDefragmentationStats].
    public static final class Buffer extends VmaDefragmentationStats {
        private final long elementCount;

        /// Creates `VmaDefragmentationStats.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VmaDefragmentationStats`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VmaDefragmentationStats`
        public VmaDefragmentationStats asSlice(long index) { return new VmaDefragmentationStats(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VmaDefragmentationStats`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VmaDefragmentationStats`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `bytesMoved` at the given index}
        /// @param index the index of the struct buffer
        public long bytesMovedAt(long index) { return bytesMoved(this.segment(), index); }
        /// Sets `bytesMoved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bytesMovedAt(long index, long value) { bytesMoved(this.segment(), index, value); return this; }

        /// {@return `bytesFreed` at the given index}
        /// @param index the index of the struct buffer
        public long bytesFreedAt(long index) { return bytesFreed(this.segment(), index); }
        /// Sets `bytesFreed` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bytesFreedAt(long index, long value) { bytesFreed(this.segment(), index, value); return this; }

        /// {@return `allocationsMoved` at the given index}
        /// @param index the index of the struct buffer
        public int allocationsMovedAt(long index) { return allocationsMoved(this.segment(), index); }
        /// Sets `allocationsMoved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer allocationsMovedAt(long index, int value) { allocationsMoved(this.segment(), index, value); return this; }

        /// {@return `deviceMemoryBlocksFreed` at the given index}
        /// @param index the index of the struct buffer
        public int deviceMemoryBlocksFreedAt(long index) { return deviceMemoryBlocksFreed(this.segment(), index); }
        /// Sets `deviceMemoryBlocksFreed` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceMemoryBlocksFreedAt(long index, int value) { deviceMemoryBlocksFreed(this.segment(), index, value); return this; }

    }
}
