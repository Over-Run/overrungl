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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTBlendOperationAdvanced {
    public static final int VK_BLEND_OVERLAP_UNCORRELATED_EXT = 0;
    public static final int VK_BLEND_OVERLAP_DISJOINT_EXT = 1;
    public static final int VK_BLEND_OVERLAP_CONJOINT_EXT = 2;
    public static final int VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION = 2;
    public static final String VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME = "VK_EXT_blend_operation_advanced";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT = 1000148000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT = 1000148001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT = 1000148002;
    public static final int VK_BLEND_OP_ZERO_EXT = 1000148000;
    public static final int VK_BLEND_OP_SRC_EXT = 1000148001;
    public static final int VK_BLEND_OP_DST_EXT = 1000148002;
    public static final int VK_BLEND_OP_SRC_OVER_EXT = 1000148003;
    public static final int VK_BLEND_OP_DST_OVER_EXT = 1000148004;
    public static final int VK_BLEND_OP_SRC_IN_EXT = 1000148005;
    public static final int VK_BLEND_OP_DST_IN_EXT = 1000148006;
    public static final int VK_BLEND_OP_SRC_OUT_EXT = 1000148007;
    public static final int VK_BLEND_OP_DST_OUT_EXT = 1000148008;
    public static final int VK_BLEND_OP_SRC_ATOP_EXT = 1000148009;
    public static final int VK_BLEND_OP_DST_ATOP_EXT = 1000148010;
    public static final int VK_BLEND_OP_XOR_EXT = 1000148011;
    public static final int VK_BLEND_OP_MULTIPLY_EXT = 1000148012;
    public static final int VK_BLEND_OP_SCREEN_EXT = 1000148013;
    public static final int VK_BLEND_OP_OVERLAY_EXT = 1000148014;
    public static final int VK_BLEND_OP_DARKEN_EXT = 1000148015;
    public static final int VK_BLEND_OP_LIGHTEN_EXT = 1000148016;
    public static final int VK_BLEND_OP_COLORDODGE_EXT = 1000148017;
    public static final int VK_BLEND_OP_COLORBURN_EXT = 1000148018;
    public static final int VK_BLEND_OP_HARDLIGHT_EXT = 1000148019;
    public static final int VK_BLEND_OP_SOFTLIGHT_EXT = 1000148020;
    public static final int VK_BLEND_OP_DIFFERENCE_EXT = 1000148021;
    public static final int VK_BLEND_OP_EXCLUSION_EXT = 1000148022;
    public static final int VK_BLEND_OP_INVERT_EXT = 1000148023;
    public static final int VK_BLEND_OP_INVERT_RGB_EXT = 1000148024;
    public static final int VK_BLEND_OP_LINEARDODGE_EXT = 1000148025;
    public static final int VK_BLEND_OP_LINEARBURN_EXT = 1000148026;
    public static final int VK_BLEND_OP_VIVIDLIGHT_EXT = 1000148027;
    public static final int VK_BLEND_OP_LINEARLIGHT_EXT = 1000148028;
    public static final int VK_BLEND_OP_PINLIGHT_EXT = 1000148029;
    public static final int VK_BLEND_OP_HARDMIX_EXT = 1000148030;
    public static final int VK_BLEND_OP_HSL_HUE_EXT = 1000148031;
    public static final int VK_BLEND_OP_HSL_SATURATION_EXT = 1000148032;
    public static final int VK_BLEND_OP_HSL_COLOR_EXT = 1000148033;
    public static final int VK_BLEND_OP_HSL_LUMINOSITY_EXT = 1000148034;
    public static final int VK_BLEND_OP_PLUS_EXT = 1000148035;
    public static final int VK_BLEND_OP_PLUS_CLAMPED_EXT = 1000148036;
    public static final int VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT = 1000148037;
    public static final int VK_BLEND_OP_PLUS_DARKER_EXT = 1000148038;
    public static final int VK_BLEND_OP_MINUS_EXT = 1000148039;
    public static final int VK_BLEND_OP_MINUS_CLAMPED_EXT = 1000148040;
    public static final int VK_BLEND_OP_CONTRAST_EXT = 1000148041;
    public static final int VK_BLEND_OP_INVERT_OVG_EXT = 1000148042;
    public static final int VK_BLEND_OP_RED_EXT = 1000148043;
    public static final int VK_BLEND_OP_GREEN_EXT = 1000148044;
    public static final int VK_BLEND_OP_BLUE_EXT = 1000148045;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x00080000;

    public VKEXTBlendOperationAdvanced(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
    }

}
