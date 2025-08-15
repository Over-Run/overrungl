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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureGetTemplateIndicesInfoNV {
///     (uint64_t) VkDeviceAddress clusterTemplateAddress;
/// };
/// ```
public final class VkClusterAccelerationStructureGetTemplateIndicesInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("clusterTemplateAddress")
    );
    /// The byte offset of `clusterTemplateAddress`.
    public static final long OFFSET_clusterTemplateAddress = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateAddress"));
    /// The memory layout of `clusterTemplateAddress`.
    public static final MemoryLayout LAYOUT_clusterTemplateAddress = LAYOUT.select(PathElement.groupElement("clusterTemplateAddress"));
    /// The [VarHandle] of `clusterTemplateAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterTemplateAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateAddress"));

    /// Creates `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV copyFrom(VkClusterAccelerationStructureGetTemplateIndicesInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `clusterTemplateAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long clusterTemplateAddress(MemorySegment segment, long index) { return (long) VH_clusterTemplateAddress.get(segment, 0L, index); }
    /// {@return `clusterTemplateAddress`}
    public long clusterTemplateAddress() { return clusterTemplateAddress(this.segment(), 0L); }
    /// Sets `clusterTemplateAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterTemplateAddress(MemorySegment segment, long index, long value) { VH_clusterTemplateAddress.set(segment, 0L, index, value); }
    /// Sets `clusterTemplateAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddress(long value) { clusterTemplateAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV asSlice(long index) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureGetTemplateIndicesInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV at(long index, Consumer<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `clusterTemplateAddress` at the given index}
    /// @param index the index of the struct buffer
    public long clusterTemplateAddressAt(long index) { return clusterTemplateAddress(this.segment(), index); }
    /// Sets `clusterTemplateAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddressAt(long index, long value) { clusterTemplateAddress(this.segment(), index, value); return this; }

}
