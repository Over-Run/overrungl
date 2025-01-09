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
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### deviceAddress
/// [VarHandle][#VH_deviceAddress] - [Getter][#deviceAddress()] - [Setter][#deviceAddress(long)]
/// ### hostAddress
/// [VarHandle][#VH_hostAddress] - [Getter][#hostAddress()] - [Setter][#hostAddress(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkDeviceOrHostAddressConstKHR {
///     VkDeviceAddress deviceAddress;
///     const void * hostAddress;
/// } VkDeviceOrHostAddressConstKHR;
/// ```
public final class VkDeviceOrHostAddressConstKHR extends Union {
    /// The union layout of `VkDeviceOrHostAddressConstKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `hostAddress` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    /// @param segment the memory segment
    public VkDeviceOrHostAddressConstKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceOrHostAddressConstKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceOrHostAddressConstKHR`
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceOrHostAddressConstKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceOrHostAddressConstKHR`
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstKHR.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkDeviceOrHostAddressConstKHR.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkDeviceOrHostAddressConstKHR.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstKHR.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstKHR.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR deviceAddress(@CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstKHR.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_hostAddress(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_hostAddress.get(segment, 0L, index); }
    /// {@return `hostAddress`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_hostAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstKHR.get_hostAddress(segment, 0L); }
    /// {@return `hostAddress` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment hostAddressAt(long index) { return VkDeviceOrHostAddressConstKHR.get_hostAddress(this.segment(), index); }
    /// {@return `hostAddress`}
    public @CType("const void *") java.lang.foreign.MemorySegment hostAddress() { return VkDeviceOrHostAddressConstKHR.get_hostAddress(this.segment()); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_hostAddress.set(segment, 0L, index, value); }
    /// Sets `hostAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstKHR.set_hostAddress(segment, 0L, value); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR hostAddressAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstKHR.set_hostAddress(this.segment(), index, value); return this; }
    /// Sets `hostAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR hostAddress(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstKHR.set_hostAddress(this.segment(), value); return this; }

}
