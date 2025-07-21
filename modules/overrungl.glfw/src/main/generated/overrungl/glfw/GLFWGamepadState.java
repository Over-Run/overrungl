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
/// struct GLFWGamepadState {
///     unsigned char buttons[15];
///     float axes[6];
/// };
/// ```
public final class GLFWGamepadState extends GroupType {
    /// The struct layout of `GLFWGamepadState`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    /// The byte offset of `buttons`.
    public static final long OFFSET_buttons = LAYOUT.byteOffset(PathElement.groupElement("buttons"));
    /// The memory layout of `buttons`.
    public static final MemoryLayout LAYOUT_buttons = LAYOUT.select(PathElement.groupElement("buttons"));
    /// The [VarHandle] of `buttons` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_buttons = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buttons"), PathElement.sequenceElement());
    /// The byte offset of `axes`.
    public static final long OFFSET_axes = LAYOUT.byteOffset(PathElement.groupElement("axes"));
    /// The memory layout of `axes`.
    public static final MemoryLayout LAYOUT_axes = LAYOUT.select(PathElement.groupElement("axes"));
    /// The [VarHandle] of `axes` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_axes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("axes"), PathElement.sequenceElement());

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public GLFWGamepadState(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `GLFWGamepadState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGamepadState of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGamepadState(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWGamepadState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGamepadState ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGamepadState(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `GLFWGamepadState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWGamepadState ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWGamepadState(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState alloc(SegmentAllocator allocator) { return new GLFWGamepadState(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState alloc(SegmentAllocator allocator, long count) { return new GLFWGamepadState(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param buttons `buttons`
    /// @param axes `axes`
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState allocInit(SegmentAllocator allocator, MemorySegment buttons, MemorySegment axes) {
        return alloc(allocator).buttons(buttons).axes(axes);
    }

    /// Allocates a `GLFWGamepadState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param buttons `buttons`
    /// @return the allocated `GLFWGamepadState`
    public static GLFWGamepadState allocInit(SegmentAllocator allocator, MemorySegment buttons) {
        return alloc(allocator).buttons(buttons);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWGamepadState copyFrom(GLFWGamepadState src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public GLFWGamepadState reinterpret(long count) { return new GLFWGamepadState(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `buttons` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment buttons(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_buttons, index), LAYOUT_buttons); }
    /// {@return `buttons` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte buttons(MemorySegment segment, long index, long index0) { return (byte) VH_buttons.get(segment, 0L, index, index0); }
    /// {@return `buttons`}
    public MemorySegment buttons() { return buttons(this.segment(), 0L); }
    /// {@return `buttons`}
    /// @param index0 the Index 0 of the array
    public byte buttons(long index0) { return buttons(this.segment(), 0L, index0); }
    /// Sets `buttons` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void buttons(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_buttons, index), LAYOUT_buttons.byteSize()); }
    /// Sets `buttons` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void buttons(MemorySegment segment, long index, long index0, byte value) { VH_buttons.set(segment, 0L, index, index0, value); }
    /// Sets `buttons` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState buttons(MemorySegment value) { buttons(this.segment(), 0L, value); return this; }
    /// Sets `buttons` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState buttons(long index0, byte value) { buttons(this.segment(), 0L, index0, value); return this; }

    /// {@return `axes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment axes(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_axes, index), LAYOUT_axes); }
    /// {@return `axes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float axes(MemorySegment segment, long index, long index0) { return (float) VH_axes.get(segment, 0L, index, index0); }
    /// {@return `axes`}
    public MemorySegment axes() { return axes(this.segment(), 0L); }
    /// {@return `axes`}
    /// @param index0 the Index 0 of the array
    public float axes(long index0) { return axes(this.segment(), 0L, index0); }
    /// Sets `axes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void axes(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_axes, index), LAYOUT_axes.byteSize()); }
    /// Sets `axes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void axes(MemorySegment segment, long index, long index0, float value) { VH_axes.set(segment, 0L, index, index0, value); }
    /// Sets `axes` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState axes(MemorySegment value) { axes(this.segment(), 0L, value); return this; }
    /// Sets `axes` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState axes(long index0, float value) { axes(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `GLFWGamepadState`.
    /// @param index the index of the struct buffer
    /// @return the slice of `GLFWGamepadState`
    public GLFWGamepadState asSlice(long index) { return new GLFWGamepadState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `GLFWGamepadState`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `GLFWGamepadState`
    public GLFWGamepadState asSlice(long index, long count) { return new GLFWGamepadState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `GLFWGamepadState` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public GLFWGamepadState at(long index, Consumer<GLFWGamepadState> func) { func.accept(asSlice(index)); return this; }

    /// {@return `buttons` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment buttonsAt(long index) { return buttons(this.segment(), index); }
    /// {@return `buttons` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte buttonsAt(long index, long index0) { return buttons(this.segment(), index, index0); }
    /// Sets `buttons` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState buttonsAt(long index, MemorySegment value) { buttons(this.segment(), index, value); return this; }
    /// Sets `buttons` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState buttonsAt(long index, long index0, byte value) { buttons(this.segment(), index, index0, value); return this; }

    /// {@return `axes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment axesAt(long index) { return axes(this.segment(), index); }
    /// {@return `axes` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float axesAt(long index, long index0) { return axes(this.segment(), index, index0); }
    /// Sets `axes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState axesAt(long index, MemorySegment value) { axes(this.segment(), index, value); return this; }
    /// Sets `axes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public GLFWGamepadState axesAt(long index, long index0, float value) { axes(this.segment(), index, index0, value); return this; }

}
