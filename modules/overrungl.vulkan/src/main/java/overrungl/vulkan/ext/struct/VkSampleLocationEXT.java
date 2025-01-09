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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(float)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSampleLocationEXT {
///     float x;
///     float y;
/// } VkSampleLocationEXT;
/// ```
public final class VkSampleLocationEXT extends Struct {
    /// The struct layout of `VkSampleLocationEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));

    /// Creates `VkSampleLocationEXT` with the given segment.
    /// @param segment the memory segment
    public VkSampleLocationEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator, long count) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_x(MemorySegment segment, long index) { return (float) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_x(MemorySegment segment) { return VkSampleLocationEXT.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("float") float xAt(long index) { return VkSampleLocationEXT.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("float") float x() { return VkSampleLocationEXT.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("float") float value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("float") float value) { VkSampleLocationEXT.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT xAt(long index, @CType("float") float value) { VkSampleLocationEXT.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT x(@CType("float") float value) { VkSampleLocationEXT.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_y(MemorySegment segment, long index) { return (float) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_y(MemorySegment segment) { return VkSampleLocationEXT.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("float") float yAt(long index) { return VkSampleLocationEXT.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("float") float y() { return VkSampleLocationEXT.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("float") float value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("float") float value) { VkSampleLocationEXT.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT yAt(long index, @CType("float") float value) { VkSampleLocationEXT.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT y(@CType("float") float value) { VkSampleLocationEXT.set_y(this.segment(), value); return this; }

}
