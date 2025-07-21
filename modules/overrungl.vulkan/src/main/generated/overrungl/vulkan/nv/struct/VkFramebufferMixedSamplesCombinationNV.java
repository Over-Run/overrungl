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
/// struct VkFramebufferMixedSamplesCombinationNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkCoverageReductionModeNV coverageReductionMode;
///     (int) VkSampleCountFlagBits rasterizationSamples;
///     ((uint32_t) VkFlags) VkSampleCountFlags depthStencilSamples;
///     ((uint32_t) VkFlags) VkSampleCountFlags colorSamples;
/// };
/// ```
public final class VkFramebufferMixedSamplesCombinationNV extends GroupType {
    /// The struct layout of `VkFramebufferMixedSamplesCombinationNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `coverageReductionMode`.
    public static final long OFFSET_coverageReductionMode = LAYOUT.byteOffset(PathElement.groupElement("coverageReductionMode"));
    /// The memory layout of `coverageReductionMode`.
    public static final MemoryLayout LAYOUT_coverageReductionMode = LAYOUT.select(PathElement.groupElement("coverageReductionMode"));
    /// The [VarHandle] of `coverageReductionMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageReductionMode"));
    /// The byte offset of `rasterizationSamples`.
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    /// The memory layout of `rasterizationSamples`.
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    /// The byte offset of `depthStencilSamples`.
    public static final long OFFSET_depthStencilSamples = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSamples"));
    /// The memory layout of `depthStencilSamples`.
    public static final MemoryLayout LAYOUT_depthStencilSamples = LAYOUT.select(PathElement.groupElement("depthStencilSamples"));
    /// The [VarHandle] of `depthStencilSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthStencilSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSamples"));
    /// The byte offset of `colorSamples`.
    public static final long OFFSET_colorSamples = LAYOUT.byteOffset(PathElement.groupElement("colorSamples"));
    /// The memory layout of `colorSamples`.
    public static final MemoryLayout LAYOUT_colorSamples = LAYOUT.select(PathElement.groupElement("colorSamples"));
    /// The [VarHandle] of `colorSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSamples"));

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFramebufferMixedSamplesCombinationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator, long count) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param coverageReductionMode `coverageReductionMode`
    /// @param rasterizationSamples `rasterizationSamples`
    /// @param depthStencilSamples `depthStencilSamples`
    /// @param colorSamples `colorSamples`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int coverageReductionMode, int rasterizationSamples, int depthStencilSamples, int colorSamples) {
        return alloc(allocator).sType(sType).pNext(pNext).coverageReductionMode(coverageReductionMode).rasterizationSamples(rasterizationSamples).depthStencilSamples(depthStencilSamples).colorSamples(colorSamples);
    }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param coverageReductionMode `coverageReductionMode`
    /// @param rasterizationSamples `rasterizationSamples`
    /// @param depthStencilSamples `depthStencilSamples`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int coverageReductionMode, int rasterizationSamples, int depthStencilSamples) {
        return alloc(allocator).sType(sType).pNext(pNext).coverageReductionMode(coverageReductionMode).rasterizationSamples(rasterizationSamples).depthStencilSamples(depthStencilSamples);
    }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param coverageReductionMode `coverageReductionMode`
    /// @param rasterizationSamples `rasterizationSamples`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int coverageReductionMode, int rasterizationSamples) {
        return alloc(allocator).sType(sType).pNext(pNext).coverageReductionMode(coverageReductionMode).rasterizationSamples(rasterizationSamples);
    }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param coverageReductionMode `coverageReductionMode`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int coverageReductionMode) {
        return alloc(allocator).sType(sType).pNext(pNext).coverageReductionMode(coverageReductionMode);
    }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFramebufferMixedSamplesCombinationNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFramebufferMixedSamplesCombinationNV`
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV copyFrom(VkFramebufferMixedSamplesCombinationNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFramebufferMixedSamplesCombinationNV reinterpret(long count) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `coverageReductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageReductionMode(MemorySegment segment, long index) { return (int) VH_coverageReductionMode.get(segment, 0L, index); }
    /// {@return `coverageReductionMode`}
    public int coverageReductionMode() { return coverageReductionMode(this.segment(), 0L); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageReductionMode(MemorySegment segment, long index, int value) { VH_coverageReductionMode.set(segment, 0L, index, value); }
    /// Sets `coverageReductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV coverageReductionMode(int value) { coverageReductionMode(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    public int rasterizationSamples() { return rasterizationSamples(this.segment(), 0L); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationSamples(MemorySegment segment, long index, int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamples(int value) { rasterizationSamples(this.segment(), 0L, value); return this; }

    /// {@return `depthStencilSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthStencilSamples(MemorySegment segment, long index) { return (int) VH_depthStencilSamples.get(segment, 0L, index); }
    /// {@return `depthStencilSamples`}
    public int depthStencilSamples() { return depthStencilSamples(this.segment(), 0L); }
    /// Sets `depthStencilSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthStencilSamples(MemorySegment segment, long index, int value) { VH_depthStencilSamples.set(segment, 0L, index, value); }
    /// Sets `depthStencilSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamples(int value) { depthStencilSamples(this.segment(), 0L, value); return this; }

    /// {@return `colorSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorSamples(MemorySegment segment, long index) { return (int) VH_colorSamples.get(segment, 0L, index); }
    /// {@return `colorSamples`}
    public int colorSamples() { return colorSamples(this.segment(), 0L); }
    /// Sets `colorSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorSamples(MemorySegment segment, long index, int value) { VH_colorSamples.set(segment, 0L, index, value); }
    /// Sets `colorSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV colorSamples(int value) { colorSamples(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFramebufferMixedSamplesCombinationNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFramebufferMixedSamplesCombinationNV`
    public VkFramebufferMixedSamplesCombinationNV asSlice(long index) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFramebufferMixedSamplesCombinationNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFramebufferMixedSamplesCombinationNV`
    public VkFramebufferMixedSamplesCombinationNV asSlice(long index, long count) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFramebufferMixedSamplesCombinationNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV at(long index, Consumer<VkFramebufferMixedSamplesCombinationNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `coverageReductionMode` at the given index}
    /// @param index the index of the struct buffer
    public int coverageReductionModeAt(long index) { return coverageReductionMode(this.segment(), index); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV coverageReductionModeAt(long index, int value) { coverageReductionMode(this.segment(), index, value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param index the index of the struct buffer
    public int rasterizationSamplesAt(long index) { return rasterizationSamples(this.segment(), index); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamplesAt(long index, int value) { rasterizationSamples(this.segment(), index, value); return this; }

    /// {@return `depthStencilSamples` at the given index}
    /// @param index the index of the struct buffer
    public int depthStencilSamplesAt(long index) { return depthStencilSamples(this.segment(), index); }
    /// Sets `depthStencilSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamplesAt(long index, int value) { depthStencilSamples(this.segment(), index, value); return this; }

    /// {@return `colorSamples` at the given index}
    /// @param index the index of the struct buffer
    public int colorSamplesAt(long index) { return colorSamples(this.segment(), index); }
    /// Sets `colorSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferMixedSamplesCombinationNV colorSamplesAt(long index, int value) { colorSamples(this.segment(), index, value); return this; }

}
