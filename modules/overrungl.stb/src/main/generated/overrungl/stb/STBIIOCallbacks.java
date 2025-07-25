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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBIIOCallbacks {
///     (int (*STBIIORead)(void* user, char* data, int size)) stbi_io_callbacks$read read;
///     (void (*STBIIOSkip)(void* user, int n)) stbi_io_callbacks$skip skip;
///     ((int) STBbool (*STBIIOEof)(void* user)) stbi_io_callbacks$eof eof;
/// };
/// ```
public final class STBIIOCallbacks extends GroupType {
    /// The struct layout of `STBIIOCallbacks`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("skip"),
        ValueLayout.ADDRESS.withName("eof")
    );
    /// The byte offset of `read`.
    public static final long OFFSET_read = LAYOUT.byteOffset(PathElement.groupElement("read"));
    /// The memory layout of `read`.
    public static final MemoryLayout LAYOUT_read = LAYOUT.select(PathElement.groupElement("read"));
    /// The [VarHandle] of `read` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_read = LAYOUT.arrayElementVarHandle(PathElement.groupElement("read"));
    /// The byte offset of `skip`.
    public static final long OFFSET_skip = LAYOUT.byteOffset(PathElement.groupElement("skip"));
    /// The memory layout of `skip`.
    public static final MemoryLayout LAYOUT_skip = LAYOUT.select(PathElement.groupElement("skip"));
    /// The [VarHandle] of `skip` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_skip = LAYOUT.arrayElementVarHandle(PathElement.groupElement("skip"));
    /// The byte offset of `eof`.
    public static final long OFFSET_eof = LAYOUT.byteOffset(PathElement.groupElement("eof"));
    /// The memory layout of `eof`.
    public static final MemoryLayout LAYOUT_eof = LAYOUT.select(PathElement.groupElement("eof"));
    /// The [VarHandle] of `eof` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_eof = LAYOUT.arrayElementVarHandle(PathElement.groupElement("eof"));

    /// Creates `STBIIOCallbacks` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBIIOCallbacks(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBIIOCallbacks` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBIIOCallbacks(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBIIOCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBIIOCallbacks(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBIIOCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBIIOCallbacks(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks alloc(SegmentAllocator allocator) { return new STBIIOCallbacks(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks alloc(SegmentAllocator allocator, long count) { return new STBIIOCallbacks(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param read `read`
    /// @param skip `skip`
    /// @param eof `eof`
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks allocInit(SegmentAllocator allocator, MemorySegment read, MemorySegment skip, MemorySegment eof) {
        return alloc(allocator).read(read).skip(skip).eof(eof);
    }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param read `read`
    /// @param skip `skip`
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks allocInit(SegmentAllocator allocator, MemorySegment read, MemorySegment skip) {
        return alloc(allocator).read(read).skip(skip);
    }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param read `read`
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks allocInit(SegmentAllocator allocator, MemorySegment read) {
        return alloc(allocator).read(read);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBIIOCallbacks copyFrom(STBIIOCallbacks src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBIIOCallbacks reinterpret(long count) { return new STBIIOCallbacks(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `read` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment read(MemorySegment segment, long index) { return (MemorySegment) VH_read.get(segment, 0L, index); }
    /// {@return `read`}
    public MemorySegment read() { return read(this.segment(), 0L); }
    /// Sets `read` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void read(MemorySegment segment, long index, MemorySegment value) { VH_read.set(segment, 0L, index, value); }
    /// Sets `read` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks read(MemorySegment value) { read(this.segment(), 0L, value); return this; }

    /// {@return `skip` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment skip(MemorySegment segment, long index) { return (MemorySegment) VH_skip.get(segment, 0L, index); }
    /// {@return `skip`}
    public MemorySegment skip() { return skip(this.segment(), 0L); }
    /// Sets `skip` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void skip(MemorySegment segment, long index, MemorySegment value) { VH_skip.set(segment, 0L, index, value); }
    /// Sets `skip` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks skip(MemorySegment value) { skip(this.segment(), 0L, value); return this; }

    /// {@return `eof` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment eof(MemorySegment segment, long index) { return (MemorySegment) VH_eof.get(segment, 0L, index); }
    /// {@return `eof`}
    public MemorySegment eof() { return eof(this.segment(), 0L); }
    /// Sets `eof` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void eof(MemorySegment segment, long index, MemorySegment value) { VH_eof.set(segment, 0L, index, value); }
    /// Sets `eof` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks eof(MemorySegment value) { eof(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBIIOCallbacks`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBIIOCallbacks`
    public STBIIOCallbacks asSlice(long index) { return new STBIIOCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBIIOCallbacks`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBIIOCallbacks`
    public STBIIOCallbacks asSlice(long index, long count) { return new STBIIOCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBIIOCallbacks` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBIIOCallbacks at(long index, Consumer<STBIIOCallbacks> func) { func.accept(asSlice(index)); return this; }

    /// {@return `read` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment readAt(long index) { return read(this.segment(), index); }
    /// Sets `read` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks readAt(long index, MemorySegment value) { read(this.segment(), index, value); return this; }

    /// {@return `skip` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment skipAt(long index) { return skip(this.segment(), index); }
    /// Sets `skip` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks skipAt(long index, MemorySegment value) { skip(this.segment(), index, value); return this; }

    /// {@return `eof` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment eofAt(long index) { return eof(this.segment(), index); }
    /// Sets `eof` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks eofAt(long index, MemorySegment value) { eof(this.segment(), index, value); return this; }

}
