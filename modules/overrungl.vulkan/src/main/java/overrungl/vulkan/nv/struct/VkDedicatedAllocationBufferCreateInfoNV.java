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
/// typedef struct VkDedicatedAllocationBufferCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 dedicatedAllocation;
/// } VkDedicatedAllocationBufferCreateInfoNV;
/// ```
public final class VkDedicatedAllocationBufferCreateInfoNV extends Struct {
    /// The struct layout of `VkDedicatedAllocationBufferCreateInfoNV`.
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

    /// Creates `VkDedicatedAllocationBufferCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkDedicatedAllocationBufferCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDedicatedAllocationBufferCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationBufferCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationBufferCreateInfoNV(segment); }

    /// Creates `VkDedicatedAllocationBufferCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationBufferCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationBufferCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDedicatedAllocationBufferCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDedicatedAllocationBufferCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDedicatedAllocationBufferCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDedicatedAllocationBufferCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDedicatedAllocationBufferCreateInfoNV`
    public static VkDedicatedAllocationBufferCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDedicatedAllocationBufferCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDedicatedAllocationBufferCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDedicatedAllocationBufferCreateInfoNV`
    public static VkDedicatedAllocationBufferCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDedicatedAllocationBufferCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDedicatedAllocationBufferCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDedicatedAllocationBufferCreateInfoNV`
    public VkDedicatedAllocationBufferCreateInfoNV asSlice(long index) { return new VkDedicatedAllocationBufferCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDedicatedAllocationBufferCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDedicatedAllocationBufferCreateInfoNV`
    public VkDedicatedAllocationBufferCreateInfoNV asSlice(long index, long count) { return new VkDedicatedAllocationBufferCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDedicatedAllocationBufferCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDedicatedAllocationBufferCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDedicatedAllocationBufferCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV sType(@CType("VkStructureType") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDedicatedAllocationBufferCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDedicatedAllocationBufferCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDedicatedAllocationBufferCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationBufferCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationBufferCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDedicatedAllocationBufferCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `dedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dedicatedAllocation(MemorySegment segment, long index) { return (int) VH_dedicatedAllocation.get(segment, 0L, index); }
    /// {@return `dedicatedAllocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dedicatedAllocation(MemorySegment segment) { return VkDedicatedAllocationBufferCreateInfoNV.get_dedicatedAllocation(segment, 0L); }
    /// {@return `dedicatedAllocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dedicatedAllocationAt(long index) { return VkDedicatedAllocationBufferCreateInfoNV.get_dedicatedAllocation(this.segment(), index); }
    /// {@return `dedicatedAllocation`}
    public @CType("VkBool32") int dedicatedAllocation() { return VkDedicatedAllocationBufferCreateInfoNV.get_dedicatedAllocation(this.segment()); }
    /// Sets `dedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dedicatedAllocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dedicatedAllocation.set(segment, 0L, index, value); }
    /// Sets `dedicatedAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dedicatedAllocation(MemorySegment segment, @CType("VkBool32") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_dedicatedAllocation(segment, 0L, value); }
    /// Sets `dedicatedAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocationAt(long index, @CType("VkBool32") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_dedicatedAllocation(this.segment(), index, value); return this; }
    /// Sets `dedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocation(@CType("VkBool32") int value) { VkDedicatedAllocationBufferCreateInfoNV.set_dedicatedAllocation(this.segment(), value); return this; }

}
