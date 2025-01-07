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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBMultisample {
    public static final int GL_MULTISAMPLE_ARB = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
    public static final int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
    public static final int GL_SAMPLES_ARB = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
    public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;
    public static final MethodHandle MH_glSampleCoverageARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glSampleCoverageARB;

    public GLARBMultisample(overrungl.opengl.GLLoadFunc func) {
        PFN_glSampleCoverageARB = func.invoke("glSampleCoverageARB", "glSampleCoverage");
    }

    public void SampleCoverageARB(@CType("GLfloat") float value, @CType("GLboolean") boolean invert) {
        if (!Unmarshal.isNullPointer(PFN_glSampleCoverageARB)) { try {
            MH_glSampleCoverageARB.invokeExact(PFN_glSampleCoverageARB, value, invert);
        } catch (Throwable e) { throw new RuntimeException("error in glSampleCoverageARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSampleCoverageARB"); }
    }

}
