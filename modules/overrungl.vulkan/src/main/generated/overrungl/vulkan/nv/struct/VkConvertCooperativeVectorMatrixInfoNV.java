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
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkConvertCooperativeVectorMatrixInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     size_t srcSize;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR srcData;
///     size_t* pDstSize;
///     (union VkDeviceOrHostAddressKHR) VkDeviceOrHostAddressKHR dstData;
///     (int) VkComponentTypeKHR srcComponentType;
///     (int) VkComponentTypeKHR dstComponentType;
///     uint32_t numRows;
///     uint32_t numColumns;
///     (int) VkCooperativeVectorMatrixLayoutNV srcLayout;
///     size_t srcStride;
///     (int) VkCooperativeVectorMatrixLayoutNV dstLayout;
///     size_t dstStride;
/// };
/// ```
public sealed class VkConvertCooperativeVectorMatrixInfoNV extends GroupType {
    /// The struct layout of `VkConvertCooperativeVectorMatrixInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("srcSize"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("srcData"),
        ValueLayout.ADDRESS.withName("pDstSize"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("dstData"),
        ValueLayout.JAVA_INT.withName("srcComponentType"),
        ValueLayout.JAVA_INT.withName("dstComponentType"),
        ValueLayout.JAVA_INT.withName("numRows"),
        ValueLayout.JAVA_INT.withName("numColumns"),
        ValueLayout.JAVA_INT.withName("srcLayout"),
        CanonicalTypes.SIZE_T.withName("srcStride"),
        ValueLayout.JAVA_INT.withName("dstLayout"),
        CanonicalTypes.SIZE_T.withName("dstStride")
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
    /// The byte offset of `srcSize`.
    public static final long OFFSET_srcSize = LAYOUT.byteOffset(PathElement.groupElement("srcSize"));
    /// The memory layout of `srcSize`.
    public static final MemoryLayout LAYOUT_srcSize = LAYOUT.select(PathElement.groupElement("srcSize"));
    /// The [VarHandle] of `srcSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSize"));
    /// The byte offset of `srcData`.
    public static final long OFFSET_srcData = LAYOUT.byteOffset(PathElement.groupElement("srcData"));
    /// The memory layout of `srcData`.
    public static final MemoryLayout LAYOUT_srcData = LAYOUT.select(PathElement.groupElement("srcData"));
    /// The byte offset of `pDstSize`.
    public static final long OFFSET_pDstSize = LAYOUT.byteOffset(PathElement.groupElement("pDstSize"));
    /// The memory layout of `pDstSize`.
    public static final MemoryLayout LAYOUT_pDstSize = LAYOUT.select(PathElement.groupElement("pDstSize"));
    /// The [VarHandle] of `pDstSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDstSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDstSize"));
    /// The byte offset of `dstData`.
    public static final long OFFSET_dstData = LAYOUT.byteOffset(PathElement.groupElement("dstData"));
    /// The memory layout of `dstData`.
    public static final MemoryLayout LAYOUT_dstData = LAYOUT.select(PathElement.groupElement("dstData"));
    /// The byte offset of `srcComponentType`.
    public static final long OFFSET_srcComponentType = LAYOUT.byteOffset(PathElement.groupElement("srcComponentType"));
    /// The memory layout of `srcComponentType`.
    public static final MemoryLayout LAYOUT_srcComponentType = LAYOUT.select(PathElement.groupElement("srcComponentType"));
    /// The [VarHandle] of `srcComponentType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcComponentType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcComponentType"));
    /// The byte offset of `dstComponentType`.
    public static final long OFFSET_dstComponentType = LAYOUT.byteOffset(PathElement.groupElement("dstComponentType"));
    /// The memory layout of `dstComponentType`.
    public static final MemoryLayout LAYOUT_dstComponentType = LAYOUT.select(PathElement.groupElement("dstComponentType"));
    /// The [VarHandle] of `dstComponentType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstComponentType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstComponentType"));
    /// The byte offset of `numRows`.
    public static final long OFFSET_numRows = LAYOUT.byteOffset(PathElement.groupElement("numRows"));
    /// The memory layout of `numRows`.
    public static final MemoryLayout LAYOUT_numRows = LAYOUT.select(PathElement.groupElement("numRows"));
    /// The [VarHandle] of `numRows` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numRows = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numRows"));
    /// The byte offset of `numColumns`.
    public static final long OFFSET_numColumns = LAYOUT.byteOffset(PathElement.groupElement("numColumns"));
    /// The memory layout of `numColumns`.
    public static final MemoryLayout LAYOUT_numColumns = LAYOUT.select(PathElement.groupElement("numColumns"));
    /// The [VarHandle] of `numColumns` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numColumns = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numColumns"));
    /// The byte offset of `srcLayout`.
    public static final long OFFSET_srcLayout = LAYOUT.byteOffset(PathElement.groupElement("srcLayout"));
    /// The memory layout of `srcLayout`.
    public static final MemoryLayout LAYOUT_srcLayout = LAYOUT.select(PathElement.groupElement("srcLayout"));
    /// The [VarHandle] of `srcLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcLayout"));
    /// The byte offset of `srcStride`.
    public static final long OFFSET_srcStride = LAYOUT.byteOffset(PathElement.groupElement("srcStride"));
    /// The memory layout of `srcStride`.
    public static final MemoryLayout LAYOUT_srcStride = LAYOUT.select(PathElement.groupElement("srcStride"));
    /// The [VarHandle] of `srcStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStride"));
    /// The byte offset of `dstLayout`.
    public static final long OFFSET_dstLayout = LAYOUT.byteOffset(PathElement.groupElement("dstLayout"));
    /// The memory layout of `dstLayout`.
    public static final MemoryLayout LAYOUT_dstLayout = LAYOUT.select(PathElement.groupElement("dstLayout"));
    /// The [VarHandle] of `dstLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstLayout"));
    /// The byte offset of `dstStride`.
    public static final long OFFSET_dstStride = LAYOUT.byteOffset(PathElement.groupElement("dstStride"));
    /// The memory layout of `dstStride`.
    public static final MemoryLayout LAYOUT_dstStride = LAYOUT.select(PathElement.groupElement("dstStride"));
    /// The [VarHandle] of `dstStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStride"));

    /// Creates `VkConvertCooperativeVectorMatrixInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkConvertCooperativeVectorMatrixInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkConvertCooperativeVectorMatrixInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkConvertCooperativeVectorMatrixInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConvertCooperativeVectorMatrixInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConvertCooperativeVectorMatrixInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkConvertCooperativeVectorMatrixInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV alloc(SegmentAllocator allocator) { return new VkConvertCooperativeVectorMatrixInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @param numColumns `numColumns`
    /// @param srcLayout `srcLayout`
    /// @param srcStride `srcStride`
    /// @param dstLayout `dstLayout`
    /// @param dstStride `dstStride`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns, int srcLayout, long srcStride, int dstLayout, long dstStride) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows).numColumns(numColumns).srcLayout(srcLayout).srcStride(srcStride).dstLayout(dstLayout).dstStride(dstStride);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @param numColumns `numColumns`
    /// @param srcLayout `srcLayout`
    /// @param srcStride `srcStride`
    /// @param dstLayout `dstLayout`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns, int srcLayout, long srcStride, int dstLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows).numColumns(numColumns).srcLayout(srcLayout).srcStride(srcStride).dstLayout(dstLayout);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @param numColumns `numColumns`
    /// @param srcLayout `srcLayout`
    /// @param srcStride `srcStride`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns, int srcLayout, long srcStride) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows).numColumns(numColumns).srcLayout(srcLayout).srcStride(srcStride);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @param numColumns `numColumns`
    /// @param srcLayout `srcLayout`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns, int srcLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows).numColumns(numColumns).srcLayout(srcLayout);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @param numColumns `numColumns`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows).numColumns(numColumns);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @param numRows `numRows`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType, int numRows) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType).numRows(numRows);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @param dstComponentType `dstComponentType`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType, int dstComponentType) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType).dstComponentType(dstComponentType);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @param srcComponentType `srcComponentType`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData, int srcComponentType) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData).srcComponentType(srcComponentType);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @param dstData `dstData`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize, MemorySegment dstData) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize).dstData(dstData);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @param pDstSize `pDstSize`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData, MemorySegment pDstSize) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData).pDstSize(pDstSize);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @param srcData `srcData`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize, MemorySegment srcData) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize).srcData(srcData);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSize `srcSize`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcSize) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSize(srcSize);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkConvertCooperativeVectorMatrixInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkConvertCooperativeVectorMatrixInfoNV`
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV copyFrom(VkConvertCooperativeVectorMatrixInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkConvertCooperativeVectorMatrixInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkConvertCooperativeVectorMatrixInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_srcSize.get(segment, 0L, index)); }
    /// {@return `srcSize`}
    public long srcSize() { return srcSize(this.segment(), 0L); }
    /// Sets `srcSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSize(MemorySegment segment, long index, long value) { VH_srcSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `srcSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcSize(long value) { srcSize(this.segment(), 0L, value); return this; }

