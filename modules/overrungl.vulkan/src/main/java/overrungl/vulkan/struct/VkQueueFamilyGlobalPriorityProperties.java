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
import static overrungl.vulkan.VK14.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### priorityCount
/// [VarHandle][#VH_priorityCount] - [Getter][#priorityCount()] - [Setter][#priorityCount(int)]
/// ### priorities
/// [Byte offset][#OFFSET_priorities] - [Memory layout][#ML_priorities] - [Getter][#priorities()] - [Setter][#priorities(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyGlobalPriorityProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t priorityCount;
///     VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE] priorities;
/// } VkQueueFamilyGlobalPriorityProperties;
/// ```
public sealed class VkQueueFamilyGlobalPriorityProperties extends Struct {
    /// The struct layout of `VkQueueFamilyGlobalPriorityProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        MemoryLayout.sequenceLayout(VK_MAX_GLOBAL_PRIORITY_SIZE, ValueLayout.JAVA_INT).withName("priorities")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `priorityCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_priorityCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priorityCount"));
    /// The byte offset of `priorities`.
    public static final long OFFSET_priorities = LAYOUT.byteOffset(PathElement.groupElement("priorities"));
    /// The memory layout of `priorities`.
    public static final MemoryLayout ML_priorities = LAYOUT.select(PathElement.groupElement("priorities"));

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyGlobalPriorityProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyGlobalPriorityProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityProperties(segment); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyGlobalPriorityProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyGlobalPriorityProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties alloc(SegmentAllocator allocator) { return new VkQueueFamilyGlobalPriorityProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyGlobalPriorityProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyGlobalPriorityProperties`
    public static VkQueueFamilyGlobalPriorityProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int priorityCount, @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment priorities) { return alloc(allocator).sType(sType).pNext(pNext).priorityCount(priorityCount).priorities(priorities); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties copyFrom(VkQueueFamilyGlobalPriorityProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueueFamilyGlobalPriorityProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueueFamilyGlobalPriorityProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties sType(@CType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueueFamilyGlobalPriorityProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkQueueFamilyGlobalPriorityProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `priorityCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_priorityCount(MemorySegment segment, long index) { return (int) VH_priorityCount.get(segment, 0L, index); }
    /// {@return `priorityCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_priorityCount(MemorySegment segment) { return VkQueueFamilyGlobalPriorityProperties.get_priorityCount(segment, 0L); }
    /// {@return `priorityCount`}
    public @CType("uint32_t") int priorityCount() { return VkQueueFamilyGlobalPriorityProperties.get_priorityCount(this.segment()); }
    /// Sets `priorityCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_priorityCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_priorityCount.set(segment, 0L, index, value); }
    /// Sets `priorityCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_priorityCount(MemorySegment segment, @CType("uint32_t") int value) { VkQueueFamilyGlobalPriorityProperties.set_priorityCount(segment, 0L, value); }
    /// Sets `priorityCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorityCount(@CType("uint32_t") int value) { VkQueueFamilyGlobalPriorityProperties.set_priorityCount(this.segment(), value); return this; }

    /// {@return `priorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment get_priorities(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_priorities, index), ML_priorities); }
    /// {@return `priorities`}
    /// @param segment the segment of the struct
    public static @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment get_priorities(MemorySegment segment) { return VkQueueFamilyGlobalPriorityProperties.get_priorities(segment, 0L); }
    /// {@return `priorities`}
    public @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment priorities() { return VkQueueFamilyGlobalPriorityProperties.get_priorities(this.segment()); }
    /// Sets `priorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_priorities(MemorySegment segment, long index, @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_priorities, index), ML_priorities.byteSize()); }
    /// Sets `priorities` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_priorities(MemorySegment segment, @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_priorities(segment, 0L, value); }
    /// Sets `priorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyGlobalPriorityProperties priorities(@CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_priorities(this.segment(), value); return this; }

    /// A buffer of [VkQueueFamilyGlobalPriorityProperties].
    public static final class Buffer extends VkQueueFamilyGlobalPriorityProperties {
        private final long elementCount;

        /// Creates `VkQueueFamilyGlobalPriorityProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkQueueFamilyGlobalPriorityProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkQueueFamilyGlobalPriorityProperties`
        public VkQueueFamilyGlobalPriorityProperties asSlice(long index) { return new VkQueueFamilyGlobalPriorityProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkQueueFamilyGlobalPriorityProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkQueueFamilyGlobalPriorityProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkQueueFamilyGlobalPriorityProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueueFamilyGlobalPriorityProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `priorityCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int priorityCountAt(long index) { return VkQueueFamilyGlobalPriorityProperties.get_priorityCount(this.segment(), index); }
        /// Sets `priorityCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer priorityCountAt(long index, @CType("uint32_t") int value) { VkQueueFamilyGlobalPriorityProperties.set_priorityCount(this.segment(), index, value); return this; }

        /// {@return `priorities` at the given index}
        /// @param index the index
        public @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment prioritiesAt(long index) { return VkQueueFamilyGlobalPriorityProperties.get_priorities(this.segment(), index); }
        /// Sets `priorities` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer prioritiesAt(long index, @CType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]") java.lang.foreign.MemorySegment value) { VkQueueFamilyGlobalPriorityProperties.set_priorities(this.segment(), index, value); return this; }

    }
}
