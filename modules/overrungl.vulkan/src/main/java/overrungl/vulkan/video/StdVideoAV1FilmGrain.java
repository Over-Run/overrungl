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
/// ### grain_scaling_minus_8
/// [VarHandle][#VH_grain_scaling_minus_8] - [Getter][#grain_scaling_minus_8()] - [Setter][#grain_scaling_minus_8(byte)]
/// ### ar_coeff_lag
/// [VarHandle][#VH_ar_coeff_lag] - [Getter][#ar_coeff_lag()] - [Setter][#ar_coeff_lag(byte)]
/// ### ar_coeff_shift_minus_6
/// [VarHandle][#VH_ar_coeff_shift_minus_6] - [Getter][#ar_coeff_shift_minus_6()] - [Setter][#ar_coeff_shift_minus_6(byte)]
/// ### grain_scale_shift
/// [VarHandle][#VH_grain_scale_shift] - [Getter][#grain_scale_shift()] - [Setter][#grain_scale_shift(byte)]
/// ### grain_seed
/// [VarHandle][#VH_grain_seed] - [Getter][#grain_seed()] - [Setter][#grain_seed(short)]
/// ### film_grain_params_ref_idx
/// [VarHandle][#VH_film_grain_params_ref_idx] - [Getter][#film_grain_params_ref_idx()] - [Setter][#film_grain_params_ref_idx(byte)]
/// ### num_y_points
/// [VarHandle][#VH_num_y_points] - [Getter][#num_y_points()] - [Setter][#num_y_points(byte)]
/// ### point_y_value
/// [VarHandle][#VH_point_y_value] - [Getter][#point_y_value()] - [Setter][#point_y_value(byte)]
/// ### point_y_scaling
/// [VarHandle][#VH_point_y_scaling] - [Getter][#point_y_scaling()] - [Setter][#point_y_scaling(byte)]
/// ### num_cb_points
/// [VarHandle][#VH_num_cb_points] - [Getter][#num_cb_points()] - [Setter][#num_cb_points(byte)]
/// ### point_cb_value
/// [VarHandle][#VH_point_cb_value] - [Getter][#point_cb_value()] - [Setter][#point_cb_value(byte)]
/// ### point_cb_scaling
/// [VarHandle][#VH_point_cb_scaling] - [Getter][#point_cb_scaling()] - [Setter][#point_cb_scaling(byte)]
/// ### num_cr_points
/// [VarHandle][#VH_num_cr_points] - [Getter][#num_cr_points()] - [Setter][#num_cr_points(byte)]
/// ### point_cr_value
/// [VarHandle][#VH_point_cr_value] - [Getter][#point_cr_value()] - [Setter][#point_cr_value(byte)]
/// ### point_cr_scaling
/// [VarHandle][#VH_point_cr_scaling] - [Getter][#point_cr_scaling()] - [Setter][#point_cr_scaling(byte)]
/// ### ar_coeffs_y_plus_128
/// [VarHandle][#VH_ar_coeffs_y_plus_128] - [Getter][#ar_coeffs_y_plus_128()] - [Setter][#ar_coeffs_y_plus_128(byte)]
/// ### ar_coeffs_cb_plus_128
/// [VarHandle][#VH_ar_coeffs_cb_plus_128] - [Getter][#ar_coeffs_cb_plus_128()] - [Setter][#ar_coeffs_cb_plus_128(byte)]
/// ### ar_coeffs_cr_plus_128
/// [VarHandle][#VH_ar_coeffs_cr_plus_128] - [Getter][#ar_coeffs_cr_plus_128()] - [Setter][#ar_coeffs_cr_plus_128(byte)]
/// ### cb_mult
/// [VarHandle][#VH_cb_mult] - [Getter][#cb_mult()] - [Setter][#cb_mult(byte)]
/// ### cb_luma_mult
/// [VarHandle][#VH_cb_luma_mult] - [Getter][#cb_luma_mult()] - [Setter][#cb_luma_mult(byte)]
/// ### cb_offset
/// [VarHandle][#VH_cb_offset] - [Getter][#cb_offset()] - [Setter][#cb_offset(short)]
/// ### cr_mult
/// [VarHandle][#VH_cr_mult] - [Getter][#cr_mult()] - [Setter][#cr_mult(byte)]
/// ### cr_luma_mult
/// [VarHandle][#VH_cr_luma_mult] - [Getter][#cr_luma_mult()] - [Setter][#cr_luma_mult(byte)]
/// ### cr_offset
/// [VarHandle][#VH_cr_offset] - [Getter][#cr_offset()] - [Setter][#cr_offset(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1FilmGrain {
///     StdVideoAV1FilmGrainFlags flags;
///     uint8_t grain_scaling_minus_8;
///     uint8_t ar_coeff_lag;
///     uint8_t ar_coeff_shift_minus_6;
///     uint8_t grain_scale_shift;
///     uint16_t grain_seed;
///     uint8_t film_grain_params_ref_idx;
///     uint8_t num_y_points;
///     uint8_t [ ] point_y_value;
///     uint8_t [ ] point_y_scaling;
///     uint8_t num_cb_points;
///     uint8_t [ ] point_cb_value;
///     uint8_t [ ] point_cb_scaling;
///     uint8_t num_cr_points;
///     uint8_t [ ] point_cr_value;
///     uint8_t [ ] point_cr_scaling;
///     int8_t [ ] ar_coeffs_y_plus_128;
///     int8_t [ ] ar_coeffs_cb_plus_128;
///     int8_t [ ] ar_coeffs_cr_plus_128;
///     uint8_t cb_mult;
///     uint8_t cb_luma_mult;
///     uint16_t cb_offset;
///     uint8_t cr_mult;
///     uint8_t cr_luma_mult;
///     uint16_t cr_offset;
/// } StdVideoAV1FilmGrain;
/// ```
public sealed class StdVideoAV1FilmGrain extends Struct {
    /// The struct layout of `StdVideoAV1FilmGrain`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1FilmGrainFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("grain_scaling_minus_8"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_lag"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_shift_minus_6"),
        ValueLayout.JAVA_BYTE.withName("grain_scale_shift"),
        ValueLayout.JAVA_SHORT.withName("grain_seed"),
        ValueLayout.JAVA_BYTE.withName("film_grain_params_ref_idx"),
        ValueLayout.JAVA_BYTE.withName("num_y_points"),
        ValueLayout.JAVA_BYTE.withName("point_y_value"),
        ValueLayout.JAVA_BYTE.withName("point_y_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cb_points"),
        ValueLayout.JAVA_BYTE.withName("point_cb_value"),
        ValueLayout.JAVA_BYTE.withName("point_cb_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cr_points"),
        ValueLayout.JAVA_BYTE.withName("point_cr_value"),
        ValueLayout.JAVA_BYTE.withName("point_cr_scaling"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_y_plus_128"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_cb_plus_128"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_cr_plus_128"),
        ValueLayout.JAVA_BYTE.withName("cb_mult"),
        ValueLayout.JAVA_BYTE.withName("cb_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cb_offset"),
        ValueLayout.JAVA_BYTE.withName("cr_mult"),
        ValueLayout.JAVA_BYTE.withName("cr_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cr_offset")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `grain_scaling_minus_8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_grain_scaling_minus_8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_scaling_minus_8"));
    /// The [VarHandle] of `ar_coeff_lag` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ar_coeff_lag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeff_lag"));
    /// The [VarHandle] of `ar_coeff_shift_minus_6` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ar_coeff_shift_minus_6 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeff_shift_minus_6"));
    /// The [VarHandle] of `grain_scale_shift` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_grain_scale_shift = LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_scale_shift"));
    /// The [VarHandle] of `grain_seed` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_grain_seed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_seed"));
    /// The [VarHandle] of `film_grain_params_ref_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_film_grain_params_ref_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("film_grain_params_ref_idx"));
    /// The [VarHandle] of `num_y_points` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_y_points = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_y_points"));
    /// The [VarHandle] of `point_y_value` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_y_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_y_value"));
    /// The [VarHandle] of `point_y_scaling` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_y_scaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_y_scaling"));
    /// The [VarHandle] of `num_cb_points` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_cb_points = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_cb_points"));
    /// The [VarHandle] of `point_cb_value` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_cb_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cb_value"));
    /// The [VarHandle] of `point_cb_scaling` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_cb_scaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cb_scaling"));
    /// The [VarHandle] of `num_cr_points` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_cr_points = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_cr_points"));
    /// The [VarHandle] of `point_cr_value` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_cr_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cr_value"));
    /// The [VarHandle] of `point_cr_scaling` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_point_cr_scaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cr_scaling"));
    /// The [VarHandle] of `ar_coeffs_y_plus_128` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ar_coeffs_y_plus_128 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_y_plus_128"));
    /// The [VarHandle] of `ar_coeffs_cb_plus_128` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ar_coeffs_cb_plus_128 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_cb_plus_128"));
    /// The [VarHandle] of `ar_coeffs_cr_plus_128` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ar_coeffs_cr_plus_128 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_cr_plus_128"));
    /// The [VarHandle] of `cb_mult` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cb_mult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_mult"));
    /// The [VarHandle] of `cb_luma_mult` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cb_luma_mult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_luma_mult"));
    /// The [VarHandle] of `cb_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cb_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_offset"));
    /// The [VarHandle] of `cr_mult` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cr_mult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_mult"));
    /// The [VarHandle] of `cr_luma_mult` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cr_luma_mult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_luma_mult"));
    /// The [VarHandle] of `cr_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_cr_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_offset"));

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1FilmGrain(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrain of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1FilmGrain(segment); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrain ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1FilmGrain(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1FilmGrain` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrain`
    public static StdVideoAV1FilmGrain alloc(SegmentAllocator allocator) { return new StdVideoAV1FilmGrain(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1FilmGrain` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1FilmGrain`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1FilmGrain` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrain`
    public static StdVideoAV1FilmGrain allocInit(SegmentAllocator allocator, @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment flags, @CType("uint8_t") byte grain_scaling_minus_8, @CType("uint8_t") byte ar_coeff_lag, @CType("uint8_t") byte ar_coeff_shift_minus_6, @CType("uint8_t") byte grain_scale_shift, @CType("uint16_t") short grain_seed, @CType("uint8_t") byte film_grain_params_ref_idx, @CType("uint8_t") byte num_y_points, @CType("uint8_t [ ]") byte point_y_value, @CType("uint8_t [ ]") byte point_y_scaling, @CType("uint8_t") byte num_cb_points, @CType("uint8_t [ ]") byte point_cb_value, @CType("uint8_t [ ]") byte point_cb_scaling, @CType("uint8_t") byte num_cr_points, @CType("uint8_t [ ]") byte point_cr_value, @CType("uint8_t [ ]") byte point_cr_scaling, @CType("int8_t [ ]") byte ar_coeffs_y_plus_128, @CType("int8_t [ ]") byte ar_coeffs_cb_plus_128, @CType("int8_t [ ]") byte ar_coeffs_cr_plus_128, @CType("uint8_t") byte cb_mult, @CType("uint8_t") byte cb_luma_mult, @CType("uint16_t") short cb_offset, @CType("uint8_t") byte cr_mult, @CType("uint8_t") byte cr_luma_mult, @CType("uint16_t") short cr_offset) { return alloc(allocator).flags(flags).grain_scaling_minus_8(grain_scaling_minus_8).ar_coeff_lag(ar_coeff_lag).ar_coeff_shift_minus_6(ar_coeff_shift_minus_6).grain_scale_shift(grain_scale_shift).grain_seed(grain_seed).film_grain_params_ref_idx(film_grain_params_ref_idx).num_y_points(num_y_points).point_y_value(point_y_value).point_y_scaling(point_y_scaling).num_cb_points(num_cb_points).point_cb_value(point_cb_value).point_cb_scaling(point_cb_scaling).num_cr_points(num_cr_points).point_cr_value(point_cr_value).point_cr_scaling(point_cr_scaling).ar_coeffs_y_plus_128(ar_coeffs_y_plus_128).ar_coeffs_cb_plus_128(ar_coeffs_cb_plus_128).ar_coeffs_cr_plus_128(ar_coeffs_cr_plus_128).cb_mult(cb_mult).cb_luma_mult(cb_luma_mult).cb_offset(cb_offset).cr_mult(cr_mult).cr_luma_mult(cr_luma_mult).cr_offset(cr_offset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1FilmGrain copyFrom(StdVideoAV1FilmGrain src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1FilmGrain.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1FilmGrain.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1FilmGrain.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain flags(@CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1FilmGrain.set_flags(this.segment(), value); return this; }

    /// {@return `grain_scaling_minus_8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_grain_scaling_minus_8(MemorySegment segment, long index) { return (byte) VH_grain_scaling_minus_8.get(segment, 0L, index); }
    /// {@return `grain_scaling_minus_8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_grain_scaling_minus_8(MemorySegment segment) { return StdVideoAV1FilmGrain.get_grain_scaling_minus_8(segment, 0L); }
    /// {@return `grain_scaling_minus_8`}
    public @CType("uint8_t") byte grain_scaling_minus_8() { return StdVideoAV1FilmGrain.get_grain_scaling_minus_8(this.segment()); }
    /// Sets `grain_scaling_minus_8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_grain_scaling_minus_8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_grain_scaling_minus_8.set(segment, 0L, index, value); }
    /// Sets `grain_scaling_minus_8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_grain_scaling_minus_8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scaling_minus_8(segment, 0L, value); }
    /// Sets `grain_scaling_minus_8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scaling_minus_8(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scaling_minus_8(this.segment(), value); return this; }

    /// {@return `ar_coeff_lag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_ar_coeff_lag(MemorySegment segment, long index) { return (byte) VH_ar_coeff_lag.get(segment, 0L, index); }
    /// {@return `ar_coeff_lag`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_ar_coeff_lag(MemorySegment segment) { return StdVideoAV1FilmGrain.get_ar_coeff_lag(segment, 0L); }
    /// {@return `ar_coeff_lag`}
    public @CType("uint8_t") byte ar_coeff_lag() { return StdVideoAV1FilmGrain.get_ar_coeff_lag(this.segment()); }
    /// Sets `ar_coeff_lag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ar_coeff_lag(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_ar_coeff_lag.set(segment, 0L, index, value); }
    /// Sets `ar_coeff_lag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ar_coeff_lag(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_lag(segment, 0L, value); }
    /// Sets `ar_coeff_lag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_lag(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_lag(this.segment(), value); return this; }

    /// {@return `ar_coeff_shift_minus_6` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_ar_coeff_shift_minus_6(MemorySegment segment, long index) { return (byte) VH_ar_coeff_shift_minus_6.get(segment, 0L, index); }
    /// {@return `ar_coeff_shift_minus_6`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_ar_coeff_shift_minus_6(MemorySegment segment) { return StdVideoAV1FilmGrain.get_ar_coeff_shift_minus_6(segment, 0L); }
    /// {@return `ar_coeff_shift_minus_6`}
    public @CType("uint8_t") byte ar_coeff_shift_minus_6() { return StdVideoAV1FilmGrain.get_ar_coeff_shift_minus_6(this.segment()); }
    /// Sets `ar_coeff_shift_minus_6` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ar_coeff_shift_minus_6(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_ar_coeff_shift_minus_6.set(segment, 0L, index, value); }
    /// Sets `ar_coeff_shift_minus_6` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ar_coeff_shift_minus_6(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_shift_minus_6(segment, 0L, value); }
    /// Sets `ar_coeff_shift_minus_6` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_shift_minus_6(this.segment(), value); return this; }

    /// {@return `grain_scale_shift` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_grain_scale_shift(MemorySegment segment, long index) { return (byte) VH_grain_scale_shift.get(segment, 0L, index); }
    /// {@return `grain_scale_shift`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_grain_scale_shift(MemorySegment segment) { return StdVideoAV1FilmGrain.get_grain_scale_shift(segment, 0L); }
    /// {@return `grain_scale_shift`}
    public @CType("uint8_t") byte grain_scale_shift() { return StdVideoAV1FilmGrain.get_grain_scale_shift(this.segment()); }
    /// Sets `grain_scale_shift` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_grain_scale_shift(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_grain_scale_shift.set(segment, 0L, index, value); }
    /// Sets `grain_scale_shift` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_grain_scale_shift(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scale_shift(segment, 0L, value); }
    /// Sets `grain_scale_shift` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scale_shift(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scale_shift(this.segment(), value); return this; }

    /// {@return `grain_seed` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_grain_seed(MemorySegment segment, long index) { return (short) VH_grain_seed.get(segment, 0L, index); }
    /// {@return `grain_seed`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_grain_seed(MemorySegment segment) { return StdVideoAV1FilmGrain.get_grain_seed(segment, 0L); }
    /// {@return `grain_seed`}
    public @CType("uint16_t") short grain_seed() { return StdVideoAV1FilmGrain.get_grain_seed(this.segment()); }
    /// Sets `grain_seed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_grain_seed(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_grain_seed.set(segment, 0L, index, value); }
    /// Sets `grain_seed` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_grain_seed(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_grain_seed(segment, 0L, value); }
    /// Sets `grain_seed` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_seed(@CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_grain_seed(this.segment(), value); return this; }

    /// {@return `film_grain_params_ref_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_film_grain_params_ref_idx(MemorySegment segment, long index) { return (byte) VH_film_grain_params_ref_idx.get(segment, 0L, index); }
    /// {@return `film_grain_params_ref_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_film_grain_params_ref_idx(MemorySegment segment) { return StdVideoAV1FilmGrain.get_film_grain_params_ref_idx(segment, 0L); }
    /// {@return `film_grain_params_ref_idx`}
    public @CType("uint8_t") byte film_grain_params_ref_idx() { return StdVideoAV1FilmGrain.get_film_grain_params_ref_idx(this.segment()); }
    /// Sets `film_grain_params_ref_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_film_grain_params_ref_idx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_film_grain_params_ref_idx.set(segment, 0L, index, value); }
    /// Sets `film_grain_params_ref_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_film_grain_params_ref_idx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_film_grain_params_ref_idx(segment, 0L, value); }
    /// Sets `film_grain_params_ref_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain film_grain_params_ref_idx(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_film_grain_params_ref_idx(this.segment(), value); return this; }

    /// {@return `num_y_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_y_points(MemorySegment segment, long index) { return (byte) VH_num_y_points.get(segment, 0L, index); }
    /// {@return `num_y_points`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_y_points(MemorySegment segment) { return StdVideoAV1FilmGrain.get_num_y_points(segment, 0L); }
    /// {@return `num_y_points`}
    public @CType("uint8_t") byte num_y_points() { return StdVideoAV1FilmGrain.get_num_y_points(this.segment()); }
    /// Sets `num_y_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_y_points(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_y_points.set(segment, 0L, index, value); }
    /// Sets `num_y_points` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_y_points(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_y_points(segment, 0L, value); }
    /// Sets `num_y_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_y_points(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_y_points(this.segment(), value); return this; }

    /// {@return `point_y_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_y_value(MemorySegment segment, long index) { return (byte) VH_point_y_value.get(segment, 0L, index); }
    /// {@return `point_y_value`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_y_value(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_y_value(segment, 0L); }
    /// {@return `point_y_value`}
    public @CType("uint8_t [ ]") byte point_y_value() { return StdVideoAV1FilmGrain.get_point_y_value(this.segment()); }
    /// Sets `point_y_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_y_value(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_y_value.set(segment, 0L, index, value); }
    /// Sets `point_y_value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_y_value(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_value(segment, 0L, value); }
    /// Sets `point_y_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_value(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_value(this.segment(), value); return this; }

    /// {@return `point_y_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_y_scaling(MemorySegment segment, long index) { return (byte) VH_point_y_scaling.get(segment, 0L, index); }
    /// {@return `point_y_scaling`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_y_scaling(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_y_scaling(segment, 0L); }
    /// {@return `point_y_scaling`}
    public @CType("uint8_t [ ]") byte point_y_scaling() { return StdVideoAV1FilmGrain.get_point_y_scaling(this.segment()); }
    /// Sets `point_y_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_y_scaling(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_y_scaling.set(segment, 0L, index, value); }
    /// Sets `point_y_scaling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_y_scaling(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_scaling(segment, 0L, value); }
    /// Sets `point_y_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_scaling(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_scaling(this.segment(), value); return this; }

    /// {@return `num_cb_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_cb_points(MemorySegment segment, long index) { return (byte) VH_num_cb_points.get(segment, 0L, index); }
    /// {@return `num_cb_points`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_cb_points(MemorySegment segment) { return StdVideoAV1FilmGrain.get_num_cb_points(segment, 0L); }
    /// {@return `num_cb_points`}
    public @CType("uint8_t") byte num_cb_points() { return StdVideoAV1FilmGrain.get_num_cb_points(this.segment()); }
    /// Sets `num_cb_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_cb_points(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_cb_points.set(segment, 0L, index, value); }
    /// Sets `num_cb_points` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_cb_points(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cb_points(segment, 0L, value); }
    /// Sets `num_cb_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cb_points(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cb_points(this.segment(), value); return this; }

    /// {@return `point_cb_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_cb_value(MemorySegment segment, long index) { return (byte) VH_point_cb_value.get(segment, 0L, index); }
    /// {@return `point_cb_value`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_cb_value(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_cb_value(segment, 0L); }
    /// {@return `point_cb_value`}
    public @CType("uint8_t [ ]") byte point_cb_value() { return StdVideoAV1FilmGrain.get_point_cb_value(this.segment()); }
    /// Sets `point_cb_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_cb_value(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_cb_value.set(segment, 0L, index, value); }
    /// Sets `point_cb_value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_cb_value(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_value(segment, 0L, value); }
    /// Sets `point_cb_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_value(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_value(this.segment(), value); return this; }

    /// {@return `point_cb_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_cb_scaling(MemorySegment segment, long index) { return (byte) VH_point_cb_scaling.get(segment, 0L, index); }
    /// {@return `point_cb_scaling`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_cb_scaling(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_cb_scaling(segment, 0L); }
    /// {@return `point_cb_scaling`}
    public @CType("uint8_t [ ]") byte point_cb_scaling() { return StdVideoAV1FilmGrain.get_point_cb_scaling(this.segment()); }
    /// Sets `point_cb_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_cb_scaling(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_cb_scaling.set(segment, 0L, index, value); }
    /// Sets `point_cb_scaling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_cb_scaling(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_scaling(segment, 0L, value); }
    /// Sets `point_cb_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_scaling(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_scaling(this.segment(), value); return this; }

    /// {@return `num_cr_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_cr_points(MemorySegment segment, long index) { return (byte) VH_num_cr_points.get(segment, 0L, index); }
    /// {@return `num_cr_points`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_cr_points(MemorySegment segment) { return StdVideoAV1FilmGrain.get_num_cr_points(segment, 0L); }
    /// {@return `num_cr_points`}
    public @CType("uint8_t") byte num_cr_points() { return StdVideoAV1FilmGrain.get_num_cr_points(this.segment()); }
    /// Sets `num_cr_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_cr_points(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_cr_points.set(segment, 0L, index, value); }
    /// Sets `num_cr_points` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_cr_points(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cr_points(segment, 0L, value); }
    /// Sets `num_cr_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cr_points(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cr_points(this.segment(), value); return this; }

    /// {@return `point_cr_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_cr_value(MemorySegment segment, long index) { return (byte) VH_point_cr_value.get(segment, 0L, index); }
    /// {@return `point_cr_value`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_cr_value(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_cr_value(segment, 0L); }
    /// {@return `point_cr_value`}
    public @CType("uint8_t [ ]") byte point_cr_value() { return StdVideoAV1FilmGrain.get_point_cr_value(this.segment()); }
    /// Sets `point_cr_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_cr_value(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_cr_value.set(segment, 0L, index, value); }
    /// Sets `point_cr_value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_cr_value(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_value(segment, 0L, value); }
    /// Sets `point_cr_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_value(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_value(this.segment(), value); return this; }

    /// {@return `point_cr_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_point_cr_scaling(MemorySegment segment, long index) { return (byte) VH_point_cr_scaling.get(segment, 0L, index); }
    /// {@return `point_cr_scaling`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_point_cr_scaling(MemorySegment segment) { return StdVideoAV1FilmGrain.get_point_cr_scaling(segment, 0L); }
    /// {@return `point_cr_scaling`}
    public @CType("uint8_t [ ]") byte point_cr_scaling() { return StdVideoAV1FilmGrain.get_point_cr_scaling(this.segment()); }
    /// Sets `point_cr_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_point_cr_scaling(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_point_cr_scaling.set(segment, 0L, index, value); }
    /// Sets `point_cr_scaling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_point_cr_scaling(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_scaling(segment, 0L, value); }
    /// Sets `point_cr_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_scaling(@CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_scaling(this.segment(), value); return this; }

    /// {@return `ar_coeffs_y_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_ar_coeffs_y_plus_128(MemorySegment segment, long index) { return (byte) VH_ar_coeffs_y_plus_128.get(segment, 0L, index); }
    /// {@return `ar_coeffs_y_plus_128`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_ar_coeffs_y_plus_128(MemorySegment segment) { return StdVideoAV1FilmGrain.get_ar_coeffs_y_plus_128(segment, 0L); }
    /// {@return `ar_coeffs_y_plus_128`}
    public @CType("int8_t [ ]") byte ar_coeffs_y_plus_128() { return StdVideoAV1FilmGrain.get_ar_coeffs_y_plus_128(this.segment()); }
    /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ar_coeffs_y_plus_128(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_ar_coeffs_y_plus_128.set(segment, 0L, index, value); }
    /// Sets `ar_coeffs_y_plus_128` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ar_coeffs_y_plus_128(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_y_plus_128(segment, 0L, value); }
    /// Sets `ar_coeffs_y_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(@CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_y_plus_128(this.segment(), value); return this; }

    /// {@return `ar_coeffs_cb_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_ar_coeffs_cb_plus_128(MemorySegment segment, long index) { return (byte) VH_ar_coeffs_cb_plus_128.get(segment, 0L, index); }
    /// {@return `ar_coeffs_cb_plus_128`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_ar_coeffs_cb_plus_128(MemorySegment segment) { return StdVideoAV1FilmGrain.get_ar_coeffs_cb_plus_128(segment, 0L); }
    /// {@return `ar_coeffs_cb_plus_128`}
    public @CType("int8_t [ ]") byte ar_coeffs_cb_plus_128() { return StdVideoAV1FilmGrain.get_ar_coeffs_cb_plus_128(this.segment()); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ar_coeffs_cb_plus_128(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_ar_coeffs_cb_plus_128.set(segment, 0L, index, value); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ar_coeffs_cb_plus_128(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cb_plus_128(segment, 0L, value); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(@CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cb_plus_128(this.segment(), value); return this; }

    /// {@return `ar_coeffs_cr_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_ar_coeffs_cr_plus_128(MemorySegment segment, long index) { return (byte) VH_ar_coeffs_cr_plus_128.get(segment, 0L, index); }
    /// {@return `ar_coeffs_cr_plus_128`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_ar_coeffs_cr_plus_128(MemorySegment segment) { return StdVideoAV1FilmGrain.get_ar_coeffs_cr_plus_128(segment, 0L); }
    /// {@return `ar_coeffs_cr_plus_128`}
    public @CType("int8_t [ ]") byte ar_coeffs_cr_plus_128() { return StdVideoAV1FilmGrain.get_ar_coeffs_cr_plus_128(this.segment()); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ar_coeffs_cr_plus_128(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_ar_coeffs_cr_plus_128.set(segment, 0L, index, value); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ar_coeffs_cr_plus_128(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cr_plus_128(segment, 0L, value); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(@CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cr_plus_128(this.segment(), value); return this; }

    /// {@return `cb_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cb_mult(MemorySegment segment, long index) { return (byte) VH_cb_mult.get(segment, 0L, index); }
    /// {@return `cb_mult`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cb_mult(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cb_mult(segment, 0L); }
    /// {@return `cb_mult`}
    public @CType("uint8_t") byte cb_mult() { return StdVideoAV1FilmGrain.get_cb_mult(this.segment()); }
    /// Sets `cb_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cb_mult(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cb_mult.set(segment, 0L, index, value); }
    /// Sets `cb_mult` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cb_mult(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_mult(segment, 0L, value); }
    /// Sets `cb_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_mult(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_mult(this.segment(), value); return this; }

    /// {@return `cb_luma_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cb_luma_mult(MemorySegment segment, long index) { return (byte) VH_cb_luma_mult.get(segment, 0L, index); }
    /// {@return `cb_luma_mult`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cb_luma_mult(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cb_luma_mult(segment, 0L); }
    /// {@return `cb_luma_mult`}
    public @CType("uint8_t") byte cb_luma_mult() { return StdVideoAV1FilmGrain.get_cb_luma_mult(this.segment()); }
    /// Sets `cb_luma_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cb_luma_mult(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cb_luma_mult.set(segment, 0L, index, value); }
    /// Sets `cb_luma_mult` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cb_luma_mult(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_luma_mult(segment, 0L, value); }
    /// Sets `cb_luma_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_luma_mult(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_luma_mult(this.segment(), value); return this; }

    /// {@return `cb_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_cb_offset(MemorySegment segment, long index) { return (short) VH_cb_offset.get(segment, 0L, index); }
    /// {@return `cb_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_cb_offset(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cb_offset(segment, 0L); }
    /// {@return `cb_offset`}
    public @CType("uint16_t") short cb_offset() { return StdVideoAV1FilmGrain.get_cb_offset(this.segment()); }
    /// Sets `cb_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cb_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_cb_offset.set(segment, 0L, index, value); }
    /// Sets `cb_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cb_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cb_offset(segment, 0L, value); }
    /// Sets `cb_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_offset(@CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cb_offset(this.segment(), value); return this; }

    /// {@return `cr_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cr_mult(MemorySegment segment, long index) { return (byte) VH_cr_mult.get(segment, 0L, index); }
    /// {@return `cr_mult`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cr_mult(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cr_mult(segment, 0L); }
    /// {@return `cr_mult`}
    public @CType("uint8_t") byte cr_mult() { return StdVideoAV1FilmGrain.get_cr_mult(this.segment()); }
    /// Sets `cr_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cr_mult(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cr_mult.set(segment, 0L, index, value); }
    /// Sets `cr_mult` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cr_mult(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_mult(segment, 0L, value); }
    /// Sets `cr_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_mult(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_mult(this.segment(), value); return this; }

    /// {@return `cr_luma_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cr_luma_mult(MemorySegment segment, long index) { return (byte) VH_cr_luma_mult.get(segment, 0L, index); }
    /// {@return `cr_luma_mult`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cr_luma_mult(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cr_luma_mult(segment, 0L); }
    /// {@return `cr_luma_mult`}
    public @CType("uint8_t") byte cr_luma_mult() { return StdVideoAV1FilmGrain.get_cr_luma_mult(this.segment()); }
    /// Sets `cr_luma_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cr_luma_mult(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cr_luma_mult.set(segment, 0L, index, value); }
    /// Sets `cr_luma_mult` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cr_luma_mult(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_luma_mult(segment, 0L, value); }
    /// Sets `cr_luma_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_luma_mult(@CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_luma_mult(this.segment(), value); return this; }

    /// {@return `cr_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_cr_offset(MemorySegment segment, long index) { return (short) VH_cr_offset.get(segment, 0L, index); }
    /// {@return `cr_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_cr_offset(MemorySegment segment) { return StdVideoAV1FilmGrain.get_cr_offset(segment, 0L); }
    /// {@return `cr_offset`}
    public @CType("uint16_t") short cr_offset() { return StdVideoAV1FilmGrain.get_cr_offset(this.segment()); }
    /// Sets `cr_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cr_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_cr_offset.set(segment, 0L, index, value); }
    /// Sets `cr_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cr_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cr_offset(segment, 0L, value); }
    /// Sets `cr_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_offset(@CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cr_offset(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1FilmGrain].
    public static final class Buffer extends StdVideoAV1FilmGrain {
        private final long elementCount;

        /// Creates `StdVideoAV1FilmGrain.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1FilmGrain`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1FilmGrain`
        public StdVideoAV1FilmGrain asSlice(long index) { return new StdVideoAV1FilmGrain(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1FilmGrain`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1FilmGrain`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1FilmGrain.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoAV1FilmGrainFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1FilmGrain.set_flags(this.segment(), index, value); return this; }

        /// {@return `grain_scaling_minus_8` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte grain_scaling_minus_8At(long index) { return StdVideoAV1FilmGrain.get_grain_scaling_minus_8(this.segment(), index); }
        /// Sets `grain_scaling_minus_8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer grain_scaling_minus_8At(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scaling_minus_8(this.segment(), index, value); return this; }

        /// {@return `ar_coeff_lag` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte ar_coeff_lagAt(long index) { return StdVideoAV1FilmGrain.get_ar_coeff_lag(this.segment(), index); }
        /// Sets `ar_coeff_lag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ar_coeff_lagAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_lag(this.segment(), index, value); return this; }

        /// {@return `ar_coeff_shift_minus_6` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte ar_coeff_shift_minus_6At(long index) { return StdVideoAV1FilmGrain.get_ar_coeff_shift_minus_6(this.segment(), index); }
        /// Sets `ar_coeff_shift_minus_6` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ar_coeff_shift_minus_6At(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_ar_coeff_shift_minus_6(this.segment(), index, value); return this; }

        /// {@return `grain_scale_shift` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte grain_scale_shiftAt(long index) { return StdVideoAV1FilmGrain.get_grain_scale_shift(this.segment(), index); }
        /// Sets `grain_scale_shift` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer grain_scale_shiftAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_grain_scale_shift(this.segment(), index, value); return this; }

        /// {@return `grain_seed` at the given index}
        /// @param index the index
        public @CType("uint16_t") short grain_seedAt(long index) { return StdVideoAV1FilmGrain.get_grain_seed(this.segment(), index); }
        /// Sets `grain_seed` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer grain_seedAt(long index, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_grain_seed(this.segment(), index, value); return this; }

        /// {@return `film_grain_params_ref_idx` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte film_grain_params_ref_idxAt(long index) { return StdVideoAV1FilmGrain.get_film_grain_params_ref_idx(this.segment(), index); }
        /// Sets `film_grain_params_ref_idx` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer film_grain_params_ref_idxAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_film_grain_params_ref_idx(this.segment(), index, value); return this; }

        /// {@return `num_y_points` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_y_pointsAt(long index) { return StdVideoAV1FilmGrain.get_num_y_points(this.segment(), index); }
        /// Sets `num_y_points` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_y_pointsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_y_points(this.segment(), index, value); return this; }

        /// {@return `point_y_value` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_y_valueAt(long index) { return StdVideoAV1FilmGrain.get_point_y_value(this.segment(), index); }
        /// Sets `point_y_value` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_y_valueAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_value(this.segment(), index, value); return this; }

        /// {@return `point_y_scaling` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_y_scalingAt(long index) { return StdVideoAV1FilmGrain.get_point_y_scaling(this.segment(), index); }
        /// Sets `point_y_scaling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_y_scalingAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_y_scaling(this.segment(), index, value); return this; }

        /// {@return `num_cb_points` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_cb_pointsAt(long index) { return StdVideoAV1FilmGrain.get_num_cb_points(this.segment(), index); }
        /// Sets `num_cb_points` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_cb_pointsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cb_points(this.segment(), index, value); return this; }

        /// {@return `point_cb_value` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_cb_valueAt(long index) { return StdVideoAV1FilmGrain.get_point_cb_value(this.segment(), index); }
        /// Sets `point_cb_value` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_cb_valueAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_value(this.segment(), index, value); return this; }

        /// {@return `point_cb_scaling` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_cb_scalingAt(long index) { return StdVideoAV1FilmGrain.get_point_cb_scaling(this.segment(), index); }
        /// Sets `point_cb_scaling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_cb_scalingAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cb_scaling(this.segment(), index, value); return this; }

        /// {@return `num_cr_points` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_cr_pointsAt(long index) { return StdVideoAV1FilmGrain.get_num_cr_points(this.segment(), index); }
        /// Sets `num_cr_points` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_cr_pointsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_num_cr_points(this.segment(), index, value); return this; }

        /// {@return `point_cr_value` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_cr_valueAt(long index) { return StdVideoAV1FilmGrain.get_point_cr_value(this.segment(), index); }
        /// Sets `point_cr_value` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_cr_valueAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_value(this.segment(), index, value); return this; }

        /// {@return `point_cr_scaling` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte point_cr_scalingAt(long index) { return StdVideoAV1FilmGrain.get_point_cr_scaling(this.segment(), index); }
        /// Sets `point_cr_scaling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer point_cr_scalingAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_point_cr_scaling(this.segment(), index, value); return this; }

        /// {@return `ar_coeffs_y_plus_128` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte ar_coeffs_y_plus_128At(long index) { return StdVideoAV1FilmGrain.get_ar_coeffs_y_plus_128(this.segment(), index); }
        /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ar_coeffs_y_plus_128At(long index, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_y_plus_128(this.segment(), index, value); return this; }

        /// {@return `ar_coeffs_cb_plus_128` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte ar_coeffs_cb_plus_128At(long index) { return StdVideoAV1FilmGrain.get_ar_coeffs_cb_plus_128(this.segment(), index); }
        /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ar_coeffs_cb_plus_128At(long index, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cb_plus_128(this.segment(), index, value); return this; }

        /// {@return `ar_coeffs_cr_plus_128` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte ar_coeffs_cr_plus_128At(long index) { return StdVideoAV1FilmGrain.get_ar_coeffs_cr_plus_128(this.segment(), index); }
        /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ar_coeffs_cr_plus_128At(long index, @CType("int8_t [ ]") byte value) { StdVideoAV1FilmGrain.set_ar_coeffs_cr_plus_128(this.segment(), index, value); return this; }

        /// {@return `cb_mult` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cb_multAt(long index) { return StdVideoAV1FilmGrain.get_cb_mult(this.segment(), index); }
        /// Sets `cb_mult` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cb_multAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_mult(this.segment(), index, value); return this; }

        /// {@return `cb_luma_mult` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cb_luma_multAt(long index) { return StdVideoAV1FilmGrain.get_cb_luma_mult(this.segment(), index); }
        /// Sets `cb_luma_mult` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cb_luma_multAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cb_luma_mult(this.segment(), index, value); return this; }

        /// {@return `cb_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short cb_offsetAt(long index) { return StdVideoAV1FilmGrain.get_cb_offset(this.segment(), index); }
        /// Sets `cb_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cb_offsetAt(long index, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cb_offset(this.segment(), index, value); return this; }

        /// {@return `cr_mult` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cr_multAt(long index) { return StdVideoAV1FilmGrain.get_cr_mult(this.segment(), index); }
        /// Sets `cr_mult` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cr_multAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_mult(this.segment(), index, value); return this; }

        /// {@return `cr_luma_mult` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cr_luma_multAt(long index) { return StdVideoAV1FilmGrain.get_cr_luma_mult(this.segment(), index); }
        /// Sets `cr_luma_mult` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cr_luma_multAt(long index, @CType("uint8_t") byte value) { StdVideoAV1FilmGrain.set_cr_luma_mult(this.segment(), index, value); return this; }

        /// {@return `cr_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short cr_offsetAt(long index) { return StdVideoAV1FilmGrain.get_cr_offset(this.segment(), index); }
        /// Sets `cr_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cr_offsetAt(long index, @CType("uint16_t") short value) { StdVideoAV1FilmGrain.set_cr_offset(this.segment(), index, value); return this; }

    }
}
