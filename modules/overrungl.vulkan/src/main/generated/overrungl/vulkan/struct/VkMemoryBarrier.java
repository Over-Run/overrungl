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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMemoryBarrier {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkAccessFlags srcAccessMask;
///     ((uint32_t) VkFlags) VkAccessFlags dstAccessMask;
/// };
/// ```
public final class VkMemoryBarrier extends GroupType {
    /// The struct layout of `VkMemoryBarrier`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask")
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
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));

    /// Creates `VkMemoryBarrier` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryBarrier(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier alloc(SegmentAllocator allocator) { return new VkMemoryBarrier(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrier(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcAccessMask `srcAccessMask`
    /// @param dstAccessMask `dstAccessMask`
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int srcAccessMask, int dstAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcAccessMask(srcAccessMask).dstAccessMask(dstAccessMask);
    }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcAccessMask `srcAccessMask`
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int srcAccessMask) {
        return alloc(allocator).sType(sType).pNext(pNext).srcAccessMask(srcAccessMask);
    }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryBarrier copyFrom(VkMemoryBarrier src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryBarrier reinterpret(long count) { return new VkMemoryBarrier(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryBarrier sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryBarrier pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public int srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier srcAccessMask(int value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public int dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier dstAccessMask(int value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryBarrier`
    public VkMemoryBarrier asSlice(long index) { return new VkMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryBarrier`
    public VkMemoryBarrier asSlice(long index, long count) { return new VkMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryBarrier` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryBarrier at(long index, Consumer<VkMemoryBarrier> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier srcAccessMaskAt(long index, int value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier dstAccessMaskAt(long index, int value) { dstAccessMask(this.segment(), index, value); return this; }

}
