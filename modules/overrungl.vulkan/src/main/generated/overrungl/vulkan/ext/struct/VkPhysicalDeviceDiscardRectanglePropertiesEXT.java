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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDiscardRectanglePropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxDiscardRectangles;
/// };
/// ```
public final class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDiscardRectanglePropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDiscardRectangles")
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
    /// The byte offset of `maxDiscardRectangles`.
    public static final long OFFSET_maxDiscardRectangles = LAYOUT.byteOffset(PathElement.groupElement("maxDiscardRectangles"));
    /// The memory layout of `maxDiscardRectangles`.
    public static final MemoryLayout LAYOUT_maxDiscardRectangles = LAYOUT.select(PathElement.groupElement("maxDiscardRectangles"));
    /// The [VarHandle] of `maxDiscardRectangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDiscardRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDiscardRectangles"));

    /// Creates `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxDiscardRectangles `maxDiscardRectangles`
    /// @return the allocated `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxDiscardRectangles) {
        return alloc(allocator).sType(sType).pNext(pNext).maxDiscardRectangles(maxDiscardRectangles);
    }

    /// Allocates a `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceDiscardRectanglePropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT copyFrom(VkPhysicalDeviceDiscardRectanglePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxDiscardRectangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDiscardRectangles(MemorySegment segment, long index) { return (int) VH_maxDiscardRectangles.get(segment, 0L, index); }
    /// {@return `maxDiscardRectangles`}
    public int maxDiscardRectangles() { return maxDiscardRectangles(this.segment(), 0L); }
    /// Sets `maxDiscardRectangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDiscardRectangles(MemorySegment segment, long index, int value) { VH_maxDiscardRectangles.set(segment, 0L, index, value); }
    /// Sets `maxDiscardRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT maxDiscardRectangles(int value) { maxDiscardRectangles(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDiscardRectanglePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDiscardRectanglePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDiscardRectanglePropertiesEXT`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDiscardRectanglePropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT at(long index, Consumer<VkPhysicalDeviceDiscardRectanglePropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxDiscardRectangles` at the given index}
    /// @param index the index of the struct buffer
    public int maxDiscardRectanglesAt(long index) { return maxDiscardRectangles(this.segment(), index); }
    /// Sets `maxDiscardRectangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT maxDiscardRectanglesAt(long index, int value) { maxDiscardRectangles(this.segment(), index, value); return this; }

}
