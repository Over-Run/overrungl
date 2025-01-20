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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### heapBudget
/// [Byte offset][#OFFSET_heapBudget] - [Memory layout][#ML_heapBudget] - [Getter][#heapBudget()] - [Setter][#heapBudget(MemorySegment)]
/// ### heapUsage
/// [Byte offset][#OFFSET_heapUsage] - [Memory layout][#ML_heapUsage] - [Getter][#heapUsage()] - [Setter][#heapUsage(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize[VK_MAX_MEMORY_HEAPS] heapBudget;
///     VkDeviceSize[VK_MAX_MEMORY_HEAPS] heapUsage;
/// } VkPhysicalDeviceMemoryBudgetPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapUsage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `heapBudget`.
    public static final long OFFSET_heapBudget = LAYOUT.byteOffset(PathElement.groupElement("heapBudget"));
    /// The memory layout of `heapBudget`.
    public static final MemoryLayout ML_heapBudget = LAYOUT.select(PathElement.groupElement("heapBudget"));
    /// The byte offset of `heapUsage`.
    public static final long OFFSET_heapUsage = LAYOUT.byteOffset(PathElement.groupElement("heapUsage"));
    /// The memory layout of `heapUsage`.
    public static final MemoryLayout ML_heapUsage = LAYOUT.select(PathElement.groupElement("heapUsage"));

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapBudget, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapUsage) { return alloc(allocator).sType(sType).pNext(pNext).heapBudget(heapBudget).heapUsage(heapUsage); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT copyFrom(VkPhysicalDeviceMemoryBudgetPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `heapBudget` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment get_heapBudget(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_heapBudget, index), ML_heapBudget); }
    /// {@return `heapBudget`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment get_heapBudget(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(segment, 0L); }
    /// {@return `heapBudget`}
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapBudget() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(this.segment()); }
    /// Sets `heapBudget` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_heapBudget(MemorySegment segment, long index, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_heapBudget, index), ML_heapBudget.byteSize()); }
    /// Sets `heapBudget` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_heapBudget(MemorySegment segment, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(segment, 0L, value); }
    /// Sets `heapBudget` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(@CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(this.segment(), value); return this; }

    /// {@return `heapUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment get_heapUsage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_heapUsage, index), ML_heapUsage); }
    /// {@return `heapUsage`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment get_heapUsage(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(segment, 0L); }
    /// {@return `heapUsage`}
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapUsage() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(this.segment()); }
    /// Sets `heapUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_heapUsage(MemorySegment segment, long index, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_heapUsage, index), ML_heapUsage.byteSize()); }
    /// Sets `heapUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_heapUsage(MemorySegment segment, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(segment, 0L, value); }
    /// Sets `heapUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(@CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMemoryBudgetPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceMemoryBudgetPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `heapBudget` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapBudgetAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(this.segment(), index); }
        /// Sets `heapBudget` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer heapBudgetAt(long index, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(this.segment(), index, value); return this; }

        /// {@return `heapUsage` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment heapUsageAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(this.segment(), index); }
        /// Sets `heapUsage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer heapUsageAt(long index, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(this.segment(), index, value); return this; }

    }
}
