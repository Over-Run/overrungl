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
/// struct VkBindAccelerationStructureMemoryInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkAccelerationStructureNV accelerationStructure;
///     (uint64_t) VkDeviceMemory memory;
///     (uint64_t) VkDeviceSize memoryOffset;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
/// };
/// ```
public final class VkBindAccelerationStructureMemoryInfoNV extends GroupType {
    /// The struct layout of `VkBindAccelerationStructureMemoryInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
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
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The byte offset of `memoryOffset`.
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    /// The memory layout of `memoryOffset`.
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The byte offset of `deviceIndexCount`.
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    /// The memory layout of `deviceIndexCount`.
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The byte offset of `pDeviceIndices`.
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    /// The memory layout of `pDeviceIndices`.
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator, long count) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param accelerationStructure `accelerationStructure`
    /// @param memory `memory`
    /// @param memoryOffset `memoryOffset`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @param pDeviceIndices `pDeviceIndices`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long accelerationStructure, long memory, long memoryOffset, int deviceIndexCount, MemorySegment pDeviceIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure).memory(memory).memoryOffset(memoryOffset).deviceIndexCount(deviceIndexCount).pDeviceIndices(pDeviceIndices);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param accelerationStructure `accelerationStructure`
    /// @param memory `memory`
    /// @param memoryOffset `memoryOffset`
    /// @param deviceIndexCount `deviceIndexCount`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long accelerationStructure, long memory, long memoryOffset, int deviceIndexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure).memory(memory).memoryOffset(memoryOffset).deviceIndexCount(deviceIndexCount);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param accelerationStructure `accelerationStructure`
    /// @param memory `memory`
    /// @param memoryOffset `memoryOffset`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long accelerationStructure, long memory, long memoryOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure).memory(memory).memoryOffset(memoryOffset);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param accelerationStructure `accelerationStructure`
    /// @param memory `memory`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long accelerationStructure, long memory) {
        return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure).memory(memory);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param accelerationStructure `accelerationStructure`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long accelerationStructure) {
        return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV copyFrom(VkBindAccelerationStructureMemoryInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindAccelerationStructureMemoryInfoNV reinterpret(long count) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindAccelerationStructureMemoryInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindAccelerationStructureMemoryInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructure(MemorySegment segment, long index) { return (long) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    public long accelerationStructure() { return accelerationStructure(this.segment(), 0L); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructure(MemorySegment segment, long index, long value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(long value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    public long memoryOffset() { return memoryOffset(this.segment(), 0L); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryOffset(MemorySegment segment, long index, long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(long value) { memoryOffset(this.segment(), 0L, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    public int deviceIndexCount() { return deviceIndexCount(this.segment(), 0L); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceIndexCount(MemorySegment segment, long index, int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCount(int value) { deviceIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    public MemorySegment pDeviceIndices() { return pDeviceIndices(this.segment(), 0L); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceIndices(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(MemorySegment value) { pDeviceIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindAccelerationStructureMemoryInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindAccelerationStructureMemoryInfoNV`
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindAccelerationStructureMemoryInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindAccelerationStructureMemoryInfoNV`
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index, long count) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindAccelerationStructureMemoryInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV at(long index, Consumer<VkBindAccelerationStructureMemoryInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructureAt(long index, long value) { accelerationStructure(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param index the index of the struct buffer
    public long memoryOffsetAt(long index) { return memoryOffset(this.segment(), index); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryOffsetAt(long index, long value) { memoryOffset(this.segment(), index, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIndexCountAt(long index) { return deviceIndexCount(this.segment(), index); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCountAt(long index, int value) { deviceIndexCount(this.segment(), index, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDeviceIndicesAt(long index) { return pDeviceIndices(this.segment(), index); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndicesAt(long index, MemorySegment value) { pDeviceIndices(this.segment(), index, value); return this; }

}
