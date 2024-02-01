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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIS_multisample}
 */
public interface GLSGISMultisample {
    int GL_MULTISAMPLE_SGIS = 0x809D;
    int GL_SAMPLE_ALPHA_TO_MASK_SGIS = 0x809E;
    int GL_SAMPLE_ALPHA_TO_ONE_SGIS = 0x809F;
    int GL_SAMPLE_MASK_SGIS = 0x80A0;
    int GL_1PASS_SGIS = 0x80A1;
    int GL_2PASS_0_SGIS = 0x80A2;
    int GL_2PASS_1_SGIS = 0x80A3;
    int GL_4PASS_0_SGIS = 0x80A4;
    int GL_4PASS_1_SGIS = 0x80A5;
    int GL_4PASS_2_SGIS = 0x80A6;
    int GL_4PASS_3_SGIS = 0x80A7;
    int GL_SAMPLE_BUFFERS_SGIS = 0x80A8;
    int GL_SAMPLES_SGIS = 0x80A9;
    int GL_SAMPLE_MASK_VALUE_SGIS = 0x80AA;
    int GL_SAMPLE_MASK_INVERT_SGIS = 0x80AB;
    int GL_SAMPLE_PATTERN_SGIS = 0x80AC;

    void glSampleMaskSGIS(float value, boolean invert);
    void glSamplePatternSGIS(int pattern);
}