    /// {@return `srcData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcData, index), LAYOUT_srcData); }
    /// {@return `srcData`}
    public MemorySegment srcData() { return srcData(this.segment(), 0L); }
    /// Sets `srcData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcData, index), LAYOUT_srcData.byteSize()); }
    /// Sets `srcData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcData(MemorySegment value) { srcData(this.segment(), 0L, value); return this; }
    /// Accepts `srcData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(srcData())); return this; }

    /// {@return `pDstSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDstSize(MemorySegment segment, long index) { return (MemorySegment) VH_pDstSize.get(segment, 0L, index); }
    /// {@return `pDstSize`}
    public MemorySegment pDstSize() { return pDstSize(this.segment(), 0L); }
    /// Sets `pDstSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDstSize(MemorySegment segment, long index, MemorySegment value) { VH_pDstSize.set(segment, 0L, index, value); }
    /// Sets `pDstSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV pDstSize(MemorySegment value) { pDstSize(this.segment(), 0L, value); return this; }

    /// {@return `dstData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstData, index), LAYOUT_dstData); }
    /// {@return `dstData`}
    public MemorySegment dstData() { return dstData(this.segment(), 0L); }
    /// Sets `dstData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstData, index), LAYOUT_dstData.byteSize()); }
    /// Sets `dstData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV dstData(MemorySegment value) { dstData(this.segment(), 0L, value); return this; }
    /// Accepts `dstData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV dstData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.of(dstData())); return this; }

