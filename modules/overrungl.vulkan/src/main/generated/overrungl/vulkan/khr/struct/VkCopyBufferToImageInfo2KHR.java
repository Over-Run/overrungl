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
/// struct VkCopyBufferToImageInfo2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkBuffer srcBuffer;
///     (uint64_t) VkImage dstImage;
///     (int) VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkBufferImageCopy2* pRegions;
/// };
/// ```
public final class VkCopyBufferToImageInfo2KHR extends GroupType {
    /// The struct layout of `VkCopyBufferToImageInfo2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcBuffer"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
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
    /// The byte offset of `srcBuffer`.
    public static final long OFFSET_srcBuffer = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
    /// The memory layout of `srcBuffer`.
    public static final MemoryLayout LAYOUT_srcBuffer = LAYOUT.select(PathElement.groupElement("srcBuffer"));
    /// The [VarHandle] of `srcBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    /// The byte offset of `dstImage`.
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    /// The memory layout of `dstImage`.
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    /// The byte offset of `dstImageLayout`.
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    /// The memory layout of `dstImageLayout`.
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    /// The byte offset of `regionCount`.
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    /// The memory layout of `regionCount`.
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The byte offset of `pRegions`.
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    /// The memory layout of `pRegions`.
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyBufferToImageInfo2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyBufferToImageInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyBufferToImageInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferToImageInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferToImageInfo2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyBufferToImageInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferToImageInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferToImageInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyBufferToImageInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferToImageInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferToImageInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR alloc(SegmentAllocator allocator) { return new VkCopyBufferToImageInfo2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkCopyBufferToImageInfo2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcBuffer `srcBuffer`
    /// @param dstImage `dstImage`
    /// @param dstImageLayout `dstImageLayout`
    /// @param regionCount `regionCount`
    /// @param pRegions `pRegions`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstImage(dstImage).dstImageLayout(dstImageLayout).regionCount(regionCount).pRegions(pRegions);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcBuffer `srcBuffer`
    /// @param dstImage `dstImage`
    /// @param dstImageLayout `dstImageLayout`
    /// @param regionCount `regionCount`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcBuffer, long dstImage, int dstImageLayout, int regionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstImage(dstImage).dstImageLayout(dstImageLayout).regionCount(regionCount);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcBuffer `srcBuffer`
    /// @param dstImage `dstImage`
    /// @param dstImageLayout `dstImageLayout`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcBuffer, long dstImage, int dstImageLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstImage(dstImage).dstImageLayout(dstImageLayout);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcBuffer `srcBuffer`
    /// @param dstImage `dstImage`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcBuffer, long dstImage) {
        return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstImage(dstImage);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcBuffer `srcBuffer`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkCopyBufferToImageInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkCopyBufferToImageInfo2KHR`
    public static VkCopyBufferToImageInfo2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR copyFrom(VkCopyBufferToImageInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyBufferToImageInfo2KHR reinterpret(long count) { return new VkCopyBufferToImageInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyBufferToImageInfo2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyBufferToImageInfo2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcBuffer(MemorySegment segment, long index) { return (long) VH_srcBuffer.get(segment, 0L, index); }
    /// {@return `srcBuffer`}
    public long srcBuffer() { return srcBuffer(this.segment(), 0L); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcBuffer(MemorySegment segment, long index, long value) { VH_srcBuffer.set(segment, 0L, index, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR srcBuffer(long value) { srcBuffer(this.segment(), 0L, value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstImage(MemorySegment segment, long index) { return (long) VH_dstImage.get(segment, 0L, index); }
    /// {@return `dstImage`}
    public long dstImage() { return dstImage(this.segment(), 0L); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImage(MemorySegment segment, long index, long value) { VH_dstImage.set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR dstImage(long value) { dstImage(this.segment(), 0L, value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    public int dstImageLayout() { return dstImageLayout(this.segment(), 0L); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImageLayout(MemorySegment segment, long index, int value) { VH_dstImageLayout.set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR dstImageLayout(int value) { dstImageLayout(this.segment(), 0L, value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    public int regionCount() { return regionCount(this.segment(), 0L); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void regionCount(MemorySegment segment, long index, int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR regionCount(int value) { regionCount(this.segment(), 0L, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    public MemorySegment pRegions() { return pRegions(this.segment(), 0L); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRegions(MemorySegment segment, long index, MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR pRegions(MemorySegment value) { pRegions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyBufferToImageInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyBufferToImageInfo2KHR`
    public VkCopyBufferToImageInfo2KHR asSlice(long index) { return new VkCopyBufferToImageInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyBufferToImageInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyBufferToImageInfo2KHR`
    public VkCopyBufferToImageInfo2KHR asSlice(long index, long count) { return new VkCopyBufferToImageInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyBufferToImageInfo2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR at(long index, Consumer<VkCopyBufferToImageInfo2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long srcBufferAt(long index) { return srcBuffer(this.segment(), index); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR srcBufferAt(long index, long value) { srcBuffer(this.segment(), index, value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param index the index of the struct buffer
    public long dstImageAt(long index) { return dstImage(this.segment(), index); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR dstImageAt(long index, long value) { dstImage(this.segment(), index, value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int dstImageLayoutAt(long index) { return dstImageLayout(this.segment(), index); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR dstImageLayoutAt(long index, int value) { dstImageLayout(this.segment(), index, value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param index the index of the struct buffer
    public int regionCountAt(long index) { return regionCount(this.segment(), index); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR regionCountAt(long index, int value) { regionCount(this.segment(), index, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRegionsAt(long index) { return pRegions(this.segment(), index); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2KHR pRegionsAt(long index, MemorySegment value) { pRegions(this.segment(), index, value); return this; }

}
