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

    /// Creates `STBTTVertex` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTVertex of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTVertex(segment); }

    /// Creates `STBTTVertex` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTVertex ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTVertex(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTVertex` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTVertex ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBTTVertex(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBTTVertex` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTVertex`
    public static STBTTVertex alloc(SegmentAllocator allocator) { return new STBTTVertex(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTVertex` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTVertex`
    public static STBTTVertex alloc(SegmentAllocator allocator, long count) { return new STBTTVertex(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBTTVertex`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTVertex`
    public STBTTVertex asSlice(long index) { return new STBTTVertex(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBTTVertex`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTVertex`
    public STBTTVertex asSlice(long index, long count) { return new STBTTVertex(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_x(MemorySegment segment, long index) { return (short) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_x(MemorySegment segment) { return STBTTVertex.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short xAt(long index) { return STBTTVertex.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("stbtt_vertex_type") short x() { return STBTTVertex.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex xAt(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex x(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_y(MemorySegment segment, long index) { return (short) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_y(MemorySegment segment) { return STBTTVertex.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short yAt(long index) { return STBTTVertex.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("stbtt_vertex_type") short y() { return STBTTVertex.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex yAt(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex y(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_y(this.segment(), value); return this; }

    /// {@return `cx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_cx(MemorySegment segment, long index) { return (short) VH_cx.get(segment, 0L, index); }
    /// {@return `cx`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_cx(MemorySegment segment) { return STBTTVertex.get_cx(segment, 0L); }
    /// {@return `cx` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cxAt(long index) { return STBTTVertex.get_cx(this.segment(), index); }
    /// {@return `cx`}
    public @CType("stbtt_vertex_type") short cx() { return STBTTVertex.get_cx(this.segment()); }
    /// Sets `cx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cx(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_cx.set(segment, 0L, index, value); }
    /// Sets `cx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cx(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx(segment, 0L, value); }
    /// Sets `cx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cxAt(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx(this.segment(), index, value); return this; }
    /// Sets `cx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx(this.segment(), value); return this; }

    /// {@return `cy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_cy(MemorySegment segment, long index) { return (short) VH_cy.get(segment, 0L, index); }
    /// {@return `cy`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_cy(MemorySegment segment) { return STBTTVertex.get_cy(segment, 0L); }
    /// {@return `cy` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cyAt(long index) { return STBTTVertex.get_cy(this.segment(), index); }
    /// {@return `cy`}
    public @CType("stbtt_vertex_type") short cy() { return STBTTVertex.get_cy(this.segment()); }
    /// Sets `cy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cy(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_cy.set(segment, 0L, index, value); }
    /// Sets `cy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cy(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy(segment, 0L, value); }
    /// Sets `cy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cyAt(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy(this.segment(), index, value); return this; }
    /// Sets `cy` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy(this.segment(), value); return this; }

    /// {@return `cx1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_cx1(MemorySegment segment, long index) { return (short) VH_cx1.get(segment, 0L, index); }
    /// {@return `cx1`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_cx1(MemorySegment segment) { return STBTTVertex.get_cx1(segment, 0L); }
    /// {@return `cx1` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cx1At(long index) { return STBTTVertex.get_cx1(this.segment(), index); }
    /// {@return `cx1`}
    public @CType("stbtt_vertex_type") short cx1() { return STBTTVertex.get_cx1(this.segment()); }
    /// Sets `cx1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cx1(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_cx1.set(segment, 0L, index, value); }
    /// Sets `cx1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cx1(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx1(segment, 0L, value); }
    /// Sets `cx1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx1At(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx1(this.segment(), index, value); return this; }
    /// Sets `cx1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx1(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_cx1(this.segment(), value); return this; }

    /// {@return `cy1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_vertex_type") short get_cy1(MemorySegment segment, long index) { return (short) VH_cy1.get(segment, 0L, index); }
    /// {@return `cy1`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_vertex_type") short get_cy1(MemorySegment segment) { return STBTTVertex.get_cy1(segment, 0L); }
    /// {@return `cy1` at the given index}
    /// @param index the index
    public @CType("stbtt_vertex_type") short cy1At(long index) { return STBTTVertex.get_cy1(this.segment(), index); }
    /// {@return `cy1`}
    public @CType("stbtt_vertex_type") short cy1() { return STBTTVertex.get_cy1(this.segment()); }
    /// Sets `cy1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cy1(MemorySegment segment, long index, @CType("stbtt_vertex_type") short value) { VH_cy1.set(segment, 0L, index, value); }
    /// Sets `cy1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cy1(MemorySegment segment, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy1(segment, 0L, value); }
    /// Sets `cy1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy1At(long index, @CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy1(this.segment(), index, value); return this; }
    /// Sets `cy1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy1(@CType("stbtt_vertex_type") short value) { STBTTVertex.set_cy1(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char") byte get_type(MemorySegment segment, long index) { return (byte) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char") byte get_type(MemorySegment segment) { return STBTTVertex.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte typeAt(long index) { return STBTTVertex.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("unsigned char") byte type() { return STBTTVertex.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("unsigned char") byte value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("unsigned char") byte value) { STBTTVertex.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex typeAt(long index, @CType("unsigned char") byte value) { STBTTVertex.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex type(@CType("unsigned char") byte value) { STBTTVertex.set_type(this.segment(), value); return this; }

    /// {@return `padding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char") byte get_padding(MemorySegment segment, long index) { return (byte) VH_padding.get(segment, 0L, index); }
    /// {@return `padding`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char") byte get_padding(MemorySegment segment) { return STBTTVertex.get_padding(segment, 0L); }
    /// {@return `padding` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte paddingAt(long index) { return STBTTVertex.get_padding(this.segment(), index); }
    /// {@return `padding`}
    public @CType("unsigned char") byte padding() { return STBTTVertex.get_padding(this.segment()); }
    /// Sets `padding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_padding(MemorySegment segment, long index, @CType("unsigned char") byte value) { VH_padding.set(segment, 0L, index, value); }
    /// Sets `padding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_padding(MemorySegment segment, @CType("unsigned char") byte value) { STBTTVertex.set_padding(segment, 0L, value); }
    /// Sets `padding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTVertex paddingAt(long index, @CType("unsigned char") byte value) { STBTTVertex.set_padding(this.segment(), index, value); return this; }
    /// Sets `padding` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex padding(@CType("unsigned char") byte value) { STBTTVertex.set_padding(this.segment(), value); return this; }

}
