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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### physicalDeviceCount
/// [VarHandle][#VH_physicalDeviceCount] - [Getter][#physicalDeviceCount()] - [Setter][#physicalDeviceCount(int)]
/// ### pPhysicalDevices
/// [VarHandle][#VH_pPhysicalDevices] - [Getter][#pPhysicalDevices()] - [Setter][#pPhysicalDevices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupDeviceCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t physicalDeviceCount;
///     const VkPhysicalDevice * pPhysicalDevices;
/// } VkDeviceGroupDeviceCreateInfo;
/// ```
public final class VkDeviceGroupDeviceCreateInfo extends Struct {
    /// The struct layout of `VkDeviceGroupDeviceCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withName("pPhysicalDevices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `physicalDeviceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    /// The [VarHandle] of `pPhysicalDevices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPhysicalDevices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPhysicalDevices"));

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupDeviceCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupDeviceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupDeviceCreateInfo`
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDeviceGroupDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceGroupDeviceCreateInfo`
    public VkDeviceGroupDeviceCreateInfo asSlice(long index) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDeviceGroupDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceGroupDeviceCreateInfo`
    public VkDeviceGroupDeviceCreateInfo asSlice(long index, long count) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupDeviceCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupDeviceCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupDeviceCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupDeviceCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupDeviceCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo sType(@CType("VkStructureType") int value) { VkDeviceGroupDeviceCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupDeviceCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceGroupDeviceCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceGroupDeviceCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `physicalDeviceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_physicalDeviceCount(MemorySegment segment, long index) { return (int) VH_physicalDeviceCount.get(segment, 0L, index); }
    /// {@return `physicalDeviceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_physicalDeviceCount(MemorySegment segment) { return VkDeviceGroupDeviceCreateInfo.get_physicalDeviceCount(segment, 0L); }
    /// {@return `physicalDeviceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int physicalDeviceCountAt(long index) { return VkDeviceGroupDeviceCreateInfo.get_physicalDeviceCount(this.segment(), index); }
    /// {@return `physicalDeviceCount`}
    public @CType("uint32_t") int physicalDeviceCount() { return VkDeviceGroupDeviceCreateInfo.get_physicalDeviceCount(this.segment()); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalDeviceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_physicalDeviceCount.set(segment, 0L, index, value); }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalDeviceCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupDeviceCreateInfo.set_physicalDeviceCount(segment, 0L, value); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupDeviceCreateInfo.set_physicalDeviceCount(this.segment(), index, value); return this; }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCount(@CType("uint32_t") int value) { VkDeviceGroupDeviceCreateInfo.set_physicalDeviceCount(this.segment(), value); return this; }

    /// {@return `pPhysicalDevices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment get_pPhysicalDevices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPhysicalDevices.get(segment, 0L, index); }
    /// {@return `pPhysicalDevices`}
    /// @param segment the segment of the struct
    public static @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment get_pPhysicalDevices(MemorySegment segment) { return VkDeviceGroupDeviceCreateInfo.get_pPhysicalDevices(segment, 0L); }
    /// {@return `pPhysicalDevices` at the given index}
    /// @param index the index
    public @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment pPhysicalDevicesAt(long index) { return VkDeviceGroupDeviceCreateInfo.get_pPhysicalDevices(this.segment(), index); }
    /// {@return `pPhysicalDevices`}
    public @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment pPhysicalDevices() { return VkDeviceGroupDeviceCreateInfo.get_pPhysicalDevices(this.segment()); }
    /// Sets `pPhysicalDevices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPhysicalDevices(MemorySegment segment, long index, @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment value) { VH_pPhysicalDevices.set(segment, 0L, index, value); }
    /// Sets `pPhysicalDevices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPhysicalDevices(MemorySegment segment, @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pPhysicalDevices(segment, 0L, value); }
    /// Sets `pPhysicalDevices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevicesAt(long index, @CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pPhysicalDevices(this.segment(), index, value); return this; }
    /// Sets `pPhysicalDevices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(@CType("const VkPhysicalDevice *") java.lang.foreign.MemorySegment value) { VkDeviceGroupDeviceCreateInfo.set_pPhysicalDevices(this.segment(), value); return this; }

}
