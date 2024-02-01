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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_multisample}
 */
public interface GLEXTMultisample {
    int GL_MULTISAMPLE_EXT = 0x809D;
    int GL_SAMPLE_ALPHA_TO_MASK_EXT = 0x809E;
    int GL_SAMPLE_ALPHA_TO_ONE_EXT = 0x809F;
    int GL_SAMPLE_MASK_EXT = 0x80A0;
    int GL_1PASS_EXT = 0x80A1;
    int GL_2PASS_0_EXT = 0x80A2;
    int GL_2PASS_1_EXT = 0x80A3;
    int GL_4PASS_0_EXT = 0x80A4;
    int GL_4PASS_1_EXT = 0x80A5;
    int GL_4PASS_2_EXT = 0x80A6;
    int GL_4PASS_3_EXT = 0x80A7;
    int GL_SAMPLE_BUFFERS_EXT = 0x80A8;
    int GL_SAMPLES_EXT = 0x80A9;
    int GL_SAMPLE_MASK_VALUE_EXT = 0x80AA;
    int GL_SAMPLE_MASK_INVERT_EXT = 0x80AB;
    int GL_SAMPLE_PATTERN_EXT = 0x80AC;
    int GL_MULTISAMPLE_BIT_EXT = 0x20000000;

    default void glSampleMaskEXT(float value, boolean invert) {
        throw new ContextException();
    }

    default void glSamplePatternEXT(int pattern) {
        throw new ContextException();
    }

}
