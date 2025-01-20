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
/// [VarHandle][#VH_pPushConstant] - [Getter][#pPushConstant()] - [Setter][#pPushConstant(MemorySegment)]
/// ### pVertexBuffer
/// [VarHandle][#VH_pVertexBuffer] - [Getter][#pVertexBuffer()] - [Setter][#pVertexBuffer(MemorySegment)]
/// ### pIndexBuffer
/// [VarHandle][#VH_pIndexBuffer] - [Getter][#pIndexBuffer()] - [Setter][#pIndexBuffer(MemorySegment)]
/// ### pExecutionSet
/// [VarHandle][#VH_pExecutionSet] - [Getter][#pExecutionSet()] - [Setter][#pExecutionSet(MemorySegment)]
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
public sealed class VkIndirectCommandsTokenDataEXT extends Union {
    /// The union layout of `VkIndirectCommandsTokenDataEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPushConstant"),
        ValueLayout.ADDRESS.withName("pVertexBuffer"),
        ValueLayout.ADDRESS.withName("pIndexBuffer"),
        ValueLayout.ADDRESS.withName("pExecutionSet")
    );
    /// The [VarHandle] of `pPushConstant` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPushConstant = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstant"));
    /// The [VarHandle] of `pVertexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBuffer"));
    /// The [VarHandle] of `pIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexBuffer"));
    /// The [VarHandle] of `pExecutionSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExecutionSet"));

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsTokenDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT copyFrom(VkIndirectCommandsTokenDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pPushConstant` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment get_pPushConstant(MemorySegment segment, long index) { return (MemorySegment) VH_pPushConstant.get(segment, 0L, index); }
    /// {@return `pPushConstant`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment get_pPushConstant(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(segment, 0L); }
    /// {@return `pPushConstant`}
    public @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment pPushConstant() { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(this.segment()); }
    /// Sets `pPushConstant` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pPushConstant(MemorySegment segment, long index, @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment value) { VH_pPushConstant.set(segment, 0L, index, value); }
    /// Sets `pPushConstant` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pPushConstant(MemorySegment segment, @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(segment, 0L, value); }
    /// Sets `pPushConstant` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pPushConstant(@CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(this.segment(), value); return this; }

    /// {@return `pVertexBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment get_pVertexBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexBuffer.get(segment, 0L, index); }
    /// {@return `pVertexBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment get_pVertexBuffer(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(segment, 0L); }
    /// {@return `pVertexBuffer`}
    public @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment pVertexBuffer() { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(this.segment()); }
    /// Sets `pVertexBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexBuffer(MemorySegment segment, long index, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment value) { VH_pVertexBuffer.set(segment, 0L, index, value); }
    /// Sets `pVertexBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pVertexBuffer(MemorySegment segment, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(segment, 0L, value); }
    /// Sets `pVertexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(@CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(this.segment(), value); return this; }

    /// {@return `pIndexBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment get_pIndexBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pIndexBuffer.get(segment, 0L, index); }
    /// {@return `pIndexBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment get_pIndexBuffer(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(segment, 0L); }
    /// {@return `pIndexBuffer`}
    public @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment pIndexBuffer() { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(this.segment()); }
    /// Sets `pIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pIndexBuffer(MemorySegment segment, long index, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment value) { VH_pIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `pIndexBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pIndexBuffer(MemorySegment segment, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(segment, 0L, value); }
    /// Sets `pIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(@CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(this.segment(), value); return this; }

    /// {@return `pExecutionSet` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment get_pExecutionSet(MemorySegment segment, long index) { return (MemorySegment) VH_pExecutionSet.get(segment, 0L, index); }
    /// {@return `pExecutionSet`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment get_pExecutionSet(MemorySegment segment) { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(segment, 0L); }
    /// {@return `pExecutionSet`}
    public @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment pExecutionSet() { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(this.segment()); }
    /// Sets `pExecutionSet` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pExecutionSet(MemorySegment segment, long index, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment value) { VH_pExecutionSet.set(segment, 0L, index, value); }
    /// Sets `pExecutionSet` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pExecutionSet(MemorySegment segment, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(segment, 0L, value); }
    /// Sets `pExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pExecutionSet(@CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(this.segment(), value); return this; }

    /// A buffer of [VkIndirectCommandsTokenDataEXT].
    public static final class Buffer extends VkIndirectCommandsTokenDataEXT {
        private final long elementCount;

        /// Creates `VkIndirectCommandsTokenDataEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsTokenDataEXT`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkIndirectCommandsTokenDataEXT`
        public VkIndirectCommandsTokenDataEXT asSlice(long index) { return new VkIndirectCommandsTokenDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsTokenDataEXT`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsTokenDataEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pPushConstant` at the given index}
        /// @param index the index
        public @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment pPushConstantAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pPushConstant(this.segment(), index); }
        /// Sets `pPushConstant` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPushConstantAt(long index, @CType("const VkIndirectCommandsPushConstantTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pPushConstant(this.segment(), index, value); return this; }

        /// {@return `pVertexBuffer` at the given index}
        /// @param index the index
        public @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment pVertexBufferAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pVertexBuffer(this.segment(), index); }
        /// Sets `pVertexBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pVertexBufferAt(long index, @CType("const VkIndirectCommandsVertexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pVertexBuffer(this.segment(), index, value); return this; }

        /// {@return `pIndexBuffer` at the given index}
        /// @param index the index
        public @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment pIndexBufferAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pIndexBuffer(this.segment(), index); }
        /// Sets `pIndexBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pIndexBufferAt(long index, @CType("const VkIndirectCommandsIndexBufferTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pIndexBuffer(this.segment(), index, value); return this; }

        /// {@return `pExecutionSet` at the given index}
        /// @param index the index
        public @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment pExecutionSetAt(long index) { return VkIndirectCommandsTokenDataEXT.get_pExecutionSet(this.segment(), index); }
        /// Sets `pExecutionSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pExecutionSetAt(long index, @CType("const VkIndirectCommandsExecutionSetTokenEXT *") MemorySegment value) { VkIndirectCommandsTokenDataEXT.set_pExecutionSet(this.segment(), index, value); return this; }

    }
}
