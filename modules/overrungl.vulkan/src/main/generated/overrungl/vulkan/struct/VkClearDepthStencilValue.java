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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClearDepthStencilValue {
///     float depth;
///     uint32_t stencil;
/// };
/// ```
public sealed class VkClearDepthStencilValue extends GroupType {
    /// The struct layout of `VkClearDepthStencilValue`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    /// The byte offset of `depth`.
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    /// The memory layout of `depth`.
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));
    /// The byte offset of `stencil`.
    public static final long OFFSET_stencil = LAYOUT.byteOffset(PathElement.groupElement("stencil"));
    /// The memory layout of `stencil`.
    public static final MemoryLayout LAYOUT_stencil = LAYOUT.select(PathElement.groupElement("stencil"));
    /// The [VarHandle] of `stencil` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencil"));

    /// Creates `VkClearDepthStencilValue` with the given segment.
    /// @param segment the memory segment
    public VkClearDepthStencilValue(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearDepthStencilValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearDepthStencilValue`
    public static VkClearDepthStencilValue alloc(SegmentAllocator allocator) { return new VkClearDepthStencilValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearDepthStencilValue`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param depth `depth`
    /// @param stencil `stencil`
    /// @return the allocated `VkClearDepthStencilValue`
    public static VkClearDepthStencilValue allocInit(SegmentAllocator allocator, float depth, int stencil) {
        return alloc(allocator).depth(depth).stencil(stencil);
    }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param depth `depth`
    /// @return the allocated `VkClearDepthStencilValue`
    public static VkClearDepthStencilValue allocInit(SegmentAllocator allocator, float depth) {
        return alloc(allocator).depth(depth);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearDepthStencilValue copyFrom(VkClearDepthStencilValue src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depth(MemorySegment segment, long index) { return (float) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    public float depth() { return depth(this.segment(), 0L); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depth(MemorySegment segment, long index, float value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearDepthStencilValue depth(float value) { depth(this.segment(), 0L, value); return this; }

    /// {@return `stencil` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencil(MemorySegment segment, long index) { return (int) VH_stencil.get(segment, 0L, index); }
    /// {@return `stencil`}
    public int stencil() { return stencil(this.segment(), 0L); }
    /// Sets `stencil` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencil(MemorySegment segment, long index, int value) { VH_stencil.set(segment, 0L, index, value); }
    /// Sets `stencil` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearDepthStencilValue stencil(int value) { stencil(this.segment(), 0L, value); return this; }

    /// A buffer of [VkClearDepthStencilValue].
    public static final class Buffer extends VkClearDepthStencilValue {
        private final long elementCount;

        /// Creates `VkClearDepthStencilValue.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClearDepthStencilValue`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClearDepthStencilValue`
        public VkClearDepthStencilValue asSlice(long index) { return new VkClearDepthStencilValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClearDepthStencilValue`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClearDepthStencilValue`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `depth` at the given index}
        /// @param index the index of the struct buffer
        public float depthAt(long index) { return depth(this.segment(), index); }
        /// Sets `depth` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthAt(long index, float value) { depth(this.segment(), index, value); return this; }

        /// {@return `stencil` at the given index}
        /// @param index the index of the struct buffer
        public int stencilAt(long index) { return stencil(this.segment(), index); }
        /// Sets `stencil` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stencilAt(long index, int value) { stencil(this.segment(), index, value); return this; }

    }
}
