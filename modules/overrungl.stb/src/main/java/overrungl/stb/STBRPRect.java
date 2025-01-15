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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### id
/// [VarHandle][#VH_id] - [Getter][#id()] - [Setter][#id(int)]
/// ### w
/// [VarHandle][#VH_w] - [Getter][#w()] - [Setter][#w(int)]
/// ### h
/// [VarHandle][#VH_h] - [Getter][#h()] - [Setter][#h(int)]
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(int)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(int)]
/// ### was_packed
/// [VarHandle][#VH_was_packed] - [Getter][#was_packed()] - [Setter][#was_packed(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbrp_rect {
///     int id;
///     stbrp_coord w;
///     stbrp_coord h;
///     stbrp_coord x;
///     stbrp_coord y;
///     int was_packed;
/// } STBRPRect;
/// ```
public sealed class STBRPRect extends Struct {
    /// The struct layout of `stbrp_rect`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("was_packed")
    );
    /// The [VarHandle] of `id` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    /// The [VarHandle] of `w` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("w"));
    /// The [VarHandle] of `h` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("h"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `was_packed` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_was_packed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("was_packed"));

    /// Creates `STBRPRect` with the given segment.
    /// @param segment the memory segment
    public STBRPRect(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBRPRect` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPRect of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPRect(segment); }

    /// Creates `STBRPRect` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPRect ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPRect(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBRPRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBRPRect` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPRect`
    public static STBRPRect alloc(SegmentAllocator allocator) { return new STBRPRect(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPRect` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPRect`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBRPRect` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, @CType("int") int id, @CType("stbrp_coord") int w, @CType("stbrp_coord") int h, @CType("stbrp_coord") int x, @CType("stbrp_coord") int y, @CType("int") int was_packed) { return alloc(allocator).id(id).w(w).h(h).x(x).y(y).was_packed(was_packed); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBRPRect copyFrom(STBRPRect src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_id(MemorySegment segment, long index) { return (int) VH_id.get(segment, 0L, index); }
    /// {@return `id`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_id(MemorySegment segment) { return STBRPRect.get_id(segment, 0L); }
    /// {@return `id`}
    public @CType("int") int id() { return STBRPRect.get_id(this.segment()); }
    /// Sets `id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_id(MemorySegment segment, long index, @CType("int") int value) { VH_id.set(segment, 0L, index, value); }
    /// Sets `id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_id(MemorySegment segment, @CType("int") int value) { STBRPRect.set_id(segment, 0L, value); }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect id(@CType("int") int value) { STBRPRect.set_id(this.segment(), value); return this; }

    /// {@return `w` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbrp_coord") int get_w(MemorySegment segment, long index) { return (int) VH_w.get(segment, 0L, index); }
    /// {@return `w`}
    /// @param segment the segment of the struct
    public static @CType("stbrp_coord") int get_w(MemorySegment segment) { return STBRPRect.get_w(segment, 0L); }
    /// {@return `w`}
    public @CType("stbrp_coord") int w() { return STBRPRect.get_w(this.segment()); }
    /// Sets `w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_w(MemorySegment segment, long index, @CType("stbrp_coord") int value) { VH_w.set(segment, 0L, index, value); }
    /// Sets `w` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_w(MemorySegment segment, @CType("stbrp_coord") int value) { STBRPRect.set_w(segment, 0L, value); }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect w(@CType("stbrp_coord") int value) { STBRPRect.set_w(this.segment(), value); return this; }

    /// {@return `h` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbrp_coord") int get_h(MemorySegment segment, long index) { return (int) VH_h.get(segment, 0L, index); }
    /// {@return `h`}
    /// @param segment the segment of the struct
    public static @CType("stbrp_coord") int get_h(MemorySegment segment) { return STBRPRect.get_h(segment, 0L); }
    /// {@return `h`}
    public @CType("stbrp_coord") int h() { return STBRPRect.get_h(this.segment()); }
    /// Sets `h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_h(MemorySegment segment, long index, @CType("stbrp_coord") int value) { VH_h.set(segment, 0L, index, value); }
    /// Sets `h` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_h(MemorySegment segment, @CType("stbrp_coord") int value) { STBRPRect.set_h(segment, 0L, value); }
    /// Sets `h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect h(@CType("stbrp_coord") int value) { STBRPRect.set_h(this.segment(), value); return this; }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbrp_coord") int get_x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("stbrp_coord") int get_x(MemorySegment segment) { return STBRPRect.get_x(segment, 0L); }
    /// {@return `x`}
    public @CType("stbrp_coord") int x() { return STBRPRect.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("stbrp_coord") int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("stbrp_coord") int value) { STBRPRect.set_x(segment, 0L, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect x(@CType("stbrp_coord") int value) { STBRPRect.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbrp_coord") int get_y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("stbrp_coord") int get_y(MemorySegment segment) { return STBRPRect.get_y(segment, 0L); }
    /// {@return `y`}
    public @CType("stbrp_coord") int y() { return STBRPRect.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("stbrp_coord") int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("stbrp_coord") int value) { STBRPRect.set_y(segment, 0L, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect y(@CType("stbrp_coord") int value) { STBRPRect.set_y(this.segment(), value); return this; }

    /// {@return `was_packed` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_was_packed(MemorySegment segment, long index) { return (int) VH_was_packed.get(segment, 0L, index); }
    /// {@return `was_packed`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_was_packed(MemorySegment segment) { return STBRPRect.get_was_packed(segment, 0L); }
    /// {@return `was_packed`}
    public @CType("int") int was_packed() { return STBRPRect.get_was_packed(this.segment()); }
    /// Sets `was_packed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_was_packed(MemorySegment segment, long index, @CType("int") int value) { VH_was_packed.set(segment, 0L, index, value); }
    /// Sets `was_packed` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_was_packed(MemorySegment segment, @CType("int") int value) { STBRPRect.set_was_packed(segment, 0L, value); }
    /// Sets `was_packed` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect was_packed(@CType("int") int value) { STBRPRect.set_was_packed(this.segment(), value); return this; }

    /// A buffer of [STBRPRect].
    public static final class Buffer extends STBRPRect {
        private final long elementCount;

        /// Creates `STBRPRect.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBRPRect`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBRPRect`
        public STBRPRect asSlice(long index) { return new STBRPRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBRPRect`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBRPRect`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `id` at the given index}
        /// @param index the index
        public @CType("int") int idAt(long index) { return STBRPRect.get_id(this.segment(), index); }
        /// Sets `id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer idAt(long index, @CType("int") int value) { STBRPRect.set_id(this.segment(), index, value); return this; }

        /// {@return `w` at the given index}
        /// @param index the index
        public @CType("stbrp_coord") int wAt(long index) { return STBRPRect.get_w(this.segment(), index); }
        /// Sets `w` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer wAt(long index, @CType("stbrp_coord") int value) { STBRPRect.set_w(this.segment(), index, value); return this; }

        /// {@return `h` at the given index}
        /// @param index the index
        public @CType("stbrp_coord") int hAt(long index) { return STBRPRect.get_h(this.segment(), index); }
        /// Sets `h` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hAt(long index, @CType("stbrp_coord") int value) { STBRPRect.set_h(this.segment(), index, value); return this; }

        /// {@return `x` at the given index}
        /// @param index the index
        public @CType("stbrp_coord") int xAt(long index) { return STBRPRect.get_x(this.segment(), index); }
        /// Sets `x` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer xAt(long index, @CType("stbrp_coord") int value) { STBRPRect.set_x(this.segment(), index, value); return this; }

        /// {@return `y` at the given index}
        /// @param index the index
        public @CType("stbrp_coord") int yAt(long index) { return STBRPRect.get_y(this.segment(), index); }
        /// Sets `y` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer yAt(long index, @CType("stbrp_coord") int value) { STBRPRect.set_y(this.segment(), index, value); return this; }

        /// {@return `was_packed` at the given index}
        /// @param index the index
        public @CType("int") int was_packedAt(long index) { return STBRPRect.get_was_packed(this.segment(), index); }
        /// Sets `was_packed` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer was_packedAt(long index, @CType("int") int value) { STBRPRect.set_was_packed(this.segment(), index, value); return this; }

    }
}
