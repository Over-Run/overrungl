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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct DrawElementsIndirectCommand {
///     unsigned int count;
///     unsigned int instanceCount;
///     unsigned int firstIndex;
///     int baseVertex;
///     unsigned int baseInstance;
/// };
/// ```
public sealed class DrawElementsIndirectCommand extends GroupType {
    /// The struct layout of `DrawElementsIndirectCommand`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("baseVertex"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    /// The byte offset of `count`.
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    /// The memory layout of `count`.
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
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
    /// The byte offset of `baseVertex`.
    public static final long OFFSET_baseVertex = LAYOUT.byteOffset(PathElement.groupElement("baseVertex"));
    /// The memory layout of `baseVertex`.
    public static final MemoryLayout LAYOUT_baseVertex = LAYOUT.select(PathElement.groupElement("baseVertex"));
    /// The [VarHandle] of `baseVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseVertex"));
    /// The byte offset of `baseInstance`.
    public static final long OFFSET_baseInstance = LAYOUT.byteOffset(PathElement.groupElement("baseInstance"));
    /// The memory layout of `baseInstance`.
    public static final MemoryLayout LAYOUT_baseInstance = LAYOUT.select(PathElement.groupElement("baseInstance"));
    /// The [VarHandle] of `baseInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseInstance"));

    /// Creates `DrawElementsIndirectCommand` with the given segment.
    /// @param segment the memory segment
    public DrawElementsIndirectCommand(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `DrawElementsIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `DrawElementsIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static DrawElementsIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new DrawElementsIndirectCommand(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `DrawElementsIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `DrawElementsIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `DrawElementsIndirectCommand`
    public static DrawElementsIndirectCommand alloc(SegmentAllocator allocator) { return new DrawElementsIndirectCommand(allocator.allocate(LAYOUT)); }

    /// Allocates a `DrawElementsIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `DrawElementsIndirectCommand`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public DrawElementsIndirectCommand copyFrom(DrawElementsIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int count(MemorySegment segment, long index) { return (int) VH_count.get(segment, 0L, index); }
    /// {@return `count`}
    public int count() { return count(this.segment(), 0L); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void count(MemorySegment segment, long index, int value) { VH_count.set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public DrawElementsIndirectCommand count(int value) { count(this.segment(), 0L, value); return this; }

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
    public DrawElementsIndirectCommand instanceCount(int value) { instanceCount(this.segment(), 0L, value); return this; }

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
    public DrawElementsIndirectCommand firstIndex(int value) { firstIndex(this.segment(), 0L, value); return this; }

    /// {@return `baseVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseVertex(MemorySegment segment, long index) { return (int) VH_baseVertex.get(segment, 0L, index); }
    /// {@return `baseVertex`}
    public int baseVertex() { return baseVertex(this.segment(), 0L); }
    /// Sets `baseVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseVertex(MemorySegment segment, long index, int value) { VH_baseVertex.set(segment, 0L, index, value); }
    /// Sets `baseVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public DrawElementsIndirectCommand baseVertex(int value) { baseVertex(this.segment(), 0L, value); return this; }

    /// {@return `baseInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseInstance(MemorySegment segment, long index) { return (int) VH_baseInstance.get(segment, 0L, index); }
    /// {@return `baseInstance`}
    public int baseInstance() { return baseInstance(this.segment(), 0L); }
    /// Sets `baseInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseInstance(MemorySegment segment, long index, int value) { VH_baseInstance.set(segment, 0L, index, value); }
    /// Sets `baseInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public DrawElementsIndirectCommand baseInstance(int value) { baseInstance(this.segment(), 0L, value); return this; }

    /// A buffer of [DrawElementsIndirectCommand].
    public static final class Buffer extends DrawElementsIndirectCommand {
        private final long elementCount;

        /// Creates `DrawElementsIndirectCommand.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `DrawElementsIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @return the slice of `DrawElementsIndirectCommand`
        public DrawElementsIndirectCommand asSlice(long index) { return new DrawElementsIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `DrawElementsIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `DrawElementsIndirectCommand`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `count` at the given index}
        /// @param index the index of the struct buffer
        public int countAt(long index) { return count(this.segment(), index); }
        /// Sets `count` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer countAt(long index, int value) { count(this.segment(), index, value); return this; }

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

        /// {@return `baseVertex` at the given index}
        /// @param index the index of the struct buffer
        public int baseVertexAt(long index) { return baseVertex(this.segment(), index); }
        /// Sets `baseVertex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer baseVertexAt(long index, int value) { baseVertex(this.segment(), index, value); return this; }

        /// {@return `baseInstance` at the given index}
        /// @param index the index of the struct buffer
        public int baseInstanceAt(long index) { return baseInstance(this.segment(), index); }
        /// Sets `baseInstance` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer baseInstanceAt(long index, int value) { baseInstance(this.segment(), index, value); return this; }

    }
}
