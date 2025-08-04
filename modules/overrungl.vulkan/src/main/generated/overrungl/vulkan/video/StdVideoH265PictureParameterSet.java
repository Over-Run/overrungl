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
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH265PictureParameterSet {
///     (struct StdVideoH265PpsFlags) StdVideoH265PpsFlags flags;
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
///     int8_t cb_qp_offset_list[6];
///     int8_t cr_qp_offset_list[6];
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
///     uint16_t column_width_minus1[19];
///     uint16_t row_height_minus1[21];
///     uint32_t reserved3;
///     const StdVideoH265ScalingLists* pScalingLists;
///     const StdVideoH265PredictorPaletteEntries* pPredictorPaletteEntries;
/// };
/// ```
public final class StdVideoH265PictureParameterSet extends GroupType {
    /// The struct layout of `StdVideoH265PictureParameterSet`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265PpsFlags.LAYOUT.withName("flags"),
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
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE).withName("cb_qp_offset_list"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE).withName("cr_qp_offset_list"),
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
        MemoryLayout.sequenceLayout(19, ValueLayout.JAVA_SHORT).withName("column_width_minus1"),
        MemoryLayout.sequenceLayout(21, ValueLayout.JAVA_SHORT).withName("row_height_minus1"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.ADDRESS.withName("pScalingLists"),
        ValueLayout.ADDRESS.withName("pPredictorPaletteEntries")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `pps_pic_parameter_set_id`.
    public static final long OFFSET_pps_pic_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The memory layout of `pps_pic_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pps_pic_parameter_set_id = LAYOUT.select(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The [VarHandle] of `pps_pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The byte offset of `pps_seq_parameter_set_id`.
    public static final long OFFSET_pps_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The memory layout of `pps_seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pps_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The [VarHandle] of `pps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The byte offset of `sps_video_parameter_set_id`.
    public static final long OFFSET_sps_video_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The memory layout of `sps_video_parameter_set_id`.
    public static final MemoryLayout LAYOUT_sps_video_parameter_set_id = LAYOUT.select(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The byte offset of `num_extra_slice_header_bits`.
    public static final long OFFSET_num_extra_slice_header_bits = LAYOUT.byteOffset(PathElement.groupElement("num_extra_slice_header_bits"));
    /// The memory layout of `num_extra_slice_header_bits`.
    public static final MemoryLayout LAYOUT_num_extra_slice_header_bits = LAYOUT.select(PathElement.groupElement("num_extra_slice_header_bits"));
    /// The [VarHandle] of `num_extra_slice_header_bits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_extra_slice_header_bits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_extra_slice_header_bits"));
    /// The byte offset of `num_ref_idx_l0_default_active_minus1`.
    public static final long OFFSET_num_ref_idx_l0_default_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The memory layout of `num_ref_idx_l0_default_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l0_default_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l0_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l0_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The byte offset of `num_ref_idx_l1_default_active_minus1`.
    public static final long OFFSET_num_ref_idx_l1_default_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The memory layout of `num_ref_idx_l1_default_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l1_default_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l1_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The byte offset of `init_qp_minus26`.
    public static final long OFFSET_init_qp_minus26 = LAYOUT.byteOffset(PathElement.groupElement("init_qp_minus26"));
    /// The memory layout of `init_qp_minus26`.
    public static final MemoryLayout LAYOUT_init_qp_minus26 = LAYOUT.select(PathElement.groupElement("init_qp_minus26"));
    /// The [VarHandle] of `init_qp_minus26` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_init_qp_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("init_qp_minus26"));
    /// The byte offset of `diff_cu_qp_delta_depth`.
    public static final long OFFSET_diff_cu_qp_delta_depth = LAYOUT.byteOffset(PathElement.groupElement("diff_cu_qp_delta_depth"));
    /// The memory layout of `diff_cu_qp_delta_depth`.
    public static final MemoryLayout LAYOUT_diff_cu_qp_delta_depth = LAYOUT.select(PathElement.groupElement("diff_cu_qp_delta_depth"));
    /// The [VarHandle] of `diff_cu_qp_delta_depth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_diff_cu_qp_delta_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diff_cu_qp_delta_depth"));
    /// The byte offset of `pps_cb_qp_offset`.
    public static final long OFFSET_pps_cb_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("pps_cb_qp_offset"));
    /// The memory layout of `pps_cb_qp_offset`.
    public static final MemoryLayout LAYOUT_pps_cb_qp_offset = LAYOUT.select(PathElement.groupElement("pps_cb_qp_offset"));
    /// The [VarHandle] of `pps_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_cb_qp_offset"));
    /// The byte offset of `pps_cr_qp_offset`.
    public static final long OFFSET_pps_cr_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("pps_cr_qp_offset"));
    /// The memory layout of `pps_cr_qp_offset`.
    public static final MemoryLayout LAYOUT_pps_cr_qp_offset = LAYOUT.select(PathElement.groupElement("pps_cr_qp_offset"));
    /// The [VarHandle] of `pps_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_cr_qp_offset"));
    /// The byte offset of `pps_beta_offset_div2`.
    public static final long OFFSET_pps_beta_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("pps_beta_offset_div2"));
    /// The memory layout of `pps_beta_offset_div2`.
    public static final MemoryLayout LAYOUT_pps_beta_offset_div2 = LAYOUT.select(PathElement.groupElement("pps_beta_offset_div2"));
    /// The [VarHandle] of `pps_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_beta_offset_div2"));
    /// The byte offset of `pps_tc_offset_div2`.
    public static final long OFFSET_pps_tc_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("pps_tc_offset_div2"));
    /// The memory layout of `pps_tc_offset_div2`.
    public static final MemoryLayout LAYOUT_pps_tc_offset_div2 = LAYOUT.select(PathElement.groupElement("pps_tc_offset_div2"));
    /// The [VarHandle] of `pps_tc_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_tc_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_tc_offset_div2"));
    /// The byte offset of `log2_parallel_merge_level_minus2`.
    public static final long OFFSET_log2_parallel_merge_level_minus2 = LAYOUT.byteOffset(PathElement.groupElement("log2_parallel_merge_level_minus2"));
    /// The memory layout of `log2_parallel_merge_level_minus2`.
    public static final MemoryLayout LAYOUT_log2_parallel_merge_level_minus2 = LAYOUT.select(PathElement.groupElement("log2_parallel_merge_level_minus2"));
    /// The [VarHandle] of `log2_parallel_merge_level_minus2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_parallel_merge_level_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_parallel_merge_level_minus2"));
    /// The byte offset of `log2_max_transform_skip_block_size_minus2`.
    public static final long OFFSET_log2_max_transform_skip_block_size_minus2 = LAYOUT.byteOffset(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
    /// The memory layout of `log2_max_transform_skip_block_size_minus2`.
    public static final MemoryLayout LAYOUT_log2_max_transform_skip_block_size_minus2 = LAYOUT.select(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
    /// The [VarHandle] of `log2_max_transform_skip_block_size_minus2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_transform_skip_block_size_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
    /// The byte offset of `diff_cu_chroma_qp_offset_depth`.
    public static final long OFFSET_diff_cu_chroma_qp_offset_depth = LAYOUT.byteOffset(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
    /// The memory layout of `diff_cu_chroma_qp_offset_depth`.
    public static final MemoryLayout LAYOUT_diff_cu_chroma_qp_offset_depth = LAYOUT.select(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
    /// The [VarHandle] of `diff_cu_chroma_qp_offset_depth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_diff_cu_chroma_qp_offset_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
    /// The byte offset of `chroma_qp_offset_list_len_minus1`.
    public static final long OFFSET_chroma_qp_offset_list_len_minus1 = LAYOUT.byteOffset(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
    /// The memory layout of `chroma_qp_offset_list_len_minus1`.
    public static final MemoryLayout LAYOUT_chroma_qp_offset_list_len_minus1 = LAYOUT.select(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
    /// The [VarHandle] of `chroma_qp_offset_list_len_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_qp_offset_list_len_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
    /// The byte offset of `cb_qp_offset_list`.
    public static final long OFFSET_cb_qp_offset_list = LAYOUT.byteOffset(PathElement.groupElement("cb_qp_offset_list"));
    /// The memory layout of `cb_qp_offset_list`.
    public static final MemoryLayout LAYOUT_cb_qp_offset_list = LAYOUT.select(PathElement.groupElement("cb_qp_offset_list"));
    /// The [VarHandle] of `cb_qp_offset_list` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cb_qp_offset_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_qp_offset_list"), PathElement.sequenceElement());
    /// The byte offset of `cr_qp_offset_list`.
    public static final long OFFSET_cr_qp_offset_list = LAYOUT.byteOffset(PathElement.groupElement("cr_qp_offset_list"));
    /// The memory layout of `cr_qp_offset_list`.
    public static final MemoryLayout LAYOUT_cr_qp_offset_list = LAYOUT.select(PathElement.groupElement("cr_qp_offset_list"));
    /// The [VarHandle] of `cr_qp_offset_list` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cr_qp_offset_list = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_qp_offset_list"), PathElement.sequenceElement());
    /// The byte offset of `log2_sao_offset_scale_luma`.
    public static final long OFFSET_log2_sao_offset_scale_luma = LAYOUT.byteOffset(PathElement.groupElement("log2_sao_offset_scale_luma"));
    /// The memory layout of `log2_sao_offset_scale_luma`.
    public static final MemoryLayout LAYOUT_log2_sao_offset_scale_luma = LAYOUT.select(PathElement.groupElement("log2_sao_offset_scale_luma"));
    /// The [VarHandle] of `log2_sao_offset_scale_luma` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_sao_offset_scale_luma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_sao_offset_scale_luma"));
    /// The byte offset of `log2_sao_offset_scale_chroma`.
    public static final long OFFSET_log2_sao_offset_scale_chroma = LAYOUT.byteOffset(PathElement.groupElement("log2_sao_offset_scale_chroma"));
    /// The memory layout of `log2_sao_offset_scale_chroma`.
    public static final MemoryLayout LAYOUT_log2_sao_offset_scale_chroma = LAYOUT.select(PathElement.groupElement("log2_sao_offset_scale_chroma"));
    /// The [VarHandle] of `log2_sao_offset_scale_chroma` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_sao_offset_scale_chroma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_sao_offset_scale_chroma"));
    /// The byte offset of `pps_act_y_qp_offset_plus5`.
    public static final long OFFSET_pps_act_y_qp_offset_plus5 = LAYOUT.byteOffset(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
    /// The memory layout of `pps_act_y_qp_offset_plus5`.
    public static final MemoryLayout LAYOUT_pps_act_y_qp_offset_plus5 = LAYOUT.select(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
    /// The [VarHandle] of `pps_act_y_qp_offset_plus5` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_act_y_qp_offset_plus5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
    /// The byte offset of `pps_act_cb_qp_offset_plus5`.
    public static final long OFFSET_pps_act_cb_qp_offset_plus5 = LAYOUT.byteOffset(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
    /// The memory layout of `pps_act_cb_qp_offset_plus5`.
    public static final MemoryLayout LAYOUT_pps_act_cb_qp_offset_plus5 = LAYOUT.select(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
    /// The [VarHandle] of `pps_act_cb_qp_offset_plus5` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_act_cb_qp_offset_plus5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
    /// The byte offset of `pps_act_cr_qp_offset_plus3`.
    public static final long OFFSET_pps_act_cr_qp_offset_plus3 = LAYOUT.byteOffset(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
    /// The memory layout of `pps_act_cr_qp_offset_plus3`.
    public static final MemoryLayout LAYOUT_pps_act_cr_qp_offset_plus3 = LAYOUT.select(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
    /// The [VarHandle] of `pps_act_cr_qp_offset_plus3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_act_cr_qp_offset_plus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
    /// The byte offset of `pps_num_palette_predictor_initializers`.
    public static final long OFFSET_pps_num_palette_predictor_initializers = LAYOUT.byteOffset(PathElement.groupElement("pps_num_palette_predictor_initializers"));
    /// The memory layout of `pps_num_palette_predictor_initializers`.
    public static final MemoryLayout LAYOUT_pps_num_palette_predictor_initializers = LAYOUT.select(PathElement.groupElement("pps_num_palette_predictor_initializers"));
    /// The [VarHandle] of `pps_num_palette_predictor_initializers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_num_palette_predictor_initializers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_num_palette_predictor_initializers"));
    /// The byte offset of `luma_bit_depth_entry_minus8`.
    public static final long OFFSET_luma_bit_depth_entry_minus8 = LAYOUT.byteOffset(PathElement.groupElement("luma_bit_depth_entry_minus8"));
    /// The memory layout of `luma_bit_depth_entry_minus8`.
    public static final MemoryLayout LAYOUT_luma_bit_depth_entry_minus8 = LAYOUT.select(PathElement.groupElement("luma_bit_depth_entry_minus8"));
    /// The [VarHandle] of `luma_bit_depth_entry_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_luma_bit_depth_entry_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_bit_depth_entry_minus8"));
    /// The byte offset of `chroma_bit_depth_entry_minus8`.
    public static final long OFFSET_chroma_bit_depth_entry_minus8 = LAYOUT.byteOffset(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
    /// The memory layout of `chroma_bit_depth_entry_minus8`.
    public static final MemoryLayout LAYOUT_chroma_bit_depth_entry_minus8 = LAYOUT.select(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
    /// The [VarHandle] of `chroma_bit_depth_entry_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_bit_depth_entry_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
    /// The byte offset of `num_tile_columns_minus1`.
    public static final long OFFSET_num_tile_columns_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_tile_columns_minus1"));
    /// The memory layout of `num_tile_columns_minus1`.
    public static final MemoryLayout LAYOUT_num_tile_columns_minus1 = LAYOUT.select(PathElement.groupElement("num_tile_columns_minus1"));
    /// The [VarHandle] of `num_tile_columns_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_tile_columns_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_tile_columns_minus1"));
    /// The byte offset of `num_tile_rows_minus1`.
    public static final long OFFSET_num_tile_rows_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_tile_rows_minus1"));
    /// The memory layout of `num_tile_rows_minus1`.
    public static final MemoryLayout LAYOUT_num_tile_rows_minus1 = LAYOUT.select(PathElement.groupElement("num_tile_rows_minus1"));
    /// The [VarHandle] of `num_tile_rows_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_tile_rows_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_tile_rows_minus1"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `column_width_minus1`.
    public static final long OFFSET_column_width_minus1 = LAYOUT.byteOffset(PathElement.groupElement("column_width_minus1"));
    /// The memory layout of `column_width_minus1`.
    public static final MemoryLayout LAYOUT_column_width_minus1 = LAYOUT.select(PathElement.groupElement("column_width_minus1"));
    /// The [VarHandle] of `column_width_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_column_width_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("column_width_minus1"), PathElement.sequenceElement());
    /// The byte offset of `row_height_minus1`.
    public static final long OFFSET_row_height_minus1 = LAYOUT.byteOffset(PathElement.groupElement("row_height_minus1"));
    /// The memory layout of `row_height_minus1`.
    public static final MemoryLayout LAYOUT_row_height_minus1 = LAYOUT.select(PathElement.groupElement("row_height_minus1"));
    /// The [VarHandle] of `row_height_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_row_height_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("row_height_minus1"), PathElement.sequenceElement());
    /// The byte offset of `reserved3`.
    public static final long OFFSET_reserved3 = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
    /// The memory layout of `reserved3`.
    public static final MemoryLayout LAYOUT_reserved3 = LAYOUT.select(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The byte offset of `pScalingLists`.
    public static final long OFFSET_pScalingLists = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
    /// The memory layout of `pScalingLists`.
    public static final MemoryLayout LAYOUT_pScalingLists = LAYOUT.select(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The byte offset of `pPredictorPaletteEntries`.
    public static final long OFFSET_pPredictorPaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("pPredictorPaletteEntries"));
    /// The memory layout of `pPredictorPaletteEntries`.
    public static final MemoryLayout LAYOUT_pPredictorPaletteEntries = LAYOUT.select(PathElement.groupElement("pPredictorPaletteEntries"));
    /// The [VarHandle] of `pPredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPredictorPaletteEntries"));

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265PictureParameterSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PictureParameterSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PictureParameterSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PictureParameterSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PictureParameterSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PictureParameterSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PictureParameterSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265PictureParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PictureParameterSet`
    public static StdVideoH265PictureParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265PictureParameterSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265PictureParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PictureParameterSet`
    public static StdVideoH265PictureParameterSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH265PictureParameterSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265PictureParameterSet copyFrom(StdVideoH265PictureParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265PictureParameterSet reinterpret(long count) { return new StdVideoH265PictureParameterSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH265PictureParameterSet flags(Consumer<overrungl.vulkan.video.StdVideoH265PpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265PpsFlags.of(flags())); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_pic_parameter_set_id`}
    public byte pps_pic_parameter_set_id() { return pps_pic_parameter_set_id(this.segment(), 0L); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_pic_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pps_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_pic_parameter_set_id(byte value) { pps_pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_seq_parameter_set_id`}
    public byte pps_seq_parameter_set_id() { return pps_seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_seq_parameter_set_id(byte value) { pps_seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    public byte sps_video_parameter_set_id() { return sps_video_parameter_set_id(this.segment(), 0L); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sps_video_parameter_set_id(MemorySegment segment, long index, byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet sps_video_parameter_set_id(byte value) { sps_video_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `num_extra_slice_header_bits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_extra_slice_header_bits(MemorySegment segment, long index) { return (byte) VH_num_extra_slice_header_bits.get(segment, 0L, index); }
    /// {@return `num_extra_slice_header_bits`}
    public byte num_extra_slice_header_bits() { return num_extra_slice_header_bits(this.segment(), 0L); }
    /// Sets `num_extra_slice_header_bits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_extra_slice_header_bits(MemorySegment segment, long index, byte value) { VH_num_extra_slice_header_bits.set(segment, 0L, index, value); }
    /// Sets `num_extra_slice_header_bits` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_extra_slice_header_bits(byte value) { num_extra_slice_header_bits(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    public byte num_ref_idx_l0_default_active_minus1() { return num_ref_idx_l0_default_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l0_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(byte value) { num_ref_idx_l0_default_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    public byte num_ref_idx_l1_default_active_minus1() { return num_ref_idx_l1_default_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l1_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(byte value) { num_ref_idx_l1_default_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `init_qp_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte init_qp_minus26(MemorySegment segment, long index) { return (byte) VH_init_qp_minus26.get(segment, 0L, index); }
    /// {@return `init_qp_minus26`}
    public byte init_qp_minus26() { return init_qp_minus26(this.segment(), 0L); }
    /// Sets `init_qp_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void init_qp_minus26(MemorySegment segment, long index, byte value) { VH_init_qp_minus26.set(segment, 0L, index, value); }
    /// Sets `init_qp_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet init_qp_minus26(byte value) { init_qp_minus26(this.segment(), 0L, value); return this; }

    /// {@return `diff_cu_qp_delta_depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte diff_cu_qp_delta_depth(MemorySegment segment, long index) { return (byte) VH_diff_cu_qp_delta_depth.get(segment, 0L, index); }
    /// {@return `diff_cu_qp_delta_depth`}
    public byte diff_cu_qp_delta_depth() { return diff_cu_qp_delta_depth(this.segment(), 0L); }
    /// Sets `diff_cu_qp_delta_depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void diff_cu_qp_delta_depth(MemorySegment segment, long index, byte value) { VH_diff_cu_qp_delta_depth.set(segment, 0L, index, value); }
    /// Sets `diff_cu_qp_delta_depth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(byte value) { diff_cu_qp_delta_depth(this.segment(), 0L, value); return this; }

    /// {@return `pps_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_pps_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `pps_cb_qp_offset`}
    public byte pps_cb_qp_offset() { return pps_cb_qp_offset(this.segment(), 0L); }
    /// Sets `pps_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_cb_qp_offset(MemorySegment segment, long index, byte value) { VH_pps_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `pps_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cb_qp_offset(byte value) { pps_cb_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `pps_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_pps_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `pps_cr_qp_offset`}
    public byte pps_cr_qp_offset() { return pps_cr_qp_offset(this.segment(), 0L); }
    /// Sets `pps_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_cr_qp_offset(MemorySegment segment, long index, byte value) { VH_pps_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `pps_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cr_qp_offset(byte value) { pps_cr_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `pps_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_pps_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `pps_beta_offset_div2`}
    public byte pps_beta_offset_div2() { return pps_beta_offset_div2(this.segment(), 0L); }
    /// Sets `pps_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_beta_offset_div2(MemorySegment segment, long index, byte value) { VH_pps_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `pps_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_beta_offset_div2(byte value) { pps_beta_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `pps_tc_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_tc_offset_div2(MemorySegment segment, long index) { return (byte) VH_pps_tc_offset_div2.get(segment, 0L, index); }
    /// {@return `pps_tc_offset_div2`}
    public byte pps_tc_offset_div2() { return pps_tc_offset_div2(this.segment(), 0L); }
    /// Sets `pps_tc_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_tc_offset_div2(MemorySegment segment, long index, byte value) { VH_pps_tc_offset_div2.set(segment, 0L, index, value); }
    /// Sets `pps_tc_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_tc_offset_div2(byte value) { pps_tc_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `log2_parallel_merge_level_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_parallel_merge_level_minus2(MemorySegment segment, long index) { return (byte) VH_log2_parallel_merge_level_minus2.get(segment, 0L, index); }
    /// {@return `log2_parallel_merge_level_minus2`}
    public byte log2_parallel_merge_level_minus2() { return log2_parallel_merge_level_minus2(this.segment(), 0L); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_parallel_merge_level_minus2(MemorySegment segment, long index, byte value) { VH_log2_parallel_merge_level_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(byte value) { log2_parallel_merge_level_minus2(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_transform_skip_block_size_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_transform_skip_block_size_minus2(MemorySegment segment, long index) { return (byte) VH_log2_max_transform_skip_block_size_minus2.get(segment, 0L, index); }
    /// {@return `log2_max_transform_skip_block_size_minus2`}
    public byte log2_max_transform_skip_block_size_minus2() { return log2_max_transform_skip_block_size_minus2(this.segment(), 0L); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_transform_skip_block_size_minus2(MemorySegment segment, long index, byte value) { VH_log2_max_transform_skip_block_size_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(byte value) { log2_max_transform_skip_block_size_minus2(this.segment(), 0L, value); return this; }

    /// {@return `diff_cu_chroma_qp_offset_depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte diff_cu_chroma_qp_offset_depth(MemorySegment segment, long index) { return (byte) VH_diff_cu_chroma_qp_offset_depth.get(segment, 0L, index); }
    /// {@return `diff_cu_chroma_qp_offset_depth`}
    public byte diff_cu_chroma_qp_offset_depth() { return diff_cu_chroma_qp_offset_depth(this.segment(), 0L); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void diff_cu_chroma_qp_offset_depth(MemorySegment segment, long index, byte value) { VH_diff_cu_chroma_qp_offset_depth.set(segment, 0L, index, value); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(byte value) { diff_cu_chroma_qp_offset_depth(this.segment(), 0L, value); return this; }

    /// {@return `chroma_qp_offset_list_len_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_qp_offset_list_len_minus1(MemorySegment segment, long index) { return (byte) VH_chroma_qp_offset_list_len_minus1.get(segment, 0L, index); }
    /// {@return `chroma_qp_offset_list_len_minus1`}
    public byte chroma_qp_offset_list_len_minus1() { return chroma_qp_offset_list_len_minus1(this.segment(), 0L); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_qp_offset_list_len_minus1(MemorySegment segment, long index, byte value) { VH_chroma_qp_offset_list_len_minus1.set(segment, 0L, index, value); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(byte value) { chroma_qp_offset_list_len_minus1(this.segment(), 0L, value); return this; }

    /// {@return `cb_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cb_qp_offset_list(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cb_qp_offset_list, index), LAYOUT_cb_qp_offset_list); }
    /// {@return `cb_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cb_qp_offset_list(MemorySegment segment, long index, long index0) { return (byte) VH_cb_qp_offset_list.get(segment, 0L, index, index0); }
    /// {@return `cb_qp_offset_list`}
    public MemorySegment cb_qp_offset_list() { return cb_qp_offset_list(this.segment(), 0L); }
    /// {@return `cb_qp_offset_list`}
    /// @param index0 the Index 0 of the array
    public byte cb_qp_offset_list(long index0) { return cb_qp_offset_list(this.segment(), 0L, index0); }
    /// Sets `cb_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cb_qp_offset_list(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cb_qp_offset_list, index), LAYOUT_cb_qp_offset_list.byteSize()); }
    /// Sets `cb_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cb_qp_offset_list(MemorySegment segment, long index, long index0, byte value) { VH_cb_qp_offset_list.set(segment, 0L, index, index0, value); }
    /// Sets `cb_qp_offset_list` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cb_qp_offset_list(MemorySegment value) { cb_qp_offset_list(this.segment(), 0L, value); return this; }
    /// Sets `cb_qp_offset_list` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cb_qp_offset_list(long index0, byte value) { cb_qp_offset_list(this.segment(), 0L, index0, value); return this; }

    /// {@return `cr_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cr_qp_offset_list(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cr_qp_offset_list, index), LAYOUT_cr_qp_offset_list); }
    /// {@return `cr_qp_offset_list` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cr_qp_offset_list(MemorySegment segment, long index, long index0) { return (byte) VH_cr_qp_offset_list.get(segment, 0L, index, index0); }
    /// {@return `cr_qp_offset_list`}
    public MemorySegment cr_qp_offset_list() { return cr_qp_offset_list(this.segment(), 0L); }
    /// {@return `cr_qp_offset_list`}
    /// @param index0 the Index 0 of the array
    public byte cr_qp_offset_list(long index0) { return cr_qp_offset_list(this.segment(), 0L, index0); }
    /// Sets `cr_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cr_qp_offset_list(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cr_qp_offset_list, index), LAYOUT_cr_qp_offset_list.byteSize()); }
    /// Sets `cr_qp_offset_list` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cr_qp_offset_list(MemorySegment segment, long index, long index0, byte value) { VH_cr_qp_offset_list.set(segment, 0L, index, index0, value); }
    /// Sets `cr_qp_offset_list` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cr_qp_offset_list(MemorySegment value) { cr_qp_offset_list(this.segment(), 0L, value); return this; }
    /// Sets `cr_qp_offset_list` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cr_qp_offset_list(long index0, byte value) { cr_qp_offset_list(this.segment(), 0L, index0, value); return this; }

    /// {@return `log2_sao_offset_scale_luma` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_sao_offset_scale_luma(MemorySegment segment, long index) { return (byte) VH_log2_sao_offset_scale_luma.get(segment, 0L, index); }
    /// {@return `log2_sao_offset_scale_luma`}
    public byte log2_sao_offset_scale_luma() { return log2_sao_offset_scale_luma(this.segment(), 0L); }
    /// Sets `log2_sao_offset_scale_luma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_sao_offset_scale_luma(MemorySegment segment, long index, byte value) { VH_log2_sao_offset_scale_luma.set(segment, 0L, index, value); }
    /// Sets `log2_sao_offset_scale_luma` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(byte value) { log2_sao_offset_scale_luma(this.segment(), 0L, value); return this; }

    /// {@return `log2_sao_offset_scale_chroma` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_sao_offset_scale_chroma(MemorySegment segment, long index) { return (byte) VH_log2_sao_offset_scale_chroma.get(segment, 0L, index); }
    /// {@return `log2_sao_offset_scale_chroma`}
    public byte log2_sao_offset_scale_chroma() { return log2_sao_offset_scale_chroma(this.segment(), 0L); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_sao_offset_scale_chroma(MemorySegment segment, long index, byte value) { VH_log2_sao_offset_scale_chroma.set(segment, 0L, index, value); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(byte value) { log2_sao_offset_scale_chroma(this.segment(), 0L, value); return this; }

    /// {@return `pps_act_y_qp_offset_plus5` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_act_y_qp_offset_plus5(MemorySegment segment, long index) { return (byte) VH_pps_act_y_qp_offset_plus5.get(segment, 0L, index); }
    /// {@return `pps_act_y_qp_offset_plus5`}
    public byte pps_act_y_qp_offset_plus5() { return pps_act_y_qp_offset_plus5(this.segment(), 0L); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_act_y_qp_offset_plus5(MemorySegment segment, long index, byte value) { VH_pps_act_y_qp_offset_plus5.set(segment, 0L, index, value); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(byte value) { pps_act_y_qp_offset_plus5(this.segment(), 0L, value); return this; }

    /// {@return `pps_act_cb_qp_offset_plus5` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_act_cb_qp_offset_plus5(MemorySegment segment, long index) { return (byte) VH_pps_act_cb_qp_offset_plus5.get(segment, 0L, index); }
    /// {@return `pps_act_cb_qp_offset_plus5`}
    public byte pps_act_cb_qp_offset_plus5() { return pps_act_cb_qp_offset_plus5(this.segment(), 0L); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_act_cb_qp_offset_plus5(MemorySegment segment, long index, byte value) { VH_pps_act_cb_qp_offset_plus5.set(segment, 0L, index, value); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(byte value) { pps_act_cb_qp_offset_plus5(this.segment(), 0L, value); return this; }

    /// {@return `pps_act_cr_qp_offset_plus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_act_cr_qp_offset_plus3(MemorySegment segment, long index) { return (byte) VH_pps_act_cr_qp_offset_plus3.get(segment, 0L, index); }
    /// {@return `pps_act_cr_qp_offset_plus3`}
    public byte pps_act_cr_qp_offset_plus3() { return pps_act_cr_qp_offset_plus3(this.segment(), 0L); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_act_cr_qp_offset_plus3(MemorySegment segment, long index, byte value) { VH_pps_act_cr_qp_offset_plus3.set(segment, 0L, index, value); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3(byte value) { pps_act_cr_qp_offset_plus3(this.segment(), 0L, value); return this; }

    /// {@return `pps_num_palette_predictor_initializers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_num_palette_predictor_initializers(MemorySegment segment, long index) { return (byte) VH_pps_num_palette_predictor_initializers.get(segment, 0L, index); }
    /// {@return `pps_num_palette_predictor_initializers`}
    public byte pps_num_palette_predictor_initializers() { return pps_num_palette_predictor_initializers(this.segment(), 0L); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_num_palette_predictor_initializers(MemorySegment segment, long index, byte value) { VH_pps_num_palette_predictor_initializers.set(segment, 0L, index, value); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializers(byte value) { pps_num_palette_predictor_initializers(this.segment(), 0L, value); return this; }

    /// {@return `luma_bit_depth_entry_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte luma_bit_depth_entry_minus8(MemorySegment segment, long index) { return (byte) VH_luma_bit_depth_entry_minus8.get(segment, 0L, index); }
    /// {@return `luma_bit_depth_entry_minus8`}
    public byte luma_bit_depth_entry_minus8() { return luma_bit_depth_entry_minus8(this.segment(), 0L); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_bit_depth_entry_minus8(MemorySegment segment, long index, byte value) { VH_luma_bit_depth_entry_minus8.set(segment, 0L, index, value); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(byte value) { luma_bit_depth_entry_minus8(this.segment(), 0L, value); return this; }

    /// {@return `chroma_bit_depth_entry_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_bit_depth_entry_minus8(MemorySegment segment, long index) { return (byte) VH_chroma_bit_depth_entry_minus8.get(segment, 0L, index); }
    /// {@return `chroma_bit_depth_entry_minus8`}
    public byte chroma_bit_depth_entry_minus8() { return chroma_bit_depth_entry_minus8(this.segment(), 0L); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_bit_depth_entry_minus8(MemorySegment segment, long index, byte value) { VH_chroma_bit_depth_entry_minus8.set(segment, 0L, index, value); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(byte value) { chroma_bit_depth_entry_minus8(this.segment(), 0L, value); return this; }

    /// {@return `num_tile_columns_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_tile_columns_minus1(MemorySegment segment, long index) { return (byte) VH_num_tile_columns_minus1.get(segment, 0L, index); }
    /// {@return `num_tile_columns_minus1`}
    public byte num_tile_columns_minus1() { return num_tile_columns_minus1(this.segment(), 0L); }
    /// Sets `num_tile_columns_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_tile_columns_minus1(MemorySegment segment, long index, byte value) { VH_num_tile_columns_minus1.set(segment, 0L, index, value); }
    /// Sets `num_tile_columns_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_columns_minus1(byte value) { num_tile_columns_minus1(this.segment(), 0L, value); return this; }

    /// {@return `num_tile_rows_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_tile_rows_minus1(MemorySegment segment, long index) { return (byte) VH_num_tile_rows_minus1.get(segment, 0L, index); }
    /// {@return `num_tile_rows_minus1`}
    public byte num_tile_rows_minus1() { return num_tile_rows_minus1(this.segment(), 0L); }
    /// Sets `num_tile_rows_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_tile_rows_minus1(MemorySegment segment, long index, byte value) { VH_num_tile_rows_minus1.set(segment, 0L, index, value); }
    /// Sets `num_tile_rows_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_rows_minus1(byte value) { num_tile_rows_minus1(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public byte reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `column_width_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment column_width_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_column_width_minus1, index), LAYOUT_column_width_minus1); }
    /// {@return `column_width_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short column_width_minus1(MemorySegment segment, long index, long index0) { return (short) VH_column_width_minus1.get(segment, 0L, index, index0); }
    /// {@return `column_width_minus1`}
    public MemorySegment column_width_minus1() { return column_width_minus1(this.segment(), 0L); }
    /// {@return `column_width_minus1`}
    /// @param index0 the Index 0 of the array
    public short column_width_minus1(long index0) { return column_width_minus1(this.segment(), 0L, index0); }
    /// Sets `column_width_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void column_width_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_column_width_minus1, index), LAYOUT_column_width_minus1.byteSize()); }
    /// Sets `column_width_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void column_width_minus1(MemorySegment segment, long index, long index0, short value) { VH_column_width_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `column_width_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet column_width_minus1(MemorySegment value) { column_width_minus1(this.segment(), 0L, value); return this; }
    /// Sets `column_width_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet column_width_minus1(long index0, short value) { column_width_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `row_height_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment row_height_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_row_height_minus1, index), LAYOUT_row_height_minus1); }
    /// {@return `row_height_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short row_height_minus1(MemorySegment segment, long index, long index0) { return (short) VH_row_height_minus1.get(segment, 0L, index, index0); }
    /// {@return `row_height_minus1`}
    public MemorySegment row_height_minus1() { return row_height_minus1(this.segment(), 0L); }
    /// {@return `row_height_minus1`}
    /// @param index0 the Index 0 of the array
    public short row_height_minus1(long index0) { return row_height_minus1(this.segment(), 0L, index0); }
    /// Sets `row_height_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void row_height_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_row_height_minus1, index), LAYOUT_row_height_minus1.byteSize()); }
    /// Sets `row_height_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void row_height_minus1(MemorySegment segment, long index, long index0, short value) { VH_row_height_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `row_height_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet row_height_minus1(MemorySegment value) { row_height_minus1(this.segment(), 0L, value); return this; }
    /// Sets `row_height_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet row_height_minus1(long index0, short value) { row_height_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reserved3(MemorySegment segment, long index) { return (int) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    public int reserved3() { return reserved3(this.segment(), 0L); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved3(MemorySegment segment, long index, int value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved3(int value) { reserved3(this.segment(), 0L, value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    public MemorySegment pScalingLists() { return pScalingLists(this.segment(), 0L); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pScalingLists(MemorySegment segment, long index, MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pScalingLists(MemorySegment value) { pScalingLists(this.segment(), 0L, value); return this; }

    /// {@return `pPredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPredictorPaletteEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pPredictorPaletteEntries.get(segment, 0L, index); }
    /// {@return `pPredictorPaletteEntries`}
    public MemorySegment pPredictorPaletteEntries() { return pPredictorPaletteEntries(this.segment(), 0L); }
    /// Sets `pPredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPredictorPaletteEntries(MemorySegment segment, long index, MemorySegment value) { VH_pPredictorPaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pPredictorPaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pPredictorPaletteEntries(MemorySegment value) { pPredictorPaletteEntries(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH265PictureParameterSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265PictureParameterSet`
    public StdVideoH265PictureParameterSet asSlice(long index) { return new StdVideoH265PictureParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265PictureParameterSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265PictureParameterSet`
    public StdVideoH265PictureParameterSet asSlice(long index, long count) { return new StdVideoH265PictureParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265PictureParameterSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265PictureParameterSet at(long index, Consumer<StdVideoH265PictureParameterSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH265PictureParameterSet flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH265PpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265PpsFlags.of(flagsAt(index))); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_pic_parameter_set_idAt(long index) { return pps_pic_parameter_set_id(this.segment(), index); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_pic_parameter_set_idAt(long index, byte value) { pps_pic_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_seq_parameter_set_idAt(long index) { return pps_seq_parameter_set_id(this.segment(), index); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_seq_parameter_set_idAt(long index, byte value) { pps_seq_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte sps_video_parameter_set_idAt(long index) { return sps_video_parameter_set_id(this.segment(), index); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet sps_video_parameter_set_idAt(long index, byte value) { sps_video_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `num_extra_slice_header_bits` at the given index}
    /// @param index the index of the struct buffer
    public byte num_extra_slice_header_bitsAt(long index) { return num_extra_slice_header_bits(this.segment(), index); }
    /// Sets `num_extra_slice_header_bits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_extra_slice_header_bitsAt(long index, byte value) { num_extra_slice_header_bits(this.segment(), index, value); return this; }

    /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l0_default_active_minus1At(long index) { return num_ref_idx_l0_default_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1At(long index, byte value) { num_ref_idx_l0_default_active_minus1(this.segment(), index, value); return this; }

    /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l1_default_active_minus1At(long index) { return num_ref_idx_l1_default_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1At(long index, byte value) { num_ref_idx_l1_default_active_minus1(this.segment(), index, value); return this; }

    /// {@return `init_qp_minus26` at the given index}
    /// @param index the index of the struct buffer
    public byte init_qp_minus26At(long index) { return init_qp_minus26(this.segment(), index); }
    /// Sets `init_qp_minus26` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet init_qp_minus26At(long index, byte value) { init_qp_minus26(this.segment(), index, value); return this; }

    /// {@return `diff_cu_qp_delta_depth` at the given index}
    /// @param index the index of the struct buffer
    public byte diff_cu_qp_delta_depthAt(long index) { return diff_cu_qp_delta_depth(this.segment(), index); }
    /// Sets `diff_cu_qp_delta_depth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depthAt(long index, byte value) { diff_cu_qp_delta_depth(this.segment(), index, value); return this; }

    /// {@return `pps_cb_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_cb_qp_offsetAt(long index) { return pps_cb_qp_offset(this.segment(), index); }
    /// Sets `pps_cb_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cb_qp_offsetAt(long index, byte value) { pps_cb_qp_offset(this.segment(), index, value); return this; }

    /// {@return `pps_cr_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_cr_qp_offsetAt(long index) { return pps_cr_qp_offset(this.segment(), index); }
    /// Sets `pps_cr_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_cr_qp_offsetAt(long index, byte value) { pps_cr_qp_offset(this.segment(), index, value); return this; }

    /// {@return `pps_beta_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_beta_offset_div2At(long index) { return pps_beta_offset_div2(this.segment(), index); }
    /// Sets `pps_beta_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_beta_offset_div2At(long index, byte value) { pps_beta_offset_div2(this.segment(), index, value); return this; }

    /// {@return `pps_tc_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_tc_offset_div2At(long index) { return pps_tc_offset_div2(this.segment(), index); }
    /// Sets `pps_tc_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_tc_offset_div2At(long index, byte value) { pps_tc_offset_div2(this.segment(), index, value); return this; }

    /// {@return `log2_parallel_merge_level_minus2` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_parallel_merge_level_minus2At(long index) { return log2_parallel_merge_level_minus2(this.segment(), index); }
    /// Sets `log2_parallel_merge_level_minus2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2At(long index, byte value) { log2_parallel_merge_level_minus2(this.segment(), index, value); return this; }

    /// {@return `log2_max_transform_skip_block_size_minus2` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_max_transform_skip_block_size_minus2At(long index) { return log2_max_transform_skip_block_size_minus2(this.segment(), index); }
    /// Sets `log2_max_transform_skip_block_size_minus2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2At(long index, byte value) { log2_max_transform_skip_block_size_minus2(this.segment(), index, value); return this; }

    /// {@return `diff_cu_chroma_qp_offset_depth` at the given index}
    /// @param index the index of the struct buffer
    public byte diff_cu_chroma_qp_offset_depthAt(long index) { return diff_cu_chroma_qp_offset_depth(this.segment(), index); }
    /// Sets `diff_cu_chroma_qp_offset_depth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depthAt(long index, byte value) { diff_cu_chroma_qp_offset_depth(this.segment(), index, value); return this; }

    /// {@return `chroma_qp_offset_list_len_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte chroma_qp_offset_list_len_minus1At(long index) { return chroma_qp_offset_list_len_minus1(this.segment(), index); }
    /// Sets `chroma_qp_offset_list_len_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1At(long index, byte value) { chroma_qp_offset_list_len_minus1(this.segment(), index, value); return this; }

    /// {@return `cb_qp_offset_list` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment cb_qp_offset_listAt(long index) { return cb_qp_offset_list(this.segment(), index); }
    /// {@return `cb_qp_offset_list` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte cb_qp_offset_listAt(long index, long index0) { return cb_qp_offset_list(this.segment(), index, index0); }
    /// Sets `cb_qp_offset_list` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cb_qp_offset_listAt(long index, MemorySegment value) { cb_qp_offset_list(this.segment(), index, value); return this; }
    /// Sets `cb_qp_offset_list` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cb_qp_offset_listAt(long index, long index0, byte value) { cb_qp_offset_list(this.segment(), index, index0, value); return this; }

    /// {@return `cr_qp_offset_list` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment cr_qp_offset_listAt(long index) { return cr_qp_offset_list(this.segment(), index); }
    /// {@return `cr_qp_offset_list` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte cr_qp_offset_listAt(long index, long index0) { return cr_qp_offset_list(this.segment(), index, index0); }
    /// Sets `cr_qp_offset_list` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cr_qp_offset_listAt(long index, MemorySegment value) { cr_qp_offset_list(this.segment(), index, value); return this; }
    /// Sets `cr_qp_offset_list` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet cr_qp_offset_listAt(long index, long index0, byte value) { cr_qp_offset_list(this.segment(), index, index0, value); return this; }

    /// {@return `log2_sao_offset_scale_luma` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_sao_offset_scale_lumaAt(long index) { return log2_sao_offset_scale_luma(this.segment(), index); }
    /// Sets `log2_sao_offset_scale_luma` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_lumaAt(long index, byte value) { log2_sao_offset_scale_luma(this.segment(), index, value); return this; }

    /// {@return `log2_sao_offset_scale_chroma` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_sao_offset_scale_chromaAt(long index) { return log2_sao_offset_scale_chroma(this.segment(), index); }
    /// Sets `log2_sao_offset_scale_chroma` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chromaAt(long index, byte value) { log2_sao_offset_scale_chroma(this.segment(), index, value); return this; }

    /// {@return `pps_act_y_qp_offset_plus5` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_act_y_qp_offset_plus5At(long index) { return pps_act_y_qp_offset_plus5(this.segment(), index); }
    /// Sets `pps_act_y_qp_offset_plus5` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5At(long index, byte value) { pps_act_y_qp_offset_plus5(this.segment(), index, value); return this; }

    /// {@return `pps_act_cb_qp_offset_plus5` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_act_cb_qp_offset_plus5At(long index) { return pps_act_cb_qp_offset_plus5(this.segment(), index); }
    /// Sets `pps_act_cb_qp_offset_plus5` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5At(long index, byte value) { pps_act_cb_qp_offset_plus5(this.segment(), index, value); return this; }

    /// {@return `pps_act_cr_qp_offset_plus3` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_act_cr_qp_offset_plus3At(long index) { return pps_act_cr_qp_offset_plus3(this.segment(), index); }
    /// Sets `pps_act_cr_qp_offset_plus3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3At(long index, byte value) { pps_act_cr_qp_offset_plus3(this.segment(), index, value); return this; }

    /// {@return `pps_num_palette_predictor_initializers` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_num_palette_predictor_initializersAt(long index) { return pps_num_palette_predictor_initializers(this.segment(), index); }
    /// Sets `pps_num_palette_predictor_initializers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializersAt(long index, byte value) { pps_num_palette_predictor_initializers(this.segment(), index, value); return this; }

    /// {@return `luma_bit_depth_entry_minus8` at the given index}
    /// @param index the index of the struct buffer
    public byte luma_bit_depth_entry_minus8At(long index) { return luma_bit_depth_entry_minus8(this.segment(), index); }
    /// Sets `luma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8At(long index, byte value) { luma_bit_depth_entry_minus8(this.segment(), index, value); return this; }

    /// {@return `chroma_bit_depth_entry_minus8` at the given index}
    /// @param index the index of the struct buffer
    public byte chroma_bit_depth_entry_minus8At(long index) { return chroma_bit_depth_entry_minus8(this.segment(), index); }
    /// Sets `chroma_bit_depth_entry_minus8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8At(long index, byte value) { chroma_bit_depth_entry_minus8(this.segment(), index, value); return this; }

    /// {@return `num_tile_columns_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_tile_columns_minus1At(long index) { return num_tile_columns_minus1(this.segment(), index); }
    /// Sets `num_tile_columns_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_columns_minus1At(long index, byte value) { num_tile_columns_minus1(this.segment(), index, value); return this; }

    /// {@return `num_tile_rows_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_tile_rows_minus1At(long index) { return num_tile_rows_minus1(this.segment(), index); }
    /// Sets `num_tile_rows_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet num_tile_rows_minus1At(long index, byte value) { num_tile_rows_minus1(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved2At(long index) { return reserved2(this.segment(), index); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

    /// {@return `column_width_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment column_width_minus1At(long index) { return column_width_minus1(this.segment(), index); }
    /// {@return `column_width_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public short column_width_minus1At(long index, long index0) { return column_width_minus1(this.segment(), index, index0); }
    /// Sets `column_width_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet column_width_minus1At(long index, MemorySegment value) { column_width_minus1(this.segment(), index, value); return this; }
    /// Sets `column_width_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet column_width_minus1At(long index, long index0, short value) { column_width_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `row_height_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment row_height_minus1At(long index) { return row_height_minus1(this.segment(), index); }
    /// {@return `row_height_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public short row_height_minus1At(long index, long index0) { return row_height_minus1(this.segment(), index, index0); }
    /// Sets `row_height_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet row_height_minus1At(long index, MemorySegment value) { row_height_minus1(this.segment(), index, value); return this; }
    /// Sets `row_height_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet row_height_minus1At(long index, long index0, short value) { row_height_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param index the index of the struct buffer
    public int reserved3At(long index) { return reserved3(this.segment(), index); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet reserved3At(long index, int value) { reserved3(this.segment(), index, value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pScalingListsAt(long index) { return pScalingLists(this.segment(), index); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pScalingListsAt(long index, MemorySegment value) { pScalingLists(this.segment(), index, value); return this; }

    /// {@return `pPredictorPaletteEntries` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPredictorPaletteEntriesAt(long index) { return pPredictorPaletteEntries(this.segment(), index); }
    /// Sets `pPredictorPaletteEntries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265PictureParameterSet pPredictorPaletteEntriesAt(long index, MemorySegment value) { pPredictorPaletteEntries(this.segment(), index, value); return this; }

}
