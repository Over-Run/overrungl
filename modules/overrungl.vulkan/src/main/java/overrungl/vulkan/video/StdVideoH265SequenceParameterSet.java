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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH265SequenceParameterSet {
///     (struct StdVideoH265SpsFlags) StdVideoH265SpsFlags flags;
///     (int) StdVideoH265ChromaFormatIdc chroma_format_idc;
///     uint32_t pic_width_in_luma_samples;
///     uint32_t pic_height_in_luma_samples;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t sps_max_sub_layers_minus1;
///     uint8_t sps_seq_parameter_set_id;
///     uint8_t bit_depth_luma_minus8;
///     uint8_t bit_depth_chroma_minus8;
///     uint8_t log2_max_pic_order_cnt_lsb_minus4;
///     uint8_t log2_min_luma_coding_block_size_minus3;
///     uint8_t log2_diff_max_min_luma_coding_block_size;
///     uint8_t log2_min_luma_transform_block_size_minus2;
///     uint8_t log2_diff_max_min_luma_transform_block_size;
///     uint8_t max_transform_hierarchy_depth_inter;
///     uint8_t max_transform_hierarchy_depth_intra;
///     uint8_t num_short_term_ref_pic_sets;
///     uint8_t num_long_term_ref_pics_sps;
///     uint8_t pcm_sample_bit_depth_luma_minus1;
///     uint8_t pcm_sample_bit_depth_chroma_minus1;
///     uint8_t log2_min_pcm_luma_coding_block_size_minus3;
///     uint8_t log2_diff_max_min_pcm_luma_coding_block_size;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint8_t palette_max_size;
///     uint8_t delta_palette_max_predictor_size;
///     uint8_t motion_vector_resolution_control_idc;
///     uint8_t sps_num_palette_predictor_initializers_minus1;
///     uint32_t conf_win_left_offset;
///     uint32_t conf_win_right_offset;
///     uint32_t conf_win_top_offset;
///     uint32_t conf_win_bottom_offset;
///     const StdVideoH265ProfileTierLevel* pProfileTierLevel;
///     const StdVideoH265DecPicBufMgr* pDecPicBufMgr;
///     const StdVideoH265ScalingLists* pScalingLists;
///     const StdVideoH265ShortTermRefPicSet* pShortTermRefPicSet;
///     const StdVideoH265LongTermRefPicsSps* pLongTermRefPicsSps;
///     const StdVideoH265SequenceParameterSetVui* pSequenceParameterSetVui;
///     const StdVideoH265PredictorPaletteEntries* pPredictorPaletteEntries;
/// };
/// ```
public sealed class StdVideoH265SequenceParameterSet extends GroupType {
    /// The struct layout of `StdVideoH265SequenceParameterSet`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265SpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("chroma_format_idc"),
        ValueLayout.JAVA_INT.withName("pic_width_in_luma_samples"),
        ValueLayout.JAVA_INT.withName("pic_height_in_luma_samples"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("sps_max_sub_layers_minus1"),
        ValueLayout.JAVA_BYTE.withName("sps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8"),
        ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
        ValueLayout.JAVA_BYTE.withName("log2_min_luma_coding_block_size_minus3"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_coding_block_size"),
        ValueLayout.JAVA_BYTE.withName("log2_min_luma_transform_block_size_minus2"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_transform_block_size"),
        ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_inter"),
        ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_intra"),
        ValueLayout.JAVA_BYTE.withName("num_short_term_ref_pic_sets"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_ref_pics_sps"),
        ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_luma_minus1"),
        ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_chroma_minus1"),
        ValueLayout.JAVA_BYTE.withName("log2_min_pcm_luma_coding_block_size_minus3"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_pcm_luma_coding_block_size"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_BYTE.withName("palette_max_size"),
        ValueLayout.JAVA_BYTE.withName("delta_palette_max_predictor_size"),
        ValueLayout.JAVA_BYTE.withName("motion_vector_resolution_control_idc"),
        ValueLayout.JAVA_BYTE.withName("sps_num_palette_predictor_initializers_minus1"),
        ValueLayout.JAVA_INT.withName("conf_win_left_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_right_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_top_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_bottom_offset"),
        ValueLayout.ADDRESS.withName("pProfileTierLevel"),
        ValueLayout.ADDRESS.withName("pDecPicBufMgr"),
        ValueLayout.ADDRESS.withName("pScalingLists"),
        ValueLayout.ADDRESS.withName("pShortTermRefPicSet"),
        ValueLayout.ADDRESS.withName("pLongTermRefPicsSps"),
        ValueLayout.ADDRESS.withName("pSequenceParameterSetVui"),
        ValueLayout.ADDRESS.withName("pPredictorPaletteEntries")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `chroma_format_idc`.
    public static final long OFFSET_chroma_format_idc = LAYOUT.byteOffset(PathElement.groupElement("chroma_format_idc"));
    /// The memory layout of `chroma_format_idc`.
    public static final MemoryLayout LAYOUT_chroma_format_idc = LAYOUT.select(PathElement.groupElement("chroma_format_idc"));
    /// The [VarHandle] of `chroma_format_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_format_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_format_idc"));
    /// The byte offset of `pic_width_in_luma_samples`.
    public static final long OFFSET_pic_width_in_luma_samples = LAYOUT.byteOffset(PathElement.groupElement("pic_width_in_luma_samples"));
    /// The memory layout of `pic_width_in_luma_samples`.
    public static final MemoryLayout LAYOUT_pic_width_in_luma_samples = LAYOUT.select(PathElement.groupElement("pic_width_in_luma_samples"));
    /// The [VarHandle] of `pic_width_in_luma_samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_width_in_luma_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_width_in_luma_samples"));
    /// The byte offset of `pic_height_in_luma_samples`.
    public static final long OFFSET_pic_height_in_luma_samples = LAYOUT.byteOffset(PathElement.groupElement("pic_height_in_luma_samples"));
    /// The memory layout of `pic_height_in_luma_samples`.
    public static final MemoryLayout LAYOUT_pic_height_in_luma_samples = LAYOUT.select(PathElement.groupElement("pic_height_in_luma_samples"));
    /// The [VarHandle] of `pic_height_in_luma_samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_height_in_luma_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_height_in_luma_samples"));
    /// The byte offset of `sps_video_parameter_set_id`.
    public static final long OFFSET_sps_video_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The memory layout of `sps_video_parameter_set_id`.
    public static final MemoryLayout LAYOUT_sps_video_parameter_set_id = LAYOUT.select(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The byte offset of `sps_max_sub_layers_minus1`.
    public static final long OFFSET_sps_max_sub_layers_minus1 = LAYOUT.byteOffset(PathElement.groupElement("sps_max_sub_layers_minus1"));
    /// The memory layout of `sps_max_sub_layers_minus1`.
    public static final MemoryLayout LAYOUT_sps_max_sub_layers_minus1 = LAYOUT.select(PathElement.groupElement("sps_max_sub_layers_minus1"));
    /// The [VarHandle] of `sps_max_sub_layers_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_max_sub_layers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_max_sub_layers_minus1"));
    /// The byte offset of `sps_seq_parameter_set_id`.
    public static final long OFFSET_sps_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("sps_seq_parameter_set_id"));
    /// The memory layout of `sps_seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_sps_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("sps_seq_parameter_set_id"));
    /// The [VarHandle] of `sps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_seq_parameter_set_id"));
    /// The byte offset of `bit_depth_luma_minus8`.
    public static final long OFFSET_bit_depth_luma_minus8 = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The memory layout of `bit_depth_luma_minus8`.
    public static final MemoryLayout LAYOUT_bit_depth_luma_minus8 = LAYOUT.select(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The [VarHandle] of `bit_depth_luma_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_depth_luma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The byte offset of `bit_depth_chroma_minus8`.
    public static final long OFFSET_bit_depth_chroma_minus8 = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The memory layout of `bit_depth_chroma_minus8`.
    public static final MemoryLayout LAYOUT_bit_depth_chroma_minus8 = LAYOUT.select(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The [VarHandle] of `bit_depth_chroma_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_depth_chroma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The byte offset of `log2_max_pic_order_cnt_lsb_minus4`.
    public static final long OFFSET_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.byteOffset(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The memory layout of `log2_max_pic_order_cnt_lsb_minus4`.
    public static final MemoryLayout LAYOUT_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.select(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The [VarHandle] of `log2_max_pic_order_cnt_lsb_minus4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The byte offset of `log2_min_luma_coding_block_size_minus3`.
    public static final long OFFSET_log2_min_luma_coding_block_size_minus3 = LAYOUT.byteOffset(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
    /// The memory layout of `log2_min_luma_coding_block_size_minus3`.
    public static final MemoryLayout LAYOUT_log2_min_luma_coding_block_size_minus3 = LAYOUT.select(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
    /// The [VarHandle] of `log2_min_luma_coding_block_size_minus3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_min_luma_coding_block_size_minus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
    /// The byte offset of `log2_diff_max_min_luma_coding_block_size`.
    public static final long OFFSET_log2_diff_max_min_luma_coding_block_size = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
    /// The memory layout of `log2_diff_max_min_luma_coding_block_size`.
    public static final MemoryLayout LAYOUT_log2_diff_max_min_luma_coding_block_size = LAYOUT.select(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
    /// The [VarHandle] of `log2_diff_max_min_luma_coding_block_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_diff_max_min_luma_coding_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
    /// The byte offset of `log2_min_luma_transform_block_size_minus2`.
    public static final long OFFSET_log2_min_luma_transform_block_size_minus2 = LAYOUT.byteOffset(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
    /// The memory layout of `log2_min_luma_transform_block_size_minus2`.
    public static final MemoryLayout LAYOUT_log2_min_luma_transform_block_size_minus2 = LAYOUT.select(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
    /// The [VarHandle] of `log2_min_luma_transform_block_size_minus2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_min_luma_transform_block_size_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
    /// The byte offset of `log2_diff_max_min_luma_transform_block_size`.
    public static final long OFFSET_log2_diff_max_min_luma_transform_block_size = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
    /// The memory layout of `log2_diff_max_min_luma_transform_block_size`.
    public static final MemoryLayout LAYOUT_log2_diff_max_min_luma_transform_block_size = LAYOUT.select(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
    /// The [VarHandle] of `log2_diff_max_min_luma_transform_block_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_diff_max_min_luma_transform_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
    /// The byte offset of `max_transform_hierarchy_depth_inter`.
    public static final long OFFSET_max_transform_hierarchy_depth_inter = LAYOUT.byteOffset(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
    /// The memory layout of `max_transform_hierarchy_depth_inter`.
    public static final MemoryLayout LAYOUT_max_transform_hierarchy_depth_inter = LAYOUT.select(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
    /// The [VarHandle] of `max_transform_hierarchy_depth_inter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_transform_hierarchy_depth_inter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
    /// The byte offset of `max_transform_hierarchy_depth_intra`.
    public static final long OFFSET_max_transform_hierarchy_depth_intra = LAYOUT.byteOffset(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
    /// The memory layout of `max_transform_hierarchy_depth_intra`.
    public static final MemoryLayout LAYOUT_max_transform_hierarchy_depth_intra = LAYOUT.select(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
    /// The [VarHandle] of `max_transform_hierarchy_depth_intra` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_transform_hierarchy_depth_intra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
    /// The byte offset of `num_short_term_ref_pic_sets`.
    public static final long OFFSET_num_short_term_ref_pic_sets = LAYOUT.byteOffset(PathElement.groupElement("num_short_term_ref_pic_sets"));
    /// The memory layout of `num_short_term_ref_pic_sets`.
    public static final MemoryLayout LAYOUT_num_short_term_ref_pic_sets = LAYOUT.select(PathElement.groupElement("num_short_term_ref_pic_sets"));
    /// The [VarHandle] of `num_short_term_ref_pic_sets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_short_term_ref_pic_sets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_short_term_ref_pic_sets"));
    /// The byte offset of `num_long_term_ref_pics_sps`.
    public static final long OFFSET_num_long_term_ref_pics_sps = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_ref_pics_sps"));
    /// The memory layout of `num_long_term_ref_pics_sps`.
    public static final MemoryLayout LAYOUT_num_long_term_ref_pics_sps = LAYOUT.select(PathElement.groupElement("num_long_term_ref_pics_sps"));
    /// The [VarHandle] of `num_long_term_ref_pics_sps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_long_term_ref_pics_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_ref_pics_sps"));
    /// The byte offset of `pcm_sample_bit_depth_luma_minus1`.
    public static final long OFFSET_pcm_sample_bit_depth_luma_minus1 = LAYOUT.byteOffset(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
    /// The memory layout of `pcm_sample_bit_depth_luma_minus1`.
    public static final MemoryLayout LAYOUT_pcm_sample_bit_depth_luma_minus1 = LAYOUT.select(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
    /// The [VarHandle] of `pcm_sample_bit_depth_luma_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pcm_sample_bit_depth_luma_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
    /// The byte offset of `pcm_sample_bit_depth_chroma_minus1`.
    public static final long OFFSET_pcm_sample_bit_depth_chroma_minus1 = LAYOUT.byteOffset(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
    /// The memory layout of `pcm_sample_bit_depth_chroma_minus1`.
    public static final MemoryLayout LAYOUT_pcm_sample_bit_depth_chroma_minus1 = LAYOUT.select(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
    /// The [VarHandle] of `pcm_sample_bit_depth_chroma_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pcm_sample_bit_depth_chroma_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
    /// The byte offset of `log2_min_pcm_luma_coding_block_size_minus3`.
    public static final long OFFSET_log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT.byteOffset(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
    /// The memory layout of `log2_min_pcm_luma_coding_block_size_minus3`.
    public static final MemoryLayout LAYOUT_log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT.select(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
    /// The [VarHandle] of `log2_min_pcm_luma_coding_block_size_minus3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
    /// The byte offset of `log2_diff_max_min_pcm_luma_coding_block_size`.
    public static final long OFFSET_log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
    /// The memory layout of `log2_diff_max_min_pcm_luma_coding_block_size`.
    public static final MemoryLayout LAYOUT_log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT.select(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
    /// The [VarHandle] of `log2_diff_max_min_pcm_luma_coding_block_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
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
    /// The byte offset of `palette_max_size`.
    public static final long OFFSET_palette_max_size = LAYOUT.byteOffset(PathElement.groupElement("palette_max_size"));
    /// The memory layout of `palette_max_size`.
    public static final MemoryLayout LAYOUT_palette_max_size = LAYOUT.select(PathElement.groupElement("palette_max_size"));
    /// The [VarHandle] of `palette_max_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_palette_max_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("palette_max_size"));
    /// The byte offset of `delta_palette_max_predictor_size`.
    public static final long OFFSET_delta_palette_max_predictor_size = LAYOUT.byteOffset(PathElement.groupElement("delta_palette_max_predictor_size"));
    /// The memory layout of `delta_palette_max_predictor_size`.
    public static final MemoryLayout LAYOUT_delta_palette_max_predictor_size = LAYOUT.select(PathElement.groupElement("delta_palette_max_predictor_size"));
    /// The [VarHandle] of `delta_palette_max_predictor_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_palette_max_predictor_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_palette_max_predictor_size"));
    /// The byte offset of `motion_vector_resolution_control_idc`.
    public static final long OFFSET_motion_vector_resolution_control_idc = LAYOUT.byteOffset(PathElement.groupElement("motion_vector_resolution_control_idc"));
    /// The memory layout of `motion_vector_resolution_control_idc`.
    public static final MemoryLayout LAYOUT_motion_vector_resolution_control_idc = LAYOUT.select(PathElement.groupElement("motion_vector_resolution_control_idc"));
    /// The [VarHandle] of `motion_vector_resolution_control_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_motion_vector_resolution_control_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("motion_vector_resolution_control_idc"));
    /// The byte offset of `sps_num_palette_predictor_initializers_minus1`.
    public static final long OFFSET_sps_num_palette_predictor_initializers_minus1 = LAYOUT.byteOffset(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
    /// The memory layout of `sps_num_palette_predictor_initializers_minus1`.
    public static final MemoryLayout LAYOUT_sps_num_palette_predictor_initializers_minus1 = LAYOUT.select(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
    /// The [VarHandle] of `sps_num_palette_predictor_initializers_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_num_palette_predictor_initializers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
    /// The byte offset of `conf_win_left_offset`.
    public static final long OFFSET_conf_win_left_offset = LAYOUT.byteOffset(PathElement.groupElement("conf_win_left_offset"));
    /// The memory layout of `conf_win_left_offset`.
    public static final MemoryLayout LAYOUT_conf_win_left_offset = LAYOUT.select(PathElement.groupElement("conf_win_left_offset"));
    /// The [VarHandle] of `conf_win_left_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conf_win_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_left_offset"));
    /// The byte offset of `conf_win_right_offset`.
    public static final long OFFSET_conf_win_right_offset = LAYOUT.byteOffset(PathElement.groupElement("conf_win_right_offset"));
    /// The memory layout of `conf_win_right_offset`.
    public static final MemoryLayout LAYOUT_conf_win_right_offset = LAYOUT.select(PathElement.groupElement("conf_win_right_offset"));
    /// The [VarHandle] of `conf_win_right_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conf_win_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_right_offset"));
    /// The byte offset of `conf_win_top_offset`.
    public static final long OFFSET_conf_win_top_offset = LAYOUT.byteOffset(PathElement.groupElement("conf_win_top_offset"));
    /// The memory layout of `conf_win_top_offset`.
    public static final MemoryLayout LAYOUT_conf_win_top_offset = LAYOUT.select(PathElement.groupElement("conf_win_top_offset"));
    /// The [VarHandle] of `conf_win_top_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conf_win_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_top_offset"));
    /// The byte offset of `conf_win_bottom_offset`.
    public static final long OFFSET_conf_win_bottom_offset = LAYOUT.byteOffset(PathElement.groupElement("conf_win_bottom_offset"));
    /// The memory layout of `conf_win_bottom_offset`.
    public static final MemoryLayout LAYOUT_conf_win_bottom_offset = LAYOUT.select(PathElement.groupElement("conf_win_bottom_offset"));
    /// The [VarHandle] of `conf_win_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conf_win_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_bottom_offset"));
    /// The byte offset of `pProfileTierLevel`.
    public static final long OFFSET_pProfileTierLevel = LAYOUT.byteOffset(PathElement.groupElement("pProfileTierLevel"));
    /// The memory layout of `pProfileTierLevel`.
    public static final MemoryLayout LAYOUT_pProfileTierLevel = LAYOUT.select(PathElement.groupElement("pProfileTierLevel"));
    /// The [VarHandle] of `pProfileTierLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pProfileTierLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfileTierLevel"));
    /// The byte offset of `pDecPicBufMgr`.
    public static final long OFFSET_pDecPicBufMgr = LAYOUT.byteOffset(PathElement.groupElement("pDecPicBufMgr"));
    /// The memory layout of `pDecPicBufMgr`.
    public static final MemoryLayout LAYOUT_pDecPicBufMgr = LAYOUT.select(PathElement.groupElement("pDecPicBufMgr"));
    /// The [VarHandle] of `pDecPicBufMgr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDecPicBufMgr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDecPicBufMgr"));
    /// The byte offset of `pScalingLists`.
    public static final long OFFSET_pScalingLists = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
    /// The memory layout of `pScalingLists`.
    public static final MemoryLayout LAYOUT_pScalingLists = LAYOUT.select(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The byte offset of `pShortTermRefPicSet`.
    public static final long OFFSET_pShortTermRefPicSet = LAYOUT.byteOffset(PathElement.groupElement("pShortTermRefPicSet"));
    /// The memory layout of `pShortTermRefPicSet`.
    public static final MemoryLayout LAYOUT_pShortTermRefPicSet = LAYOUT.select(PathElement.groupElement("pShortTermRefPicSet"));
    /// The [VarHandle] of `pShortTermRefPicSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShortTermRefPicSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShortTermRefPicSet"));
    /// The byte offset of `pLongTermRefPicsSps`.
    public static final long OFFSET_pLongTermRefPicsSps = LAYOUT.byteOffset(PathElement.groupElement("pLongTermRefPicsSps"));
    /// The memory layout of `pLongTermRefPicsSps`.
    public static final MemoryLayout LAYOUT_pLongTermRefPicsSps = LAYOUT.select(PathElement.groupElement("pLongTermRefPicsSps"));
    /// The [VarHandle] of `pLongTermRefPicsSps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLongTermRefPicsSps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLongTermRefPicsSps"));
    /// The byte offset of `pSequenceParameterSetVui`.
    public static final long OFFSET_pSequenceParameterSetVui = LAYOUT.byteOffset(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The memory layout of `pSequenceParameterSetVui`.
    public static final MemoryLayout LAYOUT_pSequenceParameterSetVui = LAYOUT.select(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The [VarHandle] of `pSequenceParameterSetVui` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSequenceParameterSetVui = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The byte offset of `pPredictorPaletteEntries`.
    public static final long OFFSET_pPredictorPaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("pPredictorPaletteEntries"));
    /// The memory layout of `pPredictorPaletteEntries`.
    public static final MemoryLayout LAYOUT_pPredictorPaletteEntries = LAYOUT.select(PathElement.groupElement("pPredictorPaletteEntries"));
    /// The [VarHandle] of `pPredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPredictorPaletteEntries"));

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SequenceParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SequenceParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSet`
    public static StdVideoH265SequenceParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265SequenceParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SequenceParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SequenceParameterSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SequenceParameterSet copyFrom(StdVideoH265SequenceParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoH265SequenceParameterSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `chroma_format_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chroma_format_idc(MemorySegment segment, long index) { return (int) VH_chroma_format_idc.get(segment, 0L, index); }
    /// {@return `chroma_format_idc`}
    public int chroma_format_idc() { return chroma_format_idc(this.segment(), 0L); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_format_idc(MemorySegment segment, long index, int value) { VH_chroma_format_idc.set(segment, 0L, index, value); }
    /// Sets `chroma_format_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet chroma_format_idc(int value) { chroma_format_idc(this.segment(), 0L, value); return this; }

    /// {@return `pic_width_in_luma_samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_width_in_luma_samples(MemorySegment segment, long index) { return (int) VH_pic_width_in_luma_samples.get(segment, 0L, index); }
    /// {@return `pic_width_in_luma_samples`}
    public int pic_width_in_luma_samples() { return pic_width_in_luma_samples(this.segment(), 0L); }
    /// Sets `pic_width_in_luma_samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_width_in_luma_samples(MemorySegment segment, long index, int value) { VH_pic_width_in_luma_samples.set(segment, 0L, index, value); }
    /// Sets `pic_width_in_luma_samples` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pic_width_in_luma_samples(int value) { pic_width_in_luma_samples(this.segment(), 0L, value); return this; }

    /// {@return `pic_height_in_luma_samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_height_in_luma_samples(MemorySegment segment, long index) { return (int) VH_pic_height_in_luma_samples.get(segment, 0L, index); }
    /// {@return `pic_height_in_luma_samples`}
    public int pic_height_in_luma_samples() { return pic_height_in_luma_samples(this.segment(), 0L); }
    /// Sets `pic_height_in_luma_samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_height_in_luma_samples(MemorySegment segment, long index, int value) { VH_pic_height_in_luma_samples.set(segment, 0L, index, value); }
    /// Sets `pic_height_in_luma_samples` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pic_height_in_luma_samples(int value) { pic_height_in_luma_samples(this.segment(), 0L, value); return this; }

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
    public StdVideoH265SequenceParameterSet sps_video_parameter_set_id(byte value) { sps_video_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `sps_max_sub_layers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte sps_max_sub_layers_minus1(MemorySegment segment, long index) { return (byte) VH_sps_max_sub_layers_minus1.get(segment, 0L, index); }
    /// {@return `sps_max_sub_layers_minus1`}
    public byte sps_max_sub_layers_minus1() { return sps_max_sub_layers_minus1(this.segment(), 0L); }
    /// Sets `sps_max_sub_layers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sps_max_sub_layers_minus1(MemorySegment segment, long index, byte value) { VH_sps_max_sub_layers_minus1.set(segment, 0L, index, value); }
    /// Sets `sps_max_sub_layers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(byte value) { sps_max_sub_layers_minus1(this.segment(), 0L, value); return this; }

    /// {@return `sps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte sps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_seq_parameter_set_id`}
    public byte sps_seq_parameter_set_id() { return sps_seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `sps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sps_seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_sps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(byte value) { sps_seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_depth_luma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_luma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_luma_minus8`}
    public byte bit_depth_luma_minus8() { return bit_depth_luma_minus8(this.segment(), 0L); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_depth_luma_minus8(MemorySegment segment, long index, byte value) { VH_bit_depth_luma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet bit_depth_luma_minus8(byte value) { bit_depth_luma_minus8(this.segment(), 0L, value); return this; }

    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_depth_chroma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_chroma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_chroma_minus8`}
    public byte bit_depth_chroma_minus8() { return bit_depth_chroma_minus8(this.segment(), 0L); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_depth_chroma_minus8(MemorySegment segment, long index, byte value) { VH_bit_depth_chroma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(byte value) { bit_depth_chroma_minus8(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_pic_order_cnt_lsb_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    public byte log2_max_pic_order_cnt_lsb_minus4() { return log2_max_pic_order_cnt_lsb_minus4(this.segment(), 0L); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index, byte value) { VH_log2_max_pic_order_cnt_lsb_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(byte value) { log2_max_pic_order_cnt_lsb_minus4(this.segment(), 0L, value); return this; }

    /// {@return `log2_min_luma_coding_block_size_minus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_min_luma_coding_block_size_minus3(MemorySegment segment, long index) { return (byte) VH_log2_min_luma_coding_block_size_minus3.get(segment, 0L, index); }
    /// {@return `log2_min_luma_coding_block_size_minus3`}
    public byte log2_min_luma_coding_block_size_minus3() { return log2_min_luma_coding_block_size_minus3(this.segment(), 0L); }
    /// Sets `log2_min_luma_coding_block_size_minus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_min_luma_coding_block_size_minus3(MemorySegment segment, long index, byte value) { VH_log2_min_luma_coding_block_size_minus3.set(segment, 0L, index, value); }
    /// Sets `log2_min_luma_coding_block_size_minus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(byte value) { log2_min_luma_coding_block_size_minus3(this.segment(), 0L, value); return this; }

    /// {@return `log2_diff_max_min_luma_coding_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_diff_max_min_luma_coding_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_luma_coding_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_luma_coding_block_size`}
    public byte log2_diff_max_min_luma_coding_block_size() { return log2_diff_max_min_luma_coding_block_size(this.segment(), 0L); }
    /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_diff_max_min_luma_coding_block_size(MemorySegment segment, long index, byte value) { VH_log2_diff_max_min_luma_coding_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(byte value) { log2_diff_max_min_luma_coding_block_size(this.segment(), 0L, value); return this; }

    /// {@return `log2_min_luma_transform_block_size_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_min_luma_transform_block_size_minus2(MemorySegment segment, long index) { return (byte) VH_log2_min_luma_transform_block_size_minus2.get(segment, 0L, index); }
    /// {@return `log2_min_luma_transform_block_size_minus2`}
    public byte log2_min_luma_transform_block_size_minus2() { return log2_min_luma_transform_block_size_minus2(this.segment(), 0L); }
    /// Sets `log2_min_luma_transform_block_size_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_min_luma_transform_block_size_minus2(MemorySegment segment, long index, byte value) { VH_log2_min_luma_transform_block_size_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_min_luma_transform_block_size_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(byte value) { log2_min_luma_transform_block_size_minus2(this.segment(), 0L, value); return this; }

    /// {@return `log2_diff_max_min_luma_transform_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_diff_max_min_luma_transform_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_luma_transform_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_luma_transform_block_size`}
    public byte log2_diff_max_min_luma_transform_block_size() { return log2_diff_max_min_luma_transform_block_size(this.segment(), 0L); }
    /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_diff_max_min_luma_transform_block_size(MemorySegment segment, long index, byte value) { VH_log2_diff_max_min_luma_transform_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(byte value) { log2_diff_max_min_luma_transform_block_size(this.segment(), 0L, value); return this; }

    /// {@return `max_transform_hierarchy_depth_inter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_transform_hierarchy_depth_inter(MemorySegment segment, long index) { return (byte) VH_max_transform_hierarchy_depth_inter.get(segment, 0L, index); }
    /// {@return `max_transform_hierarchy_depth_inter`}
    public byte max_transform_hierarchy_depth_inter() { return max_transform_hierarchy_depth_inter(this.segment(), 0L); }
    /// Sets `max_transform_hierarchy_depth_inter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_transform_hierarchy_depth_inter(MemorySegment segment, long index, byte value) { VH_max_transform_hierarchy_depth_inter.set(segment, 0L, index, value); }
    /// Sets `max_transform_hierarchy_depth_inter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(byte value) { max_transform_hierarchy_depth_inter(this.segment(), 0L, value); return this; }

    /// {@return `max_transform_hierarchy_depth_intra` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_transform_hierarchy_depth_intra(MemorySegment segment, long index) { return (byte) VH_max_transform_hierarchy_depth_intra.get(segment, 0L, index); }
    /// {@return `max_transform_hierarchy_depth_intra`}
    public byte max_transform_hierarchy_depth_intra() { return max_transform_hierarchy_depth_intra(this.segment(), 0L); }
    /// Sets `max_transform_hierarchy_depth_intra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_transform_hierarchy_depth_intra(MemorySegment segment, long index, byte value) { VH_max_transform_hierarchy_depth_intra.set(segment, 0L, index, value); }
    /// Sets `max_transform_hierarchy_depth_intra` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(byte value) { max_transform_hierarchy_depth_intra(this.segment(), 0L, value); return this; }

    /// {@return `num_short_term_ref_pic_sets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_short_term_ref_pic_sets(MemorySegment segment, long index) { return (byte) VH_num_short_term_ref_pic_sets.get(segment, 0L, index); }
    /// {@return `num_short_term_ref_pic_sets`}
    public byte num_short_term_ref_pic_sets() { return num_short_term_ref_pic_sets(this.segment(), 0L); }
    /// Sets `num_short_term_ref_pic_sets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_short_term_ref_pic_sets(MemorySegment segment, long index, byte value) { VH_num_short_term_ref_pic_sets.set(segment, 0L, index, value); }
    /// Sets `num_short_term_ref_pic_sets` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(byte value) { num_short_term_ref_pic_sets(this.segment(), 0L, value); return this; }

    /// {@return `num_long_term_ref_pics_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_long_term_ref_pics_sps(MemorySegment segment, long index) { return (byte) VH_num_long_term_ref_pics_sps.get(segment, 0L, index); }
    /// {@return `num_long_term_ref_pics_sps`}
    public byte num_long_term_ref_pics_sps() { return num_long_term_ref_pics_sps(this.segment(), 0L); }
    /// Sets `num_long_term_ref_pics_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_long_term_ref_pics_sps(MemorySegment segment, long index, byte value) { VH_num_long_term_ref_pics_sps.set(segment, 0L, index, value); }
    /// Sets `num_long_term_ref_pics_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(byte value) { num_long_term_ref_pics_sps(this.segment(), 0L, value); return this; }

    /// {@return `pcm_sample_bit_depth_luma_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pcm_sample_bit_depth_luma_minus1(MemorySegment segment, long index) { return (byte) VH_pcm_sample_bit_depth_luma_minus1.get(segment, 0L, index); }
    /// {@return `pcm_sample_bit_depth_luma_minus1`}
    public byte pcm_sample_bit_depth_luma_minus1() { return pcm_sample_bit_depth_luma_minus1(this.segment(), 0L); }
    /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pcm_sample_bit_depth_luma_minus1(MemorySegment segment, long index, byte value) { VH_pcm_sample_bit_depth_luma_minus1.set(segment, 0L, index, value); }
    /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(byte value) { pcm_sample_bit_depth_luma_minus1(this.segment(), 0L, value); return this; }

    /// {@return `pcm_sample_bit_depth_chroma_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pcm_sample_bit_depth_chroma_minus1(MemorySegment segment, long index) { return (byte) VH_pcm_sample_bit_depth_chroma_minus1.get(segment, 0L, index); }
    /// {@return `pcm_sample_bit_depth_chroma_minus1`}
    public byte pcm_sample_bit_depth_chroma_minus1() { return pcm_sample_bit_depth_chroma_minus1(this.segment(), 0L); }
    /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pcm_sample_bit_depth_chroma_minus1(MemorySegment segment, long index, byte value) { VH_pcm_sample_bit_depth_chroma_minus1.set(segment, 0L, index, value); }
    /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(byte value) { pcm_sample_bit_depth_chroma_minus1(this.segment(), 0L, value); return this; }

    /// {@return `log2_min_pcm_luma_coding_block_size_minus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment, long index) { return (byte) VH_log2_min_pcm_luma_coding_block_size_minus3.get(segment, 0L, index); }
    /// {@return `log2_min_pcm_luma_coding_block_size_minus3`}
    public byte log2_min_pcm_luma_coding_block_size_minus3() { return log2_min_pcm_luma_coding_block_size_minus3(this.segment(), 0L); }
    /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment, long index, byte value) { VH_log2_min_pcm_luma_coding_block_size_minus3.set(segment, 0L, index, value); }
    /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(byte value) { log2_min_pcm_luma_coding_block_size_minus3(this.segment(), 0L, value); return this; }

    /// {@return `log2_diff_max_min_pcm_luma_coding_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_pcm_luma_coding_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_pcm_luma_coding_block_size`}
    public byte log2_diff_max_min_pcm_luma_coding_block_size() { return log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), 0L); }
    /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment, long index, byte value) { VH_log2_diff_max_min_pcm_luma_coding_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(byte value) { log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), 0L, value); return this; }

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
    public StdVideoH265SequenceParameterSet reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

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
    public StdVideoH265SequenceParameterSet reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `palette_max_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte palette_max_size(MemorySegment segment, long index) { return (byte) VH_palette_max_size.get(segment, 0L, index); }
    /// {@return `palette_max_size`}
    public byte palette_max_size() { return palette_max_size(this.segment(), 0L); }
    /// Sets `palette_max_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void palette_max_size(MemorySegment segment, long index, byte value) { VH_palette_max_size.set(segment, 0L, index, value); }
    /// Sets `palette_max_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet palette_max_size(byte value) { palette_max_size(this.segment(), 0L, value); return this; }

    /// {@return `delta_palette_max_predictor_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_palette_max_predictor_size(MemorySegment segment, long index) { return (byte) VH_delta_palette_max_predictor_size.get(segment, 0L, index); }
    /// {@return `delta_palette_max_predictor_size`}
    public byte delta_palette_max_predictor_size() { return delta_palette_max_predictor_size(this.segment(), 0L); }
    /// Sets `delta_palette_max_predictor_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_palette_max_predictor_size(MemorySegment segment, long index, byte value) { VH_delta_palette_max_predictor_size.set(segment, 0L, index, value); }
    /// Sets `delta_palette_max_predictor_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(byte value) { delta_palette_max_predictor_size(this.segment(), 0L, value); return this; }

    /// {@return `motion_vector_resolution_control_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte motion_vector_resolution_control_idc(MemorySegment segment, long index) { return (byte) VH_motion_vector_resolution_control_idc.get(segment, 0L, index); }
    /// {@return `motion_vector_resolution_control_idc`}
    public byte motion_vector_resolution_control_idc() { return motion_vector_resolution_control_idc(this.segment(), 0L); }
    /// Sets `motion_vector_resolution_control_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void motion_vector_resolution_control_idc(MemorySegment segment, long index, byte value) { VH_motion_vector_resolution_control_idc.set(segment, 0L, index, value); }
    /// Sets `motion_vector_resolution_control_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(byte value) { motion_vector_resolution_control_idc(this.segment(), 0L, value); return this; }

    /// {@return `sps_num_palette_predictor_initializers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte sps_num_palette_predictor_initializers_minus1(MemorySegment segment, long index) { return (byte) VH_sps_num_palette_predictor_initializers_minus1.get(segment, 0L, index); }
    /// {@return `sps_num_palette_predictor_initializers_minus1`}
    public byte sps_num_palette_predictor_initializers_minus1() { return sps_num_palette_predictor_initializers_minus1(this.segment(), 0L); }
    /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sps_num_palette_predictor_initializers_minus1(MemorySegment segment, long index, byte value) { VH_sps_num_palette_predictor_initializers_minus1.set(segment, 0L, index, value); }
    /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializers_minus1(byte value) { sps_num_palette_predictor_initializers_minus1(this.segment(), 0L, value); return this; }

    /// {@return `conf_win_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conf_win_left_offset(MemorySegment segment, long index) { return (int) VH_conf_win_left_offset.get(segment, 0L, index); }
    /// {@return `conf_win_left_offset`}
    public int conf_win_left_offset() { return conf_win_left_offset(this.segment(), 0L); }
    /// Sets `conf_win_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conf_win_left_offset(MemorySegment segment, long index, int value) { VH_conf_win_left_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_left_offset(int value) { conf_win_left_offset(this.segment(), 0L, value); return this; }

    /// {@return `conf_win_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conf_win_right_offset(MemorySegment segment, long index) { return (int) VH_conf_win_right_offset.get(segment, 0L, index); }
    /// {@return `conf_win_right_offset`}
    public int conf_win_right_offset() { return conf_win_right_offset(this.segment(), 0L); }
    /// Sets `conf_win_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conf_win_right_offset(MemorySegment segment, long index, int value) { VH_conf_win_right_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_right_offset(int value) { conf_win_right_offset(this.segment(), 0L, value); return this; }

    /// {@return `conf_win_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conf_win_top_offset(MemorySegment segment, long index) { return (int) VH_conf_win_top_offset.get(segment, 0L, index); }
    /// {@return `conf_win_top_offset`}
    public int conf_win_top_offset() { return conf_win_top_offset(this.segment(), 0L); }
    /// Sets `conf_win_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conf_win_top_offset(MemorySegment segment, long index, int value) { VH_conf_win_top_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_top_offset(int value) { conf_win_top_offset(this.segment(), 0L, value); return this; }

    /// {@return `conf_win_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conf_win_bottom_offset(MemorySegment segment, long index) { return (int) VH_conf_win_bottom_offset.get(segment, 0L, index); }
    /// {@return `conf_win_bottom_offset`}
    public int conf_win_bottom_offset() { return conf_win_bottom_offset(this.segment(), 0L); }
    /// Sets `conf_win_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conf_win_bottom_offset(MemorySegment segment, long index, int value) { VH_conf_win_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_bottom_offset(int value) { conf_win_bottom_offset(this.segment(), 0L, value); return this; }

    /// {@return `pProfileTierLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pProfileTierLevel(MemorySegment segment, long index) { return (MemorySegment) VH_pProfileTierLevel.get(segment, 0L, index); }
    /// {@return `pProfileTierLevel`}
    public MemorySegment pProfileTierLevel() { return pProfileTierLevel(this.segment(), 0L); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pProfileTierLevel(MemorySegment segment, long index, MemorySegment value) { VH_pProfileTierLevel.set(segment, 0L, index, value); }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pProfileTierLevel(MemorySegment value) { pProfileTierLevel(this.segment(), 0L, value); return this; }

    /// {@return `pDecPicBufMgr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDecPicBufMgr(MemorySegment segment, long index) { return (MemorySegment) VH_pDecPicBufMgr.get(segment, 0L, index); }
    /// {@return `pDecPicBufMgr`}
    public MemorySegment pDecPicBufMgr() { return pDecPicBufMgr(this.segment(), 0L); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDecPicBufMgr(MemorySegment segment, long index, MemorySegment value) { VH_pDecPicBufMgr.set(segment, 0L, index, value); }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pDecPicBufMgr(MemorySegment value) { pDecPicBufMgr(this.segment(), 0L, value); return this; }

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
    public StdVideoH265SequenceParameterSet pScalingLists(MemorySegment value) { pScalingLists(this.segment(), 0L, value); return this; }

    /// {@return `pShortTermRefPicSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShortTermRefPicSet(MemorySegment segment, long index) { return (MemorySegment) VH_pShortTermRefPicSet.get(segment, 0L, index); }
    /// {@return `pShortTermRefPicSet`}
    public MemorySegment pShortTermRefPicSet() { return pShortTermRefPicSet(this.segment(), 0L); }
    /// Sets `pShortTermRefPicSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShortTermRefPicSet(MemorySegment segment, long index, MemorySegment value) { VH_pShortTermRefPicSet.set(segment, 0L, index, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pShortTermRefPicSet(MemorySegment value) { pShortTermRefPicSet(this.segment(), 0L, value); return this; }

    /// {@return `pLongTermRefPicsSps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLongTermRefPicsSps(MemorySegment segment, long index) { return (MemorySegment) VH_pLongTermRefPicsSps.get(segment, 0L, index); }
    /// {@return `pLongTermRefPicsSps`}
    public MemorySegment pLongTermRefPicsSps() { return pLongTermRefPicsSps(this.segment(), 0L); }
    /// Sets `pLongTermRefPicsSps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLongTermRefPicsSps(MemorySegment segment, long index, MemorySegment value) { VH_pLongTermRefPicsSps.set(segment, 0L, index, value); }
    /// Sets `pLongTermRefPicsSps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pLongTermRefPicsSps(MemorySegment value) { pLongTermRefPicsSps(this.segment(), 0L, value); return this; }

    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSequenceParameterSetVui(MemorySegment segment, long index) { return (MemorySegment) VH_pSequenceParameterSetVui.get(segment, 0L, index); }
    /// {@return `pSequenceParameterSetVui`}
    public MemorySegment pSequenceParameterSetVui() { return pSequenceParameterSetVui(this.segment(), 0L); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSequenceParameterSetVui(MemorySegment segment, long index, MemorySegment value) { VH_pSequenceParameterSetVui.set(segment, 0L, index, value); }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pSequenceParameterSetVui(MemorySegment value) { pSequenceParameterSetVui(this.segment(), 0L, value); return this; }

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
    public StdVideoH265SequenceParameterSet pPredictorPaletteEntries(MemorySegment value) { pPredictorPaletteEntries(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoH265SequenceParameterSet].
    public static final class Buffer extends StdVideoH265SequenceParameterSet {
        private final long elementCount;

        /// Creates `StdVideoH265SequenceParameterSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265SequenceParameterSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265SequenceParameterSet`
        public StdVideoH265SequenceParameterSet asSlice(long index) { return new StdVideoH265SequenceParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265SequenceParameterSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265SequenceParameterSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `chroma_format_idc` at the given index}
        /// @param index the index of the struct buffer
        public int chroma_format_idcAt(long index) { return chroma_format_idc(this.segment(), index); }
        /// Sets `chroma_format_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_format_idcAt(long index, int value) { chroma_format_idc(this.segment(), index, value); return this; }

        /// {@return `pic_width_in_luma_samples` at the given index}
        /// @param index the index of the struct buffer
        public int pic_width_in_luma_samplesAt(long index) { return pic_width_in_luma_samples(this.segment(), index); }
        /// Sets `pic_width_in_luma_samples` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_width_in_luma_samplesAt(long index, int value) { pic_width_in_luma_samples(this.segment(), index, value); return this; }

        /// {@return `pic_height_in_luma_samples` at the given index}
        /// @param index the index of the struct buffer
        public int pic_height_in_luma_samplesAt(long index) { return pic_height_in_luma_samples(this.segment(), index); }
        /// Sets `pic_height_in_luma_samples` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_height_in_luma_samplesAt(long index, int value) { pic_height_in_luma_samples(this.segment(), index, value); return this; }

        /// {@return `sps_video_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte sps_video_parameter_set_idAt(long index) { return sps_video_parameter_set_id(this.segment(), index); }
        /// Sets `sps_video_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sps_video_parameter_set_idAt(long index, byte value) { sps_video_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `sps_max_sub_layers_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte sps_max_sub_layers_minus1At(long index) { return sps_max_sub_layers_minus1(this.segment(), index); }
        /// Sets `sps_max_sub_layers_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sps_max_sub_layers_minus1At(long index, byte value) { sps_max_sub_layers_minus1(this.segment(), index, value); return this; }

        /// {@return `sps_seq_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte sps_seq_parameter_set_idAt(long index) { return sps_seq_parameter_set_id(this.segment(), index); }
        /// Sets `sps_seq_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sps_seq_parameter_set_idAt(long index, byte value) { sps_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `bit_depth_luma_minus8` at the given index}
        /// @param index the index of the struct buffer
        public byte bit_depth_luma_minus8At(long index) { return bit_depth_luma_minus8(this.segment(), index); }
        /// Sets `bit_depth_luma_minus8` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bit_depth_luma_minus8At(long index, byte value) { bit_depth_luma_minus8(this.segment(), index, value); return this; }

        /// {@return `bit_depth_chroma_minus8` at the given index}
        /// @param index the index of the struct buffer
        public byte bit_depth_chroma_minus8At(long index) { return bit_depth_chroma_minus8(this.segment(), index); }
        /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bit_depth_chroma_minus8At(long index, byte value) { bit_depth_chroma_minus8(this.segment(), index, value); return this; }

        /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_max_pic_order_cnt_lsb_minus4At(long index) { return log2_max_pic_order_cnt_lsb_minus4(this.segment(), index); }
        /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_pic_order_cnt_lsb_minus4At(long index, byte value) { log2_max_pic_order_cnt_lsb_minus4(this.segment(), index, value); return this; }

        /// {@return `log2_min_luma_coding_block_size_minus3` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_min_luma_coding_block_size_minus3At(long index) { return log2_min_luma_coding_block_size_minus3(this.segment(), index); }
        /// Sets `log2_min_luma_coding_block_size_minus3` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_luma_coding_block_size_minus3At(long index, byte value) { log2_min_luma_coding_block_size_minus3(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_luma_coding_block_size` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_diff_max_min_luma_coding_block_sizeAt(long index) { return log2_diff_max_min_luma_coding_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_luma_coding_block_sizeAt(long index, byte value) { log2_diff_max_min_luma_coding_block_size(this.segment(), index, value); return this; }

        /// {@return `log2_min_luma_transform_block_size_minus2` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_min_luma_transform_block_size_minus2At(long index) { return log2_min_luma_transform_block_size_minus2(this.segment(), index); }
        /// Sets `log2_min_luma_transform_block_size_minus2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_luma_transform_block_size_minus2At(long index, byte value) { log2_min_luma_transform_block_size_minus2(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_luma_transform_block_size` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_diff_max_min_luma_transform_block_sizeAt(long index) { return log2_diff_max_min_luma_transform_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_luma_transform_block_sizeAt(long index, byte value) { log2_diff_max_min_luma_transform_block_size(this.segment(), index, value); return this; }

        /// {@return `max_transform_hierarchy_depth_inter` at the given index}
        /// @param index the index of the struct buffer
        public byte max_transform_hierarchy_depth_interAt(long index) { return max_transform_hierarchy_depth_inter(this.segment(), index); }
        /// Sets `max_transform_hierarchy_depth_inter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer max_transform_hierarchy_depth_interAt(long index, byte value) { max_transform_hierarchy_depth_inter(this.segment(), index, value); return this; }

        /// {@return `max_transform_hierarchy_depth_intra` at the given index}
        /// @param index the index of the struct buffer
        public byte max_transform_hierarchy_depth_intraAt(long index) { return max_transform_hierarchy_depth_intra(this.segment(), index); }
        /// Sets `max_transform_hierarchy_depth_intra` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer max_transform_hierarchy_depth_intraAt(long index, byte value) { max_transform_hierarchy_depth_intra(this.segment(), index, value); return this; }

        /// {@return `num_short_term_ref_pic_sets` at the given index}
        /// @param index the index of the struct buffer
        public byte num_short_term_ref_pic_setsAt(long index) { return num_short_term_ref_pic_sets(this.segment(), index); }
        /// Sets `num_short_term_ref_pic_sets` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer num_short_term_ref_pic_setsAt(long index, byte value) { num_short_term_ref_pic_sets(this.segment(), index, value); return this; }

        /// {@return `num_long_term_ref_pics_sps` at the given index}
        /// @param index the index of the struct buffer
        public byte num_long_term_ref_pics_spsAt(long index) { return num_long_term_ref_pics_sps(this.segment(), index); }
        /// Sets `num_long_term_ref_pics_sps` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer num_long_term_ref_pics_spsAt(long index, byte value) { num_long_term_ref_pics_sps(this.segment(), index, value); return this; }

        /// {@return `pcm_sample_bit_depth_luma_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte pcm_sample_bit_depth_luma_minus1At(long index) { return pcm_sample_bit_depth_luma_minus1(this.segment(), index); }
        /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pcm_sample_bit_depth_luma_minus1At(long index, byte value) { pcm_sample_bit_depth_luma_minus1(this.segment(), index, value); return this; }

        /// {@return `pcm_sample_bit_depth_chroma_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte pcm_sample_bit_depth_chroma_minus1At(long index) { return pcm_sample_bit_depth_chroma_minus1(this.segment(), index); }
        /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pcm_sample_bit_depth_chroma_minus1At(long index, byte value) { pcm_sample_bit_depth_chroma_minus1(this.segment(), index, value); return this; }

        /// {@return `log2_min_pcm_luma_coding_block_size_minus3` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_min_pcm_luma_coding_block_size_minus3At(long index) { return log2_min_pcm_luma_coding_block_size_minus3(this.segment(), index); }
        /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_pcm_luma_coding_block_size_minus3At(long index, byte value) { log2_min_pcm_luma_coding_block_size_minus3(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_pcm_luma_coding_block_size` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_diff_max_min_pcm_luma_coding_block_sizeAt(long index) { return log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_pcm_luma_coding_block_sizeAt(long index, byte value) { log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved1At(long index) { return reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved2At(long index) { return reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

        /// {@return `palette_max_size` at the given index}
        /// @param index the index of the struct buffer
        public byte palette_max_sizeAt(long index) { return palette_max_size(this.segment(), index); }
        /// Sets `palette_max_size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer palette_max_sizeAt(long index, byte value) { palette_max_size(this.segment(), index, value); return this; }

        /// {@return `delta_palette_max_predictor_size` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_palette_max_predictor_sizeAt(long index) { return delta_palette_max_predictor_size(this.segment(), index); }
        /// Sets `delta_palette_max_predictor_size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_palette_max_predictor_sizeAt(long index, byte value) { delta_palette_max_predictor_size(this.segment(), index, value); return this; }

        /// {@return `motion_vector_resolution_control_idc` at the given index}
        /// @param index the index of the struct buffer
        public byte motion_vector_resolution_control_idcAt(long index) { return motion_vector_resolution_control_idc(this.segment(), index); }
        /// Sets `motion_vector_resolution_control_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer motion_vector_resolution_control_idcAt(long index, byte value) { motion_vector_resolution_control_idc(this.segment(), index, value); return this; }

        /// {@return `sps_num_palette_predictor_initializers_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte sps_num_palette_predictor_initializers_minus1At(long index) { return sps_num_palette_predictor_initializers_minus1(this.segment(), index); }
        /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sps_num_palette_predictor_initializers_minus1At(long index, byte value) { sps_num_palette_predictor_initializers_minus1(this.segment(), index, value); return this; }

        /// {@return `conf_win_left_offset` at the given index}
        /// @param index the index of the struct buffer
        public int conf_win_left_offsetAt(long index) { return conf_win_left_offset(this.segment(), index); }
        /// Sets `conf_win_left_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_left_offsetAt(long index, int value) { conf_win_left_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_right_offset` at the given index}
        /// @param index the index of the struct buffer
        public int conf_win_right_offsetAt(long index) { return conf_win_right_offset(this.segment(), index); }
        /// Sets `conf_win_right_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_right_offsetAt(long index, int value) { conf_win_right_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_top_offset` at the given index}
        /// @param index the index of the struct buffer
        public int conf_win_top_offsetAt(long index) { return conf_win_top_offset(this.segment(), index); }
        /// Sets `conf_win_top_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_top_offsetAt(long index, int value) { conf_win_top_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_bottom_offset` at the given index}
        /// @param index the index of the struct buffer
        public int conf_win_bottom_offsetAt(long index) { return conf_win_bottom_offset(this.segment(), index); }
        /// Sets `conf_win_bottom_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_bottom_offsetAt(long index, int value) { conf_win_bottom_offset(this.segment(), index, value); return this; }

        /// {@return `pProfileTierLevel` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pProfileTierLevelAt(long index) { return pProfileTierLevel(this.segment(), index); }
        /// Sets `pProfileTierLevel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pProfileTierLevelAt(long index, MemorySegment value) { pProfileTierLevel(this.segment(), index, value); return this; }

        /// {@return `pDecPicBufMgr` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDecPicBufMgrAt(long index) { return pDecPicBufMgr(this.segment(), index); }
        /// Sets `pDecPicBufMgr` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDecPicBufMgrAt(long index, MemorySegment value) { pDecPicBufMgr(this.segment(), index, value); return this; }

        /// {@return `pScalingLists` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pScalingListsAt(long index) { return pScalingLists(this.segment(), index); }
        /// Sets `pScalingLists` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pScalingListsAt(long index, MemorySegment value) { pScalingLists(this.segment(), index, value); return this; }

        /// {@return `pShortTermRefPicSet` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pShortTermRefPicSetAt(long index) { return pShortTermRefPicSet(this.segment(), index); }
        /// Sets `pShortTermRefPicSet` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pShortTermRefPicSetAt(long index, MemorySegment value) { pShortTermRefPicSet(this.segment(), index, value); return this; }

        /// {@return `pLongTermRefPicsSps` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLongTermRefPicsSpsAt(long index) { return pLongTermRefPicsSps(this.segment(), index); }
        /// Sets `pLongTermRefPicsSps` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLongTermRefPicsSpsAt(long index, MemorySegment value) { pLongTermRefPicsSps(this.segment(), index, value); return this; }

        /// {@return `pSequenceParameterSetVui` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSequenceParameterSetVuiAt(long index) { return pSequenceParameterSetVui(this.segment(), index); }
        /// Sets `pSequenceParameterSetVui` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSequenceParameterSetVuiAt(long index, MemorySegment value) { pSequenceParameterSetVui(this.segment(), index, value); return this; }

        /// {@return `pPredictorPaletteEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPredictorPaletteEntriesAt(long index) { return pPredictorPaletteEntries(this.segment(), index); }
        /// Sets `pPredictorPaletteEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPredictorPaletteEntriesAt(long index, MemorySegment value) { pPredictorPaletteEntries(this.segment(), index, value); return this; }

    }
}
