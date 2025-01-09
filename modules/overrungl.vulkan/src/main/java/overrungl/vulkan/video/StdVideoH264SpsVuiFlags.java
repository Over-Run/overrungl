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
/// ### aspect_ratio_info_present_flag
/// [VarHandle][#VH_aspect_ratio_info_present_flag] - [Getter][#aspect_ratio_info_present_flag()] - [Setter][#aspect_ratio_info_present_flag(int)]
/// ### overscan_info_present_flag
/// [VarHandle][#VH_overscan_info_present_flag] - [Getter][#overscan_info_present_flag()] - [Setter][#overscan_info_present_flag(int)]
/// ### overscan_appropriate_flag
/// [VarHandle][#VH_overscan_appropriate_flag] - [Getter][#overscan_appropriate_flag()] - [Setter][#overscan_appropriate_flag(int)]
/// ### video_signal_type_present_flag
/// [VarHandle][#VH_video_signal_type_present_flag] - [Getter][#video_signal_type_present_flag()] - [Setter][#video_signal_type_present_flag(int)]
/// ### video_full_range_flag
/// [VarHandle][#VH_video_full_range_flag] - [Getter][#video_full_range_flag()] - [Setter][#video_full_range_flag(int)]
/// ### color_description_present_flag
/// [VarHandle][#VH_color_description_present_flag] - [Getter][#color_description_present_flag()] - [Setter][#color_description_present_flag(int)]
/// ### chroma_loc_info_present_flag
/// [VarHandle][#VH_chroma_loc_info_present_flag] - [Getter][#chroma_loc_info_present_flag()] - [Setter][#chroma_loc_info_present_flag(int)]
/// ### timing_info_present_flag
/// [VarHandle][#VH_timing_info_present_flag] - [Getter][#timing_info_present_flag()] - [Setter][#timing_info_present_flag(int)]
/// ### fixed_frame_rate_flag
/// [VarHandle][#VH_fixed_frame_rate_flag] - [Getter][#fixed_frame_rate_flag()] - [Setter][#fixed_frame_rate_flag(int)]
/// ### bitstream_restriction_flag
/// [VarHandle][#VH_bitstream_restriction_flag] - [Getter][#bitstream_restriction_flag()] - [Setter][#bitstream_restriction_flag(int)]
/// ### nal_hrd_parameters_present_flag
/// [VarHandle][#VH_nal_hrd_parameters_present_flag] - [Getter][#nal_hrd_parameters_present_flag()] - [Setter][#nal_hrd_parameters_present_flag(int)]
/// ### vcl_hrd_parameters_present_flag
/// [VarHandle][#VH_vcl_hrd_parameters_present_flag] - [Getter][#vcl_hrd_parameters_present_flag()] - [Setter][#vcl_hrd_parameters_present_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264SpsVuiFlags {
///     uint32_t : 1 aspect_ratio_info_present_flag;
///     uint32_t : 1 overscan_info_present_flag;
///     uint32_t : 1 overscan_appropriate_flag;
///     uint32_t : 1 video_signal_type_present_flag;
///     uint32_t : 1 video_full_range_flag;
///     uint32_t : 1 color_description_present_flag;
///     uint32_t : 1 chroma_loc_info_present_flag;
///     uint32_t : 1 timing_info_present_flag;
///     uint32_t : 1 fixed_frame_rate_flag;
///     uint32_t : 1 bitstream_restriction_flag;
///     uint32_t : 1 nal_hrd_parameters_present_flag;
///     uint32_t : 1 vcl_hrd_parameters_present_flag;
/// } StdVideoH264SpsVuiFlags;
/// ```
public final class StdVideoH264SpsVuiFlags extends Struct {
    /// The struct layout of `StdVideoH264SpsVuiFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspect_ratio_info_present_flag"),
        ValueLayout.JAVA_INT.withName("overscan_info_present_flag"),
        ValueLayout.JAVA_INT.withName("overscan_appropriate_flag"),
        ValueLayout.JAVA_INT.withName("video_signal_type_present_flag"),
        ValueLayout.JAVA_INT.withName("video_full_range_flag"),
        ValueLayout.JAVA_INT.withName("color_description_present_flag"),
        ValueLayout.JAVA_INT.withName("chroma_loc_info_present_flag"),
        ValueLayout.JAVA_INT.withName("timing_info_present_flag"),
        ValueLayout.JAVA_INT.withName("fixed_frame_rate_flag"),
        ValueLayout.JAVA_INT.withName("bitstream_restriction_flag"),
        ValueLayout.JAVA_INT.withName("nal_hrd_parameters_present_flag"),
        ValueLayout.JAVA_INT.withName("vcl_hrd_parameters_present_flag")
    );
    /// The [VarHandle] of `aspect_ratio_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspect_ratio_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspect_ratio_info_present_flag"));
    /// The [VarHandle] of `overscan_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_overscan_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("overscan_info_present_flag"));
    /// The [VarHandle] of `overscan_appropriate_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_overscan_appropriate_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("overscan_appropriate_flag"));
    /// The [VarHandle] of `video_signal_type_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_video_signal_type_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("video_signal_type_present_flag"));
    /// The [VarHandle] of `video_full_range_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_video_full_range_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("video_full_range_flag"));
    /// The [VarHandle] of `color_description_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_color_description_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_description_present_flag"));
    /// The [VarHandle] of `chroma_loc_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_loc_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_loc_info_present_flag"));
    /// The [VarHandle] of `timing_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timing_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timing_info_present_flag"));
    /// The [VarHandle] of `fixed_frame_rate_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fixed_frame_rate_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fixed_frame_rate_flag"));
    /// The [VarHandle] of `bitstream_restriction_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bitstream_restriction_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bitstream_restriction_flag"));
    /// The [VarHandle] of `nal_hrd_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nal_hrd_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nal_hrd_parameters_present_flag"));
    /// The [VarHandle] of `vcl_hrd_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vcl_hrd_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vcl_hrd_parameters_present_flag"));

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264SpsVuiFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsVuiFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsVuiFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH264SpsVuiFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SpsVuiFlags`
    public static StdVideoH264SpsVuiFlags alloc(SegmentAllocator allocator) { return new StdVideoH264SpsVuiFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264SpsVuiFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SpsVuiFlags`
    public static StdVideoH264SpsVuiFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SpsVuiFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `aspect_ratio_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_aspect_ratio_info_present_flag(MemorySegment segment, long index) { return (int) VH_aspect_ratio_info_present_flag.get(segment, 0L, index); }
    /// {@return `aspect_ratio_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_aspect_ratio_info_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_aspect_ratio_info_present_flag(segment, 0L); }
    /// {@return `aspect_ratio_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int aspect_ratio_info_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_aspect_ratio_info_present_flag(this.segment(), index); }
    /// {@return `aspect_ratio_info_present_flag`}
    public @CType("uint32_t : 1") int aspect_ratio_info_present_flag() { return StdVideoH264SpsVuiFlags.get_aspect_ratio_info_present_flag(this.segment()); }
    /// Sets `aspect_ratio_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspect_ratio_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_aspect_ratio_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspect_ratio_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_aspect_ratio_info_present_flag(segment, 0L, value); }
    /// Sets `aspect_ratio_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags aspect_ratio_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_aspect_ratio_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `aspect_ratio_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags aspect_ratio_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_aspect_ratio_info_present_flag(this.segment(), value); return this; }

    /// {@return `overscan_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_overscan_info_present_flag(MemorySegment segment, long index) { return (int) VH_overscan_info_present_flag.get(segment, 0L, index); }
    /// {@return `overscan_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_overscan_info_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_overscan_info_present_flag(segment, 0L); }
    /// {@return `overscan_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int overscan_info_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_overscan_info_present_flag(this.segment(), index); }
    /// {@return `overscan_info_present_flag`}
    public @CType("uint32_t : 1") int overscan_info_present_flag() { return StdVideoH264SpsVuiFlags.get_overscan_info_present_flag(this.segment()); }
    /// Sets `overscan_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_overscan_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_overscan_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `overscan_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_overscan_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_info_present_flag(segment, 0L, value); }
    /// Sets `overscan_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags overscan_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `overscan_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags overscan_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_info_present_flag(this.segment(), value); return this; }

    /// {@return `overscan_appropriate_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_overscan_appropriate_flag(MemorySegment segment, long index) { return (int) VH_overscan_appropriate_flag.get(segment, 0L, index); }
    /// {@return `overscan_appropriate_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_overscan_appropriate_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_overscan_appropriate_flag(segment, 0L); }
    /// {@return `overscan_appropriate_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int overscan_appropriate_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_overscan_appropriate_flag(this.segment(), index); }
    /// {@return `overscan_appropriate_flag`}
    public @CType("uint32_t : 1") int overscan_appropriate_flag() { return StdVideoH264SpsVuiFlags.get_overscan_appropriate_flag(this.segment()); }
    /// Sets `overscan_appropriate_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_overscan_appropriate_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_overscan_appropriate_flag.set(segment, 0L, index, value); }
    /// Sets `overscan_appropriate_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_overscan_appropriate_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_appropriate_flag(segment, 0L, value); }
    /// Sets `overscan_appropriate_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags overscan_appropriate_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_appropriate_flag(this.segment(), index, value); return this; }
    /// Sets `overscan_appropriate_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags overscan_appropriate_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_overscan_appropriate_flag(this.segment(), value); return this; }

    /// {@return `video_signal_type_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_video_signal_type_present_flag(MemorySegment segment, long index) { return (int) VH_video_signal_type_present_flag.get(segment, 0L, index); }
    /// {@return `video_signal_type_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_video_signal_type_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_video_signal_type_present_flag(segment, 0L); }
    /// {@return `video_signal_type_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int video_signal_type_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_video_signal_type_present_flag(this.segment(), index); }
    /// {@return `video_signal_type_present_flag`}
    public @CType("uint32_t : 1") int video_signal_type_present_flag() { return StdVideoH264SpsVuiFlags.get_video_signal_type_present_flag(this.segment()); }
    /// Sets `video_signal_type_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_signal_type_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_video_signal_type_present_flag.set(segment, 0L, index, value); }
    /// Sets `video_signal_type_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_signal_type_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_signal_type_present_flag(segment, 0L, value); }
    /// Sets `video_signal_type_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags video_signal_type_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_signal_type_present_flag(this.segment(), index, value); return this; }
    /// Sets `video_signal_type_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags video_signal_type_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_signal_type_present_flag(this.segment(), value); return this; }

    /// {@return `video_full_range_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_video_full_range_flag(MemorySegment segment, long index) { return (int) VH_video_full_range_flag.get(segment, 0L, index); }
    /// {@return `video_full_range_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_video_full_range_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_video_full_range_flag(segment, 0L); }
    /// {@return `video_full_range_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int video_full_range_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_video_full_range_flag(this.segment(), index); }
    /// {@return `video_full_range_flag`}
    public @CType("uint32_t : 1") int video_full_range_flag() { return StdVideoH264SpsVuiFlags.get_video_full_range_flag(this.segment()); }
    /// Sets `video_full_range_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_full_range_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_video_full_range_flag.set(segment, 0L, index, value); }
    /// Sets `video_full_range_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_full_range_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_full_range_flag(segment, 0L, value); }
    /// Sets `video_full_range_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags video_full_range_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_full_range_flag(this.segment(), index, value); return this; }
    /// Sets `video_full_range_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags video_full_range_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_video_full_range_flag(this.segment(), value); return this; }

    /// {@return `color_description_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_color_description_present_flag(MemorySegment segment, long index) { return (int) VH_color_description_present_flag.get(segment, 0L, index); }
    /// {@return `color_description_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_color_description_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_color_description_present_flag(segment, 0L); }
    /// {@return `color_description_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int color_description_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_color_description_present_flag(this.segment(), index); }
    /// {@return `color_description_present_flag`}
    public @CType("uint32_t : 1") int color_description_present_flag() { return StdVideoH264SpsVuiFlags.get_color_description_present_flag(this.segment()); }
    /// Sets `color_description_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color_description_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_color_description_present_flag.set(segment, 0L, index, value); }
    /// Sets `color_description_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color_description_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_color_description_present_flag(segment, 0L, value); }
    /// Sets `color_description_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags color_description_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_color_description_present_flag(this.segment(), index, value); return this; }
    /// Sets `color_description_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags color_description_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_color_description_present_flag(this.segment(), value); return this; }

    /// {@return `chroma_loc_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_chroma_loc_info_present_flag(MemorySegment segment, long index) { return (int) VH_chroma_loc_info_present_flag.get(segment, 0L, index); }
    /// {@return `chroma_loc_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_chroma_loc_info_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_chroma_loc_info_present_flag(segment, 0L); }
    /// {@return `chroma_loc_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int chroma_loc_info_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_chroma_loc_info_present_flag(this.segment(), index); }
    /// {@return `chroma_loc_info_present_flag`}
    public @CType("uint32_t : 1") int chroma_loc_info_present_flag() { return StdVideoH264SpsVuiFlags.get_chroma_loc_info_present_flag(this.segment()); }
    /// Sets `chroma_loc_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_loc_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_chroma_loc_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_loc_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_loc_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_chroma_loc_info_present_flag(segment, 0L, value); }
    /// Sets `chroma_loc_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags chroma_loc_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_chroma_loc_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `chroma_loc_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags chroma_loc_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_chroma_loc_info_present_flag(this.segment(), value); return this; }

    /// {@return `timing_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_timing_info_present_flag(MemorySegment segment, long index) { return (int) VH_timing_info_present_flag.get(segment, 0L, index); }
    /// {@return `timing_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_timing_info_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_timing_info_present_flag(segment, 0L); }
    /// {@return `timing_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int timing_info_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_timing_info_present_flag(this.segment(), index); }
    /// {@return `timing_info_present_flag`}
    public @CType("uint32_t : 1") int timing_info_present_flag() { return StdVideoH264SpsVuiFlags.get_timing_info_present_flag(this.segment()); }
    /// Sets `timing_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timing_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_timing_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `timing_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timing_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_timing_info_present_flag(segment, 0L, value); }
    /// Sets `timing_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags timing_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_timing_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `timing_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags timing_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_timing_info_present_flag(this.segment(), value); return this; }

    /// {@return `fixed_frame_rate_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_fixed_frame_rate_flag(MemorySegment segment, long index) { return (int) VH_fixed_frame_rate_flag.get(segment, 0L, index); }
    /// {@return `fixed_frame_rate_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_fixed_frame_rate_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_fixed_frame_rate_flag(segment, 0L); }
    /// {@return `fixed_frame_rate_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int fixed_frame_rate_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_fixed_frame_rate_flag(this.segment(), index); }
    /// {@return `fixed_frame_rate_flag`}
    public @CType("uint32_t : 1") int fixed_frame_rate_flag() { return StdVideoH264SpsVuiFlags.get_fixed_frame_rate_flag(this.segment()); }
    /// Sets `fixed_frame_rate_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fixed_frame_rate_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_fixed_frame_rate_flag.set(segment, 0L, index, value); }
    /// Sets `fixed_frame_rate_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fixed_frame_rate_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_fixed_frame_rate_flag(segment, 0L, value); }
    /// Sets `fixed_frame_rate_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags fixed_frame_rate_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_fixed_frame_rate_flag(this.segment(), index, value); return this; }
    /// Sets `fixed_frame_rate_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags fixed_frame_rate_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_fixed_frame_rate_flag(this.segment(), value); return this; }

    /// {@return `bitstream_restriction_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_bitstream_restriction_flag(MemorySegment segment, long index) { return (int) VH_bitstream_restriction_flag.get(segment, 0L, index); }
    /// {@return `bitstream_restriction_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_bitstream_restriction_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_bitstream_restriction_flag(segment, 0L); }
    /// {@return `bitstream_restriction_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int bitstream_restriction_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_bitstream_restriction_flag(this.segment(), index); }
    /// {@return `bitstream_restriction_flag`}
    public @CType("uint32_t : 1") int bitstream_restriction_flag() { return StdVideoH264SpsVuiFlags.get_bitstream_restriction_flag(this.segment()); }
    /// Sets `bitstream_restriction_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bitstream_restriction_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_bitstream_restriction_flag.set(segment, 0L, index, value); }
    /// Sets `bitstream_restriction_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bitstream_restriction_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_bitstream_restriction_flag(segment, 0L, value); }
    /// Sets `bitstream_restriction_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags bitstream_restriction_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_bitstream_restriction_flag(this.segment(), index, value); return this; }
    /// Sets `bitstream_restriction_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags bitstream_restriction_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_bitstream_restriction_flag(this.segment(), value); return this; }

    /// {@return `nal_hrd_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_nal_hrd_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_nal_hrd_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `nal_hrd_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_nal_hrd_parameters_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_nal_hrd_parameters_present_flag(segment, 0L); }
    /// {@return `nal_hrd_parameters_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int nal_hrd_parameters_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_nal_hrd_parameters_present_flag(this.segment(), index); }
    /// {@return `nal_hrd_parameters_present_flag`}
    public @CType("uint32_t : 1") int nal_hrd_parameters_present_flag() { return StdVideoH264SpsVuiFlags.get_nal_hrd_parameters_present_flag(this.segment()); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nal_hrd_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_nal_hrd_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nal_hrd_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_nal_hrd_parameters_present_flag(segment, 0L, value); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags nal_hrd_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_nal_hrd_parameters_present_flag(this.segment(), index, value); return this; }
    /// Sets `nal_hrd_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags nal_hrd_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_nal_hrd_parameters_present_flag(this.segment(), value); return this; }

    /// {@return `vcl_hrd_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vcl_hrd_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_vcl_hrd_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `vcl_hrd_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vcl_hrd_parameters_present_flag(MemorySegment segment) { return StdVideoH264SpsVuiFlags.get_vcl_hrd_parameters_present_flag(segment, 0L); }
    /// {@return `vcl_hrd_parameters_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vcl_hrd_parameters_present_flagAt(long index) { return StdVideoH264SpsVuiFlags.get_vcl_hrd_parameters_present_flag(this.segment(), index); }
    /// {@return `vcl_hrd_parameters_present_flag`}
    public @CType("uint32_t : 1") int vcl_hrd_parameters_present_flag() { return StdVideoH264SpsVuiFlags.get_vcl_hrd_parameters_present_flag(this.segment()); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vcl_hrd_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vcl_hrd_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vcl_hrd_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_vcl_hrd_parameters_present_flag(segment, 0L, value); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags vcl_hrd_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_vcl_hrd_parameters_present_flag(this.segment(), index, value); return this; }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsVuiFlags vcl_hrd_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsVuiFlags.set_vcl_hrd_parameters_present_flag(this.segment(), value); return this; }

}
