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
package overrungl.vulkan.intel.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPerformanceValueINTEL {
///     (int) VkPerformanceValueTypeINTEL type;
///     (union VkPerformanceValueDataINTEL) VkPerformanceValueDataINTEL data;
/// };
/// ```
public sealed class VkPerformanceValueINTEL extends GroupType {
    /// The struct layout of `VkPerformanceValueINTEL`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.intel.union.VkPerformanceValueDataINTEL.LAYOUT.withName("data")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceValueINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceValueINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceValueINTEL`
    public static VkPerformanceValueINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceValueINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceValueINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceValueINTEL copyFrom(VkPerformanceValueINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueINTEL type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), LAYOUT_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueINTEL data(MemorySegment value) { data(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPerformanceValueINTEL].
    public static final class Buffer extends VkPerformanceValueINTEL {
        private final long elementCount;

        /// Creates `VkPerformanceValueINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceValueINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceValueINTEL`
        public VkPerformanceValueINTEL asSlice(long index) { return new VkPerformanceValueINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceValueINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceValueINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public int typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, int value) { type(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dataAt(long index) { return data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }

    }
}
