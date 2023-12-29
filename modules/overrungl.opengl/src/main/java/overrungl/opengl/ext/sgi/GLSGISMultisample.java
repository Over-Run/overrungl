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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIS_multisample}
 */
public final class GLSGISMultisample {
    public static final int GL_MULTISAMPLE_SGIS = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_MASK_SGIS = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_SGIS = 0x809F;
    public static final int GL_SAMPLE_MASK_SGIS = 0x80A0;
    public static final int GL_1PASS_SGIS = 0x80A1;
    public static final int GL_2PASS_0_SGIS = 0x80A2;
    public static final int GL_2PASS_1_SGIS = 0x80A3;
    public static final int GL_4PASS_0_SGIS = 0x80A4;
    public static final int GL_4PASS_1_SGIS = 0x80A5;
    public static final int GL_4PASS_2_SGIS = 0x80A6;
    public static final int GL_4PASS_3_SGIS = 0x80A7;
    public static final int GL_SAMPLE_BUFFERS_SGIS = 0x80A8;
    public static final int GL_SAMPLES_SGIS = 0x80A9;
    public static final int GL_SAMPLE_MASK_VALUE_SGIS = 0x80AA;
    public static final int GL_SAMPLE_MASK_INVERT_SGIS = 0x80AB;
    public static final int GL_SAMPLE_PATTERN_SGIS = 0x80AC;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_multisample) return;
        ext.glSampleMaskSGIS = load.invoke("glSampleMaskSGIS", ofVoid(JAVA_FLOAT, JAVA_BYTE));
        ext.glSamplePatternSGIS = load.invoke("glSamplePatternSGIS", ofVoid(JAVA_INT));
    }

    public static void glSampleMaskSGIS(float value, boolean invert) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSampleMaskSGIS).invokeExact(value, invert);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSamplePatternSGIS(int pattern) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSamplePatternSGIS).invokeExact(pattern);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
