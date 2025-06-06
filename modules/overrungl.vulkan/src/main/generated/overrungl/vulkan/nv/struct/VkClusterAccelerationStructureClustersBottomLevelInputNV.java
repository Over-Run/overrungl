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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureClustersBottomLevelInputNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxTotalClusterCount;
///     uint32_t maxClusterCountPerAccelerationStructure;
/// };
/// ```
public sealed class VkClusterAccelerationStructureClustersBottomLevelInputNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTotalClusterCount"),
        ValueLayout.JAVA_INT.withName("maxClusterCountPerAccelerationStructure")
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
    /// The byte offset of `maxTotalClusterCount`.
    public static final long OFFSET_maxTotalClusterCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalClusterCount"));
    /// The memory layout of `maxTotalClusterCount`.
    public static final MemoryLayout LAYOUT_maxTotalClusterCount = LAYOUT.select(PathElement.groupElement("maxTotalClusterCount"));
    /// The [VarHandle] of `maxTotalClusterCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTotalClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalClusterCount"));
    /// The byte offset of `maxClusterCountPerAccelerationStructure`.
    public static final long OFFSET_maxClusterCountPerAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    /// The memory layout of `maxClusterCountPerAccelerationStructure`.
    public static final MemoryLayout LAYOUT_maxClusterCountPerAccelerationStructure = LAYOUT.select(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    /// The [VarHandle] of `maxClusterCountPerAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterCountPerAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    /// @param segment the memory segment
    public VkClusterAccelerationStructureClustersBottomLevelInputNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxTotalClusterCount `maxTotalClusterCount`
    /// @param maxClusterCountPerAccelerationStructure `maxClusterCountPerAccelerationStructure`
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxTotalClusterCount, int maxClusterCountPerAccelerationStructure) {
        return alloc(allocator).sType(sType).pNext(pNext).maxTotalClusterCount(maxTotalClusterCount).maxClusterCountPerAccelerationStructure(maxClusterCountPerAccelerationStructure);
    }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxTotalClusterCount `maxTotalClusterCount`
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxTotalClusterCount) {
        return alloc(allocator).sType(sType).pNext(pNext).maxTotalClusterCount(maxTotalClusterCount);
    }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV copyFrom(VkClusterAccelerationStructureClustersBottomLevelInputNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTotalClusterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTotalClusterCount(MemorySegment segment, long index) { return (int) VH_maxTotalClusterCount.get(segment, 0L, index); }
    /// {@return `maxTotalClusterCount`}
    public int maxTotalClusterCount() { return maxTotalClusterCount(this.segment(), 0L); }
    /// Sets `maxTotalClusterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTotalClusterCount(MemorySegment segment, long index, int value) { VH_maxTotalClusterCount.set(segment, 0L, index, value); }
    /// Sets `maxTotalClusterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(int value) { maxTotalClusterCount(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterCountPerAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterCountPerAccelerationStructure(MemorySegment segment, long index) { return (int) VH_maxClusterCountPerAccelerationStructure.get(segment, 0L, index); }
    /// {@return `maxClusterCountPerAccelerationStructure`}
    public int maxClusterCountPerAccelerationStructure() { return maxClusterCountPerAccelerationStructure(this.segment(), 0L); }
    /// Sets `maxClusterCountPerAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterCountPerAccelerationStructure(MemorySegment segment, long index, int value) { VH_maxClusterCountPerAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `maxClusterCountPerAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(int value) { maxClusterCountPerAccelerationStructure(this.segment(), 0L, value); return this; }

    /// A buffer of [VkClusterAccelerationStructureClustersBottomLevelInputNV].
    public static final class Buffer extends VkClusterAccelerationStructureClustersBottomLevelInputNV {
        private final long elementCount;

        /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`
        public VkClusterAccelerationStructureClustersBottomLevelInputNV asSlice(long index) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`
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

        /// {@return `maxTotalClusterCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxTotalClusterCountAt(long index) { return maxTotalClusterCount(this.segment(), index); }
        /// Sets `maxTotalClusterCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTotalClusterCountAt(long index, int value) { maxTotalClusterCount(this.segment(), index, value); return this; }

        /// {@return `maxClusterCountPerAccelerationStructure` at the given index}
        /// @param index the index of the struct buffer
        public int maxClusterCountPerAccelerationStructureAt(long index) { return maxClusterCountPerAccelerationStructure(this.segment(), index); }
        /// Sets `maxClusterCountPerAccelerationStructure` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxClusterCountPerAccelerationStructureAt(long index, int value) { maxClusterCountPerAccelerationStructure(this.segment(), index, value); return this; }

    }
}
