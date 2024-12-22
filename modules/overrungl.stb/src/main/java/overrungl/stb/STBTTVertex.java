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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(short)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(short)]
/// ### cx
/// [VarHandle][#VH_cx] - [Getter][#cx()] - [Setter][#cx(short)]
/// ### cy
/// [VarHandle][#VH_cy] - [Getter][#cy()] - [Setter][#cy(short)]
/// ### cx1
/// [VarHandle][#VH_cx1] - [Getter][#cx1()] - [Setter][#cx1(short)]
/// ### cy1
/// [VarHandle][#VH_cy1] - [Getter][#cy1()] - [Setter][#cy1(short)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(byte)]
/// ### padding
/// [VarHandle][#VH_padding] - [Getter][#padding()] - [Setter][#padding(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt_vertex {
///     stbtt_vertex_type x;
///     stbtt_vertex_type y;
///     stbtt_vertex_type cx;
///     stbtt_vertex_type cy;
///     stbtt_vertex_type cx1;
///     stbtt_vertex_type cy1;
///     unsigned char type;
///     unsigned char padding;
/// } STBTTVertex;
/// ```
public final class STBTTVertex extends Struct {
    /// The struct layout of `stbtt_vertex`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("x"),
        ValueLayout.JAVA_SHORT.withName("y"),
        ValueLayout.JAVA_SHORT.withName("cx"),
        ValueLayout.JAVA_SHORT.withName("cy"),
        ValueLayout.JAVA_SHORT.withName("cx1"),
        ValueLayout.JAVA_SHORT.withName("cy1"),
        ValueLayout.JAVA_BYTE.withName("type"),
        ValueLayout.JAVA_BYTE.withName("padding")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `cx` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cx"));
    /// The [VarHandle] of `cy` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cy"));
    /// The [VarHandle] of `cx1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cx1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cx1"));
    /// The [VarHandle] of `cy1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cy1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cy1"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `padding` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_padding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("padding"));

    /// Creates `STBTTVertex` with the given segment.
    /// @param segment the memory segment
    public STBTTVertex(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `STBTTVertex` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTVertex`
    public static STBTTVertex alloc(SegmentAllocator allocator) { return new STBTTVertex(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTVertex` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTVertex`
    public static STBTTVertex alloc(SegmentAllocator allocator, long count) { return new STBTTVertex(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short xAt(long index) { return (short) VH_x.get(this.segment(), 0L, index); }
    /// {@return `x`}
    public @CType("stbtt_vertex_type") short x() { return this.xAt(0L); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex xAt(long index, @CType("stbtt_vertex_type") short value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex x(@CType("stbtt_vertex_type") short value) { return this.xAt(0L, value); }

    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short yAt(long index) { return (short) VH_y.get(this.segment(), 0L, index); }
    /// {@return `y`}
    public @CType("stbtt_vertex_type") short y() { return this.yAt(0L); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex yAt(long index, @CType("stbtt_vertex_type") short value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex y(@CType("stbtt_vertex_type") short value) { return this.yAt(0L, value); }

    /// {@return `cx` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cxAt(long index) { return (short) VH_cx.get(this.segment(), 0L, index); }
    /// {@return `cx`}
    public @CType("stbtt_vertex_type") short cx() { return this.cxAt(0L); }
    /// Sets `cx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cxAt(long index, @CType("stbtt_vertex_type") short value) { VH_cx.set(this.segment(), 0L, index, value); return this; }
    /// Sets `cx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx(@CType("stbtt_vertex_type") short value) { return this.cxAt(0L, value); }

    /// {@return `cy` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cyAt(long index) { return (short) VH_cy.get(this.segment(), 0L, index); }
    /// {@return `cy`}
    public @CType("stbtt_vertex_type") short cy() { return this.cyAt(0L); }
    /// Sets `cy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cyAt(long index, @CType("stbtt_vertex_type") short value) { VH_cy.set(this.segment(), 0L, index, value); return this; }
    /// Sets `cy` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy(@CType("stbtt_vertex_type") short value) { return this.cyAt(0L, value); }

    /// {@return `cx1` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cx1At(long index) { return (short) VH_cx1.get(this.segment(), 0L, index); }
    /// {@return `cx1`}
    public @CType("stbtt_vertex_type") short cx1() { return this.cx1At(0L); }
    /// Sets `cx1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx1At(long index, @CType("stbtt_vertex_type") short value) { VH_cx1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `cx1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx1(@CType("stbtt_vertex_type") short value) { return this.cx1At(0L, value); }

    /// {@return `cy1` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cy1At(long index) { return (short) VH_cy1.get(this.segment(), 0L, index); }
    /// {@return `cy1`}
    public @CType("stbtt_vertex_type") short cy1() { return this.cy1At(0L); }
    /// Sets `cy1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy1At(long index, @CType("stbtt_vertex_type") short value) { VH_cy1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `cy1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy1(@CType("stbtt_vertex_type") short value) { return this.cy1At(0L, value); }

    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte typeAt(long index) { return (byte) VH_type.get(this.segment(), 0L, index); }
    /// {@return `type`}
    public @CType("unsigned char") byte type() { return this.typeAt(0L); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex typeAt(long index, @CType("unsigned char") byte value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex type(@CType("unsigned char") byte value) { return this.typeAt(0L, value); }

    /// {@return `padding` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte paddingAt(long index) { return (byte) VH_padding.get(this.segment(), 0L, index); }
    /// {@return `padding`}
    public @CType("unsigned char") byte padding() { return this.paddingAt(0L); }
    /// Sets `padding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex paddingAt(long index, @CType("unsigned char") byte value) { VH_padding.set(this.segment(), 0L, index, value); return this; }
    /// Sets `padding` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex padding(@CType("unsigned char") byte value) { return this.paddingAt(0L, value); }

}
