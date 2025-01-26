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
/// struct VkVertexInputBindingDivisorDescription {
///     uint32_t binding;
///     uint32_t divisor;
/// };
/// ```
public sealed class VkVertexInputBindingDivisorDescription extends GroupType {
    /// The struct layout of `VkVertexInputBindingDivisorDescription`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `divisor`.
    public static final long OFFSET_divisor = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
    /// The memory layout of `divisor`.
    public static final MemoryLayout LAYOUT_divisor = LAYOUT.select(PathElement.groupElement("divisor"));
    /// The [VarHandle] of `divisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputBindingDivisorDescription(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVertexInputBindingDivisorDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDivisorDescription`
    public static VkVertexInputBindingDivisorDescription alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDivisorDescription(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputBindingDivisorDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDivisorDescription`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDivisorDescription copyFrom(VkVertexInputBindingDivisorDescription src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `divisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int divisor(MemorySegment segment, long index) { return (int) VH_divisor.get(segment, 0L, index); }
    /// {@return `divisor`}
    public int divisor() { return divisor(this.segment(), 0L); }
    /// Sets `divisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void divisor(MemorySegment segment, long index, int value) { VH_divisor.set(segment, 0L, index, value); }
    /// Sets `divisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription divisor(int value) { divisor(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVertexInputBindingDivisorDescription].
    public static final class Buffer extends VkVertexInputBindingDivisorDescription {
        private final long elementCount;

        /// Creates `VkVertexInputBindingDivisorDescription.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVertexInputBindingDivisorDescription`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVertexInputBindingDivisorDescription`
        public VkVertexInputBindingDivisorDescription asSlice(long index) { return new VkVertexInputBindingDivisorDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVertexInputBindingDivisorDescription`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVertexInputBindingDivisorDescription`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `binding` at the given index}
        /// @param index the index of the struct buffer
        public int bindingAt(long index) { return binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

        /// {@return `divisor` at the given index}
        /// @param index the index of the struct buffer
        public int divisorAt(long index) { return divisor(this.segment(), index); }
        /// Sets `divisor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer divisorAt(long index, int value) { divisor(this.segment(), index, value); return this; }

    }
}
