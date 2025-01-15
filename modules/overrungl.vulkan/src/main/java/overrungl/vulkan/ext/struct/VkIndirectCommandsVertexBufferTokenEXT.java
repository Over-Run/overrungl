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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### vertexBindingUnit
/// [VarHandle][#VH_vertexBindingUnit] - [Getter][#vertexBindingUnit()] - [Setter][#vertexBindingUnit(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsVertexBufferTokenEXT {
///     uint32_t vertexBindingUnit;
/// } VkIndirectCommandsVertexBufferTokenEXT;
/// ```
public sealed class VkIndirectCommandsVertexBufferTokenEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsVertexBufferTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexBindingUnit")
    );
    /// The [VarHandle] of `vertexBindingUnit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexBindingUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit"));

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsVertexBufferTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsVertexBufferTokenEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int vertexBindingUnit) { return alloc(allocator).vertexBindingUnit(vertexBindingUnit); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT copyFrom(VkIndirectCommandsVertexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment, long index) { return (int) VH_vertexBindingUnit.get(segment, 0L, index); }
    /// {@return `vertexBindingUnit`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment) { return VkIndirectCommandsVertexBufferTokenEXT.get_vertexBindingUnit(segment, 0L); }
    /// {@return `vertexBindingUnit`}
    public @CType("uint32_t") int vertexBindingUnit() { return VkIndirectCommandsVertexBufferTokenEXT.get_vertexBindingUnit(this.segment()); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexBindingUnit(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexBindingUnit.set(segment, 0L, index, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexBindingUnit(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.set_vertexBindingUnit(segment, 0L, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(@CType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.set_vertexBindingUnit(this.segment(), value); return this; }

    /// A buffer of [VkIndirectCommandsVertexBufferTokenEXT].
    public static final class Buffer extends VkIndirectCommandsVertexBufferTokenEXT {
        private final long elementCount;

        /// Creates `VkIndirectCommandsVertexBufferTokenEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsVertexBufferTokenEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectCommandsVertexBufferTokenEXT`
        public VkIndirectCommandsVertexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsVertexBufferTokenEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsVertexBufferTokenEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `vertexBindingUnit` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vertexBindingUnitAt(long index) { return VkIndirectCommandsVertexBufferTokenEXT.get_vertexBindingUnit(this.segment(), index); }
        /// Sets `vertexBindingUnit` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexBindingUnitAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.set_vertexBindingUnit(this.segment(), index, value); return this; }

    }
}
