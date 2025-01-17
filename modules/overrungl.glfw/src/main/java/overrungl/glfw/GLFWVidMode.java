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
/// ### redBits
/// [VarHandle][#VH_redBits] - [Getter][#redBits()] - [Setter][#redBits(int)]
/// ### greenBits
/// [VarHandle][#VH_greenBits] - [Getter][#greenBits()] - [Setter][#greenBits(int)]
/// ### blueBits
/// [VarHandle][#VH_blueBits] - [Getter][#blueBits()] - [Setter][#blueBits(int)]
/// ### refreshRate
/// [VarHandle][#VH_refreshRate] - [Getter][#refreshRate()] - [Setter][#refreshRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWvidmode {
///     int width;
///     int height;
///     int redBits;
///     int greenBits;
///     int blueBits;
///     int refreshRate;
/// } GLFWVidMode;
/// ```
public sealed class GLFWVidMode extends Struct {
    /// The struct layout of `GLFWvidmode`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `redBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_redBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("redBits"));
    /// The [VarHandle] of `greenBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_greenBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("greenBits"));
    /// The [VarHandle] of `blueBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blueBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blueBits"));
    /// The [VarHandle] of `refreshRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate"));

    /// Creates `GLFWVidMode` with the given segment.
    /// @param segment the memory segment
    public GLFWVidMode(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWVidMode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWVidMode of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWVidMode(segment); }

