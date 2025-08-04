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
/// struct STBTTKerningEntry {
///     int glyph1;
///     int glyph2;
///     int advance;
/// };
/// ```
public final class STBTTKerningEntry extends GroupType {
    /// The struct layout of `STBTTKerningEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("glyph1"),
        ValueLayout.JAVA_INT.withName("glyph2"),
        ValueLayout.JAVA_INT.withName("advance")
    );
    /// The byte offset of `glyph1`.
    public static final long OFFSET_glyph1 = LAYOUT.byteOffset(PathElement.groupElement("glyph1"));
    /// The memory layout of `glyph1`.
    public static final MemoryLayout LAYOUT_glyph1 = LAYOUT.select(PathElement.groupElement("glyph1"));
    /// The [VarHandle] of `glyph1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_glyph1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("glyph1"));
    /// The byte offset of `glyph2`.
    public static final long OFFSET_glyph2 = LAYOUT.byteOffset(PathElement.groupElement("glyph2"));
    /// The memory layout of `glyph2`.
    public static final MemoryLayout LAYOUT_glyph2 = LAYOUT.select(PathElement.groupElement("glyph2"));
    /// The [VarHandle] of `glyph2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_glyph2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("glyph2"));
    /// The byte offset of `advance`.
    public static final long OFFSET_advance = LAYOUT.byteOffset(PathElement.groupElement("advance"));
    /// The memory layout of `advance`.
    public static final MemoryLayout LAYOUT_advance = LAYOUT.select(PathElement.groupElement("advance"));
    /// The [VarHandle] of `advance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advance"));

    /// Creates `STBTTKerningEntry` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTTKerningEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTTKerningEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTKerningEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTKerningEntry(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTKerningEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTKerningEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTKerningEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTTKerningEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTKerningEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTKerningEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry alloc(SegmentAllocator allocator) { return new STBTTKerningEntry(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry alloc(SegmentAllocator allocator, long count) { return new STBTTKerningEntry(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTKerningEntry copyFrom(STBTTKerningEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTTKerningEntry reinterpret(long count) { return new STBTTKerningEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `glyph1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int glyph1(MemorySegment segment, long index) { return (int) VH_glyph1.get(segment, 0L, index); }
    /// {@return `glyph1`}
    public int glyph1() { return glyph1(this.segment(), 0L); }
    /// Sets `glyph1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void glyph1(MemorySegment segment, long index, int value) { VH_glyph1.set(segment, 0L, index, value); }
    /// Sets `glyph1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph1(int value) { glyph1(this.segment(), 0L, value); return this; }

    /// {@return `glyph2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int glyph2(MemorySegment segment, long index) { return (int) VH_glyph2.get(segment, 0L, index); }
    /// {@return `glyph2`}
    public int glyph2() { return glyph2(this.segment(), 0L); }
    /// Sets `glyph2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void glyph2(MemorySegment segment, long index, int value) { VH_glyph2.set(segment, 0L, index, value); }
    /// Sets `glyph2` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph2(int value) { glyph2(this.segment(), 0L, value); return this; }

    /// {@return `advance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advance(MemorySegment segment, long index) { return (int) VH_advance.get(segment, 0L, index); }
    /// {@return `advance`}
    public int advance() { return advance(this.segment(), 0L); }
    /// Sets `advance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advance(MemorySegment segment, long index, int value) { VH_advance.set(segment, 0L, index, value); }
    /// Sets `advance` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry advance(int value) { advance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBTTKerningEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTKerningEntry`
    public STBTTKerningEntry asSlice(long index) { return new STBTTKerningEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTTKerningEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTKerningEntry`
    public STBTTKerningEntry asSlice(long index, long count) { return new STBTTKerningEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTTKerningEntry` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTTKerningEntry at(long index, Consumer<STBTTKerningEntry> func) { func.accept(asSlice(index)); return this; }

    /// {@return `glyph1` at the given index}
    /// @param index the index of the struct buffer
    public int glyph1At(long index) { return glyph1(this.segment(), index); }
    /// Sets `glyph1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph1At(long index, int value) { glyph1(this.segment(), index, value); return this; }

    /// {@return `glyph2` at the given index}
    /// @param index the index of the struct buffer
    public int glyph2At(long index) { return glyph2(this.segment(), index); }
    /// Sets `glyph2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph2At(long index, int value) { glyph2(this.segment(), index, value); return this; }

    /// {@return `advance` at the given index}
    /// @param index the index of the struct buffer
    public int advanceAt(long index) { return advance(this.segment(), index); }
    /// Sets `advance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry advanceAt(long index, int value) { advance(this.segment(), index, value); return this; }

}
