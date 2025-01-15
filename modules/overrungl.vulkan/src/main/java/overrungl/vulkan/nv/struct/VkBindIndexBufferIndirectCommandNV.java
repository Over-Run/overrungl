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
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindIndexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     VkIndexType indexType;
/// } VkBindIndexBufferIndirectCommandNV;
/// ```
public sealed class VkBindIndexBufferIndirectCommandNV extends Struct {
    /// The struct layout of `VkBindIndexBufferIndirectCommandNV`.
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

    /// Creates `VkBindIndexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBindIndexBufferIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindIndexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandNV(segment); }

    /// Creates `VkBindIndexBufferIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindIndexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindIndexBufferIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindIndexBufferIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindIndexBufferIndirectCommandNV`
    public static VkBindIndexBufferIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindIndexBufferIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindIndexBufferIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindIndexBufferIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindIndexBufferIndirectCommandNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindIndexBufferIndirectCommandNV`
    public static VkBindIndexBufferIndirectCommandNV allocInit(SegmentAllocator allocator, @CType("VkDeviceAddress") long bufferAddress, @CType("uint32_t") int size, @CType("VkIndexType") int indexType) { return alloc(allocator).bufferAddress(bufferAddress).size(size).indexType(indexType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindIndexBufferIndirectCommandNV copyFrom(VkBindIndexBufferIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_bufferAddress(MemorySegment segment) { return VkBindIndexBufferIndirectCommandNV.get_bufferAddress(segment, 0L); }
    /// {@return `bufferAddress`}
    public @CType("VkDeviceAddress") long bufferAddress() { return VkBindIndexBufferIndirectCommandNV.get_bufferAddress(this.segment()); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandNV.set_bufferAddress(segment, 0L, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandNV bufferAddress(@CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandNV.set_bufferAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkBindIndexBufferIndirectCommandNV.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkBindIndexBufferIndirectCommandNV.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandNV.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandNV size(@CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandNV.set_size(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkBindIndexBufferIndirectCommandNV.get_indexType(segment, 0L); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkBindIndexBufferIndirectCommandNV.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandNV.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandNV indexType(@CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandNV.set_indexType(this.segment(), value); return this; }

    /// A buffer of [VkBindIndexBufferIndirectCommandNV].
    public static final class Buffer extends VkBindIndexBufferIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkBindIndexBufferIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindIndexBufferIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindIndexBufferIndirectCommandNV`
        public VkBindIndexBufferIndirectCommandNV asSlice(long index) { return new VkBindIndexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindIndexBufferIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindIndexBufferIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `bufferAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long bufferAddressAt(long index) { return VkBindIndexBufferIndirectCommandNV.get_bufferAddress(this.segment(), index); }
        /// Sets `bufferAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferAddressAt(long index, @CType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandNV.set_bufferAddress(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sizeAt(long index) { return VkBindIndexBufferIndirectCommandNV.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("uint32_t") int value) { VkBindIndexBufferIndirectCommandNV.set_size(this.segment(), index, value); return this; }

        /// {@return `indexType` at the given index}
        /// @param index the index
        public @CType("VkIndexType") int indexTypeAt(long index) { return VkBindIndexBufferIndirectCommandNV.get_indexType(this.segment(), index); }
        /// Sets `indexType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeAt(long index, @CType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandNV.set_indexType(this.segment(), index, value); return this; }

    }
}
