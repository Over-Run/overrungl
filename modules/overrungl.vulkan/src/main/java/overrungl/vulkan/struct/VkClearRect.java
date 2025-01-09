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
/// ### rect
/// [Byte offset][#OFFSET_rect] - [Memory layout][#ML_rect] - [Getter][#rect()] - [Setter][#rect(java.lang.foreign.MemorySegment)]
/// ### baseArrayLayer
/// [VarHandle][#VH_baseArrayLayer] - [Getter][#baseArrayLayer()] - [Setter][#baseArrayLayer(int)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkClearRect {
///     VkRect2D rect;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// } VkClearRect;
/// ```
public final class VkClearRect extends Struct {
    /// The struct layout of `VkClearRect`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("rect"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    /// The byte offset of `rect`.
    public static final long OFFSET_rect = LAYOUT.byteOffset(PathElement.groupElement("rect"));
    /// The memory layout of `rect`.
    public static final MemoryLayout ML_rect = LAYOUT.select(PathElement.groupElement("rect"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkClearRect` with the given segment.
    /// @param segment the memory segment
    public VkClearRect(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearRect` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearRect(segment); }

    /// Creates `VkClearRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearRect(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkClearRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkClearRect(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkClearRect` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearRect`
    public static VkClearRect alloc(SegmentAllocator allocator) { return new VkClearRect(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearRect` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearRect`
    public static VkClearRect alloc(SegmentAllocator allocator, long count) { return new VkClearRect(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkClearRect`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClearRect`
    public VkClearRect asSlice(long index) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkClearRect`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClearRect`
    public VkClearRect asSlice(long index, long count) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `rect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_rect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_rect, index), ML_rect); }
    /// {@return `rect`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_rect(MemorySegment segment) { return VkClearRect.get_rect(segment, 0L); }
    /// {@return `rect` at the given index}
    /// @param index the index
    public @CType("VkRect2D") java.lang.foreign.MemorySegment rectAt(long index) { return VkClearRect.get_rect(this.segment(), index); }
    /// {@return `rect`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment rect() { return VkClearRect.get_rect(this.segment()); }
    /// Sets `rect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rect(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_rect, index), ML_rect.byteSize()); }
    /// Sets `rect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rect(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkClearRect.set_rect(segment, 0L, value); }
    /// Sets `rect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearRect rectAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkClearRect.set_rect(this.segment(), index, value); return this; }
    /// Sets `rect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect rect(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkClearRect.set_rect(this.segment(), value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment) { return VkClearRect.get_baseArrayLayer(segment, 0L); }
    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseArrayLayerAt(long index) { return VkClearRect.get_baseArrayLayer(this.segment(), index); }
    /// {@return `baseArrayLayer`}
    public @CType("uint32_t") int baseArrayLayer() { return VkClearRect.get_baseArrayLayer(this.segment()); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, @CType("uint32_t") int value) { VkClearRect.set_baseArrayLayer(segment, 0L, value); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearRect baseArrayLayerAt(long index, @CType("uint32_t") int value) { VkClearRect.set_baseArrayLayer(this.segment(), index, value); return this; }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect baseArrayLayer(@CType("uint32_t") int value) { VkClearRect.set_baseArrayLayer(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkClearRect.get_layerCount(segment, 0L); }
    /// {@return `layerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerCountAt(long index) { return VkClearRect.get_layerCount(this.segment(), index); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkClearRect.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkClearRect.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearRect layerCountAt(long index, @CType("uint32_t") int value) { VkClearRect.set_layerCount(this.segment(), index, value); return this; }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect layerCount(@CType("uint32_t") int value) { VkClearRect.set_layerCount(this.segment(), value); return this; }

}