    /// Creates `GLFWVidMode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWVidMode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWVidMode ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWVidMode(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `GLFWVidMode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `GLFWVidMode` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWVidMode`
    public static GLFWVidMode alloc(SegmentAllocator allocator) { return new GLFWVidMode(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWVidMode` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWVidMode`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWVidMode` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWVidMode`
    public static GLFWVidMode allocInit(SegmentAllocator allocator, @CType("int") int width, @CType("int") int height, @CType("int") int redBits, @CType("int") int greenBits, @CType("int") int blueBits, @CType("int") int refreshRate) { return alloc(allocator).width(width).height(height).redBits(redBits).greenBits(greenBits).blueBits(blueBits).refreshRate(refreshRate); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWVidMode copyFrom(GLFWVidMode src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_width(MemorySegment segment) { return GLFWVidMode.get_width(segment, 0L); }
    /// {@return `width`}
    public @CType("int") int width() { return GLFWVidMode.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("int") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_width(segment, 0L, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode width(@CType("int") int value) { GLFWVidMode.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_height(MemorySegment segment) { return GLFWVidMode.get_height(segment, 0L); }
    /// {@return `height`}
    public @CType("int") int height() { return GLFWVidMode.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("int") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_height(segment, 0L, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode height(@CType("int") int value) { GLFWVidMode.set_height(this.segment(), value); return this; }

    /// {@return `redBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_redBits(MemorySegment segment, long index) { return (int) VH_redBits.get(segment, 0L, index); }
    /// {@return `redBits`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_redBits(MemorySegment segment) { return GLFWVidMode.get_redBits(segment, 0L); }
    /// {@return `redBits`}
    public @CType("int") int redBits() { return GLFWVidMode.get_redBits(this.segment()); }
    /// Sets `redBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_redBits(MemorySegment segment, long index, @CType("int") int value) { VH_redBits.set(segment, 0L, index, value); }
    /// Sets `redBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_redBits(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_redBits(segment, 0L, value); }
    /// Sets `redBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode redBits(@CType("int") int value) { GLFWVidMode.set_redBits(this.segment(), value); return this; }

    /// {@return `greenBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_greenBits(MemorySegment segment, long index) { return (int) VH_greenBits.get(segment, 0L, index); }
    /// {@return `greenBits`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_greenBits(MemorySegment segment) { return GLFWVidMode.get_greenBits(segment, 0L); }
    /// {@return `greenBits`}
    public @CType("int") int greenBits() { return GLFWVidMode.get_greenBits(this.segment()); }
    /// Sets `greenBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_greenBits(MemorySegment segment, long index, @CType("int") int value) { VH_greenBits.set(segment, 0L, index, value); }
    /// Sets `greenBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_greenBits(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_greenBits(segment, 0L, value); }
    /// Sets `greenBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode greenBits(@CType("int") int value) { GLFWVidMode.set_greenBits(this.segment(), value); return this; }

    /// {@return `blueBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_blueBits(MemorySegment segment, long index) { return (int) VH_blueBits.get(segment, 0L, index); }
    /// {@return `blueBits`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_blueBits(MemorySegment segment) { return GLFWVidMode.get_blueBits(segment, 0L); }
    /// {@return `blueBits`}
    public @CType("int") int blueBits() { return GLFWVidMode.get_blueBits(this.segment()); }
    /// Sets `blueBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blueBits(MemorySegment segment, long index, @CType("int") int value) { VH_blueBits.set(segment, 0L, index, value); }
    /// Sets `blueBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blueBits(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_blueBits(segment, 0L, value); }
    /// Sets `blueBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode blueBits(@CType("int") int value) { GLFWVidMode.set_blueBits(this.segment(), value); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_refreshRate(MemorySegment segment, long index) { return (int) VH_refreshRate.get(segment, 0L, index); }
    /// {@return `refreshRate`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_refreshRate(MemorySegment segment) { return GLFWVidMode.get_refreshRate(segment, 0L); }
    /// {@return `refreshRate`}
    public @CType("int") int refreshRate() { return GLFWVidMode.get_refreshRate(this.segment()); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refreshRate(MemorySegment segment, long index, @CType("int") int value) { VH_refreshRate.set(segment, 0L, index, value); }
    /// Sets `refreshRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refreshRate(MemorySegment segment, @CType("int") int value) { GLFWVidMode.set_refreshRate(segment, 0L, value); }
    /// Sets `refreshRate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode refreshRate(@CType("int") int value) { GLFWVidMode.set_refreshRate(this.segment(), value); return this; }

    /// A buffer of [GLFWVidMode].
    public static final class Buffer extends GLFWVidMode {
        private final long elementCount;

        /// Creates `GLFWVidMode.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `GLFWVidMode`.
        /// @param index the index of the struct buffer
        /// @return the slice of `GLFWVidMode`
        public GLFWVidMode asSlice(long index) { return new GLFWVidMode(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `GLFWVidMode`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `GLFWVidMode`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `width` at the given index}
        /// @param index the index
        public @CType("int") int widthAt(long index) { return GLFWVidMode.get_width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, @CType("int") int value) { GLFWVidMode.set_width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index
        public @CType("int") int heightAt(long index) { return GLFWVidMode.get_height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, @CType("int") int value) { GLFWVidMode.set_height(this.segment(), index, value); return this; }

        /// {@return `redBits` at the given index}
        /// @param index the index
        public @CType("int") int redBitsAt(long index) { return GLFWVidMode.get_redBits(this.segment(), index); }
        /// Sets `redBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer redBitsAt(long index, @CType("int") int value) { GLFWVidMode.set_redBits(this.segment(), index, value); return this; }

        /// {@return `greenBits` at the given index}
        /// @param index the index
        public @CType("int") int greenBitsAt(long index) { return GLFWVidMode.get_greenBits(this.segment(), index); }
        /// Sets `greenBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer greenBitsAt(long index, @CType("int") int value) { GLFWVidMode.set_greenBits(this.segment(), index, value); return this; }

        /// {@return `blueBits` at the given index}
        /// @param index the index
        public @CType("int") int blueBitsAt(long index) { return GLFWVidMode.get_blueBits(this.segment(), index); }
        /// Sets `blueBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer blueBitsAt(long index, @CType("int") int value) { GLFWVidMode.set_blueBits(this.segment(), index, value); return this; }

        /// {@return `refreshRate` at the given index}
        /// @param index the index
        public @CType("int") int refreshRateAt(long index) { return GLFWVidMode.get_refreshRate(this.segment(), index); }
        /// Sets `refreshRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer refreshRateAt(long index, @CType("int") int value) { GLFWVidMode.set_refreshRate(this.segment(), index, value); return this; }

    }
}
