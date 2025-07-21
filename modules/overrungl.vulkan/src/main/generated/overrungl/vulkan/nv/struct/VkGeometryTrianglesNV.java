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
/// struct VkGeometryTrianglesNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkBuffer vertexData;
///     (uint64_t) VkDeviceSize vertexOffset;
///     uint32_t vertexCount;
///     (uint64_t) VkDeviceSize vertexStride;
///     (int) VkFormat vertexFormat;
///     (uint64_t) VkBuffer indexData;
///     (uint64_t) VkDeviceSize indexOffset;
///     uint32_t indexCount;
///     (int) VkIndexType indexType;
///     (uint64_t) VkBuffer transformData;
///     (uint64_t) VkDeviceSize transformOffset;
/// };
/// ```
public final class VkGeometryTrianglesNV extends GroupType {
    /// The struct layout of `VkGeometryTrianglesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.JAVA_LONG.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexOffset"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("indexType"),
        ValueLayout.JAVA_LONG.withName("transformData"),
        ValueLayout.JAVA_LONG.withName("transformOffset")
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
    /// The byte offset of `vertexData`.
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    /// The memory layout of `vertexData`.
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    /// The [VarHandle] of `vertexData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"));
    /// The byte offset of `vertexOffset`.
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    /// The memory layout of `vertexOffset`.
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    /// The byte offset of `vertexCount`.
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    /// The memory layout of `vertexCount`.
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    /// The byte offset of `vertexStride`.
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    /// The memory layout of `vertexStride`.
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    /// The [VarHandle] of `vertexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    /// The byte offset of `vertexFormat`.
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    /// The memory layout of `vertexFormat`.
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    /// The [VarHandle] of `vertexFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    /// The byte offset of `indexData`.
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    /// The memory layout of `indexData`.
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    /// The [VarHandle] of `indexData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"));
    /// The byte offset of `indexOffset`.
    public static final long OFFSET_indexOffset = LAYOUT.byteOffset(PathElement.groupElement("indexOffset"));
    /// The memory layout of `indexOffset`.
    public static final MemoryLayout LAYOUT_indexOffset = LAYOUT.select(PathElement.groupElement("indexOffset"));
    /// The [VarHandle] of `indexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexOffset"));
    /// The byte offset of `indexCount`.
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    /// The memory layout of `indexCount`.
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `transformData`.
    public static final long OFFSET_transformData = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
    /// The memory layout of `transformData`.
    public static final MemoryLayout LAYOUT_transformData = LAYOUT.select(PathElement.groupElement("transformData"));
    /// The [VarHandle] of `transformData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformData"));
    /// The byte offset of `transformOffset`.
    public static final long OFFSET_transformOffset = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
    /// The memory layout of `transformOffset`.
    public static final MemoryLayout LAYOUT_transformOffset = LAYOUT.select(PathElement.groupElement("transformOffset"));
    /// The [VarHandle] of `transformOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeometryTrianglesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @param indexOffset `indexOffset`
    /// @param indexCount `indexCount`
    /// @param indexType `indexType`
    /// @param transformData `transformData`
    /// @param transformOffset `transformOffset`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset, int indexCount, int indexType, long transformData, long transformOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData).indexOffset(indexOffset).indexCount(indexCount).indexType(indexType).transformData(transformData).transformOffset(transformOffset);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @param indexOffset `indexOffset`
    /// @param indexCount `indexCount`
    /// @param indexType `indexType`
    /// @param transformData `transformData`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset, int indexCount, int indexType, long transformData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData).indexOffset(indexOffset).indexCount(indexCount).indexType(indexType).transformData(transformData);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @param indexOffset `indexOffset`
    /// @param indexCount `indexCount`
    /// @param indexType `indexType`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset, int indexCount, int indexType) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData).indexOffset(indexOffset).indexCount(indexCount).indexType(indexType);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @param indexOffset `indexOffset`
    /// @param indexCount `indexCount`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset, int indexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData).indexOffset(indexOffset).indexCount(indexCount);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @param indexOffset `indexOffset`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData).indexOffset(indexOffset);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @param indexData `indexData`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat).indexData(indexData);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @param vertexFormat `vertexFormat`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride).vertexFormat(vertexFormat);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @param vertexStride `vertexStride`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount).vertexStride(vertexStride);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @param vertexCount `vertexCount`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset, int vertexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset).vertexCount(vertexCount);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @param vertexOffset `vertexOffset`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData, long vertexOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData).vertexOffset(vertexOffset);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexData `vertexData`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long vertexData) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexData(vertexData);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeometryTrianglesNV copyFrom(VkGeometryTrianglesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeometryTrianglesNV reinterpret(long count) { return new VkGeometryTrianglesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeometryTrianglesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeometryTrianglesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vertexData(MemorySegment segment, long index) { return (long) VH_vertexData.get(segment, 0L, index); }
    /// {@return `vertexData`}
    public long vertexData() { return vertexData(this.segment(), 0L); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexData(MemorySegment segment, long index, long value) { VH_vertexData.set(segment, 0L, index, value); }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexData(long value) { vertexData(this.segment(), 0L, value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vertexOffset(MemorySegment segment, long index) { return (long) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    public long vertexOffset() { return vertexOffset(this.segment(), 0L); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexOffset(MemorySegment segment, long index, long value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexOffset(long value) { vertexOffset(this.segment(), 0L, value); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    public int vertexCount() { return vertexCount(this.segment(), 0L); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexCount(MemorySegment segment, long index, int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexCount(int value) { vertexCount(this.segment(), 0L, value); return this; }

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
    public VkGeometryTrianglesNV vertexStride(long value) { vertexStride(this.segment(), 0L, value); return this; }

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
    public VkGeometryTrianglesNV vertexFormat(int value) { vertexFormat(this.segment(), 0L, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indexData(MemorySegment segment, long index) { return (long) VH_indexData.get(segment, 0L, index); }
    /// {@return `indexData`}
    public long indexData() { return indexData(this.segment(), 0L); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexData(MemorySegment segment, long index, long value) { VH_indexData.set(segment, 0L, index, value); }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexData(long value) { indexData(this.segment(), 0L, value); return this; }

    /// {@return `indexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indexOffset(MemorySegment segment, long index) { return (long) VH_indexOffset.get(segment, 0L, index); }
    /// {@return `indexOffset`}
    public long indexOffset() { return indexOffset(this.segment(), 0L); }
    /// Sets `indexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexOffset(MemorySegment segment, long index, long value) { VH_indexOffset.set(segment, 0L, index, value); }
    /// Sets `indexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexOffset(long value) { indexOffset(this.segment(), 0L, value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    public int indexCount() { return indexCount(this.segment(), 0L); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexCount(MemorySegment segment, long index, int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexCount(int value) { indexCount(this.segment(), 0L, value); return this; }

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
    public VkGeometryTrianglesNV indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// {@return `transformData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long transformData(MemorySegment segment, long index) { return (long) VH_transformData.get(segment, 0L, index); }
    /// {@return `transformData`}
    public long transformData() { return transformData(this.segment(), 0L); }
    /// Sets `transformData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformData(MemorySegment segment, long index, long value) { VH_transformData.set(segment, 0L, index, value); }
    /// Sets `transformData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformData(long value) { transformData(this.segment(), 0L, value); return this; }

    /// {@return `transformOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long transformOffset(MemorySegment segment, long index) { return (long) VH_transformOffset.get(segment, 0L, index); }
    /// {@return `transformOffset`}
    public long transformOffset() { return transformOffset(this.segment(), 0L); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformOffset(MemorySegment segment, long index, long value) { VH_transformOffset.set(segment, 0L, index, value); }
    /// Sets `transformOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformOffset(long value) { transformOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeometryTrianglesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeometryTrianglesNV`
    public VkGeometryTrianglesNV asSlice(long index) { return new VkGeometryTrianglesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeometryTrianglesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeometryTrianglesNV`
    public VkGeometryTrianglesNV asSlice(long index, long count) { return new VkGeometryTrianglesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeometryTrianglesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeometryTrianglesNV at(long index, Consumer<VkGeometryTrianglesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param index the index of the struct buffer
    public long vertexDataAt(long index) { return vertexData(this.segment(), index); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexDataAt(long index, long value) { vertexData(this.segment(), index, value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param index the index of the struct buffer
    public long vertexOffsetAt(long index) { return vertexOffset(this.segment(), index); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexOffsetAt(long index, long value) { vertexOffset(this.segment(), index, value); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param index the index of the struct buffer
    public int vertexCountAt(long index) { return vertexCount(this.segment(), index); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexCountAt(long index, int value) { vertexCount(this.segment(), index, value); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param index the index of the struct buffer
    public long vertexStrideAt(long index) { return vertexStride(this.segment(), index); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexStrideAt(long index, long value) { vertexStride(this.segment(), index, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param index the index of the struct buffer
    public int vertexFormatAt(long index) { return vertexFormat(this.segment(), index); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexFormatAt(long index, int value) { vertexFormat(this.segment(), index, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param index the index of the struct buffer
    public long indexDataAt(long index) { return indexData(this.segment(), index); }
    /// Sets `indexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexDataAt(long index, long value) { indexData(this.segment(), index, value); return this; }

    /// {@return `indexOffset` at the given index}
    /// @param index the index of the struct buffer
    public long indexOffsetAt(long index) { return indexOffset(this.segment(), index); }
    /// Sets `indexOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexOffsetAt(long index, long value) { indexOffset(this.segment(), index, value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param index the index of the struct buffer
    public int indexCountAt(long index) { return indexCount(this.segment(), index); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexCountAt(long index, int value) { indexCount(this.segment(), index, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeAt(long index) { return indexType(this.segment(), index); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

    /// {@return `transformData` at the given index}
    /// @param index the index of the struct buffer
    public long transformDataAt(long index) { return transformData(this.segment(), index); }
    /// Sets `transformData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformDataAt(long index, long value) { transformData(this.segment(), index, value); return this; }

    /// {@return `transformOffset` at the given index}
    /// @param index the index of the struct buffer
    public long transformOffsetAt(long index) { return transformOffset(this.segment(), index); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformOffsetAt(long index, long value) { transformOffset(this.segment(), index, value); return this; }

}
