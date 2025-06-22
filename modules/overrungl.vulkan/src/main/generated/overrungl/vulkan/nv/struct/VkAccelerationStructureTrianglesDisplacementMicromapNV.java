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
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureTrianglesDisplacementMicromapNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFormat displacementBiasAndScaleFormat;
///     (int) VkFormat displacementVectorFormat;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer;
///     (uint64_t) VkDeviceSize displacementBiasAndScaleStride;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR displacementVectorBuffer;
///     (uint64_t) VkDeviceSize displacementVectorStride;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags;
///     (uint64_t) VkDeviceSize displacedMicromapPrimitiveFlagsStride;
///     (int) VkIndexType indexType;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR indexBuffer;
///     (uint64_t) VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const * ppUsageCounts;
///     (uint64_t) VkMicromapEXT micromap;
/// };
/// ```
public sealed class VkAccelerationStructureTrianglesDisplacementMicromapNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementBiasAndScaleFormat"),
        ValueLayout.JAVA_INT.withName("displacementVectorFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementBiasAndScaleBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementBiasAndScaleStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementVectorBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementVectorStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacedMicromapPrimitiveFlags"),
        ValueLayout.JAVA_LONG.withName("displacedMicromapPrimitiveFlagsStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        ValueLayout.JAVA_LONG.withName("micromap")
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
    /// The byte offset of `displacementBiasAndScaleFormat`.
    public static final long OFFSET_displacementBiasAndScaleFormat = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleFormat"));
    /// The memory layout of `displacementBiasAndScaleFormat`.
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleFormat = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleFormat"));
    /// The [VarHandle] of `displacementBiasAndScaleFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displacementBiasAndScaleFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleFormat"));
    /// The byte offset of `displacementVectorFormat`.
    public static final long OFFSET_displacementVectorFormat = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorFormat"));
    /// The memory layout of `displacementVectorFormat`.
    public static final MemoryLayout LAYOUT_displacementVectorFormat = LAYOUT.select(PathElement.groupElement("displacementVectorFormat"));
    /// The [VarHandle] of `displacementVectorFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displacementVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorFormat"));
    /// The byte offset of `displacementBiasAndScaleBuffer`.
    public static final long OFFSET_displacementBiasAndScaleBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    /// The memory layout of `displacementBiasAndScaleBuffer`.
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleBuffer = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    /// The byte offset of `displacementBiasAndScaleStride`.
    public static final long OFFSET_displacementBiasAndScaleStride = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleStride"));
    /// The memory layout of `displacementBiasAndScaleStride`.
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleStride = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleStride"));
    /// The [VarHandle] of `displacementBiasAndScaleStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displacementBiasAndScaleStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleStride"));
    /// The byte offset of `displacementVectorBuffer`.
    public static final long OFFSET_displacementVectorBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorBuffer"));
    /// The memory layout of `displacementVectorBuffer`.
    public static final MemoryLayout LAYOUT_displacementVectorBuffer = LAYOUT.select(PathElement.groupElement("displacementVectorBuffer"));
    /// The byte offset of `displacementVectorStride`.
    public static final long OFFSET_displacementVectorStride = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorStride"));
    /// The memory layout of `displacementVectorStride`.
    public static final MemoryLayout LAYOUT_displacementVectorStride = LAYOUT.select(PathElement.groupElement("displacementVectorStride"));
    /// The [VarHandle] of `displacementVectorStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displacementVectorStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorStride"));
    /// The byte offset of `displacedMicromapPrimitiveFlags`.
    public static final long OFFSET_displacedMicromapPrimitiveFlags = LAYOUT.byteOffset(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    /// The memory layout of `displacedMicromapPrimitiveFlags`.
    public static final MemoryLayout LAYOUT_displacedMicromapPrimitiveFlags = LAYOUT.select(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    /// The byte offset of `displacedMicromapPrimitiveFlagsStride`.
    public static final long OFFSET_displacedMicromapPrimitiveFlagsStride = LAYOUT.byteOffset(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
    /// The memory layout of `displacedMicromapPrimitiveFlagsStride`.
    public static final MemoryLayout LAYOUT_displacedMicromapPrimitiveFlagsStride = LAYOUT.select(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
    /// The [VarHandle] of `displacedMicromapPrimitiveFlagsStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displacedMicromapPrimitiveFlagsStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexBuffer`.
    public static final long OFFSET_indexBuffer = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
    /// The memory layout of `indexBuffer`.
    public static final MemoryLayout LAYOUT_indexBuffer = LAYOUT.select(PathElement.groupElement("indexBuffer"));
    /// The byte offset of `indexStride`.
    public static final long OFFSET_indexStride = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
    /// The memory layout of `indexStride`.
    public static final MemoryLayout LAYOUT_indexStride = LAYOUT.select(PathElement.groupElement("indexStride"));
    /// The [VarHandle] of `indexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));
    /// The byte offset of `baseTriangle`.
    public static final long OFFSET_baseTriangle = LAYOUT.byteOffset(PathElement.groupElement("baseTriangle"));
    /// The memory layout of `baseTriangle`.
    public static final MemoryLayout LAYOUT_baseTriangle = LAYOUT.select(PathElement.groupElement("baseTriangle"));
    /// The [VarHandle] of `baseTriangle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseTriangle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseTriangle"));
    /// The byte offset of `usageCountsCount`.
    public static final long OFFSET_usageCountsCount = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
    /// The memory layout of `usageCountsCount`.
    public static final MemoryLayout LAYOUT_usageCountsCount = LAYOUT.select(PathElement.groupElement("usageCountsCount"));
    /// The [VarHandle] of `usageCountsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    /// The byte offset of `pUsageCounts`.
    public static final long OFFSET_pUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
    /// The memory layout of `pUsageCounts`.
    public static final MemoryLayout LAYOUT_pUsageCounts = LAYOUT.select(PathElement.groupElement("pUsageCounts"));
    /// The [VarHandle] of `pUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    /// The byte offset of `ppUsageCounts`.
    public static final long OFFSET_ppUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
    /// The memory layout of `ppUsageCounts`.
    public static final MemoryLayout LAYOUT_ppUsageCounts = LAYOUT.select(PathElement.groupElement("ppUsageCounts"));
    /// The [VarHandle] of `ppUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    /// The byte offset of `micromap`.
    public static final long OFFSET_micromap = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
    /// The memory layout of `micromap`.
    public static final MemoryLayout LAYOUT_micromap = LAYOUT.select(PathElement.groupElement("micromap"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @param baseTriangle `baseTriangle`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @param micromap `micromap`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride, int baseTriangle, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts, long micromap) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).micromap(micromap);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @param baseTriangle `baseTriangle`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride, int baseTriangle, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @param baseTriangle `baseTriangle`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride, int baseTriangle, int usageCountsCount, MemorySegment pUsageCounts) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @param baseTriangle `baseTriangle`
    /// @param usageCountsCount `usageCountsCount`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride, int baseTriangle, int usageCountsCount) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle).usageCountsCount(usageCountsCount);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @param baseTriangle `baseTriangle`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride, int baseTriangle) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @param indexStride `indexStride`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer, long indexStride) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @param indexBuffer `indexBuffer`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, MemorySegment indexBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @param indexType `indexType`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @param displacedMicromapPrimitiveFlagsStride `displacedMicromapPrimitiveFlagsStride`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @param displacedMicromapPrimitiveFlags `displacedMicromapPrimitiveFlags`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride, MemorySegment displacedMicromapPrimitiveFlags) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @param displacementVectorStride `displacementVectorStride`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer, long displacementVectorStride) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @param displacementVectorBuffer `displacementVectorBuffer`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, MemorySegment displacementVectorBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @param displacementBiasAndScaleStride `displacementBiasAndScaleStride`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @param displacementBiasAndScaleBuffer `displacementBiasAndScaleBuffer`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, MemorySegment displacementBiasAndScaleBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @param displacementVectorFormat `displacementVectorFormat`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param displacementBiasAndScaleFormat `displacementBiasAndScaleFormat`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int displacementBiasAndScaleFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV copyFrom(VkAccelerationStructureTrianglesDisplacementMicromapNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `displacementBiasAndScaleFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int displacementBiasAndScaleFormat(MemorySegment segment, long index) { return (int) VH_displacementBiasAndScaleFormat.get(segment, 0L, index); }
    /// {@return `displacementBiasAndScaleFormat`}
    public int displacementBiasAndScaleFormat() { return displacementBiasAndScaleFormat(this.segment(), 0L); }
    /// Sets `displacementBiasAndScaleFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementBiasAndScaleFormat(MemorySegment segment, long index, int value) { VH_displacementBiasAndScaleFormat.set(segment, 0L, index, value); }
    /// Sets `displacementBiasAndScaleFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(int value) { displacementBiasAndScaleFormat(this.segment(), 0L, value); return this; }

    /// {@return `displacementVectorFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int displacementVectorFormat(MemorySegment segment, long index) { return (int) VH_displacementVectorFormat.get(segment, 0L, index); }
    /// {@return `displacementVectorFormat`}
    public int displacementVectorFormat() { return displacementVectorFormat(this.segment(), 0L); }
    /// Sets `displacementVectorFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementVectorFormat(MemorySegment segment, long index, int value) { VH_displacementVectorFormat.set(segment, 0L, index, value); }
    /// Sets `displacementVectorFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(int value) { displacementVectorFormat(this.segment(), 0L, value); return this; }

    /// {@return `displacementBiasAndScaleBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displacementBiasAndScaleBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacementBiasAndScaleBuffer, index), LAYOUT_displacementBiasAndScaleBuffer); }
    /// {@return `displacementBiasAndScaleBuffer`}
    public MemorySegment displacementBiasAndScaleBuffer() { return displacementBiasAndScaleBuffer(this.segment(), 0L); }
    /// Sets `displacementBiasAndScaleBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementBiasAndScaleBuffer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacementBiasAndScaleBuffer, index), LAYOUT_displacementBiasAndScaleBuffer.byteSize()); }
    /// Sets `displacementBiasAndScaleBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(MemorySegment value) { displacementBiasAndScaleBuffer(this.segment(), 0L, value); return this; }
    /// Accepts `displacementBiasAndScaleBuffer` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacementBiasAndScaleBuffer())); return this; }

    /// {@return `displacementBiasAndScaleStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displacementBiasAndScaleStride(MemorySegment segment, long index) { return (long) VH_displacementBiasAndScaleStride.get(segment, 0L, index); }
    /// {@return `displacementBiasAndScaleStride`}
    public long displacementBiasAndScaleStride() { return displacementBiasAndScaleStride(this.segment(), 0L); }
    /// Sets `displacementBiasAndScaleStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementBiasAndScaleStride(MemorySegment segment, long index, long value) { VH_displacementBiasAndScaleStride.set(segment, 0L, index, value); }
    /// Sets `displacementBiasAndScaleStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(long value) { displacementBiasAndScaleStride(this.segment(), 0L, value); return this; }

    /// {@return `displacementVectorBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displacementVectorBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacementVectorBuffer, index), LAYOUT_displacementVectorBuffer); }
    /// {@return `displacementVectorBuffer`}
    public MemorySegment displacementVectorBuffer() { return displacementVectorBuffer(this.segment(), 0L); }
    /// Sets `displacementVectorBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementVectorBuffer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacementVectorBuffer, index), LAYOUT_displacementVectorBuffer.byteSize()); }
    /// Sets `displacementVectorBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(MemorySegment value) { displacementVectorBuffer(this.segment(), 0L, value); return this; }
    /// Accepts `displacementVectorBuffer` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacementVectorBuffer())); return this; }

    /// {@return `displacementVectorStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displacementVectorStride(MemorySegment segment, long index) { return (long) VH_displacementVectorStride.get(segment, 0L, index); }
    /// {@return `displacementVectorStride`}
    public long displacementVectorStride() { return displacementVectorStride(this.segment(), 0L); }
    /// Sets `displacementVectorStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacementVectorStride(MemorySegment segment, long index, long value) { VH_displacementVectorStride.set(segment, 0L, index, value); }
    /// Sets `displacementVectorStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(long value) { displacementVectorStride(this.segment(), 0L, value); return this; }

    /// {@return `displacedMicromapPrimitiveFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displacedMicromapPrimitiveFlags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlags, index), LAYOUT_displacedMicromapPrimitiveFlags); }
    /// {@return `displacedMicromapPrimitiveFlags`}
    public MemorySegment displacedMicromapPrimitiveFlags() { return displacedMicromapPrimitiveFlags(this.segment(), 0L); }
    /// Sets `displacedMicromapPrimitiveFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacedMicromapPrimitiveFlags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlags, index), LAYOUT_displacedMicromapPrimitiveFlags.byteSize()); }
    /// Sets `displacedMicromapPrimitiveFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(MemorySegment value) { displacedMicromapPrimitiveFlags(this.segment(), 0L, value); return this; }
    /// Accepts `displacedMicromapPrimitiveFlags` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacedMicromapPrimitiveFlags())); return this; }

    /// {@return `displacedMicromapPrimitiveFlagsStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displacedMicromapPrimitiveFlagsStride(MemorySegment segment, long index) { return (long) VH_displacedMicromapPrimitiveFlagsStride.get(segment, 0L, index); }
    /// {@return `displacedMicromapPrimitiveFlagsStride`}
    public long displacedMicromapPrimitiveFlagsStride() { return displacedMicromapPrimitiveFlagsStride(this.segment(), 0L); }
    /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displacedMicromapPrimitiveFlagsStride(MemorySegment segment, long index, long value) { VH_displacedMicromapPrimitiveFlagsStride.set(segment, 0L, index, value); }
    /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(long value) { displacedMicromapPrimitiveFlagsStride(this.segment(), 0L, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    public int indexType() { return indexType(this.segment(), 0L); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexType(MemorySegment segment, long index, int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment indexBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer); }
    /// {@return `indexBuffer`}
    public MemorySegment indexBuffer() { return indexBuffer(this.segment(), 0L); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexBuffer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer.byteSize()); }
    /// Sets `indexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(MemorySegment value) { indexBuffer(this.segment(), 0L, value); return this; }
    /// Accepts `indexBuffer` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexBuffer())); return this; }

    /// {@return `indexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indexStride(MemorySegment segment, long index) { return (long) VH_indexStride.get(segment, 0L, index); }
    /// {@return `indexStride`}
    public long indexStride() { return indexStride(this.segment(), 0L); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexStride(MemorySegment segment, long index, long value) { VH_indexStride.set(segment, 0L, index, value); }
    /// Sets `indexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(long value) { indexStride(this.segment(), 0L, value); return this; }

    /// {@return `baseTriangle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseTriangle(MemorySegment segment, long index) { return (int) VH_baseTriangle.get(segment, 0L, index); }
    /// {@return `baseTriangle`}
    public int baseTriangle() { return baseTriangle(this.segment(), 0L); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseTriangle(MemorySegment segment, long index, int value) { VH_baseTriangle.set(segment, 0L, index, value); }
    /// Sets `baseTriangle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(int value) { baseTriangle(this.segment(), 0L, value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usageCountsCount(MemorySegment segment, long index) { return (int) VH_usageCountsCount.get(segment, 0L, index); }
    /// {@return `usageCountsCount`}
    public int usageCountsCount() { return usageCountsCount(this.segment(), 0L); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usageCountsCount(MemorySegment segment, long index, int value) { VH_usageCountsCount.set(segment, 0L, index, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(int value) { usageCountsCount(this.segment(), 0L, value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_pUsageCounts.get(segment, 0L, index); }
    /// {@return `pUsageCounts`}
    public MemorySegment pUsageCounts() { return pUsageCounts(this.segment(), 0L); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUsageCounts(MemorySegment segment, long index, MemorySegment value) { VH_pUsageCounts.set(segment, 0L, index, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(MemorySegment value) { pUsageCounts(this.segment(), 0L, value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_ppUsageCounts.get(segment, 0L, index); }
    /// {@return `ppUsageCounts`}
    public MemorySegment ppUsageCounts() { return ppUsageCounts(this.segment(), 0L); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppUsageCounts(MemorySegment segment, long index, MemorySegment value) { VH_ppUsageCounts.set(segment, 0L, index, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(MemorySegment value) { ppUsageCounts(this.segment(), 0L, value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long micromap(MemorySegment segment, long index) { return (long) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    public long micromap() { return micromap(this.segment(), 0L); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromap(MemorySegment segment, long index, long value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(long value) { micromap(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureTrianglesDisplacementMicromapNV].
    public static final class Buffer extends VkAccelerationStructureTrianglesDisplacementMicromapNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`
        public VkAccelerationStructureTrianglesDisplacementMicromapNV asSlice(long index) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`
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

        /// {@return `displacementBiasAndScaleFormat` at the given index}
        /// @param index the index of the struct buffer
        public int displacementBiasAndScaleFormatAt(long index) { return displacementBiasAndScaleFormat(this.segment(), index); }
        /// Sets `displacementBiasAndScaleFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleFormatAt(long index, int value) { displacementBiasAndScaleFormat(this.segment(), index, value); return this; }

        /// {@return `displacementVectorFormat` at the given index}
        /// @param index the index of the struct buffer
        public int displacementVectorFormatAt(long index) { return displacementVectorFormat(this.segment(), index); }
        /// Sets `displacementVectorFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorFormatAt(long index, int value) { displacementVectorFormat(this.segment(), index, value); return this; }

        /// {@return `displacementBiasAndScaleBuffer` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment displacementBiasAndScaleBufferAt(long index) { return displacementBiasAndScaleBuffer(this.segment(), index); }
        /// Sets `displacementBiasAndScaleBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleBufferAt(long index, MemorySegment value) { displacementBiasAndScaleBuffer(this.segment(), index, value); return this; }
        /// Accepts `displacementBiasAndScaleBuffer` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer displacementBiasAndScaleBufferAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacementBiasAndScaleBufferAt(index))); return this; }

        /// {@return `displacementBiasAndScaleStride` at the given index}
        /// @param index the index of the struct buffer
        public long displacementBiasAndScaleStrideAt(long index) { return displacementBiasAndScaleStride(this.segment(), index); }
        /// Sets `displacementBiasAndScaleStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleStrideAt(long index, long value) { displacementBiasAndScaleStride(this.segment(), index, value); return this; }

        /// {@return `displacementVectorBuffer` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment displacementVectorBufferAt(long index) { return displacementVectorBuffer(this.segment(), index); }
        /// Sets `displacementVectorBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorBufferAt(long index, MemorySegment value) { displacementVectorBuffer(this.segment(), index, value); return this; }
        /// Accepts `displacementVectorBuffer` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer displacementVectorBufferAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacementVectorBufferAt(index))); return this; }

        /// {@return `displacementVectorStride` at the given index}
        /// @param index the index of the struct buffer
        public long displacementVectorStrideAt(long index) { return displacementVectorStride(this.segment(), index); }
        /// Sets `displacementVectorStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorStrideAt(long index, long value) { displacementVectorStride(this.segment(), index, value); return this; }

        /// {@return `displacedMicromapPrimitiveFlags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment displacedMicromapPrimitiveFlagsAt(long index) { return displacedMicromapPrimitiveFlags(this.segment(), index); }
        /// Sets `displacedMicromapPrimitiveFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacedMicromapPrimitiveFlagsAt(long index, MemorySegment value) { displacedMicromapPrimitiveFlags(this.segment(), index, value); return this; }
        /// Accepts `displacedMicromapPrimitiveFlags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer displacedMicromapPrimitiveFlagsAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(displacedMicromapPrimitiveFlagsAt(index))); return this; }

        /// {@return `displacedMicromapPrimitiveFlagsStride` at the given index}
        /// @param index the index of the struct buffer
        public long displacedMicromapPrimitiveFlagsStrideAt(long index) { return displacedMicromapPrimitiveFlagsStride(this.segment(), index); }
        /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displacedMicromapPrimitiveFlagsStrideAt(long index, long value) { displacedMicromapPrimitiveFlagsStride(this.segment(), index, value); return this; }

        /// {@return `indexType` at the given index}
        /// @param index the index of the struct buffer
        public int indexTypeAt(long index) { return indexType(this.segment(), index); }
        /// Sets `indexType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

        /// {@return `indexBuffer` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment indexBufferAt(long index) { return indexBuffer(this.segment(), index); }
        /// Sets `indexBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indexBufferAt(long index, MemorySegment value) { indexBuffer(this.segment(), index, value); return this; }
        /// Accepts `indexBuffer` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer indexBufferAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexBufferAt(index))); return this; }

        /// {@return `indexStride` at the given index}
        /// @param index the index of the struct buffer
        public long indexStrideAt(long index) { return indexStride(this.segment(), index); }
        /// Sets `indexStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indexStrideAt(long index, long value) { indexStride(this.segment(), index, value); return this; }

        /// {@return `baseTriangle` at the given index}
        /// @param index the index of the struct buffer
        public int baseTriangleAt(long index) { return baseTriangle(this.segment(), index); }
        /// Sets `baseTriangle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer baseTriangleAt(long index, int value) { baseTriangle(this.segment(), index, value); return this; }

        /// {@return `usageCountsCount` at the given index}
        /// @param index the index of the struct buffer
        public int usageCountsCountAt(long index) { return usageCountsCount(this.segment(), index); }
        /// Sets `usageCountsCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer usageCountsCountAt(long index, int value) { usageCountsCount(this.segment(), index, value); return this; }

        /// {@return `pUsageCounts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pUsageCountsAt(long index) { return pUsageCounts(this.segment(), index); }
        /// Sets `pUsageCounts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pUsageCountsAt(long index, MemorySegment value) { pUsageCounts(this.segment(), index, value); return this; }

        /// {@return `ppUsageCounts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment ppUsageCountsAt(long index) { return ppUsageCounts(this.segment(), index); }
        /// Sets `ppUsageCounts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ppUsageCountsAt(long index, MemorySegment value) { ppUsageCounts(this.segment(), index, value); return this; }

        /// {@return `micromap` at the given index}
        /// @param index the index of the struct buffer
        public long micromapAt(long index) { return micromap(this.segment(), index); }
        /// Sets `micromap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer micromapAt(long index, long value) { micromap(this.segment(), index, value); return this; }

    }
}
