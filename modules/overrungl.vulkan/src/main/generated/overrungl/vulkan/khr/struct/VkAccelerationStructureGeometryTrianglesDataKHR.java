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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryTrianglesDataKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkFormat vertexFormat;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR vertexData;
///     (uint64_t) VkDeviceSize vertexStride;
///     uint32_t maxVertex;
///     (int) VkIndexType indexType;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR indexData;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR transformData;
/// };
/// ```
public final class VkAccelerationStructureGeometryTrianglesDataKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureGeometryTrianglesDataKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("maxVertex"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `vertexFormat`.
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    /// The memory layout of `vertexFormat`.
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    /// The [VarHandle] of `vertexFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    /// The byte offset of `vertexData`.
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    /// The memory layout of `vertexData`.
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    /// The byte offset of `vertexStride`.
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    /// The memory layout of `vertexStride`.
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    /// The [VarHandle] of `vertexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    /// The byte offset of `maxVertex`.
    public static final long OFFSET_maxVertex = LAYOUT.byteOffset(PathElement.groupElement("maxVertex"));
    /// The memory layout of `maxVertex`.
    public static final MemoryLayout LAYOUT_maxVertex = LAYOUT.select(PathElement.groupElement("maxVertex"));
    /// The [VarHandle] of `maxVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertex"));
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexData`.
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    /// The memory layout of `indexData`.
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    /// The byte offset of `transformData`.
    public static final long OFFSET_transformData = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
    /// The memory layout of `transformData`.
    public static final MemoryLayout LAYOUT_transformData = LAYOUT.select(PathElement.groupElement("transformData"));

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryTrianglesDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @param vertexStride `vertexStride`
    /// @param maxVertex `maxVertex`
    /// @param indexType `indexType`
    /// @param indexData `indexData`
    /// @param transformData `transformData`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData, long vertexStride, int maxVertex, int indexType, MemorySegment indexData, MemorySegment transformData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride).maxVertex(maxVertex).indexType(indexType).indexData(indexData).transformData(transformData);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @param vertexStride `vertexStride`
    /// @param maxVertex `maxVertex`
    /// @param indexType `indexType`
    /// @param indexData `indexData`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData, long vertexStride, int maxVertex, int indexType, MemorySegment indexData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride).maxVertex(maxVertex).indexType(indexType).indexData(indexData);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @param vertexStride `vertexStride`
    /// @param maxVertex `maxVertex`
    /// @param indexType `indexType`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData, long vertexStride, int maxVertex, int indexType) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride).maxVertex(maxVertex).indexType(indexType);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @param vertexStride `vertexStride`
    /// @param maxVertex `maxVertex`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData, long vertexStride, int maxVertex) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride).maxVertex(maxVertex);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @param vertexStride `vertexStride`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData, long vertexStride) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @param vertexData `vertexData`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat, MemorySegment vertexData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexFormat `vertexFormat`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR copyFrom(VkAccelerationStructureGeometryTrianglesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureGeometryTrianglesDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexFormat(MemorySegment segment, long index) { return (int) VH_vertexFormat.get(segment, 0L, index); }
    /// {@return `vertexFormat`}
    public int vertexFormat() { return vertexFormat(this.segment(), 0L); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexFormat(MemorySegment segment, long index, int value) { VH_vertexFormat.set(segment, 0L, index, value); }
    /// Sets `vertexFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(int value) { vertexFormat(this.segment(), 0L, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vertexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    /// {@return `vertexData`}
    public MemorySegment vertexData() { return vertexData(this.segment(), 0L); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData.byteSize()); }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(MemorySegment value) { vertexData(this.segment(), 0L, value); return this; }
    /// Accepts `vertexData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(vertexData())); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vertexStride(MemorySegment segment, long index) { return (long) VH_vertexStride.get(segment, 0L, index); }
    /// {@return `vertexStride`}
    public long vertexStride() { return vertexStride(this.segment(), 0L); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexStride(MemorySegment segment, long index, long value) { VH_vertexStride.set(segment, 0L, index, value); }
    /// Sets `vertexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(long value) { vertexStride(this.segment(), 0L, value); return this; }

    /// {@return `maxVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertex(MemorySegment segment, long index) { return (int) VH_maxVertex.get(segment, 0L, index); }
    /// {@return `maxVertex`}
    public int maxVertex() { return maxVertex(this.segment(), 0L); }
    /// Sets `maxVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertex(MemorySegment segment, long index, int value) { VH_maxVertex.set(segment, 0L, index, value); }
    /// Sets `maxVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(int value) { maxVertex(this.segment(), 0L, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    public int indexType() { return indexType(this.segment(), 0L); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexType(MemorySegment segment, long index, int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment indexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    /// {@return `indexData`}
    public MemorySegment indexData() { return indexData(this.segment(), 0L); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData.byteSize()); }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(MemorySegment value) { indexData(this.segment(), 0L, value); return this; }
    /// Accepts `indexData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexData())); return this; }

    /// {@return `transformData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transformData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformData, index), LAYOUT_transformData); }
    /// {@return `transformData`}
    public MemorySegment transformData() { return transformData(this.segment(), 0L); }
    /// Sets `transformData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformData, index), LAYOUT_transformData.byteSize()); }
    /// Sets `transformData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(MemorySegment value) { transformData(this.segment(), 0L, value); return this; }
    /// Accepts `transformData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(transformData())); return this; }

    /// Creates a slice of `VkAccelerationStructureGeometryTrianglesDataKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureGeometryTrianglesDataKHR`
    public VkAccelerationStructureGeometryTrianglesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureGeometryTrianglesDataKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureGeometryTrianglesDataKHR`
    public VkAccelerationStructureGeometryTrianglesDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureGeometryTrianglesDataKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR at(long index, Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param index the index of the struct buffer
    public int vertexFormatAt(long index) { return vertexFormat(this.segment(), index); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormatAt(long index, int value) { vertexFormat(this.segment(), index, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vertexDataAt(long index) { return vertexData(this.segment(), index); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexDataAt(long index, MemorySegment value) { vertexData(this.segment(), index, value); return this; }
    /// Accepts `vertexData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(vertexDataAt(index))); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param index the index of the struct buffer
    public long vertexStrideAt(long index) { return vertexStride(this.segment(), index); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStrideAt(long index, long value) { vertexStride(this.segment(), index, value); return this; }

    /// {@return `maxVertex` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexAt(long index) { return maxVertex(this.segment(), index); }
    /// Sets `maxVertex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertexAt(long index, int value) { maxVertex(this.segment(), index, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeAt(long index) { return indexType(this.segment(), index); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment indexDataAt(long index) { return indexData(this.segment(), index); }
    /// Sets `indexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexDataAt(long index, MemorySegment value) { indexData(this.segment(), index, value); return this; }
    /// Accepts `indexData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexDataAt(index))); return this; }

    /// {@return `transformData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment transformDataAt(long index) { return transformData(this.segment(), index); }
    /// Sets `transformData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformDataAt(long index, MemorySegment value) { transformData(this.segment(), index, value); return this; }
    /// Accepts `transformData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(transformDataAt(index))); return this; }

}
