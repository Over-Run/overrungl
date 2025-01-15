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
/// ### buttons
/// [Byte offset][#OFFSET_buttons] - [Memory layout][#ML_buttons] - [Getter][#buttons()] - [Setter][#buttons(java.lang.foreign.MemorySegment)]
/// ### axes
/// [Byte offset][#OFFSET_axes] - [Memory layout][#ML_axes] - [Getter][#axes()] - [Setter][#axes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWgamepadstate {
///     unsigned char[15] buttons;
///     float[6] axes;
/// } GLFWGamepadState;
/// ```
public sealed class GLFWGamepadState extends Struct {
    /// The struct layout of `GLFWgamepadstate`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    /// The byte offset of `buttons`.
    public static final long OFFSET_buttons = LAYOUT.byteOffset(PathElement.groupElement("buttons"));
    /// The memory layout of `buttons`.
    public static final MemoryLayout ML_buttons = LAYOUT.select(PathElement.groupElement("buttons"));
    /// The byte offset of `axes`.
    public static final long OFFSET_axes = LAYOUT.byteOffset(PathElement.groupElement("axes"));
    /// The memory layout of `axes`.
    public static final MemoryLayout ML_axes = LAYOUT.select(PathElement.groupElement("axes"));

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment the memory segment
    public GLFWGamepadState(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGamepadState of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWGamepadState(segment); }

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWGamepadState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGamepadState ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWGamepadState(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `GLFWGamepadState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState alloc(SegmentAllocator allocator) { return new GLFWGamepadState(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWGamepadState`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState allocInit(SegmentAllocator allocator, @CType("unsigned char[15]") java.lang.foreign.MemorySegment buttons, @CType("float[6]") java.lang.foreign.MemorySegment axes) { return alloc(allocator).buttons(buttons).axes(axes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWGamepadState copyFrom(GLFWGamepadState src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `buttons` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char[15]") java.lang.foreign.MemorySegment get_buttons(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_buttons, index), ML_buttons); }
    /// {@return `buttons`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char[15]") java.lang.foreign.MemorySegment get_buttons(MemorySegment segment) { return GLFWGamepadState.get_buttons(segment, 0L); }
    /// {@return `buttons`}
    public @CType("unsigned char[15]") java.lang.foreign.MemorySegment buttons() { return GLFWGamepadState.get_buttons(this.segment()); }
    /// Sets `buttons` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buttons(MemorySegment segment, long index, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_buttons, index), ML_buttons.byteSize()); }
    /// Sets `buttons` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buttons(MemorySegment segment, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(segment, 0L, value); }
    /// Sets `buttons` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState buttons(@CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(this.segment(), value); return this; }

    /// {@return `axes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[6]") java.lang.foreign.MemorySegment get_axes(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_axes, index), ML_axes); }
    /// {@return `axes`}
    /// @param segment the segment of the struct
    public static @CType("float[6]") java.lang.foreign.MemorySegment get_axes(MemorySegment segment) { return GLFWGamepadState.get_axes(segment, 0L); }
    /// {@return `axes`}
    public @CType("float[6]") java.lang.foreign.MemorySegment axes() { return GLFWGamepadState.get_axes(this.segment()); }
    /// Sets `axes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_axes(MemorySegment segment, long index, @CType("float[6]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_axes, index), ML_axes.byteSize()); }
    /// Sets `axes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_axes(MemorySegment segment, @CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(segment, 0L, value); }
    /// Sets `axes` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState axes(@CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(this.segment(), value); return this; }

    /// A buffer of [GLFWGamepadState].
    public static final class Buffer extends GLFWGamepadState {
        private final long elementCount;

        /// Creates `GLFWGamepadState.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `GLFWGamepadState`.
        /// @param index the index of the struct buffer
        /// @return the slice of `GLFWGamepadState`
        public GLFWGamepadState asSlice(long index) { return new GLFWGamepadState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `GLFWGamepadState`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `GLFWGamepadState`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `buttons` at the given index}
        /// @param index the index
        public @CType("unsigned char[15]") java.lang.foreign.MemorySegment buttonsAt(long index) { return GLFWGamepadState.get_buttons(this.segment(), index); }
        /// Sets `buttons` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer buttonsAt(long index, @CType("unsigned char[15]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_buttons(this.segment(), index, value); return this; }

        /// {@return `axes` at the given index}
        /// @param index the index
        public @CType("float[6]") java.lang.foreign.MemorySegment axesAt(long index) { return GLFWGamepadState.get_axes(this.segment(), index); }
        /// Sets `axes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer axesAt(long index, @CType("float[6]") java.lang.foreign.MemorySegment value) { GLFWGamepadState.set_axes(this.segment(), index, value); return this; }

    }
}
