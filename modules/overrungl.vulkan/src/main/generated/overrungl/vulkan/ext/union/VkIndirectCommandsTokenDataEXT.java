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
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkIndirectCommandsTokenDataEXT {
///     const VkIndirectCommandsPushConstantTokenEXT* pPushConstant;
///     const VkIndirectCommandsVertexBufferTokenEXT* pVertexBuffer;
///     const VkIndirectCommandsIndexBufferTokenEXT* pIndexBuffer;
///     const VkIndirectCommandsExecutionSetTokenEXT* pExecutionSet;
/// };
/// ```
public final class VkIndirectCommandsTokenDataEXT extends GroupType {
    /// The union layout of `VkIndirectCommandsTokenDataEXT`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPushConstant"),
        ValueLayout.ADDRESS.withName("pVertexBuffer"),
        ValueLayout.ADDRESS.withName("pIndexBuffer"),
        ValueLayout.ADDRESS.withName("pExecutionSet")
    );
    /// The byte offset of `pPushConstant`.
    public static final long OFFSET_pPushConstant = LAYOUT.byteOffset(PathElement.groupElement("pPushConstant"));
    /// The memory layout of `pPushConstant`.
    public static final MemoryLayout LAYOUT_pPushConstant = LAYOUT.select(PathElement.groupElement("pPushConstant"));
    /// The [VarHandle] of `pPushConstant` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPushConstant = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstant"));
    /// The byte offset of `pVertexBuffer`.
    public static final long OFFSET_pVertexBuffer = LAYOUT.byteOffset(PathElement.groupElement("pVertexBuffer"));
    /// The memory layout of `pVertexBuffer`.
    public static final MemoryLayout LAYOUT_pVertexBuffer = LAYOUT.select(PathElement.groupElement("pVertexBuffer"));
    /// The [VarHandle] of `pVertexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBuffer"));
    /// The byte offset of `pIndexBuffer`.
    public static final long OFFSET_pIndexBuffer = LAYOUT.byteOffset(PathElement.groupElement("pIndexBuffer"));
    /// The memory layout of `pIndexBuffer`.
    public static final MemoryLayout LAYOUT_pIndexBuffer = LAYOUT.select(PathElement.groupElement("pIndexBuffer"));
    /// The [VarHandle] of `pIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexBuffer"));
    /// The byte offset of `pExecutionSet`.
    public static final long OFFSET_pExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("pExecutionSet"));
    /// The memory layout of `pExecutionSet`.
    public static final MemoryLayout LAYOUT_pExecutionSet = LAYOUT.select(PathElement.groupElement("pExecutionSet"));
    /// The [VarHandle] of `pExecutionSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExecutionSet"));

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkIndirectCommandsTokenDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsTokenDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and `pPushConstant`.
    /// @param allocator the segment allocator
    /// @param pPushConstant `pPushConstant`
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT allocWith_pPushConstant(SegmentAllocator allocator, MemorySegment pPushConstant) {
        return alloc(allocator).pPushConstant(pPushConstant);
    }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and `pVertexBuffer`.
    /// @param allocator the segment allocator
    /// @param pVertexBuffer `pVertexBuffer`
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT allocWith_pVertexBuffer(SegmentAllocator allocator, MemorySegment pVertexBuffer) {
        return alloc(allocator).pVertexBuffer(pVertexBuffer);
    }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and `pIndexBuffer`.
    /// @param allocator the segment allocator
    /// @param pIndexBuffer `pIndexBuffer`
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT allocWith_pIndexBuffer(SegmentAllocator allocator, MemorySegment pIndexBuffer) {
        return alloc(allocator).pIndexBuffer(pIndexBuffer);
    }

    /// Allocates a `VkIndirectCommandsTokenDataEXT` with the given segment allocator and `pExecutionSet`.
    /// @param allocator the segment allocator
    /// @param pExecutionSet `pExecutionSet`
    /// @return the allocated `VkIndirectCommandsTokenDataEXT`
    public static VkIndirectCommandsTokenDataEXT allocWith_pExecutionSet(SegmentAllocator allocator, MemorySegment pExecutionSet) {
        return alloc(allocator).pExecutionSet(pExecutionSet);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT copyFrom(VkIndirectCommandsTokenDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsTokenDataEXT reinterpret(long count) { return new VkIndirectCommandsTokenDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pPushConstant` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pPushConstant(MemorySegment segment, long index) { return (MemorySegment) VH_pPushConstant.get(segment, 0L, index); }
    /// {@return `pPushConstant`}
    public MemorySegment pPushConstant() { return pPushConstant(this.segment(), 0L); }
    /// Sets `pPushConstant` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pPushConstant(MemorySegment segment, long index, MemorySegment value) { VH_pPushConstant.set(segment, 0L, index, value); }
    /// Sets `pPushConstant` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pPushConstant(MemorySegment value) { pPushConstant(this.segment(), 0L, value); return this; }

    /// {@return `pVertexBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pVertexBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexBuffer.get(segment, 0L, index); }
    /// {@return `pVertexBuffer`}
    public MemorySegment pVertexBuffer() { return pVertexBuffer(this.segment(), 0L); }
    /// Sets `pVertexBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pVertexBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pVertexBuffer.set(segment, 0L, index, value); }
    /// Sets `pVertexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(MemorySegment value) { pVertexBuffer(this.segment(), 0L, value); return this; }

    /// {@return `pIndexBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pIndexBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pIndexBuffer.get(segment, 0L, index); }
    /// {@return `pIndexBuffer`}
    public MemorySegment pIndexBuffer() { return pIndexBuffer(this.segment(), 0L); }
    /// Sets `pIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pIndexBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `pIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(MemorySegment value) { pIndexBuffer(this.segment(), 0L, value); return this; }

    /// {@return `pExecutionSet` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pExecutionSet(MemorySegment segment, long index) { return (MemorySegment) VH_pExecutionSet.get(segment, 0L, index); }
    /// {@return `pExecutionSet`}
    public MemorySegment pExecutionSet() { return pExecutionSet(this.segment(), 0L); }
    /// Sets `pExecutionSet` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pExecutionSet(MemorySegment segment, long index, MemorySegment value) { VH_pExecutionSet.set(segment, 0L, index, value); }
    /// Sets `pExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pExecutionSet(MemorySegment value) { pExecutionSet(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsTokenDataEXT`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkIndirectCommandsTokenDataEXT`
    public VkIndirectCommandsTokenDataEXT asSlice(long index) { return new VkIndirectCommandsTokenDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsTokenDataEXT`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsTokenDataEXT`
    public VkIndirectCommandsTokenDataEXT asSlice(long index, long count) { return new VkIndirectCommandsTokenDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsTokenDataEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT at(long index, Consumer<VkIndirectCommandsTokenDataEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pPushConstant` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pPushConstantAt(long index) { return pPushConstant(this.segment(), index); }
    /// Sets `pPushConstant` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pPushConstantAt(long index, MemorySegment value) { pPushConstant(this.segment(), index, value); return this; }

    /// {@return `pVertexBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pVertexBufferAt(long index) { return pVertexBuffer(this.segment(), index); }
    /// Sets `pVertexBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pVertexBufferAt(long index, MemorySegment value) { pVertexBuffer(this.segment(), index, value); return this; }

    /// {@return `pIndexBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pIndexBufferAt(long index) { return pIndexBuffer(this.segment(), index); }
    /// Sets `pIndexBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pIndexBufferAt(long index, MemorySegment value) { pIndexBuffer(this.segment(), index, value); return this; }

    /// {@return `pExecutionSet` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pExecutionSetAt(long index) { return pExecutionSet(this.segment(), index); }
    /// Sets `pExecutionSet` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsTokenDataEXT pExecutionSetAt(long index, MemorySegment value) { pExecutionSet(this.segment(), index, value); return this; }

}
