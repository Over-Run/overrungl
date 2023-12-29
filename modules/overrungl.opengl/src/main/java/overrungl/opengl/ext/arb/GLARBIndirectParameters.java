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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_indirect_parameters}
 */
public final class GLARBIndirectParameters {
    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_indirect_parameters) return;
        ext.glMultiDrawArraysIndirectCountARB = load.invoke("glMultiDrawArraysIndirectCountARB", ofVoid(JAVA_INT, ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT));
        ext.glMultiDrawElementsIndirectCountARB = load.invoke("glMultiDrawElementsIndirectCountARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT));
    }

    public static void glMultiDrawArraysIndirectCountARB(int mode, @NativeType("const void *") MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawArraysIndirectCountARB).invokeExact(mode, indirect, drawcount, maxdrawcount, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiDrawElementsIndirectCountARB(int mode, int type, @NativeType("const void *") MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawElementsIndirectCountARB).invokeExact(mode, type, indirect, drawcount, maxdrawcount, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
