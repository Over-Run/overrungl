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
/// struct VkGeometryAABBNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkBuffer aabbData;
///     uint32_t numAABBs;
///     uint32_t stride;
///     (uint64_t) VkDeviceSize offset;
/// };
/// ```
public final class VkGeometryAABBNV extends GroupType {
    /// The struct layout of `VkGeometryAABBNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
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
    /// The byte offset of `aabbData`.
    public static final long OFFSET_aabbData = LAYOUT.byteOffset(PathElement.groupElement("aabbData"));
    /// The memory layout of `aabbData`.
    public static final MemoryLayout LAYOUT_aabbData = LAYOUT.select(PathElement.groupElement("aabbData"));
    /// The [VarHandle] of `aabbData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aabbData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbData"));
    /// The byte offset of `numAABBs`.
    public static final long OFFSET_numAABBs = LAYOUT.byteOffset(PathElement.groupElement("numAABBs"));
    /// The memory layout of `numAABBs`.
    public static final MemoryLayout LAYOUT_numAABBs = LAYOUT.select(PathElement.groupElement("numAABBs"));
    /// The [VarHandle] of `numAABBs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numAABBs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAABBs"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkGeometryAABBNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeometryAABBNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryAABBNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryAABBNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryAABBNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV alloc(SegmentAllocator allocator) { return new VkGeometryAABBNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryAABBNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param aabbData `aabbData`
    /// @param numAABBs `numAABBs`
    /// @param stride `stride`
    /// @param offset `offset`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long aabbData, int numAABBs, int stride, long offset) {
        return alloc(allocator).sType(sType).pNext(pNext).aabbData(aabbData).numAABBs(numAABBs).stride(stride).offset(offset);
    }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param aabbData `aabbData`
    /// @param numAABBs `numAABBs`
    /// @param stride `stride`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long aabbData, int numAABBs, int stride) {
        return alloc(allocator).sType(sType).pNext(pNext).aabbData(aabbData).numAABBs(numAABBs).stride(stride);
    }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param aabbData `aabbData`
    /// @param numAABBs `numAABBs`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long aabbData, int numAABBs) {
        return alloc(allocator).sType(sType).pNext(pNext).aabbData(aabbData).numAABBs(numAABBs);
    }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param aabbData `aabbData`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long aabbData) {
        return alloc(allocator).sType(sType).pNext(pNext).aabbData(aabbData);
    }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeometryAABBNV copyFrom(VkGeometryAABBNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeometryAABBNV reinterpret(long count) { return new VkGeometryAABBNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeometryAABBNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeometryAABBNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `aabbData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long aabbData(MemorySegment segment, long index) { return (long) VH_aabbData.get(segment, 0L, index); }
    /// {@return `aabbData`}
    public long aabbData() { return aabbData(this.segment(), 0L); }
    /// Sets `aabbData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aabbData(MemorySegment segment, long index, long value) { VH_aabbData.set(segment, 0L, index, value); }
    /// Sets `aabbData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV aabbData(long value) { aabbData(this.segment(), 0L, value); return this; }

    /// {@return `numAABBs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numAABBs(MemorySegment segment, long index) { return (int) VH_numAABBs.get(segment, 0L, index); }
    /// {@return `numAABBs`}
    public int numAABBs() { return numAABBs(this.segment(), 0L); }
    /// Sets `numAABBs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numAABBs(MemorySegment segment, long index, int value) { VH_numAABBs.set(segment, 0L, index, value); }
    /// Sets `numAABBs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV numAABBs(int value) { numAABBs(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV offset(long value) { offset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeometryAABBNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeometryAABBNV`
    public VkGeometryAABBNV asSlice(long index) { return new VkGeometryAABBNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeometryAABBNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeometryAABBNV`
    public VkGeometryAABBNV asSlice(long index, long count) { return new VkGeometryAABBNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeometryAABBNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeometryAABBNV at(long index, Consumer<VkGeometryAABBNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `aabbData` at the given index}
    /// @param index the index of the struct buffer
    public long aabbDataAt(long index) { return aabbData(this.segment(), index); }
    /// Sets `aabbData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV aabbDataAt(long index, long value) { aabbData(this.segment(), index, value); return this; }

    /// {@return `numAABBs` at the given index}
    /// @param index the index of the struct buffer
    public int numAABBsAt(long index) { return numAABBs(this.segment(), index); }
    /// Sets `numAABBs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV numAABBsAt(long index, int value) { numAABBs(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public int strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

}
