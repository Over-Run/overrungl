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
/// struct VkPhysicalDevicePresentId2FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 presentId2;
/// };
/// ```
public final class VkPhysicalDevicePresentId2FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevicePresentId2FeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentId2")
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
    /// The byte offset of `presentId2`.
    public static final long OFFSET_presentId2 = LAYOUT.byteOffset(PathElement.groupElement("presentId2"));
    /// The memory layout of `presentId2`.
    public static final MemoryLayout LAYOUT_presentId2 = LAYOUT.select(PathElement.groupElement("presentId2"));
    /// The [VarHandle] of `presentId2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentId2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId2"));

    /// Creates `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePresentId2FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentId2FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentId2FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentId2FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePresentId2FeaturesKHR`
    public static VkPhysicalDevicePresentId2FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentId2FeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePresentId2FeaturesKHR`
    public static VkPhysicalDevicePresentId2FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentId2 `presentId2`
    /// @return the allocated `VkPhysicalDevicePresentId2FeaturesKHR`
    public static VkPhysicalDevicePresentId2FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int presentId2) {
        return alloc(allocator).sType(sType).pNext(pNext).presentId2(presentId2);
    }

    /// Allocates a `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDevicePresentId2FeaturesKHR`
    public static VkPhysicalDevicePresentId2FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDevicePresentId2FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDevicePresentId2FeaturesKHR`
    public static VkPhysicalDevicePresentId2FeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR copyFrom(VkPhysicalDevicePresentId2FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePresentId2FeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePresentId2FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePresentId2FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentId2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentId2(MemorySegment segment, long index) { return (int) VH_presentId2.get(segment, 0L, index); }
    /// {@return `presentId2`}
    public int presentId2() { return presentId2(this.segment(), 0L); }
    /// Sets `presentId2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentId2(MemorySegment segment, long index, int value) { VH_presentId2.set(segment, 0L, index, value); }
    /// Sets `presentId2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR presentId2(int value) { presentId2(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePresentId2FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePresentId2FeaturesKHR`
    public VkPhysicalDevicePresentId2FeaturesKHR asSlice(long index) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePresentId2FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePresentId2FeaturesKHR`
    public VkPhysicalDevicePresentId2FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePresentId2FeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR at(long index, Consumer<VkPhysicalDevicePresentId2FeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentId2` at the given index}
    /// @param index the index of the struct buffer
    public int presentId2At(long index) { return presentId2(this.segment(), index); }
    /// Sets `presentId2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentId2FeaturesKHR presentId2At(long index, int value) { presentId2(this.segment(), index, value); return this; }

}
