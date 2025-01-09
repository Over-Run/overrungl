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
/// ### shadingRateImageEnable
/// [VarHandle][#VH_shadingRateImageEnable] - [Getter][#shadingRateImageEnable()] - [Setter][#shadingRateImageEnable(int)]
/// ### viewportCount
/// [VarHandle][#VH_viewportCount] - [Getter][#viewportCount()] - [Setter][#viewportCount(int)]
/// ### pShadingRatePalettes
/// [VarHandle][#VH_pShadingRatePalettes] - [Getter][#pShadingRatePalettes()] - [Setter][#pShadingRatePalettes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 shadingRateImageEnable;
///     uint32_t viewportCount;
///     const VkShadingRatePaletteNV * pShadingRatePalettes;
/// } VkPipelineViewportShadingRateImageStateCreateInfoNV;
/// ```
public final class VkPipelineViewportShadingRateImageStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePalettes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shadingRateImageEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateImageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImageEnable"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `pShadingRatePalettes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShadingRatePalettes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePalettes"));

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shadingRateImageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shadingRateImageEnable(MemorySegment segment, long index) { return (int) VH_shadingRateImageEnable.get(segment, 0L, index); }
    /// {@return `shadingRateImageEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shadingRateImageEnable(MemorySegment segment) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_shadingRateImageEnable(segment, 0L); }
    /// {@return `shadingRateImageEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shadingRateImageEnableAt(long index) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_shadingRateImageEnable(this.segment(), index); }
    /// {@return `shadingRateImageEnable`}
    public @CType("VkBool32") int shadingRateImageEnable() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_shadingRateImageEnable(this.segment()); }
    /// Sets `shadingRateImageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateImageEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shadingRateImageEnable.set(segment, 0L, index, value); }
    /// Sets `shadingRateImageEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateImageEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_shadingRateImageEnable(segment, 0L, value); }
    /// Sets `shadingRateImageEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnableAt(long index, @CType("VkBool32") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_shadingRateImageEnable(this.segment(), index, value); return this; }
    /// Sets `shadingRateImageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(@CType("VkBool32") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_shadingRateImageEnable(this.segment(), value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_viewportCount(segment, 0L); }
    /// {@return `viewportCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewportCountAt(long index) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_viewportCount(this.segment(), index); }
    /// {@return `viewportCount`}
    public @CType("uint32_t") int viewportCount() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_viewportCount(this.segment()); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_viewportCount(segment, 0L, value); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_viewportCount(this.segment(), index, value); return this; }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(@CType("uint32_t") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_viewportCount(this.segment(), value); return this; }

    /// {@return `pShadingRatePalettes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment get_pShadingRatePalettes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShadingRatePalettes.get(segment, 0L, index); }
    /// {@return `pShadingRatePalettes`}
    /// @param segment the segment of the struct
    public static @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment get_pShadingRatePalettes(MemorySegment segment) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pShadingRatePalettes(segment, 0L); }
    /// {@return `pShadingRatePalettes` at the given index}
    /// @param index the index
    public @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment pShadingRatePalettesAt(long index) { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pShadingRatePalettes(this.segment(), index); }
    /// {@return `pShadingRatePalettes`}
    public @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment pShadingRatePalettes() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.get_pShadingRatePalettes(this.segment()); }
    /// Sets `pShadingRatePalettes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShadingRatePalettes(MemorySegment segment, long index, @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment value) { VH_pShadingRatePalettes.set(segment, 0L, index, value); }
    /// Sets `pShadingRatePalettes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShadingRatePalettes(MemorySegment segment, @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pShadingRatePalettes(segment, 0L, value); }
    /// Sets `pShadingRatePalettes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettesAt(long index, @CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pShadingRatePalettes(this.segment(), index, value); return this; }
    /// Sets `pShadingRatePalettes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(@CType("const VkShadingRatePaletteNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.set_pShadingRatePalettes(this.segment(), value); return this; }

}
