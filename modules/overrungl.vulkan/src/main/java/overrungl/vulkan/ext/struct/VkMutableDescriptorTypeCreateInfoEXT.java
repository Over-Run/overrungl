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
/// ### mutableDescriptorTypeListCount
/// [VarHandle][#VH_mutableDescriptorTypeListCount] - [Getter][#mutableDescriptorTypeListCount()] - [Setter][#mutableDescriptorTypeListCount(int)]
/// ### pMutableDescriptorTypeLists
/// [VarHandle][#VH_pMutableDescriptorTypeLists] - [Getter][#pMutableDescriptorTypeLists()] - [Setter][#pMutableDescriptorTypeLists(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMutableDescriptorTypeCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t mutableDescriptorTypeListCount;
///     const VkMutableDescriptorTypeListEXT * pMutableDescriptorTypeLists;
/// } VkMutableDescriptorTypeCreateInfoEXT;
/// ```
public final class VkMutableDescriptorTypeCreateInfoEXT extends Struct {
    /// The struct layout of `VkMutableDescriptorTypeCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withName("pMutableDescriptorTypeLists")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mutableDescriptorTypeListCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mutableDescriptorTypeListCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableDescriptorTypeListCount"));
    /// The [VarHandle] of `pMutableDescriptorTypeLists` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMutableDescriptorTypeLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMutableDescriptorTypeLists"));

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMutableDescriptorTypeCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMutableDescriptorTypeCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMutableDescriptorTypeCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT sType(@CType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMutableDescriptorTypeCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMutableDescriptorTypeCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMutableDescriptorTypeCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `mutableDescriptorTypeListCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mutableDescriptorTypeListCount(MemorySegment segment, long index) { return (int) VH_mutableDescriptorTypeListCount.get(segment, 0L, index); }
    /// {@return `mutableDescriptorTypeListCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mutableDescriptorTypeListCount(MemorySegment segment) { return VkMutableDescriptorTypeCreateInfoEXT.get_mutableDescriptorTypeListCount(segment, 0L); }
    /// {@return `mutableDescriptorTypeListCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int mutableDescriptorTypeListCountAt(long index) { return VkMutableDescriptorTypeCreateInfoEXT.get_mutableDescriptorTypeListCount(this.segment(), index); }
    /// {@return `mutableDescriptorTypeListCount`}
    public @CType("uint32_t") int mutableDescriptorTypeListCount() { return VkMutableDescriptorTypeCreateInfoEXT.get_mutableDescriptorTypeListCount(this.segment()); }
    /// Sets `mutableDescriptorTypeListCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mutableDescriptorTypeListCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mutableDescriptorTypeListCount.set(segment, 0L, index, value); }
    /// Sets `mutableDescriptorTypeListCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mutableDescriptorTypeListCount(MemorySegment segment, @CType("uint32_t") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_mutableDescriptorTypeListCount(segment, 0L, value); }
    /// Sets `mutableDescriptorTypeListCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCountAt(long index, @CType("uint32_t") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_mutableDescriptorTypeListCount(this.segment(), index, value); return this; }
    /// Sets `mutableDescriptorTypeListCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCount(@CType("uint32_t") int value) { VkMutableDescriptorTypeCreateInfoEXT.set_mutableDescriptorTypeListCount(this.segment(), value); return this; }

    /// {@return `pMutableDescriptorTypeLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment get_pMutableDescriptorTypeLists(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMutableDescriptorTypeLists.get(segment, 0L, index); }
    /// {@return `pMutableDescriptorTypeLists`}
    /// @param segment the segment of the struct
    public static @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment get_pMutableDescriptorTypeLists(MemorySegment segment) { return VkMutableDescriptorTypeCreateInfoEXT.get_pMutableDescriptorTypeLists(segment, 0L); }
    /// {@return `pMutableDescriptorTypeLists` at the given index}
    /// @param index the index
    public @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment pMutableDescriptorTypeListsAt(long index) { return VkMutableDescriptorTypeCreateInfoEXT.get_pMutableDescriptorTypeLists(this.segment(), index); }
    /// {@return `pMutableDescriptorTypeLists`}
    public @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment pMutableDescriptorTypeLists() { return VkMutableDescriptorTypeCreateInfoEXT.get_pMutableDescriptorTypeLists(this.segment()); }
    /// Sets `pMutableDescriptorTypeLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMutableDescriptorTypeLists(MemorySegment segment, long index, @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment value) { VH_pMutableDescriptorTypeLists.set(segment, 0L, index, value); }
    /// Sets `pMutableDescriptorTypeLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMutableDescriptorTypeLists(MemorySegment segment, @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pMutableDescriptorTypeLists(segment, 0L, value); }
    /// Sets `pMutableDescriptorTypeLists` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeListsAt(long index, @CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pMutableDescriptorTypeLists(this.segment(), index, value); return this; }
    /// Sets `pMutableDescriptorTypeLists` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(@CType("const VkMutableDescriptorTypeListEXT *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeCreateInfoEXT.set_pMutableDescriptorTypeLists(this.segment(), value); return this; }

}
