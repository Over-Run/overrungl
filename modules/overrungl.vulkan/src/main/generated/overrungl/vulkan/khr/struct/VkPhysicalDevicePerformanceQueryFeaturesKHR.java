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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDevicePerformanceQueryFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 performanceCounterQueryPools;
///     (uint32_t) VkBool32 performanceCounterMultipleQueryPools;
/// };
/// ```
public final class VkPhysicalDevicePerformanceQueryFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevicePerformanceQueryFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCounterQueryPools"),
        ValueLayout.JAVA_INT.withName("performanceCounterMultipleQueryPools")
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
    /// The byte offset of `performanceCounterQueryPools`.
    public static final long OFFSET_performanceCounterQueryPools = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterQueryPools"));
    /// The memory layout of `performanceCounterQueryPools`.
    public static final MemoryLayout LAYOUT_performanceCounterQueryPools = LAYOUT.select(PathElement.groupElement("performanceCounterQueryPools"));
    /// The [VarHandle] of `performanceCounterQueryPools` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_performanceCounterQueryPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterQueryPools"));
    /// The byte offset of `performanceCounterMultipleQueryPools`.
    public static final long OFFSET_performanceCounterMultipleQueryPools = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterMultipleQueryPools"));
    /// The memory layout of `performanceCounterMultipleQueryPools`.
    public static final MemoryLayout LAYOUT_performanceCounterMultipleQueryPools = LAYOUT.select(PathElement.groupElement("performanceCounterMultipleQueryPools"));
    /// The [VarHandle] of `performanceCounterMultipleQueryPools` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_performanceCounterMultipleQueryPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterMultipleQueryPools"));

    /// Creates `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePerformanceQueryFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param performanceCounterQueryPools `performanceCounterQueryPools`
    /// @param performanceCounterMultipleQueryPools `performanceCounterMultipleQueryPools`
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int performanceCounterQueryPools, int performanceCounterMultipleQueryPools) {
        return alloc(allocator).sType(sType).pNext(pNext).performanceCounterQueryPools(performanceCounterQueryPools).performanceCounterMultipleQueryPools(performanceCounterMultipleQueryPools);
    }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param performanceCounterQueryPools `performanceCounterQueryPools`
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int performanceCounterQueryPools) {
        return alloc(allocator).sType(sType).pNext(pNext).performanceCounterQueryPools(performanceCounterQueryPools);
    }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDevicePerformanceQueryFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR copyFrom(VkPhysicalDevicePerformanceQueryFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePerformanceQueryFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `performanceCounterQueryPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int performanceCounterQueryPools(MemorySegment segment, long index) { return (int) VH_performanceCounterQueryPools.get(segment, 0L, index); }
    /// {@return `performanceCounterQueryPools`}
    public int performanceCounterQueryPools() { return performanceCounterQueryPools(this.segment(), 0L); }
    /// Sets `performanceCounterQueryPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void performanceCounterQueryPools(MemorySegment segment, long index, int value) { VH_performanceCounterQueryPools.set(segment, 0L, index, value); }
    /// Sets `performanceCounterQueryPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(int value) { performanceCounterQueryPools(this.segment(), 0L, value); return this; }

    /// {@return `performanceCounterMultipleQueryPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int performanceCounterMultipleQueryPools(MemorySegment segment, long index) { return (int) VH_performanceCounterMultipleQueryPools.get(segment, 0L, index); }
    /// {@return `performanceCounterMultipleQueryPools`}
    public int performanceCounterMultipleQueryPools() { return performanceCounterMultipleQueryPools(this.segment(), 0L); }
    /// Sets `performanceCounterMultipleQueryPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void performanceCounterMultipleQueryPools(MemorySegment segment, long index, int value) { VH_performanceCounterMultipleQueryPools.set(segment, 0L, index, value); }
    /// Sets `performanceCounterMultipleQueryPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(int value) { performanceCounterMultipleQueryPools(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePerformanceQueryFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePerformanceQueryFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePerformanceQueryFeaturesKHR`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePerformanceQueryFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR at(long index, Consumer<VkPhysicalDevicePerformanceQueryFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `performanceCounterQueryPools` at the given index}
    /// @param index the index of the struct buffer
    public int performanceCounterQueryPoolsAt(long index) { return performanceCounterQueryPools(this.segment(), index); }
    /// Sets `performanceCounterQueryPools` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPoolsAt(long index, int value) { performanceCounterQueryPools(this.segment(), index, value); return this; }

    /// {@return `performanceCounterMultipleQueryPools` at the given index}
    /// @param index the index of the struct buffer
    public int performanceCounterMultipleQueryPoolsAt(long index) { return performanceCounterMultipleQueryPools(this.segment(), index); }
    /// Sets `performanceCounterMultipleQueryPools` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPoolsAt(long index, int value) { performanceCounterMultipleQueryPools(this.segment(), index, value); return this; }

}
