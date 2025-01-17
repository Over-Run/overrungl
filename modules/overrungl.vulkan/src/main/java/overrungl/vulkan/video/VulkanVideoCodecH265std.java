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
import static overrungl.vulkan.video.VulkanVideoCodecsCommon.*;
public final class VulkanVideoCodecH265std {
    public static final int STD_VIDEO_H265_CPB_CNT_LIST_SIZE = 32;
    public static final int STD_VIDEO_H265_SUBLAYERS_LIST_SIZE = 7;
    public static final int STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS = 6;
    public static final int STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS = 16;
    public static final int STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS = 6;
    public static final int STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS = 64;
    public static final int STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS = 6;
    public static final int STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS = 64;
    public static final int STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS = 2;
    public static final int STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS = 64;
    public static final int STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE = 6;
    public static final int STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE = 19;
    public static final int STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE = 21;
    public static final int STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE = 3;
    public static final int STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE = 128;
    public static final int STD_VIDEO_H265_MAX_NUM_LIST_REF = 15;
    public static final int STD_VIDEO_H265_MAX_CHROMA_PLANES = 2;
    public static final int STD_VIDEO_H265_MAX_SHORT_TERM_REF_PIC_SETS = 64;
    public static final int STD_VIDEO_H265_MAX_DPB_SIZE = 16;
    public static final int STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS = 32;
    public static final int STD_VIDEO_H265_MAX_LONG_TERM_PICS = 16;
    public static final int STD_VIDEO_H265_MAX_DELTA_POC = 48;
    public static final int STD_VIDEO_H265_NO_REFERENCE_PICTURE = 0xFF;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME = 0;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_420 = 1;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_422 = 2;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_444 = 3;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H265_PROFILE_IDC_MAIN = 1;
    public static final int STD_VIDEO_H265_PROFILE_IDC_MAIN_10 = 2;
    public static final int STD_VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE = 3;
    public static final int STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS = 4;
    public static final int STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS = 9;
    public static final int STD_VIDEO_H265_PROFILE_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H265_LEVEL_IDC_1_0 = 0;
    public static final int STD_VIDEO_H265_LEVEL_IDC_2_0 = 1;
    public static final int STD_VIDEO_H265_LEVEL_IDC_2_1 = 2;
    public static final int STD_VIDEO_H265_LEVEL_IDC_3_0 = 3;
    public static final int STD_VIDEO_H265_LEVEL_IDC_3_1 = 4;
    public static final int STD_VIDEO_H265_LEVEL_IDC_4_0 = 5;
    public static final int STD_VIDEO_H265_LEVEL_IDC_4_1 = 6;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_0 = 7;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_1 = 8;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_2 = 9;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_0 = 10;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_1 = 11;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_2 = 12;
    public static final int STD_VIDEO_H265_LEVEL_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H265_SLICE_TYPE_B = 0;
    public static final int STD_VIDEO_H265_SLICE_TYPE_P = 1;
    public static final int STD_VIDEO_H265_SLICE_TYPE_I = 2;
    public static final int STD_VIDEO_H265_SLICE_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H265_PICTURE_TYPE_P = 0;
    public static final int STD_VIDEO_H265_PICTURE_TYPE_B = 1;
    public static final int STD_VIDEO_H265_PICTURE_TYPE_I = 2;
    public static final int STD_VIDEO_H265_PICTURE_TYPE_IDR = 3;
    public static final int STD_VIDEO_H265_PICTURE_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_UNSPECIFIED = 0;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_SQUARE = 1;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_12_11 = 2;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_10_11 = 3;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_16_11 = 4;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_40_33 = 5;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_24_11 = 6;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_20_11 = 7;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_32_11 = 8;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_80_33 = 9;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_18_11 = 10;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_15_11 = 11;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_64_33 = 12;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_160_99 = 13;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_4_3 = 14;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_3_2 = 15;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_2_1 = 16;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_EXTENDED_SAR = 255;
    public static final int STD_VIDEO_H265_ASPECT_RATIO_IDC_INVALID = 0x7FFFFFFF;
    private VulkanVideoCodecH265std() { }
}
