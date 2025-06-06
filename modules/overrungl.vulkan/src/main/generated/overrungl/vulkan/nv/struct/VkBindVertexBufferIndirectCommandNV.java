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
/// struct VkBindVertexBufferIndirectCommandNV {
///     (uint64_t) VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// };
/// ```
public sealed class VkBindVertexBufferIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBindVertexBufferIndirectCommandNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    /// The byte offset of `bufferAddress`.
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    /// The memory layout of `bufferAddress`.
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindVertexBufferIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @param size `size`
    /// @param stride `stride`
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV allocInit(SegmentAllocator allocator, long bufferAddress, int size, int stride) {
        return alloc(allocator).bufferAddress(bufferAddress).size(size).stride(stride);
    }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @param size `size`
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV allocInit(SegmentAllocator allocator, long bufferAddress, int size) {
        return alloc(allocator).bufferAddress(bufferAddress).size(size);
    }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV allocInit(SegmentAllocator allocator, long bufferAddress) {
        return alloc(allocator).bufferAddress(bufferAddress);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV copyFrom(VkBindVertexBufferIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    public long bufferAddress() { return bufferAddress(this.segment(), 0L); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferAddress(MemorySegment segment, long index, long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV bufferAddress(long value) { bufferAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBindVertexBufferIndirectCommandNV].
    public static final class Buffer extends VkBindVertexBufferIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkBindVertexBufferIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindVertexBufferIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindVertexBufferIndirectCommandNV`
        public VkBindVertexBufferIndirectCommandNV asSlice(long index) { return new VkBindVertexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindVertexBufferIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindVertexBufferIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `bufferAddress` at the given index}
        /// @param index the index of the struct buffer
        public long bufferAddressAt(long index) { return bufferAddress(this.segment(), index); }
        /// Sets `bufferAddress` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferAddressAt(long index, long value) { bufferAddress(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public int sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index of the struct buffer
        public int strideAt(long index) { return stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

    }
}
