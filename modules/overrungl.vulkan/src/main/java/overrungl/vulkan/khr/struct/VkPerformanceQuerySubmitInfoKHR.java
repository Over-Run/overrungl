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
/// ### counterPassIndex
/// [VarHandle][#VH_counterPassIndex] - [Getter][#counterPassIndex()] - [Setter][#counterPassIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceQuerySubmitInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t counterPassIndex;
/// } VkPerformanceQuerySubmitInfoKHR;
/// ```
public final class VkPerformanceQuerySubmitInfoKHR extends Struct {
    /// The struct layout of `VkPerformanceQuerySubmitInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("counterPassIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `counterPassIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_counterPassIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterPassIndex"));

    /// Creates `VkPerformanceQuerySubmitInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceQuerySubmitInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceQuerySubmitInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQuerySubmitInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment); }

    /// Creates `VkPerformanceQuerySubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQuerySubmitInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceQuerySubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQuerySubmitInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceQuerySubmitInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceQuerySubmitInfoKHR`
    public static VkPerformanceQuerySubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkPerformanceQuerySubmitInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceQuerySubmitInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceQuerySubmitInfoKHR`
    public static VkPerformanceQuerySubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceQuerySubmitInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPerformanceQuerySubmitInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPerformanceQuerySubmitInfoKHR`
    public VkPerformanceQuerySubmitInfoKHR asSlice(long index) { return new VkPerformanceQuerySubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPerformanceQuerySubmitInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPerformanceQuerySubmitInfoKHR`
    public VkPerformanceQuerySubmitInfoKHR asSlice(long index, long count) { return new VkPerformanceQuerySubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceQuerySubmitInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceQuerySubmitInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceQuerySubmitInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceQuerySubmitInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceQuerySubmitInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR sType(@CType("VkStructureType") int value) { VkPerformanceQuerySubmitInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceQuerySubmitInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceQuerySubmitInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceQuerySubmitInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQuerySubmitInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQuerySubmitInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQuerySubmitInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `counterPassIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_counterPassIndex(MemorySegment segment, long index) { return (int) VH_counterPassIndex.get(segment, 0L, index); }
    /// {@return `counterPassIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_counterPassIndex(MemorySegment segment) { return VkPerformanceQuerySubmitInfoKHR.get_counterPassIndex(segment, 0L); }
    /// {@return `counterPassIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int counterPassIndexAt(long index) { return VkPerformanceQuerySubmitInfoKHR.get_counterPassIndex(this.segment(), index); }
    /// {@return `counterPassIndex`}
    public @CType("uint32_t") int counterPassIndex() { return VkPerformanceQuerySubmitInfoKHR.get_counterPassIndex(this.segment()); }
    /// Sets `counterPassIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_counterPassIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_counterPassIndex.set(segment, 0L, index, value); }
    /// Sets `counterPassIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_counterPassIndex(MemorySegment segment, @CType("uint32_t") int value) { VkPerformanceQuerySubmitInfoKHR.set_counterPassIndex(segment, 0L, value); }
    /// Sets `counterPassIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR counterPassIndexAt(long index, @CType("uint32_t") int value) { VkPerformanceQuerySubmitInfoKHR.set_counterPassIndex(this.segment(), index, value); return this; }
    /// Sets `counterPassIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQuerySubmitInfoKHR counterPassIndex(@CType("uint32_t") int value) { VkPerformanceQuerySubmitInfoKHR.set_counterPassIndex(this.segment(), value); return this; }

}
