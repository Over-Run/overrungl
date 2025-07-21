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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTensorCopyARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t dimensionCount;
///     const uint64_t* pSrcOffset;
///     const uint64_t* pDstOffset;
///     const uint64_t* pExtent;
/// };
/// ```
public final class VkTensorCopyARM extends GroupType {
    /// The struct layout of `VkTensorCopyARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dimensionCount"),
        ValueLayout.ADDRESS.withName("pSrcOffset"),
        ValueLayout.ADDRESS.withName("pDstOffset"),
        ValueLayout.ADDRESS.withName("pExtent")
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
    /// The byte offset of `dimensionCount`.
    public static final long OFFSET_dimensionCount = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
    /// The memory layout of `dimensionCount`.
    public static final MemoryLayout LAYOUT_dimensionCount = LAYOUT.select(PathElement.groupElement("dimensionCount"));
    /// The [VarHandle] of `dimensionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimensionCount"));
    /// The byte offset of `pSrcOffset`.
    public static final long OFFSET_pSrcOffset = LAYOUT.byteOffset(PathElement.groupElement("pSrcOffset"));
    /// The memory layout of `pSrcOffset`.
    public static final MemoryLayout LAYOUT_pSrcOffset = LAYOUT.select(PathElement.groupElement("pSrcOffset"));
    /// The [VarHandle] of `pSrcOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSrcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSrcOffset"));
    /// The byte offset of `pDstOffset`.
    public static final long OFFSET_pDstOffset = LAYOUT.byteOffset(PathElement.groupElement("pDstOffset"));
    /// The memory layout of `pDstOffset`.
    public static final MemoryLayout LAYOUT_pDstOffset = LAYOUT.select(PathElement.groupElement("pDstOffset"));
    /// The [VarHandle] of `pDstOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDstOffset"));
    /// The byte offset of `pExtent`.
    public static final long OFFSET_pExtent = LAYOUT.byteOffset(PathElement.groupElement("pExtent"));
    /// The memory layout of `pExtent`.
    public static final MemoryLayout LAYOUT_pExtent = LAYOUT.select(PathElement.groupElement("pExtent"));
    /// The [VarHandle] of `pExtent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExtent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtent"));

    /// Creates `VkTensorCopyARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTensorCopyARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTensorCopyARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorCopyARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorCopyARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorCopyARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTensorCopyARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorCopyARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM alloc(SegmentAllocator allocator) { return new VkTensorCopyARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM alloc(SegmentAllocator allocator, long count) { return new VkTensorCopyARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimensionCount `dimensionCount`
    /// @param pSrcOffset `pSrcOffset`
    /// @param pDstOffset `pDstOffset`
    /// @param pExtent `pExtent`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimensionCount, MemorySegment pSrcOffset, MemorySegment pDstOffset, MemorySegment pExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).dimensionCount(dimensionCount).pSrcOffset(pSrcOffset).pDstOffset(pDstOffset).pExtent(pExtent);
    }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimensionCount `dimensionCount`
    /// @param pSrcOffset `pSrcOffset`
    /// @param pDstOffset `pDstOffset`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimensionCount, MemorySegment pSrcOffset, MemorySegment pDstOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).dimensionCount(dimensionCount).pSrcOffset(pSrcOffset).pDstOffset(pDstOffset);
    }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimensionCount `dimensionCount`
    /// @param pSrcOffset `pSrcOffset`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimensionCount, MemorySegment pSrcOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).dimensionCount(dimensionCount).pSrcOffset(pSrcOffset);
    }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param dimensionCount `dimensionCount`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int dimensionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).dimensionCount(dimensionCount);
    }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkTensorCopyARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkTensorCopyARM`
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorCopyARM copyFrom(VkTensorCopyARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTensorCopyARM reinterpret(long count) { return new VkTensorCopyARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTensorCopyARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorCopyARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dimensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dimensionCount(MemorySegment segment, long index) { return (int) VH_dimensionCount.get(segment, 0L, index); }
    /// {@return `dimensionCount`}
    public int dimensionCount() { return dimensionCount(this.segment(), 0L); }
    /// Sets `dimensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dimensionCount(MemorySegment segment, long index, int value) { VH_dimensionCount.set(segment, 0L, index, value); }
    /// Sets `dimensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM dimensionCount(int value) { dimensionCount(this.segment(), 0L, value); return this; }

    /// {@return `pSrcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSrcOffset(MemorySegment segment, long index) { return (MemorySegment) VH_pSrcOffset.get(segment, 0L, index); }
    /// {@return `pSrcOffset`}
    public MemorySegment pSrcOffset() { return pSrcOffset(this.segment(), 0L); }
    /// Sets `pSrcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSrcOffset(MemorySegment segment, long index, MemorySegment value) { VH_pSrcOffset.set(segment, 0L, index, value); }
    /// Sets `pSrcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pSrcOffset(MemorySegment value) { pSrcOffset(this.segment(), 0L, value); return this; }

    /// {@return `pDstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDstOffset(MemorySegment segment, long index) { return (MemorySegment) VH_pDstOffset.get(segment, 0L, index); }
    /// {@return `pDstOffset`}
    public MemorySegment pDstOffset() { return pDstOffset(this.segment(), 0L); }
    /// Sets `pDstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDstOffset(MemorySegment segment, long index, MemorySegment value) { VH_pDstOffset.set(segment, 0L, index, value); }
    /// Sets `pDstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pDstOffset(MemorySegment value) { pDstOffset(this.segment(), 0L, value); return this; }

    /// {@return `pExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pExtent(MemorySegment segment, long index) { return (MemorySegment) VH_pExtent.get(segment, 0L, index); }
    /// {@return `pExtent`}
    public MemorySegment pExtent() { return pExtent(this.segment(), 0L); }
    /// Sets `pExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pExtent(MemorySegment segment, long index, MemorySegment value) { VH_pExtent.set(segment, 0L, index, value); }
    /// Sets `pExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pExtent(MemorySegment value) { pExtent(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTensorCopyARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTensorCopyARM`
    public VkTensorCopyARM asSlice(long index) { return new VkTensorCopyARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTensorCopyARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTensorCopyARM`
    public VkTensorCopyARM asSlice(long index, long count) { return new VkTensorCopyARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTensorCopyARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTensorCopyARM at(long index, Consumer<VkTensorCopyARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dimensionCount` at the given index}
    /// @param index the index of the struct buffer
    public int dimensionCountAt(long index) { return dimensionCount(this.segment(), index); }
    /// Sets `dimensionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM dimensionCountAt(long index, int value) { dimensionCount(this.segment(), index, value); return this; }

    /// {@return `pSrcOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSrcOffsetAt(long index) { return pSrcOffset(this.segment(), index); }
    /// Sets `pSrcOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pSrcOffsetAt(long index, MemorySegment value) { pSrcOffset(this.segment(), index, value); return this; }

    /// {@return `pDstOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDstOffsetAt(long index) { return pDstOffset(this.segment(), index); }
    /// Sets `pDstOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pDstOffsetAt(long index, MemorySegment value) { pDstOffset(this.segment(), index, value); return this; }

    /// {@return `pExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pExtentAt(long index) { return pExtent(this.segment(), index); }
    /// Sets `pExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorCopyARM pExtentAt(long index, MemorySegment value) { pExtent(this.segment(), index, value); return this; }

}
