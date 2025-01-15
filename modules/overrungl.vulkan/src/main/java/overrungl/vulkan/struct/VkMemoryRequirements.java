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
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### alignment
/// [VarHandle][#VH_alignment] - [Getter][#alignment()] - [Setter][#alignment(long)]
/// ### memoryTypeBits
/// [VarHandle][#VH_memoryTypeBits] - [Getter][#memoryTypeBits()] - [Setter][#memoryTypeBits(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryRequirements {
///     VkDeviceSize size;
///     VkDeviceSize alignment;
///     uint32_t memoryTypeBits;
/// } VkMemoryRequirements;
/// ```
public sealed class VkMemoryRequirements extends Struct {
    /// The struct layout of `VkMemoryRequirements`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `alignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alignment"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    /// Creates `VkMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    public VkMemoryRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryRequirements(segment); }

    /// Creates `VkMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements alloc(SegmentAllocator allocator) { return new VkMemoryRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryRequirements`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements allocInit(SegmentAllocator allocator, @CType("VkDeviceSize") long size, @CType("VkDeviceSize") long alignment, @CType("uint32_t") int memoryTypeBits) { return alloc(allocator).size(size).alignment(alignment).memoryTypeBits(memoryTypeBits); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryRequirements copyFrom(VkMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkMemoryRequirements.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkMemoryRequirements.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMemoryRequirements.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements size(@CType("VkDeviceSize") long value) { VkMemoryRequirements.set_size(this.segment(), value); return this; }

    /// {@return `alignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_alignment(MemorySegment segment, long index) { return (long) VH_alignment.get(segment, 0L, index); }
    /// {@return `alignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_alignment(MemorySegment segment) { return VkMemoryRequirements.get_alignment(segment, 0L); }
    /// {@return `alignment`}
    public @CType("VkDeviceSize") long alignment() { return VkMemoryRequirements.get_alignment(this.segment()); }
    /// Sets `alignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_alignment.set(segment, 0L, index, value); }
    /// Sets `alignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMemoryRequirements.set_alignment(segment, 0L, value); }
    /// Sets `alignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements alignment(@CType("VkDeviceSize") long value) { VkMemoryRequirements.set_alignment(this.segment(), value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment) { return VkMemoryRequirements.get_memoryTypeBits(segment, 0L); }
    /// {@return `memoryTypeBits`}
    public @CType("uint32_t") int memoryTypeBits() { return VkMemoryRequirements.get_memoryTypeBits(this.segment()); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeBits.set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryRequirements.set_memoryTypeBits(segment, 0L, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements memoryTypeBits(@CType("uint32_t") int value) { VkMemoryRequirements.set_memoryTypeBits(this.segment(), value); return this; }

    /// A buffer of [VkMemoryRequirements].
    public static final class Buffer extends VkMemoryRequirements {
        private final long elementCount;

        /// Creates `VkMemoryRequirements.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryRequirements`
        public VkMemoryRequirements asSlice(long index) { return new VkMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryRequirements`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkMemoryRequirements.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkMemoryRequirements.set_size(this.segment(), index, value); return this; }

        /// {@return `alignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long alignmentAt(long index) { return VkMemoryRequirements.get_alignment(this.segment(), index); }
        /// Sets `alignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer alignmentAt(long index, @CType("VkDeviceSize") long value) { VkMemoryRequirements.set_alignment(this.segment(), index, value); return this; }

        /// {@return `memoryTypeBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryTypeBitsAt(long index) { return VkMemoryRequirements.get_memoryTypeBits(this.segment(), index); }
        /// Sets `memoryTypeBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryTypeBitsAt(long index, @CType("uint32_t") int value) { VkMemoryRequirements.set_memoryTypeBits(this.segment(), index, value); return this; }

    }
}
