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
/// struct VkPresentId2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const uint64_t* pPresentIds;
/// };
/// ```
public final class VkPresentId2KHR extends GroupType {
    /// The struct layout of `VkPresentId2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pPresentIds")
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
    /// The byte offset of `swapchainCount`.
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    /// The memory layout of `swapchainCount`.
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The byte offset of `pPresentIds`.
    public static final long OFFSET_pPresentIds = LAYOUT.byteOffset(PathElement.groupElement("pPresentIds"));
    /// The memory layout of `pPresentIds`.
    public static final MemoryLayout LAYOUT_pPresentIds = LAYOUT.select(PathElement.groupElement("pPresentIds"));
    /// The [VarHandle] of `pPresentIds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPresentIds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentIds"));

    /// Creates `VkPresentId2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentId2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentId2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentId2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentId2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentId2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR alloc(SegmentAllocator allocator) { return new VkPresentId2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR alloc(SegmentAllocator allocator, long count) { return new VkPresentId2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchainCount `swapchainCount`
    /// @param pPresentIds `pPresentIds`
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int swapchainCount, MemorySegment pPresentIds) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount).pPresentIds(pPresentIds);
    }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchainCount `swapchainCount`
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int swapchainCount) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount);
    }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPresentId2KHR`
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentId2KHR copyFrom(VkPresentId2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentId2KHR reinterpret(long count) { return new VkPresentId2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPresentId2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentId2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    public int swapchainCount() { return swapchainCount(this.segment(), 0L); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainCount(MemorySegment segment, long index, int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pPresentIds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPresentIds(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentIds.get(segment, 0L, index); }
    /// {@return `pPresentIds`}
    public MemorySegment pPresentIds() { return pPresentIds(this.segment(), 0L); }
    /// Sets `pPresentIds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPresentIds(MemorySegment segment, long index, MemorySegment value) { VH_pPresentIds.set(segment, 0L, index, value); }
    /// Sets `pPresentIds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR pPresentIds(MemorySegment value) { pPresentIds(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentId2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentId2KHR`
    public VkPresentId2KHR asSlice(long index) { return new VkPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentId2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentId2KHR`
    public VkPresentId2KHR asSlice(long index, long count) { return new VkPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentId2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentId2KHR at(long index, Consumer<VkPresentId2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

    /// {@return `pPresentIds` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPresentIdsAt(long index) { return pPresentIds(this.segment(), index); }
    /// Sets `pPresentIds` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentId2KHR pPresentIdsAt(long index, MemorySegment value) { pPresentIds(this.segment(), index, value); return this; }

}
