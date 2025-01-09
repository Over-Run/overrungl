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
/// ### address
/// [VarHandle][#VH_address] - [Getter][#address()] - [Setter][#address(long)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorBufferBindingInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceAddress address;
///     VkBufferUsageFlags usage;
/// } VkDescriptorBufferBindingInfoEXT;
/// ```
public final class VkDescriptorBufferBindingInfoEXT extends Struct {
    /// The struct layout of `VkDescriptorBufferBindingInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_INT.withName("usage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `address` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    /// Creates `VkDescriptorBufferBindingInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorBufferBindingInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorBufferBindingInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferBindingInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment); }

    /// Creates `VkDescriptorBufferBindingInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferBindingInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorBufferBindingInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferBindingInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorBufferBindingInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorBufferBindingInfoEXT`
    public static VkDescriptorBufferBindingInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorBufferBindingInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorBufferBindingInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorBufferBindingInfoEXT`
    public static VkDescriptorBufferBindingInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorBufferBindingInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorBufferBindingInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorBufferBindingInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorBufferBindingInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorBufferBindingInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorBufferBindingInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT sType(@CType("VkStructureType") int value) { VkDescriptorBufferBindingInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorBufferBindingInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorBufferBindingInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorBufferBindingInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorBufferBindingInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorBufferBindingInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorBufferBindingInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `address` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_address(MemorySegment segment, long index) { return (long) VH_address.get(segment, 0L, index); }
    /// {@return `address`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_address(MemorySegment segment) { return VkDescriptorBufferBindingInfoEXT.get_address(segment, 0L); }
    /// {@return `address` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long addressAt(long index) { return VkDescriptorBufferBindingInfoEXT.get_address(this.segment(), index); }
    /// {@return `address`}
    public @CType("VkDeviceAddress") long address() { return VkDescriptorBufferBindingInfoEXT.get_address(this.segment()); }
    /// Sets `address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_address(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_address.set(segment, 0L, index, value); }
    /// Sets `address` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_address(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDescriptorBufferBindingInfoEXT.set_address(segment, 0L, value); }
    /// Sets `address` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT addressAt(long index, @CType("VkDeviceAddress") long value) { VkDescriptorBufferBindingInfoEXT.set_address(this.segment(), index, value); return this; }
    /// Sets `address` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT address(@CType("VkDeviceAddress") long value) { VkDescriptorBufferBindingInfoEXT.set_address(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferUsageFlags") int get_usage(MemorySegment segment) { return VkDescriptorBufferBindingInfoEXT.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkBufferUsageFlags") int usageAt(long index) { return VkDescriptorBufferBindingInfoEXT.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkBufferUsageFlags") int usage() { return VkDescriptorBufferBindingInfoEXT.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkBufferUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkBufferUsageFlags") int value) { VkDescriptorBufferBindingInfoEXT.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT usageAt(long index, @CType("VkBufferUsageFlags") int value) { VkDescriptorBufferBindingInfoEXT.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferBindingInfoEXT usage(@CType("VkBufferUsageFlags") int value) { VkDescriptorBufferBindingInfoEXT.set_usage(this.segment(), value); return this; }

}
