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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// 16 bytes, nominally
///
/// ## Members
/// ### id
/// [VarHandle][#VH_id] - [Getter][#id()] - [Setter][#id(int)]
///
/// reserved for your use
///
/// ### w
/// [VarHandle][#VH_w] - [Getter][#w()] - [Setter][#w(int)]
///
/// input
///
/// ### h
/// [VarHandle][#VH_h] - [Getter][#h()] - [Setter][#h(int)]
///
/// input
///
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(int)]
///
/// output
///
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(int)]
///
/// output
///
/// ### was_packed
/// [VarHandle][#VH_was_packed] - [Getter][#was_packed()] - [Setter][#was_packed(int)]
///
/// non-zero if valid packing
///
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
public final class STBRPRect extends Struct {
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

    /// Allocates a `STBRPRect` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPRect`
    public static STBRPRect alloc(SegmentAllocator allocator) { return new STBRPRect(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPRect` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPRect`
    public static STBRPRect alloc(SegmentAllocator allocator, long count) { return new STBRPRect(allocator.allocate(LAYOUT, count)); }

    /// {@return `id` at the given index}
    /// @param index the index
    public @CType("int") int idAt(long index) { return (int) VH_id.get(this.segment(), 0L, index); }
    /// {@return `id`}
    public @CType("int") int id() { return this.idAt(0L); }
    /// Sets `id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect idAt(long index, @CType("int") int value) { VH_id.set(this.segment(), 0L, index, value); return this; }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect id(@CType("int") int value) { return this.idAt(0L, value); }

    /// {@return `w` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int wAt(long index) { return (int) VH_w.get(this.segment(), 0L, index); }
    /// {@return `w`}
    public @CType("stbrp_coord") int w() { return this.wAt(0L); }
    /// Sets `w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect wAt(long index, @CType("stbrp_coord") int value) { VH_w.set(this.segment(), 0L, index, value); return this; }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect w(@CType("stbrp_coord") int value) { return this.wAt(0L, value); }

    /// {@return `h` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int hAt(long index) { return (int) VH_h.get(this.segment(), 0L, index); }
    /// {@return `h`}
    public @CType("stbrp_coord") int h() { return this.hAt(0L); }
    /// Sets `h` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect hAt(long index, @CType("stbrp_coord") int value) { VH_h.set(this.segment(), 0L, index, value); return this; }
    /// Sets `h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect h(@CType("stbrp_coord") int value) { return this.hAt(0L, value); }

    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int xAt(long index) { return (int) VH_x.get(this.segment(), 0L, index); }
    /// {@return `x`}
    public @CType("stbrp_coord") int x() { return this.xAt(0L); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect xAt(long index, @CType("stbrp_coord") int value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect x(@CType("stbrp_coord") int value) { return this.xAt(0L, value); }

    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int yAt(long index) { return (int) VH_y.get(this.segment(), 0L, index); }
    /// {@return `y`}
    public @CType("stbrp_coord") int y() { return this.yAt(0L); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect yAt(long index, @CType("stbrp_coord") int value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect y(@CType("stbrp_coord") int value) { return this.yAt(0L, value); }

    /// {@return `was_packed` at the given index}
    /// @param index the index
    public @CType("int") int was_packedAt(long index) { return (int) VH_was_packed.get(this.segment(), 0L, index); }
    /// {@return `was_packed`}
    public @CType("int") int was_packed() { return this.was_packedAt(0L); }
    /// Sets `was_packed` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPRect was_packedAt(long index, @CType("int") int value) { VH_was_packed.set(this.segment(), 0L, index, value); return this; }
    /// Sets `was_packed` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect was_packed(@CType("int") int value) { return this.was_packedAt(0L, value); }

}
