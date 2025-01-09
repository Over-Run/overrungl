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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### heapBudget
/// [Byte offset handle][#MH_heapBudget] - [Memory layout][#ML_heapBudget] - [Getter][#heapBudget(long)] - [Setter][#heapBudget(long, java.lang.foreign.MemorySegment)]
/// ### heapUsage
/// [Byte offset handle][#MH_heapUsage] - [Memory layout][#ML_heapUsage] - [Getter][#heapUsage(long)] - [Setter][#heapUsage(long, java.lang.foreign.MemorySegment)]
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
public final class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapUsage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset handle of `heapBudget` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_heapBudget = LAYOUT.byteOffsetHandle(PathElement.groupElement("heapBudget"), PathElement.sequenceElement());
    /// The memory layout of `heapBudget`.
    public static final MemoryLayout ML_heapBudget = LAYOUT.select(PathElement.groupElement("heapBudget"));
    /// The byte offset handle of `heapUsage` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_heapUsage = LAYOUT.byteOffsetHandle(PathElement.groupElement("heapUsage"), PathElement.sequenceElement());
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
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `heapBudget` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_heapBudget(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_heapBudget.invokeExact(0L, elementIndex), index), ML_heapBudget); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `heapBudget`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_heapBudget(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(segment, 0L, elementIndex); }
    /// {@return `heapBudget` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment heapBudgetAt(long index, long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(this.segment(), index, elementIndex); }
    /// {@return `heapBudget`}
    /// @param elementIndex the index of the element
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment heapBudget(long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapBudget(this.segment(), elementIndex); }
    /// Sets `heapBudget` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_heapBudget(MemorySegment segment, long index, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_heapBudget.invokeExact(0L, elementIndex), index), ML_heapBudget.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `heapBudget` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_heapBudget(MemorySegment segment, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(segment, 0L, elementIndex, value); }
    /// Sets `heapBudget` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudgetAt(long index, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(this.segment(), index, elementIndex, value); return this; }
    /// Sets `heapBudget` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapBudget(this.segment(), elementIndex, value); return this; }

    /// {@return `heapUsage` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_heapUsage(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_heapUsage.invokeExact(0L, elementIndex), index), ML_heapUsage); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `heapUsage`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment get_heapUsage(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(segment, 0L, elementIndex); }
    /// {@return `heapUsage` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment heapUsageAt(long index, long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(this.segment(), index, elementIndex); }
    /// {@return `heapUsage`}
    /// @param elementIndex the index of the element
    public @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment heapUsage(long elementIndex) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.get_heapUsage(this.segment(), elementIndex); }
    /// Sets `heapUsage` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_heapUsage(MemorySegment segment, long index, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_heapUsage.invokeExact(0L, elementIndex), index), ML_heapUsage.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `heapUsage` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_heapUsage(MemorySegment segment, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(segment, 0L, elementIndex, value); }
    /// Sets `heapUsage` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsageAt(long index, long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(this.segment(), index, elementIndex, value); return this; }
    /// Sets `heapUsage` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(long elementIndex, @CType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.set_heapUsage(this.segment(), elementIndex, value); return this; }

}
