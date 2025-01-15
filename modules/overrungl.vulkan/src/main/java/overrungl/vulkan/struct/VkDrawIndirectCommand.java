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
/// ### vertexCount
/// [VarHandle][#VH_vertexCount] - [Getter][#vertexCount()] - [Setter][#vertexCount(int)]
/// ### instanceCount
/// [VarHandle][#VH_instanceCount] - [Getter][#instanceCount()] - [Setter][#instanceCount(int)]
/// ### firstVertex
/// [VarHandle][#VH_firstVertex] - [Getter][#firstVertex()] - [Setter][#firstVertex(int)]
/// ### firstInstance
/// [VarHandle][#VH_firstInstance] - [Getter][#firstInstance()] - [Setter][#firstInstance(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrawIndirectCommand {
///     uint32_t vertexCount;
///     uint32_t instanceCount;
///     uint32_t firstVertex;
///     uint32_t firstInstance;
/// } VkDrawIndirectCommand;
/// ```
public sealed class VkDrawIndirectCommand extends Struct {
    /// The struct layout of `VkDrawIndirectCommand`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `firstInstance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    /// Creates `VkDrawIndirectCommand` with the given segment.
    /// @param segment the memory segment
    public VkDrawIndirectCommand(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCommand of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCommand ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrawIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndirectCommand`
    public static VkDrawIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndirectCommand(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndirectCommand`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDrawIndirectCommand` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndirectCommand`
    public static VkDrawIndirectCommand allocInit(SegmentAllocator allocator, @CType("uint32_t") int vertexCount, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstVertex, @CType("uint32_t") int firstInstance) { return alloc(allocator).vertexCount(vertexCount).instanceCount(instanceCount).firstVertex(firstVertex).firstInstance(firstInstance); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawIndirectCommand copyFrom(VkDrawIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment) { return VkDrawIndirectCommand.get_vertexCount(segment, 0L); }
    /// {@return `vertexCount`}
    public @CType("uint32_t") int vertexCount() { return VkDrawIndirectCommand.get_vertexCount(this.segment()); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_vertexCount(segment, 0L, value); }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand vertexCount(@CType("uint32_t") int value) { VkDrawIndirectCommand.set_vertexCount(this.segment(), value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment) { return VkDrawIndirectCommand.get_instanceCount(segment, 0L); }
    /// {@return `instanceCount`}
    public @CType("uint32_t") int instanceCount() { return VkDrawIndirectCommand.get_instanceCount(this.segment()); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_instanceCount(segment, 0L, value); }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand instanceCount(@CType("uint32_t") int value) { VkDrawIndirectCommand.set_instanceCount(this.segment(), value); return this; }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment) { return VkDrawIndirectCommand.get_firstVertex(segment, 0L); }
    /// {@return `firstVertex`}
    public @CType("uint32_t") int firstVertex() { return VkDrawIndirectCommand.get_firstVertex(this.segment()); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstVertex(segment, 0L, value); }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstVertex(@CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstVertex(this.segment(), value); return this; }

    /// {@return `firstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstInstance(MemorySegment segment, long index) { return (int) VH_firstInstance.get(segment, 0L, index); }
    /// {@return `firstInstance`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstInstance(MemorySegment segment) { return VkDrawIndirectCommand.get_firstInstance(segment, 0L); }
    /// {@return `firstInstance`}
    public @CType("uint32_t") int firstInstance() { return VkDrawIndirectCommand.get_firstInstance(this.segment()); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstInstance(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstInstance.set(segment, 0L, index, value); }
    /// Sets `firstInstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstInstance(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstInstance(segment, 0L, value); }
    /// Sets `firstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstInstance(@CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstInstance(this.segment(), value); return this; }

    /// A buffer of [VkDrawIndirectCommand].
    public static final class Buffer extends VkDrawIndirectCommand {
        private final long elementCount;

        /// Creates `VkDrawIndirectCommand.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrawIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrawIndirectCommand`
        public VkDrawIndirectCommand asSlice(long index) { return new VkDrawIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrawIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrawIndirectCommand`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `vertexCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vertexCountAt(long index) { return VkDrawIndirectCommand.get_vertexCount(this.segment(), index); }
        /// Sets `vertexCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexCountAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_vertexCount(this.segment(), index, value); return this; }

        /// {@return `instanceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int instanceCountAt(long index) { return VkDrawIndirectCommand.get_instanceCount(this.segment(), index); }
        /// Sets `instanceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer instanceCountAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_instanceCount(this.segment(), index, value); return this; }

        /// {@return `firstVertex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int firstVertexAt(long index) { return VkDrawIndirectCommand.get_firstVertex(this.segment(), index); }
        /// Sets `firstVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer firstVertexAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstVertex(this.segment(), index, value); return this; }

        /// {@return `firstInstance` at the given index}
        /// @param index the index
        public @CType("uint32_t") int firstInstanceAt(long index) { return VkDrawIndirectCommand.get_firstInstance(this.segment(), index); }
        /// Sets `firstInstance` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer firstInstanceAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCommand.set_firstInstance(this.segment(), index, value); return this; }

    }
}
