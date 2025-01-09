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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### accelerationStructure
/// [VarHandle][#VH_accelerationStructure] - [Getter][#accelerationStructure()] - [Setter][#accelerationStructure(java.lang.foreign.MemorySegment)]
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### memoryOffset
/// [VarHandle][#VH_memoryOffset] - [Getter][#memoryOffset()] - [Setter][#memoryOffset(long)]
/// ### deviceIndexCount
/// [VarHandle][#VH_deviceIndexCount] - [Getter][#deviceIndexCount()] - [Setter][#deviceIndexCount(int)]
/// ### pDeviceIndices
/// [VarHandle][#VH_pDeviceIndices] - [Getter][#pDeviceIndices()] - [Setter][#pDeviceIndices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindAccelerationStructureMemoryInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureNV accelerationStructure;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     uint32_t deviceIndexCount;
///     const uint32_t * pDeviceIndices;
/// } VkBindAccelerationStructureMemoryInfoNV;
/// ```
public final class VkBindAccelerationStructureMemoryInfoNV extends Struct {
    /// The struct layout of `VkBindAccelerationStructureMemoryInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("accelerationStructure"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindAccelerationStructureMemoryInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindAccelerationStructureMemoryInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindAccelerationStructureMemoryInfoNV`
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator, long count) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkBindAccelerationStructureMemoryInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindAccelerationStructureMemoryInfoNV`
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkBindAccelerationStructureMemoryInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindAccelerationStructureMemoryInfoNV`
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index, long count) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindAccelerationStructureMemoryInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV sType(@CType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindAccelerationStructureMemoryInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_accelerationStructure(segment, 0L); }
    /// {@return `accelerationStructure` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructureAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_accelerationStructure(this.segment(), index); }
    /// {@return `accelerationStructure`}
    public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructure() { return VkBindAccelerationStructureMemoryInfoNV.get_accelerationStructure(this.segment()); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_accelerationStructure(segment, 0L, value); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructureAt(long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_accelerationStructure(this.segment(), index, value); return this; }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(@CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_accelerationStructure(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_memory(segment, 0L); }
    /// {@return `memory` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_memory(this.segment(), index); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkBindAccelerationStructureMemoryInfoNV.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_memory(this.segment(), index, value); return this; }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_memory(this.segment(), value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_memoryOffset(segment, 0L); }
    /// {@return `memoryOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long memoryOffsetAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_memoryOffset(this.segment(), index); }
    /// {@return `memoryOffset`}
    public @CType("VkDeviceSize") long memoryOffset() { return VkBindAccelerationStructureMemoryInfoNV.get_memoryOffset(this.segment()); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNV.set_memoryOffset(segment, 0L, value); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNV.set_memoryOffset(this.segment(), index, value); return this; }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(@CType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNV.set_memoryOffset(this.segment(), value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_deviceIndexCount(segment, 0L); }
    /// {@return `deviceIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceIndexCountAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_deviceIndexCount(this.segment(), index); }
    /// {@return `deviceIndexCount`}
    public @CType("uint32_t") int deviceIndexCount() { return VkBindAccelerationStructureMemoryInfoNV.get_deviceIndexCount(this.segment()); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindAccelerationStructureMemoryInfoNV.set_deviceIndexCount(segment, 0L, value); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCountAt(long index, @CType("uint32_t") int value) { VkBindAccelerationStructureMemoryInfoNV.set_deviceIndexCount(this.segment(), index, value); return this; }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCount(@CType("uint32_t") int value) { VkBindAccelerationStructureMemoryInfoNV.set_deviceIndexCount(this.segment(), value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceIndices(MemorySegment segment) { return VkBindAccelerationStructureMemoryInfoNV.get_pDeviceIndices(segment, 0L); }
    /// {@return `pDeviceIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceIndicesAt(long index) { return VkBindAccelerationStructureMemoryInfoNV.get_pDeviceIndices(this.segment(), index); }
    /// {@return `pDeviceIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceIndices() { return VkBindAccelerationStructureMemoryInfoNV.get_pDeviceIndices(this.segment()); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pDeviceIndices(segment, 0L, value); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pDeviceIndices(this.segment(), index, value); return this; }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindAccelerationStructureMemoryInfoNV.set_pDeviceIndices(this.segment(), value); return this; }

}
