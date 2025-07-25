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
/// struct VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 representativeFragmentTest;
/// };
/// ```
public final class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("representativeFragmentTest")
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
    /// The byte offset of `representativeFragmentTest`.
    public static final long OFFSET_representativeFragmentTest = LAYOUT.byteOffset(PathElement.groupElement("representativeFragmentTest"));
    /// The memory layout of `representativeFragmentTest`.
    public static final MemoryLayout LAYOUT_representativeFragmentTest = LAYOUT.select(PathElement.groupElement("representativeFragmentTest"));
    /// The [VarHandle] of `representativeFragmentTest` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_representativeFragmentTest = LAYOUT.arrayElementVarHandle(PathElement.groupElement("representativeFragmentTest"));

    /// Creates `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param representativeFragmentTest `representativeFragmentTest`
    /// @return the allocated `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int representativeFragmentTest) {
        return alloc(allocator).sType(sType).pNext(pNext).representativeFragmentTest(representativeFragmentTest);
    }

    /// Allocates a `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV copyFrom(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `representativeFragmentTest` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int representativeFragmentTest(MemorySegment segment, long index) { return (int) VH_representativeFragmentTest.get(segment, 0L, index); }
    /// {@return `representativeFragmentTest`}
    public int representativeFragmentTest() { return representativeFragmentTest(this.segment(), 0L); }
    /// Sets `representativeFragmentTest` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void representativeFragmentTest(MemorySegment segment, long index, int value) { VH_representativeFragmentTest.set(segment, 0L, index, value); }
    /// Sets `representativeFragmentTest` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTest(int value) { representativeFragmentTest(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV at(long index, Consumer<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `representativeFragmentTest` at the given index}
    /// @param index the index of the struct buffer
    public int representativeFragmentTestAt(long index) { return representativeFragmentTest(this.segment(), index); }
    /// Sets `representativeFragmentTest` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTestAt(long index, int value) { representativeFragmentTest(this.segment(), index, value); return this; }

}
