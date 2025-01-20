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
/// ### displayEvent
/// [VarHandle][#VH_displayEvent] - [Getter][#displayEvent()] - [Setter][#displayEvent(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayEventInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDisplayEventTypeEXT displayEvent;
/// } VkDisplayEventInfoEXT;
/// ```
public sealed class VkDisplayEventInfoEXT extends Struct {
    /// The struct layout of `VkDisplayEventInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displayEvent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `displayEvent` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_displayEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayEvent"));

    /// Creates `VkDisplayEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDisplayEventInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayEventInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayEventInfoEXT(segment); }

    /// Creates `VkDisplayEventInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayEventInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayEventInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayEventInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayEventInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayEventInfoEXT`
    public static VkDisplayEventInfoEXT alloc(SegmentAllocator allocator) { return new VkDisplayEventInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayEventInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayEventInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayEventInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayEventInfoEXT`
    public static VkDisplayEventInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDisplayEventTypeEXT") int displayEvent) { return alloc(allocator).sType(sType).pNext(pNext).displayEvent(displayEvent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayEventInfoEXT copyFrom(VkDisplayEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayEventInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayEventInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayEventInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayEventInfoEXT sType(@CType("VkStructureType") int value) { VkDisplayEventInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDisplayEventInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDisplayEventInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDisplayEventInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayEventInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDisplayEventInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `displayEvent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayEventTypeEXT") int get_displayEvent(MemorySegment segment, long index) { return (int) VH_displayEvent.get(segment, 0L, index); }
    /// {@return `displayEvent`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayEventTypeEXT") int get_displayEvent(MemorySegment segment) { return VkDisplayEventInfoEXT.get_displayEvent(segment, 0L); }
    /// {@return `displayEvent`}
    public @CType("VkDisplayEventTypeEXT") int displayEvent() { return VkDisplayEventInfoEXT.get_displayEvent(this.segment()); }
    /// Sets `displayEvent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayEvent(MemorySegment segment, long index, @CType("VkDisplayEventTypeEXT") int value) { VH_displayEvent.set(segment, 0L, index, value); }
    /// Sets `displayEvent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayEvent(MemorySegment segment, @CType("VkDisplayEventTypeEXT") int value) { VkDisplayEventInfoEXT.set_displayEvent(segment, 0L, value); }
    /// Sets `displayEvent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayEventInfoEXT displayEvent(@CType("VkDisplayEventTypeEXT") int value) { VkDisplayEventInfoEXT.set_displayEvent(this.segment(), value); return this; }

    /// A buffer of [VkDisplayEventInfoEXT].
    public static final class Buffer extends VkDisplayEventInfoEXT {
        private final long elementCount;

        /// Creates `VkDisplayEventInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayEventInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayEventInfoEXT`
        public VkDisplayEventInfoEXT asSlice(long index) { return new VkDisplayEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayEventInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayEventInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayEventInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayEventInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDisplayEventInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDisplayEventInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displayEvent` at the given index}
        /// @param index the index
        public @CType("VkDisplayEventTypeEXT") int displayEventAt(long index) { return VkDisplayEventInfoEXT.get_displayEvent(this.segment(), index); }
        /// Sets `displayEvent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayEventAt(long index, @CType("VkDisplayEventTypeEXT") int value) { VkDisplayEventInfoEXT.set_displayEvent(this.segment(), index, value); return this; }

    }
}
