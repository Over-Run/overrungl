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
/// ### vendor
/// [VarHandle][#VH_vendor] - [Getter][#vendor()] - [Setter][#vendor(java.lang.foreign.MemorySegment)]
/// ### comment_list_length
/// [VarHandle][#VH_comment_list_length] - [Getter][#comment_list_length()] - [Setter][#comment_list_length(int)]
/// ### comment_list
/// [VarHandle][#VH_comment_list] - [Getter][#comment_list()] - [Setter][#comment_list(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stb_vorbis_comment {
///     char * vendor;
///     int comment_list_length;
///     char ** comment_list;
/// } STBVorbisComment;
/// ```
public final class STBVorbisComment extends Struct {
    /// The struct layout of `stb_vorbis_comment`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        Unmarshal.STR_LAYOUT.withName("vendor"),
        ValueLayout.JAVA_INT.withName("comment_list_length"),
        ValueLayout.ADDRESS.withName("comment_list")
    );
    /// The [VarHandle] of `vendor` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_vendor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendor"));
    /// The [VarHandle] of `comment_list_length` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_comment_list_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("comment_list_length"));
    /// The [VarHandle] of `comment_list` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_comment_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("comment_list"));

    /// Creates `STBVorbisComment` with the given segment.
    /// @param segment the memory segment
    public STBVorbisComment(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBVorbisComment` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisComment of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBVorbisComment(segment); }

    /// Allocates a `STBVorbisComment` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisComment`
    public static STBVorbisComment alloc(SegmentAllocator allocator) { return new STBVorbisComment(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBVorbisComment` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisComment`
    public static STBVorbisComment alloc(SegmentAllocator allocator, long count) { return new STBVorbisComment(allocator.allocate(LAYOUT, count)); }

    /// {@return `vendor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char *") java.lang.foreign.MemorySegment get_vendor(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_vendor.get(segment, 0L, index); }
    /// {@return `vendor`}
    /// @param segment the segment of the struct
    public static @CType("char *") java.lang.foreign.MemorySegment get_vendor(MemorySegment segment) { return STBVorbisComment.get_vendor(segment, 0L); }
    /// {@return `vendor` at the given index}
    /// @param index the index
    public @CType("char *") java.lang.foreign.MemorySegment vendorAt(long index) { return STBVorbisComment.get_vendor(this.segment(), index); }
    /// {@return `vendor`}
    public @CType("char *") java.lang.foreign.MemorySegment vendor() { return STBVorbisComment.get_vendor(this.segment()); }
    /// Sets `vendor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendor(MemorySegment segment, long index, @CType("char *") java.lang.foreign.MemorySegment value) { VH_vendor.set(segment, 0L, index, value); }
    /// Sets `vendor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendor(MemorySegment segment, @CType("char *") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_vendor(segment, 0L, value); }
    /// Sets `vendor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBVorbisComment vendorAt(long index, @CType("char *") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_vendor(this.segment(), index, value); return this; }
    /// Sets `vendor` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment vendor(@CType("char *") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_vendor(this.segment(), value); return this; }

    /// {@return `comment_list_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_comment_list_length(MemorySegment segment, long index) { return (int) VH_comment_list_length.get(segment, 0L, index); }
    /// {@return `comment_list_length`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_comment_list_length(MemorySegment segment) { return STBVorbisComment.get_comment_list_length(segment, 0L); }
    /// {@return `comment_list_length` at the given index}
    /// @param index the index
    public @CType("int") int comment_list_lengthAt(long index) { return STBVorbisComment.get_comment_list_length(this.segment(), index); }
    /// {@return `comment_list_length`}
    public @CType("int") int comment_list_length() { return STBVorbisComment.get_comment_list_length(this.segment()); }
    /// Sets `comment_list_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_comment_list_length(MemorySegment segment, long index, @CType("int") int value) { VH_comment_list_length.set(segment, 0L, index, value); }
    /// Sets `comment_list_length` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_comment_list_length(MemorySegment segment, @CType("int") int value) { STBVorbisComment.set_comment_list_length(segment, 0L, value); }
    /// Sets `comment_list_length` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_list_lengthAt(long index, @CType("int") int value) { STBVorbisComment.set_comment_list_length(this.segment(), index, value); return this; }
    /// Sets `comment_list_length` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_list_length(@CType("int") int value) { STBVorbisComment.set_comment_list_length(this.segment(), value); return this; }

    /// {@return `comment_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char **") java.lang.foreign.MemorySegment get_comment_list(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_comment_list.get(segment, 0L, index); }
    /// {@return `comment_list`}
    /// @param segment the segment of the struct
    public static @CType("char **") java.lang.foreign.MemorySegment get_comment_list(MemorySegment segment) { return STBVorbisComment.get_comment_list(segment, 0L); }
    /// {@return `comment_list` at the given index}
    /// @param index the index
    public @CType("char **") java.lang.foreign.MemorySegment comment_listAt(long index) { return STBVorbisComment.get_comment_list(this.segment(), index); }
    /// {@return `comment_list`}
    public @CType("char **") java.lang.foreign.MemorySegment comment_list() { return STBVorbisComment.get_comment_list(this.segment()); }
    /// Sets `comment_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_comment_list(MemorySegment segment, long index, @CType("char **") java.lang.foreign.MemorySegment value) { VH_comment_list.set(segment, 0L, index, value); }
    /// Sets `comment_list` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_comment_list(MemorySegment segment, @CType("char **") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_comment_list(segment, 0L, value); }
    /// Sets `comment_list` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_listAt(long index, @CType("char **") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_comment_list(this.segment(), index, value); return this; }
    /// Sets `comment_list` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisComment comment_list(@CType("char **") java.lang.foreign.MemorySegment value) { STBVorbisComment.set_comment_list(this.segment(), value); return this; }

}
