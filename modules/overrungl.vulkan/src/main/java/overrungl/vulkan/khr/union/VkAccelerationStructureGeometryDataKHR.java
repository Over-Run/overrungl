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
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### triangles
/// [Byte offset][#OFFSET_triangles] - [Memory layout][#ML_triangles] - [Getter][#triangles()] - [Setter][#triangles(java.lang.foreign.MemorySegment)]
/// ### aabbs
/// [Byte offset][#OFFSET_aabbs] - [Memory layout][#ML_aabbs] - [Getter][#aabbs()] - [Setter][#aabbs(java.lang.foreign.MemorySegment)]
/// ### instances
/// [Byte offset][#OFFSET_instances] - [Memory layout][#ML_instances] - [Getter][#instances()] - [Setter][#instances(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkAccelerationStructureGeometryDataKHR {
///     VkAccelerationStructureGeometryTrianglesDataKHR triangles;
///     VkAccelerationStructureGeometryAabbsDataKHR aabbs;
///     VkAccelerationStructureGeometryInstancesDataKHR instances;
/// } VkAccelerationStructureGeometryDataKHR;
/// ```
public final class VkAccelerationStructureGeometryDataKHR extends Union {
    /// The union layout of `VkAccelerationStructureGeometryDataKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );
    /// The byte offset of `triangles`.
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    /// The memory layout of `triangles`.
    public static final MemoryLayout ML_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    /// The byte offset of `aabbs`.
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    /// The memory layout of `aabbs`.
    public static final MemoryLayout ML_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));
    /// The byte offset of `instances`.
    public static final long OFFSET_instances = LAYOUT.byteOffset(PathElement.groupElement("instances"));
    /// The memory layout of `instances`.
    public static final MemoryLayout ML_instances = LAYOUT.select(PathElement.groupElement("instances"));

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureGeometryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryDataKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureGeometryDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryDataKHR`
    public static VkAccelerationStructureGeometryDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryDataKHR`
    public static VkAccelerationStructureGeometryDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryDataKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureGeometryDataKHR`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkAccelerationStructureGeometryDataKHR`
    public VkAccelerationStructureGeometryDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureGeometryDataKHR`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureGeometryDataKHR`
    public VkAccelerationStructureGeometryDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `triangles` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment get_triangles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangles, index), ML_triangles); }
    /// {@return `triangles`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment get_triangles(MemorySegment segment) { return VkAccelerationStructureGeometryDataKHR.get_triangles(segment, 0L); }
    /// {@return `triangles` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment trianglesAt(long index) { return VkAccelerationStructureGeometryDataKHR.get_triangles(this.segment(), index); }
    /// {@return `triangles`}
    public @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment triangles() { return VkAccelerationStructureGeometryDataKHR.get_triangles(this.segment()); }
    /// Sets `triangles` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_triangles(MemorySegment segment, long index, @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangles, index), ML_triangles.byteSize()); }
    /// Sets `triangles` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_triangles(MemorySegment segment, @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_triangles(segment, 0L, value); }
    /// Sets `triangles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR trianglesAt(long index, @CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_triangles(this.segment(), index, value); return this; }
    /// Sets `triangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR triangles(@CType("VkAccelerationStructureGeometryTrianglesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_triangles(this.segment(), value); return this; }

    /// {@return `aabbs` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment get_aabbs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_aabbs, index), ML_aabbs); }
    /// {@return `aabbs`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment get_aabbs(MemorySegment segment) { return VkAccelerationStructureGeometryDataKHR.get_aabbs(segment, 0L); }
    /// {@return `aabbs` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment aabbsAt(long index) { return VkAccelerationStructureGeometryDataKHR.get_aabbs(this.segment(), index); }
    /// {@return `aabbs`}
    public @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment aabbs() { return VkAccelerationStructureGeometryDataKHR.get_aabbs(this.segment()); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_aabbs(MemorySegment segment, long index, @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_aabbs, index), ML_aabbs.byteSize()); }
    /// Sets `aabbs` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_aabbs(MemorySegment segment, @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_aabbs(segment, 0L, value); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR aabbsAt(long index, @CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_aabbs(this.segment(), index, value); return this; }
    /// Sets `aabbs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR aabbs(@CType("VkAccelerationStructureGeometryAabbsDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_aabbs(this.segment(), value); return this; }

    /// {@return `instances` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment get_instances(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_instances, index), ML_instances); }
    /// {@return `instances`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment get_instances(MemorySegment segment) { return VkAccelerationStructureGeometryDataKHR.get_instances(segment, 0L); }
    /// {@return `instances` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment instancesAt(long index) { return VkAccelerationStructureGeometryDataKHR.get_instances(this.segment(), index); }
    /// {@return `instances`}
    public @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment instances() { return VkAccelerationStructureGeometryDataKHR.get_instances(this.segment()); }
    /// Sets `instances` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_instances(MemorySegment segment, long index, @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_instances, index), ML_instances.byteSize()); }
    /// Sets `instances` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_instances(MemorySegment segment, @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_instances(segment, 0L, value); }
    /// Sets `instances` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR instancesAt(long index, @CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_instances(this.segment(), index, value); return this; }
    /// Sets `instances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryDataKHR instances(@CType("VkAccelerationStructureGeometryInstancesDataKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryDataKHR.set_instances(this.segment(), value); return this; }

}
