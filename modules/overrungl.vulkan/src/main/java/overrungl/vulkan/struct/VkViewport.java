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
/// struct VkViewport {
///     float x;
///     float y;
///     float width;
///     float height;
///     float minDepth;
///     float maxDepth;
/// };
/// ```
public sealed class VkViewport extends GroupType {
    /// The struct layout of `VkViewport`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `minDepth`.
    public static final long OFFSET_minDepth = LAYOUT.byteOffset(PathElement.groupElement("minDepth"));
    /// The memory layout of `minDepth`.
    public static final MemoryLayout LAYOUT_minDepth = LAYOUT.select(PathElement.groupElement("minDepth"));
    /// The [VarHandle] of `minDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepth"));
    /// The byte offset of `maxDepth`.
    public static final long OFFSET_maxDepth = LAYOUT.byteOffset(PathElement.groupElement("maxDepth"));
    /// The memory layout of `maxDepth`.
    public static final MemoryLayout LAYOUT_maxDepth = LAYOUT.select(PathElement.groupElement("maxDepth"));
    /// The [VarHandle] of `maxDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepth"));

    /// Creates `VkViewport` with the given segment.
    /// @param segment the memory segment
    public VkViewport(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViewport` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViewport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewport ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewport(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkViewport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkViewport` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewport`
    public static VkViewport alloc(SegmentAllocator allocator) { return new VkViewport(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViewport` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewport`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViewport copyFrom(VkViewport src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float x(MemorySegment segment, long index) { return (float) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public float x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, float value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport x(float value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float y(MemorySegment segment, long index) { return (float) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public float y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, float value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport y(float value) { y(this.segment(), 0L, value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float width(MemorySegment segment, long index) { return (float) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public float width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, float value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport width(float value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float height(MemorySegment segment, long index) { return (float) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public float height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, float value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport height(float value) { height(this.segment(), 0L, value); return this; }

    /// {@return `minDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minDepth(MemorySegment segment, long index) { return (float) VH_minDepth.get(segment, 0L, index); }
    /// {@return `minDepth`}
    public float minDepth() { return minDepth(this.segment(), 0L); }
    /// Sets `minDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minDepth(MemorySegment segment, long index, float value) { VH_minDepth.set(segment, 0L, index, value); }
    /// Sets `minDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport minDepth(float value) { minDepth(this.segment(), 0L, value); return this; }

    /// {@return `maxDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxDepth(MemorySegment segment, long index) { return (float) VH_maxDepth.get(segment, 0L, index); }
    /// {@return `maxDepth`}
    public float maxDepth() { return maxDepth(this.segment(), 0L); }
    /// Sets `maxDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDepth(MemorySegment segment, long index, float value) { VH_maxDepth.set(segment, 0L, index, value); }
    /// Sets `maxDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport maxDepth(float value) { maxDepth(this.segment(), 0L, value); return this; }

    /// A buffer of [VkViewport].
    public static final class Buffer extends VkViewport {
        private final long elementCount;

        /// Creates `VkViewport.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkViewport`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkViewport`
        public VkViewport asSlice(long index) { return new VkViewport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkViewport`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkViewport`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `x` at the given index}
        /// @param index the index of the struct buffer
        public float xAt(long index) { return x(this.segment(), index); }
        /// Sets `x` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer xAt(long index, float value) { x(this.segment(), index, value); return this; }

        /// {@return `y` at the given index}
        /// @param index the index of the struct buffer
        public float yAt(long index) { return y(this.segment(), index); }
        /// Sets `y` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer yAt(long index, float value) { y(this.segment(), index, value); return this; }

        /// {@return `width` at the given index}
        /// @param index the index of the struct buffer
        public float widthAt(long index) { return width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, float value) { width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index of the struct buffer
        public float heightAt(long index) { return height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, float value) { height(this.segment(), index, value); return this; }

        /// {@return `minDepth` at the given index}
        /// @param index the index of the struct buffer
        public float minDepthAt(long index) { return minDepth(this.segment(), index); }
        /// Sets `minDepth` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minDepthAt(long index, float value) { minDepth(this.segment(), index, value); return this; }

        /// {@return `maxDepth` at the given index}
        /// @param index the index of the struct buffer
        public float maxDepthAt(long index) { return maxDepth(this.segment(), index); }
        /// Sets `maxDepth` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDepthAt(long index, float value) { maxDepth(this.segment(), index, value); return this; }

    }
}
