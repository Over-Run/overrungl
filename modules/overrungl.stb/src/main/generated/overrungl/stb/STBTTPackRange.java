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
/// struct STBTTPackRange {
///     float font_size;
///     int first_unicode_codepoint_in_range;
///     int* array_of_unicode_codepoints;
///     int num_chars;
///     stbtt_packedchar* chardata_for_range;
///     unsigned char h_oversample;
///     unsigned char v_oversample;
/// };
/// ```
public final class STBTTPackRange extends GroupType {
    /// The struct layout of `STBTTPackRange`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("font_size"),
        ValueLayout.JAVA_INT.withName("first_unicode_codepoint_in_range"),
        ValueLayout.ADDRESS.withName("array_of_unicode_codepoints"),
        ValueLayout.JAVA_INT.withName("num_chars"),
        ValueLayout.ADDRESS.withName("chardata_for_range"),
        ValueLayout.JAVA_BYTE.withName("h_oversample"),
        ValueLayout.JAVA_BYTE.withName("v_oversample")
    );
    /// The byte offset of `font_size`.
    public static final long OFFSET_font_size = LAYOUT.byteOffset(PathElement.groupElement("font_size"));
    /// The memory layout of `font_size`.
    public static final MemoryLayout LAYOUT_font_size = LAYOUT.select(PathElement.groupElement("font_size"));
    /// The [VarHandle] of `font_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_font_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("font_size"));
    /// The byte offset of `first_unicode_codepoint_in_range`.
    public static final long OFFSET_first_unicode_codepoint_in_range = LAYOUT.byteOffset(PathElement.groupElement("first_unicode_codepoint_in_range"));
    /// The memory layout of `first_unicode_codepoint_in_range`.
    public static final MemoryLayout LAYOUT_first_unicode_codepoint_in_range = LAYOUT.select(PathElement.groupElement("first_unicode_codepoint_in_range"));
    /// The [VarHandle] of `first_unicode_codepoint_in_range` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_first_unicode_codepoint_in_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first_unicode_codepoint_in_range"));
    /// The byte offset of `array_of_unicode_codepoints`.
    public static final long OFFSET_array_of_unicode_codepoints = LAYOUT.byteOffset(PathElement.groupElement("array_of_unicode_codepoints"));
    /// The memory layout of `array_of_unicode_codepoints`.
    public static final MemoryLayout LAYOUT_array_of_unicode_codepoints = LAYOUT.select(PathElement.groupElement("array_of_unicode_codepoints"));
    /// The [VarHandle] of `array_of_unicode_codepoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_array_of_unicode_codepoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("array_of_unicode_codepoints"));
    /// The byte offset of `num_chars`.
    public static final long OFFSET_num_chars = LAYOUT.byteOffset(PathElement.groupElement("num_chars"));
    /// The memory layout of `num_chars`.
    public static final MemoryLayout LAYOUT_num_chars = LAYOUT.select(PathElement.groupElement("num_chars"));
    /// The [VarHandle] of `num_chars` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_chars = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_chars"));
    /// The byte offset of `chardata_for_range`.
    public static final long OFFSET_chardata_for_range = LAYOUT.byteOffset(PathElement.groupElement("chardata_for_range"));
    /// The memory layout of `chardata_for_range`.
    public static final MemoryLayout LAYOUT_chardata_for_range = LAYOUT.select(PathElement.groupElement("chardata_for_range"));
    /// The [VarHandle] of `chardata_for_range` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chardata_for_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chardata_for_range"));
    /// The byte offset of `h_oversample`.
    public static final long OFFSET_h_oversample = LAYOUT.byteOffset(PathElement.groupElement("h_oversample"));
    /// The memory layout of `h_oversample`.
    public static final MemoryLayout LAYOUT_h_oversample = LAYOUT.select(PathElement.groupElement("h_oversample"));
    /// The [VarHandle] of `h_oversample` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_h_oversample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("h_oversample"));
    /// The byte offset of `v_oversample`.
    public static final long OFFSET_v_oversample = LAYOUT.byteOffset(PathElement.groupElement("v_oversample"));
    /// The memory layout of `v_oversample`.
    public static final MemoryLayout LAYOUT_v_oversample = LAYOUT.select(PathElement.groupElement("v_oversample"));
    /// The [VarHandle] of `v_oversample` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_v_oversample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("v_oversample"));

    /// Creates `STBTTPackRange` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTTPackRange(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTTPackRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTPackRange of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTPackRange(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTPackRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTPackRange ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTPackRange(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTTPackRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTPackRange ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTPackRange(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTTPackRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange alloc(SegmentAllocator allocator) { return new STBTTPackRange(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTTPackRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange alloc(SegmentAllocator allocator, long count) { return new STBTTPackRange(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @param array_of_unicode_codepoints `array_of_unicode_codepoints`
    /// @param num_chars `num_chars`
    /// @param chardata_for_range `chardata_for_range`
    /// @param h_oversample `h_oversample`
    /// @param v_oversample `v_oversample`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range, MemorySegment array_of_unicode_codepoints, int num_chars, MemorySegment chardata_for_range, byte h_oversample, byte v_oversample) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints).num_chars(num_chars).chardata_for_range(chardata_for_range).h_oversample(h_oversample).v_oversample(v_oversample);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @param array_of_unicode_codepoints `array_of_unicode_codepoints`
    /// @param num_chars `num_chars`
    /// @param chardata_for_range `chardata_for_range`
    /// @param h_oversample `h_oversample`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range, MemorySegment array_of_unicode_codepoints, int num_chars, MemorySegment chardata_for_range, byte h_oversample) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints).num_chars(num_chars).chardata_for_range(chardata_for_range).h_oversample(h_oversample);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @param array_of_unicode_codepoints `array_of_unicode_codepoints`
    /// @param num_chars `num_chars`
    /// @param chardata_for_range `chardata_for_range`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range, MemorySegment array_of_unicode_codepoints, int num_chars, MemorySegment chardata_for_range) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints).num_chars(num_chars).chardata_for_range(chardata_for_range);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @param array_of_unicode_codepoints `array_of_unicode_codepoints`
    /// @param num_chars `num_chars`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range, MemorySegment array_of_unicode_codepoints, int num_chars) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints).num_chars(num_chars);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @param array_of_unicode_codepoints `array_of_unicode_codepoints`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range, MemorySegment array_of_unicode_codepoints) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range).array_of_unicode_codepoints(array_of_unicode_codepoints);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @param first_unicode_codepoint_in_range `first_unicode_codepoint_in_range`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size, int first_unicode_codepoint_in_range) {
        return alloc(allocator).font_size(font_size).first_unicode_codepoint_in_range(first_unicode_codepoint_in_range);
    }

    /// Allocates a `STBTTPackRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param font_size `font_size`
    /// @return the allocated `STBTTPackRange`
    public static STBTTPackRange allocInit(SegmentAllocator allocator, float font_size) {
        return alloc(allocator).font_size(font_size);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTPackRange copyFrom(STBTTPackRange src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTTPackRange reinterpret(long count) { return new STBTTPackRange(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `font_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float font_size(MemorySegment segment, long index) { return (float) VH_font_size.get(segment, 0L, index); }
    /// {@return `font_size`}
    public float font_size() { return font_size(this.segment(), 0L); }
    /// Sets `font_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void font_size(MemorySegment segment, long index, float value) { VH_font_size.set(segment, 0L, index, value); }
    /// Sets `font_size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange font_size(float value) { font_size(this.segment(), 0L, value); return this; }

    /// {@return `first_unicode_codepoint_in_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int first_unicode_codepoint_in_range(MemorySegment segment, long index) { return (int) VH_first_unicode_codepoint_in_range.get(segment, 0L, index); }
    /// {@return `first_unicode_codepoint_in_range`}
    public int first_unicode_codepoint_in_range() { return first_unicode_codepoint_in_range(this.segment(), 0L); }
    /// Sets `first_unicode_codepoint_in_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void first_unicode_codepoint_in_range(MemorySegment segment, long index, int value) { VH_first_unicode_codepoint_in_range.set(segment, 0L, index, value); }
    /// Sets `first_unicode_codepoint_in_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange first_unicode_codepoint_in_range(int value) { first_unicode_codepoint_in_range(this.segment(), 0L, value); return this; }

    /// {@return `array_of_unicode_codepoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment array_of_unicode_codepoints(MemorySegment segment, long index) { return (MemorySegment) VH_array_of_unicode_codepoints.get(segment, 0L, index); }
    /// {@return `array_of_unicode_codepoints`}
    public MemorySegment array_of_unicode_codepoints() { return array_of_unicode_codepoints(this.segment(), 0L); }
    /// Sets `array_of_unicode_codepoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void array_of_unicode_codepoints(MemorySegment segment, long index, MemorySegment value) { VH_array_of_unicode_codepoints.set(segment, 0L, index, value); }
    /// Sets `array_of_unicode_codepoints` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange array_of_unicode_codepoints(MemorySegment value) { array_of_unicode_codepoints(this.segment(), 0L, value); return this; }

    /// {@return `num_chars` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int num_chars(MemorySegment segment, long index) { return (int) VH_num_chars.get(segment, 0L, index); }
    /// {@return `num_chars`}
    public int num_chars() { return num_chars(this.segment(), 0L); }
    /// Sets `num_chars` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_chars(MemorySegment segment, long index, int value) { VH_num_chars.set(segment, 0L, index, value); }
    /// Sets `num_chars` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange num_chars(int value) { num_chars(this.segment(), 0L, value); return this; }

    /// {@return `chardata_for_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment chardata_for_range(MemorySegment segment, long index) { return (MemorySegment) VH_chardata_for_range.get(segment, 0L, index); }
    /// {@return `chardata_for_range`}
    public MemorySegment chardata_for_range() { return chardata_for_range(this.segment(), 0L); }
    /// Sets `chardata_for_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chardata_for_range(MemorySegment segment, long index, MemorySegment value) { VH_chardata_for_range.set(segment, 0L, index, value); }
    /// Sets `chardata_for_range` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange chardata_for_range(MemorySegment value) { chardata_for_range(this.segment(), 0L, value); return this; }

    /// {@return `h_oversample` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte h_oversample(MemorySegment segment, long index) { return (byte) VH_h_oversample.get(segment, 0L, index); }
    /// {@return `h_oversample`}
    public byte h_oversample() { return h_oversample(this.segment(), 0L); }
    /// Sets `h_oversample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void h_oversample(MemorySegment segment, long index, byte value) { VH_h_oversample.set(segment, 0L, index, value); }
    /// Sets `h_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange h_oversample(byte value) { h_oversample(this.segment(), 0L, value); return this; }

    /// {@return `v_oversample` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte v_oversample(MemorySegment segment, long index) { return (byte) VH_v_oversample.get(segment, 0L, index); }
    /// {@return `v_oversample`}
    public byte v_oversample() { return v_oversample(this.segment(), 0L); }
    /// Sets `v_oversample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void v_oversample(MemorySegment segment, long index, byte value) { VH_v_oversample.set(segment, 0L, index, value); }
    /// Sets `v_oversample` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTPackRange v_oversample(byte value) { v_oversample(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBTTPackRange`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTPackRange`
    public STBTTPackRange asSlice(long index) { return new STBTTPackRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTTPackRange`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTPackRange`
    public STBTTPackRange asSlice(long index, long count) { return new STBTTPackRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTTPackRange` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTTPackRange at(long index, Consumer<STBTTPackRange> func) { func.accept(asSlice(index)); return this; }

    /// {@return `font_size` at the given index}
    /// @param index the index of the struct buffer
    public float font_sizeAt(long index) { return font_size(this.segment(), index); }
    /// Sets `font_size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange font_sizeAt(long index, float value) { font_size(this.segment(), index, value); return this; }

    /// {@return `first_unicode_codepoint_in_range` at the given index}
    /// @param index the index of the struct buffer
    public int first_unicode_codepoint_in_rangeAt(long index) { return first_unicode_codepoint_in_range(this.segment(), index); }
    /// Sets `first_unicode_codepoint_in_range` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange first_unicode_codepoint_in_rangeAt(long index, int value) { first_unicode_codepoint_in_range(this.segment(), index, value); return this; }

    /// {@return `array_of_unicode_codepoints` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment array_of_unicode_codepointsAt(long index) { return array_of_unicode_codepoints(this.segment(), index); }
    /// Sets `array_of_unicode_codepoints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange array_of_unicode_codepointsAt(long index, MemorySegment value) { array_of_unicode_codepoints(this.segment(), index, value); return this; }

    /// {@return `num_chars` at the given index}
    /// @param index the index of the struct buffer
    public int num_charsAt(long index) { return num_chars(this.segment(), index); }
    /// Sets `num_chars` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange num_charsAt(long index, int value) { num_chars(this.segment(), index, value); return this; }

    /// {@return `chardata_for_range` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment chardata_for_rangeAt(long index) { return chardata_for_range(this.segment(), index); }
    /// Sets `chardata_for_range` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange chardata_for_rangeAt(long index, MemorySegment value) { chardata_for_range(this.segment(), index, value); return this; }

    /// {@return `h_oversample` at the given index}
    /// @param index the index of the struct buffer
    public byte h_oversampleAt(long index) { return h_oversample(this.segment(), index); }
    /// Sets `h_oversample` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange h_oversampleAt(long index, byte value) { h_oversample(this.segment(), index, value); return this; }

    /// {@return `v_oversample` at the given index}
    /// @param index the index of the struct buffer
    public byte v_oversampleAt(long index) { return v_oversample(this.segment(), index); }
    /// Sets `v_oversample` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTPackRange v_oversampleAt(long index, byte value) { v_oversample(this.segment(), index, value); return this; }

}
