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
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkAccelerationStructureGeometryDataKHR {
///     VkAccelerationStructureGeometryTrianglesDataKHR triangles;
///     VkAccelerationStructureGeometryAabbsDataKHR aabbs;
///     VkAccelerationStructureGeometryInstancesDataKHR instances;
/// };
/// ```
public sealed class VkAccelerationStructureGeometryDataKHR extends GroupType {
    /// The union layout of `VkAccelerationStructureGeometryDataKHR`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );
    /// The byte offset of `triangles`.
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    /// The memory layout of `triangles`.
    public static final MemoryLayout LAYOUT_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    /// The byte offset of `aabbs`.
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    /// The memory layout of `aabbs`.
    public static final MemoryLayout LAYOUT_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));
    /// The byte offset of `instances`.
    public static final long OFFSET_instances = LAYOUT.byteOffset(PathElement.groupElement("instances"));
    /// The memory layout of `instances`.
    public static final MemoryLayout LAYOUT_instances = LAYOUT.select(PathElement.groupElement("instances"));

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureGeometryDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryDataKHR`
    public static VkAccelerationStructureGeometryDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR copyFrom(VkAccelerationStructureGeometryDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `triangles` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment triangles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles); }
    /// {@return `triangles`}
    public MemorySegment triangles() { return triangles(this.segment(), 0L); }
    /// Sets `triangles` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void triangles(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles.byteSize()); }
    /// Sets `triangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR triangles(MemorySegment value) { triangles(this.segment(), 0L, value); return this; }

    /// {@return `aabbs` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment aabbs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs); }
    /// {@return `aabbs`}
    public MemorySegment aabbs() { return aabbs(this.segment(), 0L); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void aabbs(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs.byteSize()); }
    /// Sets `aabbs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR aabbs(MemorySegment value) { aabbs(this.segment(), 0L, value); return this; }

    /// {@return `instances` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment instances(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_instances, index), LAYOUT_instances); }
    /// {@return `instances`}
    public MemorySegment instances() { return instances(this.segment(), 0L); }
    /// Sets `instances` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void instances(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_instances, index), LAYOUT_instances.byteSize()); }
    /// Sets `instances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR instances(MemorySegment value) { instances(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureGeometryDataKHR].
    public static final class Buffer extends VkAccelerationStructureGeometryDataKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureGeometryDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureGeometryDataKHR`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkAccelerationStructureGeometryDataKHR`
        public VkAccelerationStructureGeometryDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureGeometryDataKHR`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureGeometryDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `triangles` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment trianglesAt(long index) { return triangles(this.segment(), index); }
        /// Sets `triangles` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer trianglesAt(long index, MemorySegment value) { triangles(this.segment(), index, value); return this; }

        /// {@return `aabbs` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment aabbsAt(long index) { return aabbs(this.segment(), index); }
        /// Sets `aabbs` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer aabbsAt(long index, MemorySegment value) { aabbs(this.segment(), index, value); return this; }

        /// {@return `instances` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment instancesAt(long index) { return instances(this.segment(), index); }
        /// Sets `instances` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer instancesAt(long index, MemorySegment value) { instances(this.segment(), index, value); return this; }

    }
}
