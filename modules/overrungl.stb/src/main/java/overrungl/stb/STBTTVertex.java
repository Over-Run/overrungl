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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBTTVertex {
///     (short) stbtt_vertex_type x;
///     (short) stbtt_vertex_type y;
///     (short) stbtt_vertex_type cx;
///     (short) stbtt_vertex_type cy;
///     (short) stbtt_vertex_type cx1;
///     (short) stbtt_vertex_type cy1;
///     unsigned char type;
///     unsigned char padding;
/// };
/// ```
public sealed class STBTTVertex extends GroupType {
    /// The struct layout of `STBTTVertex`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("x"),
        ValueLayout.JAVA_SHORT.withName("y"),
        ValueLayout.JAVA_SHORT.withName("cx"),
        ValueLayout.JAVA_SHORT.withName("cy"),
        ValueLayout.JAVA_SHORT.withName("cx1"),
        ValueLayout.JAVA_SHORT.withName("cy1"),
        ValueLayout.JAVA_BYTE.withName("type"),
        ValueLayout.JAVA_BYTE.withName("padding")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The byte offset of `cx`.
    public static final long OFFSET_cx = LAYOUT.byteOffset(PathElement.groupElement("cx"));
    /// The memory layout of `cx`.
    public static final MemoryLayout LAYOUT_cx = LAYOUT.select(PathElement.groupElement("cx"));
    /// The [VarHandle] of `cx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cx"));
    /// The byte offset of `cy`.
    public static final long OFFSET_cy = LAYOUT.byteOffset(PathElement.groupElement("cy"));
    /// The memory layout of `cy`.
    public static final MemoryLayout LAYOUT_cy = LAYOUT.select(PathElement.groupElement("cy"));
    /// The [VarHandle] of `cy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cy"));
    /// The byte offset of `cx1`.
    public static final long OFFSET_cx1 = LAYOUT.byteOffset(PathElement.groupElement("cx1"));
    /// The memory layout of `cx1`.
    public static final MemoryLayout LAYOUT_cx1 = LAYOUT.select(PathElement.groupElement("cx1"));
    /// The [VarHandle] of `cx1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cx1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cx1"));
    /// The byte offset of `cy1`.
    public static final long OFFSET_cy1 = LAYOUT.byteOffset(PathElement.groupElement("cy1"));
    /// The memory layout of `cy1`.
    public static final MemoryLayout LAYOUT_cy1 = LAYOUT.select(PathElement.groupElement("cy1"));
    /// The [VarHandle] of `cy1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cy1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cy1"));
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `padding`.
    public static final long OFFSET_padding = LAYOUT.byteOffset(PathElement.groupElement("padding"));
    /// The memory layout of `padding`.
    public static final MemoryLayout LAYOUT_padding = LAYOUT.select(PathElement.groupElement("padding"));
    /// The [VarHandle] of `padding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_padding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("padding"));

    /// Creates `STBTTVertex` with the given segment.
    /// @param segment the memory segment
    public STBTTVertex(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTTVertex` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTVertex` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTVertex ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTVertex(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTVertex` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBTTVertex` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTVertex`
    public static STBTTVertex alloc(SegmentAllocator allocator) { return new STBTTVertex(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTVertex` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTVertex`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTVertex copyFrom(STBTTVertex src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short x(MemorySegment segment, long index) { return (short) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public short x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, short value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex x(short value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short y(MemorySegment segment, long index) { return (short) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public short y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, short value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex y(short value) { y(this.segment(), 0L, value); return this; }

    /// {@return `cx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cx(MemorySegment segment, long index) { return (short) VH_cx.get(segment, 0L, index); }
    /// {@return `cx`}
    public short cx() { return cx(this.segment(), 0L); }
    /// Sets `cx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cx(MemorySegment segment, long index, short value) { VH_cx.set(segment, 0L, index, value); }
    /// Sets `cx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx(short value) { cx(this.segment(), 0L, value); return this; }

    /// {@return `cy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cy(MemorySegment segment, long index) { return (short) VH_cy.get(segment, 0L, index); }
    /// {@return `cy`}
    public short cy() { return cy(this.segment(), 0L); }
    /// Sets `cy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cy(MemorySegment segment, long index, short value) { VH_cy.set(segment, 0L, index, value); }
    /// Sets `cy` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy(short value) { cy(this.segment(), 0L, value); return this; }

    /// {@return `cx1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cx1(MemorySegment segment, long index) { return (short) VH_cx1.get(segment, 0L, index); }
    /// {@return `cx1`}
    public short cx1() { return cx1(this.segment(), 0L); }
    /// Sets `cx1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cx1(MemorySegment segment, long index, short value) { VH_cx1.set(segment, 0L, index, value); }
    /// Sets `cx1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cx1(short value) { cx1(this.segment(), 0L, value); return this; }

    /// {@return `cy1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cy1(MemorySegment segment, long index) { return (short) VH_cy1.get(segment, 0L, index); }
    /// {@return `cy1`}
    public short cy1() { return cy1(this.segment(), 0L); }
    /// Sets `cy1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cy1(MemorySegment segment, long index, short value) { VH_cy1.set(segment, 0L, index, value); }
    /// Sets `cy1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex cy1(short value) { cy1(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte type(MemorySegment segment, long index) { return (byte) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public byte type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, byte value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex type(byte value) { type(this.segment(), 0L, value); return this; }

    /// {@return `padding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte padding(MemorySegment segment, long index) { return (byte) VH_padding.get(segment, 0L, index); }
    /// {@return `padding`}
    public byte padding() { return padding(this.segment(), 0L); }
    /// Sets `padding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void padding(MemorySegment segment, long index, byte value) { VH_padding.set(segment, 0L, index, value); }
    /// Sets `padding` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTVertex padding(byte value) { padding(this.segment(), 0L, value); return this; }

    /// A buffer of [STBTTVertex].
    public static final class Buffer extends STBTTVertex {
        private final long elementCount;

        /// Creates `STBTTVertex.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBTTVertex`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBTTVertex`
        public STBTTVertex asSlice(long index) { return new STBTTVertex(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBTTVertex`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBTTVertex`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `x` at the given index}
        /// @param index the index of the struct buffer
        public short xAt(long index) { return x(this.segment(), index); }
        /// Sets `x` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer xAt(long index, short value) { x(this.segment(), index, value); return this; }

        /// {@return `y` at the given index}
        /// @param index the index of the struct buffer
        public short yAt(long index) { return y(this.segment(), index); }
        /// Sets `y` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer yAt(long index, short value) { y(this.segment(), index, value); return this; }

        /// {@return `cx` at the given index}
        /// @param index the index of the struct buffer
        public short cxAt(long index) { return cx(this.segment(), index); }
        /// Sets `cx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cxAt(long index, short value) { cx(this.segment(), index, value); return this; }

        /// {@return `cy` at the given index}
        /// @param index the index of the struct buffer
        public short cyAt(long index) { return cy(this.segment(), index); }
        /// Sets `cy` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cyAt(long index, short value) { cy(this.segment(), index, value); return this; }

        /// {@return `cx1` at the given index}
        /// @param index the index of the struct buffer
        public short cx1At(long index) { return cx1(this.segment(), index); }
        /// Sets `cx1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cx1At(long index, short value) { cx1(this.segment(), index, value); return this; }

        /// {@return `cy1` at the given index}
        /// @param index the index of the struct buffer
        public short cy1At(long index) { return cy1(this.segment(), index); }
        /// Sets `cy1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cy1At(long index, short value) { cy1(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public byte typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, byte value) { type(this.segment(), index, value); return this; }

        /// {@return `padding` at the given index}
        /// @param index the index of the struct buffer
        public byte paddingAt(long index) { return padding(this.segment(), index); }
        /// Sets `padding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer paddingAt(long index, byte value) { padding(this.segment(), index, value); return this; }

    }
}
