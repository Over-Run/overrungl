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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBindIndexBufferIndirectCommandEXT {
///     (uint64_t) VkDeviceAddress bufferAddress;
///     uint32_t size;
///     (int) VkIndexType indexType;
/// };
/// ```
public final class VkBindIndexBufferIndirectCommandEXT extends GroupType {
    /// The struct layout of `VkBindIndexBufferIndirectCommandEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("indexType")
    );
    /// The byte offset of `bufferAddress`.
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    /// The memory layout of `bufferAddress`.
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindIndexBufferIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindIndexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindIndexBufferIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkBindIndexBufferIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkBindIndexBufferIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @param size `size`
    /// @param indexType `indexType`
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT allocInit(SegmentAllocator allocator, long bufferAddress, int size, int indexType) {
        return alloc(allocator).bufferAddress(bufferAddress).size(size).indexType(indexType);
    }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @param size `size`
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT allocInit(SegmentAllocator allocator, long bufferAddress, int size) {
        return alloc(allocator).bufferAddress(bufferAddress).size(size);
    }

    /// Allocates a `VkBindIndexBufferIndirectCommandEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param bufferAddress `bufferAddress`
    /// @return the allocated `VkBindIndexBufferIndirectCommandEXT`
    public static VkBindIndexBufferIndirectCommandEXT allocInit(SegmentAllocator allocator, long bufferAddress) {
        return alloc(allocator).bufferAddress(bufferAddress);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT copyFrom(VkBindIndexBufferIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindIndexBufferIndirectCommandEXT reinterpret(long count) { return new VkBindIndexBufferIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    public long bufferAddress() { return bufferAddress(this.segment(), 0L); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferAddress(MemorySegment segment, long index, long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT bufferAddress(long value) { bufferAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    public int indexType() { return indexType(this.segment(), 0L); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexType(MemorySegment segment, long index, int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindIndexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindIndexBufferIndirectCommandEXT`
    public VkBindIndexBufferIndirectCommandEXT asSlice(long index) { return new VkBindIndexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindIndexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindIndexBufferIndirectCommandEXT`
    public VkBindIndexBufferIndirectCommandEXT asSlice(long index, long count) { return new VkBindIndexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindIndexBufferIndirectCommandEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT at(long index, Consumer<VkBindIndexBufferIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `bufferAddress` at the given index}
    /// @param index the index of the struct buffer
    public long bufferAddressAt(long index) { return bufferAddress(this.segment(), index); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT bufferAddressAt(long index, long value) { bufferAddress(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public int sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeAt(long index) { return indexType(this.segment(), index); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindIndexBufferIndirectCommandEXT indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

}
