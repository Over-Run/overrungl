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
/// struct VkClusterAccelerationStructureInstantiateClusterInfoNV {
///     uint32_t clusterIdOffset;
///     uint32_t geometryIndexOffset : 24;
///     uint32_t reserved : 8;
///     (uint64_t) VkDeviceAddress clusterTemplateAddress;
///     (struct VkStridedDeviceAddressNV) VkStridedDeviceAddressNV vertexBuffer;
/// };
/// ```
public final class VkClusterAccelerationStructureInstantiateClusterInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureInstantiateClusterInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("clusterIdOffset"), -1,
        ValueLayout.JAVA_INT.withName("geometryIndexOffset"), 24,
        ValueLayout.JAVA_INT.withName("reserved"), 8,
        ValueLayout.JAVA_LONG.withName("clusterTemplateAddress"), -1,
        overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.LAYOUT.withName("vertexBuffer"), -1
    );
    /// The byte offset of `clusterIdOffset`.
    public static final long OFFSET_clusterIdOffset = LAYOUT.byteOffset(PathElement.groupElement("clusterIdOffset"));
    /// The memory layout of `clusterIdOffset`.
    public static final MemoryLayout LAYOUT_clusterIdOffset = LAYOUT.select(PathElement.groupElement("clusterIdOffset"));
    /// The [VarHandle] of `clusterIdOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterIdOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterIdOffset"));
    /// The byte offset of `clusterTemplateAddress`.
    public static final long OFFSET_clusterTemplateAddress = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateAddress"));
    /// The memory layout of `clusterTemplateAddress`.
    public static final MemoryLayout LAYOUT_clusterTemplateAddress = LAYOUT.select(PathElement.groupElement("clusterTemplateAddress"));
    /// The [VarHandle] of `clusterTemplateAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterTemplateAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateAddress"));
    /// The byte offset of `vertexBuffer`.
    public static final long OFFSET_vertexBuffer = LAYOUT.byteOffset(PathElement.groupElement("vertexBuffer"));
    /// The memory layout of `vertexBuffer`.
    public static final MemoryLayout LAYOUT_vertexBuffer = LAYOUT.select(PathElement.groupElement("vertexBuffer"));

    /// Creates `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureInstantiateClusterInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureInstantiateClusterInfoNV`
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureInstantiateClusterInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureInstantiateClusterInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureInstantiateClusterInfoNV`
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureInstantiateClusterInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV copyFrom(VkClusterAccelerationStructureInstantiateClusterInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureInstantiateClusterInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureInstantiateClusterInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `clusterIdOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterIdOffset(MemorySegment segment, long index) { return (int) VH_clusterIdOffset.get(segment, 0L, index); }
    /// {@return `clusterIdOffset`}
    public int clusterIdOffset() { return clusterIdOffset(this.segment(), 0L); }
    /// Sets `clusterIdOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterIdOffset(MemorySegment segment, long index, int value) { VH_clusterIdOffset.set(segment, 0L, index, value); }
    /// Sets `clusterIdOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffset(int value) { clusterIdOffset(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddress(long value) { clusterTemplateAddress(this.segment(), 0L, value); return this; }

    /// {@return `vertexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vertexBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_vertexBuffer, index), LAYOUT_vertexBuffer); }
    /// {@return `vertexBuffer`}
    public MemorySegment vertexBuffer() { return vertexBuffer(this.segment(), 0L); }
    /// Sets `vertexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBuffer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_vertexBuffer, index), LAYOUT_vertexBuffer.byteSize()); }
    /// Sets `vertexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(MemorySegment value) { vertexBuffer(this.segment(), 0L, value); return this; }
    /// Accepts `vertexBuffer` with the given function.
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(Consumer<overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV> func) { func.accept(overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.of(vertexBuffer())); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureInstantiateClusterInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureInstantiateClusterInfoNV`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV asSlice(long index) { return new VkClusterAccelerationStructureInstantiateClusterInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureInstantiateClusterInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureInstantiateClusterInfoNV`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureInstantiateClusterInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureInstantiateClusterInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV at(long index, Consumer<VkClusterAccelerationStructureInstantiateClusterInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `clusterIdOffset` at the given index}
    /// @param index the index of the struct buffer
    public int clusterIdOffsetAt(long index) { return clusterIdOffset(this.segment(), index); }
    /// Sets `clusterIdOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffsetAt(long index, int value) { clusterIdOffset(this.segment(), index, value); return this; }

    /// {@return `clusterTemplateAddress` at the given index}
    /// @param index the index of the struct buffer
    public long clusterTemplateAddressAt(long index) { return clusterTemplateAddress(this.segment(), index); }
    /// Sets `clusterTemplateAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddressAt(long index, long value) { clusterTemplateAddress(this.segment(), index, value); return this; }

    /// {@return `vertexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vertexBufferAt(long index) { return vertexBuffer(this.segment(), index); }
    /// Sets `vertexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBufferAt(long index, MemorySegment value) { vertexBuffer(this.segment(), index, value); return this; }
    /// Accepts `vertexBuffer` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBufferAt(long index, Consumer<overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV> func) { func.accept(overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.of(vertexBufferAt(index))); return this; }

}
