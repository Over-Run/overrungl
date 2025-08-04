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
/// struct VkClusterAccelerationStructureMoveObjectsInfoNV {
///     (uint64_t) VkDeviceAddress srcAccelerationStructure;
/// };
/// ```
public final class VkClusterAccelerationStructureMoveObjectsInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureMoveObjectsInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructure")
    );
    /// The byte offset of `srcAccelerationStructure`.
    public static final long OFFSET_srcAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
    /// The memory layout of `srcAccelerationStructure`.
    public static final MemoryLayout LAYOUT_srcAccelerationStructure = LAYOUT.select(PathElement.groupElement("srcAccelerationStructure"));
    /// The [VarHandle] of `srcAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructure"));

    /// Creates `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureMoveObjectsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureMoveObjectsInfoNV`
    public static VkClusterAccelerationStructureMoveObjectsInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureMoveObjectsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureMoveObjectsInfoNV`
    public static VkClusterAccelerationStructureMoveObjectsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInfoNV copyFrom(VkClusterAccelerationStructureMoveObjectsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureMoveObjectsInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccelerationStructure(MemorySegment segment, long index) { return (long) VH_srcAccelerationStructure.get(segment, 0L, index); }
    /// {@return `srcAccelerationStructure`}
    public long srcAccelerationStructure() { return srcAccelerationStructure(this.segment(), 0L); }
    /// Sets `srcAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccelerationStructure(MemorySegment segment, long index, long value) { VH_srcAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `srcAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructure(long value) { srcAccelerationStructure(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureMoveObjectsInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureMoveObjectsInfoNV`
    public VkClusterAccelerationStructureMoveObjectsInfoNV asSlice(long index) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureMoveObjectsInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureMoveObjectsInfoNV`
    public VkClusterAccelerationStructureMoveObjectsInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureMoveObjectsInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInfoNV at(long index, Consumer<VkClusterAccelerationStructureMoveObjectsInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcAccelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public long srcAccelerationStructureAt(long index) { return srcAccelerationStructure(this.segment(), index); }
    /// Sets `srcAccelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructureAt(long index, long value) { srcAccelerationStructure(this.segment(), index, value); return this; }

}
