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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### rectangleCount
/// [VarHandle][#VH_rectangleCount] - [Getter][#rectangleCount()] - [Setter][#rectangleCount(int)]
/// ### pRectangles
/// [VarHandle][#VH_pRectangles] - [Getter][#pRectangles()] - [Setter][#pRectangles(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPresentRegionKHR {
///     uint32_t rectangleCount;
///     const VkRectLayerKHR * pRectangles;
/// } VkPresentRegionKHR;
/// ```
public final class VkPresentRegionKHR extends Struct {
    /// The struct layout of `VkPresentRegionKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withName("pRectangles")
    );
    /// The [VarHandle] of `rectangleCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangleCount"));
    /// The [VarHandle] of `pRectangles` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRectangles"));

    /// Creates `VkPresentRegionKHR` with the given segment.
    /// @param segment the memory segment
    public VkPresentRegionKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPresentRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `rectangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_rectangleCount(MemorySegment segment, long index) { return (int) VH_rectangleCount.get(segment, 0L, index); }
    /// {@return `rectangleCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_rectangleCount(MemorySegment segment) { return VkPresentRegionKHR.get_rectangleCount(segment, 0L); }
    /// {@return `rectangleCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int rectangleCountAt(long index) { return VkPresentRegionKHR.get_rectangleCount(this.segment(), index); }
    /// {@return `rectangleCount`}
    public @CType("uint32_t") int rectangleCount() { return VkPresentRegionKHR.get_rectangleCount(this.segment()); }
    /// Sets `rectangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rectangleCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_rectangleCount.set(segment, 0L, index, value); }
    /// Sets `rectangleCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rectangleCount(MemorySegment segment, @CType("uint32_t") int value) { VkPresentRegionKHR.set_rectangleCount(segment, 0L, value); }
    /// Sets `rectangleCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR rectangleCountAt(long index, @CType("uint32_t") int value) { VkPresentRegionKHR.set_rectangleCount(this.segment(), index, value); return this; }
    /// Sets `rectangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR rectangleCount(@CType("uint32_t") int value) { VkPresentRegionKHR.set_rectangleCount(this.segment(), value); return this; }

    /// {@return `pRectangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment get_pRectangles(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRectangles.get(segment, 0L, index); }
    /// {@return `pRectangles`}
    /// @param segment the segment of the struct
    public static @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment get_pRectangles(MemorySegment segment) { return VkPresentRegionKHR.get_pRectangles(segment, 0L); }
    /// {@return `pRectangles` at the given index}
    /// @param index the index
    public @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment pRectanglesAt(long index) { return VkPresentRegionKHR.get_pRectangles(this.segment(), index); }
    /// {@return `pRectangles`}
    public @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment pRectangles() { return VkPresentRegionKHR.get_pRectangles(this.segment()); }
    /// Sets `pRectangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRectangles(MemorySegment segment, long index, @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VH_pRectangles.set(segment, 0L, index, value); }
    /// Sets `pRectangles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRectangles(MemorySegment segment, @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionKHR.set_pRectangles(segment, 0L, value); }
    /// Sets `pRectangles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR pRectanglesAt(long index, @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionKHR.set_pRectangles(this.segment(), index, value); return this; }
    /// Sets `pRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR pRectangles(@CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionKHR.set_pRectangles(this.segment(), value); return this; }

}
