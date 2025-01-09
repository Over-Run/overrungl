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
/// ### pCreateInfo
/// [VarHandle][#VH_pCreateInfo] - [Getter][#pCreateInfo()] - [Setter][#pCreateInfo(java.lang.foreign.MemorySegment)]
/// ### pSubresource
/// [VarHandle][#VH_pSubresource] - [Getter][#pSubresource()] - [Setter][#pSubresource(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceImageSubresourceInfo {
///     VkStructureType sType;
///     const void * pNext;
///     const VkImageCreateInfo * pCreateInfo;
///     const VkImageSubresource2 * pSubresource;
/// } VkDeviceImageSubresourceInfo;
/// ```
public final class VkDeviceImageSubresourceInfo extends Struct {
    /// The struct layout of `VkDeviceImageSubresourceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo"),
        ValueLayout.ADDRESS.withName("pSubresource")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `pSubresource` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSubresource = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubresource"));

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceImageSubresourceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceImageSubresourceInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceImageSubresourceInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceImageSubresourceInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceImageSubresourceInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceImageSubresourceInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo sType(@CType("VkStructureType") int value) { VkDeviceImageSubresourceInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceImageSubresourceInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceImageSubresourceInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceImageSubresourceInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment get_pCreateInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment get_pCreateInfo(MemorySegment segment) { return VkDeviceImageSubresourceInfo.get_pCreateInfo(segment, 0L); }
    /// {@return `pCreateInfo` at the given index}
    /// @param index the index
    public @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment pCreateInfoAt(long index) { return VkDeviceImageSubresourceInfo.get_pCreateInfo(this.segment(), index); }
    /// {@return `pCreateInfo`}
    public @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment pCreateInfo() { return VkDeviceImageSubresourceInfo.get_pCreateInfo(this.segment()); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCreateInfo(MemorySegment segment, long index, @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCreateInfo(MemorySegment segment, @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pCreateInfo(segment, 0L, value); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pCreateInfoAt(long index, @CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pCreateInfo(this.segment(), index, value); return this; }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pCreateInfo(@CType("const VkImageCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pCreateInfo(this.segment(), value); return this; }

    /// {@return `pSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment get_pSubresource(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSubresource.get(segment, 0L, index); }
    /// {@return `pSubresource`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment get_pSubresource(MemorySegment segment) { return VkDeviceImageSubresourceInfo.get_pSubresource(segment, 0L); }
    /// {@return `pSubresource` at the given index}
    /// @param index the index
    public @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment pSubresourceAt(long index) { return VkDeviceImageSubresourceInfo.get_pSubresource(this.segment(), index); }
    /// {@return `pSubresource`}
    public @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment pSubresource() { return VkDeviceImageSubresourceInfo.get_pSubresource(this.segment()); }
    /// Sets `pSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSubresource(MemorySegment segment, long index, @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment value) { VH_pSubresource.set(segment, 0L, index, value); }
    /// Sets `pSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSubresource(MemorySegment segment, @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pSubresource(segment, 0L, value); }
    /// Sets `pSubresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pSubresourceAt(long index, @CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pSubresource(this.segment(), index, value); return this; }
    /// Sets `pSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pSubresource(@CType("const VkImageSubresource2 *") java.lang.foreign.MemorySegment value) { VkDeviceImageSubresourceInfo.set_pSubresource(this.segment(), value); return this; }

}
