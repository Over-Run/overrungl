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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### luma_log2_weight_denom
/// [VarHandle][#VH_luma_log2_weight_denom] - [Getter][#luma_log2_weight_denom()] - [Setter][#luma_log2_weight_denom(byte)]
/// ### chroma_log2_weight_denom
/// [VarHandle][#VH_chroma_log2_weight_denom] - [Getter][#chroma_log2_weight_denom()] - [Setter][#chroma_log2_weight_denom(byte)]
/// ### luma_weight_l0
/// [VarHandle][#VH_luma_weight_l0] - [Getter][#luma_weight_l0()] - [Setter][#luma_weight_l0(byte)]
/// ### luma_offset_l0
/// [VarHandle][#VH_luma_offset_l0] - [Getter][#luma_offset_l0()] - [Setter][#luma_offset_l0(byte)]
/// ### chroma_weight_l0
/// [VarHandle][#VH_chroma_weight_l0] - [Getter][#chroma_weight_l0()] - [Setter][#chroma_weight_l0(byte)]
/// ### chroma_offset_l0
/// [VarHandle][#VH_chroma_offset_l0] - [Getter][#chroma_offset_l0()] - [Setter][#chroma_offset_l0(byte)]
/// ### luma_weight_l1
/// [VarHandle][#VH_luma_weight_l1] - [Getter][#luma_weight_l1()] - [Setter][#luma_weight_l1(byte)]
/// ### luma_offset_l1
/// [VarHandle][#VH_luma_offset_l1] - [Getter][#luma_offset_l1()] - [Setter][#luma_offset_l1(byte)]
/// ### chroma_weight_l1
/// [VarHandle][#VH_chroma_weight_l1] - [Getter][#chroma_weight_l1()] - [Setter][#chroma_weight_l1(byte)]
/// ### chroma_offset_l1
/// [VarHandle][#VH_chroma_offset_l1] - [Getter][#chroma_offset_l1()] - [Setter][#chroma_offset_l1(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264WeightTable {
///     StdVideoEncodeH264WeightTableFlags flags;
///     uint8_t luma_log2_weight_denom;
///     uint8_t chroma_log2_weight_denom;
///     int8_t [ ] luma_weight_l0;
///     int8_t [ ] luma_offset_l0;
///     int8_t [ ][ ] chroma_weight_l0;
///     int8_t [ ][ ] chroma_offset_l0;
///     int8_t [ ] luma_weight_l1;
///     int8_t [ ] luma_offset_l1;
///     int8_t [ ][ ] chroma_weight_l1;
///     int8_t [ ][ ] chroma_offset_l1;
/// } StdVideoEncodeH264WeightTable;
/// ```
public sealed class StdVideoEncodeH264WeightTable extends Struct {
    /// The struct layout of `StdVideoEncodeH264WeightTable`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH264WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("chroma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("luma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("chroma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("chroma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l1"),
        ValueLayout.JAVA_BYTE.withName("chroma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("chroma_offset_l1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `luma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_log2_weight_denom"));
    /// The [VarHandle] of `chroma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_log2_weight_denom"));
    /// The [VarHandle] of `luma_weight_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0"));
    /// The [VarHandle] of `luma_offset_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l0"));
    /// The [VarHandle] of `chroma_weight_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0"));
    /// The [VarHandle] of `chroma_offset_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l0"));
    /// The [VarHandle] of `luma_weight_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1"));
    /// The [VarHandle] of `luma_offset_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l1"));
    /// The [VarHandle] of `chroma_weight_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1"));
    /// The [VarHandle] of `chroma_offset_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l1"));

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264WeightTable(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264WeightTable of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264WeightTable ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH264WeightTable` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264WeightTable`
    public static StdVideoEncodeH264WeightTable alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264WeightTable(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264WeightTable` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264WeightTable`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264WeightTable` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264WeightTable`
    public static StdVideoEncodeH264WeightTable allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment flags, @CType("uint8_t") byte luma_log2_weight_denom, @CType("uint8_t") byte chroma_log2_weight_denom, @CType("int8_t [ ]") byte luma_weight_l0, @CType("int8_t [ ]") byte luma_offset_l0, @CType("int8_t [ ][ ]") byte chroma_weight_l0, @CType("int8_t [ ][ ]") byte chroma_offset_l0, @CType("int8_t [ ]") byte luma_weight_l1, @CType("int8_t [ ]") byte luma_offset_l1, @CType("int8_t [ ][ ]") byte chroma_weight_l1, @CType("int8_t [ ][ ]") byte chroma_offset_l1) { return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).chroma_log2_weight_denom(chroma_log2_weight_denom).luma_weight_l0(luma_weight_l0).luma_offset_l0(luma_offset_l0).chroma_weight_l0(chroma_weight_l0).chroma_offset_l0(chroma_offset_l0).luma_weight_l1(luma_weight_l1).luma_offset_l1(luma_offset_l1).chroma_weight_l1(chroma_weight_l1).chroma_offset_l1(chroma_offset_l1); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264WeightTable copyFrom(StdVideoEncodeH264WeightTable src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment flags() { return StdVideoEncodeH264WeightTable.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment value) { StdVideoEncodeH264WeightTable.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable flags(@CType("StdVideoEncodeH264WeightTableFlags") MemorySegment value) { StdVideoEncodeH264WeightTable.set_flags(this.segment(), value); return this; }

    /// {@return `luma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_luma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_luma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `luma_log2_weight_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_luma_log2_weight_denom(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_luma_log2_weight_denom(segment, 0L); }
    /// {@return `luma_log2_weight_denom`}
    public @CType("uint8_t") byte luma_log2_weight_denom() { return StdVideoEncodeH264WeightTable.get_luma_log2_weight_denom(this.segment()); }
    /// Sets `luma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_log2_weight_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_luma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `luma_log2_weight_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_log2_weight_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_luma_log2_weight_denom(segment, 0L, value); }
    /// Sets `luma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(@CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_luma_log2_weight_denom(this.segment(), value); return this; }

    /// {@return `chroma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_chroma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `chroma_log2_weight_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_log2_weight_denom(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_chroma_log2_weight_denom(segment, 0L); }
    /// {@return `chroma_log2_weight_denom`}
    public @CType("uint8_t") byte chroma_log2_weight_denom() { return StdVideoEncodeH264WeightTable.get_chroma_log2_weight_denom(this.segment()); }
    /// Sets `chroma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_log2_weight_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `chroma_log2_weight_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_log2_weight_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_chroma_log2_weight_denom(segment, 0L, value); }
    /// Sets `chroma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(@CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_chroma_log2_weight_denom(this.segment(), value); return this; }

    /// {@return `luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_weight_l0(MemorySegment segment, long index) { return (byte) VH_luma_weight_l0.get(segment, 0L, index); }
    /// {@return `luma_weight_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_weight_l0(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_luma_weight_l0(segment, 0L); }
    /// {@return `luma_weight_l0`}
    public @CType("int8_t [ ]") byte luma_weight_l0() { return StdVideoEncodeH264WeightTable.get_luma_weight_l0(this.segment()); }
    /// Sets `luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_weight_l0(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_weight_l0.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_weight_l0(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l0(segment, 0L, value); }
    /// Sets `luma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l0(@CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l0(this.segment(), value); return this; }

    /// {@return `luma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_offset_l0(MemorySegment segment, long index) { return (byte) VH_luma_offset_l0.get(segment, 0L, index); }
    /// {@return `luma_offset_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_offset_l0(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_luma_offset_l0(segment, 0L); }
    /// {@return `luma_offset_l0`}
    public @CType("int8_t [ ]") byte luma_offset_l0() { return StdVideoEncodeH264WeightTable.get_luma_offset_l0(this.segment()); }
    /// Sets `luma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_offset_l0(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_offset_l0.set(segment, 0L, index, value); }
    /// Sets `luma_offset_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_offset_l0(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l0(segment, 0L, value); }
    /// Sets `luma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_offset_l0(@CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l0(this.segment(), value); return this; }

    /// {@return `chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_chroma_weight_l0(MemorySegment segment, long index) { return (byte) VH_chroma_weight_l0.get(segment, 0L, index); }
    /// {@return `chroma_weight_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_chroma_weight_l0(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_chroma_weight_l0(segment, 0L); }
    /// {@return `chroma_weight_l0`}
    public @CType("int8_t [ ][ ]") byte chroma_weight_l0() { return StdVideoEncodeH264WeightTable.get_chroma_weight_l0(this.segment()); }
    /// Sets `chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_weight_l0(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_chroma_weight_l0.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_weight_l0(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l0(segment, 0L, value); }
    /// Sets `chroma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l0(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l0(this.segment(), value); return this; }

    /// {@return `chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_chroma_offset_l0(MemorySegment segment, long index) { return (byte) VH_chroma_offset_l0.get(segment, 0L, index); }
    /// {@return `chroma_offset_l0`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_chroma_offset_l0(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_chroma_offset_l0(segment, 0L); }
    /// {@return `chroma_offset_l0`}
    public @CType("int8_t [ ][ ]") byte chroma_offset_l0() { return StdVideoEncodeH264WeightTable.get_chroma_offset_l0(this.segment()); }
    /// Sets `chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_offset_l0(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_chroma_offset_l0.set(segment, 0L, index, value); }
    /// Sets `chroma_offset_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_offset_l0(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l0(segment, 0L, value); }
    /// Sets `chroma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l0(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l0(this.segment(), value); return this; }

    /// {@return `luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_weight_l1(MemorySegment segment, long index) { return (byte) VH_luma_weight_l1.get(segment, 0L, index); }
    /// {@return `luma_weight_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_weight_l1(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_luma_weight_l1(segment, 0L); }
    /// {@return `luma_weight_l1`}
    public @CType("int8_t [ ]") byte luma_weight_l1() { return StdVideoEncodeH264WeightTable.get_luma_weight_l1(this.segment()); }
    /// Sets `luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_weight_l1(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_weight_l1.set(segment, 0L, index, value); }
    /// Sets `luma_weight_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_weight_l1(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l1(segment, 0L, value); }
    /// Sets `luma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l1(@CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l1(this.segment(), value); return this; }

    /// {@return `luma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_luma_offset_l1(MemorySegment segment, long index) { return (byte) VH_luma_offset_l1.get(segment, 0L, index); }
    /// {@return `luma_offset_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_luma_offset_l1(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_luma_offset_l1(segment, 0L); }
    /// {@return `luma_offset_l1`}
    public @CType("int8_t [ ]") byte luma_offset_l1() { return StdVideoEncodeH264WeightTable.get_luma_offset_l1(this.segment()); }
    /// Sets `luma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_offset_l1(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_luma_offset_l1.set(segment, 0L, index, value); }
    /// Sets `luma_offset_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_offset_l1(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l1(segment, 0L, value); }
    /// Sets `luma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_offset_l1(@CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l1(this.segment(), value); return this; }

    /// {@return `chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_chroma_weight_l1(MemorySegment segment, long index) { return (byte) VH_chroma_weight_l1.get(segment, 0L, index); }
    /// {@return `chroma_weight_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_chroma_weight_l1(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_chroma_weight_l1(segment, 0L); }
    /// {@return `chroma_weight_l1`}
    public @CType("int8_t [ ][ ]") byte chroma_weight_l1() { return StdVideoEncodeH264WeightTable.get_chroma_weight_l1(this.segment()); }
    /// Sets `chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_weight_l1(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_chroma_weight_l1.set(segment, 0L, index, value); }
    /// Sets `chroma_weight_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_weight_l1(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l1(segment, 0L, value); }
    /// Sets `chroma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l1(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l1(this.segment(), value); return this; }

    /// {@return `chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ][ ]") byte get_chroma_offset_l1(MemorySegment segment, long index) { return (byte) VH_chroma_offset_l1.get(segment, 0L, index); }
    /// {@return `chroma_offset_l1`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ][ ]") byte get_chroma_offset_l1(MemorySegment segment) { return StdVideoEncodeH264WeightTable.get_chroma_offset_l1(segment, 0L); }
    /// {@return `chroma_offset_l1`}
    public @CType("int8_t [ ][ ]") byte chroma_offset_l1() { return StdVideoEncodeH264WeightTable.get_chroma_offset_l1(this.segment()); }
    /// Sets `chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_offset_l1(MemorySegment segment, long index, @CType("int8_t [ ][ ]") byte value) { VH_chroma_offset_l1.set(segment, 0L, index, value); }
    /// Sets `chroma_offset_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_offset_l1(MemorySegment segment, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l1(segment, 0L, value); }
    /// Sets `chroma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l1(@CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l1(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH264WeightTable].
    public static final class Buffer extends StdVideoEncodeH264WeightTable {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264WeightTable.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264WeightTable`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264WeightTable`
        public StdVideoEncodeH264WeightTable asSlice(long index) { return new StdVideoEncodeH264WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264WeightTable`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264WeightTable`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment flagsAt(long index) { return StdVideoEncodeH264WeightTable.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH264WeightTableFlags") MemorySegment value) { StdVideoEncodeH264WeightTable.set_flags(this.segment(), index, value); return this; }

        /// {@return `luma_log2_weight_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte luma_log2_weight_denomAt(long index) { return StdVideoEncodeH264WeightTable.get_luma_log2_weight_denom(this.segment(), index); }
        /// Sets `luma_log2_weight_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_log2_weight_denomAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_luma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `chroma_log2_weight_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_log2_weight_denomAt(long index) { return StdVideoEncodeH264WeightTable.get_chroma_log2_weight_denom(this.segment(), index); }
        /// Sets `chroma_log2_weight_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_log2_weight_denomAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.set_chroma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `luma_weight_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_weight_l0At(long index) { return StdVideoEncodeH264WeightTable.get_luma_weight_l0(this.segment(), index); }
        /// Sets `luma_weight_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l0At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l0(this.segment(), index, value); return this; }

        /// {@return `luma_offset_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_offset_l0At(long index) { return StdVideoEncodeH264WeightTable.get_luma_offset_l0(this.segment(), index); }
        /// Sets `luma_offset_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l0At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l0(this.segment(), index, value); return this; }

        /// {@return `chroma_weight_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte chroma_weight_l0At(long index) { return StdVideoEncodeH264WeightTable.get_chroma_weight_l0(this.segment(), index); }
        /// Sets `chroma_weight_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l0At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l0(this.segment(), index, value); return this; }

        /// {@return `chroma_offset_l0` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte chroma_offset_l0At(long index) { return StdVideoEncodeH264WeightTable.get_chroma_offset_l0(this.segment(), index); }
        /// Sets `chroma_offset_l0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l0At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l0(this.segment(), index, value); return this; }

        /// {@return `luma_weight_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_weight_l1At(long index) { return StdVideoEncodeH264WeightTable.get_luma_weight_l1(this.segment(), index); }
        /// Sets `luma_weight_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l1At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_weight_l1(this.segment(), index, value); return this; }

        /// {@return `luma_offset_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte luma_offset_l1At(long index) { return StdVideoEncodeH264WeightTable.get_luma_offset_l1(this.segment(), index); }
        /// Sets `luma_offset_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l1At(long index, @CType("int8_t [ ]") byte value) { StdVideoEncodeH264WeightTable.set_luma_offset_l1(this.segment(), index, value); return this; }

        /// {@return `chroma_weight_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte chroma_weight_l1At(long index) { return StdVideoEncodeH264WeightTable.get_chroma_weight_l1(this.segment(), index); }
        /// Sets `chroma_weight_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l1At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_weight_l1(this.segment(), index, value); return this; }

        /// {@return `chroma_offset_l1` at the given index}
        /// @param index the index
        public @CType("int8_t [ ][ ]") byte chroma_offset_l1At(long index) { return StdVideoEncodeH264WeightTable.get_chroma_offset_l1(this.segment(), index); }
        /// Sets `chroma_offset_l1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l1At(long index, @CType("int8_t [ ][ ]") byte value) { StdVideoEncodeH264WeightTable.set_chroma_offset_l1(this.segment(), index, value); return this; }

    }
}
