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
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkDisplayModeParametersKHR {
///     (struct VkExtent2D) VkExtent2D visibleRegion;
///     uint32_t refreshRate;
/// };
/// ```
public sealed class VkDisplayModeParametersKHR extends GroupType {
    /// The struct layout of `VkDisplayModeParametersKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    /// The byte offset of `visibleRegion`.
    public static final long OFFSET_visibleRegion = LAYOUT.byteOffset(PathElement.groupElement("visibleRegion"));
    /// The memory layout of `visibleRegion`.
    public static final MemoryLayout LAYOUT_visibleRegion = LAYOUT.select(PathElement.groupElement("visibleRegion"));
    /// The byte offset of `refreshRate`.
    public static final long OFFSET_refreshRate = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
    /// The memory layout of `refreshRate`.
    public static final MemoryLayout LAYOUT_refreshRate = LAYOUT.select(PathElement.groupElement("refreshRate"));
    /// The [VarHandle] of `refreshRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate"));

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModeParametersKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param visibleRegion `visibleRegion`
    /// @param refreshRate `refreshRate`
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR allocInit(SegmentAllocator allocator, MemorySegment visibleRegion, int refreshRate) {
        return alloc(allocator).visibleRegion(visibleRegion).refreshRate(refreshRate);
    }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param visibleRegion `visibleRegion`
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR allocInit(SegmentAllocator allocator, MemorySegment visibleRegion) {
        return alloc(allocator).visibleRegion(visibleRegion);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModeParametersKHR copyFrom(VkDisplayModeParametersKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `visibleRegion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment visibleRegion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_visibleRegion, index), LAYOUT_visibleRegion); }
    /// {@return `visibleRegion`}
    public MemorySegment visibleRegion() { return visibleRegion(this.segment(), 0L); }
    /// Sets `visibleRegion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void visibleRegion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_visibleRegion, index), LAYOUT_visibleRegion.byteSize()); }
    /// Sets `visibleRegion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegion(MemorySegment value) { visibleRegion(this.segment(), 0L, value); return this; }
    /// Accepts `visibleRegion` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegion(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(visibleRegion())); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int refreshRate(MemorySegment segment, long index) { return (int) VH_refreshRate.get(segment, 0L, index); }
    /// {@return `refreshRate`}
    public int refreshRate() { return refreshRate(this.segment(), 0L); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refreshRate(MemorySegment segment, long index, int value) { VH_refreshRate.set(segment, 0L, index, value); }
    /// Sets `refreshRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR refreshRate(int value) { refreshRate(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDisplayModeParametersKHR].
    public static final class Buffer extends VkDisplayModeParametersKHR {
        private final long elementCount;

        /// Creates `VkDisplayModeParametersKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayModeParametersKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayModeParametersKHR`
        public VkDisplayModeParametersKHR asSlice(long index) { return new VkDisplayModeParametersKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayModeParametersKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayModeParametersKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `visibleRegion` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment visibleRegionAt(long index) { return visibleRegion(this.segment(), index); }
        /// Sets `visibleRegion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer visibleRegionAt(long index, MemorySegment value) { visibleRegion(this.segment(), index, value); return this; }
        /// Accepts `visibleRegion` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer visibleRegionAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(visibleRegionAt(index))); return this; }

        /// {@return `refreshRate` at the given index}
        /// @param index the index of the struct buffer
        public int refreshRateAt(long index) { return refreshRate(this.segment(), index); }
        /// Sets `refreshRate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer refreshRateAt(long index, int value) { refreshRate(this.segment(), index, value); return this; }

    }
}
