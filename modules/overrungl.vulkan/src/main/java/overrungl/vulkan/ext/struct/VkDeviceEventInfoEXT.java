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
/// ### deviceEvent
/// [VarHandle][#VH_deviceEvent] - [Getter][#deviceEvent()] - [Setter][#deviceEvent(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceEventInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceEventTypeEXT deviceEvent;
/// } VkDeviceEventInfoEXT;
/// ```
public final class VkDeviceEventInfoEXT extends Struct {
    /// The struct layout of `VkDeviceEventInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceEvent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceEvent` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceEvent"));

    /// Creates `VkDeviceEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceEventInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment); }

    /// Creates `VkDeviceEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceEventInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceEventInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceEventInfoEXT`
    public static VkDeviceEventInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceEventInfoEXT`
    public static VkDeviceEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceEventInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceEventInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceEventInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceEventInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceEventInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceEventInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT sType(@CType("VkStructureType") int value) { VkDeviceEventInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceEventInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceEventInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceEventInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceEventInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceEventInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceEventInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceEventTypeEXT") int get_deviceEvent(MemorySegment segment, long index) { return (int) VH_deviceEvent.get(segment, 0L, index); }
    /// {@return `deviceEvent`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceEventTypeEXT") int get_deviceEvent(MemorySegment segment) { return VkDeviceEventInfoEXT.get_deviceEvent(segment, 0L); }
    /// {@return `deviceEvent` at the given index}
    /// @param index the index
    public @CType("VkDeviceEventTypeEXT") int deviceEventAt(long index) { return VkDeviceEventInfoEXT.get_deviceEvent(this.segment(), index); }
    /// {@return `deviceEvent`}
    public @CType("VkDeviceEventTypeEXT") int deviceEvent() { return VkDeviceEventInfoEXT.get_deviceEvent(this.segment()); }
    /// Sets `deviceEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceEvent(MemorySegment segment, long index, @CType("VkDeviceEventTypeEXT") int value) { VH_deviceEvent.set(segment, 0L, index, value); }
    /// Sets `deviceEvent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceEvent(MemorySegment segment, @CType("VkDeviceEventTypeEXT") int value) { VkDeviceEventInfoEXT.set_deviceEvent(segment, 0L, value); }
    /// Sets `deviceEvent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT deviceEventAt(long index, @CType("VkDeviceEventTypeEXT") int value) { VkDeviceEventInfoEXT.set_deviceEvent(this.segment(), index, value); return this; }
    /// Sets `deviceEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceEventInfoEXT deviceEvent(@CType("VkDeviceEventTypeEXT") int value) { VkDeviceEventInfoEXT.set_deviceEvent(this.segment(), value); return this; }

}
