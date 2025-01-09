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
/// [Byte offset][#OFFSET_memoryTypes] - [Memory layout][#ML_memoryTypes] - [Getter][#memoryTypes()] - [Setter][#memoryTypes(java.lang.foreign.MemorySegment)]
/// ### memoryHeapCount
/// [VarHandle][#VH_memoryHeapCount] - [Getter][#memoryHeapCount()] - [Setter][#memoryHeapCount(int)]
/// ### memoryHeaps
/// [Byte offset][#OFFSET_memoryHeaps] - [Memory layout][#ML_memoryHeaps] - [Getter][#memoryHeaps()] - [Setter][#memoryHeaps(java.lang.foreign.MemorySegment)]
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
    /// The byte offset of `memoryTypes`.
    public static final long OFFSET_memoryTypes = LAYOUT.byteOffset(PathElement.groupElement("memoryTypes"));
    /// The memory layout of `memoryTypes`.
    public static final MemoryLayout ML_memoryTypes = LAYOUT.select(PathElement.groupElement("memoryTypes"));
    /// The [VarHandle] of `memoryHeapCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryHeapCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryHeapCount"));
    /// The byte offset of `memoryHeaps`.
    public static final long OFFSET_memoryHeaps = LAYOUT.byteOffset(PathElement.groupElement("memoryHeaps"));
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

    /// Creates a slice of `VkPhysicalDeviceMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMemoryProperties`
    public VkPhysicalDeviceMemoryProperties asSlice(long index) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMemoryProperties`
    public VkPhysicalDeviceMemoryProperties asSlice(long index, long count) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

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
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment get_memoryTypes(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryTypes, index), ML_memoryTypes); }
    /// {@return `memoryTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment get_memoryTypes(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(segment, 0L); }
    /// {@return `memoryTypes` at the given index}
    /// @param index the index
    public @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment memoryTypesAt(long index) { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(this.segment(), index); }
    /// {@return `memoryTypes`}
    public @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment memoryTypes() { return VkPhysicalDeviceMemoryProperties.get_memoryTypes(this.segment()); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypes(MemorySegment segment, long index, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryTypes, index), ML_memoryTypes.byteSize()); }
    /// Sets `memoryTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypes(MemorySegment segment, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(segment, 0L, value); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypesAt(long index, @CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(this.segment(), index, value); return this; }
    /// Sets `memoryTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypes(@CType("VkMemoryType[VK_MAX_MEMORY_TYPES]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryTypes(this.segment(), value); return this; }

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
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_memoryHeaps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryHeaps, index), ML_memoryHeaps); }
    /// {@return `memoryHeaps`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_memoryHeaps(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(segment, 0L); }
    /// {@return `memoryHeaps` at the given index}
    /// @param index the index
    public @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment memoryHeapsAt(long index) { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(this.segment(), index); }
    /// {@return `memoryHeaps`}
    public @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment memoryHeaps() { return VkPhysicalDeviceMemoryProperties.get_memoryHeaps(this.segment()); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryHeaps(MemorySegment segment, long index, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryHeaps, index), ML_memoryHeaps.byteSize()); }
    /// Sets `memoryHeaps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryHeaps(MemorySegment segment, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(segment, 0L, value); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapsAt(long index, @CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(this.segment(), index, value); return this; }
    /// Sets `memoryHeaps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeaps(@CType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties.set_memoryHeaps(this.segment(), value); return this; }

}
