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
package overrungl.vulkan.nv.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureOpInputNV`.
/// ## Layout
/// ```
/// union VkClusterAccelerationStructureOpInputNV {
///     VkClusterAccelerationStructureClustersBottomLevelInputNV* pClustersBottomLevel;
///     VkClusterAccelerationStructureTriangleClusterInputNV* pTriangleClusters;
///     VkClusterAccelerationStructureMoveObjectsInputNV* pMoveObjects;
/// };
/// ```
public final class VkClusterAccelerationStructureOpInputNV extends GroupType {
    /// The union layout of `VkClusterAccelerationStructureOpInputNV`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pClustersBottomLevel"),
        ValueLayout.ADDRESS.withName("pTriangleClusters"),
        ValueLayout.ADDRESS.withName("pMoveObjects")
    );
    /// The byte offset of `pClustersBottomLevel`.
    public static final long OFFSET_pClustersBottomLevel = LAYOUT.byteOffset(PathElement.groupElement("pClustersBottomLevel"));
    /// The memory layout of `pClustersBottomLevel`.
    public static final MemoryLayout LAYOUT_pClustersBottomLevel = LAYOUT.select(PathElement.groupElement("pClustersBottomLevel"));
    /// The [VarHandle] of `pClustersBottomLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pClustersBottomLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pClustersBottomLevel"));
    /// The byte offset of `pTriangleClusters`.
    public static final long OFFSET_pTriangleClusters = LAYOUT.byteOffset(PathElement.groupElement("pTriangleClusters"));
    /// The memory layout of `pTriangleClusters`.
    public static final MemoryLayout LAYOUT_pTriangleClusters = LAYOUT.select(PathElement.groupElement("pTriangleClusters"));
    /// The [VarHandle] of `pTriangleClusters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTriangleClusters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTriangleClusters"));
    /// The byte offset of `pMoveObjects`.
    public static final long OFFSET_pMoveObjects = LAYOUT.byteOffset(PathElement.groupElement("pMoveObjects"));
    /// The memory layout of `pMoveObjects`.
    public static final MemoryLayout LAYOUT_pMoveObjects = LAYOUT.select(PathElement.groupElement("pMoveObjects"));
    /// The [VarHandle] of `pMoveObjects` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMoveObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMoveObjects"));

    /// Creates `VkClusterAccelerationStructureOpInputNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkClusterAccelerationStructureOpInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureOpInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureOpInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureOpInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureOpInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureOpInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureOpInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureOpInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureOpInputNV`
    public static VkClusterAccelerationStructureOpInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureOpInputNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureOpInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureOpInputNV`
    public static VkClusterAccelerationStructureOpInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureOpInputNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV copyFrom(VkClusterAccelerationStructureOpInputNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureOpInputNV reinterpret(long count) { return new VkClusterAccelerationStructureOpInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pClustersBottomLevel` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pClustersBottomLevel(MemorySegment segment, long index) { return (MemorySegment) VH_pClustersBottomLevel.get(segment, 0L, index); }
    /// {@return `pClustersBottomLevel`}
    public MemorySegment pClustersBottomLevel() { return pClustersBottomLevel(this.segment(), 0L); }
    /// Sets `pClustersBottomLevel` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pClustersBottomLevel(MemorySegment segment, long index, MemorySegment value) { VH_pClustersBottomLevel.set(segment, 0L, index, value); }
    /// Sets `pClustersBottomLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(MemorySegment value) { pClustersBottomLevel(this.segment(), 0L, value); return this; }

    /// {@return `pTriangleClusters` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pTriangleClusters(MemorySegment segment, long index) { return (MemorySegment) VH_pTriangleClusters.get(segment, 0L, index); }
    /// {@return `pTriangleClusters`}
    public MemorySegment pTriangleClusters() { return pTriangleClusters(this.segment(), 0L); }
    /// Sets `pTriangleClusters` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pTriangleClusters(MemorySegment segment, long index, MemorySegment value) { VH_pTriangleClusters.set(segment, 0L, index, value); }
    /// Sets `pTriangleClusters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pTriangleClusters(MemorySegment value) { pTriangleClusters(this.segment(), 0L, value); return this; }

    /// {@return `pMoveObjects` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pMoveObjects(MemorySegment segment, long index) { return (MemorySegment) VH_pMoveObjects.get(segment, 0L, index); }
    /// {@return `pMoveObjects`}
    public MemorySegment pMoveObjects() { return pMoveObjects(this.segment(), 0L); }
    /// Sets `pMoveObjects` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pMoveObjects(MemorySegment segment, long index, MemorySegment value) { VH_pMoveObjects.set(segment, 0L, index, value); }
    /// Sets `pMoveObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pMoveObjects(MemorySegment value) { pMoveObjects(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureOpInputNV`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkClusterAccelerationStructureOpInputNV`
    public VkClusterAccelerationStructureOpInputNV asSlice(long index) { return new VkClusterAccelerationStructureOpInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureOpInputNV`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureOpInputNV`
    public VkClusterAccelerationStructureOpInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureOpInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureOpInputNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV at(long index, Consumer<VkClusterAccelerationStructureOpInputNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pClustersBottomLevel` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pClustersBottomLevelAt(long index) { return pClustersBottomLevel(this.segment(), index); }
    /// Sets `pClustersBottomLevel` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevelAt(long index, MemorySegment value) { pClustersBottomLevel(this.segment(), index, value); return this; }

    /// {@return `pTriangleClusters` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pTriangleClustersAt(long index) { return pTriangleClusters(this.segment(), index); }
    /// Sets `pTriangleClusters` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pTriangleClustersAt(long index, MemorySegment value) { pTriangleClusters(this.segment(), index, value); return this; }

    /// {@return `pMoveObjects` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pMoveObjectsAt(long index) { return pMoveObjects(this.segment(), index); }
    /// Sets `pMoveObjects` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureOpInputNV pMoveObjectsAt(long index, MemorySegment value) { pMoveObjects(this.segment(), index, value); return this; }

}
