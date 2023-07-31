/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl.ext.amd;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;

/**
 * {@code GL_AMD_multi_draw_indirect}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDMultiDrawIndirect {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_multi_draw_indirect) return;
        ext.glMultiDrawArraysIndirectAMD = load.invoke("glMultiDrawArraysIndirectAMD", FunctionDescriptors.IPIIV);
        ext.glMultiDrawElementsIndirectAMD = load.invoke("glMultiDrawElementsIndirectAMD", FunctionDescriptors.IIPIIV);
    }

    public static void glMultiDrawArraysIndirectAMD(int mode, MemorySegment indirect, int primCount, int stride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawArraysIndirectAMD).invokeExact(mode, indirect, primCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementsIndirectAMD(int mode, int type, MemorySegment indirect, int primCount, int stride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawElementsIndirectAMD).invokeExact(mode, type, indirect, primCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
