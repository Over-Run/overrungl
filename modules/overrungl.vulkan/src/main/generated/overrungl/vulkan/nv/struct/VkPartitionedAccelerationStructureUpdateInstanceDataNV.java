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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureUpdateInstanceDataNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureUpdateInstanceDataNV {
///     uint32_t instanceIndex;
///     uint32_t instanceContributionToHitGroupIndex;
///     (uint64_t) VkDeviceAddress accelerationStructure;
/// };
/// ```
public final class VkPartitionedAccelerationStructureUpdateInstanceDataNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureUpdateInstanceDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("instanceIndex"),
        ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    /// The byte offset of `instanceIndex`.
    public static final long OFFSET_instanceIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
    /// The memory layout of `instanceIndex`.
    public static final MemoryLayout LAYOUT_instanceIndex = LAYOUT.select(PathElement.groupElement("instanceIndex"));
    /// The [VarHandle] of `instanceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceIndex"));
    /// The byte offset of `instanceContributionToHitGroupIndex`.
    public static final long OFFSET_instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The memory layout of `instanceContributionToHitGroupIndex`.
    public static final MemoryLayout LAYOUT_instanceContributionToHitGroupIndex = LAYOUT.select(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The [VarHandle] of `instanceContributionToHitGroupIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceContributionToHitGroupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    /// Creates `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureUpdateInstanceDataNV`
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPartitionedAccelerationStructureUpdateInstanceDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureUpdateInstanceDataNV`
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV copyFrom(VkPartitionedAccelerationStructureUpdateInstanceDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `instanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceIndex(MemorySegment segment, long index) { return (int) VH_instanceIndex.get(segment, 0L, index); }
    /// {@return `instanceIndex`}
    public int instanceIndex() { return instanceIndex(this.segment(), 0L); }
    /// Sets `instanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceIndex(MemorySegment segment, long index, int value) { VH_instanceIndex.set(segment, 0L, index, value); }
    /// Sets `instanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndex(int value) { instanceIndex(this.segment(), 0L, value); return this; }

    /// {@return `instanceContributionToHitGroupIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceContributionToHitGroupIndex(MemorySegment segment, long index) { return (int) VH_instanceContributionToHitGroupIndex.get(segment, 0L, index); }
    /// {@return `instanceContributionToHitGroupIndex`}
    public int instanceContributionToHitGroupIndex() { return instanceContributionToHitGroupIndex(this.segment(), 0L); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceContributionToHitGroupIndex(MemorySegment segment, long index, int value) { VH_instanceContributionToHitGroupIndex.set(segment, 0L, index, value); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndex(int value) { instanceContributionToHitGroupIndex(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructure(MemorySegment segment, long index) { return (long) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    public long accelerationStructure() { return accelerationStructure(this.segment(), 0L); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructure(MemorySegment segment, long index, long value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructure(long value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPartitionedAccelerationStructureUpdateInstanceDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPartitionedAccelerationStructureUpdateInstanceDataNV`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPartitionedAccelerationStructureUpdateInstanceDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPartitionedAccelerationStructureUpdateInstanceDataNV`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPartitionedAccelerationStructureUpdateInstanceDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV at(long index, Consumer<VkPartitionedAccelerationStructureUpdateInstanceDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `instanceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int instanceIndexAt(long index) { return instanceIndex(this.segment(), index); }
    /// Sets `instanceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndexAt(long index, int value) { instanceIndex(this.segment(), index, value); return this; }

    /// {@return `instanceContributionToHitGroupIndex` at the given index}
    /// @param index the index of the struct buffer
    public int instanceContributionToHitGroupIndexAt(long index) { return instanceContributionToHitGroupIndex(this.segment(), index); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndexAt(long index, int value) { instanceContributionToHitGroupIndex(this.segment(), index, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructureAt(long index, long value) { accelerationStructure(this.segment(), index, value); return this; }

}
