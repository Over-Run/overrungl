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
/// ### allocationSize
/// [VarHandle][#VH_allocationSize] - [Getter][#allocationSize()] - [Setter][#allocationSize(long)]
/// ### memoryTypeIndex
/// [VarHandle][#VH_memoryTypeIndex] - [Getter][#memoryTypeIndex()] - [Setter][#memoryTypeIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeIndex;
/// } VkMemoryAllocateInfo;
/// ```
public sealed class VkMemoryAllocateInfo extends Struct {
    /// The struct layout of `VkMemoryAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `allocationSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_allocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize"));
    /// The [VarHandle] of `memoryTypeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeIndex"));

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkMemoryAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryAllocateInfo`
    public static VkMemoryAllocateInfo alloc(SegmentAllocator allocator) { return new VkMemoryAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryAllocateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryAllocateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryAllocateInfo`
    public static VkMemoryAllocateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceSize") long allocationSize, @CType("uint32_t") int memoryTypeIndex) { return alloc(allocator).sType(sType).pNext(pNext).allocationSize(allocationSize).memoryTypeIndex(memoryTypeIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryAllocateInfo copyFrom(VkMemoryAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo sType(@CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `allocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_allocationSize(MemorySegment segment, long index) { return (long) VH_allocationSize.get(segment, 0L, index); }
    /// {@return `allocationSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_allocationSize(MemorySegment segment) { return VkMemoryAllocateInfo.get_allocationSize(segment, 0L); }
    /// {@return `allocationSize`}
    public @CType("VkDeviceSize") long allocationSize() { return VkMemoryAllocateInfo.get_allocationSize(this.segment()); }
    /// Sets `allocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allocationSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_allocationSize.set(segment, 0L, index, value); }
    /// Sets `allocationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allocationSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(segment, 0L, value); }
    /// Sets `allocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo allocationSize(@CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(this.segment(), value); return this; }

    /// {@return `memoryTypeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeIndex(MemorySegment segment, long index) { return (int) VH_memoryTypeIndex.get(segment, 0L, index); }
    /// {@return `memoryTypeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeIndex(MemorySegment segment) { return VkMemoryAllocateInfo.get_memoryTypeIndex(segment, 0L); }
    /// {@return `memoryTypeIndex`}
    public @CType("uint32_t") int memoryTypeIndex() { return VkMemoryAllocateInfo.get_memoryTypeIndex(this.segment()); }
    /// Sets `memoryTypeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeIndex.set(segment, 0L, index, value); }
    /// Sets `memoryTypeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(segment, 0L, value); }
    /// Sets `memoryTypeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateInfo memoryTypeIndex(@CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(this.segment(), value); return this; }

    /// A buffer of [VkMemoryAllocateInfo].
    public static final class Buffer extends VkMemoryAllocateInfo {
        private final long elementCount;

        /// Creates `VkMemoryAllocateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryAllocateInfo`
        public VkMemoryAllocateInfo asSlice(long index) { return new VkMemoryAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryAllocateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryAllocateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryAllocateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryAllocateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryAllocateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `allocationSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long allocationSizeAt(long index) { return VkMemoryAllocateInfo.get_allocationSize(this.segment(), index); }
        /// Sets `allocationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allocationSizeAt(long index, @CType("VkDeviceSize") long value) { VkMemoryAllocateInfo.set_allocationSize(this.segment(), index, value); return this; }

        /// {@return `memoryTypeIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryTypeIndexAt(long index) { return VkMemoryAllocateInfo.get_memoryTypeIndex(this.segment(), index); }
        /// Sets `memoryTypeIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryTypeIndexAt(long index, @CType("uint32_t") int value) { VkMemoryAllocateInfo.set_memoryTypeIndex(this.segment(), index, value); return this; }

    }
}
