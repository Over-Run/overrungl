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
/// ### glyph1
/// [VarHandle][#VH_glyph1] - [Getter][#glyph1()] - [Setter][#glyph1(int)]
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
public sealed class STBTTKerningEntry extends Struct {
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

    /// Creates `STBTTKerningEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTKerningEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTKerningEntry(segment); }

    /// Creates `STBTTKerningEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTKerningEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTKerningEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTKerningEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTKerningEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry alloc(SegmentAllocator allocator) { return new STBTTKerningEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTKerningEntry`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBTTKerningEntry` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTKerningEntry`
    public static STBTTKerningEntry allocInit(SegmentAllocator allocator, @CType("int") int glyph1, @CType("int") int glyph2, @CType("int") int advance) { return alloc(allocator).glyph1(glyph1).glyph2(glyph2).advance(advance); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTKerningEntry copyFrom(STBTTKerningEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `glyph1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_glyph1(MemorySegment segment, long index) { return (int) VH_glyph1.get(segment, 0L, index); }
    /// {@return `glyph1`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_glyph1(MemorySegment segment) { return STBTTKerningEntry.get_glyph1(segment, 0L); }
    /// {@return `glyph1`}
    public @CType("int") int glyph1() { return STBTTKerningEntry.get_glyph1(this.segment()); }
    /// Sets `glyph1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_glyph1(MemorySegment segment, long index, @CType("int") int value) { VH_glyph1.set(segment, 0L, index, value); }
    /// Sets `glyph1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_glyph1(MemorySegment segment, @CType("int") int value) { STBTTKerningEntry.set_glyph1(segment, 0L, value); }
    /// Sets `glyph1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph1(@CType("int") int value) { STBTTKerningEntry.set_glyph1(this.segment(), value); return this; }

    /// {@return `glyph2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_glyph2(MemorySegment segment, long index) { return (int) VH_glyph2.get(segment, 0L, index); }
    /// {@return `glyph2`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_glyph2(MemorySegment segment) { return STBTTKerningEntry.get_glyph2(segment, 0L); }
    /// {@return `glyph2`}
    public @CType("int") int glyph2() { return STBTTKerningEntry.get_glyph2(this.segment()); }
    /// Sets `glyph2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_glyph2(MemorySegment segment, long index, @CType("int") int value) { VH_glyph2.set(segment, 0L, index, value); }
    /// Sets `glyph2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_glyph2(MemorySegment segment, @CType("int") int value) { STBTTKerningEntry.set_glyph2(segment, 0L, value); }
    /// Sets `glyph2` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry glyph2(@CType("int") int value) { STBTTKerningEntry.set_glyph2(this.segment(), value); return this; }

    /// {@return `advance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_advance(MemorySegment segment, long index) { return (int) VH_advance.get(segment, 0L, index); }
    /// {@return `advance`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_advance(MemorySegment segment) { return STBTTKerningEntry.get_advance(segment, 0L); }
    /// {@return `advance`}
    public @CType("int") int advance() { return STBTTKerningEntry.get_advance(this.segment()); }
    /// Sets `advance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advance(MemorySegment segment, long index, @CType("int") int value) { VH_advance.set(segment, 0L, index, value); }
    /// Sets `advance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advance(MemorySegment segment, @CType("int") int value) { STBTTKerningEntry.set_advance(segment, 0L, value); }
    /// Sets `advance` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTKerningEntry advance(@CType("int") int value) { STBTTKerningEntry.set_advance(this.segment(), value); return this; }

    /// A buffer of [STBTTKerningEntry].
    public static final class Buffer extends STBTTKerningEntry {
        private final long elementCount;

        /// Creates `STBTTKerningEntry.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBTTKerningEntry`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBTTKerningEntry`
        public STBTTKerningEntry asSlice(long index) { return new STBTTKerningEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBTTKerningEntry`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBTTKerningEntry`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `glyph1` at the given index}
        /// @param index the index
        public @CType("int") int glyph1At(long index) { return STBTTKerningEntry.get_glyph1(this.segment(), index); }
        /// Sets `glyph1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer glyph1At(long index, @CType("int") int value) { STBTTKerningEntry.set_glyph1(this.segment(), index, value); return this; }

        /// {@return `glyph2` at the given index}
        /// @param index the index
        public @CType("int") int glyph2At(long index) { return STBTTKerningEntry.get_glyph2(this.segment(), index); }
        /// Sets `glyph2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer glyph2At(long index, @CType("int") int value) { STBTTKerningEntry.set_glyph2(this.segment(), index, value); return this; }

        /// {@return `advance` at the given index}
        /// @param index the index
        public @CType("int") int advanceAt(long index) { return STBTTKerningEntry.get_advance(this.segment(), index); }
        /// Sets `advance` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer advanceAt(long index, @CType("int") int value) { STBTTKerningEntry.set_advance(this.segment(), index, value); return this; }

    }
}
