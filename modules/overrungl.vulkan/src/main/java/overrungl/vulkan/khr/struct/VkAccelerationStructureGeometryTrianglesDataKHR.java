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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### vertexFormat
/// [VarHandle][#VH_vertexFormat] - [Getter][#vertexFormat()] - [Setter][#vertexFormat(int)]
/// ### vertexData
/// [Byte offset][#OFFSET_vertexData] - [Memory layout][#ML_vertexData] - [Getter][#vertexData()] - [Setter][#vertexData(java.lang.foreign.MemorySegment)]
/// ### vertexStride
/// [VarHandle][#VH_vertexStride] - [Getter][#vertexStride()] - [Setter][#vertexStride(long)]
/// ### maxVertex
/// [VarHandle][#VH_maxVertex] - [Getter][#maxVertex()] - [Setter][#maxVertex(int)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ### indexData
/// [Byte offset][#OFFSET_indexData] - [Memory layout][#ML_indexData] - [Getter][#indexData()] - [Setter][#indexData(java.lang.foreign.MemorySegment)]
/// ### transformData
/// [Byte offset][#OFFSET_transformData] - [Memory layout][#ML_transformData] - [Getter][#transformData()] - [Setter][#transformData(java.lang.foreign.MemorySegment)]
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
public final class VkAccelerationStructureGeometryTrianglesDataKHR extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
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
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryTrianglesDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryTrianglesDataKHR`
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment, long index) { return (int) VH_vertexFormat.get(segment, 0L, index); }
    /// {@return `vertexFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexFormat(segment, 0L); }
    /// {@return `vertexFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int vertexFormatAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexFormat(this.segment(), index); }
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
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormatAt(long index, @CType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexFormat(this.segment(), index, value); return this; }
    /// Sets `vertexFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(@CType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexFormat(this.segment(), value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_vertexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_vertexData, index), ML_vertexData); }
    /// {@return `vertexData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_vertexData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(segment, 0L); }
    /// {@return `vertexData` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment vertexDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(this.segment(), index); }
    /// {@return `vertexData`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment vertexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexData(this.segment()); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_vertexData, index), ML_vertexData.byteSize()); }
    /// Sets `vertexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(segment, 0L, value); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(this.segment(), index, value); return this; }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexData(this.segment(), value); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment, long index) { return (long) VH_vertexStride.get(segment, 0L, index); }
    /// {@return `vertexStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexStride(segment, 0L); }
    /// {@return `vertexStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long vertexStrideAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_vertexStride(this.segment(), index); }
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
    /// Sets `vertexStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStrideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_vertexStride(this.segment(), index, value); return this; }
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
    /// {@return `maxVertex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxVertexAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_maxVertex(this.segment(), index); }
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
    /// Sets `maxVertex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_maxVertex(this.segment(), index, value); return this; }
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
    /// {@return `indexType` at the given index}
    /// @param index the index
    public @CType("VkIndexType") int indexTypeAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexType(this.segment(), index); }
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
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexTypeAt(long index, @CType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexType(this.segment(), index, value); return this; }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(@CType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexType(this.segment(), value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_indexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexData, index), ML_indexData); }
    /// {@return `indexData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_indexData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(segment, 0L); }
    /// {@return `indexData` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment indexDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(this.segment(), index); }
    /// {@return `indexData`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment indexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_indexData(this.segment()); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexData, index), ML_indexData.byteSize()); }
    /// Sets `indexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(segment, 0L, value); }
    /// Sets `indexData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(this.segment(), index, value); return this; }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_indexData(this.segment(), value); return this; }

    /// {@return `transformData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_transformData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformData, index), ML_transformData); }
    /// {@return `transformData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_transformData(MemorySegment segment) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(segment, 0L); }
    /// {@return `transformData` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment transformDataAt(long index) { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(this.segment(), index); }
    /// {@return `transformData`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment transformData() { return VkAccelerationStructureGeometryTrianglesDataKHR.get_transformData(this.segment()); }
    /// Sets `transformData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformData, index), ML_transformData.byteSize()); }
    /// Sets `transformData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(segment, 0L, value); }
    /// Sets `transformData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformDataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(this.segment(), index, value); return this; }
    /// Sets `transformData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryTrianglesDataKHR.set_transformData(this.segment(), value); return this; }

}
