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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`.
/// ## Layout
/// ```
/// struct VkMemoryOpaqueCaptureAddressAllocateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t opaqueCaptureAddress;
/// };
/// ```
public final class VkMemoryOpaqueCaptureAddressAllocateInfoKHR extends GroupType {
    /// The struct layout of `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("opaqueCaptureAddress")
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
    /// The byte offset of `opaqueCaptureAddress`.
    public static final long OFFSET_opaqueCaptureAddress = LAYOUT.byteOffset(PathElement.groupElement("opaqueCaptureAddress"));
    /// The memory layout of `opaqueCaptureAddress`.
    public static final MemoryLayout LAYOUT_opaqueCaptureAddress = LAYOUT.select(PathElement.groupElement("opaqueCaptureAddress"));
    /// The [VarHandle] of `opaqueCaptureAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opaqueCaptureAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opaqueCaptureAddress"));

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR alloc(SegmentAllocator allocator) { return new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR copyFrom(VkMemoryOpaqueCaptureAddressAllocateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR reinterpret(long count) { return new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `opaqueCaptureAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long opaqueCaptureAddress(MemorySegment segment, long index) { return (long) VH_opaqueCaptureAddress.get(segment, 0L, index); }
    /// {@return `opaqueCaptureAddress`}
    public long opaqueCaptureAddress() { return opaqueCaptureAddress(this.segment(), 0L); }
    /// Sets `opaqueCaptureAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opaqueCaptureAddress(MemorySegment segment, long index, long value) { VH_opaqueCaptureAddress.set(segment, 0L, index, value); }
    /// Sets `opaqueCaptureAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR opaqueCaptureAddress(long value) { opaqueCaptureAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR asSlice(long index) { return new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryOpaqueCaptureAddressAllocateInfoKHR`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR asSlice(long index, long count) { return new VkMemoryOpaqueCaptureAddressAllocateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryOpaqueCaptureAddressAllocateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR at(long index, Consumer<VkMemoryOpaqueCaptureAddressAllocateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `opaqueCaptureAddress` at the given index}
    /// @param index the index of the struct buffer
    public long opaqueCaptureAddressAt(long index) { return opaqueCaptureAddress(this.segment(), index); }
    /// Sets `opaqueCaptureAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR opaqueCaptureAddressAt(long index, long value) { opaqueCaptureAddress(this.segment(), index, value); return this; }

}
