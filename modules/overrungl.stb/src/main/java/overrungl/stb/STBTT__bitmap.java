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
/// ### w
/// ### h
/// ### stride
/// ### pixels
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt__bitmap {
///     int w;
///     int h;
///     int stride;
///     unsigned char * pixels;
/// } STBTT__bitmap;
/// ```
public final class STBTT__bitmap extends Struct {
    /// The struct layout of `stbtt__bitmap`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.ADDRESS.withName("pixels")
    );

    /// Creates `STBTT__bitmap` with the given segment.
    /// @param segment the memory segment
    public STBTT__bitmap(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTT__bitmap` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTT__bitmap(segment); }

    /// Creates `STBTT__bitmap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTT__bitmap(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTT__bitmap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBTT__bitmap(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBTT__bitmap` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTT__bitmap`
    public static STBTT__bitmap alloc(SegmentAllocator allocator) { return new STBTT__bitmap(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTT__bitmap` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTT__bitmap`
    public static STBTT__bitmap alloc(SegmentAllocator allocator, long count) { return new STBTT__bitmap(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBTT__bitmap`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTT__bitmap`
    public STBTT__bitmap asSlice(long index) { return new STBTT__bitmap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBTT__bitmap`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTT__bitmap`
    public STBTT__bitmap asSlice(long index, long count) { return new STBTT__bitmap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

}
