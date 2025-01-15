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
/// ### poolEntrySize
/// [VarHandle][#VH_poolEntrySize] - [Getter][#poolEntrySize()] - [Setter][#poolEntrySize(long)]
/// ### poolEntryCount
/// [VarHandle][#VH_poolEntryCount] - [Getter][#poolEntryCount()] - [Setter][#poolEntryCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelinePoolSize {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize poolEntrySize;
///     uint32_t poolEntryCount;
/// } VkPipelinePoolSize;
/// ```
public sealed class VkPipelinePoolSize extends Struct {
    /// The struct layout of `VkPipelinePoolSize`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("poolEntrySize"),
        ValueLayout.JAVA_INT.withName("poolEntryCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `poolEntrySize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_poolEntrySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntrySize"));
    /// The [VarHandle] of `poolEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_poolEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntryCount"));

    /// Creates `VkPipelinePoolSize` with the given segment.
    /// @param segment the memory segment
    public VkPipelinePoolSize(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePoolSize of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelinePoolSize(segment); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePoolSize ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelinePoolSize(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelinePoolSize` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePoolSize`
    public static VkPipelinePoolSize alloc(SegmentAllocator allocator) { return new VkPipelinePoolSize(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelinePoolSize` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelinePoolSize`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelinePoolSize` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePoolSize`
    public static VkPipelinePoolSize allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceSize") long poolEntrySize, @CType("uint32_t") int poolEntryCount) { return alloc(allocator).sType(sType).pNext(pNext).poolEntrySize(poolEntrySize).poolEntryCount(poolEntryCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelinePoolSize copyFrom(VkPipelinePoolSize src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelinePoolSize.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelinePoolSize.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelinePoolSize.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize sType(@CType("VkStructureType") int value) { VkPipelinePoolSize.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelinePoolSize.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelinePoolSize.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelinePoolSize.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelinePoolSize.set_pNext(this.segment(), value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_poolEntrySize(MemorySegment segment, long index) { return (long) VH_poolEntrySize.get(segment, 0L, index); }
    /// {@return `poolEntrySize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_poolEntrySize(MemorySegment segment) { return VkPipelinePoolSize.get_poolEntrySize(segment, 0L); }
    /// {@return `poolEntrySize`}
    public @CType("VkDeviceSize") long poolEntrySize() { return VkPipelinePoolSize.get_poolEntrySize(this.segment()); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_poolEntrySize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_poolEntrySize.set(segment, 0L, index, value); }
    /// Sets `poolEntrySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_poolEntrySize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPipelinePoolSize.set_poolEntrySize(segment, 0L, value); }
    /// Sets `poolEntrySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntrySize(@CType("VkDeviceSize") long value) { VkPipelinePoolSize.set_poolEntrySize(this.segment(), value); return this; }

    /// {@return `poolEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_poolEntryCount(MemorySegment segment, long index) { return (int) VH_poolEntryCount.get(segment, 0L, index); }
    /// {@return `poolEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_poolEntryCount(MemorySegment segment) { return VkPipelinePoolSize.get_poolEntryCount(segment, 0L); }
    /// {@return `poolEntryCount`}
    public @CType("uint32_t") int poolEntryCount() { return VkPipelinePoolSize.get_poolEntryCount(this.segment()); }
    /// Sets `poolEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_poolEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_poolEntryCount.set(segment, 0L, index, value); }
    /// Sets `poolEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_poolEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelinePoolSize.set_poolEntryCount(segment, 0L, value); }
    /// Sets `poolEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntryCount(@CType("uint32_t") int value) { VkPipelinePoolSize.set_poolEntryCount(this.segment(), value); return this; }

    /// A buffer of [VkPipelinePoolSize].
    public static final class Buffer extends VkPipelinePoolSize {
        private final long elementCount;

        /// Creates `VkPipelinePoolSize.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelinePoolSize`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelinePoolSize`
        public VkPipelinePoolSize asSlice(long index) { return new VkPipelinePoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelinePoolSize`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelinePoolSize`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelinePoolSize.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelinePoolSize.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelinePoolSize.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelinePoolSize.set_pNext(this.segment(), index, value); return this; }

        /// {@return `poolEntrySize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long poolEntrySizeAt(long index) { return VkPipelinePoolSize.get_poolEntrySize(this.segment(), index); }
        /// Sets `poolEntrySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer poolEntrySizeAt(long index, @CType("VkDeviceSize") long value) { VkPipelinePoolSize.set_poolEntrySize(this.segment(), index, value); return this; }

        /// {@return `poolEntryCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int poolEntryCountAt(long index) { return VkPipelinePoolSize.get_poolEntryCount(this.segment(), index); }
        /// Sets `poolEntryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer poolEntryCountAt(long index, @CType("uint32_t") int value) { VkPipelinePoolSize.set_poolEntryCount(this.segment(), index, value); return this; }

    }
}
