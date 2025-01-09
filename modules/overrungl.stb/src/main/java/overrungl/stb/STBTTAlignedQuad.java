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
/// ### x0
/// [VarHandle][#VH_x0] - [Getter][#x0()] - [Setter][#x0(float)]
/// ### y0
/// [VarHandle][#VH_y0] - [Getter][#y0()] - [Setter][#y0(float)]
/// ### s0
/// [VarHandle][#VH_s0] - [Getter][#s0()] - [Setter][#s0(float)]
/// ### t0
/// [VarHandle][#VH_t0] - [Getter][#t0()] - [Setter][#t0(float)]
/// ### x1
/// [VarHandle][#VH_x1] - [Getter][#x1()] - [Setter][#x1(float)]
/// ### y1
/// [VarHandle][#VH_y1] - [Getter][#y1()] - [Setter][#y1(float)]
/// ### s1
/// [VarHandle][#VH_s1] - [Getter][#s1()] - [Setter][#s1(float)]
/// ### t1
/// [VarHandle][#VH_t1] - [Getter][#t1()] - [Setter][#t1(float)]
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

    /// Creates `STBTTAlignedQuad` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment); }

    /// Creates `STBTTAlignedQuad` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTAlignedQuad` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator, long count) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBTTAlignedQuad`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTAlignedQuad`
    public STBTTAlignedQuad asSlice(long index) { return new STBTTAlignedQuad(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBTTAlignedQuad`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTAlignedQuad`
    public STBTTAlignedQuad asSlice(long index, long count) { return new STBTTAlignedQuad(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `x0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_x0(MemorySegment segment, long index) { return (float) VH_x0.get(segment, 0L, index); }
    /// {@return `x0`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_x0(MemorySegment segment) { return STBTTAlignedQuad.get_x0(segment, 0L); }
    /// {@return `x0` at the given index}
    /// @param index the index
    public @CType("float") float x0At(long index) { return STBTTAlignedQuad.get_x0(this.segment(), index); }
    /// {@return `x0`}
    public @CType("float") float x0() { return STBTTAlignedQuad.get_x0(this.segment()); }
    /// Sets `x0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x0(MemorySegment segment, long index, @CType("float") float value) { VH_x0.set(segment, 0L, index, value); }
    /// Sets `x0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x0(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_x0(segment, 0L, value); }
    /// Sets `x0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0At(long index, @CType("float") float value) { STBTTAlignedQuad.set_x0(this.segment(), index, value); return this; }
    /// Sets `x0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0(@CType("float") float value) { STBTTAlignedQuad.set_x0(this.segment(), value); return this; }

    /// {@return `y0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_y0(MemorySegment segment, long index) { return (float) VH_y0.get(segment, 0L, index); }
    /// {@return `y0`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_y0(MemorySegment segment) { return STBTTAlignedQuad.get_y0(segment, 0L); }
    /// {@return `y0` at the given index}
    /// @param index the index
    public @CType("float") float y0At(long index) { return STBTTAlignedQuad.get_y0(this.segment(), index); }
    /// {@return `y0`}
    public @CType("float") float y0() { return STBTTAlignedQuad.get_y0(this.segment()); }
    /// Sets `y0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y0(MemorySegment segment, long index, @CType("float") float value) { VH_y0.set(segment, 0L, index, value); }
    /// Sets `y0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y0(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_y0(segment, 0L, value); }
    /// Sets `y0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0At(long index, @CType("float") float value) { STBTTAlignedQuad.set_y0(this.segment(), index, value); return this; }
    /// Sets `y0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0(@CType("float") float value) { STBTTAlignedQuad.set_y0(this.segment(), value); return this; }

    /// {@return `s0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_s0(MemorySegment segment, long index) { return (float) VH_s0.get(segment, 0L, index); }
    /// {@return `s0`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_s0(MemorySegment segment) { return STBTTAlignedQuad.get_s0(segment, 0L); }
    /// {@return `s0` at the given index}
    /// @param index the index
    public @CType("float") float s0At(long index) { return STBTTAlignedQuad.get_s0(this.segment(), index); }
    /// {@return `s0`}
    public @CType("float") float s0() { return STBTTAlignedQuad.get_s0(this.segment()); }
    /// Sets `s0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_s0(MemorySegment segment, long index, @CType("float") float value) { VH_s0.set(segment, 0L, index, value); }
    /// Sets `s0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_s0(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_s0(segment, 0L, value); }
    /// Sets `s0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0At(long index, @CType("float") float value) { STBTTAlignedQuad.set_s0(this.segment(), index, value); return this; }
    /// Sets `s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0(@CType("float") float value) { STBTTAlignedQuad.set_s0(this.segment(), value); return this; }

    /// {@return `t0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_t0(MemorySegment segment, long index) { return (float) VH_t0.get(segment, 0L, index); }
    /// {@return `t0`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_t0(MemorySegment segment) { return STBTTAlignedQuad.get_t0(segment, 0L); }
    /// {@return `t0` at the given index}
    /// @param index the index
    public @CType("float") float t0At(long index) { return STBTTAlignedQuad.get_t0(this.segment(), index); }
    /// {@return `t0`}
    public @CType("float") float t0() { return STBTTAlignedQuad.get_t0(this.segment()); }
    /// Sets `t0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_t0(MemorySegment segment, long index, @CType("float") float value) { VH_t0.set(segment, 0L, index, value); }
    /// Sets `t0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_t0(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_t0(segment, 0L, value); }
    /// Sets `t0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0At(long index, @CType("float") float value) { STBTTAlignedQuad.set_t0(this.segment(), index, value); return this; }
    /// Sets `t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0(@CType("float") float value) { STBTTAlignedQuad.set_t0(this.segment(), value); return this; }

    /// {@return `x1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_x1(MemorySegment segment, long index) { return (float) VH_x1.get(segment, 0L, index); }
    /// {@return `x1`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_x1(MemorySegment segment) { return STBTTAlignedQuad.get_x1(segment, 0L); }
    /// {@return `x1` at the given index}
    /// @param index the index
    public @CType("float") float x1At(long index) { return STBTTAlignedQuad.get_x1(this.segment(), index); }
    /// {@return `x1`}
    public @CType("float") float x1() { return STBTTAlignedQuad.get_x1(this.segment()); }
    /// Sets `x1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x1(MemorySegment segment, long index, @CType("float") float value) { VH_x1.set(segment, 0L, index, value); }
    /// Sets `x1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x1(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_x1(segment, 0L, value); }
    /// Sets `x1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1At(long index, @CType("float") float value) { STBTTAlignedQuad.set_x1(this.segment(), index, value); return this; }
    /// Sets `x1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1(@CType("float") float value) { STBTTAlignedQuad.set_x1(this.segment(), value); return this; }

    /// {@return `y1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_y1(MemorySegment segment, long index) { return (float) VH_y1.get(segment, 0L, index); }
    /// {@return `y1`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_y1(MemorySegment segment) { return STBTTAlignedQuad.get_y1(segment, 0L); }
    /// {@return `y1` at the given index}
    /// @param index the index
    public @CType("float") float y1At(long index) { return STBTTAlignedQuad.get_y1(this.segment(), index); }
    /// {@return `y1`}
    public @CType("float") float y1() { return STBTTAlignedQuad.get_y1(this.segment()); }
    /// Sets `y1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y1(MemorySegment segment, long index, @CType("float") float value) { VH_y1.set(segment, 0L, index, value); }
    /// Sets `y1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y1(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_y1(segment, 0L, value); }
    /// Sets `y1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1At(long index, @CType("float") float value) { STBTTAlignedQuad.set_y1(this.segment(), index, value); return this; }
    /// Sets `y1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1(@CType("float") float value) { STBTTAlignedQuad.set_y1(this.segment(), value); return this; }

    /// {@return `s1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_s1(MemorySegment segment, long index) { return (float) VH_s1.get(segment, 0L, index); }
    /// {@return `s1`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_s1(MemorySegment segment) { return STBTTAlignedQuad.get_s1(segment, 0L); }
    /// {@return `s1` at the given index}
    /// @param index the index
    public @CType("float") float s1At(long index) { return STBTTAlignedQuad.get_s1(this.segment(), index); }
    /// {@return `s1`}
    public @CType("float") float s1() { return STBTTAlignedQuad.get_s1(this.segment()); }
    /// Sets `s1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_s1(MemorySegment segment, long index, @CType("float") float value) { VH_s1.set(segment, 0L, index, value); }
    /// Sets `s1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_s1(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_s1(segment, 0L, value); }
    /// Sets `s1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1At(long index, @CType("float") float value) { STBTTAlignedQuad.set_s1(this.segment(), index, value); return this; }
    /// Sets `s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1(@CType("float") float value) { STBTTAlignedQuad.set_s1(this.segment(), value); return this; }

    /// {@return `t1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_t1(MemorySegment segment, long index) { return (float) VH_t1.get(segment, 0L, index); }
    /// {@return `t1`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_t1(MemorySegment segment) { return STBTTAlignedQuad.get_t1(segment, 0L); }
    /// {@return `t1` at the given index}
    /// @param index the index
    public @CType("float") float t1At(long index) { return STBTTAlignedQuad.get_t1(this.segment(), index); }
    /// {@return `t1`}
    public @CType("float") float t1() { return STBTTAlignedQuad.get_t1(this.segment()); }
    /// Sets `t1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_t1(MemorySegment segment, long index, @CType("float") float value) { VH_t1.set(segment, 0L, index, value); }
    /// Sets `t1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_t1(MemorySegment segment, @CType("float") float value) { STBTTAlignedQuad.set_t1(segment, 0L, value); }
    /// Sets `t1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1At(long index, @CType("float") float value) { STBTTAlignedQuad.set_t1(this.segment(), index, value); return this; }
    /// Sets `t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1(@CType("float") float value) { STBTTAlignedQuad.set_t1(this.segment(), value); return this; }

}
