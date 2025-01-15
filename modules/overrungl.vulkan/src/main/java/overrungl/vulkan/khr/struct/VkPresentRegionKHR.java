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
public sealed class VkPresentRegionKHR extends Struct {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentRegionKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentRegionKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionKHR`
    public static VkPresentRegionKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int rectangleCount, @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment pRectangles) { return alloc(allocator).rectangleCount(rectangleCount).pRectangles(pRectangles); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentRegionKHR copyFrom(VkPresentRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `rectangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_rectangleCount(MemorySegment segment, long index) { return (int) VH_rectangleCount.get(segment, 0L, index); }
    /// {@return `rectangleCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_rectangleCount(MemorySegment segment) { return VkPresentRegionKHR.get_rectangleCount(segment, 0L); }
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
    /// Sets `pRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionKHR pRectangles(@CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionKHR.set_pRectangles(this.segment(), value); return this; }

    /// A buffer of [VkPresentRegionKHR].
    public static final class Buffer extends VkPresentRegionKHR {
        private final long elementCount;

        /// Creates `VkPresentRegionKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPresentRegionKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPresentRegionKHR`
        public VkPresentRegionKHR asSlice(long index) { return new VkPresentRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPresentRegionKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPresentRegionKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `rectangleCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int rectangleCountAt(long index) { return VkPresentRegionKHR.get_rectangleCount(this.segment(), index); }
        /// Sets `rectangleCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rectangleCountAt(long index, @CType("uint32_t") int value) { VkPresentRegionKHR.set_rectangleCount(this.segment(), index, value); return this; }

        /// {@return `pRectangles` at the given index}
        /// @param index the index
        public @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment pRectanglesAt(long index) { return VkPresentRegionKHR.get_pRectangles(this.segment(), index); }
        /// Sets `pRectangles` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRectanglesAt(long index, @CType("const VkRectLayerKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionKHR.set_pRectangles(this.segment(), index, value); return this; }

    }
}
