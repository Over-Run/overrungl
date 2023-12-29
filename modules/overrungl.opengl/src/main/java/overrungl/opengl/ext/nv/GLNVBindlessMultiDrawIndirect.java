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
 * {@code GL_NV_bindless_multi_draw_indirect}
 */
public final class GLNVBindlessMultiDrawIndirect {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_bindless_multi_draw_indirect) return;
        ext.glMultiDrawArraysIndirectBindlessNV = load.invoke("glMultiDrawArraysIndirectBindlessNV", ofVoid(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiDrawElementsIndirectBindlessNV = load.invoke("glMultiDrawElementsIndirectBindlessNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glMultiDrawArraysIndirectBindlessNV(int mode, @NativeType("const void *") MemorySegment indirect, int drawCount, int stride, int vertexBufferCount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawArraysIndirectBindlessNV).invokeExact(mode, indirect, drawCount, stride, vertexBufferCount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiDrawElementsIndirectBindlessNV(int mode, int type, @NativeType("const void *") MemorySegment indirect, int drawCount, int stride, int vertexBufferCount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawElementsIndirectBindlessNV).invokeExact(mode, type, indirect, drawCount, stride, vertexBufferCount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
