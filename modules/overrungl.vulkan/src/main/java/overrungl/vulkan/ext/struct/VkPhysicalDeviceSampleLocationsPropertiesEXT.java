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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### sampleLocationSampleCounts
/// [VarHandle][#VH_sampleLocationSampleCounts] - [Getter][#sampleLocationSampleCounts()] - [Setter][#sampleLocationSampleCounts(int)]
/// ### maxSampleLocationGridSize
/// [Byte offset][#OFFSET_maxSampleLocationGridSize] - [Memory layout][#ML_maxSampleLocationGridSize] - [Getter][#maxSampleLocationGridSize()] - [Setter][#maxSampleLocationGridSize(java.lang.foreign.MemorySegment)]
/// ### sampleLocationCoordinateRange
/// [Byte offset][#OFFSET_sampleLocationCoordinateRange] - [Memory layout][#ML_sampleLocationCoordinateRange] - [Getter][#sampleLocationCoordinateRange()] - [Setter][#sampleLocationCoordinateRange(java.lang.foreign.MemorySegment)]
/// ### sampleLocationSubPixelBits
/// [VarHandle][#VH_sampleLocationSubPixelBits] - [Getter][#sampleLocationSubPixelBits()] - [Setter][#sampleLocationSubPixelBits(int)]
/// ### variableSampleLocations
/// [VarHandle][#VH_variableSampleLocations] - [Getter][#variableSampleLocations()] - [Setter][#variableSampleLocations(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkSampleCountFlags sampleLocationSampleCounts;
///     VkExtent2D maxSampleLocationGridSize;
///     float[2] sampleLocationCoordinateRange;
///     uint32_t sampleLocationSubPixelBits;
///     VkBool32 variableSampleLocations;
/// } VkPhysicalDeviceSampleLocationsPropertiesEXT;
/// ```
public final class VkPhysicalDeviceSampleLocationsPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampleLocationSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSampleCounts"));
    /// The byte offset of `maxSampleLocationGridSize`.
    public static final long OFFSET_maxSampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
    /// The memory layout of `maxSampleLocationGridSize`.
    public static final MemoryLayout ML_maxSampleLocationGridSize = LAYOUT.select(PathElement.groupElement("maxSampleLocationGridSize"));
    /// The byte offset of `sampleLocationCoordinateRange`.
    public static final long OFFSET_sampleLocationCoordinateRange = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCoordinateRange"));
    /// The memory layout of `sampleLocationCoordinateRange`.
    public static final MemoryLayout ML_sampleLocationCoordinateRange = LAYOUT.select(PathElement.groupElement("sampleLocationCoordinateRange"));
    /// The [VarHandle] of `sampleLocationSubPixelBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSubPixelBits"));
    /// The [VarHandle] of `variableSampleLocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variableSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableSampleLocations"));

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `sampleLocationSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampleLocationSampleCounts(MemorySegment segment, long index) { return (int) VH_sampleLocationSampleCounts.get(segment, 0L, index); }
    /// {@return `sampleLocationSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampleLocationSampleCounts(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSampleCounts(segment, 0L); }
    /// {@return `sampleLocationSampleCounts` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlags") int sampleLocationSampleCountsAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSampleCounts(this.segment(), index); }
    /// {@return `sampleLocationSampleCounts`}
    public @CType("VkSampleCountFlags") int sampleLocationSampleCounts() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSampleCounts(this.segment()); }
    /// Sets `sampleLocationSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampleLocationSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleLocationSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSampleCounts(segment, 0L, value); }
    /// Sets `sampleLocationSampleCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSampleCounts(this.segment(), index, value); return this; }
    /// Sets `sampleLocationSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSampleCounts(this.segment(), value); return this; }

    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSampleLocationGridSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), ML_maxSampleLocationGridSize); }
    /// {@return `maxSampleLocationGridSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSampleLocationGridSize(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_maxSampleLocationGridSize(segment, 0L); }
    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSampleLocationGridSizeAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_maxSampleLocationGridSize(this.segment(), index); }
    /// {@return `maxSampleLocationGridSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSampleLocationGridSize() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_maxSampleLocationGridSize(this.segment()); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSampleLocationGridSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), ML_maxSampleLocationGridSize.byteSize()); }
    /// Sets `maxSampleLocationGridSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSampleLocationGridSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_maxSampleLocationGridSize(segment, 0L, value); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_maxSampleLocationGridSize(this.segment(), index, value); return this; }
    /// Sets `maxSampleLocationGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_maxSampleLocationGridSize(this.segment(), value); return this; }

    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_sampleLocationCoordinateRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationCoordinateRange, index), ML_sampleLocationCoordinateRange); }
    /// {@return `sampleLocationCoordinateRange`}
    /// @param segment the segment of the struct
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_sampleLocationCoordinateRange(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationCoordinateRange(segment, 0L); }
    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param index the index
    public @CType("float[2]") java.lang.foreign.MemorySegment sampleLocationCoordinateRangeAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationCoordinateRange(this.segment(), index); }
    /// {@return `sampleLocationCoordinateRange`}
    public @CType("float[2]") java.lang.foreign.MemorySegment sampleLocationCoordinateRange() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationCoordinateRange(this.segment()); }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationCoordinateRange(MemorySegment segment, long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationCoordinateRange, index), ML_sampleLocationCoordinateRange.byteSize()); }
    /// Sets `sampleLocationCoordinateRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationCoordinateRange(MemorySegment segment, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationCoordinateRange(segment, 0L, value); }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRangeAt(long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationCoordinateRange(this.segment(), index, value); return this; }
    /// Sets `sampleLocationCoordinateRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRange(@CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationCoordinateRange(this.segment(), value); return this; }

    /// {@return `sampleLocationSubPixelBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sampleLocationSubPixelBits(MemorySegment segment, long index) { return (int) VH_sampleLocationSubPixelBits.get(segment, 0L, index); }
    /// {@return `sampleLocationSubPixelBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sampleLocationSubPixelBits(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSubPixelBits(segment, 0L); }
    /// {@return `sampleLocationSubPixelBits` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sampleLocationSubPixelBitsAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSubPixelBits(this.segment(), index); }
    /// {@return `sampleLocationSubPixelBits`}
    public @CType("uint32_t") int sampleLocationSubPixelBits() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_sampleLocationSubPixelBits(this.segment()); }
    /// Sets `sampleLocationSubPixelBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationSubPixelBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sampleLocationSubPixelBits.set(segment, 0L, index, value); }
    /// Sets `sampleLocationSubPixelBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationSubPixelBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSubPixelBits(segment, 0L, value); }
    /// Sets `sampleLocationSubPixelBits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSubPixelBits(this.segment(), index, value); return this; }
    /// Sets `sampleLocationSubPixelBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBits(@CType("uint32_t") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_sampleLocationSubPixelBits(this.segment(), value); return this; }

    /// {@return `variableSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variableSampleLocations(MemorySegment segment, long index) { return (int) VH_variableSampleLocations.get(segment, 0L, index); }
    /// {@return `variableSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variableSampleLocations(MemorySegment segment) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_variableSampleLocations(segment, 0L); }
    /// {@return `variableSampleLocations` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variableSampleLocationsAt(long index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_variableSampleLocations(this.segment(), index); }
    /// {@return `variableSampleLocations`}
    public @CType("VkBool32") int variableSampleLocations() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.get_variableSampleLocations(this.segment()); }
    /// Sets `variableSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variableSampleLocations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variableSampleLocations.set(segment, 0L, index, value); }
    /// Sets `variableSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variableSampleLocations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_variableSampleLocations(segment, 0L, value); }
    /// Sets `variableSampleLocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_variableSampleLocations(this.segment(), index, value); return this; }
    /// Sets `variableSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocations(@CType("VkBool32") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.set_variableSampleLocations(this.segment(), value); return this; }

}
