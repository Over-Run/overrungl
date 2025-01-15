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
/// ### vertexBindingDivisorCount
/// [VarHandle][#VH_vertexBindingDivisorCount] - [Getter][#vertexBindingDivisorCount()] - [Setter][#vertexBindingDivisorCount(int)]
/// ### pVertexBindingDivisors
/// [VarHandle][#VH_pVertexBindingDivisors] - [Getter][#pVertexBindingDivisors()] - [Setter][#pVertexBindingDivisors(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineVertexInputDivisorStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescription * pVertexBindingDivisors;
/// } VkPipelineVertexInputDivisorStateCreateInfo;
/// ```
public sealed class VkPipelineVertexInputDivisorStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineVertexInputDivisorStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDivisors")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vertexBindingDivisorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexBindingDivisorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The [VarHandle] of `pVertexBindingDivisors` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexBindingDivisors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDivisors"));

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineVertexInputDivisorStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfo`
    public static VkPipelineVertexInputDivisorStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputDivisorStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfo`
    public static VkPipelineVertexInputDivisorStateCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int vertexBindingDivisorCount, @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment pVertexBindingDivisors) { return alloc(allocator).sType(sType).pNext(pNext).vertexBindingDivisorCount(vertexBindingDivisorCount).pVertexBindingDivisors(pVertexBindingDivisors); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo copyFrom(VkPipelineVertexInputDivisorStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineVertexInputDivisorStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineVertexInputDivisorStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineVertexInputDivisorStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineVertexInputDivisorStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `vertexBindingDivisorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexBindingDivisorCount(MemorySegment segment, long index) { return (int) VH_vertexBindingDivisorCount.get(segment, 0L, index); }
    /// {@return `vertexBindingDivisorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexBindingDivisorCount(MemorySegment segment) { return VkPipelineVertexInputDivisorStateCreateInfo.get_vertexBindingDivisorCount(segment, 0L); }
    /// {@return `vertexBindingDivisorCount`}
    public @CType("uint32_t") int vertexBindingDivisorCount() { return VkPipelineVertexInputDivisorStateCreateInfo.get_vertexBindingDivisorCount(this.segment()); }
    /// Sets `vertexBindingDivisorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexBindingDivisorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexBindingDivisorCount.set(segment, 0L, index, value); }
    /// Sets `vertexBindingDivisorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexBindingDivisorCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_vertexBindingDivisorCount(segment, 0L, value); }
    /// Sets `vertexBindingDivisorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCount(@CType("uint32_t") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_vertexBindingDivisorCount(this.segment(), value); return this; }

    /// {@return `pVertexBindingDivisors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment get_pVertexBindingDivisors(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexBindingDivisors.get(segment, 0L, index); }
    /// {@return `pVertexBindingDivisors`}
    /// @param segment the segment of the struct
    public static @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment get_pVertexBindingDivisors(MemorySegment segment) { return VkPipelineVertexInputDivisorStateCreateInfo.get_pVertexBindingDivisors(segment, 0L); }
    /// {@return `pVertexBindingDivisors`}
    public @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment pVertexBindingDivisors() { return VkPipelineVertexInputDivisorStateCreateInfo.get_pVertexBindingDivisors(this.segment()); }
    /// Sets `pVertexBindingDivisors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexBindingDivisors(MemorySegment segment, long index, @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment value) { VH_pVertexBindingDivisors.set(segment, 0L, index, value); }
    /// Sets `pVertexBindingDivisors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexBindingDivisors(MemorySegment segment, @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pVertexBindingDivisors(segment, 0L, value); }
    /// Sets `pVertexBindingDivisors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(@CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pVertexBindingDivisors(this.segment(), value); return this; }

    /// A buffer of [VkPipelineVertexInputDivisorStateCreateInfo].
    public static final class Buffer extends VkPipelineVertexInputDivisorStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineVertexInputDivisorStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineVertexInputDivisorStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineVertexInputDivisorStateCreateInfo`
        public VkPipelineVertexInputDivisorStateCreateInfo asSlice(long index) { return new VkPipelineVertexInputDivisorStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineVertexInputDivisorStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineVertexInputDivisorStateCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineVertexInputDivisorStateCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineVertexInputDivisorStateCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `vertexBindingDivisorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vertexBindingDivisorCountAt(long index) { return VkPipelineVertexInputDivisorStateCreateInfo.get_vertexBindingDivisorCount(this.segment(), index); }
        /// Sets `vertexBindingDivisorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexBindingDivisorCountAt(long index, @CType("uint32_t") int value) { VkPipelineVertexInputDivisorStateCreateInfo.set_vertexBindingDivisorCount(this.segment(), index, value); return this; }

        /// {@return `pVertexBindingDivisors` at the given index}
        /// @param index the index
        public @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment pVertexBindingDivisorsAt(long index) { return VkPipelineVertexInputDivisorStateCreateInfo.get_pVertexBindingDivisors(this.segment(), index); }
        /// Sets `pVertexBindingDivisors` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pVertexBindingDivisorsAt(long index, @CType("const VkVertexInputBindingDivisorDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputDivisorStateCreateInfo.set_pVertexBindingDivisors(this.segment(), index, value); return this; }

    }
}
