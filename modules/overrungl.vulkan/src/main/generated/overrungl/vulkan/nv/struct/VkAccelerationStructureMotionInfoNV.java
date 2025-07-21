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
/// struct VkAccelerationStructureMotionInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInstances;
///     ((uint32_t) VkFlags) VkAccelerationStructureMotionInfoFlagsNV flags;
/// };
/// ```
public final class VkAccelerationStructureMotionInfoNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureMotionInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInstances"),
        ValueLayout.JAVA_INT.withName("flags")
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
    /// The byte offset of `maxInstances`.
    public static final long OFFSET_maxInstances = LAYOUT.byteOffset(PathElement.groupElement("maxInstances"));
    /// The memory layout of `maxInstances`.
    public static final MemoryLayout LAYOUT_maxInstances = LAYOUT.select(PathElement.groupElement("maxInstances"));
    /// The [VarHandle] of `maxInstances` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInstances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstances"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkAccelerationStructureMotionInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureMotionInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureMotionInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureMotionInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureMotionInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMotionInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxInstances `maxInstances`
    /// @param flags `flags`
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxInstances, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).maxInstances(maxInstances).flags(flags);
    }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxInstances `maxInstances`
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxInstances) {
        return alloc(allocator).sType(sType).pNext(pNext).maxInstances(maxInstances);
    }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAccelerationStructureMotionInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAccelerationStructureMotionInfoNV`
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV copyFrom(VkAccelerationStructureMotionInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureMotionInfoNV reinterpret(long count) { return new VkAccelerationStructureMotionInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureMotionInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureMotionInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxInstances` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInstances(MemorySegment segment, long index) { return (int) VH_maxInstances.get(segment, 0L, index); }
    /// {@return `maxInstances`}
    public int maxInstances() { return maxInstances(this.segment(), 0L); }
    /// Sets `maxInstances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInstances(MemorySegment segment, long index, int value) { VH_maxInstances.set(segment, 0L, index, value); }
    /// Sets `maxInstances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV maxInstances(int value) { maxInstances(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureMotionInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureMotionInfoNV`
    public VkAccelerationStructureMotionInfoNV asSlice(long index) { return new VkAccelerationStructureMotionInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureMotionInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureMotionInfoNV`
    public VkAccelerationStructureMotionInfoNV asSlice(long index, long count) { return new VkAccelerationStructureMotionInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureMotionInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV at(long index, Consumer<VkAccelerationStructureMotionInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxInstances` at the given index}
    /// @param index the index of the struct buffer
    public int maxInstancesAt(long index) { return maxInstances(this.segment(), index); }
    /// Sets `maxInstances` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV maxInstancesAt(long index, int value) { maxInstances(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}
