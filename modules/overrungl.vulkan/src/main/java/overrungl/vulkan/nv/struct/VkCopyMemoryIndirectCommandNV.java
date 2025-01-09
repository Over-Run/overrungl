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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### srcAddress
/// [VarHandle][#VH_srcAddress] - [Getter][#srcAddress()] - [Setter][#srcAddress(long)]
/// ### dstAddress
/// [VarHandle][#VH_dstAddress] - [Getter][#dstAddress()] - [Setter][#dstAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyMemoryIndirectCommandNV {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize size;
/// } VkCopyMemoryIndirectCommandNV;
/// ```
public final class VkCopyMemoryIndirectCommandNV extends Struct {
    /// The struct layout of `VkCopyMemoryIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `dstAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkCopyMemoryIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandNV(segment); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyMemoryIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkCopyMemoryIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyMemoryIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryIndirectCommandNV`
    public static VkCopyMemoryIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryIndirectCommandNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkCopyMemoryIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMemoryIndirectCommandNV`
    public VkCopyMemoryIndirectCommandNV asSlice(long index) { return new VkCopyMemoryIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkCopyMemoryIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMemoryIndirectCommandNV`
    public VkCopyMemoryIndirectCommandNV asSlice(long index, long count) { return new VkCopyMemoryIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get(segment, 0L, index); }
    /// {@return `srcAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_srcAddress(MemorySegment segment) { return VkCopyMemoryIndirectCommandNV.get_srcAddress(segment, 0L); }
    /// {@return `srcAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long srcAddressAt(long index) { return VkCopyMemoryIndirectCommandNV.get_srcAddress(this.segment(), index); }
    /// {@return `srcAddress`}
    public @CType("VkDeviceAddress") long srcAddress() { return VkCopyMemoryIndirectCommandNV.get_srcAddress(this.segment()); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_srcAddress.set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_srcAddress(segment, 0L, value); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV srcAddressAt(long index, @CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_srcAddress(this.segment(), index, value); return this; }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV srcAddress(@CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_srcAddress(this.segment(), value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_dstAddress(MemorySegment segment, long index) { return (long) VH_dstAddress.get(segment, 0L, index); }
    /// {@return `dstAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_dstAddress(MemorySegment segment) { return VkCopyMemoryIndirectCommandNV.get_dstAddress(segment, 0L); }
    /// {@return `dstAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long dstAddressAt(long index) { return VkCopyMemoryIndirectCommandNV.get_dstAddress(this.segment(), index); }
    /// {@return `dstAddress`}
    public @CType("VkDeviceAddress") long dstAddress() { return VkCopyMemoryIndirectCommandNV.get_dstAddress(this.segment()); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_dstAddress.set(segment, 0L, index, value); }
    /// Sets `dstAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_dstAddress(segment, 0L, value); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV dstAddressAt(long index, @CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_dstAddress(this.segment(), index, value); return this; }
    /// Sets `dstAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV dstAddress(@CType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.set_dstAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkCopyMemoryIndirectCommandNV.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkCopyMemoryIndirectCommandNV.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkCopyMemoryIndirectCommandNV.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkCopyMemoryIndirectCommandNV.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV sizeAt(long index, @CType("VkDeviceSize") long value) { VkCopyMemoryIndirectCommandNV.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandNV size(@CType("VkDeviceSize") long value) { VkCopyMemoryIndirectCommandNV.set_size(this.segment(), value); return this; }

}
