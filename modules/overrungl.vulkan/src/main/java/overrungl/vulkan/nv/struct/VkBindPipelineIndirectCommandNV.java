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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBindPipelineIndirectCommandNV {
///     (uint64_t) VkDeviceAddress pipelineAddress;
/// };
/// ```
public sealed class VkBindPipelineIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBindPipelineIndirectCommandNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    /// The byte offset of `pipelineAddress`.
    public static final long OFFSET_pipelineAddress = LAYOUT.byteOffset(PathElement.groupElement("pipelineAddress"));
    /// The memory layout of `pipelineAddress`.
    public static final MemoryLayout LAYOUT_pipelineAddress = LAYOUT.select(PathElement.groupElement("pipelineAddress"));
    /// The [VarHandle] of `pipelineAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineAddress"));

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBindPipelineIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindPipelineIndirectCommandNV copyFrom(VkBindPipelineIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pipelineAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineAddress(MemorySegment segment, long index) { return (long) VH_pipelineAddress.get(segment, 0L, index); }
    /// {@return `pipelineAddress`}
    public long pipelineAddress() { return pipelineAddress(this.segment(), 0L); }
    /// Sets `pipelineAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineAddress(MemorySegment segment, long index, long value) { VH_pipelineAddress.set(segment, 0L, index, value); }
    /// Sets `pipelineAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindPipelineIndirectCommandNV pipelineAddress(long value) { pipelineAddress(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBindPipelineIndirectCommandNV].
    public static final class Buffer extends VkBindPipelineIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkBindPipelineIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindPipelineIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindPipelineIndirectCommandNV`
        public VkBindPipelineIndirectCommandNV asSlice(long index) { return new VkBindPipelineIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindPipelineIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindPipelineIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pipelineAddress` at the given index}
        /// @param index the index of the struct buffer
        public long pipelineAddressAt(long index) { return pipelineAddress(this.segment(), index); }
        /// Sets `pipelineAddress` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAddressAt(long index, long value) { pipelineAddress(this.segment(), index, value); return this; }

    }
}
