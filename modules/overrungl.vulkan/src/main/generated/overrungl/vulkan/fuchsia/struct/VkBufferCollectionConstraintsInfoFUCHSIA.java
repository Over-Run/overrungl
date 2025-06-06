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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferCollectionConstraintsInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t minBufferCount;
///     uint32_t maxBufferCount;
///     uint32_t minBufferCountForCamping;
///     uint32_t minBufferCountForDedicatedSlack;
///     uint32_t minBufferCountForSharedSlack;
/// };
/// ```
public sealed class VkBufferCollectionConstraintsInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkBufferCollectionConstraintsInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
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
    /// The byte offset of `minBufferCount`.
    public static final long OFFSET_minBufferCount = LAYOUT.byteOffset(PathElement.groupElement("minBufferCount"));
    /// The memory layout of `minBufferCount`.
    public static final MemoryLayout LAYOUT_minBufferCount = LAYOUT.select(PathElement.groupElement("minBufferCount"));
    /// The [VarHandle] of `minBufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCount"));
    /// The byte offset of `maxBufferCount`.
    public static final long OFFSET_maxBufferCount = LAYOUT.byteOffset(PathElement.groupElement("maxBufferCount"));
    /// The memory layout of `maxBufferCount`.
    public static final MemoryLayout LAYOUT_maxBufferCount = LAYOUT.select(PathElement.groupElement("maxBufferCount"));
    /// The [VarHandle] of `maxBufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferCount"));
    /// The byte offset of `minBufferCountForCamping`.
    public static final long OFFSET_minBufferCountForCamping = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForCamping"));
    /// The memory layout of `minBufferCountForCamping`.
    public static final MemoryLayout LAYOUT_minBufferCountForCamping = LAYOUT.select(PathElement.groupElement("minBufferCountForCamping"));
    /// The [VarHandle] of `minBufferCountForCamping` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBufferCountForCamping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForCamping"));
    /// The byte offset of `minBufferCountForDedicatedSlack`.
    public static final long OFFSET_minBufferCountForDedicatedSlack = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    /// The memory layout of `minBufferCountForDedicatedSlack`.
    public static final MemoryLayout LAYOUT_minBufferCountForDedicatedSlack = LAYOUT.select(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    /// The [VarHandle] of `minBufferCountForDedicatedSlack` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBufferCountForDedicatedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    /// The byte offset of `minBufferCountForSharedSlack`.
    public static final long OFFSET_minBufferCountForSharedSlack = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForSharedSlack"));
    /// The memory layout of `minBufferCountForSharedSlack`.
    public static final MemoryLayout LAYOUT_minBufferCountForSharedSlack = LAYOUT.select(PathElement.groupElement("minBufferCountForSharedSlack"));
    /// The [VarHandle] of `minBufferCountForSharedSlack` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBufferCountForSharedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForSharedSlack"));

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minBufferCount `minBufferCount`
    /// @param maxBufferCount `maxBufferCount`
    /// @param minBufferCountForCamping `minBufferCountForCamping`
    /// @param minBufferCountForDedicatedSlack `minBufferCountForDedicatedSlack`
    /// @param minBufferCountForSharedSlack `minBufferCountForSharedSlack`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minBufferCount, int maxBufferCount, int minBufferCountForCamping, int minBufferCountForDedicatedSlack, int minBufferCountForSharedSlack) {
        return alloc(allocator).sType(sType).pNext(pNext).minBufferCount(minBufferCount).maxBufferCount(maxBufferCount).minBufferCountForCamping(minBufferCountForCamping).minBufferCountForDedicatedSlack(minBufferCountForDedicatedSlack).minBufferCountForSharedSlack(minBufferCountForSharedSlack);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minBufferCount `minBufferCount`
    /// @param maxBufferCount `maxBufferCount`
    /// @param minBufferCountForCamping `minBufferCountForCamping`
    /// @param minBufferCountForDedicatedSlack `minBufferCountForDedicatedSlack`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minBufferCount, int maxBufferCount, int minBufferCountForCamping, int minBufferCountForDedicatedSlack) {
        return alloc(allocator).sType(sType).pNext(pNext).minBufferCount(minBufferCount).maxBufferCount(maxBufferCount).minBufferCountForCamping(minBufferCountForCamping).minBufferCountForDedicatedSlack(minBufferCountForDedicatedSlack);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minBufferCount `minBufferCount`
    /// @param maxBufferCount `maxBufferCount`
    /// @param minBufferCountForCamping `minBufferCountForCamping`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minBufferCount, int maxBufferCount, int minBufferCountForCamping) {
        return alloc(allocator).sType(sType).pNext(pNext).minBufferCount(minBufferCount).maxBufferCount(maxBufferCount).minBufferCountForCamping(minBufferCountForCamping);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minBufferCount `minBufferCount`
    /// @param maxBufferCount `maxBufferCount`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minBufferCount, int maxBufferCount) {
        return alloc(allocator).sType(sType).pNext(pNext).minBufferCount(minBufferCount).maxBufferCount(maxBufferCount);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minBufferCount `minBufferCount`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minBufferCount) {
        return alloc(allocator).sType(sType).pNext(pNext).minBufferCount(minBufferCount);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA copyFrom(VkBufferCollectionConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBufferCollectionConstraintsInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionConstraintsInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minBufferCount(MemorySegment segment, long index) { return (int) VH_minBufferCount.get(segment, 0L, index); }
    /// {@return `minBufferCount`}
    public int minBufferCount() { return minBufferCount(this.segment(), 0L); }
    /// Sets `minBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBufferCount(MemorySegment segment, long index, int value) { VH_minBufferCount.set(segment, 0L, index, value); }
    /// Sets `minBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCount(int value) { minBufferCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBufferCount(MemorySegment segment, long index) { return (int) VH_maxBufferCount.get(segment, 0L, index); }
    /// {@return `maxBufferCount`}
    public int maxBufferCount() { return maxBufferCount(this.segment(), 0L); }
    /// Sets `maxBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBufferCount(MemorySegment segment, long index, int value) { VH_maxBufferCount.set(segment, 0L, index, value); }
    /// Sets `maxBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA maxBufferCount(int value) { maxBufferCount(this.segment(), 0L, value); return this; }

    /// {@return `minBufferCountForCamping` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minBufferCountForCamping(MemorySegment segment, long index) { return (int) VH_minBufferCountForCamping.get(segment, 0L, index); }
    /// {@return `minBufferCountForCamping`}
    public int minBufferCountForCamping() { return minBufferCountForCamping(this.segment(), 0L); }
    /// Sets `minBufferCountForCamping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBufferCountForCamping(MemorySegment segment, long index, int value) { VH_minBufferCountForCamping.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForCamping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForCamping(int value) { minBufferCountForCamping(this.segment(), 0L, value); return this; }

    /// {@return `minBufferCountForDedicatedSlack` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minBufferCountForDedicatedSlack(MemorySegment segment, long index) { return (int) VH_minBufferCountForDedicatedSlack.get(segment, 0L, index); }
    /// {@return `minBufferCountForDedicatedSlack`}
    public int minBufferCountForDedicatedSlack() { return minBufferCountForDedicatedSlack(this.segment(), 0L); }
    /// Sets `minBufferCountForDedicatedSlack` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBufferCountForDedicatedSlack(MemorySegment segment, long index, int value) { VH_minBufferCountForDedicatedSlack.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForDedicatedSlack` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForDedicatedSlack(int value) { minBufferCountForDedicatedSlack(this.segment(), 0L, value); return this; }

    /// {@return `minBufferCountForSharedSlack` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minBufferCountForSharedSlack(MemorySegment segment, long index) { return (int) VH_minBufferCountForSharedSlack.get(segment, 0L, index); }
    /// {@return `minBufferCountForSharedSlack`}
    public int minBufferCountForSharedSlack() { return minBufferCountForSharedSlack(this.segment(), 0L); }
    /// Sets `minBufferCountForSharedSlack` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBufferCountForSharedSlack(MemorySegment segment, long index, int value) { VH_minBufferCountForSharedSlack.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForSharedSlack` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForSharedSlack(int value) { minBufferCountForSharedSlack(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBufferCollectionConstraintsInfoFUCHSIA].
    public static final class Buffer extends VkBufferCollectionConstraintsInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCollectionConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCollectionConstraintsInfoFUCHSIA`
        public VkBufferCollectionConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCollectionConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCollectionConstraintsInfoFUCHSIA`
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

        /// {@return `minBufferCount` at the given index}
        /// @param index the index of the struct buffer
        public int minBufferCountAt(long index) { return minBufferCount(this.segment(), index); }
        /// Sets `minBufferCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBufferCountAt(long index, int value) { minBufferCount(this.segment(), index, value); return this; }

        /// {@return `maxBufferCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxBufferCountAt(long index) { return maxBufferCount(this.segment(), index); }
        /// Sets `maxBufferCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxBufferCountAt(long index, int value) { maxBufferCount(this.segment(), index, value); return this; }

        /// {@return `minBufferCountForCamping` at the given index}
        /// @param index the index of the struct buffer
        public int minBufferCountForCampingAt(long index) { return minBufferCountForCamping(this.segment(), index); }
        /// Sets `minBufferCountForCamping` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBufferCountForCampingAt(long index, int value) { minBufferCountForCamping(this.segment(), index, value); return this; }

        /// {@return `minBufferCountForDedicatedSlack` at the given index}
        /// @param index the index of the struct buffer
        public int minBufferCountForDedicatedSlackAt(long index) { return minBufferCountForDedicatedSlack(this.segment(), index); }
        /// Sets `minBufferCountForDedicatedSlack` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBufferCountForDedicatedSlackAt(long index, int value) { minBufferCountForDedicatedSlack(this.segment(), index, value); return this; }

        /// {@return `minBufferCountForSharedSlack` at the given index}
        /// @param index the index of the struct buffer
        public int minBufferCountForSharedSlackAt(long index) { return minBufferCountForSharedSlack(this.segment(), index); }
        /// Sets `minBufferCountForSharedSlack` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBufferCountForSharedSlackAt(long index, int value) { minBufferCountForSharedSlack(this.segment(), index, value); return this; }

    }
}
