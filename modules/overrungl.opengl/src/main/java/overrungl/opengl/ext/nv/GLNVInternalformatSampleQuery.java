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
 * {@code GL_NV_internalformat_sample_query}
 */
public final class GLNVInternalformatSampleQuery {
    public static final int GL_MULTISAMPLES_NV = 0x9371;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 0x9372;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373;
    public static final int GL_CONFORMANT_NV = 0x9374;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_internalformat_sample_query) return;
        ext.glGetInternalformatSampleivNV = load.invoke("glGetInternalformatSampleivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int count, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetInternalformatSampleivNV).invokeExact(target, internalformat, samples, pname, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
