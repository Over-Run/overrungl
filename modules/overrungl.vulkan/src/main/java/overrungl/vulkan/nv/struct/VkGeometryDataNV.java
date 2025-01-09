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
package overrungl.vulkan.nv.struct;

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
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeometryDataNV {
///     VkGeometryTrianglesNV triangles;
///     VkGeometryAABBNV aabbs;
/// } VkGeometryDataNV;
/// ```
public final class VkGeometryDataNV extends Struct {
    /// The struct layout of `VkGeometryDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.nv.struct.VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
        overrungl.vulkan.nv.struct.VkGeometryAABBNV.LAYOUT.withName("aabbs")
    );
    /// The byte offset of `triangles`.
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    /// The memory layout of `triangles`.
    public static final MemoryLayout ML_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    /// The byte offset of `aabbs`.
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    /// The memory layout of `aabbs`.
    public static final MemoryLayout ML_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));

    /// Creates `VkGeometryDataNV` with the given segment.
    /// @param segment the memory segment
    public VkGeometryDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeometryDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryDataNV(segment); }

    /// Creates `VkGeometryDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeometryDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryDataNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkGeometryDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryDataNV`
    public static VkGeometryDataNV alloc(SegmentAllocator allocator) { return new VkGeometryDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeometryDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryDataNV`
    public static VkGeometryDataNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryDataNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkGeometryDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeometryDataNV`
    public VkGeometryDataNV asSlice(long index) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkGeometryDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeometryDataNV`
    public VkGeometryDataNV asSlice(long index, long count) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `triangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment get_triangles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangles, index), ML_triangles); }
    /// {@return `triangles`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment get_triangles(MemorySegment segment) { return VkGeometryDataNV.get_triangles(segment, 0L); }
    /// {@return `triangles` at the given index}
    /// @param index the index
    public @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment trianglesAt(long index) { return VkGeometryDataNV.get_triangles(this.segment(), index); }
    /// {@return `triangles`}
    public @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment triangles() { return VkGeometryDataNV.get_triangles(this.segment()); }
    /// Sets `triangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_triangles(MemorySegment segment, long index, @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangles, index), ML_triangles.byteSize()); }
    /// Sets `triangles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_triangles(MemorySegment segment, @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_triangles(segment, 0L, value); }
    /// Sets `triangles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV trianglesAt(long index, @CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_triangles(this.segment(), index, value); return this; }
    /// Sets `triangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV triangles(@CType("VkGeometryTrianglesNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_triangles(this.segment(), value); return this; }

    /// {@return `aabbs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment get_aabbs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_aabbs, index), ML_aabbs); }
    /// {@return `aabbs`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment get_aabbs(MemorySegment segment) { return VkGeometryDataNV.get_aabbs(segment, 0L); }
    /// {@return `aabbs` at the given index}
    /// @param index the index
    public @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment aabbsAt(long index) { return VkGeometryDataNV.get_aabbs(this.segment(), index); }
    /// {@return `aabbs`}
    public @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment aabbs() { return VkGeometryDataNV.get_aabbs(this.segment()); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aabbs(MemorySegment segment, long index, @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_aabbs, index), ML_aabbs.byteSize()); }
    /// Sets `aabbs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aabbs(MemorySegment segment, @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_aabbs(segment, 0L, value); }
    /// Sets `aabbs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV aabbsAt(long index, @CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_aabbs(this.segment(), index, value); return this; }
    /// Sets `aabbs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryDataNV aabbs(@CType("VkGeometryAABBNV") java.lang.foreign.MemorySegment value) { VkGeometryDataNV.set_aabbs(this.segment(), value); return this; }

}
