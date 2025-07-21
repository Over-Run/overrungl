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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceCoherentMemoryFeaturesAMD {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 deviceCoherentMemory;
/// };
/// ```
public final class VkPhysicalDeviceCoherentMemoryFeaturesAMD extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCoherentMemoryFeaturesAMD`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceCoherentMemory")
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
    /// The byte offset of `deviceCoherentMemory`.
    public static final long OFFSET_deviceCoherentMemory = LAYOUT.byteOffset(PathElement.groupElement("deviceCoherentMemory"));
    /// The memory layout of `deviceCoherentMemory`.
    public static final MemoryLayout LAYOUT_deviceCoherentMemory = LAYOUT.select(PathElement.groupElement("deviceCoherentMemory"));
    /// The [VarHandle] of `deviceCoherentMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceCoherentMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceCoherentMemory"));

    /// Creates `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceCoherentMemory `deviceCoherentMemory`
    /// @return the allocated `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceCoherentMemory) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceCoherentMemory(deviceCoherentMemory);
    }

    /// Allocates a `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceCoherentMemoryFeaturesAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD copyFrom(VkPhysicalDeviceCoherentMemoryFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD reinterpret(long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceCoherentMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceCoherentMemory(MemorySegment segment, long index) { return (int) VH_deviceCoherentMemory.get(segment, 0L, index); }
    /// {@return `deviceCoherentMemory`}
    public int deviceCoherentMemory() { return deviceCoherentMemory(this.segment(), 0L); }
    /// Sets `deviceCoherentMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceCoherentMemory(MemorySegment segment, long index, int value) { VH_deviceCoherentMemory.set(segment, 0L, index, value); }
    /// Sets `deviceCoherentMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemory(int value) { deviceCoherentMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCoherentMemoryFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCoherentMemoryFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCoherentMemoryFeaturesAMD`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD asSlice(long index, long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCoherentMemoryFeaturesAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD at(long index, Consumer<VkPhysicalDeviceCoherentMemoryFeaturesAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceCoherentMemory` at the given index}
    /// @param index the index of the struct buffer
    public int deviceCoherentMemoryAt(long index) { return deviceCoherentMemory(this.segment(), index); }
    /// Sets `deviceCoherentMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemoryAt(long index, int value) { deviceCoherentMemory(this.segment(), index, value); return this; }

}
