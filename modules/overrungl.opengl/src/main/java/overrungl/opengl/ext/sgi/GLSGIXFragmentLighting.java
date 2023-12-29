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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIX_fragment_lighting}
 */
public final class GLSGIXFragmentLighting {
    public static final int GL_FRAGMENT_LIGHTING_SGIX = 0x8400;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_SGIX = 0x8401;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX = 0x8402;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX = 0x8403;
    public static final int GL_MAX_FRAGMENT_LIGHTS_SGIX = 0x8404;
    public static final int GL_MAX_ACTIVE_LIGHTS_SGIX = 0x8405;
    public static final int GL_CURRENT_RASTER_NORMAL_SGIX = 0x8406;
    public static final int GL_LIGHT_ENV_MODE_SGIX = 0x8407;
    public static final int GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX = 0x8408;
    public static final int GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX = 0x8409;
    public static final int GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX = 0x840A;
    public static final int GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX = 0x840B;
    public static final int GL_FRAGMENT_LIGHT0_SGIX = 0x840C;
    public static final int GL_FRAGMENT_LIGHT1_SGIX = 0x840D;
    public static final int GL_FRAGMENT_LIGHT2_SGIX = 0x840E;
    public static final int GL_FRAGMENT_LIGHT3_SGIX = 0x840F;
    public static final int GL_FRAGMENT_LIGHT4_SGIX = 0x8410;
    public static final int GL_FRAGMENT_LIGHT5_SGIX = 0x8411;
    public static final int GL_FRAGMENT_LIGHT6_SGIX = 0x8412;
    public static final int GL_FRAGMENT_LIGHT7_SGIX = 0x8413;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_fragment_lighting) return;
        ext.glFragmentColorMaterialSGIX = load.invoke("glFragmentColorMaterialSGIX", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFragmentLightfSGIX = load.invoke("glFragmentLightfSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glFragmentLightfvSGIX = load.invoke("glFragmentLightfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFragmentLightiSGIX = load.invoke("glFragmentLightiSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFragmentLightivSGIX = load.invoke("glFragmentLightivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFragmentLightModelfSGIX = load.invoke("glFragmentLightModelfSGIX", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glFragmentLightModelfvSGIX = load.invoke("glFragmentLightModelfvSGIX", ofVoid(JAVA_INT, ADDRESS));
        ext.glFragmentLightModeliSGIX = load.invoke("glFragmentLightModeliSGIX", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFragmentLightModelivSGIX = load.invoke("glFragmentLightModelivSGIX", ofVoid(JAVA_INT, ADDRESS));
        ext.glFragmentMaterialfSGIX = load.invoke("glFragmentMaterialfSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glFragmentMaterialfvSGIX = load.invoke("glFragmentMaterialfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFragmentMaterialiSGIX = load.invoke("glFragmentMaterialiSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFragmentMaterialivSGIX = load.invoke("glFragmentMaterialivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFragmentLightfvSGIX = load.invoke("glGetFragmentLightfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFragmentLightivSGIX = load.invoke("glGetFragmentLightivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFragmentMaterialfvSGIX = load.invoke("glGetFragmentMaterialfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFragmentMaterialivSGIX = load.invoke("glGetFragmentMaterialivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glLightEnviSGIX = load.invoke("glLightEnviSGIX", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glFragmentColorMaterialSGIX(int face, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentColorMaterialSGIX).invokeExact(face, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightfSGIX(int light, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightfSGIX).invokeExact(light, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightfvSGIX(int light, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightfvSGIX).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightiSGIX(int light, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightiSGIX).invokeExact(light, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightivSGIX(int light, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightivSGIX).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightModelfSGIX(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightModelfSGIX).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightModelfvSGIX(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightModelfvSGIX).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightModeliSGIX(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightModeliSGIX).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentLightModelivSGIX(int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentLightModelivSGIX).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentMaterialfSGIX(int face, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentMaterialfSGIX).invokeExact(face, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentMaterialfvSGIX(int face, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentMaterialfvSGIX).invokeExact(face, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentMaterialiSGIX(int face, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentMaterialiSGIX).invokeExact(face, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFragmentMaterialivSGIX(int face, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFragmentMaterialivSGIX).invokeExact(face, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFragmentLightfvSGIX(int light, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFragmentLightfvSGIX).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFragmentLightivSGIX(int light, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFragmentLightivSGIX).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFragmentMaterialfvSGIX(int face, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFragmentMaterialfvSGIX).invokeExact(face, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFragmentMaterialivSGIX(int face, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFragmentMaterialivSGIX).invokeExact(face, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLightEnviSGIX(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLightEnviSGIX).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
