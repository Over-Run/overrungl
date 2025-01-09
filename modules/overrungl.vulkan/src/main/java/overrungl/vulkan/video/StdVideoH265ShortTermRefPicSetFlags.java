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
/// ### inter_ref_pic_set_prediction_flag
/// [VarHandle][#VH_inter_ref_pic_set_prediction_flag] - [Getter][#inter_ref_pic_set_prediction_flag()] - [Setter][#inter_ref_pic_set_prediction_flag(int)]
/// ### delta_rps_sign
/// [VarHandle][#VH_delta_rps_sign] - [Getter][#delta_rps_sign()] - [Setter][#delta_rps_sign(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265ShortTermRefPicSetFlags {
///     uint32_t : 1 inter_ref_pic_set_prediction_flag;
///     uint32_t : 1 delta_rps_sign;
/// } StdVideoH265ShortTermRefPicSetFlags;
/// ```
public final class StdVideoH265ShortTermRefPicSetFlags extends Struct {
    /// The struct layout of `StdVideoH265ShortTermRefPicSetFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("inter_ref_pic_set_prediction_flag"),
        ValueLayout.JAVA_INT.withName("delta_rps_sign")
    );
    /// The [VarHandle] of `inter_ref_pic_set_prediction_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inter_ref_pic_set_prediction_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inter_ref_pic_set_prediction_flag"));
    /// The [VarHandle] of `delta_rps_sign` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_rps_sign = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_rps_sign"));

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ShortTermRefPicSetFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags alloc(SegmentAllocator allocator) { return new StdVideoH265ShortTermRefPicSetFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ShortTermRefPicSetFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `inter_ref_pic_set_prediction_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_inter_ref_pic_set_prediction_flag(MemorySegment segment, long index) { return (int) VH_inter_ref_pic_set_prediction_flag.get(segment, 0L, index); }
    /// {@return `inter_ref_pic_set_prediction_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_inter_ref_pic_set_prediction_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSetFlags.get_inter_ref_pic_set_prediction_flag(segment, 0L); }
    /// {@return `inter_ref_pic_set_prediction_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int inter_ref_pic_set_prediction_flagAt(long index) { return StdVideoH265ShortTermRefPicSetFlags.get_inter_ref_pic_set_prediction_flag(this.segment(), index); }
    /// {@return `inter_ref_pic_set_prediction_flag`}
    public @CType("uint32_t : 1") int inter_ref_pic_set_prediction_flag() { return StdVideoH265ShortTermRefPicSetFlags.get_inter_ref_pic_set_prediction_flag(this.segment()); }
    /// Sets `inter_ref_pic_set_prediction_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inter_ref_pic_set_prediction_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_inter_ref_pic_set_prediction_flag.set(segment, 0L, index, value); }
    /// Sets `inter_ref_pic_set_prediction_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inter_ref_pic_set_prediction_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_inter_ref_pic_set_prediction_flag(segment, 0L, value); }
    /// Sets `inter_ref_pic_set_prediction_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags inter_ref_pic_set_prediction_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_inter_ref_pic_set_prediction_flag(this.segment(), index, value); return this; }
    /// Sets `inter_ref_pic_set_prediction_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags inter_ref_pic_set_prediction_flag(@CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_inter_ref_pic_set_prediction_flag(this.segment(), value); return this; }

    /// {@return `delta_rps_sign` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_delta_rps_sign(MemorySegment segment, long index) { return (int) VH_delta_rps_sign.get(segment, 0L, index); }
    /// {@return `delta_rps_sign`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_delta_rps_sign(MemorySegment segment) { return StdVideoH265ShortTermRefPicSetFlags.get_delta_rps_sign(segment, 0L); }
    /// {@return `delta_rps_sign` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int delta_rps_signAt(long index) { return StdVideoH265ShortTermRefPicSetFlags.get_delta_rps_sign(this.segment(), index); }
    /// {@return `delta_rps_sign`}
    public @CType("uint32_t : 1") int delta_rps_sign() { return StdVideoH265ShortTermRefPicSetFlags.get_delta_rps_sign(this.segment()); }
    /// Sets `delta_rps_sign` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_rps_sign(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_delta_rps_sign.set(segment, 0L, index, value); }
    /// Sets `delta_rps_sign` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_rps_sign(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_delta_rps_sign(segment, 0L, value); }
    /// Sets `delta_rps_sign` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags delta_rps_signAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_delta_rps_sign(this.segment(), index, value); return this; }
    /// Sets `delta_rps_sign` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags delta_rps_sign(@CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_delta_rps_sign(this.segment(), value); return this; }

}
