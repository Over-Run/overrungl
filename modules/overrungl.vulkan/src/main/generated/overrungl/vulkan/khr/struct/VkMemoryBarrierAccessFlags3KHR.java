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
/// struct VkMemoryBarrierAccessFlags3KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkAccessFlags3KHR srcAccessMask3;
///     ((uint64_t) VkFlags64) VkAccessFlags3KHR dstAccessMask3;
/// };
/// ```
public final class VkMemoryBarrierAccessFlags3KHR extends GroupType {
    /// The struct layout of `VkMemoryBarrierAccessFlags3KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask3"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask3")
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
    /// The byte offset of `srcAccessMask3`.
    public static final long OFFSET_srcAccessMask3 = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask3"));
    /// The memory layout of `srcAccessMask3`.
    public static final MemoryLayout LAYOUT_srcAccessMask3 = LAYOUT.select(PathElement.groupElement("srcAccessMask3"));
    /// The [VarHandle] of `srcAccessMask3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask3"));
    /// The byte offset of `dstAccessMask3`.
    public static final long OFFSET_dstAccessMask3 = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask3"));
    /// The memory layout of `dstAccessMask3`.
    public static final MemoryLayout LAYOUT_dstAccessMask3 = LAYOUT.select(PathElement.groupElement("dstAccessMask3"));
    /// The [VarHandle] of `dstAccessMask3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask3"));

    /// Creates `VkMemoryBarrierAccessFlags3KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryBarrierAccessFlags3KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryBarrierAccessFlags3KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrierAccessFlags3KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryBarrierAccessFlags3KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrierAccessFlags3KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryBarrierAccessFlags3KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrierAccessFlags3KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR alloc(SegmentAllocator allocator) { return new VkMemoryBarrierAccessFlags3KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrierAccessFlags3KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcAccessMask3 `srcAccessMask3`
    /// @param dstAccessMask3 `dstAccessMask3`
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcAccessMask3, long dstAccessMask3) {
        return alloc(allocator).sType(sType).pNext(pNext).srcAccessMask3(srcAccessMask3).dstAccessMask3(dstAccessMask3);
    }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcAccessMask3 `srcAccessMask3`
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long srcAccessMask3) {
        return alloc(allocator).sType(sType).pNext(pNext).srcAccessMask3(srcAccessMask3);
    }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMemoryBarrierAccessFlags3KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMemoryBarrierAccessFlags3KHR`
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR copyFrom(VkMemoryBarrierAccessFlags3KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryBarrierAccessFlags3KHR reinterpret(long count) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryBarrierAccessFlags3KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrierAccessFlags3KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccessMask3(MemorySegment segment, long index) { return (long) VH_srcAccessMask3.get(segment, 0L, index); }
    /// {@return `srcAccessMask3`}
    public long srcAccessMask3() { return srcAccessMask3(this.segment(), 0L); }
    /// Sets `srcAccessMask3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask3(MemorySegment segment, long index, long value) { VH_srcAccessMask3.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask3` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3(long value) { srcAccessMask3(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccessMask3(MemorySegment segment, long index) { return (long) VH_dstAccessMask3.get(segment, 0L, index); }
    /// {@return `dstAccessMask3`}
    public long dstAccessMask3() { return dstAccessMask3(this.segment(), 0L); }
    /// Sets `dstAccessMask3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask3(MemorySegment segment, long index, long value) { VH_dstAccessMask3.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask3` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3(long value) { dstAccessMask3(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryBarrierAccessFlags3KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryBarrierAccessFlags3KHR`
    public VkMemoryBarrierAccessFlags3KHR asSlice(long index) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryBarrierAccessFlags3KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryBarrierAccessFlags3KHR`
    public VkMemoryBarrierAccessFlags3KHR asSlice(long index, long count) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryBarrierAccessFlags3KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR at(long index, Consumer<VkMemoryBarrierAccessFlags3KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask3` at the given index}
    /// @param index the index of the struct buffer
    public long srcAccessMask3At(long index) { return srcAccessMask3(this.segment(), index); }
    /// Sets `srcAccessMask3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3At(long index, long value) { srcAccessMask3(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask3` at the given index}
    /// @param index the index of the struct buffer
    public long dstAccessMask3At(long index) { return dstAccessMask3(this.segment(), index); }
    /// Sets `dstAccessMask3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3At(long index, long value) { dstAccessMask3(this.segment(), index, value); return this; }

}
