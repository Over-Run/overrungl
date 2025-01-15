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
/// ### BitDepth
/// [VarHandle][#VH_BitDepth] - [Getter][#BitDepth()] - [Setter][#BitDepth(byte)]
/// ### subsampling_x
/// [VarHandle][#VH_subsampling_x] - [Getter][#subsampling_x()] - [Setter][#subsampling_x(byte)]
/// ### subsampling_y
/// [VarHandle][#VH_subsampling_y] - [Getter][#subsampling_y()] - [Setter][#subsampling_y(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### color_primaries
/// [VarHandle][#VH_color_primaries] - [Getter][#color_primaries()] - [Setter][#color_primaries(int)]
/// ### transfer_characteristics
/// [VarHandle][#VH_transfer_characteristics] - [Getter][#transfer_characteristics()] - [Setter][#transfer_characteristics(int)]
/// ### matrix_coefficients
/// [VarHandle][#VH_matrix_coefficients] - [Getter][#matrix_coefficients()] - [Setter][#matrix_coefficients(int)]
/// ### chroma_sample_position
/// [VarHandle][#VH_chroma_sample_position] - [Getter][#chroma_sample_position()] - [Setter][#chroma_sample_position(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1ColorConfig {
///     StdVideoAV1ColorConfigFlags flags;
///     uint8_t BitDepth;
///     uint8_t subsampling_x;
///     uint8_t subsampling_y;
///     uint8_t reserved1;
///     StdVideoAV1ColorPrimaries color_primaries;
///     StdVideoAV1TransferCharacteristics transfer_characteristics;
///     StdVideoAV1MatrixCoefficients matrix_coefficients;
///     StdVideoAV1ChromaSamplePosition chroma_sample_position;
/// } StdVideoAV1ColorConfig;
/// ```
public sealed class StdVideoAV1ColorConfig extends Struct {
    /// The struct layout of `StdVideoAV1ColorConfig`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1ColorConfigFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("BitDepth"),
        ValueLayout.JAVA_BYTE.withName("subsampling_x"),
        ValueLayout.JAVA_BYTE.withName("subsampling_y"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("color_primaries"),
        ValueLayout.JAVA_INT.withName("transfer_characteristics"),
        ValueLayout.JAVA_INT.withName("matrix_coefficients"),
        ValueLayout.JAVA_INT.withName("chroma_sample_position")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `BitDepth` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_BitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BitDepth"));
    /// The [VarHandle] of `subsampling_x` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_subsampling_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampling_x"));
    /// The [VarHandle] of `subsampling_y` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_subsampling_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampling_y"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `color_primaries` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_color_primaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_primaries"));
    /// The [VarHandle] of `transfer_characteristics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transfer_characteristics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transfer_characteristics"));
    /// The [VarHandle] of `matrix_coefficients` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_matrix_coefficients = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coefficients"));
    /// The [VarHandle] of `chroma_sample_position` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_sample_position = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_position"));

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1ColorConfig(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfig of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1ColorConfig(segment); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfig ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1ColorConfig(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1ColorConfig` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1ColorConfig`
    public static StdVideoAV1ColorConfig alloc(SegmentAllocator allocator) { return new StdVideoAV1ColorConfig(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1ColorConfig` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1ColorConfig`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1ColorConfig` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1ColorConfig`
    public static StdVideoAV1ColorConfig allocInit(SegmentAllocator allocator, @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment flags, @CType("uint8_t") byte BitDepth, @CType("uint8_t") byte subsampling_x, @CType("uint8_t") byte subsampling_y, @CType("uint8_t") byte reserved1, @CType("StdVideoAV1ColorPrimaries") int color_primaries, @CType("StdVideoAV1TransferCharacteristics") int transfer_characteristics, @CType("StdVideoAV1MatrixCoefficients") int matrix_coefficients, @CType("StdVideoAV1ChromaSamplePosition") int chroma_sample_position) { return alloc(allocator).flags(flags).BitDepth(BitDepth).subsampling_x(subsampling_x).subsampling_y(subsampling_y).reserved1(reserved1).color_primaries(color_primaries).transfer_characteristics(transfer_characteristics).matrix_coefficients(matrix_coefficients).chroma_sample_position(chroma_sample_position); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1ColorConfig copyFrom(StdVideoAV1ColorConfig src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1ColorConfig.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1ColorConfig.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1ColorConfig.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig flags(@CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1ColorConfig.set_flags(this.segment(), value); return this; }

    /// {@return `BitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_BitDepth(MemorySegment segment, long index) { return (byte) VH_BitDepth.get(segment, 0L, index); }
    /// {@return `BitDepth`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_BitDepth(MemorySegment segment) { return StdVideoAV1ColorConfig.get_BitDepth(segment, 0L); }
    /// {@return `BitDepth`}
    public @CType("uint8_t") byte BitDepth() { return StdVideoAV1ColorConfig.get_BitDepth(this.segment()); }
    /// Sets `BitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_BitDepth(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_BitDepth.set(segment, 0L, index, value); }
    /// Sets `BitDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_BitDepth(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_BitDepth(segment, 0L, value); }
    /// Sets `BitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig BitDepth(@CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_BitDepth(this.segment(), value); return this; }

    /// {@return `subsampling_x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_subsampling_x(MemorySegment segment, long index) { return (byte) VH_subsampling_x.get(segment, 0L, index); }
    /// {@return `subsampling_x`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_subsampling_x(MemorySegment segment) { return StdVideoAV1ColorConfig.get_subsampling_x(segment, 0L); }
    /// {@return `subsampling_x`}
    public @CType("uint8_t") byte subsampling_x() { return StdVideoAV1ColorConfig.get_subsampling_x(this.segment()); }
    /// Sets `subsampling_x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subsampling_x(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_subsampling_x.set(segment, 0L, index, value); }
    /// Sets `subsampling_x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subsampling_x(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_x(segment, 0L, value); }
    /// Sets `subsampling_x` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_x(@CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_x(this.segment(), value); return this; }

    /// {@return `subsampling_y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_subsampling_y(MemorySegment segment, long index) { return (byte) VH_subsampling_y.get(segment, 0L, index); }
    /// {@return `subsampling_y`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_subsampling_y(MemorySegment segment) { return StdVideoAV1ColorConfig.get_subsampling_y(segment, 0L); }
    /// {@return `subsampling_y`}
    public @CType("uint8_t") byte subsampling_y() { return StdVideoAV1ColorConfig.get_subsampling_y(this.segment()); }
    /// Sets `subsampling_y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subsampling_y(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_subsampling_y.set(segment, 0L, index, value); }
    /// Sets `subsampling_y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subsampling_y(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_y(segment, 0L, value); }
    /// Sets `subsampling_y` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_y(@CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_y(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoAV1ColorConfig.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoAV1ColorConfig.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig reserved1(@CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_reserved1(this.segment(), value); return this; }

    /// {@return `color_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1ColorPrimaries") int get_color_primaries(MemorySegment segment, long index) { return (int) VH_color_primaries.get(segment, 0L, index); }
    /// {@return `color_primaries`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1ColorPrimaries") int get_color_primaries(MemorySegment segment) { return StdVideoAV1ColorConfig.get_color_primaries(segment, 0L); }
    /// {@return `color_primaries`}
    public @CType("StdVideoAV1ColorPrimaries") int color_primaries() { return StdVideoAV1ColorConfig.get_color_primaries(this.segment()); }
    /// Sets `color_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color_primaries(MemorySegment segment, long index, @CType("StdVideoAV1ColorPrimaries") int value) { VH_color_primaries.set(segment, 0L, index, value); }
    /// Sets `color_primaries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color_primaries(MemorySegment segment, @CType("StdVideoAV1ColorPrimaries") int value) { StdVideoAV1ColorConfig.set_color_primaries(segment, 0L, value); }
    /// Sets `color_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig color_primaries(@CType("StdVideoAV1ColorPrimaries") int value) { StdVideoAV1ColorConfig.set_color_primaries(this.segment(), value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1TransferCharacteristics") int get_transfer_characteristics(MemorySegment segment, long index) { return (int) VH_transfer_characteristics.get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1TransferCharacteristics") int get_transfer_characteristics(MemorySegment segment) { return StdVideoAV1ColorConfig.get_transfer_characteristics(segment, 0L); }
    /// {@return `transfer_characteristics`}
    public @CType("StdVideoAV1TransferCharacteristics") int transfer_characteristics() { return StdVideoAV1ColorConfig.get_transfer_characteristics(this.segment()); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, long index, @CType("StdVideoAV1TransferCharacteristics") int value) { VH_transfer_characteristics.set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, @CType("StdVideoAV1TransferCharacteristics") int value) { StdVideoAV1ColorConfig.set_transfer_characteristics(segment, 0L, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig transfer_characteristics(@CType("StdVideoAV1TransferCharacteristics") int value) { StdVideoAV1ColorConfig.set_transfer_characteristics(this.segment(), value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1MatrixCoefficients") int get_matrix_coefficients(MemorySegment segment, long index) { return (int) VH_matrix_coefficients.get(segment, 0L, index); }
    /// {@return `matrix_coefficients`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1MatrixCoefficients") int get_matrix_coefficients(MemorySegment segment) { return StdVideoAV1ColorConfig.get_matrix_coefficients(segment, 0L); }
    /// {@return `matrix_coefficients`}
    public @CType("StdVideoAV1MatrixCoefficients") int matrix_coefficients() { return StdVideoAV1ColorConfig.get_matrix_coefficients(this.segment()); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matrix_coefficients(MemorySegment segment, long index, @CType("StdVideoAV1MatrixCoefficients") int value) { VH_matrix_coefficients.set(segment, 0L, index, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matrix_coefficients(MemorySegment segment, @CType("StdVideoAV1MatrixCoefficients") int value) { StdVideoAV1ColorConfig.set_matrix_coefficients(segment, 0L, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig matrix_coefficients(@CType("StdVideoAV1MatrixCoefficients") int value) { StdVideoAV1ColorConfig.set_matrix_coefficients(this.segment(), value); return this; }

    /// {@return `chroma_sample_position` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1ChromaSamplePosition") int get_chroma_sample_position(MemorySegment segment, long index) { return (int) VH_chroma_sample_position.get(segment, 0L, index); }
    /// {@return `chroma_sample_position`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1ChromaSamplePosition") int get_chroma_sample_position(MemorySegment segment) { return StdVideoAV1ColorConfig.get_chroma_sample_position(segment, 0L); }
    /// {@return `chroma_sample_position`}
    public @CType("StdVideoAV1ChromaSamplePosition") int chroma_sample_position() { return StdVideoAV1ColorConfig.get_chroma_sample_position(this.segment()); }
    /// Sets `chroma_sample_position` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_sample_position(MemorySegment segment, long index, @CType("StdVideoAV1ChromaSamplePosition") int value) { VH_chroma_sample_position.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_position` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_sample_position(MemorySegment segment, @CType("StdVideoAV1ChromaSamplePosition") int value) { StdVideoAV1ColorConfig.set_chroma_sample_position(segment, 0L, value); }
    /// Sets `chroma_sample_position` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig chroma_sample_position(@CType("StdVideoAV1ChromaSamplePosition") int value) { StdVideoAV1ColorConfig.set_chroma_sample_position(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1ColorConfig].
    public static final class Buffer extends StdVideoAV1ColorConfig {
        private final long elementCount;

        /// Creates `StdVideoAV1ColorConfig.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1ColorConfig`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1ColorConfig`
        public StdVideoAV1ColorConfig asSlice(long index) { return new StdVideoAV1ColorConfig(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1ColorConfig`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1ColorConfig`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1ColorConfig.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoAV1ColorConfigFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1ColorConfig.set_flags(this.segment(), index, value); return this; }

        /// {@return `BitDepth` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte BitDepthAt(long index) { return StdVideoAV1ColorConfig.get_BitDepth(this.segment(), index); }
        /// Sets `BitDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer BitDepthAt(long index, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_BitDepth(this.segment(), index, value); return this; }

        /// {@return `subsampling_x` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte subsampling_xAt(long index) { return StdVideoAV1ColorConfig.get_subsampling_x(this.segment(), index); }
        /// Sets `subsampling_x` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subsampling_xAt(long index, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_x(this.segment(), index, value); return this; }

        /// {@return `subsampling_y` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte subsampling_yAt(long index) { return StdVideoAV1ColorConfig.get_subsampling_y(this.segment(), index); }
        /// Sets `subsampling_y` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subsampling_yAt(long index, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_subsampling_y(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoAV1ColorConfig.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoAV1ColorConfig.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `color_primaries` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1ColorPrimaries") int color_primariesAt(long index) { return StdVideoAV1ColorConfig.get_color_primaries(this.segment(), index); }
        /// Sets `color_primaries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer color_primariesAt(long index, @CType("StdVideoAV1ColorPrimaries") int value) { StdVideoAV1ColorConfig.set_color_primaries(this.segment(), index, value); return this; }

        /// {@return `transfer_characteristics` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1TransferCharacteristics") int transfer_characteristicsAt(long index) { return StdVideoAV1ColorConfig.get_transfer_characteristics(this.segment(), index); }
        /// Sets `transfer_characteristics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transfer_characteristicsAt(long index, @CType("StdVideoAV1TransferCharacteristics") int value) { StdVideoAV1ColorConfig.set_transfer_characteristics(this.segment(), index, value); return this; }

        /// {@return `matrix_coefficients` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1MatrixCoefficients") int matrix_coefficientsAt(long index) { return StdVideoAV1ColorConfig.get_matrix_coefficients(this.segment(), index); }
        /// Sets `matrix_coefficients` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer matrix_coefficientsAt(long index, @CType("StdVideoAV1MatrixCoefficients") int value) { StdVideoAV1ColorConfig.set_matrix_coefficients(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_position` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1ChromaSamplePosition") int chroma_sample_positionAt(long index) { return StdVideoAV1ColorConfig.get_chroma_sample_position(this.segment(), index); }
        /// Sets `chroma_sample_position` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_positionAt(long index, @CType("StdVideoAV1ChromaSamplePosition") int value) { StdVideoAV1ColorConfig.set_chroma_sample_position(this.segment(), index, value); return this; }

    }
}
