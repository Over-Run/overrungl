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
/// ### sps_temporal_id_nesting_flag
/// [VarHandle][#VH_sps_temporal_id_nesting_flag] - [Getter][#sps_temporal_id_nesting_flag()] - [Setter][#sps_temporal_id_nesting_flag(int)]
/// ### separate_colour_plane_flag
/// [VarHandle][#VH_separate_colour_plane_flag] - [Getter][#separate_colour_plane_flag()] - [Setter][#separate_colour_plane_flag(int)]
/// ### conformance_window_flag
/// [VarHandle][#VH_conformance_window_flag] - [Getter][#conformance_window_flag()] - [Setter][#conformance_window_flag(int)]
/// ### sps_sub_layer_ordering_info_present_flag
/// [VarHandle][#VH_sps_sub_layer_ordering_info_present_flag] - [Getter][#sps_sub_layer_ordering_info_present_flag()] - [Setter][#sps_sub_layer_ordering_info_present_flag(int)]
/// ### scaling_list_enabled_flag
/// [VarHandle][#VH_scaling_list_enabled_flag] - [Getter][#scaling_list_enabled_flag()] - [Setter][#scaling_list_enabled_flag(int)]
/// ### sps_scaling_list_data_present_flag
/// [VarHandle][#VH_sps_scaling_list_data_present_flag] - [Getter][#sps_scaling_list_data_present_flag()] - [Setter][#sps_scaling_list_data_present_flag(int)]
/// ### amp_enabled_flag
/// [VarHandle][#VH_amp_enabled_flag] - [Getter][#amp_enabled_flag()] - [Setter][#amp_enabled_flag(int)]
/// ### sample_adaptive_offset_enabled_flag
/// [VarHandle][#VH_sample_adaptive_offset_enabled_flag] - [Getter][#sample_adaptive_offset_enabled_flag()] - [Setter][#sample_adaptive_offset_enabled_flag(int)]
/// ### pcm_enabled_flag
/// [VarHandle][#VH_pcm_enabled_flag] - [Getter][#pcm_enabled_flag()] - [Setter][#pcm_enabled_flag(int)]
/// ### pcm_loop_filter_disabled_flag
/// [VarHandle][#VH_pcm_loop_filter_disabled_flag] - [Getter][#pcm_loop_filter_disabled_flag()] - [Setter][#pcm_loop_filter_disabled_flag(int)]
/// ### long_term_ref_pics_present_flag
/// [VarHandle][#VH_long_term_ref_pics_present_flag] - [Getter][#long_term_ref_pics_present_flag()] - [Setter][#long_term_ref_pics_present_flag(int)]
/// ### sps_temporal_mvp_enabled_flag
/// [VarHandle][#VH_sps_temporal_mvp_enabled_flag] - [Getter][#sps_temporal_mvp_enabled_flag()] - [Setter][#sps_temporal_mvp_enabled_flag(int)]
/// ### strong_intra_smoothing_enabled_flag
/// [VarHandle][#VH_strong_intra_smoothing_enabled_flag] - [Getter][#strong_intra_smoothing_enabled_flag()] - [Setter][#strong_intra_smoothing_enabled_flag(int)]
/// ### vui_parameters_present_flag
/// [VarHandle][#VH_vui_parameters_present_flag] - [Getter][#vui_parameters_present_flag()] - [Setter][#vui_parameters_present_flag(int)]
/// ### sps_extension_present_flag
/// [VarHandle][#VH_sps_extension_present_flag] - [Getter][#sps_extension_present_flag()] - [Setter][#sps_extension_present_flag(int)]
/// ### sps_range_extension_flag
/// [VarHandle][#VH_sps_range_extension_flag] - [Getter][#sps_range_extension_flag()] - [Setter][#sps_range_extension_flag(int)]
/// ### transform_skip_rotation_enabled_flag
/// [VarHandle][#VH_transform_skip_rotation_enabled_flag] - [Getter][#transform_skip_rotation_enabled_flag()] - [Setter][#transform_skip_rotation_enabled_flag(int)]
/// ### transform_skip_context_enabled_flag
/// [VarHandle][#VH_transform_skip_context_enabled_flag] - [Getter][#transform_skip_context_enabled_flag()] - [Setter][#transform_skip_context_enabled_flag(int)]
/// ### implicit_rdpcm_enabled_flag
/// [VarHandle][#VH_implicit_rdpcm_enabled_flag] - [Getter][#implicit_rdpcm_enabled_flag()] - [Setter][#implicit_rdpcm_enabled_flag(int)]
/// ### explicit_rdpcm_enabled_flag
/// [VarHandle][#VH_explicit_rdpcm_enabled_flag] - [Getter][#explicit_rdpcm_enabled_flag()] - [Setter][#explicit_rdpcm_enabled_flag(int)]
/// ### extended_precision_processing_flag
/// [VarHandle][#VH_extended_precision_processing_flag] - [Getter][#extended_precision_processing_flag()] - [Setter][#extended_precision_processing_flag(int)]
/// ### intra_smoothing_disabled_flag
/// [VarHandle][#VH_intra_smoothing_disabled_flag] - [Getter][#intra_smoothing_disabled_flag()] - [Setter][#intra_smoothing_disabled_flag(int)]
/// ### high_precision_offsets_enabled_flag
/// [VarHandle][#VH_high_precision_offsets_enabled_flag] - [Getter][#high_precision_offsets_enabled_flag()] - [Setter][#high_precision_offsets_enabled_flag(int)]
/// ### persistent_rice_adaptation_enabled_flag
/// [VarHandle][#VH_persistent_rice_adaptation_enabled_flag] - [Getter][#persistent_rice_adaptation_enabled_flag()] - [Setter][#persistent_rice_adaptation_enabled_flag(int)]
/// ### cabac_bypass_alignment_enabled_flag
/// [VarHandle][#VH_cabac_bypass_alignment_enabled_flag] - [Getter][#cabac_bypass_alignment_enabled_flag()] - [Setter][#cabac_bypass_alignment_enabled_flag(int)]
/// ### sps_scc_extension_flag
/// [VarHandle][#VH_sps_scc_extension_flag] - [Getter][#sps_scc_extension_flag()] - [Setter][#sps_scc_extension_flag(int)]
/// ### sps_curr_pic_ref_enabled_flag
/// [VarHandle][#VH_sps_curr_pic_ref_enabled_flag] - [Getter][#sps_curr_pic_ref_enabled_flag()] - [Setter][#sps_curr_pic_ref_enabled_flag(int)]
/// ### palette_mode_enabled_flag
/// [VarHandle][#VH_palette_mode_enabled_flag] - [Getter][#palette_mode_enabled_flag()] - [Setter][#palette_mode_enabled_flag(int)]
/// ### sps_palette_predictor_initializers_present_flag
/// [VarHandle][#VH_sps_palette_predictor_initializers_present_flag] - [Getter][#sps_palette_predictor_initializers_present_flag()] - [Setter][#sps_palette_predictor_initializers_present_flag(int)]
/// ### intra_boundary_filtering_disabled_flag
/// [VarHandle][#VH_intra_boundary_filtering_disabled_flag] - [Getter][#intra_boundary_filtering_disabled_flag()] - [Setter][#intra_boundary_filtering_disabled_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265SpsFlags {
///     uint32_t : 1 sps_temporal_id_nesting_flag;
///     uint32_t : 1 separate_colour_plane_flag;
///     uint32_t : 1 conformance_window_flag;
///     uint32_t : 1 sps_sub_layer_ordering_info_present_flag;
///     uint32_t : 1 scaling_list_enabled_flag;
///     uint32_t : 1 sps_scaling_list_data_present_flag;
///     uint32_t : 1 amp_enabled_flag;
///     uint32_t : 1 sample_adaptive_offset_enabled_flag;
///     uint32_t : 1 pcm_enabled_flag;
///     uint32_t : 1 pcm_loop_filter_disabled_flag;
///     uint32_t : 1 long_term_ref_pics_present_flag;
///     uint32_t : 1 sps_temporal_mvp_enabled_flag;
///     uint32_t : 1 strong_intra_smoothing_enabled_flag;
///     uint32_t : 1 vui_parameters_present_flag;
///     uint32_t : 1 sps_extension_present_flag;
///     uint32_t : 1 sps_range_extension_flag;
///     uint32_t : 1 transform_skip_rotation_enabled_flag;
///     uint32_t : 1 transform_skip_context_enabled_flag;
///     uint32_t : 1 implicit_rdpcm_enabled_flag;
///     uint32_t : 1 explicit_rdpcm_enabled_flag;
///     uint32_t : 1 extended_precision_processing_flag;
///     uint32_t : 1 intra_smoothing_disabled_flag;
///     uint32_t : 1 high_precision_offsets_enabled_flag;
///     uint32_t : 1 persistent_rice_adaptation_enabled_flag;
///     uint32_t : 1 cabac_bypass_alignment_enabled_flag;
///     uint32_t : 1 sps_scc_extension_flag;
///     uint32_t : 1 sps_curr_pic_ref_enabled_flag;
///     uint32_t : 1 palette_mode_enabled_flag;
///     uint32_t : 1 sps_palette_predictor_initializers_present_flag;
///     uint32_t : 1 intra_boundary_filtering_disabled_flag;
/// } StdVideoH265SpsFlags;
/// ```
public final class StdVideoH265SpsFlags extends Struct {
    /// The struct layout of `StdVideoH265SpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sps_temporal_id_nesting_flag"),
        ValueLayout.JAVA_INT.withName("separate_colour_plane_flag"),
        ValueLayout.JAVA_INT.withName("conformance_window_flag"),
        ValueLayout.JAVA_INT.withName("sps_sub_layer_ordering_info_present_flag"),
        ValueLayout.JAVA_INT.withName("scaling_list_enabled_flag"),
        ValueLayout.JAVA_INT.withName("sps_scaling_list_data_present_flag"),
        ValueLayout.JAVA_INT.withName("amp_enabled_flag"),
        ValueLayout.JAVA_INT.withName("sample_adaptive_offset_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pcm_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pcm_loop_filter_disabled_flag"),
        ValueLayout.JAVA_INT.withName("long_term_ref_pics_present_flag"),
        ValueLayout.JAVA_INT.withName("sps_temporal_mvp_enabled_flag"),
        ValueLayout.JAVA_INT.withName("strong_intra_smoothing_enabled_flag"),
        ValueLayout.JAVA_INT.withName("vui_parameters_present_flag"),
        ValueLayout.JAVA_INT.withName("sps_extension_present_flag"),
        ValueLayout.JAVA_INT.withName("sps_range_extension_flag"),
        ValueLayout.JAVA_INT.withName("transform_skip_rotation_enabled_flag"),
        ValueLayout.JAVA_INT.withName("transform_skip_context_enabled_flag"),
        ValueLayout.JAVA_INT.withName("implicit_rdpcm_enabled_flag"),
        ValueLayout.JAVA_INT.withName("explicit_rdpcm_enabled_flag"),
        ValueLayout.JAVA_INT.withName("extended_precision_processing_flag"),
        ValueLayout.JAVA_INT.withName("intra_smoothing_disabled_flag"),
        ValueLayout.JAVA_INT.withName("high_precision_offsets_enabled_flag"),
        ValueLayout.JAVA_INT.withName("persistent_rice_adaptation_enabled_flag"),
        ValueLayout.JAVA_INT.withName("cabac_bypass_alignment_enabled_flag"),
        ValueLayout.JAVA_INT.withName("sps_scc_extension_flag"),
        ValueLayout.JAVA_INT.withName("sps_curr_pic_ref_enabled_flag"),
        ValueLayout.JAVA_INT.withName("palette_mode_enabled_flag"),
        ValueLayout.JAVA_INT.withName("sps_palette_predictor_initializers_present_flag"),
        ValueLayout.JAVA_INT.withName("intra_boundary_filtering_disabled_flag")
    );
    /// The [VarHandle] of `sps_temporal_id_nesting_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_temporal_id_nesting_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_temporal_id_nesting_flag"));
    /// The [VarHandle] of `separate_colour_plane_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separate_colour_plane_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separate_colour_plane_flag"));
    /// The [VarHandle] of `conformance_window_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conformance_window_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformance_window_flag"));
    /// The [VarHandle] of `sps_sub_layer_ordering_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_sub_layer_ordering_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_sub_layer_ordering_info_present_flag"));
    /// The [VarHandle] of `scaling_list_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scaling_list_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scaling_list_enabled_flag"));
    /// The [VarHandle] of `sps_scaling_list_data_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_scaling_list_data_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_scaling_list_data_present_flag"));
    /// The [VarHandle] of `amp_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_amp_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("amp_enabled_flag"));
    /// The [VarHandle] of `sample_adaptive_offset_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sample_adaptive_offset_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample_adaptive_offset_enabled_flag"));
    /// The [VarHandle] of `pcm_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pcm_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_enabled_flag"));
    /// The [VarHandle] of `pcm_loop_filter_disabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pcm_loop_filter_disabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_loop_filter_disabled_flag"));
    /// The [VarHandle] of `long_term_ref_pics_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_long_term_ref_pics_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_ref_pics_present_flag"));
    /// The [VarHandle] of `sps_temporal_mvp_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_temporal_mvp_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_temporal_mvp_enabled_flag"));
    /// The [VarHandle] of `strong_intra_smoothing_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_strong_intra_smoothing_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("strong_intra_smoothing_enabled_flag"));
    /// The [VarHandle] of `vui_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_parameters_present_flag"));
    /// The [VarHandle] of `sps_extension_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_extension_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_extension_present_flag"));
    /// The [VarHandle] of `sps_range_extension_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_range_extension_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_range_extension_flag"));
    /// The [VarHandle] of `transform_skip_rotation_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform_skip_rotation_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform_skip_rotation_enabled_flag"));
    /// The [VarHandle] of `transform_skip_context_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform_skip_context_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform_skip_context_enabled_flag"));
    /// The [VarHandle] of `implicit_rdpcm_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_implicit_rdpcm_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implicit_rdpcm_enabled_flag"));
    /// The [VarHandle] of `explicit_rdpcm_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_explicit_rdpcm_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("explicit_rdpcm_enabled_flag"));
    /// The [VarHandle] of `extended_precision_processing_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extended_precision_processing_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extended_precision_processing_flag"));
    /// The [VarHandle] of `intra_smoothing_disabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intra_smoothing_disabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intra_smoothing_disabled_flag"));
    /// The [VarHandle] of `high_precision_offsets_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_high_precision_offsets_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("high_precision_offsets_enabled_flag"));
    /// The [VarHandle] of `persistent_rice_adaptation_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_persistent_rice_adaptation_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistent_rice_adaptation_enabled_flag"));
    /// The [VarHandle] of `cabac_bypass_alignment_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cabac_bypass_alignment_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cabac_bypass_alignment_enabled_flag"));
    /// The [VarHandle] of `sps_scc_extension_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_scc_extension_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_scc_extension_flag"));
    /// The [VarHandle] of `sps_curr_pic_ref_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_curr_pic_ref_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_curr_pic_ref_enabled_flag"));
    /// The [VarHandle] of `palette_mode_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_palette_mode_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("palette_mode_enabled_flag"));
    /// The [VarHandle] of `sps_palette_predictor_initializers_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sps_palette_predictor_initializers_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_palette_predictor_initializers_present_flag"));
    /// The [VarHandle] of `intra_boundary_filtering_disabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intra_boundary_filtering_disabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intra_boundary_filtering_disabled_flag"));

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SpsFlags`
    public static StdVideoH265SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265SpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SpsFlags`
    public static StdVideoH265SpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SpsFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `sps_temporal_id_nesting_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_temporal_id_nesting_flag(MemorySegment segment, long index) { return (int) VH_sps_temporal_id_nesting_flag.get(segment, 0L, index); }
    /// {@return `sps_temporal_id_nesting_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_temporal_id_nesting_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_temporal_id_nesting_flag(segment, 0L); }
    /// {@return `sps_temporal_id_nesting_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_temporal_id_nesting_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_temporal_id_nesting_flag(this.segment(), index); }
    /// {@return `sps_temporal_id_nesting_flag`}
    public @CType("uint32_t : 1") int sps_temporal_id_nesting_flag() { return StdVideoH265SpsFlags.get_sps_temporal_id_nesting_flag(this.segment()); }
    /// Sets `sps_temporal_id_nesting_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_temporal_id_nesting_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_temporal_id_nesting_flag.set(segment, 0L, index, value); }
    /// Sets `sps_temporal_id_nesting_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_temporal_id_nesting_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_id_nesting_flag(segment, 0L, value); }
    /// Sets `sps_temporal_id_nesting_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_temporal_id_nesting_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_id_nesting_flag(this.segment(), index, value); return this; }
    /// Sets `sps_temporal_id_nesting_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_temporal_id_nesting_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_id_nesting_flag(this.segment(), value); return this; }

    /// {@return `separate_colour_plane_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_separate_colour_plane_flag(MemorySegment segment, long index) { return (int) VH_separate_colour_plane_flag.get(segment, 0L, index); }
    /// {@return `separate_colour_plane_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_separate_colour_plane_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_separate_colour_plane_flag(segment, 0L); }
    /// {@return `separate_colour_plane_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int separate_colour_plane_flagAt(long index) { return StdVideoH265SpsFlags.get_separate_colour_plane_flag(this.segment(), index); }
    /// {@return `separate_colour_plane_flag`}
    public @CType("uint32_t : 1") int separate_colour_plane_flag() { return StdVideoH265SpsFlags.get_separate_colour_plane_flag(this.segment()); }
    /// Sets `separate_colour_plane_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separate_colour_plane_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_separate_colour_plane_flag.set(segment, 0L, index, value); }
    /// Sets `separate_colour_plane_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separate_colour_plane_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_separate_colour_plane_flag(segment, 0L, value); }
    /// Sets `separate_colour_plane_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags separate_colour_plane_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_separate_colour_plane_flag(this.segment(), index, value); return this; }
    /// Sets `separate_colour_plane_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags separate_colour_plane_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_separate_colour_plane_flag(this.segment(), value); return this; }

    /// {@return `conformance_window_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_conformance_window_flag(MemorySegment segment, long index) { return (int) VH_conformance_window_flag.get(segment, 0L, index); }
    /// {@return `conformance_window_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_conformance_window_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_conformance_window_flag(segment, 0L); }
    /// {@return `conformance_window_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int conformance_window_flagAt(long index) { return StdVideoH265SpsFlags.get_conformance_window_flag(this.segment(), index); }
    /// {@return `conformance_window_flag`}
    public @CType("uint32_t : 1") int conformance_window_flag() { return StdVideoH265SpsFlags.get_conformance_window_flag(this.segment()); }
    /// Sets `conformance_window_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conformance_window_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_conformance_window_flag.set(segment, 0L, index, value); }
    /// Sets `conformance_window_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conformance_window_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_conformance_window_flag(segment, 0L, value); }
    /// Sets `conformance_window_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags conformance_window_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_conformance_window_flag(this.segment(), index, value); return this; }
    /// Sets `conformance_window_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags conformance_window_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_conformance_window_flag(this.segment(), value); return this; }

    /// {@return `sps_sub_layer_ordering_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_sub_layer_ordering_info_present_flag(MemorySegment segment, long index) { return (int) VH_sps_sub_layer_ordering_info_present_flag.get(segment, 0L, index); }
    /// {@return `sps_sub_layer_ordering_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_sub_layer_ordering_info_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_sub_layer_ordering_info_present_flag(segment, 0L); }
    /// {@return `sps_sub_layer_ordering_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_sub_layer_ordering_info_present_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_sub_layer_ordering_info_present_flag(this.segment(), index); }
    /// {@return `sps_sub_layer_ordering_info_present_flag`}
    public @CType("uint32_t : 1") int sps_sub_layer_ordering_info_present_flag() { return StdVideoH265SpsFlags.get_sps_sub_layer_ordering_info_present_flag(this.segment()); }
    /// Sets `sps_sub_layer_ordering_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_sub_layer_ordering_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_sub_layer_ordering_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `sps_sub_layer_ordering_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_sub_layer_ordering_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_sub_layer_ordering_info_present_flag(segment, 0L, value); }
    /// Sets `sps_sub_layer_ordering_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_sub_layer_ordering_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_sub_layer_ordering_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `sps_sub_layer_ordering_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_sub_layer_ordering_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_sub_layer_ordering_info_present_flag(this.segment(), value); return this; }

    /// {@return `scaling_list_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_scaling_list_enabled_flag(MemorySegment segment, long index) { return (int) VH_scaling_list_enabled_flag.get(segment, 0L, index); }
    /// {@return `scaling_list_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_scaling_list_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_scaling_list_enabled_flag(segment, 0L); }
    /// {@return `scaling_list_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int scaling_list_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_scaling_list_enabled_flag(this.segment(), index); }
    /// {@return `scaling_list_enabled_flag`}
    public @CType("uint32_t : 1") int scaling_list_enabled_flag() { return StdVideoH265SpsFlags.get_scaling_list_enabled_flag(this.segment()); }
    /// Sets `scaling_list_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scaling_list_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_scaling_list_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `scaling_list_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scaling_list_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_scaling_list_enabled_flag(segment, 0L, value); }
    /// Sets `scaling_list_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags scaling_list_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_scaling_list_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `scaling_list_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags scaling_list_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_scaling_list_enabled_flag(this.segment(), value); return this; }

    /// {@return `sps_scaling_list_data_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_scaling_list_data_present_flag(MemorySegment segment, long index) { return (int) VH_sps_scaling_list_data_present_flag.get(segment, 0L, index); }
    /// {@return `sps_scaling_list_data_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_scaling_list_data_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_scaling_list_data_present_flag(segment, 0L); }
    /// {@return `sps_scaling_list_data_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_scaling_list_data_present_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_scaling_list_data_present_flag(this.segment(), index); }
    /// {@return `sps_scaling_list_data_present_flag`}
    public @CType("uint32_t : 1") int sps_scaling_list_data_present_flag() { return StdVideoH265SpsFlags.get_sps_scaling_list_data_present_flag(this.segment()); }
    /// Sets `sps_scaling_list_data_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_scaling_list_data_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_scaling_list_data_present_flag.set(segment, 0L, index, value); }
    /// Sets `sps_scaling_list_data_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_scaling_list_data_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scaling_list_data_present_flag(segment, 0L, value); }
    /// Sets `sps_scaling_list_data_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_scaling_list_data_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scaling_list_data_present_flag(this.segment(), index, value); return this; }
    /// Sets `sps_scaling_list_data_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_scaling_list_data_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scaling_list_data_present_flag(this.segment(), value); return this; }

    /// {@return `amp_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_amp_enabled_flag(MemorySegment segment, long index) { return (int) VH_amp_enabled_flag.get(segment, 0L, index); }
    /// {@return `amp_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_amp_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_amp_enabled_flag(segment, 0L); }
    /// {@return `amp_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int amp_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_amp_enabled_flag(this.segment(), index); }
    /// {@return `amp_enabled_flag`}
    public @CType("uint32_t : 1") int amp_enabled_flag() { return StdVideoH265SpsFlags.get_amp_enabled_flag(this.segment()); }
    /// Sets `amp_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_amp_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_amp_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `amp_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_amp_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_amp_enabled_flag(segment, 0L, value); }
    /// Sets `amp_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags amp_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_amp_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `amp_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags amp_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_amp_enabled_flag(this.segment(), value); return this; }

    /// {@return `sample_adaptive_offset_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sample_adaptive_offset_enabled_flag(MemorySegment segment, long index) { return (int) VH_sample_adaptive_offset_enabled_flag.get(segment, 0L, index); }
    /// {@return `sample_adaptive_offset_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sample_adaptive_offset_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sample_adaptive_offset_enabled_flag(segment, 0L); }
    /// {@return `sample_adaptive_offset_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sample_adaptive_offset_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_sample_adaptive_offset_enabled_flag(this.segment(), index); }
    /// {@return `sample_adaptive_offset_enabled_flag`}
    public @CType("uint32_t : 1") int sample_adaptive_offset_enabled_flag() { return StdVideoH265SpsFlags.get_sample_adaptive_offset_enabled_flag(this.segment()); }
    /// Sets `sample_adaptive_offset_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sample_adaptive_offset_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sample_adaptive_offset_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `sample_adaptive_offset_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sample_adaptive_offset_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sample_adaptive_offset_enabled_flag(segment, 0L, value); }
    /// Sets `sample_adaptive_offset_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sample_adaptive_offset_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sample_adaptive_offset_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `sample_adaptive_offset_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sample_adaptive_offset_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sample_adaptive_offset_enabled_flag(this.segment(), value); return this; }

    /// {@return `pcm_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pcm_enabled_flag(MemorySegment segment, long index) { return (int) VH_pcm_enabled_flag.get(segment, 0L, index); }
    /// {@return `pcm_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pcm_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_pcm_enabled_flag(segment, 0L); }
    /// {@return `pcm_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pcm_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_pcm_enabled_flag(this.segment(), index); }
    /// {@return `pcm_enabled_flag`}
    public @CType("uint32_t : 1") int pcm_enabled_flag() { return StdVideoH265SpsFlags.get_pcm_enabled_flag(this.segment()); }
    /// Sets `pcm_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pcm_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pcm_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `pcm_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pcm_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_enabled_flag(segment, 0L, value); }
    /// Sets `pcm_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags pcm_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `pcm_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags pcm_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_enabled_flag(this.segment(), value); return this; }

    /// {@return `pcm_loop_filter_disabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pcm_loop_filter_disabled_flag(MemorySegment segment, long index) { return (int) VH_pcm_loop_filter_disabled_flag.get(segment, 0L, index); }
    /// {@return `pcm_loop_filter_disabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pcm_loop_filter_disabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_pcm_loop_filter_disabled_flag(segment, 0L); }
    /// {@return `pcm_loop_filter_disabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pcm_loop_filter_disabled_flagAt(long index) { return StdVideoH265SpsFlags.get_pcm_loop_filter_disabled_flag(this.segment(), index); }
    /// {@return `pcm_loop_filter_disabled_flag`}
    public @CType("uint32_t : 1") int pcm_loop_filter_disabled_flag() { return StdVideoH265SpsFlags.get_pcm_loop_filter_disabled_flag(this.segment()); }
    /// Sets `pcm_loop_filter_disabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pcm_loop_filter_disabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pcm_loop_filter_disabled_flag.set(segment, 0L, index, value); }
    /// Sets `pcm_loop_filter_disabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pcm_loop_filter_disabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_loop_filter_disabled_flag(segment, 0L, value); }
    /// Sets `pcm_loop_filter_disabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags pcm_loop_filter_disabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_loop_filter_disabled_flag(this.segment(), index, value); return this; }
    /// Sets `pcm_loop_filter_disabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags pcm_loop_filter_disabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_pcm_loop_filter_disabled_flag(this.segment(), value); return this; }

    /// {@return `long_term_ref_pics_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_long_term_ref_pics_present_flag(MemorySegment segment, long index) { return (int) VH_long_term_ref_pics_present_flag.get(segment, 0L, index); }
    /// {@return `long_term_ref_pics_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_long_term_ref_pics_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_long_term_ref_pics_present_flag(segment, 0L); }
    /// {@return `long_term_ref_pics_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int long_term_ref_pics_present_flagAt(long index) { return StdVideoH265SpsFlags.get_long_term_ref_pics_present_flag(this.segment(), index); }
    /// {@return `long_term_ref_pics_present_flag`}
    public @CType("uint32_t : 1") int long_term_ref_pics_present_flag() { return StdVideoH265SpsFlags.get_long_term_ref_pics_present_flag(this.segment()); }
    /// Sets `long_term_ref_pics_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_ref_pics_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_long_term_ref_pics_present_flag.set(segment, 0L, index, value); }
    /// Sets `long_term_ref_pics_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_ref_pics_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_long_term_ref_pics_present_flag(segment, 0L, value); }
    /// Sets `long_term_ref_pics_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags long_term_ref_pics_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_long_term_ref_pics_present_flag(this.segment(), index, value); return this; }
    /// Sets `long_term_ref_pics_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags long_term_ref_pics_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_long_term_ref_pics_present_flag(this.segment(), value); return this; }

    /// {@return `sps_temporal_mvp_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_temporal_mvp_enabled_flag(MemorySegment segment, long index) { return (int) VH_sps_temporal_mvp_enabled_flag.get(segment, 0L, index); }
    /// {@return `sps_temporal_mvp_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_temporal_mvp_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_temporal_mvp_enabled_flag(segment, 0L); }
    /// {@return `sps_temporal_mvp_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_temporal_mvp_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_temporal_mvp_enabled_flag(this.segment(), index); }
    /// {@return `sps_temporal_mvp_enabled_flag`}
    public @CType("uint32_t : 1") int sps_temporal_mvp_enabled_flag() { return StdVideoH265SpsFlags.get_sps_temporal_mvp_enabled_flag(this.segment()); }
    /// Sets `sps_temporal_mvp_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_temporal_mvp_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_temporal_mvp_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `sps_temporal_mvp_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_temporal_mvp_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_mvp_enabled_flag(segment, 0L, value); }
    /// Sets `sps_temporal_mvp_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_temporal_mvp_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_mvp_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `sps_temporal_mvp_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_temporal_mvp_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_temporal_mvp_enabled_flag(this.segment(), value); return this; }

    /// {@return `strong_intra_smoothing_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_strong_intra_smoothing_enabled_flag(MemorySegment segment, long index) { return (int) VH_strong_intra_smoothing_enabled_flag.get(segment, 0L, index); }
    /// {@return `strong_intra_smoothing_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_strong_intra_smoothing_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_strong_intra_smoothing_enabled_flag(segment, 0L); }
    /// {@return `strong_intra_smoothing_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int strong_intra_smoothing_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_strong_intra_smoothing_enabled_flag(this.segment(), index); }
    /// {@return `strong_intra_smoothing_enabled_flag`}
    public @CType("uint32_t : 1") int strong_intra_smoothing_enabled_flag() { return StdVideoH265SpsFlags.get_strong_intra_smoothing_enabled_flag(this.segment()); }
    /// Sets `strong_intra_smoothing_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_strong_intra_smoothing_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_strong_intra_smoothing_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `strong_intra_smoothing_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_strong_intra_smoothing_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_strong_intra_smoothing_enabled_flag(segment, 0L, value); }
    /// Sets `strong_intra_smoothing_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags strong_intra_smoothing_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_strong_intra_smoothing_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `strong_intra_smoothing_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags strong_intra_smoothing_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_strong_intra_smoothing_enabled_flag(this.segment(), value); return this; }

    /// {@return `vui_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vui_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_vui_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `vui_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vui_parameters_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_vui_parameters_present_flag(segment, 0L); }
    /// {@return `vui_parameters_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vui_parameters_present_flagAt(long index) { return StdVideoH265SpsFlags.get_vui_parameters_present_flag(this.segment(), index); }
    /// {@return `vui_parameters_present_flag`}
    public @CType("uint32_t : 1") int vui_parameters_present_flag() { return StdVideoH265SpsFlags.get_vui_parameters_present_flag(this.segment()); }
    /// Sets `vui_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vui_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `vui_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_vui_parameters_present_flag(segment, 0L, value); }
    /// Sets `vui_parameters_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags vui_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_vui_parameters_present_flag(this.segment(), index, value); return this; }
    /// Sets `vui_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags vui_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_vui_parameters_present_flag(this.segment(), value); return this; }

    /// {@return `sps_extension_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_extension_present_flag(MemorySegment segment, long index) { return (int) VH_sps_extension_present_flag.get(segment, 0L, index); }
    /// {@return `sps_extension_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_extension_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_extension_present_flag(segment, 0L); }
    /// {@return `sps_extension_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_extension_present_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_extension_present_flag(this.segment(), index); }
    /// {@return `sps_extension_present_flag`}
    public @CType("uint32_t : 1") int sps_extension_present_flag() { return StdVideoH265SpsFlags.get_sps_extension_present_flag(this.segment()); }
    /// Sets `sps_extension_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_extension_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_extension_present_flag.set(segment, 0L, index, value); }
    /// Sets `sps_extension_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_extension_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_extension_present_flag(segment, 0L, value); }
    /// Sets `sps_extension_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_extension_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_extension_present_flag(this.segment(), index, value); return this; }
    /// Sets `sps_extension_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_extension_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_extension_present_flag(this.segment(), value); return this; }

    /// {@return `sps_range_extension_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_range_extension_flag(MemorySegment segment, long index) { return (int) VH_sps_range_extension_flag.get(segment, 0L, index); }
    /// {@return `sps_range_extension_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_range_extension_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_range_extension_flag(segment, 0L); }
    /// {@return `sps_range_extension_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_range_extension_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_range_extension_flag(this.segment(), index); }
    /// {@return `sps_range_extension_flag`}
    public @CType("uint32_t : 1") int sps_range_extension_flag() { return StdVideoH265SpsFlags.get_sps_range_extension_flag(this.segment()); }
    /// Sets `sps_range_extension_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_range_extension_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_range_extension_flag.set(segment, 0L, index, value); }
    /// Sets `sps_range_extension_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_range_extension_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_range_extension_flag(segment, 0L, value); }
    /// Sets `sps_range_extension_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_range_extension_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_range_extension_flag(this.segment(), index, value); return this; }
    /// Sets `sps_range_extension_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_range_extension_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_range_extension_flag(this.segment(), value); return this; }

    /// {@return `transform_skip_rotation_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_transform_skip_rotation_enabled_flag(MemorySegment segment, long index) { return (int) VH_transform_skip_rotation_enabled_flag.get(segment, 0L, index); }
    /// {@return `transform_skip_rotation_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_transform_skip_rotation_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_transform_skip_rotation_enabled_flag(segment, 0L); }
    /// {@return `transform_skip_rotation_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int transform_skip_rotation_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_transform_skip_rotation_enabled_flag(this.segment(), index); }
    /// {@return `transform_skip_rotation_enabled_flag`}
    public @CType("uint32_t : 1") int transform_skip_rotation_enabled_flag() { return StdVideoH265SpsFlags.get_transform_skip_rotation_enabled_flag(this.segment()); }
    /// Sets `transform_skip_rotation_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform_skip_rotation_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_transform_skip_rotation_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `transform_skip_rotation_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform_skip_rotation_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_rotation_enabled_flag(segment, 0L, value); }
    /// Sets `transform_skip_rotation_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags transform_skip_rotation_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_rotation_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `transform_skip_rotation_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags transform_skip_rotation_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_rotation_enabled_flag(this.segment(), value); return this; }

    /// {@return `transform_skip_context_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_transform_skip_context_enabled_flag(MemorySegment segment, long index) { return (int) VH_transform_skip_context_enabled_flag.get(segment, 0L, index); }
    /// {@return `transform_skip_context_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_transform_skip_context_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_transform_skip_context_enabled_flag(segment, 0L); }
    /// {@return `transform_skip_context_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int transform_skip_context_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_transform_skip_context_enabled_flag(this.segment(), index); }
    /// {@return `transform_skip_context_enabled_flag`}
    public @CType("uint32_t : 1") int transform_skip_context_enabled_flag() { return StdVideoH265SpsFlags.get_transform_skip_context_enabled_flag(this.segment()); }
    /// Sets `transform_skip_context_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform_skip_context_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_transform_skip_context_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `transform_skip_context_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform_skip_context_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_context_enabled_flag(segment, 0L, value); }
    /// Sets `transform_skip_context_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags transform_skip_context_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_context_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `transform_skip_context_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags transform_skip_context_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_transform_skip_context_enabled_flag(this.segment(), value); return this; }

    /// {@return `implicit_rdpcm_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_implicit_rdpcm_enabled_flag(MemorySegment segment, long index) { return (int) VH_implicit_rdpcm_enabled_flag.get(segment, 0L, index); }
    /// {@return `implicit_rdpcm_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_implicit_rdpcm_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_implicit_rdpcm_enabled_flag(segment, 0L); }
    /// {@return `implicit_rdpcm_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int implicit_rdpcm_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_implicit_rdpcm_enabled_flag(this.segment(), index); }
    /// {@return `implicit_rdpcm_enabled_flag`}
    public @CType("uint32_t : 1") int implicit_rdpcm_enabled_flag() { return StdVideoH265SpsFlags.get_implicit_rdpcm_enabled_flag(this.segment()); }
    /// Sets `implicit_rdpcm_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_implicit_rdpcm_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_implicit_rdpcm_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `implicit_rdpcm_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_implicit_rdpcm_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_implicit_rdpcm_enabled_flag(segment, 0L, value); }
    /// Sets `implicit_rdpcm_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags implicit_rdpcm_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_implicit_rdpcm_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `implicit_rdpcm_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags implicit_rdpcm_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_implicit_rdpcm_enabled_flag(this.segment(), value); return this; }

    /// {@return `explicit_rdpcm_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_explicit_rdpcm_enabled_flag(MemorySegment segment, long index) { return (int) VH_explicit_rdpcm_enabled_flag.get(segment, 0L, index); }
    /// {@return `explicit_rdpcm_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_explicit_rdpcm_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_explicit_rdpcm_enabled_flag(segment, 0L); }
    /// {@return `explicit_rdpcm_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int explicit_rdpcm_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_explicit_rdpcm_enabled_flag(this.segment(), index); }
    /// {@return `explicit_rdpcm_enabled_flag`}
    public @CType("uint32_t : 1") int explicit_rdpcm_enabled_flag() { return StdVideoH265SpsFlags.get_explicit_rdpcm_enabled_flag(this.segment()); }
    /// Sets `explicit_rdpcm_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_explicit_rdpcm_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_explicit_rdpcm_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `explicit_rdpcm_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_explicit_rdpcm_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_explicit_rdpcm_enabled_flag(segment, 0L, value); }
    /// Sets `explicit_rdpcm_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags explicit_rdpcm_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_explicit_rdpcm_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `explicit_rdpcm_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags explicit_rdpcm_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_explicit_rdpcm_enabled_flag(this.segment(), value); return this; }

    /// {@return `extended_precision_processing_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_extended_precision_processing_flag(MemorySegment segment, long index) { return (int) VH_extended_precision_processing_flag.get(segment, 0L, index); }
    /// {@return `extended_precision_processing_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_extended_precision_processing_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_extended_precision_processing_flag(segment, 0L); }
    /// {@return `extended_precision_processing_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int extended_precision_processing_flagAt(long index) { return StdVideoH265SpsFlags.get_extended_precision_processing_flag(this.segment(), index); }
    /// {@return `extended_precision_processing_flag`}
    public @CType("uint32_t : 1") int extended_precision_processing_flag() { return StdVideoH265SpsFlags.get_extended_precision_processing_flag(this.segment()); }
    /// Sets `extended_precision_processing_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extended_precision_processing_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_extended_precision_processing_flag.set(segment, 0L, index, value); }
    /// Sets `extended_precision_processing_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extended_precision_processing_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_extended_precision_processing_flag(segment, 0L, value); }
    /// Sets `extended_precision_processing_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags extended_precision_processing_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_extended_precision_processing_flag(this.segment(), index, value); return this; }
    /// Sets `extended_precision_processing_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags extended_precision_processing_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_extended_precision_processing_flag(this.segment(), value); return this; }

    /// {@return `intra_smoothing_disabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_intra_smoothing_disabled_flag(MemorySegment segment, long index) { return (int) VH_intra_smoothing_disabled_flag.get(segment, 0L, index); }
    /// {@return `intra_smoothing_disabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_intra_smoothing_disabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_intra_smoothing_disabled_flag(segment, 0L); }
    /// {@return `intra_smoothing_disabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int intra_smoothing_disabled_flagAt(long index) { return StdVideoH265SpsFlags.get_intra_smoothing_disabled_flag(this.segment(), index); }
    /// {@return `intra_smoothing_disabled_flag`}
    public @CType("uint32_t : 1") int intra_smoothing_disabled_flag() { return StdVideoH265SpsFlags.get_intra_smoothing_disabled_flag(this.segment()); }
    /// Sets `intra_smoothing_disabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intra_smoothing_disabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_intra_smoothing_disabled_flag.set(segment, 0L, index, value); }
    /// Sets `intra_smoothing_disabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intra_smoothing_disabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_smoothing_disabled_flag(segment, 0L, value); }
    /// Sets `intra_smoothing_disabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags intra_smoothing_disabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_smoothing_disabled_flag(this.segment(), index, value); return this; }
    /// Sets `intra_smoothing_disabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags intra_smoothing_disabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_smoothing_disabled_flag(this.segment(), value); return this; }

    /// {@return `high_precision_offsets_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_high_precision_offsets_enabled_flag(MemorySegment segment, long index) { return (int) VH_high_precision_offsets_enabled_flag.get(segment, 0L, index); }
    /// {@return `high_precision_offsets_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_high_precision_offsets_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_high_precision_offsets_enabled_flag(segment, 0L); }
    /// {@return `high_precision_offsets_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int high_precision_offsets_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_high_precision_offsets_enabled_flag(this.segment(), index); }
    /// {@return `high_precision_offsets_enabled_flag`}
    public @CType("uint32_t : 1") int high_precision_offsets_enabled_flag() { return StdVideoH265SpsFlags.get_high_precision_offsets_enabled_flag(this.segment()); }
    /// Sets `high_precision_offsets_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_high_precision_offsets_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_high_precision_offsets_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `high_precision_offsets_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_high_precision_offsets_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_high_precision_offsets_enabled_flag(segment, 0L, value); }
    /// Sets `high_precision_offsets_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags high_precision_offsets_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_high_precision_offsets_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `high_precision_offsets_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags high_precision_offsets_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_high_precision_offsets_enabled_flag(this.segment(), value); return this; }

    /// {@return `persistent_rice_adaptation_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_persistent_rice_adaptation_enabled_flag(MemorySegment segment, long index) { return (int) VH_persistent_rice_adaptation_enabled_flag.get(segment, 0L, index); }
    /// {@return `persistent_rice_adaptation_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_persistent_rice_adaptation_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_persistent_rice_adaptation_enabled_flag(segment, 0L); }
    /// {@return `persistent_rice_adaptation_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int persistent_rice_adaptation_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_persistent_rice_adaptation_enabled_flag(this.segment(), index); }
    /// {@return `persistent_rice_adaptation_enabled_flag`}
    public @CType("uint32_t : 1") int persistent_rice_adaptation_enabled_flag() { return StdVideoH265SpsFlags.get_persistent_rice_adaptation_enabled_flag(this.segment()); }
    /// Sets `persistent_rice_adaptation_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_persistent_rice_adaptation_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_persistent_rice_adaptation_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `persistent_rice_adaptation_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_persistent_rice_adaptation_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_persistent_rice_adaptation_enabled_flag(segment, 0L, value); }
    /// Sets `persistent_rice_adaptation_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags persistent_rice_adaptation_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_persistent_rice_adaptation_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `persistent_rice_adaptation_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags persistent_rice_adaptation_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_persistent_rice_adaptation_enabled_flag(this.segment(), value); return this; }

    /// {@return `cabac_bypass_alignment_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cabac_bypass_alignment_enabled_flag(MemorySegment segment, long index) { return (int) VH_cabac_bypass_alignment_enabled_flag.get(segment, 0L, index); }
    /// {@return `cabac_bypass_alignment_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cabac_bypass_alignment_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_cabac_bypass_alignment_enabled_flag(segment, 0L); }
    /// {@return `cabac_bypass_alignment_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cabac_bypass_alignment_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_cabac_bypass_alignment_enabled_flag(this.segment(), index); }
    /// {@return `cabac_bypass_alignment_enabled_flag`}
    public @CType("uint32_t : 1") int cabac_bypass_alignment_enabled_flag() { return StdVideoH265SpsFlags.get_cabac_bypass_alignment_enabled_flag(this.segment()); }
    /// Sets `cabac_bypass_alignment_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cabac_bypass_alignment_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cabac_bypass_alignment_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `cabac_bypass_alignment_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cabac_bypass_alignment_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_cabac_bypass_alignment_enabled_flag(segment, 0L, value); }
    /// Sets `cabac_bypass_alignment_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags cabac_bypass_alignment_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_cabac_bypass_alignment_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `cabac_bypass_alignment_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags cabac_bypass_alignment_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_cabac_bypass_alignment_enabled_flag(this.segment(), value); return this; }

    /// {@return `sps_scc_extension_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_scc_extension_flag(MemorySegment segment, long index) { return (int) VH_sps_scc_extension_flag.get(segment, 0L, index); }
    /// {@return `sps_scc_extension_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_scc_extension_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_scc_extension_flag(segment, 0L); }
    /// {@return `sps_scc_extension_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_scc_extension_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_scc_extension_flag(this.segment(), index); }
    /// {@return `sps_scc_extension_flag`}
    public @CType("uint32_t : 1") int sps_scc_extension_flag() { return StdVideoH265SpsFlags.get_sps_scc_extension_flag(this.segment()); }
    /// Sets `sps_scc_extension_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_scc_extension_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_scc_extension_flag.set(segment, 0L, index, value); }
    /// Sets `sps_scc_extension_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_scc_extension_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scc_extension_flag(segment, 0L, value); }
    /// Sets `sps_scc_extension_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_scc_extension_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scc_extension_flag(this.segment(), index, value); return this; }
    /// Sets `sps_scc_extension_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_scc_extension_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_scc_extension_flag(this.segment(), value); return this; }

    /// {@return `sps_curr_pic_ref_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_curr_pic_ref_enabled_flag(MemorySegment segment, long index) { return (int) VH_sps_curr_pic_ref_enabled_flag.get(segment, 0L, index); }
    /// {@return `sps_curr_pic_ref_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_curr_pic_ref_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_curr_pic_ref_enabled_flag(segment, 0L); }
    /// {@return `sps_curr_pic_ref_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_curr_pic_ref_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_curr_pic_ref_enabled_flag(this.segment(), index); }
    /// {@return `sps_curr_pic_ref_enabled_flag`}
    public @CType("uint32_t : 1") int sps_curr_pic_ref_enabled_flag() { return StdVideoH265SpsFlags.get_sps_curr_pic_ref_enabled_flag(this.segment()); }
    /// Sets `sps_curr_pic_ref_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_curr_pic_ref_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_curr_pic_ref_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `sps_curr_pic_ref_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_curr_pic_ref_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_curr_pic_ref_enabled_flag(segment, 0L, value); }
    /// Sets `sps_curr_pic_ref_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_curr_pic_ref_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_curr_pic_ref_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `sps_curr_pic_ref_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_curr_pic_ref_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_curr_pic_ref_enabled_flag(this.segment(), value); return this; }

    /// {@return `palette_mode_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_palette_mode_enabled_flag(MemorySegment segment, long index) { return (int) VH_palette_mode_enabled_flag.get(segment, 0L, index); }
    /// {@return `palette_mode_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_palette_mode_enabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_palette_mode_enabled_flag(segment, 0L); }
    /// {@return `palette_mode_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int palette_mode_enabled_flagAt(long index) { return StdVideoH265SpsFlags.get_palette_mode_enabled_flag(this.segment(), index); }
    /// {@return `palette_mode_enabled_flag`}
    public @CType("uint32_t : 1") int palette_mode_enabled_flag() { return StdVideoH265SpsFlags.get_palette_mode_enabled_flag(this.segment()); }
    /// Sets `palette_mode_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_palette_mode_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_palette_mode_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `palette_mode_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_palette_mode_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_palette_mode_enabled_flag(segment, 0L, value); }
    /// Sets `palette_mode_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags palette_mode_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_palette_mode_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `palette_mode_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags palette_mode_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_palette_mode_enabled_flag(this.segment(), value); return this; }

    /// {@return `sps_palette_predictor_initializers_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sps_palette_predictor_initializers_present_flag(MemorySegment segment, long index) { return (int) VH_sps_palette_predictor_initializers_present_flag.get(segment, 0L, index); }
    /// {@return `sps_palette_predictor_initializers_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sps_palette_predictor_initializers_present_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_sps_palette_predictor_initializers_present_flag(segment, 0L); }
    /// {@return `sps_palette_predictor_initializers_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sps_palette_predictor_initializers_present_flagAt(long index) { return StdVideoH265SpsFlags.get_sps_palette_predictor_initializers_present_flag(this.segment(), index); }
    /// {@return `sps_palette_predictor_initializers_present_flag`}
    public @CType("uint32_t : 1") int sps_palette_predictor_initializers_present_flag() { return StdVideoH265SpsFlags.get_sps_palette_predictor_initializers_present_flag(this.segment()); }
    /// Sets `sps_palette_predictor_initializers_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_palette_predictor_initializers_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sps_palette_predictor_initializers_present_flag.set(segment, 0L, index, value); }
    /// Sets `sps_palette_predictor_initializers_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_palette_predictor_initializers_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_palette_predictor_initializers_present_flag(segment, 0L, value); }
    /// Sets `sps_palette_predictor_initializers_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_palette_predictor_initializers_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_palette_predictor_initializers_present_flag(this.segment(), index, value); return this; }
    /// Sets `sps_palette_predictor_initializers_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags sps_palette_predictor_initializers_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_sps_palette_predictor_initializers_present_flag(this.segment(), value); return this; }

    /// {@return `intra_boundary_filtering_disabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_intra_boundary_filtering_disabled_flag(MemorySegment segment, long index) { return (int) VH_intra_boundary_filtering_disabled_flag.get(segment, 0L, index); }
    /// {@return `intra_boundary_filtering_disabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_intra_boundary_filtering_disabled_flag(MemorySegment segment) { return StdVideoH265SpsFlags.get_intra_boundary_filtering_disabled_flag(segment, 0L); }
    /// {@return `intra_boundary_filtering_disabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int intra_boundary_filtering_disabled_flagAt(long index) { return StdVideoH265SpsFlags.get_intra_boundary_filtering_disabled_flag(this.segment(), index); }
    /// {@return `intra_boundary_filtering_disabled_flag`}
    public @CType("uint32_t : 1") int intra_boundary_filtering_disabled_flag() { return StdVideoH265SpsFlags.get_intra_boundary_filtering_disabled_flag(this.segment()); }
    /// Sets `intra_boundary_filtering_disabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intra_boundary_filtering_disabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_intra_boundary_filtering_disabled_flag.set(segment, 0L, index, value); }
    /// Sets `intra_boundary_filtering_disabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intra_boundary_filtering_disabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_boundary_filtering_disabled_flag(segment, 0L, value); }
    /// Sets `intra_boundary_filtering_disabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags intra_boundary_filtering_disabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_boundary_filtering_disabled_flag(this.segment(), index, value); return this; }
    /// Sets `intra_boundary_filtering_disabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SpsFlags intra_boundary_filtering_disabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265SpsFlags.set_intra_boundary_filtering_disabled_flag(this.segment(), value); return this; }

}
