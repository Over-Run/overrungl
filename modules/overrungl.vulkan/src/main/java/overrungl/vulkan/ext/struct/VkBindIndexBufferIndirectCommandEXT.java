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
/// ### bufferAddress
/// [VarHandle][#VH_bufferAddress] - [Getter][#bufferAddress()] - [Setter][#bufferAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindIndexBufferIndirectCommandEXT {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     VkIndexType indexType;
/// } VkBindIndexBufferIndirectCommandEXT;
/// ```
public final class VkBindIndexBufferIndirectCommandEXT extends Struct {
    /// The struct layout of `VkBindIndexBufferIndirectCommandEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("indexType")
    );
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    public VkBindIndexBufferIndirectCommandEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkBindIndexBufferIndirectCommandEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkBindIndexBufferIndirectCommandEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkBindIndexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindIndexBufferIndirectCommandEXT`
    public VkBindIndexBufferIndirectCommandEXT asSlice(long index) { return new VkBindIndexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkBindIndexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindIndexBufferIndirectCommandEXT`
    public VkBindIndexBufferIndirectCommandEXT asSlice(long index, long count) { return new VkBindIndexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment) { return VkBindIndexBufferIndirectCommandEXT.get_bufferAddress(segment, 0L); }
    /// {@return `bufferAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long bufferAddressAt(long index) { return VkBindIndexBufferIndirectCommandEXT.get_bufferAddress(this.segment(), index); }
    /// {@return `bufferAddress`}
    public @CType("VkDeviceAddress") long bufferAddress() { return VkBindIndexBufferIndirectCommandEXT.get_bufferAddress(this.segment()); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandEXT.set_bufferAddress(segment, 0L, value); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT bufferAddressAt(long index, @CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandEXT.set_bufferAddress(this.segment(), index, value); return this; }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT bufferAddress(@CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandEXT.set_bufferAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkBindIndexBufferIndirectCommandEXT.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sizeAt(long index) { return VkBindIndexBufferIndirectCommandEXT.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkBindIndexBufferIndirectCommandEXT.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandEXT.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT sizeAt(long index, @CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandEXT.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT size(@CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandEXT.set_size(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkBindIndexBufferIndirectCommandEXT.get_indexType(segment, 0L); }
    /// {@return `indexType` at the given index}
    /// @param index the index
    public @CType("VkIndexType") int indexTypeAt(long index) { return VkBindIndexBufferIndirectCommandEXT.get_indexType(this.segment(), index); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkBindIndexBufferIndirectCommandEXT.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandEXT.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT indexTypeAt(long index, @CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandEXT.set_indexType(this.segment(), index, value); return this; }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT indexType(@CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandEXT.set_indexType(this.segment(), value); return this; }

}
