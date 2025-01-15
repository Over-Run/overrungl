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
public sealed class VkStridedDeviceAddressRegionKHR extends Struct {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR allocInit(SegmentAllocator allocator, @CType("VkDeviceAddress") long deviceAddress, @CType("VkDeviceSize") long stride, @CType("VkDeviceSize") long size) { return alloc(allocator).deviceAddress(deviceAddress).stride(stride).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR copyFrom(VkStridedDeviceAddressRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkStridedDeviceAddressRegionKHR.get_deviceAddress(segment, 0L); }
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
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR size(@CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_size(this.segment(), value); return this; }

    /// A buffer of [VkStridedDeviceAddressRegionKHR].
    public static final class Buffer extends VkStridedDeviceAddressRegionKHR {
        private final long elementCount;

        /// Creates `VkStridedDeviceAddressRegionKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkStridedDeviceAddressRegionKHR`
        public VkStridedDeviceAddressRegionKHR asSlice(long index) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkStridedDeviceAddressRegionKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `deviceAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkStridedDeviceAddressRegionKHR.get_deviceAddress(this.segment(), index); }
        /// Sets `deviceAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.set_deviceAddress(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long strideAt(long index) { return VkStridedDeviceAddressRegionKHR.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_stride(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkStridedDeviceAddressRegionKHR.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.set_size(this.segment(), index, value); return this; }

    }
}
