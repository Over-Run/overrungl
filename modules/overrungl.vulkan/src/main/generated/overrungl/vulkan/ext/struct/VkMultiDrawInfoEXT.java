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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMultiDrawInfoEXT {
///     uint32_t firstVertex;
///     uint32_t vertexCount;
/// };
/// ```
public sealed class VkMultiDrawInfoEXT extends GroupType {
    /// The struct layout of `VkMultiDrawInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("vertexCount")
    );
    /// The byte offset of `firstVertex`.
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    /// The memory layout of `firstVertex`.
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The byte offset of `vertexCount`.
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    /// The memory layout of `vertexCount`.
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMultiDrawInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMultiDrawInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiDrawInfoEXT`
    public static VkMultiDrawInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultiDrawInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiDrawInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMultiDrawInfoEXT copyFrom(VkMultiDrawInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    public int firstVertex() { return firstVertex(this.segment(), 0L); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstVertex(MemorySegment segment, long index, int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT firstVertex(int value) { firstVertex(this.segment(), 0L, value); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    public int vertexCount() { return vertexCount(this.segment(), 0L); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexCount(MemorySegment segment, long index, int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT vertexCount(int value) { vertexCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMultiDrawInfoEXT].
    public static final class Buffer extends VkMultiDrawInfoEXT {
        private final long elementCount;

        /// Creates `VkMultiDrawInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMultiDrawInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMultiDrawInfoEXT`
        public VkMultiDrawInfoEXT asSlice(long index) { return new VkMultiDrawInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMultiDrawInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMultiDrawInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `firstVertex` at the given index}
        /// @param index the index of the struct buffer
        public int firstVertexAt(long index) { return firstVertex(this.segment(), index); }
        /// Sets `firstVertex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstVertexAt(long index, int value) { firstVertex(this.segment(), index, value); return this; }

        /// {@return `vertexCount` at the given index}
        /// @param index the index of the struct buffer
        public int vertexCountAt(long index) { return vertexCount(this.segment(), index); }
        /// Sets `vertexCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vertexCountAt(long index, int value) { vertexCount(this.segment(), index, value); return this; }

    }
}
