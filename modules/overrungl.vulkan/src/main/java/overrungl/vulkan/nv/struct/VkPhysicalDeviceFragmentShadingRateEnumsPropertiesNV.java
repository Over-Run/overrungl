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
package overrungl.vulkan.nv.struct;

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
/// ### maxFragmentShadingRateInvocationCount
/// [VarHandle][#VH_maxFragmentShadingRateInvocationCount] - [Getter][#maxFragmentShadingRateInvocationCount()] - [Setter][#maxFragmentShadingRateInvocationCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkSampleCountFlagBits maxFragmentShadingRateInvocationCount;
/// } VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV;
/// ```
public final class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateInvocationCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxFragmentShadingRateInvocationCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentShadingRateInvocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `maxFragmentShadingRateInvocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_maxFragmentShadingRateInvocationCount(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateInvocationCount.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateInvocationCount`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_maxFragmentShadingRateInvocationCount(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_maxFragmentShadingRateInvocationCount(segment, 0L); }
    /// {@return `maxFragmentShadingRateInvocationCount` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int maxFragmentShadingRateInvocationCountAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_maxFragmentShadingRateInvocationCount(this.segment(), index); }
    /// {@return `maxFragmentShadingRateInvocationCount`}
    public @CType("VkSampleCountFlagBits") int maxFragmentShadingRateInvocationCount() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.get_maxFragmentShadingRateInvocationCount(this.segment()); }
    /// Sets `maxFragmentShadingRateInvocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentShadingRateInvocationCount(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_maxFragmentShadingRateInvocationCount.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateInvocationCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentShadingRateInvocationCount(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_maxFragmentShadingRateInvocationCount(segment, 0L, value); }
    /// Sets `maxFragmentShadingRateInvocationCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCountAt(long index, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_maxFragmentShadingRateInvocationCount(this.segment(), index, value); return this; }
    /// Sets `maxFragmentShadingRateInvocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCount(@CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.set_maxFragmentShadingRateInvocationCount(this.segment(), value); return this; }

}
