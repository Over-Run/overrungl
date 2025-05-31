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
public final class VulkanVideoCodecH264std {
    public static final int STD_VIDEO_H264_CPB_CNT_LIST_SIZE = 32;
    public static final int STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS = 6;
    public static final int STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS = 16;
    public static final int STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS = 6;
    public static final int STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS = 64;
    public static final int STD_VIDEO_H264_MAX_NUM_LIST_REF = 32;
    public static final int STD_VIDEO_H264_MAX_CHROMA_PLANES = 2;
    public static final int STD_VIDEO_H264_NO_REFERENCE_PICTURE = 0xFF;
    public static final int STD_VIDEO_H264_CHROMA_FORMAT_IDC_MONOCHROME = 0;
    public static final int STD_VIDEO_H264_CHROMA_FORMAT_IDC_420 = 1;
    public static final int STD_VIDEO_H264_CHROMA_FORMAT_IDC_422 = 2;
    public static final int STD_VIDEO_H264_CHROMA_FORMAT_IDC_444 = 3;
    public static final int STD_VIDEO_H264_CHROMA_FORMAT_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_PROFILE_IDC_BASELINE = 66;
    public static final int STD_VIDEO_H264_PROFILE_IDC_MAIN = 77;
    public static final int STD_VIDEO_H264_PROFILE_IDC_HIGH = 100;
    public static final int STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE = 244;
    public static final int STD_VIDEO_H264_PROFILE_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_0 = 0;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_1 = 1;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_2 = 2;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_3 = 3;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_0 = 4;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_1 = 5;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_2 = 6;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_0 = 7;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_1 = 8;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_2 = 9;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_0 = 10;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_1 = 11;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_2 = 12;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_0 = 13;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_1 = 14;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_2 = 15;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_0 = 16;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_1 = 17;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_2 = 18;
    public static final int STD_VIDEO_H264_LEVEL_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_POC_TYPE_0 = 0;
    public static final int STD_VIDEO_H264_POC_TYPE_1 = 1;
    public static final int STD_VIDEO_H264_POC_TYPE_2 = 2;
    public static final int STD_VIDEO_H264_POC_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_UNSPECIFIED = 0;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_SQUARE = 1;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_12_11 = 2;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_10_11 = 3;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_16_11 = 4;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_40_33 = 5;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_24_11 = 6;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_20_11 = 7;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_32_11 = 8;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_80_33 = 9;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_18_11 = 10;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_15_11 = 11;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_64_33 = 12;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_160_99 = 13;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_4_3 = 14;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_3_2 = 15;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_2_1 = 16;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_EXTENDED_SAR = 255;
    public static final int STD_VIDEO_H264_ASPECT_RATIO_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT = 0;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT = 1;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT = 2;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT = 0;
    public static final int STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD = 1;
    public static final int STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM = 2;
    public static final int STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_END = 3;
    public static final int STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END = 0;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM = 1;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM = 2;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM = 3;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX = 4;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL = 5;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM = 6;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_0 = 0;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_1 = 1;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_2 = 2;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED = 0;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED = 1;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL = 2;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_SLICE_TYPE_P = 0;
    public static final int STD_VIDEO_H264_SLICE_TYPE_B = 1;
    public static final int STD_VIDEO_H264_SLICE_TYPE_I = 2;
    public static final int STD_VIDEO_H264_SLICE_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_P = 0;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_B = 1;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_I = 2;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_IDR = 5;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_SPS = 0;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_PPS = 1;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_AUD = 2;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_PREFIX = 3;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE = 4;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_STREAM = 5;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_PRECODED = 6;
    public static final int STD_VIDEO_H264_NON_VCL_NALU_TYPE_INVALID = 0x7FFFFFFF;
    private VulkanVideoCodecH264std() { }
}
