/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

/// Gamma ramp.
/// 
/// This describes the gamma ramp for a monitor.
/// 
/// ## See Also
/// TODO
/// - [glfwGetGammaRamp][GLFW#glfwGetGammaRamp()]
/// - [glfwSetGammaRamp][GLFW#glfwSetGammaRamp()]
///
/// ## Members
/// ### red
/// [VarHandle][#VH_red] - [Getter][#red()] - [Setter][#red(java.lang.foreign.MemorySegment)]
///
/// An array of value describing the response of the red channel.
///
/// ### green
/// [VarHandle][#VH_green] - [Getter][#green()] - [Setter][#green(java.lang.foreign.MemorySegment)]
///
/// An array of value describing the response of the green channel.
///
/// ### blue
/// [VarHandle][#VH_blue] - [Getter][#blue()] - [Setter][#blue(java.lang.foreign.MemorySegment)]
///
/// An array of value describing the response of the blue channel.
///
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
///
/// The number of elements in each array.
///
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWgammaramp {
///     unsigned short* red;
///     unsigned short* green;
///     unsigned short* blue;
///     unsigned int size;
/// } GLFWGammaRamp;
/// ```
public final class GLFWGammaRamp extends Struct {
    /// The struct layout of `GLFWgammaramp`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("red"),
        ValueLayout.ADDRESS.withName("green"),
        ValueLayout.ADDRESS.withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );
    /// The [VarHandle] of `red` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_red = LAYOUT.arrayElementVarHandle(PathElement.groupElement("red"));
    /// The [VarHandle] of `green` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_green = LAYOUT.arrayElementVarHandle(PathElement.groupElement("green"));
    /// The [VarHandle] of `blue` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_blue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blue"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `GLFWGammaRamp` with the given segment.
    /// @param segment the memory segment
    public GLFWGammaRamp(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `GLFWGammaRamp` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGammaRamp`
    public static GLFWGammaRamp alloc(SegmentAllocator allocator) { return new GLFWGammaRamp(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWGammaRamp` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWGammaRamp`
    public static GLFWGammaRamp alloc(SegmentAllocator allocator, long count) { return new GLFWGammaRamp(allocator.allocate(LAYOUT, count)); }

    /// {@return `red` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_red(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_red.get(segment, 0L, index); }
    /// {@return `red`}
    /// @param segment the segment of the struct
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_red(MemorySegment segment) { return GLFWGammaRamp.get_red(segment, 0L); }
    /// {@return `red` at the given index}
    /// @param index the index
    public @CType("unsigned short*") java.lang.foreign.MemorySegment redAt(long index) { return GLFWGammaRamp.get_red(this.segment(), index); }
    /// {@return `red`}
    public @CType("unsigned short*") java.lang.foreign.MemorySegment red() { return GLFWGammaRamp.get_red(this.segment()); }
    /// Sets `red` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_red(MemorySegment segment, long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { VH_red.set(segment, 0L, index, value); }
    /// Sets `red` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_red(MemorySegment segment, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_red(segment, 0L, value); }
    /// Sets `red` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp redAt(long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_red(this.segment(), index, value); return this; }
    /// Sets `red` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp red(@CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_red(this.segment(), value); return this; }

    /// {@return `green` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_green(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_green.get(segment, 0L, index); }
    /// {@return `green`}
    /// @param segment the segment of the struct
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_green(MemorySegment segment) { return GLFWGammaRamp.get_green(segment, 0L); }
    /// {@return `green` at the given index}
    /// @param index the index
    public @CType("unsigned short*") java.lang.foreign.MemorySegment greenAt(long index) { return GLFWGammaRamp.get_green(this.segment(), index); }
    /// {@return `green`}
    public @CType("unsigned short*") java.lang.foreign.MemorySegment green() { return GLFWGammaRamp.get_green(this.segment()); }
    /// Sets `green` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_green(MemorySegment segment, long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { VH_green.set(segment, 0L, index, value); }
    /// Sets `green` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_green(MemorySegment segment, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_green(segment, 0L, value); }
    /// Sets `green` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp greenAt(long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_green(this.segment(), index, value); return this; }
    /// Sets `green` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp green(@CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_green(this.segment(), value); return this; }

    /// {@return `blue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_blue(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_blue.get(segment, 0L, index); }
    /// {@return `blue`}
    /// @param segment the segment of the struct
    public static @CType("unsigned short*") java.lang.foreign.MemorySegment get_blue(MemorySegment segment) { return GLFWGammaRamp.get_blue(segment, 0L); }
    /// {@return `blue` at the given index}
    /// @param index the index
    public @CType("unsigned short*") java.lang.foreign.MemorySegment blueAt(long index) { return GLFWGammaRamp.get_blue(this.segment(), index); }
    /// {@return `blue`}
    public @CType("unsigned short*") java.lang.foreign.MemorySegment blue() { return GLFWGammaRamp.get_blue(this.segment()); }
    /// Sets `blue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blue(MemorySegment segment, long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { VH_blue.set(segment, 0L, index, value); }
    /// Sets `blue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blue(MemorySegment segment, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_blue(segment, 0L, value); }
    /// Sets `blue` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp blueAt(long index, @CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_blue(this.segment(), index, value); return this; }
    /// Sets `blue` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp blue(@CType("unsigned short*") java.lang.foreign.MemorySegment value) { GLFWGammaRamp.set_blue(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned int") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("unsigned int") int get_size(MemorySegment segment) { return GLFWGammaRamp.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("unsigned int") int sizeAt(long index) { return GLFWGammaRamp.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("unsigned int") int size() { return GLFWGammaRamp.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("unsigned int") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("unsigned int") int value) { GLFWGammaRamp.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp sizeAt(long index, @CType("unsigned int") int value) { GLFWGammaRamp.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGammaRamp size(@CType("unsigned int") int value) { GLFWGammaRamp.set_size(this.segment(), value); return this; }

}
