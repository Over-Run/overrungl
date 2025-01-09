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
package overrungl.vulkan.nv.struct;

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
/// ### z
/// [VarHandle][#VH_z] - [Getter][#z()] - [Setter][#z(int)]
/// ### w
/// [VarHandle][#VH_w] - [Getter][#w()] - [Setter][#w(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkViewportSwizzleNV {
///     VkViewportCoordinateSwizzleNV x;
///     VkViewportCoordinateSwizzleNV y;
///     VkViewportCoordinateSwizzleNV z;
///     VkViewportCoordinateSwizzleNV w;
/// } VkViewportSwizzleNV;
/// ```
public final class VkViewportSwizzleNV extends Struct {
    /// The struct layout of `VkViewportSwizzleNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));
    /// The [VarHandle] of `w` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("w"));

    /// Creates `VkViewportSwizzleNV` with the given segment.
    /// @param segment the memory segment
    public VkViewportSwizzleNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkViewportSwizzleNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportSwizzleNV`
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViewportSwizzleNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewportSwizzleNV`
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator, long count) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkViewportCoordinateSwizzleNV") int get_x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("VkViewportCoordinateSwizzleNV") int get_x(MemorySegment segment) { return VkViewportSwizzleNV.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("VkViewportCoordinateSwizzleNV") int xAt(long index) { return VkViewportSwizzleNV.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("VkViewportCoordinateSwizzleNV") int x() { return VkViewportSwizzleNV.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV xAt(long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV x(@CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkViewportCoordinateSwizzleNV") int get_y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("VkViewportCoordinateSwizzleNV") int get_y(MemorySegment segment) { return VkViewportSwizzleNV.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("VkViewportCoordinateSwizzleNV") int yAt(long index) { return VkViewportSwizzleNV.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("VkViewportCoordinateSwizzleNV") int y() { return VkViewportSwizzleNV.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV yAt(long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV y(@CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_y(this.segment(), value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkViewportCoordinateSwizzleNV") int get_z(MemorySegment segment, long index) { return (int) VH_z.get(segment, 0L, index); }
    /// {@return `z`}
    /// @param segment the segment of the struct
    public static @CType("VkViewportCoordinateSwizzleNV") int get_z(MemorySegment segment) { return VkViewportSwizzleNV.get_z(segment, 0L); }
    /// {@return `z` at the given index}
    /// @param index the index
    public @CType("VkViewportCoordinateSwizzleNV") int zAt(long index) { return VkViewportSwizzleNV.get_z(this.segment(), index); }
    /// {@return `z`}
    public @CType("VkViewportCoordinateSwizzleNV") int z() { return VkViewportSwizzleNV.get_z(this.segment()); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_z(MemorySegment segment, long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VH_z.set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_z(MemorySegment segment, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_z(segment, 0L, value); }
    /// Sets `z` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV zAt(long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_z(this.segment(), index, value); return this; }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV z(@CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_z(this.segment(), value); return this; }

    /// {@return `w` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkViewportCoordinateSwizzleNV") int get_w(MemorySegment segment, long index) { return (int) VH_w.get(segment, 0L, index); }
    /// {@return `w`}
    /// @param segment the segment of the struct
    public static @CType("VkViewportCoordinateSwizzleNV") int get_w(MemorySegment segment) { return VkViewportSwizzleNV.get_w(segment, 0L); }
    /// {@return `w` at the given index}
    /// @param index the index
    public @CType("VkViewportCoordinateSwizzleNV") int wAt(long index) { return VkViewportSwizzleNV.get_w(this.segment(), index); }
    /// {@return `w`}
    public @CType("VkViewportCoordinateSwizzleNV") int w() { return VkViewportSwizzleNV.get_w(this.segment()); }
    /// Sets `w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_w(MemorySegment segment, long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VH_w.set(segment, 0L, index, value); }
    /// Sets `w` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_w(MemorySegment segment, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_w(segment, 0L, value); }
    /// Sets `w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV wAt(long index, @CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_w(this.segment(), index, value); return this; }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV w(@CType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.set_w(this.segment(), value); return this; }

}
