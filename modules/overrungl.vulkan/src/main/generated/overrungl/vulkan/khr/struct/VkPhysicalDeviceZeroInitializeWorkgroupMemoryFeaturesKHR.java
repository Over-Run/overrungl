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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderZeroInitializeWorkgroupMemory;
/// };
/// ```
public final class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory")
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
    /// The byte offset of `shaderZeroInitializeWorkgroupMemory`.
    public static final long OFFSET_shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The memory layout of `shaderZeroInitializeWorkgroupMemory`.
    public static final MemoryLayout LAYOUT_shaderZeroInitializeWorkgroupMemory = LAYOUT.select(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The [VarHandle] of `shaderZeroInitializeWorkgroupMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param shaderZeroInitializeWorkgroupMemory `shaderZeroInitializeWorkgroupMemory`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int shaderZeroInitializeWorkgroupMemory) {
        return alloc(allocator).sType(sType).pNext(pNext).shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
    }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR copyFrom(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(segment, 0L, index); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    public int shaderZeroInitializeWorkgroupMemory() { return shaderZeroInitializeWorkgroupMemory(this.segment(), 0L); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index, int value) { VH_shaderZeroInitializeWorkgroupMemory.set(segment, 0L, index, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemory(int value) { shaderZeroInitializeWorkgroupMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR at(long index, Consumer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param index the index of the struct buffer
    public int shaderZeroInitializeWorkgroupMemoryAt(long index) { return shaderZeroInitializeWorkgroupMemory(this.segment(), index); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemoryAt(long index, int value) { shaderZeroInitializeWorkgroupMemory(this.segment(), index, value); return this; }

}
