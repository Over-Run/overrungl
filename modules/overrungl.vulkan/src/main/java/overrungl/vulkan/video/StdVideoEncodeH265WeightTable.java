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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### luma_log2_weight_denom
/// [VarHandle][#VH_luma_log2_weight_denom] - [Getter][#luma_log2_weight_denom()] - [Setter][#luma_log2_weight_denom(byte)]
/// ### delta_chroma_log2_weight_denom
/// [VarHandle][#VH_delta_chroma_log2_weight_denom] - [Getter][#delta_chroma_log2_weight_denom()] - [Setter][#delta_chroma_log2_weight_denom(byte)]
/// ### delta_luma_weight_l0
/// [VarHandle][#VH_delta_luma_weight_l0] - [Getter][#delta_luma_weight_l0()] - [Setter][#delta_luma_weight_l0(byte)]
/// ### luma_offset_l0
/// [VarHandle][#VH_luma_offset_l0] - [Getter][#luma_offset_l0()] - [Setter][#luma_offset_l0(byte)]
/// ### delta_chroma_weight_l0
/// [VarHandle][#VH_delta_chroma_weight_l0] - [Getter][#delta_chroma_weight_l0()] - [Setter][#delta_chroma_weight_l0(byte)]
/// ### delta_chroma_offset_l0
/// [VarHandle][#VH_delta_chroma_offset_l0] - [Getter][#delta_chroma_offset_l0()] - [Setter][#delta_chroma_offset_l0(byte)]
/// ### delta_luma_weight_l1
/// [VarHandle][#VH_delta_luma_weight_l1] - [Getter][#delta_luma_weight_l1()] - [Setter][#delta_luma_weight_l1(byte)]
/// ### luma_offset_l1
/// [VarHandle][#VH_luma_offset_l1] - [Getter][#luma_offset_l1()] - [Setter][#luma_offset_l1(byte)]
/// ### delta_chroma_weight_l1
/// [VarHandle][#VH_delta_chroma_weight_l1] - [Getter][#delta_chroma_weight_l1()] - [Setter][#delta_chroma_weight_l1(byte)]
/// ### delta_chroma_offset_l1
/// [VarHandle][#VH_delta_chroma_offset_l1] - [Getter][#delta_chroma_offset_l1()] - [Setter][#delta_chroma_offset_l1(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265WeightTable {
///     StdVideoEncodeH265WeightTableFlags flags;
///     uint8_t luma_log2_weight_denom;
///     int8_t delta_chroma_log2_weight_denom;
///     int8_t [ ] delta_luma_weight_l0;
///     int8_t [ ] luma_offset_l0;
///     int8_t [ ][ ] delta_chroma_weight_l0;
///     int8_t [ ][ ] delta_chroma_offset_l0;
///     int8_t [ ] delta_luma_weight_l1;
///     int8_t [ ] luma_offset_l1;
///     int8_t [ ][ ] delta_chroma_weight_l1;
///     int8_t [ ][ ] delta_chroma_offset_l1;
/// } StdVideoEncodeH265WeightTable;
/// ```
public sealed class StdVideoEncodeH265WeightTable extends Struct {
    /// The struct layout of `StdVideoEncodeH265WeightTable`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH265WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("delta_luma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_luma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l1"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_offset_l1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `luma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_log2_weight_denom"));
    /// The [VarHandle] of `delta_chroma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_chroma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_log2_weight_denom"));
    /// The [VarHandle] of `delta_luma_weight_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_luma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_luma_weight_l0"));
    /// The [VarHandle] of `luma_offset_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l0"));
    /// The [VarHandle] of `delta_chroma_weight_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_chroma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_weight_l0"));
    /// The [VarHandle] of `delta_chroma_offset_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_chroma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_offset_l0"));
    /// The [VarHandle] of `delta_luma_weight_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_luma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_luma_weight_l1"));
    /// The [VarHandle] of `luma_offset_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l1"));
    /// The [VarHandle] of `delta_chroma_weight_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_chroma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_weight_l1"));
    /// The [VarHandle] of `delta_chroma_offset_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_chroma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_offset_l1"));

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265WeightTable(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTable of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTable(segment); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTable ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTable(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265WeightTable(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment flags, @CType("uint8_t") byte luma_log2_weight_denom, @CType("int8_t") byte delta_chroma_log2_weight_denom, @CType("int8_t [ ]") byte delta_luma_weight_l0, @CType("int8_t [ ]") byte luma_offset_l0, @CType("int8_t [ ][ ]") byte delta_chroma_weight_l0, @CType("int8_t [ ][ ]") byte delta_chroma_offset_l0, @CType("int8_t [ ]") byte delta_luma_weight_l1, @CType("int8_t [ ]") byte luma_offset_l1, @CType("int8_t [ ][ ]") byte delta_chroma_weight_l1, @CType("int8_t [ ][ ]") byte delta_chroma_offset_l1) { return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0).delta_luma_weight_l1(delta_luma_weight_l1).luma_offset_l1(luma_offset_l1).delta_chroma_weight_l1(delta_chroma_weight_l1).delta_chroma_offset_l1(delta_chroma_offset_l1); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265WeightTable copyFrom(StdVideoEncodeH265WeightTable src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH265WeightTable.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265WeightTable.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable flags(@CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265WeightTable.set_flags(this.segment(), value); return this; }

    /// {@return `luma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_luma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_luma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `luma_log2_weight_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_luma_log2_weight_denom(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_luma_log2_weight_denom(segment, 0L); }
    /// {@return `luma_log2_weight_denom`}
    public @CType("uint8_t") byte luma_log2_weight_denom() { return StdVideoEncodeH265WeightTable.get_luma_log2_weight_denom(this.segment()); }
    /// Sets `luma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_log2_weight_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_luma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `luma_log2_weight_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_log2_weight_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265WeightTable.set_luma_log2_weight_denom(segment, 0L, value); }
    /// Sets `luma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_log2_weight_denom(@CType("uint8_t") byte value) { StdVideoEncodeH265WeightTable.set_luma_log2_weight_denom(this.segment(), value); return this; }

    /// {@return `delta_chroma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_delta_chroma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_delta_chroma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `delta_chroma_log2_weight_denom`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_delta_chroma_log2_weight_denom(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_chroma_log2_weight_denom(segment, 0L); }
    /// {@return `delta_chroma_log2_weight_denom`}
    public @CType("int8_t") byte delta_chroma_log2_weight_denom() { return StdVideoEncodeH265WeightTable.get_delta_chroma_log2_weight_denom(this.segment()); }
    /// Sets `delta_chroma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_chroma_log2_weight_denom(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_delta_chroma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_log2_weight_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_chroma_log2_weight_denom(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_log2_weight_denom(segment, 0L, value); }
    /// Sets `delta_chroma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(@CType("int8_t") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_log2_weight_denom(this.segment(), value); return this; }

    /// {@return `delta_luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_delta_luma_weight_l0(MemorySegment segment, long index) { return (byte) VH_delta_luma_weight_l0.get(segment, 0L, index); }
    /// {@return `delta_luma_weight_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_delta_luma_weight_l0(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l0(segment, 0L); }
    /// {@return `delta_luma_weight_l0`}
    public @CType("int8_t [ ]") byte delta_luma_weight_l0() { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l0(this.segment()); }
    /// Sets `delta_luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_luma_weight_l0(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_delta_luma_weight_l0.set(segment, 0L, index, value); }
    /// Sets `delta_luma_weight_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_luma_weight_l0(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l0(segment, 0L, value); }
    /// Sets `delta_luma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(@CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l0(this.segment(), value); return this; }

    /// {@return `luma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_offset_l0(MemorySegment segment, long index) { return (byte) VH_luma_offset_l0.get(segment, 0L, index); }
    /// {@return `luma_offset_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_offset_l0(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_luma_offset_l0(segment, 0L); }
    /// {@return `luma_offset_l0`}
    public @CType("int8_t [ ]") byte luma_offset_l0() { return StdVideoEncodeH265WeightTable.get_luma_offset_l0(this.segment()); }
    /// Sets `luma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_offset_l0(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_offset_l0.set(segment, 0L, index, value); }
    /// Sets `luma_offset_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_offset_l0(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l0(segment, 0L, value); }
    /// Sets `luma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l0(@CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l0(this.segment(), value); return this; }

    /// {@return `delta_chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_weight_l0(MemorySegment segment, long index) { return (byte) VH_delta_chroma_weight_l0.get(segment, 0L, index); }
    /// {@return `delta_chroma_weight_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_weight_l0(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l0(segment, 0L); }
    /// {@return `delta_chroma_weight_l0`}
    public @CType("int8_t [ ][ ]") byte delta_chroma_weight_l0() { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l0(this.segment()); }
    /// Sets `delta_chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_chroma_weight_l0(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_delta_chroma_weight_l0.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_weight_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_chroma_weight_l0(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l0(segment, 0L, value); }
    /// Sets `delta_chroma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l0(this.segment(), value); return this; }

    /// {@return `delta_chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_offset_l0(MemorySegment segment, long index) { return (byte) VH_delta_chroma_offset_l0.get(segment, 0L, index); }
    /// {@return `delta_chroma_offset_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_offset_l0(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l0(segment, 0L); }
    /// {@return `delta_chroma_offset_l0`}
    public @CType("int8_t [ ][ ]") byte delta_chroma_offset_l0() { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l0(this.segment()); }
    /// Sets `delta_chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_chroma_offset_l0(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_delta_chroma_offset_l0.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_offset_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_chroma_offset_l0(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l0(segment, 0L, value); }
    /// Sets `delta_chroma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l0(this.segment(), value); return this; }

    /// {@return `delta_luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_delta_luma_weight_l1(MemorySegment segment, long index) { return (byte) VH_delta_luma_weight_l1.get(segment, 0L, index); }
    /// {@return `delta_luma_weight_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_delta_luma_weight_l1(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l1(segment, 0L); }
    /// {@return `delta_luma_weight_l1`}
    public @CType("int8_t [ ]") byte delta_luma_weight_l1() { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l1(this.segment()); }
    /// Sets `delta_luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_luma_weight_l1(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_delta_luma_weight_l1.set(segment, 0L, index, value); }
    /// Sets `delta_luma_weight_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_luma_weight_l1(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l1(segment, 0L, value); }
    /// Sets `delta_luma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(@CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l1(this.segment(), value); return this; }

    /// {@return `luma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_offset_l1(MemorySegment segment, long index) { return (byte) VH_luma_offset_l1.get(segment, 0L, index); }
    /// {@return `luma_offset_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_offset_l1(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_luma_offset_l1(segment, 0L); }
    /// {@return `luma_offset_l1`}
    public @CType("int8_t [ ]") byte luma_offset_l1() { return StdVideoEncodeH265WeightTable.get_luma_offset_l1(this.segment()); }
    /// Sets `luma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_offset_l1(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_offset_l1.set(segment, 0L, index, value); }
    /// Sets `luma_offset_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_offset_l1(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l1(segment, 0L, value); }
    /// Sets `luma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l1(@CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l1(this.segment(), value); return this; }

    /// {@return `delta_chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_weight_l1(MemorySegment segment, long index) { return (byte) VH_delta_chroma_weight_l1.get(segment, 0L, index); }
    /// {@return `delta_chroma_weight_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_weight_l1(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l1(segment, 0L); }
    /// {@return `delta_chroma_weight_l1`}
    public @CType("int8_t [ ][ ]") byte delta_chroma_weight_l1() { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l1(this.segment()); }
    /// Sets `delta_chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_chroma_weight_l1(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_delta_chroma_weight_l1.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_weight_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_chroma_weight_l1(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l1(segment, 0L, value); }
    /// Sets `delta_chroma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l1(this.segment(), value); return this; }

    /// {@return `delta_chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_offset_l1(MemorySegment segment, long index) { return (byte) VH_delta_chroma_offset_l1.get(segment, 0L, index); }
    /// {@return `delta_chroma_offset_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_delta_chroma_offset_l1(MemorySegment segment) { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l1(segment, 0L); }
    /// {@return `delta_chroma_offset_l1`}
    public @CType("int8_t [ ][ ]") byte delta_chroma_offset_l1() { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l1(this.segment()); }
    /// Sets `delta_chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_chroma_offset_l1(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_delta_chroma_offset_l1.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_offset_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_chroma_offset_l1(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l1(segment, 0L, value); }
    /// Sets `delta_chroma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l1(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265WeightTable].
    public static final class Buffer extends StdVideoEncodeH265WeightTable {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265WeightTable.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265WeightTable`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265WeightTable`
        public StdVideoEncodeH265WeightTable asSlice(long index) { return new StdVideoEncodeH265WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265WeightTable`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265WeightTable`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH265WeightTable.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH265WeightTableFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265WeightTable.set_flags(this.segment(), index, value); return this; }

        /// {@return `luma_log2_weight_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte luma_log2_weight_denomAt(long index) { return StdVideoEncodeH265WeightTable.get_luma_log2_weight_denom(this.segment(), index); }
        /// Sets `luma_log2_weight_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_log2_weight_denomAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265WeightTable.set_luma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_log2_weight_denom` at the given index}
        /// @param index the index
        public @CType("int8_t") byte delta_chroma_log2_weight_denomAt(long index) { return StdVideoEncodeH265WeightTable.get_delta_chroma_log2_weight_denom(this.segment(), index); }
        /// Sets `delta_chroma_log2_weight_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_log2_weight_denomAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `delta_luma_weight_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte delta_luma_weight_l0At(long index) { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l0(this.segment(), index); }
        /// Sets `delta_luma_weight_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l0At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l0(this.segment(), index, value); return this; }

        /// {@return `luma_offset_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_offset_l0At(long index) { return StdVideoEncodeH265WeightTable.get_luma_offset_l0(this.segment(), index); }
        /// Sets `luma_offset_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l0At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l0(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_weight_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte delta_chroma_weight_l0At(long index) { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l0(this.segment(), index); }
        /// Sets `delta_chroma_weight_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l0At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l0(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_offset_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte delta_chroma_offset_l0At(long index) { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l0(this.segment(), index); }
        /// Sets `delta_chroma_offset_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l0At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l0(this.segment(), index, value); return this; }

        /// {@return `delta_luma_weight_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte delta_luma_weight_l1At(long index) { return StdVideoEncodeH265WeightTable.get_delta_luma_weight_l1(this.segment(), index); }
        /// Sets `delta_luma_weight_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l1At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_luma_weight_l1(this.segment(), index, value); return this; }

        /// {@return `luma_offset_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_offset_l1At(long index) { return StdVideoEncodeH265WeightTable.get_luma_offset_l1(this.segment(), index); }
        /// Sets `luma_offset_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l1At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH265WeightTable.set_luma_offset_l1(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_weight_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte delta_chroma_weight_l1At(long index) { return StdVideoEncodeH265WeightTable.get_delta_chroma_weight_l1(this.segment(), index); }
        /// Sets `delta_chroma_weight_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l1At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_weight_l1(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_offset_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte delta_chroma_offset_l1At(long index) { return StdVideoEncodeH265WeightTable.get_delta_chroma_offset_l1(this.segment(), index); }
        /// Sets `delta_chroma_offset_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l1At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH265WeightTable.set_delta_chroma_offset_l1(this.segment(), index, value); return this; }

    }
}
