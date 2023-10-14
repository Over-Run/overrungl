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
package overrungl.opengl.ext.sun;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_SUN_global_alpha}
  */
public final class GLSUNGlobalAlpha {
    public static final int GL_GLOBAL_ALPHA_SUN = 0x81D9;
    public static final int GL_GLOBAL_ALPHA_FACTOR_SUN = 0x81DA;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_global_alpha) return;
        ext.glGlobalAlphaFactorbSUN = load.invoke("glGlobalAlphaFactorbSUN", ofVoid(JAVA_BYTE));
        ext.glGlobalAlphaFactorsSUN = load.invoke("glGlobalAlphaFactorsSUN", ofVoid(JAVA_SHORT));
        ext.glGlobalAlphaFactoriSUN = load.invoke("glGlobalAlphaFactoriSUN", ofVoid(JAVA_INT));
        ext.glGlobalAlphaFactorfSUN = load.invoke("glGlobalAlphaFactorfSUN", ofVoid(JAVA_FLOAT));
        ext.glGlobalAlphaFactordSUN = load.invoke("glGlobalAlphaFactordSUN", ofVoid(JAVA_DOUBLE));
        ext.glGlobalAlphaFactorubSUN = load.invoke("glGlobalAlphaFactorubSUN", ofVoid(JAVA_BYTE));
        ext.glGlobalAlphaFactorusSUN = load.invoke("glGlobalAlphaFactorusSUN", ofVoid(JAVA_SHORT));
        ext.glGlobalAlphaFactoruiSUN = load.invoke("glGlobalAlphaFactoruiSUN", ofVoid(JAVA_INT));
    }

    public static void glGlobalAlphaFactorbSUN(byte factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactorbSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactorsSUN(short factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactorsSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactoriSUN(int factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactoriSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactorfSUN(float factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactorfSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactordSUN(double factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactordSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactorubSUN(byte factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactorubSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactorusSUN(short factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactorusSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGlobalAlphaFactoruiSUN(int factor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGlobalAlphaFactoruiSUN).invokeExact(factor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
