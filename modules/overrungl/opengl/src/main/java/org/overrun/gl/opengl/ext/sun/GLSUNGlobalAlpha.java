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

package org.overrun.gl.opengl.ext.sun;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_SUN_global_alpha}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLSUNGlobalAlpha {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_global_alpha) return;
        ext.glGlobalAlphaFactorbSUN = load.invoke("glGlobalAlphaFactorbSUN", BV);
        ext.glGlobalAlphaFactordSUN = load.invoke("glGlobalAlphaFactordSUN", DV);
        ext.glGlobalAlphaFactorfSUN = load.invoke("glGlobalAlphaFactorfSUN", FV);
        ext.glGlobalAlphaFactoriSUN = load.invoke("glGlobalAlphaFactoriSUN", IV);
        ext.glGlobalAlphaFactorsSUN = load.invoke("glGlobalAlphaFactorsSUN", SV);
        ext.glGlobalAlphaFactorubSUN = load.invoke("glGlobalAlphaFactorubSUN", BV);
        ext.glGlobalAlphaFactoruiSUN = load.invoke("glGlobalAlphaFactoruiSUN", IV);
        ext.glGlobalAlphaFactorusSUN = load.invoke("glGlobalAlphaFactorusSUN", SV);
    }

    public static void glGlobalAlphaFactorbSUN(byte factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactorbSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactordSUN(double factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactordSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorfSUN(float factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactorfSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactoriSUN(int factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactoriSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorsSUN(short factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactorsSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorubSUN(byte factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactorubSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactoruiSUN(int factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactoruiSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorusSUN(short factor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGlobalAlphaFactorusSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
