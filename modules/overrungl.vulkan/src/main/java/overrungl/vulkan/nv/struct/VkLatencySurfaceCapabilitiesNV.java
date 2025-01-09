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
/// ### presentModeCount
/// [VarHandle][#VH_presentModeCount] - [Getter][#presentModeCount()] - [Setter][#presentModeCount(int)]
/// ### pPresentModes
/// [VarHandle][#VH_pPresentModes] - [Getter][#pPresentModes()] - [Setter][#pPresentModes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLatencySurfaceCapabilitiesNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t presentModeCount;
///     VkPresentModeKHR * pPresentModes;
/// } VkLatencySurfaceCapabilitiesNV;
/// ```
public final class VkLatencySurfaceCapabilitiesNV extends Struct {
    /// The struct layout of `VkLatencySurfaceCapabilitiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `presentModeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentModeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeCount"));
    /// The [VarHandle] of `pPresentModes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencySurfaceCapabilitiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySurfaceCapabilitiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySurfaceCapabilitiesNV(segment); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySurfaceCapabilitiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySurfaceCapabilitiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySurfaceCapabilitiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySurfaceCapabilitiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkLatencySurfaceCapabilitiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySurfaceCapabilitiesNV`
    public static VkLatencySurfaceCapabilitiesNV alloc(SegmentAllocator allocator) { return new VkLatencySurfaceCapabilitiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencySurfaceCapabilitiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySurfaceCapabilitiesNV`
    public static VkLatencySurfaceCapabilitiesNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySurfaceCapabilitiesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkLatencySurfaceCapabilitiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLatencySurfaceCapabilitiesNV`
    public VkLatencySurfaceCapabilitiesNV asSlice(long index) { return new VkLatencySurfaceCapabilitiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkLatencySurfaceCapabilitiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLatencySurfaceCapabilitiesNV`
    public VkLatencySurfaceCapabilitiesNV asSlice(long index, long count) { return new VkLatencySurfaceCapabilitiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLatencySurfaceCapabilitiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV sType(@CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkLatencySurfaceCapabilitiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_presentModeCount(MemorySegment segment, long index) { return (int) VH_presentModeCount.get(segment, 0L, index); }
    /// {@return `presentModeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_presentModeCount(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(segment, 0L); }
    /// {@return `presentModeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int presentModeCountAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(this.segment(), index); }
    /// {@return `presentModeCount`}
    public @CType("uint32_t") int presentModeCount() { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(this.segment()); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentModeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_presentModeCount.set(segment, 0L, index, value); }
    /// Sets `presentModeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentModeCount(MemorySegment segment, @CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(segment, 0L, value); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV presentModeCountAt(long index, @CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(this.segment(), index, value); return this; }
    /// Sets `presentModeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV presentModeCount(@CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(this.segment(), value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment get_pPresentModes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPresentModes.get(segment, 0L, index); }
    /// {@return `pPresentModes`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment get_pPresentModes(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(segment, 0L); }
    /// {@return `pPresentModes` at the given index}
    /// @param index the index
    public @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment pPresentModesAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(this.segment(), index); }
    /// {@return `pPresentModes`}
    public @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment pPresentModes() { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(this.segment()); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPresentModes(MemorySegment segment, long index, @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment value) { VH_pPresentModes.set(segment, 0L, index, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPresentModes(MemorySegment segment, @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(segment, 0L, value); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pPresentModesAt(long index, @CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(this.segment(), index, value); return this; }
    /// Sets `pPresentModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pPresentModes(@CType("VkPresentModeKHR *") java.lang.foreign.MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(this.segment(), value); return this; }

}
