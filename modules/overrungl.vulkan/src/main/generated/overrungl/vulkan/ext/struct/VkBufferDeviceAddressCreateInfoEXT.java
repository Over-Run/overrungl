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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferDeviceAddressCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceAddress deviceAddress;
/// };
/// ```
public final class VkBufferDeviceAddressCreateInfoEXT extends GroupType {
    /// The struct layout of `VkBufferDeviceAddressCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress")
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
    /// The byte offset of `deviceAddress`.
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    /// The memory layout of `deviceAddress`.
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));

    /// Creates `VkBufferDeviceAddressCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferDeviceAddressCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferDeviceAddressCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferDeviceAddressCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferDeviceAddressCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferDeviceAddressCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferDeviceAddressCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferDeviceAddressCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferDeviceAddressCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferDeviceAddressCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferDeviceAddressCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferDeviceAddressCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferDeviceAddressCreateInfoEXT`
    public static VkBufferDeviceAddressCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkBufferDeviceAddressCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferDeviceAddressCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferDeviceAddressCreateInfoEXT`
    public static VkBufferDeviceAddressCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkBufferDeviceAddressCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferDeviceAddressCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceAddress `deviceAddress`
    /// @return the allocated `VkBufferDeviceAddressCreateInfoEXT`
    public static VkBufferDeviceAddressCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long deviceAddress) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceAddress(deviceAddress);
    }

    /// Allocates a `VkBufferDeviceAddressCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBufferDeviceAddressCreateInfoEXT`
    public static VkBufferDeviceAddressCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBufferDeviceAddressCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBufferDeviceAddressCreateInfoEXT`
    public static VkBufferDeviceAddressCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT copyFrom(VkBufferDeviceAddressCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferDeviceAddressCreateInfoEXT reinterpret(long count) { return new VkBufferDeviceAddressCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBufferDeviceAddressCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferDeviceAddressCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    public long deviceAddress() { return deviceAddress(this.segment(), 0L); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceAddress(MemorySegment segment, long index, long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT deviceAddress(long value) { deviceAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBufferDeviceAddressCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferDeviceAddressCreateInfoEXT`
    public VkBufferDeviceAddressCreateInfoEXT asSlice(long index) { return new VkBufferDeviceAddressCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferDeviceAddressCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferDeviceAddressCreateInfoEXT`
    public VkBufferDeviceAddressCreateInfoEXT asSlice(long index, long count) { return new VkBufferDeviceAddressCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferDeviceAddressCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT at(long index, Consumer<VkBufferDeviceAddressCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param index the index of the struct buffer
    public long deviceAddressAt(long index) { return deviceAddress(this.segment(), index); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferDeviceAddressCreateInfoEXT deviceAddressAt(long index, long value) { deviceAddress(this.segment(), index, value); return this; }

}
