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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VmaAllocationInfo2 {
///     (struct VmaAllocationInfo) VmaAllocationInfo allocationInfo;
///     (uint64_t) VkDeviceSize blockSize;
///     (uint32_t) VkBool32 dedicatedMemory;
/// };
/// ```
public final class VmaAllocationInfo2 extends GroupType {
    /// The struct layout of `VmaAllocationInfo2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        VmaAllocationInfo.LAYOUT.withName("allocationInfo"),
        ValueLayout.JAVA_LONG.withName("blockSize"),
        ValueLayout.JAVA_INT.withName("dedicatedMemory")
    );
    /// The byte offset of `allocationInfo`.
    public static final long OFFSET_allocationInfo = LAYOUT.byteOffset(PathElement.groupElement("allocationInfo"));
    /// The memory layout of `allocationInfo`.
    public static final MemoryLayout LAYOUT_allocationInfo = LAYOUT.select(PathElement.groupElement("allocationInfo"));
    /// The byte offset of `blockSize`.
    public static final long OFFSET_blockSize = LAYOUT.byteOffset(PathElement.groupElement("blockSize"));
    /// The memory layout of `blockSize`.
    public static final MemoryLayout LAYOUT_blockSize = LAYOUT.select(PathElement.groupElement("blockSize"));
    /// The [VarHandle] of `blockSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockSize"));
    /// The byte offset of `dedicatedMemory`.
    public static final long OFFSET_dedicatedMemory = LAYOUT.byteOffset(PathElement.groupElement("dedicatedMemory"));
    /// The memory layout of `dedicatedMemory`.
    public static final MemoryLayout LAYOUT_dedicatedMemory = LAYOUT.select(PathElement.groupElement("dedicatedMemory"));
    /// The [VarHandle] of `dedicatedMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dedicatedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dedicatedMemory"));

    /// Creates `VmaAllocationInfo2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaAllocationInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaAllocationInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaAllocationInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaAllocationInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaAllocationInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaAllocationInfo2`
    public static VmaAllocationInfo2 alloc(SegmentAllocator allocator) { return new VmaAllocationInfo2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaAllocationInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaAllocationInfo2`
    public static VmaAllocationInfo2 alloc(SegmentAllocator allocator, long count) { return new VmaAllocationInfo2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaAllocationInfo2 copyFrom(VmaAllocationInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaAllocationInfo2 reinterpret(long count) { return new VmaAllocationInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `allocationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment allocationInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_allocationInfo, index), LAYOUT_allocationInfo); }
    /// {@return `allocationInfo`}
    public MemorySegment allocationInfo() { return allocationInfo(this.segment(), 0L); }
    /// Sets `allocationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_allocationInfo, index), LAYOUT_allocationInfo.byteSize()); }
    /// Sets `allocationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 allocationInfo(MemorySegment value) { allocationInfo(this.segment(), 0L, value); return this; }
    /// Accepts `allocationInfo` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaAllocationInfo2 allocationInfo(Consumer<VmaAllocationInfo> func) { func.accept(VmaAllocationInfo.of(allocationInfo())); return this; }

    /// {@return `blockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long blockSize(MemorySegment segment, long index) { return (long) VH_blockSize.get(segment, 0L, index); }
    /// {@return `blockSize`}
    public long blockSize() { return blockSize(this.segment(), 0L); }
    /// Sets `blockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockSize(MemorySegment segment, long index, long value) { VH_blockSize.set(segment, 0L, index, value); }
    /// Sets `blockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 blockSize(long value) { blockSize(this.segment(), 0L, value); return this; }

    /// {@return `dedicatedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dedicatedMemory(MemorySegment segment, long index) { return (int) VH_dedicatedMemory.get(segment, 0L, index); }
    /// {@return `dedicatedMemory`}
    public int dedicatedMemory() { return dedicatedMemory(this.segment(), 0L); }
    /// Sets `dedicatedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dedicatedMemory(MemorySegment segment, long index, int value) { VH_dedicatedMemory.set(segment, 0L, index, value); }
    /// Sets `dedicatedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 dedicatedMemory(int value) { dedicatedMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaAllocationInfo2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaAllocationInfo2`
    public VmaAllocationInfo2 asSlice(long index) { return new VmaAllocationInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaAllocationInfo2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaAllocationInfo2`
    public VmaAllocationInfo2 asSlice(long index, long count) { return new VmaAllocationInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaAllocationInfo2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaAllocationInfo2 at(long index, Consumer<VmaAllocationInfo2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `allocationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment allocationInfoAt(long index) { return allocationInfo(this.segment(), index); }
    /// Sets `allocationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 allocationInfoAt(long index, MemorySegment value) { allocationInfo(this.segment(), index, value); return this; }
    /// Accepts `allocationInfo` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaAllocationInfo2 allocationInfoAt(long index, Consumer<VmaAllocationInfo> func) { func.accept(VmaAllocationInfo.of(allocationInfoAt(index))); return this; }

    /// {@return `blockSize` at the given index}
    /// @param index the index of the struct buffer
    public long blockSizeAt(long index) { return blockSize(this.segment(), index); }
    /// Sets `blockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 blockSizeAt(long index, long value) { blockSize(this.segment(), index, value); return this; }

    /// {@return `dedicatedMemory` at the given index}
    /// @param index the index of the struct buffer
    public int dedicatedMemoryAt(long index) { return dedicatedMemory(this.segment(), index); }
    /// Sets `dedicatedMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo2 dedicatedMemoryAt(long index, int value) { dedicatedMemory(this.segment(), index, value); return this; }

}
