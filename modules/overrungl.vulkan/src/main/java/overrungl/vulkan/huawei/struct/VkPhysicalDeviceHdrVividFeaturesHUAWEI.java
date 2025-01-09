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
package overrungl.vulkan.huawei.struct;

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
/// ### hdrVivid
/// [VarHandle][#VH_hdrVivid] - [Getter][#hdrVivid()] - [Setter][#hdrVivid(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceHdrVividFeaturesHUAWEI {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 hdrVivid;
/// } VkPhysicalDeviceHdrVividFeaturesHUAWEI;
/// ```
public final class VkPhysicalDeviceHdrVividFeaturesHUAWEI extends Struct {
    /// The struct layout of `VkPhysicalDeviceHdrVividFeaturesHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hdrVivid")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `hdrVivid` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hdrVivid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hdrVivid"));

    /// Creates `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment); }

    /// Creates `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceHdrVividFeaturesHUAWEI`
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceHdrVividFeaturesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceHdrVividFeaturesHUAWEI`
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceHdrVividFeaturesHUAWEI`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceHdrVividFeaturesHUAWEI`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceHdrVividFeaturesHUAWEI`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceHdrVividFeaturesHUAWEI`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType(@CType("VkStructureType") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `hdrVivid` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hdrVivid(MemorySegment segment, long index) { return (int) VH_hdrVivid.get(segment, 0L, index); }
    /// {@return `hdrVivid`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hdrVivid(MemorySegment segment) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_hdrVivid(segment, 0L); }
    /// {@return `hdrVivid` at the given index}
    /// @param index the index
    public @CType("VkBool32") int hdrVividAt(long index) { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_hdrVivid(this.segment(), index); }
    /// {@return `hdrVivid`}
    public @CType("VkBool32") int hdrVivid() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.get_hdrVivid(this.segment()); }
    /// Sets `hdrVivid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hdrVivid(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hdrVivid.set(segment, 0L, index, value); }
    /// Sets `hdrVivid` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hdrVivid(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_hdrVivid(segment, 0L, value); }
    /// Sets `hdrVivid` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVividAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_hdrVivid(this.segment(), index, value); return this; }
    /// Sets `hdrVivid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVivid(@CType("VkBool32") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.set_hdrVivid(this.segment(), value); return this; }

}
