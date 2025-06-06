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
/// struct VkPartitionedAccelerationStructureInstancesInputNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkBuildAccelerationStructureFlagsKHR flags;
///     uint32_t instanceCount;
///     uint32_t maxInstancePerPartitionCount;
///     uint32_t partitionCount;
///     uint32_t maxInstanceInGlobalPartitionCount;
/// };
/// ```
public sealed class VkPartitionedAccelerationStructureInstancesInputNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureInstancesInputNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("maxInstancePerPartitionCount"),
        ValueLayout.JAVA_INT.withName("partitionCount"),
        ValueLayout.JAVA_INT.withName("maxInstanceInGlobalPartitionCount")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `instanceCount`.
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    /// The memory layout of `instanceCount`.
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The byte offset of `maxInstancePerPartitionCount`.
    public static final long OFFSET_maxInstancePerPartitionCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstancePerPartitionCount"));
    /// The memory layout of `maxInstancePerPartitionCount`.
    public static final MemoryLayout LAYOUT_maxInstancePerPartitionCount = LAYOUT.select(PathElement.groupElement("maxInstancePerPartitionCount"));
    /// The [VarHandle] of `maxInstancePerPartitionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInstancePerPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstancePerPartitionCount"));
    /// The byte offset of `partitionCount`.
    public static final long OFFSET_partitionCount = LAYOUT.byteOffset(PathElement.groupElement("partitionCount"));
    /// The memory layout of `partitionCount`.
    public static final MemoryLayout LAYOUT_partitionCount = LAYOUT.select(PathElement.groupElement("partitionCount"));
    /// The [VarHandle] of `partitionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_partitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionCount"));
    /// The byte offset of `maxInstanceInGlobalPartitionCount`.
    public static final long OFFSET_maxInstanceInGlobalPartitionCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
    /// The memory layout of `maxInstanceInGlobalPartitionCount`.
    public static final MemoryLayout LAYOUT_maxInstanceInGlobalPartitionCount = LAYOUT.select(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
    /// The [VarHandle] of `maxInstanceInGlobalPartitionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInstanceInGlobalPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));

    /// Creates `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment.
    /// @param segment the memory segment
    public VkPartitionedAccelerationStructureInstancesInputNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureInstancesInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureInstancesInputNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureInstancesInputNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param instanceCount `instanceCount`
    /// @param maxInstancePerPartitionCount `maxInstancePerPartitionCount`
    /// @param partitionCount `partitionCount`
    /// @param maxInstanceInGlobalPartitionCount `maxInstanceInGlobalPartitionCount`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int instanceCount, int maxInstancePerPartitionCount, int partitionCount, int maxInstanceInGlobalPartitionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).instanceCount(instanceCount).maxInstancePerPartitionCount(maxInstancePerPartitionCount).partitionCount(partitionCount).maxInstanceInGlobalPartitionCount(maxInstanceInGlobalPartitionCount);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param instanceCount `instanceCount`
    /// @param maxInstancePerPartitionCount `maxInstancePerPartitionCount`
    /// @param partitionCount `partitionCount`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int instanceCount, int maxInstancePerPartitionCount, int partitionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).instanceCount(instanceCount).maxInstancePerPartitionCount(maxInstancePerPartitionCount).partitionCount(partitionCount);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param instanceCount `instanceCount`
    /// @param maxInstancePerPartitionCount `maxInstancePerPartitionCount`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int instanceCount, int maxInstancePerPartitionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).instanceCount(instanceCount).maxInstancePerPartitionCount(maxInstancePerPartitionCount);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param instanceCount `instanceCount`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int instanceCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).instanceCount(instanceCount);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPartitionedAccelerationStructureInstancesInputNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPartitionedAccelerationStructureInstancesInputNV`
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureInstancesInputNV copyFrom(VkPartitionedAccelerationStructureInstancesInputNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPartitionedAccelerationStructureInstancesInputNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPartitionedAccelerationStructureInstancesInputNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPartitionedAccelerationStructureInstancesInputNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    public int instanceCount() { return instanceCount(this.segment(), 0L); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceCount(MemorySegment segment, long index, int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureInstancesInputNV instanceCount(int value) { instanceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxInstancePerPartitionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInstancePerPartitionCount(MemorySegment segment, long index) { return (int) VH_maxInstancePerPartitionCount.get(segment, 0L, index); }
    /// {@return `maxInstancePerPartitionCount`}
    public int maxInstancePerPartitionCount() { return maxInstancePerPartitionCount(this.segment(), 0L); }
    /// Sets `maxInstancePerPartitionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInstancePerPartitionCount(MemorySegment segment, long index, int value) { VH_maxInstancePerPartitionCount.set(segment, 0L, index, value); }
    /// Sets `maxInstancePerPartitionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(int value) { maxInstancePerPartitionCount(this.segment(), 0L, value); return this; }

    /// {@return `partitionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int partitionCount(MemorySegment segment, long index) { return (int) VH_partitionCount.get(segment, 0L, index); }
    /// {@return `partitionCount`}
    public int partitionCount() { return partitionCount(this.segment(), 0L); }
    /// Sets `partitionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionCount(MemorySegment segment, long index, int value) { VH_partitionCount.set(segment, 0L, index, value); }
    /// Sets `partitionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureInstancesInputNV partitionCount(int value) { partitionCount(this.segment(), 0L, value); return this; }

    /// {@return `maxInstanceInGlobalPartitionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInstanceInGlobalPartitionCount(MemorySegment segment, long index) { return (int) VH_maxInstanceInGlobalPartitionCount.get(segment, 0L, index); }
    /// {@return `maxInstanceInGlobalPartitionCount`}
    public int maxInstanceInGlobalPartitionCount() { return maxInstanceInGlobalPartitionCount(this.segment(), 0L); }
    /// Sets `maxInstanceInGlobalPartitionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInstanceInGlobalPartitionCount(MemorySegment segment, long index, int value) { VH_maxInstanceInGlobalPartitionCount.set(segment, 0L, index, value); }
    /// Sets `maxInstanceInGlobalPartitionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(int value) { maxInstanceInGlobalPartitionCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPartitionedAccelerationStructureInstancesInputNV].
    public static final class Buffer extends VkPartitionedAccelerationStructureInstancesInputNV {
        private final long elementCount;

        /// Creates `VkPartitionedAccelerationStructureInstancesInputNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPartitionedAccelerationStructureInstancesInputNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPartitionedAccelerationStructureInstancesInputNV`
        public VkPartitionedAccelerationStructureInstancesInputNV asSlice(long index) { return new VkPartitionedAccelerationStructureInstancesInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPartitionedAccelerationStructureInstancesInputNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPartitionedAccelerationStructureInstancesInputNV`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `instanceCount` at the given index}
        /// @param index the index of the struct buffer
        public int instanceCountAt(long index) { return instanceCount(this.segment(), index); }
        /// Sets `instanceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer instanceCountAt(long index, int value) { instanceCount(this.segment(), index, value); return this; }

        /// {@return `maxInstancePerPartitionCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxInstancePerPartitionCountAt(long index) { return maxInstancePerPartitionCount(this.segment(), index); }
        /// Sets `maxInstancePerPartitionCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxInstancePerPartitionCountAt(long index, int value) { maxInstancePerPartitionCount(this.segment(), index, value); return this; }

        /// {@return `partitionCount` at the given index}
        /// @param index the index of the struct buffer
        public int partitionCountAt(long index) { return partitionCount(this.segment(), index); }
        /// Sets `partitionCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer partitionCountAt(long index, int value) { partitionCount(this.segment(), index, value); return this; }

        /// {@return `maxInstanceInGlobalPartitionCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxInstanceInGlobalPartitionCountAt(long index) { return maxInstanceInGlobalPartitionCount(this.segment(), index); }
        /// Sets `maxInstanceInGlobalPartitionCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxInstanceInGlobalPartitionCountAt(long index, int value) { maxInstanceInGlobalPartitionCount(this.segment(), index, value); return this; }

    }
}
