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
/// struct STBVorbisAlloc {
///     char* alloc_buffer;
///     int alloc_buffer_length_in_bytes;
/// };
/// ```
public sealed class STBVorbisAlloc extends GroupType {
    /// The struct layout of `STBVorbisAlloc`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("alloc_buffer"),
        ValueLayout.JAVA_INT.withName("alloc_buffer_length_in_bytes")
    );
    /// The byte offset of `alloc_buffer`.
    public static final long OFFSET_alloc_buffer = LAYOUT.byteOffset(PathElement.groupElement("alloc_buffer"));
    /// The memory layout of `alloc_buffer`.
    public static final MemoryLayout LAYOUT_alloc_buffer = LAYOUT.select(PathElement.groupElement("alloc_buffer"));
    /// The [VarHandle] of `alloc_buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alloc_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alloc_buffer"));
    /// The byte offset of `alloc_buffer_length_in_bytes`.
    public static final long OFFSET_alloc_buffer_length_in_bytes = LAYOUT.byteOffset(PathElement.groupElement("alloc_buffer_length_in_bytes"));
    /// The memory layout of `alloc_buffer_length_in_bytes`.
    public static final MemoryLayout LAYOUT_alloc_buffer_length_in_bytes = LAYOUT.select(PathElement.groupElement("alloc_buffer_length_in_bytes"));
    /// The [VarHandle] of `alloc_buffer_length_in_bytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alloc_buffer_length_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alloc_buffer_length_in_bytes"));

    /// Creates `STBVorbisAlloc` with the given segment.
    /// @param segment the memory segment
    public STBVorbisAlloc(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBVorbisAlloc` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBVorbisAlloc` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisAlloc ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBVorbisAlloc(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `STBVorbisAlloc` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBVorbisAlloc` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisAlloc`
    public static STBVorbisAlloc alloc(SegmentAllocator allocator) { return new STBVorbisAlloc(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBVorbisAlloc` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisAlloc`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBVorbisAlloc copyFrom(STBVorbisAlloc src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `alloc_buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment alloc_buffer(MemorySegment segment, long index) { return (MemorySegment) VH_alloc_buffer.get(segment, 0L, index); }
    /// {@return `alloc_buffer`}
    public MemorySegment alloc_buffer() { return alloc_buffer(this.segment(), 0L); }
    /// Sets `alloc_buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alloc_buffer(MemorySegment segment, long index, MemorySegment value) { VH_alloc_buffer.set(segment, 0L, index, value); }
    /// Sets `alloc_buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisAlloc alloc_buffer(MemorySegment value) { alloc_buffer(this.segment(), 0L, value); return this; }

    /// {@return `alloc_buffer_length_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alloc_buffer_length_in_bytes(MemorySegment segment, long index) { return (int) VH_alloc_buffer_length_in_bytes.get(segment, 0L, index); }
    /// {@return `alloc_buffer_length_in_bytes`}
    public int alloc_buffer_length_in_bytes() { return alloc_buffer_length_in_bytes(this.segment(), 0L); }
    /// Sets `alloc_buffer_length_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alloc_buffer_length_in_bytes(MemorySegment segment, long index, int value) { VH_alloc_buffer_length_in_bytes.set(segment, 0L, index, value); }
    /// Sets `alloc_buffer_length_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisAlloc alloc_buffer_length_in_bytes(int value) { alloc_buffer_length_in_bytes(this.segment(), 0L, value); return this; }

    /// A buffer of [STBVorbisAlloc].
    public static final class Buffer extends STBVorbisAlloc {
        private final long elementCount;

        /// Creates `STBVorbisAlloc.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBVorbisAlloc`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBVorbisAlloc`
        public STBVorbisAlloc asSlice(long index) { return new STBVorbisAlloc(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBVorbisAlloc`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBVorbisAlloc`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `alloc_buffer` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment alloc_bufferAt(long index) { return alloc_buffer(this.segment(), index); }
        /// Sets `alloc_buffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alloc_bufferAt(long index, MemorySegment value) { alloc_buffer(this.segment(), index, value); return this; }

        /// {@return `alloc_buffer_length_in_bytes` at the given index}
        /// @param index the index of the struct buffer
        public int alloc_buffer_length_in_bytesAt(long index) { return alloc_buffer_length_in_bytes(this.segment(), index); }
        /// Sets `alloc_buffer_length_in_bytes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alloc_buffer_length_in_bytesAt(long index, int value) { alloc_buffer_length_in_bytes(this.segment(), index, value); return this; }

    }
}
