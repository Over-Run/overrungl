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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_draw_instanced}
 */
public final class GLEXTDrawInstanced {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_draw_instanced) return;
        ext.glDrawArraysInstancedEXT = load.invoke("glDrawArraysInstancedEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glDrawElementsInstancedEXT = load.invoke("glDrawElementsInstancedEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
    }

    public static void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawArraysInstancedEXT).invokeExact(mode, start, count, primcount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawElementsInstancedEXT(int mode, int count, int type, @NativeType("const void *") MemorySegment indices, int primcount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawElementsInstancedEXT).invokeExact(mode, count, type, indices, primcount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
