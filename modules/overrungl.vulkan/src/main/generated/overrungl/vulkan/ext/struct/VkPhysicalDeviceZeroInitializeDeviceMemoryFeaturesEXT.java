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
/// struct VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 zeroInitializeDeviceMemory;
/// };
/// ```
public final class VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("zeroInitializeDeviceMemory")
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
    /// The byte offset of `zeroInitializeDeviceMemory`.
    public static final long OFFSET_zeroInitializeDeviceMemory = LAYOUT.byteOffset(PathElement.groupElement("zeroInitializeDeviceMemory"));
    /// The memory layout of `zeroInitializeDeviceMemory`.
    public static final MemoryLayout LAYOUT_zeroInitializeDeviceMemory = LAYOUT.select(PathElement.groupElement("zeroInitializeDeviceMemory"));
    /// The [VarHandle] of `zeroInitializeDeviceMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_zeroInitializeDeviceMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zeroInitializeDeviceMemory"));

    /// Creates `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param zeroInitializeDeviceMemory `zeroInitializeDeviceMemory`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int zeroInitializeDeviceMemory) {
        return alloc(allocator).sType(sType).pNext(pNext).zeroInitializeDeviceMemory(zeroInitializeDeviceMemory);
    }

    /// Allocates a `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT copyFrom(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `zeroInitializeDeviceMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int zeroInitializeDeviceMemory(MemorySegment segment, long index) { return (int) VH_zeroInitializeDeviceMemory.get(segment, 0L, index); }
    /// {@return `zeroInitializeDeviceMemory`}
    public int zeroInitializeDeviceMemory() { return zeroInitializeDeviceMemory(this.segment(), 0L); }
    /// Sets `zeroInitializeDeviceMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void zeroInitializeDeviceMemory(MemorySegment segment, long index, int value) { VH_zeroInitializeDeviceMemory.set(segment, 0L, index, value); }
    /// Sets `zeroInitializeDeviceMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemory(int value) { zeroInitializeDeviceMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT at(long index, Consumer<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `zeroInitializeDeviceMemory` at the given index}
    /// @param index the index of the struct buffer
    public int zeroInitializeDeviceMemoryAt(long index) { return zeroInitializeDeviceMemory(this.segment(), index); }
    /// Sets `zeroInitializeDeviceMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemoryAt(long index, int value) { zeroInitializeDeviceMemory(this.segment(), index, value); return this; }

}
