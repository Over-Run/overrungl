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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDepthClampRangeEXT {
///     float minDepthClamp;
///     float maxDepthClamp;
/// };
/// ```
public sealed class VkDepthClampRangeEXT extends GroupType {
    /// The struct layout of `VkDepthClampRangeEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minDepthClamp"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthClamp")
    );
    /// The byte offset of `minDepthClamp`.
    public static final long OFFSET_minDepthClamp = LAYOUT.byteOffset(PathElement.groupElement("minDepthClamp"));
    /// The memory layout of `minDepthClamp`.
    public static final MemoryLayout LAYOUT_minDepthClamp = LAYOUT.select(PathElement.groupElement("minDepthClamp"));
    /// The [VarHandle] of `minDepthClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthClamp"));
    /// The byte offset of `maxDepthClamp`.
    public static final long OFFSET_maxDepthClamp = LAYOUT.byteOffset(PathElement.groupElement("maxDepthClamp"));
    /// The memory layout of `maxDepthClamp`.
    public static final MemoryLayout LAYOUT_maxDepthClamp = LAYOUT.select(PathElement.groupElement("maxDepthClamp"));
    /// The [VarHandle] of `maxDepthClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthClamp"));

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    /// @param segment the memory segment
    public VkDepthClampRangeEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthClampRangeEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDepthClampRangeEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthClampRangeEXT`
    public static VkDepthClampRangeEXT alloc(SegmentAllocator allocator) { return new VkDepthClampRangeEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDepthClampRangeEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthClampRangeEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDepthClampRangeEXT copyFrom(VkDepthClampRangeEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `minDepthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minDepthClamp(MemorySegment segment, long index) { return (float) VH_minDepthClamp.get(segment, 0L, index); }
    /// {@return `minDepthClamp`}
    public float minDepthClamp() { return minDepthClamp(this.segment(), 0L); }
    /// Sets `minDepthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minDepthClamp(MemorySegment segment, long index, float value) { VH_minDepthClamp.set(segment, 0L, index, value); }
    /// Sets `minDepthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT minDepthClamp(float value) { minDepthClamp(this.segment(), 0L, value); return this; }

    /// {@return `maxDepthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxDepthClamp(MemorySegment segment, long index) { return (float) VH_maxDepthClamp.get(segment, 0L, index); }
    /// {@return `maxDepthClamp`}
    public float maxDepthClamp() { return maxDepthClamp(this.segment(), 0L); }
    /// Sets `maxDepthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDepthClamp(MemorySegment segment, long index, float value) { VH_maxDepthClamp.set(segment, 0L, index, value); }
    /// Sets `maxDepthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT maxDepthClamp(float value) { maxDepthClamp(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDepthClampRangeEXT].
    public static final class Buffer extends VkDepthClampRangeEXT {
        private final long elementCount;

        /// Creates `VkDepthClampRangeEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDepthClampRangeEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDepthClampRangeEXT`
        public VkDepthClampRangeEXT asSlice(long index) { return new VkDepthClampRangeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDepthClampRangeEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDepthClampRangeEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `minDepthClamp` at the given index}
        /// @param index the index of the struct buffer
        public float minDepthClampAt(long index) { return minDepthClamp(this.segment(), index); }
        /// Sets `minDepthClamp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minDepthClampAt(long index, float value) { minDepthClamp(this.segment(), index, value); return this; }

        /// {@return `maxDepthClamp` at the given index}
        /// @param index the index of the struct buffer
        public float maxDepthClampAt(long index) { return maxDepthClamp(this.segment(), index); }
        /// Sets `maxDepthClamp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDepthClampAt(long index, float value) { maxDepthClamp(this.segment(), index, value); return this; }

    }
}
