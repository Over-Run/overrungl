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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCoarseSampleOrderCustomNV {
///     (int) VkShadingRatePaletteEntryNV shadingRate;
///     uint32_t sampleCount;
///     uint32_t sampleLocationCount;
///     const VkCoarseSampleLocationNV* pSampleLocations;
/// };
/// ```
public final class VkCoarseSampleOrderCustomNV extends GroupType {
    /// The struct layout of `VkCoarseSampleOrderCustomNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
    );
    /// The byte offset of `shadingRate`.
    public static final long OFFSET_shadingRate = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
    /// The memory layout of `shadingRate`.
    public static final MemoryLayout LAYOUT_shadingRate = LAYOUT.select(PathElement.groupElement("shadingRate"));
    /// The [VarHandle] of `shadingRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    /// The byte offset of `sampleCount`.
    public static final long OFFSET_sampleCount = LAYOUT.byteOffset(PathElement.groupElement("sampleCount"));
    /// The memory layout of `sampleCount`.
    public static final MemoryLayout LAYOUT_sampleCount = LAYOUT.select(PathElement.groupElement("sampleCount"));
    /// The [VarHandle] of `sampleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCount"));
    /// The byte offset of `sampleLocationCount`.
    public static final long OFFSET_sampleLocationCount = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCount"));
    /// The memory layout of `sampleLocationCount`.
    public static final MemoryLayout LAYOUT_sampleLocationCount = LAYOUT.select(PathElement.groupElement("sampleLocationCount"));
    /// The [VarHandle] of `sampleLocationCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationCount"));
    /// The byte offset of `pSampleLocations`.
    public static final long OFFSET_pSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
    /// The memory layout of `pSampleLocations`.
    public static final MemoryLayout LAYOUT_pSampleLocations = LAYOUT.select(PathElement.groupElement("pSampleLocations"));
    /// The [VarHandle] of `pSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCoarseSampleOrderCustomNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCoarseSampleOrderCustomNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCoarseSampleOrderCustomNV copyFrom(VkCoarseSampleOrderCustomNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCoarseSampleOrderCustomNV reinterpret(long count) { return new VkCoarseSampleOrderCustomNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `shadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRate(MemorySegment segment, long index) { return (int) VH_shadingRate.get(segment, 0L, index); }
    /// {@return `shadingRate`}
    public int shadingRate() { return shadingRate(this.segment(), 0L); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRate(MemorySegment segment, long index, int value) { VH_shadingRate.set(segment, 0L, index, value); }
    /// Sets `shadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV shadingRate(int value) { shadingRate(this.segment(), 0L, value); return this; }

    /// {@return `sampleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleCount(MemorySegment segment, long index) { return (int) VH_sampleCount.get(segment, 0L, index); }
    /// {@return `sampleCount`}
    public int sampleCount() { return sampleCount(this.segment(), 0L); }
    /// Sets `sampleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleCount(MemorySegment segment, long index, int value) { VH_sampleCount.set(segment, 0L, index, value); }
    /// Sets `sampleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleCount(int value) { sampleCount(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationCount(MemorySegment segment, long index) { return (int) VH_sampleLocationCount.get(segment, 0L, index); }
    /// {@return `sampleLocationCount`}
    public int sampleLocationCount() { return sampleLocationCount(this.segment(), 0L); }
    /// Sets `sampleLocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationCount(MemorySegment segment, long index, int value) { VH_sampleLocationCount.set(segment, 0L, index, value); }
    /// Sets `sampleLocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleLocationCount(int value) { sampleLocationCount(this.segment(), 0L, value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSampleLocations(MemorySegment segment, long index) { return (MemorySegment) VH_pSampleLocations.get(segment, 0L, index); }
    /// {@return `pSampleLocations`}
    public MemorySegment pSampleLocations() { return pSampleLocations(this.segment(), 0L); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSampleLocations(MemorySegment segment, long index, MemorySegment value) { VH_pSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV pSampleLocations(MemorySegment value) { pSampleLocations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCoarseSampleOrderCustomNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCoarseSampleOrderCustomNV`
    public VkCoarseSampleOrderCustomNV asSlice(long index) { return new VkCoarseSampleOrderCustomNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCoarseSampleOrderCustomNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCoarseSampleOrderCustomNV`
    public VkCoarseSampleOrderCustomNV asSlice(long index, long count) { return new VkCoarseSampleOrderCustomNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCoarseSampleOrderCustomNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCoarseSampleOrderCustomNV at(long index, Consumer<VkCoarseSampleOrderCustomNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `shadingRate` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateAt(long index) { return shadingRate(this.segment(), index); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV shadingRateAt(long index, int value) { shadingRate(this.segment(), index, value); return this; }

    /// {@return `sampleCount` at the given index}
    /// @param index the index of the struct buffer
    public int sampleCountAt(long index) { return sampleCount(this.segment(), index); }
    /// Sets `sampleCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleCountAt(long index, int value) { sampleCount(this.segment(), index, value); return this; }

    /// {@return `sampleLocationCount` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationCountAt(long index) { return sampleLocationCount(this.segment(), index); }
    /// Sets `sampleLocationCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV sampleLocationCountAt(long index, int value) { sampleLocationCount(this.segment(), index, value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSampleLocationsAt(long index) { return pSampleLocations(this.segment(), index); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV pSampleLocationsAt(long index, MemorySegment value) { pSampleLocations(this.segment(), index, value); return this; }

}
