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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### queryType
/// [VarHandle][#VH_queryType] - [Getter][#queryType()] - [Setter][#queryType(int)]
/// ### queryCount
/// [VarHandle][#VH_queryCount] - [Getter][#queryCount()] - [Setter][#queryCount(int)]
/// ### pipelineStatistics
/// [VarHandle][#VH_pipelineStatistics] - [Getter][#pipelineStatistics()] - [Setter][#pipelineStatistics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueryPoolCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkQueryPoolCreateFlags flags;
///     VkQueryType queryType;
///     uint32_t queryCount;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// } VkQueryPoolCreateInfo;
/// ```
public final class VkQueryPoolCreateInfo extends Struct {
    /// The struct layout of `VkQueryPoolCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queryType"),
        ValueLayout.JAVA_INT.withName("queryCount"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `queryType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryType"));
    /// The [VarHandle] of `queryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));
    /// The [VarHandle] of `pipelineStatistics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkQueryPoolCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkQueryPoolCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolCreateInfo`
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueryPoolCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolCreateInfo`
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueryPoolCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkQueryPoolCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueryPoolCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueryPoolCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkQueryPoolCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo sType(@CType("VkStructureType") int value) { VkQueryPoolCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueryPoolCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueryPoolCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkQueryPoolCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPoolCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPoolCreateFlags") int get_flags(MemorySegment segment) { return VkQueryPoolCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkQueryPoolCreateFlags") int flagsAt(long index) { return VkQueryPoolCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkQueryPoolCreateFlags") int flags() { return VkQueryPoolCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkQueryPoolCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkQueryPoolCreateFlags") int value) { VkQueryPoolCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo flagsAt(long index, @CType("VkQueryPoolCreateFlags") int value) { VkQueryPoolCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo flags(@CType("VkQueryPoolCreateFlags") int value) { VkQueryPoolCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `queryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryType") int get_queryType(MemorySegment segment, long index) { return (int) VH_queryType.get(segment, 0L, index); }
    /// {@return `queryType`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryType") int get_queryType(MemorySegment segment) { return VkQueryPoolCreateInfo.get_queryType(segment, 0L); }
    /// {@return `queryType` at the given index}
    /// @param index the index
    public @CType("VkQueryType") int queryTypeAt(long index) { return VkQueryPoolCreateInfo.get_queryType(this.segment(), index); }
    /// {@return `queryType`}
    public @CType("VkQueryType") int queryType() { return VkQueryPoolCreateInfo.get_queryType(this.segment()); }
    /// Sets `queryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryType(MemorySegment segment, long index, @CType("VkQueryType") int value) { VH_queryType.set(segment, 0L, index, value); }
    /// Sets `queryType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryType(MemorySegment segment, @CType("VkQueryType") int value) { VkQueryPoolCreateInfo.set_queryType(segment, 0L, value); }
    /// Sets `queryType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryTypeAt(long index, @CType("VkQueryType") int value) { VkQueryPoolCreateInfo.set_queryType(this.segment(), index, value); return this; }
    /// Sets `queryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryType(@CType("VkQueryType") int value) { VkQueryPoolCreateInfo.set_queryType(this.segment(), value); return this; }

    /// {@return `queryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queryCount(MemorySegment segment, long index) { return (int) VH_queryCount.get(segment, 0L, index); }
    /// {@return `queryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queryCount(MemorySegment segment) { return VkQueryPoolCreateInfo.get_queryCount(segment, 0L); }
    /// {@return `queryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queryCountAt(long index) { return VkQueryPoolCreateInfo.get_queryCount(this.segment(), index); }
    /// {@return `queryCount`}
    public @CType("uint32_t") int queryCount() { return VkQueryPoolCreateInfo.get_queryCount(this.segment()); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queryCount.set(segment, 0L, index, value); }
    /// Sets `queryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryCount(MemorySegment segment, @CType("uint32_t") int value) { VkQueryPoolCreateInfo.set_queryCount(segment, 0L, value); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryCountAt(long index, @CType("uint32_t") int value) { VkQueryPoolCreateInfo.set_queryCount(this.segment(), index, value); return this; }
    /// Sets `queryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryCount(@CType("uint32_t") int value) { VkQueryPoolCreateInfo.set_queryCount(this.segment(), value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment, long index) { return (int) VH_pipelineStatistics.get(segment, 0L, index); }
    /// {@return `pipelineStatistics`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment) { return VkQueryPoolCreateInfo.get_pipelineStatistics(segment, 0L); }
    /// {@return `pipelineStatistics` at the given index}
    /// @param index the index
    public @CType("VkQueryPipelineStatisticFlags") int pipelineStatisticsAt(long index) { return VkQueryPoolCreateInfo.get_pipelineStatistics(this.segment(), index); }
    /// {@return `pipelineStatistics`}
    public @CType("VkQueryPipelineStatisticFlags") int pipelineStatistics() { return VkQueryPoolCreateInfo.get_pipelineStatistics(this.segment()); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, long index, @CType("VkQueryPipelineStatisticFlags") int value) { VH_pipelineStatistics.set(segment, 0L, index, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, @CType("VkQueryPipelineStatisticFlags") int value) { VkQueryPoolCreateInfo.set_pipelineStatistics(segment, 0L, value); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pipelineStatisticsAt(long index, @CType("VkQueryPipelineStatisticFlags") int value) { VkQueryPoolCreateInfo.set_pipelineStatistics(this.segment(), index, value); return this; }
    /// Sets `pipelineStatistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pipelineStatistics(@CType("VkQueryPipelineStatisticFlags") int value) { VkQueryPoolCreateInfo.set_pipelineStatistics(this.segment(), value); return this; }

}