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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t dimension;
///     uint32_t zeroCount;
///     uint32_t groupSize;
/// };
/// ```
public sealed class VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dimension"),
        ValueLayout.JAVA_INT.withName("zeroCount"),
        ValueLayout.JAVA_INT.withName("groupSize")
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
    /// The byte offset of `dimension`.
    public static final long OFFSET_dimension = LAYOUT.byteOffset(PathElement.groupElement("dimension"));
    /// The memory layout of `dimension`.
    public static final MemoryLayout LAYOUT_dimension = LAYOUT.select(PathElement.groupElement("dimension"));
    /// The [VarHandle] of `dimension` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dimension = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimension"));
    /// The byte offset of `zeroCount`.
    public static final long OFFSET_zeroCount = LAYOUT.byteOffset(PathElement.groupElement("zeroCount"));
    /// The memory layout of `zeroCount`.
    public static final MemoryLayout LAYOUT_zeroCount = LAYOUT.select(PathElement.groupElement("zeroCount"));
    /// The [VarHandle] of `zeroCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_zeroCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zeroCount"));
    /// The byte offset of `groupSize`.
    public static final long OFFSET_groupSize = LAYOUT.byteOffset(PathElement.groupElement("groupSize"));
    /// The memory layout of `groupSize`.
    public static final MemoryLayout LAYOUT_groupSize = LAYOUT.select(PathElement.groupElement("groupSize"));
    /// The [VarHandle] of `groupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupSize"));

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimension `dimension`
    /// @param zeroCount `zeroCount`
    /// @param groupSize `groupSize`
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimension, int zeroCount, int groupSize) {
        return alloc(allocator).sType(sType).pNext(pNext).dimension(dimension).zeroCount(zeroCount).groupSize(groupSize);
    }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimension `dimension`
    /// @param zeroCount `zeroCount`
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimension, int zeroCount) {
        return alloc(allocator).sType(sType).pNext(pNext).dimension(dimension).zeroCount(zeroCount);
    }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimension `dimension`
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimension) {
        return alloc(allocator).sType(sType).pNext(pNext).dimension(dimension);
    }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM copyFrom(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dimension(MemorySegment segment, long index) { return (int) VH_dimension.get(segment, 0L, index); }
    /// {@return `dimension`}
    public int dimension() { return dimension(this.segment(), 0L); }
    /// Sets `dimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dimension(MemorySegment segment, long index, int value) { VH_dimension.set(segment, 0L, index, value); }
    /// Sets `dimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimension(int value) { dimension(this.segment(), 0L, value); return this; }

    /// {@return `zeroCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int zeroCount(MemorySegment segment, long index) { return (int) VH_zeroCount.get(segment, 0L, index); }
    /// {@return `zeroCount`}
    public int zeroCount() { return zeroCount(this.segment(), 0L); }
    /// Sets `zeroCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void zeroCount(MemorySegment segment, long index, int value) { VH_zeroCount.set(segment, 0L, index, value); }
    /// Sets `zeroCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCount(int value) { zeroCount(this.segment(), 0L, value); return this; }

    /// {@return `groupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupSize(MemorySegment segment, long index) { return (int) VH_groupSize.get(segment, 0L, index); }
    /// {@return `groupSize`}
    public int groupSize() { return groupSize(this.segment(), 0L); }
    /// Sets `groupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupSize(MemorySegment segment, long index, int value) { VH_groupSize.set(segment, 0L, index, value); }
    /// Sets `groupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSize(int value) { groupSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM].
    public static final class Buffer extends VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM {
        private final long elementCount;

        /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
        public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM asSlice(long index) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
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

        /// {@return `dimension` at the given index}
        /// @param index the index of the struct buffer
        public int dimensionAt(long index) { return dimension(this.segment(), index); }
        /// Sets `dimension` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dimensionAt(long index, int value) { dimension(this.segment(), index, value); return this; }

        /// {@return `zeroCount` at the given index}
        /// @param index the index of the struct buffer
        public int zeroCountAt(long index) { return zeroCount(this.segment(), index); }
        /// Sets `zeroCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer zeroCountAt(long index, int value) { zeroCount(this.segment(), index, value); return this; }

        /// {@return `groupSize` at the given index}
        /// @param index the index of the struct buffer
        public int groupSizeAt(long index) { return groupSize(this.segment(), index); }
        /// Sets `groupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer groupSizeAt(long index, int value) { groupSize(this.segment(), index, value); return this; }

    }
}
