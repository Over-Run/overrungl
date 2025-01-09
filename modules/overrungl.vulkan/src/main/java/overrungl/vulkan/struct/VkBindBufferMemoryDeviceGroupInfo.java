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
package overrungl.vulkan.struct;

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
/// ### deviceIndexCount
/// [VarHandle][#VH_deviceIndexCount] - [Getter][#deviceIndexCount()] - [Setter][#deviceIndexCount(int)]
/// ### pDeviceIndices
/// [VarHandle][#VH_pDeviceIndices] - [Getter][#pDeviceIndices()] - [Setter][#pDeviceIndices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindBufferMemoryDeviceGroupInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t * pDeviceIndices;
/// } VkBindBufferMemoryDeviceGroupInfo;
/// ```
public final class VkBindBufferMemoryDeviceGroupInfo extends Struct {
    /// The struct layout of `VkBindBufferMemoryDeviceGroupInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindBufferMemoryDeviceGroupInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindBufferMemoryDeviceGroupInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindBufferMemoryDeviceGroupInfo`
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindBufferMemoryDeviceGroupInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindBufferMemoryDeviceGroupInfo`
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator, long count) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindBufferMemoryDeviceGroupInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBindBufferMemoryDeviceGroupInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindBufferMemoryDeviceGroupInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo sType(@CType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindBufferMemoryDeviceGroupInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindBufferMemoryDeviceGroupInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindBufferMemoryDeviceGroupInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment) { return VkBindBufferMemoryDeviceGroupInfo.get_deviceIndexCount(segment, 0L); }
    /// {@return `deviceIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceIndexCountAt(long index) { return VkBindBufferMemoryDeviceGroupInfo.get_deviceIndexCount(this.segment(), index); }
    /// {@return `deviceIndexCount`}
    public @CType("uint32_t") int deviceIndexCount() { return VkBindBufferMemoryDeviceGroupInfo.get_deviceIndexCount(this.segment()); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindBufferMemoryDeviceGroupInfo.set_deviceIndexCount(segment, 0L, value); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCountAt(long index, @CType("uint32_t") int value) { VkBindBufferMemoryDeviceGroupInfo.set_deviceIndexCount(this.segment(), index, value); return this; }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCount(@CType("uint32_t") int value) { VkBindBufferMemoryDeviceGroupInfo.set_deviceIndexCount(this.segment(), value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceIndices(MemorySegment segment) { return VkBindBufferMemoryDeviceGroupInfo.get_pDeviceIndices(segment, 0L); }
    /// {@return `pDeviceIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceIndicesAt(long index) { return VkBindBufferMemoryDeviceGroupInfo.get_pDeviceIndices(this.segment(), index); }
    /// {@return `pDeviceIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceIndices() { return VkBindBufferMemoryDeviceGroupInfo.get_pDeviceIndices(this.segment()); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pDeviceIndices(segment, 0L, value); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pDeviceIndices(this.segment(), index, value); return this; }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindBufferMemoryDeviceGroupInfo.set_pDeviceIndices(this.segment(), value); return this; }

}
