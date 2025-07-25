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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMemoryRequirements {
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceSize alignment;
///     uint32_t memoryTypeBits;
/// };
/// ```
public final class VkMemoryRequirements extends GroupType {
    /// The struct layout of `VkMemoryRequirements`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `alignment`.
    public static final long OFFSET_alignment = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
    /// The memory layout of `alignment`.
    public static final MemoryLayout LAYOUT_alignment = LAYOUT.select(PathElement.groupElement("alignment"));
    /// The [VarHandle] of `alignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alignment"));
    /// The byte offset of `memoryTypeBits`.
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    /// The memory layout of `memoryTypeBits`.
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    /// Creates `VkMemoryRequirements` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements alloc(SegmentAllocator allocator) { return new VkMemoryRequirements(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkMemoryRequirements(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param size `size`
    /// @param alignment `alignment`
    /// @param memoryTypeBits `memoryTypeBits`
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements allocInit(SegmentAllocator allocator, long size, long alignment, int memoryTypeBits) {
        return alloc(allocator).size(size).alignment(alignment).memoryTypeBits(memoryTypeBits);
    }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param size `size`
    /// @param alignment `alignment`
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements allocInit(SegmentAllocator allocator, long size, long alignment) {
        return alloc(allocator).size(size).alignment(alignment);
    }

    /// Allocates a `VkMemoryRequirements` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param size `size`
    /// @return the allocated `VkMemoryRequirements`
    public static VkMemoryRequirements allocInit(SegmentAllocator allocator, long size) {
        return alloc(allocator).size(size);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryRequirements copyFrom(VkMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryRequirements reinterpret(long count) { return new VkMemoryRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long alignment(MemorySegment segment, long index) { return (long) VH_alignment.get(segment, 0L, index); }
    /// {@return `alignment`}
    public long alignment() { return alignment(this.segment(), 0L); }
    /// Sets `alignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alignment(MemorySegment segment, long index, long value) { VH_alignment.set(segment, 0L, index, value); }
    /// Sets `alignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements alignment(long value) { alignment(this.segment(), 0L, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    public int memoryTypeBits() { return memoryTypeBits(this.segment(), 0L); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeBits(MemorySegment segment, long index, int value) { VH_memoryTypeBits.set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements memoryTypeBits(int value) { memoryTypeBits(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryRequirements`
    public VkMemoryRequirements asSlice(long index) { return new VkMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryRequirements`
    public VkMemoryRequirements asSlice(long index, long count) { return new VkMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryRequirements` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryRequirements at(long index, Consumer<VkMemoryRequirements> func) { func.accept(asSlice(index)); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param index the index of the struct buffer
    public long alignmentAt(long index) { return alignment(this.segment(), index); }
    /// Sets `alignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements alignmentAt(long index, long value) { alignment(this.segment(), index, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeBitsAt(long index) { return memoryTypeBits(this.segment(), index); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements memoryTypeBitsAt(long index, int value) { memoryTypeBits(this.segment(), index, value); return this; }

}
