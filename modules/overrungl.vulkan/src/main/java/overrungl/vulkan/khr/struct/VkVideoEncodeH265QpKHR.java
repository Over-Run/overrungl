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
/// struct VkVideoEncodeH265QpKHR {
///     int32_t qpI;
///     int32_t qpP;
///     int32_t qpB;
/// };
/// ```
public sealed class VkVideoEncodeH265QpKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265QpKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    /// The byte offset of `qpI`.
    public static final long OFFSET_qpI = LAYOUT.byteOffset(PathElement.groupElement("qpI"));
    /// The memory layout of `qpI`.
    public static final MemoryLayout LAYOUT_qpI = LAYOUT.select(PathElement.groupElement("qpI"));
    /// The [VarHandle] of `qpI` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpI"));
    /// The byte offset of `qpP`.
    public static final long OFFSET_qpP = LAYOUT.byteOffset(PathElement.groupElement("qpP"));
    /// The memory layout of `qpP`.
    public static final MemoryLayout LAYOUT_qpP = LAYOUT.select(PathElement.groupElement("qpP"));
    /// The [VarHandle] of `qpP` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpP"));
    /// The byte offset of `qpB`.
    public static final long OFFSET_qpB = LAYOUT.byteOffset(PathElement.groupElement("qpB"));
    /// The memory layout of `qpB`.
    public static final MemoryLayout LAYOUT_qpB = LAYOUT.select(PathElement.groupElement("qpB"));
    /// The [VarHandle] of `qpB` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpB"));

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265QpKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QpKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265QpKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QpKHR`
    public static VkVideoEncodeH265QpKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QpKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265QpKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QpKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265QpKHR copyFrom(VkVideoEncodeH265QpKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `qpI` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int qpI(MemorySegment segment, long index) { return (int) VH_qpI.get(segment, 0L, index); }
    /// {@return `qpI`}
    public int qpI() { return qpI(this.segment(), 0L); }
    /// Sets `qpI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qpI(MemorySegment segment, long index, int value) { VH_qpI.set(segment, 0L, index, value); }
    /// Sets `qpI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpI(int value) { qpI(this.segment(), 0L, value); return this; }

    /// {@return `qpP` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int qpP(MemorySegment segment, long index) { return (int) VH_qpP.get(segment, 0L, index); }
    /// {@return `qpP`}
    public int qpP() { return qpP(this.segment(), 0L); }
    /// Sets `qpP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qpP(MemorySegment segment, long index, int value) { VH_qpP.set(segment, 0L, index, value); }
    /// Sets `qpP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpP(int value) { qpP(this.segment(), 0L, value); return this; }

    /// {@return `qpB` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int qpB(MemorySegment segment, long index) { return (int) VH_qpB.get(segment, 0L, index); }
    /// {@return `qpB`}
    public int qpB() { return qpB(this.segment(), 0L); }
    /// Sets `qpB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qpB(MemorySegment segment, long index, int value) { VH_qpB.set(segment, 0L, index, value); }
    /// Sets `qpB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpB(int value) { qpB(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH265QpKHR].
    public static final class Buffer extends VkVideoEncodeH265QpKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265QpKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265QpKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265QpKHR`
        public VkVideoEncodeH265QpKHR asSlice(long index) { return new VkVideoEncodeH265QpKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265QpKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265QpKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `qpI` at the given index}
        /// @param index the index of the struct buffer
        public int qpIAt(long index) { return qpI(this.segment(), index); }
        /// Sets `qpI` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qpIAt(long index, int value) { qpI(this.segment(), index, value); return this; }

        /// {@return `qpP` at the given index}
        /// @param index the index of the struct buffer
        public int qpPAt(long index) { return qpP(this.segment(), index); }
        /// Sets `qpP` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qpPAt(long index, int value) { qpP(this.segment(), index, value); return this; }

        /// {@return `qpB` at the given index}
        /// @param index the index of the struct buffer
        public int qpBAt(long index) { return qpB(this.segment(), index); }
        /// Sets `qpB` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qpBAt(long index, int value) { qpB(this.segment(), index, value); return this; }

    }
}
