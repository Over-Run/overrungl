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
/// struct VkMemoryBarrier2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 srcStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 srcAccessMask;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 dstStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 dstAccessMask;
/// };
/// ```
public final class VkMemoryBarrier2KHR extends GroupType {
    /// The struct layout of `VkMemoryBarrier2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask")
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

    /// Creates `VkMemoryBarrier2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryBarrier2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryBarrier2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryBarrier2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryBarrier2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR alloc(SegmentAllocator allocator) { return new VkMemoryBarrier2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrier2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask);
    }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstStageMask `dstStageMask`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask, long dstStageMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask);
    }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @param srcAccessMask `srcAccessMask`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask, long srcAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask);
    }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcStageMask `srcStageMask`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcStageMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask);
    }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMemoryBarrier2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMemoryBarrier2KHR`
    public static VkMemoryBarrier2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryBarrier2KHR copyFrom(VkMemoryBarrier2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryBarrier2KHR reinterpret(long count) { return new VkMemoryBarrier2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryBarrier2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier2KHR srcStageMask(long value) { srcStageMask(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier2KHR srcAccessMask(long value) { srcAccessMask(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier2KHR dstStageMask(long value) { dstStageMask(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier2KHR dstAccessMask(long value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryBarrier2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryBarrier2KHR`
    public VkMemoryBarrier2KHR asSlice(long index) { return new VkMemoryBarrier2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryBarrier2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryBarrier2KHR`
    public VkMemoryBarrier2KHR asSlice(long index, long count) { return new VkMemoryBarrier2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryBarrier2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryBarrier2KHR at(long index, Consumer<VkMemoryBarrier2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcStageMaskAt(long index) { return srcStageMask(this.segment(), index); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR srcStageMaskAt(long index, long value) { srcStageMask(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR srcAccessMaskAt(long index, long value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstStageMaskAt(long index) { return dstStageMask(this.segment(), index); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR dstStageMaskAt(long index, long value) { dstStageMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2KHR dstAccessMaskAt(long index, long value) { dstAccessMask(this.segment(), index, value); return this; }

}
