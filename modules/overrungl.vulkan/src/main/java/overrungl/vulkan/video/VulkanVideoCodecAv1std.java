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
public final class VulkanVideoCodecAv1std {
    public static final int STD_VIDEO_AV1_NUM_REF_FRAMES = 8;
    public static final int STD_VIDEO_AV1_REFS_PER_FRAME = 7;
    public static final int STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME = 8;
    public static final int STD_VIDEO_AV1_MAX_TILE_COLS = 64;
    public static final int STD_VIDEO_AV1_MAX_TILE_ROWS = 64;
    public static final int STD_VIDEO_AV1_MAX_SEGMENTS = 8;
    public static final int STD_VIDEO_AV1_SEG_LVL_MAX = 8;
    public static final int STD_VIDEO_AV1_PRIMARY_REF_NONE = 7;
    public static final int STD_VIDEO_AV1_SELECT_INTEGER_MV = 2;
    public static final int STD_VIDEO_AV1_SELECT_SCREEN_CONTENT_TOOLS = 2;
    public static final int STD_VIDEO_AV1_SKIP_MODE_FRAMES = 2;
    public static final int STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS = 4;
    public static final int STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS = 2;
    public static final int STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS = 8;
    public static final int STD_VIDEO_AV1_MAX_NUM_PLANES = 3;
    public static final int STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS = 6;
    public static final int STD_VIDEO_AV1_MAX_NUM_Y_POINTS = 14;
    public static final int STD_VIDEO_AV1_MAX_NUM_CB_POINTS = 10;
    public static final int STD_VIDEO_AV1_MAX_NUM_CR_POINTS = 10;
    public static final int STD_VIDEO_AV1_MAX_NUM_POS_LUMA = 24;
    public static final int STD_VIDEO_AV1_MAX_NUM_POS_CHROMA = 25;
    public static final int STD_VIDEO_AV1_PROFILE_MAIN = 0;
    public static final int STD_VIDEO_AV1_PROFILE_HIGH = 1;
    public static final int STD_VIDEO_AV1_PROFILE_PROFESSIONAL = 2;
    public static final int STD_VIDEO_AV1_PROFILE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_LEVEL_2_0 = 0;
    public static final int STD_VIDEO_AV1_LEVEL_2_1 = 1;
    public static final int STD_VIDEO_AV1_LEVEL_2_2 = 2;
    public static final int STD_VIDEO_AV1_LEVEL_2_3 = 3;
    public static final int STD_VIDEO_AV1_LEVEL_3_0 = 4;
    public static final int STD_VIDEO_AV1_LEVEL_3_1 = 5;
    public static final int STD_VIDEO_AV1_LEVEL_3_2 = 6;
    public static final int STD_VIDEO_AV1_LEVEL_3_3 = 7;
    public static final int STD_VIDEO_AV1_LEVEL_4_0 = 8;
    public static final int STD_VIDEO_AV1_LEVEL_4_1 = 9;
    public static final int STD_VIDEO_AV1_LEVEL_4_2 = 10;
    public static final int STD_VIDEO_AV1_LEVEL_4_3 = 11;
    public static final int STD_VIDEO_AV1_LEVEL_5_0 = 12;
    public static final int STD_VIDEO_AV1_LEVEL_5_1 = 13;
    public static final int STD_VIDEO_AV1_LEVEL_5_2 = 14;
    public static final int STD_VIDEO_AV1_LEVEL_5_3 = 15;
    public static final int STD_VIDEO_AV1_LEVEL_6_0 = 16;
    public static final int STD_VIDEO_AV1_LEVEL_6_1 = 17;
    public static final int STD_VIDEO_AV1_LEVEL_6_2 = 18;
    public static final int STD_VIDEO_AV1_LEVEL_6_3 = 19;
    public static final int STD_VIDEO_AV1_LEVEL_7_0 = 20;
    public static final int STD_VIDEO_AV1_LEVEL_7_1 = 21;
    public static final int STD_VIDEO_AV1_LEVEL_7_2 = 22;
    public static final int STD_VIDEO_AV1_LEVEL_7_3 = 23;
    public static final int STD_VIDEO_AV1_LEVEL_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_KEY = 0;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INTER = 1;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY = 2;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_SWITCH = 3;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME = 0;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME = 1;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST2_FRAME = 2;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST3_FRAME = 3;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_GOLDEN_FRAME = 4;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_BWDREF_FRAME = 5;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_ALTREF2_FRAME = 6;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_ALTREF_FRAME = 7;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP = 0;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH = 1;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP = 2;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_BILINEAR = 3;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_SWITCHABLE = 4;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_TX_MODE_ONLY_4X4 = 0;
    public static final int STD_VIDEO_AV1_TX_MODE_LARGEST = 1;
    public static final int STD_VIDEO_AV1_TX_MODE_SELECT = 2;
    public static final int STD_VIDEO_AV1_TX_MODE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_NONE = 0;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_WIENER = 1;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SGRPROJ = 2;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SWITCHABLE = 3;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_709 = 1;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED = 2;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_UNSPECIFIED = STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_M = 4;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_B_G = 5;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_601 = 6;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_240 = 7;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_GENERIC_FILM = 8;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_2020 = 9;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_XYZ = 10;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_431 = 11;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_432 = 12;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_EBU_3213 = 22;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_0 = 0;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_709 = 1;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED = 2;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_3 = 3;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_M = 4;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G = 5;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_601 = 6;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_240 = 7;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LINEAR = 8;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100 = 9;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10 = 10;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_IEC_61966 = 11;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_1361 = 12;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SRGB = 13;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT = 14;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT = 15;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084 = 16;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_428 = 17;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_HLG = 18;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_IDENTITY = 0;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_709 = 1;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_UNSPECIFIED = 2;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_RESERVED_3 = 3;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_FCC = 4;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_470_B_G = 5;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_601 = 6;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_240 = 7;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO = 8;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_NCL = 9;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_CL = 10;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_2085 = 11;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL = 12;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_CL = 13;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_ICTCP = 14;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_INVALID = 0x7FFFFFFF;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_UNKNOWN = 0;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_VERTICAL = 1;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_COLOCATED = 2;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_RESERVED = 3;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_INVALID = 0x7FFFFFFF;
    private VulkanVideoCodecAv1std() { }
}
