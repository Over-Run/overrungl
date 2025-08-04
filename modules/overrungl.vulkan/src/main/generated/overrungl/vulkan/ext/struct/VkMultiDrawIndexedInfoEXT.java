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
/// struct VkMultiDrawIndexedInfoEXT {
///     uint32_t firstIndex;
///     uint32_t indexCount;
///     int32_t vertexOffset;
/// };
/// ```
public final class VkMultiDrawIndexedInfoEXT extends GroupType {
    /// The struct layout of `VkMultiDrawIndexedInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );
    /// The byte offset of `firstIndex`.
    public static final long OFFSET_firstIndex = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
    /// The memory layout of `firstIndex`.
    public static final MemoryLayout LAYOUT_firstIndex = LAYOUT.select(PathElement.groupElement("firstIndex"));
    /// The [VarHandle] of `firstIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    /// The byte offset of `indexCount`.
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    /// The memory layout of `indexCount`.
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The byte offset of `vertexOffset`.
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    /// The memory layout of `vertexOffset`.
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMultiDrawIndexedInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMultiDrawIndexedInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiDrawIndexedInfoEXT`
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMultiDrawIndexedInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiDrawIndexedInfoEXT`
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT copyFrom(VkMultiDrawIndexedInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMultiDrawIndexedInfoEXT reinterpret(long count) { return new VkMultiDrawIndexedInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `firstIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstIndex(MemorySegment segment, long index) { return (int) VH_firstIndex.get(segment, 0L, index); }
    /// {@return `firstIndex`}
    public int firstIndex() { return firstIndex(this.segment(), 0L); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstIndex(MemorySegment segment, long index, int value) { VH_firstIndex.set(segment, 0L, index, value); }
    /// Sets `firstIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT firstIndex(int value) { firstIndex(this.segment(), 0L, value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    public int indexCount() { return indexCount(this.segment(), 0L); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexCount(MemorySegment segment, long index, int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT indexCount(int value) { indexCount(this.segment(), 0L, value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexOffset(MemorySegment segment, long index) { return (int) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    public int vertexOffset() { return vertexOffset(this.segment(), 0L); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexOffset(MemorySegment segment, long index, int value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT vertexOffset(int value) { vertexOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMultiDrawIndexedInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMultiDrawIndexedInfoEXT`
    public VkMultiDrawIndexedInfoEXT asSlice(long index) { return new VkMultiDrawIndexedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMultiDrawIndexedInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMultiDrawIndexedInfoEXT`
    public VkMultiDrawIndexedInfoEXT asSlice(long index, long count) { return new VkMultiDrawIndexedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMultiDrawIndexedInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT at(long index, Consumer<VkMultiDrawIndexedInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `firstIndex` at the given index}
    /// @param index the index of the struct buffer
    public int firstIndexAt(long index) { return firstIndex(this.segment(), index); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT firstIndexAt(long index, int value) { firstIndex(this.segment(), index, value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param index the index of the struct buffer
    public int indexCountAt(long index) { return indexCount(this.segment(), index); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT indexCountAt(long index, int value) { indexCount(this.segment(), index, value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param index the index of the struct buffer
    public int vertexOffsetAt(long index) { return vertexOffset(this.segment(), index); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT vertexOffsetAt(long index, int value) { vertexOffset(this.segment(), index, value); return this; }

}
