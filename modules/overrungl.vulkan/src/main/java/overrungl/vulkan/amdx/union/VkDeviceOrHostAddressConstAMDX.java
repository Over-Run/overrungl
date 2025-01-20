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
/// [VarHandle][#VH_hostAddress] - [Getter][#hostAddress()] - [Setter][#hostAddress(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkDeviceOrHostAddressConstAMDX {
///     VkDeviceAddress deviceAddress;
///     const void * hostAddress;
/// } VkDeviceOrHostAddressConstAMDX;
/// ```
public sealed class VkDeviceOrHostAddressConstAMDX extends Union {
    /// The union layout of `VkDeviceOrHostAddressConstAMDX`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `hostAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    public VkDeviceOrHostAddressConstAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstAMDX(segment); }

    /// Creates `VkDeviceOrHostAddressConstAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static VkDeviceOrHostAddressConstAMDX alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceOrHostAddressConstAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceOrHostAddressConstAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX copyFrom(VkDeviceOrHostAddressConstAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the union
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX deviceAddress(@CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_hostAddress(MemorySegment segment, long index) { return (MemorySegment) VH_hostAddress.get(segment, 0L, index); }
    /// {@return `hostAddress`}
    /// @param segment the segment of the union
    public static @CType("const void *") MemorySegment get_hostAddress(MemorySegment segment) { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(segment, 0L); }
    /// {@return `hostAddress`}
    public @CType("const void *") MemorySegment hostAddress() { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(this.segment()); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_hostAddress.set(segment, 0L, index, value); }
    /// Sets `hostAddress` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_hostAddress(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(segment, 0L, value); }
    /// Sets `hostAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstAMDX hostAddress(@CType("const void *") MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(this.segment(), value); return this; }

    /// A buffer of [VkDeviceOrHostAddressConstAMDX].
    public static final class Buffer extends VkDeviceOrHostAddressConstAMDX {
        private final long elementCount;

        /// Creates `VkDeviceOrHostAddressConstAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceOrHostAddressConstAMDX`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkDeviceOrHostAddressConstAMDX`
        public VkDeviceOrHostAddressConstAMDX asSlice(long index) { return new VkDeviceOrHostAddressConstAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceOrHostAddressConstAMDX`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkDeviceOrHostAddressConstAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `deviceAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkDeviceOrHostAddressConstAMDX.get_deviceAddress(this.segment(), index); }
        /// Sets `deviceAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.set_deviceAddress(this.segment(), index, value); return this; }

        /// {@return `hostAddress` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment hostAddressAt(long index) { return VkDeviceOrHostAddressConstAMDX.get_hostAddress(this.segment(), index); }
        /// Sets `hostAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hostAddressAt(long index, @CType("const void *") MemorySegment value) { VkDeviceOrHostAddressConstAMDX.set_hostAddress(this.segment(), index, value); return this; }

    }
}
