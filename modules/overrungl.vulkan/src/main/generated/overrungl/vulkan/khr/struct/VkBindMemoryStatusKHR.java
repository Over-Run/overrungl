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
/// struct VkBindMemoryStatusKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     VkResult* pResult;
/// };
/// ```
public final class VkBindMemoryStatusKHR extends GroupType {
    /// The struct layout of `VkBindMemoryStatusKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pResult")
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
    /// The byte offset of `pResult`.
    public static final long OFFSET_pResult = LAYOUT.byteOffset(PathElement.groupElement("pResult"));
    /// The memory layout of `pResult`.
    public static final MemoryLayout LAYOUT_pResult = LAYOUT.select(PathElement.groupElement("pResult"));
    /// The [VarHandle] of `pResult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pResult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResult"));

    /// Creates `VkBindMemoryStatusKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindMemoryStatusKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindMemoryStatusKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatusKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindMemoryStatusKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatusKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindMemoryStatusKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatusKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindMemoryStatusKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindMemoryStatusKHR`
    public static VkBindMemoryStatusKHR alloc(SegmentAllocator allocator) { return new VkBindMemoryStatusKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindMemoryStatusKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindMemoryStatusKHR`
    public static VkBindMemoryStatusKHR alloc(SegmentAllocator allocator, long count) { return new VkBindMemoryStatusKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindMemoryStatusKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pResult `pResult`
    /// @return the allocated `VkBindMemoryStatusKHR`
    public static VkBindMemoryStatusKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pResult) {
        return alloc(allocator).sType(sType).pNext(pNext).pResult(pResult);
    }

    /// Allocates a `VkBindMemoryStatusKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBindMemoryStatusKHR`
    public static VkBindMemoryStatusKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBindMemoryStatusKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBindMemoryStatusKHR`
    public static VkBindMemoryStatusKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindMemoryStatusKHR copyFrom(VkBindMemoryStatusKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindMemoryStatusKHR reinterpret(long count) { return new VkBindMemoryStatusKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindMemoryStatusKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindMemoryStatusKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pResult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResult(MemorySegment segment, long index) { return (MemorySegment) VH_pResult.get(segment, 0L, index); }
    /// {@return `pResult`}
    public MemorySegment pResult() { return pResult(this.segment(), 0L); }
    /// Sets `pResult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResult(MemorySegment segment, long index, MemorySegment value) { VH_pResult.set(segment, 0L, index, value); }
    /// Sets `pResult` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatusKHR pResult(MemorySegment value) { pResult(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindMemoryStatusKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindMemoryStatusKHR`
    public VkBindMemoryStatusKHR asSlice(long index) { return new VkBindMemoryStatusKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindMemoryStatusKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindMemoryStatusKHR`
    public VkBindMemoryStatusKHR asSlice(long index, long count) { return new VkBindMemoryStatusKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindMemoryStatusKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindMemoryStatusKHR at(long index, Consumer<VkBindMemoryStatusKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatusKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatusKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pResult` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pResultAt(long index) { return pResult(this.segment(), index); }
    /// Sets `pResult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatusKHR pResultAt(long index, MemorySegment value) { pResult(this.segment(), index, value); return this; }

}
