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
/// struct STBRPRect {
///     int id;
///     (int) stbrp_coord w;
///     (int) stbrp_coord h;
///     (int) stbrp_coord x;
///     (int) stbrp_coord y;
///     int was_packed;
/// };
/// ```
public sealed class STBRPRect extends GroupType {
    /// The struct layout of `STBRPRect`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("was_packed")
    );
    /// The byte offset of `id`.
    public static final long OFFSET_id = LAYOUT.byteOffset(PathElement.groupElement("id"));
    /// The memory layout of `id`.
    public static final MemoryLayout LAYOUT_id = LAYOUT.select(PathElement.groupElement("id"));
    /// The [VarHandle] of `id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    /// The byte offset of `w`.
    public static final long OFFSET_w = LAYOUT.byteOffset(PathElement.groupElement("w"));
    /// The memory layout of `w`.
    public static final MemoryLayout LAYOUT_w = LAYOUT.select(PathElement.groupElement("w"));
    /// The [VarHandle] of `w` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("w"));
    /// The byte offset of `h`.
    public static final long OFFSET_h = LAYOUT.byteOffset(PathElement.groupElement("h"));
    /// The memory layout of `h`.
    public static final MemoryLayout LAYOUT_h = LAYOUT.select(PathElement.groupElement("h"));
    /// The [VarHandle] of `h` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("h"));
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
    /// The byte offset of `was_packed`.
    public static final long OFFSET_was_packed = LAYOUT.byteOffset(PathElement.groupElement("was_packed"));
    /// The memory layout of `was_packed`.
    public static final MemoryLayout LAYOUT_was_packed = LAYOUT.select(PathElement.groupElement("was_packed"));
    /// The [VarHandle] of `was_packed` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_was_packed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("was_packed"));

    /// Creates `STBRPRect` with the given segment.
    /// @param segment the memory segment
    public STBRPRect(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBRPRect` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPRect ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBRPRect(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `STBRPRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBRPRect` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPRect`
    public static STBRPRect alloc(SegmentAllocator allocator) { return new STBRPRect(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPRect` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPRect`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @param w `w`
    /// @param h `h`
    /// @param x `x`
    /// @param y `y`
    /// @param was_packed `was_packed`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id, int w, int h, int x, int y, int was_packed) {
        return alloc(allocator).id(id).w(w).h(h).x(x).y(y).was_packed(was_packed);
    }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @param w `w`
    /// @param h `h`
    /// @param x `x`
    /// @param y `y`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id, int w, int h, int x, int y) {
        return alloc(allocator).id(id).w(w).h(h).x(x).y(y);
    }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @param w `w`
    /// @param h `h`
    /// @param x `x`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id, int w, int h, int x) {
        return alloc(allocator).id(id).w(w).h(h).x(x);
    }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @param w `w`
    /// @param h `h`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id, int w, int h) {
        return alloc(allocator).id(id).w(w).h(h);
    }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @param w `w`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id, int w) {
        return alloc(allocator).id(id).w(w);
    }

    /// Allocates a `STBRPRect` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param id `id`
    /// @return the allocated `STBRPRect`
    public static STBRPRect allocInit(SegmentAllocator allocator, int id) {
        return alloc(allocator).id(id);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBRPRect copyFrom(STBRPRect src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int id(MemorySegment segment, long index) { return (int) VH_id.get(segment, 0L, index); }
    /// {@return `id`}
    public int id() { return id(this.segment(), 0L); }
    /// Sets `id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void id(MemorySegment segment, long index, int value) { VH_id.set(segment, 0L, index, value); }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect id(int value) { id(this.segment(), 0L, value); return this; }

    /// {@return `w` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int w(MemorySegment segment, long index) { return (int) VH_w.get(segment, 0L, index); }
    /// {@return `w`}
    public int w() { return w(this.segment(), 0L); }
    /// Sets `w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void w(MemorySegment segment, long index, int value) { VH_w.set(segment, 0L, index, value); }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect w(int value) { w(this.segment(), 0L, value); return this; }

    /// {@return `h` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int h(MemorySegment segment, long index) { return (int) VH_h.get(segment, 0L, index); }
    /// {@return `h`}
    public int h() { return h(this.segment(), 0L); }
    /// Sets `h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void h(MemorySegment segment, long index, int value) { VH_h.set(segment, 0L, index, value); }
    /// Sets `h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect h(int value) { h(this.segment(), 0L, value); return this; }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public int x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect x(int value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public int y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect y(int value) { y(this.segment(), 0L, value); return this; }

    /// {@return `was_packed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int was_packed(MemorySegment segment, long index) { return (int) VH_was_packed.get(segment, 0L, index); }
    /// {@return `was_packed`}
    public int was_packed() { return was_packed(this.segment(), 0L); }
    /// Sets `was_packed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void was_packed(MemorySegment segment, long index, int value) { VH_was_packed.set(segment, 0L, index, value); }
    /// Sets `was_packed` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPRect was_packed(int value) { was_packed(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int idAt(long index) { return id(this.segment(), index); }
        /// Sets `id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer idAt(long index, int value) { id(this.segment(), index, value); return this; }

        /// {@return `w` at the given index}
        /// @param index the index of the struct buffer
        public int wAt(long index) { return w(this.segment(), index); }
        /// Sets `w` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer wAt(long index, int value) { w(this.segment(), index, value); return this; }

        /// {@return `h` at the given index}
        /// @param index the index of the struct buffer
        public int hAt(long index) { return h(this.segment(), index); }
        /// Sets `h` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer hAt(long index, int value) { h(this.segment(), index, value); return this; }

        /// {@return `x` at the given index}
        /// @param index the index of the struct buffer
        public int xAt(long index) { return x(this.segment(), index); }
        /// Sets `x` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer xAt(long index, int value) { x(this.segment(), index, value); return this; }

        /// {@return `y` at the given index}
        /// @param index the index of the struct buffer
        public int yAt(long index) { return y(this.segment(), index); }
        /// Sets `y` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer yAt(long index, int value) { y(this.segment(), index, value); return this; }

        /// {@return `was_packed` at the given index}
        /// @param index the index of the struct buffer
        public int was_packedAt(long index) { return was_packed(this.segment(), index); }
        /// Sets `was_packed` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer was_packedAt(long index, int value) { was_packed(this.segment(), index, value); return this; }

    }
}
