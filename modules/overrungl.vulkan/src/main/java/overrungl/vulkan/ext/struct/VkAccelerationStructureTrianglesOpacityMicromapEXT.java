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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ### indexBuffer
/// [Byte offset][#OFFSET_indexBuffer] - [Memory layout][#ML_indexBuffer] - [Getter][#indexBuffer()] - [Setter][#indexBuffer(java.lang.foreign.MemorySegment)]
/// ### indexStride
/// [VarHandle][#VH_indexStride] - [Getter][#indexStride()] - [Setter][#indexStride(long)]
/// ### baseTriangle
/// [VarHandle][#VH_baseTriangle] - [Getter][#baseTriangle()] - [Setter][#baseTriangle(int)]
/// ### usageCountsCount
/// [VarHandle][#VH_usageCountsCount] - [Getter][#usageCountsCount()] - [Setter][#usageCountsCount(int)]
/// ### pUsageCounts
/// [VarHandle][#VH_pUsageCounts] - [Getter][#pUsageCounts()] - [Setter][#pUsageCounts(java.lang.foreign.MemorySegment)]
/// ### ppUsageCounts
/// [VarHandle][#VH_ppUsageCounts] - [Getter][#ppUsageCounts()] - [Setter][#ppUsageCounts(java.lang.foreign.MemorySegment)]
/// ### micromap
/// [VarHandle][#VH_micromap] - [Getter][#micromap()] - [Setter][#micromap(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureTrianglesOpacityMicromapEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexBuffer;
///     VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT * pUsageCounts;
///     const VkMicromapUsageEXT * const* ppUsageCounts;
///     VkMicromapEXT micromap;
/// } VkAccelerationStructureTrianglesOpacityMicromapEXT;
/// ```
public final class VkAccelerationStructureTrianglesOpacityMicromapEXT extends Struct {
    /// The struct layout of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        ValueLayout.ADDRESS.withName("micromap")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexBuffer`.
    public static final long OFFSET_indexBuffer = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
    /// The memory layout of `indexBuffer`.
    public static final MemoryLayout ML_indexBuffer = LAYOUT.select(PathElement.groupElement("indexBuffer"));
    /// The [VarHandle] of `indexStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));
    /// The [VarHandle] of `baseTriangle` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseTriangle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseTriangle"));
    /// The [VarHandle] of `usageCountsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    /// The [VarHandle] of `pUsageCounts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    /// The [VarHandle] of `ppUsageCounts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureTrianglesOpacityMicromapEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(@CType("VkStructureType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexType(segment, 0L); }
    /// {@return `indexType` at the given index}
    /// @param index the index
    public @CType("VkIndexType") int indexTypeAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexType(this.segment(), index); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexTypeAt(long index, @CType("VkIndexType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexType(this.segment(), index, value); return this; }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(@CType("VkIndexType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexType(this.segment(), value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_indexBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), ML_indexBuffer); }
    /// {@return `indexBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_indexBuffer(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexBuffer(segment, 0L); }
    /// {@return `indexBuffer` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment indexBufferAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexBuffer(this.segment(), index); }
    /// {@return `indexBuffer`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment indexBuffer() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexBuffer(this.segment()); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexBuffer(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexBuffer, index), ML_indexBuffer.byteSize()); }
    /// Sets `indexBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexBuffer(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexBuffer(segment, 0L, value); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBufferAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexBuffer(this.segment(), index, value); return this; }
    /// Sets `indexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexBuffer(this.segment(), value); return this; }

    /// {@return `indexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indexStride(MemorySegment segment, long index) { return (long) VH_indexStride.get(segment, 0L, index); }
    /// {@return `indexStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indexStride(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexStride(segment, 0L); }
    /// {@return `indexStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long indexStrideAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexStride(this.segment(), index); }
    /// {@return `indexStride`}
    public @CType("VkDeviceSize") long indexStride() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_indexStride(this.segment()); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indexStride.set(segment, 0L, index, value); }
    /// Sets `indexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexStride(segment, 0L, value); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexStride(this.segment(), index, value); return this; }
    /// Sets `indexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_indexStride(this.segment(), value); return this; }

    /// {@return `baseTriangle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseTriangle(MemorySegment segment, long index) { return (int) VH_baseTriangle.get(segment, 0L, index); }
    /// {@return `baseTriangle`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseTriangle(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_baseTriangle(segment, 0L); }
    /// {@return `baseTriangle` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseTriangleAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_baseTriangle(this.segment(), index); }
    /// {@return `baseTriangle`}
    public @CType("uint32_t") int baseTriangle() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_baseTriangle(this.segment()); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseTriangle(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseTriangle.set(segment, 0L, index, value); }
    /// Sets `baseTriangle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseTriangle(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_baseTriangle(segment, 0L, value); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangleAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_baseTriangle(this.segment(), index, value); return this; }
    /// Sets `baseTriangle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(@CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_baseTriangle(this.segment(), value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment, long index) { return (int) VH_usageCountsCount.get(segment, 0L, index); }
    /// {@return `usageCountsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_usageCountsCount(segment, 0L); }
    /// {@return `usageCountsCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int usageCountsCountAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_usageCountsCount(this.segment(), index); }
    /// {@return `usageCountsCount`}
    public @CType("uint32_t") int usageCountsCount() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_usageCountsCount(this.segment()); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_usageCountsCount.set(segment, 0L, index, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_usageCountsCount(segment, 0L, value); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_usageCountsCount(this.segment(), index, value); return this; }
    /// Sets `usageCountsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(@CType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_usageCountsCount(this.segment(), value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment get_pUsageCounts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUsageCounts.get(segment, 0L, index); }
    /// {@return `pUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment get_pUsageCounts(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pUsageCounts(segment, 0L); }
    /// {@return `pUsageCounts` at the given index}
    /// @param index the index
    public @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment pUsageCountsAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pUsageCounts(this.segment(), index); }
    /// {@return `pUsageCounts`}
    public @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment pUsageCounts() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_pUsageCounts(this.segment()); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VH_pUsageCounts.set(segment, 0L, index, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pUsageCounts(segment, 0L, value); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCountsAt(long index, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pUsageCounts(this.segment(), index, value); return this; }
    /// Sets `pUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(@CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_pUsageCounts(this.segment(), value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment get_ppUsageCounts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppUsageCounts.get(segment, 0L, index); }
    /// {@return `ppUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment get_ppUsageCounts(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_ppUsageCounts(segment, 0L); }
    /// {@return `ppUsageCounts` at the given index}
    /// @param index the index
    public @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment ppUsageCountsAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_ppUsageCounts(this.segment(), index); }
    /// {@return `ppUsageCounts`}
    public @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment ppUsageCounts() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_ppUsageCounts(this.segment()); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VH_ppUsageCounts.set(segment, 0L, index, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_ppUsageCounts(segment, 0L, value); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCountsAt(long index, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_ppUsageCounts(this.segment(), index, value); return this; }
    /// Sets `ppUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(@CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_ppUsageCounts(this.segment(), value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_micromap(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_micromap(MemorySegment segment) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_micromap(segment, 0L); }
    /// {@return `micromap` at the given index}
    /// @param index the index
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment micromapAt(long index) { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_micromap(this.segment(), index); }
    /// {@return `micromap`}
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment micromap() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.get_micromap(this.segment()); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_micromap(segment, 0L, value); }
    /// Sets `micromap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromapAt(long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_micromap(this.segment(), index, value); return this; }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(@CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.set_micromap(this.segment(), value); return this; }

}
