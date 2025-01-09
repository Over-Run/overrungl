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
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsStreamNV {
///     VkBuffer buffer;
///     VkDeviceSize offset;
/// } VkIndirectCommandsStreamNV;
/// ```
public final class VkIndirectCommandsStreamNV extends Struct {
    /// The struct layout of `VkIndirectCommandsStreamNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkIndirectCommandsStreamNV` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsStreamNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsStreamNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsStreamNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment); }

    /// Creates `VkIndirectCommandsStreamNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsStreamNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsStreamNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsStreamNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsStreamNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsStreamNV`
    public static VkIndirectCommandsStreamNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsStreamNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsStreamNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsStreamNV`
    public static VkIndirectCommandsStreamNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsStreamNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkIndirectCommandsStreamNV.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkIndirectCommandsStreamNV.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkIndirectCommandsStreamNV.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkIndirectCommandsStreamNV.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsStreamNV bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkIndirectCommandsStreamNV.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsStreamNV buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkIndirectCommandsStreamNV.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkIndirectCommandsStreamNV.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long offsetAt(long index) { return VkIndirectCommandsStreamNV.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkIndirectCommandsStreamNV.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkIndirectCommandsStreamNV.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsStreamNV offsetAt(long index, @CType("VkDeviceSize") long value) { VkIndirectCommandsStreamNV.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsStreamNV offset(@CType("VkDeviceSize") long value) { VkIndirectCommandsStreamNV.set_offset(this.segment(), value); return this; }

}
