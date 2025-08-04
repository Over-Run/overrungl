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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkStridedDeviceAddressNV {
///     (uint64_t) VkDeviceAddress startAddress;
///     (uint64_t) VkDeviceSize strideInBytes;
/// };
/// ```
public final class VkStridedDeviceAddressNV extends GroupType {
    /// The struct layout of `VkStridedDeviceAddressNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("startAddress"),
        ValueLayout.JAVA_LONG.withName("strideInBytes")
    );
    /// The byte offset of `startAddress`.
    public static final long OFFSET_startAddress = LAYOUT.byteOffset(PathElement.groupElement("startAddress"));
    /// The memory layout of `startAddress`.
    public static final MemoryLayout LAYOUT_startAddress = LAYOUT.select(PathElement.groupElement("startAddress"));
    /// The [VarHandle] of `startAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_startAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("startAddress"));
    /// The byte offset of `strideInBytes`.
    public static final long OFFSET_strideInBytes = LAYOUT.byteOffset(PathElement.groupElement("strideInBytes"));
    /// The memory layout of `strideInBytes`.
    public static final MemoryLayout LAYOUT_strideInBytes = LAYOUT.select(PathElement.groupElement("strideInBytes"));
    /// The [VarHandle] of `strideInBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_strideInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("strideInBytes"));

    /// Creates `VkStridedDeviceAddressNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkStridedDeviceAddressNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkStridedDeviceAddressNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkStridedDeviceAddressNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkStridedDeviceAddressNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkStridedDeviceAddressNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressNV`
    public static VkStridedDeviceAddressNV alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkStridedDeviceAddressNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStridedDeviceAddressNV`
    public static VkStridedDeviceAddressNV alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStridedDeviceAddressNV copyFrom(VkStridedDeviceAddressNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkStridedDeviceAddressNV reinterpret(long count) { return new VkStridedDeviceAddressNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `startAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long startAddress(MemorySegment segment, long index) { return (long) VH_startAddress.get(segment, 0L, index); }
    /// {@return `startAddress`}
    public long startAddress() { return startAddress(this.segment(), 0L); }
    /// Sets `startAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void startAddress(MemorySegment segment, long index, long value) { VH_startAddress.set(segment, 0L, index, value); }
    /// Sets `startAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressNV startAddress(long value) { startAddress(this.segment(), 0L, value); return this; }

    /// {@return `strideInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long strideInBytes(MemorySegment segment, long index) { return (long) VH_strideInBytes.get(segment, 0L, index); }
    /// {@return `strideInBytes`}
    public long strideInBytes() { return strideInBytes(this.segment(), 0L); }
    /// Sets `strideInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void strideInBytes(MemorySegment segment, long index, long value) { VH_strideInBytes.set(segment, 0L, index, value); }
    /// Sets `strideInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressNV strideInBytes(long value) { strideInBytes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkStridedDeviceAddressNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkStridedDeviceAddressNV`
    public VkStridedDeviceAddressNV asSlice(long index) { return new VkStridedDeviceAddressNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkStridedDeviceAddressNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkStridedDeviceAddressNV`
    public VkStridedDeviceAddressNV asSlice(long index, long count) { return new VkStridedDeviceAddressNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkStridedDeviceAddressNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkStridedDeviceAddressNV at(long index, Consumer<VkStridedDeviceAddressNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `startAddress` at the given index}
    /// @param index the index of the struct buffer
    public long startAddressAt(long index) { return startAddress(this.segment(), index); }
    /// Sets `startAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressNV startAddressAt(long index, long value) { startAddress(this.segment(), index, value); return this; }

    /// {@return `strideInBytes` at the given index}
    /// @param index the index of the struct buffer
    public long strideInBytesAt(long index) { return strideInBytes(this.segment(), index); }
    /// Sets `strideInBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressNV strideInBytesAt(long index, long value) { strideInBytes(this.segment(), index, value); return this; }

}
