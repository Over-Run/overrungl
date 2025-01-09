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
/// ### queryPool
/// [VarHandle][#VH_queryPool] - [Getter][#queryPool()] - [Setter][#queryPool(java.lang.foreign.MemorySegment)]
/// ### firstQuery
/// [VarHandle][#VH_firstQuery] - [Getter][#firstQuery()] - [Setter][#firstQuery(int)]
/// ### queryCount
/// [VarHandle][#VH_queryCount] - [Getter][#queryCount()] - [Setter][#queryCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoInlineQueryInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkQueryPool queryPool;
///     uint32_t firstQuery;
///     uint32_t queryCount;
/// } VkVideoInlineQueryInfoKHR;
/// ```
public final class VkVideoInlineQueryInfoKHR extends Struct {
    /// The struct layout of `VkVideoInlineQueryInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queryPool"),
        ValueLayout.JAVA_INT.withName("firstQuery"),
        ValueLayout.JAVA_INT.withName("queryCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `queryPool` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_queryPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryPool"));
    /// The [VarHandle] of `firstQuery` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstQuery"));
    /// The [VarHandle] of `queryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoInlineQueryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoInlineQueryInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoInlineQueryInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoInlineQueryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoInlineQueryInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoInlineQueryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoInlineQueryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoInlineQueryInfoKHR`
    public static VkVideoInlineQueryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoInlineQueryInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoInlineQueryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoInlineQueryInfoKHR`
    public VkVideoInlineQueryInfoKHR asSlice(long index) { return new VkVideoInlineQueryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoInlineQueryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoInlineQueryInfoKHR`
    public VkVideoInlineQueryInfoKHR asSlice(long index, long count) { return new VkVideoInlineQueryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoInlineQueryInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoInlineQueryInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoInlineQueryInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoInlineQueryInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoInlineQueryInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR sType(@CType("VkStructureType") int value) { VkVideoInlineQueryInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoInlineQueryInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoInlineQueryInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoInlineQueryInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `queryPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPool") java.lang.foreign.MemorySegment get_queryPool(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_queryPool.get(segment, 0L, index); }
    /// {@return `queryPool`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPool") java.lang.foreign.MemorySegment get_queryPool(MemorySegment segment) { return VkVideoInlineQueryInfoKHR.get_queryPool(segment, 0L); }
    /// {@return `queryPool` at the given index}
    /// @param index the index
    public @CType("VkQueryPool") java.lang.foreign.MemorySegment queryPoolAt(long index) { return VkVideoInlineQueryInfoKHR.get_queryPool(this.segment(), index); }
    /// {@return `queryPool`}
    public @CType("VkQueryPool") java.lang.foreign.MemorySegment queryPool() { return VkVideoInlineQueryInfoKHR.get_queryPool(this.segment()); }
    /// Sets `queryPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryPool(MemorySegment segment, long index, @CType("VkQueryPool") java.lang.foreign.MemorySegment value) { VH_queryPool.set(segment, 0L, index, value); }
    /// Sets `queryPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryPool(MemorySegment segment, @CType("VkQueryPool") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_queryPool(segment, 0L, value); }
    /// Sets `queryPool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryPoolAt(long index, @CType("VkQueryPool") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_queryPool(this.segment(), index, value); return this; }
    /// Sets `queryPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryPool(@CType("VkQueryPool") java.lang.foreign.MemorySegment value) { VkVideoInlineQueryInfoKHR.set_queryPool(this.segment(), value); return this; }

    /// {@return `firstQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstQuery(MemorySegment segment, long index) { return (int) VH_firstQuery.get(segment, 0L, index); }
    /// {@return `firstQuery`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstQuery(MemorySegment segment) { return VkVideoInlineQueryInfoKHR.get_firstQuery(segment, 0L); }
    /// {@return `firstQuery` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstQueryAt(long index) { return VkVideoInlineQueryInfoKHR.get_firstQuery(this.segment(), index); }
    /// {@return `firstQuery`}
    public @CType("uint32_t") int firstQuery() { return VkVideoInlineQueryInfoKHR.get_firstQuery(this.segment()); }
    /// Sets `firstQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstQuery(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstQuery.set(segment, 0L, index, value); }
    /// Sets `firstQuery` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstQuery(MemorySegment segment, @CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_firstQuery(segment, 0L, value); }
    /// Sets `firstQuery` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR firstQueryAt(long index, @CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_firstQuery(this.segment(), index, value); return this; }
    /// Sets `firstQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR firstQuery(@CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_firstQuery(this.segment(), value); return this; }

    /// {@return `queryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queryCount(MemorySegment segment, long index) { return (int) VH_queryCount.get(segment, 0L, index); }
    /// {@return `queryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queryCount(MemorySegment segment) { return VkVideoInlineQueryInfoKHR.get_queryCount(segment, 0L); }
    /// {@return `queryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queryCountAt(long index) { return VkVideoInlineQueryInfoKHR.get_queryCount(this.segment(), index); }
    /// {@return `queryCount`}
    public @CType("uint32_t") int queryCount() { return VkVideoInlineQueryInfoKHR.get_queryCount(this.segment()); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queryCount.set(segment, 0L, index, value); }
    /// Sets `queryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_queryCount(segment, 0L, value); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryCountAt(long index, @CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_queryCount(this.segment(), index, value); return this; }
    /// Sets `queryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoInlineQueryInfoKHR queryCount(@CType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.set_queryCount(this.segment(), value); return this; }

}
