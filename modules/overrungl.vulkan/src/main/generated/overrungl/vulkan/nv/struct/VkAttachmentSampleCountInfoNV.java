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
/// struct VkAttachmentSampleCountInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const VkSampleCountFlagBits* pColorAttachmentSamples;
///     (int) VkSampleCountFlagBits depthStencilAttachmentSamples;
/// };
/// ```
public final class VkAttachmentSampleCountInfoNV extends GroupType {
    /// The struct layout of `VkAttachmentSampleCountInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
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
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The byte offset of `pColorAttachmentSamples`.
    public static final long OFFSET_pColorAttachmentSamples = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentSamples"));
    /// The memory layout of `pColorAttachmentSamples`.
    public static final MemoryLayout LAYOUT_pColorAttachmentSamples = LAYOUT.select(PathElement.groupElement("pColorAttachmentSamples"));
    /// The [VarHandle] of `pColorAttachmentSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentSamples"));
    /// The byte offset of `depthStencilAttachmentSamples`.
    public static final long OFFSET_depthStencilAttachmentSamples = LAYOUT.byteOffset(PathElement.groupElement("depthStencilAttachmentSamples"));
    /// The memory layout of `depthStencilAttachmentSamples`.
    public static final MemoryLayout LAYOUT_depthStencilAttachmentSamples = LAYOUT.select(PathElement.groupElement("depthStencilAttachmentSamples"));
    /// The [VarHandle] of `depthStencilAttachmentSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthStencilAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilAttachmentSamples"));

    /// Creates `VkAttachmentSampleCountInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAttachmentSampleCountInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAttachmentSampleCountInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleCountInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentSampleCountInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleCountInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAttachmentSampleCountInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleCountInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV alloc(SegmentAllocator allocator) { return new VkAttachmentSampleCountInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAttachmentSampleCountInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param colorAttachmentCount `colorAttachmentCount`
    /// @param pColorAttachmentSamples `pColorAttachmentSamples`
    /// @param depthStencilAttachmentSamples `depthStencilAttachmentSamples`
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int colorAttachmentCount, MemorySegment pColorAttachmentSamples, int depthStencilAttachmentSamples) {
        return alloc(allocator).sType(sType).pNext(pNext).colorAttachmentCount(colorAttachmentCount).pColorAttachmentSamples(pColorAttachmentSamples).depthStencilAttachmentSamples(depthStencilAttachmentSamples);
    }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param colorAttachmentCount `colorAttachmentCount`
    /// @param pColorAttachmentSamples `pColorAttachmentSamples`
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int colorAttachmentCount, MemorySegment pColorAttachmentSamples) {
        return alloc(allocator).sType(sType).pNext(pNext).colorAttachmentCount(colorAttachmentCount).pColorAttachmentSamples(pColorAttachmentSamples);
    }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param colorAttachmentCount `colorAttachmentCount`
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int colorAttachmentCount) {
        return alloc(allocator).sType(sType).pNext(pNext).colorAttachmentCount(colorAttachmentCount);
    }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAttachmentSampleCountInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAttachmentSampleCountInfoNV`
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentSampleCountInfoNV copyFrom(VkAttachmentSampleCountInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAttachmentSampleCountInfoNV reinterpret(long count) { return new VkAttachmentSampleCountInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAttachmentSampleCountInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAttachmentSampleCountInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachmentSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachmentSamples(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachmentSamples.get(segment, 0L, index); }
    /// {@return `pColorAttachmentSamples`}
    public MemorySegment pColorAttachmentSamples() { return pColorAttachmentSamples(this.segment(), 0L); }
    /// Sets `pColorAttachmentSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachmentSamples(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachmentSamples.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamples(MemorySegment value) { pColorAttachmentSamples(this.segment(), 0L, value); return this; }

    /// {@return `depthStencilAttachmentSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthStencilAttachmentSamples(MemorySegment segment, long index) { return (int) VH_depthStencilAttachmentSamples.get(segment, 0L, index); }
    /// {@return `depthStencilAttachmentSamples`}
    public int depthStencilAttachmentSamples() { return depthStencilAttachmentSamples(this.segment(), 0L); }
    /// Sets `depthStencilAttachmentSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthStencilAttachmentSamples(MemorySegment segment, long index, int value) { VH_depthStencilAttachmentSamples.set(segment, 0L, index, value); }
    /// Sets `depthStencilAttachmentSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamples(int value) { depthStencilAttachmentSamples(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAttachmentSampleCountInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAttachmentSampleCountInfoNV`
    public VkAttachmentSampleCountInfoNV asSlice(long index) { return new VkAttachmentSampleCountInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAttachmentSampleCountInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAttachmentSampleCountInfoNV`
    public VkAttachmentSampleCountInfoNV asSlice(long index, long count) { return new VkAttachmentSampleCountInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAttachmentSampleCountInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAttachmentSampleCountInfoNV at(long index, Consumer<VkAttachmentSampleCountInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

    /// {@return `pColorAttachmentSamples` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorAttachmentSamplesAt(long index) { return pColorAttachmentSamples(this.segment(), index); }
    /// Sets `pColorAttachmentSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamplesAt(long index, MemorySegment value) { pColorAttachmentSamples(this.segment(), index, value); return this; }

    /// {@return `depthStencilAttachmentSamples` at the given index}
    /// @param index the index of the struct buffer
    public int depthStencilAttachmentSamplesAt(long index) { return depthStencilAttachmentSamples(this.segment(), index); }
    /// Sets `depthStencilAttachmentSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamplesAt(long index, int value) { depthStencilAttachmentSamples(this.segment(), index, value); return this; }

}
