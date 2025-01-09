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
/// ### allocationSize
/// [VarHandle][#VH_allocationSize] - [Getter][#allocationSize()] - [Setter][#allocationSize(long)]
/// ### memoryTypeIndex
/// [VarHandle][#VH_memoryTypeIndex] - [Getter][#memoryTypeIndex()] - [Setter][#memoryTypeIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeIndex;
/// } VkMemoryAllocateInfo;
/// ```
public final class VkMemoryAllocateInfo extends Struct {
    /// The struct layout of `VkMemoryAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `allocationSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_allocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize"));
    /// The [VarHandle] of `memoryTypeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeIndex"));

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkMemoryAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryAllocateInfo`
    public static VkMemoryAllocateInfo alloc(SegmentAllocator allocator) { return new VkMemoryAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryAllocateInfo`
    public static VkMemoryAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkMemoryAllocateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryAllocateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo sType(@CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryAllocateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `allocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_allocationSize(MemorySegment segment, long index) { return (long) VH_allocationSize.get(segment, 0L, index); }
    /// {@return `allocationSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_allocationSize(MemorySegment segment) { return VkMemoryAllocateInfo.get_allocationSize(segment, 0L); }
    /// {@return `allocationSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long allocationSizeAt(long index) { return VkMemoryAllocateInfo.get_allocationSize(this.segment(), index); }
    /// {@return `allocationSize`}
    public @CType("VkDeviceSize") long allocationSize() { return VkMemoryAllocateInfo.get_allocationSize(this.segment()); }
    /// Sets `allocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allocationSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_allocationSize.set(segment, 0L, index, value); }
    /// Sets `allocationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allocationSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(segment, 0L, value); }
    /// Sets `allocationSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo allocationSizeAt(long index, @CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(this.segment(), index, value); return this; }
    /// Sets `allocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo allocationSize(@CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(this.segment(), value); return this; }

    /// {@return `memoryTypeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeIndex(MemorySegment segment, long index) { return (int) VH_memoryTypeIndex.get(segment, 0L, index); }
    /// {@return `memoryTypeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeIndex(MemorySegment segment) { return VkMemoryAllocateInfo.get_memoryTypeIndex(segment, 0L); }
    /// {@return `memoryTypeIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryTypeIndexAt(long index) { return VkMemoryAllocateInfo.get_memoryTypeIndex(this.segment(), index); }
    /// {@return `memoryTypeIndex`}
    public @CType("uint32_t") int memoryTypeIndex() { return VkMemoryAllocateInfo.get_memoryTypeIndex(this.segment()); }
    /// Sets `memoryTypeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeIndex.set(segment, 0L, index, value); }
    /// Sets `memoryTypeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(segment, 0L, value); }
    /// Sets `memoryTypeIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo memoryTypeIndexAt(long index, @CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(this.segment(), index, value); return this; }
    /// Sets `memoryTypeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo memoryTypeIndex(@CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(this.segment(), value); return this; }

}
