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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoInlineQueryInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkQueryPool queryPool;
///     uint32_t firstQuery;
///     uint32_t queryCount;
/// };
/// ```
public sealed class VkVideoInlineQueryInfoKHR extends GroupType {
    /// The struct layout of `VkVideoInlineQueryInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("queryPool"),
        ValueLayout.JAVA_INT.withName("firstQuery"),
        ValueLayout.JAVA_INT.withName("queryCount")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `queryPool`.
    public static final long OFFSET_queryPool = LAYOUT.byteOffset(PathElement.groupElement("queryPool"));
    /// The memory layout of `queryPool`.
    public static final MemoryLayout LAYOUT_queryPool = LAYOUT.select(PathElement.groupElement("queryPool"));
    /// The [VarHandle] of `queryPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryPool"));
    /// The byte offset of `firstQuery`.
    public static final long OFFSET_firstQuery = LAYOUT.byteOffset(PathElement.groupElement("firstQuery"));
    /// The memory layout of `firstQuery`.
    public static final MemoryLayout LAYOUT_firstQuery = LAYOUT.select(PathElement.groupElement("firstQuery"));
    /// The [VarHandle] of `firstQuery` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstQuery"));
    /// The byte offset of `queryCount`.
    public static final long OFFSET_queryCount = LAYOUT.byteOffset(PathElement.groupElement("queryCount"));
    /// The memory layout of `queryCount`.
    public static final MemoryLayout LAYOUT_queryCount = LAYOUT.select(PathElement.groupElement("queryCount"));
    /// The [VarHandle] of `queryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoInlineQueryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoInlineQueryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoInlineQueryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param queryPool `queryPool`
    /// @param firstQuery `firstQuery`
    /// @param queryCount `queryCount`
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long queryPool, int firstQuery, int queryCount) {
        return alloc(allocator).sType(sType).pNext(pNext).queryPool(queryPool).firstQuery(firstQuery).queryCount(queryCount);
    }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param queryPool `queryPool`
    /// @param firstQuery `firstQuery`
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long queryPool, int firstQuery) {
        return alloc(allocator).sType(sType).pNext(pNext).queryPool(queryPool).firstQuery(firstQuery);
    }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param queryPool `queryPool`
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long queryPool) {
        return alloc(allocator).sType(sType).pNext(pNext).queryPool(queryPool);
    }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoInlineQueryInfoKHR copyFrom(VkVideoInlineQueryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queryPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long queryPool(MemorySegment segment, long index) { return (long) VH_queryPool.get(segment, 0L, index); }
    /// {@return `queryPool`}
    public long queryPool() { return queryPool(this.segment(), 0L); }
    /// Sets `queryPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryPool(MemorySegment segment, long index, long value) { VH_queryPool.set(segment, 0L, index, value); }
    /// Sets `queryPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryPool(long value) { queryPool(this.segment(), 0L, value); return this; }

    /// {@return `firstQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstQuery(MemorySegment segment, long index) { return (int) VH_firstQuery.get(segment, 0L, index); }
    /// {@return `firstQuery`}
    public int firstQuery() { return firstQuery(this.segment(), 0L); }
    /// Sets `firstQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstQuery(MemorySegment segment, long index, int value) { VH_firstQuery.set(segment, 0L, index, value); }
    /// Sets `firstQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR firstQuery(int value) { firstQuery(this.segment(), 0L, value); return this; }

    /// {@return `queryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryCount(MemorySegment segment, long index) { return (int) VH_queryCount.get(segment, 0L, index); }
    /// {@return `queryCount`}
    public int queryCount() { return queryCount(this.segment(), 0L); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryCount(MemorySegment segment, long index, int value) { VH_queryCount.set(segment, 0L, index, value); }
    /// Sets `queryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryCount(int value) { queryCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoInlineQueryInfoKHR].
    public static final class Buffer extends VkVideoInlineQueryInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoInlineQueryInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoInlineQueryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoInlineQueryInfoKHR`
        public VkVideoInlineQueryInfoKHR asSlice(long index) { return new VkVideoInlineQueryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoInlineQueryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoInlineQueryInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `queryPool` at the given index}
        /// @param index the index of the struct buffer
        public long queryPoolAt(long index) { return queryPool(this.segment(), index); }
        /// Sets `queryPool` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queryPoolAt(long index, long value) { queryPool(this.segment(), index, value); return this; }

        /// {@return `firstQuery` at the given index}
        /// @param index the index of the struct buffer
        public int firstQueryAt(long index) { return firstQuery(this.segment(), index); }
        /// Sets `firstQuery` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstQueryAt(long index, int value) { firstQuery(this.segment(), index, value); return this; }

        /// {@return `queryCount` at the given index}
        /// @param index the index of the struct buffer
        public int queryCountAt(long index) { return queryCount(this.segment(), index); }
        /// Sets `queryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queryCountAt(long index, int value) { queryCount(this.segment(), index, value); return this; }

    }
}
