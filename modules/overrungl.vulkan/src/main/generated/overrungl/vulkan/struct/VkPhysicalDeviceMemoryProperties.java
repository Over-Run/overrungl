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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryProperties {
///     uint32_t memoryTypeCount;
///     (struct VkMemoryType) VkMemoryType memoryTypes[32];
///     uint32_t memoryHeapCount;
///     (struct VkMemoryHeap) VkMemoryHeap memoryHeaps[16];
/// };
/// ```
public final class VkPhysicalDeviceMemoryProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMemoryProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(32, overrungl.vulkan.struct.VkMemoryType.LAYOUT).withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(16, overrungl.vulkan.struct.VkMemoryHeap.LAYOUT).withName("memoryHeaps")
    );
    /// The byte offset of `memoryTypeCount`.
    public static final long OFFSET_memoryTypeCount = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeCount"));
    /// The memory layout of `memoryTypeCount`.
    public static final MemoryLayout LAYOUT_memoryTypeCount = LAYOUT.select(PathElement.groupElement("memoryTypeCount"));
    /// The [VarHandle] of `memoryTypeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeCount"));
    /// The byte offset of `memoryTypes`.
    public static final long OFFSET_memoryTypes = LAYOUT.byteOffset(PathElement.groupElement("memoryTypes"));
    /// The memory layout of `memoryTypes`.
    public static final MemoryLayout LAYOUT_memoryTypes = LAYOUT.select(PathElement.groupElement("memoryTypes"));
    /// The byte offset of `memoryHeapCount`.
    public static final long OFFSET_memoryHeapCount = LAYOUT.byteOffset(PathElement.groupElement("memoryHeapCount"));
    /// The memory layout of `memoryHeapCount`.
    public static final MemoryLayout LAYOUT_memoryHeapCount = LAYOUT.select(PathElement.groupElement("memoryHeapCount"));
    /// The [VarHandle] of `memoryHeapCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryHeapCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryHeapCount"));
    /// The byte offset of `memoryHeaps`.
    public static final long OFFSET_memoryHeaps = LAYOUT.byteOffset(PathElement.groupElement("memoryHeaps"));
    /// The memory layout of `memoryHeaps`.
    public static final MemoryLayout LAYOUT_memoryHeaps = LAYOUT.select(PathElement.groupElement("memoryHeaps"));

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMemoryProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryTypeCount `memoryTypeCount`
    /// @param memoryTypes `memoryTypes`
    /// @param memoryHeapCount `memoryHeapCount`
    /// @param memoryHeaps `memoryHeaps`
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties allocInit(SegmentAllocator allocator, int memoryTypeCount, MemorySegment memoryTypes, int memoryHeapCount, MemorySegment memoryHeaps) {
        return alloc(allocator).memoryTypeCount(memoryTypeCount).memoryTypes(memoryTypes).memoryHeapCount(memoryHeapCount).memoryHeaps(memoryHeaps);
    }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryTypeCount `memoryTypeCount`
    /// @param memoryTypes `memoryTypes`
    /// @param memoryHeapCount `memoryHeapCount`
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties allocInit(SegmentAllocator allocator, int memoryTypeCount, MemorySegment memoryTypes, int memoryHeapCount) {
        return alloc(allocator).memoryTypeCount(memoryTypeCount).memoryTypes(memoryTypes).memoryHeapCount(memoryHeapCount);
    }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryTypeCount `memoryTypeCount`
    /// @param memoryTypes `memoryTypes`
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties allocInit(SegmentAllocator allocator, int memoryTypeCount, MemorySegment memoryTypes) {
        return alloc(allocator).memoryTypeCount(memoryTypeCount).memoryTypes(memoryTypes);
    }

    /// Allocates a `VkPhysicalDeviceMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param memoryTypeCount `memoryTypeCount`
    /// @return the allocated `VkPhysicalDeviceMemoryProperties`
    public static VkPhysicalDeviceMemoryProperties allocInit(SegmentAllocator allocator, int memoryTypeCount) {
        return alloc(allocator).memoryTypeCount(memoryTypeCount);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties copyFrom(VkPhysicalDeviceMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMemoryProperties reinterpret(long count) { return new VkPhysicalDeviceMemoryProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `memoryTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeCount(MemorySegment segment, long index) { return (int) VH_memoryTypeCount.get(segment, 0L, index); }
    /// {@return `memoryTypeCount`}
    public int memoryTypeCount() { return memoryTypeCount(this.segment(), 0L); }
    /// Sets `memoryTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeCount(MemorySegment segment, long index, int value) { VH_memoryTypeCount.set(segment, 0L, index, value); }
    /// Sets `memoryTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypeCount(int value) { memoryTypeCount(this.segment(), 0L, value); return this; }

    /// {@return `memoryTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryTypes(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryTypes, index), LAYOUT_memoryTypes); }
    /// {@return `memoryTypes`}
    public MemorySegment memoryTypes() { return memoryTypes(this.segment(), 0L); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypes(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryTypes, index), LAYOUT_memoryTypes.byteSize()); }
    /// Sets `memoryTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypes(MemorySegment value) { memoryTypes(this.segment(), 0L, value); return this; }
    /// Accepts `memoryTypes` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypes(Consumer<overrungl.vulkan.struct.VkMemoryType> func) { func.accept(overrungl.vulkan.struct.VkMemoryType.of(memoryTypes())); return this; }

    /// {@return `memoryHeapCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryHeapCount(MemorySegment segment, long index) { return (int) VH_memoryHeapCount.get(segment, 0L, index); }
    /// {@return `memoryHeapCount`}
    public int memoryHeapCount() { return memoryHeapCount(this.segment(), 0L); }
    /// Sets `memoryHeapCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryHeapCount(MemorySegment segment, long index, int value) { VH_memoryHeapCount.set(segment, 0L, index, value); }
    /// Sets `memoryHeapCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapCount(int value) { memoryHeapCount(this.segment(), 0L, value); return this; }

    /// {@return `memoryHeaps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryHeaps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryHeaps, index), LAYOUT_memoryHeaps); }
    /// {@return `memoryHeaps`}
    public MemorySegment memoryHeaps() { return memoryHeaps(this.segment(), 0L); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryHeaps(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryHeaps, index), LAYOUT_memoryHeaps.byteSize()); }
    /// Sets `memoryHeaps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeaps(MemorySegment value) { memoryHeaps(this.segment(), 0L, value); return this; }
    /// Accepts `memoryHeaps` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeaps(Consumer<overrungl.vulkan.struct.VkMemoryHeap> func) { func.accept(overrungl.vulkan.struct.VkMemoryHeap.of(memoryHeaps())); return this; }

    /// Creates a slice of `VkPhysicalDeviceMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMemoryProperties`
    public VkPhysicalDeviceMemoryProperties asSlice(long index) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMemoryProperties`
    public VkPhysicalDeviceMemoryProperties asSlice(long index, long count) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMemoryProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties at(long index, Consumer<VkPhysicalDeviceMemoryProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `memoryTypeCount` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeCountAt(long index) { return memoryTypeCount(this.segment(), index); }
    /// Sets `memoryTypeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypeCountAt(long index, int value) { memoryTypeCount(this.segment(), index, value); return this; }

    /// {@return `memoryTypes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment memoryTypesAt(long index) { return memoryTypes(this.segment(), index); }
    /// Sets `memoryTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypesAt(long index, MemorySegment value) { memoryTypes(this.segment(), index, value); return this; }
    /// Accepts `memoryTypes` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryTypesAt(long index, Consumer<overrungl.vulkan.struct.VkMemoryType> func) { func.accept(overrungl.vulkan.struct.VkMemoryType.of(memoryTypesAt(index))); return this; }

    /// {@return `memoryHeapCount` at the given index}
    /// @param index the index of the struct buffer
    public int memoryHeapCountAt(long index) { return memoryHeapCount(this.segment(), index); }
    /// Sets `memoryHeapCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapCountAt(long index, int value) { memoryHeapCount(this.segment(), index, value); return this; }

    /// {@return `memoryHeaps` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment memoryHeapsAt(long index) { return memoryHeaps(this.segment(), index); }
    /// Sets `memoryHeaps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapsAt(long index, MemorySegment value) { memoryHeaps(this.segment(), index, value); return this; }
    /// Accepts `memoryHeaps` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties memoryHeapsAt(long index, Consumer<overrungl.vulkan.struct.VkMemoryHeap> func) { func.accept(overrungl.vulkan.struct.VkMemoryHeap.of(memoryHeapsAt(index))); return this; }

}
