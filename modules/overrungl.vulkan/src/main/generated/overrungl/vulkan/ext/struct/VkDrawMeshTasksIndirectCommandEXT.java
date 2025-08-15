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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawMeshTasksIndirectCommandEXT`.
/// ## Layout
/// ```
/// struct VkDrawMeshTasksIndirectCommandEXT {
///     uint32_t groupCountX;
///     uint32_t groupCountY;
///     uint32_t groupCountZ;
/// };
/// ```
public final class VkDrawMeshTasksIndirectCommandEXT extends GroupType {
    /// The struct layout of `VkDrawMeshTasksIndirectCommandEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );
    /// The byte offset of `groupCountX`.
    public static final long OFFSET_groupCountX = LAYOUT.byteOffset(PathElement.groupElement("groupCountX"));
    /// The memory layout of `groupCountX`.
    public static final MemoryLayout LAYOUT_groupCountX = LAYOUT.select(PathElement.groupElement("groupCountX"));
    /// The [VarHandle] of `groupCountX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupCountX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountX"));
    /// The byte offset of `groupCountY`.
    public static final long OFFSET_groupCountY = LAYOUT.byteOffset(PathElement.groupElement("groupCountY"));
    /// The memory layout of `groupCountY`.
    public static final MemoryLayout LAYOUT_groupCountY = LAYOUT.select(PathElement.groupElement("groupCountY"));
    /// The [VarHandle] of `groupCountY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupCountY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountY"));
    /// The byte offset of `groupCountZ`.
    public static final long OFFSET_groupCountZ = LAYOUT.byteOffset(PathElement.groupElement("groupCountZ"));
    /// The memory layout of `groupCountZ`.
    public static final MemoryLayout LAYOUT_groupCountZ = LAYOUT.select(PathElement.groupElement("groupCountZ"));
    /// The [VarHandle] of `groupCountZ` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupCountZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountZ"));

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawMeshTasksIndirectCommandEXT`
    public static VkDrawMeshTasksIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawMeshTasksIndirectCommandEXT`
    public static VkDrawMeshTasksIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkDrawMeshTasksIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT copyFrom(VkDrawMeshTasksIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDrawMeshTasksIndirectCommandEXT reinterpret(long count) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `groupCountX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupCountX(MemorySegment segment, long index) { return (int) VH_groupCountX.get(segment, 0L, index); }
    /// {@return `groupCountX`}
    public int groupCountX() { return groupCountX(this.segment(), 0L); }
    /// Sets `groupCountX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupCountX(MemorySegment segment, long index, int value) { VH_groupCountX.set(segment, 0L, index, value); }
    /// Sets `groupCountX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(int value) { groupCountX(this.segment(), 0L, value); return this; }

    /// {@return `groupCountY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupCountY(MemorySegment segment, long index) { return (int) VH_groupCountY.get(segment, 0L, index); }
    /// {@return `groupCountY`}
    public int groupCountY() { return groupCountY(this.segment(), 0L); }
    /// Sets `groupCountY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupCountY(MemorySegment segment, long index, int value) { VH_groupCountY.set(segment, 0L, index, value); }
    /// Sets `groupCountY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(int value) { groupCountY(this.segment(), 0L, value); return this; }

    /// {@return `groupCountZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupCountZ(MemorySegment segment, long index) { return (int) VH_groupCountZ.get(segment, 0L, index); }
    /// {@return `groupCountZ`}
    public int groupCountZ() { return groupCountZ(this.segment(), 0L); }
    /// Sets `groupCountZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupCountZ(MemorySegment segment, long index, int value) { VH_groupCountZ.set(segment, 0L, index, value); }
    /// Sets `groupCountZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(int value) { groupCountZ(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawMeshTasksIndirectCommandEXT`
    public VkDrawMeshTasksIndirectCommandEXT asSlice(long index) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawMeshTasksIndirectCommandEXT`
    public VkDrawMeshTasksIndirectCommandEXT asSlice(long index, long count) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDrawMeshTasksIndirectCommandEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT at(long index, Consumer<VkDrawMeshTasksIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `groupCountX` at the given index}
    /// @param index the index of the struct buffer
    public int groupCountXAt(long index) { return groupCountX(this.segment(), index); }
    /// Sets `groupCountX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountXAt(long index, int value) { groupCountX(this.segment(), index, value); return this; }

    /// {@return `groupCountY` at the given index}
    /// @param index the index of the struct buffer
    public int groupCountYAt(long index) { return groupCountY(this.segment(), index); }
    /// Sets `groupCountY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountYAt(long index, int value) { groupCountY(this.segment(), index, value); return this; }

    /// {@return `groupCountZ` at the given index}
    /// @param index the index of the struct buffer
    public int groupCountZAt(long index) { return groupCountZ(this.segment(), index); }
    /// Sets `groupCountZ` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountZAt(long index, int value) { groupCountZ(this.segment(), index, value); return this; }

}
