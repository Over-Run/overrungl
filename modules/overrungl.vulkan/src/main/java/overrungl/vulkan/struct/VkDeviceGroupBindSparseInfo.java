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
/// ### resourceDeviceIndex
/// [VarHandle][#VH_resourceDeviceIndex] - [Getter][#resourceDeviceIndex()] - [Setter][#resourceDeviceIndex(int)]
/// ### memoryDeviceIndex
/// [VarHandle][#VH_memoryDeviceIndex] - [Getter][#memoryDeviceIndex()] - [Setter][#memoryDeviceIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupBindSparseInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t resourceDeviceIndex;
///     uint32_t memoryDeviceIndex;
/// } VkDeviceGroupBindSparseInfo;
/// ```
public final class VkDeviceGroupBindSparseInfo extends Struct {
    /// The struct layout of `VkDeviceGroupBindSparseInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("resourceDeviceIndex"),
        ValueLayout.JAVA_INT.withName("memoryDeviceIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `resourceDeviceIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_resourceDeviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDeviceIndex"));
    /// The [VarHandle] of `memoryDeviceIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryDeviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryDeviceIndex"));

    /// Creates `VkDeviceGroupBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupBindSparseInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment); }

    /// Creates `VkDeviceGroupBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceGroupBindSparseInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupBindSparseInfo`
    public static VkDeviceGroupBindSparseInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupBindSparseInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupBindSparseInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupBindSparseInfo`
    public static VkDeviceGroupBindSparseInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupBindSparseInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupBindSparseInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupBindSparseInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupBindSparseInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupBindSparseInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupBindSparseInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo sType(@CType("VkStructureType") int value) { VkDeviceGroupBindSparseInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupBindSparseInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceGroupBindSparseInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceGroupBindSparseInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupBindSparseInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupBindSparseInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupBindSparseInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `resourceDeviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_resourceDeviceIndex(MemorySegment segment, long index) { return (int) VH_resourceDeviceIndex.get(segment, 0L, index); }
    /// {@return `resourceDeviceIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_resourceDeviceIndex(MemorySegment segment) { return VkDeviceGroupBindSparseInfo.get_resourceDeviceIndex(segment, 0L); }
    /// {@return `resourceDeviceIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int resourceDeviceIndexAt(long index) { return VkDeviceGroupBindSparseInfo.get_resourceDeviceIndex(this.segment(), index); }
    /// {@return `resourceDeviceIndex`}
    public @CType("uint32_t") int resourceDeviceIndex() { return VkDeviceGroupBindSparseInfo.get_resourceDeviceIndex(this.segment()); }
    /// Sets `resourceDeviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resourceDeviceIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_resourceDeviceIndex.set(segment, 0L, index, value); }
    /// Sets `resourceDeviceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resourceDeviceIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_resourceDeviceIndex(segment, 0L, value); }
    /// Sets `resourceDeviceIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo resourceDeviceIndexAt(long index, @CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_resourceDeviceIndex(this.segment(), index, value); return this; }
    /// Sets `resourceDeviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo resourceDeviceIndex(@CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_resourceDeviceIndex(this.segment(), value); return this; }

    /// {@return `memoryDeviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryDeviceIndex(MemorySegment segment, long index) { return (int) VH_memoryDeviceIndex.get(segment, 0L, index); }
    /// {@return `memoryDeviceIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryDeviceIndex(MemorySegment segment) { return VkDeviceGroupBindSparseInfo.get_memoryDeviceIndex(segment, 0L); }
    /// {@return `memoryDeviceIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryDeviceIndexAt(long index) { return VkDeviceGroupBindSparseInfo.get_memoryDeviceIndex(this.segment(), index); }
    /// {@return `memoryDeviceIndex`}
    public @CType("uint32_t") int memoryDeviceIndex() { return VkDeviceGroupBindSparseInfo.get_memoryDeviceIndex(this.segment()); }
    /// Sets `memoryDeviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryDeviceIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryDeviceIndex.set(segment, 0L, index, value); }
    /// Sets `memoryDeviceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryDeviceIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_memoryDeviceIndex(segment, 0L, value); }
    /// Sets `memoryDeviceIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo memoryDeviceIndexAt(long index, @CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_memoryDeviceIndex(this.segment(), index, value); return this; }
    /// Sets `memoryDeviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfo memoryDeviceIndex(@CType("uint32_t") int value) { VkDeviceGroupBindSparseInfo.set_memoryDeviceIndex(this.segment(), value); return this; }

}