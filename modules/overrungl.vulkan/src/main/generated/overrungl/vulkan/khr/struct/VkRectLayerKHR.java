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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkRectLayerKHR {
///     (struct VkOffset2D) VkOffset2D offset;
///     (struct VkExtent2D) VkExtent2D extent;
///     uint32_t layer;
/// };
/// ```
public sealed class VkRectLayerKHR extends GroupType {
    /// The struct layout of `VkRectLayerKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The byte offset of `layer`.
    public static final long OFFSET_layer = LAYOUT.byteOffset(PathElement.groupElement("layer"));
    /// The memory layout of `layer`.
    public static final MemoryLayout LAYOUT_layer = LAYOUT.select(PathElement.groupElement("layer"));
    /// The [VarHandle] of `layer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layer"));

    /// Creates `VkRectLayerKHR` with the given segment.
    /// @param segment the memory segment
    public VkRectLayerKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRectLayerKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRectLayerKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRectLayerKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRectLayerKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkRectLayerKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR alloc(SegmentAllocator allocator) { return new VkRectLayerKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRectLayerKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param offset `offset`
    /// @param extent `extent`
    /// @param layer `layer`
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR allocInit(SegmentAllocator allocator, MemorySegment offset, MemorySegment extent, int layer) {
        return alloc(allocator).offset(offset).extent(extent).layer(layer);
    }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param offset `offset`
    /// @param extent `extent`
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR allocInit(SegmentAllocator allocator, MemorySegment offset, MemorySegment extent) {
        return alloc(allocator).offset(offset).extent(extent);
    }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param offset `offset`
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR allocInit(SegmentAllocator allocator, MemorySegment offset) {
        return alloc(allocator).offset(offset);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRectLayerKHR copyFrom(VkRectLayerKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment offset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    /// {@return `offset`}
    public MemorySegment offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset.byteSize()); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR offset(MemorySegment value) { offset(this.segment(), 0L, value); return this; }
    /// Accepts `offset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRectLayerKHR offset(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(offset())); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    /// {@return `extent`}
    public MemorySegment extent() { return extent(this.segment(), 0L); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }
    /// Accepts `extent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRectLayerKHR extent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(extent())); return this; }

    /// {@return `layer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layer(MemorySegment segment, long index) { return (int) VH_layer.get(segment, 0L, index); }
    /// {@return `layer`}
    public int layer() { return layer(this.segment(), 0L); }
    /// Sets `layer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layer(MemorySegment segment, long index, int value) { VH_layer.set(segment, 0L, index, value); }
    /// Sets `layer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR layer(int value) { layer(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRectLayerKHR].
    public static final class Buffer extends VkRectLayerKHR {
        private final long elementCount;

        /// Creates `VkRectLayerKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRectLayerKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRectLayerKHR`
        public VkRectLayerKHR asSlice(long index) { return new VkRectLayerKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRectLayerKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRectLayerKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `offset` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment offsetAt(long index) { return offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, MemorySegment value) { offset(this.segment(), index, value); return this; }
        /// Accepts `offset` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer offsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(offsetAt(index))); return this; }

        /// {@return `extent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment extentAt(long index) { return extent(this.segment(), index); }
        /// Sets `extent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extentAt(long index, MemorySegment value) { extent(this.segment(), index, value); return this; }
        /// Accepts `extent` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer extentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(extentAt(index))); return this; }

        /// {@return `layer` at the given index}
        /// @param index the index of the struct buffer
        public int layerAt(long index) { return layer(this.segment(), index); }
        /// Sets `layer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layerAt(long index, int value) { layer(this.segment(), index, value); return this; }

    }
}
