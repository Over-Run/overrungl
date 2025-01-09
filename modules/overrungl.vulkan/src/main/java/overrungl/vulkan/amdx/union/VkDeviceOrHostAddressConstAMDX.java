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
package overrungl.vulkan.amdx.union;

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
/// typedef union VkDeviceOrHostAddressConstAMDX {
///     VkDeviceAddress deviceAddress;
///     const void * hostAddress;
/// } VkDeviceOrHostAddressConstAMDX;
/// ```
public final class VkDeviceOrHostAddressConstAMDX extends Union {
    /// The union layout of `VkDeviceOrHostAddressConstAMDX`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `hostAddress` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    public VkDeviceOrHostAddressConstAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressConstAMDX(allocator.allocate(LAYOUT, count)); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX deviceAddress(@CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_hostAddress(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_hostAddress.get(segment, 0L, index); }
    /// {@return `hostAddress`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_hostAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(segment, 0L); }
    /// {@return `hostAddress` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment hostAddressAt(long index) { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(this.segment(), index); }
    /// {@return `hostAddress`}
    public @CType("const void *") java.lang.foreign.MemorySegment hostAddress() { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(this.segment()); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_hostAddress.set(segment, 0L, index, value); }
    /// Sets `hostAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(segment, 0L, value); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX hostAddressAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(this.segment(), index, value); return this; }
    /// Sets `hostAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX hostAddress(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(this.segment(), value); return this; }

}