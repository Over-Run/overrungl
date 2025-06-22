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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkImageMemoryBarrier2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 srcStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 srcAccessMask;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 dstStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 dstAccessMask;
///     (int) VkImageLayout oldLayout;
///     (int) VkImageLayout newLayout;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     (uint64_t) VkImage image;
///     (struct VkImageSubresourceRange) VkImageSubresourceRange subresourceRange;
/// };
/// ```
public sealed class VkImageMemoryBarrier2 extends GroupType {
    /// The struct layout of `VkImageMemoryBarrier2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("image"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
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
    /// The byte offset of `srcStageMask`.
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    /// The memory layout of `srcStageMask`.
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The byte offset of `dstStageMask`.
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    /// The memory layout of `dstStageMask`.
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The byte offset of `oldLayout`.
    public static final long OFFSET_oldLayout = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
    /// The memory layout of `oldLayout`.
    public static final MemoryLayout LAYOUT_oldLayout = LAYOUT.select(PathElement.groupElement("oldLayout"));
    /// The [VarHandle] of `oldLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    /// The byte offset of `newLayout`.
    public static final long OFFSET_newLayout = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
    /// The memory layout of `newLayout`.
    public static final MemoryLayout LAYOUT_newLayout = LAYOUT.select(PathElement.groupElement("newLayout"));
    /// The [VarHandle] of `newLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    /// The byte offset of `srcQueueFamilyIndex`.
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The memory layout of `srcQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The byte offset of `dstQueueFamilyIndex`.
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The memory layout of `dstQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    public VkImageMemoryBarrier2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkImageMemoryBarrier2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageMemoryBarrier2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @param newLayout `newLayout`
    /// @param srcQueueFamilyIndex `srcQueueFamilyIndex`
    /// @param dstQueueFamilyIndex `dstQueueFamilyIndex`
    /// @param image `image`
    /// @param subresourceRange `subresourceRange`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long image, MemorySegment subresourceRange) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout).srcQueueFamilyIndex(srcQueueFamilyIndex).dstQueueFamilyIndex(dstQueueFamilyIndex).image(image).subresourceRange(subresourceRange);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @param newLayout `newLayout`
    /// @param srcQueueFamilyIndex `srcQueueFamilyIndex`
    /// @param dstQueueFamilyIndex `dstQueueFamilyIndex`
    /// @param image `image`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long image) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout).srcQueueFamilyIndex(srcQueueFamilyIndex).dstQueueFamilyIndex(dstQueueFamilyIndex).image(image);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @param newLayout `newLayout`
    /// @param srcQueueFamilyIndex `srcQueueFamilyIndex`
    /// @param dstQueueFamilyIndex `dstQueueFamilyIndex`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout).srcQueueFamilyIndex(srcQueueFamilyIndex).dstQueueFamilyIndex(dstQueueFamilyIndex);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @param newLayout `newLayout`
    /// @param srcQueueFamilyIndex `srcQueueFamilyIndex`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout).srcQueueFamilyIndex(srcQueueFamilyIndex);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @param newLayout `newLayout`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @param oldLayout `oldLayout`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageMemoryBarrier2 copyFrom(VkImageMemoryBarrier2 src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageMemoryBarrier2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    public long srcStageMask() { return srcStageMask(this.segment(), 0L); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcStageMask(MemorySegment segment, long index, long value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcStageMask(long value) { srcStageMask(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public long srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, long value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcAccessMask(long value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    public long dstStageMask() { return dstStageMask(this.segment(), 0L); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstStageMask(MemorySegment segment, long index, long value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstStageMask(long value) { dstStageMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public long dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, long value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstAccessMask(long value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int oldLayout(MemorySegment segment, long index) { return (int) VH_oldLayout.get(segment, 0L, index); }
    /// {@return `oldLayout`}
    public int oldLayout() { return oldLayout(this.segment(), 0L); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void oldLayout(MemorySegment segment, long index, int value) { VH_oldLayout.set(segment, 0L, index, value); }
    /// Sets `oldLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 oldLayout(int value) { oldLayout(this.segment(), 0L, value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int newLayout(MemorySegment segment, long index) { return (int) VH_newLayout.get(segment, 0L, index); }
    /// {@return `newLayout`}
    public int newLayout() { return newLayout(this.segment(), 0L); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void newLayout(MemorySegment segment, long index, int value) { VH_newLayout.set(segment, 0L, index, value); }
    /// Sets `newLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 newLayout(int value) { newLayout(this.segment(), 0L, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    public int srcQueueFamilyIndex() { return srcQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcQueueFamilyIndex(int value) { srcQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    public int dstQueueFamilyIndex() { return dstQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstQueueFamilyIndex(int value) { dstQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 image(long value) { image(this.segment(), 0L, value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    /// {@return `subresourceRange`}
    public MemorySegment subresourceRange() { return subresourceRange(this.segment(), 0L); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subresourceRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 subresourceRange(MemorySegment value) { subresourceRange(this.segment(), 0L, value); return this; }
    /// Accepts `subresourceRange` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageMemoryBarrier2 subresourceRange(Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRange())); return this; }

    /// A buffer of [VkImageMemoryBarrier2].
    public static final class Buffer extends VkImageMemoryBarrier2 {
        private final long elementCount;

        /// Creates `VkImageMemoryBarrier2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageMemoryBarrier2`
        public VkImageMemoryBarrier2 asSlice(long index) { return new VkImageMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageMemoryBarrier2`
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

        /// {@return `srcStageMask` at the given index}
        /// @param index the index of the struct buffer
        public long srcStageMaskAt(long index) { return srcStageMask(this.segment(), index); }
        /// Sets `srcStageMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcStageMaskAt(long index, long value) { srcStageMask(this.segment(), index, value); return this; }

        /// {@return `srcAccessMask` at the given index}
        /// @param index the index of the struct buffer
        public long srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
        /// Sets `srcAccessMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAccessMaskAt(long index, long value) { srcAccessMask(this.segment(), index, value); return this; }

        /// {@return `dstStageMask` at the given index}
        /// @param index the index of the struct buffer
        public long dstStageMaskAt(long index) { return dstStageMask(this.segment(), index); }
        /// Sets `dstStageMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstStageMaskAt(long index, long value) { dstStageMask(this.segment(), index, value); return this; }

        /// {@return `dstAccessMask` at the given index}
        /// @param index the index of the struct buffer
        public long dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
        /// Sets `dstAccessMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAccessMaskAt(long index, long value) { dstAccessMask(this.segment(), index, value); return this; }

        /// {@return `oldLayout` at the given index}
        /// @param index the index of the struct buffer
        public int oldLayoutAt(long index) { return oldLayout(this.segment(), index); }
        /// Sets `oldLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer oldLayoutAt(long index, int value) { oldLayout(this.segment(), index, value); return this; }

        /// {@return `newLayout` at the given index}
        /// @param index the index of the struct buffer
        public int newLayoutAt(long index) { return newLayout(this.segment(), index); }
        /// Sets `newLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer newLayoutAt(long index, int value) { newLayout(this.segment(), index, value); return this; }

        /// {@return `srcQueueFamilyIndex` at the given index}
        /// @param index the index of the struct buffer
        public int srcQueueFamilyIndexAt(long index) { return srcQueueFamilyIndex(this.segment(), index); }
        /// Sets `srcQueueFamilyIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcQueueFamilyIndexAt(long index, int value) { srcQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `dstQueueFamilyIndex` at the given index}
        /// @param index the index of the struct buffer
        public int dstQueueFamilyIndexAt(long index) { return dstQueueFamilyIndex(this.segment(), index); }
        /// Sets `dstQueueFamilyIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstQueueFamilyIndexAt(long index, int value) { dstQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `image` at the given index}
        /// @param index the index of the struct buffer
        public long imageAt(long index) { return image(this.segment(), index); }
        /// Sets `image` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageAt(long index, long value) { image(this.segment(), index, value); return this; }

        /// {@return `subresourceRange` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment subresourceRangeAt(long index) { return subresourceRange(this.segment(), index); }
        /// Sets `subresourceRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subresourceRangeAt(long index, MemorySegment value) { subresourceRange(this.segment(), index, value); return this; }
        /// Accepts `subresourceRange` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer subresourceRangeAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRangeAt(index))); return this; }

    }
}
