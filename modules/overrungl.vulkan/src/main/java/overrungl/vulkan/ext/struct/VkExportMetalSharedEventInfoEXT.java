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
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(MemorySegment)]
/// ### event
/// [VarHandle][#VH_event] - [Getter][#event()] - [Setter][#event(MemorySegment)]
/// ### mtlSharedEvent
/// [VarHandle][#VH_mtlSharedEvent] - [Getter][#mtlSharedEvent()] - [Setter][#mtlSharedEvent(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore semaphore;
///     VkEvent event;
///     MTLSharedEvent_id mtlSharedEvent;
/// } VkExportMetalSharedEventInfoEXT;
/// ```
public sealed class VkExportMetalSharedEventInfoEXT extends Struct {
    /// The struct layout of `VkExportMetalSharedEventInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `event` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_event = LAYOUT.arrayElementVarHandle(PathElement.groupElement("event"));
    /// The [VarHandle] of `mtlSharedEvent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalSharedEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalSharedEventInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalSharedEventInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static VkExportMetalSharedEventInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSemaphore") MemorySegment semaphore, @CType("VkEvent") MemorySegment event, @CType("MTLSharedEvent_id") MemorySegment mtlSharedEvent) { return alloc(allocator).sType(sType).pNext(pNext).semaphore(semaphore).event(event).mtlSharedEvent(mtlSharedEvent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT copyFrom(VkExportMetalSharedEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMetalSharedEventInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExportMetalSharedEventInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT pNext(@CType("const void *") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") MemorySegment get_semaphore(MemorySegment segment, long index) { return (MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") MemorySegment get_semaphore(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_semaphore(segment, 0L); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") MemorySegment semaphore() { return VkExportMetalSharedEventInfoEXT.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT semaphore(@CType("VkSemaphore") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(this.segment(), value); return this; }

    /// {@return `event` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkEvent") MemorySegment get_event(MemorySegment segment, long index) { return (MemorySegment) VH_event.get(segment, 0L, index); }
    /// {@return `event`}
    /// @param segment the segment of the struct
    public static @CType("VkEvent") MemorySegment get_event(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_event(segment, 0L); }
    /// {@return `event`}
    public @CType("VkEvent") MemorySegment event() { return VkExportMetalSharedEventInfoEXT.get_event(this.segment()); }
    /// Sets `event` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_event(MemorySegment segment, long index, @CType("VkEvent") MemorySegment value) { VH_event.set(segment, 0L, index, value); }
    /// Sets `event` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_event(MemorySegment segment, @CType("VkEvent") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(segment, 0L, value); }
    /// Sets `event` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT event(@CType("VkEvent") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(this.segment(), value); return this; }

    /// {@return `mtlSharedEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLSharedEvent_id") MemorySegment get_mtlSharedEvent(MemorySegment segment, long index) { return (MemorySegment) VH_mtlSharedEvent.get(segment, 0L, index); }
    /// {@return `mtlSharedEvent`}
    /// @param segment the segment of the struct
    public static @CType("MTLSharedEvent_id") MemorySegment get_mtlSharedEvent(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(segment, 0L); }
    /// {@return `mtlSharedEvent`}
    public @CType("MTLSharedEvent_id") MemorySegment mtlSharedEvent() { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment()); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, long index, @CType("MTLSharedEvent_id") MemorySegment value) { VH_mtlSharedEvent.set(segment, 0L, index, value); }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, @CType("MTLSharedEvent_id") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(segment, 0L, value); }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(@CType("MTLSharedEvent_id") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalSharedEventInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExportMetalSharedEventInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `semaphore` at the given index}
        /// @param index the index
        public @CType("VkSemaphore") MemorySegment semaphoreAt(long index) { return VkExportMetalSharedEventInfoEXT.get_semaphore(this.segment(), index); }
        /// Sets `semaphore` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreAt(long index, @CType("VkSemaphore") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(this.segment(), index, value); return this; }

        /// {@return `event` at the given index}
        /// @param index the index
        public @CType("VkEvent") MemorySegment eventAt(long index) { return VkExportMetalSharedEventInfoEXT.get_event(this.segment(), index); }
        /// Sets `event` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer eventAt(long index, @CType("VkEvent") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(this.segment(), index, value); return this; }

        /// {@return `mtlSharedEvent` at the given index}
        /// @param index the index
        public @CType("MTLSharedEvent_id") MemorySegment mtlSharedEventAt(long index) { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment(), index); }
        /// Sets `mtlSharedEvent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mtlSharedEventAt(long index, @CType("MTLSharedEvent_id") MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), index, value); return this; }

    }
}
