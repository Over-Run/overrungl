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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.mesa;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_MESA_framebuffer_flip_y}
  */
public final class GLMESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_MESA_framebuffer_flip_y) return;
        ext.glFramebufferParameteriMESA = load.invoke("glFramebufferParameteriMESA", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetFramebufferParameterivMESA = load.invoke("glGetFramebufferParameterivMESA", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glFramebufferParameteriMESA(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferParameteriMESA).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFramebufferParameterivMESA(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFramebufferParameterivMESA).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
