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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_multisample}
 */
public final class GLEXTMultisample {
    public static final int GL_MULTISAMPLE_EXT = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_MASK_EXT = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_EXT = 0x809F;
    public static final int GL_SAMPLE_MASK_EXT = 0x80A0;
    public static final int GL_1PASS_EXT = 0x80A1;
    public static final int GL_2PASS_0_EXT = 0x80A2;
    public static final int GL_2PASS_1_EXT = 0x80A3;
    public static final int GL_4PASS_0_EXT = 0x80A4;
    public static final int GL_4PASS_1_EXT = 0x80A5;
    public static final int GL_4PASS_2_EXT = 0x80A6;
    public static final int GL_4PASS_3_EXT = 0x80A7;
    public static final int GL_SAMPLE_BUFFERS_EXT = 0x80A8;
    public static final int GL_SAMPLES_EXT = 0x80A9;
    public static final int GL_SAMPLE_MASK_VALUE_EXT = 0x80AA;
    public static final int GL_SAMPLE_MASK_INVERT_EXT = 0x80AB;
    public static final int GL_SAMPLE_PATTERN_EXT = 0x80AC;
    public static final int GL_MULTISAMPLE_BIT_EXT = 0x20000000;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_multisample) return;
        ext.glSampleMaskEXT = load.invoke("glSampleMaskEXT", ofVoid(JAVA_FLOAT, JAVA_BYTE));
        ext.glSamplePatternEXT = load.invoke("glSamplePatternEXT", ofVoid(JAVA_INT));
    }

    public static void glSampleMaskEXT(float value, boolean invert) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSampleMaskEXT).invokeExact(value, invert);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSamplePatternEXT(int pattern) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSamplePatternEXT).invokeExact(pattern);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
