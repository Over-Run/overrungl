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
package overrungl.vulkan.khr;
import overrungl.vulkan.*;
public final class VKKHRVideoEncodeAv1 {
    public static final int VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR = 0;
    public static final int VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR = 1;
    public static final int VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR = 2;
    public static final int VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR = 3;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR = 0;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR = 1;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR = 2;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_PER_RATE_CONTROL_GROUP_MIN_MAX_Q_INDEX_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR = 0x00000008;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_MOTION_VECTOR_SCALING_BIT_KHR = 0x00000010;
    public static final int VK_VIDEO_ENCODE_AV1_STD_UNIFORM_TILE_SPACING_FLAG_SET_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_AV1_STD_SKIP_MODE_PRESENT_UNSET_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_AV1_STD_PRIMARY_REF_FRAME_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_AV1_STD_DELTA_Q_BIT_KHR = 0x00000008;
    public static final int VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_64_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_128_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR = 0x00000008;
    public static final int VK_KHR_VIDEO_ENCODE_AV1_SPEC_VERSION = 1;
    public static final String VK_KHR_VIDEO_ENCODE_AV1_EXTENSION_NAME = "VK_KHR_video_encode_av1";
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR = 1000513000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000513001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR = 1000513002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR = 1000513003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR = 1000513004;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR = 1000513005;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR = 1000513006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR = 1000513007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR = 1000513008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR = 1000513009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR = 1000513010;
    public static final int VK_VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR = 0x00040000;
    public static final int VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR = 7;

    private VKKHRVideoEncodeAv1() {}

}
