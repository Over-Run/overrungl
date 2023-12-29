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
 * {@code GL_NV_register_combiners2}
 */
public final class GLNVRegisterCombiners2 {
    public static final int GL_PER_STAGE_CONSTANTS_NV = 0x8535;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_register_combiners2) return;
        ext.glCombinerStageParameterfvNV = load.invoke("glCombinerStageParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCombinerStageParameterfvNV = load.invoke("glGetCombinerStageParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glCombinerStageParameterfvNV(int stage, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCombinerStageParameterfvNV).invokeExact(stage, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCombinerStageParameterfvNV(int stage, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCombinerStageParameterfvNV).invokeExact(stage, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
