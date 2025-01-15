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
/// ### font_size
/// [VarHandle][#VH_font_size] - [Getter][#font_size()] - [Setter][#font_size(float)]
/// ### first_unicode_codepoint_in_range
/// [VarHandle][#VH_first_unicode_codepoint_in_range] - [Getter][#first_unicode_codepoint_in_range()] - [Setter][#first_unicode_codepoint_in_range(int)]
/// ### array_of_unicode_codepoints
/// [VarHandle][#VH_array_of_unicode_codepoints] - [Getter][#array_of_unicode_codepoints()] - [Setter][#array_of_unicode_codepoints(java.lang.foreign.MemorySegment)]
/// ### num_chars
/// [VarHandle][#VH_num_chars] - [Getter][#num_chars()] - [Setter][#num_chars(int)]
/// ### chardata_for_range
/// [VarHandle][#VH_chardata_for_range] - [Getter][#chardata_for_range()] - [Setter][#chardata_for_range(java.lang.foreign.MemorySegment)]
/// ### h_oversample
/// [VarHandle][#VH_h_oversample] - [Getter][#h_oversample()] - [Setter][#h_oversample(byte)]
/// ### v_oversample
/// [VarHandle][#VH_v_oversample] - [Getter][#v_oversample()] - [Setter][#v_oversample(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbtt_pack_range {
///     float font_size;
///     int first_unicode_codepoint_in_range;
///     int* array_of_unicode_codepoints;
///     int num_chars;
///     stbtt_packedchar * chardata_for_range;
///     unsigned char h_oversample;
///     unsigned char v_oversample;
/// } STBTTPackRange;
/// ```
public sealed class STBTTPackRange extends Struct {
    /// The struct layout of `stbtt_pack_range`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("font_size"),
        ValueLayout.JAVA_INT.withName("first_unicode_codepoint_in_range"),
        ValueLayout.ADDRESS.withName("array_of_unicode_codepoints"),
        ValueLayout.JAVA_INT.withName("num_chars"),
        ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackedChar.LAYOUT).withName("chardata_for_range"),
        ValueLayout.JAVA_BYTE.withName("h_oversample"),
        ValueLayout.JAVA_BYTE.withName("v_oversample")
    );
    /// The [VarHandle] of `font_size` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_font_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("font_size"));
    /// The [VarHandle] of `first_unicode_codepoint_in_range` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_first_unicode_codepoint_in_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first_unicode_codepoint_in_range"));
    /// The [VarHandle] of `array_of_unicode_codepoints` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_array_of_unicode_codepoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("array_of_unicode_codepoints"));
    /// The [VarHandle] of `num_chars` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_chars = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_chars"));
    /// The [VarHandle] of `chardata_for_range` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_chardata_for_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chardata_for_range"));
    /// The [VarHandle] of `h_oversample` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_h_oversample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("h_oversample"));
    /// The [VarHandle] of `v_oversample` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_v_oversample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("v_oversample"));

    /// Creates `STBTTPackRange` with the given segment.
    /// @param segment the memory segment
    public STBTTPackRange(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBTTPackRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTPackRange of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTPackRange(segment); }

    /// Creates `STBTTPackRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTPackRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTPackRange ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBTTPackRange(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBTTPackRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBTTPackRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange alloc(SegmentAllocator allocator) { return new STBTTPackRange(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTPackRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTPackRange`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBTTPackRange` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, @CType("float") float font_size, @CType("int") int first_unicode_codepoint_in_range, @CType("int*") java.lang.foreign.MemorySegment array_of_unicode_codepoints, @CType("int") int num_chars, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_range, @CType("unsigned char") byte h_oversample, @CType("unsigned char") byte v_oversample) { return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints).num_chars(num_chars).chardata_for_range(chardata_for_range).h_oversample(h_oversample).v_oversample(v_oversample); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTPackRange copyFrom(STBTTPackRange src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `font_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_font_size(MemorySegment segment, long index) { return (float) VH_font_size.get(segment, 0L, index); }
    /// {@return `font_size`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_font_size(MemorySegment segment) { return STBTTPackRange.get_font_size(segment, 0L); }
    /// {@return `font_size`}
    public @CType("float") float font_size() { return STBTTPackRange.get_font_size(this.segment()); }
    /// Sets `font_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_font_size(MemorySegment segment, long index, @CType("float") float value) { VH_font_size.set(segment, 0L, index, value); }
    /// Sets `font_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_font_size(MemorySegment segment, @CType("float") float value) { STBTTPackRange.set_font_size(segment, 0L, value); }
    /// Sets `font_size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange font_size(@CType("float") float value) { STBTTPackRange.set_font_size(this.segment(), value); return this; }

    /// {@return `first_unicode_codepoint_in_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_first_unicode_codepoint_in_range(MemorySegment segment, long index) { return (int) VH_first_unicode_codepoint_in_range.get(segment, 0L, index); }
    /// {@return `first_unicode_codepoint_in_range`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_first_unicode_codepoint_in_range(MemorySegment segment) { return STBTTPackRange.get_first_unicode_codepoint_in_range(segment, 0L); }
    /// {@return `first_unicode_codepoint_in_range`}
    public @CType("int") int first_unicode_codepoint_in_range() { return STBTTPackRange.get_first_unicode_codepoint_in_range(this.segment()); }
    /// Sets `first_unicode_codepoint_in_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_first_unicode_codepoint_in_range(MemorySegment segment, long index, @CType("int") int value) { VH_first_unicode_codepoint_in_range.set(segment, 0L, index, value); }
    /// Sets `first_unicode_codepoint_in_range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_first_unicode_codepoint_in_range(MemorySegment segment, @CType("int") int value) { STBTTPackRange.set_first_unicode_codepoint_in_range(segment, 0L, value); }
    /// Sets `first_unicode_codepoint_in_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange first_unicode_codepoint_in_range(@CType("int") int value) { STBTTPackRange.set_first_unicode_codepoint_in_range(this.segment(), value); return this; }

    /// {@return `array_of_unicode_codepoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int*") java.lang.foreign.MemorySegment get_array_of_unicode_codepoints(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_array_of_unicode_codepoints.get(segment, 0L, index); }
    /// {@return `array_of_unicode_codepoints`}
    /// @param segment the segment of the struct
    public static @CType("int*") java.lang.foreign.MemorySegment get_array_of_unicode_codepoints(MemorySegment segment) { return STBTTPackRange.get_array_of_unicode_codepoints(segment, 0L); }
    /// {@return `array_of_unicode_codepoints`}
    public @CType("int*") java.lang.foreign.MemorySegment array_of_unicode_codepoints() { return STBTTPackRange.get_array_of_unicode_codepoints(this.segment()); }
    /// Sets `array_of_unicode_codepoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_array_of_unicode_codepoints(MemorySegment segment, long index, @CType("int*") java.lang.foreign.MemorySegment value) { VH_array_of_unicode_codepoints.set(segment, 0L, index, value); }
    /// Sets `array_of_unicode_codepoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_array_of_unicode_codepoints(MemorySegment segment, @CType("int*") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_array_of_unicode_codepoints(segment, 0L, value); }
    /// Sets `array_of_unicode_codepoints` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange array_of_unicode_codepoints(@CType("int*") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_array_of_unicode_codepoints(this.segment(), value); return this; }

    /// {@return `num_chars` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_num_chars(MemorySegment segment, long index) { return (int) VH_num_chars.get(segment, 0L, index); }
    /// {@return `num_chars`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_num_chars(MemorySegment segment) { return STBTTPackRange.get_num_chars(segment, 0L); }
    /// {@return `num_chars`}
    public @CType("int") int num_chars() { return STBTTPackRange.get_num_chars(this.segment()); }
    /// Sets `num_chars` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_chars(MemorySegment segment, long index, @CType("int") int value) { VH_num_chars.set(segment, 0L, index, value); }
    /// Sets `num_chars` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_chars(MemorySegment segment, @CType("int") int value) { STBTTPackRange.set_num_chars(segment, 0L, value); }
    /// Sets `num_chars` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange num_chars(@CType("int") int value) { STBTTPackRange.set_num_chars(this.segment(), value); return this; }

    /// {@return `chardata_for_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment get_chardata_for_range(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_chardata_for_range.get(segment, 0L, index); }
    /// {@return `chardata_for_range`}
    /// @param segment the segment of the struct
    public static @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment get_chardata_for_range(MemorySegment segment) { return STBTTPackRange.get_chardata_for_range(segment, 0L); }
    /// {@return `chardata_for_range`}
    public @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_range() { return STBTTPackRange.get_chardata_for_range(this.segment()); }
    /// Sets `chardata_for_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chardata_for_range(MemorySegment segment, long index, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { VH_chardata_for_range.set(segment, 0L, index, value); }
    /// Sets `chardata_for_range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chardata_for_range(MemorySegment segment, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_chardata_for_range(segment, 0L, value); }
    /// Sets `chardata_for_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange chardata_for_range(@CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_chardata_for_range(this.segment(), value); return this; }

    /// {@return `h_oversample` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char") byte get_h_oversample(MemorySegment segment, long index) { return (byte) VH_h_oversample.get(segment, 0L, index); }
    /// {@return `h_oversample`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char") byte get_h_oversample(MemorySegment segment) { return STBTTPackRange.get_h_oversample(segment, 0L); }
    /// {@return `h_oversample`}
    public @CType("unsigned char") byte h_oversample() { return STBTTPackRange.get_h_oversample(this.segment()); }
    /// Sets `h_oversample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_h_oversample(MemorySegment segment, long index, @CType("unsigned char") byte value) { VH_h_oversample.set(segment, 0L, index, value); }
    /// Sets `h_oversample` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_h_oversample(MemorySegment segment, @CType("unsigned char") byte value) { STBTTPackRange.set_h_oversample(segment, 0L, value); }
    /// Sets `h_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange h_oversample(@CType("unsigned char") byte value) { STBTTPackRange.set_h_oversample(this.segment(), value); return this; }

    /// {@return `v_oversample` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned char") byte get_v_oversample(MemorySegment segment, long index) { return (byte) VH_v_oversample.get(segment, 0L, index); }
    /// {@return `v_oversample`}
    /// @param segment the segment of the struct
    public static @CType("unsigned char") byte get_v_oversample(MemorySegment segment) { return STBTTPackRange.get_v_oversample(segment, 0L); }
    /// {@return `v_oversample`}
    public @CType("unsigned char") byte v_oversample() { return STBTTPackRange.get_v_oversample(this.segment()); }
    /// Sets `v_oversample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_v_oversample(MemorySegment segment, long index, @CType("unsigned char") byte value) { VH_v_oversample.set(segment, 0L, index, value); }
    /// Sets `v_oversample` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_v_oversample(MemorySegment segment, @CType("unsigned char") byte value) { STBTTPackRange.set_v_oversample(segment, 0L, value); }
    /// Sets `v_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange v_oversample(@CType("unsigned char") byte value) { STBTTPackRange.set_v_oversample(this.segment(), value); return this; }

    /// A buffer of [STBTTPackRange].
    public static final class Buffer extends STBTTPackRange {
        private final long elementCount;

        /// Creates `STBTTPackRange.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBTTPackRange`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBTTPackRange`
        public STBTTPackRange asSlice(long index) { return new STBTTPackRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBTTPackRange`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBTTPackRange`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `font_size` at the given index}
        /// @param index the index
        public @CType("float") float font_sizeAt(long index) { return STBTTPackRange.get_font_size(this.segment(), index); }
        /// Sets `font_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer font_sizeAt(long index, @CType("float") float value) { STBTTPackRange.set_font_size(this.segment(), index, value); return this; }

        /// {@return `first_unicode_codepoint_in_range` at the given index}
        /// @param index the index
        public @CType("int") int first_unicode_codepoint_in_rangeAt(long index) { return STBTTPackRange.get_first_unicode_codepoint_in_range(this.segment(), index); }
        /// Sets `first_unicode_codepoint_in_range` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer first_unicode_codepoint_in_rangeAt(long index, @CType("int") int value) { STBTTPackRange.set_first_unicode_codepoint_in_range(this.segment(), index, value); return this; }

        /// {@return `array_of_unicode_codepoints` at the given index}
        /// @param index the index
        public @CType("int*") java.lang.foreign.MemorySegment array_of_unicode_codepointsAt(long index) { return STBTTPackRange.get_array_of_unicode_codepoints(this.segment(), index); }
        /// Sets `array_of_unicode_codepoints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer array_of_unicode_codepointsAt(long index, @CType("int*") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_array_of_unicode_codepoints(this.segment(), index, value); return this; }

        /// {@return `num_chars` at the given index}
        /// @param index the index
        public @CType("int") int num_charsAt(long index) { return STBTTPackRange.get_num_chars(this.segment(), index); }
        /// Sets `num_chars` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_charsAt(long index, @CType("int") int value) { STBTTPackRange.set_num_chars(this.segment(), index, value); return this; }

        /// {@return `chardata_for_range` at the given index}
        /// @param index the index
        public @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_rangeAt(long index) { return STBTTPackRange.get_chardata_for_range(this.segment(), index); }
        /// Sets `chardata_for_range` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chardata_for_rangeAt(long index, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { STBTTPackRange.set_chardata_for_range(this.segment(), index, value); return this; }

        /// {@return `h_oversample` at the given index}
        /// @param index the index
        public @CType("unsigned char") byte h_oversampleAt(long index) { return STBTTPackRange.get_h_oversample(this.segment(), index); }
        /// Sets `h_oversample` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer h_oversampleAt(long index, @CType("unsigned char") byte value) { STBTTPackRange.set_h_oversample(this.segment(), index, value); return this; }

        /// {@return `v_oversample` at the given index}
        /// @param index the index
        public @CType("unsigned char") byte v_oversampleAt(long index) { return STBTTPackRange.get_v_oversample(this.segment(), index); }
        /// Sets `v_oversample` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer v_oversampleAt(long index, @CType("unsigned char") byte value) { STBTTPackRange.set_v_oversample(this.segment(), index, value); return this; }

    }
}
