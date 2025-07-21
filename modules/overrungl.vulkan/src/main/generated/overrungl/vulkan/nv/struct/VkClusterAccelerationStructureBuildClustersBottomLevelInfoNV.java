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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV {
///     uint32_t clusterReferencesCount;
///     uint32_t clusterReferencesStride;
///     (uint64_t) VkDeviceAddress clusterReferences;
/// };
/// ```
public final class VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("clusterReferencesCount"),
        ValueLayout.JAVA_INT.withName("clusterReferencesStride"),
        ValueLayout.JAVA_LONG.withName("clusterReferences")
    );
    /// The byte offset of `clusterReferencesCount`.
    public static final long OFFSET_clusterReferencesCount = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesCount"));
    /// The memory layout of `clusterReferencesCount`.
    public static final MemoryLayout LAYOUT_clusterReferencesCount = LAYOUT.select(PathElement.groupElement("clusterReferencesCount"));
    /// The [VarHandle] of `clusterReferencesCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterReferencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferencesCount"));
    /// The byte offset of `clusterReferencesStride`.
    public static final long OFFSET_clusterReferencesStride = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesStride"));
    /// The memory layout of `clusterReferencesStride`.
    public static final MemoryLayout LAYOUT_clusterReferencesStride = LAYOUT.select(PathElement.groupElement("clusterReferencesStride"));
    /// The [VarHandle] of `clusterReferencesStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterReferencesStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferencesStride"));
    /// The byte offset of `clusterReferences`.
    public static final long OFFSET_clusterReferences = LAYOUT.byteOffset(PathElement.groupElement("clusterReferences"));
    /// The memory layout of `clusterReferences`.
    public static final MemoryLayout LAYOUT_clusterReferences = LAYOUT.select(PathElement.groupElement("clusterReferences"));
    /// The [VarHandle] of `clusterReferences` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterReferences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferences"));

    /// Creates `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param clusterReferencesCount `clusterReferencesCount`
    /// @param clusterReferencesStride `clusterReferencesStride`
    /// @param clusterReferences `clusterReferences`
    /// @return the allocated `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV allocInit(SegmentAllocator allocator, int clusterReferencesCount, int clusterReferencesStride, long clusterReferences) {
        return alloc(allocator).clusterReferencesCount(clusterReferencesCount).clusterReferencesStride(clusterReferencesStride).clusterReferences(clusterReferences);
    }

    /// Allocates a `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param clusterReferencesCount `clusterReferencesCount`
    /// @param clusterReferencesStride `clusterReferencesStride`
    /// @return the allocated `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV allocInit(SegmentAllocator allocator, int clusterReferencesCount, int clusterReferencesStride) {
        return alloc(allocator).clusterReferencesCount(clusterReferencesCount).clusterReferencesStride(clusterReferencesStride);
    }

    /// Allocates a `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param clusterReferencesCount `clusterReferencesCount`
    /// @return the allocated `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV allocInit(SegmentAllocator allocator, int clusterReferencesCount) {
        return alloc(allocator).clusterReferencesCount(clusterReferencesCount);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV copyFrom(VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `clusterReferencesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterReferencesCount(MemorySegment segment, long index) { return (int) VH_clusterReferencesCount.get(segment, 0L, index); }
    /// {@return `clusterReferencesCount`}
    public int clusterReferencesCount() { return clusterReferencesCount(this.segment(), 0L); }
    /// Sets `clusterReferencesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterReferencesCount(MemorySegment segment, long index, int value) { VH_clusterReferencesCount.set(segment, 0L, index, value); }
    /// Sets `clusterReferencesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCount(int value) { clusterReferencesCount(this.segment(), 0L, value); return this; }

    /// {@return `clusterReferencesStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterReferencesStride(MemorySegment segment, long index) { return (int) VH_clusterReferencesStride.get(segment, 0L, index); }
    /// {@return `clusterReferencesStride`}
    public int clusterReferencesStride() { return clusterReferencesStride(this.segment(), 0L); }
    /// Sets `clusterReferencesStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterReferencesStride(MemorySegment segment, long index, int value) { VH_clusterReferencesStride.set(segment, 0L, index, value); }
    /// Sets `clusterReferencesStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStride(int value) { clusterReferencesStride(this.segment(), 0L, value); return this; }

    /// {@return `clusterReferences` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long clusterReferences(MemorySegment segment, long index) { return (long) VH_clusterReferences.get(segment, 0L, index); }
    /// {@return `clusterReferences`}
    public long clusterReferences() { return clusterReferences(this.segment(), 0L); }
    /// Sets `clusterReferences` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterReferences(MemorySegment segment, long index, long value) { VH_clusterReferences.set(segment, 0L, index, value); }
    /// Sets `clusterReferences` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferences(long value) { clusterReferences(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV asSlice(long index) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV at(long index, Consumer<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `clusterReferencesCount` at the given index}
    /// @param index the index of the struct buffer
    public int clusterReferencesCountAt(long index) { return clusterReferencesCount(this.segment(), index); }
    /// Sets `clusterReferencesCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCountAt(long index, int value) { clusterReferencesCount(this.segment(), index, value); return this; }

    /// {@return `clusterReferencesStride` at the given index}
    /// @param index the index of the struct buffer
    public int clusterReferencesStrideAt(long index) { return clusterReferencesStride(this.segment(), index); }
    /// Sets `clusterReferencesStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStrideAt(long index, int value) { clusterReferencesStride(this.segment(), index, value); return this; }

    /// {@return `clusterReferences` at the given index}
    /// @param index the index of the struct buffer
    public long clusterReferencesAt(long index) { return clusterReferences(this.segment(), index); }
    /// Sets `clusterReferences` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesAt(long index, long value) { clusterReferences(this.segment(), index, value); return this; }

}
