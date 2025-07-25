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
/// struct VkDeviceFaultAddressInfoEXT {
///     (int) VkDeviceFaultAddressTypeEXT addressType;
///     (uint64_t) VkDeviceAddress reportedAddress;
///     (uint64_t) VkDeviceSize addressPrecision;
/// };
/// ```
public final class VkDeviceFaultAddressInfoEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultAddressInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("addressType"),
        ValueLayout.JAVA_LONG.withName("reportedAddress"),
        ValueLayout.JAVA_LONG.withName("addressPrecision")
    );
    /// The byte offset of `addressType`.
    public static final long OFFSET_addressType = LAYOUT.byteOffset(PathElement.groupElement("addressType"));
    /// The memory layout of `addressType`.
    public static final MemoryLayout LAYOUT_addressType = LAYOUT.select(PathElement.groupElement("addressType"));
    /// The [VarHandle] of `addressType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressType"));
    /// The byte offset of `reportedAddress`.
    public static final long OFFSET_reportedAddress = LAYOUT.byteOffset(PathElement.groupElement("reportedAddress"));
    /// The memory layout of `reportedAddress`.
    public static final MemoryLayout LAYOUT_reportedAddress = LAYOUT.select(PathElement.groupElement("reportedAddress"));
    /// The [VarHandle] of `reportedAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reportedAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportedAddress"));
    /// The byte offset of `addressPrecision`.
    public static final long OFFSET_addressPrecision = LAYOUT.byteOffset(PathElement.groupElement("addressPrecision"));
    /// The memory layout of `addressPrecision`.
    public static final MemoryLayout LAYOUT_addressPrecision = LAYOUT.select(PathElement.groupElement("addressPrecision"));
    /// The [VarHandle] of `addressPrecision` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressPrecision = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressPrecision"));

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceFaultAddressInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultAddressInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultAddressInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceFaultAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultAddressInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultAddressInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultAddressInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param addressType `addressType`
    /// @param reportedAddress `reportedAddress`
    /// @param addressPrecision `addressPrecision`
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT allocInit(SegmentAllocator allocator, int addressType, long reportedAddress, long addressPrecision) {
        return alloc(allocator).addressType(addressType).reportedAddress(reportedAddress).addressPrecision(addressPrecision);
    }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param addressType `addressType`
    /// @param reportedAddress `reportedAddress`
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT allocInit(SegmentAllocator allocator, int addressType, long reportedAddress) {
        return alloc(allocator).addressType(addressType).reportedAddress(reportedAddress);
    }

    /// Allocates a `VkDeviceFaultAddressInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param addressType `addressType`
    /// @return the allocated `VkDeviceFaultAddressInfoEXT`
    public static VkDeviceFaultAddressInfoEXT allocInit(SegmentAllocator allocator, int addressType) {
        return alloc(allocator).addressType(addressType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT copyFrom(VkDeviceFaultAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceFaultAddressInfoEXT reinterpret(long count) { return new VkDeviceFaultAddressInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `addressType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressType(MemorySegment segment, long index) { return (int) VH_addressType.get(segment, 0L, index); }
    /// {@return `addressType`}
    public int addressType() { return addressType(this.segment(), 0L); }
    /// Sets `addressType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressType(MemorySegment segment, long index, int value) { VH_addressType.set(segment, 0L, index, value); }
    /// Sets `addressType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressType(int value) { addressType(this.segment(), 0L, value); return this; }

    /// {@return `reportedAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long reportedAddress(MemorySegment segment, long index) { return (long) VH_reportedAddress.get(segment, 0L, index); }
    /// {@return `reportedAddress`}
    public long reportedAddress() { return reportedAddress(this.segment(), 0L); }
    /// Sets `reportedAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reportedAddress(MemorySegment segment, long index, long value) { VH_reportedAddress.set(segment, 0L, index, value); }
    /// Sets `reportedAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT reportedAddress(long value) { reportedAddress(this.segment(), 0L, value); return this; }

    /// {@return `addressPrecision` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long addressPrecision(MemorySegment segment, long index) { return (long) VH_addressPrecision.get(segment, 0L, index); }
    /// {@return `addressPrecision`}
    public long addressPrecision() { return addressPrecision(this.segment(), 0L); }
    /// Sets `addressPrecision` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressPrecision(MemorySegment segment, long index, long value) { VH_addressPrecision.set(segment, 0L, index, value); }
    /// Sets `addressPrecision` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressPrecision(long value) { addressPrecision(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceFaultAddressInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceFaultAddressInfoEXT`
    public VkDeviceFaultAddressInfoEXT asSlice(long index) { return new VkDeviceFaultAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceFaultAddressInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceFaultAddressInfoEXT`
    public VkDeviceFaultAddressInfoEXT asSlice(long index, long count) { return new VkDeviceFaultAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceFaultAddressInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT at(long index, Consumer<VkDeviceFaultAddressInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `addressType` at the given index}
    /// @param index the index of the struct buffer
    public int addressTypeAt(long index) { return addressType(this.segment(), index); }
    /// Sets `addressType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressTypeAt(long index, int value) { addressType(this.segment(), index, value); return this; }

    /// {@return `reportedAddress` at the given index}
    /// @param index the index of the struct buffer
    public long reportedAddressAt(long index) { return reportedAddress(this.segment(), index); }
    /// Sets `reportedAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT reportedAddressAt(long index, long value) { reportedAddress(this.segment(), index, value); return this; }

    /// {@return `addressPrecision` at the given index}
    /// @param index the index of the struct buffer
    public long addressPrecisionAt(long index) { return addressPrecision(this.segment(), index); }
    /// Sets `addressPrecision` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultAddressInfoEXT addressPrecisionAt(long index, long value) { addressPrecision(this.segment(), index, value); return this; }

}
