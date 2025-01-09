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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(int)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOffset2D {
///     int32_t x;
///     int32_t y;
/// } VkOffset2D;
/// ```
public final class VkOffset2D extends Struct {
    /// The struct layout of `VkOffset2D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));

    /// Creates `VkOffset2D` with the given segment.
    /// @param segment the memory segment
    public VkOffset2D(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOffset2D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset2D of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset2D(segment); }

    /// Creates `VkOffset2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset2D ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset2D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOffset2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset2D ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset2D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkOffset2D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOffset2D`
    public static VkOffset2D alloc(SegmentAllocator allocator) { return new VkOffset2D(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOffset2D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOffset2D`
    public static VkOffset2D alloc(SegmentAllocator allocator, long count) { return new VkOffset2D(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkOffset2D`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkOffset2D`
    public VkOffset2D asSlice(long index) { return new VkOffset2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkOffset2D`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkOffset2D`
    public VkOffset2D asSlice(long index, long count) { return new VkOffset2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_x(MemorySegment segment) { return VkOffset2D.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("int32_t") int xAt(long index) { return VkOffset2D.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("int32_t") int x() { return VkOffset2D.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("int32_t") int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("int32_t") int value) { VkOffset2D.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOffset2D xAt(long index, @CType("int32_t") int value) { VkOffset2D.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset2D x(@CType("int32_t") int value) { VkOffset2D.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_y(MemorySegment segment) { return VkOffset2D.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("int32_t") int yAt(long index) { return VkOffset2D.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("int32_t") int y() { return VkOffset2D.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("int32_t") int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("int32_t") int value) { VkOffset2D.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOffset2D yAt(long index, @CType("int32_t") int value) { VkOffset2D.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset2D y(@CType("int32_t") int value) { VkOffset2D.set_y(this.segment(), value); return this; }

}
