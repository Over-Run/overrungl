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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### addressType
/// [VarHandle][#VH_addressType] - [Getter][#addressType()] - [Setter][#addressType(int)]
/// ### reportedAddress
/// [VarHandle][#VH_reportedAddress] - [Getter][#reportedAddress()] - [Setter][#reportedAddress(long)]
/// ### addressPrecision
/// [VarHandle][#VH_addressPrecision] - [Getter][#addressPrecision()] - [Setter][#addressPrecision(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceFaultAddressInfoEXT {
///     VkDeviceFaultAddressTypeEXT addressType;
///     VkDeviceAddress reportedAddress;
///     VkDeviceSize addressPrecision;
/// } VkDeviceFaultAddressInfoEXT;
/// ```
public sealed class VkDeviceFaultAddressInfoEXT extends Struct {
    /// The struct layout of `VkDeviceFaultAddressInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("addressType"),
        ValueLayout.JAVA_LONG.withName("reportedAddress"),
        ValueLayout.JAVA_LONG.withName("addressPrecision")
    );
    /// The [VarHandle] of `addressType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_addressType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressType"));
    /// The [VarHandle] of `reportedAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_reportedAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportedAddress"));
    /// The [VarHandle] of `addressPrecision` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_addressPrecision = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressPrecision"));

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultAddressInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultAddressInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultAddressInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultAddressInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT allocInit(SegmentAllocator allocator, @CType("VkDeviceFaultAddressTypeEXT") int addressType, @CType("VkDeviceAddress") long reportedAddress, @CType("VkDeviceSize") long addressPrecision) { return alloc(allocator).addressType(addressType).reportedAddress(reportedAddress).addressPrecision(addressPrecision); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT copyFrom(VkDeviceFaultAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `addressType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceFaultAddressTypeEXT") int get_addressType(MemorySegment segment, long index) { return (int) VH_addressType.get(segment, 0L, index); }
    /// {@return `addressType`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceFaultAddressTypeEXT") int get_addressType(MemorySegment segment) { return VkDeviceFaultAddressInfoEXT.get_addressType(segment, 0L); }
    /// {@return `addressType`}
    public @CType("VkDeviceFaultAddressTypeEXT") int addressType() { return VkDeviceFaultAddressInfoEXT.get_addressType(this.segment()); }
    /// Sets `addressType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressType(MemorySegment segment, long index, @CType("VkDeviceFaultAddressTypeEXT") int value) { VH_addressType.set(segment, 0L, index, value); }
    /// Sets `addressType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressType(MemorySegment segment, @CType("VkDeviceFaultAddressTypeEXT") int value) { VkDeviceFaultAddressInfoEXT.set_addressType(segment, 0L, value); }
    /// Sets `addressType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressType(@CType("VkDeviceFaultAddressTypeEXT") int value) { VkDeviceFaultAddressInfoEXT.set_addressType(this.segment(), value); return this; }

    /// {@return `reportedAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_reportedAddress(MemorySegment segment, long index) { return (long) VH_reportedAddress.get(segment, 0L, index); }
    /// {@return `reportedAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_reportedAddress(MemorySegment segment) { return VkDeviceFaultAddressInfoEXT.get_reportedAddress(segment, 0L); }
    /// {@return `reportedAddress`}
    public @CType("VkDeviceAddress") long reportedAddress() { return VkDeviceFaultAddressInfoEXT.get_reportedAddress(this.segment()); }
    /// Sets `reportedAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reportedAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_reportedAddress.set(segment, 0L, index, value); }
    /// Sets `reportedAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reportedAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDeviceFaultAddressInfoEXT.set_reportedAddress(segment, 0L, value); }
    /// Sets `reportedAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT reportedAddress(@CType("VkDeviceAddress") long value) { VkDeviceFaultAddressInfoEXT.set_reportedAddress(this.segment(), value); return this; }

    /// {@return `addressPrecision` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_addressPrecision(MemorySegment segment, long index) { return (long) VH_addressPrecision.get(segment, 0L, index); }
    /// {@return `addressPrecision`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_addressPrecision(MemorySegment segment) { return VkDeviceFaultAddressInfoEXT.get_addressPrecision(segment, 0L); }
    /// {@return `addressPrecision`}
    public @CType("VkDeviceSize") long addressPrecision() { return VkDeviceFaultAddressInfoEXT.get_addressPrecision(this.segment()); }
    /// Sets `addressPrecision` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressPrecision(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_addressPrecision.set(segment, 0L, index, value); }
    /// Sets `addressPrecision` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressPrecision(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDeviceFaultAddressInfoEXT.set_addressPrecision(segment, 0L, value); }
    /// Sets `addressPrecision` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressPrecision(@CType("VkDeviceSize") long value) { VkDeviceFaultAddressInfoEXT.set_addressPrecision(this.segment(), value); return this; }

    /// A buffer of [VkDeviceFaultAddressInfoEXT].
    public static final class Buffer extends VkDeviceFaultAddressInfoEXT {
        private final long elementCount;

        /// Creates `VkDeviceFaultAddressInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceFaultAddressInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceFaultAddressInfoEXT`
        public VkDeviceFaultAddressInfoEXT asSlice(long index) { return new VkDeviceFaultAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceFaultAddressInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceFaultAddressInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `addressType` at the given index}
        /// @param index the index
        public @CType("VkDeviceFaultAddressTypeEXT") int addressTypeAt(long index) { return VkDeviceFaultAddressInfoEXT.get_addressType(this.segment(), index); }
        /// Sets `addressType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressTypeAt(long index, @CType("VkDeviceFaultAddressTypeEXT") int value) { VkDeviceFaultAddressInfoEXT.set_addressType(this.segment(), index, value); return this; }

        /// {@return `reportedAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long reportedAddressAt(long index) { return VkDeviceFaultAddressInfoEXT.get_reportedAddress(this.segment(), index); }
        /// Sets `reportedAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reportedAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDeviceFaultAddressInfoEXT.set_reportedAddress(this.segment(), index, value); return this; }

        /// {@return `addressPrecision` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long addressPrecisionAt(long index) { return VkDeviceFaultAddressInfoEXT.get_addressPrecision(this.segment(), index); }
        /// Sets `addressPrecision` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressPrecisionAt(long index, @CType("VkDeviceSize") long value) { VkDeviceFaultAddressInfoEXT.set_addressPrecision(this.segment(), index, value); return this; }

    }
}
