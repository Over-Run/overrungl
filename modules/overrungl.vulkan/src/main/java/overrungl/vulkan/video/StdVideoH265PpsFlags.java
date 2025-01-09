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
/// ### dependent_slice_segments_enabled_flag
/// [VarHandle][#VH_dependent_slice_segments_enabled_flag] - [Getter][#dependent_slice_segments_enabled_flag()] - [Setter][#dependent_slice_segments_enabled_flag(int)]
/// ### output_flag_present_flag
/// [VarHandle][#VH_output_flag_present_flag] - [Getter][#output_flag_present_flag()] - [Setter][#output_flag_present_flag(int)]
/// ### sign_data_hiding_enabled_flag
/// [VarHandle][#VH_sign_data_hiding_enabled_flag] - [Getter][#sign_data_hiding_enabled_flag()] - [Setter][#sign_data_hiding_enabled_flag(int)]
/// ### cabac_init_present_flag
/// [VarHandle][#VH_cabac_init_present_flag] - [Getter][#cabac_init_present_flag()] - [Setter][#cabac_init_present_flag(int)]
/// ### constrained_intra_pred_flag
/// [VarHandle][#VH_constrained_intra_pred_flag] - [Getter][#constrained_intra_pred_flag()] - [Setter][#constrained_intra_pred_flag(int)]
/// ### transform_skip_enabled_flag
/// [VarHandle][#VH_transform_skip_enabled_flag] - [Getter][#transform_skip_enabled_flag()] - [Setter][#transform_skip_enabled_flag(int)]
/// ### cu_qp_delta_enabled_flag
/// [VarHandle][#VH_cu_qp_delta_enabled_flag] - [Getter][#cu_qp_delta_enabled_flag()] - [Setter][#cu_qp_delta_enabled_flag(int)]
/// ### pps_slice_chroma_qp_offsets_present_flag
/// [VarHandle][#VH_pps_slice_chroma_qp_offsets_present_flag] - [Getter][#pps_slice_chroma_qp_offsets_present_flag()] - [Setter][#pps_slice_chroma_qp_offsets_present_flag(int)]
/// ### weighted_pred_flag
/// [VarHandle][#VH_weighted_pred_flag] - [Getter][#weighted_pred_flag()] - [Setter][#weighted_pred_flag(int)]
/// ### weighted_bipred_flag
/// [VarHandle][#VH_weighted_bipred_flag] - [Getter][#weighted_bipred_flag()] - [Setter][#weighted_bipred_flag(int)]
/// ### transquant_bypass_enabled_flag
/// [VarHandle][#VH_transquant_bypass_enabled_flag] - [Getter][#transquant_bypass_enabled_flag()] - [Setter][#transquant_bypass_enabled_flag(int)]
/// ### tiles_enabled_flag
/// [VarHandle][#VH_tiles_enabled_flag] - [Getter][#tiles_enabled_flag()] - [Setter][#tiles_enabled_flag(int)]
/// ### entropy_coding_sync_enabled_flag
/// [VarHandle][#VH_entropy_coding_sync_enabled_flag] - [Getter][#entropy_coding_sync_enabled_flag()] - [Setter][#entropy_coding_sync_enabled_flag(int)]
/// ### uniform_spacing_flag
/// [VarHandle][#VH_uniform_spacing_flag] - [Getter][#uniform_spacing_flag()] - [Setter][#uniform_spacing_flag(int)]
/// ### loop_filter_across_tiles_enabled_flag
/// [VarHandle][#VH_loop_filter_across_tiles_enabled_flag] - [Getter][#loop_filter_across_tiles_enabled_flag()] - [Setter][#loop_filter_across_tiles_enabled_flag(int)]
/// ### pps_loop_filter_across_slices_enabled_flag
/// [VarHandle][#VH_pps_loop_filter_across_slices_enabled_flag] - [Getter][#pps_loop_filter_across_slices_enabled_flag()] - [Setter][#pps_loop_filter_across_slices_enabled_flag(int)]
/// ### deblocking_filter_control_present_flag
/// [VarHandle][#VH_deblocking_filter_control_present_flag] - [Getter][#deblocking_filter_control_present_flag()] - [Setter][#deblocking_filter_control_present_flag(int)]
/// ### deblocking_filter_override_enabled_flag
/// [VarHandle][#VH_deblocking_filter_override_enabled_flag] - [Getter][#deblocking_filter_override_enabled_flag()] - [Setter][#deblocking_filter_override_enabled_flag(int)]
/// ### pps_deblocking_filter_disabled_flag
/// [VarHandle][#VH_pps_deblocking_filter_disabled_flag] - [Getter][#pps_deblocking_filter_disabled_flag()] - [Setter][#pps_deblocking_filter_disabled_flag(int)]
/// ### pps_scaling_list_data_present_flag
/// [VarHandle][#VH_pps_scaling_list_data_present_flag] - [Getter][#pps_scaling_list_data_present_flag()] - [Setter][#pps_scaling_list_data_present_flag(int)]
/// ### lists_modification_present_flag
/// [VarHandle][#VH_lists_modification_present_flag] - [Getter][#lists_modification_present_flag()] - [Setter][#lists_modification_present_flag(int)]
/// ### slice_segment_header_extension_present_flag
/// [VarHandle][#VH_slice_segment_header_extension_present_flag] - [Getter][#slice_segment_header_extension_present_flag()] - [Setter][#slice_segment_header_extension_present_flag(int)]
/// ### pps_extension_present_flag
/// [VarHandle][#VH_pps_extension_present_flag] - [Getter][#pps_extension_present_flag()] - [Setter][#pps_extension_present_flag(int)]
/// ### cross_component_prediction_enabled_flag
/// [VarHandle][#VH_cross_component_prediction_enabled_flag] - [Getter][#cross_component_prediction_enabled_flag()] - [Setter][#cross_component_prediction_enabled_flag(int)]
/// ### chroma_qp_offset_list_enabled_flag
/// [VarHandle][#VH_chroma_qp_offset_list_enabled_flag] - [Getter][#chroma_qp_offset_list_enabled_flag()] - [Setter][#chroma_qp_offset_list_enabled_flag(int)]
/// ### pps_curr_pic_ref_enabled_flag
/// [VarHandle][#VH_pps_curr_pic_ref_enabled_flag] - [Getter][#pps_curr_pic_ref_enabled_flag()] - [Setter][#pps_curr_pic_ref_enabled_flag(int)]
/// ### residual_adaptive_colour_transform_enabled_flag
/// [VarHandle][#VH_residual_adaptive_colour_transform_enabled_flag] - [Getter][#residual_adaptive_colour_transform_enabled_flag()] - [Setter][#residual_adaptive_colour_transform_enabled_flag(int)]
/// ### pps_slice_act_qp_offsets_present_flag
/// [VarHandle][#VH_pps_slice_act_qp_offsets_present_flag] - [Getter][#pps_slice_act_qp_offsets_present_flag()] - [Setter][#pps_slice_act_qp_offsets_present_flag(int)]
/// ### pps_palette_predictor_initializers_present_flag
/// [VarHandle][#VH_pps_palette_predictor_initializers_present_flag] - [Getter][#pps_palette_predictor_initializers_present_flag()] - [Setter][#pps_palette_predictor_initializers_present_flag(int)]
/// ### monochrome_palette_flag
/// [VarHandle][#VH_monochrome_palette_flag] - [Getter][#monochrome_palette_flag()] - [Setter][#monochrome_palette_flag(int)]
/// ### pps_range_extension_flag
/// [VarHandle][#VH_pps_range_extension_flag] - [Getter][#pps_range_extension_flag()] - [Setter][#pps_range_extension_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265PpsFlags {
///     uint32_t : 1 dependent_slice_segments_enabled_flag;
///     uint32_t : 1 output_flag_present_flag;
///     uint32_t : 1 sign_data_hiding_enabled_flag;
///     uint32_t : 1 cabac_init_present_flag;
///     uint32_t : 1 constrained_intra_pred_flag;
///     uint32_t : 1 transform_skip_enabled_flag;
///     uint32_t : 1 cu_qp_delta_enabled_flag;
///     uint32_t : 1 pps_slice_chroma_qp_offsets_present_flag;
///     uint32_t : 1 weighted_pred_flag;
///     uint32_t : 1 weighted_bipred_flag;
///     uint32_t : 1 transquant_bypass_enabled_flag;
///     uint32_t : 1 tiles_enabled_flag;
///     uint32_t : 1 entropy_coding_sync_enabled_flag;
///     uint32_t : 1 uniform_spacing_flag;
///     uint32_t : 1 loop_filter_across_tiles_enabled_flag;
///     uint32_t : 1 pps_loop_filter_across_slices_enabled_flag;
///     uint32_t : 1 deblocking_filter_control_present_flag;
///     uint32_t : 1 deblocking_filter_override_enabled_flag;
///     uint32_t : 1 pps_deblocking_filter_disabled_flag;
///     uint32_t : 1 pps_scaling_list_data_present_flag;
///     uint32_t : 1 lists_modification_present_flag;
///     uint32_t : 1 slice_segment_header_extension_present_flag;
///     uint32_t : 1 pps_extension_present_flag;
///     uint32_t : 1 cross_component_prediction_enabled_flag;
///     uint32_t : 1 chroma_qp_offset_list_enabled_flag;
///     uint32_t : 1 pps_curr_pic_ref_enabled_flag;
///     uint32_t : 1 residual_adaptive_colour_transform_enabled_flag;
///     uint32_t : 1 pps_slice_act_qp_offsets_present_flag;
///     uint32_t : 1 pps_palette_predictor_initializers_present_flag;
///     uint32_t : 1 monochrome_palette_flag;
///     uint32_t : 1 pps_range_extension_flag;
/// } StdVideoH265PpsFlags;
/// ```
public final class StdVideoH265PpsFlags extends Struct {
    /// The struct layout of `StdVideoH265PpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dependent_slice_segments_enabled_flag"),
        ValueLayout.JAVA_INT.withName("output_flag_present_flag"),
        ValueLayout.JAVA_INT.withName("sign_data_hiding_enabled_flag"),
        ValueLayout.JAVA_INT.withName("cabac_init_present_flag"),
        ValueLayout.JAVA_INT.withName("constrained_intra_pred_flag"),
        ValueLayout.JAVA_INT.withName("transform_skip_enabled_flag"),
        ValueLayout.JAVA_INT.withName("cu_qp_delta_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_slice_chroma_qp_offsets_present_flag"),
        ValueLayout.JAVA_INT.withName("weighted_pred_flag"),
        ValueLayout.JAVA_INT.withName("weighted_bipred_flag"),
        ValueLayout.JAVA_INT.withName("transquant_bypass_enabled_flag"),
        ValueLayout.JAVA_INT.withName("tiles_enabled_flag"),
        ValueLayout.JAVA_INT.withName("entropy_coding_sync_enabled_flag"),
        ValueLayout.JAVA_INT.withName("uniform_spacing_flag"),
        ValueLayout.JAVA_INT.withName("loop_filter_across_tiles_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_loop_filter_across_slices_enabled_flag"),
        ValueLayout.JAVA_INT.withName("deblocking_filter_control_present_flag"),
        ValueLayout.JAVA_INT.withName("deblocking_filter_override_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_deblocking_filter_disabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_scaling_list_data_present_flag"),
        ValueLayout.JAVA_INT.withName("lists_modification_present_flag"),
        ValueLayout.JAVA_INT.withName("slice_segment_header_extension_present_flag"),
        ValueLayout.JAVA_INT.withName("pps_extension_present_flag"),
        ValueLayout.JAVA_INT.withName("cross_component_prediction_enabled_flag"),
        ValueLayout.JAVA_INT.withName("chroma_qp_offset_list_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_curr_pic_ref_enabled_flag"),
        ValueLayout.JAVA_INT.withName("residual_adaptive_colour_transform_enabled_flag"),
        ValueLayout.JAVA_INT.withName("pps_slice_act_qp_offsets_present_flag"),
        ValueLayout.JAVA_INT.withName("pps_palette_predictor_initializers_present_flag"),
        ValueLayout.JAVA_INT.withName("monochrome_palette_flag"),
        ValueLayout.JAVA_INT.withName("pps_range_extension_flag")
    );
    /// The [VarHandle] of `dependent_slice_segments_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependent_slice_segments_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependent_slice_segments_enabled_flag"));
    /// The [VarHandle] of `output_flag_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_flag_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_flag_present_flag"));
    /// The [VarHandle] of `sign_data_hiding_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sign_data_hiding_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sign_data_hiding_enabled_flag"));
    /// The [VarHandle] of `cabac_init_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cabac_init_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cabac_init_present_flag"));
    /// The [VarHandle] of `constrained_intra_pred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constrained_intra_pred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constrained_intra_pred_flag"));
    /// The [VarHandle] of `transform_skip_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform_skip_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform_skip_enabled_flag"));
    /// The [VarHandle] of `cu_qp_delta_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cu_qp_delta_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cu_qp_delta_enabled_flag"));
    /// The [VarHandle] of `pps_slice_chroma_qp_offsets_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_slice_chroma_qp_offsets_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_slice_chroma_qp_offsets_present_flag"));
    /// The [VarHandle] of `weighted_pred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_weighted_pred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("weighted_pred_flag"));
    /// The [VarHandle] of `weighted_bipred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_weighted_bipred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("weighted_bipred_flag"));
    /// The [VarHandle] of `transquant_bypass_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transquant_bypass_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transquant_bypass_enabled_flag"));
    /// The [VarHandle] of `tiles_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tiles_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiles_enabled_flag"));
    /// The [VarHandle] of `entropy_coding_sync_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_entropy_coding_sync_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("entropy_coding_sync_enabled_flag"));
    /// The [VarHandle] of `uniform_spacing_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniform_spacing_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniform_spacing_flag"));
    /// The [VarHandle] of `loop_filter_across_tiles_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_loop_filter_across_tiles_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_across_tiles_enabled_flag"));
    /// The [VarHandle] of `pps_loop_filter_across_slices_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_loop_filter_across_slices_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_loop_filter_across_slices_enabled_flag"));
    /// The [VarHandle] of `deblocking_filter_control_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deblocking_filter_control_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deblocking_filter_control_present_flag"));
    /// The [VarHandle] of `deblocking_filter_override_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deblocking_filter_override_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deblocking_filter_override_enabled_flag"));
    /// The [VarHandle] of `pps_deblocking_filter_disabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_deblocking_filter_disabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_deblocking_filter_disabled_flag"));
    /// The [VarHandle] of `pps_scaling_list_data_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_scaling_list_data_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_scaling_list_data_present_flag"));
    /// The [VarHandle] of `lists_modification_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lists_modification_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lists_modification_present_flag"));
    /// The [VarHandle] of `slice_segment_header_extension_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_segment_header_extension_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_segment_header_extension_present_flag"));
    /// The [VarHandle] of `pps_extension_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_extension_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_extension_present_flag"));
    /// The [VarHandle] of `cross_component_prediction_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cross_component_prediction_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cross_component_prediction_enabled_flag"));
    /// The [VarHandle] of `chroma_qp_offset_list_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_qp_offset_list_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_qp_offset_list_enabled_flag"));
    /// The [VarHandle] of `pps_curr_pic_ref_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_curr_pic_ref_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_curr_pic_ref_enabled_flag"));
    /// The [VarHandle] of `residual_adaptive_colour_transform_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residual_adaptive_colour_transform_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residual_adaptive_colour_transform_enabled_flag"));
    /// The [VarHandle] of `pps_slice_act_qp_offsets_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_slice_act_qp_offsets_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_slice_act_qp_offsets_present_flag"));
    /// The [VarHandle] of `pps_palette_predictor_initializers_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_palette_predictor_initializers_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_palette_predictor_initializers_present_flag"));
    /// The [VarHandle] of `monochrome_palette_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_monochrome_palette_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("monochrome_palette_flag"));
    /// The [VarHandle] of `pps_range_extension_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pps_range_extension_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_range_extension_flag"));

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265PpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PpsFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265PpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PpsFlags`
    public static StdVideoH265PpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265PpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265PpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PpsFlags`
    public static StdVideoH265PpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265PpsFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `dependent_slice_segments_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_dependent_slice_segments_enabled_flag(MemorySegment segment, long index) { return (int) VH_dependent_slice_segments_enabled_flag.get(segment, 0L, index); }
    /// {@return `dependent_slice_segments_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_dependent_slice_segments_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_dependent_slice_segments_enabled_flag(segment, 0L); }
    /// {@return `dependent_slice_segments_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int dependent_slice_segments_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_dependent_slice_segments_enabled_flag(this.segment(), index); }
    /// {@return `dependent_slice_segments_enabled_flag`}
    public @CType("uint32_t : 1") int dependent_slice_segments_enabled_flag() { return StdVideoH265PpsFlags.get_dependent_slice_segments_enabled_flag(this.segment()); }
    /// Sets `dependent_slice_segments_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependent_slice_segments_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_dependent_slice_segments_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `dependent_slice_segments_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependent_slice_segments_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_dependent_slice_segments_enabled_flag(segment, 0L, value); }
    /// Sets `dependent_slice_segments_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags dependent_slice_segments_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_dependent_slice_segments_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `dependent_slice_segments_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags dependent_slice_segments_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_dependent_slice_segments_enabled_flag(this.segment(), value); return this; }

    /// {@return `output_flag_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_output_flag_present_flag(MemorySegment segment, long index) { return (int) VH_output_flag_present_flag.get(segment, 0L, index); }
    /// {@return `output_flag_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_output_flag_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_output_flag_present_flag(segment, 0L); }
    /// {@return `output_flag_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int output_flag_present_flagAt(long index) { return StdVideoH265PpsFlags.get_output_flag_present_flag(this.segment(), index); }
    /// {@return `output_flag_present_flag`}
    public @CType("uint32_t : 1") int output_flag_present_flag() { return StdVideoH265PpsFlags.get_output_flag_present_flag(this.segment()); }
    /// Sets `output_flag_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_flag_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_output_flag_present_flag.set(segment, 0L, index, value); }
    /// Sets `output_flag_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_flag_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_output_flag_present_flag(segment, 0L, value); }
    /// Sets `output_flag_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags output_flag_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_output_flag_present_flag(this.segment(), index, value); return this; }
    /// Sets `output_flag_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags output_flag_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_output_flag_present_flag(this.segment(), value); return this; }

    /// {@return `sign_data_hiding_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sign_data_hiding_enabled_flag(MemorySegment segment, long index) { return (int) VH_sign_data_hiding_enabled_flag.get(segment, 0L, index); }
    /// {@return `sign_data_hiding_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sign_data_hiding_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_sign_data_hiding_enabled_flag(segment, 0L); }
    /// {@return `sign_data_hiding_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int sign_data_hiding_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_sign_data_hiding_enabled_flag(this.segment(), index); }
    /// {@return `sign_data_hiding_enabled_flag`}
    public @CType("uint32_t : 1") int sign_data_hiding_enabled_flag() { return StdVideoH265PpsFlags.get_sign_data_hiding_enabled_flag(this.segment()); }
    /// Sets `sign_data_hiding_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sign_data_hiding_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sign_data_hiding_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `sign_data_hiding_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sign_data_hiding_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_sign_data_hiding_enabled_flag(segment, 0L, value); }
    /// Sets `sign_data_hiding_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags sign_data_hiding_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_sign_data_hiding_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `sign_data_hiding_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags sign_data_hiding_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_sign_data_hiding_enabled_flag(this.segment(), value); return this; }

    /// {@return `cabac_init_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cabac_init_present_flag(MemorySegment segment, long index) { return (int) VH_cabac_init_present_flag.get(segment, 0L, index); }
    /// {@return `cabac_init_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cabac_init_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_cabac_init_present_flag(segment, 0L); }
    /// {@return `cabac_init_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cabac_init_present_flagAt(long index) { return StdVideoH265PpsFlags.get_cabac_init_present_flag(this.segment(), index); }
    /// {@return `cabac_init_present_flag`}
    public @CType("uint32_t : 1") int cabac_init_present_flag() { return StdVideoH265PpsFlags.get_cabac_init_present_flag(this.segment()); }
    /// Sets `cabac_init_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cabac_init_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cabac_init_present_flag.set(segment, 0L, index, value); }
    /// Sets `cabac_init_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cabac_init_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cabac_init_present_flag(segment, 0L, value); }
    /// Sets `cabac_init_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cabac_init_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cabac_init_present_flag(this.segment(), index, value); return this; }
    /// Sets `cabac_init_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cabac_init_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cabac_init_present_flag(this.segment(), value); return this; }

    /// {@return `constrained_intra_pred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constrained_intra_pred_flag(MemorySegment segment, long index) { return (int) VH_constrained_intra_pred_flag.get(segment, 0L, index); }
    /// {@return `constrained_intra_pred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constrained_intra_pred_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_constrained_intra_pred_flag(segment, 0L); }
    /// {@return `constrained_intra_pred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constrained_intra_pred_flagAt(long index) { return StdVideoH265PpsFlags.get_constrained_intra_pred_flag(this.segment(), index); }
    /// {@return `constrained_intra_pred_flag`}
    public @CType("uint32_t : 1") int constrained_intra_pred_flag() { return StdVideoH265PpsFlags.get_constrained_intra_pred_flag(this.segment()); }
    /// Sets `constrained_intra_pred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constrained_intra_pred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constrained_intra_pred_flag.set(segment, 0L, index, value); }
    /// Sets `constrained_intra_pred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constrained_intra_pred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_constrained_intra_pred_flag(segment, 0L, value); }
    /// Sets `constrained_intra_pred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags constrained_intra_pred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_constrained_intra_pred_flag(this.segment(), index, value); return this; }
    /// Sets `constrained_intra_pred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags constrained_intra_pred_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_constrained_intra_pred_flag(this.segment(), value); return this; }

    /// {@return `transform_skip_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_transform_skip_enabled_flag(MemorySegment segment, long index) { return (int) VH_transform_skip_enabled_flag.get(segment, 0L, index); }
    /// {@return `transform_skip_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_transform_skip_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_transform_skip_enabled_flag(segment, 0L); }
    /// {@return `transform_skip_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int transform_skip_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_transform_skip_enabled_flag(this.segment(), index); }
    /// {@return `transform_skip_enabled_flag`}
    public @CType("uint32_t : 1") int transform_skip_enabled_flag() { return StdVideoH265PpsFlags.get_transform_skip_enabled_flag(this.segment()); }
    /// Sets `transform_skip_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform_skip_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_transform_skip_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `transform_skip_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform_skip_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transform_skip_enabled_flag(segment, 0L, value); }
    /// Sets `transform_skip_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags transform_skip_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transform_skip_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `transform_skip_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags transform_skip_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transform_skip_enabled_flag(this.segment(), value); return this; }

    /// {@return `cu_qp_delta_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cu_qp_delta_enabled_flag(MemorySegment segment, long index) { return (int) VH_cu_qp_delta_enabled_flag.get(segment, 0L, index); }
    /// {@return `cu_qp_delta_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cu_qp_delta_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_cu_qp_delta_enabled_flag(segment, 0L); }
    /// {@return `cu_qp_delta_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cu_qp_delta_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_cu_qp_delta_enabled_flag(this.segment(), index); }
    /// {@return `cu_qp_delta_enabled_flag`}
    public @CType("uint32_t : 1") int cu_qp_delta_enabled_flag() { return StdVideoH265PpsFlags.get_cu_qp_delta_enabled_flag(this.segment()); }
    /// Sets `cu_qp_delta_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cu_qp_delta_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cu_qp_delta_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `cu_qp_delta_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cu_qp_delta_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cu_qp_delta_enabled_flag(segment, 0L, value); }
    /// Sets `cu_qp_delta_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cu_qp_delta_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cu_qp_delta_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `cu_qp_delta_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cu_qp_delta_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cu_qp_delta_enabled_flag(this.segment(), value); return this; }

    /// {@return `pps_slice_chroma_qp_offsets_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_slice_chroma_qp_offsets_present_flag(MemorySegment segment, long index) { return (int) VH_pps_slice_chroma_qp_offsets_present_flag.get(segment, 0L, index); }
    /// {@return `pps_slice_chroma_qp_offsets_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_slice_chroma_qp_offsets_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_slice_chroma_qp_offsets_present_flag(segment, 0L); }
    /// {@return `pps_slice_chroma_qp_offsets_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_slice_chroma_qp_offsets_present_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_slice_chroma_qp_offsets_present_flag(this.segment(), index); }
    /// {@return `pps_slice_chroma_qp_offsets_present_flag`}
    public @CType("uint32_t : 1") int pps_slice_chroma_qp_offsets_present_flag() { return StdVideoH265PpsFlags.get_pps_slice_chroma_qp_offsets_present_flag(this.segment()); }
    /// Sets `pps_slice_chroma_qp_offsets_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_slice_chroma_qp_offsets_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_slice_chroma_qp_offsets_present_flag.set(segment, 0L, index, value); }
    /// Sets `pps_slice_chroma_qp_offsets_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_slice_chroma_qp_offsets_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_chroma_qp_offsets_present_flag(segment, 0L, value); }
    /// Sets `pps_slice_chroma_qp_offsets_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_slice_chroma_qp_offsets_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_chroma_qp_offsets_present_flag(this.segment(), index, value); return this; }
    /// Sets `pps_slice_chroma_qp_offsets_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_slice_chroma_qp_offsets_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_chroma_qp_offsets_present_flag(this.segment(), value); return this; }

    /// {@return `weighted_pred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_weighted_pred_flag(MemorySegment segment, long index) { return (int) VH_weighted_pred_flag.get(segment, 0L, index); }
    /// {@return `weighted_pred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_weighted_pred_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_weighted_pred_flag(segment, 0L); }
    /// {@return `weighted_pred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int weighted_pred_flagAt(long index) { return StdVideoH265PpsFlags.get_weighted_pred_flag(this.segment(), index); }
    /// {@return `weighted_pred_flag`}
    public @CType("uint32_t : 1") int weighted_pred_flag() { return StdVideoH265PpsFlags.get_weighted_pred_flag(this.segment()); }
    /// Sets `weighted_pred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_weighted_pred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_weighted_pred_flag.set(segment, 0L, index, value); }
    /// Sets `weighted_pred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_weighted_pred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_pred_flag(segment, 0L, value); }
    /// Sets `weighted_pred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags weighted_pred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_pred_flag(this.segment(), index, value); return this; }
    /// Sets `weighted_pred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags weighted_pred_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_pred_flag(this.segment(), value); return this; }

    /// {@return `weighted_bipred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_weighted_bipred_flag(MemorySegment segment, long index) { return (int) VH_weighted_bipred_flag.get(segment, 0L, index); }
    /// {@return `weighted_bipred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_weighted_bipred_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_weighted_bipred_flag(segment, 0L); }
    /// {@return `weighted_bipred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int weighted_bipred_flagAt(long index) { return StdVideoH265PpsFlags.get_weighted_bipred_flag(this.segment(), index); }
    /// {@return `weighted_bipred_flag`}
    public @CType("uint32_t : 1") int weighted_bipred_flag() { return StdVideoH265PpsFlags.get_weighted_bipred_flag(this.segment()); }
    /// Sets `weighted_bipred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_weighted_bipred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_weighted_bipred_flag.set(segment, 0L, index, value); }
    /// Sets `weighted_bipred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_weighted_bipred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_bipred_flag(segment, 0L, value); }
    /// Sets `weighted_bipred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags weighted_bipred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_bipred_flag(this.segment(), index, value); return this; }
    /// Sets `weighted_bipred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags weighted_bipred_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_weighted_bipred_flag(this.segment(), value); return this; }

    /// {@return `transquant_bypass_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_transquant_bypass_enabled_flag(MemorySegment segment, long index) { return (int) VH_transquant_bypass_enabled_flag.get(segment, 0L, index); }
    /// {@return `transquant_bypass_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_transquant_bypass_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_transquant_bypass_enabled_flag(segment, 0L); }
    /// {@return `transquant_bypass_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int transquant_bypass_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_transquant_bypass_enabled_flag(this.segment(), index); }
    /// {@return `transquant_bypass_enabled_flag`}
    public @CType("uint32_t : 1") int transquant_bypass_enabled_flag() { return StdVideoH265PpsFlags.get_transquant_bypass_enabled_flag(this.segment()); }
    /// Sets `transquant_bypass_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transquant_bypass_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_transquant_bypass_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `transquant_bypass_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transquant_bypass_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transquant_bypass_enabled_flag(segment, 0L, value); }
    /// Sets `transquant_bypass_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags transquant_bypass_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transquant_bypass_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `transquant_bypass_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags transquant_bypass_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_transquant_bypass_enabled_flag(this.segment(), value); return this; }

    /// {@return `tiles_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_tiles_enabled_flag(MemorySegment segment, long index) { return (int) VH_tiles_enabled_flag.get(segment, 0L, index); }
    /// {@return `tiles_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_tiles_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_tiles_enabled_flag(segment, 0L); }
    /// {@return `tiles_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int tiles_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_tiles_enabled_flag(this.segment(), index); }
    /// {@return `tiles_enabled_flag`}
    public @CType("uint32_t : 1") int tiles_enabled_flag() { return StdVideoH265PpsFlags.get_tiles_enabled_flag(this.segment()); }
    /// Sets `tiles_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tiles_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_tiles_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `tiles_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tiles_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_tiles_enabled_flag(segment, 0L, value); }
    /// Sets `tiles_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags tiles_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_tiles_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `tiles_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags tiles_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_tiles_enabled_flag(this.segment(), value); return this; }

    /// {@return `entropy_coding_sync_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_entropy_coding_sync_enabled_flag(MemorySegment segment, long index) { return (int) VH_entropy_coding_sync_enabled_flag.get(segment, 0L, index); }
    /// {@return `entropy_coding_sync_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_entropy_coding_sync_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_entropy_coding_sync_enabled_flag(segment, 0L); }
    /// {@return `entropy_coding_sync_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int entropy_coding_sync_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_entropy_coding_sync_enabled_flag(this.segment(), index); }
    /// {@return `entropy_coding_sync_enabled_flag`}
    public @CType("uint32_t : 1") int entropy_coding_sync_enabled_flag() { return StdVideoH265PpsFlags.get_entropy_coding_sync_enabled_flag(this.segment()); }
    /// Sets `entropy_coding_sync_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_entropy_coding_sync_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_entropy_coding_sync_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `entropy_coding_sync_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_entropy_coding_sync_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_entropy_coding_sync_enabled_flag(segment, 0L, value); }
    /// Sets `entropy_coding_sync_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags entropy_coding_sync_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_entropy_coding_sync_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `entropy_coding_sync_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags entropy_coding_sync_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_entropy_coding_sync_enabled_flag(this.segment(), value); return this; }

    /// {@return `uniform_spacing_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_uniform_spacing_flag(MemorySegment segment, long index) { return (int) VH_uniform_spacing_flag.get(segment, 0L, index); }
    /// {@return `uniform_spacing_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_uniform_spacing_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_uniform_spacing_flag(segment, 0L); }
    /// {@return `uniform_spacing_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int uniform_spacing_flagAt(long index) { return StdVideoH265PpsFlags.get_uniform_spacing_flag(this.segment(), index); }
    /// {@return `uniform_spacing_flag`}
    public @CType("uint32_t : 1") int uniform_spacing_flag() { return StdVideoH265PpsFlags.get_uniform_spacing_flag(this.segment()); }
    /// Sets `uniform_spacing_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniform_spacing_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_uniform_spacing_flag.set(segment, 0L, index, value); }
    /// Sets `uniform_spacing_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniform_spacing_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_uniform_spacing_flag(segment, 0L, value); }
    /// Sets `uniform_spacing_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags uniform_spacing_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_uniform_spacing_flag(this.segment(), index, value); return this; }
    /// Sets `uniform_spacing_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags uniform_spacing_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_uniform_spacing_flag(this.segment(), value); return this; }

    /// {@return `loop_filter_across_tiles_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_loop_filter_across_tiles_enabled_flag(MemorySegment segment, long index) { return (int) VH_loop_filter_across_tiles_enabled_flag.get(segment, 0L, index); }
    /// {@return `loop_filter_across_tiles_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_loop_filter_across_tiles_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_loop_filter_across_tiles_enabled_flag(segment, 0L); }
    /// {@return `loop_filter_across_tiles_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int loop_filter_across_tiles_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_loop_filter_across_tiles_enabled_flag(this.segment(), index); }
    /// {@return `loop_filter_across_tiles_enabled_flag`}
    public @CType("uint32_t : 1") int loop_filter_across_tiles_enabled_flag() { return StdVideoH265PpsFlags.get_loop_filter_across_tiles_enabled_flag(this.segment()); }
    /// Sets `loop_filter_across_tiles_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_across_tiles_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_loop_filter_across_tiles_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `loop_filter_across_tiles_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_across_tiles_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_loop_filter_across_tiles_enabled_flag(segment, 0L, value); }
    /// Sets `loop_filter_across_tiles_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags loop_filter_across_tiles_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_loop_filter_across_tiles_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `loop_filter_across_tiles_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags loop_filter_across_tiles_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_loop_filter_across_tiles_enabled_flag(this.segment(), value); return this; }

    /// {@return `pps_loop_filter_across_slices_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_loop_filter_across_slices_enabled_flag(MemorySegment segment, long index) { return (int) VH_pps_loop_filter_across_slices_enabled_flag.get(segment, 0L, index); }
    /// {@return `pps_loop_filter_across_slices_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_loop_filter_across_slices_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_loop_filter_across_slices_enabled_flag(segment, 0L); }
    /// {@return `pps_loop_filter_across_slices_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_loop_filter_across_slices_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_loop_filter_across_slices_enabled_flag(this.segment(), index); }
    /// {@return `pps_loop_filter_across_slices_enabled_flag`}
    public @CType("uint32_t : 1") int pps_loop_filter_across_slices_enabled_flag() { return StdVideoH265PpsFlags.get_pps_loop_filter_across_slices_enabled_flag(this.segment()); }
    /// Sets `pps_loop_filter_across_slices_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_loop_filter_across_slices_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_loop_filter_across_slices_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `pps_loop_filter_across_slices_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_loop_filter_across_slices_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_loop_filter_across_slices_enabled_flag(segment, 0L, value); }
    /// Sets `pps_loop_filter_across_slices_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_loop_filter_across_slices_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_loop_filter_across_slices_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `pps_loop_filter_across_slices_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_loop_filter_across_slices_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_loop_filter_across_slices_enabled_flag(this.segment(), value); return this; }

    /// {@return `deblocking_filter_control_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_deblocking_filter_control_present_flag(MemorySegment segment, long index) { return (int) VH_deblocking_filter_control_present_flag.get(segment, 0L, index); }
    /// {@return `deblocking_filter_control_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_deblocking_filter_control_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_deblocking_filter_control_present_flag(segment, 0L); }
    /// {@return `deblocking_filter_control_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int deblocking_filter_control_present_flagAt(long index) { return StdVideoH265PpsFlags.get_deblocking_filter_control_present_flag(this.segment(), index); }
    /// {@return `deblocking_filter_control_present_flag`}
    public @CType("uint32_t : 1") int deblocking_filter_control_present_flag() { return StdVideoH265PpsFlags.get_deblocking_filter_control_present_flag(this.segment()); }
    /// Sets `deblocking_filter_control_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deblocking_filter_control_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_deblocking_filter_control_present_flag.set(segment, 0L, index, value); }
    /// Sets `deblocking_filter_control_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deblocking_filter_control_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_control_present_flag(segment, 0L, value); }
    /// Sets `deblocking_filter_control_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags deblocking_filter_control_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_control_present_flag(this.segment(), index, value); return this; }
    /// Sets `deblocking_filter_control_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags deblocking_filter_control_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_control_present_flag(this.segment(), value); return this; }

    /// {@return `deblocking_filter_override_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_deblocking_filter_override_enabled_flag(MemorySegment segment, long index) { return (int) VH_deblocking_filter_override_enabled_flag.get(segment, 0L, index); }
    /// {@return `deblocking_filter_override_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_deblocking_filter_override_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_deblocking_filter_override_enabled_flag(segment, 0L); }
    /// {@return `deblocking_filter_override_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int deblocking_filter_override_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_deblocking_filter_override_enabled_flag(this.segment(), index); }
    /// {@return `deblocking_filter_override_enabled_flag`}
    public @CType("uint32_t : 1") int deblocking_filter_override_enabled_flag() { return StdVideoH265PpsFlags.get_deblocking_filter_override_enabled_flag(this.segment()); }
    /// Sets `deblocking_filter_override_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deblocking_filter_override_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_deblocking_filter_override_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `deblocking_filter_override_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deblocking_filter_override_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_override_enabled_flag(segment, 0L, value); }
    /// Sets `deblocking_filter_override_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags deblocking_filter_override_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_override_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `deblocking_filter_override_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags deblocking_filter_override_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_deblocking_filter_override_enabled_flag(this.segment(), value); return this; }

    /// {@return `pps_deblocking_filter_disabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_deblocking_filter_disabled_flag(MemorySegment segment, long index) { return (int) VH_pps_deblocking_filter_disabled_flag.get(segment, 0L, index); }
    /// {@return `pps_deblocking_filter_disabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_deblocking_filter_disabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_deblocking_filter_disabled_flag(segment, 0L); }
    /// {@return `pps_deblocking_filter_disabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_deblocking_filter_disabled_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_deblocking_filter_disabled_flag(this.segment(), index); }
    /// {@return `pps_deblocking_filter_disabled_flag`}
    public @CType("uint32_t : 1") int pps_deblocking_filter_disabled_flag() { return StdVideoH265PpsFlags.get_pps_deblocking_filter_disabled_flag(this.segment()); }
    /// Sets `pps_deblocking_filter_disabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_deblocking_filter_disabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_deblocking_filter_disabled_flag.set(segment, 0L, index, value); }
    /// Sets `pps_deblocking_filter_disabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_deblocking_filter_disabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_deblocking_filter_disabled_flag(segment, 0L, value); }
    /// Sets `pps_deblocking_filter_disabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_deblocking_filter_disabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_deblocking_filter_disabled_flag(this.segment(), index, value); return this; }
    /// Sets `pps_deblocking_filter_disabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_deblocking_filter_disabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_deblocking_filter_disabled_flag(this.segment(), value); return this; }

    /// {@return `pps_scaling_list_data_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_scaling_list_data_present_flag(MemorySegment segment, long index) { return (int) VH_pps_scaling_list_data_present_flag.get(segment, 0L, index); }
    /// {@return `pps_scaling_list_data_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_scaling_list_data_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_scaling_list_data_present_flag(segment, 0L); }
    /// {@return `pps_scaling_list_data_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_scaling_list_data_present_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_scaling_list_data_present_flag(this.segment(), index); }
    /// {@return `pps_scaling_list_data_present_flag`}
    public @CType("uint32_t : 1") int pps_scaling_list_data_present_flag() { return StdVideoH265PpsFlags.get_pps_scaling_list_data_present_flag(this.segment()); }
    /// Sets `pps_scaling_list_data_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_scaling_list_data_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_scaling_list_data_present_flag.set(segment, 0L, index, value); }
    /// Sets `pps_scaling_list_data_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_scaling_list_data_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_scaling_list_data_present_flag(segment, 0L, value); }
    /// Sets `pps_scaling_list_data_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_scaling_list_data_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_scaling_list_data_present_flag(this.segment(), index, value); return this; }
    /// Sets `pps_scaling_list_data_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_scaling_list_data_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_scaling_list_data_present_flag(this.segment(), value); return this; }

    /// {@return `lists_modification_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_lists_modification_present_flag(MemorySegment segment, long index) { return (int) VH_lists_modification_present_flag.get(segment, 0L, index); }
    /// {@return `lists_modification_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_lists_modification_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_lists_modification_present_flag(segment, 0L); }
    /// {@return `lists_modification_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int lists_modification_present_flagAt(long index) { return StdVideoH265PpsFlags.get_lists_modification_present_flag(this.segment(), index); }
    /// {@return `lists_modification_present_flag`}
    public @CType("uint32_t : 1") int lists_modification_present_flag() { return StdVideoH265PpsFlags.get_lists_modification_present_flag(this.segment()); }
    /// Sets `lists_modification_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lists_modification_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_lists_modification_present_flag.set(segment, 0L, index, value); }
    /// Sets `lists_modification_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lists_modification_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_lists_modification_present_flag(segment, 0L, value); }
    /// Sets `lists_modification_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags lists_modification_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_lists_modification_present_flag(this.segment(), index, value); return this; }
    /// Sets `lists_modification_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags lists_modification_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_lists_modification_present_flag(this.segment(), value); return this; }

    /// {@return `slice_segment_header_extension_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_segment_header_extension_present_flag(MemorySegment segment, long index) { return (int) VH_slice_segment_header_extension_present_flag.get(segment, 0L, index); }
    /// {@return `slice_segment_header_extension_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_segment_header_extension_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_slice_segment_header_extension_present_flag(segment, 0L); }
    /// {@return `slice_segment_header_extension_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int slice_segment_header_extension_present_flagAt(long index) { return StdVideoH265PpsFlags.get_slice_segment_header_extension_present_flag(this.segment(), index); }
    /// {@return `slice_segment_header_extension_present_flag`}
    public @CType("uint32_t : 1") int slice_segment_header_extension_present_flag() { return StdVideoH265PpsFlags.get_slice_segment_header_extension_present_flag(this.segment()); }
    /// Sets `slice_segment_header_extension_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_segment_header_extension_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_segment_header_extension_present_flag.set(segment, 0L, index, value); }
    /// Sets `slice_segment_header_extension_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_segment_header_extension_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_slice_segment_header_extension_present_flag(segment, 0L, value); }
    /// Sets `slice_segment_header_extension_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags slice_segment_header_extension_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_slice_segment_header_extension_present_flag(this.segment(), index, value); return this; }
    /// Sets `slice_segment_header_extension_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags slice_segment_header_extension_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_slice_segment_header_extension_present_flag(this.segment(), value); return this; }

    /// {@return `pps_extension_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_extension_present_flag(MemorySegment segment, long index) { return (int) VH_pps_extension_present_flag.get(segment, 0L, index); }
    /// {@return `pps_extension_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_extension_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_extension_present_flag(segment, 0L); }
    /// {@return `pps_extension_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_extension_present_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_extension_present_flag(this.segment(), index); }
    /// {@return `pps_extension_present_flag`}
    public @CType("uint32_t : 1") int pps_extension_present_flag() { return StdVideoH265PpsFlags.get_pps_extension_present_flag(this.segment()); }
    /// Sets `pps_extension_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_extension_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_extension_present_flag.set(segment, 0L, index, value); }
    /// Sets `pps_extension_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_extension_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_extension_present_flag(segment, 0L, value); }
    /// Sets `pps_extension_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_extension_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_extension_present_flag(this.segment(), index, value); return this; }
    /// Sets `pps_extension_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_extension_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_extension_present_flag(this.segment(), value); return this; }

    /// {@return `cross_component_prediction_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cross_component_prediction_enabled_flag(MemorySegment segment, long index) { return (int) VH_cross_component_prediction_enabled_flag.get(segment, 0L, index); }
    /// {@return `cross_component_prediction_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cross_component_prediction_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_cross_component_prediction_enabled_flag(segment, 0L); }
    /// {@return `cross_component_prediction_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cross_component_prediction_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_cross_component_prediction_enabled_flag(this.segment(), index); }
    /// {@return `cross_component_prediction_enabled_flag`}
    public @CType("uint32_t : 1") int cross_component_prediction_enabled_flag() { return StdVideoH265PpsFlags.get_cross_component_prediction_enabled_flag(this.segment()); }
    /// Sets `cross_component_prediction_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cross_component_prediction_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cross_component_prediction_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `cross_component_prediction_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cross_component_prediction_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cross_component_prediction_enabled_flag(segment, 0L, value); }
    /// Sets `cross_component_prediction_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cross_component_prediction_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cross_component_prediction_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `cross_component_prediction_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags cross_component_prediction_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_cross_component_prediction_enabled_flag(this.segment(), value); return this; }

    /// {@return `chroma_qp_offset_list_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_chroma_qp_offset_list_enabled_flag(MemorySegment segment, long index) { return (int) VH_chroma_qp_offset_list_enabled_flag.get(segment, 0L, index); }
    /// {@return `chroma_qp_offset_list_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_chroma_qp_offset_list_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_chroma_qp_offset_list_enabled_flag(segment, 0L); }
    /// {@return `chroma_qp_offset_list_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int chroma_qp_offset_list_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_chroma_qp_offset_list_enabled_flag(this.segment(), index); }
    /// {@return `chroma_qp_offset_list_enabled_flag`}
    public @CType("uint32_t : 1") int chroma_qp_offset_list_enabled_flag() { return StdVideoH265PpsFlags.get_chroma_qp_offset_list_enabled_flag(this.segment()); }
    /// Sets `chroma_qp_offset_list_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_qp_offset_list_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_chroma_qp_offset_list_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `chroma_qp_offset_list_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_qp_offset_list_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_chroma_qp_offset_list_enabled_flag(segment, 0L, value); }
    /// Sets `chroma_qp_offset_list_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags chroma_qp_offset_list_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_chroma_qp_offset_list_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `chroma_qp_offset_list_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags chroma_qp_offset_list_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_chroma_qp_offset_list_enabled_flag(this.segment(), value); return this; }

    /// {@return `pps_curr_pic_ref_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_curr_pic_ref_enabled_flag(MemorySegment segment, long index) { return (int) VH_pps_curr_pic_ref_enabled_flag.get(segment, 0L, index); }
    /// {@return `pps_curr_pic_ref_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_curr_pic_ref_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_curr_pic_ref_enabled_flag(segment, 0L); }
    /// {@return `pps_curr_pic_ref_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_curr_pic_ref_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_curr_pic_ref_enabled_flag(this.segment(), index); }
    /// {@return `pps_curr_pic_ref_enabled_flag`}
    public @CType("uint32_t : 1") int pps_curr_pic_ref_enabled_flag() { return StdVideoH265PpsFlags.get_pps_curr_pic_ref_enabled_flag(this.segment()); }
    /// Sets `pps_curr_pic_ref_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_curr_pic_ref_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_curr_pic_ref_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `pps_curr_pic_ref_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_curr_pic_ref_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_curr_pic_ref_enabled_flag(segment, 0L, value); }
    /// Sets `pps_curr_pic_ref_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_curr_pic_ref_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_curr_pic_ref_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `pps_curr_pic_ref_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_curr_pic_ref_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_curr_pic_ref_enabled_flag(this.segment(), value); return this; }

    /// {@return `residual_adaptive_colour_transform_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_residual_adaptive_colour_transform_enabled_flag(MemorySegment segment, long index) { return (int) VH_residual_adaptive_colour_transform_enabled_flag.get(segment, 0L, index); }
    /// {@return `residual_adaptive_colour_transform_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_residual_adaptive_colour_transform_enabled_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_residual_adaptive_colour_transform_enabled_flag(segment, 0L); }
    /// {@return `residual_adaptive_colour_transform_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int residual_adaptive_colour_transform_enabled_flagAt(long index) { return StdVideoH265PpsFlags.get_residual_adaptive_colour_transform_enabled_flag(this.segment(), index); }
    /// {@return `residual_adaptive_colour_transform_enabled_flag`}
    public @CType("uint32_t : 1") int residual_adaptive_colour_transform_enabled_flag() { return StdVideoH265PpsFlags.get_residual_adaptive_colour_transform_enabled_flag(this.segment()); }
    /// Sets `residual_adaptive_colour_transform_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residual_adaptive_colour_transform_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_residual_adaptive_colour_transform_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `residual_adaptive_colour_transform_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residual_adaptive_colour_transform_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_residual_adaptive_colour_transform_enabled_flag(segment, 0L, value); }
    /// Sets `residual_adaptive_colour_transform_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags residual_adaptive_colour_transform_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_residual_adaptive_colour_transform_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `residual_adaptive_colour_transform_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags residual_adaptive_colour_transform_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_residual_adaptive_colour_transform_enabled_flag(this.segment(), value); return this; }

    /// {@return `pps_slice_act_qp_offsets_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_slice_act_qp_offsets_present_flag(MemorySegment segment, long index) { return (int) VH_pps_slice_act_qp_offsets_present_flag.get(segment, 0L, index); }
    /// {@return `pps_slice_act_qp_offsets_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_slice_act_qp_offsets_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_slice_act_qp_offsets_present_flag(segment, 0L); }
    /// {@return `pps_slice_act_qp_offsets_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_slice_act_qp_offsets_present_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_slice_act_qp_offsets_present_flag(this.segment(), index); }
    /// {@return `pps_slice_act_qp_offsets_present_flag`}
    public @CType("uint32_t : 1") int pps_slice_act_qp_offsets_present_flag() { return StdVideoH265PpsFlags.get_pps_slice_act_qp_offsets_present_flag(this.segment()); }
    /// Sets `pps_slice_act_qp_offsets_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_slice_act_qp_offsets_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_slice_act_qp_offsets_present_flag.set(segment, 0L, index, value); }
    /// Sets `pps_slice_act_qp_offsets_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_slice_act_qp_offsets_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_act_qp_offsets_present_flag(segment, 0L, value); }
    /// Sets `pps_slice_act_qp_offsets_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_slice_act_qp_offsets_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_act_qp_offsets_present_flag(this.segment(), index, value); return this; }
    /// Sets `pps_slice_act_qp_offsets_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_slice_act_qp_offsets_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_slice_act_qp_offsets_present_flag(this.segment(), value); return this; }

    /// {@return `pps_palette_predictor_initializers_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_palette_predictor_initializers_present_flag(MemorySegment segment, long index) { return (int) VH_pps_palette_predictor_initializers_present_flag.get(segment, 0L, index); }
    /// {@return `pps_palette_predictor_initializers_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_palette_predictor_initializers_present_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_palette_predictor_initializers_present_flag(segment, 0L); }
    /// {@return `pps_palette_predictor_initializers_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_palette_predictor_initializers_present_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_palette_predictor_initializers_present_flag(this.segment(), index); }
    /// {@return `pps_palette_predictor_initializers_present_flag`}
    public @CType("uint32_t : 1") int pps_palette_predictor_initializers_present_flag() { return StdVideoH265PpsFlags.get_pps_palette_predictor_initializers_present_flag(this.segment()); }
    /// Sets `pps_palette_predictor_initializers_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_palette_predictor_initializers_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_palette_predictor_initializers_present_flag.set(segment, 0L, index, value); }
    /// Sets `pps_palette_predictor_initializers_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_palette_predictor_initializers_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_palette_predictor_initializers_present_flag(segment, 0L, value); }
    /// Sets `pps_palette_predictor_initializers_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_palette_predictor_initializers_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_palette_predictor_initializers_present_flag(this.segment(), index, value); return this; }
    /// Sets `pps_palette_predictor_initializers_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_palette_predictor_initializers_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_palette_predictor_initializers_present_flag(this.segment(), value); return this; }

    /// {@return `monochrome_palette_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_monochrome_palette_flag(MemorySegment segment, long index) { return (int) VH_monochrome_palette_flag.get(segment, 0L, index); }
    /// {@return `monochrome_palette_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_monochrome_palette_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_monochrome_palette_flag(segment, 0L); }
    /// {@return `monochrome_palette_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int monochrome_palette_flagAt(long index) { return StdVideoH265PpsFlags.get_monochrome_palette_flag(this.segment(), index); }
    /// {@return `monochrome_palette_flag`}
    public @CType("uint32_t : 1") int monochrome_palette_flag() { return StdVideoH265PpsFlags.get_monochrome_palette_flag(this.segment()); }
    /// Sets `monochrome_palette_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_monochrome_palette_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_monochrome_palette_flag.set(segment, 0L, index, value); }
    /// Sets `monochrome_palette_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_monochrome_palette_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_monochrome_palette_flag(segment, 0L, value); }
    /// Sets `monochrome_palette_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags monochrome_palette_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_monochrome_palette_flag(this.segment(), index, value); return this; }
    /// Sets `monochrome_palette_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags monochrome_palette_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_monochrome_palette_flag(this.segment(), value); return this; }

    /// {@return `pps_range_extension_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pps_range_extension_flag(MemorySegment segment, long index) { return (int) VH_pps_range_extension_flag.get(segment, 0L, index); }
    /// {@return `pps_range_extension_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pps_range_extension_flag(MemorySegment segment) { return StdVideoH265PpsFlags.get_pps_range_extension_flag(segment, 0L); }
    /// {@return `pps_range_extension_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pps_range_extension_flagAt(long index) { return StdVideoH265PpsFlags.get_pps_range_extension_flag(this.segment(), index); }
    /// {@return `pps_range_extension_flag`}
    public @CType("uint32_t : 1") int pps_range_extension_flag() { return StdVideoH265PpsFlags.get_pps_range_extension_flag(this.segment()); }
    /// Sets `pps_range_extension_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_range_extension_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pps_range_extension_flag.set(segment, 0L, index, value); }
    /// Sets `pps_range_extension_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_range_extension_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_range_extension_flag(segment, 0L, value); }
    /// Sets `pps_range_extension_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_range_extension_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_range_extension_flag(this.segment(), index, value); return this; }
    /// Sets `pps_range_extension_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PpsFlags pps_range_extension_flag(@CType("uint32_t : 1") int value) { StdVideoH265PpsFlags.set_pps_range_extension_flag(this.segment(), value); return this; }

}
