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
package overrungl.vulkan.khr.struct;

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
/// ### queueFamilyIndex
/// [VarHandle][#VH_queueFamilyIndex] - [Getter][#queueFamilyIndex()] - [Setter][#queueFamilyIndex(int)]
/// ### counterIndexCount
/// [VarHandle][#VH_counterIndexCount] - [Getter][#counterIndexCount()] - [Setter][#counterIndexCount(int)]
/// ### pCounterIndices
/// [VarHandle][#VH_pCounterIndices] - [Getter][#pCounterIndices()] - [Setter][#pCounterIndices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueryPoolPerformanceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t queueFamilyIndex;
///     uint32_t counterIndexCount;
///     const uint32_t * pCounterIndices;
/// } VkQueryPoolPerformanceCreateInfoKHR;
/// ```
public final class VkQueryPoolPerformanceCreateInfoKHR extends Struct {
    /// The struct layout of `VkQueryPoolPerformanceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withName("pCounterIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `counterIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_counterIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterIndexCount"));
    /// The [VarHandle] of `pCounterIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCounterIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCounterIndices"));

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkQueryPoolPerformanceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolPerformanceCreateInfoKHR`
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueryPoolPerformanceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolPerformanceCreateInfoKHR`
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueryPoolPerformanceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkQueryPoolPerformanceCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueryPoolPerformanceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueryPoolPerformanceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueryPoolPerformanceCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkQueryPoolPerformanceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment) { return VkQueryPoolPerformanceCreateInfoKHR.get_queueFamilyIndex(segment, 0L); }
    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueFamilyIndexAt(long index) { return VkQueryPoolPerformanceCreateInfoKHR.get_queueFamilyIndex(this.segment(), index); }
    /// {@return `queueFamilyIndex`}
    public @CType("uint32_t") int queueFamilyIndex() { return VkQueryPoolPerformanceCreateInfoKHR.get_queueFamilyIndex(this.segment()); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_queueFamilyIndex(segment, 0L, value); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_queueFamilyIndex(this.segment(), index, value); return this; }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndex(@CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_queueFamilyIndex(this.segment(), value); return this; }

    /// {@return `counterIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_counterIndexCount(MemorySegment segment, long index) { return (int) VH_counterIndexCount.get(segment, 0L, index); }
    /// {@return `counterIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_counterIndexCount(MemorySegment segment) { return VkQueryPoolPerformanceCreateInfoKHR.get_counterIndexCount(segment, 0L); }
    /// {@return `counterIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int counterIndexCountAt(long index) { return VkQueryPoolPerformanceCreateInfoKHR.get_counterIndexCount(this.segment(), index); }
    /// {@return `counterIndexCount`}
    public @CType("uint32_t") int counterIndexCount() { return VkQueryPoolPerformanceCreateInfoKHR.get_counterIndexCount(this.segment()); }
    /// Sets `counterIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_counterIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_counterIndexCount.set(segment, 0L, index, value); }
    /// Sets `counterIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_counterIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_counterIndexCount(segment, 0L, value); }
    /// Sets `counterIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCountAt(long index, @CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_counterIndexCount(this.segment(), index, value); return this; }
    /// Sets `counterIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCount(@CType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.set_counterIndexCount(this.segment(), value); return this; }

    /// {@return `pCounterIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCounterIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCounterIndices.get(segment, 0L, index); }
    /// {@return `pCounterIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCounterIndices(MemorySegment segment) { return VkQueryPoolPerformanceCreateInfoKHR.get_pCounterIndices(segment, 0L); }
    /// {@return `pCounterIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCounterIndicesAt(long index) { return VkQueryPoolPerformanceCreateInfoKHR.get_pCounterIndices(this.segment(), index); }
    /// {@return `pCounterIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCounterIndices() { return VkQueryPoolPerformanceCreateInfoKHR.get_pCounterIndices(this.segment()); }
    /// Sets `pCounterIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCounterIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pCounterIndices.set(segment, 0L, index, value); }
    /// Sets `pCounterIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCounterIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pCounterIndices(segment, 0L, value); }
    /// Sets `pCounterIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pCounterIndices(this.segment(), index, value); return this; }
    /// Sets `pCounterIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceCreateInfoKHR.set_pCounterIndices(this.segment(), value); return this; }

}
