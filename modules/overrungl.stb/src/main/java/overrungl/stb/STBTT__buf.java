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
/// struct STBTT__buf {
///     unsigned char* data;
///     int cursor;
///     int size;
/// };
/// ```
public sealed class STBTT__buf extends GroupType {
    /// The struct layout of `STBTT__buf`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("data"),
        ValueLayout.JAVA_INT.withName("cursor"),
        ValueLayout.JAVA_INT.withName("size")
    );
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The [VarHandle] of `data` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"));
    /// The byte offset of `cursor`.
    public static final long OFFSET_cursor = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
    /// The memory layout of `cursor`.
    public static final MemoryLayout LAYOUT_cursor = LAYOUT.select(PathElement.groupElement("cursor"));
    /// The [VarHandle] of `cursor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cursor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cursor"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `STBTT__buf` with the given segment.
    /// @param segment the memory segment
    public STBTT__buf(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTT__buf` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTT__buf` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__buf ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTT__buf(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `STBTT__buf` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTT__buf` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTT__buf`
    public static STBTT__buf alloc(SegmentAllocator allocator) { return new STBTT__buf(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTT__buf` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTT__buf`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTT__buf copyFrom(STBTT__buf src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return (MemorySegment) VH_data.get(segment, 0L, index); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { VH_data.set(segment, 0L, index, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__buf data(MemorySegment value) { data(this.segment(), 0L, value); return this; }

    /// {@return `cursor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cursor(MemorySegment segment, long index) { return (int) VH_cursor.get(segment, 0L, index); }
    /// {@return `cursor`}
    public int cursor() { return cursor(this.segment(), 0L); }
    /// Sets `cursor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cursor(MemorySegment segment, long index, int value) { VH_cursor.set(segment, 0L, index, value); }
    /// Sets `cursor` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__buf cursor(int value) { cursor(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__buf size(int value) { size(this.segment(), 0L, value); return this; }

    /// A buffer of [STBTT__buf].
    public static final class Buffer extends STBTT__buf {
        private final long elementCount;

        /// Creates `STBTT__buf.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBTT__buf`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBTT__buf`
        public STBTT__buf asSlice(long index) { return new STBTT__buf(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBTT__buf`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBTT__buf`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `data` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dataAt(long index) { return data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }

        /// {@return `cursor` at the given index}
        /// @param index the index of the struct buffer
        public int cursorAt(long index) { return cursor(this.segment(), index); }
        /// Sets `cursor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cursorAt(long index, int value) { cursor(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public int sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

    }
}
