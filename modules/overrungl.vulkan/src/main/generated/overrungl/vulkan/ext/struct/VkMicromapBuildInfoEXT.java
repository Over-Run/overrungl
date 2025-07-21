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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMicromapBuildInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkMicromapTypeEXT type;
///     ((uint32_t) VkFlags) VkBuildMicromapFlagsEXT flags;
///     (int) VkBuildMicromapModeEXT mode;
///     (uint64_t) VkMicromapEXT dstMicromap;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const * ppUsageCounts;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR data;
///     (union VkDeviceOrHostAddressKHR) VkDeviceOrHostAddressKHR scratchData;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR triangleArray;
///     (uint64_t) VkDeviceSize triangleArrayStride;
/// };
/// ```
public final class VkMicromapBuildInfoEXT extends GroupType {
    /// The struct layout of `VkMicromapBuildInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_LONG.withName("dstMicromap"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
        ValueLayout.JAVA_LONG.withName("triangleArrayStride")
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
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The byte offset of `dstMicromap`.
    public static final long OFFSET_dstMicromap = LAYOUT.byteOffset(PathElement.groupElement("dstMicromap"));
    /// The memory layout of `dstMicromap`.
    public static final MemoryLayout LAYOUT_dstMicromap = LAYOUT.select(PathElement.groupElement("dstMicromap"));
    /// The [VarHandle] of `dstMicromap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstMicromap"));
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
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    /// The byte offset of `triangleArray`.
    public static final long OFFSET_triangleArray = LAYOUT.byteOffset(PathElement.groupElement("triangleArray"));
    /// The memory layout of `triangleArray`.
    public static final MemoryLayout LAYOUT_triangleArray = LAYOUT.select(PathElement.groupElement("triangleArray"));
    /// The byte offset of `triangleArrayStride`.
    public static final long OFFSET_triangleArrayStride = LAYOUT.byteOffset(PathElement.groupElement("triangleArrayStride"));
    /// The memory layout of `triangleArrayStride`.
    public static final MemoryLayout LAYOUT_triangleArrayStride = LAYOUT.select(PathElement.groupElement("triangleArrayStride"));
    /// The [VarHandle] of `triangleArrayStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_triangleArrayStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleArrayStride"));

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMicromapBuildInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @param data `data`
    /// @param scratchData `scratchData`
    /// @param triangleArray `triangleArray`
    /// @param triangleArrayStride `triangleArrayStride`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts, MemorySegment data, MemorySegment scratchData, MemorySegment triangleArray, long triangleArrayStride) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).data(data).scratchData(scratchData).triangleArray(triangleArray).triangleArrayStride(triangleArrayStride);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @param data `data`
    /// @param scratchData `scratchData`
    /// @param triangleArray `triangleArray`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts, MemorySegment data, MemorySegment scratchData, MemorySegment triangleArray) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).data(data).scratchData(scratchData).triangleArray(triangleArray);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @param data `data`
    /// @param scratchData `scratchData`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts, MemorySegment data, MemorySegment scratchData) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).data(data).scratchData(scratchData);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @param data `data`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts, MemorySegment data) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).data(data);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @param ppUsageCounts `ppUsageCounts`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts, MemorySegment ppUsageCounts) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @param pUsageCounts `pUsageCounts`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, MemorySegment pUsageCounts) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @param usageCountsCount `usageCountsCount`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap).usageCountsCount(usageCountsCount);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param dstMicromap `dstMicromap`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long dstMicromap) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).dstMicromap(dstMicromap);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapBuildInfoEXT copyFrom(VkMicromapBuildInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMicromapBuildInfoEXT reinterpret(long count) { return new VkMicromapBuildInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMicromapBuildInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT type(int value) { type(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// {@return `dstMicromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstMicromap(MemorySegment segment, long index) { return (long) VH_dstMicromap.get(segment, 0L, index); }
    /// {@return `dstMicromap`}
    public long dstMicromap() { return dstMicromap(this.segment(), 0L); }
    /// Sets `dstMicromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstMicromap(MemorySegment segment, long index, long value) { VH_dstMicromap.set(segment, 0L, index, value); }
    /// Sets `dstMicromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dstMicromap(long value) { dstMicromap(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildInfoEXT usageCountsCount(int value) { usageCountsCount(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildInfoEXT pUsageCounts(MemorySegment value) { pUsageCounts(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildInfoEXT ppUsageCounts(MemorySegment value) { ppUsageCounts(this.segment(), 0L, value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), LAYOUT_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT data(MemorySegment value) { data(this.segment(), 0L, value); return this; }
    /// Accepts `data` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT data(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(data())); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment scratchData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    /// {@return `scratchData`}
    public MemorySegment scratchData() { return scratchData(this.segment(), 0L); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData.byteSize()); }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchData(MemorySegment value) { scratchData(this.segment(), 0L, value); return this; }
    /// Accepts `scratchData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.of(scratchData())); return this; }

    /// {@return `triangleArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment triangleArray(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangleArray, index), LAYOUT_triangleArray); }
    /// {@return `triangleArray`}
    public MemorySegment triangleArray() { return triangleArray(this.segment(), 0L); }
    /// Sets `triangleArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void triangleArray(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangleArray, index), LAYOUT_triangleArray.byteSize()); }
    /// Sets `triangleArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArray(MemorySegment value) { triangleArray(this.segment(), 0L, value); return this; }
    /// Accepts `triangleArray` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArray(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(triangleArray())); return this; }

    /// {@return `triangleArrayStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long triangleArrayStride(MemorySegment segment, long index) { return (long) VH_triangleArrayStride.get(segment, 0L, index); }
    /// {@return `triangleArrayStride`}
    public long triangleArrayStride() { return triangleArrayStride(this.segment(), 0L); }
    /// Sets `triangleArrayStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void triangleArrayStride(MemorySegment segment, long index, long value) { VH_triangleArrayStride.set(segment, 0L, index, value); }
    /// Sets `triangleArrayStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayStride(long value) { triangleArrayStride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMicromapBuildInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapBuildInfoEXT`
    public VkMicromapBuildInfoEXT asSlice(long index) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMicromapBuildInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapBuildInfoEXT`
    public VkMicromapBuildInfoEXT asSlice(long index, long count) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMicromapBuildInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMicromapBuildInfoEXT at(long index, Consumer<VkMicromapBuildInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

    /// {@return `dstMicromap` at the given index}
    /// @param index the index of the struct buffer
    public long dstMicromapAt(long index) { return dstMicromap(this.segment(), index); }
    /// Sets `dstMicromap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dstMicromapAt(long index, long value) { dstMicromap(this.segment(), index, value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param index the index of the struct buffer
    public int usageCountsCountAt(long index) { return usageCountsCount(this.segment(), index); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT usageCountsCountAt(long index, int value) { usageCountsCount(this.segment(), index, value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUsageCountsAt(long index) { return pUsageCounts(this.segment(), index); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pUsageCountsAt(long index, MemorySegment value) { pUsageCounts(this.segment(), index, value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppUsageCountsAt(long index) { return ppUsageCounts(this.segment(), index); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT ppUsageCountsAt(long index, MemorySegment value) { ppUsageCounts(this.segment(), index, value); return this; }

    /// {@return `data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dataAt(long index) { return data(this.segment(), index); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }
    /// Accepts `data` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT dataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(dataAt(index))); return this; }

    /// {@return `scratchData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment scratchDataAt(long index) { return scratchData(this.segment(), index); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchDataAt(long index, MemorySegment value) { scratchData(this.segment(), index, value); return this; }
    /// Accepts `scratchData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.of(scratchDataAt(index))); return this; }

    /// {@return `triangleArray` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment triangleArrayAt(long index) { return triangleArray(this.segment(), index); }
    /// Sets `triangleArray` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayAt(long index, MemorySegment value) { triangleArray(this.segment(), index, value); return this; }
    /// Accepts `triangleArray` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(triangleArrayAt(index))); return this; }

    /// {@return `triangleArrayStride` at the given index}
    /// @param index the index of the struct buffer
    public long triangleArrayStrideAt(long index) { return triangleArrayStride(this.segment(), index); }
    /// Sets `triangleArrayStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayStrideAt(long index, long value) { triangleArrayStride(this.segment(), index, value); return this; }

}