    /// {@return `srcComponentType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcComponentType(MemorySegment segment, long index) { return (int) VH_srcComponentType.get(segment, 0L, index); }
    /// {@return `srcComponentType`}
    public int srcComponentType() { return srcComponentType(this.segment(), 0L); }
    /// Sets `srcComponentType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcComponentType(MemorySegment segment, long index, int value) { VH_srcComponentType.set(segment, 0L, index, value); }
    /// Sets `srcComponentType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcComponentType(int value) { srcComponentType(this.segment(), 0L, value); return this; }

    /// {@return `dstComponentType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstComponentType(MemorySegment segment, long index) { return (int) VH_dstComponentType.get(segment, 0L, index); }
    /// {@return `dstComponentType`}
    public int dstComponentType() { return dstComponentType(this.segment(), 0L); }
    /// Sets `dstComponentType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstComponentType(MemorySegment segment, long index, int value) { VH_dstComponentType.set(segment, 0L, index, value); }
    /// Sets `dstComponentType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV dstComponentType(int value) { dstComponentType(this.segment(), 0L, value); return this; }

    /// {@return `numRows` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numRows(MemorySegment segment, long index) { return (int) VH_numRows.get(segment, 0L, index); }
    /// {@return `numRows`}
    public int numRows() { return numRows(this.segment(), 0L); }
    /// Sets `numRows` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numRows(MemorySegment segment, long index, int value) { VH_numRows.set(segment, 0L, index, value); }
    /// Sets `numRows` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV numRows(int value) { numRows(this.segment(), 0L, value); return this; }

    /// {@return `numColumns` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numColumns(MemorySegment segment, long index) { return (int) VH_numColumns.get(segment, 0L, index); }
    /// {@return `numColumns`}
    public int numColumns() { return numColumns(this.segment(), 0L); }
    /// Sets `numColumns` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numColumns(MemorySegment segment, long index, int value) { VH_numColumns.set(segment, 0L, index, value); }
    /// Sets `numColumns` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV numColumns(int value) { numColumns(this.segment(), 0L, value); return this; }

    /// {@return `srcLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcLayout(MemorySegment segment, long index) { return (int) VH_srcLayout.get(segment, 0L, index); }
    /// {@return `srcLayout`}
    public int srcLayout() { return srcLayout(this.segment(), 0L); }
    /// Sets `srcLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcLayout(MemorySegment segment, long index, int value) { VH_srcLayout.set(segment, 0L, index, value); }
    /// Sets `srcLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcLayout(int value) { srcLayout(this.segment(), 0L, value); return this; }

    /// {@return `srcStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcStride(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_srcStride.get(segment, 0L, index)); }
    /// {@return `srcStride`}
    public long srcStride() { return srcStride(this.segment(), 0L); }
    /// Sets `srcStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcStride(MemorySegment segment, long index, long value) { VH_srcStride.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `srcStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV srcStride(long value) { srcStride(this.segment(), 0L, value); return this; }

    /// {@return `dstLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstLayout(MemorySegment segment, long index) { return (int) VH_dstLayout.get(segment, 0L, index); }
    /// {@return `dstLayout`}
    public int dstLayout() { return dstLayout(this.segment(), 0L); }
    /// Sets `dstLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstLayout(MemorySegment segment, long index, int value) { VH_dstLayout.set(segment, 0L, index, value); }
    /// Sets `dstLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV dstLayout(int value) { dstLayout(this.segment(), 0L, value); return this; }

