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
/// struct VkPresentRegionKHR {
///     uint32_t rectangleCount;
///     const VkRectLayerKHR* pRectangles;
/// };
/// ```
public final class VkPresentRegionKHR extends GroupType {
    /// The struct layout of `VkPresentRegionKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withName("pRectangles")
    );
    /// The byte offset of `rectangleCount`.
    public static final long OFFSET_rectangleCount = LAYOUT.byteOffset(PathElement.groupElement("rectangleCount"));
    /// The memory layout of `rectangleCount`.
    public static final MemoryLayout LAYOUT_rectangleCount = LAYOUT.select(PathElement.groupElement("rectangleCount"));
    /// The [VarHandle] of `rectangleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangleCount"));
    /// The byte offset of `pRectangles`.
    public static final long OFFSET_pRectangles = LAYOUT.byteOffset(PathElement.groupElement("pRectangles"));
    /// The memory layout of `pRectangles`.
    public static final MemoryLayout LAYOUT_pRectangles = LAYOUT.select(PathElement.groupElement("pRectangles"));
    /// The [VarHandle] of `pRectangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRectangles"));

    /// Creates `VkPresentRegionKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentRegionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param rectangleCount `rectangleCount`
    /// @param pRectangles `pRectangles`
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR allocInit(SegmentAllocator allocator, int rectangleCount, MemorySegment pRectangles) {
        return alloc(allocator).rectangleCount(rectangleCount).pRectangles(pRectangles);
    }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param rectangleCount `rectangleCount`
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR allocInit(SegmentAllocator allocator, int rectangleCount) {
        return alloc(allocator).rectangleCount(rectangleCount);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentRegionKHR copyFrom(VkPresentRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentRegionKHR reinterpret(long count) { return new VkPresentRegionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `rectangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rectangleCount(MemorySegment segment, long index) { return (int) VH_rectangleCount.get(segment, 0L, index); }
    /// {@return `rectangleCount`}
    public int rectangleCount() { return rectangleCount(this.segment(), 0L); }
    /// Sets `rectangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rectangleCount(MemorySegment segment, long index, int value) { VH_rectangleCount.set(segment, 0L, index, value); }
    /// Sets `rectangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR rectangleCount(int value) { rectangleCount(this.segment(), 0L, value); return this; }

    /// {@return `pRectangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRectangles(MemorySegment segment, long index) { return (MemorySegment) VH_pRectangles.get(segment, 0L, index); }
    /// {@return `pRectangles`}
    public MemorySegment pRectangles() { return pRectangles(this.segment(), 0L); }
    /// Sets `pRectangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRectangles(MemorySegment segment, long index, MemorySegment value) { VH_pRectangles.set(segment, 0L, index, value); }
    /// Sets `pRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR pRectangles(MemorySegment value) { pRectangles(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentRegionKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentRegionKHR`
    public VkPresentRegionKHR asSlice(long index) { return new VkPresentRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentRegionKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentRegionKHR`
    public VkPresentRegionKHR asSlice(long index, long count) { return new VkPresentRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentRegionKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentRegionKHR at(long index, Consumer<VkPresentRegionKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `rectangleCount` at the given index}
    /// @param index the index of the struct buffer
    public int rectangleCountAt(long index) { return rectangleCount(this.segment(), index); }
    /// Sets `rectangleCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR rectangleCountAt(long index, int value) { rectangleCount(this.segment(), index, value); return this; }

    /// {@return `pRectangles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRectanglesAt(long index) { return pRectangles(this.segment(), index); }
    /// Sets `pRectangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR pRectanglesAt(long index, MemorySegment value) { pRectangles(this.segment(), index, value); return this; }

}
