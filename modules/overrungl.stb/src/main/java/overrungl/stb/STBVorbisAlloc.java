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
/// ### alloc_buffer
/// [VarHandle][#VH_alloc_buffer] - [Getter][#alloc_buffer()] - [Setter][#alloc_buffer(MemorySegment)]
/// ### alloc_buffer_length_in_bytes
/// [VarHandle][#VH_alloc_buffer_length_in_bytes] - [Getter][#alloc_buffer_length_in_bytes()] - [Setter][#alloc_buffer_length_in_bytes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stb_vorbis_alloc {
///     char * alloc_buffer;
///     int alloc_buffer_length_in_bytes;
/// } STBVorbisAlloc;
/// ```
public sealed class STBVorbisAlloc extends Struct {
    /// The struct layout of `stb_vorbis_alloc`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("alloc_buffer"),
        ValueLayout.JAVA_INT.withName("alloc_buffer_length_in_bytes")
    );
    /// The [VarHandle] of `alloc_buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alloc_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alloc_buffer"));
    /// The [VarHandle] of `alloc_buffer_length_in_bytes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alloc_buffer_length_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alloc_buffer_length_in_bytes"));

    /// Creates `STBVorbisAlloc` with the given segment.
    /// @param segment the memory segment
    public STBVorbisAlloc(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBVorbisAlloc` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisAlloc of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBVorbisAlloc(segment); }

    /// Creates `STBVorbisAlloc` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBVorbisAlloc` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisAlloc ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBVorbisAlloc(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBVorbisAlloc` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBVorbisAlloc` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisAlloc`
    public static STBVorbisAlloc alloc(SegmentAllocator allocator) { return new STBVorbisAlloc(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBVorbisAlloc` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisAlloc`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBVorbisAlloc` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisAlloc`
    public static STBVorbisAlloc allocInit(SegmentAllocator allocator, @CType("char *") MemorySegment alloc_buffer, @CType("int") int alloc_buffer_length_in_bytes) { return alloc(allocator).alloc_buffer(alloc_buffer).alloc_buffer_length_in_bytes(alloc_buffer_length_in_bytes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBVorbisAlloc copyFrom(STBVorbisAlloc src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `alloc_buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char *") MemorySegment get_alloc_buffer(MemorySegment segment, long index) { return (MemorySegment) VH_alloc_buffer.get(segment, 0L, index); }
    /// {@return `alloc_buffer`}
    /// @param segment the segment of the struct
    public static @CType("char *") MemorySegment get_alloc_buffer(MemorySegment segment) { return STBVorbisAlloc.get_alloc_buffer(segment, 0L); }
    /// {@return `alloc_buffer`}
    public @CType("char *") MemorySegment alloc_buffer() { return STBVorbisAlloc.get_alloc_buffer(this.segment()); }
    /// Sets `alloc_buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alloc_buffer(MemorySegment segment, long index, @CType("char *") MemorySegment value) { VH_alloc_buffer.set(segment, 0L, index, value); }
    /// Sets `alloc_buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alloc_buffer(MemorySegment segment, @CType("char *") MemorySegment value) { STBVorbisAlloc.set_alloc_buffer(segment, 0L, value); }
    /// Sets `alloc_buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisAlloc alloc_buffer(@CType("char *") MemorySegment value) { STBVorbisAlloc.set_alloc_buffer(this.segment(), value); return this; }

    /// {@return `alloc_buffer_length_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_alloc_buffer_length_in_bytes(MemorySegment segment, long index) { return (int) VH_alloc_buffer_length_in_bytes.get(segment, 0L, index); }
    /// {@return `alloc_buffer_length_in_bytes`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_alloc_buffer_length_in_bytes(MemorySegment segment) { return STBVorbisAlloc.get_alloc_buffer_length_in_bytes(segment, 0L); }
    /// {@return `alloc_buffer_length_in_bytes`}
    public @CType("int") int alloc_buffer_length_in_bytes() { return STBVorbisAlloc.get_alloc_buffer_length_in_bytes(this.segment()); }
    /// Sets `alloc_buffer_length_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alloc_buffer_length_in_bytes(MemorySegment segment, long index, @CType("int") int value) { VH_alloc_buffer_length_in_bytes.set(segment, 0L, index, value); }
    /// Sets `alloc_buffer_length_in_bytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alloc_buffer_length_in_bytes(MemorySegment segment, @CType("int") int value) { STBVorbisAlloc.set_alloc_buffer_length_in_bytes(segment, 0L, value); }
    /// Sets `alloc_buffer_length_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisAlloc alloc_buffer_length_in_bytes(@CType("int") int value) { STBVorbisAlloc.set_alloc_buffer_length_in_bytes(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("char *") MemorySegment alloc_bufferAt(long index) { return STBVorbisAlloc.get_alloc_buffer(this.segment(), index); }
        /// Sets `alloc_buffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer alloc_bufferAt(long index, @CType("char *") MemorySegment value) { STBVorbisAlloc.set_alloc_buffer(this.segment(), index, value); return this; }

        /// {@return `alloc_buffer_length_in_bytes` at the given index}
        /// @param index the index
        public @CType("int") int alloc_buffer_length_in_bytesAt(long index) { return STBVorbisAlloc.get_alloc_buffer_length_in_bytes(this.segment(), index); }
        /// Sets `alloc_buffer_length_in_bytes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer alloc_buffer_length_in_bytesAt(long index, @CType("int") int value) { STBVorbisAlloc.set_alloc_buffer_length_in_bytes(this.segment(), index, value); return this; }

    }
}
