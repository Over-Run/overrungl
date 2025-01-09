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
/// ### visibleRegion
/// [Byte offset][#OFFSET_visibleRegion] - [Memory layout][#ML_visibleRegion] - [Getter][#visibleRegion()] - [Setter][#visibleRegion(java.lang.foreign.MemorySegment)]
/// ### refreshRate
/// [VarHandle][#VH_refreshRate] - [Getter][#refreshRate()] - [Setter][#refreshRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayModeParametersKHR {
///     VkExtent2D visibleRegion;
///     uint32_t refreshRate;
/// } VkDisplayModeParametersKHR;
/// ```
public final class VkDisplayModeParametersKHR extends Struct {
    /// The struct layout of `VkDisplayModeParametersKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    /// The byte offset of `visibleRegion`.
    public static final long OFFSET_visibleRegion = LAYOUT.byteOffset(PathElement.groupElement("visibleRegion"));
    /// The memory layout of `visibleRegion`.
    public static final MemoryLayout ML_visibleRegion = LAYOUT.select(PathElement.groupElement("visibleRegion"));
    /// The [VarHandle] of `refreshRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate"));

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModeParametersKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `visibleRegion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_visibleRegion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_visibleRegion, index), ML_visibleRegion); }
    /// {@return `visibleRegion`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_visibleRegion(MemorySegment segment) { return VkDisplayModeParametersKHR.get_visibleRegion(segment, 0L); }
    /// {@return `visibleRegion` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment visibleRegionAt(long index) { return VkDisplayModeParametersKHR.get_visibleRegion(this.segment(), index); }
    /// {@return `visibleRegion`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment visibleRegion() { return VkDisplayModeParametersKHR.get_visibleRegion(this.segment()); }
    /// Sets `visibleRegion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_visibleRegion(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_visibleRegion, index), ML_visibleRegion.byteSize()); }
    /// Sets `visibleRegion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_visibleRegion(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayModeParametersKHR.set_visibleRegion(segment, 0L, value); }
    /// Sets `visibleRegion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegionAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayModeParametersKHR.set_visibleRegion(this.segment(), index, value); return this; }
    /// Sets `visibleRegion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegion(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayModeParametersKHR.set_visibleRegion(this.segment(), value); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_refreshRate(MemorySegment segment, long index) { return (int) VH_refreshRate.get(segment, 0L, index); }
    /// {@return `refreshRate`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_refreshRate(MemorySegment segment) { return VkDisplayModeParametersKHR.get_refreshRate(segment, 0L); }
    /// {@return `refreshRate` at the given index}
    /// @param index the index
    public @CType("uint32_t") int refreshRateAt(long index) { return VkDisplayModeParametersKHR.get_refreshRate(this.segment(), index); }
    /// {@return `refreshRate`}
    public @CType("uint32_t") int refreshRate() { return VkDisplayModeParametersKHR.get_refreshRate(this.segment()); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refreshRate(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_refreshRate.set(segment, 0L, index, value); }
    /// Sets `refreshRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refreshRate(MemorySegment segment, @CType("uint32_t") int value) { VkDisplayModeParametersKHR.set_refreshRate(segment, 0L, value); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR refreshRateAt(long index, @CType("uint32_t") int value) { VkDisplayModeParametersKHR.set_refreshRate(this.segment(), index, value); return this; }
    /// Sets `refreshRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR refreshRate(@CType("uint32_t") int value) { VkDisplayModeParametersKHR.set_refreshRate(this.segment(), value); return this; }

}
