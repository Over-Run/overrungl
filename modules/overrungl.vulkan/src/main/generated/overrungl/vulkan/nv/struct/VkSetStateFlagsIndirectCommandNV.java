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
/// struct VkSetStateFlagsIndirectCommandNV {
///     uint32_t data;
/// };
/// ```
public sealed class VkSetStateFlagsIndirectCommandNV extends GroupType {
    /// The struct layout of `VkSetStateFlagsIndirectCommandNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("data")
    );
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The [VarHandle] of `data` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"));

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetStateFlagsIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSetStateFlagsIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetStateFlagsIndirectCommandNV`
    public static VkSetStateFlagsIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkSetStateFlagsIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSetStateFlagsIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetStateFlagsIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSetStateFlagsIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param data `data`
    /// @return the allocated `VkSetStateFlagsIndirectCommandNV`
    public static VkSetStateFlagsIndirectCommandNV allocInit(SegmentAllocator allocator, int data) {
        return alloc(allocator).data(data);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSetStateFlagsIndirectCommandNV copyFrom(VkSetStateFlagsIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int data(MemorySegment segment, long index) { return (int) VH_data.get(segment, 0L, index); }
    /// {@return `data`}
    public int data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, int value) { VH_data.set(segment, 0L, index, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetStateFlagsIndirectCommandNV data(int value) { data(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSetStateFlagsIndirectCommandNV].
    public static final class Buffer extends VkSetStateFlagsIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkSetStateFlagsIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSetStateFlagsIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSetStateFlagsIndirectCommandNV`
        public VkSetStateFlagsIndirectCommandNV asSlice(long index) { return new VkSetStateFlagsIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSetStateFlagsIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSetStateFlagsIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `data` at the given index}
        /// @param index the index of the struct buffer
        public int dataAt(long index) { return data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, int value) { data(this.segment(), index, value); return this; }

    }
}
