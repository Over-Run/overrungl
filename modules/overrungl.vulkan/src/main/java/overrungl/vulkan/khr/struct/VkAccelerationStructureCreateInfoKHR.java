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
/// typedef struct VkAccelerationStructureCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureCreateFlagsKHR createFlags;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkAccelerationStructureTypeKHR type;
///     VkDeviceAddress deviceAddress;
/// } VkAccelerationStructureCreateInfoKHR;
/// ```
public final class VkAccelerationStructureCreateInfoKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureCreateInfoKHR`.
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

    /// Creates `VkAccelerationStructureCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoKHR(segment); }

    /// Creates `VkAccelerationStructureCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCreateInfoKHR`
    public static VkAccelerationStructureCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureCreateInfoKHR`
    public static VkAccelerationStructureCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `createFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureCreateFlagsKHR") int get_createFlags(MemorySegment segment, long index) { return (int) VH_createFlags.get(segment, 0L, index); }
    /// {@return `createFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureCreateFlagsKHR") int get_createFlags(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_createFlags(segment, 0L); }
    /// {@return `createFlags` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureCreateFlagsKHR") int createFlagsAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_createFlags(this.segment(), index); }
    /// {@return `createFlags`}
    public @CType("VkAccelerationStructureCreateFlagsKHR") int createFlags() { return VkAccelerationStructureCreateInfoKHR.get_createFlags(this.segment()); }
    /// Sets `createFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_createFlags(MemorySegment segment, long index, @CType("VkAccelerationStructureCreateFlagsKHR") int value) { VH_createFlags.set(segment, 0L, index, value); }
    /// Sets `createFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_createFlags(MemorySegment segment, @CType("VkAccelerationStructureCreateFlagsKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_createFlags(segment, 0L, value); }
    /// Sets `createFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR createFlagsAt(long index, @CType("VkAccelerationStructureCreateFlagsKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_createFlags(this.segment(), index, value); return this; }
    /// Sets `createFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR createFlags(@CType("VkAccelerationStructureCreateFlagsKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_createFlags(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkAccelerationStructureCreateInfoKHR.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoKHR.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long offsetAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkAccelerationStructureCreateInfoKHR.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR offsetAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR offset(@CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkAccelerationStructureCreateInfoKHR.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR sizeAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR size(@CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.set_size(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureTypeKHR") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureTypeKHR") int get_type(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureTypeKHR") int typeAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkAccelerationStructureTypeKHR") int type() { return VkAccelerationStructureCreateInfoKHR.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkAccelerationStructureTypeKHR") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR typeAt(long index, @CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR type(@CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureCreateInfoKHR.set_type(this.segment(), value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkAccelerationStructureCreateInfoKHR.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkAccelerationStructureCreateInfoKHR.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkAccelerationStructureCreateInfoKHR.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkAccelerationStructureCreateInfoKHR.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkAccelerationStructureCreateInfoKHR.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoKHR deviceAddress(@CType("VkDeviceAddress") long value) { VkAccelerationStructureCreateInfoKHR.set_deviceAddress(this.segment(), value); return this; }

}
