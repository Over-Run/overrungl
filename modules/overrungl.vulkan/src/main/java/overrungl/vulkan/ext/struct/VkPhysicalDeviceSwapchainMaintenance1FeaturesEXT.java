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
package overrungl.vulkan.ext.struct;

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
/// ### swapchainMaintenance1
/// [VarHandle][#VH_swapchainMaintenance1] - [Getter][#swapchainMaintenance1()] - [Setter][#swapchainMaintenance1(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 swapchainMaintenance1;
/// } VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT;
/// ```
public final class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainMaintenance1")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchainMaintenance1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainMaintenance1"));

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchainMaintenance1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_swapchainMaintenance1(MemorySegment segment, long index) { return (int) VH_swapchainMaintenance1.get(segment, 0L, index); }
    /// {@return `swapchainMaintenance1`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_swapchainMaintenance1(MemorySegment segment) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_swapchainMaintenance1(segment, 0L); }
    /// {@return `swapchainMaintenance1` at the given index}
    /// @param index the index
    public @CType("VkBool32") int swapchainMaintenance1At(long index) { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_swapchainMaintenance1(this.segment(), index); }
    /// {@return `swapchainMaintenance1`}
    public @CType("VkBool32") int swapchainMaintenance1() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.get_swapchainMaintenance1(this.segment()); }
    /// Sets `swapchainMaintenance1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainMaintenance1(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_swapchainMaintenance1.set(segment, 0L, index, value); }
    /// Sets `swapchainMaintenance1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainMaintenance1(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_swapchainMaintenance1(segment, 0L, value); }
    /// Sets `swapchainMaintenance1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_swapchainMaintenance1(this.segment(), index, value); return this; }
    /// Sets `swapchainMaintenance1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1(@CType("VkBool32") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.set_swapchainMaintenance1(this.segment(), value); return this; }

}
