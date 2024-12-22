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
/// ### glyph1
/// [VarHandle][#VH_glyph1] - [Getter][#glyph1()] - [Setter][#glyph1(int)]
///
/// use stbtt_FindGlyphIndex
///
/// ### glyph2
/// [VarHandle][#VH_glyph2] - [Getter][#glyph2()] - [Setter][#glyph2(int)]
/// ### advance
/// [VarHandle][#VH_advance] - [Getter][#advance()] - [Setter][#advance(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt_kerningentry {
///     int glyph1;
///     int glyph2;
///     int advance;
/// } STBTTKerningEntry;
/// ```
public final class STBTTKerningEntry extends Struct {
    /// The struct layout of `stbtt_kerningentry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("glyph1"),
        ValueLayout.JAVA_INT.withName("glyph2"),
        ValueLayout.JAVA_INT.withName("advance")
    );
    /// The [VarHandle] of `glyph1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_glyph1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("glyph1"));
    /// The [VarHandle] of `glyph2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_glyph2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("glyph2"));
    /// The [VarHandle] of `advance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advance"));

    /// Creates `STBTTKerningEntry` with the given segment.
    /// @param segment the memory segment
    public STBTTKerningEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry alloc(SegmentAllocator allocator) { return new STBTTKerningEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry alloc(SegmentAllocator allocator, long count) { return new STBTTKerningEntry(allocator.allocate(LAYOUT, count)); }

    /// {@return `glyph1` at the given index}
    /// @param index the index
    public @CType("int") int glyph1At(long index) { return (int) VH_glyph1.get(this.segment(), 0L, index); }
    /// {@return `glyph1`}
    public @CType("int") int glyph1() { return this.glyph1At(0L); }
    /// Sets `glyph1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph1At(long index, @CType("int") int value) { VH_glyph1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `glyph1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph1(@CType("int") int value) { return this.glyph1At(0L, value); }

    /// {@return `glyph2` at the given index}
    /// @param index the index
    public @CType("int") int glyph2At(long index) { return (int) VH_glyph2.get(this.segment(), 0L, index); }
    /// {@return `glyph2`}
    public @CType("int") int glyph2() { return this.glyph2At(0L); }
    /// Sets `glyph2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph2At(long index, @CType("int") int value) { VH_glyph2.set(this.segment(), 0L, index, value); return this; }
    /// Sets `glyph2` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph2(@CType("int") int value) { return this.glyph2At(0L, value); }

    /// {@return `advance` at the given index}
    /// @param index the index
    public @CType("int") int advanceAt(long index) { return (int) VH_advance.get(this.segment(), 0L, index); }
    /// {@return `advance`}
    public @CType("int") int advance() { return this.advanceAt(0L); }
    /// Sets `advance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry advanceAt(long index, @CType("int") int value) { VH_advance.set(this.segment(), 0L, index, value); return this; }
    /// Sets `advance` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry advance(@CType("int") int value) { return this.advanceAt(0L, value); }

}
