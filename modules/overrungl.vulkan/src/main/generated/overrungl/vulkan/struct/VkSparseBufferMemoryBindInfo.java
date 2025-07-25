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
/// struct VkSparseBufferMemoryBindInfo {
///     (uint64_t) VkBuffer buffer;
///     uint32_t bindCount;
///     const VkSparseMemoryBind* pBinds;
/// };
/// ```
public final class VkSparseBufferMemoryBindInfo extends GroupType {
    /// The struct layout of `VkSparseBufferMemoryBindInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    /// The byte offset of `buffer`.
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    /// The memory layout of `buffer`.
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The byte offset of `bindCount`.
    public static final long OFFSET_bindCount = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
    /// The memory layout of `bindCount`.
    public static final MemoryLayout LAYOUT_bindCount = LAYOUT.select(PathElement.groupElement("bindCount"));
    /// The [VarHandle] of `bindCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    /// The byte offset of `pBinds`.
    public static final long OFFSET_pBinds = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
    /// The memory layout of `pBinds`.
    public static final MemoryLayout LAYOUT_pBinds = LAYOUT.select(PathElement.groupElement("pBinds"));
    /// The [VarHandle] of `pBinds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSparseBufferMemoryBindInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator, long count) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param buffer `buffer`
    /// @param bindCount `bindCount`
    /// @param pBinds `pBinds`
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo allocInit(SegmentAllocator allocator, long buffer, int bindCount, MemorySegment pBinds) {
        return alloc(allocator).buffer(buffer).bindCount(bindCount).pBinds(pBinds);
    }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param buffer `buffer`
    /// @param bindCount `bindCount`
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo allocInit(SegmentAllocator allocator, long buffer, int bindCount) {
        return alloc(allocator).buffer(buffer).bindCount(bindCount);
    }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param buffer `buffer`
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo allocInit(SegmentAllocator allocator, long buffer) {
        return alloc(allocator).buffer(buffer);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseBufferMemoryBindInfo copyFrom(VkSparseBufferMemoryBindInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSparseBufferMemoryBindInfo reinterpret(long count) { return new VkSparseBufferMemoryBindInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long buffer(MemorySegment segment, long index) { return (long) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    public long buffer() { return buffer(this.segment(), 0L); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void buffer(MemorySegment segment, long index, long value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo buffer(long value) { buffer(this.segment(), 0L, value); return this; }

    /// {@return `bindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindCount(MemorySegment segment, long index) { return (int) VH_bindCount.get(segment, 0L, index); }
    /// {@return `bindCount`}
    public int bindCount() { return bindCount(this.segment(), 0L); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindCount(MemorySegment segment, long index, int value) { VH_bindCount.set(segment, 0L, index, value); }
    /// Sets `bindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bindCount(int value) { bindCount(this.segment(), 0L, value); return this; }

    /// {@return `pBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBinds(MemorySegment segment, long index) { return (MemorySegment) VH_pBinds.get(segment, 0L, index); }
    /// {@return `pBinds`}
    public MemorySegment pBinds() { return pBinds(this.segment(), 0L); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBinds(MemorySegment segment, long index, MemorySegment value) { VH_pBinds.set(segment, 0L, index, value); }
    /// Sets `pBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo pBinds(MemorySegment value) { pBinds(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseBufferMemoryBindInfo`
    public VkSparseBufferMemoryBindInfo asSlice(long index) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseBufferMemoryBindInfo`
    public VkSparseBufferMemoryBindInfo asSlice(long index, long count) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSparseBufferMemoryBindInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSparseBufferMemoryBindInfo at(long index, Consumer<VkSparseBufferMemoryBindInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `buffer` at the given index}
    /// @param index the index of the struct buffer
    public long bufferAt(long index) { return buffer(this.segment(), index); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bufferAt(long index, long value) { buffer(this.segment(), index, value); return this; }

    /// {@return `bindCount` at the given index}
    /// @param index the index of the struct buffer
    public int bindCountAt(long index) { return bindCount(this.segment(), index); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bindCountAt(long index, int value) { bindCount(this.segment(), index, value); return this; }

    /// {@return `pBinds` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBindsAt(long index) { return pBinds(this.segment(), index); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo pBindsAt(long index, MemorySegment value) { pBinds(this.segment(), index, value); return this; }

}
