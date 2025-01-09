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
/// ### computeCapabilityMinor
/// [VarHandle][#VH_computeCapabilityMinor] - [Getter][#computeCapabilityMinor()] - [Setter][#computeCapabilityMinor(int)]
/// ### computeCapabilityMajor
/// [VarHandle][#VH_computeCapabilityMajor] - [Getter][#computeCapabilityMajor()] - [Setter][#computeCapabilityMajor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t computeCapabilityMinor;
///     uint32_t computeCapabilityMajor;
/// } VkPhysicalDeviceCudaKernelLaunchPropertiesNV;
/// ```
public final class VkPhysicalDeviceCudaKernelLaunchPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `computeCapabilityMinor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeCapabilityMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMinor"));
    /// The [VarHandle] of `computeCapabilityMajor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeCapabilityMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMajor"));

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `computeCapabilityMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_computeCapabilityMinor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMinor.get(segment, 0L, index); }
    /// {@return `computeCapabilityMinor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_computeCapabilityMinor(MemorySegment segment) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMinor(segment, 0L); }
    /// {@return `computeCapabilityMinor` at the given index}
    /// @param index the index
    public @CType("uint32_t") int computeCapabilityMinorAt(long index) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMinor(this.segment(), index); }
    /// {@return `computeCapabilityMinor`}
    public @CType("uint32_t") int computeCapabilityMinor() { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMinor(this.segment()); }
    /// Sets `computeCapabilityMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeCapabilityMinor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_computeCapabilityMinor.set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMinor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeCapabilityMinor(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMinor(segment, 0L, value); }
    /// Sets `computeCapabilityMinor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinorAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMinor(this.segment(), index, value); return this; }
    /// Sets `computeCapabilityMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinor(@CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMinor(this.segment(), value); return this; }

    /// {@return `computeCapabilityMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_computeCapabilityMajor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMajor.get(segment, 0L, index); }
    /// {@return `computeCapabilityMajor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_computeCapabilityMajor(MemorySegment segment) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMajor(segment, 0L); }
    /// {@return `computeCapabilityMajor` at the given index}
    /// @param index the index
    public @CType("uint32_t") int computeCapabilityMajorAt(long index) { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMajor(this.segment(), index); }
    /// {@return `computeCapabilityMajor`}
    public @CType("uint32_t") int computeCapabilityMajor() { return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.get_computeCapabilityMajor(this.segment()); }
    /// Sets `computeCapabilityMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeCapabilityMajor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_computeCapabilityMajor.set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMajor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeCapabilityMajor(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMajor(segment, 0L, value); }
    /// Sets `computeCapabilityMajor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajorAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMajor(this.segment(), index, value); return this; }
    /// Sets `computeCapabilityMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajor(@CType("uint32_t") int value) { VkPhysicalDeviceCudaKernelLaunchPropertiesNV.set_computeCapabilityMajor(this.segment(), value); return this; }

}
