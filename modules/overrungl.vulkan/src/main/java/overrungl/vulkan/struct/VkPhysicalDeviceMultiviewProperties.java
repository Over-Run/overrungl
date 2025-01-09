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
/// ### maxMultiviewViewCount
/// [VarHandle][#VH_maxMultiviewViewCount] - [Getter][#maxMultiviewViewCount()] - [Setter][#maxMultiviewViewCount(int)]
/// ### maxMultiviewInstanceIndex
/// [VarHandle][#VH_maxMultiviewInstanceIndex] - [Getter][#maxMultiviewInstanceIndex()] - [Setter][#maxMultiviewInstanceIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMultiviewProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// } VkPhysicalDeviceMultiviewProperties;
/// ```
public final class VkPhysicalDeviceMultiviewProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceMultiviewProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    /// The [VarHandle] of `maxMultiviewInstanceIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMultiviewProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewProperties`
    public static VkPhysicalDeviceMultiviewProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewProperties`
    public static VkPhysicalDeviceMultiviewProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMultiviewProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMultiviewProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMultiviewProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMultiviewProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMultiviewProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMultiviewProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMultiviewViewCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMultiviewViewCount(MemorySegment segment) { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewViewCount(segment, 0L); }
    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMultiviewViewCountAt(long index) { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewViewCount(this.segment(), index); }
    /// {@return `maxMultiviewViewCount`}
    public @CType("uint32_t") int maxMultiviewViewCount() { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewViewCount(this.segment()); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMultiviewViewCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMultiviewViewCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewViewCount(segment, 0L, value); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewViewCount(this.segment(), index, value); return this; }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCount(@CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewViewCount(this.segment(), value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMultiviewInstanceIndex(MemorySegment segment, long index) { return (int) VH_maxMultiviewInstanceIndex.get(segment, 0L, index); }
    /// {@return `maxMultiviewInstanceIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMultiviewInstanceIndex(MemorySegment segment) { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewInstanceIndex(segment, 0L); }
    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMultiviewInstanceIndexAt(long index) { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewInstanceIndex(this.segment(), index); }
    /// {@return `maxMultiviewInstanceIndex`}
    public @CType("uint32_t") int maxMultiviewInstanceIndex() { return VkPhysicalDeviceMultiviewProperties.get_maxMultiviewInstanceIndex(this.segment()); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMultiviewInstanceIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMultiviewInstanceIndex.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMultiviewInstanceIndex(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewInstanceIndex(segment, 0L, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndexAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewInstanceIndex(this.segment(), index, value); return this; }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndex(@CType("uint32_t") int value) { VkPhysicalDeviceMultiviewProperties.set_maxMultiviewInstanceIndex(this.segment(), value); return this; }

}