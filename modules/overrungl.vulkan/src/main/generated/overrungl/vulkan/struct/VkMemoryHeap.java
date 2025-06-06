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
/// struct VkMemoryHeap {
///     (uint64_t) VkDeviceSize size;
///     ((uint32_t) VkFlags) VkMemoryHeapFlags flags;
/// };
/// ```
public sealed class VkMemoryHeap extends GroupType {
    /// The struct layout of `VkMemoryHeap`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkMemoryHeap` with the given segment.
    /// @param segment the memory segment
    public VkMemoryHeap(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryHeap` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryHeap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHeap ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryHeap(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMemoryHeap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryHeap` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryHeap`
    public static VkMemoryHeap alloc(SegmentAllocator allocator) { return new VkMemoryHeap(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryHeap` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryHeap`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryHeap` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param size `size`
    /// @param flags `flags`
    /// @return the allocated `VkMemoryHeap`
    public static VkMemoryHeap allocInit(SegmentAllocator allocator, long size, int flags) {
        return alloc(allocator).size(size).flags(flags);
    }

    /// Allocates a `VkMemoryHeap` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param size `size`
    /// @return the allocated `VkMemoryHeap`
    public static VkMemoryHeap allocInit(SegmentAllocator allocator, long size) {
        return alloc(allocator).size(size);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryHeap copyFrom(VkMemoryHeap src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkMemoryHeap size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHeap flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMemoryHeap].
    public static final class Buffer extends VkMemoryHeap {
        private final long elementCount;

        /// Creates `VkMemoryHeap.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryHeap`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryHeap`
        public VkMemoryHeap asSlice(long index) { return new VkMemoryHeap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryHeap`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryHeap`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public long sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    }
}
