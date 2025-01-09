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
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pPushConstant
/// [VarHandle][#VH_pPushConstant] - [Getter][#pPushConstant()] - [Setter][#pPushConstant(java.lang.foreign.MemorySegment)]
/// ### pVertexBuffer
/// [VarHandle][#VH_pVertexBuffer] - [Getter][#pVertexBuffer()] - [Setter][#pVertexBuffer(java.lang.foreign.MemorySegment)]
/// ### pIndexBuffer
/// [VarHandle][#VH_pIndexBuffer] - [Getter][#pIndexBuffer()] - [Setter][#pIndexBuffer(java.lang.foreign.MemorySegment)]
/// ### pExecutionSet
/// [VarHandle][#VH_pExecutionSet] - [Getter][#pExecutionSet()] - [Setter][#pExecutionSet(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkIndirectCommandsTokenDataEXT {
///     const VkIndirectCommandsPushConstantTokenEXT * pPushConstant;
///     const VkIndirectCommandsVertexBufferTokenEXT * pVertexBuffer;
///     const VkIndirectCommandsIndexBufferTokenEXT * pIndexBuffer;
///     const VkIndirectCommandsExecutionSetTokenEXT * pExecutionSet;
/// } VkIndirectCommandsTokenDataEXT;
/// ```
public final class VkIndirectCommandsTokenDataEXT extends Union {
    /// The union layout of `VkIndirectCommandsTokenDataEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPushConstant"),
        ValueLayout.ADDRESS.withName("pVertexBuffer"),
        ValueLayout.ADDRESS.withName("pIndexBuffer"),
        ValueLayout.ADDRESS.withName("pExecutionSet")
    );
    /// The [VarHandle] of `pPushConstant` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPushConstant = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstant"));
    /// The [VarHandle] of `pVertexBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBuffer"));
    /// The [VarHandle] of `pIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexBuffer"));
    /// The [VarHandle] of `pExecutionSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExecutionSet"));

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsTokenDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `pPushConstant` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment get_pPushConstant(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPushConstant.get(segment, 0L, index); }
    /// {@return `pPushConstant`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment get_pPushConstant(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(segment, 0L); }
    /// {@return `pPushConstant` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment pPushConstantAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(this.segment(), index); }
    /// {@return `pPushConstant`}
    public @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment pPushConstant() { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(this.segment()); }
    /// Sets `pPushConstant` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPushConstant(MemorySegment segment, long index, @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment value) { VH_pPushConstant.set(segment, 0L, index, value); }
    /// Sets `pPushConstant` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPushConstant(MemorySegment segment, @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(segment, 0L, value); }
    /// Sets `pPushConstant` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pPushConstantAt(long index, @CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(this.segment(), index, value); return this; }
    /// Sets `pPushConstant` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pPushConstant(@CType("const VkIndirectCommandsPushConstantTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(this.segment(), value); return this; }

    /// {@return `pVertexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment get_pVertexBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexBuffer.get(segment, 0L, index); }
    /// {@return `pVertexBuffer`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment get_pVertexBuffer(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(segment, 0L); }
    /// {@return `pVertexBuffer` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment pVertexBufferAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(this.segment(), index); }
    /// {@return `pVertexBuffer`}
    public @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment pVertexBuffer() { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(this.segment()); }
    /// Sets `pVertexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexBuffer(MemorySegment segment, long index, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VH_pVertexBuffer.set(segment, 0L, index, value); }
    /// Sets `pVertexBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexBuffer(MemorySegment segment, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(segment, 0L, value); }
    /// Sets `pVertexBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pVertexBufferAt(long index, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(this.segment(), index, value); return this; }
    /// Sets `pVertexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(@CType("const VkIndirectCommandsVertexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(this.segment(), value); return this; }

    /// {@return `pIndexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment get_pIndexBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pIndexBuffer.get(segment, 0L, index); }
    /// {@return `pIndexBuffer`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment get_pIndexBuffer(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(segment, 0L); }
    /// {@return `pIndexBuffer` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment pIndexBufferAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(this.segment(), index); }
    /// {@return `pIndexBuffer`}
    public @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment pIndexBuffer() { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(this.segment()); }
    /// Sets `pIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pIndexBuffer(MemorySegment segment, long index, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VH_pIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `pIndexBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pIndexBuffer(MemorySegment segment, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(segment, 0L, value); }
    /// Sets `pIndexBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pIndexBufferAt(long index, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(this.segment(), index, value); return this; }
    /// Sets `pIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(@CType("const VkIndirectCommandsIndexBufferTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(this.segment(), value); return this; }

    /// {@return `pExecutionSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment get_pExecutionSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pExecutionSet.get(segment, 0L, index); }
    /// {@return `pExecutionSet`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment get_pExecutionSet(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(segment, 0L); }
    /// {@return `pExecutionSet` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment pExecutionSetAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(this.segment(), index); }
    /// {@return `pExecutionSet`}
    public @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment pExecutionSet() { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(this.segment()); }
    /// Sets `pExecutionSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pExecutionSet(MemorySegment segment, long index, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment value) { VH_pExecutionSet.set(segment, 0L, index, value); }
    /// Sets `pExecutionSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pExecutionSet(MemorySegment segment, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(segment, 0L, value); }
    /// Sets `pExecutionSet` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pExecutionSetAt(long index, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(this.segment(), index, value); return this; }
    /// Sets `pExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pExecutionSet(@CType("const VkIndirectCommandsExecutionSetTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(this.segment(), value); return this; }

}
