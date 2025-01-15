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
/// ### memoryMapPlaced
/// [VarHandle][#VH_memoryMapPlaced] - [Getter][#memoryMapPlaced()] - [Setter][#memoryMapPlaced(int)]
/// ### memoryMapRangePlaced
/// [VarHandle][#VH_memoryMapRangePlaced] - [Getter][#memoryMapRangePlaced()] - [Setter][#memoryMapRangePlaced(int)]
/// ### memoryUnmapReserve
/// [VarHandle][#VH_memoryUnmapReserve] - [Getter][#memoryUnmapReserve()] - [Setter][#memoryUnmapReserve(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMapMemoryPlacedFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 memoryMapPlaced;
///     VkBool32 memoryMapRangePlaced;
///     VkBool32 memoryUnmapReserve;
/// } VkPhysicalDeviceMapMemoryPlacedFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryMapPlaced"),
        ValueLayout.JAVA_INT.withName("memoryMapRangePlaced"),
        ValueLayout.JAVA_INT.withName("memoryUnmapReserve")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memoryMapPlaced` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryMapPlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapPlaced"));
    /// The [VarHandle] of `memoryMapRangePlaced` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryMapRangePlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapRangePlaced"));
    /// The [VarHandle] of `memoryUnmapReserve` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryUnmapReserve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryUnmapReserve"));

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int memoryMapPlaced, @CType("VkBool32") int memoryMapRangePlaced, @CType("VkBool32") int memoryUnmapReserve) { return alloc(allocator).sType(sType).pNext(pNext).memoryMapPlaced(memoryMapPlaced).memoryMapRangePlaced(memoryMapRangePlaced).memoryUnmapReserve(memoryUnmapReserve); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT copyFrom(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryMapPlaced` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_memoryMapPlaced(MemorySegment segment, long index) { return (int) VH_memoryMapPlaced.get(segment, 0L, index); }
    /// {@return `memoryMapPlaced`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_memoryMapPlaced(MemorySegment segment) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapPlaced(segment, 0L); }
    /// {@return `memoryMapPlaced`}
    public @CType("VkBool32") int memoryMapPlaced() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapPlaced(this.segment()); }
    /// Sets `memoryMapPlaced` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryMapPlaced(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_memoryMapPlaced.set(segment, 0L, index, value); }
    /// Sets `memoryMapPlaced` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryMapPlaced(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapPlaced(segment, 0L, value); }
    /// Sets `memoryMapPlaced` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(@CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapPlaced(this.segment(), value); return this; }

    /// {@return `memoryMapRangePlaced` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_memoryMapRangePlaced(MemorySegment segment, long index) { return (int) VH_memoryMapRangePlaced.get(segment, 0L, index); }
    /// {@return `memoryMapRangePlaced`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_memoryMapRangePlaced(MemorySegment segment) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapRangePlaced(segment, 0L); }
    /// {@return `memoryMapRangePlaced`}
    public @CType("VkBool32") int memoryMapRangePlaced() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapRangePlaced(this.segment()); }
    /// Sets `memoryMapRangePlaced` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryMapRangePlaced(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_memoryMapRangePlaced.set(segment, 0L, index, value); }
    /// Sets `memoryMapRangePlaced` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryMapRangePlaced(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapRangePlaced(segment, 0L, value); }
    /// Sets `memoryMapRangePlaced` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(@CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapRangePlaced(this.segment(), value); return this; }

    /// {@return `memoryUnmapReserve` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_memoryUnmapReserve(MemorySegment segment, long index) { return (int) VH_memoryUnmapReserve.get(segment, 0L, index); }
    /// {@return `memoryUnmapReserve`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_memoryUnmapReserve(MemorySegment segment) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryUnmapReserve(segment, 0L); }
    /// {@return `memoryUnmapReserve`}
    public @CType("VkBool32") int memoryUnmapReserve() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryUnmapReserve(this.segment()); }
    /// Sets `memoryUnmapReserve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryUnmapReserve(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_memoryUnmapReserve.set(segment, 0L, index, value); }
    /// Sets `memoryUnmapReserve` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryUnmapReserve(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryUnmapReserve(segment, 0L, value); }
    /// Sets `memoryUnmapReserve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(@CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryUnmapReserve(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMapMemoryPlacedFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceMapMemoryPlacedFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `memoryMapPlaced` at the given index}
        /// @param index the index
        public @CType("VkBool32") int memoryMapPlacedAt(long index) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapPlaced(this.segment(), index); }
        /// Sets `memoryMapPlaced` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryMapPlacedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapPlaced(this.segment(), index, value); return this; }

        /// {@return `memoryMapRangePlaced` at the given index}
        /// @param index the index
        public @CType("VkBool32") int memoryMapRangePlacedAt(long index) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryMapRangePlaced(this.segment(), index); }
        /// Sets `memoryMapRangePlaced` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryMapRangePlacedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryMapRangePlaced(this.segment(), index, value); return this; }

        /// {@return `memoryUnmapReserve` at the given index}
        /// @param index the index
        public @CType("VkBool32") int memoryUnmapReserveAt(long index) { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.get_memoryUnmapReserve(this.segment(), index); }
        /// Sets `memoryUnmapReserve` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryUnmapReserveAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.set_memoryUnmapReserve(this.segment(), index, value); return this; }

    }
}
