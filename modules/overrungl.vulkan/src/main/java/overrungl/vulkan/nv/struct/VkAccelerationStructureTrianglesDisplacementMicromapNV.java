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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### displacementBiasAndScaleFormat
/// [VarHandle][#VH_displacementBiasAndScaleFormat] - [Getter][#displacementBiasAndScaleFormat()] - [Setter][#displacementBiasAndScaleFormat(int)]
/// ### displacementVectorFormat
/// [VarHandle][#VH_displacementVectorFormat] - [Getter][#displacementVectorFormat()] - [Setter][#displacementVectorFormat(int)]
/// ### displacementBiasAndScaleBuffer
/// [Byte offset][#OFFSET_displacementBiasAndScaleBuffer] - [Memory layout][#ML_displacementBiasAndScaleBuffer] - [Getter][#displacementBiasAndScaleBuffer()] - [Setter][#displacementBiasAndScaleBuffer(MemorySegment)]
/// ### displacementBiasAndScaleStride
/// [VarHandle][#VH_displacementBiasAndScaleStride] - [Getter][#displacementBiasAndScaleStride()] - [Setter][#displacementBiasAndScaleStride(long)]
/// ### displacementVectorBuffer
/// [Byte offset][#OFFSET_displacementVectorBuffer] - [Memory layout][#ML_displacementVectorBuffer] - [Getter][#displacementVectorBuffer()] - [Setter][#displacementVectorBuffer(MemorySegment)]
/// ### displacementVectorStride
/// [VarHandle][#VH_displacementVectorStride] - [Getter][#displacementVectorStride()] - [Setter][#displacementVectorStride(long)]
/// ### displacedMicromapPrimitiveFlags
/// [Byte offset][#OFFSET_displacedMicromapPrimitiveFlags] - [Memory layout][#ML_displacedMicromapPrimitiveFlags] - [Getter][#displacedMicromapPrimitiveFlags()] - [Setter][#displacedMicromapPrimitiveFlags(MemorySegment)]
/// ### displacedMicromapPrimitiveFlagsStride
/// [VarHandle][#VH_displacedMicromapPrimitiveFlagsStride] - [Getter][#displacedMicromapPrimitiveFlagsStride()] - [Setter][#displacedMicromapPrimitiveFlagsStride(long)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ### indexBuffer
/// [Byte offset][#OFFSET_indexBuffer] - [Memory layout][#ML_indexBuffer] - [Getter][#indexBuffer()] - [Setter][#indexBuffer(MemorySegment)]
/// ### indexStride
/// [VarHandle][#VH_indexStride] - [Getter][#indexStride()] - [Setter][#indexStride(long)]
/// ### baseTriangle
/// [VarHandle][#VH_baseTriangle] - [Getter][#baseTriangle()] - [Setter][#baseTriangle(int)]
/// ### usageCountsCount
/// [VarHandle][#VH_usageCountsCount] - [Getter][#usageCountsCount()] - [Setter][#usageCountsCount(int)]
/// ### pUsageCounts
/// [VarHandle][#VH_pUsageCounts] - [Getter][#pUsageCounts()] - [Setter][#pUsageCounts(MemorySegment)]
/// ### ppUsageCounts
/// [VarHandle][#VH_ppUsageCounts] - [Getter][#ppUsageCounts()] - [Setter][#ppUsageCounts(MemorySegment)]
/// ### micromap
/// [VarHandle][#VH_micromap] - [Getter][#micromap()] - [Setter][#micromap(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureTrianglesDisplacementMicromapNV {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat displacementBiasAndScaleFormat;
///     VkFormat displacementVectorFormat;
///     VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer;
///     VkDeviceSize displacementBiasAndScaleStride;
///     VkDeviceOrHostAddressConstKHR displacementVectorBuffer;
///     VkDeviceSize displacementVectorStride;
///     VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags;
///     VkDeviceSize displacedMicromapPrimitiveFlagsStride;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexBuffer;
///     VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT * pUsageCounts;
///     const VkMicromapUsageEXT * const* ppUsageCounts;
///     VkMicromapEXT micromap;
/// } VkAccelerationStructureTrianglesDisplacementMicromapNV;
/// ```
public sealed class VkAccelerationStructureTrianglesDisplacementMicromapNV extends Struct {
    /// The struct layout of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementBiasAndScaleFormat"),
        ValueLayout.JAVA_INT.withName("displacementVectorFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementBiasAndScaleBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementBiasAndScaleStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementVectorBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementVectorStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacedMicromapPrimitiveFlags"),
        ValueLayout.JAVA_LONG.withName("displacedMicromapPrimitiveFlagsStride"),
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `displacementBiasAndScaleFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_displacementBiasAndScaleFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleFormat"));
    /// The [VarHandle] of `displacementVectorFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_displacementVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorFormat"));
    /// The byte offset of `displacementBiasAndScaleBuffer`.
    public static final long OFFSET_displacementBiasAndScaleBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    /// The memory layout of `displacementBiasAndScaleBuffer`.
    public static final MemoryLayout ML_displacementBiasAndScaleBuffer = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    /// The [VarHandle] of `displacementBiasAndScaleStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_displacementBiasAndScaleStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleStride"));
    /// The byte offset of `displacementVectorBuffer`.
    public static final long OFFSET_displacementVectorBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorBuffer"));
    /// The memory layout of `displacementVectorBuffer`.
    public static final MemoryLayout ML_displacementVectorBuffer = LAYOUT.select(PathElement.groupElement("displacementVectorBuffer"));
    /// The [VarHandle] of `displacementVectorStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_displacementVectorStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorStride"));
    /// The byte offset of `displacedMicromapPrimitiveFlags`.
    public static final long OFFSET_displacedMicromapPrimitiveFlags = LAYOUT.byteOffset(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    /// The memory layout of `displacedMicromapPrimitiveFlags`.
    public static final MemoryLayout ML_displacedMicromapPrimitiveFlags = LAYOUT.select(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    /// The [VarHandle] of `displacedMicromapPrimitiveFlagsStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_displacedMicromapPrimitiveFlagsStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
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
    /// The [VarHandle] of `pUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    /// The [VarHandle] of `ppUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureTrianglesDisplacementMicromapNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureTrianglesDisplacementMicromapNV`
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkFormat") int displacementBiasAndScaleFormat, @CType("VkFormat") int displacementVectorFormat, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementBiasAndScaleBuffer, @CType("VkDeviceSize") long displacementBiasAndScaleStride, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementVectorBuffer, @CType("VkDeviceSize") long displacementVectorStride, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacedMicromapPrimitiveFlags, @CType("VkDeviceSize") long displacedMicromapPrimitiveFlagsStride, @CType("VkIndexType") int indexType, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexBuffer, @CType("VkDeviceSize") long indexStride, @CType("uint32_t") int baseTriangle, @CType("uint32_t") int usageCountsCount, @CType("const VkMicromapUsageEXT *") MemorySegment pUsageCounts, @CType("const VkMicromapUsageEXT * const*") MemorySegment ppUsageCounts, @CType("VkMicromapEXT") MemorySegment micromap) { return alloc(allocator).sType(sType).pNext(pNext).displacementBiasAndScaleFormat(displacementBiasAndScaleFormat).displacementVectorFormat(displacementVectorFormat).displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer).displacementBiasAndScaleStride(displacementBiasAndScaleStride).displacementVectorBuffer(displacementVectorBuffer).displacementVectorStride(displacementVectorStride).displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags).displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride).indexType(indexType).indexBuffer(indexBuffer).indexStride(indexStride).baseTriangle(baseTriangle).usageCountsCount(usageCountsCount).pUsageCounts(pUsageCounts).ppUsageCounts(ppUsageCounts).micromap(micromap); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV copyFrom(VkAccelerationStructureTrianglesDisplacementMicromapNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType(@CType("VkStructureType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(@CType("void *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pNext(this.segment(), value); return this; }

    /// {@return `displacementBiasAndScaleFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_displacementBiasAndScaleFormat(MemorySegment segment, long index) { return (int) VH_displacementBiasAndScaleFormat.get(segment, 0L, index); }
    /// {@return `displacementBiasAndScaleFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_displacementBiasAndScaleFormat(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleFormat(segment, 0L); }
    /// {@return `displacementBiasAndScaleFormat`}
    public @CType("VkFormat") int displacementBiasAndScaleFormat() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleFormat(this.segment()); }
    /// Sets `displacementBiasAndScaleFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementBiasAndScaleFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_displacementBiasAndScaleFormat.set(segment, 0L, index, value); }
    /// Sets `displacementBiasAndScaleFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementBiasAndScaleFormat(MemorySegment segment, @CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleFormat(segment, 0L, value); }
    /// Sets `displacementBiasAndScaleFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(@CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleFormat(this.segment(), value); return this; }

    /// {@return `displacementVectorFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_displacementVectorFormat(MemorySegment segment, long index) { return (int) VH_displacementVectorFormat.get(segment, 0L, index); }
    /// {@return `displacementVectorFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_displacementVectorFormat(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorFormat(segment, 0L); }
    /// {@return `displacementVectorFormat`}
    public @CType("VkFormat") int displacementVectorFormat() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorFormat(this.segment()); }
    /// Sets `displacementVectorFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementVectorFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_displacementVectorFormat.set(segment, 0L, index, value); }
    /// Sets `displacementVectorFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementVectorFormat(MemorySegment segment, @CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorFormat(segment, 0L, value); }
    /// Sets `displacementVectorFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(@CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorFormat(this.segment(), value); return this; }

    /// {@return `displacementBiasAndScaleBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacementBiasAndScaleBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacementBiasAndScaleBuffer, index), ML_displacementBiasAndScaleBuffer); }
    /// {@return `displacementBiasAndScaleBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacementBiasAndScaleBuffer(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleBuffer(segment, 0L); }
    /// {@return `displacementBiasAndScaleBuffer`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementBiasAndScaleBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleBuffer(this.segment()); }
    /// Sets `displacementBiasAndScaleBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementBiasAndScaleBuffer(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacementBiasAndScaleBuffer, index), ML_displacementBiasAndScaleBuffer.byteSize()); }
    /// Sets `displacementBiasAndScaleBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementBiasAndScaleBuffer(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleBuffer(segment, 0L, value); }
    /// Sets `displacementBiasAndScaleBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleBuffer(this.segment(), value); return this; }

    /// {@return `displacementBiasAndScaleStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_displacementBiasAndScaleStride(MemorySegment segment, long index) { return (long) VH_displacementBiasAndScaleStride.get(segment, 0L, index); }
    /// {@return `displacementBiasAndScaleStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_displacementBiasAndScaleStride(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleStride(segment, 0L); }
    /// {@return `displacementBiasAndScaleStride`}
    public @CType("VkDeviceSize") long displacementBiasAndScaleStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleStride(this.segment()); }
    /// Sets `displacementBiasAndScaleStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementBiasAndScaleStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_displacementBiasAndScaleStride.set(segment, 0L, index, value); }
    /// Sets `displacementBiasAndScaleStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementBiasAndScaleStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleStride(segment, 0L, value); }
    /// Sets `displacementBiasAndScaleStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleStride(this.segment(), value); return this; }

    /// {@return `displacementVectorBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacementVectorBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacementVectorBuffer, index), ML_displacementVectorBuffer); }
    /// {@return `displacementVectorBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacementVectorBuffer(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorBuffer(segment, 0L); }
    /// {@return `displacementVectorBuffer`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementVectorBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorBuffer(this.segment()); }
    /// Sets `displacementVectorBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementVectorBuffer(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacementVectorBuffer, index), ML_displacementVectorBuffer.byteSize()); }
    /// Sets `displacementVectorBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementVectorBuffer(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorBuffer(segment, 0L, value); }
    /// Sets `displacementVectorBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorBuffer(this.segment(), value); return this; }

    /// {@return `displacementVectorStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_displacementVectorStride(MemorySegment segment, long index) { return (long) VH_displacementVectorStride.get(segment, 0L, index); }
    /// {@return `displacementVectorStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_displacementVectorStride(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorStride(segment, 0L); }
    /// {@return `displacementVectorStride`}
    public @CType("VkDeviceSize") long displacementVectorStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorStride(this.segment()); }
    /// Sets `displacementVectorStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementVectorStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_displacementVectorStride.set(segment, 0L, index, value); }
    /// Sets `displacementVectorStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementVectorStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorStride(segment, 0L, value); }
    /// Sets `displacementVectorStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorStride(this.segment(), value); return this; }

    /// {@return `displacedMicromapPrimitiveFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacedMicromapPrimitiveFlags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlags, index), ML_displacedMicromapPrimitiveFlags); }
    /// {@return `displacedMicromapPrimitiveFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_displacedMicromapPrimitiveFlags(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlags(segment, 0L); }
    /// {@return `displacedMicromapPrimitiveFlags`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacedMicromapPrimitiveFlags() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlags(this.segment()); }
    /// Sets `displacedMicromapPrimitiveFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacedMicromapPrimitiveFlags(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlags, index), ML_displacedMicromapPrimitiveFlags.byteSize()); }
    /// Sets `displacedMicromapPrimitiveFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacedMicromapPrimitiveFlags(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlags(segment, 0L, value); }
    /// Sets `displacedMicromapPrimitiveFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlags(this.segment(), value); return this; }

    /// {@return `displacedMicromapPrimitiveFlagsStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_displacedMicromapPrimitiveFlagsStride(MemorySegment segment, long index) { return (long) VH_displacedMicromapPrimitiveFlagsStride.get(segment, 0L, index); }
    /// {@return `displacedMicromapPrimitiveFlagsStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_displacedMicromapPrimitiveFlagsStride(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlagsStride(segment, 0L); }
    /// {@return `displacedMicromapPrimitiveFlagsStride`}
    public @CType("VkDeviceSize") long displacedMicromapPrimitiveFlagsStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlagsStride(this.segment()); }
    /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacedMicromapPrimitiveFlagsStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_displacedMicromapPrimitiveFlagsStride.set(segment, 0L, index, value); }
    /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacedMicromapPrimitiveFlagsStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlagsStride(segment, 0L, value); }
    /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlagsStride(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexType(segment, 0L); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(@CType("VkIndexType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexType(this.segment(), value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_indexBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), ML_indexBuffer); }
    /// {@return `indexBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_indexBuffer(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexBuffer(segment, 0L); }
    /// {@return `indexBuffer`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexBuffer(this.segment()); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexBuffer(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexBuffer, index), ML_indexBuffer.byteSize()); }
    /// Sets `indexBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexBuffer(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexBuffer(segment, 0L, value); }
    /// Sets `indexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexBuffer(this.segment(), value); return this; }

    /// {@return `indexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indexStride(MemorySegment segment, long index) { return (long) VH_indexStride.get(segment, 0L, index); }
    /// {@return `indexStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indexStride(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexStride(segment, 0L); }
    /// {@return `indexStride`}
    public @CType("VkDeviceSize") long indexStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexStride(this.segment()); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indexStride.set(segment, 0L, index, value); }
    /// Sets `indexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexStride(segment, 0L, value); }
    /// Sets `indexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexStride(this.segment(), value); return this; }

    /// {@return `baseTriangle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseTriangle(MemorySegment segment, long index) { return (int) VH_baseTriangle.get(segment, 0L, index); }
    /// {@return `baseTriangle`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseTriangle(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_baseTriangle(segment, 0L); }
    /// {@return `baseTriangle`}
    public @CType("uint32_t") int baseTriangle() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_baseTriangle(this.segment()); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseTriangle(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseTriangle.set(segment, 0L, index, value); }
    /// Sets `baseTriangle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseTriangle(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_baseTriangle(segment, 0L, value); }
    /// Sets `baseTriangle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(@CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_baseTriangle(this.segment(), value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment, long index) { return (int) VH_usageCountsCount.get(segment, 0L, index); }
    /// {@return `usageCountsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_usageCountsCount(segment, 0L); }
    /// {@return `usageCountsCount`}
    public @CType("uint32_t") int usageCountsCount() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_usageCountsCount(this.segment()); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_usageCountsCount.set(segment, 0L, index, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_usageCountsCount(segment, 0L, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(@CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_usageCountsCount(this.segment(), value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT *") MemorySegment get_pUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_pUsageCounts.get(segment, 0L, index); }
    /// {@return `pUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT *") MemorySegment get_pUsageCounts(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pUsageCounts(segment, 0L); }
    /// {@return `pUsageCounts`}
    public @CType("const VkMicromapUsageEXT *") MemorySegment pUsageCounts() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pUsageCounts(this.segment()); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT *") MemorySegment value) { VH_pUsageCounts.set(segment, 0L, index, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pUsageCounts(segment, 0L, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(@CType("const VkMicromapUsageEXT *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pUsageCounts(this.segment(), value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT * const*") MemorySegment get_ppUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_ppUsageCounts.get(segment, 0L, index); }
    /// {@return `ppUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT * const*") MemorySegment get_ppUsageCounts(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_ppUsageCounts(segment, 0L); }
    /// {@return `ppUsageCounts`}
    public @CType("const VkMicromapUsageEXT * const*") MemorySegment ppUsageCounts() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_ppUsageCounts(this.segment()); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT * const*") MemorySegment value) { VH_ppUsageCounts.set(segment, 0L, index, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT * const*") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_ppUsageCounts(segment, 0L, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(@CType("const VkMicromapUsageEXT * const*") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_ppUsageCounts(this.segment(), value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") MemorySegment get_micromap(MemorySegment segment, long index) { return (MemorySegment) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") MemorySegment get_micromap(MemorySegment segment) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_micromap(segment, 0L); }
    /// {@return `micromap`}
    public @CType("VkMicromapEXT") MemorySegment micromap() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_micromap(this.segment()); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, long index, @CType("VkMicromapEXT") MemorySegment value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, @CType("VkMicromapEXT") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_micromap(segment, 0L, value); }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(@CType("VkMicromapEXT") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_micromap(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureTrianglesDisplacementMicromapNV].
    public static final class Buffer extends VkAccelerationStructureTrianglesDisplacementMicromapNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`
        public VkAccelerationStructureTrianglesDisplacementMicromapNV asSlice(long index) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureTrianglesDisplacementMicromapNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displacementBiasAndScaleFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int displacementBiasAndScaleFormatAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleFormat(this.segment(), index); }
        /// Sets `displacementBiasAndScaleFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleFormatAt(long index, @CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleFormat(this.segment(), index, value); return this; }

        /// {@return `displacementVectorFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int displacementVectorFormatAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorFormat(this.segment(), index); }
        /// Sets `displacementVectorFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorFormatAt(long index, @CType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorFormat(this.segment(), index, value); return this; }

        /// {@return `displacementBiasAndScaleBuffer` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementBiasAndScaleBufferAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleBuffer(this.segment(), index); }
        /// Sets `displacementBiasAndScaleBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleBufferAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleBuffer(this.segment(), index, value); return this; }

        /// {@return `displacementBiasAndScaleStride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long displacementBiasAndScaleStrideAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementBiasAndScaleStride(this.segment(), index); }
        /// Sets `displacementBiasAndScaleStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementBiasAndScaleStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementBiasAndScaleStride(this.segment(), index, value); return this; }

        /// {@return `displacementVectorBuffer` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacementVectorBufferAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorBuffer(this.segment(), index); }
        /// Sets `displacementVectorBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorBufferAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorBuffer(this.segment(), index, value); return this; }

        /// {@return `displacementVectorStride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long displacementVectorStrideAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacementVectorStride(this.segment(), index); }
        /// Sets `displacementVectorStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacementVectorStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacementVectorStride(this.segment(), index, value); return this; }

        /// {@return `displacedMicromapPrimitiveFlags` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment displacedMicromapPrimitiveFlagsAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlags(this.segment(), index); }
        /// Sets `displacedMicromapPrimitiveFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacedMicromapPrimitiveFlagsAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlags(this.segment(), index, value); return this; }

        /// {@return `displacedMicromapPrimitiveFlagsStride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long displacedMicromapPrimitiveFlagsStrideAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_displacedMicromapPrimitiveFlagsStride(this.segment(), index); }
        /// Sets `displacedMicromapPrimitiveFlagsStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displacedMicromapPrimitiveFlagsStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_displacedMicromapPrimitiveFlagsStride(this.segment(), index, value); return this; }

        /// {@return `indexType` at the given index}
        /// @param index the index
        public @CType("VkIndexType") int indexTypeAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexType(this.segment(), index); }
        /// Sets `indexType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeAt(long index, @CType("VkIndexType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexType(this.segment(), index, value); return this; }

        /// {@return `indexBuffer` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexBufferAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexBuffer(this.segment(), index); }
        /// Sets `indexBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexBufferAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexBuffer(this.segment(), index, value); return this; }

        /// {@return `indexStride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long indexStrideAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_indexStride(this.segment(), index); }
        /// Sets `indexStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_indexStride(this.segment(), index, value); return this; }

        /// {@return `baseTriangle` at the given index}
        /// @param index the index
        public @CType("uint32_t") int baseTriangleAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_baseTriangle(this.segment(), index); }
        /// Sets `baseTriangle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer baseTriangleAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_baseTriangle(this.segment(), index, value); return this; }

        /// {@return `usageCountsCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int usageCountsCountAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_usageCountsCount(this.segment(), index); }
        /// Sets `usageCountsCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer usageCountsCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_usageCountsCount(this.segment(), index, value); return this; }

        /// {@return `pUsageCounts` at the given index}
        /// @param index the index
        public @CType("const VkMicromapUsageEXT *") MemorySegment pUsageCountsAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_pUsageCounts(this.segment(), index); }
        /// Sets `pUsageCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUsageCountsAt(long index, @CType("const VkMicromapUsageEXT *") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_pUsageCounts(this.segment(), index, value); return this; }

        /// {@return `ppUsageCounts` at the given index}
        /// @param index the index
        public @CType("const VkMicromapUsageEXT * const*") MemorySegment ppUsageCountsAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_ppUsageCounts(this.segment(), index); }
        /// Sets `ppUsageCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ppUsageCountsAt(long index, @CType("const VkMicromapUsageEXT * const*") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_ppUsageCounts(this.segment(), index, value); return this; }

        /// {@return `micromap` at the given index}
        /// @param index the index
        public @CType("VkMicromapEXT") MemorySegment micromapAt(long index) { return VkAccelerationStructureTrianglesDisplacementMicromapNV.get_micromap(this.segment(), index); }
        /// Sets `micromap` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer micromapAt(long index, @CType("VkMicromapEXT") MemorySegment value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.set_micromap(this.segment(), index, value); return this; }

    }
}
