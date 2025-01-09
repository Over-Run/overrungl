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
/// ### mtlSharedEvent
/// [VarHandle][#VH_mtlSharedEvent] - [Getter][#mtlSharedEvent()] - [Setter][#mtlSharedEvent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     MTLSharedEvent_id mtlSharedEvent;
/// } VkImportMetalSharedEventInfoEXT;
/// ```
public final class VkImportMetalSharedEventInfoEXT extends Struct {
    /// The struct layout of `VkImportMetalSharedEventInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mtlSharedEvent` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    /// Creates `VkImportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImportMetalSharedEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMetalSharedEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalSharedEventInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment); }

    /// Creates `VkImportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalSharedEventInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMetalSharedEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalSharedEventInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImportMetalSharedEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalSharedEventInfoEXT`
    public static VkImportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMetalSharedEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalSharedEventInfoEXT`
    public static VkImportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMetalSharedEventInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMetalSharedEventInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMetalSharedEventInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMetalSharedEventInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMetalSharedEventInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT sType(@CType("VkStructureType") int value) { VkImportMetalSharedEventInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportMetalSharedEventInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportMetalSharedEventInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportMetalSharedEventInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `mtlSharedEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment get_mtlSharedEvent(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mtlSharedEvent.get(segment, 0L, index); }
    /// {@return `mtlSharedEvent`}
    /// @param segment the segment of the struct
    public static @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment get_mtlSharedEvent(MemorySegment segment) { return VkImportMetalSharedEventInfoEXT.get_mtlSharedEvent(segment, 0L); }
    /// {@return `mtlSharedEvent` at the given index}
    /// @param index the index
    public @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment mtlSharedEventAt(long index) { return VkImportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment(), index); }
    /// {@return `mtlSharedEvent`}
    public @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment mtlSharedEvent() { return VkImportMetalSharedEventInfoEXT.get_mtlSharedEvent(this.segment()); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, long index, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VH_mtlSharedEvent.set(segment, 0L, index, value); }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlSharedEvent(MemorySegment segment, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_mtlSharedEvent(segment, 0L, value); }
    /// Sets `mtlSharedEvent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT mtlSharedEventAt(long index, @CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), index, value); return this; }
    /// Sets `mtlSharedEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalSharedEventInfoEXT mtlSharedEvent(@CType("MTLSharedEvent_id") java.lang.foreign.MemorySegment value) { VkImportMetalSharedEventInfoEXT.set_mtlSharedEvent(this.segment(), value); return this; }

}
