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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_alpha_to_coverage_dither_control}
 */
public final class GLNVAlphaToCoverageDitherControl {
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV = 0x934E;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_alpha_to_coverage_dither_control) return;
        ext.glAlphaToCoverageDitherControlNV = load.invoke("glAlphaToCoverageDitherControlNV", ofVoid(JAVA_INT));
    }

    public static void glAlphaToCoverageDitherControlNV(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAlphaToCoverageDitherControlNV).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
