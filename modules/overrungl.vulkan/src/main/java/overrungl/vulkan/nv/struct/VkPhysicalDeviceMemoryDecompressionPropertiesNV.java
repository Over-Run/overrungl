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
/// ### decompressionMethods
/// [VarHandle][#VH_decompressionMethods] - [Getter][#decompressionMethods()] - [Setter][#decompressionMethods(long)]
/// ### maxDecompressionIndirectCount
/// [VarHandle][#VH_maxDecompressionIndirectCount] - [Getter][#maxDecompressionIndirectCount()] - [Setter][#maxDecompressionIndirectCount(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkMemoryDecompressionMethodFlagsNV decompressionMethods;
///     uint64_t maxDecompressionIndirectCount;
/// } VkPhysicalDeviceMemoryDecompressionPropertiesNV;
/// ```
public final class VkPhysicalDeviceMemoryDecompressionPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("decompressionMethods"),
        ValueLayout.JAVA_LONG.withName("maxDecompressionIndirectCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `decompressionMethods` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_decompressionMethods = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethods"));
    /// The [VarHandle] of `maxDecompressionIndirectCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxDecompressionIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDecompressionIndirectCount"));

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `decompressionMethods` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryDecompressionMethodFlagsNV") long get_decompressionMethods(MemorySegment segment, long index) { return (long) VH_decompressionMethods.get(segment, 0L, index); }
    /// {@return `decompressionMethods`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryDecompressionMethodFlagsNV") long get_decompressionMethods(MemorySegment segment) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_decompressionMethods(segment, 0L); }
    /// {@return `decompressionMethods` at the given index}
    /// @param index the index
    public @CType("VkMemoryDecompressionMethodFlagsNV") long decompressionMethodsAt(long index) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_decompressionMethods(this.segment(), index); }
    /// {@return `decompressionMethods`}
    public @CType("VkMemoryDecompressionMethodFlagsNV") long decompressionMethods() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_decompressionMethods(this.segment()); }
    /// Sets `decompressionMethods` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decompressionMethods(MemorySegment segment, long index, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VH_decompressionMethods.set(segment, 0L, index, value); }
    /// Sets `decompressionMethods` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decompressionMethods(MemorySegment segment, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_decompressionMethods(segment, 0L, value); }
    /// Sets `decompressionMethods` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV decompressionMethodsAt(long index, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_decompressionMethods(this.segment(), index, value); return this; }
    /// Sets `decompressionMethods` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV decompressionMethods(@CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_decompressionMethods(this.segment(), value); return this; }

    /// {@return `maxDecompressionIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxDecompressionIndirectCount(MemorySegment segment, long index) { return (long) VH_maxDecompressionIndirectCount.get(segment, 0L, index); }
    /// {@return `maxDecompressionIndirectCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxDecompressionIndirectCount(MemorySegment segment) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_maxDecompressionIndirectCount(segment, 0L); }
    /// {@return `maxDecompressionIndirectCount` at the given index}
    /// @param index the index
    public @CType("uint64_t") long maxDecompressionIndirectCountAt(long index) { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_maxDecompressionIndirectCount(this.segment(), index); }
    /// {@return `maxDecompressionIndirectCount`}
    public @CType("uint64_t") long maxDecompressionIndirectCount() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.get_maxDecompressionIndirectCount(this.segment()); }
    /// Sets `maxDecompressionIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDecompressionIndirectCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxDecompressionIndirectCount.set(segment, 0L, index, value); }
    /// Sets `maxDecompressionIndirectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDecompressionIndirectCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_maxDecompressionIndirectCount(segment, 0L, value); }
    /// Sets `maxDecompressionIndirectCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV maxDecompressionIndirectCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_maxDecompressionIndirectCount(this.segment(), index, value); return this; }
    /// Sets `maxDecompressionIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV maxDecompressionIndirectCount(@CType("uint64_t") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.set_maxDecompressionIndirectCount(this.segment(), value); return this; }

}
