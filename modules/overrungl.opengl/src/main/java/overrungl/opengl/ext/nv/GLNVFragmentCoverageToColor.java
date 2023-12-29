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
 * {@code GL_NV_fragment_coverage_to_color}
 */
public final class GLNVFragmentCoverageToColor {
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_fragment_coverage_to_color) return;
        ext.glFragmentCoverageColorNV = load.invoke("glFragmentCoverageColorNV", ofVoid(JAVA_INT));
    }

    public static void glFragmentCoverageColorNV(int color) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentCoverageColorNV).invokeExact(color);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
