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
/// ### propertyFlags
/// [VarHandle][#VH_propertyFlags] - [Getter][#propertyFlags()] - [Setter][#propertyFlags(int)]
/// ### heapIndex
/// [VarHandle][#VH_heapIndex] - [Getter][#heapIndex()] - [Setter][#heapIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryType {
///     VkMemoryPropertyFlags propertyFlags;
///     uint32_t heapIndex;
/// } VkMemoryType;
/// ```
public final class VkMemoryType extends Struct {
    /// The struct layout of `VkMemoryType`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("propertyFlags"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    /// The [VarHandle] of `propertyFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_propertyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("propertyFlags"));
    /// The [VarHandle] of `heapIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    /// Creates `VkMemoryType` with the given segment.
    /// @param segment the memory segment
    public VkMemoryType(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryType` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryType of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryType(segment); }

    /// Creates `VkMemoryType` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryType ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryType(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryType` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryType ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryType(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryType` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryType`
    public static VkMemoryType alloc(SegmentAllocator allocator) { return new VkMemoryType(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryType` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryType`
    public static VkMemoryType alloc(SegmentAllocator allocator, long count) { return new VkMemoryType(allocator.allocate(LAYOUT, count)); }

    /// {@return `propertyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryPropertyFlags") int get_propertyFlags(MemorySegment segment, long index) { return (int) VH_propertyFlags.get(segment, 0L, index); }
    /// {@return `propertyFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryPropertyFlags") int get_propertyFlags(MemorySegment segment) { return VkMemoryType.get_propertyFlags(segment, 0L); }
    /// {@return `propertyFlags` at the given index}
    /// @param index the index
    public @CType("VkMemoryPropertyFlags") int propertyFlagsAt(long index) { return VkMemoryType.get_propertyFlags(this.segment(), index); }
    /// {@return `propertyFlags`}
    public @CType("VkMemoryPropertyFlags") int propertyFlags() { return VkMemoryType.get_propertyFlags(this.segment()); }
    /// Sets `propertyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_propertyFlags(MemorySegment segment, long index, @CType("VkMemoryPropertyFlags") int value) { VH_propertyFlags.set(segment, 0L, index, value); }
    /// Sets `propertyFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_propertyFlags(MemorySegment segment, @CType("VkMemoryPropertyFlags") int value) { VkMemoryType.set_propertyFlags(segment, 0L, value); }
    /// Sets `propertyFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryType propertyFlagsAt(long index, @CType("VkMemoryPropertyFlags") int value) { VkMemoryType.set_propertyFlags(this.segment(), index, value); return this; }
    /// Sets `propertyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryType propertyFlags(@CType("VkMemoryPropertyFlags") int value) { VkMemoryType.set_propertyFlags(this.segment(), value); return this; }

    /// {@return `heapIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_heapIndex(MemorySegment segment, long index) { return (int) VH_heapIndex.get(segment, 0L, index); }
    /// {@return `heapIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_heapIndex(MemorySegment segment) { return VkMemoryType.get_heapIndex(segment, 0L); }
    /// {@return `heapIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heapIndexAt(long index) { return VkMemoryType.get_heapIndex(this.segment(), index); }
    /// {@return `heapIndex`}
    public @CType("uint32_t") int heapIndex() { return VkMemoryType.get_heapIndex(this.segment()); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_heapIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_heapIndex.set(segment, 0L, index, value); }
    /// Sets `heapIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_heapIndex(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryType.set_heapIndex(segment, 0L, value); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryType heapIndexAt(long index, @CType("uint32_t") int value) { VkMemoryType.set_heapIndex(this.segment(), index, value); return this; }
    /// Sets `heapIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryType heapIndex(@CType("uint32_t") int value) { VkMemoryType.set_heapIndex(this.segment(), value); return this; }

}
