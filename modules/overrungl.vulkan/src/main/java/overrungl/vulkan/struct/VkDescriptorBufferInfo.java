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
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### range
/// [VarHandle][#VH_range] - [Getter][#range()] - [Setter][#range(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorBufferInfo {
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize range;
/// } VkDescriptorBufferInfo;
/// ```
public final class VkDescriptorBufferInfo extends Struct {
    /// The struct layout of `VkDescriptorBufferInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("range")
    );
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `range` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));

    /// Creates `VkDescriptorBufferInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorBufferInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorBufferInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment); }

    /// Creates `VkDescriptorBufferInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorBufferInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorBufferInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorBufferInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorBufferInfo`
    public static VkDescriptorBufferInfo alloc(SegmentAllocator allocator) { return new VkDescriptorBufferInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorBufferInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorBufferInfo`
    public static VkDescriptorBufferInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorBufferInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkDescriptorBufferInfo.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkDescriptorBufferInfo.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkDescriptorBufferInfo.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkDescriptorBufferInfo.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkDescriptorBufferInfo.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkDescriptorBufferInfo.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkDescriptorBufferInfo.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long offsetAt(long index) { return VkDescriptorBufferInfo.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkDescriptorBufferInfo.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo offsetAt(long index, @CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo offset(@CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_offset(this.segment(), value); return this; }

    /// {@return `range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_range(MemorySegment segment, long index) { return (long) VH_range.get(segment, 0L, index); }
    /// {@return `range`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_range(MemorySegment segment) { return VkDescriptorBufferInfo.get_range(segment, 0L); }
    /// {@return `range` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long rangeAt(long index) { return VkDescriptorBufferInfo.get_range(this.segment(), index); }
    /// {@return `range`}
    public @CType("VkDeviceSize") long range() { return VkDescriptorBufferInfo.get_range(this.segment()); }
    /// Sets `range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_range(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_range.set(segment, 0L, index, value); }
    /// Sets `range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_range(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_range(segment, 0L, value); }
    /// Sets `range` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo rangeAt(long index, @CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_range(this.segment(), index, value); return this; }
    /// Sets `range` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorBufferInfo range(@CType("VkDeviceSize") long value) { VkDescriptorBufferInfo.set_range(this.segment(), value); return this; }

}
