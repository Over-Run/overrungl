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
/// ### colour_description_present_flag
/// [VarHandle][#VH_colour_description_present_flag] - [Getter][#colour_description_present_flag()] - [Setter][#colour_description_present_flag(int)]
/// ### chroma_loc_info_present_flag
/// [VarHandle][#VH_chroma_loc_info_present_flag] - [Getter][#chroma_loc_info_present_flag()] - [Setter][#chroma_loc_info_present_flag(int)]
/// ### neutral_chroma_indication_flag
/// [VarHandle][#VH_neutral_chroma_indication_flag] - [Getter][#neutral_chroma_indication_flag()] - [Setter][#neutral_chroma_indication_flag(int)]
/// ### field_seq_flag
/// [VarHandle][#VH_field_seq_flag] - [Getter][#field_seq_flag()] - [Setter][#field_seq_flag(int)]
/// ### frame_field_info_present_flag
/// [VarHandle][#VH_frame_field_info_present_flag] - [Getter][#frame_field_info_present_flag()] - [Setter][#frame_field_info_present_flag(int)]
/// ### default_display_window_flag
/// [VarHandle][#VH_default_display_window_flag] - [Getter][#default_display_window_flag()] - [Setter][#default_display_window_flag(int)]
/// ### vui_timing_info_present_flag
/// [VarHandle][#VH_vui_timing_info_present_flag] - [Getter][#vui_timing_info_present_flag()] - [Setter][#vui_timing_info_present_flag(int)]
/// ### vui_poc_proportional_to_timing_flag
/// [VarHandle][#VH_vui_poc_proportional_to_timing_flag] - [Getter][#vui_poc_proportional_to_timing_flag()] - [Setter][#vui_poc_proportional_to_timing_flag(int)]
/// ### vui_hrd_parameters_present_flag
/// [VarHandle][#VH_vui_hrd_parameters_present_flag] - [Getter][#vui_hrd_parameters_present_flag()] - [Setter][#vui_hrd_parameters_present_flag(int)]
/// ### bitstream_restriction_flag
/// [VarHandle][#VH_bitstream_restriction_flag] - [Getter][#bitstream_restriction_flag()] - [Setter][#bitstream_restriction_flag(int)]
/// ### tiles_fixed_structure_flag
/// [VarHandle][#VH_tiles_fixed_structure_flag] - [Getter][#tiles_fixed_structure_flag()] - [Setter][#tiles_fixed_structure_flag(int)]
/// ### motion_vectors_over_pic_boundaries_flag
/// [VarHandle][#VH_motion_vectors_over_pic_boundaries_flag] - [Getter][#motion_vectors_over_pic_boundaries_flag()] - [Setter][#motion_vectors_over_pic_boundaries_flag(int)]
/// ### restricted_ref_pic_lists_flag
/// [VarHandle][#VH_restricted_ref_pic_lists_flag] - [Getter][#restricted_ref_pic_lists_flag()] - [Setter][#restricted_ref_pic_lists_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265SpsVuiFlags {
///     uint32_t : 1 aspect_ratio_info_present_flag;
///     uint32_t : 1 overscan_info_present_flag;
///     uint32_t : 1 overscan_appropriate_flag;
///     uint32_t : 1 video_signal_type_present_flag;
///     uint32_t : 1 video_full_range_flag;
///     uint32_t : 1 colour_description_present_flag;
///     uint32_t : 1 chroma_loc_info_present_flag;
///     uint32_t : 1 neutral_chroma_indication_flag;
///     uint32_t : 1 field_seq_flag;
///     uint32_t : 1 frame_field_info_present_flag;
///     uint32_t : 1 default_display_window_flag;
///     uint32_t : 1 vui_timing_info_present_flag;
///     uint32_t : 1 vui_poc_proportional_to_timing_flag;
///     uint32_t : 1 vui_hrd_parameters_present_flag;
///     uint32_t : 1 bitstream_restriction_flag;
///     uint32_t : 1 tiles_fixed_structure_flag;
///     uint32_t : 1 motion_vectors_over_pic_boundaries_flag;
///     uint32_t : 1 restricted_ref_pic_lists_flag;
/// } StdVideoH265SpsVuiFlags;
/// ```
public final class StdVideoH265SpsVuiFlags extends Struct {
    /// The struct layout of `StdVideoH265SpsVuiFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspect_ratio_info_present_flag"),
        ValueLayout.JAVA_INT.withName("overscan_info_present_flag"),
        ValueLayout.JAVA_INT.withName("overscan_appropriate_flag"),
        ValueLayout.JAVA_INT.withName("video_signal_type_present_flag"),
        ValueLayout.JAVA_INT.withName("video_full_range_flag"),
        ValueLayout.JAVA_INT.withName("colour_description_present_flag"),
        ValueLayout.JAVA_INT.withName("chroma_loc_info_present_flag"),
        ValueLayout.JAVA_INT.withName("neutral_chroma_indication_flag"),
        ValueLayout.JAVA_INT.withName("field_seq_flag"),
        ValueLayout.JAVA_INT.withName("frame_field_info_present_flag"),
        ValueLayout.JAVA_INT.withName("default_display_window_flag"),
        ValueLayout.JAVA_INT.withName("vui_timing_info_present_flag"),
        ValueLayout.JAVA_INT.withName("vui_poc_proportional_to_timing_flag"),
        ValueLayout.JAVA_INT.withName("vui_hrd_parameters_present_flag"),
        ValueLayout.JAVA_INT.withName("bitstream_restriction_flag"),
        ValueLayout.JAVA_INT.withName("tiles_fixed_structure_flag"),
        ValueLayout.JAVA_INT.withName("motion_vectors_over_pic_boundaries_flag"),
        ValueLayout.JAVA_INT.withName("restricted_ref_pic_lists_flag")
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
    /// The [VarHandle] of `colour_description_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colour_description_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colour_description_present_flag"));
    /// The [VarHandle] of `chroma_loc_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_loc_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_loc_info_present_flag"));
    /// The [VarHandle] of `neutral_chroma_indication_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_neutral_chroma_indication_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("neutral_chroma_indication_flag"));
    /// The [VarHandle] of `field_seq_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_field_seq_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("field_seq_flag"));
    /// The [VarHandle] of `frame_field_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_field_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_field_info_present_flag"));
    /// The [VarHandle] of `default_display_window_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_default_display_window_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("default_display_window_flag"));
    /// The [VarHandle] of `vui_timing_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_timing_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_timing_info_present_flag"));
    /// The [VarHandle] of `vui_poc_proportional_to_timing_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_poc_proportional_to_timing_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_poc_proportional_to_timing_flag"));
    /// The [VarHandle] of `vui_hrd_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_hrd_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_hrd_parameters_present_flag"));
    /// The [VarHandle] of `bitstream_restriction_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bitstream_restriction_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bitstream_restriction_flag"));
    /// The [VarHandle] of `tiles_fixed_structure_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tiles_fixed_structure_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiles_fixed_structure_flag"));
    /// The [VarHandle] of `motion_vectors_over_pic_boundaries_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_motion_vectors_over_pic_boundaries_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("motion_vectors_over_pic_boundaries_flag"));
    /// The [VarHandle] of `restricted_ref_pic_lists_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_restricted_ref_pic_lists_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("restricted_ref_pic_lists_flag"));

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SpsVuiFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SpsVuiFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsVuiFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsVuiFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265SpsVuiFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SpsVuiFlags`
    public static StdVideoH265SpsVuiFlags alloc(SegmentAllocator allocator) { return new StdVideoH265SpsVuiFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SpsVuiFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SpsVuiFlags`
    public static StdVideoH265SpsVuiFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SpsVuiFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `aspect_ratio_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_aspect_ratio_info_present_flag(MemorySegment segment, long index) { return (int) VH_aspect_ratio_info_present_flag.get(segment, 0L, index); }
    /// {@return `aspect_ratio_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_aspect_ratio_info_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_aspect_ratio_info_present_flag(segment, 0L); }
    /// {@return `aspect_ratio_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int aspect_ratio_info_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_aspect_ratio_info_present_flag(this.segment(), index); }
    /// {@return `aspect_ratio_info_present_flag`}
    public @CType("uint32_t : 1") int aspect_ratio_info_present_flag() { return StdVideoH265SpsVuiFlags.get_aspect_ratio_info_present_flag(this.segment()); }
    /// Sets `aspect_ratio_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspect_ratio_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_aspect_ratio_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspect_ratio_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_aspect_ratio_info_present_flag(segment, 0L, value); }
    /// Sets `aspect_ratio_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags aspect_ratio_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_aspect_ratio_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `aspect_ratio_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags aspect_ratio_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_aspect_ratio_info_present_flag(this.segment(), value); return this; }

    /// {@return `overscan_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_overscan_info_present_flag(MemorySegment segment, long index) { return (int) VH_overscan_info_present_flag.get(segment, 0L, index); }
    /// {@return `overscan_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_overscan_info_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_overscan_info_present_flag(segment, 0L); }
    /// {@return `overscan_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int overscan_info_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_overscan_info_present_flag(this.segment(), index); }
    /// {@return `overscan_info_present_flag`}
    public @CType("uint32_t : 1") int overscan_info_present_flag() { return StdVideoH265SpsVuiFlags.get_overscan_info_present_flag(this.segment()); }
    /// Sets `overscan_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_overscan_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_overscan_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `overscan_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_overscan_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_info_present_flag(segment, 0L, value); }
    /// Sets `overscan_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags overscan_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `overscan_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags overscan_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_info_present_flag(this.segment(), value); return this; }

    /// {@return `overscan_appropriate_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_overscan_appropriate_flag(MemorySegment segment, long index) { return (int) VH_overscan_appropriate_flag.get(segment, 0L, index); }
    /// {@return `overscan_appropriate_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_overscan_appropriate_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_overscan_appropriate_flag(segment, 0L); }
    /// {@return `overscan_appropriate_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int overscan_appropriate_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_overscan_appropriate_flag(this.segment(), index); }
    /// {@return `overscan_appropriate_flag`}
    public @CType("uint32_t : 1") int overscan_appropriate_flag() { return StdVideoH265SpsVuiFlags.get_overscan_appropriate_flag(this.segment()); }
    /// Sets `overscan_appropriate_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_overscan_appropriate_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_overscan_appropriate_flag.set(segment, 0L, index, value); }
    /// Sets `overscan_appropriate_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_overscan_appropriate_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_appropriate_flag(segment, 0L, value); }
    /// Sets `overscan_appropriate_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags overscan_appropriate_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_appropriate_flag(this.segment(), index, value); return this; }
    /// Sets `overscan_appropriate_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags overscan_appropriate_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_overscan_appropriate_flag(this.segment(), value); return this; }

    /// {@return `video_signal_type_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_video_signal_type_present_flag(MemorySegment segment, long index) { return (int) VH_video_signal_type_present_flag.get(segment, 0L, index); }
    /// {@return `video_signal_type_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_video_signal_type_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_video_signal_type_present_flag(segment, 0L); }
    /// {@return `video_signal_type_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int video_signal_type_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_video_signal_type_present_flag(this.segment(), index); }
    /// {@return `video_signal_type_present_flag`}
    public @CType("uint32_t : 1") int video_signal_type_present_flag() { return StdVideoH265SpsVuiFlags.get_video_signal_type_present_flag(this.segment()); }
    /// Sets `video_signal_type_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_signal_type_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_video_signal_type_present_flag.set(segment, 0L, index, value); }
    /// Sets `video_signal_type_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_signal_type_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_signal_type_present_flag(segment, 0L, value); }
    /// Sets `video_signal_type_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags video_signal_type_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_signal_type_present_flag(this.segment(), index, value); return this; }
    /// Sets `video_signal_type_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags video_signal_type_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_signal_type_present_flag(this.segment(), value); return this; }

    /// {@return `video_full_range_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_video_full_range_flag(MemorySegment segment, long index) { return (int) VH_video_full_range_flag.get(segment, 0L, index); }
    /// {@return `video_full_range_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_video_full_range_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_video_full_range_flag(segment, 0L); }
    /// {@return `video_full_range_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int video_full_range_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_video_full_range_flag(this.segment(), index); }
    /// {@return `video_full_range_flag`}
    public @CType("uint32_t : 1") int video_full_range_flag() { return StdVideoH265SpsVuiFlags.get_video_full_range_flag(this.segment()); }
    /// Sets `video_full_range_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_full_range_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_video_full_range_flag.set(segment, 0L, index, value); }
    /// Sets `video_full_range_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_full_range_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_full_range_flag(segment, 0L, value); }
    /// Sets `video_full_range_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags video_full_range_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_full_range_flag(this.segment(), index, value); return this; }
    /// Sets `video_full_range_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags video_full_range_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_video_full_range_flag(this.segment(), value); return this; }

    /// {@return `colour_description_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_colour_description_present_flag(MemorySegment segment, long index) { return (int) VH_colour_description_present_flag.get(segment, 0L, index); }
    /// {@return `colour_description_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_colour_description_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_colour_description_present_flag(segment, 0L); }
    /// {@return `colour_description_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int colour_description_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_colour_description_present_flag(this.segment(), index); }
    /// {@return `colour_description_present_flag`}
    public @CType("uint32_t : 1") int colour_description_present_flag() { return StdVideoH265SpsVuiFlags.get_colour_description_present_flag(this.segment()); }
    /// Sets `colour_description_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colour_description_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_colour_description_present_flag.set(segment, 0L, index, value); }
    /// Sets `colour_description_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colour_description_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_colour_description_present_flag(segment, 0L, value); }
    /// Sets `colour_description_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags colour_description_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_colour_description_present_flag(this.segment(), index, value); return this; }
    /// Sets `colour_description_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags colour_description_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_colour_description_present_flag(this.segment(), value); return this; }

    /// {@return `chroma_loc_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_chroma_loc_info_present_flag(MemorySegment segment, long index) { return (int) VH_chroma_loc_info_present_flag.get(segment, 0L, index); }
    /// {@return `chroma_loc_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_chroma_loc_info_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_chroma_loc_info_present_flag(segment, 0L); }
    /// {@return `chroma_loc_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int chroma_loc_info_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_chroma_loc_info_present_flag(this.segment(), index); }
    /// {@return `chroma_loc_info_present_flag`}
    public @CType("uint32_t : 1") int chroma_loc_info_present_flag() { return StdVideoH265SpsVuiFlags.get_chroma_loc_info_present_flag(this.segment()); }
    /// Sets `chroma_loc_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_loc_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_chroma_loc_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_loc_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_loc_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_chroma_loc_info_present_flag(segment, 0L, value); }
    /// Sets `chroma_loc_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags chroma_loc_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_chroma_loc_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `chroma_loc_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags chroma_loc_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_chroma_loc_info_present_flag(this.segment(), value); return this; }

    /// {@return `neutral_chroma_indication_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_neutral_chroma_indication_flag(MemorySegment segment, long index) { return (int) VH_neutral_chroma_indication_flag.get(segment, 0L, index); }
    /// {@return `neutral_chroma_indication_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_neutral_chroma_indication_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_neutral_chroma_indication_flag(segment, 0L); }
    /// {@return `neutral_chroma_indication_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int neutral_chroma_indication_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_neutral_chroma_indication_flag(this.segment(), index); }
    /// {@return `neutral_chroma_indication_flag`}
    public @CType("uint32_t : 1") int neutral_chroma_indication_flag() { return StdVideoH265SpsVuiFlags.get_neutral_chroma_indication_flag(this.segment()); }
    /// Sets `neutral_chroma_indication_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_neutral_chroma_indication_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_neutral_chroma_indication_flag.set(segment, 0L, index, value); }
    /// Sets `neutral_chroma_indication_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_neutral_chroma_indication_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_neutral_chroma_indication_flag(segment, 0L, value); }
    /// Sets `neutral_chroma_indication_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags neutral_chroma_indication_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_neutral_chroma_indication_flag(this.segment(), index, value); return this; }
    /// Sets `neutral_chroma_indication_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags neutral_chroma_indication_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_neutral_chroma_indication_flag(this.segment(), value); return this; }

    /// {@return `field_seq_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_field_seq_flag(MemorySegment segment, long index) { return (int) VH_field_seq_flag.get(segment, 0L, index); }
    /// {@return `field_seq_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_field_seq_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_field_seq_flag(segment, 0L); }
    /// {@return `field_seq_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int field_seq_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_field_seq_flag(this.segment(), index); }
    /// {@return `field_seq_flag`}
    public @CType("uint32_t : 1") int field_seq_flag() { return StdVideoH265SpsVuiFlags.get_field_seq_flag(this.segment()); }
    /// Sets `field_seq_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_field_seq_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_field_seq_flag.set(segment, 0L, index, value); }
    /// Sets `field_seq_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_field_seq_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_field_seq_flag(segment, 0L, value); }
    /// Sets `field_seq_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags field_seq_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_field_seq_flag(this.segment(), index, value); return this; }
    /// Sets `field_seq_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags field_seq_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_field_seq_flag(this.segment(), value); return this; }

    /// {@return `frame_field_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_field_info_present_flag(MemorySegment segment, long index) { return (int) VH_frame_field_info_present_flag.get(segment, 0L, index); }
    /// {@return `frame_field_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_field_info_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_frame_field_info_present_flag(segment, 0L); }
    /// {@return `frame_field_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int frame_field_info_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_frame_field_info_present_flag(this.segment(), index); }
    /// {@return `frame_field_info_present_flag`}
    public @CType("uint32_t : 1") int frame_field_info_present_flag() { return StdVideoH265SpsVuiFlags.get_frame_field_info_present_flag(this.segment()); }
    /// Sets `frame_field_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_field_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_field_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `frame_field_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_field_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_frame_field_info_present_flag(segment, 0L, value); }
    /// Sets `frame_field_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags frame_field_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_frame_field_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `frame_field_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags frame_field_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_frame_field_info_present_flag(this.segment(), value); return this; }

    /// {@return `default_display_window_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_default_display_window_flag(MemorySegment segment, long index) { return (int) VH_default_display_window_flag.get(segment, 0L, index); }
    /// {@return `default_display_window_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_default_display_window_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_default_display_window_flag(segment, 0L); }
    /// {@return `default_display_window_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int default_display_window_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_default_display_window_flag(this.segment(), index); }
    /// {@return `default_display_window_flag`}
    public @CType("uint32_t : 1") int default_display_window_flag() { return StdVideoH265SpsVuiFlags.get_default_display_window_flag(this.segment()); }
    /// Sets `default_display_window_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_default_display_window_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_default_display_window_flag.set(segment, 0L, index, value); }
    /// Sets `default_display_window_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_default_display_window_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_default_display_window_flag(segment, 0L, value); }
    /// Sets `default_display_window_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags default_display_window_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_default_display_window_flag(this.segment(), index, value); return this; }
    /// Sets `default_display_window_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags default_display_window_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_default_display_window_flag(this.segment(), value); return this; }

    /// {@return `vui_timing_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vui_timing_info_present_flag(MemorySegment segment, long index) { return (int) VH_vui_timing_info_present_flag.get(segment, 0L, index); }
    /// {@return `vui_timing_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vui_timing_info_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_vui_timing_info_present_flag(segment, 0L); }
    /// {@return `vui_timing_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vui_timing_info_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_vui_timing_info_present_flag(this.segment(), index); }
    /// {@return `vui_timing_info_present_flag`}
    public @CType("uint32_t : 1") int vui_timing_info_present_flag() { return StdVideoH265SpsVuiFlags.get_vui_timing_info_present_flag(this.segment()); }
    /// Sets `vui_timing_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_timing_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vui_timing_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `vui_timing_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_timing_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_timing_info_present_flag(segment, 0L, value); }
    /// Sets `vui_timing_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_timing_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_timing_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `vui_timing_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_timing_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_timing_info_present_flag(this.segment(), value); return this; }

    /// {@return `vui_poc_proportional_to_timing_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vui_poc_proportional_to_timing_flag(MemorySegment segment, long index) { return (int) VH_vui_poc_proportional_to_timing_flag.get(segment, 0L, index); }
    /// {@return `vui_poc_proportional_to_timing_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vui_poc_proportional_to_timing_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_vui_poc_proportional_to_timing_flag(segment, 0L); }
    /// {@return `vui_poc_proportional_to_timing_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vui_poc_proportional_to_timing_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_vui_poc_proportional_to_timing_flag(this.segment(), index); }
    /// {@return `vui_poc_proportional_to_timing_flag`}
    public @CType("uint32_t : 1") int vui_poc_proportional_to_timing_flag() { return StdVideoH265SpsVuiFlags.get_vui_poc_proportional_to_timing_flag(this.segment()); }
    /// Sets `vui_poc_proportional_to_timing_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_poc_proportional_to_timing_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vui_poc_proportional_to_timing_flag.set(segment, 0L, index, value); }
    /// Sets `vui_poc_proportional_to_timing_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_poc_proportional_to_timing_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_poc_proportional_to_timing_flag(segment, 0L, value); }
    /// Sets `vui_poc_proportional_to_timing_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_poc_proportional_to_timing_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_poc_proportional_to_timing_flag(this.segment(), index, value); return this; }
    /// Sets `vui_poc_proportional_to_timing_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_poc_proportional_to_timing_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_poc_proportional_to_timing_flag(this.segment(), value); return this; }

    /// {@return `vui_hrd_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vui_hrd_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_vui_hrd_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `vui_hrd_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vui_hrd_parameters_present_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_vui_hrd_parameters_present_flag(segment, 0L); }
    /// {@return `vui_hrd_parameters_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vui_hrd_parameters_present_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_vui_hrd_parameters_present_flag(this.segment(), index); }
    /// {@return `vui_hrd_parameters_present_flag`}
    public @CType("uint32_t : 1") int vui_hrd_parameters_present_flag() { return StdVideoH265SpsVuiFlags.get_vui_hrd_parameters_present_flag(this.segment()); }
    /// Sets `vui_hrd_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_hrd_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vui_hrd_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `vui_hrd_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_hrd_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_hrd_parameters_present_flag(segment, 0L, value); }
    /// Sets `vui_hrd_parameters_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_hrd_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_hrd_parameters_present_flag(this.segment(), index, value); return this; }
    /// Sets `vui_hrd_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags vui_hrd_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_vui_hrd_parameters_present_flag(this.segment(), value); return this; }

    /// {@return `bitstream_restriction_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_bitstream_restriction_flag(MemorySegment segment, long index) { return (int) VH_bitstream_restriction_flag.get(segment, 0L, index); }
    /// {@return `bitstream_restriction_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_bitstream_restriction_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_bitstream_restriction_flag(segment, 0L); }
    /// {@return `bitstream_restriction_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int bitstream_restriction_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_bitstream_restriction_flag(this.segment(), index); }
    /// {@return `bitstream_restriction_flag`}
    public @CType("uint32_t : 1") int bitstream_restriction_flag() { return StdVideoH265SpsVuiFlags.get_bitstream_restriction_flag(this.segment()); }
    /// Sets `bitstream_restriction_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bitstream_restriction_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_bitstream_restriction_flag.set(segment, 0L, index, value); }
    /// Sets `bitstream_restriction_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bitstream_restriction_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_bitstream_restriction_flag(segment, 0L, value); }
    /// Sets `bitstream_restriction_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags bitstream_restriction_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_bitstream_restriction_flag(this.segment(), index, value); return this; }
    /// Sets `bitstream_restriction_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags bitstream_restriction_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_bitstream_restriction_flag(this.segment(), value); return this; }

    /// {@return `tiles_fixed_structure_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_tiles_fixed_structure_flag(MemorySegment segment, long index) { return (int) VH_tiles_fixed_structure_flag.get(segment, 0L, index); }
    /// {@return `tiles_fixed_structure_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_tiles_fixed_structure_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_tiles_fixed_structure_flag(segment, 0L); }
    /// {@return `tiles_fixed_structure_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int tiles_fixed_structure_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_tiles_fixed_structure_flag(this.segment(), index); }
    /// {@return `tiles_fixed_structure_flag`}
    public @CType("uint32_t : 1") int tiles_fixed_structure_flag() { return StdVideoH265SpsVuiFlags.get_tiles_fixed_structure_flag(this.segment()); }
    /// Sets `tiles_fixed_structure_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tiles_fixed_structure_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_tiles_fixed_structure_flag.set(segment, 0L, index, value); }
    /// Sets `tiles_fixed_structure_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tiles_fixed_structure_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_tiles_fixed_structure_flag(segment, 0L, value); }
    /// Sets `tiles_fixed_structure_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags tiles_fixed_structure_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_tiles_fixed_structure_flag(this.segment(), index, value); return this; }
    /// Sets `tiles_fixed_structure_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags tiles_fixed_structure_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_tiles_fixed_structure_flag(this.segment(), value); return this; }

    /// {@return `motion_vectors_over_pic_boundaries_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_motion_vectors_over_pic_boundaries_flag(MemorySegment segment, long index) { return (int) VH_motion_vectors_over_pic_boundaries_flag.get(segment, 0L, index); }
    /// {@return `motion_vectors_over_pic_boundaries_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_motion_vectors_over_pic_boundaries_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_motion_vectors_over_pic_boundaries_flag(segment, 0L); }
    /// {@return `motion_vectors_over_pic_boundaries_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int motion_vectors_over_pic_boundaries_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_motion_vectors_over_pic_boundaries_flag(this.segment(), index); }
    /// {@return `motion_vectors_over_pic_boundaries_flag`}
    public @CType("uint32_t : 1") int motion_vectors_over_pic_boundaries_flag() { return StdVideoH265SpsVuiFlags.get_motion_vectors_over_pic_boundaries_flag(this.segment()); }
    /// Sets `motion_vectors_over_pic_boundaries_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_motion_vectors_over_pic_boundaries_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_motion_vectors_over_pic_boundaries_flag.set(segment, 0L, index, value); }
    /// Sets `motion_vectors_over_pic_boundaries_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_motion_vectors_over_pic_boundaries_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_motion_vectors_over_pic_boundaries_flag(segment, 0L, value); }
    /// Sets `motion_vectors_over_pic_boundaries_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags motion_vectors_over_pic_boundaries_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_motion_vectors_over_pic_boundaries_flag(this.segment(), index, value); return this; }
    /// Sets `motion_vectors_over_pic_boundaries_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags motion_vectors_over_pic_boundaries_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_motion_vectors_over_pic_boundaries_flag(this.segment(), value); return this; }

    /// {@return `restricted_ref_pic_lists_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_restricted_ref_pic_lists_flag(MemorySegment segment, long index) { return (int) VH_restricted_ref_pic_lists_flag.get(segment, 0L, index); }
    /// {@return `restricted_ref_pic_lists_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_restricted_ref_pic_lists_flag(MemorySegment segment) { return StdVideoH265SpsVuiFlags.get_restricted_ref_pic_lists_flag(segment, 0L); }
    /// {@return `restricted_ref_pic_lists_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int restricted_ref_pic_lists_flagAt(long index) { return StdVideoH265SpsVuiFlags.get_restricted_ref_pic_lists_flag(this.segment(), index); }
    /// {@return `restricted_ref_pic_lists_flag`}
    public @CType("uint32_t : 1") int restricted_ref_pic_lists_flag() { return StdVideoH265SpsVuiFlags.get_restricted_ref_pic_lists_flag(this.segment()); }
    /// Sets `restricted_ref_pic_lists_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_restricted_ref_pic_lists_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_restricted_ref_pic_lists_flag.set(segment, 0L, index, value); }
    /// Sets `restricted_ref_pic_lists_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_restricted_ref_pic_lists_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_restricted_ref_pic_lists_flag(segment, 0L, value); }
    /// Sets `restricted_ref_pic_lists_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags restricted_ref_pic_lists_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_restricted_ref_pic_lists_flag(this.segment(), index, value); return this; }
    /// Sets `restricted_ref_pic_lists_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsVuiFlags restricted_ref_pic_lists_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsVuiFlags.set_restricted_ref_pic_lists_flag(this.segment(), value); return this; }

}
