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
/// struct VkPhysicalDeviceCooperativeMatrix2PropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t cooperativeMatrixWorkgroupScopeMaxWorkgroupSize;
///     uint32_t cooperativeMatrixFlexibleDimensionsMaxDimension;
///     uint32_t cooperativeMatrixWorkgroupScopeReservedSharedMemory;
/// };
/// ```
public final class VkPhysicalDeviceCooperativeMatrix2PropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensionsMaxDimension"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeReservedSharedMemory")
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
    /// The byte offset of `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`.
    public static final long OFFSET_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    /// The memory layout of `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    /// The byte offset of `cooperativeMatrixFlexibleDimensionsMaxDimension`.
    public static final long OFFSET_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    /// The memory layout of `cooperativeMatrixFlexibleDimensionsMaxDimension`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.select(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    /// The [VarHandle] of `cooperativeMatrixFlexibleDimensionsMaxDimension` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    /// The byte offset of `cooperativeMatrixWorkgroupScopeReservedSharedMemory`.
    public static final long OFFSET_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));
    /// The memory layout of `cooperativeMatrixWorkgroupScopeReservedSharedMemory`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScopeReservedSharedMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScopeMaxWorkgroupSize `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`
    /// @param cooperativeMatrixFlexibleDimensionsMaxDimension `cooperativeMatrixFlexibleDimensionsMaxDimension`
    /// @param cooperativeMatrixWorkgroupScopeReservedSharedMemory `cooperativeMatrixWorkgroupScopeReservedSharedMemory`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, int cooperativeMatrixFlexibleDimensionsMaxDimension, int cooperativeMatrixWorkgroupScopeReservedSharedMemory) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(cooperativeMatrixWorkgroupScopeMaxWorkgroupSize).cooperativeMatrixFlexibleDimensionsMaxDimension(cooperativeMatrixFlexibleDimensionsMaxDimension).cooperativeMatrixWorkgroupScopeReservedSharedMemory(cooperativeMatrixWorkgroupScopeReservedSharedMemory);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScopeMaxWorkgroupSize `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`
    /// @param cooperativeMatrixFlexibleDimensionsMaxDimension `cooperativeMatrixFlexibleDimensionsMaxDimension`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, int cooperativeMatrixFlexibleDimensionsMaxDimension) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(cooperativeMatrixWorkgroupScopeMaxWorkgroupSize).cooperativeMatrixFlexibleDimensionsMaxDimension(cooperativeMatrixFlexibleDimensionsMaxDimension);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScopeMaxWorkgroupSize `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(cooperativeMatrixWorkgroupScopeMaxWorkgroupSize);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV copyFrom(VkPhysicalDeviceCooperativeMatrix2PropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`}
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), 0L); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment, long index, int value) { VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(int value) { cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixFlexibleDimensionsMaxDimension.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension`}
    public int cooperativeMatrixFlexibleDimensionsMaxDimension() { return cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), 0L); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment, long index, int value) { VH_cooperativeMatrixFlexibleDimensionsMaxDimension.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimension(int value) { cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory`}
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), 0L); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment, long index, int value) { VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemory(int value) { cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV at(long index, Consumer<VkPhysicalDeviceCooperativeMatrix2PropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index) { return cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), index); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index, int value) { cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), index, value); return this; }

    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index) { return cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), index); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index, int value) { cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), index, value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index) { return cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), index); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index, int value) { cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), index, value); return this; }

}
