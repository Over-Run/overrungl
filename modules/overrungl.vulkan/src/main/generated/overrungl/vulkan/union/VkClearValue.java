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
package overrungl.vulkan.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkClearValue {
///     (union VkClearColorValue) VkClearColorValue color;
///     (struct VkClearDepthStencilValue) VkClearDepthStencilValue depthStencil;
/// };
/// ```
public sealed class VkClearValue extends GroupType {
    /// The union layout of `VkClearValue`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("color"),
        overrungl.vulkan.struct.VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );
    /// The byte offset of `color`.
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    /// The memory layout of `color`.
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    /// The byte offset of `depthStencil`.
    public static final long OFFSET_depthStencil = LAYOUT.byteOffset(PathElement.groupElement("depthStencil"));
    /// The memory layout of `depthStencil`.
    public static final MemoryLayout LAYOUT_depthStencil = LAYOUT.select(PathElement.groupElement("depthStencil"));

    /// Creates `VkClearValue` with the given segment.
    /// @param segment the memory segment
    public VkClearValue(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearValue(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkClearValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClearValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearValue`
    public static VkClearValue alloc(SegmentAllocator allocator) { return new VkClearValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearValue`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClearValue` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param color `color`
    /// @param depthStencil `depthStencil`
    /// @return the allocated `VkClearValue`
    public static VkClearValue allocInit(SegmentAllocator allocator, MemorySegment color, MemorySegment depthStencil) {
        return alloc(allocator).color(color).depthStencil(depthStencil);
    }

    /// Allocates a `VkClearValue` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param color `color`
    /// @return the allocated `VkClearValue`
    public static VkClearValue allocInit(SegmentAllocator allocator, MemorySegment color) {
        return alloc(allocator).color(color);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearValue copyFrom(VkClearValue src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `color` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment color(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_color, index), LAYOUT_color); }
    /// {@return `color`}
    public MemorySegment color() { return color(this.segment(), 0L); }
    /// Sets `color` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void color(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_color, index), LAYOUT_color.byteSize()); }
    /// Sets `color` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearValue color(MemorySegment value) { color(this.segment(), 0L, value); return this; }

    /// {@return `depthStencil` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment depthStencil(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_depthStencil, index), LAYOUT_depthStencil); }
    /// {@return `depthStencil`}
    public MemorySegment depthStencil() { return depthStencil(this.segment(), 0L); }
    /// Sets `depthStencil` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void depthStencil(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_depthStencil, index), LAYOUT_depthStencil.byteSize()); }
    /// Sets `depthStencil` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearValue depthStencil(MemorySegment value) { depthStencil(this.segment(), 0L, value); return this; }

    /// A buffer of [VkClearValue].
    public static final class Buffer extends VkClearValue {
        private final long elementCount;

        /// Creates `VkClearValue.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClearValue`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkClearValue`
        public VkClearValue asSlice(long index) { return new VkClearValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClearValue`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkClearValue`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `color` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment colorAt(long index) { return color(this.segment(), index); }
        /// Sets `color` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorAt(long index, MemorySegment value) { color(this.segment(), index, value); return this; }

        /// {@return `depthStencil` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment depthStencilAt(long index) { return depthStencil(this.segment(), index); }
        /// Sets `depthStencil` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthStencilAt(long index, MemorySegment value) { depthStencil(this.segment(), index, value); return this; }

    }
}
