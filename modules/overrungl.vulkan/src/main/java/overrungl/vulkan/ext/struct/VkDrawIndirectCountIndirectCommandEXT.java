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
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ### commandCount
/// [VarHandle][#VH_commandCount] - [Getter][#commandCount()] - [Setter][#commandCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrawIndirectCountIndirectCommandEXT {
///     VkDeviceAddress bufferAddress;
///     uint32_t stride;
///     uint32_t commandCount;
/// } VkDrawIndirectCountIndirectCommandEXT;
/// ```
public final class VkDrawIndirectCountIndirectCommandEXT extends Struct {
    /// The struct layout of `VkDrawIndirectCountIndirectCommandEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("commandCount")
    );
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `commandCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandCount"));

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrawIndirectCountIndirectCommandEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCountIndirectCommandEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCountIndirectCommandEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCountIndirectCommandEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDrawIndirectCountIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndirectCountIndirectCommandEXT`
    public static VkDrawIndirectCountIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawIndirectCountIndirectCommandEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawIndirectCountIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndirectCountIndirectCommandEXT`
    public static VkDrawIndirectCountIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkDrawIndirectCountIndirectCommandEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDrawIndirectCountIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawIndirectCountIndirectCommandEXT`
    public VkDrawIndirectCountIndirectCommandEXT asSlice(long index) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDrawIndirectCountIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawIndirectCountIndirectCommandEXT`
    public VkDrawIndirectCountIndirectCommandEXT asSlice(long index, long count) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment) { return VkDrawIndirectCountIndirectCommandEXT.get_bufferAddress(segment, 0L); }
    /// {@return `bufferAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long bufferAddressAt(long index) { return VkDrawIndirectCountIndirectCommandEXT.get_bufferAddress(this.segment(), index); }
    /// {@return `bufferAddress`}
    public @CType("VkDeviceAddress") long bufferAddress() { return VkDrawIndirectCountIndirectCommandEXT.get_bufferAddress(this.segment()); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDrawIndirectCountIndirectCommandEXT.set_bufferAddress(segment, 0L, value); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT bufferAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDrawIndirectCountIndirectCommandEXT.set_bufferAddress(this.segment(), index, value); return this; }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(@CType("VkDeviceAddress") long value) { VkDrawIndirectCountIndirectCommandEXT.set_bufferAddress(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stride(MemorySegment segment) { return VkDrawIndirectCountIndirectCommandEXT.get_stride(segment, 0L); }
    /// {@return `stride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int strideAt(long index) { return VkDrawIndirectCountIndirectCommandEXT.get_stride(this.segment(), index); }
    /// {@return `stride`}
    public @CType("uint32_t") int stride() { return VkDrawIndirectCountIndirectCommandEXT.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT strideAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_stride(this.segment(), index, value); return this; }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT stride(@CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_stride(this.segment(), value); return this; }

    /// {@return `commandCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandCount(MemorySegment segment, long index) { return (int) VH_commandCount.get(segment, 0L, index); }
    /// {@return `commandCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandCount(MemorySegment segment) { return VkDrawIndirectCountIndirectCommandEXT.get_commandCount(segment, 0L); }
    /// {@return `commandCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int commandCountAt(long index) { return VkDrawIndirectCountIndirectCommandEXT.get_commandCount(this.segment(), index); }
    /// {@return `commandCount`}
    public @CType("uint32_t") int commandCount() { return VkDrawIndirectCountIndirectCommandEXT.get_commandCount(this.segment()); }
    /// Sets `commandCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandCount.set(segment, 0L, index, value); }
    /// Sets `commandCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_commandCount(segment, 0L, value); }
    /// Sets `commandCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT commandCountAt(long index, @CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_commandCount(this.segment(), index, value); return this; }
    /// Sets `commandCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT commandCount(@CType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.set_commandCount(this.segment(), value); return this; }

}
