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

/// ## Layout
/// ```
/// struct VkVideoEncodeH265FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// };
/// ```
public sealed class VkVideoEncodeH265FrameSizeKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265FrameSizeKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    /// The byte offset of `frameISize`.
    public static final long OFFSET_frameISize = LAYOUT.byteOffset(PathElement.groupElement("frameISize"));
    /// The memory layout of `frameISize`.
    public static final MemoryLayout LAYOUT_frameISize = LAYOUT.select(PathElement.groupElement("frameISize"));
    /// The [VarHandle] of `frameISize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameISize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameISize"));
    /// The byte offset of `framePSize`.
    public static final long OFFSET_framePSize = LAYOUT.byteOffset(PathElement.groupElement("framePSize"));
    /// The memory layout of `framePSize`.
    public static final MemoryLayout LAYOUT_framePSize = LAYOUT.select(PathElement.groupElement("framePSize"));
    /// The [VarHandle] of `framePSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framePSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framePSize"));
    /// The byte offset of `frameBSize`.
    public static final long OFFSET_frameBSize = LAYOUT.byteOffset(PathElement.groupElement("frameBSize"));
    /// The memory layout of `frameBSize`.
    public static final MemoryLayout LAYOUT_frameBSize = LAYOUT.select(PathElement.groupElement("frameBSize"));
    /// The [VarHandle] of `frameBSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameBSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameBSize"));

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265FrameSizeKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265FrameSizeKHR`
    public static VkVideoEncodeH265FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265FrameSizeKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265FrameSizeKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR copyFrom(VkVideoEncodeH265FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `frameISize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameISize(MemorySegment segment, long index) { return (int) VH_frameISize.get(segment, 0L, index); }
    /// {@return `frameISize`}
    public int frameISize() { return frameISize(this.segment(), 0L); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameISize(MemorySegment segment, long index, int value) { VH_frameISize.set(segment, 0L, index, value); }
    /// Sets `frameISize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameISize(int value) { frameISize(this.segment(), 0L, value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framePSize(MemorySegment segment, long index) { return (int) VH_framePSize.get(segment, 0L, index); }
    /// {@return `framePSize`}
    public int framePSize() { return framePSize(this.segment(), 0L); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framePSize(MemorySegment segment, long index, int value) { VH_framePSize.set(segment, 0L, index, value); }
    /// Sets `framePSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR framePSize(int value) { framePSize(this.segment(), 0L, value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameBSize(MemorySegment segment, long index) { return (int) VH_frameBSize.get(segment, 0L, index); }
    /// {@return `frameBSize`}
    public int frameBSize() { return frameBSize(this.segment(), 0L); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameBSize(MemorySegment segment, long index, int value) { VH_frameBSize.set(segment, 0L, index, value); }
    /// Sets `frameBSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameBSize(int value) { frameBSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH265FrameSizeKHR].
    public static final class Buffer extends VkVideoEncodeH265FrameSizeKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265FrameSizeKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265FrameSizeKHR`
        public VkVideoEncodeH265FrameSizeKHR asSlice(long index) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265FrameSizeKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `frameISize` at the given index}
        /// @param index the index of the struct buffer
        public int frameISizeAt(long index) { return frameISize(this.segment(), index); }
        /// Sets `frameISize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frameISizeAt(long index, int value) { frameISize(this.segment(), index, value); return this; }

        /// {@return `framePSize` at the given index}
        /// @param index the index of the struct buffer
        public int framePSizeAt(long index) { return framePSize(this.segment(), index); }
        /// Sets `framePSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer framePSizeAt(long index, int value) { framePSize(this.segment(), index, value); return this; }

        /// {@return `frameBSize` at the given index}
        /// @param index the index of the struct buffer
        public int frameBSizeAt(long index) { return frameBSize(this.segment(), index); }
        /// Sets `frameBSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frameBSizeAt(long index, int value) { frameBSize(this.segment(), index, value); return this; }

    }
}
