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
/// ### firstIndex
/// [VarHandle][#VH_firstIndex] - [Getter][#firstIndex()] - [Setter][#firstIndex(int)]
/// ### indexCount
/// [VarHandle][#VH_indexCount] - [Getter][#indexCount()] - [Setter][#indexCount(int)]
/// ### vertexOffset
/// [VarHandle][#VH_vertexOffset] - [Getter][#vertexOffset()] - [Setter][#vertexOffset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultiDrawIndexedInfoEXT {
///     uint32_t firstIndex;
///     uint32_t indexCount;
///     int32_t vertexOffset;
/// } VkMultiDrawIndexedInfoEXT;
/// ```
public final class VkMultiDrawIndexedInfoEXT extends Struct {
    /// The struct layout of `VkMultiDrawIndexedInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );
    /// The [VarHandle] of `firstIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMultiDrawIndexedInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultiDrawIndexedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMultiDrawIndexedInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiDrawIndexedInfoEXT`
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultiDrawIndexedInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiDrawIndexedInfoEXT`
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `firstIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstIndex(MemorySegment segment, long index) { return (int) VH_firstIndex.get(segment, 0L, index); }
    /// {@return `firstIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstIndex(MemorySegment segment) { return VkMultiDrawIndexedInfoEXT.get_firstIndex(segment, 0L); }
    /// {@return `firstIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstIndexAt(long index) { return VkMultiDrawIndexedInfoEXT.get_firstIndex(this.segment(), index); }
    /// {@return `firstIndex`}
    public @CType("uint32_t") int firstIndex() { return VkMultiDrawIndexedInfoEXT.get_firstIndex(this.segment()); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstIndex.set(segment, 0L, index, value); }
    /// Sets `firstIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstIndex(MemorySegment segment, @CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_firstIndex(segment, 0L, value); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT firstIndexAt(long index, @CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_firstIndex(this.segment(), index, value); return this; }
    /// Sets `firstIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT firstIndex(@CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_firstIndex(this.segment(), value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment) { return VkMultiDrawIndexedInfoEXT.get_indexCount(segment, 0L); }
    /// {@return `indexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indexCountAt(long index) { return VkMultiDrawIndexedInfoEXT.get_indexCount(this.segment(), index); }
    /// {@return `indexCount`}
    public @CType("uint32_t") int indexCount() { return VkMultiDrawIndexedInfoEXT.get_indexCount(this.segment()); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, @CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_indexCount(segment, 0L, value); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT indexCountAt(long index, @CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_indexCount(this.segment(), index, value); return this; }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT indexCount(@CType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.set_indexCount(this.segment(), value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_vertexOffset(MemorySegment segment, long index) { return (int) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_vertexOffset(MemorySegment segment) { return VkMultiDrawIndexedInfoEXT.get_vertexOffset(segment, 0L); }
    /// {@return `vertexOffset` at the given index}
    /// @param index the index
    public @CType("int32_t") int vertexOffsetAt(long index) { return VkMultiDrawIndexedInfoEXT.get_vertexOffset(this.segment(), index); }
    /// {@return `vertexOffset`}
    public @CType("int32_t") int vertexOffset() { return VkMultiDrawIndexedInfoEXT.get_vertexOffset(this.segment()); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, long index, @CType("int32_t") int value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, @CType("int32_t") int value) { VkMultiDrawIndexedInfoEXT.set_vertexOffset(segment, 0L, value); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT vertexOffsetAt(long index, @CType("int32_t") int value) { VkMultiDrawIndexedInfoEXT.set_vertexOffset(this.segment(), index, value); return this; }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiDrawIndexedInfoEXT vertexOffset(@CType("int32_t") int value) { VkMultiDrawIndexedInfoEXT.set_vertexOffset(this.segment(), value); return this; }

}
