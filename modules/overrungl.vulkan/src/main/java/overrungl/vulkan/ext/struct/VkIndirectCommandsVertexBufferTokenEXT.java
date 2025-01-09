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
public final class VkIndirectCommandsVertexBufferTokenEXT extends Struct {
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
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsVertexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsVertexBufferTokenEXT`
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment, long index) { return (int) VH_vertexBindingUnit.get(segment, 0L, index); }
    /// {@return `vertexBindingUnit`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment) { return VkIndirectCommandsVertexBufferTokenEXT.get_vertexBindingUnit(segment, 0L); }
    /// {@return `vertexBindingUnit` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vertexBindingUnitAt(long index) { return VkIndirectCommandsVertexBufferTokenEXT.get_vertexBindingUnit(this.segment(), index); }
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
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnitAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.set_vertexBindingUnit(this.segment(), index, value); return this; }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(@CType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.set_vertexBindingUnit(this.segment(), value); return this; }

}
