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
public sealed class StdVideoH265ShortTermRefPicSetFlags extends Struct {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags alloc(SegmentAllocator allocator) { return new StdVideoH265ShortTermRefPicSetFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int inter_ref_pic_set_prediction_flag, @CType("uint32_t : 1") int delta_rps_sign) { return alloc(allocator).inter_ref_pic_set_prediction_flag(inter_ref_pic_set_prediction_flag).delta_rps_sign(delta_rps_sign); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags copyFrom(StdVideoH265ShortTermRefPicSetFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `inter_ref_pic_set_prediction_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_inter_ref_pic_set_prediction_flag(MemorySegment segment, long index) { return (int) VH_inter_ref_pic_set_prediction_flag.get(segment, 0L, index); }
    /// {@return `inter_ref_pic_set_prediction_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_inter_ref_pic_set_prediction_flag(MemorySegment segment) { return StdVideoH265ShortTermRefPicSetFlags.get_inter_ref_pic_set_prediction_flag(segment, 0L); }
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
    /// Sets `delta_rps_sign` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags delta_rps_sign(@CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_delta_rps_sign(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265ShortTermRefPicSetFlags].
    public static final class Buffer extends StdVideoH265ShortTermRefPicSetFlags {
        private final long elementCount;

        /// Creates `StdVideoH265ShortTermRefPicSetFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265ShortTermRefPicSetFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265ShortTermRefPicSetFlags`
        public StdVideoH265ShortTermRefPicSetFlags asSlice(long index) { return new StdVideoH265ShortTermRefPicSetFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265ShortTermRefPicSetFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265ShortTermRefPicSetFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `inter_ref_pic_set_prediction_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int inter_ref_pic_set_prediction_flagAt(long index) { return StdVideoH265ShortTermRefPicSetFlags.get_inter_ref_pic_set_prediction_flag(this.segment(), index); }
        /// Sets `inter_ref_pic_set_prediction_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer inter_ref_pic_set_prediction_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_inter_ref_pic_set_prediction_flag(this.segment(), index, value); return this; }

        /// {@return `delta_rps_sign` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int delta_rps_signAt(long index) { return StdVideoH265ShortTermRefPicSetFlags.get_delta_rps_sign(this.segment(), index); }
        /// Sets `delta_rps_sign` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_rps_signAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ShortTermRefPicSetFlags.set_delta_rps_sign(this.segment(), index, value); return this; }

    }
}
