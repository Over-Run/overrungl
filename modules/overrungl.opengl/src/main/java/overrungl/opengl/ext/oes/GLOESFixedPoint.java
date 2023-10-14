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
package overrungl.opengl.ext.oes;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_OES_fixed_point}
  */
public final class GLOESFixedPoint {
    public static final int GL_FIXED_OES = 0x140C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_OES_fixed_point) return;
        ext.glAlphaFuncxOES = load.invoke("glAlphaFuncxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glClearColorxOES = load.invoke("glClearColorxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glClearDepthxOES = load.invoke("glClearDepthxOES", ofVoid(JAVA_INT));
        ext.glClipPlanexOES = load.invoke("glClipPlanexOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glColor4xOES = load.invoke("glColor4xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glDepthRangexOES = load.invoke("glDepthRangexOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFogxOES = load.invoke("glFogxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFogxvOES = load.invoke("glFogxvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glFrustumxOES = load.invoke("glFrustumxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetClipPlanexOES = load.invoke("glGetClipPlanexOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetFixedvOES = load.invoke("glGetFixedvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetTexEnvxvOES = load.invoke("glGetTexEnvxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexParameterxvOES = load.invoke("glGetTexParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glLightModelxOES = load.invoke("glLightModelxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glLightModelxvOES = load.invoke("glLightModelxvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glLightxOES = load.invoke("glLightxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glLightxvOES = load.invoke("glLightxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glLineWidthxOES = load.invoke("glLineWidthxOES", ofVoid(JAVA_INT));
        ext.glLoadMatrixxOES = load.invoke("glLoadMatrixxOES", ofVoid(ADDRESS));
        ext.glMaterialxOES = load.invoke("glMaterialxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMaterialxvOES = load.invoke("glMaterialxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultMatrixxOES = load.invoke("glMultMatrixxOES", ofVoid(ADDRESS));
        ext.glMultiTexCoord4xOES = load.invoke("glMultiTexCoord4xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNormal3xOES = load.invoke("glNormal3xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glOrthoxOES = load.invoke("glOrthoxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPointParameterxvOES = load.invoke("glPointParameterxvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glPointSizexOES = load.invoke("glPointSizexOES", ofVoid(JAVA_INT));
        ext.glPolygonOffsetxOES = load.invoke("glPolygonOffsetxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glRotatexOES = load.invoke("glRotatexOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glScalexOES = load.invoke("glScalexOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexEnvxOES = load.invoke("glTexEnvxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexEnvxvOES = load.invoke("glTexEnvxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexParameterxOES = load.invoke("glTexParameterxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexParameterxvOES = load.invoke("glTexParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTranslatexOES = load.invoke("glTranslatexOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glAccumxOES = load.invoke("glAccumxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glBitmapxOES = load.invoke("glBitmapxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glBlendColorxOES = load.invoke("glBlendColorxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glClearAccumxOES = load.invoke("glClearAccumxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glColor3xOES = load.invoke("glColor3xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glColor3xvOES = load.invoke("glColor3xvOES", ofVoid(ADDRESS));
        ext.glColor4xvOES = load.invoke("glColor4xvOES", ofVoid(ADDRESS));
        ext.glConvolutionParameterxOES = load.invoke("glConvolutionParameterxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glConvolutionParameterxvOES = load.invoke("glConvolutionParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glEvalCoord1xOES = load.invoke("glEvalCoord1xOES", ofVoid(JAVA_INT));
        ext.glEvalCoord1xvOES = load.invoke("glEvalCoord1xvOES", ofVoid(ADDRESS));
        ext.glEvalCoord2xOES = load.invoke("glEvalCoord2xOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glEvalCoord2xvOES = load.invoke("glEvalCoord2xvOES", ofVoid(ADDRESS));
        ext.glFeedbackBufferxOES = load.invoke("glFeedbackBufferxOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetConvolutionParameterxvOES = load.invoke("glGetConvolutionParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetHistogramParameterxvOES = load.invoke("glGetHistogramParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetLightxOES = load.invoke("glGetLightxOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMapxvOES = load.invoke("glGetMapxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMaterialxOES = load.invoke("glGetMaterialxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetPixelMapxv = load.invoke("glGetPixelMapxv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexGenxvOES = load.invoke("glGetTexGenxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexLevelParameterxvOES = load.invoke("glGetTexLevelParameterxvOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIndexxOES = load.invoke("glIndexxOES", ofVoid(JAVA_INT));
        ext.glIndexxvOES = load.invoke("glIndexxvOES", ofVoid(ADDRESS));
        ext.glLoadTransposeMatrixxOES = load.invoke("glLoadTransposeMatrixxOES", ofVoid(ADDRESS));
        ext.glMap1xOES = load.invoke("glMap1xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMap2xOES = load.invoke("glMap2xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMapGrid1xOES = load.invoke("glMapGrid1xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMapGrid2xOES = load.invoke("glMapGrid2xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultTransposeMatrixxOES = load.invoke("glMultTransposeMatrixxOES", ofVoid(ADDRESS));
        ext.glMultiTexCoord1xOES = load.invoke("glMultiTexCoord1xOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glMultiTexCoord1xvOES = load.invoke("glMultiTexCoord1xvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord2xOES = load.invoke("glMultiTexCoord2xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexCoord2xvOES = load.invoke("glMultiTexCoord2xvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord3xOES = load.invoke("glMultiTexCoord3xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexCoord3xvOES = load.invoke("glMultiTexCoord3xvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord4xvOES = load.invoke("glMultiTexCoord4xvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormal3xvOES = load.invoke("glNormal3xvOES", ofVoid(ADDRESS));
        ext.glPassThroughxOES = load.invoke("glPassThroughxOES", ofVoid(JAVA_INT));
        ext.glPixelMapx = load.invoke("glPixelMapx", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPixelStorex = load.invoke("glPixelStorex", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPixelTransferxOES = load.invoke("glPixelTransferxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPixelZoomxOES = load.invoke("glPixelZoomxOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPrioritizeTexturesxOES = load.invoke("glPrioritizeTexturesxOES", ofVoid(JAVA_INT, ADDRESS, ADDRESS));
        ext.glRasterPos2xOES = load.invoke("glRasterPos2xOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glRasterPos2xvOES = load.invoke("glRasterPos2xvOES", ofVoid(ADDRESS));
        ext.glRasterPos3xOES = load.invoke("glRasterPos3xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glRasterPos3xvOES = load.invoke("glRasterPos3xvOES", ofVoid(ADDRESS));
        ext.glRasterPos4xOES = load.invoke("glRasterPos4xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glRasterPos4xvOES = load.invoke("glRasterPos4xvOES", ofVoid(ADDRESS));
        ext.glRectxOES = load.invoke("glRectxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glRectxvOES = load.invoke("glRectxvOES", ofVoid(ADDRESS, ADDRESS));
        ext.glTexCoord1xOES = load.invoke("glTexCoord1xOES", ofVoid(JAVA_INT));
        ext.glTexCoord1xvOES = load.invoke("glTexCoord1xvOES", ofVoid(ADDRESS));
        ext.glTexCoord2xOES = load.invoke("glTexCoord2xOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glTexCoord2xvOES = load.invoke("glTexCoord2xvOES", ofVoid(ADDRESS));
        ext.glTexCoord3xOES = load.invoke("glTexCoord3xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexCoord3xvOES = load.invoke("glTexCoord3xvOES", ofVoid(ADDRESS));
        ext.glTexCoord4xOES = load.invoke("glTexCoord4xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexCoord4xvOES = load.invoke("glTexCoord4xvOES", ofVoid(ADDRESS));
        ext.glTexGenxOES = load.invoke("glTexGenxOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexGenxvOES = load.invoke("glTexGenxvOES", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertex2xOES = load.invoke("glVertex2xOES", ofVoid(JAVA_INT));
        ext.glVertex2xvOES = load.invoke("glVertex2xvOES", ofVoid(ADDRESS));
        ext.glVertex3xOES = load.invoke("glVertex3xOES", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertex3xvOES = load.invoke("glVertex3xvOES", ofVoid(ADDRESS));
        ext.glVertex4xOES = load.invoke("glVertex4xOES", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertex4xvOES = load.invoke("glVertex4xvOES", ofVoid(ADDRESS));
    }

    public static void glAlphaFuncxOES(int func, int ref) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAlphaFuncxOES).invokeExact(func, ref);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearColorxOES(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearColorxOES).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearDepthxOES(int depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearDepthxOES).invokeExact(depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClipPlanexOES(int plane, @NativeType("const GLfixed *") MemorySegment equation) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClipPlanexOES).invokeExact(plane, equation);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4xOES(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4xOES).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDepthRangexOES(int n, int f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthRangexOES).invokeExact(n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogxOES(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogxOES).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogxvOES).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFrustumxOES(int l, int r, int b, int t, int n, int f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFrustumxOES).invokeExact(l, r, b, t, n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetClipPlanexOES(int plane, @NativeType("GLfixed *") MemorySegment equation) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetClipPlanexOES).invokeExact(plane, equation);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFixedvOES(int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFixedvOES).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexEnvxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexEnvxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexParameterxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLightModelxOES(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLightModelxOES).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLightModelxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLightModelxvOES).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLightxOES(int light, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLightxOES).invokeExact(light, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLightxvOES(int light, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLightxvOES).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLineWidthxOES(int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLineWidthxOES).invokeExact(width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLoadMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadMatrixxOES).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMaterialxOES(int face, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMaterialxOES).invokeExact(face, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMaterialxvOES(int face, int pname, @NativeType("const GLfixed *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMaterialxvOES).invokeExact(face, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultMatrixxOES).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4xOES(int texture, int s, int t, int r, int q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4xOES).invokeExact(texture, s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3xOES(int nx, int ny, int nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3xOES).invokeExact(nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glOrthoxOES(int l, int r, int b, int t, int n, int f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glOrthoxOES).invokeExact(l, r, b, t, n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPointParameterxvOES(int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterxvOES).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPointSizexOES(int size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointSizexOES).invokeExact(size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPolygonOffsetxOES(int factor, int units) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPolygonOffsetxOES).invokeExact(factor, units);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRotatexOES(int angle, int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRotatexOES).invokeExact(angle, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glScalexOES(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glScalexOES).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexEnvxOES(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexEnvxOES).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexEnvxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexEnvxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexParameterxOES(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexParameterxOES).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexParameterxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTranslatexOES(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTranslatexOES).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glAccumxOES(int op, int value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAccumxOES).invokeExact(op, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBitmapxOES(int width, int height, int xorig, int yorig, int xmove, int ymove, @NativeType("const GLubyte *") MemorySegment bitmap) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBitmapxOES).invokeExact(width, height, xorig, yorig, xmove, ymove, bitmap);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBlendColorxOES(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendColorxOES).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearAccumxOES(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearAccumxOES).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3xOES(int red, int green, int blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3xOES).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3xvOES(@NativeType("const GLfixed *") MemorySegment components) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3xvOES).invokeExact(components);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4xvOES(@NativeType("const GLfixed *") MemorySegment components) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4xvOES).invokeExact(components);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterxOES(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterxOES).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEvalCoord1xOES(int u) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvalCoord1xOES).invokeExact(u);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEvalCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvalCoord1xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEvalCoord2xOES(int u, int v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvalCoord2xOES).invokeExact(u, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEvalCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvalCoord2xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFeedbackBufferxOES(int n, int type, @NativeType("const GLfixed *") MemorySegment buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFeedbackBufferxOES).invokeExact(n, type, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionParameterxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogramParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramParameterxvOES).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetLightxOES(int light, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetLightxOES).invokeExact(light, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapxvOES(int target, int query, @NativeType("GLfixed *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapxvOES).invokeExact(target, query, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMaterialxOES(int face, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMaterialxOES).invokeExact(face, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPixelMapxv(int map, int size, @NativeType("GLfixed *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPixelMapxv).invokeExact(map, size, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexGenxvOES(int coord, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexGenxvOES).invokeExact(coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexLevelParameterxvOES(int target, int level, int pname, @NativeType("GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexLevelParameterxvOES).invokeExact(target, level, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glIndexxOES(int component) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glIndexxOES).invokeExact(component);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glIndexxvOES(@NativeType("const GLfixed *") MemorySegment component) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glIndexxvOES).invokeExact(component);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLoadTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadTransposeMatrixxOES).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMap1xOES(int target, int u1, int u2, int stride, int order, int points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMap1xOES).invokeExact(target, u1, u2, stride, order, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMap2xOES(int target, int u1, int u2, int ustride, int uorder, int v1, int v2, int vstride, int vorder, int points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMap2xOES).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapGrid1xOES(int n, int u1, int u2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapGrid1xOES).invokeExact(n, u1, u2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapGrid2xOES(int n, int u1, int u2, int v1, int v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapGrid2xOES).invokeExact(n, u1, u2, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultTransposeMatrixxOES).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord1xOES(int texture, int s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1xOES).invokeExact(texture, s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord1xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1xvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2xOES(int texture, int s, int t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2xOES).invokeExact(texture, s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2xvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3xOES(int texture, int s, int t, int r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3xOES).invokeExact(texture, s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3xvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4xvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPassThroughxOES(int token) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPassThroughxOES).invokeExact(token);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelMapx(int map, int size, @NativeType("const GLfixed *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelMapx).invokeExact(map, size, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelStorex(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelStorex).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTransferxOES(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTransferxOES).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelZoomxOES(int xfactor, int yfactor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelZoomxOES).invokeExact(xfactor, yfactor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPrioritizeTexturesxOES(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLfixed *") MemorySegment priorities) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPrioritizeTexturesxOES).invokeExact(n, textures, priorities);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos2xOES(int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos2xOES).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos2xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos3xOES(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos3xOES).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos3xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos4xOES(int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos4xOES).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRasterPos4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRasterPos4xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRectxOES(int x1, int y1, int x2, int y2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRectxOES).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRectxvOES(@NativeType("const GLfixed *") MemorySegment v1, @NativeType("const GLfixed *") MemorySegment v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRectxvOES).invokeExact(v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1xOES(int s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1xOES).invokeExact(s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2xOES(int s, int t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2xOES).invokeExact(s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3xOES(int s, int t, int r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3xOES).invokeExact(s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4xOES(int s, int t, int r, int q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4xOES).invokeExact(s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexGenxOES(int coord, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexGenxOES).invokeExact(coord, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexGenxvOES(int coord, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexGenxvOES).invokeExact(coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex2xOES(int x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2xOES).invokeExact(x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3xOES(int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3xOES).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4xOES(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4xOES).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4xvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
