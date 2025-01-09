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
/// ### ycbcrImageArrays
/// [VarHandle][#VH_ycbcrImageArrays] - [Getter][#ycbcrImageArrays()] - [Setter][#ycbcrImageArrays(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceYcbcrImageArraysFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 ycbcrImageArrays;
/// } VkPhysicalDeviceYcbcrImageArraysFeaturesEXT;
/// ```
public final class VkPhysicalDeviceYcbcrImageArraysFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrImageArrays")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `ycbcrImageArrays` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ycbcrImageArrays = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrImageArrays"));

    /// Creates `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT`
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT`
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `ycbcrImageArrays` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_ycbcrImageArrays(MemorySegment segment, long index) { return (int) VH_ycbcrImageArrays.get(segment, 0L, index); }
    /// {@return `ycbcrImageArrays`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_ycbcrImageArrays(MemorySegment segment) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_ycbcrImageArrays(segment, 0L); }
    /// {@return `ycbcrImageArrays` at the given index}
    /// @param index the index
    public @CType("VkBool32") int ycbcrImageArraysAt(long index) { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_ycbcrImageArrays(this.segment(), index); }
    /// {@return `ycbcrImageArrays`}
    public @CType("VkBool32") int ycbcrImageArrays() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.get_ycbcrImageArrays(this.segment()); }
    /// Sets `ycbcrImageArrays` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ycbcrImageArrays(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_ycbcrImageArrays.set(segment, 0L, index, value); }
    /// Sets `ycbcrImageArrays` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ycbcrImageArrays(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_ycbcrImageArrays(segment, 0L, value); }
    /// Sets `ycbcrImageArrays` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArraysAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_ycbcrImageArrays(this.segment(), index, value); return this; }
    /// Sets `ycbcrImageArrays` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArrays(@CType("VkBool32") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.set_ycbcrImageArrays(this.segment(), value); return this; }

}