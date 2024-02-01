/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.khr;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_KHR_shader_subgroup}
 */
public interface GLKHRShaderSubgroup {
    int GL_SUBGROUP_SIZE_KHR = 0x9532;
    int GL_SUBGROUP_SUPPORTED_STAGES_KHR = 0x9533;
    int GL_SUBGROUP_SUPPORTED_FEATURES_KHR = 0x9534;
    int GL_SUBGROUP_QUAD_ALL_STAGES_KHR = 0x9535;
    int GL_SUBGROUP_FEATURE_BASIC_BIT_KHR = 0x00000001;
    int GL_SUBGROUP_FEATURE_VOTE_BIT_KHR = 0x00000002;
    int GL_SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR = 0x00000004;
    int GL_SUBGROUP_FEATURE_BALLOT_BIT_KHR = 0x00000008;
    int GL_SUBGROUP_FEATURE_SHUFFLE_BIT_KHR = 0x00000010;
    int GL_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR = 0x00000020;
    int GL_SUBGROUP_FEATURE_CLUSTERED_BIT_KHR = 0x00000040;
    int GL_SUBGROUP_FEATURE_QUAD_BIT_KHR = 0x00000080;
}
