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
package overrungl.vulkan.khr.struct;

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
/// ### vertexFormat
/// [VarHandle][#VH_vertexFormat] - [Getter][#vertexFormat()] - [Setter][#vertexFormat(int)]
/// ### vertexData
/// [Byte offset][#OFFSET_vertexData] - [Memory layout][#ML_vertexData] - [Getter][#vertexData()] - [Setter][#vertexData(MemorySegment)]
/// ### vertexStride
/// [VarHandle][#VH_vertexStride] - [Getter][#vertexStride()] - [Setter][#vertexStride(long)]
/// ### maxVertex
/// [VarHandle][#VH_maxVertex] - [Getter][#maxVertex()] - [Setter][#maxVertex(int)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ### indexData
/// [Byte offset][#OFFSET_indexData] - [Memory layout][#ML_indexData] - [Getter][#indexData()] - [Setter][#indexData(MemorySegment)]
/// ### transformData
/// [Byte offset][#OFFSET_transformData] - [Memory layout][#ML_transformData] - [Getter][#transformData()] - [Setter][#transformData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureGeometryTrianglesDataKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkFormat vertexFormat;
///     VkDeviceOrHostAddressConstKHR vertexData;
///     VkDeviceSize vertexStride;
///     uint32_t maxVertex;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexData;
///     VkDeviceOrHostAddressConstKHR transformData;
/// } VkAccelerationStructureGeometryTrianglesDataKHR;
/// ```
public sealed class VkAccelerationStructureGeometryTrianglesDataKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureGeometryTrianglesDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vertexFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    /// The byte offset of `vertexData`.
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    /// The memory layout of `vertexData`.
    public static final MemoryLayout ML_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    /// The [VarHandle] of `vertexStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    /// The [VarHandle] of `maxVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertex"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexData`.
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    /// The memory layout of `indexData`.
    public static final MemoryLayout ML_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    /// The byte offset of `transformData`.
    public static final long OFFSET_transformData = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
    /// The memory layout of `transformData`.
    public static final MemoryLayout ML_transformData = LAYOUT.select(PathElement.groupElement("transformData"));

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryTrianglesDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkFormat") int vertexFormat, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment vertexData, @CType("VkDeviceSize") long vertexStride, @CType("uint32_t") int maxVertex, @CType("VkIndexType") int indexType, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexData, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment transformData) { return alloc(allocator).sType(sType).pNext(pNext).vertexFormat(vertexFormat).vertexData(vertexData).vertexStride(vertexStride).maxVertex(maxVertex).indexType(indexType).indexData(indexData).transformData(transformData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR copyFrom(VkAccelerationStructureGeometryTrianglesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(@CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment, long index) { return (int) VH_vertexFormat.get(segment, 0L, index); }
    /// {@return `vertexFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexFormat(segment, 0L); }
    /// {@return `vertexFormat`}
    public @CType("VkFormat") int vertexFormat() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexFormat(this.segment()); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_vertexFormat.set(segment, 0L, index, value); }
    /// Sets `vertexFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexFormat(MemorySegment segment, @CType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexFormat(segment, 0L, value); }
    /// Sets `vertexFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(@CType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexFormat(this.segment(), value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_vertexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_vertexData, index), ML_vertexData); }
    /// {@return `vertexData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_vertexData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(segment, 0L); }
    /// {@return `vertexData`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment vertexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(this.segment()); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_vertexData, index), ML_vertexData.byteSize()); }
    /// Sets `vertexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(segment, 0L, value); }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(this.segment(), value); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment, long index) { return (long) VH_vertexStride.get(segment, 0L, index); }
    /// {@return `vertexStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexStride(segment, 0L); }
    /// {@return `vertexStride`}
    public @CType("VkDeviceSize") long vertexStride() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexStride(this.segment()); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_vertexStride.set(segment, 0L, index, value); }
    /// Sets `vertexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexStride(segment, 0L, value); }
    /// Sets `vertexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(@CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexStride(this.segment(), value); return this; }

    /// {@return `maxVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertex(MemorySegment segment, long index) { return (int) VH_maxVertex.get(segment, 0L, index); }
    /// {@return `maxVertex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertex(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_maxVertex(segment, 0L); }
    /// {@return `maxVertex`}
    public @CType("uint32_t") int maxVertex() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_maxVertex(this.segment()); }
    /// Sets `maxVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertex.set(segment, 0L, index, value); }
    /// Sets `maxVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertex(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_maxVertex(segment, 0L, value); }
    /// Sets `maxVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(@CType("uint32_t") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_maxVertex(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexType(segment, 0L); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(@CType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexType(this.segment(), value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_indexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexData, index), ML_indexData); }
    /// {@return `indexData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_indexData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(segment, 0L); }
    /// {@return `indexData`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(this.segment()); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexData, index), ML_indexData.byteSize()); }
    /// Sets `indexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(segment, 0L, value); }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(this.segment(), value); return this; }

    /// {@return `transformData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_transformData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformData, index), ML_transformData); }
    /// {@return `transformData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_transformData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(segment, 0L); }
    /// {@return `transformData`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment transformData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(this.segment()); }
    /// Sets `transformData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformData, index), ML_transformData.byteSize()); }
    /// Sets `transformData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(segment, 0L, value); }
    /// Sets `transformData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureGeometryTrianglesDataKHR].
    public static final class Buffer extends VkAccelerationStructureGeometryTrianglesDataKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureGeometryTrianglesDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureGeometryTrianglesDataKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureGeometryTrianglesDataKHR`
        public VkAccelerationStructureGeometryTrianglesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureGeometryTrianglesDataKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureGeometryTrianglesDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `vertexFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int vertexFormatAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexFormat(this.segment(), index); }
        /// Sets `vertexFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexFormatAt(long index, @CType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexFormat(this.segment(), index, value); return this; }

        /// {@return `vertexData` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment vertexDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(this.segment(), index); }
        /// Sets `vertexData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(this.segment(), index, value); return this; }

        /// {@return `vertexStride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long vertexStrideAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexStride(this.segment(), index); }
        /// Sets `vertexStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexStride(this.segment(), index, value); return this; }

        /// {@return `maxVertex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_maxVertex(this.segment(), index); }
        /// Sets `maxVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_maxVertex(this.segment(), index, value); return this; }

        /// {@return `indexType` at the given index}
        /// @param index the index
        public @CType("VkIndexType") int indexTypeAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexType(this.segment(), index); }
        /// Sets `indexType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeAt(long index, @CType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexType(this.segment(), index, value); return this; }

        /// {@return `indexData` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment indexDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(this.segment(), index); }
        /// Sets `indexData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(this.segment(), index, value); return this; }

        /// {@return `transformData` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment transformDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(this.segment(), index); }
        /// Sets `transformData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(this.segment(), index, value); return this; }

    }
}
