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

/// Gamepad input state
/// 
/// This describes the input state of a gamepad.
/// 
/// ## See Also
/// TODO
/// - [glfwGetGamepadState][GLFW#glfwGetGamepadState()]
///
/// ## Members
/// ### buttons
/// [Byte offset handle][#MH_buttons] - [Memory layout][#ML_buttons] - Getter - Setter
///
/// The states of each gamepad button, `GLFW_PRESS`
/// or `GLFW_RELEASE`.
///
/// ### axes
/// [Byte offset handle][#MH_axes] - [Memory layout][#ML_axes] - Getter - Setter
///
/// The states of each gamepad axis, in the range -1.0
/// to 1.0 inclusive.
///
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWgamepadstate {
///     unsigned char[15] buttons;
///     float[6] axes;
/// } GLFWGamepadState;
/// ```
public final class GLFWGamepadState extends Struct {
    /// The struct layout of `GLFWgamepadstate`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(15L, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.sequenceLayout(6L, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    /// The byte offset handle of `buttons` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_buttons = LAYOUT.byteOffsetHandle(PathElement.sequenceElement(), PathElement.groupElement("buttons"));
    /// The memory layout of `buttons`.
    public static final MemoryLayout ML_buttons = LAYOUT.select(PathElement.groupElement("buttons"));
    /// The byte offset handle of `axes` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_axes = LAYOUT.byteOffsetHandle(PathElement.sequenceElement(), PathElement.groupElement("axes"));
    /// The memory layout of `axes`.
    public static final MemoryLayout ML_axes = LAYOUT.select(PathElement.groupElement("axes"));

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment the memory segment
    public GLFWGamepadState(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState alloc(SegmentAllocator allocator) { return new GLFWGamepadState(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState alloc(SegmentAllocator allocator, long count) { return new GLFWGamepadState(allocator.allocate(LAYOUT, count)); }

    /// {@return `buttons` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("unsigned char[15]") java.lang.foreign.MemorySegment get_buttons(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_buttons.invokeExact(0L, elementIndex), index), ML_buttons); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `buttons`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("unsigned char[15]") java.lang.foreign.MemorySegment get_buttons(MemorySegment segment, long elementIndex) { return GLFWGamepadState.get_buttons(segment, 0L, elementIndex); }
    /// {@return `buttons` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("unsigned char[15]") java.lang.foreign.MemorySegment buttonsAt(long index, long elementIndex) { return GLFWGamepadState.get_buttons(this.segment(), index, elementIndex); }
    /// {@return `buttons`}
    /// @param elementIndex the index of the element
    public @CType("unsigned char[15]") java.lang.foreign.MemorySegment buttons(long elementIndex) { return GLFWGamepadState.get_buttons(this.segment(), elementIndex); }
    /// Sets `buttons` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_buttons(MemorySegment segment, long index, long elementIndex, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_buttons.invokeExact(0L, elementIndex), index), ML_buttons.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `buttons` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_buttons(MemorySegment segment, long elementIndex, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(segment, 0L, elementIndex, value); }
    /// Sets `buttons` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public GLFWGamepadState buttonsAt(long index, long elementIndex, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(this.segment(), index, elementIndex, value); return this; }
    /// Sets `buttons` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public GLFWGamepadState buttons(long elementIndex, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(this.segment(), elementIndex, value); return this; }

    /// {@return `axes` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("float[6]") java.lang.foreign.MemorySegment get_axes(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_axes.invokeExact(0L, elementIndex), index), ML_axes); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `axes`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("float[6]") java.lang.foreign.MemorySegment get_axes(MemorySegment segment, long elementIndex) { return GLFWGamepadState.get_axes(segment, 0L, elementIndex); }
    /// {@return `axes` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("float[6]") java.lang.foreign.MemorySegment axesAt(long index, long elementIndex) { return GLFWGamepadState.get_axes(this.segment(), index, elementIndex); }
    /// {@return `axes`}
    /// @param elementIndex the index of the element
    public @CType("float[6]") java.lang.foreign.MemorySegment axes(long elementIndex) { return GLFWGamepadState.get_axes(this.segment(), elementIndex); }
    /// Sets `axes` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_axes(MemorySegment segment, long index, long elementIndex, @CType("float[6]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_axes.invokeExact(0L, elementIndex), index), ML_axes.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `axes` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_axes(MemorySegment segment, long elementIndex, @CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(segment, 0L, elementIndex, value); }
    /// Sets `axes` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public GLFWGamepadState axesAt(long index, long elementIndex, @CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(this.segment(), index, elementIndex, value); return this; }
    /// Sets `axes` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public GLFWGamepadState axes(long elementIndex, @CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(this.segment(), elementIndex, value); return this; }

}
