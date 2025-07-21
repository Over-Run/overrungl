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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExportMetalCommandQueueInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkQueue*) VkQueue queue;
///     (void*) MTLCommandQueue_id mtlCommandQueue;
/// };
/// ```
public final class VkExportMetalCommandQueueInfoEXT extends GroupType {
    /// The struct layout of `VkExportMetalCommandQueueInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
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
    /// The byte offset of `queue`.
    public static final long OFFSET_queue = LAYOUT.byteOffset(PathElement.groupElement("queue"));
    /// The memory layout of `queue`.
    public static final MemoryLayout LAYOUT_queue = LAYOUT.select(PathElement.groupElement("queue"));
    /// The [VarHandle] of `queue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queue"));
    /// The byte offset of `mtlCommandQueue`.
    public static final long OFFSET_mtlCommandQueue = LAYOUT.byteOffset(PathElement.groupElement("mtlCommandQueue"));
    /// The memory layout of `mtlCommandQueue`.
    public static final MemoryLayout LAYOUT_mtlCommandQueue = LAYOUT.select(PathElement.groupElement("mtlCommandQueue"));
    /// The [VarHandle] of `mtlCommandQueue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlCommandQueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlCommandQueue"));

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportMetalCommandQueueInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalCommandQueueInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalCommandQueueInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalCommandQueueInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalCommandQueueInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalCommandQueueInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param queue `queue`
    /// @param mtlCommandQueue `mtlCommandQueue`
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment queue, MemorySegment mtlCommandQueue) {
        return alloc(allocator).sType(sType).pNext(pNext).queue(queue).mtlCommandQueue(mtlCommandQueue);
    }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param queue `queue`
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment queue) {
        return alloc(allocator).sType(sType).pNext(pNext).queue(queue);
    }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT copyFrom(VkExportMetalCommandQueueInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportMetalCommandQueueInfoEXT reinterpret(long count) { return new VkExportMetalCommandQueueInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportMetalCommandQueueInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMetalCommandQueueInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment queue(MemorySegment segment, long index) { return (MemorySegment) VH_queue.get(segment, 0L, index); }
    /// {@return `queue`}
    public MemorySegment queue() { return queue(this.segment(), 0L); }
    /// Sets `queue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queue(MemorySegment segment, long index, MemorySegment value) { VH_queue.set(segment, 0L, index, value); }
    /// Sets `queue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT queue(MemorySegment value) { queue(this.segment(), 0L, value); return this; }

    /// {@return `mtlCommandQueue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlCommandQueue(MemorySegment segment, long index) { return (MemorySegment) VH_mtlCommandQueue.get(segment, 0L, index); }
    /// {@return `mtlCommandQueue`}
    public MemorySegment mtlCommandQueue() { return mtlCommandQueue(this.segment(), 0L); }
    /// Sets `mtlCommandQueue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlCommandQueue(MemorySegment segment, long index, MemorySegment value) { VH_mtlCommandQueue.set(segment, 0L, index, value); }
    /// Sets `mtlCommandQueue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueue(MemorySegment value) { mtlCommandQueue(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportMetalCommandQueueInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMetalCommandQueueInfoEXT`
    public VkExportMetalCommandQueueInfoEXT asSlice(long index) { return new VkExportMetalCommandQueueInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportMetalCommandQueueInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMetalCommandQueueInfoEXT`
    public VkExportMetalCommandQueueInfoEXT asSlice(long index, long count) { return new VkExportMetalCommandQueueInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportMetalCommandQueueInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT at(long index, Consumer<VkExportMetalCommandQueueInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment queueAt(long index) { return queue(this.segment(), index); }
    /// Sets `queue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT queueAt(long index, MemorySegment value) { queue(this.segment(), index, value); return this; }

    /// {@return `mtlCommandQueue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment mtlCommandQueueAt(long index) { return mtlCommandQueue(this.segment(), index); }
    /// Sets `mtlCommandQueue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueueAt(long index, MemorySegment value) { mtlCommandQueue(this.segment(), index, value); return this; }

}
