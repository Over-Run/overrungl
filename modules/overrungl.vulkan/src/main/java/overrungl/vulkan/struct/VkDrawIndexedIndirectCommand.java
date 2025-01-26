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
/// struct VkDrawIndexedIndirectCommand {
///     uint32_t indexCount;
///     uint32_t instanceCount;
///     uint32_t firstIndex;
///     int32_t vertexOffset;
///     uint32_t firstInstance;
/// };
/// ```
public sealed class VkDrawIndexedIndirectCommand extends GroupType {
    /// The struct layout of `VkDrawIndexedIndirectCommand`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    /// The byte offset of `indexCount`.
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    /// The memory layout of `indexCount`.
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The byte offset of `instanceCount`.
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    /// The memory layout of `instanceCount`.
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The byte offset of `firstIndex`.
    public static final long OFFSET_firstIndex = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
    /// The memory layout of `firstIndex`.
    public static final MemoryLayout LAYOUT_firstIndex = LAYOUT.select(PathElement.groupElement("firstIndex"));
    /// The [VarHandle] of `firstIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    /// The byte offset of `vertexOffset`.
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    /// The memory layout of `vertexOffset`.
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    /// The byte offset of `firstInstance`.
    public static final long OFFSET_firstInstance = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
    /// The memory layout of `firstInstance`.
    public static final MemoryLayout LAYOUT_firstInstance = LAYOUT.select(PathElement.groupElement("firstInstance"));
    /// The [VarHandle] of `firstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    /// @param segment the memory segment
    public VkDrawIndexedIndirectCommand(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndexedIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrawIndexedIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndexedIndirectCommand`
    public static VkDrawIndexedIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndexedIndirectCommand(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawIndexedIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndexedIndirectCommand`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawIndexedIndirectCommand copyFrom(VkDrawIndexedIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    public int indexCount() { return indexCount(this.segment(), 0L); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexCount(MemorySegment segment, long index, int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand indexCount(int value) { indexCount(this.segment(), 0L, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    public int instanceCount() { return instanceCount(this.segment(), 0L); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceCount(MemorySegment segment, long index, int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand instanceCount(int value) { instanceCount(this.segment(), 0L, value); return this; }

    /// {@return `firstIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstIndex(MemorySegment segment, long index) { return (int) VH_firstIndex.get(segment, 0L, index); }
    /// {@return `firstIndex`}
    public int firstIndex() { return firstIndex(this.segment(), 0L); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstIndex(MemorySegment segment, long index, int value) { VH_firstIndex.set(segment, 0L, index, value); }
    /// Sets `firstIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstIndex(int value) { firstIndex(this.segment(), 0L, value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexOffset(MemorySegment segment, long index) { return (int) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    public int vertexOffset() { return vertexOffset(this.segment(), 0L); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexOffset(MemorySegment segment, long index, int value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand vertexOffset(int value) { vertexOffset(this.segment(), 0L, value); return this; }

    /// {@return `firstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstInstance(MemorySegment segment, long index) { return (int) VH_firstInstance.get(segment, 0L, index); }
    /// {@return `firstInstance`}
    public int firstInstance() { return firstInstance(this.segment(), 0L); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstInstance(MemorySegment segment, long index, int value) { VH_firstInstance.set(segment, 0L, index, value); }
    /// Sets `firstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstInstance(int value) { firstInstance(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDrawIndexedIndirectCommand].
    public static final class Buffer extends VkDrawIndexedIndirectCommand {
        private final long elementCount;

        /// Creates `VkDrawIndexedIndirectCommand.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrawIndexedIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrawIndexedIndirectCommand`
        public VkDrawIndexedIndirectCommand asSlice(long index) { return new VkDrawIndexedIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrawIndexedIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrawIndexedIndirectCommand`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `indexCount` at the given index}
        /// @param index the index of the struct buffer
        public int indexCountAt(long index) { return indexCount(this.segment(), index); }
        /// Sets `indexCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indexCountAt(long index, int value) { indexCount(this.segment(), index, value); return this; }

        /// {@return `instanceCount` at the given index}
        /// @param index the index of the struct buffer
        public int instanceCountAt(long index) { return instanceCount(this.segment(), index); }
        /// Sets `instanceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer instanceCountAt(long index, int value) { instanceCount(this.segment(), index, value); return this; }

        /// {@return `firstIndex` at the given index}
        /// @param index the index of the struct buffer
        public int firstIndexAt(long index) { return firstIndex(this.segment(), index); }
        /// Sets `firstIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstIndexAt(long index, int value) { firstIndex(this.segment(), index, value); return this; }

        /// {@return `vertexOffset` at the given index}
        /// @param index the index of the struct buffer
        public int vertexOffsetAt(long index) { return vertexOffset(this.segment(), index); }
        /// Sets `vertexOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vertexOffsetAt(long index, int value) { vertexOffset(this.segment(), index, value); return this; }

        /// {@return `firstInstance` at the given index}
        /// @param index the index of the struct buffer
        public int firstInstanceAt(long index) { return firstInstance(this.segment(), index); }
        /// Sets `firstInstance` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstInstanceAt(long index, int value) { firstInstance(this.segment(), index, value); return this; }

    }
}
