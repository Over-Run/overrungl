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
  * {@code GL_SGIS_pixel_texture}
  */
public final class GLSGISPixelTexture {
    public static final int GL_PIXEL_TEXTURE_SGIS = 0x8353;
    public static final int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = 0x8354;
    public static final int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = 0x8355;
    public static final int GL_PIXEL_GROUP_COLOR_SGIS = 0x8356;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_pixel_texture) return;
        ext.glPixelTexGenParameteriSGIS = load.invoke("glPixelTexGenParameteriSGIS", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPixelTexGenParameterivSGIS = load.invoke("glPixelTexGenParameterivSGIS", ofVoid(JAVA_INT, ADDRESS));
        ext.glPixelTexGenParameterfSGIS = load.invoke("glPixelTexGenParameterfSGIS", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glPixelTexGenParameterfvSGIS = load.invoke("glPixelTexGenParameterfvSGIS", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPixelTexGenParameterivSGIS = load.invoke("glGetPixelTexGenParameterivSGIS", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPixelTexGenParameterfvSGIS = load.invoke("glGetPixelTexGenParameterfvSGIS", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glPixelTexGenParameteriSGIS(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTexGenParameteriSGIS).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTexGenParameterivSGIS(int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTexGenParameterivSGIS).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTexGenParameterfSGIS(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTexGenParameterfSGIS).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTexGenParameterfvSGIS(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTexGenParameterfvSGIS).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPixelTexGenParameterivSGIS(int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPixelTexGenParameterivSGIS).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPixelTexGenParameterfvSGIS(int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPixelTexGenParameterfvSGIS).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
