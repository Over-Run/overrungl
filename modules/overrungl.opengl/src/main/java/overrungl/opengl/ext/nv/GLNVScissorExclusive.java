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
 * {@code GL_NV_scissor_exclusive}
 */
public final class GLNVScissorExclusive {
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_scissor_exclusive) return;
        ext.glScissorExclusiveNV = load.invoke("glScissorExclusiveNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glScissorExclusiveArrayvNV = load.invoke("glScissorExclusiveArrayvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glScissorExclusiveNV(int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glScissorExclusiveNV).invokeExact(x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glScissorExclusiveArrayvNV(int first, int count, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glScissorExclusiveArrayvNV).invokeExact(first, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