    /// {@return `dstStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstStride(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dstStride.get(segment, 0L, index)); }
    /// {@return `dstStride`}
    public long dstStride() { return dstStride(this.segment(), 0L); }
    /// Sets `dstStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstStride(MemorySegment segment, long index, long value) { VH_dstStride.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dstStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConvertCooperativeVectorMatrixInfoNV dstStride(long value) { dstStride(this.segment(), 0L, value); return this; }

    /// A buffer of [VkConvertCooperativeVectorMatrixInfoNV].
    public static final class Buffer extends VkConvertCooperativeVectorMatrixInfoNV {
        private final long elementCount;

        /// Creates `VkConvertCooperativeVectorMatrixInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkConvertCooperativeVectorMatrixInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkConvertCooperativeVectorMatrixInfoNV`
        public VkConvertCooperativeVectorMatrixInfoNV asSlice(long index) { return new VkConvertCooperativeVectorMatrixInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkConvertCooperativeVectorMatrixInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkConvertCooperativeVectorMatrixInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `srcSize` at the given index}
        /// @param index the index of the struct buffer
        public long srcSizeAt(long index) { return srcSize(this.segment(), index); }
        /// Sets `srcSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcSizeAt(long index, long value) { srcSize(this.segment(), index, value); return this; }

        /// {@return `srcData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcDataAt(long index) { return srcData(this.segment(), index); }
        /// Sets `srcData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcDataAt(long index, MemorySegment value) { srcData(this.segment(), index, value); return this; }
        /// Accepts `srcData` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer srcDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(srcDataAt(index))); return this; }

        /// {@return `pDstSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDstSizeAt(long index) { return pDstSize(this.segment(), index); }
        /// Sets `pDstSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDstSizeAt(long index, MemorySegment value) { pDstSize(this.segment(), index, value); return this; }

        /// {@return `dstData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstDataAt(long index) { return dstData(this.segment(), index); }
        /// Sets `dstData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstDataAt(long index, MemorySegment value) { dstData(this.segment(), index, value); return this; }
        /// Accepts `dstData` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer dstDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.of(dstDataAt(index))); return this; }

        /// {@return `srcComponentType` at the given index}
        /// @param index the index of the struct buffer
        public int srcComponentTypeAt(long index) { return srcComponentType(this.segment(), index); }
        /// Sets `srcComponentType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcComponentTypeAt(long index, int value) { srcComponentType(this.segment(), index, value); return this; }

        /// {@return `dstComponentType` at the given index}
        /// @param index the index of the struct buffer
        public int dstComponentTypeAt(long index) { return dstComponentType(this.segment(), index); }
        /// Sets `dstComponentType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstComponentTypeAt(long index, int value) { dstComponentType(this.segment(), index, value); return this; }

        /// {@return `numRows` at the given index}
        /// @param index the index of the struct buffer
        public int numRowsAt(long index) { return numRows(this.segment(), index); }
        /// Sets `numRows` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numRowsAt(long index, int value) { numRows(this.segment(), index, value); return this; }

        /// {@return `numColumns` at the given index}
        /// @param index the index of the struct buffer
        public int numColumnsAt(long index) { return numColumns(this.segment(), index); }
        /// Sets `numColumns` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numColumnsAt(long index, int value) { numColumns(this.segment(), index, value); return this; }

        /// {@return `srcLayout` at the given index}
        /// @param index the index of the struct buffer
        public int srcLayoutAt(long index) { return srcLayout(this.segment(), index); }
        /// Sets `srcLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcLayoutAt(long index, int value) { srcLayout(this.segment(), index, value); return this; }

        /// {@return `srcStride` at the given index}
        /// @param index the index of the struct buffer
        public long srcStrideAt(long index) { return srcStride(this.segment(), index); }
        /// Sets `srcStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcStrideAt(long index, long value) { srcStride(this.segment(), index, value); return this; }

        /// {@return `dstLayout` at the given index}
        /// @param index the index of the struct buffer
        public int dstLayoutAt(long index) { return dstLayout(this.segment(), index); }
        /// Sets `dstLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstLayoutAt(long index, int value) { dstLayout(this.segment(), index, value); return this; }

        /// {@return `dstStride` at the given index}
        /// @param index the index of the struct buffer
        public long dstStrideAt(long index) { return dstStride(this.segment(), index); }
        /// Sets `dstStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstStrideAt(long index, long value) { dstStride(this.segment(), index, value); return this; }

    }
}
