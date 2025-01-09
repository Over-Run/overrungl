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
/// ### coverageReductionMode
/// [VarHandle][#VH_coverageReductionMode] - [Getter][#coverageReductionMode()] - [Setter][#coverageReductionMode(int)]
/// ### rasterizationSamples
/// [VarHandle][#VH_rasterizationSamples] - [Getter][#rasterizationSamples()] - [Setter][#rasterizationSamples(int)]
/// ### depthStencilSamples
/// [VarHandle][#VH_depthStencilSamples] - [Getter][#depthStencilSamples()] - [Setter][#depthStencilSamples(int)]
/// ### colorSamples
/// [VarHandle][#VH_colorSamples] - [Getter][#colorSamples()] - [Setter][#colorSamples(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFramebufferMixedSamplesCombinationNV {
///     VkStructureType sType;
///     void * pNext;
///     VkCoverageReductionModeNV coverageReductionMode;
///     VkSampleCountFlagBits rasterizationSamples;
///     VkSampleCountFlags depthStencilSamples;
///     VkSampleCountFlags colorSamples;
/// } VkFramebufferMixedSamplesCombinationNV;
/// ```
public final class VkFramebufferMixedSamplesCombinationNV extends Struct {
    /// The struct layout of `VkFramebufferMixedSamplesCombinationNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `coverageReductionMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageReductionMode"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    /// The [VarHandle] of `depthStencilSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthStencilSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSamples"));
    /// The [VarHandle] of `colorSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSamples"));

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    /// @param segment the memory segment
    public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator, long count) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFramebufferMixedSamplesCombinationNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFramebufferMixedSamplesCombinationNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV sTypeAt(long index, @CType("VkStructureType") int value) { VkFramebufferMixedSamplesCombinationNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV sType(@CType("VkStructureType") int value) { VkFramebufferMixedSamplesCombinationNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkFramebufferMixedSamplesCombinationNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkFramebufferMixedSamplesCombinationNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkFramebufferMixedSamplesCombinationNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkFramebufferMixedSamplesCombinationNV.set_pNext(this.segment(), value); return this; }

    /// {@return `coverageReductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCoverageReductionModeNV") int get_coverageReductionMode(MemorySegment segment, long index) { return (int) VH_coverageReductionMode.get(segment, 0L, index); }
    /// {@return `coverageReductionMode`}
    /// @param segment the segment of the struct
    public static @CType("VkCoverageReductionModeNV") int get_coverageReductionMode(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_coverageReductionMode(segment, 0L); }
    /// {@return `coverageReductionMode` at the given index}
    /// @param index the index
    public @CType("VkCoverageReductionModeNV") int coverageReductionModeAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_coverageReductionMode(this.segment(), index); }
    /// {@return `coverageReductionMode`}
    public @CType("VkCoverageReductionModeNV") int coverageReductionMode() { return VkFramebufferMixedSamplesCombinationNV.get_coverageReductionMode(this.segment()); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageReductionMode(MemorySegment segment, long index, @CType("VkCoverageReductionModeNV") int value) { VH_coverageReductionMode.set(segment, 0L, index, value); }
    /// Sets `coverageReductionMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageReductionMode(MemorySegment segment, @CType("VkCoverageReductionModeNV") int value) { VkFramebufferMixedSamplesCombinationNV.set_coverageReductionMode(segment, 0L, value); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV coverageReductionModeAt(long index, @CType("VkCoverageReductionModeNV") int value) { VkFramebufferMixedSamplesCombinationNV.set_coverageReductionMode(this.segment(), index, value); return this; }
    /// Sets `coverageReductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV coverageReductionMode(@CType("VkCoverageReductionModeNV") int value) { VkFramebufferMixedSamplesCombinationNV.set_coverageReductionMode(this.segment(), value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_rasterizationSamples(segment, 0L); }
    /// {@return `rasterizationSamples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int rasterizationSamplesAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_rasterizationSamples(this.segment(), index); }
    /// {@return `rasterizationSamples`}
    public @CType("VkSampleCountFlagBits") int rasterizationSamples() { return VkFramebufferMixedSamplesCombinationNV.get_rasterizationSamples(this.segment()); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkFramebufferMixedSamplesCombinationNV.set_rasterizationSamples(segment, 0L, value); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkFramebufferMixedSamplesCombinationNV.set_rasterizationSamples(this.segment(), index, value); return this; }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamples(@CType("VkSampleCountFlagBits") int value) { VkFramebufferMixedSamplesCombinationNV.set_rasterizationSamples(this.segment(), value); return this; }

    /// {@return `depthStencilSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_depthStencilSamples(MemorySegment segment, long index) { return (int) VH_depthStencilSamples.get(segment, 0L, index); }
    /// {@return `depthStencilSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_depthStencilSamples(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_depthStencilSamples(segment, 0L); }
    /// {@return `depthStencilSamples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlags") int depthStencilSamplesAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_depthStencilSamples(this.segment(), index); }
    /// {@return `depthStencilSamples`}
    public @CType("VkSampleCountFlags") int depthStencilSamples() { return VkFramebufferMixedSamplesCombinationNV.get_depthStencilSamples(this.segment()); }
    /// Sets `depthStencilSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthStencilSamples(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_depthStencilSamples.set(segment, 0L, index, value); }
    /// Sets `depthStencilSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthStencilSamples(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_depthStencilSamples(segment, 0L, value); }
    /// Sets `depthStencilSamples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamplesAt(long index, @CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_depthStencilSamples(this.segment(), index, value); return this; }
    /// Sets `depthStencilSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamples(@CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_depthStencilSamples(this.segment(), value); return this; }

    /// {@return `colorSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_colorSamples(MemorySegment segment, long index) { return (int) VH_colorSamples.get(segment, 0L, index); }
    /// {@return `colorSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_colorSamples(MemorySegment segment) { return VkFramebufferMixedSamplesCombinationNV.get_colorSamples(segment, 0L); }
    /// {@return `colorSamples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlags") int colorSamplesAt(long index) { return VkFramebufferMixedSamplesCombinationNV.get_colorSamples(this.segment(), index); }
    /// {@return `colorSamples`}
    public @CType("VkSampleCountFlags") int colorSamples() { return VkFramebufferMixedSamplesCombinationNV.get_colorSamples(this.segment()); }
    /// Sets `colorSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorSamples(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_colorSamples.set(segment, 0L, index, value); }
    /// Sets `colorSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorSamples(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_colorSamples(segment, 0L, value); }
    /// Sets `colorSamples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV colorSamplesAt(long index, @CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_colorSamples(this.segment(), index, value); return this; }
    /// Sets `colorSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV colorSamples(@CType("VkSampleCountFlags") int value) { VkFramebufferMixedSamplesCombinationNV.set_colorSamples(this.segment(), value); return this; }

}
