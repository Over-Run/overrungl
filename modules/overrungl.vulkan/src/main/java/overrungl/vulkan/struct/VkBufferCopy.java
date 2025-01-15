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
/// ### srcOffset
/// [VarHandle][#VH_srcOffset] - [Getter][#srcOffset()] - [Setter][#srcOffset(long)]
/// ### dstOffset
/// [VarHandle][#VH_dstOffset] - [Getter][#dstOffset()] - [Setter][#dstOffset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferCopy {
///     VkDeviceSize srcOffset;
///     VkDeviceSize dstOffset;
///     VkDeviceSize size;
/// } VkBufferCopy;
/// ```
public sealed class VkBufferCopy extends Struct {
    /// The struct layout of `VkBufferCopy`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `srcOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"));
    /// The [VarHandle] of `dstOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkBufferCopy` with the given segment.
    /// @param segment the memory segment
    public VkBufferCopy(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCopy(segment); }

    /// Creates `VkBufferCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCopy(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCopy`
    public static VkBufferCopy alloc(SegmentAllocator allocator) { return new VkBufferCopy(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCopy`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferCopy` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCopy`
    public static VkBufferCopy allocInit(SegmentAllocator allocator, @CType("VkDeviceSize") long srcOffset, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long size) { return alloc(allocator).srcOffset(srcOffset).dstOffset(dstOffset).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCopy copyFrom(VkBufferCopy src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_srcOffset(MemorySegment segment, long index) { return (long) VH_srcOffset.get(segment, 0L, index); }
    /// {@return `srcOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_srcOffset(MemorySegment segment) { return VkBufferCopy.get_srcOffset(segment, 0L); }
    /// {@return `srcOffset`}
    public @CType("VkDeviceSize") long srcOffset() { return VkBufferCopy.get_srcOffset(this.segment()); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_srcOffset.set(segment, 0L, index, value); }
    /// Sets `srcOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy.set_srcOffset(segment, 0L, value); }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy srcOffset(@CType("VkDeviceSize") long value) { VkBufferCopy.set_srcOffset(this.segment(), value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_dstOffset(MemorySegment segment, long index) { return (long) VH_dstOffset.get(segment, 0L, index); }
    /// {@return `dstOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_dstOffset(MemorySegment segment) { return VkBufferCopy.get_dstOffset(segment, 0L); }
    /// {@return `dstOffset`}
    public @CType("VkDeviceSize") long dstOffset() { return VkBufferCopy.get_dstOffset(this.segment()); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_dstOffset.set(segment, 0L, index, value); }
    /// Sets `dstOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy.set_dstOffset(segment, 0L, value); }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy dstOffset(@CType("VkDeviceSize") long value) { VkBufferCopy.set_dstOffset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkBufferCopy.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkBufferCopy.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy size(@CType("VkDeviceSize") long value) { VkBufferCopy.set_size(this.segment(), value); return this; }

    /// A buffer of [VkBufferCopy].
    public static final class Buffer extends VkBufferCopy {
        private final long elementCount;

        /// Creates `VkBufferCopy.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCopy`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCopy`
        public VkBufferCopy asSlice(long index) { return new VkBufferCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCopy`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCopy`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long srcOffsetAt(long index) { return VkBufferCopy.get_srcOffset(this.segment(), index); }
        /// Sets `srcOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy.set_srcOffset(this.segment(), index, value); return this; }

        /// {@return `dstOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long dstOffsetAt(long index) { return VkBufferCopy.get_dstOffset(this.segment(), index); }
        /// Sets `dstOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy.set_dstOffset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkBufferCopy.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy.set_size(this.segment(), index, value); return this; }

    }
}
