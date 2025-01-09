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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### shadingRateTexelSize
/// [Byte offset][#OFFSET_shadingRateTexelSize] - [Memory layout][#ML_shadingRateTexelSize] - [Getter][#shadingRateTexelSize()] - [Setter][#shadingRateTexelSize(java.lang.foreign.MemorySegment)]
/// ### shadingRatePaletteSize
/// [VarHandle][#VH_shadingRatePaletteSize] - [Getter][#shadingRatePaletteSize()] - [Setter][#shadingRatePaletteSize(int)]
/// ### shadingRateMaxCoarseSamples
/// [VarHandle][#VH_shadingRateMaxCoarseSamples] - [Getter][#shadingRateMaxCoarseSamples()] - [Setter][#shadingRateMaxCoarseSamples(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShadingRateImagePropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D shadingRateTexelSize;
///     uint32_t shadingRatePaletteSize;
///     uint32_t shadingRateMaxCoarseSamples;
/// } VkPhysicalDeviceShadingRateImagePropertiesNV;
/// ```
public final class VkPhysicalDeviceShadingRateImagePropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceShadingRateImagePropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `shadingRateTexelSize`.
    public static final long OFFSET_shadingRateTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateTexelSize"));
    /// The memory layout of `shadingRateTexelSize`.
    public static final MemoryLayout ML_shadingRateTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateTexelSize"));
    /// The [VarHandle] of `shadingRatePaletteSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRatePaletteSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteSize"));
    /// The [VarHandle] of `shadingRateMaxCoarseSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateMaxCoarseSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateMaxCoarseSamples"));

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImagePropertiesNV`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImagePropertiesNV`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shadingRateTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_shadingRateTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateTexelSize, index), ML_shadingRateTexelSize); }
    /// {@return `shadingRateTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_shadingRateTexelSize(MemorySegment segment) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateTexelSize(segment, 0L); }
    /// {@return `shadingRateTexelSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment shadingRateTexelSizeAt(long index) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateTexelSize(this.segment(), index); }
    /// {@return `shadingRateTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment shadingRateTexelSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateTexelSize(this.segment()); }
    /// Sets `shadingRateTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateTexelSize, index), ML_shadingRateTexelSize.byteSize()); }
    /// Sets `shadingRateTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateTexelSize(segment, 0L, value); }
    /// Sets `shadingRateTexelSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateTexelSize(this.segment(), index, value); return this; }
    /// Sets `shadingRateTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateTexelSize(this.segment(), value); return this; }

    /// {@return `shadingRatePaletteSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shadingRatePaletteSize(MemorySegment segment, long index) { return (int) VH_shadingRatePaletteSize.get(segment, 0L, index); }
    /// {@return `shadingRatePaletteSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shadingRatePaletteSize(MemorySegment segment) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRatePaletteSize(segment, 0L); }
    /// {@return `shadingRatePaletteSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shadingRatePaletteSizeAt(long index) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRatePaletteSize(this.segment(), index); }
    /// {@return `shadingRatePaletteSize`}
    public @CType("uint32_t") int shadingRatePaletteSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRatePaletteSize(this.segment()); }
    /// Sets `shadingRatePaletteSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRatePaletteSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shadingRatePaletteSize.set(segment, 0L, index, value); }
    /// Sets `shadingRatePaletteSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRatePaletteSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRatePaletteSize(segment, 0L, value); }
    /// Sets `shadingRatePaletteSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRatePaletteSize(this.segment(), index, value); return this; }
    /// Sets `shadingRatePaletteSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSize(@CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRatePaletteSize(this.segment(), value); return this; }

    /// {@return `shadingRateMaxCoarseSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shadingRateMaxCoarseSamples(MemorySegment segment, long index) { return (int) VH_shadingRateMaxCoarseSamples.get(segment, 0L, index); }
    /// {@return `shadingRateMaxCoarseSamples`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shadingRateMaxCoarseSamples(MemorySegment segment) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateMaxCoarseSamples(segment, 0L); }
    /// {@return `shadingRateMaxCoarseSamples` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shadingRateMaxCoarseSamplesAt(long index) { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateMaxCoarseSamples(this.segment(), index); }
    /// {@return `shadingRateMaxCoarseSamples`}
    public @CType("uint32_t") int shadingRateMaxCoarseSamples() { return VkPhysicalDeviceShadingRateImagePropertiesNV.get_shadingRateMaxCoarseSamples(this.segment()); }
    /// Sets `shadingRateMaxCoarseSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateMaxCoarseSamples(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shadingRateMaxCoarseSamples.set(segment, 0L, index, value); }
    /// Sets `shadingRateMaxCoarseSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateMaxCoarseSamples(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateMaxCoarseSamples(segment, 0L, value); }
    /// Sets `shadingRateMaxCoarseSamples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamplesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateMaxCoarseSamples(this.segment(), index, value); return this; }
    /// Sets `shadingRateMaxCoarseSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamples(@CType("uint32_t") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.set_shadingRateMaxCoarseSamples(this.segment(), value); return this; }

}
