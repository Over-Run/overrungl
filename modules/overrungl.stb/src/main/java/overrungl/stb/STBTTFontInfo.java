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
/// ### userdata
/// ### data
/// ### fontstart
/// ### numGlyphs
/// ### loca
/// ### head
/// ### glyf
/// ### hhea
/// ### hmtx
/// ### kern
/// ### gpos
/// ### svg
/// ### index_map
/// ### indexToLocFormat
/// ### cff
/// ### charstrings
/// ### gsubrs
/// ### subrs
/// ### fontdicts
/// ### fdselect
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt_fontinfo {
///     void* userdata;
///     unsigned char * data;
///     int fontstart;
///     int numGlyphs;
///     int loca;
///     int head;
///     int glyf;
///     int hhea;
///     int hmtx;
///     int kern;
///     int gpos;
///     int svg;
///     int index_map;
///     int indexToLocFormat;
///     stbtt__buf cff;
///     stbtt__buf charstrings;
///     stbtt__buf gsubrs;
///     stbtt__buf subrs;
///     stbtt__buf fontdicts;
///     stbtt__buf fdselect;
/// } STBTTFontInfo;
/// ```
public final class STBTTFontInfo extends Struct {
    /// The struct layout of `stbtt_fontinfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("userdata"),
        ValueLayout.ADDRESS.withName("data"),
        ValueLayout.JAVA_INT.withName("fontstart"),
        ValueLayout.JAVA_INT.withName("numGlyphs"),
        ValueLayout.JAVA_INT.withName("loca"),
        ValueLayout.JAVA_INT.withName("head"),
        ValueLayout.JAVA_INT.withName("glyf"),
        ValueLayout.JAVA_INT.withName("hhea"),
        ValueLayout.JAVA_INT.withName("hmtx"),
        ValueLayout.JAVA_INT.withName("kern"),
        ValueLayout.JAVA_INT.withName("gpos"),
        ValueLayout.JAVA_INT.withName("svg"),
        ValueLayout.JAVA_INT.withName("index_map"),
        ValueLayout.JAVA_INT.withName("indexToLocFormat"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("cff"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("charstrings"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("gsubrs"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("subrs"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("fontdicts"),
        overrungl.stb.STBTT__buf.LAYOUT.withName("fdselect")
    );

    /// Creates `STBTTFontInfo` with the given segment.
    /// @param segment the memory segment
    public STBTTFontInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTTFontInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTFontInfo(segment); }

    /// Creates `STBTTFontInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTFontInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTFontInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBTTFontInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBTTFontInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTFontInfo`
    public static STBTTFontInfo alloc(SegmentAllocator allocator) { return new STBTTFontInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTFontInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTFontInfo`
    public static STBTTFontInfo alloc(SegmentAllocator allocator, long count) { return new STBTTFontInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBTTFontInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTFontInfo`
    public STBTTFontInfo asSlice(long index) { return new STBTTFontInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBTTFontInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTFontInfo`
    public STBTTFontInfo asSlice(long index, long count) { return new STBTTFontInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

}
