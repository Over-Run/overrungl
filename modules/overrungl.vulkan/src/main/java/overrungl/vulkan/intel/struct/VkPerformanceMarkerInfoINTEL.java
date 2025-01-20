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
package overrungl.vulkan.intel.struct;

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
/// ### marker
/// [VarHandle][#VH_marker] - [Getter][#marker()] - [Setter][#marker(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceMarkerInfoINTEL {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t marker;
/// } VkPerformanceMarkerInfoINTEL;
/// ```
public sealed class VkPerformanceMarkerInfoINTEL extends Struct {
    /// The struct layout of `VkPerformanceMarkerInfoINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("marker")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `marker` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_marker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("marker"));

    /// Creates `VkPerformanceMarkerInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceMarkerInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceMarkerInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceMarkerInfoINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceMarkerInfoINTEL(segment); }

    /// Creates `VkPerformanceMarkerInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceMarkerInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceMarkerInfoINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceMarkerInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceMarkerInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceMarkerInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceMarkerInfoINTEL`
    public static VkPerformanceMarkerInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceMarkerInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceMarkerInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceMarkerInfoINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceMarkerInfoINTEL` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceMarkerInfoINTEL`
    public static VkPerformanceMarkerInfoINTEL allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint64_t") long marker) { return alloc(allocator).sType(sType).pNext(pNext).marker(marker); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceMarkerInfoINTEL copyFrom(VkPerformanceMarkerInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceMarkerInfoINTEL.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceMarkerInfoINTEL.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceMarkerInfoINTEL.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceMarkerInfoINTEL sType(@CType("VkStructureType") int value) { VkPerformanceMarkerInfoINTEL.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceMarkerInfoINTEL.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPerformanceMarkerInfoINTEL.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPerformanceMarkerInfoINTEL.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceMarkerInfoINTEL pNext(@CType("const void *") MemorySegment value) { VkPerformanceMarkerInfoINTEL.set_pNext(this.segment(), value); return this; }

    /// {@return `marker` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_marker(MemorySegment segment, long index) { return (long) VH_marker.get(segment, 0L, index); }
    /// {@return `marker`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_marker(MemorySegment segment) { return VkPerformanceMarkerInfoINTEL.get_marker(segment, 0L); }
    /// {@return `marker`}
    public @CType("uint64_t") long marker() { return VkPerformanceMarkerInfoINTEL.get_marker(this.segment()); }
    /// Sets `marker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_marker(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_marker.set(segment, 0L, index, value); }
    /// Sets `marker` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_marker(MemorySegment segment, @CType("uint64_t") long value) { VkPerformanceMarkerInfoINTEL.set_marker(segment, 0L, value); }
    /// Sets `marker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceMarkerInfoINTEL marker(@CType("uint64_t") long value) { VkPerformanceMarkerInfoINTEL.set_marker(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceMarkerInfoINTEL].
    public static final class Buffer extends VkPerformanceMarkerInfoINTEL {
        private final long elementCount;

        /// Creates `VkPerformanceMarkerInfoINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceMarkerInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceMarkerInfoINTEL`
        public VkPerformanceMarkerInfoINTEL asSlice(long index) { return new VkPerformanceMarkerInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceMarkerInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceMarkerInfoINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceMarkerInfoINTEL.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceMarkerInfoINTEL.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPerformanceMarkerInfoINTEL.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPerformanceMarkerInfoINTEL.set_pNext(this.segment(), index, value); return this; }

        /// {@return `marker` at the given index}
        /// @param index the index
        public @CType("uint64_t") long markerAt(long index) { return VkPerformanceMarkerInfoINTEL.get_marker(this.segment(), index); }
        /// Sets `marker` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer markerAt(long index, @CType("uint64_t") long value) { VkPerformanceMarkerInfoINTEL.set_marker(this.segment(), index, value); return this; }

    }
}
