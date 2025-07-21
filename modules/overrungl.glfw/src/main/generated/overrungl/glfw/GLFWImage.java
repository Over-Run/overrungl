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
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct GLFWImage {
///     int width;
///     int height;
///     unsigned char* pixels;
/// };
/// ```
public final class GLFWImage extends GroupType {
    /// The struct layout of `GLFWImage`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withName("pixels")
    );
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `pixels`.
    public static final long OFFSET_pixels = LAYOUT.byteOffset(PathElement.groupElement("pixels"));
    /// The memory layout of `pixels`.
    public static final MemoryLayout LAYOUT_pixels = LAYOUT.select(PathElement.groupElement("pixels"));
    /// The [VarHandle] of `pixels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixels"));

    /// Creates `GLFWImage` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public GLFWImage(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `GLFWImage` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWImage(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWImage` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWImage(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `GLFWImage` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWImage ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWImage(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLFWImage` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWImage`
    public static GLFWImage alloc(SegmentAllocator allocator) { return new GLFWImage(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `GLFWImage` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWImage`
    public static GLFWImage alloc(SegmentAllocator allocator, long count) { return new GLFWImage(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWImage` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param width `width`
    /// @param height `height`
    /// @param pixels `pixels`
    /// @return the allocated `GLFWImage`
    public static GLFWImage allocInit(SegmentAllocator allocator, int width, int height, MemorySegment pixels) {
        return alloc(allocator).width(width).height(height).pixels(pixels);
    }

    /// Allocates a `GLFWImage` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param width `width`
    /// @param height `height`
    /// @return the allocated `GLFWImage`
    public static GLFWImage allocInit(SegmentAllocator allocator, int width, int height) {
        return alloc(allocator).width(width).height(height);
    }

    /// Allocates a `GLFWImage` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param width `width`
    /// @return the allocated `GLFWImage`
    public static GLFWImage allocInit(SegmentAllocator allocator, int width) {
        return alloc(allocator).width(width);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWImage copyFrom(GLFWImage src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public GLFWImage reinterpret(long count) { return new GLFWImage(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pixels(MemorySegment segment, long index) { return (MemorySegment) VH_pixels.get(segment, 0L, index); }
    /// {@return `pixels`}
    public MemorySegment pixels() { return pixels(this.segment(), 0L); }
    /// Sets `pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pixels(MemorySegment segment, long index, MemorySegment value) { VH_pixels.set(segment, 0L, index, value); }
    /// Sets `pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWImage pixels(MemorySegment value) { pixels(this.segment(), 0L, value); return this; }

    /// Creates a slice of `GLFWImage`.
    /// @param index the index of the struct buffer
    /// @return the slice of `GLFWImage`
    public GLFWImage asSlice(long index) { return new GLFWImage(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `GLFWImage`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `GLFWImage`
    public GLFWImage asSlice(long index, long count) { return new GLFWImage(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `GLFWImage` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public GLFWImage at(long index, Consumer<GLFWImage> func) { func.accept(asSlice(index)); return this; }

    /// {@return `width` at the given index}
    /// @param index the index of the struct buffer
    public int widthAt(long index) { return width(this.segment(), index); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWImage widthAt(long index, int value) { width(this.segment(), index, value); return this; }

    /// {@return `height` at the given index}
    /// @param index the index of the struct buffer
    public int heightAt(long index) { return height(this.segment(), index); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWImage heightAt(long index, int value) { height(this.segment(), index, value); return this; }

    /// {@return `pixels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pixelsAt(long index) { return pixels(this.segment(), index); }
    /// Sets `pixels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWImage pixelsAt(long index, MemorySegment value) { pixels(this.segment(), index, value); return this; }

}
