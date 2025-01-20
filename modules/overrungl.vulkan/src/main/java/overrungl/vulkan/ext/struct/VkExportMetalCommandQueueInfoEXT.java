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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### queue
/// [VarHandle][#VH_queue] - [Getter][#queue()] - [Setter][#queue(MemorySegment)]
/// ### mtlCommandQueue
/// [VarHandle][#VH_mtlCommandQueue] - [Getter][#mtlCommandQueue()] - [Setter][#mtlCommandQueue(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMetalCommandQueueInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkQueue queue;
///     MTLCommandQueue_id mtlCommandQueue;
/// } VkExportMetalCommandQueueInfoEXT;
/// ```
public sealed class VkExportMetalCommandQueueInfoEXT extends Struct {
    /// The struct layout of `VkExportMetalCommandQueueInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `queue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queue"));
    /// The [VarHandle] of `mtlCommandQueue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlCommandQueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlCommandQueue"));

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalCommandQueueInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalCommandQueueInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalCommandQueueInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMetalCommandQueueInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalCommandQueueInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalCommandQueueInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalCommandQueueInfoEXT`
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkQueue") MemorySegment queue, @CType("MTLCommandQueue_id") MemorySegment mtlCommandQueue) { return alloc(allocator).sType(sType).pNext(pNext).queue(queue).mtlCommandQueue(mtlCommandQueue); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT copyFrom(VkExportMetalCommandQueueInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalCommandQueueInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMetalCommandQueueInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMetalCommandQueueInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalCommandQueueInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalCommandQueueInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExportMetalCommandQueueInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT pNext(@CType("const void *") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `queue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueue") MemorySegment get_queue(MemorySegment segment, long index) { return (MemorySegment) VH_queue.get(segment, 0L, index); }
    /// {@return `queue`}
    /// @param segment the segment of the struct
    public static @CType("VkQueue") MemorySegment get_queue(MemorySegment segment) { return VkExportMetalCommandQueueInfoEXT.get_queue(segment, 0L); }
    /// {@return `queue`}
    public @CType("VkQueue") MemorySegment queue() { return VkExportMetalCommandQueueInfoEXT.get_queue(this.segment()); }
    /// Sets `queue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queue(MemorySegment segment, long index, @CType("VkQueue") MemorySegment value) { VH_queue.set(segment, 0L, index, value); }
    /// Sets `queue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queue(MemorySegment segment, @CType("VkQueue") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_queue(segment, 0L, value); }
    /// Sets `queue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT queue(@CType("VkQueue") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_queue(this.segment(), value); return this; }

    /// {@return `mtlCommandQueue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLCommandQueue_id") MemorySegment get_mtlCommandQueue(MemorySegment segment, long index) { return (MemorySegment) VH_mtlCommandQueue.get(segment, 0L, index); }
    /// {@return `mtlCommandQueue`}
    /// @param segment the segment of the struct
    public static @CType("MTLCommandQueue_id") MemorySegment get_mtlCommandQueue(MemorySegment segment) { return VkExportMetalCommandQueueInfoEXT.get_mtlCommandQueue(segment, 0L); }
    /// {@return `mtlCommandQueue`}
    public @CType("MTLCommandQueue_id") MemorySegment mtlCommandQueue() { return VkExportMetalCommandQueueInfoEXT.get_mtlCommandQueue(this.segment()); }
    /// Sets `mtlCommandQueue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlCommandQueue(MemorySegment segment, long index, @CType("MTLCommandQueue_id") MemorySegment value) { VH_mtlCommandQueue.set(segment, 0L, index, value); }
    /// Sets `mtlCommandQueue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlCommandQueue(MemorySegment segment, @CType("MTLCommandQueue_id") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_mtlCommandQueue(segment, 0L, value); }
    /// Sets `mtlCommandQueue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueue(@CType("MTLCommandQueue_id") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_mtlCommandQueue(this.segment(), value); return this; }

    /// A buffer of [VkExportMetalCommandQueueInfoEXT].
    public static final class Buffer extends VkExportMetalCommandQueueInfoEXT {
        private final long elementCount;

        /// Creates `VkExportMetalCommandQueueInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMetalCommandQueueInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMetalCommandQueueInfoEXT`
        public VkExportMetalCommandQueueInfoEXT asSlice(long index) { return new VkExportMetalCommandQueueInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMetalCommandQueueInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMetalCommandQueueInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalCommandQueueInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalCommandQueueInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExportMetalCommandQueueInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `queue` at the given index}
        /// @param index the index
        public @CType("VkQueue") MemorySegment queueAt(long index) { return VkExportMetalCommandQueueInfoEXT.get_queue(this.segment(), index); }
        /// Sets `queue` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueAt(long index, @CType("VkQueue") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_queue(this.segment(), index, value); return this; }

        /// {@return `mtlCommandQueue` at the given index}
        /// @param index the index
        public @CType("MTLCommandQueue_id") MemorySegment mtlCommandQueueAt(long index) { return VkExportMetalCommandQueueInfoEXT.get_mtlCommandQueue(this.segment(), index); }
        /// Sets `mtlCommandQueue` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mtlCommandQueueAt(long index, @CType("MTLCommandQueue_id") MemorySegment value) { VkExportMetalCommandQueueInfoEXT.set_mtlCommandQueue(this.segment(), index, value); return this; }

    }
}
