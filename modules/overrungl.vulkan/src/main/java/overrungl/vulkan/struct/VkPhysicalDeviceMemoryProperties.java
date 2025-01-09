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
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### memoryTypeCount
/// [VarHandle][#VH_memoryTypeCount] - [Getter][#memoryTypeCount()] - [Setter][#memoryTypeCount(int)]
/// ### memoryTypes
/// [Byte offset handle][#MH_memoryTypes] - [Memory layout][#ML_memoryTypes] - [Getter][#memoryTypes(long)] - [Setter][#memoryTypes(long, java.lang.foreign.MemorySegment)]
/// ### memoryHeapCount
/// [VarHandle][#VH_memoryHeapCount] - [Getter][#memoryHeapCount()] - [Setter][#memoryHeapCount(int)]
/// ### memoryHeaps
/// [Byte offset handle][#MH_memoryHeaps] - [Memory layout][#ML_memoryHeaps] - [Getter][#memoryHeaps(long)] - [Setter][#memoryHeaps(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMemoryProperties {
///     uint32_t memoryTypeCount;
///     VkMemoryType[VK_MAX_MEMORY_TYPES] memoryTypes;
///     uint32_t memoryHeapCount;
///     VkMemoryHeap[VK_MAX_MEMORY_HEAPS] memoryHeaps;
/// } VkPhysicalDeviceMemoryProperties;
/// ```
public final class VkPhysicalDeviceMemoryProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceMemoryProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_TYPES, VkMemoryType.LAYOUT).withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, VkMemoryHeap.LAYOUT).withName("memoryHeaps")
    );
    /// The [VarHandle] of `memoryTypeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeCount"));
    /// The byte offset handle of `memoryTypes` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_memoryTypes = LAYOUT.byteOffsetHandle(PathElement.groupElement("memoryTypes"), PathElement.sequenceElement());
    /// The memory layout of `memoryTypes`.
    public static final MemoryLayout ML_memoryTypes = LAYOUT.select(PathElement.groupElement("memoryTypes"));
    /// The [VarHandle] of `memoryHeapCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryHeapCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryHeapCount"));
    /// The byte offset handle of `memoryHeaps` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_memoryHeaps = LAYOUT.byteOffsetHandle(PathElement.groupElement("memoryHeaps"), PathElement.sequenceElement());
    /// The memory layout of `memoryHeaps`.
    public static final MemoryLayout ML_memoryHeaps = LAYOUT.select(PathElement.groupElement("memoryHeaps"));

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `memoryTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeCount(MemorySegment segment, long index) { return (int) VH_memoryTypeCount.get(segment, 0L, index); }
    /// {@return `memoryTypeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeCount(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties.get_memoryTypeCount(segment, 0L); }
    /// {@return `memoryTypeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryTypeCountAt(long index) { return VkPhysicalDeviceMemoryProperties.get_memoryTypeCount(this.segment(), index); }
    /// {@return `memoryTypeCount`}
    public @CType("uint32_t") int memoryTypeCount() { return VkPhysicalDeviceMemoryProperties.get_memoryTypeCount(this.segment()); }
    /// Sets `memoryTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeCount.set(segment, 0L, index, value); }
    /// Sets `memoryTypeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryTypeCount(segment, 0L, value); }
    /// Sets `memoryTypeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypeCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryTypeCount(this.segment(), index, value); return this; }
    /// Sets `memoryTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypeCount(@CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryTypeCount(this.segment(), value); return this; }

    /// {@return `memoryTypes` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment get_memoryTypes(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_memoryTypes.invokeExact(0L, elementIndex), index), ML_memoryTypes); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `memoryTypes`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment get_memoryTypes(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(segment, 0L, elementIndex); }
    /// {@return `memoryTypes` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment memoryTypesAt(long index, long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(this.segment(), index, elementIndex); }
    /// {@return `memoryTypes`}
    /// @param elementIndex the index of the element
    public @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment memoryTypes(long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(this.segment(), elementIndex); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_memoryTypes(MemorySegment segment, long index, long elementIndex, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_memoryTypes.invokeExact(0L, elementIndex), index), ML_memoryTypes.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `memoryTypes` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_memoryTypes(MemorySegment segment, long elementIndex, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(segment, 0L, elementIndex, value); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypesAt(long index, long elementIndex, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(this.segment(), index, elementIndex, value); return this; }
    /// Sets `memoryTypes` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypes(long elementIndex, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(this.segment(), elementIndex, value); return this; }

    /// {@return `memoryHeapCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryHeapCount(MemorySegment segment, long index) { return (int) VH_memoryHeapCount.get(segment, 0L, index); }
    /// {@return `memoryHeapCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryHeapCount(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties.get_memoryHeapCount(segment, 0L); }
    /// {@return `memoryHeapCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryHeapCountAt(long index) { return VkPhysicalDeviceMemoryProperties.get_memoryHeapCount(this.segment(), index); }
    /// {@return `memoryHeapCount`}
    public @CType("uint32_t") int memoryHeapCount() { return VkPhysicalDeviceMemoryProperties.get_memoryHeapCount(this.segment()); }
    /// Sets `memoryHeapCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryHeapCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryHeapCount.set(segment, 0L, index, value); }
    /// Sets `memoryHeapCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryHeapCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryHeapCount(segment, 0L, value); }
    /// Sets `memoryHeapCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryHeapCount(this.segment(), index, value); return this; }
    /// Sets `memoryHeapCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapCount(@CType("uint32_t") int value) { VkPhysicalDeviceMemoryProperties.set_memoryHeapCount(this.segment(), value); return this; }

    /// {@return `memoryHeaps` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_memoryHeaps(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_memoryHeaps.invokeExact(0L, elementIndex), index), ML_memoryHeaps); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `memoryHeaps`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_memoryHeaps(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(segment, 0L, elementIndex); }
    /// {@return `memoryHeaps` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment memoryHeapsAt(long index, long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(this.segment(), index, elementIndex); }
    /// {@return `memoryHeaps`}
    /// @param elementIndex the index of the element
    public @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment memoryHeaps(long elementIndex) { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(this.segment(), elementIndex); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_memoryHeaps(MemorySegment segment, long index, long elementIndex, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_memoryHeaps.invokeExact(0L, elementIndex), index), ML_memoryHeaps.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `memoryHeaps` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_memoryHeaps(MemorySegment segment, long elementIndex, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(segment, 0L, elementIndex, value); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapsAt(long index, long elementIndex, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(this.segment(), index, elementIndex, value); return this; }
    /// Sets `memoryHeaps` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeaps(long elementIndex, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(this.segment(), elementIndex, value); return this; }

}
