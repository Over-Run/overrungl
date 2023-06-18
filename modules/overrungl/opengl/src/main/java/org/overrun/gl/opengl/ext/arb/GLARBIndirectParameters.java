/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.gl.opengl.ext.arb;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;

/**
 * {@code GL_ARB_indirect_parameters}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBIndirectParameters {
    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_indirect_parameters) return;
        ext.glMultiDrawArraysIndirectCountARB = load.invoke("glMultiDrawArraysIndirectCountARB", FunctionDescriptors.IPJIIV);
        ext.glMultiDrawElementsIndirectCountARB = load.invoke("glMultiDrawElementsIndirectCountARB", FunctionDescriptors.IIPJIIV);
    }

    public static void glMultiDrawArraysIndirectCountARB(int mode, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawArraysIndirectCountARB).invokeExact(mode, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementsIndirectCountARB(int mode, int type, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawElementsIndirectCountARB).invokeExact(mode, type, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
