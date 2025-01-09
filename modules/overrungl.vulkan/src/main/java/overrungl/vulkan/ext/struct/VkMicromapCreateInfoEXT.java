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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### createFlags
/// [VarHandle][#VH_createFlags] - [Getter][#createFlags()] - [Setter][#createFlags(int)]
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### deviceAddress
/// [VarHandle][#VH_deviceAddress] - [Getter][#deviceAddress()] - [Setter][#deviceAddress(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkMicromapCreateFlagsEXT createFlags;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkMicromapTypeEXT type;
///     VkDeviceAddress deviceAddress;
/// } VkMicromapCreateInfoEXT;
/// ```
public final class VkMicromapCreateInfoEXT extends Struct {
    /// The struct layout of `VkMicromapCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("createFlags"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("deviceAddress")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `createFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_createFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createFlags"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));

    /// Creates `VkMicromapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment); }

    /// Creates `VkMicromapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMicromapCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapCreateInfoEXT`
    public static VkMicromapCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapCreateInfoEXT`
    public static VkMicromapCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMicromapCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMicromapCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMicromapCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMicromapCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT sType(@CType("VkStructureType") int value) { VkMicromapCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMicromapCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMicromapCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `createFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapCreateFlagsEXT") int get_createFlags(MemorySegment segment, long index) { return (int) VH_createFlags.get(segment, 0L, index); }
    /// {@return `createFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapCreateFlagsEXT") int get_createFlags(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_createFlags(segment, 0L); }
    /// {@return `createFlags` at the given index}
    /// @param index the index
    public @CType("VkMicromapCreateFlagsEXT") int createFlagsAt(long index) { return VkMicromapCreateInfoEXT.get_createFlags(this.segment(), index); }
    /// {@return `createFlags`}
    public @CType("VkMicromapCreateFlagsEXT") int createFlags() { return VkMicromapCreateInfoEXT.get_createFlags(this.segment()); }
    /// Sets `createFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_createFlags(MemorySegment segment, long index, @CType("VkMicromapCreateFlagsEXT") int value) { VH_createFlags.set(segment, 0L, index, value); }
    /// Sets `createFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_createFlags(MemorySegment segment, @CType("VkMicromapCreateFlagsEXT") int value) { VkMicromapCreateInfoEXT.set_createFlags(segment, 0L, value); }
    /// Sets `createFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT createFlagsAt(long index, @CType("VkMicromapCreateFlagsEXT") int value) { VkMicromapCreateInfoEXT.set_createFlags(this.segment(), index, value); return this; }
    /// Sets `createFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT createFlags(@CType("VkMicromapCreateFlagsEXT") int value) { VkMicromapCreateInfoEXT.set_createFlags(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkMicromapCreateInfoEXT.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkMicromapCreateInfoEXT.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkMicromapCreateInfoEXT.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long offsetAt(long index) { return VkMicromapCreateInfoEXT.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkMicromapCreateInfoEXT.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT offsetAt(long index, @CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT offset(@CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkMicromapCreateInfoEXT.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkMicromapCreateInfoEXT.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT sizeAt(long index, @CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT size(@CType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.set_size(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapTypeEXT") int get_type(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkMicromapTypeEXT") int typeAt(long index) { return VkMicromapCreateInfoEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkMicromapTypeEXT") int type() { return VkMicromapCreateInfoEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkMicromapTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkMicromapTypeEXT") int value) { VkMicromapCreateInfoEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT typeAt(long index, @CType("VkMicromapTypeEXT") int value) { VkMicromapCreateInfoEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT type(@CType("VkMicromapTypeEXT") int value) { VkMicromapCreateInfoEXT.set_type(this.segment(), value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkMicromapCreateInfoEXT.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkMicromapCreateInfoEXT.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkMicromapCreateInfoEXT.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkMicromapCreateInfoEXT.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkMicromapCreateInfoEXT.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapCreateInfoEXT deviceAddress(@CType("VkDeviceAddress") long value) { VkMicromapCreateInfoEXT.set_deviceAddress(this.segment(), value); return this; }

}
