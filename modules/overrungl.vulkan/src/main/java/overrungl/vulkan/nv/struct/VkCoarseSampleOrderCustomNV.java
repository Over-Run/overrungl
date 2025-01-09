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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### shadingRate
/// [VarHandle][#VH_shadingRate] - [Getter][#shadingRate()] - [Setter][#shadingRate(int)]
/// ### sampleCount
/// [VarHandle][#VH_sampleCount] - [Getter][#sampleCount()] - [Setter][#sampleCount(int)]
/// ### sampleLocationCount
/// [VarHandle][#VH_sampleLocationCount] - [Getter][#sampleLocationCount()] - [Setter][#sampleLocationCount(int)]
/// ### pSampleLocations
/// [VarHandle][#VH_pSampleLocations] - [Getter][#pSampleLocations()] - [Setter][#pSampleLocations(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCoarseSampleOrderCustomNV {
///     VkShadingRatePaletteEntryNV shadingRate;
///     uint32_t sampleCount;
///     uint32_t sampleLocationCount;
///     const VkCoarseSampleLocationNV * pSampleLocations;
/// } VkCoarseSampleOrderCustomNV;
/// ```
public final class VkCoarseSampleOrderCustomNV extends Struct {
    /// The struct layout of `VkCoarseSampleOrderCustomNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
    );
    /// The [VarHandle] of `shadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    /// The [VarHandle] of `sampleCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCount"));
    /// The [VarHandle] of `sampleLocationCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationCount"));
    /// The [VarHandle] of `pSampleLocations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    /// @param segment the memory segment
    public VkCoarseSampleOrderCustomNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `shadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShadingRatePaletteEntryNV") int get_shadingRate(MemorySegment segment, long index) { return (int) VH_shadingRate.get(segment, 0L, index); }
    /// {@return `shadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkShadingRatePaletteEntryNV") int get_shadingRate(MemorySegment segment) { return VkCoarseSampleOrderCustomNV.get_shadingRate(segment, 0L); }
    /// {@return `shadingRate` at the given index}
    /// @param index the index
    public @CType("VkShadingRatePaletteEntryNV") int shadingRateAt(long index) { return VkCoarseSampleOrderCustomNV.get_shadingRate(this.segment(), index); }
    /// {@return `shadingRate`}
    public @CType("VkShadingRatePaletteEntryNV") int shadingRate() { return VkCoarseSampleOrderCustomNV.get_shadingRate(this.segment()); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRate(MemorySegment segment, long index, @CType("VkShadingRatePaletteEntryNV") int value) { VH_shadingRate.set(segment, 0L, index, value); }
    /// Sets `shadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRate(MemorySegment segment, @CType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.set_shadingRate(segment, 0L, value); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV shadingRateAt(long index, @CType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.set_shadingRate(this.segment(), index, value); return this; }
    /// Sets `shadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV shadingRate(@CType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.set_shadingRate(this.segment(), value); return this; }

    /// {@return `sampleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sampleCount(MemorySegment segment, long index) { return (int) VH_sampleCount.get(segment, 0L, index); }
    /// {@return `sampleCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sampleCount(MemorySegment segment) { return VkCoarseSampleOrderCustomNV.get_sampleCount(segment, 0L); }
    /// {@return `sampleCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sampleCountAt(long index) { return VkCoarseSampleOrderCustomNV.get_sampleCount(this.segment(), index); }
    /// {@return `sampleCount`}
    public @CType("uint32_t") int sampleCount() { return VkCoarseSampleOrderCustomNV.get_sampleCount(this.segment()); }
    /// Sets `sampleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sampleCount.set(segment, 0L, index, value); }
    /// Sets `sampleCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleCount(MemorySegment segment, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleCount(segment, 0L, value); }
    /// Sets `sampleCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleCountAt(long index, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleCount(this.segment(), index, value); return this; }
    /// Sets `sampleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleCount(@CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleCount(this.segment(), value); return this; }

    /// {@return `sampleLocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sampleLocationCount(MemorySegment segment, long index) { return (int) VH_sampleLocationCount.get(segment, 0L, index); }
    /// {@return `sampleLocationCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sampleLocationCount(MemorySegment segment) { return VkCoarseSampleOrderCustomNV.get_sampleLocationCount(segment, 0L); }
    /// {@return `sampleLocationCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sampleLocationCountAt(long index) { return VkCoarseSampleOrderCustomNV.get_sampleLocationCount(this.segment(), index); }
    /// {@return `sampleLocationCount`}
    public @CType("uint32_t") int sampleLocationCount() { return VkCoarseSampleOrderCustomNV.get_sampleLocationCount(this.segment()); }
    /// Sets `sampleLocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sampleLocationCount.set(segment, 0L, index, value); }
    /// Sets `sampleLocationCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationCount(MemorySegment segment, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleLocationCount(segment, 0L, value); }
    /// Sets `sampleLocationCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleLocationCountAt(long index, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleLocationCount(this.segment(), index, value); return this; }
    /// Sets `sampleLocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleLocationCount(@CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleLocationCount(this.segment(), value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment get_pSampleLocations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSampleLocations.get(segment, 0L, index); }
    /// {@return `pSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment get_pSampleLocations(MemorySegment segment) { return VkCoarseSampleOrderCustomNV.get_pSampleLocations(segment, 0L); }
    /// {@return `pSampleLocations` at the given index}
    /// @param index the index
    public @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment pSampleLocationsAt(long index) { return VkCoarseSampleOrderCustomNV.get_pSampleLocations(this.segment(), index); }
    /// {@return `pSampleLocations`}
    public @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment pSampleLocations() { return VkCoarseSampleOrderCustomNV.get_pSampleLocations(this.segment()); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSampleLocations(MemorySegment segment, long index, @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VH_pSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSampleLocations(MemorySegment segment, @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VkCoarseSampleOrderCustomNV.set_pSampleLocations(segment, 0L, value); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV pSampleLocationsAt(long index, @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VkCoarseSampleOrderCustomNV.set_pSampleLocations(this.segment(), index, value); return this; }
    /// Sets `pSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV pSampleLocations(@CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VkCoarseSampleOrderCustomNV.set_pSampleLocations(this.segment(), value); return this; }

}