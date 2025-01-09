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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### luma_weight_l0_flag
/// [VarHandle][#VH_luma_weight_l0_flag] - [Getter][#luma_weight_l0_flag()] - [Setter][#luma_weight_l0_flag(short)]
/// ### chroma_weight_l0_flag
/// [VarHandle][#VH_chroma_weight_l0_flag] - [Getter][#chroma_weight_l0_flag()] - [Setter][#chroma_weight_l0_flag(short)]
/// ### luma_weight_l1_flag
/// [VarHandle][#VH_luma_weight_l1_flag] - [Getter][#luma_weight_l1_flag()] - [Setter][#luma_weight_l1_flag(short)]
/// ### chroma_weight_l1_flag
/// [VarHandle][#VH_chroma_weight_l1_flag] - [Getter][#chroma_weight_l1_flag()] - [Setter][#chroma_weight_l1_flag(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265WeightTableFlags {
///     uint16_t luma_weight_l0_flag;
///     uint16_t chroma_weight_l0_flag;
///     uint16_t luma_weight_l1_flag;
///     uint16_t chroma_weight_l1_flag;
/// } StdVideoEncodeH265WeightTableFlags;
/// ```
public final class StdVideoEncodeH265WeightTableFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH265WeightTableFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("luma_weight_l0_flag"),
        ValueLayout.JAVA_SHORT.withName("chroma_weight_l0_flag"),
        ValueLayout.JAVA_SHORT.withName("luma_weight_l1_flag"),
        ValueLayout.JAVA_SHORT.withName("chroma_weight_l1_flag")
    );
    /// The [VarHandle] of `luma_weight_l0_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_luma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0_flag"));
    /// The [VarHandle] of `chroma_weight_l0_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_chroma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0_flag"));
    /// The [VarHandle] of `luma_weight_l1_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_luma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1_flag"));
    /// The [VarHandle] of `chroma_weight_l1_flag` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_chroma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1_flag"));

    /// Creates `StdVideoEncodeH265WeightTableFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265WeightTableFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265WeightTableFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTableFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment); }

    /// Creates `StdVideoEncodeH265WeightTableFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTableFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265WeightTableFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTableFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH265WeightTableFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265WeightTableFlags`
    public static StdVideoEncodeH265WeightTableFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265WeightTableFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265WeightTableFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265WeightTableFlags`
    public static StdVideoEncodeH265WeightTableFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265WeightTableFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeH265WeightTableFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265WeightTableFlags`
    public StdVideoEncodeH265WeightTableFlags asSlice(long index) { return new StdVideoEncodeH265WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeH265WeightTableFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265WeightTableFlags`
    public StdVideoEncodeH265WeightTableFlags asSlice(long index, long count) { return new StdVideoEncodeH265WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `luma_weight_l0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_luma_weight_l0_flag(MemorySegment segment, long index) { return (short) VH_luma_weight_l0_flag.get(segment, 0L, index); }
    /// {@return `luma_weight_l0_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_luma_weight_l0_flag(MemorySegment segment) { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l0_flag(segment, 0L); }
    /// {@return `luma_weight_l0_flag` at the given index}
    /// @param index the index
    public @CType("uint16_t") short luma_weight_l0_flagAt(long index) { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l0_flag(this.segment(), index); }
    /// {@return `luma_weight_l0_flag`}
    public @CType("uint16_t") short luma_weight_l0_flag() { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l0_flag(this.segment()); }
    /// Sets `luma_weight_l0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_weight_l0_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_luma_weight_l0_flag.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l0_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_weight_l0_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l0_flag(segment, 0L, value); }
    /// Sets `luma_weight_l0_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags luma_weight_l0_flagAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l0_flag(this.segment(), index, value); return this; }
    /// Sets `luma_weight_l0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags luma_weight_l0_flag(@CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l0_flag(this.segment(), value); return this; }

    /// {@return `chroma_weight_l0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_chroma_weight_l0_flag(MemorySegment segment, long index) { return (short) VH_chroma_weight_l0_flag.get(segment, 0L, index); }
    /// {@return `chroma_weight_l0_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_chroma_weight_l0_flag(MemorySegment segment) { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l0_flag(segment, 0L); }
    /// {@return `chroma_weight_l0_flag` at the given index}
    /// @param index the index
    public @CType("uint16_t") short chroma_weight_l0_flagAt(long index) { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l0_flag(this.segment(), index); }
    /// {@return `chroma_weight_l0_flag`}
    public @CType("uint16_t") short chroma_weight_l0_flag() { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l0_flag(this.segment()); }
    /// Sets `chroma_weight_l0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_weight_l0_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_chroma_weight_l0_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l0_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_weight_l0_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l0_flag(segment, 0L, value); }
    /// Sets `chroma_weight_l0_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l0_flagAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l0_flag(this.segment(), index, value); return this; }
    /// Sets `chroma_weight_l0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l0_flag(@CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l0_flag(this.segment(), value); return this; }

    /// {@return `luma_weight_l1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_luma_weight_l1_flag(MemorySegment segment, long index) { return (short) VH_luma_weight_l1_flag.get(segment, 0L, index); }
    /// {@return `luma_weight_l1_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_luma_weight_l1_flag(MemorySegment segment) { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l1_flag(segment, 0L); }
    /// {@return `luma_weight_l1_flag` at the given index}
    /// @param index the index
    public @CType("uint16_t") short luma_weight_l1_flagAt(long index) { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l1_flag(this.segment(), index); }
    /// {@return `luma_weight_l1_flag`}
    public @CType("uint16_t") short luma_weight_l1_flag() { return StdVideoEncodeH265WeightTableFlags.get_luma_weight_l1_flag(this.segment()); }
    /// Sets `luma_weight_l1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_weight_l1_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_luma_weight_l1_flag.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l1_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_weight_l1_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l1_flag(segment, 0L, value); }
    /// Sets `luma_weight_l1_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags luma_weight_l1_flagAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l1_flag(this.segment(), index, value); return this; }
    /// Sets `luma_weight_l1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags luma_weight_l1_flag(@CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_luma_weight_l1_flag(this.segment(), value); return this; }

    /// {@return `chroma_weight_l1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_chroma_weight_l1_flag(MemorySegment segment, long index) { return (short) VH_chroma_weight_l1_flag.get(segment, 0L, index); }
    /// {@return `chroma_weight_l1_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_chroma_weight_l1_flag(MemorySegment segment) { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l1_flag(segment, 0L); }
    /// {@return `chroma_weight_l1_flag` at the given index}
    /// @param index the index
    public @CType("uint16_t") short chroma_weight_l1_flagAt(long index) { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l1_flag(this.segment(), index); }
    /// {@return `chroma_weight_l1_flag`}
    public @CType("uint16_t") short chroma_weight_l1_flag() { return StdVideoEncodeH265WeightTableFlags.get_chroma_weight_l1_flag(this.segment()); }
    /// Sets `chroma_weight_l1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_weight_l1_flag(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_chroma_weight_l1_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l1_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_weight_l1_flag(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l1_flag(segment, 0L, value); }
    /// Sets `chroma_weight_l1_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l1_flagAt(long index, @CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l1_flag(this.segment(), index, value); return this; }
    /// Sets `chroma_weight_l1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l1_flag(@CType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.set_chroma_weight_l1_flag(this.segment(), value); return this; }

}
