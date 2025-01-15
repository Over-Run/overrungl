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
/// ### is_reference
/// [VarHandle][#VH_is_reference] - [Getter][#is_reference()] - [Setter][#is_reference(int)]
/// ### IrapPicFlag
/// [VarHandle][#VH_IrapPicFlag] - [Getter][#IrapPicFlag()] - [Setter][#IrapPicFlag(int)]
/// ### used_for_long_term_reference
/// [VarHandle][#VH_used_for_long_term_reference] - [Getter][#used_for_long_term_reference()] - [Setter][#used_for_long_term_reference(int)]
/// ### discardable_flag
/// [VarHandle][#VH_discardable_flag] - [Getter][#discardable_flag()] - [Setter][#discardable_flag(int)]
/// ### cross_layer_bla_flag
/// [VarHandle][#VH_cross_layer_bla_flag] - [Getter][#cross_layer_bla_flag()] - [Setter][#cross_layer_bla_flag(int)]
/// ### pic_output_flag
/// [VarHandle][#VH_pic_output_flag] - [Getter][#pic_output_flag()] - [Setter][#pic_output_flag(int)]
/// ### no_output_of_prior_pics_flag
/// [VarHandle][#VH_no_output_of_prior_pics_flag] - [Getter][#no_output_of_prior_pics_flag()] - [Setter][#no_output_of_prior_pics_flag(int)]
/// ### short_term_ref_pic_set_sps_flag
/// [VarHandle][#VH_short_term_ref_pic_set_sps_flag] - [Getter][#short_term_ref_pic_set_sps_flag()] - [Setter][#short_term_ref_pic_set_sps_flag(int)]
/// ### slice_temporal_mvp_enabled_flag
/// [VarHandle][#VH_slice_temporal_mvp_enabled_flag] - [Getter][#slice_temporal_mvp_enabled_flag()] - [Setter][#slice_temporal_mvp_enabled_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265PictureInfoFlags {
///     uint32_t : 1 is_reference;
///     uint32_t : 1 IrapPicFlag;
///     uint32_t : 1 used_for_long_term_reference;
///     uint32_t : 1 discardable_flag;
///     uint32_t : 1 cross_layer_bla_flag;
///     uint32_t : 1 pic_output_flag;
///     uint32_t : 1 no_output_of_prior_pics_flag;
///     uint32_t : 1 short_term_ref_pic_set_sps_flag;
///     uint32_t : 1 slice_temporal_mvp_enabled_flag;
///     uint32_t : 23 reserved;
/// } StdVideoEncodeH265PictureInfoFlags;
/// ```
public sealed class StdVideoEncodeH265PictureInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH265PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("is_reference"),
        ValueLayout.JAVA_INT.withName("IrapPicFlag"),
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"),
        ValueLayout.JAVA_INT.withName("discardable_flag"),
        ValueLayout.JAVA_INT.withName("cross_layer_bla_flag"),
        ValueLayout.JAVA_INT.withName("pic_output_flag"),
        ValueLayout.JAVA_INT.withName("no_output_of_prior_pics_flag"),
        ValueLayout.JAVA_INT.withName("short_term_ref_pic_set_sps_flag"),
        ValueLayout.JAVA_INT.withName("slice_temporal_mvp_enabled_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `is_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_reference"));
    /// The [VarHandle] of `IrapPicFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IrapPicFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IrapPicFlag"));
    /// The [VarHandle] of `used_for_long_term_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_used_for_long_term_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_for_long_term_reference"));
    /// The [VarHandle] of `discardable_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_discardable_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardable_flag"));
    /// The [VarHandle] of `cross_layer_bla_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cross_layer_bla_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cross_layer_bla_flag"));
    /// The [VarHandle] of `pic_output_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_output_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_output_flag"));
    /// The [VarHandle] of `no_output_of_prior_pics_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_no_output_of_prior_pics_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("no_output_of_prior_pics_flag"));
    /// The [VarHandle] of `short_term_ref_pic_set_sps_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_short_term_ref_pic_set_sps_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("short_term_ref_pic_set_sps_flag"));
    /// The [VarHandle] of `slice_temporal_mvp_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_temporal_mvp_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_temporal_mvp_enabled_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfoFlags(segment); }

    /// Creates `StdVideoEncodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265PictureInfoFlags`
    public static StdVideoEncodeH265PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265PictureInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265PictureInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265PictureInfoFlags`
    public static StdVideoEncodeH265PictureInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int is_reference, @CType("uint32_t : 1") int IrapPicFlag, @CType("uint32_t : 1") int used_for_long_term_reference, @CType("uint32_t : 1") int discardable_flag, @CType("uint32_t : 1") int cross_layer_bla_flag, @CType("uint32_t : 1") int pic_output_flag, @CType("uint32_t : 1") int no_output_of_prior_pics_flag, @CType("uint32_t : 1") int short_term_ref_pic_set_sps_flag, @CType("uint32_t : 1") int slice_temporal_mvp_enabled_flag, @CType("uint32_t : 23") int reserved) { return alloc(allocator).is_reference(is_reference).IrapPicFlag(IrapPicFlag).used_for_long_term_reference(used_for_long_term_reference).discardable_flag(discardable_flag).cross_layer_bla_flag(cross_layer_bla_flag).pic_output_flag(pic_output_flag).no_output_of_prior_pics_flag(no_output_of_prior_pics_flag).short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag).slice_temporal_mvp_enabled_flag(slice_temporal_mvp_enabled_flag).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags copyFrom(StdVideoEncodeH265PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `is_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment, long index) { return (int) VH_is_reference.get(segment, 0L, index); }
    /// {@return `is_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_is_reference(segment, 0L); }
    /// {@return `is_reference`}
    public @CType("uint32_t : 1") int is_reference() { return StdVideoEncodeH265PictureInfoFlags.get_is_reference(this.segment()); }
    /// Sets `is_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_reference.set(segment, 0L, index, value); }
    /// Sets `is_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_is_reference(segment, 0L, value); }
    /// Sets `is_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags is_reference(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_is_reference(this.segment(), value); return this; }

    /// {@return `IrapPicFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IrapPicFlag(MemorySegment segment, long index) { return (int) VH_IrapPicFlag.get(segment, 0L, index); }
    /// {@return `IrapPicFlag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IrapPicFlag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_IrapPicFlag(segment, 0L); }
    /// {@return `IrapPicFlag`}
    public @CType("uint32_t : 1") int IrapPicFlag() { return StdVideoEncodeH265PictureInfoFlags.get_IrapPicFlag(this.segment()); }
    /// Sets `IrapPicFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IrapPicFlag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IrapPicFlag.set(segment, 0L, index, value); }
    /// Sets `IrapPicFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IrapPicFlag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_IrapPicFlag(segment, 0L, value); }
    /// Sets `IrapPicFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags IrapPicFlag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_IrapPicFlag(this.segment(), value); return this; }

    /// {@return `used_for_long_term_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment, long index) { return (int) VH_used_for_long_term_reference.get(segment, 0L, index); }
    /// {@return `used_for_long_term_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_used_for_long_term_reference(segment, 0L); }
    /// {@return `used_for_long_term_reference`}
    public @CType("uint32_t : 1") int used_for_long_term_reference() { return StdVideoEncodeH265PictureInfoFlags.get_used_for_long_term_reference(this.segment()); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_used_for_long_term_reference.set(segment, 0L, index, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_used_for_long_term_reference(segment, 0L, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags used_for_long_term_reference(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_used_for_long_term_reference(this.segment(), value); return this; }

    /// {@return `discardable_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_discardable_flag(MemorySegment segment, long index) { return (int) VH_discardable_flag.get(segment, 0L, index); }
    /// {@return `discardable_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_discardable_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_discardable_flag(segment, 0L); }
    /// {@return `discardable_flag`}
    public @CType("uint32_t : 1") int discardable_flag() { return StdVideoEncodeH265PictureInfoFlags.get_discardable_flag(this.segment()); }
    /// Sets `discardable_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_discardable_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_discardable_flag.set(segment, 0L, index, value); }
    /// Sets `discardable_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_discardable_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_discardable_flag(segment, 0L, value); }
    /// Sets `discardable_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags discardable_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_discardable_flag(this.segment(), value); return this; }

    /// {@return `cross_layer_bla_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cross_layer_bla_flag(MemorySegment segment, long index) { return (int) VH_cross_layer_bla_flag.get(segment, 0L, index); }
    /// {@return `cross_layer_bla_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cross_layer_bla_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_cross_layer_bla_flag(segment, 0L); }
    /// {@return `cross_layer_bla_flag`}
    public @CType("uint32_t : 1") int cross_layer_bla_flag() { return StdVideoEncodeH265PictureInfoFlags.get_cross_layer_bla_flag(this.segment()); }
    /// Sets `cross_layer_bla_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cross_layer_bla_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cross_layer_bla_flag.set(segment, 0L, index, value); }
    /// Sets `cross_layer_bla_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cross_layer_bla_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_cross_layer_bla_flag(segment, 0L, value); }
    /// Sets `cross_layer_bla_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags cross_layer_bla_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_cross_layer_bla_flag(this.segment(), value); return this; }

    /// {@return `pic_output_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pic_output_flag(MemorySegment segment, long index) { return (int) VH_pic_output_flag.get(segment, 0L, index); }
    /// {@return `pic_output_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pic_output_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_pic_output_flag(segment, 0L); }
    /// {@return `pic_output_flag`}
    public @CType("uint32_t : 1") int pic_output_flag() { return StdVideoEncodeH265PictureInfoFlags.get_pic_output_flag(this.segment()); }
    /// Sets `pic_output_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_output_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pic_output_flag.set(segment, 0L, index, value); }
    /// Sets `pic_output_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_output_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_pic_output_flag(segment, 0L, value); }
    /// Sets `pic_output_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags pic_output_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_pic_output_flag(this.segment(), value); return this; }

    /// {@return `no_output_of_prior_pics_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_no_output_of_prior_pics_flag(MemorySegment segment, long index) { return (int) VH_no_output_of_prior_pics_flag.get(segment, 0L, index); }
    /// {@return `no_output_of_prior_pics_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_no_output_of_prior_pics_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_no_output_of_prior_pics_flag(segment, 0L); }
    /// {@return `no_output_of_prior_pics_flag`}
    public @CType("uint32_t : 1") int no_output_of_prior_pics_flag() { return StdVideoEncodeH265PictureInfoFlags.get_no_output_of_prior_pics_flag(this.segment()); }
    /// Sets `no_output_of_prior_pics_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_no_output_of_prior_pics_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_no_output_of_prior_pics_flag.set(segment, 0L, index, value); }
    /// Sets `no_output_of_prior_pics_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_no_output_of_prior_pics_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_no_output_of_prior_pics_flag(segment, 0L, value); }
    /// Sets `no_output_of_prior_pics_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags no_output_of_prior_pics_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_no_output_of_prior_pics_flag(this.segment(), value); return this; }

    /// {@return `short_term_ref_pic_set_sps_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_short_term_ref_pic_set_sps_flag(MemorySegment segment, long index) { return (int) VH_short_term_ref_pic_set_sps_flag.get(segment, 0L, index); }
    /// {@return `short_term_ref_pic_set_sps_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_short_term_ref_pic_set_sps_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(segment, 0L); }
    /// {@return `short_term_ref_pic_set_sps_flag`}
    public @CType("uint32_t : 1") int short_term_ref_pic_set_sps_flag() { return StdVideoEncodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(this.segment()); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_short_term_ref_pic_set_sps_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_short_term_ref_pic_set_sps_flag.set(segment, 0L, index, value); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_short_term_ref_pic_set_sps_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(segment, 0L, value); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(this.segment(), value); return this; }

    /// {@return `slice_temporal_mvp_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_temporal_mvp_enabled_flag(MemorySegment segment, long index) { return (int) VH_slice_temporal_mvp_enabled_flag.get(segment, 0L, index); }
    /// {@return `slice_temporal_mvp_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_temporal_mvp_enabled_flag(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_slice_temporal_mvp_enabled_flag(segment, 0L); }
    /// {@return `slice_temporal_mvp_enabled_flag`}
    public @CType("uint32_t : 1") int slice_temporal_mvp_enabled_flag() { return StdVideoEncodeH265PictureInfoFlags.get_slice_temporal_mvp_enabled_flag(this.segment()); }
    /// Sets `slice_temporal_mvp_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_temporal_mvp_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_temporal_mvp_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `slice_temporal_mvp_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_temporal_mvp_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_slice_temporal_mvp_enabled_flag(segment, 0L, value); }
    /// Sets `slice_temporal_mvp_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags slice_temporal_mvp_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_slice_temporal_mvp_enabled_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 23") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 23") int get_reserved(MemorySegment segment) { return StdVideoEncodeH265PictureInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 23") int reserved() { return StdVideoEncodeH265PictureInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 23") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 23") int value) { StdVideoEncodeH265PictureInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfoFlags reserved(@CType("uint32_t : 23") int value) { StdVideoEncodeH265PictureInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265PictureInfoFlags].
    public static final class Buffer extends StdVideoEncodeH265PictureInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265PictureInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265PictureInfoFlags`
        public StdVideoEncodeH265PictureInfoFlags asSlice(long index) { return new StdVideoEncodeH265PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265PictureInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `is_reference` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int is_referenceAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_is_reference(this.segment(), index); }
        /// Sets `is_reference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer is_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_is_reference(this.segment(), index, value); return this; }

        /// {@return `IrapPicFlag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int IrapPicFlagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_IrapPicFlag(this.segment(), index); }
        /// Sets `IrapPicFlag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer IrapPicFlagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_IrapPicFlag(this.segment(), index, value); return this; }

        /// {@return `used_for_long_term_reference` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int used_for_long_term_referenceAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_used_for_long_term_reference(this.segment(), index); }
        /// Sets `used_for_long_term_reference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_for_long_term_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_used_for_long_term_reference(this.segment(), index, value); return this; }

        /// {@return `discardable_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int discardable_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_discardable_flag(this.segment(), index); }
        /// Sets `discardable_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer discardable_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_discardable_flag(this.segment(), index, value); return this; }

        /// {@return `cross_layer_bla_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int cross_layer_bla_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_cross_layer_bla_flag(this.segment(), index); }
        /// Sets `cross_layer_bla_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cross_layer_bla_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_cross_layer_bla_flag(this.segment(), index, value); return this; }

        /// {@return `pic_output_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int pic_output_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_pic_output_flag(this.segment(), index); }
        /// Sets `pic_output_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_output_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_pic_output_flag(this.segment(), index, value); return this; }

        /// {@return `no_output_of_prior_pics_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int no_output_of_prior_pics_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_no_output_of_prior_pics_flag(this.segment(), index); }
        /// Sets `no_output_of_prior_pics_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer no_output_of_prior_pics_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_no_output_of_prior_pics_flag(this.segment(), index, value); return this; }

        /// {@return `short_term_ref_pic_set_sps_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int short_term_ref_pic_set_sps_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(this.segment(), index); }
        /// Sets `short_term_ref_pic_set_sps_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer short_term_ref_pic_set_sps_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(this.segment(), index, value); return this; }

        /// {@return `slice_temporal_mvp_enabled_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int slice_temporal_mvp_enabled_flagAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_slice_temporal_mvp_enabled_flag(this.segment(), index); }
        /// Sets `slice_temporal_mvp_enabled_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_temporal_mvp_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265PictureInfoFlags.set_slice_temporal_mvp_enabled_flag(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 23") int reservedAt(long index) { return StdVideoEncodeH265PictureInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 23") int value) { StdVideoEncodeH265PictureInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
