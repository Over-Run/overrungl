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
/// ### font_size
/// [VarHandle][#VH_font_size] - [Getter][#font_size()] - [Setter][#font_size(float)]
/// ### first_unicode_codepoint_in_range
/// [VarHandle][#VH_first_unicode_codepoint_in_range] - [Getter][#first_unicode_codepoint_in_range()] - [Setter][#first_unicode_codepoint_in_range(int)]
///
/// if non-zero, then the chars are continuous, and this is the first codepoint
///
/// ### array_of_unicode_codepoints
/// [VarHandle][#VH_array_of_unicode_codepoints] - [Getter][#array_of_unicode_codepoints()] - [Setter][#array_of_unicode_codepoints(java.lang.foreign.MemorySegment)]
///
/// if non-zero, then this is an array of unicode codepoints
///
/// ### num_chars
/// [VarHandle][#VH_num_chars] - [Getter][#num_chars()] - [Setter][#num_chars(int)]
/// ### chardata_for_range
/// [VarHandle][#VH_chardata_for_range] - [Getter][#chardata_for_range()] - [Setter][#chardata_for_range(java.lang.foreign.MemorySegment)]
///
/// output
///
/// ### h_oversample
/// [VarHandle][#VH_h_oversample] - [Getter][#h_oversample()] - [Setter][#h_oversample(byte)]
///
/// don't set these, they're used internally
///
/// ### v_oversample
/// [VarHandle][#VH_v_oversample] - [Getter][#v_oversample()] - [Setter][#v_oversample(byte)]
///
/// don't set these, they're used internally
///
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
public final class STBTTPackRange extends Struct {
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

    /// Allocates a `STBTTPackRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange alloc(SegmentAllocator allocator) { return new STBTTPackRange(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBTTPackRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange alloc(SegmentAllocator allocator, long count) { return new STBTTPackRange(allocator.allocate(LAYOUT, count)); }

    /// {@return `font_size` at the given index}
    /// @param index the index
    public @CType("float") float font_sizeAt(long index) { return (float) VH_font_size.get(this.segment(), 0L, index); }
    /// {@return `font_size`}
    public @CType("float") float font_size() { return this.font_sizeAt(0L); }
    /// Sets `font_size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange font_sizeAt(long index, @CType("float") float value) { VH_font_size.set(this.segment(), 0L, index, value); return this; }
    /// Sets `font_size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange font_size(@CType("float") float value) { return this.font_sizeAt(0L, value); }

    /// {@return `first_unicode_codepoint_in_range` at the given index}
    /// @param index the index
    public @CType("int") int first_unicode_codepoint_in_rangeAt(long index) { return (int) VH_first_unicode_codepoint_in_range.get(this.segment(), 0L, index); }
    /// {@return `first_unicode_codepoint_in_range`}
    public @CType("int") int first_unicode_codepoint_in_range() { return this.first_unicode_codepoint_in_rangeAt(0L); }
    /// Sets `first_unicode_codepoint_in_range` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange first_unicode_codepoint_in_rangeAt(long index, @CType("int") int value) { VH_first_unicode_codepoint_in_range.set(this.segment(), 0L, index, value); return this; }
    /// Sets `first_unicode_codepoint_in_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange first_unicode_codepoint_in_range(@CType("int") int value) { return this.first_unicode_codepoint_in_rangeAt(0L, value); }

    /// {@return `array_of_unicode_codepoints` at the given index}
    /// @param index the index
    public @CType("int*") java.lang.foreign.MemorySegment array_of_unicode_codepointsAt(long index) { return (java.lang.foreign.MemorySegment) VH_array_of_unicode_codepoints.get(this.segment(), 0L, index); }
    /// {@return `array_of_unicode_codepoints`}
    public @CType("int*") java.lang.foreign.MemorySegment array_of_unicode_codepoints() { return this.array_of_unicode_codepointsAt(0L); }
    /// Sets `array_of_unicode_codepoints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange array_of_unicode_codepointsAt(long index, @CType("int*") java.lang.foreign.MemorySegment value) { VH_array_of_unicode_codepoints.set(this.segment(), 0L, index, value); return this; }
    /// Sets `array_of_unicode_codepoints` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange array_of_unicode_codepoints(@CType("int*") java.lang.foreign.MemorySegment value) { return this.array_of_unicode_codepointsAt(0L, value); }

    /// {@return `num_chars` at the given index}
    /// @param index the index
    public @CType("int") int num_charsAt(long index) { return (int) VH_num_chars.get(this.segment(), 0L, index); }
    /// {@return `num_chars`}
    public @CType("int") int num_chars() { return this.num_charsAt(0L); }
    /// Sets `num_chars` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange num_charsAt(long index, @CType("int") int value) { VH_num_chars.set(this.segment(), 0L, index, value); return this; }
    /// Sets `num_chars` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange num_chars(@CType("int") int value) { return this.num_charsAt(0L, value); }

    /// {@return `chardata_for_range` at the given index}
    /// @param index the index
    public @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_rangeAt(long index) { return (java.lang.foreign.MemorySegment) VH_chardata_for_range.get(this.segment(), 0L, index); }
    /// {@return `chardata_for_range`}
    public @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_range() { return this.chardata_for_rangeAt(0L); }
    /// Sets `chardata_for_range` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange chardata_for_rangeAt(long index, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { VH_chardata_for_range.set(this.segment(), 0L, index, value); return this; }
    /// Sets `chardata_for_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange chardata_for_range(@CType("stbtt_packedchar *") java.lang.foreign.MemorySegment value) { return this.chardata_for_rangeAt(0L, value); }

    /// {@return `h_oversample` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte h_oversampleAt(long index) { return (byte) VH_h_oversample.get(this.segment(), 0L, index); }
    /// {@return `h_oversample`}
    public @CType("unsigned char") byte h_oversample() { return this.h_oversampleAt(0L); }
    /// Sets `h_oversample` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange h_oversampleAt(long index, @CType("unsigned char") byte value) { VH_h_oversample.set(this.segment(), 0L, index, value); return this; }
    /// Sets `h_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange h_oversample(@CType("unsigned char") byte value) { return this.h_oversampleAt(0L, value); }

    /// {@return `v_oversample` at the given index}
    /// @param index the index
    public @CType("unsigned char") byte v_oversampleAt(long index) { return (byte) VH_v_oversample.get(this.segment(), 0L, index); }
    /// {@return `v_oversample`}
    public @CType("unsigned char") byte v_oversample() { return this.v_oversampleAt(0L); }
    /// Sets `v_oversample` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBTTPackRange v_oversampleAt(long index, @CType("unsigned char") byte value) { VH_v_oversample.set(this.segment(), 0L, index, value); return this; }
    /// Sets `v_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange v_oversample(@CType("unsigned char") byte value) { return this.v_oversampleAt(0L, value); }

}
