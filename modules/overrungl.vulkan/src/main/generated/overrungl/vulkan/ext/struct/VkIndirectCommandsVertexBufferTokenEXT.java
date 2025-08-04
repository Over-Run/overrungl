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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkIndirectCommandsVertexBufferTokenEXT {
///     uint32_t vertexBindingUnit;
/// };
/// ```
public final class VkIndirectCommandsVertexBufferTokenEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsVertexBufferTokenEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexBindingUnit")
    );
    /// The byte offset of `vertexBindingUnit`.
    public static final long OFFSET_vertexBindingUnit = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
    /// The memory layout of `vertexBindingUnit`.
    public static final MemoryLayout LAYOUT_vertexBindingUnit = LAYOUT.select(PathElement.groupElement("vertexBindingUnit"));
    /// The [VarHandle] of `vertexBindingUnit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBindingUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit"));

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsVertexBufferTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsVertexBufferTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsVertexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT copyFrom(VkIndirectCommandsVertexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsVertexBufferTokenEXT reinterpret(long count) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexBindingUnit(MemorySegment segment, long index) { return (int) VH_vertexBindingUnit.get(segment, 0L, index); }
    /// {@return `vertexBindingUnit`}
    public int vertexBindingUnit() { return vertexBindingUnit(this.segment(), 0L); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBindingUnit(MemorySegment segment, long index, int value) { VH_vertexBindingUnit.set(segment, 0L, index, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(int value) { vertexBindingUnit(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsVertexBufferTokenEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsVertexBufferTokenEXT`
    public VkIndirectCommandsVertexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsVertexBufferTokenEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsVertexBufferTokenEXT`
    public VkIndirectCommandsVertexBufferTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsVertexBufferTokenEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT at(long index, Consumer<VkIndirectCommandsVertexBufferTokenEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param index the index of the struct buffer
    public int vertexBindingUnitAt(long index) { return vertexBindingUnit(this.segment(), index); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnitAt(long index, int value) { vertexBindingUnit(this.segment(), index, value); return this; }

}
