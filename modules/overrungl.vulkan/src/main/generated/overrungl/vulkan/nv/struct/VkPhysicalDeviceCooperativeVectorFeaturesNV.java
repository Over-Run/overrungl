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
/// struct VkPhysicalDeviceCooperativeVectorFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 cooperativeVector;
///     (uint32_t) VkBool32 cooperativeVectorTraining;
/// };
/// ```
public final class VkPhysicalDeviceCooperativeVectorFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCooperativeVectorFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeVector"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTraining")
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
    /// The byte offset of `cooperativeVector`.
    public static final long OFFSET_cooperativeVector = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVector"));
    /// The memory layout of `cooperativeVector`.
    public static final MemoryLayout LAYOUT_cooperativeVector = LAYOUT.select(PathElement.groupElement("cooperativeVector"));
    /// The [VarHandle] of `cooperativeVector` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeVector = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVector"));
    /// The byte offset of `cooperativeVectorTraining`.
    public static final long OFFSET_cooperativeVectorTraining = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTraining"));
    /// The memory layout of `cooperativeVectorTraining`.
    public static final MemoryLayout LAYOUT_cooperativeVectorTraining = LAYOUT.select(PathElement.groupElement("cooperativeVectorTraining"));
    /// The [VarHandle] of `cooperativeVectorTraining` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeVectorTraining = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTraining"));

    /// Creates `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCooperativeVectorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeVector `cooperativeVector`
    /// @param cooperativeVectorTraining `cooperativeVectorTraining`
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeVector, int cooperativeVectorTraining) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeVector(cooperativeVector).cooperativeVectorTraining(cooperativeVectorTraining);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeVector `cooperativeVector`
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeVector) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeVector(cooperativeVector);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV copyFrom(VkPhysicalDeviceCooperativeVectorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCooperativeVectorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeVector` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeVector(MemorySegment segment, long index) { return (int) VH_cooperativeVector.get(segment, 0L, index); }
    /// {@return `cooperativeVector`}
    public int cooperativeVector() { return cooperativeVector(this.segment(), 0L); }
    /// Sets `cooperativeVector` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeVector(MemorySegment segment, long index, int value) { VH_cooperativeVector.set(segment, 0L, index, value); }
    /// Sets `cooperativeVector` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVector(int value) { cooperativeVector(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeVectorTraining` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeVectorTraining(MemorySegment segment, long index) { return (int) VH_cooperativeVectorTraining.get(segment, 0L, index); }
    /// {@return `cooperativeVectorTraining`}
    public int cooperativeVectorTraining() { return cooperativeVectorTraining(this.segment(), 0L); }
    /// Sets `cooperativeVectorTraining` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeVectorTraining(MemorySegment segment, long index, int value) { VH_cooperativeVectorTraining.set(segment, 0L, index, value); }
    /// Sets `cooperativeVectorTraining` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTraining(int value) { cooperativeVectorTraining(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCooperativeVectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCooperativeVectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCooperativeVectorFeaturesNV`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCooperativeVectorFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV at(long index, Consumer<VkPhysicalDeviceCooperativeVectorFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `cooperativeVector` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeVectorAt(long index) { return cooperativeVector(this.segment(), index); }
    /// Sets `cooperativeVector` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorAt(long index, int value) { cooperativeVector(this.segment(), index, value); return this; }

    /// {@return `cooperativeVectorTraining` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeVectorTrainingAt(long index) { return cooperativeVectorTraining(this.segment(), index); }
    /// Sets `cooperativeVectorTraining` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTrainingAt(long index, int value) { cooperativeVectorTraining(this.segment(), index, value); return this; }

}
