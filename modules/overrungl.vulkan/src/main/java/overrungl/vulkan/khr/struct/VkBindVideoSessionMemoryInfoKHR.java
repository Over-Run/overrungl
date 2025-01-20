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
package overrungl.vulkan.khr.struct;

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
/// ### memoryBindIndex
/// [VarHandle][#VH_memoryBindIndex] - [Getter][#memoryBindIndex()] - [Setter][#memoryBindIndex(int)]
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(MemorySegment)]
/// ### memoryOffset
/// [VarHandle][#VH_memoryOffset] - [Getter][#memoryOffset()] - [Setter][#memoryOffset(long)]
/// ### memorySize
/// [VarHandle][#VH_memorySize] - [Getter][#memorySize()] - [Setter][#memorySize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindVideoSessionMemoryInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t memoryBindIndex;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkDeviceSize memorySize;
/// } VkBindVideoSessionMemoryInfoKHR;
/// ```
public sealed class VkBindVideoSessionMemoryInfoKHR extends Struct {
    /// The struct layout of `VkBindVideoSessionMemoryInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryBindIndex"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_LONG.withName("memorySize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memoryBindIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryBindIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBindIndex"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `memorySize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memorySize"));

    /// Creates `VkBindVideoSessionMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkBindVideoSessionMemoryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindVideoSessionMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVideoSessionMemoryInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindVideoSessionMemoryInfoKHR(segment); }

    /// Creates `VkBindVideoSessionMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindVideoSessionMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVideoSessionMemoryInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindVideoSessionMemoryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindVideoSessionMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindVideoSessionMemoryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindVideoSessionMemoryInfoKHR`
    public static VkBindVideoSessionMemoryInfoKHR alloc(SegmentAllocator allocator) { return new VkBindVideoSessionMemoryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindVideoSessionMemoryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindVideoSessionMemoryInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindVideoSessionMemoryInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindVideoSessionMemoryInfoKHR`
    public static VkBindVideoSessionMemoryInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int memoryBindIndex, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long memoryOffset, @CType("VkDeviceSize") long memorySize) { return alloc(allocator).sType(sType).pNext(pNext).memoryBindIndex(memoryBindIndex).memory(memory).memoryOffset(memoryOffset).memorySize(memorySize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR copyFrom(VkBindVideoSessionMemoryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindVideoSessionMemoryInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindVideoSessionMemoryInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR sType(@CType("VkStructureType") int value) { VkBindVideoSessionMemoryInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBindVideoSessionMemoryInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR pNext(@CType("const void *") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryBindIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryBindIndex(MemorySegment segment, long index) { return (int) VH_memoryBindIndex.get(segment, 0L, index); }
    /// {@return `memoryBindIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryBindIndex(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_memoryBindIndex(segment, 0L); }
    /// {@return `memoryBindIndex`}
    public @CType("uint32_t") int memoryBindIndex() { return VkBindVideoSessionMemoryInfoKHR.get_memoryBindIndex(this.segment()); }
    /// Sets `memoryBindIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryBindIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryBindIndex.set(segment, 0L, index, value); }
    /// Sets `memoryBindIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryBindIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBindVideoSessionMemoryInfoKHR.set_memoryBindIndex(segment, 0L, value); }
    /// Sets `memoryBindIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR memoryBindIndex(@CType("uint32_t") int value) { VkBindVideoSessionMemoryInfoKHR.set_memoryBindIndex(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") MemorySegment get_memory(MemorySegment segment, long index) { return (MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") MemorySegment get_memory(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_memory(segment, 0L); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") MemorySegment memory() { return VkBindVideoSessionMemoryInfoKHR.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR memory(@CType("VkDeviceMemory") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_memory(this.segment(), value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_memoryOffset(segment, 0L); }
    /// {@return `memoryOffset`}
    public @CType("VkDeviceSize") long memoryOffset() { return VkBindVideoSessionMemoryInfoKHR.get_memoryOffset(this.segment()); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memoryOffset(segment, 0L, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR memoryOffset(@CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memoryOffset(this.segment(), value); return this; }

    /// {@return `memorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_memorySize(MemorySegment segment, long index) { return (long) VH_memorySize.get(segment, 0L, index); }
    /// {@return `memorySize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_memorySize(MemorySegment segment) { return VkBindVideoSessionMemoryInfoKHR.get_memorySize(segment, 0L); }
    /// {@return `memorySize`}
    public @CType("VkDeviceSize") long memorySize() { return VkBindVideoSessionMemoryInfoKHR.get_memorySize(this.segment()); }
    /// Sets `memorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memorySize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_memorySize.set(segment, 0L, index, value); }
    /// Sets `memorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memorySize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memorySize(segment, 0L, value); }
    /// Sets `memorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVideoSessionMemoryInfoKHR memorySize(@CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memorySize(this.segment(), value); return this; }

    /// A buffer of [VkBindVideoSessionMemoryInfoKHR].
    public static final class Buffer extends VkBindVideoSessionMemoryInfoKHR {
        private final long elementCount;

        /// Creates `VkBindVideoSessionMemoryInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindVideoSessionMemoryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindVideoSessionMemoryInfoKHR`
        public VkBindVideoSessionMemoryInfoKHR asSlice(long index) { return new VkBindVideoSessionMemoryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindVideoSessionMemoryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindVideoSessionMemoryInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindVideoSessionMemoryInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `memoryBindIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryBindIndexAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_memoryBindIndex(this.segment(), index); }
        /// Sets `memoryBindIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryBindIndexAt(long index, @CType("uint32_t") int value) { VkBindVideoSessionMemoryInfoKHR.set_memoryBindIndex(this.segment(), index, value); return this; }

        /// {@return `memory` at the given index}
        /// @param index the index
        public @CType("VkDeviceMemory") MemorySegment memoryAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_memory(this.segment(), index); }
        /// Sets `memory` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryAt(long index, @CType("VkDeviceMemory") MemorySegment value) { VkBindVideoSessionMemoryInfoKHR.set_memory(this.segment(), index, value); return this; }

        /// {@return `memoryOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long memoryOffsetAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_memoryOffset(this.segment(), index); }
        /// Sets `memoryOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memoryOffset(this.segment(), index, value); return this; }

        /// {@return `memorySize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long memorySizeAt(long index) { return VkBindVideoSessionMemoryInfoKHR.get_memorySize(this.segment(), index); }
        /// Sets `memorySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memorySizeAt(long index, @CType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.set_memorySize(this.segment(), index, value); return this; }

    }
}
