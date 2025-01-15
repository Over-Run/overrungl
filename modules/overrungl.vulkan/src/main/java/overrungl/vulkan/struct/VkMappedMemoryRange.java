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
package overrungl.vulkan.struct;

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
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMappedMemoryRange {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceMemory memory;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// } VkMappedMemoryRange;
/// ```
public sealed class VkMappedMemoryRange extends Struct {
    /// The struct layout of `VkMappedMemoryRange`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkMappedMemoryRange` with the given segment.
    /// @param segment the memory segment
    public VkMappedMemoryRange(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMappedMemoryRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMappedMemoryRange of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMappedMemoryRange(segment); }

    /// Creates `VkMappedMemoryRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMappedMemoryRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMappedMemoryRange ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMappedMemoryRange(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMappedMemoryRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMappedMemoryRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMappedMemoryRange`
    public static VkMappedMemoryRange alloc(SegmentAllocator allocator) { return new VkMappedMemoryRange(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMappedMemoryRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMappedMemoryRange`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMappedMemoryRange` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMappedMemoryRange`
    public static VkMappedMemoryRange allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size) { return alloc(allocator).sType(sType).pNext(pNext).memory(memory).offset(offset).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMappedMemoryRange copyFrom(VkMappedMemoryRange src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMappedMemoryRange.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMappedMemoryRange.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMappedMemoryRange.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMappedMemoryRange sType(@CType("VkStructureType") int value) { VkMappedMemoryRange.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMappedMemoryRange.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMappedMemoryRange.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMappedMemoryRange pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_pNext(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkMappedMemoryRange.get_memory(segment, 0L); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkMappedMemoryRange.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMappedMemoryRange memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_memory(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkMappedMemoryRange.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkMappedMemoryRange.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMappedMemoryRange offset(@CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkMappedMemoryRange.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkMappedMemoryRange.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMappedMemoryRange size(@CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_size(this.segment(), value); return this; }

    /// A buffer of [VkMappedMemoryRange].
    public static final class Buffer extends VkMappedMemoryRange {
        private final long elementCount;

        /// Creates `VkMappedMemoryRange.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMappedMemoryRange`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMappedMemoryRange`
        public VkMappedMemoryRange asSlice(long index) { return new VkMappedMemoryRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMappedMemoryRange`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMappedMemoryRange`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMappedMemoryRange.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMappedMemoryRange.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMappedMemoryRange.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_pNext(this.segment(), index, value); return this; }

        /// {@return `memory` at the given index}
        /// @param index the index
        public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkMappedMemoryRange.get_memory(this.segment(), index); }
        /// Sets `memory` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMappedMemoryRange.set_memory(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long offsetAt(long index) { return VkMappedMemoryRange.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkMappedMemoryRange.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkMappedMemoryRange.set_size(this.segment(), index, value); return this; }

    }
}
