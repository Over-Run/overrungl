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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(java.lang.foreign.MemorySegment)]
/// ### event
/// [VarHandle][#VH_event] - [Getter][#event()] - [Setter][#event(java.lang.foreign.MemorySegment)]
/// ### mtlSharedEvent
/// [VarHandle][#VH_mtlSharedEvent] - [Getter][#mtlSharedEvent()] - [Setter][#mtlSharedEvent(java.lang.foreign.MemorySegment)]
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
public final class VkExportMetalSharedEventInfoEXT extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `event` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_event = LAYOUT.arrayElementVarHandle(PathElement.groupElement("event"));
    /// The [VarHandle] of `mtlSharedEvent` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalSharedEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalSharedEventInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment); }

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
    public static VkExportMetalSharedEventInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalSharedEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalSharedEventInfoEXT`
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalSharedEventInfoEXT.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportMetalSharedEventInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportMetalSharedEventInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_semaphore(segment, 0L); }
    /// {@return `semaphore` at the given index}
    /// @param index the index
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphoreAt(long index) { return VkExportMetalSharedEventInfoEXT.get_semaphore(this.segment(), index); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore() { return VkExportMetalSharedEventInfoEXT.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT semaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(this.segment(), index, value); return this; }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT semaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_semaphore(this.segment(), value); return this; }

    /// {@return `event` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkEvent") java.lang.foreign.MemorySegment get_event(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_event.get(segment, 0L, index); }
    /// {@return `event`}
    /// @param segment the segment of the struct
    public static @CType("VkEvent") java.lang.foreign.MemorySegment get_event(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_event(segment, 0L); }
    /// {@return `event` at the given index}
    /// @param index the index
    public @CType("VkEvent") java.lang.foreign.MemorySegment eventAt(long index) { return VkExportMetalSharedEventInfoEXT.get_event(this.segment(), index); }
    /// {@return `event`}
    public @CType("VkEvent") java.lang.foreign.MemorySegment event() { return VkExportMetalSharedEventInfoEXT.get_event(this.segment()); }
    /// Sets `event` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_event(MemorySegment segment, long index, @CType("VkEvent") java.lang.foreign.MemorySegment value) { VH_event.set(segment, 0L, index, value); }
    /// Sets `event` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_event(MemorySegment segment, @CType("VkEvent") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(segment, 0L, value); }
    /// Sets `event` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT eventAt(long index, @CType("VkEvent") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(this.segment(), index, value); return this; }
    /// Sets `event` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT event(@CType("VkEvent") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_event(this.segment(), value); return this; }

    /// {@return `mtlSharedEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment get_mtlSharedEvent(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mtlSharedEvent.get(segment, 0L, index); }
    /// {@return `mtlSharedEvent`}
    /// @param segment the segment of the struct
    public static @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment get_mtlSharedEvent(MemorySegment segment) { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(segment, 0L); }
    /// {@return `mtlSharedEvent` at the given index}
    /// @param index the index
    public @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment mtlSharedEventAt(long index) { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment(), index); }
    /// {@return `mtlSharedEvent`}
    public @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment mtlSharedEvent() { return VkExportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment()); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, long index, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VH_mtlSharedEvent.set(segment, 0L, index, value); }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(segment, 0L, value); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT mtlSharedEventAt(long index, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), index, value); return this; }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(@CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkExportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), value); return this; }

}
