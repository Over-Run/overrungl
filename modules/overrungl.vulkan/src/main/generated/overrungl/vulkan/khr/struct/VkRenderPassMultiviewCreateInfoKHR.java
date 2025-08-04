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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRenderPassMultiviewCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t subpassCount;
///     const uint32_t* pViewMasks;
///     uint32_t dependencyCount;
///     const int32_t* pViewOffsets;
///     uint32_t correlationMaskCount;
///     const uint32_t* pCorrelationMasks;
/// };
/// ```
public final class VkRenderPassMultiviewCreateInfoKHR extends GroupType {
    /// The struct layout of `VkRenderPassMultiviewCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pViewMasks"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pViewOffsets"),
        ValueLayout.JAVA_INT.withName("correlationMaskCount"),
        ValueLayout.ADDRESS.withName("pCorrelationMasks")
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
    /// The byte offset of `subpassCount`.
    public static final long OFFSET_subpassCount = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
    /// The memory layout of `subpassCount`.
    public static final MemoryLayout LAYOUT_subpassCount = LAYOUT.select(PathElement.groupElement("subpassCount"));
    /// The [VarHandle] of `subpassCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    /// The byte offset of `pViewMasks`.
    public static final long OFFSET_pViewMasks = LAYOUT.byteOffset(PathElement.groupElement("pViewMasks"));
    /// The memory layout of `pViewMasks`.
    public static final MemoryLayout LAYOUT_pViewMasks = LAYOUT.select(PathElement.groupElement("pViewMasks"));
    /// The [VarHandle] of `pViewMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewMasks"));
    /// The byte offset of `dependencyCount`.
    public static final long OFFSET_dependencyCount = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
    /// The memory layout of `dependencyCount`.
    public static final MemoryLayout LAYOUT_dependencyCount = LAYOUT.select(PathElement.groupElement("dependencyCount"));
    /// The [VarHandle] of `dependencyCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    /// The byte offset of `pViewOffsets`.
    public static final long OFFSET_pViewOffsets = LAYOUT.byteOffset(PathElement.groupElement("pViewOffsets"));
    /// The memory layout of `pViewOffsets`.
    public static final MemoryLayout LAYOUT_pViewOffsets = LAYOUT.select(PathElement.groupElement("pViewOffsets"));
    /// The [VarHandle] of `pViewOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pViewOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewOffsets"));
    /// The byte offset of `correlationMaskCount`.
    public static final long OFFSET_correlationMaskCount = LAYOUT.byteOffset(PathElement.groupElement("correlationMaskCount"));
    /// The memory layout of `correlationMaskCount`.
    public static final MemoryLayout LAYOUT_correlationMaskCount = LAYOUT.select(PathElement.groupElement("correlationMaskCount"));
    /// The [VarHandle] of `correlationMaskCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_correlationMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlationMaskCount"));
    /// The byte offset of `pCorrelationMasks`.
    public static final long OFFSET_pCorrelationMasks = LAYOUT.byteOffset(PathElement.groupElement("pCorrelationMasks"));
    /// The memory layout of `pCorrelationMasks`.
    public static final MemoryLayout LAYOUT_pCorrelationMasks = LAYOUT.select(PathElement.groupElement("pCorrelationMasks"));
    /// The [VarHandle] of `pCorrelationMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCorrelationMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelationMasks"));

    /// Creates `VkRenderPassMultiviewCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassMultiviewCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassMultiviewCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassMultiviewCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassMultiviewCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassMultiviewCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassMultiviewCreateInfoKHR`
    public static VkRenderPassMultiviewCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderPassMultiviewCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassMultiviewCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassMultiviewCreateInfoKHR`
    public static VkRenderPassMultiviewCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderPassMultiviewCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR copyFrom(VkRenderPassMultiviewCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassMultiviewCreateInfoKHR reinterpret(long count) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassMultiviewCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassMultiviewCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get(segment, 0L, index); }
    /// {@return `subpassCount`}
    public int subpassCount() { return subpassCount(this.segment(), 0L); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassCount(MemorySegment segment, long index, int value) { VH_subpassCount.set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR subpassCount(int value) { subpassCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pViewMasks.get(segment, 0L, index); }
    /// {@return `pViewMasks`}
    public MemorySegment pViewMasks() { return pViewMasks(this.segment(), 0L); }
    /// Sets `pViewMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewMasks(MemorySegment segment, long index, MemorySegment value) { VH_pViewMasks.set(segment, 0L, index, value); }
    /// Sets `pViewMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pViewMasks(MemorySegment value) { pViewMasks(this.segment(), 0L, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    public int dependencyCount() { return dependencyCount(this.segment(), 0L); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dependencyCount(MemorySegment segment, long index, int value) { VH_dependencyCount.set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR dependencyCount(int value) { dependencyCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pViewOffsets.get(segment, 0L, index); }
    /// {@return `pViewOffsets`}
    public MemorySegment pViewOffsets() { return pViewOffsets(this.segment(), 0L); }
    /// Sets `pViewOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pViewOffsets.set(segment, 0L, index, value); }
    /// Sets `pViewOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsets(MemorySegment value) { pViewOffsets(this.segment(), 0L, value); return this; }

    /// {@return `correlationMaskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int correlationMaskCount(MemorySegment segment, long index) { return (int) VH_correlationMaskCount.get(segment, 0L, index); }
    /// {@return `correlationMaskCount`}
    public int correlationMaskCount() { return correlationMaskCount(this.segment(), 0L); }
    /// Sets `correlationMaskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void correlationMaskCount(MemorySegment segment, long index, int value) { VH_correlationMaskCount.set(segment, 0L, index, value); }
    /// Sets `correlationMaskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR correlationMaskCount(int value) { correlationMaskCount(this.segment(), 0L, value); return this; }

    /// {@return `pCorrelationMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCorrelationMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pCorrelationMasks.get(segment, 0L, index); }
    /// {@return `pCorrelationMasks`}
    public MemorySegment pCorrelationMasks() { return pCorrelationMasks(this.segment(), 0L); }
    /// Sets `pCorrelationMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCorrelationMasks(MemorySegment segment, long index, MemorySegment value) { VH_pCorrelationMasks.set(segment, 0L, index, value); }
    /// Sets `pCorrelationMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasks(MemorySegment value) { pCorrelationMasks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassMultiviewCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassMultiviewCreateInfoKHR`
    public VkRenderPassMultiviewCreateInfoKHR asSlice(long index) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassMultiviewCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassMultiviewCreateInfoKHR`
    public VkRenderPassMultiviewCreateInfoKHR asSlice(long index, long count) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassMultiviewCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR at(long index, Consumer<VkRenderPassMultiviewCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param index the index of the struct buffer
    public int subpassCountAt(long index) { return subpassCount(this.segment(), index); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR subpassCountAt(long index, int value) { subpassCount(this.segment(), index, value); return this; }

    /// {@return `pViewMasks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewMasksAt(long index) { return pViewMasks(this.segment(), index); }
    /// Sets `pViewMasks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pViewMasksAt(long index, MemorySegment value) { pViewMasks(this.segment(), index, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param index the index of the struct buffer
    public int dependencyCountAt(long index) { return dependencyCount(this.segment(), index); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR dependencyCountAt(long index, int value) { dependencyCount(this.segment(), index, value); return this; }

    /// {@return `pViewOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewOffsetsAt(long index) { return pViewOffsets(this.segment(), index); }
    /// Sets `pViewOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsetsAt(long index, MemorySegment value) { pViewOffsets(this.segment(), index, value); return this; }

    /// {@return `correlationMaskCount` at the given index}
    /// @param index the index of the struct buffer
    public int correlationMaskCountAt(long index) { return correlationMaskCount(this.segment(), index); }
    /// Sets `correlationMaskCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR correlationMaskCountAt(long index, int value) { correlationMaskCount(this.segment(), index, value); return this; }

    /// {@return `pCorrelationMasks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCorrelationMasksAt(long index) { return pCorrelationMasks(this.segment(), index); }
    /// Sets `pCorrelationMasks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasksAt(long index, MemorySegment value) { pCorrelationMasks(this.segment(), index, value); return this; }

}
