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
package overrungl.vulkan.amdx.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkDeviceOrHostAddressConstAMDX {
///     (uint64_t) VkDeviceAddress deviceAddress;
///     const void* hostAddress;
/// };
/// ```
public final class VkDeviceOrHostAddressConstAMDX extends GroupType {
    /// The union layout of `VkDeviceOrHostAddressConstAMDX`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    /// The byte offset of `deviceAddress`.
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    /// The memory layout of `deviceAddress`.
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The byte offset of `hostAddress`.
    public static final long OFFSET_hostAddress = LAYOUT.byteOffset(PathElement.groupElement("hostAddress"));
    /// The memory layout of `hostAddress`.
    public static final MemoryLayout LAYOUT_hostAddress = LAYOUT.select(PathElement.groupElement("hostAddress"));
    /// The [VarHandle] of `hostAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkDeviceOrHostAddressConstAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressConstAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator and `deviceAddress`.
    /// @param allocator the segment allocator
    /// @param deviceAddress `deviceAddress`
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX allocWith_deviceAddress(SegmentAllocator allocator, long deviceAddress) {
        return alloc(allocator).deviceAddress(deviceAddress);
    }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator and `hostAddress`.
    /// @param allocator the segment allocator
    /// @param hostAddress `hostAddress`
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX allocWith_hostAddress(SegmentAllocator allocator, MemorySegment hostAddress) {
        return alloc(allocator).hostAddress(hostAddress);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX copyFrom(VkDeviceOrHostAddressConstAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceOrHostAddressConstAMDX reinterpret(long count) { return new VkDeviceOrHostAddressConstAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    public long deviceAddress() { return deviceAddress(this.segment(), 0L); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void deviceAddress(MemorySegment segment, long index, long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX deviceAddress(long value) { deviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment hostAddress(MemorySegment segment, long index) { return (MemorySegment) VH_hostAddress.get(segment, 0L, index); }
    /// {@return `hostAddress`}
    public MemorySegment hostAddress() { return hostAddress(this.segment(), 0L); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void hostAddress(MemorySegment segment, long index, MemorySegment value) { VH_hostAddress.set(segment, 0L, index, value); }
    /// Sets `hostAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX hostAddress(MemorySegment value) { hostAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceOrHostAddressConstAMDX`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkDeviceOrHostAddressConstAMDX`
    public VkDeviceOrHostAddressConstAMDX asSlice(long index) { return new VkDeviceOrHostAddressConstAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceOrHostAddressConstAMDX`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkDeviceOrHostAddressConstAMDX`
    public VkDeviceOrHostAddressConstAMDX asSlice(long index, long count) { return new VkDeviceOrHostAddressConstAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceOrHostAddressConstAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX at(long index, Consumer<VkDeviceOrHostAddressConstAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param index the index of the union buffer
    public long deviceAddressAt(long index) { return deviceAddress(this.segment(), index); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX deviceAddressAt(long index, long value) { deviceAddress(this.segment(), index, value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment hostAddressAt(long index) { return hostAddress(this.segment(), index); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX hostAddressAt(long index, MemorySegment value) { hostAddress(this.segment(), index, value); return this; }

}
