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
/// struct VkDeviceGroupDeviceCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t physicalDeviceCount;
///     const VkPhysicalDevice* pPhysicalDevices;
/// };
/// ```
public final class VkDeviceGroupDeviceCreateInfo extends GroupType {
    /// The struct layout of `VkDeviceGroupDeviceCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withName("pPhysicalDevices")
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
    /// The byte offset of `physicalDeviceCount`.
    public static final long OFFSET_physicalDeviceCount = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
    /// The memory layout of `physicalDeviceCount`.
    public static final MemoryLayout LAYOUT_physicalDeviceCount = LAYOUT.select(PathElement.groupElement("physicalDeviceCount"));
    /// The [VarHandle] of `physicalDeviceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    /// The byte offset of `pPhysicalDevices`.
    public static final long OFFSET_pPhysicalDevices = LAYOUT.byteOffset(PathElement.groupElement("pPhysicalDevices"));
    /// The memory layout of `pPhysicalDevices`.
    public static final MemoryLayout LAYOUT_pPhysicalDevices = LAYOUT.select(PathElement.groupElement("pPhysicalDevices"));
    /// The [VarHandle] of `pPhysicalDevices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPhysicalDevices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPhysicalDevices"));

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceGroupDeviceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param physicalDeviceCount `physicalDeviceCount`
    /// @param pPhysicalDevices `pPhysicalDevices`
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int physicalDeviceCount, MemorySegment pPhysicalDevices) {
        return alloc(allocator).sType(sType).pNext(pNext).physicalDeviceCount(physicalDeviceCount).pPhysicalDevices(pPhysicalDevices);
    }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param physicalDeviceCount `physicalDeviceCount`
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int physicalDeviceCount) {
        return alloc(allocator).sType(sType).pNext(pNext).physicalDeviceCount(physicalDeviceCount);
    }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo copyFrom(VkDeviceGroupDeviceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceGroupDeviceCreateInfo reinterpret(long count) { return new VkDeviceGroupDeviceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceGroupDeviceCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceGroupDeviceCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `physicalDeviceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int physicalDeviceCount(MemorySegment segment, long index) { return (int) VH_physicalDeviceCount.get(segment, 0L, index); }
    /// {@return `physicalDeviceCount`}
    public int physicalDeviceCount() { return physicalDeviceCount(this.segment(), 0L); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDeviceCount(MemorySegment segment, long index, int value) { VH_physicalDeviceCount.set(segment, 0L, index, value); }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCount(int value) { physicalDeviceCount(this.segment(), 0L, value); return this; }

    /// {@return `pPhysicalDevices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPhysicalDevices(MemorySegment segment, long index) { return (MemorySegment) VH_pPhysicalDevices.get(segment, 0L, index); }
    /// {@return `pPhysicalDevices`}
    public MemorySegment pPhysicalDevices() { return pPhysicalDevices(this.segment(), 0L); }
    /// Sets `pPhysicalDevices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPhysicalDevices(MemorySegment segment, long index, MemorySegment value) { VH_pPhysicalDevices.set(segment, 0L, index, value); }
    /// Sets `pPhysicalDevices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(MemorySegment value) { pPhysicalDevices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceGroupDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceGroupDeviceCreateInfo`
    public VkDeviceGroupDeviceCreateInfo asSlice(long index) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceGroupDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceGroupDeviceCreateInfo`
    public VkDeviceGroupDeviceCreateInfo asSlice(long index, long count) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceGroupDeviceCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo at(long index, Consumer<VkDeviceGroupDeviceCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `physicalDeviceCount` at the given index}
    /// @param index the index of the struct buffer
    public int physicalDeviceCountAt(long index) { return physicalDeviceCount(this.segment(), index); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCountAt(long index, int value) { physicalDeviceCount(this.segment(), index, value); return this; }

    /// {@return `pPhysicalDevices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPhysicalDevicesAt(long index) { return pPhysicalDevices(this.segment(), index); }
    /// Sets `pPhysicalDevices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevicesAt(long index, MemorySegment value) { pPhysicalDevices(this.segment(), index, value); return this; }

}
