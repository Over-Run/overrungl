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
 * {@code GL_EXT_copy_texture}
 */
public final class GLEXTCopyTexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_copy_texture) return;
        ext.glCopyTexImage1DEXT = load.invoke("glCopyTexImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTexImage2DEXT = load.invoke("glCopyTexImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTexSubImage1DEXT = load.invoke("glCopyTexSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTexSubImage2DEXT = load.invoke("glCopyTexSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTexSubImage3DEXT = load.invoke("glCopyTexSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glCopyTexImage1DEXT(int target, int level, int internalformat, int x, int y, int width, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTexImage1DEXT).invokeExact(target, level, internalformat, x, y, width, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTexImage2DEXT(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTexImage2DEXT).invokeExact(target, level, internalformat, x, y, width, height, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTexSubImage1DEXT(int target, int level, int xoffset, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTexSubImage1DEXT).invokeExact(target, level, xoffset, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTexSubImage2DEXT(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTexSubImage2DEXT).invokeExact(target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTexSubImage3DEXT(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTexSubImage3DEXT).invokeExact(target, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
