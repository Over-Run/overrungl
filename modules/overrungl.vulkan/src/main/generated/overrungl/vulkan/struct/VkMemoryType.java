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
/// struct VkMemoryType {
///     ((uint32_t) VkFlags) VkMemoryPropertyFlags propertyFlags;
///     uint32_t heapIndex;
/// };
/// ```
public sealed class VkMemoryType extends GroupType {
    /// The struct layout of `VkMemoryType`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("propertyFlags"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    /// The byte offset of `propertyFlags`.
    public static final long OFFSET_propertyFlags = LAYOUT.byteOffset(PathElement.groupElement("propertyFlags"));
    /// The memory layout of `propertyFlags`.
    public static final MemoryLayout LAYOUT_propertyFlags = LAYOUT.select(PathElement.groupElement("propertyFlags"));
    /// The [VarHandle] of `propertyFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_propertyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("propertyFlags"));
    /// The byte offset of `heapIndex`.
    public static final long OFFSET_heapIndex = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
    /// The memory layout of `heapIndex`.
    public static final MemoryLayout LAYOUT_heapIndex = LAYOUT.select(PathElement.groupElement("heapIndex"));
    /// The [VarHandle] of `heapIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    /// Creates `VkMemoryType` with the given segment.
    /// @param segment the memory segment
    public VkMemoryType(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryType` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryType` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryType ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryType(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMemoryType` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryType` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryType`
    public static VkMemoryType alloc(SegmentAllocator allocator) { return new VkMemoryType(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryType` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryType`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryType` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param propertyFlags `propertyFlags`
    /// @param heapIndex `heapIndex`
    /// @return the allocated `VkMemoryType`
    public static VkMemoryType allocInit(SegmentAllocator allocator, int propertyFlags, int heapIndex) {
        return alloc(allocator).propertyFlags(propertyFlags).heapIndex(heapIndex);
    }

    /// Allocates a `VkMemoryType` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param propertyFlags `propertyFlags`
    /// @return the allocated `VkMemoryType`
    public static VkMemoryType allocInit(SegmentAllocator allocator, int propertyFlags) {
        return alloc(allocator).propertyFlags(propertyFlags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryType copyFrom(VkMemoryType src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `propertyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int propertyFlags(MemorySegment segment, long index) { return (int) VH_propertyFlags.get(segment, 0L, index); }
    /// {@return `propertyFlags`}
    public int propertyFlags() { return propertyFlags(this.segment(), 0L); }
    /// Sets `propertyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void propertyFlags(MemorySegment segment, long index, int value) { VH_propertyFlags.set(segment, 0L, index, value); }
    /// Sets `propertyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryType propertyFlags(int value) { propertyFlags(this.segment(), 0L, value); return this; }

    /// {@return `heapIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int heapIndex(MemorySegment segment, long index) { return (int) VH_heapIndex.get(segment, 0L, index); }
    /// {@return `heapIndex`}
    public int heapIndex() { return heapIndex(this.segment(), 0L); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void heapIndex(MemorySegment segment, long index, int value) { VH_heapIndex.set(segment, 0L, index, value); }
    /// Sets `heapIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryType heapIndex(int value) { heapIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMemoryType].
    public static final class Buffer extends VkMemoryType {
        private final long elementCount;

        /// Creates `VkMemoryType.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryType`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryType`
        public VkMemoryType asSlice(long index) { return new VkMemoryType(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryType`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryType`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `propertyFlags` at the given index}
        /// @param index the index of the struct buffer
        public int propertyFlagsAt(long index) { return propertyFlags(this.segment(), index); }
        /// Sets `propertyFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer propertyFlagsAt(long index, int value) { propertyFlags(this.segment(), index, value); return this; }

        /// {@return `heapIndex` at the given index}
        /// @param index the index of the struct buffer
        public int heapIndexAt(long index) { return heapIndex(this.segment(), index); }
        /// Sets `heapIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heapIndexAt(long index, int value) { heapIndex(this.segment(), index, value); return this; }

    }
}
