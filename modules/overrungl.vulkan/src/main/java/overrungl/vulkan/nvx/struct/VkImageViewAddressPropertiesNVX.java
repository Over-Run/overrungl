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
package overrungl.vulkan.nvx.struct;

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
/// ### deviceAddress
/// [VarHandle][#VH_deviceAddress] - [Getter][#deviceAddress()] - [Setter][#deviceAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewAddressPropertiesNVX {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize size;
/// } VkImageViewAddressPropertiesNVX;
/// ```
public final class VkImageViewAddressPropertiesNVX extends Struct {
    /// The struct layout of `VkImageViewAddressPropertiesNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkImageViewAddressPropertiesNVX` with the given segment.
    /// @param segment the memory segment
    public VkImageViewAddressPropertiesNVX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewAddressPropertiesNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewAddressPropertiesNVX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment); }

    /// Creates `VkImageViewAddressPropertiesNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewAddressPropertiesNVX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewAddressPropertiesNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewAddressPropertiesNVX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageViewAddressPropertiesNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewAddressPropertiesNVX`
    public static VkImageViewAddressPropertiesNVX alloc(SegmentAllocator allocator) { return new VkImageViewAddressPropertiesNVX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewAddressPropertiesNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewAddressPropertiesNVX`
    public static VkImageViewAddressPropertiesNVX alloc(SegmentAllocator allocator, long count) { return new VkImageViewAddressPropertiesNVX(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewAddressPropertiesNVX.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewAddressPropertiesNVX.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewAddressPropertiesNVX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewAddressPropertiesNVX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewAddressPropertiesNVX.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX sType(@CType("VkStructureType") int value) { VkImageViewAddressPropertiesNVX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageViewAddressPropertiesNVX.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageViewAddressPropertiesNVX.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkImageViewAddressPropertiesNVX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageViewAddressPropertiesNVX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageViewAddressPropertiesNVX.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkImageViewAddressPropertiesNVX.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkImageViewAddressPropertiesNVX.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkImageViewAddressPropertiesNVX.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkImageViewAddressPropertiesNVX.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkImageViewAddressPropertiesNVX.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkImageViewAddressPropertiesNVX.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX deviceAddress(@CType("VkDeviceAddress") long value) { VkImageViewAddressPropertiesNVX.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkImageViewAddressPropertiesNVX.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkImageViewAddressPropertiesNVX.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkImageViewAddressPropertiesNVX.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkImageViewAddressPropertiesNVX.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX sizeAt(long index, @CType("VkDeviceSize") long value) { VkImageViewAddressPropertiesNVX.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewAddressPropertiesNVX size(@CType("VkDeviceSize") long value) { VkImageViewAddressPropertiesNVX.set_size(this.segment(), value); return this; }

}