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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkIndirectExecutionSetInfoEXT {
///     const VkIndirectExecutionSetPipelineInfoEXT* pPipelineInfo;
///     const VkIndirectExecutionSetShaderInfoEXT* pShaderInfo;
/// };
/// ```
public sealed class VkIndirectExecutionSetInfoEXT extends GroupType {
    /// The union layout of `VkIndirectExecutionSetInfoEXT`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withName("pShaderInfo")
    );
    /// The byte offset of `pPipelineInfo`.
    public static final long OFFSET_pPipelineInfo = LAYOUT.byteOffset(PathElement.groupElement("pPipelineInfo"));
    /// The memory layout of `pPipelineInfo`.
    public static final MemoryLayout LAYOUT_pPipelineInfo = LAYOUT.select(PathElement.groupElement("pPipelineInfo"));
    /// The [VarHandle] of `pPipelineInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineInfo"));
    /// The byte offset of `pShaderInfo`.
    public static final long OFFSET_pShaderInfo = LAYOUT.byteOffset(PathElement.groupElement("pShaderInfo"));
    /// The memory layout of `pShaderInfo`.
    public static final MemoryLayout LAYOUT_pShaderInfo = LAYOUT.select(PathElement.groupElement("pShaderInfo"));
    /// The [VarHandle] of `pShaderInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShaderInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderInfo"));

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator and `pPipelineInfo`.
    /// @param allocator the segment allocator
    /// @param pPipelineInfo `pPipelineInfo`
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT allocWith_pPipelineInfo(SegmentAllocator allocator, MemorySegment pPipelineInfo) {
        return alloc(allocator).pPipelineInfo(pPipelineInfo);
    }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator and `pShaderInfo`.
    /// @param allocator the segment allocator
    /// @param pShaderInfo `pShaderInfo`
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT allocWith_pShaderInfo(SegmentAllocator allocator, MemorySegment pShaderInfo) {
        return alloc(allocator).pShaderInfo(pShaderInfo);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT copyFrom(VkIndirectExecutionSetInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pPipelineInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pPipelineInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineInfo.get(segment, 0L, index); }
    /// {@return `pPipelineInfo`}
    public MemorySegment pPipelineInfo() { return pPipelineInfo(this.segment(), 0L); }
    /// Sets `pPipelineInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pPipelineInfo(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineInfo.set(segment, 0L, index, value); }
    /// Sets `pPipelineInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(MemorySegment value) { pPipelineInfo(this.segment(), 0L, value); return this; }

    /// {@return `pShaderInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pShaderInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pShaderInfo.get(segment, 0L, index); }
    /// {@return `pShaderInfo`}
    public MemorySegment pShaderInfo() { return pShaderInfo(this.segment(), 0L); }
    /// Sets `pShaderInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pShaderInfo(MemorySegment segment, long index, MemorySegment value) { VH_pShaderInfo.set(segment, 0L, index, value); }
    /// Sets `pShaderInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pShaderInfo(MemorySegment value) { pShaderInfo(this.segment(), 0L, value); return this; }

    /// A buffer of [VkIndirectExecutionSetInfoEXT].
    public static final class Buffer extends VkIndirectExecutionSetInfoEXT {
        private final long elementCount;

        /// Creates `VkIndirectExecutionSetInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkIndirectExecutionSetInfoEXT`
        public VkIndirectExecutionSetInfoEXT asSlice(long index) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkIndirectExecutionSetInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pPipelineInfo` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment pPipelineInfoAt(long index) { return pPipelineInfo(this.segment(), index); }
        /// Sets `pPipelineInfo` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineInfoAt(long index, MemorySegment value) { pPipelineInfo(this.segment(), index, value); return this; }

        /// {@return `pShaderInfo` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment pShaderInfoAt(long index) { return pShaderInfo(this.segment(), index); }
        /// Sets `pShaderInfo` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer pShaderInfoAt(long index, MemorySegment value) { pShaderInfo(this.segment(), index, value); return this; }

    }
}
