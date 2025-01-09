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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### deviceAddress
/// [VarHandle][#VH_deviceAddress] - [Getter][#deviceAddress()] - [Setter][#deviceAddress(long)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkStridedDeviceAddressRegionKHR {
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize stride;
///     VkDeviceSize size;
/// } VkStridedDeviceAddressRegionKHR;
/// ```
public final class VkStridedDeviceAddressRegionKHR extends Struct {
    /// The struct layout of `VkStridedDeviceAddressRegionKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("stride"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    /// @param segment the memory segment
    public VkStridedDeviceAddressRegionKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkStridedDeviceAddressRegionKHR`
    public VkStridedDeviceAddressRegionKHR asSlice(long index) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkStridedDeviceAddressRegionKHR`
    public VkStridedDeviceAddressRegionKHR asSlice(long index, long count) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkStridedDeviceAddressRegionKHR.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkStridedDeviceAddressRegionKHR.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkStridedDeviceAddressRegionKHR.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR deviceAddress(@CType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_stride(MemorySegment segment, long index) { return (long) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_stride(MemorySegment segment) { return VkStridedDeviceAddressRegionKHR.get_stride(segment, 0L); }
    /// {@return `stride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long strideAt(long index) { return VkStridedDeviceAddressRegionKHR.get_stride(this.segment(), index); }
    /// {@return `stride`}
    public @CType("VkDeviceSize") long stride() { return VkStridedDeviceAddressRegionKHR.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR strideAt(long index, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_stride(this.segment(), index, value); return this; }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR stride(@CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_stride(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkStridedDeviceAddressRegionKHR.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkStridedDeviceAddressRegionKHR.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkStridedDeviceAddressRegionKHR.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR sizeAt(long index, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR size(@CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_size(this.segment(), value); return this; }

}
