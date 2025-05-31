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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExportMetalSharedEventInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphore semaphore;
///     (uint64_t) VkEvent event;
///     (void*) MTLSharedEvent_id mtlSharedEvent;
/// };
/// ```
public sealed class VkExportMetalSharedEventInfoEXT extends GroupType {
    /// The struct layout of `VkExportMetalSharedEventInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
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
    /// The byte offset of `semaphore`.
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    /// The memory layout of `semaphore`.
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The byte offset of `event`.
    public static final long OFFSET_event = LAYOUT.byteOffset(PathElement.groupElement("event"));
    /// The memory layout of `event`.
    public static final MemoryLayout LAYOUT_event = LAYOUT.select(PathElement.groupElement("event"));
    /// The [VarHandle] of `event` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_event = LAYOUT.arrayElementVarHandle(PathElement.groupElement("event"));
    /// The byte offset of `mtlSharedEvent`.
    public static final long OFFSET_mtlSharedEvent = LAYOUT.byteOffset(PathElement.groupElement("mtlSharedEvent"));
    /// The memory layout of `mtlSharedEvent`.
    public static final MemoryLayout LAYOUT_mtlSharedEvent = LAYOUT.select(PathElement.groupElement("mtlSharedEvent"));
    /// The [VarHandle] of `mtlSharedEvent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalSharedEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalSharedEventInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT copyFrom(VkExportMetalSharedEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkExportMetalSharedEventInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMetalSharedEventInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long semaphore(MemorySegment segment, long index) { return (long) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    public long semaphore() { return semaphore(this.segment(), 0L); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphore(MemorySegment segment, long index, long value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT semaphore(long value) { semaphore(this.segment(), 0L, value); return this; }

    /// {@return `event` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long event(MemorySegment segment, long index) { return (long) VH_event.get(segment, 0L, index); }
    /// {@return `event`}
    public long event() { return event(this.segment(), 0L); }
    /// Sets `event` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void event(MemorySegment segment, long index, long value) { VH_event.set(segment, 0L, index, value); }
    /// Sets `event` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT event(long value) { event(this.segment(), 0L, value); return this; }

    /// {@return `mtlSharedEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlSharedEvent(MemorySegment segment, long index) { return (MemorySegment) VH_mtlSharedEvent.get(segment, 0L, index); }
    /// {@return `mtlSharedEvent`}
    public MemorySegment mtlSharedEvent() { return mtlSharedEvent(this.segment(), 0L); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlSharedEvent(MemorySegment segment, long index, MemorySegment value) { VH_mtlSharedEvent.set(segment, 0L, index, value); }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(MemorySegment value) { mtlSharedEvent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkExportMetalSharedEventInfoEXT].
    public static final class Buffer extends VkExportMetalSharedEventInfoEXT {
        private final long elementCount;

        /// Creates `VkExportMetalSharedEventInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMetalSharedEventInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMetalSharedEventInfoEXT`
        public VkExportMetalSharedEventInfoEXT asSlice(long index) { return new VkExportMetalSharedEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMetalSharedEventInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMetalSharedEventInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `semaphore` at the given index}
        /// @param index the index of the struct buffer
        public long semaphoreAt(long index) { return semaphore(this.segment(), index); }
        /// Sets `semaphore` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreAt(long index, long value) { semaphore(this.segment(), index, value); return this; }

        /// {@return `event` at the given index}
        /// @param index the index of the struct buffer
        public long eventAt(long index) { return event(this.segment(), index); }
        /// Sets `event` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer eventAt(long index, long value) { event(this.segment(), index, value); return this; }

        /// {@return `mtlSharedEvent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment mtlSharedEventAt(long index) { return mtlSharedEvent(this.segment(), index); }
        /// Sets `mtlSharedEvent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer mtlSharedEventAt(long index, MemorySegment value) { mtlSharedEvent(this.segment(), index, value); return this; }

    }
}
