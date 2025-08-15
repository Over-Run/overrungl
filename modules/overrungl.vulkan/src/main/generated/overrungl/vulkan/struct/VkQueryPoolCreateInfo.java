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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryPoolCreateInfo`.
/// ## Layout
/// ```
/// struct VkQueryPoolCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkQueryPoolCreateFlags flags;
///     (int) VkQueryType queryType;
///     uint32_t queryCount;
///     ((uint32_t) VkFlags) VkQueryPipelineStatisticFlags pipelineStatistics;
/// };
/// ```
public final class VkQueryPoolCreateInfo extends GroupType {
    /// The struct layout of `VkQueryPoolCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queryType"),
        ValueLayout.JAVA_INT.withName("queryCount"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `queryType`.
    public static final long OFFSET_queryType = LAYOUT.byteOffset(PathElement.groupElement("queryType"));
    /// The memory layout of `queryType`.
    public static final MemoryLayout LAYOUT_queryType = LAYOUT.select(PathElement.groupElement("queryType"));
    /// The [VarHandle] of `queryType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryType"));
    /// The byte offset of `queryCount`.
    public static final long OFFSET_queryCount = LAYOUT.byteOffset(PathElement.groupElement("queryCount"));
    /// The memory layout of `queryCount`.
    public static final MemoryLayout LAYOUT_queryCount = LAYOUT.select(PathElement.groupElement("queryCount"));
    /// The [VarHandle] of `queryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));
    /// The byte offset of `pipelineStatistics`.
    public static final long OFFSET_pipelineStatistics = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatistics"));
    /// The memory layout of `pipelineStatistics`.
    public static final MemoryLayout LAYOUT_pipelineStatistics = LAYOUT.select(PathElement.groupElement("pipelineStatistics"));
    /// The [VarHandle] of `pipelineStatistics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueryPoolCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueryPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueryPoolCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolCreateInfo`
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueryPoolCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolCreateInfo`
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueryPoolCreateInfo copyFrom(VkQueryPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueryPoolCreateInfo reinterpret(long count) { return new VkQueryPoolCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueryPoolCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueryPoolCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `queryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryType(MemorySegment segment, long index) { return (int) VH_queryType.get(segment, 0L, index); }
    /// {@return `queryType`}
    public int queryType() { return queryType(this.segment(), 0L); }
    /// Sets `queryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryType(MemorySegment segment, long index, int value) { VH_queryType.set(segment, 0L, index, value); }
    /// Sets `queryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryType(int value) { queryType(this.segment(), 0L, value); return this; }

    /// {@return `queryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryCount(MemorySegment segment, long index) { return (int) VH_queryCount.get(segment, 0L, index); }
    /// {@return `queryCount`}
    public int queryCount() { return queryCount(this.segment(), 0L); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryCount(MemorySegment segment, long index, int value) { VH_queryCount.set(segment, 0L, index, value); }
    /// Sets `queryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryCount(int value) { queryCount(this.segment(), 0L, value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineStatistics(MemorySegment segment, long index) { return (int) VH_pipelineStatistics.get(segment, 0L, index); }
    /// {@return `pipelineStatistics`}
    public int pipelineStatistics() { return pipelineStatistics(this.segment(), 0L); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineStatistics(MemorySegment segment, long index, int value) { VH_pipelineStatistics.set(segment, 0L, index, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pipelineStatistics(int value) { pipelineStatistics(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkQueryPoolCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueryPoolCreateInfo`
    public VkQueryPoolCreateInfo asSlice(long index) { return new VkQueryPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueryPoolCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueryPoolCreateInfo`
    public VkQueryPoolCreateInfo asSlice(long index, long count) { return new VkQueryPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueryPoolCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueryPoolCreateInfo at(long index, Consumer<VkQueryPoolCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `queryType` at the given index}
    /// @param index the index of the struct buffer
    public int queryTypeAt(long index) { return queryType(this.segment(), index); }
    /// Sets `queryType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryTypeAt(long index, int value) { queryType(this.segment(), index, value); return this; }

    /// {@return `queryCount` at the given index}
    /// @param index the index of the struct buffer
    public int queryCountAt(long index) { return queryCount(this.segment(), index); }
    /// Sets `queryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo queryCountAt(long index, int value) { queryCount(this.segment(), index, value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineStatisticsAt(long index) { return pipelineStatistics(this.segment(), index); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueryPoolCreateInfo pipelineStatisticsAt(long index, int value) { pipelineStatistics(this.segment(), index, value); return this; }

}
