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
/// ### dedicatedAllocation
/// [VarHandle][#VH_dedicatedAllocation] - [Getter][#dedicatedAllocation()] - [Setter][#dedicatedAllocation(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDedicatedAllocationImageCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 dedicatedAllocation;
/// } VkDedicatedAllocationImageCreateInfoNV;
/// ```
public final class VkDedicatedAllocationImageCreateInfoNV extends Struct {
    /// The struct layout of `VkDedicatedAllocationImageCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dedicatedAllocation")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dedicatedAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dedicatedAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dedicatedAllocation"));

    /// Creates `VkDedicatedAllocationImageCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkDedicatedAllocationImageCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDedicatedAllocationImageCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationImageCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationImageCreateInfoNV(segment); }

    /// Creates `VkDedicatedAllocationImageCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationImageCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationImageCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDedicatedAllocationImageCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationImageCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationImageCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDedicatedAllocationImageCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDedicatedAllocationImageCreateInfoNV`
    public static VkDedicatedAllocationImageCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDedicatedAllocationImageCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDedicatedAllocationImageCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDedicatedAllocationImageCreateInfoNV`
    public static VkDedicatedAllocationImageCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDedicatedAllocationImageCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDedicatedAllocationImageCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDedicatedAllocationImageCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDedicatedAllocationImageCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDedicatedAllocationImageCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkDedicatedAllocationImageCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV sType(@CType("VkStructureType") int value) { VkDedicatedAllocationImageCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDedicatedAllocationImageCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDedicatedAllocationImageCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDedicatedAllocationImageCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationImageCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationImageCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationImageCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `dedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dedicatedAllocation(MemorySegment segment, long index) { return (int) VH_dedicatedAllocation.get(segment, 0L, index); }
    /// {@return `dedicatedAllocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dedicatedAllocation(MemorySegment segment) { return VkDedicatedAllocationImageCreateInfoNV.get_dedicatedAllocation(segment, 0L); }
    /// {@return `dedicatedAllocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dedicatedAllocationAt(long index) { return VkDedicatedAllocationImageCreateInfoNV.get_dedicatedAllocation(this.segment(), index); }
    /// {@return `dedicatedAllocation`}
    public @CType("VkBool32") int dedicatedAllocation() { return VkDedicatedAllocationImageCreateInfoNV.get_dedicatedAllocation(this.segment()); }
    /// Sets `dedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dedicatedAllocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dedicatedAllocation.set(segment, 0L, index, value); }
    /// Sets `dedicatedAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dedicatedAllocation(MemorySegment segment, @CType("VkBool32") int value) { VkDedicatedAllocationImageCreateInfoNV.set_dedicatedAllocation(segment, 0L, value); }
    /// Sets `dedicatedAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocationAt(long index, @CType("VkBool32") int value) { VkDedicatedAllocationImageCreateInfoNV.set_dedicatedAllocation(this.segment(), index, value); return this; }
    /// Sets `dedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(@CType("VkBool32") int value) { VkDedicatedAllocationImageCreateInfoNV.set_dedicatedAllocation(this.segment(), value); return this; }

}