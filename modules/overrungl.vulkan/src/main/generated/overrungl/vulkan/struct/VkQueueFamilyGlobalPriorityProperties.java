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
/// struct VkQueueFamilyGlobalPriorityProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t priorityCount;
///     (int) VkQueueGlobalPriority priorities[16];
/// };
/// ```
public final class VkQueueFamilyGlobalPriorityProperties extends GroupType {
    /// The struct layout of `VkQueueFamilyGlobalPriorityProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_INT).withName("priorities")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `priorityCount`.
    public static final long OFFSET_priorityCount = LAYOUT.byteOffset(PathElement.groupElement("priorityCount"));
    /// The memory layout of `priorityCount`.
    public static final MemoryLayout LAYOUT_priorityCount = LAYOUT.select(PathElement.groupElement("priorityCount"));
    /// The [VarHandle] of `priorityCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_priorityCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priorityCount"));
    /// The byte offset of `priorities`.
    public static final long OFFSET_priorities = LAYOUT.byteOffset(PathElement.groupElement("priorities"));
    /// The memory layout of `priorities`.
    public static final MemoryLayout LAYOUT_priorities = LAYOUT.select(PathElement.groupElement("priorities"));
    /// The [VarHandle] of `priorities` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_priorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priorities"), PathElement.sequenceElement());

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyGlobalPriorityProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyGlobalPriorityProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyGlobalPriorityProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyGlobalPriorityProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties alloc(SegmentAllocator allocator) { return new VkQueueFamilyGlobalPriorityProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyGlobalPriorityProperties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param priorityCount `priorityCount`
    /// @param priorities `priorities`
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int priorityCount, MemorySegment priorities) {
        return alloc(allocator).sType(sType).pNext(pNext).priorityCount(priorityCount).priorities(priorities);
    }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param priorityCount `priorityCount`
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int priorityCount) {
        return alloc(allocator).sType(sType).pNext(pNext).priorityCount(priorityCount);
    }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties copyFrom(VkQueueFamilyGlobalPriorityProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyGlobalPriorityProperties reinterpret(long count) { return new VkQueueFamilyGlobalPriorityProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `priorityCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int priorityCount(MemorySegment segment, long index) { return (int) VH_priorityCount.get(segment, 0L, index); }
    /// {@return `priorityCount`}
    public int priorityCount() { return priorityCount(this.segment(), 0L); }
    /// Sets `priorityCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void priorityCount(MemorySegment segment, long index, int value) { VH_priorityCount.set(segment, 0L, index, value); }
    /// Sets `priorityCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorityCount(int value) { priorityCount(this.segment(), 0L, value); return this; }

    /// {@return `priorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment priorities(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_priorities, index), LAYOUT_priorities); }
    /// {@return `priorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int priorities(MemorySegment segment, long index, long index0) { return (int) VH_priorities.get(segment, 0L, index, index0); }
    /// {@return `priorities`}
    public MemorySegment priorities() { return priorities(this.segment(), 0L); }
    /// {@return `priorities`}
    /// @param index0 the Index 0 of the array
    public int priorities(long index0) { return priorities(this.segment(), 0L, index0); }
    /// Sets `priorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void priorities(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_priorities, index), LAYOUT_priorities.byteSize()); }
    /// Sets `priorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void priorities(MemorySegment segment, long index, long index0, int value) { VH_priorities.set(segment, 0L, index, index0, value); }
    /// Sets `priorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorities(MemorySegment value) { priorities(this.segment(), 0L, value); return this; }
    /// Sets `priorities` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorities(long index0, int value) { priorities(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkQueueFamilyGlobalPriorityProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyGlobalPriorityProperties`
    public VkQueueFamilyGlobalPriorityProperties asSlice(long index) { return new VkQueueFamilyGlobalPriorityProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyGlobalPriorityProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyGlobalPriorityProperties`
    public VkQueueFamilyGlobalPriorityProperties asSlice(long index, long count) { return new VkQueueFamilyGlobalPriorityProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyGlobalPriorityProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties at(long index, Consumer<VkQueueFamilyGlobalPriorityProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `priorityCount` at the given index}
    /// @param index the index of the struct buffer
    public int priorityCountAt(long index) { return priorityCount(this.segment(), index); }
    /// Sets `priorityCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorityCountAt(long index, int value) { priorityCount(this.segment(), index, value); return this; }

    /// {@return `priorities` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment prioritiesAt(long index) { return priorities(this.segment(), index); }
    /// {@return `priorities` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int prioritiesAt(long index, long index0) { return priorities(this.segment(), index, index0); }
    /// Sets `priorities` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties prioritiesAt(long index, MemorySegment value) { priorities(this.segment(), index, value); return this; }
    /// Sets `priorities` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties prioritiesAt(long index, long index0, int value) { priorities(this.segment(), index, index0, value); return this; }

}
