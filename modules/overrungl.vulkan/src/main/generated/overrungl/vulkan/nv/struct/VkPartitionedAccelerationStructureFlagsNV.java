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
/// struct VkPartitionedAccelerationStructureFlagsNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 enablePartitionTranslation;
/// };
/// ```
public final class VkPartitionedAccelerationStructureFlagsNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureFlagsNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enablePartitionTranslation")
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
    /// The byte offset of `enablePartitionTranslation`.
    public static final long OFFSET_enablePartitionTranslation = LAYOUT.byteOffset(PathElement.groupElement("enablePartitionTranslation"));
    /// The memory layout of `enablePartitionTranslation`.
    public static final MemoryLayout LAYOUT_enablePartitionTranslation = LAYOUT.select(PathElement.groupElement("enablePartitionTranslation"));
    /// The [VarHandle] of `enablePartitionTranslation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enablePartitionTranslation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enablePartitionTranslation"));

    /// Creates `VkPartitionedAccelerationStructureFlagsNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPartitionedAccelerationStructureFlagsNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPartitionedAccelerationStructureFlagsNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureFlagsNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureFlagsNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPartitionedAccelerationStructureFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureFlagsNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureFlagsNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureFlagsNV`
    public static VkPartitionedAccelerationStructureFlagsNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureFlagsNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPartitionedAccelerationStructureFlagsNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureFlagsNV`
    public static VkPartitionedAccelerationStructureFlagsNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureFlagsNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPartitionedAccelerationStructureFlagsNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param enablePartitionTranslation `enablePartitionTranslation`
    /// @return the allocated `VkPartitionedAccelerationStructureFlagsNV`
    public static VkPartitionedAccelerationStructureFlagsNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int enablePartitionTranslation) {
        return alloc(allocator).sType(sType).pNext(pNext).enablePartitionTranslation(enablePartitionTranslation);
    }

    /// Allocates a `VkPartitionedAccelerationStructureFlagsNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPartitionedAccelerationStructureFlagsNV`
    public static VkPartitionedAccelerationStructureFlagsNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPartitionedAccelerationStructureFlagsNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPartitionedAccelerationStructureFlagsNV`
    public static VkPartitionedAccelerationStructureFlagsNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV copyFrom(VkPartitionedAccelerationStructureFlagsNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPartitionedAccelerationStructureFlagsNV reinterpret(long count) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPartitionedAccelerationStructureFlagsNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPartitionedAccelerationStructureFlagsNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `enablePartitionTranslation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enablePartitionTranslation(MemorySegment segment, long index) { return (int) VH_enablePartitionTranslation.get(segment, 0L, index); }
    /// {@return `enablePartitionTranslation`}
    public int enablePartitionTranslation() { return enablePartitionTranslation(this.segment(), 0L); }
    /// Sets `enablePartitionTranslation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enablePartitionTranslation(MemorySegment segment, long index, int value) { VH_enablePartitionTranslation.set(segment, 0L, index, value); }
    /// Sets `enablePartitionTranslation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslation(int value) { enablePartitionTranslation(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPartitionedAccelerationStructureFlagsNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPartitionedAccelerationStructureFlagsNV`
    public VkPartitionedAccelerationStructureFlagsNV asSlice(long index) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPartitionedAccelerationStructureFlagsNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPartitionedAccelerationStructureFlagsNV`
    public VkPartitionedAccelerationStructureFlagsNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPartitionedAccelerationStructureFlagsNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV at(long index, Consumer<VkPartitionedAccelerationStructureFlagsNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `enablePartitionTranslation` at the given index}
    /// @param index the index of the struct buffer
    public int enablePartitionTranslationAt(long index) { return enablePartitionTranslation(this.segment(), index); }
    /// Sets `enablePartitionTranslation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslationAt(long index, int value) { enablePartitionTranslation(this.segment(), index, value); return this; }

}
