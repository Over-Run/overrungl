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
/// ### maxPerformanceQueriesPerPool
/// [VarHandle][#VH_maxPerformanceQueriesPerPool] - [Getter][#maxPerformanceQueriesPerPool()] - [Setter][#maxPerformanceQueriesPerPool(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceQueryReservationInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t maxPerformanceQueriesPerPool;
/// } VkPerformanceQueryReservationInfoKHR;
/// ```
public final class VkPerformanceQueryReservationInfoKHR extends Struct {
    /// The struct layout of `VkPerformanceQueryReservationInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerformanceQueriesPerPool")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxPerformanceQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerformanceQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerformanceQueriesPerPool"));

    /// Creates `VkPerformanceQueryReservationInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceQueryReservationInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceQueryReservationInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQueryReservationInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQueryReservationInfoKHR(segment); }

    /// Creates `VkPerformanceQueryReservationInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQueryReservationInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQueryReservationInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceQueryReservationInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceQueryReservationInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceQueryReservationInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceQueryReservationInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceQueryReservationInfoKHR`
    public static VkPerformanceQueryReservationInfoKHR alloc(SegmentAllocator allocator) { return new VkPerformanceQueryReservationInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceQueryReservationInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceQueryReservationInfoKHR`
    public static VkPerformanceQueryReservationInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceQueryReservationInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceQueryReservationInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceQueryReservationInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceQueryReservationInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceQueryReservationInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceQueryReservationInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR sType(@CType("VkStructureType") int value) { VkPerformanceQueryReservationInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceQueryReservationInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceQueryReservationInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceQueryReservationInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQueryReservationInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQueryReservationInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceQueryReservationInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxPerformanceQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerformanceQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxPerformanceQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxPerformanceQueriesPerPool`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerformanceQueriesPerPool(MemorySegment segment) { return VkPerformanceQueryReservationInfoKHR.get_maxPerformanceQueriesPerPool(segment, 0L); }
    /// {@return `maxPerformanceQueriesPerPool` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPerformanceQueriesPerPoolAt(long index) { return VkPerformanceQueryReservationInfoKHR.get_maxPerformanceQueriesPerPool(this.segment(), index); }
    /// {@return `maxPerformanceQueriesPerPool`}
    public @CType("uint32_t") int maxPerformanceQueriesPerPool() { return VkPerformanceQueryReservationInfoKHR.get_maxPerformanceQueriesPerPool(this.segment()); }
    /// Sets `maxPerformanceQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerformanceQueriesPerPool(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerformanceQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxPerformanceQueriesPerPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerformanceQueriesPerPool(MemorySegment segment, @CType("uint32_t") int value) { VkPerformanceQueryReservationInfoKHR.set_maxPerformanceQueriesPerPool(segment, 0L, value); }
    /// Sets `maxPerformanceQueriesPerPool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR maxPerformanceQueriesPerPoolAt(long index, @CType("uint32_t") int value) { VkPerformanceQueryReservationInfoKHR.set_maxPerformanceQueriesPerPool(this.segment(), index, value); return this; }
    /// Sets `maxPerformanceQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceQueryReservationInfoKHR maxPerformanceQueriesPerPool(@CType("uint32_t") int value) { VkPerformanceQueryReservationInfoKHR.set_maxPerformanceQueriesPerPool(this.segment(), value); return this; }

}
