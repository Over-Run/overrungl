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
/// ### pps_pic_parameter_set_id
/// [VarHandle][#VH_pps_pic_parameter_set_id] - [Getter][#pps_pic_parameter_set_id()] - [Setter][#pps_pic_parameter_set_id(byte)]
/// ### pps_seq_parameter_set_id
/// [VarHandle][#VH_pps_seq_parameter_set_id] - [Getter][#pps_seq_parameter_set_id()] - [Setter][#pps_seq_parameter_set_id(byte)]
/// ### sps_video_parameter_set_id
/// [VarHandle][#VH_sps_video_parameter_set_id] - [Getter][#sps_video_parameter_set_id()] - [Setter][#sps_video_parameter_set_id(byte)]
/// ### num_extra_slice_header_bits
/// [VarHandle][#VH_num_extra_slice_header_bits] - [Getter][#num_extra_slice_header_bits()] - [Setter][#num_extra_slice_header_bits(byte)]
/// ### num_ref_idx_l0_default_active_minus1
/// [VarHandle][#VH_num_ref_idx_l0_default_active_minus1] - [Getter][#num_ref_idx_l0_default_active_minus1()] - [Setter][#num_ref_idx_l0_default_active_minus1(byte)]
/// ### num_ref_idx_l1_default_active_minus1
/// [VarHandle][#VH_num_ref_idx_l1_default_active_minus1] - [Getter][#num_ref_idx_l1_default_active_minus1()] - [Setter][#num_ref_idx_l1_default_active_minus1(byte)]
/// ### init_qp_minus26
/// [VarHandle][#VH_init_qp_minus26] - [Getter][#init_qp_minus26()] - [Setter][#init_qp_minus26(byte)]
/// ### diff_cu_qp_delta_depth
/// [VarHandle][#VH_diff_cu_qp_delta_depth] - [Getter][#diff_cu_qp_delta_depth()] - [Setter][#diff_cu_qp_delta_depth(byte)]
/// ### pps_cb_qp_offset
/// [VarHandle][#VH_pps_cb_qp_offset] - [Getter][#pps_cb_qp_offset()] - [Setter][#pps_cb_qp_offset(byte)]
/// ### pps_cr_qp_offset
/// [VarHandle][#VH_pps_cr_qp_offset] - [Getter][#pps_cr_qp_offset()] - [Setter][#pps_cr_qp_offset(byte)]
/// ### pps_beta_offset_div2
/// [VarHandle][#VH_pps_beta_offset_div2] - [Getter][#pps_beta_offset_div2()] - [Setter][#pps_beta_offset_div2(byte)]
/// ### pps_tc_offset_div2
/// [VarHandle][#VH_pps_tc_offset_div2] - [Getter][#pps_tc_offset_div2()] - [Setter][#pps_tc_offset_div2(byte)]
/// ### log2_parallel_merge_level_minus2
/// [VarHandle][#VH_log2_parallel_merge_level_minus2] - [Getter][#log2_parallel_merge_level_minus2()] - [Setter][#log2_parallel_merge_level_minus2(byte)]
/// ### log2_max_transform_skip_block_size_minus2
/// [VarHandle][#VH_log2_max_transform_skip_block_size_minus2] - [Getter][#log2_max_transform_skip_block_size_minus2()] - [Setter][#log2_max_transform_skip_block_size_minus2(byte)]
/// ### diff_cu_chroma_qp_offset_depth
/// [VarHandle][#VH_diff_cu_chroma_qp_offset_depth] - [Getter][#diff_cu_chroma_qp_offset_depth()] - [Setter][#diff_cu_chroma_qp_offset_depth(byte)]
/// ### chroma_qp_offset_list_len_minus1
/// [VarHandle][#VH_chroma_qp_offset_list_len_minus1] - [Getter][#chroma_qp_offset_list_len_minus1()] - [Setter][#chroma_qp_offset_list_len_minus1(byte)]
/// ### cb_qp_offset_list
/// [VarHandle][#VH_cb_qp_offset_list] - [Getter][#cb_qp_offset_list()] - [Setter][#cb_qp_offset_list(byte)]
/// ### cr_qp_offset_list
/// [VarHandle][#VH_cr_qp_offset_list] - [Getter][#cr_qp_offset_list()] - [Setter][#cr_qp_offset_list(byte)]
/// ### log2_sao_offset_scale_luma
/// [VarHandle][#VH_log2_sao_offset_scale_luma] - [Getter][#log2_sao_offset_scale_luma()] - [Setter][#log2_sao_offset_scale_luma(byte)]
/// ### log2_sao_offset_scale_chroma
/// [VarHandle][#VH_log2_sao_offset_scale_chroma] - [Getter][#log2_sao_offset_scale_chroma()] - [Setter][#log2_sao_offset_scale_chroma(byte)]
/// ### pps_act_y_qp_offset_plus5
/// [VarHandle][#VH_pps_act_y_qp_offset_plus5] - [Getter][#pps_act_y_qp_offset_plus5()] - [Setter][#pps_act_y_qp_offset_plus5(byte)]
/// ### pps_act_cb_qp_offset_plus5
/// [VarHandle][#VH_pps_act_cb_qp_offset_plus5] - [Getter][#pps_act_cb_qp_offset_plus5()] - [Setter][#pps_act_cb_qp_offset_plus5(byte)]
/// ### pps_act_cr_qp_offset_plus3
/// [VarHandle][#VH_pps_act_cr_qp_offset_plus3] - [Getter][#pps_act_cr_qp_offset_plus3()] - [Setter][#pps_act_cr_qp_offset_plus3(byte)]
/// ### pps_num_palette_predictor_initializers
/// [VarHandle][#VH_pps_num_palette_predictor_initializers] - [Getter][#pps_num_palette_predictor_initializers()] - [Setter][#pps_num_palette_predictor_initializers(byte)]
/// ### luma_bit_depth_entry_minus8
/// [VarHandle][#VH_luma_bit_depth_entry_minus8] - [Getter][#luma_bit_depth_entry_minus8()] - [Setter][#luma_bit_depth_entry_minus8(byte)]
/// ### chroma_bit_depth_entry_minus8
/// [VarHandle][#VH_chroma_bit_depth_entry_minus8] - [Getter][#chroma_bit_depth_entry_minus8()] - [Setter][#chroma_bit_depth_entry_minus8(byte)]
/// ### num_tile_columns_minus1
/// [VarHandle][#VH_num_tile_columns_minus1] - [Getter][#num_tile_columns_minus1()] - [Setter][#num_tile_columns_minus1(byte)]
/// ### num_tile_rows_minus1
/// [VarHandle][#VH_num_tile_rows_minus1] - [Getter][#num_tile_rows_minus1()] - [Setter][#num_tile_rows_minus1(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### column_width_minus1
/// [VarHandle][#VH_column_width_minus1] - [Getter][#column_width_minus1()] - [Setter][#column_width_minus1(short)]
/// ### row_height_minus1
/// [VarHandle][#VH_row_height_minus1] - [Getter][#row_height_minus1()] - [Setter][#row_height_minus1(short)]
/// ### reserved3
/// [VarHandle][#VH_reserved3] - [Getter][#reserved3()] - [Setter][#reserved3(int)]
/// ### pScalingLists
/// [VarHandle][#VH_pScalingLists] - [Getter][#pScalingLists()] - [Setter][#pScalingLists(MemorySegment)]
/// ### pPredictorPaletteEntries
/// [VarHandle][#VH_pPredictorPaletteEntries] - [Getter][#pPredictorPaletteEntries()] - [Setter][#pPredictorPaletteEntries(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265PictureParameterSet {
///     StdVideoH265PpsFlags flags;
///     uint8_t pps_pic_parameter_set_id;
///     uint8_t pps_seq_parameter_set_id;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t num_extra_slice_header_bits;
///     uint8_t num_ref_idx_l0_default_active_minus1;
///     uint8_t num_ref_idx_l1_default_active_minus1;
///     int8_t init_qp_minus26;
///     uint8_t diff_cu_qp_delta_depth;
///     int8_t pps_cb_qp_offset;
///     int8_t pps_cr_qp_offset;
///     int8_t pps_beta_offset_div2;
///     int8_t pps_tc_offset_div2;
///     uint8_t log2_parallel_merge_level_minus2;
///     uint8_t log2_max_transform_skip_block_size_minus2;
///     uint8_t diff_cu_chroma_qp_offset_depth;
///     uint8_t chroma_qp_offset_list_len_minus1;
///     int8_t [ ] cb_qp_offset_list;
///     int8_t [ ] cr_qp_offset_list;
///     uint8_t log2_sao_offset_scale_luma;
///     uint8_t log2_sao_offset_scale_chroma;
///     int8_t pps_act_y_qp_offset_plus5;
///     int8_t pps_act_cb_qp_offset_plus5;
///     int8_t pps_act_cr_qp_offset_plus3;
///     uint8_t pps_num_palette_predictor_initializers;
///     uint8_t luma_bit_depth_entry_minus8;
///     uint8_t chroma_bit_depth_entry_minus8;
///     uint8_t num_tile_columns_minus1;
///     uint8_t num_tile_rows_minus1;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t [ ] column_width_minus1;
///     uint16_t [ ] row_height_minus1;
///     uint32_t reserved3;
///     const StdVideoH265ScalingLists * pScalingLists;
///     const StdVideoH265PredictorPaletteEntries * pPredictorPaletteEntries;
/// } StdVideoH265PictureParameterSet;
/// ```
public sealed class StdVideoH265PictureParameterSet extends Struct {
    /// The struct layout of `StdVideoH265PictureParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265PpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("num_extra_slice_header_bits"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("init_qp_minus26"),
        ValueLayout.JAVA_BYTE.withName("diff_cu_qp_delta_depth"),
        ValueLayout.JAVA_BYTE.withName("pps_cb_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("pps_cr_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("pps_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("pps_tc_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("log2_parallel_merge_level_minus2"),
        ValueLayout.JAVA_BYTE.withName("log2_max_transform_skip_block_size_minus2"),
        ValueLayout.JAVA_BYTE.withName("diff_cu_chroma_qp_offset_depth"),
        ValueLayout.JAVA_BYTE.withName("chroma_qp_offset_list_len_minus1"),
        ValueLayout.JAVA_BYTE.withName("cb_qp_offset_list"),
        ValueLayout.JAVA_BYTE.withName("cr_qp_offset_list"),
        ValueLayout.JAVA_BYTE.withName("log2_sao_offset_scale_luma"),
        ValueLayout.JAVA_BYTE.withName("log2_sao_offset_scale_chroma"),
        ValueLayout.JAVA_BYTE.withName("pps_act_y_qp_offset_plus5"),
        ValueLayout.JAVA_BYTE.withName("pps_act_cb_qp_offset_plus5"),
        ValueLayout.JAVA_BYTE.withName("pps_act_cr_qp_offset_plus3"),
        ValueLayout.JAVA_BYTE.withName("pps_num_palette_predictor_initializers"),
        ValueLayout.JAVA_BYTE.withName("luma_bit_depth_entry_minus8"),
        ValueLayout.JAVA_BYTE.withName("chroma_bit_depth_entry_minus8"),
        ValueLayout.JAVA_BYTE.withName("num_tile_columns_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_tile_rows_minus1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("column_width_minus1"),
        ValueLayout.JAVA_SHORT.withName("row_height_minus1"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.ADDRESS.withName("pScalingLists"),
        ValueLayout.ADDRESS.withName("pPredictorPaletteEntries")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pps_pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The [VarHandle] of `pps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `num_extra_slice_header_bits` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_extra_slice_header_bits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_extra_slice_header_bits"));
    /// The [VarHandle] of `num_ref_idx_l0_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l0_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l1_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The [VarHandle] of `init_qp_minus26` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_init_qp_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("init_qp_minus26"));
    /// The [VarHandle] of `diff_cu_qp_delta_depth` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_diff_cu_qp_delta_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diff_cu_qp_delta_depth"));
    /// The [VarHandle] of `pps_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_cb_qp_offset"));
    /// The [VarHandle] of `pps_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_cr_qp_offset"));
    /// The [VarHandle] of `pps_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_beta_offset_div2"));
    /// The [VarHandle] of `pps_tc_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_tc_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_tc_offset_div2"));
    /// The [VarHandle] of `log2_parallel_merge_level_minus2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_parallel_merge_level_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_parallel_merge_level_minus2"));
    /// The [VarHandle] of `log2_max_transform_skip_block_size_minus2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_transform_skip_block_size_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
    /// The [VarHandle] of `diff_cu_chroma_qp_offset_depth` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_diff_cu_chroma_qp_offset_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
    /// The [VarHandle] of `chroma_qp_offset_list_len_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_qp_offset_list_len_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
    /// The [VarHandle] of `cb_qp_offset_list` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cb_qp_offset_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_qp_offset_list"));
    /// The [VarHandle] of `cr_qp_offset_list` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cr_qp_offset_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_qp_offset_list"));
    /// The [VarHandle] of `log2_sao_offset_scale_luma` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_sao_offset_scale_luma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_sao_offset_scale_luma"));
    /// The [VarHandle] of `log2_sao_offset_scale_chroma` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_sao_offset_scale_chroma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_sao_offset_scale_chroma"));
    /// The [VarHandle] of `pps_act_y_qp_offset_plus5` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_act_y_qp_offset_plus5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
    /// The [VarHandle] of `pps_act_cb_qp_offset_plus5` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_act_cb_qp_offset_plus5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
    /// The [VarHandle] of `pps_act_cr_qp_offset_plus3` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_act_cr_qp_offset_plus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
    /// The [VarHandle] of `pps_num_palette_predictor_initializers` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pps_num_palette_predictor_initializers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_num_palette_predictor_initializers"));
    /// The [VarHandle] of `luma_bit_depth_entry_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_luma_bit_depth_entry_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_bit_depth_entry_minus8"));
    /// The [VarHandle] of `chroma_bit_depth_entry_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_bit_depth_entry_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
    /// The [VarHandle] of `num_tile_columns_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_tile_columns_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_tile_columns_minus1"));
    /// The [VarHandle] of `num_tile_rows_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_tile_rows_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_tile_rows_minus1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `column_width_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_column_width_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("column_width_minus1"));
    /// The [VarHandle] of `row_height_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_row_height_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("row_height_minus1"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pPredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPredictorPaletteEntries"));

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265PictureParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PictureParameterSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PictureParameterSet(segment); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PictureParameterSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PictureParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265PictureParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PictureParameterSet`
    public static StdVideoH265PictureParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265PictureParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265PictureParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PictureParameterSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265PictureParameterSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PictureParameterSet`
    public static StdVideoH265PictureParameterSet allocInit(SegmentAllocator allocator, @CType("StdVideoH265PpsFlags") MemorySegment flags, @CType("uint8_t") byte pps_pic_parameter_set_id, @CType("uint8_t") byte pps_seq_parameter_set_id, @CType("uint8_t") byte sps_video_parameter_set_id, @CType("uint8_t") byte num_extra_slice_header_bits, @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1, @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1, @CType("int8_t") byte init_qp_minus26, @CType("uint8_t") byte diff_cu_qp_delta_depth, @CType("int8_t") byte pps_cb_qp_offset, @CType("int8_t") byte pps_cr_qp_offset, @CType("int8_t") byte pps_beta_offset_div2, @CType("int8_t") byte pps_tc_offset_div2, @CType("uint8_t") byte log2_parallel_merge_level_minus2, @CType("uint8_t") byte log2_max_transform_skip_block_size_minus2, @CType("uint8_t") byte diff_cu_chroma_qp_offset_depth, @CType("uint8_t") byte chroma_qp_offset_list_len_minus1, @CType("int8_t [ ]") byte cb_qp_offset_list, @CType("int8_t [ ]") byte cr_qp_offset_list, @CType("uint8_t") byte log2_sao_offset_scale_luma, @CType("uint8_t") byte log2_sao_offset_scale_chroma, @CType("int8_t") byte pps_act_y_qp_offset_plus5, @CType("int8_t") byte pps_act_cb_qp_offset_plus5, @CType("int8_t") byte pps_act_cr_qp_offset_plus3, @CType("uint8_t") byte pps_num_palette_predictor_initializers, @CType("uint8_t") byte luma_bit_depth_entry_minus8, @CType("uint8_t") byte chroma_bit_depth_entry_minus8, @CType("uint8_t") byte num_tile_columns_minus1, @CType("uint8_t") byte num_tile_rows_minus1, @CType("uint8_t") byte reserved1, @CType("uint8_t") byte reserved2, @CType("uint16_t [ ]") short column_width_minus1, @CType("uint16_t [ ]") short row_height_minus1, @CType("uint32_t") int reserved3, @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingLists, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntries) { return alloc(allocator).flags(flags).pps_pic_parameter_set_id(pps_pic_parameter_set_id).pps_seq_parameter_set_id(pps_seq_parameter_set_id).sps_video_parameter_set_id(sps_video_parameter_set_id).num_extra_slice_header_bits(num_extra_slice_header_bits).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).init_qp_minus26(init_qp_minus26).diff_cu_qp_delta_depth(diff_cu_qp_delta_depth).pps_cb_qp_offset(pps_cb_qp_offset).pps_cr_qp_offset(pps_cr_qp_offset).pps_beta_offset_div2(pps_beta_offset_div2).pps_tc_offset_div2(pps_tc_offset_div2).log2_parallel_merge_level_minus2(log2_parallel_merge_level_minus2).log2_max_transform_skip_block_size_minus2(log2_max_transform_skip_block_size_minus2).diff_cu_chroma_qp_offset_depth(diff_cu_chroma_qp_offset_depth).chroma_qp_offset_list_len_minus1(chroma_qp_offset_list_len_minus1).cb_qp_offset_list(cb_qp_offset_list).cr_qp_offset_list(cr_qp_offset_list).log2_sao_offset_scale_luma(log2_sao_offset_scale_luma).log2_sao_offset_scale_chroma(log2_sao_offset_scale_chroma).pps_act_y_qp_offset_plus5(pps_act_y_qp_offset_plus5).pps_act_cb_qp_offset_plus5(pps_act_cb_qp_offset_plus5).pps_act_cr_qp_offset_plus3(pps_act_cr_qp_offset_plus3).pps_num_palette_predictor_initializers(pps_num_palette_predictor_initializers).luma_bit_depth_entry_minus8(luma_bit_depth_entry_minus8).chroma_bit_depth_entry_minus8(chroma_bit_depth_entry_minus8).num_tile_columns_minus1(num_tile_columns_minus1).num_tile_rows_minus1(num_tile_rows_minus1).reserved1(reserved1).reserved2(reserved2).column_width_minus1(column_width_minus1).row_height_minus1(row_height_minus1).reserved3(reserved3).pScalingLists(pScalingLists).pPredictorPaletteEntries(pPredictorPaletteEntries); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265PictureParameterSet copyFrom(StdVideoH265PictureParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265PpsFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265PpsFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265PpsFlags") MemorySegment flags() { return StdVideoH265PictureParameterSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265PpsFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265PpsFlags") MemorySegment value) { StdVideoH265PictureParameterSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet flags(@CType("StdVideoH265PpsFlags") MemorySegment value) { StdVideoH265PictureParameterSet.set_flags(this.segment(), value); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_pic_parameter_set_id(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_pic_parameter_set_id(segment, 0L); }
    /// {@return `pps_pic_parameter_set_id`}
    public @CType("uint8_t") byte pps_pic_parameter_set_id() { return StdVideoH265PictureParameterSet.get_pps_pic_parameter_set_id(this.segment()); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_seq_parameter_set_id(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_seq_parameter_set_id(segment, 0L); }
    /// {@return `pps_seq_parameter_set_id`}
    public @CType("uint8_t") byte pps_seq_parameter_set_id() { return StdVideoH265PictureParameterSet.get_pps_seq_parameter_set_id(this.segment()); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_sps_video_parameter_set_id(segment, 0L); }
    /// {@return `sps_video_parameter_set_id`}
    public @CType("uint8_t") byte sps_video_parameter_set_id() { return StdVideoH265PictureParameterSet.get_sps_video_parameter_set_id(this.segment()); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_sps_video_parameter_set_id(segment, 0L, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet sps_video_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_sps_video_parameter_set_id(this.segment(), value); return this; }

    /// {@return `num_extra_slice_header_bits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_extra_slice_header_bits(MemorySegment segment, long index) { return (byte) VH_num_extra_slice_header_bits.get(segment, 0L, index); }
    /// {@return `num_extra_slice_header_bits`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_extra_slice_header_bits(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_num_extra_slice_header_bits(segment, 0L); }
    /// {@return `num_extra_slice_header_bits`}
    public @CType("uint8_t") byte num_extra_slice_header_bits() { return StdVideoH265PictureParameterSet.get_num_extra_slice_header_bits(this.segment()); }
    /// Sets `num_extra_slice_header_bits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_extra_slice_header_bits(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_extra_slice_header_bits.set(segment, 0L, index, value); }
    /// Sets `num_extra_slice_header_bits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_extra_slice_header_bits(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_extra_slice_header_bits(segment, 0L, value); }
    /// Sets `num_extra_slice_header_bits` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_extra_slice_header_bits(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_extra_slice_header_bits(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l0_default_active_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1() { return StdVideoH265PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l0_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l0_default_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l1_default_active_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1() { return StdVideoH265PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l1_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l1_default_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(this.segment(), value); return this; }

    /// {@return `init_qp_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_init_qp_minus26(MemorySegment segment, long index) { return (byte) VH_init_qp_minus26.get(segment, 0L, index); }
    /// {@return `init_qp_minus26`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_init_qp_minus26(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_init_qp_minus26(segment, 0L); }
    /// {@return `init_qp_minus26`}
    public @CType("int8_t") byte init_qp_minus26() { return StdVideoH265PictureParameterSet.get_init_qp_minus26(this.segment()); }
    /// Sets `init_qp_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_init_qp_minus26(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_init_qp_minus26.set(segment, 0L, index, value); }
    /// Sets `init_qp_minus26` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_init_qp_minus26(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_init_qp_minus26(segment, 0L, value); }
    /// Sets `init_qp_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet init_qp_minus26(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_init_qp_minus26(this.segment(), value); return this; }

    /// {@return `diff_cu_qp_delta_depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_diff_cu_qp_delta_depth(MemorySegment segment, long index) { return (byte) VH_diff_cu_qp_delta_depth.get(segment, 0L, index); }
    /// {@return `diff_cu_qp_delta_depth`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_diff_cu_qp_delta_depth(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_diff_cu_qp_delta_depth(segment, 0L); }
    /// {@return `diff_cu_qp_delta_depth`}
    public @CType("uint8_t") byte diff_cu_qp_delta_depth() { return StdVideoH265PictureParameterSet.get_diff_cu_qp_delta_depth(this.segment()); }
    /// Sets `diff_cu_qp_delta_depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_diff_cu_qp_delta_depth(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_diff_cu_qp_delta_depth.set(segment, 0L, index, value); }
    /// Sets `diff_cu_qp_delta_depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_diff_cu_qp_delta_depth(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_qp_delta_depth(segment, 0L, value); }
    /// Sets `diff_cu_qp_delta_depth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_qp_delta_depth(this.segment(), value); return this; }

    /// {@return `pps_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_pps_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `pps_cb_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_cb_qp_offset(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_cb_qp_offset(segment, 0L); }
    /// {@return `pps_cb_qp_offset`}
    public @CType("int8_t") byte pps_cb_qp_offset() { return StdVideoH265PictureParameterSet.get_pps_cb_qp_offset(this.segment()); }
    /// Sets `pps_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_cb_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `pps_cb_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_cb_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cb_qp_offset(segment, 0L, value); }
    /// Sets `pps_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cb_qp_offset(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cb_qp_offset(this.segment(), value); return this; }

    /// {@return `pps_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_pps_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `pps_cr_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_cr_qp_offset(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_cr_qp_offset(segment, 0L); }
    /// {@return `pps_cr_qp_offset`}
    public @CType("int8_t") byte pps_cr_qp_offset() { return StdVideoH265PictureParameterSet.get_pps_cr_qp_offset(this.segment()); }
    /// Sets `pps_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_cr_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `pps_cr_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_cr_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cr_qp_offset(segment, 0L, value); }
    /// Sets `pps_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cr_qp_offset(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cr_qp_offset(this.segment(), value); return this; }

    /// {@return `pps_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_pps_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `pps_beta_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_beta_offset_div2(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_beta_offset_div2(segment, 0L); }
    /// {@return `pps_beta_offset_div2`}
    public @CType("int8_t") byte pps_beta_offset_div2() { return StdVideoH265PictureParameterSet.get_pps_beta_offset_div2(this.segment()); }
    /// Sets `pps_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_beta_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `pps_beta_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_beta_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_beta_offset_div2(segment, 0L, value); }
    /// Sets `pps_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_beta_offset_div2(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_beta_offset_div2(this.segment(), value); return this; }

    /// {@return `pps_tc_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_tc_offset_div2(MemorySegment segment, long index) { return (byte) VH_pps_tc_offset_div2.get(segment, 0L, index); }
    /// {@return `pps_tc_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_tc_offset_div2(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_tc_offset_div2(segment, 0L); }
    /// {@return `pps_tc_offset_div2`}
    public @CType("int8_t") byte pps_tc_offset_div2() { return StdVideoH265PictureParameterSet.get_pps_tc_offset_div2(this.segment()); }
    /// Sets `pps_tc_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_tc_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_tc_offset_div2.set(segment, 0L, index, value); }
    /// Sets `pps_tc_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_tc_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_tc_offset_div2(segment, 0L, value); }
    /// Sets `pps_tc_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_tc_offset_div2(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_tc_offset_div2(this.segment(), value); return this; }

    /// {@return `log2_parallel_merge_level_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_parallel_merge_level_minus2(MemorySegment segment, long index) { return (byte) VH_log2_parallel_merge_level_minus2.get(segment, 0L, index); }
    /// {@return `log2_parallel_merge_level_minus2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_parallel_merge_level_minus2(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_log2_parallel_merge_level_minus2(segment, 0L); }
    /// {@return `log2_parallel_merge_level_minus2`}
    public @CType("uint8_t") byte log2_parallel_merge_level_minus2() { return StdVideoH265PictureParameterSet.get_log2_parallel_merge_level_minus2(this.segment()); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_parallel_merge_level_minus2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_parallel_merge_level_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_parallel_merge_level_minus2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_parallel_merge_level_minus2(segment, 0L, value); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_parallel_merge_level_minus2(this.segment(), value); return this; }

    /// {@return `log2_max_transform_skip_block_size_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_transform_skip_block_size_minus2(MemorySegment segment, long index) { return (byte) VH_log2_max_transform_skip_block_size_minus2.get(segment, 0L, index); }
    /// {@return `log2_max_transform_skip_block_size_minus2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_transform_skip_block_size_minus2(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_log2_max_transform_skip_block_size_minus2(segment, 0L); }
    /// {@return `log2_max_transform_skip_block_size_minus2`}
    public @CType("uint8_t") byte log2_max_transform_skip_block_size_minus2() { return StdVideoH265PictureParameterSet.get_log2_max_transform_skip_block_size_minus2(this.segment()); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_transform_skip_block_size_minus2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_transform_skip_block_size_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_transform_skip_block_size_minus2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_max_transform_skip_block_size_minus2(segment, 0L, value); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_max_transform_skip_block_size_minus2(this.segment(), value); return this; }

    /// {@return `diff_cu_chroma_qp_offset_depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_diff_cu_chroma_qp_offset_depth(MemorySegment segment, long index) { return (byte) VH_diff_cu_chroma_qp_offset_depth.get(segment, 0L, index); }
    /// {@return `diff_cu_chroma_qp_offset_depth`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_diff_cu_chroma_qp_offset_depth(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_diff_cu_chroma_qp_offset_depth(segment, 0L); }
    /// {@return `diff_cu_chroma_qp_offset_depth`}
    public @CType("uint8_t") byte diff_cu_chroma_qp_offset_depth() { return StdVideoH265PictureParameterSet.get_diff_cu_chroma_qp_offset_depth(this.segment()); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_diff_cu_chroma_qp_offset_depth(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_diff_cu_chroma_qp_offset_depth.set(segment, 0L, index, value); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_diff_cu_chroma_qp_offset_depth(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_chroma_qp_offset_depth(segment, 0L, value); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_chroma_qp_offset_depth(this.segment(), value); return this; }

    /// {@return `chroma_qp_offset_list_len_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_qp_offset_list_len_minus1(MemorySegment segment, long index) { return (byte) VH_chroma_qp_offset_list_len_minus1.get(segment, 0L, index); }
    /// {@return `chroma_qp_offset_list_len_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_qp_offset_list_len_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_chroma_qp_offset_list_len_minus1(segment, 0L); }
    /// {@return `chroma_qp_offset_list_len_minus1`}
    public @CType("uint8_t") byte chroma_qp_offset_list_len_minus1() { return StdVideoH265PictureParameterSet.get_chroma_qp_offset_list_len_minus1(this.segment()); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_qp_offset_list_len_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_qp_offset_list_len_minus1.set(segment, 0L, index, value); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_qp_offset_list_len_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_qp_offset_list_len_minus1(segment, 0L, value); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_qp_offset_list_len_minus1(this.segment(), value); return this; }

    /// {@return `cb_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_cb_qp_offset_list(MemorySegment segment, long index) { return (byte) VH_cb_qp_offset_list.get(segment, 0L, index); }
    /// {@return `cb_qp_offset_list`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_cb_qp_offset_list(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_cb_qp_offset_list(segment, 0L); }
    /// {@return `cb_qp_offset_list`}
    public @CType("int8_t [ ]") byte cb_qp_offset_list() { return StdVideoH265PictureParameterSet.get_cb_qp_offset_list(this.segment()); }
    /// Sets `cb_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cb_qp_offset_list(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_cb_qp_offset_list.set(segment, 0L, index, value); }
    /// Sets `cb_qp_offset_list` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cb_qp_offset_list(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cb_qp_offset_list(segment, 0L, value); }
    /// Sets `cb_qp_offset_list` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cb_qp_offset_list(@CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cb_qp_offset_list(this.segment(), value); return this; }

    /// {@return `cr_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_cr_qp_offset_list(MemorySegment segment, long index) { return (byte) VH_cr_qp_offset_list.get(segment, 0L, index); }
    /// {@return `cr_qp_offset_list`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_cr_qp_offset_list(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_cr_qp_offset_list(segment, 0L); }
    /// {@return `cr_qp_offset_list`}
    public @CType("int8_t [ ]") byte cr_qp_offset_list() { return StdVideoH265PictureParameterSet.get_cr_qp_offset_list(this.segment()); }
    /// Sets `cr_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cr_qp_offset_list(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_cr_qp_offset_list.set(segment, 0L, index, value); }
    /// Sets `cr_qp_offset_list` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cr_qp_offset_list(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cr_qp_offset_list(segment, 0L, value); }
    /// Sets `cr_qp_offset_list` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cr_qp_offset_list(@CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cr_qp_offset_list(this.segment(), value); return this; }

    /// {@return `log2_sao_offset_scale_luma` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_sao_offset_scale_luma(MemorySegment segment, long index) { return (byte) VH_log2_sao_offset_scale_luma.get(segment, 0L, index); }
    /// {@return `log2_sao_offset_scale_luma`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_sao_offset_scale_luma(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_luma(segment, 0L); }
    /// {@return `log2_sao_offset_scale_luma`}
    public @CType("uint8_t") byte log2_sao_offset_scale_luma() { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_luma(this.segment()); }
    /// Sets `log2_sao_offset_scale_luma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_sao_offset_scale_luma(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_sao_offset_scale_luma.set(segment, 0L, index, value); }
    /// Sets `log2_sao_offset_scale_luma` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_sao_offset_scale_luma(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_luma(segment, 0L, value); }
    /// Sets `log2_sao_offset_scale_luma` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_luma(this.segment(), value); return this; }

    /// {@return `log2_sao_offset_scale_chroma` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_sao_offset_scale_chroma(MemorySegment segment, long index) { return (byte) VH_log2_sao_offset_scale_chroma.get(segment, 0L, index); }
    /// {@return `log2_sao_offset_scale_chroma`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_sao_offset_scale_chroma(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_chroma(segment, 0L); }
    /// {@return `log2_sao_offset_scale_chroma`}
    public @CType("uint8_t") byte log2_sao_offset_scale_chroma() { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_chroma(this.segment()); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_sao_offset_scale_chroma(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_sao_offset_scale_chroma.set(segment, 0L, index, value); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_sao_offset_scale_chroma(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_chroma(segment, 0L, value); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_chroma(this.segment(), value); return this; }

    /// {@return `pps_act_y_qp_offset_plus5` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_act_y_qp_offset_plus5(MemorySegment segment, long index) { return (byte) VH_pps_act_y_qp_offset_plus5.get(segment, 0L, index); }
    /// {@return `pps_act_y_qp_offset_plus5`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_act_y_qp_offset_plus5(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_act_y_qp_offset_plus5(segment, 0L); }
    /// {@return `pps_act_y_qp_offset_plus5`}
    public @CType("int8_t") byte pps_act_y_qp_offset_plus5() { return StdVideoH265PictureParameterSet.get_pps_act_y_qp_offset_plus5(this.segment()); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_act_y_qp_offset_plus5(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_act_y_qp_offset_plus5.set(segment, 0L, index, value); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_act_y_qp_offset_plus5(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_y_qp_offset_plus5(segment, 0L, value); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_y_qp_offset_plus5(this.segment(), value); return this; }

    /// {@return `pps_act_cb_qp_offset_plus5` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_act_cb_qp_offset_plus5(MemorySegment segment, long index) { return (byte) VH_pps_act_cb_qp_offset_plus5.get(segment, 0L, index); }
    /// {@return `pps_act_cb_qp_offset_plus5`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_act_cb_qp_offset_plus5(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_act_cb_qp_offset_plus5(segment, 0L); }
    /// {@return `pps_act_cb_qp_offset_plus5`}
    public @CType("int8_t") byte pps_act_cb_qp_offset_plus5() { return StdVideoH265PictureParameterSet.get_pps_act_cb_qp_offset_plus5(this.segment()); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_act_cb_qp_offset_plus5(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_act_cb_qp_offset_plus5.set(segment, 0L, index, value); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_act_cb_qp_offset_plus5(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cb_qp_offset_plus5(segment, 0L, value); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cb_qp_offset_plus5(this.segment(), value); return this; }

    /// {@return `pps_act_cr_qp_offset_plus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pps_act_cr_qp_offset_plus3(MemorySegment segment, long index) { return (byte) VH_pps_act_cr_qp_offset_plus3.get(segment, 0L, index); }
    /// {@return `pps_act_cr_qp_offset_plus3`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pps_act_cr_qp_offset_plus3(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_act_cr_qp_offset_plus3(segment, 0L); }
    /// {@return `pps_act_cr_qp_offset_plus3`}
    public @CType("int8_t") byte pps_act_cr_qp_offset_plus3() { return StdVideoH265PictureParameterSet.get_pps_act_cr_qp_offset_plus3(this.segment()); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_act_cr_qp_offset_plus3(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pps_act_cr_qp_offset_plus3.set(segment, 0L, index, value); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_act_cr_qp_offset_plus3(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cr_qp_offset_plus3(segment, 0L, value); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3(@CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cr_qp_offset_plus3(this.segment(), value); return this; }

    /// {@return `pps_num_palette_predictor_initializers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pps_num_palette_predictor_initializers(MemorySegment segment, long index) { return (byte) VH_pps_num_palette_predictor_initializers.get(segment, 0L, index); }
    /// {@return `pps_num_palette_predictor_initializers`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pps_num_palette_predictor_initializers(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pps_num_palette_predictor_initializers(segment, 0L); }
    /// {@return `pps_num_palette_predictor_initializers`}
    public @CType("uint8_t") byte pps_num_palette_predictor_initializers() { return StdVideoH265PictureParameterSet.get_pps_num_palette_predictor_initializers(this.segment()); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pps_num_palette_predictor_initializers(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pps_num_palette_predictor_initializers.set(segment, 0L, index, value); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pps_num_palette_predictor_initializers(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_num_palette_predictor_initializers(segment, 0L, value); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializers(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_num_palette_predictor_initializers(this.segment(), value); return this; }

    /// {@return `luma_bit_depth_entry_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_luma_bit_depth_entry_minus8(MemorySegment segment, long index) { return (byte) VH_luma_bit_depth_entry_minus8.get(segment, 0L, index); }
    /// {@return `luma_bit_depth_entry_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_luma_bit_depth_entry_minus8(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_luma_bit_depth_entry_minus8(segment, 0L); }
    /// {@return `luma_bit_depth_entry_minus8`}
    public @CType("uint8_t") byte luma_bit_depth_entry_minus8() { return StdVideoH265PictureParameterSet.get_luma_bit_depth_entry_minus8(this.segment()); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_luma_bit_depth_entry_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_luma_bit_depth_entry_minus8.set(segment, 0L, index, value); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_luma_bit_depth_entry_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_luma_bit_depth_entry_minus8(segment, 0L, value); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_luma_bit_depth_entry_minus8(this.segment(), value); return this; }

    /// {@return `chroma_bit_depth_entry_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_bit_depth_entry_minus8(MemorySegment segment, long index) { return (byte) VH_chroma_bit_depth_entry_minus8.get(segment, 0L, index); }
    /// {@return `chroma_bit_depth_entry_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_bit_depth_entry_minus8(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_chroma_bit_depth_entry_minus8(segment, 0L); }
    /// {@return `chroma_bit_depth_entry_minus8`}
    public @CType("uint8_t") byte chroma_bit_depth_entry_minus8() { return StdVideoH265PictureParameterSet.get_chroma_bit_depth_entry_minus8(this.segment()); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_bit_depth_entry_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_bit_depth_entry_minus8.set(segment, 0L, index, value); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_bit_depth_entry_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_bit_depth_entry_minus8(segment, 0L, value); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_bit_depth_entry_minus8(this.segment(), value); return this; }

    /// {@return `num_tile_columns_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_tile_columns_minus1(MemorySegment segment, long index) { return (byte) VH_num_tile_columns_minus1.get(segment, 0L, index); }
    /// {@return `num_tile_columns_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_tile_columns_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_num_tile_columns_minus1(segment, 0L); }
    /// {@return `num_tile_columns_minus1`}
    public @CType("uint8_t") byte num_tile_columns_minus1() { return StdVideoH265PictureParameterSet.get_num_tile_columns_minus1(this.segment()); }
    /// Sets `num_tile_columns_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_tile_columns_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_tile_columns_minus1.set(segment, 0L, index, value); }
    /// Sets `num_tile_columns_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_tile_columns_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_columns_minus1(segment, 0L, value); }
    /// Sets `num_tile_columns_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_columns_minus1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_columns_minus1(this.segment(), value); return this; }

    /// {@return `num_tile_rows_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_tile_rows_minus1(MemorySegment segment, long index) { return (byte) VH_num_tile_rows_minus1.get(segment, 0L, index); }
    /// {@return `num_tile_rows_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_tile_rows_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_num_tile_rows_minus1(segment, 0L); }
    /// {@return `num_tile_rows_minus1`}
    public @CType("uint8_t") byte num_tile_rows_minus1() { return StdVideoH265PictureParameterSet.get_num_tile_rows_minus1(this.segment()); }
    /// Sets `num_tile_rows_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_tile_rows_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_tile_rows_minus1.set(segment, 0L, index, value); }
    /// Sets `num_tile_rows_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_tile_rows_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_rows_minus1(segment, 0L, value); }
    /// Sets `num_tile_rows_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_rows_minus1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_rows_minus1(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH265PictureParameterSet.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved1(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoH265PictureParameterSet.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved2(@CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved2(this.segment(), value); return this; }

    /// {@return `column_width_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_column_width_minus1(MemorySegment segment, long index) { return (short) VH_column_width_minus1.get(segment, 0L, index); }
    /// {@return `column_width_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_column_width_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_column_width_minus1(segment, 0L); }
    /// {@return `column_width_minus1`}
    public @CType("uint16_t [ ]") short column_width_minus1() { return StdVideoH265PictureParameterSet.get_column_width_minus1(this.segment()); }
    /// Sets `column_width_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_column_width_minus1(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_column_width_minus1.set(segment, 0L, index, value); }
    /// Sets `column_width_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_column_width_minus1(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_column_width_minus1(segment, 0L, value); }
    /// Sets `column_width_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet column_width_minus1(@CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_column_width_minus1(this.segment(), value); return this; }

    /// {@return `row_height_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_row_height_minus1(MemorySegment segment, long index) { return (short) VH_row_height_minus1.get(segment, 0L, index); }
    /// {@return `row_height_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_row_height_minus1(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_row_height_minus1(segment, 0L); }
    /// {@return `row_height_minus1`}
    public @CType("uint16_t [ ]") short row_height_minus1() { return StdVideoH265PictureParameterSet.get_row_height_minus1(this.segment()); }
    /// Sets `row_height_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_row_height_minus1(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_row_height_minus1.set(segment, 0L, index, value); }
    /// Sets `row_height_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_row_height_minus1(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_row_height_minus1(segment, 0L, value); }
    /// Sets `row_height_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet row_height_minus1(@CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_row_height_minus1(this.segment(), value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_reserved3(MemorySegment segment, long index) { return (int) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_reserved3(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_reserved3(segment, 0L); }
    /// {@return `reserved3`}
    public @CType("uint32_t") int reserved3() { return StdVideoH265PictureParameterSet.get_reserved3(this.segment()); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265PictureParameterSet.set_reserved3(segment, 0L, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved3(@CType("uint32_t") int value) { StdVideoH265PictureParameterSet.set_reserved3(this.segment(), value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pScalingLists(segment, 0L); }
    /// {@return `pScalingLists`}
    public @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingLists() { return StdVideoH265PictureParameterSet.get_pScalingLists(this.segment()); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, long index, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pScalingLists(segment, 0L, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pScalingLists(@CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pScalingLists(this.segment(), value); return this; }

    /// {@return `pPredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment get_pPredictorPaletteEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pPredictorPaletteEntries.get(segment, 0L, index); }
    /// {@return `pPredictorPaletteEntries`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment get_pPredictorPaletteEntries(MemorySegment segment) { return StdVideoH265PictureParameterSet.get_pPredictorPaletteEntries(segment, 0L); }
    /// {@return `pPredictorPaletteEntries`}
    public @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntries() { return StdVideoH265PictureParameterSet.get_pPredictorPaletteEntries(this.segment()); }
    /// Sets `pPredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPredictorPaletteEntries(MemorySegment segment, long index, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { VH_pPredictorPaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pPredictorPaletteEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPredictorPaletteEntries(MemorySegment segment, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pPredictorPaletteEntries(segment, 0L, value); }
    /// Sets `pPredictorPaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pPredictorPaletteEntries(@CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pPredictorPaletteEntries(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265PictureParameterSet].
    public static final class Buffer extends StdVideoH265PictureParameterSet {
        private final long elementCount;

        /// Creates `StdVideoH265PictureParameterSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265PictureParameterSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265PictureParameterSet`
        public StdVideoH265PictureParameterSet asSlice(long index) { return new StdVideoH265PictureParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265PictureParameterSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265PictureParameterSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH265PpsFlags") MemorySegment flagsAt(long index) { return StdVideoH265PictureParameterSet.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265PpsFlags") MemorySegment value) { StdVideoH265PictureParameterSet.set_flags(this.segment(), index, value); return this; }

        /// {@return `pps_pic_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pps_pic_parameter_set_idAt(long index) { return StdVideoH265PictureParameterSet.get_pps_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pps_seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pps_seq_parameter_set_idAt(long index) { return StdVideoH265PictureParameterSet.get_pps_seq_parameter_set_id(this.segment(), index); }
        /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `sps_video_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_video_parameter_set_idAt(long index) { return StdVideoH265PictureParameterSet.get_sps_video_parameter_set_id(this.segment(), index); }
        /// Sets `sps_video_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_video_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_sps_video_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `num_extra_slice_header_bits` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_extra_slice_header_bitsAt(long index) { return StdVideoH265PictureParameterSet.get_num_extra_slice_header_bits(this.segment(), index); }
        /// Sets `num_extra_slice_header_bits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_extra_slice_header_bitsAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_extra_slice_header_bits(this.segment(), index, value); return this; }

        /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1At(long index) { return StdVideoH265PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l0_default_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1At(long index) { return StdVideoH265PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l1_default_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `init_qp_minus26` at the given index}
        /// @param index the index
        public @CType("int8_t") byte init_qp_minus26At(long index) { return StdVideoH265PictureParameterSet.get_init_qp_minus26(this.segment(), index); }
        /// Sets `init_qp_minus26` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer init_qp_minus26At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_init_qp_minus26(this.segment(), index, value); return this; }

        /// {@return `diff_cu_qp_delta_depth` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte diff_cu_qp_delta_depthAt(long index) { return StdVideoH265PictureParameterSet.get_diff_cu_qp_delta_depth(this.segment(), index); }
        /// Sets `diff_cu_qp_delta_depth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer diff_cu_qp_delta_depthAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_qp_delta_depth(this.segment(), index, value); return this; }

        /// {@return `pps_cb_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_cb_qp_offsetAt(long index) { return StdVideoH265PictureParameterSet.get_pps_cb_qp_offset(this.segment(), index); }
        /// Sets `pps_cb_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_cb_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cb_qp_offset(this.segment(), index, value); return this; }

        /// {@return `pps_cr_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_cr_qp_offsetAt(long index) { return StdVideoH265PictureParameterSet.get_pps_cr_qp_offset(this.segment(), index); }
        /// Sets `pps_cr_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_cr_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_cr_qp_offset(this.segment(), index, value); return this; }

        /// {@return `pps_beta_offset_div2` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_beta_offset_div2At(long index) { return StdVideoH265PictureParameterSet.get_pps_beta_offset_div2(this.segment(), index); }
        /// Sets `pps_beta_offset_div2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_beta_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_beta_offset_div2(this.segment(), index, value); return this; }

        /// {@return `pps_tc_offset_div2` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_tc_offset_div2At(long index) { return StdVideoH265PictureParameterSet.get_pps_tc_offset_div2(this.segment(), index); }
        /// Sets `pps_tc_offset_div2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_tc_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_tc_offset_div2(this.segment(), index, value); return this; }

        /// {@return `log2_parallel_merge_level_minus2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_parallel_merge_level_minus2At(long index) { return StdVideoH265PictureParameterSet.get_log2_parallel_merge_level_minus2(this.segment(), index); }
        /// Sets `log2_parallel_merge_level_minus2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_parallel_merge_level_minus2At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_parallel_merge_level_minus2(this.segment(), index, value); return this; }

        /// {@return `log2_max_transform_skip_block_size_minus2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_max_transform_skip_block_size_minus2At(long index) { return StdVideoH265PictureParameterSet.get_log2_max_transform_skip_block_size_minus2(this.segment(), index); }
        /// Sets `log2_max_transform_skip_block_size_minus2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_transform_skip_block_size_minus2At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_max_transform_skip_block_size_minus2(this.segment(), index, value); return this; }

        /// {@return `diff_cu_chroma_qp_offset_depth` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte diff_cu_chroma_qp_offset_depthAt(long index) { return StdVideoH265PictureParameterSet.get_diff_cu_chroma_qp_offset_depth(this.segment(), index); }
        /// Sets `diff_cu_chroma_qp_offset_depth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer diff_cu_chroma_qp_offset_depthAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_diff_cu_chroma_qp_offset_depth(this.segment(), index, value); return this; }

        /// {@return `chroma_qp_offset_list_len_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_qp_offset_list_len_minus1At(long index) { return StdVideoH265PictureParameterSet.get_chroma_qp_offset_list_len_minus1(this.segment(), index); }
        /// Sets `chroma_qp_offset_list_len_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_qp_offset_list_len_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_qp_offset_list_len_minus1(this.segment(), index, value); return this; }

        /// {@return `cb_qp_offset_list` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte cb_qp_offset_listAt(long index) { return StdVideoH265PictureParameterSet.get_cb_qp_offset_list(this.segment(), index); }
        /// Sets `cb_qp_offset_list` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cb_qp_offset_listAt(long index, @CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cb_qp_offset_list(this.segment(), index, value); return this; }

        /// {@return `cr_qp_offset_list` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte cr_qp_offset_listAt(long index) { return StdVideoH265PictureParameterSet.get_cr_qp_offset_list(this.segment(), index); }
        /// Sets `cr_qp_offset_list` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cr_qp_offset_listAt(long index, @CType("int8_t [ ]") byte value) { StdVideoH265PictureParameterSet.set_cr_qp_offset_list(this.segment(), index, value); return this; }

        /// {@return `log2_sao_offset_scale_luma` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_sao_offset_scale_lumaAt(long index) { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_luma(this.segment(), index); }
        /// Sets `log2_sao_offset_scale_luma` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_sao_offset_scale_lumaAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_luma(this.segment(), index, value); return this; }

        /// {@return `log2_sao_offset_scale_chroma` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_sao_offset_scale_chromaAt(long index) { return StdVideoH265PictureParameterSet.get_log2_sao_offset_scale_chroma(this.segment(), index); }
        /// Sets `log2_sao_offset_scale_chroma` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_sao_offset_scale_chromaAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_log2_sao_offset_scale_chroma(this.segment(), index, value); return this; }

        /// {@return `pps_act_y_qp_offset_plus5` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_act_y_qp_offset_plus5At(long index) { return StdVideoH265PictureParameterSet.get_pps_act_y_qp_offset_plus5(this.segment(), index); }
        /// Sets `pps_act_y_qp_offset_plus5` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_act_y_qp_offset_plus5At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_y_qp_offset_plus5(this.segment(), index, value); return this; }

        /// {@return `pps_act_cb_qp_offset_plus5` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_act_cb_qp_offset_plus5At(long index) { return StdVideoH265PictureParameterSet.get_pps_act_cb_qp_offset_plus5(this.segment(), index); }
        /// Sets `pps_act_cb_qp_offset_plus5` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_act_cb_qp_offset_plus5At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cb_qp_offset_plus5(this.segment(), index, value); return this; }

        /// {@return `pps_act_cr_qp_offset_plus3` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pps_act_cr_qp_offset_plus3At(long index) { return StdVideoH265PictureParameterSet.get_pps_act_cr_qp_offset_plus3(this.segment(), index); }
        /// Sets `pps_act_cr_qp_offset_plus3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_act_cr_qp_offset_plus3At(long index, @CType("int8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_act_cr_qp_offset_plus3(this.segment(), index, value); return this; }

        /// {@return `pps_num_palette_predictor_initializers` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pps_num_palette_predictor_initializersAt(long index) { return StdVideoH265PictureParameterSet.get_pps_num_palette_predictor_initializers(this.segment(), index); }
        /// Sets `pps_num_palette_predictor_initializers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pps_num_palette_predictor_initializersAt(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_pps_num_palette_predictor_initializers(this.segment(), index, value); return this; }

        /// {@return `luma_bit_depth_entry_minus8` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte luma_bit_depth_entry_minus8At(long index) { return StdVideoH265PictureParameterSet.get_luma_bit_depth_entry_minus8(this.segment(), index); }
        /// Sets `luma_bit_depth_entry_minus8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer luma_bit_depth_entry_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_luma_bit_depth_entry_minus8(this.segment(), index, value); return this; }

        /// {@return `chroma_bit_depth_entry_minus8` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_bit_depth_entry_minus8At(long index) { return StdVideoH265PictureParameterSet.get_chroma_bit_depth_entry_minus8(this.segment(), index); }
        /// Sets `chroma_bit_depth_entry_minus8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_bit_depth_entry_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_chroma_bit_depth_entry_minus8(this.segment(), index, value); return this; }

        /// {@return `num_tile_columns_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_tile_columns_minus1At(long index) { return StdVideoH265PictureParameterSet.get_num_tile_columns_minus1(this.segment(), index); }
        /// Sets `num_tile_columns_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_tile_columns_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_columns_minus1(this.segment(), index, value); return this; }

        /// {@return `num_tile_rows_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_tile_rows_minus1At(long index) { return StdVideoH265PictureParameterSet.get_num_tile_rows_minus1(this.segment(), index); }
        /// Sets `num_tile_rows_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_tile_rows_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_num_tile_rows_minus1(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH265PictureParameterSet.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved2At(long index) { return StdVideoH265PictureParameterSet.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t") byte value) { StdVideoH265PictureParameterSet.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `column_width_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short column_width_minus1At(long index) { return StdVideoH265PictureParameterSet.get_column_width_minus1(this.segment(), index); }
        /// Sets `column_width_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer column_width_minus1At(long index, @CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_column_width_minus1(this.segment(), index, value); return this; }

        /// {@return `row_height_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short row_height_minus1At(long index) { return StdVideoH265PictureParameterSet.get_row_height_minus1(this.segment(), index); }
        /// Sets `row_height_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer row_height_minus1At(long index, @CType("uint16_t [ ]") short value) { StdVideoH265PictureParameterSet.set_row_height_minus1(this.segment(), index, value); return this; }

        /// {@return `reserved3` at the given index}
        /// @param index the index
        public @CType("uint32_t") int reserved3At(long index) { return StdVideoH265PictureParameterSet.get_reserved3(this.segment(), index); }
        /// Sets `reserved3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved3At(long index, @CType("uint32_t") int value) { StdVideoH265PictureParameterSet.set_reserved3(this.segment(), index, value); return this; }

        /// {@return `pScalingLists` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingListsAt(long index) { return StdVideoH265PictureParameterSet.get_pScalingLists(this.segment(), index); }
        /// Sets `pScalingLists` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pScalingListsAt(long index, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pScalingLists(this.segment(), index, value); return this; }

        /// {@return `pPredictorPaletteEntries` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntriesAt(long index) { return StdVideoH265PictureParameterSet.get_pPredictorPaletteEntries(this.segment(), index); }
        /// Sets `pPredictorPaletteEntries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPredictorPaletteEntriesAt(long index, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265PictureParameterSet.set_pPredictorPaletteEntries(this.segment(), index, value); return this; }

    }
}
