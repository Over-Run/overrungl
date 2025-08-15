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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryPoolPerformanceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkQueryPoolPerformanceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     uint32_t counterIndexCount;
///     const uint32_t* pCounterIndices;
/// };
/// ```
public final class VkQueryPoolPerformanceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkQueryPoolPerformanceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withName("pCounterIndices")
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
    /// The byte offset of `queueFamilyIndex`.
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    /// The memory layout of `queueFamilyIndex`.
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The byte offset of `counterIndexCount`.
    public static final long OFFSET_counterIndexCount = LAYOUT.byteOffset(PathElement.groupElement("counterIndexCount"));
    /// The memory layout of `counterIndexCount`.
    public static final MemoryLayout LAYOUT_counterIndexCount = LAYOUT.select(PathElement.groupElement("counterIndexCount"));
    /// The [VarHandle] of `counterIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_counterIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterIndexCount"));
    /// The byte offset of `pCounterIndices`.
    public static final long OFFSET_pCounterIndices = LAYOUT.byteOffset(PathElement.groupElement("pCounterIndices"));
    /// The memory layout of `pCounterIndices`.
    public static final MemoryLayout LAYOUT_pCounterIndices = LAYOUT.select(PathElement.groupElement("pCounterIndices"));
    /// The [VarHandle] of `pCounterIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCounterIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCounterIndices"));

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueryPoolPerformanceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueryPoolPerformanceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolPerformanceCreateInfoKHR`
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueryPoolPerformanceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolPerformanceCreateInfoKHR`
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR copyFrom(VkQueryPoolPerformanceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueryPoolPerformanceCreateInfoKHR reinterpret(long count) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueryPoolPerformanceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueryPoolPerformanceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    public int queueFamilyIndex() { return queueFamilyIndex(this.segment(), 0L); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndex(MemorySegment segment, long index, int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndex(int value) { queueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `counterIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int counterIndexCount(MemorySegment segment, long index) { return (int) VH_counterIndexCount.get(segment, 0L, index); }
    /// {@return `counterIndexCount`}
    public int counterIndexCount() { return counterIndexCount(this.segment(), 0L); }
    /// Sets `counterIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void counterIndexCount(MemorySegment segment, long index, int value) { VH_counterIndexCount.set(segment, 0L, index, value); }
    /// Sets `counterIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCount(int value) { counterIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pCounterIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCounterIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pCounterIndices.get(segment, 0L, index); }
    /// {@return `pCounterIndices`}
    public MemorySegment pCounterIndices() { return pCounterIndices(this.segment(), 0L); }
    /// Sets `pCounterIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCounterIndices(MemorySegment segment, long index, MemorySegment value) { VH_pCounterIndices.set(segment, 0L, index, value); }
    /// Sets `pCounterIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndices(MemorySegment value) { pCounterIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkQueryPoolPerformanceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueryPoolPerformanceCreateInfoKHR`
    public VkQueryPoolPerformanceCreateInfoKHR asSlice(long index) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueryPoolPerformanceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueryPoolPerformanceCreateInfoKHR`
    public VkQueryPoolPerformanceCreateInfoKHR asSlice(long index, long count) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueryPoolPerformanceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR at(long index, Consumer<VkQueryPoolPerformanceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int queueFamilyIndexAt(long index) { return queueFamilyIndex(this.segment(), index); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndexAt(long index, int value) { queueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `counterIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int counterIndexCountAt(long index) { return counterIndexCount(this.segment(), index); }
    /// Sets `counterIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCountAt(long index, int value) { counterIndexCount(this.segment(), index, value); return this; }

    /// {@return `pCounterIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCounterIndicesAt(long index) { return pCounterIndices(this.segment(), index); }
    /// Sets `pCounterIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndicesAt(long index, MemorySegment value) { pCounterIndices(this.segment(), index, value); return this; }

}
