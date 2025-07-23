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
/// struct VkSurfacePresentModeCompatibilityKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t presentModeCount;
///     VkPresentModeKHR* pPresentModes;
/// };
/// ```
public final class VkSurfacePresentModeCompatibilityKHR extends GroupType {
    /// The struct layout of `VkSurfacePresentModeCompatibilityKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
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
    /// The byte offset of `presentModeCount`.
    public static final long OFFSET_presentModeCount = LAYOUT.byteOffset(PathElement.groupElement("presentModeCount"));
    /// The memory layout of `presentModeCount`.
    public static final MemoryLayout LAYOUT_presentModeCount = LAYOUT.select(PathElement.groupElement("presentModeCount"));
    /// The [VarHandle] of `presentModeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentModeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeCount"));
    /// The byte offset of `pPresentModes`.
    public static final long OFFSET_pPresentModes = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
    /// The memory layout of `pPresentModes`.
    public static final MemoryLayout LAYOUT_pPresentModes = LAYOUT.select(PathElement.groupElement("pPresentModes"));
    /// The [VarHandle] of `pPresentModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    /// Creates `VkSurfacePresentModeCompatibilityKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfacePresentModeCompatibilityKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfacePresentModeCompatibilityKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentModeCompatibilityKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfacePresentModeCompatibilityKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeCompatibilityKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentModeCompatibilityKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentModeCount `presentModeCount`
    /// @param pPresentModes `pPresentModes`
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int presentModeCount, MemorySegment pPresentModes) {
        return alloc(allocator).sType(sType).pNext(pNext).presentModeCount(presentModeCount).pPresentModes(pPresentModes);
    }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentModeCount `presentModeCount`
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int presentModeCount) {
        return alloc(allocator).sType(sType).pNext(pNext).presentModeCount(presentModeCount);
    }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSurfacePresentModeCompatibilityKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSurfacePresentModeCompatibilityKHR`
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR copyFrom(VkSurfacePresentModeCompatibilityKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfacePresentModeCompatibilityKHR reinterpret(long count) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSurfacePresentModeCompatibilityKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfacePresentModeCompatibilityKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentModeCount(MemorySegment segment, long index) { return (int) VH_presentModeCount.get(segment, 0L, index); }
    /// {@return `presentModeCount`}
    public int presentModeCount() { return presentModeCount(this.segment(), 0L); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentModeCount(MemorySegment segment, long index, int value) { VH_presentModeCount.set(segment, 0L, index, value); }
    /// Sets `presentModeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR presentModeCount(int value) { presentModeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPresentModes(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentModes.get(segment, 0L, index); }
    /// {@return `pPresentModes`}
    public MemorySegment pPresentModes() { return pPresentModes(this.segment(), 0L); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPresentModes(MemorySegment segment, long index, MemorySegment value) { VH_pPresentModes.set(segment, 0L, index, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR pPresentModes(MemorySegment value) { pPresentModes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSurfacePresentModeCompatibilityKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfacePresentModeCompatibilityKHR`
    public VkSurfacePresentModeCompatibilityKHR asSlice(long index) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfacePresentModeCompatibilityKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfacePresentModeCompatibilityKHR`
    public VkSurfacePresentModeCompatibilityKHR asSlice(long index, long count) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfacePresentModeCompatibilityKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR at(long index, Consumer<VkSurfacePresentModeCompatibilityKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param index the index of the struct buffer
    public int presentModeCountAt(long index) { return presentModeCount(this.segment(), index); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR presentModeCountAt(long index, int value) { presentModeCount(this.segment(), index, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPresentModesAt(long index) { return pPresentModes(this.segment(), index); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityKHR pPresentModesAt(long index, MemorySegment value) { pPresentModes(this.segment(), index, value); return this; }

}
