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
/// struct VkPhysicalDeviceMaintenance4Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 maintenance4;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance4Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance4Features`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance4")
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
    /// The byte offset of `maintenance4`.
    public static final long OFFSET_maintenance4 = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
    /// The memory layout of `maintenance4`.
    public static final MemoryLayout LAYOUT_maintenance4 = LAYOUT.select(PathElement.groupElement("maintenance4"));
    /// The [VarHandle] of `maintenance4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maintenance4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance4"));

    /// Creates `VkPhysicalDeviceMaintenance4Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance4Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance4Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance4Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance4Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance4Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance4Features`
    public static VkPhysicalDeviceMaintenance4Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance4Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance4Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance4Features`
    public static VkPhysicalDeviceMaintenance4Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance4Features(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance4Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maintenance4 `maintenance4`
    /// @return the allocated `VkPhysicalDeviceMaintenance4Features`
    public static VkPhysicalDeviceMaintenance4Features allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maintenance4) {
        return alloc(allocator).sType(sType).pNext(pNext).maintenance4(maintenance4);
    }

    /// Allocates a `VkPhysicalDeviceMaintenance4Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceMaintenance4Features`
    public static VkPhysicalDeviceMaintenance4Features allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceMaintenance4Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceMaintenance4Features`
    public static VkPhysicalDeviceMaintenance4Features allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features copyFrom(VkPhysicalDeviceMaintenance4Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance4Features reinterpret(long count) { return new VkPhysicalDeviceMaintenance4Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance4Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance4Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maintenance4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maintenance4(MemorySegment segment, long index) { return (int) VH_maintenance4.get(segment, 0L, index); }
    /// {@return `maintenance4`}
    public int maintenance4() { return maintenance4(this.segment(), 0L); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maintenance4(MemorySegment segment, long index, int value) { VH_maintenance4.set(segment, 0L, index, value); }
    /// Sets `maintenance4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features maintenance4(int value) { maintenance4(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance4Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance4Features`
    public VkPhysicalDeviceMaintenance4Features asSlice(long index) { return new VkPhysicalDeviceMaintenance4Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance4Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance4Features`
    public VkPhysicalDeviceMaintenance4Features asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance4Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance4Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features at(long index, Consumer<VkPhysicalDeviceMaintenance4Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maintenance4` at the given index}
    /// @param index the index of the struct buffer
    public int maintenance4At(long index) { return maintenance4(this.segment(), index); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4Features maintenance4At(long index, int value) { maintenance4(this.segment(), index, value); return this; }

}
