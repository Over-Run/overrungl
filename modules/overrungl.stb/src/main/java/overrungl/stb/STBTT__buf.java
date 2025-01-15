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
/// ### data
/// ### cursor
/// ### size
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt__buf {
///     unsigned char * data;
///     int cursor;
///     int size;
/// } STBTT__buf;
/// ```
public sealed class STBTT__buf extends Struct {
    /// The struct layout of `stbtt__buf`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("data"),
        ValueLayout.JAVA_INT.withName("cursor"),
        ValueLayout.JAVA_INT.withName("size")
    );

    /// Creates `STBTT__buf` with the given segment.
    /// @param segment the memory segment
    public STBTT__buf(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTT__buf` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__buf of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTT__buf(segment); }

    /// Creates `STBTT__buf` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTT__buf` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__buf ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTT__buf(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTT__buf` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

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
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

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

    }
}
