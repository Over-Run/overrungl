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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_multi_draw_indirect}
  */
public final class GLAMDMultiDrawIndirect {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_multi_draw_indirect) return;
        ext.glMultiDrawArraysIndirectAMD = load.invoke("glMultiDrawArraysIndirectAMD", ofVoid(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT));
        ext.glMultiDrawElementsIndirectAMD = load.invoke("glMultiDrawElementsIndirectAMD", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT));
    }

    public static void glMultiDrawArraysIndirectAMD(int mode, @NativeType("const void *") MemorySegment indirect, int primcount, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawArraysIndirectAMD).invokeExact(mode, indirect, primcount, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiDrawElementsIndirectAMD(int mode, int type, @NativeType("const void *") MemorySegment indirect, int primcount, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawElementsIndirectAMD).invokeExact(mode, type, indirect, primcount, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
