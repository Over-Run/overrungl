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
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExtent2D {
///     uint32_t width;
///     uint32_t height;
/// } VkExtent2D;
/// ```
public final class VkExtent2D extends Struct {
    /// The struct layout of `VkExtent2D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    );
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));

    /// Creates `VkExtent2D` with the given segment.
    /// @param segment the memory segment
    public VkExtent2D(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExtent2D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtent2D of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtent2D(segment); }

    /// Creates `VkExtent2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtent2D ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtent2D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExtent2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtent2D ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExtent2D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExtent2D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtent2D`
    public static VkExtent2D alloc(SegmentAllocator allocator) { return new VkExtent2D(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExtent2D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtent2D`
    public static VkExtent2D alloc(SegmentAllocator allocator, long count) { return new VkExtent2D(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkExtent2D`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExtent2D`
    public VkExtent2D asSlice(long index) { return new VkExtent2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkExtent2D`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExtent2D`
    public VkExtent2D asSlice(long index, long count) { return new VkExtent2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkExtent2D.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("uint32_t") int widthAt(long index) { return VkExtent2D.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkExtent2D.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkExtent2D.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExtent2D widthAt(long index, @CType("uint32_t") int value) { VkExtent2D.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtent2D width(@CType("uint32_t") int value) { VkExtent2D.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkExtent2D.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heightAt(long index) { return VkExtent2D.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkExtent2D.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkExtent2D.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExtent2D heightAt(long index, @CType("uint32_t") int value) { VkExtent2D.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtent2D height(@CType("uint32_t") int value) { VkExtent2D.set_height(this.segment(), value); return this; }

}
