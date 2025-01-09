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
package overrungl.glfw;

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
/// ### pixels
/// [VarHandle][#VH_pixels] - [Getter][#pixels()] - [Setter][#pixels(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWimage {
///     int width;
///     int height;
///     unsigned char* pixels;
/// } GLFWImage;
/// ```
public final class GLFWImage extends Struct {
    /// The struct layout of `GLFWimage`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withName("pixels")
    );
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `pixels` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixels"));

    /// Creates `GLFWImage` with the given segment.
    /// @param segment the memory segment
    public GLFWImage(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWImage` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWImage(segment); }

    /// Creates `GLFWImage` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWImage(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `GLFWImage` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new GLFWImage(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `GLFWImage` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWImage`
    public static GLFWImage alloc(SegmentAllocator allocator) { return new GLFWImage(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWImage` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWImage`
    public static GLFWImage alloc(SegmentAllocator allocator, long count) { return new GLFWImage(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `GLFWImage`.
    /// @param index the index of the struct buffer
    /// @return the slice of `GLFWImage`
    public GLFWImage asSlice(long index) { return new GLFWImage(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `GLFWImage`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `GLFWImage`
    public GLFWImage asSlice(long index, long count) { return new GLFWImage(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_width(MemorySegment segment) { return GLFWImage.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("int") int widthAt(long index) { return GLFWImage.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("int") int width() { return GLFWImage.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("int") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("int") int value) { GLFWImage.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWImage widthAt(long index, @CType("int") int value) { GLFWImage.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage width(@CType("int") int value) { GLFWImage.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_height(MemorySegment segment) { return GLFWImage.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("int") int heightAt(long index) { return GLFWImage.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("int") int height() { return GLFWImage.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("int") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("int") int value) { GLFWImage.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWImage heightAt(long index, @CType("int") int value) { GLFWImage.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage height(@CType("int") int value) { GLFWImage.set_height(this.segment(), value); return this; }

    /// {@return `pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char*") java.lang.foreign.MemorySegment get_pixels(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pixels.get(segment, 0L, index); }
    /// {@return `pixels`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char*") java.lang.foreign.MemorySegment get_pixels(MemorySegment segment) { return GLFWImage.get_pixels(segment, 0L); }
    /// {@return `pixels` at the given index}
    /// @param index the index
    public @CType("unsigned char*") java.lang.foreign.MemorySegment pixelsAt(long index) { return GLFWImage.get_pixels(this.segment(), index); }
    /// {@return `pixels`}
    public @CType("unsigned char*") java.lang.foreign.MemorySegment pixels() { return GLFWImage.get_pixels(this.segment()); }
    /// Sets `pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pixels(MemorySegment segment, long index, @CType("unsigned char*") java.lang.foreign.MemorySegment value) { VH_pixels.set(segment, 0L, index, value); }
    /// Sets `pixels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pixels(MemorySegment segment, @CType("unsigned char*") java.lang.foreign.MemorySegment value) { GLFWImage.set_pixels(segment, 0L, value); }
    /// Sets `pixels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWImage pixelsAt(long index, @CType("unsigned char*") java.lang.foreign.MemorySegment value) { GLFWImage.set_pixels(this.segment(), index, value); return this; }
    /// Sets `pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage pixels(@CType("unsigned char*") java.lang.foreign.MemorySegment value) { GLFWImage.set_pixels(this.segment(), value); return this; }

}
