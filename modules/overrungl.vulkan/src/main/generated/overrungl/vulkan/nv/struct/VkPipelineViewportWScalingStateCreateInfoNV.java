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
/// struct VkPipelineViewportWScalingStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 viewportWScalingEnable;
///     uint32_t viewportCount;
///     const VkViewportWScalingNV* pViewportWScalings;
/// };
/// ```
public final class VkPipelineViewportWScalingStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineViewportWScalingStateCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportWScalings")
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
    /// The byte offset of `viewportWScalingEnable`.
    public static final long OFFSET_viewportWScalingEnable = LAYOUT.byteOffset(PathElement.groupElement("viewportWScalingEnable"));
    /// The memory layout of `viewportWScalingEnable`.
    public static final MemoryLayout LAYOUT_viewportWScalingEnable = LAYOUT.select(PathElement.groupElement("viewportWScalingEnable"));
    /// The [VarHandle] of `viewportWScalingEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportWScalingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportWScalingEnable"));
    /// The byte offset of `viewportCount`.
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    /// The memory layout of `viewportCount`.
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The byte offset of `pViewportWScalings`.
    public static final long OFFSET_pViewportWScalings = LAYOUT.byteOffset(PathElement.groupElement("pViewportWScalings"));
    /// The memory layout of `pViewportWScalings`.
    public static final MemoryLayout LAYOUT_pViewportWScalings = LAYOUT.select(PathElement.groupElement("pViewportWScalings"));
    /// The [VarHandle] of `pViewportWScalings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pViewportWScalings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportWScalings"));

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportWScalingEnable `viewportWScalingEnable`
    /// @param viewportCount `viewportCount`
    /// @param pViewportWScalings `pViewportWScalings`
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportWScalingEnable, int viewportCount, MemorySegment pViewportWScalings) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportWScalingEnable(viewportWScalingEnable).viewportCount(viewportCount).pViewportWScalings(pViewportWScalings);
    }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportWScalingEnable `viewportWScalingEnable`
    /// @param viewportCount `viewportCount`
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportWScalingEnable, int viewportCount) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportWScalingEnable(viewportWScalingEnable).viewportCount(viewportCount);
    }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportWScalingEnable `viewportWScalingEnable`
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportWScalingEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportWScalingEnable(viewportWScalingEnable);
    }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV copyFrom(VkPipelineViewportWScalingStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportWScalingStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportWScalingStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportWScalingStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `viewportWScalingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportWScalingEnable(MemorySegment segment, long index) { return (int) VH_viewportWScalingEnable.get(segment, 0L, index); }
    /// {@return `viewportWScalingEnable`}
    public int viewportWScalingEnable() { return viewportWScalingEnable(this.segment(), 0L); }
    /// Sets `viewportWScalingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportWScalingEnable(MemorySegment segment, long index, int value) { VH_viewportWScalingEnable.set(segment, 0L, index, value); }
    /// Sets `viewportWScalingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(int value) { viewportWScalingEnable(this.segment(), 0L, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    public int viewportCount() { return viewportCount(this.segment(), 0L); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportCount(MemorySegment segment, long index, int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCount(int value) { viewportCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewportWScalings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewportWScalings(MemorySegment segment, long index) { return (MemorySegment) VH_pViewportWScalings.get(segment, 0L, index); }
    /// {@return `pViewportWScalings`}
    public MemorySegment pViewportWScalings() { return pViewportWScalings(this.segment(), 0L); }
    /// Sets `pViewportWScalings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewportWScalings(MemorySegment segment, long index, MemorySegment value) { VH_pViewportWScalings.set(segment, 0L, index, value); }
    /// Sets `pViewportWScalings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(MemorySegment value) { pViewportWScalings(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportWScalingStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportWScalingStateCreateInfoNV`
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportWScalingStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportWScalingStateCreateInfoNV`
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportWScalingStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV at(long index, Consumer<VkPipelineViewportWScalingStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `viewportWScalingEnable` at the given index}
    /// @param index the index of the struct buffer
    public int viewportWScalingEnableAt(long index) { return viewportWScalingEnable(this.segment(), index); }
    /// Sets `viewportWScalingEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnableAt(long index, int value) { viewportWScalingEnable(this.segment(), index, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param index the index of the struct buffer
    public int viewportCountAt(long index) { return viewportCount(this.segment(), index); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCountAt(long index, int value) { viewportCount(this.segment(), index, value); return this; }

    /// {@return `pViewportWScalings` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewportWScalingsAt(long index) { return pViewportWScalings(this.segment(), index); }
    /// Sets `pViewportWScalings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalingsAt(long index, MemorySegment value) { pViewportWScalings(this.segment(), index, value); return this; }

}
