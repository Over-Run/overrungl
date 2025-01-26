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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineVertexInputDivisorStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescription* pVertexBindingDivisors;
/// };
/// ```
public sealed class VkPipelineVertexInputDivisorStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineVertexInputDivisorStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDivisors")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `vertexBindingDivisorCount`.
    public static final long OFFSET_vertexBindingDivisorCount = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The memory layout of `vertexBindingDivisorCount`.
    public static final MemoryLayout LAYOUT_vertexBindingDivisorCount = LAYOUT.select(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The [VarHandle] of `vertexBindingDivisorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBindingDivisorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The byte offset of `pVertexBindingDivisors`.
    public static final long OFFSET_pVertexBindingDivisors = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDivisors"));
    /// The memory layout of `pVertexBindingDivisors`.
    public static final MemoryLayout LAYOUT_pVertexBindingDivisors = LAYOUT.select(PathElement.groupElement("pVertexBindingDivisors"));
    /// The [VarHandle] of `pVertexBindingDivisors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexBindingDivisors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDivisors"));

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineVertexInputDivisorStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfo`
    public static VkPipelineVertexInputDivisorStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputDivisorStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo copyFrom(VkPipelineVertexInputDivisorStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexBindingDivisorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexBindingDivisorCount(MemorySegment segment, long index) { return (int) VH_vertexBindingDivisorCount.get(segment, 0L, index); }
    /// {@return `vertexBindingDivisorCount`}
    public int vertexBindingDivisorCount() { return vertexBindingDivisorCount(this.segment(), 0L); }
    /// Sets `vertexBindingDivisorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBindingDivisorCount(MemorySegment segment, long index, int value) { VH_vertexBindingDivisorCount.set(segment, 0L, index, value); }
    /// Sets `vertexBindingDivisorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCount(int value) { vertexBindingDivisorCount(this.segment(), 0L, value); return this; }

    /// {@return `pVertexBindingDivisors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexBindingDivisors(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexBindingDivisors.get(segment, 0L, index); }
    /// {@return `pVertexBindingDivisors`}
    public MemorySegment pVertexBindingDivisors() { return pVertexBindingDivisors(this.segment(), 0L); }
    /// Sets `pVertexBindingDivisors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexBindingDivisors(MemorySegment segment, long index, MemorySegment value) { VH_pVertexBindingDivisors.set(segment, 0L, index, value); }
    /// Sets `pVertexBindingDivisors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(MemorySegment value) { pVertexBindingDivisors(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `vertexBindingDivisorCount` at the given index}
        /// @param index the index of the struct buffer
        public int vertexBindingDivisorCountAt(long index) { return vertexBindingDivisorCount(this.segment(), index); }
        /// Sets `vertexBindingDivisorCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vertexBindingDivisorCountAt(long index, int value) { vertexBindingDivisorCount(this.segment(), index, value); return this; }

        /// {@return `pVertexBindingDivisors` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pVertexBindingDivisorsAt(long index) { return pVertexBindingDivisors(this.segment(), index); }
        /// Sets `pVertexBindingDivisors` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pVertexBindingDivisorsAt(long index, MemorySegment value) { pVertexBindingDivisors(this.segment(), index, value); return this; }

    }
}
