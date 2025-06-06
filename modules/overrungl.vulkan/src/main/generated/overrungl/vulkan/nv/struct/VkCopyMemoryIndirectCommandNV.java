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
/// struct VkCopyMemoryIndirectCommandNV {
///     (uint64_t) VkDeviceAddress srcAddress;
///     (uint64_t) VkDeviceAddress dstAddress;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public sealed class VkCopyMemoryIndirectCommandNV extends GroupType {
    /// The struct layout of `VkCopyMemoryIndirectCommandNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The byte offset of `srcAddress`.
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    /// The memory layout of `srcAddress`.
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    /// The byte offset of `dstAddress`.
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    /// The memory layout of `dstAddress`.
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    /// The [VarHandle] of `dstAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkCopyMemoryIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkCopyMemoryIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param srcAddress `srcAddress`
    /// @param dstAddress `dstAddress`
    /// @param size `size`
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV allocInit(SegmentAllocator allocator, long srcAddress, long dstAddress, long size) {
        return alloc(allocator).srcAddress(srcAddress).dstAddress(dstAddress).size(size);
    }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param srcAddress `srcAddress`
    /// @param dstAddress `dstAddress`
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV allocInit(SegmentAllocator allocator, long srcAddress, long dstAddress) {
        return alloc(allocator).srcAddress(srcAddress).dstAddress(dstAddress);
    }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param srcAddress `srcAddress`
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV allocInit(SegmentAllocator allocator, long srcAddress) {
        return alloc(allocator).srcAddress(srcAddress);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV copyFrom(VkCopyMemoryIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get(segment, 0L, index); }
    /// {@return `srcAddress`}
    public long srcAddress() { return srcAddress(this.segment(), 0L); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAddress(MemorySegment segment, long index, long value) { VH_srcAddress.set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV srcAddress(long value) { srcAddress(this.segment(), 0L, value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAddress(MemorySegment segment, long index) { return (long) VH_dstAddress.get(segment, 0L, index); }
    /// {@return `dstAddress`}
    public long dstAddress() { return dstAddress(this.segment(), 0L); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAddress(MemorySegment segment, long index, long value) { VH_dstAddress.set(segment, 0L, index, value); }
    /// Sets `dstAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV dstAddress(long value) { dstAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV size(long value) { size(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCopyMemoryIndirectCommandNV].
    public static final class Buffer extends VkCopyMemoryIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkCopyMemoryIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyMemoryIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyMemoryIndirectCommandNV`
        public VkCopyMemoryIndirectCommandNV asSlice(long index) { return new VkCopyMemoryIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyMemoryIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyMemoryIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcAddress` at the given index}
        /// @param index the index of the struct buffer
        public long srcAddressAt(long index) { return srcAddress(this.segment(), index); }
        /// Sets `srcAddress` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAddressAt(long index, long value) { srcAddress(this.segment(), index, value); return this; }

        /// {@return `dstAddress` at the given index}
        /// @param index the index of the struct buffer
        public long dstAddressAt(long index) { return dstAddress(this.segment(), index); }
        /// Sets `dstAddress` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAddressAt(long index, long value) { dstAddress(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public long sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    }
}
