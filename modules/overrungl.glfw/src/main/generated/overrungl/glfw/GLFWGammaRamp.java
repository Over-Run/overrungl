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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `GLFWGammaRamp`.
/// ## Layout
/// ```
/// struct GLFWGammaRamp {
///     unsigned short* red;
///     unsigned short* green;
///     unsigned short* blue;
///     unsigned int size;
/// };
/// ```
public final class GLFWGammaRamp extends GroupType {
    /// The struct layout of `GLFWGammaRamp`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("red"),
        ValueLayout.ADDRESS.withName("green"),
        ValueLayout.ADDRESS.withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );
    /// The byte offset of `red`.
    public static final long OFFSET_red = LAYOUT.byteOffset(PathElement.groupElement("red"));
    /// The memory layout of `red`.
    public static final MemoryLayout LAYOUT_red = LAYOUT.select(PathElement.groupElement("red"));
    /// The [VarHandle] of `red` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_red = LAYOUT.arrayElementVarHandle(PathElement.groupElement("red"));
    /// The byte offset of `green`.
    public static final long OFFSET_green = LAYOUT.byteOffset(PathElement.groupElement("green"));
    /// The memory layout of `green`.
    public static final MemoryLayout LAYOUT_green = LAYOUT.select(PathElement.groupElement("green"));
    /// The [VarHandle] of `green` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_green = LAYOUT.arrayElementVarHandle(PathElement.groupElement("green"));
    /// The byte offset of `blue`.
    public static final long OFFSET_blue = LAYOUT.byteOffset(PathElement.groupElement("blue"));
    /// The memory layout of `blue`.
    public static final MemoryLayout LAYOUT_blue = LAYOUT.select(PathElement.groupElement("blue"));
    /// The [VarHandle] of `blue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blue"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `GLFWGammaRamp` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public GLFWGammaRamp(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `GLFWGammaRamp` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGammaRamp of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGammaRamp(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWGammaRamp` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGammaRamp ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGammaRamp(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `GLFWGammaRamp` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGammaRamp ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGammaRamp(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLFWGammaRamp` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGammaRamp`
    public static GLFWGammaRamp alloc(SegmentAllocator allocator) { return new GLFWGammaRamp(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `GLFWGammaRamp` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWGammaRamp`
    public static GLFWGammaRamp alloc(SegmentAllocator allocator, long count) { return new GLFWGammaRamp(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWGammaRamp copyFrom(GLFWGammaRamp src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public GLFWGammaRamp reinterpret(long count) { return new GLFWGammaRamp(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `red` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment red(MemorySegment segment, long index) { return (MemorySegment) VH_red.get(segment, 0L, index); }
    /// {@return `red`}
    public MemorySegment red() { return red(this.segment(), 0L); }
    /// Sets `red` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void red(MemorySegment segment, long index, MemorySegment value) { VH_red.set(segment, 0L, index, value); }
    /// Sets `red` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp red(MemorySegment value) { red(this.segment(), 0L, value); return this; }

    /// {@return `green` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment green(MemorySegment segment, long index) { return (MemorySegment) VH_green.get(segment, 0L, index); }
    /// {@return `green`}
    public MemorySegment green() { return green(this.segment(), 0L); }
    /// Sets `green` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void green(MemorySegment segment, long index, MemorySegment value) { VH_green.set(segment, 0L, index, value); }
    /// Sets `green` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp green(MemorySegment value) { green(this.segment(), 0L, value); return this; }

    /// {@return `blue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment blue(MemorySegment segment, long index) { return (MemorySegment) VH_blue.get(segment, 0L, index); }
    /// {@return `blue`}
    public MemorySegment blue() { return blue(this.segment(), 0L); }
    /// Sets `blue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blue(MemorySegment segment, long index, MemorySegment value) { VH_blue.set(segment, 0L, index, value); }
    /// Sets `blue` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp blue(MemorySegment value) { blue(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp size(int value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `GLFWGammaRamp`.
    /// @param index the index of the struct buffer
    /// @return the slice of `GLFWGammaRamp`
    public GLFWGammaRamp asSlice(long index) { return new GLFWGammaRamp(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `GLFWGammaRamp`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `GLFWGammaRamp`
    public GLFWGammaRamp asSlice(long index, long count) { return new GLFWGammaRamp(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `GLFWGammaRamp` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public GLFWGammaRamp at(long index, Consumer<GLFWGammaRamp> func) { func.accept(asSlice(index)); return this; }

    /// {@return `red` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment redAt(long index) { return red(this.segment(), index); }
    /// Sets `red` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp redAt(long index, MemorySegment value) { red(this.segment(), index, value); return this; }

    /// {@return `green` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment greenAt(long index) { return green(this.segment(), index); }
    /// Sets `green` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp greenAt(long index, MemorySegment value) { green(this.segment(), index, value); return this; }

    /// {@return `blue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment blueAt(long index) { return blue(this.segment(), index); }
    /// Sets `blue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp blueAt(long index, MemorySegment value) { blue(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public int sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

}
