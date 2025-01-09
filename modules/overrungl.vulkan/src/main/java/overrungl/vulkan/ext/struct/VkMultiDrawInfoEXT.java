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
/// ### firstVertex
/// [VarHandle][#VH_firstVertex] - [Getter][#firstVertex()] - [Setter][#firstVertex(int)]
/// ### vertexCount
/// [VarHandle][#VH_vertexCount] - [Getter][#vertexCount()] - [Setter][#vertexCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultiDrawInfoEXT {
///     uint32_t firstVertex;
///     uint32_t vertexCount;
/// } VkMultiDrawInfoEXT;
/// ```
public final class VkMultiDrawInfoEXT extends Struct {
    /// The struct layout of `VkMultiDrawInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("vertexCount")
    );
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMultiDrawInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultiDrawInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMultiDrawInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiDrawInfoEXT`
    public static VkMultiDrawInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultiDrawInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiDrawInfoEXT`
    public static VkMultiDrawInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultiDrawInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment) { return VkMultiDrawInfoEXT.get_firstVertex(segment, 0L); }
    /// {@return `firstVertex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstVertexAt(long index) { return VkMultiDrawInfoEXT.get_firstVertex(this.segment(), index); }
    /// {@return `firstVertex`}
    public @CType("uint32_t") int firstVertex() { return VkMultiDrawInfoEXT.get_firstVertex(this.segment()); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, @CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_firstVertex(segment, 0L, value); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT firstVertexAt(long index, @CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_firstVertex(this.segment(), index, value); return this; }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT firstVertex(@CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_firstVertex(this.segment(), value); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment) { return VkMultiDrawInfoEXT.get_vertexCount(segment, 0L); }
    /// {@return `vertexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vertexCountAt(long index) { return VkMultiDrawInfoEXT.get_vertexCount(this.segment(), index); }
    /// {@return `vertexCount`}
    public @CType("uint32_t") int vertexCount() { return VkMultiDrawInfoEXT.get_vertexCount(this.segment()); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, @CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_vertexCount(segment, 0L, value); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT vertexCountAt(long index, @CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_vertexCount(this.segment(), index, value); return this; }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawInfoEXT vertexCount(@CType("uint32_t") int value) { VkMultiDrawInfoEXT.set_vertexCount(this.segment(), value); return this; }

}