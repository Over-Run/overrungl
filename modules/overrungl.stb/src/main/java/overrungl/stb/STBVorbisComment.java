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
/// struct STBVorbisComment {
///     char* vendor;
///     int comment_list_length;
///     char** comment_list;
/// };
/// ```
public sealed class STBVorbisComment extends GroupType {
    /// The struct layout of `STBVorbisComment`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("vendor"),
        ValueLayout.JAVA_INT.withName("comment_list_length"),
        ValueLayout.ADDRESS.withName("comment_list")
    );
    /// The byte offset of `vendor`.
    public static final long OFFSET_vendor = LAYOUT.byteOffset(PathElement.groupElement("vendor"));
    /// The memory layout of `vendor`.
    public static final MemoryLayout LAYOUT_vendor = LAYOUT.select(PathElement.groupElement("vendor"));
    /// The [VarHandle] of `vendor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendor"));
    /// The byte offset of `comment_list_length`.
    public static final long OFFSET_comment_list_length = LAYOUT.byteOffset(PathElement.groupElement("comment_list_length"));
    /// The memory layout of `comment_list_length`.
    public static final MemoryLayout LAYOUT_comment_list_length = LAYOUT.select(PathElement.groupElement("comment_list_length"));
    /// The [VarHandle] of `comment_list_length` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_comment_list_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("comment_list_length"));
    /// The byte offset of `comment_list`.
    public static final long OFFSET_comment_list = LAYOUT.byteOffset(PathElement.groupElement("comment_list"));
    /// The memory layout of `comment_list`.
    public static final MemoryLayout LAYOUT_comment_list = LAYOUT.select(PathElement.groupElement("comment_list"));
    /// The [VarHandle] of `comment_list` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_comment_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("comment_list"));

    /// Creates `STBVorbisComment` with the given segment.
    /// @param segment the memory segment
    public STBVorbisComment(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBVorbisComment` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBVorbisComment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisComment ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBVorbisComment(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `STBVorbisComment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBVorbisComment` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisComment`
    public static STBVorbisComment alloc(SegmentAllocator allocator) { return new STBVorbisComment(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBVorbisComment` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisComment`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBVorbisComment copyFrom(STBVorbisComment src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `vendor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vendor(MemorySegment segment, long index) { return (MemorySegment) VH_vendor.get(segment, 0L, index); }
    /// {@return `vendor`}
    public MemorySegment vendor() { return vendor(this.segment(), 0L); }
    /// Sets `vendor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendor(MemorySegment segment, long index, MemorySegment value) { VH_vendor.set(segment, 0L, index, value); }
    /// Sets `vendor` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment vendor(MemorySegment value) { vendor(this.segment(), 0L, value); return this; }

    /// {@return `comment_list_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int comment_list_length(MemorySegment segment, long index) { return (int) VH_comment_list_length.get(segment, 0L, index); }
    /// {@return `comment_list_length`}
    public int comment_list_length() { return comment_list_length(this.segment(), 0L); }
    /// Sets `comment_list_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void comment_list_length(MemorySegment segment, long index, int value) { VH_comment_list_length.set(segment, 0L, index, value); }
    /// Sets `comment_list_length` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_list_length(int value) { comment_list_length(this.segment(), 0L, value); return this; }

    /// {@return `comment_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment comment_list(MemorySegment segment, long index) { return (MemorySegment) VH_comment_list.get(segment, 0L, index); }
    /// {@return `comment_list`}
    public MemorySegment comment_list() { return comment_list(this.segment(), 0L); }
    /// Sets `comment_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void comment_list(MemorySegment segment, long index, MemorySegment value) { VH_comment_list.set(segment, 0L, index, value); }
    /// Sets `comment_list` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_list(MemorySegment value) { comment_list(this.segment(), 0L, value); return this; }

    /// A buffer of [STBVorbisComment].
    public static final class Buffer extends STBVorbisComment {
        private final long elementCount;

        /// Creates `STBVorbisComment.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBVorbisComment`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBVorbisComment`
        public STBVorbisComment asSlice(long index) { return new STBVorbisComment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBVorbisComment`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBVorbisComment`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `vendor` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment vendorAt(long index) { return vendor(this.segment(), index); }
        /// Sets `vendor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorAt(long index, MemorySegment value) { vendor(this.segment(), index, value); return this; }

        /// {@return `comment_list_length` at the given index}
        /// @param index the index of the struct buffer
        public int comment_list_lengthAt(long index) { return comment_list_length(this.segment(), index); }
        /// Sets `comment_list_length` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer comment_list_lengthAt(long index, int value) { comment_list_length(this.segment(), index, value); return this; }

        /// {@return `comment_list` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment comment_listAt(long index) { return comment_list(this.segment(), index); }
        /// Sets `comment_list` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer comment_listAt(long index, MemorySegment value) { comment_list(this.segment(), index, value); return this; }

    }
}
