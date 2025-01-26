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
/// struct VkAabbPositionsKHR {
///     float minX;
///     float minY;
///     float minZ;
///     float maxX;
///     float maxY;
///     float maxZ;
/// };
/// ```
public sealed class VkAabbPositionsKHR extends GroupType {
    /// The struct layout of `VkAabbPositionsKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );
    /// The byte offset of `minX`.
    public static final long OFFSET_minX = LAYOUT.byteOffset(PathElement.groupElement("minX"));
    /// The memory layout of `minX`.
    public static final MemoryLayout LAYOUT_minX = LAYOUT.select(PathElement.groupElement("minX"));
    /// The [VarHandle] of `minX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minX"));
    /// The byte offset of `minY`.
    public static final long OFFSET_minY = LAYOUT.byteOffset(PathElement.groupElement("minY"));
    /// The memory layout of `minY`.
    public static final MemoryLayout LAYOUT_minY = LAYOUT.select(PathElement.groupElement("minY"));
    /// The [VarHandle] of `minY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minY"));
    /// The byte offset of `minZ`.
    public static final long OFFSET_minZ = LAYOUT.byteOffset(PathElement.groupElement("minZ"));
    /// The memory layout of `minZ`.
    public static final MemoryLayout LAYOUT_minZ = LAYOUT.select(PathElement.groupElement("minZ"));
    /// The [VarHandle] of `minZ` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minZ"));
    /// The byte offset of `maxX`.
    public static final long OFFSET_maxX = LAYOUT.byteOffset(PathElement.groupElement("maxX"));
    /// The memory layout of `maxX`.
    public static final MemoryLayout LAYOUT_maxX = LAYOUT.select(PathElement.groupElement("maxX"));
    /// The [VarHandle] of `maxX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxX"));
    /// The byte offset of `maxY`.
    public static final long OFFSET_maxY = LAYOUT.byteOffset(PathElement.groupElement("maxY"));
    /// The memory layout of `maxY`.
    public static final MemoryLayout LAYOUT_maxY = LAYOUT.select(PathElement.groupElement("maxY"));
    /// The [VarHandle] of `maxY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxY"));
    /// The byte offset of `maxZ`.
    public static final long OFFSET_maxZ = LAYOUT.byteOffset(PathElement.groupElement("maxZ"));
    /// The memory layout of `maxZ`.
    public static final MemoryLayout LAYOUT_maxZ = LAYOUT.select(PathElement.groupElement("maxZ"));
    /// The [VarHandle] of `maxZ` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxZ"));

    /// Creates `VkAabbPositionsKHR` with the given segment.
    /// @param segment the memory segment
    public VkAabbPositionsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAabbPositionsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAabbPositionsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAabbPositionsKHR`
    public static VkAabbPositionsKHR alloc(SegmentAllocator allocator) { return new VkAabbPositionsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAabbPositionsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAabbPositionsKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAabbPositionsKHR copyFrom(VkAabbPositionsKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `minX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minX(MemorySegment segment, long index) { return (float) VH_minX.get(segment, 0L, index); }
    /// {@return `minX`}
    public float minX() { return minX(this.segment(), 0L); }
    /// Sets `minX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minX(MemorySegment segment, long index, float value) { VH_minX.set(segment, 0L, index, value); }
    /// Sets `minX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minX(float value) { minX(this.segment(), 0L, value); return this; }

    /// {@return `minY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minY(MemorySegment segment, long index) { return (float) VH_minY.get(segment, 0L, index); }
    /// {@return `minY`}
    public float minY() { return minY(this.segment(), 0L); }
    /// Sets `minY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minY(MemorySegment segment, long index, float value) { VH_minY.set(segment, 0L, index, value); }
    /// Sets `minY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minY(float value) { minY(this.segment(), 0L, value); return this; }

    /// {@return `minZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minZ(MemorySegment segment, long index) { return (float) VH_minZ.get(segment, 0L, index); }
    /// {@return `minZ`}
    public float minZ() { return minZ(this.segment(), 0L); }
    /// Sets `minZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minZ(MemorySegment segment, long index, float value) { VH_minZ.set(segment, 0L, index, value); }
    /// Sets `minZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minZ(float value) { minZ(this.segment(), 0L, value); return this; }

    /// {@return `maxX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxX(MemorySegment segment, long index) { return (float) VH_maxX.get(segment, 0L, index); }
    /// {@return `maxX`}
    public float maxX() { return maxX(this.segment(), 0L); }
    /// Sets `maxX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxX(MemorySegment segment, long index, float value) { VH_maxX.set(segment, 0L, index, value); }
    /// Sets `maxX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxX(float value) { maxX(this.segment(), 0L, value); return this; }

    /// {@return `maxY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxY(MemorySegment segment, long index) { return (float) VH_maxY.get(segment, 0L, index); }
    /// {@return `maxY`}
    public float maxY() { return maxY(this.segment(), 0L); }
    /// Sets `maxY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxY(MemorySegment segment, long index, float value) { VH_maxY.set(segment, 0L, index, value); }
    /// Sets `maxY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxY(float value) { maxY(this.segment(), 0L, value); return this; }

    /// {@return `maxZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxZ(MemorySegment segment, long index) { return (float) VH_maxZ.get(segment, 0L, index); }
    /// {@return `maxZ`}
    public float maxZ() { return maxZ(this.segment(), 0L); }
    /// Sets `maxZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxZ(MemorySegment segment, long index, float value) { VH_maxZ.set(segment, 0L, index, value); }
    /// Sets `maxZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxZ(float value) { maxZ(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAabbPositionsKHR].
    public static final class Buffer extends VkAabbPositionsKHR {
        private final long elementCount;

        /// Creates `VkAabbPositionsKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAabbPositionsKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAabbPositionsKHR`
        public VkAabbPositionsKHR asSlice(long index) { return new VkAabbPositionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAabbPositionsKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAabbPositionsKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `minX` at the given index}
        /// @param index the index of the struct buffer
        public float minXAt(long index) { return minX(this.segment(), index); }
        /// Sets `minX` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minXAt(long index, float value) { minX(this.segment(), index, value); return this; }

        /// {@return `minY` at the given index}
        /// @param index the index of the struct buffer
        public float minYAt(long index) { return minY(this.segment(), index); }
        /// Sets `minY` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minYAt(long index, float value) { minY(this.segment(), index, value); return this; }

        /// {@return `minZ` at the given index}
        /// @param index the index of the struct buffer
        public float minZAt(long index) { return minZ(this.segment(), index); }
        /// Sets `minZ` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minZAt(long index, float value) { minZ(this.segment(), index, value); return this; }

        /// {@return `maxX` at the given index}
        /// @param index the index of the struct buffer
        public float maxXAt(long index) { return maxX(this.segment(), index); }
        /// Sets `maxX` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxXAt(long index, float value) { maxX(this.segment(), index, value); return this; }

        /// {@return `maxY` at the given index}
        /// @param index the index of the struct buffer
        public float maxYAt(long index) { return maxY(this.segment(), index); }
        /// Sets `maxY` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxYAt(long index, float value) { maxY(this.segment(), index, value); return this; }

        /// {@return `maxZ` at the given index}
        /// @param index the index of the struct buffer
        public float maxZAt(long index) { return maxZ(this.segment(), index); }
        /// Sets `maxZ` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxZAt(long index, float value) { maxZ(this.segment(), index, value); return this; }

    }
}
