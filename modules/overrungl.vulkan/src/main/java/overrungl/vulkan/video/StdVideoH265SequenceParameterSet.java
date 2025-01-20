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
/// ### chroma_format_idc
/// [VarHandle][#VH_chroma_format_idc] - [Getter][#chroma_format_idc()] - [Setter][#chroma_format_idc(int)]
/// ### pic_width_in_luma_samples
/// [VarHandle][#VH_pic_width_in_luma_samples] - [Getter][#pic_width_in_luma_samples()] - [Setter][#pic_width_in_luma_samples(int)]
/// ### pic_height_in_luma_samples
/// [VarHandle][#VH_pic_height_in_luma_samples] - [Getter][#pic_height_in_luma_samples()] - [Setter][#pic_height_in_luma_samples(int)]
/// ### sps_video_parameter_set_id
/// [VarHandle][#VH_sps_video_parameter_set_id] - [Getter][#sps_video_parameter_set_id()] - [Setter][#sps_video_parameter_set_id(byte)]
/// ### sps_max_sub_layers_minus1
/// [VarHandle][#VH_sps_max_sub_layers_minus1] - [Getter][#sps_max_sub_layers_minus1()] - [Setter][#sps_max_sub_layers_minus1(byte)]
/// ### sps_seq_parameter_set_id
/// [VarHandle][#VH_sps_seq_parameter_set_id] - [Getter][#sps_seq_parameter_set_id()] - [Setter][#sps_seq_parameter_set_id(byte)]
/// ### bit_depth_luma_minus8
/// [VarHandle][#VH_bit_depth_luma_minus8] - [Getter][#bit_depth_luma_minus8()] - [Setter][#bit_depth_luma_minus8(byte)]
/// ### bit_depth_chroma_minus8
/// [VarHandle][#VH_bit_depth_chroma_minus8] - [Getter][#bit_depth_chroma_minus8()] - [Setter][#bit_depth_chroma_minus8(byte)]
/// ### log2_max_pic_order_cnt_lsb_minus4
/// [VarHandle][#VH_log2_max_pic_order_cnt_lsb_minus4] - [Getter][#log2_max_pic_order_cnt_lsb_minus4()] - [Setter][#log2_max_pic_order_cnt_lsb_minus4(byte)]
/// ### log2_min_luma_coding_block_size_minus3
/// [VarHandle][#VH_log2_min_luma_coding_block_size_minus3] - [Getter][#log2_min_luma_coding_block_size_minus3()] - [Setter][#log2_min_luma_coding_block_size_minus3(byte)]
/// ### log2_diff_max_min_luma_coding_block_size
/// [VarHandle][#VH_log2_diff_max_min_luma_coding_block_size] - [Getter][#log2_diff_max_min_luma_coding_block_size()] - [Setter][#log2_diff_max_min_luma_coding_block_size(byte)]
/// ### log2_min_luma_transform_block_size_minus2
/// [VarHandle][#VH_log2_min_luma_transform_block_size_minus2] - [Getter][#log2_min_luma_transform_block_size_minus2()] - [Setter][#log2_min_luma_transform_block_size_minus2(byte)]
/// ### log2_diff_max_min_luma_transform_block_size
/// [VarHandle][#VH_log2_diff_max_min_luma_transform_block_size] - [Getter][#log2_diff_max_min_luma_transform_block_size()] - [Setter][#log2_diff_max_min_luma_transform_block_size(byte)]
/// ### max_transform_hierarchy_depth_inter
/// [VarHandle][#VH_max_transform_hierarchy_depth_inter] - [Getter][#max_transform_hierarchy_depth_inter()] - [Setter][#max_transform_hierarchy_depth_inter(byte)]
/// ### max_transform_hierarchy_depth_intra
/// [VarHandle][#VH_max_transform_hierarchy_depth_intra] - [Getter][#max_transform_hierarchy_depth_intra()] - [Setter][#max_transform_hierarchy_depth_intra(byte)]
/// ### num_short_term_ref_pic_sets
/// [VarHandle][#VH_num_short_term_ref_pic_sets] - [Getter][#num_short_term_ref_pic_sets()] - [Setter][#num_short_term_ref_pic_sets(byte)]
/// ### num_long_term_ref_pics_sps
/// [VarHandle][#VH_num_long_term_ref_pics_sps] - [Getter][#num_long_term_ref_pics_sps()] - [Setter][#num_long_term_ref_pics_sps(byte)]
/// ### pcm_sample_bit_depth_luma_minus1
/// [VarHandle][#VH_pcm_sample_bit_depth_luma_minus1] - [Getter][#pcm_sample_bit_depth_luma_minus1()] - [Setter][#pcm_sample_bit_depth_luma_minus1(byte)]
/// ### pcm_sample_bit_depth_chroma_minus1
/// [VarHandle][#VH_pcm_sample_bit_depth_chroma_minus1] - [Getter][#pcm_sample_bit_depth_chroma_minus1()] - [Setter][#pcm_sample_bit_depth_chroma_minus1(byte)]
/// ### log2_min_pcm_luma_coding_block_size_minus3
/// [VarHandle][#VH_log2_min_pcm_luma_coding_block_size_minus3] - [Getter][#log2_min_pcm_luma_coding_block_size_minus3()] - [Setter][#log2_min_pcm_luma_coding_block_size_minus3(byte)]
/// ### log2_diff_max_min_pcm_luma_coding_block_size
/// [VarHandle][#VH_log2_diff_max_min_pcm_luma_coding_block_size] - [Getter][#log2_diff_max_min_pcm_luma_coding_block_size()] - [Setter][#log2_diff_max_min_pcm_luma_coding_block_size(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### palette_max_size
/// [VarHandle][#VH_palette_max_size] - [Getter][#palette_max_size()] - [Setter][#palette_max_size(byte)]
/// ### delta_palette_max_predictor_size
/// [VarHandle][#VH_delta_palette_max_predictor_size] - [Getter][#delta_palette_max_predictor_size()] - [Setter][#delta_palette_max_predictor_size(byte)]
/// ### motion_vector_resolution_control_idc
/// [VarHandle][#VH_motion_vector_resolution_control_idc] - [Getter][#motion_vector_resolution_control_idc()] - [Setter][#motion_vector_resolution_control_idc(byte)]
/// ### sps_num_palette_predictor_initializers_minus1
/// [VarHandle][#VH_sps_num_palette_predictor_initializers_minus1] - [Getter][#sps_num_palette_predictor_initializers_minus1()] - [Setter][#sps_num_palette_predictor_initializers_minus1(byte)]
/// ### conf_win_left_offset
/// [VarHandle][#VH_conf_win_left_offset] - [Getter][#conf_win_left_offset()] - [Setter][#conf_win_left_offset(int)]
/// ### conf_win_right_offset
/// [VarHandle][#VH_conf_win_right_offset] - [Getter][#conf_win_right_offset()] - [Setter][#conf_win_right_offset(int)]
/// ### conf_win_top_offset
/// [VarHandle][#VH_conf_win_top_offset] - [Getter][#conf_win_top_offset()] - [Setter][#conf_win_top_offset(int)]
/// ### conf_win_bottom_offset
/// [VarHandle][#VH_conf_win_bottom_offset] - [Getter][#conf_win_bottom_offset()] - [Setter][#conf_win_bottom_offset(int)]
/// ### pProfileTierLevel
/// [VarHandle][#VH_pProfileTierLevel] - [Getter][#pProfileTierLevel()] - [Setter][#pProfileTierLevel(MemorySegment)]
/// ### pDecPicBufMgr
/// [VarHandle][#VH_pDecPicBufMgr] - [Getter][#pDecPicBufMgr()] - [Setter][#pDecPicBufMgr(MemorySegment)]
/// ### pScalingLists
/// [VarHandle][#VH_pScalingLists] - [Getter][#pScalingLists()] - [Setter][#pScalingLists(MemorySegment)]
/// ### pShortTermRefPicSet
/// [VarHandle][#VH_pShortTermRefPicSet] - [Getter][#pShortTermRefPicSet()] - [Setter][#pShortTermRefPicSet(MemorySegment)]
/// ### pLongTermRefPicsSps
/// [VarHandle][#VH_pLongTermRefPicsSps] - [Getter][#pLongTermRefPicsSps()] - [Setter][#pLongTermRefPicsSps(MemorySegment)]
/// ### pSequenceParameterSetVui
/// [VarHandle][#VH_pSequenceParameterSetVui] - [Getter][#pSequenceParameterSetVui()] - [Setter][#pSequenceParameterSetVui(MemorySegment)]
/// ### pPredictorPaletteEntries
/// [VarHandle][#VH_pPredictorPaletteEntries] - [Getter][#pPredictorPaletteEntries()] - [Setter][#pPredictorPaletteEntries(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265SequenceParameterSet {
///     StdVideoH265SpsFlags flags;
///     StdVideoH265ChromaFormatIdc chroma_format_idc;
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
///     const StdVideoH265ProfileTierLevel * pProfileTierLevel;
///     const StdVideoH265DecPicBufMgr * pDecPicBufMgr;
///     const StdVideoH265ScalingLists * pScalingLists;
///     const StdVideoH265ShortTermRefPicSet * pShortTermRefPicSet;
///     const StdVideoH265LongTermRefPicsSps * pLongTermRefPicsSps;
///     const StdVideoH265SequenceParameterSetVui * pSequenceParameterSetVui;
///     const StdVideoH265PredictorPaletteEntries * pPredictorPaletteEntries;
/// } StdVideoH265SequenceParameterSet;
/// ```
public sealed class StdVideoH265SequenceParameterSet extends Struct {
    /// The struct layout of `StdVideoH265SequenceParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265SpsFlags.LAYOUT.withName("flags"),
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
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `chroma_format_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_format_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_format_idc"));
    /// The [VarHandle] of `pic_width_in_luma_samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_width_in_luma_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_width_in_luma_samples"));
    /// The [VarHandle] of `pic_height_in_luma_samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_height_in_luma_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_height_in_luma_samples"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `sps_max_sub_layers_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_max_sub_layers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_max_sub_layers_minus1"));
    /// The [VarHandle] of `sps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_seq_parameter_set_id"));
    /// The [VarHandle] of `bit_depth_luma_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_depth_luma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The [VarHandle] of `bit_depth_chroma_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_depth_chroma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The [VarHandle] of `log2_max_pic_order_cnt_lsb_minus4` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The [VarHandle] of `log2_min_luma_coding_block_size_minus3` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_min_luma_coding_block_size_minus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
    /// The [VarHandle] of `log2_diff_max_min_luma_coding_block_size` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_diff_max_min_luma_coding_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
    /// The [VarHandle] of `log2_min_luma_transform_block_size_minus2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_min_luma_transform_block_size_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
    /// The [VarHandle] of `log2_diff_max_min_luma_transform_block_size` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_diff_max_min_luma_transform_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
    /// The [VarHandle] of `max_transform_hierarchy_depth_inter` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_transform_hierarchy_depth_inter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
    /// The [VarHandle] of `max_transform_hierarchy_depth_intra` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_transform_hierarchy_depth_intra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
    /// The [VarHandle] of `num_short_term_ref_pic_sets` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_short_term_ref_pic_sets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_short_term_ref_pic_sets"));
    /// The [VarHandle] of `num_long_term_ref_pics_sps` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_long_term_ref_pics_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_ref_pics_sps"));
    /// The [VarHandle] of `pcm_sample_bit_depth_luma_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pcm_sample_bit_depth_luma_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
    /// The [VarHandle] of `pcm_sample_bit_depth_chroma_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pcm_sample_bit_depth_chroma_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
    /// The [VarHandle] of `log2_min_pcm_luma_coding_block_size_minus3` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
    /// The [VarHandle] of `log2_diff_max_min_pcm_luma_coding_block_size` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `palette_max_size` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_palette_max_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("palette_max_size"));
    /// The [VarHandle] of `delta_palette_max_predictor_size` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_delta_palette_max_predictor_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_palette_max_predictor_size"));
    /// The [VarHandle] of `motion_vector_resolution_control_idc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_motion_vector_resolution_control_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("motion_vector_resolution_control_idc"));
    /// The [VarHandle] of `sps_num_palette_predictor_initializers_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_sps_num_palette_predictor_initializers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
    /// The [VarHandle] of `conf_win_left_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conf_win_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_left_offset"));
    /// The [VarHandle] of `conf_win_right_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conf_win_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_right_offset"));
    /// The [VarHandle] of `conf_win_top_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conf_win_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_top_offset"));
    /// The [VarHandle] of `conf_win_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conf_win_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conf_win_bottom_offset"));
    /// The [VarHandle] of `pProfileTierLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pProfileTierLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfileTierLevel"));
    /// The [VarHandle] of `pDecPicBufMgr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDecPicBufMgr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDecPicBufMgr"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pShortTermRefPicSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShortTermRefPicSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShortTermRefPicSet"));
    /// The [VarHandle] of `pLongTermRefPicsSps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLongTermRefPicsSps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLongTermRefPicsSps"));
    /// The [VarHandle] of `pSequenceParameterSetVui` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSequenceParameterSetVui = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The [VarHandle] of `pPredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPredictorPaletteEntries"));

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SequenceParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSet(segment); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SequenceParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSet`
    public static StdVideoH265SequenceParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265SequenceParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SequenceParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SequenceParameterSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265SequenceParameterSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSet`
    public static StdVideoH265SequenceParameterSet allocInit(SegmentAllocator allocator, @CType("StdVideoH265SpsFlags") MemorySegment flags, @CType("StdVideoH265ChromaFormatIdc") int chroma_format_idc, @CType("uint32_t") int pic_width_in_luma_samples, @CType("uint32_t") int pic_height_in_luma_samples, @CType("uint8_t") byte sps_video_parameter_set_id, @CType("uint8_t") byte sps_max_sub_layers_minus1, @CType("uint8_t") byte sps_seq_parameter_set_id, @CType("uint8_t") byte bit_depth_luma_minus8, @CType("uint8_t") byte bit_depth_chroma_minus8, @CType("uint8_t") byte log2_max_pic_order_cnt_lsb_minus4, @CType("uint8_t") byte log2_min_luma_coding_block_size_minus3, @CType("uint8_t") byte log2_diff_max_min_luma_coding_block_size, @CType("uint8_t") byte log2_min_luma_transform_block_size_minus2, @CType("uint8_t") byte log2_diff_max_min_luma_transform_block_size, @CType("uint8_t") byte max_transform_hierarchy_depth_inter, @CType("uint8_t") byte max_transform_hierarchy_depth_intra, @CType("uint8_t") byte num_short_term_ref_pic_sets, @CType("uint8_t") byte num_long_term_ref_pics_sps, @CType("uint8_t") byte pcm_sample_bit_depth_luma_minus1, @CType("uint8_t") byte pcm_sample_bit_depth_chroma_minus1, @CType("uint8_t") byte log2_min_pcm_luma_coding_block_size_minus3, @CType("uint8_t") byte log2_diff_max_min_pcm_luma_coding_block_size, @CType("uint8_t") byte reserved1, @CType("uint8_t") byte reserved2, @CType("uint8_t") byte palette_max_size, @CType("uint8_t") byte delta_palette_max_predictor_size, @CType("uint8_t") byte motion_vector_resolution_control_idc, @CType("uint8_t") byte sps_num_palette_predictor_initializers_minus1, @CType("uint32_t") int conf_win_left_offset, @CType("uint32_t") int conf_win_right_offset, @CType("uint32_t") int conf_win_top_offset, @CType("uint32_t") int conf_win_bottom_offset, @CType("const StdVideoH265ProfileTierLevel *") MemorySegment pProfileTierLevel, @CType("const StdVideoH265DecPicBufMgr *") MemorySegment pDecPicBufMgr, @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingLists, @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment pShortTermRefPicSet, @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment pLongTermRefPicsSps, @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment pSequenceParameterSetVui, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntries) { return alloc(allocator).flags(flags).chroma_format_idc(chroma_format_idc).pic_width_in_luma_samples(pic_width_in_luma_samples).pic_height_in_luma_samples(pic_height_in_luma_samples).sps_video_parameter_set_id(sps_video_parameter_set_id).sps_max_sub_layers_minus1(sps_max_sub_layers_minus1).sps_seq_parameter_set_id(sps_seq_parameter_set_id).bit_depth_luma_minus8(bit_depth_luma_minus8).bit_depth_chroma_minus8(bit_depth_chroma_minus8).log2_max_pic_order_cnt_lsb_minus4(log2_max_pic_order_cnt_lsb_minus4).log2_min_luma_coding_block_size_minus3(log2_min_luma_coding_block_size_minus3).log2_diff_max_min_luma_coding_block_size(log2_diff_max_min_luma_coding_block_size).log2_min_luma_transform_block_size_minus2(log2_min_luma_transform_block_size_minus2).log2_diff_max_min_luma_transform_block_size(log2_diff_max_min_luma_transform_block_size).max_transform_hierarchy_depth_inter(max_transform_hierarchy_depth_inter).max_transform_hierarchy_depth_intra(max_transform_hierarchy_depth_intra).num_short_term_ref_pic_sets(num_short_term_ref_pic_sets).num_long_term_ref_pics_sps(num_long_term_ref_pics_sps).pcm_sample_bit_depth_luma_minus1(pcm_sample_bit_depth_luma_minus1).pcm_sample_bit_depth_chroma_minus1(pcm_sample_bit_depth_chroma_minus1).log2_min_pcm_luma_coding_block_size_minus3(log2_min_pcm_luma_coding_block_size_minus3).log2_diff_max_min_pcm_luma_coding_block_size(log2_diff_max_min_pcm_luma_coding_block_size).reserved1(reserved1).reserved2(reserved2).palette_max_size(palette_max_size).delta_palette_max_predictor_size(delta_palette_max_predictor_size).motion_vector_resolution_control_idc(motion_vector_resolution_control_idc).sps_num_palette_predictor_initializers_minus1(sps_num_palette_predictor_initializers_minus1).conf_win_left_offset(conf_win_left_offset).conf_win_right_offset(conf_win_right_offset).conf_win_top_offset(conf_win_top_offset).conf_win_bottom_offset(conf_win_bottom_offset).pProfileTierLevel(pProfileTierLevel).pDecPicBufMgr(pDecPicBufMgr).pScalingLists(pScalingLists).pShortTermRefPicSet(pShortTermRefPicSet).pLongTermRefPicsSps(pLongTermRefPicsSps).pSequenceParameterSetVui(pSequenceParameterSetVui).pPredictorPaletteEntries(pPredictorPaletteEntries); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SequenceParameterSet copyFrom(StdVideoH265SequenceParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265SpsFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265SpsFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265SpsFlags") MemorySegment flags() { return StdVideoH265SequenceParameterSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265SpsFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265SpsFlags") MemorySegment value) { StdVideoH265SequenceParameterSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet flags(@CType("StdVideoH265SpsFlags") MemorySegment value) { StdVideoH265SequenceParameterSet.set_flags(this.segment(), value); return this; }

    /// {@return `chroma_format_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265ChromaFormatIdc") int get_chroma_format_idc(MemorySegment segment, long index) { return (int) VH_chroma_format_idc.get(segment, 0L, index); }
    /// {@return `chroma_format_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265ChromaFormatIdc") int get_chroma_format_idc(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_chroma_format_idc(segment, 0L); }
    /// {@return `chroma_format_idc`}
    public @CType("StdVideoH265ChromaFormatIdc") int chroma_format_idc() { return StdVideoH265SequenceParameterSet.get_chroma_format_idc(this.segment()); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_format_idc(MemorySegment segment, long index, @CType("StdVideoH265ChromaFormatIdc") int value) { VH_chroma_format_idc.set(segment, 0L, index, value); }
    /// Sets `chroma_format_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_format_idc(MemorySegment segment, @CType("StdVideoH265ChromaFormatIdc") int value) { StdVideoH265SequenceParameterSet.set_chroma_format_idc(segment, 0L, value); }
    /// Sets `chroma_format_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet chroma_format_idc(@CType("StdVideoH265ChromaFormatIdc") int value) { StdVideoH265SequenceParameterSet.set_chroma_format_idc(this.segment(), value); return this; }

    /// {@return `pic_width_in_luma_samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pic_width_in_luma_samples(MemorySegment segment, long index) { return (int) VH_pic_width_in_luma_samples.get(segment, 0L, index); }
    /// {@return `pic_width_in_luma_samples`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pic_width_in_luma_samples(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pic_width_in_luma_samples(segment, 0L); }
    /// {@return `pic_width_in_luma_samples`}
    public @CType("uint32_t") int pic_width_in_luma_samples() { return StdVideoH265SequenceParameterSet.get_pic_width_in_luma_samples(this.segment()); }
    /// Sets `pic_width_in_luma_samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_width_in_luma_samples(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pic_width_in_luma_samples.set(segment, 0L, index, value); }
    /// Sets `pic_width_in_luma_samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_width_in_luma_samples(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_width_in_luma_samples(segment, 0L, value); }
    /// Sets `pic_width_in_luma_samples` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pic_width_in_luma_samples(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_width_in_luma_samples(this.segment(), value); return this; }

    /// {@return `pic_height_in_luma_samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pic_height_in_luma_samples(MemorySegment segment, long index) { return (int) VH_pic_height_in_luma_samples.get(segment, 0L, index); }
    /// {@return `pic_height_in_luma_samples`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pic_height_in_luma_samples(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pic_height_in_luma_samples(segment, 0L); }
    /// {@return `pic_height_in_luma_samples`}
    public @CType("uint32_t") int pic_height_in_luma_samples() { return StdVideoH265SequenceParameterSet.get_pic_height_in_luma_samples(this.segment()); }
    /// Sets `pic_height_in_luma_samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_height_in_luma_samples(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pic_height_in_luma_samples.set(segment, 0L, index, value); }
    /// Sets `pic_height_in_luma_samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_height_in_luma_samples(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_height_in_luma_samples(segment, 0L, value); }
    /// Sets `pic_height_in_luma_samples` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pic_height_in_luma_samples(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_height_in_luma_samples(this.segment(), value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_video_parameter_set_id(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_sps_video_parameter_set_id(segment, 0L); }
    /// {@return `sps_video_parameter_set_id`}
    public @CType("uint8_t") byte sps_video_parameter_set_id() { return StdVideoH265SequenceParameterSet.get_sps_video_parameter_set_id(this.segment()); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_video_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_video_parameter_set_id(segment, 0L, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_video_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_video_parameter_set_id(this.segment(), value); return this; }

    /// {@return `sps_max_sub_layers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_max_sub_layers_minus1(MemorySegment segment, long index) { return (byte) VH_sps_max_sub_layers_minus1.get(segment, 0L, index); }
    /// {@return `sps_max_sub_layers_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_max_sub_layers_minus1(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_sps_max_sub_layers_minus1(segment, 0L); }
    /// {@return `sps_max_sub_layers_minus1`}
    public @CType("uint8_t") byte sps_max_sub_layers_minus1() { return StdVideoH265SequenceParameterSet.get_sps_max_sub_layers_minus1(this.segment()); }
    /// Sets `sps_max_sub_layers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_max_sub_layers_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_max_sub_layers_minus1.set(segment, 0L, index, value); }
    /// Sets `sps_max_sub_layers_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_max_sub_layers_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_max_sub_layers_minus1(segment, 0L, value); }
    /// Sets `sps_max_sub_layers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_max_sub_layers_minus1(this.segment(), value); return this; }

    /// {@return `sps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_seq_parameter_set_id(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_sps_seq_parameter_set_id(segment, 0L); }
    /// {@return `sps_seq_parameter_set_id`}
    public @CType("uint8_t") byte sps_seq_parameter_set_id() { return StdVideoH265SequenceParameterSet.get_sps_seq_parameter_set_id(this.segment()); }
    /// Sets `sps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `sps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_depth_luma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_luma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_luma_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_depth_luma_minus8(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_bit_depth_luma_minus8(segment, 0L); }
    /// {@return `bit_depth_luma_minus8`}
    public @CType("uint8_t") byte bit_depth_luma_minus8() { return StdVideoH265SequenceParameterSet.get_bit_depth_luma_minus8(this.segment()); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_depth_luma_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_depth_luma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_depth_luma_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_luma_minus8(segment, 0L, value); }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet bit_depth_luma_minus8(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_luma_minus8(this.segment(), value); return this; }

    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_depth_chroma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_chroma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_chroma_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_depth_chroma_minus8(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_bit_depth_chroma_minus8(segment, 0L); }
    /// {@return `bit_depth_chroma_minus8`}
    public @CType("uint8_t") byte bit_depth_chroma_minus8() { return StdVideoH265SequenceParameterSet.get_bit_depth_chroma_minus8(this.segment()); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_depth_chroma_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_depth_chroma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_depth_chroma_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_chroma_minus8(segment, 0L, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_chroma_minus8(this.segment(), value); return this; }

    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_pic_order_cnt_lsb_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(segment, 0L); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    public @CType("uint8_t") byte log2_max_pic_order_cnt_lsb_minus4() { return StdVideoH265SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(this.segment()); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_pic_order_cnt_lsb_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(segment, 0L, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(this.segment(), value); return this; }

    /// {@return `log2_min_luma_coding_block_size_minus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_min_luma_coding_block_size_minus3(MemorySegment segment, long index) { return (byte) VH_log2_min_luma_coding_block_size_minus3.get(segment, 0L, index); }
    /// {@return `log2_min_luma_coding_block_size_minus3`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_min_luma_coding_block_size_minus3(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_min_luma_coding_block_size_minus3(segment, 0L); }
    /// {@return `log2_min_luma_coding_block_size_minus3`}
    public @CType("uint8_t") byte log2_min_luma_coding_block_size_minus3() { return StdVideoH265SequenceParameterSet.get_log2_min_luma_coding_block_size_minus3(this.segment()); }
    /// Sets `log2_min_luma_coding_block_size_minus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_min_luma_coding_block_size_minus3(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_min_luma_coding_block_size_minus3.set(segment, 0L, index, value); }
    /// Sets `log2_min_luma_coding_block_size_minus3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_min_luma_coding_block_size_minus3(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_coding_block_size_minus3(segment, 0L, value); }
    /// Sets `log2_min_luma_coding_block_size_minus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_coding_block_size_minus3(this.segment(), value); return this; }

    /// {@return `log2_diff_max_min_luma_coding_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_diff_max_min_luma_coding_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_luma_coding_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_luma_coding_block_size`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_diff_max_min_luma_coding_block_size(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_coding_block_size(segment, 0L); }
    /// {@return `log2_diff_max_min_luma_coding_block_size`}
    public @CType("uint8_t") byte log2_diff_max_min_luma_coding_block_size() { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_coding_block_size(this.segment()); }
    /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_diff_max_min_luma_coding_block_size(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_diff_max_min_luma_coding_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_diff_max_min_luma_coding_block_size(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_coding_block_size(segment, 0L, value); }
    /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_coding_block_size(this.segment(), value); return this; }

    /// {@return `log2_min_luma_transform_block_size_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_min_luma_transform_block_size_minus2(MemorySegment segment, long index) { return (byte) VH_log2_min_luma_transform_block_size_minus2.get(segment, 0L, index); }
    /// {@return `log2_min_luma_transform_block_size_minus2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_min_luma_transform_block_size_minus2(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_min_luma_transform_block_size_minus2(segment, 0L); }
    /// {@return `log2_min_luma_transform_block_size_minus2`}
    public @CType("uint8_t") byte log2_min_luma_transform_block_size_minus2() { return StdVideoH265SequenceParameterSet.get_log2_min_luma_transform_block_size_minus2(this.segment()); }
    /// Sets `log2_min_luma_transform_block_size_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_min_luma_transform_block_size_minus2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_min_luma_transform_block_size_minus2.set(segment, 0L, index, value); }
    /// Sets `log2_min_luma_transform_block_size_minus2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_min_luma_transform_block_size_minus2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_transform_block_size_minus2(segment, 0L, value); }
    /// Sets `log2_min_luma_transform_block_size_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_transform_block_size_minus2(this.segment(), value); return this; }

    /// {@return `log2_diff_max_min_luma_transform_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_diff_max_min_luma_transform_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_luma_transform_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_luma_transform_block_size`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_diff_max_min_luma_transform_block_size(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_transform_block_size(segment, 0L); }
    /// {@return `log2_diff_max_min_luma_transform_block_size`}
    public @CType("uint8_t") byte log2_diff_max_min_luma_transform_block_size() { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_transform_block_size(this.segment()); }
    /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_diff_max_min_luma_transform_block_size(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_diff_max_min_luma_transform_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_diff_max_min_luma_transform_block_size(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_transform_block_size(segment, 0L, value); }
    /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_transform_block_size(this.segment(), value); return this; }

    /// {@return `max_transform_hierarchy_depth_inter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_transform_hierarchy_depth_inter(MemorySegment segment, long index) { return (byte) VH_max_transform_hierarchy_depth_inter.get(segment, 0L, index); }
    /// {@return `max_transform_hierarchy_depth_inter`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_transform_hierarchy_depth_inter(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_inter(segment, 0L); }
    /// {@return `max_transform_hierarchy_depth_inter`}
    public @CType("uint8_t") byte max_transform_hierarchy_depth_inter() { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_inter(this.segment()); }
    /// Sets `max_transform_hierarchy_depth_inter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_transform_hierarchy_depth_inter(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_transform_hierarchy_depth_inter.set(segment, 0L, index, value); }
    /// Sets `max_transform_hierarchy_depth_inter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_transform_hierarchy_depth_inter(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_inter(segment, 0L, value); }
    /// Sets `max_transform_hierarchy_depth_inter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_inter(this.segment(), value); return this; }

    /// {@return `max_transform_hierarchy_depth_intra` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_transform_hierarchy_depth_intra(MemorySegment segment, long index) { return (byte) VH_max_transform_hierarchy_depth_intra.get(segment, 0L, index); }
    /// {@return `max_transform_hierarchy_depth_intra`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_transform_hierarchy_depth_intra(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_intra(segment, 0L); }
    /// {@return `max_transform_hierarchy_depth_intra`}
    public @CType("uint8_t") byte max_transform_hierarchy_depth_intra() { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_intra(this.segment()); }
    /// Sets `max_transform_hierarchy_depth_intra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_transform_hierarchy_depth_intra(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_transform_hierarchy_depth_intra.set(segment, 0L, index, value); }
    /// Sets `max_transform_hierarchy_depth_intra` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_transform_hierarchy_depth_intra(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_intra(segment, 0L, value); }
    /// Sets `max_transform_hierarchy_depth_intra` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_intra(this.segment(), value); return this; }

    /// {@return `num_short_term_ref_pic_sets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_short_term_ref_pic_sets(MemorySegment segment, long index) { return (byte) VH_num_short_term_ref_pic_sets.get(segment, 0L, index); }
    /// {@return `num_short_term_ref_pic_sets`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_short_term_ref_pic_sets(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_num_short_term_ref_pic_sets(segment, 0L); }
    /// {@return `num_short_term_ref_pic_sets`}
    public @CType("uint8_t") byte num_short_term_ref_pic_sets() { return StdVideoH265SequenceParameterSet.get_num_short_term_ref_pic_sets(this.segment()); }
    /// Sets `num_short_term_ref_pic_sets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_short_term_ref_pic_sets(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_short_term_ref_pic_sets.set(segment, 0L, index, value); }
    /// Sets `num_short_term_ref_pic_sets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_short_term_ref_pic_sets(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_short_term_ref_pic_sets(segment, 0L, value); }
    /// Sets `num_short_term_ref_pic_sets` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_short_term_ref_pic_sets(this.segment(), value); return this; }

    /// {@return `num_long_term_ref_pics_sps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_long_term_ref_pics_sps(MemorySegment segment, long index) { return (byte) VH_num_long_term_ref_pics_sps.get(segment, 0L, index); }
    /// {@return `num_long_term_ref_pics_sps`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_long_term_ref_pics_sps(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_num_long_term_ref_pics_sps(segment, 0L); }
    /// {@return `num_long_term_ref_pics_sps`}
    public @CType("uint8_t") byte num_long_term_ref_pics_sps() { return StdVideoH265SequenceParameterSet.get_num_long_term_ref_pics_sps(this.segment()); }
    /// Sets `num_long_term_ref_pics_sps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_long_term_ref_pics_sps(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_long_term_ref_pics_sps.set(segment, 0L, index, value); }
    /// Sets `num_long_term_ref_pics_sps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_long_term_ref_pics_sps(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_long_term_ref_pics_sps(segment, 0L, value); }
    /// Sets `num_long_term_ref_pics_sps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_long_term_ref_pics_sps(this.segment(), value); return this; }

    /// {@return `pcm_sample_bit_depth_luma_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pcm_sample_bit_depth_luma_minus1(MemorySegment segment, long index) { return (byte) VH_pcm_sample_bit_depth_luma_minus1.get(segment, 0L, index); }
    /// {@return `pcm_sample_bit_depth_luma_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pcm_sample_bit_depth_luma_minus1(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_luma_minus1(segment, 0L); }
    /// {@return `pcm_sample_bit_depth_luma_minus1`}
    public @CType("uint8_t") byte pcm_sample_bit_depth_luma_minus1() { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_luma_minus1(this.segment()); }
    /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pcm_sample_bit_depth_luma_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pcm_sample_bit_depth_luma_minus1.set(segment, 0L, index, value); }
    /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pcm_sample_bit_depth_luma_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_luma_minus1(segment, 0L, value); }
    /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_luma_minus1(this.segment(), value); return this; }

    /// {@return `pcm_sample_bit_depth_chroma_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pcm_sample_bit_depth_chroma_minus1(MemorySegment segment, long index) { return (byte) VH_pcm_sample_bit_depth_chroma_minus1.get(segment, 0L, index); }
    /// {@return `pcm_sample_bit_depth_chroma_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pcm_sample_bit_depth_chroma_minus1(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_chroma_minus1(segment, 0L); }
    /// {@return `pcm_sample_bit_depth_chroma_minus1`}
    public @CType("uint8_t") byte pcm_sample_bit_depth_chroma_minus1() { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_chroma_minus1(this.segment()); }
    /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pcm_sample_bit_depth_chroma_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pcm_sample_bit_depth_chroma_minus1.set(segment, 0L, index, value); }
    /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pcm_sample_bit_depth_chroma_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_chroma_minus1(segment, 0L, value); }
    /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_chroma_minus1(this.segment(), value); return this; }

    /// {@return `log2_min_pcm_luma_coding_block_size_minus3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment, long index) { return (byte) VH_log2_min_pcm_luma_coding_block_size_minus3.get(segment, 0L, index); }
    /// {@return `log2_min_pcm_luma_coding_block_size_minus3`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_min_pcm_luma_coding_block_size_minus3(segment, 0L); }
    /// {@return `log2_min_pcm_luma_coding_block_size_minus3`}
    public @CType("uint8_t") byte log2_min_pcm_luma_coding_block_size_minus3() { return StdVideoH265SequenceParameterSet.get_log2_min_pcm_luma_coding_block_size_minus3(this.segment()); }
    /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_min_pcm_luma_coding_block_size_minus3.set(segment, 0L, index, value); }
    /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_min_pcm_luma_coding_block_size_minus3(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_pcm_luma_coding_block_size_minus3(segment, 0L, value); }
    /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_pcm_luma_coding_block_size_minus3(this.segment(), value); return this; }

    /// {@return `log2_diff_max_min_pcm_luma_coding_block_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment, long index) { return (byte) VH_log2_diff_max_min_pcm_luma_coding_block_size.get(segment, 0L, index); }
    /// {@return `log2_diff_max_min_pcm_luma_coding_block_size`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_pcm_luma_coding_block_size(segment, 0L); }
    /// {@return `log2_diff_max_min_pcm_luma_coding_block_size`}
    public @CType("uint8_t") byte log2_diff_max_min_pcm_luma_coding_block_size() { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_pcm_luma_coding_block_size(this.segment()); }
    /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_diff_max_min_pcm_luma_coding_block_size.set(segment, 0L, index, value); }
    /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_diff_max_min_pcm_luma_coding_block_size(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_pcm_luma_coding_block_size(segment, 0L, value); }
    /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH265SequenceParameterSet.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet reserved1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoH265SequenceParameterSet.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet reserved2(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved2(this.segment(), value); return this; }

    /// {@return `palette_max_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_palette_max_size(MemorySegment segment, long index) { return (byte) VH_palette_max_size.get(segment, 0L, index); }
    /// {@return `palette_max_size`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_palette_max_size(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_palette_max_size(segment, 0L); }
    /// {@return `palette_max_size`}
    public @CType("uint8_t") byte palette_max_size() { return StdVideoH265SequenceParameterSet.get_palette_max_size(this.segment()); }
    /// Sets `palette_max_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_palette_max_size(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_palette_max_size.set(segment, 0L, index, value); }
    /// Sets `palette_max_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_palette_max_size(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_palette_max_size(segment, 0L, value); }
    /// Sets `palette_max_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet palette_max_size(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_palette_max_size(this.segment(), value); return this; }

    /// {@return `delta_palette_max_predictor_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_delta_palette_max_predictor_size(MemorySegment segment, long index) { return (byte) VH_delta_palette_max_predictor_size.get(segment, 0L, index); }
    /// {@return `delta_palette_max_predictor_size`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_delta_palette_max_predictor_size(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_delta_palette_max_predictor_size(segment, 0L); }
    /// {@return `delta_palette_max_predictor_size`}
    public @CType("uint8_t") byte delta_palette_max_predictor_size() { return StdVideoH265SequenceParameterSet.get_delta_palette_max_predictor_size(this.segment()); }
    /// Sets `delta_palette_max_predictor_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_palette_max_predictor_size(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_delta_palette_max_predictor_size.set(segment, 0L, index, value); }
    /// Sets `delta_palette_max_predictor_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_palette_max_predictor_size(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_delta_palette_max_predictor_size(segment, 0L, value); }
    /// Sets `delta_palette_max_predictor_size` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_delta_palette_max_predictor_size(this.segment(), value); return this; }

    /// {@return `motion_vector_resolution_control_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_motion_vector_resolution_control_idc(MemorySegment segment, long index) { return (byte) VH_motion_vector_resolution_control_idc.get(segment, 0L, index); }
    /// {@return `motion_vector_resolution_control_idc`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_motion_vector_resolution_control_idc(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_motion_vector_resolution_control_idc(segment, 0L); }
    /// {@return `motion_vector_resolution_control_idc`}
    public @CType("uint8_t") byte motion_vector_resolution_control_idc() { return StdVideoH265SequenceParameterSet.get_motion_vector_resolution_control_idc(this.segment()); }
    /// Sets `motion_vector_resolution_control_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_motion_vector_resolution_control_idc(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_motion_vector_resolution_control_idc.set(segment, 0L, index, value); }
    /// Sets `motion_vector_resolution_control_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_motion_vector_resolution_control_idc(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_motion_vector_resolution_control_idc(segment, 0L, value); }
    /// Sets `motion_vector_resolution_control_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_motion_vector_resolution_control_idc(this.segment(), value); return this; }

    /// {@return `sps_num_palette_predictor_initializers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_sps_num_palette_predictor_initializers_minus1(MemorySegment segment, long index) { return (byte) VH_sps_num_palette_predictor_initializers_minus1.get(segment, 0L, index); }
    /// {@return `sps_num_palette_predictor_initializers_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_sps_num_palette_predictor_initializers_minus1(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_sps_num_palette_predictor_initializers_minus1(segment, 0L); }
    /// {@return `sps_num_palette_predictor_initializers_minus1`}
    public @CType("uint8_t") byte sps_num_palette_predictor_initializers_minus1() { return StdVideoH265SequenceParameterSet.get_sps_num_palette_predictor_initializers_minus1(this.segment()); }
    /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sps_num_palette_predictor_initializers_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_sps_num_palette_predictor_initializers_minus1.set(segment, 0L, index, value); }
    /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sps_num_palette_predictor_initializers_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_num_palette_predictor_initializers_minus1(segment, 0L, value); }
    /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializers_minus1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_num_palette_predictor_initializers_minus1(this.segment(), value); return this; }

    /// {@return `conf_win_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_conf_win_left_offset(MemorySegment segment, long index) { return (int) VH_conf_win_left_offset.get(segment, 0L, index); }
    /// {@return `conf_win_left_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_conf_win_left_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_conf_win_left_offset(segment, 0L); }
    /// {@return `conf_win_left_offset`}
    public @CType("uint32_t") int conf_win_left_offset() { return StdVideoH265SequenceParameterSet.get_conf_win_left_offset(this.segment()); }
    /// Sets `conf_win_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conf_win_left_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_conf_win_left_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_left_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conf_win_left_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_left_offset(segment, 0L, value); }
    /// Sets `conf_win_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_left_offset(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_left_offset(this.segment(), value); return this; }

    /// {@return `conf_win_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_conf_win_right_offset(MemorySegment segment, long index) { return (int) VH_conf_win_right_offset.get(segment, 0L, index); }
    /// {@return `conf_win_right_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_conf_win_right_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_conf_win_right_offset(segment, 0L); }
    /// {@return `conf_win_right_offset`}
    public @CType("uint32_t") int conf_win_right_offset() { return StdVideoH265SequenceParameterSet.get_conf_win_right_offset(this.segment()); }
    /// Sets `conf_win_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conf_win_right_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_conf_win_right_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_right_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conf_win_right_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_right_offset(segment, 0L, value); }
    /// Sets `conf_win_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_right_offset(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_right_offset(this.segment(), value); return this; }

    /// {@return `conf_win_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_conf_win_top_offset(MemorySegment segment, long index) { return (int) VH_conf_win_top_offset.get(segment, 0L, index); }
    /// {@return `conf_win_top_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_conf_win_top_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_conf_win_top_offset(segment, 0L); }
    /// {@return `conf_win_top_offset`}
    public @CType("uint32_t") int conf_win_top_offset() { return StdVideoH265SequenceParameterSet.get_conf_win_top_offset(this.segment()); }
    /// Sets `conf_win_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conf_win_top_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_conf_win_top_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_top_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conf_win_top_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_top_offset(segment, 0L, value); }
    /// Sets `conf_win_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_top_offset(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_top_offset(this.segment(), value); return this; }

    /// {@return `conf_win_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_conf_win_bottom_offset(MemorySegment segment, long index) { return (int) VH_conf_win_bottom_offset.get(segment, 0L, index); }
    /// {@return `conf_win_bottom_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_conf_win_bottom_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_conf_win_bottom_offset(segment, 0L); }
    /// {@return `conf_win_bottom_offset`}
    public @CType("uint32_t") int conf_win_bottom_offset() { return StdVideoH265SequenceParameterSet.get_conf_win_bottom_offset(this.segment()); }
    /// Sets `conf_win_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conf_win_bottom_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_conf_win_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `conf_win_bottom_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conf_win_bottom_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_bottom_offset(segment, 0L, value); }
    /// Sets `conf_win_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet conf_win_bottom_offset(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_bottom_offset(this.segment(), value); return this; }

    /// {@return `pProfileTierLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ProfileTierLevel *") MemorySegment get_pProfileTierLevel(MemorySegment segment, long index) { return (MemorySegment) VH_pProfileTierLevel.get(segment, 0L, index); }
    /// {@return `pProfileTierLevel`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ProfileTierLevel *") MemorySegment get_pProfileTierLevel(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pProfileTierLevel(segment, 0L); }
    /// {@return `pProfileTierLevel`}
    public @CType("const StdVideoH265ProfileTierLevel *") MemorySegment pProfileTierLevel() { return StdVideoH265SequenceParameterSet.get_pProfileTierLevel(this.segment()); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pProfileTierLevel(MemorySegment segment, long index, @CType("const StdVideoH265ProfileTierLevel *") MemorySegment value) { VH_pProfileTierLevel.set(segment, 0L, index, value); }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pProfileTierLevel(MemorySegment segment, @CType("const StdVideoH265ProfileTierLevel *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pProfileTierLevel(segment, 0L, value); }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pProfileTierLevel(@CType("const StdVideoH265ProfileTierLevel *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pProfileTierLevel(this.segment(), value); return this; }

    /// {@return `pDecPicBufMgr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265DecPicBufMgr *") MemorySegment get_pDecPicBufMgr(MemorySegment segment, long index) { return (MemorySegment) VH_pDecPicBufMgr.get(segment, 0L, index); }
    /// {@return `pDecPicBufMgr`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265DecPicBufMgr *") MemorySegment get_pDecPicBufMgr(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pDecPicBufMgr(segment, 0L); }
    /// {@return `pDecPicBufMgr`}
    public @CType("const StdVideoH265DecPicBufMgr *") MemorySegment pDecPicBufMgr() { return StdVideoH265SequenceParameterSet.get_pDecPicBufMgr(this.segment()); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDecPicBufMgr(MemorySegment segment, long index, @CType("const StdVideoH265DecPicBufMgr *") MemorySegment value) { VH_pDecPicBufMgr.set(segment, 0L, index, value); }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDecPicBufMgr(MemorySegment segment, @CType("const StdVideoH265DecPicBufMgr *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pDecPicBufMgr(segment, 0L, value); }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pDecPicBufMgr(@CType("const StdVideoH265DecPicBufMgr *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pDecPicBufMgr(this.segment(), value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pScalingLists(segment, 0L); }
    /// {@return `pScalingLists`}
    public @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingLists() { return StdVideoH265SequenceParameterSet.get_pScalingLists(this.segment()); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, long index, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pScalingLists(segment, 0L, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pScalingLists(@CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pScalingLists(this.segment(), value); return this; }

    /// {@return `pShortTermRefPicSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment get_pShortTermRefPicSet(MemorySegment segment, long index) { return (MemorySegment) VH_pShortTermRefPicSet.get(segment, 0L, index); }
    /// {@return `pShortTermRefPicSet`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment get_pShortTermRefPicSet(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pShortTermRefPicSet(segment, 0L); }
    /// {@return `pShortTermRefPicSet`}
    public @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment pShortTermRefPicSet() { return StdVideoH265SequenceParameterSet.get_pShortTermRefPicSet(this.segment()); }
    /// Sets `pShortTermRefPicSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShortTermRefPicSet(MemorySegment segment, long index, @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment value) { VH_pShortTermRefPicSet.set(segment, 0L, index, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShortTermRefPicSet(MemorySegment segment, @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pShortTermRefPicSet(segment, 0L, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pShortTermRefPicSet(@CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pShortTermRefPicSet(this.segment(), value); return this; }

    /// {@return `pLongTermRefPicsSps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment get_pLongTermRefPicsSps(MemorySegment segment, long index) { return (MemorySegment) VH_pLongTermRefPicsSps.get(segment, 0L, index); }
    /// {@return `pLongTermRefPicsSps`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment get_pLongTermRefPicsSps(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pLongTermRefPicsSps(segment, 0L); }
    /// {@return `pLongTermRefPicsSps`}
    public @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment pLongTermRefPicsSps() { return StdVideoH265SequenceParameterSet.get_pLongTermRefPicsSps(this.segment()); }
    /// Sets `pLongTermRefPicsSps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLongTermRefPicsSps(MemorySegment segment, long index, @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment value) { VH_pLongTermRefPicsSps.set(segment, 0L, index, value); }
    /// Sets `pLongTermRefPicsSps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLongTermRefPicsSps(MemorySegment segment, @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pLongTermRefPicsSps(segment, 0L, value); }
    /// Sets `pLongTermRefPicsSps` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pLongTermRefPicsSps(@CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pLongTermRefPicsSps(this.segment(), value); return this; }

    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment get_pSequenceParameterSetVui(MemorySegment segment, long index) { return (MemorySegment) VH_pSequenceParameterSetVui.get(segment, 0L, index); }
    /// {@return `pSequenceParameterSetVui`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment get_pSequenceParameterSetVui(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pSequenceParameterSetVui(segment, 0L); }
    /// {@return `pSequenceParameterSetVui`}
    public @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment pSequenceParameterSetVui() { return StdVideoH265SequenceParameterSet.get_pSequenceParameterSetVui(this.segment()); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSequenceParameterSetVui(MemorySegment segment, long index, @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment value) { VH_pSequenceParameterSetVui.set(segment, 0L, index, value); }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSequenceParameterSetVui(MemorySegment segment, @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pSequenceParameterSetVui(segment, 0L, value); }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pSequenceParameterSetVui(@CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pSequenceParameterSetVui(this.segment(), value); return this; }

    /// {@return `pPredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment get_pPredictorPaletteEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pPredictorPaletteEntries.get(segment, 0L, index); }
    /// {@return `pPredictorPaletteEntries`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment get_pPredictorPaletteEntries(MemorySegment segment) { return StdVideoH265SequenceParameterSet.get_pPredictorPaletteEntries(segment, 0L); }
    /// {@return `pPredictorPaletteEntries`}
    public @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntries() { return StdVideoH265SequenceParameterSet.get_pPredictorPaletteEntries(this.segment()); }
    /// Sets `pPredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPredictorPaletteEntries(MemorySegment segment, long index, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { VH_pPredictorPaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pPredictorPaletteEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPredictorPaletteEntries(MemorySegment segment, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pPredictorPaletteEntries(segment, 0L, value); }
    /// Sets `pPredictorPaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSet pPredictorPaletteEntries(@CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pPredictorPaletteEntries(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("StdVideoH265SpsFlags") MemorySegment flagsAt(long index) { return StdVideoH265SequenceParameterSet.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265SpsFlags") MemorySegment value) { StdVideoH265SequenceParameterSet.set_flags(this.segment(), index, value); return this; }

        /// {@return `chroma_format_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH265ChromaFormatIdc") int chroma_format_idcAt(long index) { return StdVideoH265SequenceParameterSet.get_chroma_format_idc(this.segment(), index); }
        /// Sets `chroma_format_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_format_idcAt(long index, @CType("StdVideoH265ChromaFormatIdc") int value) { StdVideoH265SequenceParameterSet.set_chroma_format_idc(this.segment(), index, value); return this; }

        /// {@return `pic_width_in_luma_samples` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pic_width_in_luma_samplesAt(long index) { return StdVideoH265SequenceParameterSet.get_pic_width_in_luma_samples(this.segment(), index); }
        /// Sets `pic_width_in_luma_samples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_width_in_luma_samplesAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_width_in_luma_samples(this.segment(), index, value); return this; }

        /// {@return `pic_height_in_luma_samples` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pic_height_in_luma_samplesAt(long index) { return StdVideoH265SequenceParameterSet.get_pic_height_in_luma_samples(this.segment(), index); }
        /// Sets `pic_height_in_luma_samples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_height_in_luma_samplesAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_pic_height_in_luma_samples(this.segment(), index, value); return this; }

        /// {@return `sps_video_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_video_parameter_set_idAt(long index) { return StdVideoH265SequenceParameterSet.get_sps_video_parameter_set_id(this.segment(), index); }
        /// Sets `sps_video_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_video_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_video_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `sps_max_sub_layers_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_max_sub_layers_minus1At(long index) { return StdVideoH265SequenceParameterSet.get_sps_max_sub_layers_minus1(this.segment(), index); }
        /// Sets `sps_max_sub_layers_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_max_sub_layers_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_max_sub_layers_minus1(this.segment(), index, value); return this; }

        /// {@return `sps_seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_seq_parameter_set_idAt(long index) { return StdVideoH265SequenceParameterSet.get_sps_seq_parameter_set_id(this.segment(), index); }
        /// Sets `sps_seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `bit_depth_luma_minus8` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte bit_depth_luma_minus8At(long index) { return StdVideoH265SequenceParameterSet.get_bit_depth_luma_minus8(this.segment(), index); }
        /// Sets `bit_depth_luma_minus8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_depth_luma_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_luma_minus8(this.segment(), index, value); return this; }

        /// {@return `bit_depth_chroma_minus8` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte bit_depth_chroma_minus8At(long index) { return StdVideoH265SequenceParameterSet.get_bit_depth_chroma_minus8(this.segment(), index); }
        /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_depth_chroma_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_bit_depth_chroma_minus8(this.segment(), index, value); return this; }

        /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_max_pic_order_cnt_lsb_minus4At(long index) { return StdVideoH265SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(this.segment(), index); }
        /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_pic_order_cnt_lsb_minus4At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(this.segment(), index, value); return this; }

        /// {@return `log2_min_luma_coding_block_size_minus3` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_min_luma_coding_block_size_minus3At(long index) { return StdVideoH265SequenceParameterSet.get_log2_min_luma_coding_block_size_minus3(this.segment(), index); }
        /// Sets `log2_min_luma_coding_block_size_minus3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_luma_coding_block_size_minus3At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_coding_block_size_minus3(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_luma_coding_block_size` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_diff_max_min_luma_coding_block_sizeAt(long index) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_coding_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_luma_coding_block_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_luma_coding_block_sizeAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_coding_block_size(this.segment(), index, value); return this; }

        /// {@return `log2_min_luma_transform_block_size_minus2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_min_luma_transform_block_size_minus2At(long index) { return StdVideoH265SequenceParameterSet.get_log2_min_luma_transform_block_size_minus2(this.segment(), index); }
        /// Sets `log2_min_luma_transform_block_size_minus2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_luma_transform_block_size_minus2At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_luma_transform_block_size_minus2(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_luma_transform_block_size` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_diff_max_min_luma_transform_block_sizeAt(long index) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_luma_transform_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_luma_transform_block_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_luma_transform_block_sizeAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_luma_transform_block_size(this.segment(), index, value); return this; }

        /// {@return `max_transform_hierarchy_depth_inter` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_transform_hierarchy_depth_interAt(long index) { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_inter(this.segment(), index); }
        /// Sets `max_transform_hierarchy_depth_inter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_transform_hierarchy_depth_interAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_inter(this.segment(), index, value); return this; }

        /// {@return `max_transform_hierarchy_depth_intra` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_transform_hierarchy_depth_intraAt(long index) { return StdVideoH265SequenceParameterSet.get_max_transform_hierarchy_depth_intra(this.segment(), index); }
        /// Sets `max_transform_hierarchy_depth_intra` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_transform_hierarchy_depth_intraAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_max_transform_hierarchy_depth_intra(this.segment(), index, value); return this; }

        /// {@return `num_short_term_ref_pic_sets` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_short_term_ref_pic_setsAt(long index) { return StdVideoH265SequenceParameterSet.get_num_short_term_ref_pic_sets(this.segment(), index); }
        /// Sets `num_short_term_ref_pic_sets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_short_term_ref_pic_setsAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_short_term_ref_pic_sets(this.segment(), index, value); return this; }

        /// {@return `num_long_term_ref_pics_sps` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_long_term_ref_pics_spsAt(long index) { return StdVideoH265SequenceParameterSet.get_num_long_term_ref_pics_sps(this.segment(), index); }
        /// Sets `num_long_term_ref_pics_sps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_long_term_ref_pics_spsAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_num_long_term_ref_pics_sps(this.segment(), index, value); return this; }

        /// {@return `pcm_sample_bit_depth_luma_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pcm_sample_bit_depth_luma_minus1At(long index) { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_luma_minus1(this.segment(), index); }
        /// Sets `pcm_sample_bit_depth_luma_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pcm_sample_bit_depth_luma_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_luma_minus1(this.segment(), index, value); return this; }

        /// {@return `pcm_sample_bit_depth_chroma_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pcm_sample_bit_depth_chroma_minus1At(long index) { return StdVideoH265SequenceParameterSet.get_pcm_sample_bit_depth_chroma_minus1(this.segment(), index); }
        /// Sets `pcm_sample_bit_depth_chroma_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pcm_sample_bit_depth_chroma_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_pcm_sample_bit_depth_chroma_minus1(this.segment(), index, value); return this; }

        /// {@return `log2_min_pcm_luma_coding_block_size_minus3` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_min_pcm_luma_coding_block_size_minus3At(long index) { return StdVideoH265SequenceParameterSet.get_log2_min_pcm_luma_coding_block_size_minus3(this.segment(), index); }
        /// Sets `log2_min_pcm_luma_coding_block_size_minus3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_min_pcm_luma_coding_block_size_minus3At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_min_pcm_luma_coding_block_size_minus3(this.segment(), index, value); return this; }

        /// {@return `log2_diff_max_min_pcm_luma_coding_block_size` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_diff_max_min_pcm_luma_coding_block_sizeAt(long index) { return StdVideoH265SequenceParameterSet.get_log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), index); }
        /// Sets `log2_diff_max_min_pcm_luma_coding_block_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_diff_max_min_pcm_luma_coding_block_sizeAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_log2_diff_max_min_pcm_luma_coding_block_size(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH265SequenceParameterSet.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved2At(long index) { return StdVideoH265SequenceParameterSet.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `palette_max_size` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte palette_max_sizeAt(long index) { return StdVideoH265SequenceParameterSet.get_palette_max_size(this.segment(), index); }
        /// Sets `palette_max_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer palette_max_sizeAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_palette_max_size(this.segment(), index, value); return this; }

        /// {@return `delta_palette_max_predictor_size` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte delta_palette_max_predictor_sizeAt(long index) { return StdVideoH265SequenceParameterSet.get_delta_palette_max_predictor_size(this.segment(), index); }
        /// Sets `delta_palette_max_predictor_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_palette_max_predictor_sizeAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_delta_palette_max_predictor_size(this.segment(), index, value); return this; }

        /// {@return `motion_vector_resolution_control_idc` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte motion_vector_resolution_control_idcAt(long index) { return StdVideoH265SequenceParameterSet.get_motion_vector_resolution_control_idc(this.segment(), index); }
        /// Sets `motion_vector_resolution_control_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer motion_vector_resolution_control_idcAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_motion_vector_resolution_control_idc(this.segment(), index, value); return this; }

        /// {@return `sps_num_palette_predictor_initializers_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte sps_num_palette_predictor_initializers_minus1At(long index) { return StdVideoH265SequenceParameterSet.get_sps_num_palette_predictor_initializers_minus1(this.segment(), index); }
        /// Sets `sps_num_palette_predictor_initializers_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sps_num_palette_predictor_initializers_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.set_sps_num_palette_predictor_initializers_minus1(this.segment(), index, value); return this; }

        /// {@return `conf_win_left_offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int conf_win_left_offsetAt(long index) { return StdVideoH265SequenceParameterSet.get_conf_win_left_offset(this.segment(), index); }
        /// Sets `conf_win_left_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_left_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_left_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_right_offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int conf_win_right_offsetAt(long index) { return StdVideoH265SequenceParameterSet.get_conf_win_right_offset(this.segment(), index); }
        /// Sets `conf_win_right_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_right_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_right_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_top_offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int conf_win_top_offsetAt(long index) { return StdVideoH265SequenceParameterSet.get_conf_win_top_offset(this.segment(), index); }
        /// Sets `conf_win_top_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_top_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_top_offset(this.segment(), index, value); return this; }

        /// {@return `conf_win_bottom_offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int conf_win_bottom_offsetAt(long index) { return StdVideoH265SequenceParameterSet.get_conf_win_bottom_offset(this.segment(), index); }
        /// Sets `conf_win_bottom_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conf_win_bottom_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSet.set_conf_win_bottom_offset(this.segment(), index, value); return this; }

        /// {@return `pProfileTierLevel` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265ProfileTierLevel *") MemorySegment pProfileTierLevelAt(long index) { return StdVideoH265SequenceParameterSet.get_pProfileTierLevel(this.segment(), index); }
        /// Sets `pProfileTierLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pProfileTierLevelAt(long index, @CType("const StdVideoH265ProfileTierLevel *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pProfileTierLevel(this.segment(), index, value); return this; }

        /// {@return `pDecPicBufMgr` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265DecPicBufMgr *") MemorySegment pDecPicBufMgrAt(long index) { return StdVideoH265SequenceParameterSet.get_pDecPicBufMgr(this.segment(), index); }
        /// Sets `pDecPicBufMgr` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDecPicBufMgrAt(long index, @CType("const StdVideoH265DecPicBufMgr *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pDecPicBufMgr(this.segment(), index, value); return this; }

        /// {@return `pScalingLists` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265ScalingLists *") MemorySegment pScalingListsAt(long index) { return StdVideoH265SequenceParameterSet.get_pScalingLists(this.segment(), index); }
        /// Sets `pScalingLists` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pScalingListsAt(long index, @CType("const StdVideoH265ScalingLists *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pScalingLists(this.segment(), index, value); return this; }

        /// {@return `pShortTermRefPicSet` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment pShortTermRefPicSetAt(long index) { return StdVideoH265SequenceParameterSet.get_pShortTermRefPicSet(this.segment(), index); }
        /// Sets `pShortTermRefPicSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pShortTermRefPicSetAt(long index, @CType("const StdVideoH265ShortTermRefPicSet *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pShortTermRefPicSet(this.segment(), index, value); return this; }

        /// {@return `pLongTermRefPicsSps` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment pLongTermRefPicsSpsAt(long index) { return StdVideoH265SequenceParameterSet.get_pLongTermRefPicsSps(this.segment(), index); }
        /// Sets `pLongTermRefPicsSps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLongTermRefPicsSpsAt(long index, @CType("const StdVideoH265LongTermRefPicsSps *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pLongTermRefPicsSps(this.segment(), index, value); return this; }

        /// {@return `pSequenceParameterSetVui` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment pSequenceParameterSetVuiAt(long index) { return StdVideoH265SequenceParameterSet.get_pSequenceParameterSetVui(this.segment(), index); }
        /// Sets `pSequenceParameterSetVui` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSequenceParameterSetVuiAt(long index, @CType("const StdVideoH265SequenceParameterSetVui *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pSequenceParameterSetVui(this.segment(), index, value); return this; }

        /// {@return `pPredictorPaletteEntries` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment pPredictorPaletteEntriesAt(long index) { return StdVideoH265SequenceParameterSet.get_pPredictorPaletteEntries(this.segment(), index); }
        /// Sets `pPredictorPaletteEntries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPredictorPaletteEntriesAt(long index, @CType("const StdVideoH265PredictorPaletteEntries *") MemorySegment value) { StdVideoH265SequenceParameterSet.set_pPredictorPaletteEntries(this.segment(), index, value); return this; }

    }
}
