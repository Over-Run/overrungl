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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBindImageMemoryDeviceGroupInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
///     uint32_t splitInstanceBindRegionCount;
///     const VkRect2D* pSplitInstanceBindRegions;
/// };
/// ```
public final class VkBindImageMemoryDeviceGroupInfo extends GroupType {
    /// The struct layout of `VkBindImageMemoryDeviceGroupInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withName("pSplitInstanceBindRegions")
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
    /// The byte offset of `deviceIndexCount`.
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    /// The memory layout of `deviceIndexCount`.
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The byte offset of `pDeviceIndices`.
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    /// The memory layout of `pDeviceIndices`.
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));
    /// The byte offset of `splitInstanceBindRegionCount`.
    public static final long OFFSET_splitInstanceBindRegionCount = LAYOUT.byteOffset(PathElement.groupElement("splitInstanceBindRegionCount"));
    /// The memory layout of `splitInstanceBindRegionCount`.
    public static final MemoryLayout LAYOUT_splitInstanceBindRegionCount = LAYOUT.select(PathElement.groupElement("splitInstanceBindRegionCount"));
    /// The [VarHandle] of `splitInstanceBindRegionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_splitInstanceBindRegionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("splitInstanceBindRegionCount"));
    /// The byte offset of `pSplitInstanceBindRegions`.
    public static final long OFFSET_pSplitInstanceBindRegions = LAYOUT.byteOffset(PathElement.groupElement("pSplitInstanceBindRegions"));
    /// The memory layout of `pSplitInstanceBindRegions`.
    public static final MemoryLayout LAYOUT_pSplitInstanceBindRegions = LAYOUT.select(PathElement.groupElement("pSplitInstanceBindRegions"));
    /// The [VarHandle] of `pSplitInstanceBindRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSplitInstanceBindRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSplitInstanceBindRegions"));

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemoryDeviceGroupInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemoryDeviceGroupInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemoryDeviceGroupInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo alloc(SegmentAllocator allocator) { return new VkBindImageMemoryDeviceGroupInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo alloc(SegmentAllocator allocator, long count) { return new VkBindImageMemoryDeviceGroupInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @param pDeviceIndices `pDeviceIndices`
    /// @param splitInstanceBindRegionCount `splitInstanceBindRegionCount`
    /// @param pSplitInstanceBindRegions `pSplitInstanceBindRegions`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceIndexCount, MemorySegment pDeviceIndices, int splitInstanceBindRegionCount, MemorySegment pSplitInstanceBindRegions) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceIndexCount(deviceIndexCount).pDeviceIndices(pDeviceIndices).splitInstanceBindRegionCount(splitInstanceBindRegionCount).pSplitInstanceBindRegions(pSplitInstanceBindRegions);
    }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @param pDeviceIndices `pDeviceIndices`
    /// @param splitInstanceBindRegionCount `splitInstanceBindRegionCount`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceIndexCount, MemorySegment pDeviceIndices, int splitInstanceBindRegionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceIndexCount(deviceIndexCount).pDeviceIndices(pDeviceIndices).splitInstanceBindRegionCount(splitInstanceBindRegionCount);
    }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @param pDeviceIndices `pDeviceIndices`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceIndexCount, MemorySegment pDeviceIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceIndexCount(deviceIndexCount).pDeviceIndices(pDeviceIndices);
    }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceIndexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceIndexCount(deviceIndexCount);
    }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo copyFrom(VkBindImageMemoryDeviceGroupInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindImageMemoryDeviceGroupInfo reinterpret(long count) { return new VkBindImageMemoryDeviceGroupInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindImageMemoryDeviceGroupInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindImageMemoryDeviceGroupInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    public int deviceIndexCount() { return deviceIndexCount(this.segment(), 0L); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceIndexCount(MemorySegment segment, long index, int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo deviceIndexCount(int value) { deviceIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    public MemorySegment pDeviceIndices() { return pDeviceIndices(this.segment(), 0L); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceIndices(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(MemorySegment value) { pDeviceIndices(this.segment(), 0L, value); return this; }

    /// {@return `splitInstanceBindRegionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int splitInstanceBindRegionCount(MemorySegment segment, long index) { return (int) VH_splitInstanceBindRegionCount.get(segment, 0L, index); }
    /// {@return `splitInstanceBindRegionCount`}
    public int splitInstanceBindRegionCount() { return splitInstanceBindRegionCount(this.segment(), 0L); }
    /// Sets `splitInstanceBindRegionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void splitInstanceBindRegionCount(MemorySegment segment, long index, int value) { VH_splitInstanceBindRegionCount.set(segment, 0L, index, value); }
    /// Sets `splitInstanceBindRegionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo splitInstanceBindRegionCount(int value) { splitInstanceBindRegionCount(this.segment(), 0L, value); return this; }

    /// {@return `pSplitInstanceBindRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSplitInstanceBindRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pSplitInstanceBindRegions.get(segment, 0L, index); }
    /// {@return `pSplitInstanceBindRegions`}
    public MemorySegment pSplitInstanceBindRegions() { return pSplitInstanceBindRegions(this.segment(), 0L); }
    /// Sets `pSplitInstanceBindRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSplitInstanceBindRegions(MemorySegment segment, long index, MemorySegment value) { VH_pSplitInstanceBindRegions.set(segment, 0L, index, value); }
    /// Sets `pSplitInstanceBindRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(MemorySegment value) { pSplitInstanceBindRegions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindImageMemoryDeviceGroupInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindImageMemoryDeviceGroupInfo`
    public VkBindImageMemoryDeviceGroupInfo asSlice(long index) { return new VkBindImageMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindImageMemoryDeviceGroupInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindImageMemoryDeviceGroupInfo`
    public VkBindImageMemoryDeviceGroupInfo asSlice(long index, long count) { return new VkBindImageMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindImageMemoryDeviceGroupInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo at(long index, Consumer<VkBindImageMemoryDeviceGroupInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIndexCountAt(long index) { return deviceIndexCount(this.segment(), index); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo deviceIndexCountAt(long index, int value) { deviceIndexCount(this.segment(), index, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDeviceIndicesAt(long index) { return pDeviceIndices(this.segment(), index); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndicesAt(long index, MemorySegment value) { pDeviceIndices(this.segment(), index, value); return this; }

    /// {@return `splitInstanceBindRegionCount` at the given index}
    /// @param index the index of the struct buffer
    public int splitInstanceBindRegionCountAt(long index) { return splitInstanceBindRegionCount(this.segment(), index); }
    /// Sets `splitInstanceBindRegionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo splitInstanceBindRegionCountAt(long index, int value) { splitInstanceBindRegionCount(this.segment(), index, value); return this; }

    /// {@return `pSplitInstanceBindRegions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSplitInstanceBindRegionsAt(long index) { return pSplitInstanceBindRegions(this.segment(), index); }
    /// Sets `pSplitInstanceBindRegions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegionsAt(long index, MemorySegment value) { pSplitInstanceBindRegions(this.segment(), index, value); return this; }

}
