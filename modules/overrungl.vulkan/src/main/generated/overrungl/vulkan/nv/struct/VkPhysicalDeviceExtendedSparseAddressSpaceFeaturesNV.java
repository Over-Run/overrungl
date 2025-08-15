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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 extendedSparseAddressSpace;
/// };
/// ```
public final class VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedSparseAddressSpace")
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
    /// The byte offset of `extendedSparseAddressSpace`.
    public static final long OFFSET_extendedSparseAddressSpace = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseAddressSpace"));
    /// The memory layout of `extendedSparseAddressSpace`.
    public static final MemoryLayout LAYOUT_extendedSparseAddressSpace = LAYOUT.select(PathElement.groupElement("extendedSparseAddressSpace"));
    /// The [VarHandle] of `extendedSparseAddressSpace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedSparseAddressSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseAddressSpace"));

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV copyFrom(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `extendedSparseAddressSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedSparseAddressSpace(MemorySegment segment, long index) { return (int) VH_extendedSparseAddressSpace.get(segment, 0L, index); }
    /// {@return `extendedSparseAddressSpace`}
    public int extendedSparseAddressSpace() { return extendedSparseAddressSpace(this.segment(), 0L); }
    /// Sets `extendedSparseAddressSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedSparseAddressSpace(MemorySegment segment, long index, int value) { VH_extendedSparseAddressSpace.set(segment, 0L, index, value); }
    /// Sets `extendedSparseAddressSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpace(int value) { extendedSparseAddressSpace(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV at(long index, Consumer<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `extendedSparseAddressSpace` at the given index}
    /// @param index the index of the struct buffer
    public int extendedSparseAddressSpaceAt(long index) { return extendedSparseAddressSpace(this.segment(), index); }
    /// Sets `extendedSparseAddressSpace` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpaceAt(long index, int value) { extendedSparseAddressSpace(this.segment(), index, value); return this; }

}
