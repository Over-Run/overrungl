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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK11.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### physicalDeviceCount
/// [VarHandle][#VH_physicalDeviceCount] - [Getter][#physicalDeviceCount()] - [Setter][#physicalDeviceCount(int)]
/// ### physicalDevices
/// [Byte offset handle][#MH_physicalDevices] - [Memory layout][#ML_physicalDevices] - [Getter][#physicalDevices(long)] - [Setter][#physicalDevices(long, java.lang.foreign.MemorySegment)]
/// ### subsetAllocation
/// [VarHandle][#VH_subsetAllocation] - [Getter][#subsetAllocation()] - [Setter][#subsetAllocation(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceGroupProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t physicalDeviceCount;
///     VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE] physicalDevices;
///     VkBool32 subsetAllocation;
/// } VkPhysicalDeviceGroupProperties;
/// ```
public final class VkPhysicalDeviceGroupProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceGroupProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.sequenceLayout(VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.ADDRESS).withName("physicalDevices"),
        ValueLayout.JAVA_INT.withName("subsetAllocation")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `physicalDeviceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    /// The byte offset handle of `physicalDevices` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_physicalDevices = LAYOUT.byteOffsetHandle(PathElement.groupElement("physicalDevices"), PathElement.sequenceElement());
    /// The memory layout of `physicalDevices`.
    public static final MemoryLayout ML_physicalDevices = LAYOUT.select(PathElement.groupElement("physicalDevices"));
    /// The [VarHandle] of `subsetAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subsetAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsetAllocation"));

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceGroupProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGroupProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGroupProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGroupProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceGroupProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceGroupProperties`
    public static VkPhysicalDeviceGroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGroupProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceGroupProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceGroupProperties`
    public static VkPhysicalDeviceGroupProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGroupProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceGroupProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceGroupProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceGroupProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceGroupProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceGroupProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceGroupProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceGroupProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceGroupProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceGroupProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `physicalDeviceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_physicalDeviceCount(MemorySegment segment, long index) { return (int) VH_physicalDeviceCount.get(segment, 0L, index); }
    /// {@return `physicalDeviceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_physicalDeviceCount(MemorySegment segment) { return VkPhysicalDeviceGroupProperties.get_physicalDeviceCount(segment, 0L); }
    /// {@return `physicalDeviceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int physicalDeviceCountAt(long index) { return VkPhysicalDeviceGroupProperties.get_physicalDeviceCount(this.segment(), index); }
    /// {@return `physicalDeviceCount`}
    public @CType("uint32_t") int physicalDeviceCount() { return VkPhysicalDeviceGroupProperties.get_physicalDeviceCount(this.segment()); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalDeviceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_physicalDeviceCount.set(segment, 0L, index, value); }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalDeviceCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceGroupProperties.set_physicalDeviceCount(segment, 0L, value); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDeviceCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceGroupProperties.set_physicalDeviceCount(this.segment(), index, value); return this; }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDeviceCount(@CType("uint32_t") int value) { VkPhysicalDeviceGroupProperties.set_physicalDeviceCount(this.segment(), value); return this; }

    /// {@return `physicalDevices` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment get_physicalDevices(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_physicalDevices.invokeExact(0L, elementIndex), index), ML_physicalDevices); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `physicalDevices`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment get_physicalDevices(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceGroupProperties.get_physicalDevices(segment, 0L, elementIndex); }
    /// {@return `physicalDevices` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment physicalDevicesAt(long index, long elementIndex) { return VkPhysicalDeviceGroupProperties.get_physicalDevices(this.segment(), index, elementIndex); }
    /// {@return `physicalDevices`}
    /// @param elementIndex the index of the element
    public @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment physicalDevices(long elementIndex) { return VkPhysicalDeviceGroupProperties.get_physicalDevices(this.segment(), elementIndex); }
    /// Sets `physicalDevices` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_physicalDevices(MemorySegment segment, long index, long elementIndex, @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_physicalDevices.invokeExact(0L, elementIndex), index), ML_physicalDevices.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `physicalDevices` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_physicalDevices(MemorySegment segment, long elementIndex, @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_physicalDevices(segment, 0L, elementIndex, value); }
    /// Sets `physicalDevices` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDevicesAt(long index, long elementIndex, @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_physicalDevices(this.segment(), index, elementIndex, value); return this; }
    /// Sets `physicalDevices` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDevices(long elementIndex, @CType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGroupProperties.set_physicalDevices(this.segment(), elementIndex, value); return this; }

    /// {@return `subsetAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subsetAllocation(MemorySegment segment, long index) { return (int) VH_subsetAllocation.get(segment, 0L, index); }
    /// {@return `subsetAllocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subsetAllocation(MemorySegment segment) { return VkPhysicalDeviceGroupProperties.get_subsetAllocation(segment, 0L); }
    /// {@return `subsetAllocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int subsetAllocationAt(long index) { return VkPhysicalDeviceGroupProperties.get_subsetAllocation(this.segment(), index); }
    /// {@return `subsetAllocation`}
    public @CType("VkBool32") int subsetAllocation() { return VkPhysicalDeviceGroupProperties.get_subsetAllocation(this.segment()); }
    /// Sets `subsetAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subsetAllocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subsetAllocation.set(segment, 0L, index, value); }
    /// Sets `subsetAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subsetAllocation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceGroupProperties.set_subsetAllocation(segment, 0L, value); }
    /// Sets `subsetAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties subsetAllocationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceGroupProperties.set_subsetAllocation(this.segment(), index, value); return this; }
    /// Sets `subsetAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties subsetAllocation(@CType("VkBool32") int value) { VkPhysicalDeviceGroupProperties.set_subsetAllocation(this.segment(), value); return this; }

}
