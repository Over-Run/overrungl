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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 separateDepthStencilLayouts;
/// };
/// ```
public final class VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilLayouts")
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
    /// The byte offset of `separateDepthStencilLayouts`.
    public static final long OFFSET_separateDepthStencilLayouts = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The memory layout of `separateDepthStencilLayouts`.
    public static final MemoryLayout LAYOUT_separateDepthStencilLayouts = LAYOUT.select(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The [VarHandle] of `separateDepthStencilLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_separateDepthStencilLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilLayouts"));

    /// Creates `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param separateDepthStencilLayouts `separateDepthStencilLayouts`
    /// @return the allocated `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int separateDepthStencilLayouts) {
        return alloc(allocator).sType(sType).pNext(pNext).separateDepthStencilLayouts(separateDepthStencilLayouts);
    }

    /// Allocates a `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures copyFrom(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures reinterpret(long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `separateDepthStencilLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int separateDepthStencilLayouts(MemorySegment segment, long index) { return (int) VH_separateDepthStencilLayouts.get(segment, 0L, index); }
    /// {@return `separateDepthStencilLayouts`}
    public int separateDepthStencilLayouts() { return separateDepthStencilLayouts(this.segment(), 0L); }
    /// Sets `separateDepthStencilLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void separateDepthStencilLayouts(MemorySegment segment, long index, int value) { VH_separateDepthStencilLayouts.set(segment, 0L, index, value); }
    /// Sets `separateDepthStencilLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayouts(int value) { separateDepthStencilLayouts(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures asSlice(long index) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures asSlice(long index, long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures at(long index, Consumer<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `separateDepthStencilLayouts` at the given index}
    /// @param index the index of the struct buffer
    public int separateDepthStencilLayoutsAt(long index) { return separateDepthStencilLayouts(this.segment(), index); }
    /// Sets `separateDepthStencilLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayoutsAt(long index, int value) { separateDepthStencilLayouts(this.segment(), index, value); return this; }

}
