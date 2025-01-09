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
/// ### bufferAddress
/// [VarHandle][#VH_bufferAddress] - [Getter][#bufferAddress()] - [Setter][#bufferAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindVertexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// } VkBindVertexBufferIndirectCommandNV;
/// ```
public final class VkBindVertexBufferIndirectCommandNV extends Struct {
    /// The struct layout of `VkBindVertexBufferIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindVertexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindVertexBufferIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindVertexBufferIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindVertexBufferIndirectCommandNV`
    public static VkBindVertexBufferIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindVertexBufferIndirectCommandNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment) { return VkBindVertexBufferIndirectCommandNV.get_bufferAddress(segment, 0L); }
    /// {@return `bufferAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long bufferAddressAt(long index) { return VkBindVertexBufferIndirectCommandNV.get_bufferAddress(this.segment(), index); }
    /// {@return `bufferAddress`}
    public @CType("VkDeviceAddress") long bufferAddress() { return VkBindVertexBufferIndirectCommandNV.get_bufferAddress(this.segment()); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkBindVertexBufferIndirectCommandNV.set_bufferAddress(segment, 0L, value); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV bufferAddressAt(long index, @CType("VkDeviceAddress") long value) { VkBindVertexBufferIndirectCommandNV.set_bufferAddress(this.segment(), index, value); return this; }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV bufferAddress(@CType("VkDeviceAddress") long value) { VkBindVertexBufferIndirectCommandNV.set_bufferAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkBindVertexBufferIndirectCommandNV.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sizeAt(long index) { return VkBindVertexBufferIndirectCommandNV.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkBindVertexBufferIndirectCommandNV.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV sizeAt(long index, @CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV size(@CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_size(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stride(MemorySegment segment) { return VkBindVertexBufferIndirectCommandNV.get_stride(segment, 0L); }
    /// {@return `stride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int strideAt(long index) { return VkBindVertexBufferIndirectCommandNV.get_stride(this.segment(), index); }
    /// {@return `stride`}
    public @CType("uint32_t") int stride() { return VkBindVertexBufferIndirectCommandNV.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV strideAt(long index, @CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_stride(this.segment(), index, value); return this; }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandNV stride(@CType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.set_stride(this.segment(), value); return this; }

}
