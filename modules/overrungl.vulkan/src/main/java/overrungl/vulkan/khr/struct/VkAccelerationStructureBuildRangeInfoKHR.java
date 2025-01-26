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
/// struct VkAccelerationStructureBuildRangeInfoKHR {
///     uint32_t primitiveCount;
///     uint32_t primitiveOffset;
///     uint32_t firstVertex;
///     uint32_t transformOffset;
/// };
/// ```
public sealed class VkAccelerationStructureBuildRangeInfoKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureBuildRangeInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("primitiveCount"),
        ValueLayout.JAVA_INT.withName("primitiveOffset"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("transformOffset")
    );
    /// The byte offset of `primitiveCount`.
    public static final long OFFSET_primitiveCount = LAYOUT.byteOffset(PathElement.groupElement("primitiveCount"));
    /// The memory layout of `primitiveCount`.
    public static final MemoryLayout LAYOUT_primitiveCount = LAYOUT.select(PathElement.groupElement("primitiveCount"));
    /// The [VarHandle] of `primitiveCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveCount"));
    /// The byte offset of `primitiveOffset`.
    public static final long OFFSET_primitiveOffset = LAYOUT.byteOffset(PathElement.groupElement("primitiveOffset"));
    /// The memory layout of `primitiveOffset`.
    public static final MemoryLayout LAYOUT_primitiveOffset = LAYOUT.select(PathElement.groupElement("primitiveOffset"));
    /// The [VarHandle] of `primitiveOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOffset"));
    /// The byte offset of `firstVertex`.
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    /// The memory layout of `firstVertex`.
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The byte offset of `transformOffset`.
    public static final long OFFSET_transformOffset = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
    /// The memory layout of `transformOffset`.
    public static final MemoryLayout LAYOUT_transformOffset = LAYOUT.select(PathElement.groupElement("transformOffset"));
    /// The [VarHandle] of `transformOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildRangeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR copyFrom(VkAccelerationStructureBuildRangeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `primitiveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveCount(MemorySegment segment, long index) { return (int) VH_primitiveCount.get(segment, 0L, index); }
    /// {@return `primitiveCount`}
    public int primitiveCount() { return primitiveCount(this.segment(), 0L); }
    /// Sets `primitiveCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveCount(MemorySegment segment, long index, int value) { VH_primitiveCount.set(segment, 0L, index, value); }
    /// Sets `primitiveCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(int value) { primitiveCount(this.segment(), 0L, value); return this; }

    /// {@return `primitiveOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveOffset(MemorySegment segment, long index) { return (int) VH_primitiveOffset.get(segment, 0L, index); }
    /// {@return `primitiveOffset`}
    public int primitiveOffset() { return primitiveOffset(this.segment(), 0L); }
    /// Sets `primitiveOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveOffset(MemorySegment segment, long index, int value) { VH_primitiveOffset.set(segment, 0L, index, value); }
    /// Sets `primitiveOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(int value) { primitiveOffset(this.segment(), 0L, value); return this; }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    public int firstVertex() { return firstVertex(this.segment(), 0L); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstVertex(MemorySegment segment, long index, int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(int value) { firstVertex(this.segment(), 0L, value); return this; }

    /// {@return `transformOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformOffset(MemorySegment segment, long index) { return (int) VH_transformOffset.get(segment, 0L, index); }
    /// {@return `transformOffset`}
    public int transformOffset() { return transformOffset(this.segment(), 0L); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformOffset(MemorySegment segment, long index, int value) { VH_transformOffset.set(segment, 0L, index, value); }
    /// Sets `transformOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(int value) { transformOffset(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureBuildRangeInfoKHR].
    public static final class Buffer extends VkAccelerationStructureBuildRangeInfoKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureBuildRangeInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureBuildRangeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureBuildRangeInfoKHR`
        public VkAccelerationStructureBuildRangeInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildRangeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureBuildRangeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureBuildRangeInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `primitiveCount` at the given index}
        /// @param index the index of the struct buffer
        public int primitiveCountAt(long index) { return primitiveCount(this.segment(), index); }
        /// Sets `primitiveCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primitiveCountAt(long index, int value) { primitiveCount(this.segment(), index, value); return this; }

        /// {@return `primitiveOffset` at the given index}
        /// @param index the index of the struct buffer
        public int primitiveOffsetAt(long index) { return primitiveOffset(this.segment(), index); }
        /// Sets `primitiveOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primitiveOffsetAt(long index, int value) { primitiveOffset(this.segment(), index, value); return this; }

        /// {@return `firstVertex` at the given index}
        /// @param index the index of the struct buffer
        public int firstVertexAt(long index) { return firstVertex(this.segment(), index); }
        /// Sets `firstVertex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstVertexAt(long index, int value) { firstVertex(this.segment(), index, value); return this; }

        /// {@return `transformOffset` at the given index}
        /// @param index the index of the struct buffer
        public int transformOffsetAt(long index) { return transformOffset(this.segment(), index); }
        /// Sets `transformOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transformOffsetAt(long index, int value) { transformOffset(this.segment(), index, value); return this; }

    }
}
