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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkGeometryDataNV {
///     (struct VkGeometryTrianglesNV) VkGeometryTrianglesNV triangles;
///     (struct VkGeometryAABBNV) VkGeometryAABBNV aabbs;
/// };
/// ```
public final class VkGeometryDataNV extends GroupType {
    /// The struct layout of `VkGeometryDataNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.nv.struct.VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
        overrungl.vulkan.nv.struct.VkGeometryAABBNV.LAYOUT.withName("aabbs")
    );
    /// The byte offset of `triangles`.
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    /// The memory layout of `triangles`.
    public static final MemoryLayout LAYOUT_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    /// The byte offset of `aabbs`.
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    /// The memory layout of `aabbs`.
    public static final MemoryLayout LAYOUT_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));

    /// Creates `VkGeometryDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeometryDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeometryDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeometryDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeometryDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeometryDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryDataNV`
    public static VkGeometryDataNV alloc(SegmentAllocator allocator) { return new VkGeometryDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeometryDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryDataNV`
    public static VkGeometryDataNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeometryDataNV copyFrom(VkGeometryDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeometryDataNV reinterpret(long count) { return new VkGeometryDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `triangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment triangles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles); }
    /// {@return `triangles`}
    public MemorySegment triangles() { return triangles(this.segment(), 0L); }
    /// Sets `triangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void triangles(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles.byteSize()); }
    /// Sets `triangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV triangles(MemorySegment value) { triangles(this.segment(), 0L, value); return this; }
    /// Accepts `triangles` with the given function.
    /// @param func the function
    /// @return `this`
    public VkGeometryDataNV triangles(Consumer<overrungl.vulkan.nv.struct.VkGeometryTrianglesNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryTrianglesNV.of(triangles())); return this; }

    /// {@return `aabbs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment aabbs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs); }
    /// {@return `aabbs`}
    public MemorySegment aabbs() { return aabbs(this.segment(), 0L); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aabbs(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs.byteSize()); }
    /// Sets `aabbs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV aabbs(MemorySegment value) { aabbs(this.segment(), 0L, value); return this; }
    /// Accepts `aabbs` with the given function.
    /// @param func the function
    /// @return `this`
    public VkGeometryDataNV aabbs(Consumer<overrungl.vulkan.nv.struct.VkGeometryAABBNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryAABBNV.of(aabbs())); return this; }

    /// Creates a slice of `VkGeometryDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeometryDataNV`
    public VkGeometryDataNV asSlice(long index) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeometryDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeometryDataNV`
    public VkGeometryDataNV asSlice(long index, long count) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeometryDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeometryDataNV at(long index, Consumer<VkGeometryDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `triangles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment trianglesAt(long index) { return triangles(this.segment(), index); }
    /// Sets `triangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV trianglesAt(long index, MemorySegment value) { triangles(this.segment(), index, value); return this; }
    /// Accepts `triangles` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkGeometryDataNV trianglesAt(long index, Consumer<overrungl.vulkan.nv.struct.VkGeometryTrianglesNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryTrianglesNV.of(trianglesAt(index))); return this; }

    /// {@return `aabbs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment aabbsAt(long index) { return aabbs(this.segment(), index); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV aabbsAt(long index, MemorySegment value) { aabbs(this.segment(), index, value); return this; }
    /// Accepts `aabbs` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkGeometryDataNV aabbsAt(long index, Consumer<overrungl.vulkan.nv.struct.VkGeometryAABBNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryAABBNV.of(aabbsAt(index))); return this; }

}
