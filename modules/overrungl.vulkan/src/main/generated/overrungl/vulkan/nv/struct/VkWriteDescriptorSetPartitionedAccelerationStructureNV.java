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
/// struct VkWriteDescriptorSetPartitionedAccelerationStructureNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t accelerationStructureCount;
///     const VkDeviceAddress* pAccelerationStructures;
/// };
/// ```
public sealed class VkWriteDescriptorSetPartitionedAccelerationStructureNV extends GroupType {
    /// The struct layout of `VkWriteDescriptorSetPartitionedAccelerationStructureNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withName("pAccelerationStructures")
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
    /// The byte offset of `accelerationStructureCount`.
    public static final long OFFSET_accelerationStructureCount = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCount"));
    /// The memory layout of `accelerationStructureCount`.
    public static final MemoryLayout LAYOUT_accelerationStructureCount = LAYOUT.select(PathElement.groupElement("accelerationStructureCount"));
    /// The [VarHandle] of `accelerationStructureCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCount"));
    /// The byte offset of `pAccelerationStructures`.
    public static final long OFFSET_pAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("pAccelerationStructures"));
    /// The memory layout of `pAccelerationStructures`.
    public static final MemoryLayout LAYOUT_pAccelerationStructures = LAYOUT.select(PathElement.groupElement("pAccelerationStructures"));
    /// The [VarHandle] of `pAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAccelerationStructures"));

    /// Creates `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment.
    /// @param segment the memory segment
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetPartitionedAccelerationStructureNV`
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteDescriptorSetPartitionedAccelerationStructureNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetPartitionedAccelerationStructureNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV copyFrom(VkWriteDescriptorSetPartitionedAccelerationStructureNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructureCount(MemorySegment segment, long index) { return (int) VH_accelerationStructureCount.get(segment, 0L, index); }
    /// {@return `accelerationStructureCount`}
    public int accelerationStructureCount() { return accelerationStructureCount(this.segment(), 0L); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureCount(MemorySegment segment, long index, int value) { VH_accelerationStructureCount.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCount(int value) { accelerationStructureCount(this.segment(), 0L, value); return this; }

    /// {@return `pAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAccelerationStructures(MemorySegment segment, long index) { return (MemorySegment) VH_pAccelerationStructures.get(segment, 0L, index); }
    /// {@return `pAccelerationStructures`}
    public MemorySegment pAccelerationStructures() { return pAccelerationStructures(this.segment(), 0L); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAccelerationStructures(MemorySegment segment, long index, MemorySegment value) { VH_pAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructures(MemorySegment value) { pAccelerationStructures(this.segment(), 0L, value); return this; }

    /// A buffer of [VkWriteDescriptorSetPartitionedAccelerationStructureNV].
    public static final class Buffer extends VkWriteDescriptorSetPartitionedAccelerationStructureNV {
        private final long elementCount;

        /// Creates `VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWriteDescriptorSetPartitionedAccelerationStructureNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWriteDescriptorSetPartitionedAccelerationStructureNV`
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV asSlice(long index) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWriteDescriptorSetPartitionedAccelerationStructureNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWriteDescriptorSetPartitionedAccelerationStructureNV`
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

        /// {@return `accelerationStructureCount` at the given index}
        /// @param index the index of the struct buffer
        public int accelerationStructureCountAt(long index) { return accelerationStructureCount(this.segment(), index); }
        /// Sets `accelerationStructureCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureCountAt(long index, int value) { accelerationStructureCount(this.segment(), index, value); return this; }

        /// {@return `pAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAccelerationStructuresAt(long index) { return pAccelerationStructures(this.segment(), index); }
        /// Sets `pAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAccelerationStructuresAt(long index, MemorySegment value) { pAccelerationStructures(this.segment(), index, value); return this; }

    }
}
