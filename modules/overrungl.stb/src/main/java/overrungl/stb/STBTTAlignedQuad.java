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

/// ## Members
/// ### x0
/// [VarHandle][#VH_x0] - [Getter][#x0()] - [Setter][#x0(float)]
///
/// top-left
///
/// ### y0
/// [VarHandle][#VH_y0] - [Getter][#y0()] - [Setter][#y0(float)]
///
/// top-left
///
/// ### s0
/// [VarHandle][#VH_s0] - [Getter][#s0()] - [Setter][#s0(float)]
///
/// top-left
///
/// ### t0
/// [VarHandle][#VH_t0] - [Getter][#t0()] - [Setter][#t0(float)]
///
/// top-left
///
/// ### x1
/// [VarHandle][#VH_x1] - [Getter][#x1()] - [Setter][#x1(float)]
///
/// bottom-right
///
/// ### y1
/// [VarHandle][#VH_y1] - [Getter][#y1()] - [Setter][#y1(float)]
///
/// bottom-right
///
/// ### s1
/// [VarHandle][#VH_s1] - [Getter][#s1()] - [Setter][#s1(float)]
///
/// bottom-right
///
/// ### t1
/// [VarHandle][#VH_t1] - [Getter][#t1()] - [Setter][#t1(float)]
///
/// bottom-right
///
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt_aligned_quad {
///     float x0;
///     float y0;
///     float s0;
///     float t0;
///     float x1;
///     float y1;
///     float s1;
///     float t1;
/// } STBTTAlignedQuad;
/// ```
public final class STBTTAlignedQuad extends Struct {
    /// The struct layout of `stbtt_aligned_quad`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x0"),
        ValueLayout.JAVA_FLOAT.withName("y0"),
        ValueLayout.JAVA_FLOAT.withName("s0"),
        ValueLayout.JAVA_FLOAT.withName("t0"),
        ValueLayout.JAVA_FLOAT.withName("x1"),
        ValueLayout.JAVA_FLOAT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("s1"),
        ValueLayout.JAVA_FLOAT.withName("t1")
    );
    /// The [VarHandle] of `x0` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_x0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x0"));
    /// The [VarHandle] of `y0` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_y0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y0"));
    /// The [VarHandle] of `s0` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_s0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("s0"));
    /// The [VarHandle] of `t0` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_t0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("t0"));
    /// The [VarHandle] of `x1` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_x1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x1"));
    /// The [VarHandle] of `y1` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_y1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y1"));
    /// The [VarHandle] of `s1` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_s1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("s1"));
    /// The [VarHandle] of `t1` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_t1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("t1"));

    /// Creates `STBTTAlignedQuad` with the given segment.
    /// @param segment the memory segment
    public STBTTAlignedQuad(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator, long count) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT, count)); }

    /// {@return `x0` at the given index}
    /// @param index the index
    public @CType("float") float x0At(long index) { return (float) VH_x0.get(this.segment(), 0L, index); }
    /// {@return `x0`}
    public @CType("float") float x0() { return this.x0At(0L); }
    /// Sets `x0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0At(long index, @CType("float") float value) { VH_x0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `x0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0(@CType("float") float value) { return this.x0At(0L, value); }

    /// {@return `y0` at the given index}
    /// @param index the index
    public @CType("float") float y0At(long index) { return (float) VH_y0.get(this.segment(), 0L, index); }
    /// {@return `y0`}
    public @CType("float") float y0() { return this.y0At(0L); }
    /// Sets `y0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0At(long index, @CType("float") float value) { VH_y0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `y0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0(@CType("float") float value) { return this.y0At(0L, value); }

    /// {@return `s0` at the given index}
    /// @param index the index
    public @CType("float") float s0At(long index) { return (float) VH_s0.get(this.segment(), 0L, index); }
    /// {@return `s0`}
    public @CType("float") float s0() { return this.s0At(0L); }
    /// Sets `s0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0At(long index, @CType("float") float value) { VH_s0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0(@CType("float") float value) { return this.s0At(0L, value); }

    /// {@return `t0` at the given index}
    /// @param index the index
    public @CType("float") float t0At(long index) { return (float) VH_t0.get(this.segment(), 0L, index); }
    /// {@return `t0`}
    public @CType("float") float t0() { return this.t0At(0L); }
    /// Sets `t0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0At(long index, @CType("float") float value) { VH_t0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0(@CType("float") float value) { return this.t0At(0L, value); }

    /// {@return `x1` at the given index}
    /// @param index the index
    public @CType("float") float x1At(long index) { return (float) VH_x1.get(this.segment(), 0L, index); }
    /// {@return `x1`}
    public @CType("float") float x1() { return this.x1At(0L); }
    /// Sets `x1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1At(long index, @CType("float") float value) { VH_x1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `x1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1(@CType("float") float value) { return this.x1At(0L, value); }

    /// {@return `y1` at the given index}
    /// @param index the index
    public @CType("float") float y1At(long index) { return (float) VH_y1.get(this.segment(), 0L, index); }
    /// {@return `y1`}
    public @CType("float") float y1() { return this.y1At(0L); }
    /// Sets `y1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1At(long index, @CType("float") float value) { VH_y1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `y1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1(@CType("float") float value) { return this.y1At(0L, value); }

    /// {@return `s1` at the given index}
    /// @param index the index
    public @CType("float") float s1At(long index) { return (float) VH_s1.get(this.segment(), 0L, index); }
    /// {@return `s1`}
    public @CType("float") float s1() { return this.s1At(0L); }
    /// Sets `s1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1At(long index, @CType("float") float value) { VH_s1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1(@CType("float") float value) { return this.s1At(0L, value); }

    /// {@return `t1` at the given index}
    /// @param index the index
    public @CType("float") float t1At(long index) { return (float) VH_t1.get(this.segment(), 0L, index); }
    /// {@return `t1`}
    public @CType("float") float t1() { return this.t1At(0L); }
    /// Sets `t1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1At(long index, @CType("float") float value) { VH_t1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1(@CType("float") float value) { return this.t1At(0L, value); }

}
