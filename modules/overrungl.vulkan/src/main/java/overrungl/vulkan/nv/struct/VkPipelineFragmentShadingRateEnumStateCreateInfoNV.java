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
/// ### shadingRateType
/// [VarHandle][#VH_shadingRateType] - [Getter][#shadingRateType()] - [Setter][#shadingRateType(int)]
/// ### shadingRate
/// [VarHandle][#VH_shadingRate] - [Getter][#shadingRate()] - [Setter][#shadingRate(int)]
/// ### combinerOps
/// [VarHandle][#VH_combinerOps] - [Getter][#combinerOps()] - [Setter][#combinerOps(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkFragmentShadingRateTypeNV shadingRateType;
///     VkFragmentShadingRateNV shadingRate;
///     VkFragmentShadingRateCombinerOpKHR combinerOps;
/// } VkPipelineFragmentShadingRateEnumStateCreateInfoNV;
/// ```
public final class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("combinerOps")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shadingRateType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateType"));
    /// The [VarHandle] of `shadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    /// The [VarHandle] of `combinerOps` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_combinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"));

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shadingRateType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFragmentShadingRateTypeNV") int get_shadingRateType(MemorySegment segment, long index) { return (int) VH_shadingRateType.get(segment, 0L, index); }
    /// {@return `shadingRateType`}
    /// @param segment the segment of the struct
    public static @CType("VkFragmentShadingRateTypeNV") int get_shadingRateType(MemorySegment segment) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRateType(segment, 0L); }
    /// {@return `shadingRateType` at the given index}
    /// @param index the index
    public @CType("VkFragmentShadingRateTypeNV") int shadingRateTypeAt(long index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRateType(this.segment(), index); }
    /// {@return `shadingRateType`}
    public @CType("VkFragmentShadingRateTypeNV") int shadingRateType() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRateType(this.segment()); }
    /// Sets `shadingRateType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateType(MemorySegment segment, long index, @CType("VkFragmentShadingRateTypeNV") int value) { VH_shadingRateType.set(segment, 0L, index, value); }
    /// Sets `shadingRateType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateType(MemorySegment segment, @CType("VkFragmentShadingRateTypeNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRateType(segment, 0L, value); }
    /// Sets `shadingRateType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateTypeAt(long index, @CType("VkFragmentShadingRateTypeNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRateType(this.segment(), index, value); return this; }
    /// Sets `shadingRateType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(@CType("VkFragmentShadingRateTypeNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRateType(this.segment(), value); return this; }

    /// {@return `shadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFragmentShadingRateNV") int get_shadingRate(MemorySegment segment, long index) { return (int) VH_shadingRate.get(segment, 0L, index); }
    /// {@return `shadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkFragmentShadingRateNV") int get_shadingRate(MemorySegment segment) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRate(segment, 0L); }
    /// {@return `shadingRate` at the given index}
    /// @param index the index
    public @CType("VkFragmentShadingRateNV") int shadingRateAt(long index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRate(this.segment(), index); }
    /// {@return `shadingRate`}
    public @CType("VkFragmentShadingRateNV") int shadingRate() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_shadingRate(this.segment()); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRate(MemorySegment segment, long index, @CType("VkFragmentShadingRateNV") int value) { VH_shadingRate.set(segment, 0L, index, value); }
    /// Sets `shadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRate(MemorySegment segment, @CType("VkFragmentShadingRateNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRate(segment, 0L, value); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateAt(long index, @CType("VkFragmentShadingRateNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRate(this.segment(), index, value); return this; }
    /// Sets `shadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(@CType("VkFragmentShadingRateNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_shadingRate(this.segment(), value); return this; }

    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFragmentShadingRateCombinerOpKHR") int get_combinerOps(MemorySegment segment, long index) { return (int) VH_combinerOps.get(segment, 0L, index); }
    /// {@return `combinerOps`}
    /// @param segment the segment of the struct
    public static @CType("VkFragmentShadingRateCombinerOpKHR") int get_combinerOps(MemorySegment segment) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_combinerOps(segment, 0L); }
    /// {@return `combinerOps` at the given index}
    /// @param index the index
    public @CType("VkFragmentShadingRateCombinerOpKHR") int combinerOpsAt(long index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_combinerOps(this.segment(), index); }
    /// {@return `combinerOps`}
    public @CType("VkFragmentShadingRateCombinerOpKHR") int combinerOps() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.get_combinerOps(this.segment()); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_combinerOps(MemorySegment segment, long index, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VH_combinerOps.set(segment, 0L, index, value); }
    /// Sets `combinerOps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_combinerOps(MemorySegment segment, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_combinerOps(segment, 0L, value); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOpsAt(long index, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_combinerOps(this.segment(), index, value); return this; }
    /// Sets `combinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(@CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.set_combinerOps(this.segment(), value); return this; }

}
