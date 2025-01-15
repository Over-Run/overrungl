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
public sealed class VkCoarseSampleOrderCustomNV extends Struct {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCoarseSampleOrderCustomNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleOrderCustomNV`
    public static VkCoarseSampleOrderCustomNV allocInit(SegmentAllocator allocator, @CType("VkShadingRatePaletteEntryNV") int shadingRate, @CType("uint32_t") int sampleCount, @CType("uint32_t") int sampleLocationCount, @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment pSampleLocations) { return alloc(allocator).shadingRate(shadingRate).sampleCount(sampleCount).sampleLocationCount(sampleLocationCount).pSampleLocations(pSampleLocations); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCoarseSampleOrderCustomNV copyFrom(VkCoarseSampleOrderCustomNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `shadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShadingRatePaletteEntryNV") int get_shadingRate(MemorySegment segment, long index) { return (int) VH_shadingRate.get(segment, 0L, index); }
    /// {@return `shadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkShadingRatePaletteEntryNV") int get_shadingRate(MemorySegment segment) { return VkCoarseSampleOrderCustomNV.get_shadingRate(segment, 0L); }
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
    /// Sets `pSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleOrderCustomNV pSampleLocations(@CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VkCoarseSampleOrderCustomNV.set_pSampleLocations(this.segment(), value); return this; }

    /// A buffer of [VkCoarseSampleOrderCustomNV].
    public static final class Buffer extends VkCoarseSampleOrderCustomNV {
        private final long elementCount;

        /// Creates `VkCoarseSampleOrderCustomNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCoarseSampleOrderCustomNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCoarseSampleOrderCustomNV`
        public VkCoarseSampleOrderCustomNV asSlice(long index) { return new VkCoarseSampleOrderCustomNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCoarseSampleOrderCustomNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCoarseSampleOrderCustomNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `shadingRate` at the given index}
        /// @param index the index
        public @CType("VkShadingRatePaletteEntryNV") int shadingRateAt(long index) { return VkCoarseSampleOrderCustomNV.get_shadingRate(this.segment(), index); }
        /// Sets `shadingRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateAt(long index, @CType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.set_shadingRate(this.segment(), index, value); return this; }

        /// {@return `sampleCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sampleCountAt(long index) { return VkCoarseSampleOrderCustomNV.get_sampleCount(this.segment(), index); }
        /// Sets `sampleCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleCountAt(long index, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleCount(this.segment(), index, value); return this; }

        /// {@return `sampleLocationCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sampleLocationCountAt(long index) { return VkCoarseSampleOrderCustomNV.get_sampleLocationCount(this.segment(), index); }
        /// Sets `sampleLocationCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationCountAt(long index, @CType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.set_sampleLocationCount(this.segment(), index, value); return this; }

        /// {@return `pSampleLocations` at the given index}
        /// @param index the index
        public @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment pSampleLocationsAt(long index) { return VkCoarseSampleOrderCustomNV.get_pSampleLocations(this.segment(), index); }
        /// Sets `pSampleLocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSampleLocationsAt(long index, @CType("const VkCoarseSampleLocationNV *") java.lang.foreign.MemorySegment value) { VkCoarseSampleOrderCustomNV.set_pSampleLocations(this.segment(), index, value); return this; }

    }
}
