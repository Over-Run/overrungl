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
/// ### z
/// [VarHandle][#VH_z] - [Getter][#z()] - [Setter][#z(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOffset3D {
///     int32_t x;
///     int32_t y;
///     int32_t z;
/// } VkOffset3D;
/// ```
public final class VkOffset3D extends Struct {
    /// The struct layout of `VkOffset3D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));

    /// Creates `VkOffset3D` with the given segment.
    /// @param segment the memory segment
    public VkOffset3D(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOffset3D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset3D(segment); }

    /// Creates `VkOffset3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset3D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOffset3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkOffset3D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkOffset3D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOffset3D`
    public static VkOffset3D alloc(SegmentAllocator allocator) { return new VkOffset3D(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOffset3D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOffset3D`
    public static VkOffset3D alloc(SegmentAllocator allocator, long count) { return new VkOffset3D(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_x(MemorySegment segment) { return VkOffset3D.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("int32_t") int xAt(long index) { return VkOffset3D.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("int32_t") int x() { return VkOffset3D.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("int32_t") int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("int32_t") int value) { VkOffset3D.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOffset3D xAt(long index, @CType("int32_t") int value) { VkOffset3D.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D x(@CType("int32_t") int value) { VkOffset3D.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_y(MemorySegment segment) { return VkOffset3D.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("int32_t") int yAt(long index) { return VkOffset3D.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("int32_t") int y() { return VkOffset3D.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("int32_t") int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("int32_t") int value) { VkOffset3D.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOffset3D yAt(long index, @CType("int32_t") int value) { VkOffset3D.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D y(@CType("int32_t") int value) { VkOffset3D.set_y(this.segment(), value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_z(MemorySegment segment, long index) { return (int) VH_z.get(segment, 0L, index); }
    /// {@return `z`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_z(MemorySegment segment) { return VkOffset3D.get_z(segment, 0L); }
    /// {@return `z` at the given index}
    /// @param index the index
    public @CType("int32_t") int zAt(long index) { return VkOffset3D.get_z(this.segment(), index); }
    /// {@return `z`}
    public @CType("int32_t") int z() { return VkOffset3D.get_z(this.segment()); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_z(MemorySegment segment, long index, @CType("int32_t") int value) { VH_z.set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_z(MemorySegment segment, @CType("int32_t") int value) { VkOffset3D.set_z(segment, 0L, value); }
    /// Sets `z` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOffset3D zAt(long index, @CType("int32_t") int value) { VkOffset3D.set_z(this.segment(), index, value); return this; }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D z(@CType("int32_t") int value) { VkOffset3D.set_z(this.segment(), value); return this; }

}