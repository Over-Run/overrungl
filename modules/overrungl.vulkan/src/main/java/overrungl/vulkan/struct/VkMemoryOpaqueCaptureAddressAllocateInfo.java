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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### opaqueCaptureAddress
/// [VarHandle][#VH_opaqueCaptureAddress] - [Getter][#opaqueCaptureAddress()] - [Setter][#opaqueCaptureAddress(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryOpaqueCaptureAddressAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t opaqueCaptureAddress;
/// } VkMemoryOpaqueCaptureAddressAllocateInfo;
/// ```
public final class VkMemoryOpaqueCaptureAddressAllocateInfo extends Struct {
    /// The struct layout of `VkMemoryOpaqueCaptureAddressAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("opaqueCaptureAddress")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `opaqueCaptureAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_opaqueCaptureAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opaqueCaptureAddress"));

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkMemoryOpaqueCaptureAddressAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfo(segment); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryOpaqueCaptureAddressAllocateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryOpaqueCaptureAddressAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryOpaqueCaptureAddressAllocateInfo`
    public static VkMemoryOpaqueCaptureAddressAllocateInfo alloc(SegmentAllocator allocator) { return new VkMemoryOpaqueCaptureAddressAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryOpaqueCaptureAddressAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryOpaqueCaptureAddressAllocateInfo`
    public static VkMemoryOpaqueCaptureAddressAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkMemoryOpaqueCaptureAddressAllocateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMemoryOpaqueCaptureAddressAllocateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryOpaqueCaptureAddressAllocateInfo`
    public VkMemoryOpaqueCaptureAddressAllocateInfo asSlice(long index) { return new VkMemoryOpaqueCaptureAddressAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMemoryOpaqueCaptureAddressAllocateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryOpaqueCaptureAddressAllocateInfo`
    public VkMemoryOpaqueCaptureAddressAllocateInfo asSlice(long index, long count) { return new VkMemoryOpaqueCaptureAddressAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo sType(@CType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `opaqueCaptureAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_opaqueCaptureAddress(MemorySegment segment, long index) { return (long) VH_opaqueCaptureAddress.get(segment, 0L, index); }
    /// {@return `opaqueCaptureAddress`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_opaqueCaptureAddress(MemorySegment segment) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_opaqueCaptureAddress(segment, 0L); }
    /// {@return `opaqueCaptureAddress` at the given index}
    /// @param index the index
    public @CType("uint64_t") long opaqueCaptureAddressAt(long index) { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_opaqueCaptureAddress(this.segment(), index); }
    /// {@return `opaqueCaptureAddress`}
    public @CType("uint64_t") long opaqueCaptureAddress() { return VkMemoryOpaqueCaptureAddressAllocateInfo.get_opaqueCaptureAddress(this.segment()); }
    /// Sets `opaqueCaptureAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_opaqueCaptureAddress(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_opaqueCaptureAddress.set(segment, 0L, index, value); }
    /// Sets `opaqueCaptureAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_opaqueCaptureAddress(MemorySegment segment, @CType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_opaqueCaptureAddress(segment, 0L, value); }
    /// Sets `opaqueCaptureAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo opaqueCaptureAddressAt(long index, @CType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_opaqueCaptureAddress(this.segment(), index, value); return this; }
    /// Sets `opaqueCaptureAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryOpaqueCaptureAddressAllocateInfo opaqueCaptureAddress(@CType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfo.set_opaqueCaptureAddress(this.segment(), value); return this; }

}
