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
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_multisample}
 */
public interface GLARBMultisample {
    int GL_MULTISAMPLE_ARB = 0x809D;
    int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
    int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
    int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
    int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
    int GL_SAMPLES_ARB = 0x80A9;
    int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
    int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
    int GL_MULTISAMPLE_BIT_ARB = 0x20000000;

    default void glSampleCoverageARB(float value, boolean invert) {
        throw new ContextException();
    }

}
