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
/// struct VkPhysicalDeviceSurfaceInfo2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSurfaceKHR surface;
/// };
/// ```
public final class VkPhysicalDeviceSurfaceInfo2KHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSurfaceInfo2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("surface")
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
    /// The byte offset of `surface`.
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    /// The memory layout of `surface`.
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSurfaceInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSurfaceInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSurfaceInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSurfaceInfo2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param surface `surface`
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long surface) {
        return alloc(allocator).sType(sType).pNext(pNext).surface(surface);
    }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR copyFrom(VkPhysicalDeviceSurfaceInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSurfaceInfo2KHR reinterpret(long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSurfaceInfo2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long surface(MemorySegment segment, long index) { return (long) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    public long surface() { return surface(this.segment(), 0L); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void surface(MemorySegment segment, long index, long value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR surface(long value) { surface(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSurfaceInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSurfaceInfo2KHR`
    public VkPhysicalDeviceSurfaceInfo2KHR asSlice(long index) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSurfaceInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSurfaceInfo2KHR`
    public VkPhysicalDeviceSurfaceInfo2KHR asSlice(long index, long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSurfaceInfo2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR at(long index, Consumer<VkPhysicalDeviceSurfaceInfo2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `surface` at the given index}
    /// @param index the index of the struct buffer
    public long surfaceAt(long index) { return surface(this.segment(), index); }
    /// Sets `surface` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR surfaceAt(long index, long value) { surface(this.segment(), index, value); return this; }

}
