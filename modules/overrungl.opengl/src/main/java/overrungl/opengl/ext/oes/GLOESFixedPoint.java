/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_OES_fixed_point}
 */
public interface GLOESFixedPoint extends overrun.marshal.DirectAccess {
    int GL_FIXED_OES = 0x140C;

    default void glAlphaFuncxOES(int func, int ref) {
        throw new ContextException();
    }

    default void glClearColorxOES(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    default void glClearDepthxOES(int depth) {
        throw new ContextException();
    }

    default void glClipPlanexOES(int plane, @NativeType("const GLfixed *") MemorySegment equation) {
        throw new ContextException();
    }

    default void glColor4xOES(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    default void glDepthRangexOES(int n, int f) {
        throw new ContextException();
    }

    default void glFogxOES(int pname, int param) {
        throw new ContextException();
    }

    default void glFogxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param) {
        throw new ContextException();
    }

    default void glFrustumxOES(int l, int r, int b, int t, int n, int f) {
        throw new ContextException();
    }

    default void glGetClipPlanexOES(int plane, @NativeType("GLfixed *") MemorySegment equation) {
        throw new ContextException();
    }

    default void glGetFixedvOES(int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTexEnvxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTexParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glLightModelxOES(int pname, int param) {
        throw new ContextException();
    }

    default void glLightModelxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param) {
        throw new ContextException();
    }

    default void glLightxOES(int light, int pname, int param) {
        throw new ContextException();
    }

    default void glLightxvOES(int light, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glLineWidthxOES(int width) {
        throw new ContextException();
    }

    default void glLoadMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMaterialxOES(int face, int pname, int param) {
        throw new ContextException();
    }

    default void glMaterialxvOES(int face, int pname, @NativeType("const GLfixed *") MemorySegment param) {
        throw new ContextException();
    }

    default void glMultMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMultiTexCoord4xOES(int texture, int s, int t, int r, int q) {
        throw new ContextException();
    }

    default void glNormal3xOES(int nx, int ny, int nz) {
        throw new ContextException();
    }

    default void glOrthoxOES(int l, int r, int b, int t, int n, int f) {
        throw new ContextException();
    }

    default void glPointParameterxvOES(int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glPointSizexOES(int size) {
        throw new ContextException();
    }

    default void glPolygonOffsetxOES(int factor, int units) {
        throw new ContextException();
    }

    default void glRotatexOES(int angle, int x, int y, int z) {
        throw new ContextException();
    }

    default void glScalexOES(int x, int y, int z) {
        throw new ContextException();
    }

    default void glTexEnvxOES(int target, int pname, int param) {
        throw new ContextException();
    }

    default void glTexEnvxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTexParameterxOES(int target, int pname, int param) {
        throw new ContextException();
    }

    default void glTexParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTranslatexOES(int x, int y, int z) {
        throw new ContextException();
    }

    default void glAccumxOES(int op, int value) {
        throw new ContextException();
    }

    default void glBitmapxOES(int width, int height, int xorig, int yorig, int xmove, int ymove, @NativeType("const GLubyte *") MemorySegment bitmap) {
        throw new ContextException();
    }

    default void glBlendColorxOES(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    default void glClearAccumxOES(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    default void glColor3xOES(int red, int green, int blue) {
        throw new ContextException();
    }

    default void glColor3xvOES(@NativeType("const GLfixed *") MemorySegment components) {
        throw new ContextException();
    }

    default void glColor4xvOES(@NativeType("const GLfixed *") MemorySegment components) {
        throw new ContextException();
    }

    default void glConvolutionParameterxOES(int target, int pname, int param) {
        throw new ContextException();
    }

    default void glConvolutionParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glEvalCoord1xOES(int u) {
        throw new ContextException();
    }

    default void glEvalCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glEvalCoord2xOES(int u, int v) {
        throw new ContextException();
    }

    default void glEvalCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glFeedbackBufferxOES(int n, int type, @NativeType("const GLfixed *") MemorySegment buffer) {
        throw new ContextException();
    }

    default void glGetConvolutionParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetHistogramParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetLightxOES(int light, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMapxvOES(int target, int query, @NativeType("GLfixed *") MemorySegment v) {
        throw new ContextException();
    }

    default void glGetMaterialxOES(int face, int pname, int param) {
        throw new ContextException();
    }

    default void glGetPixelMapxv(int map, int size, @NativeType("GLfixed *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetTexGenxvOES(int coord, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTexLevelParameterxvOES(int target, int level, int pname, @NativeType("GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glIndexxOES(int component) {
        throw new ContextException();
    }

    default void glIndexxvOES(@NativeType("const GLfixed *") MemorySegment component) {
        throw new ContextException();
    }

    default void glLoadTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMap1xOES(int target, int u1, int u2, int stride, int order, int points) {
        throw new ContextException();
    }

    default void glMap2xOES(int target, int u1, int u2, int ustride, int uorder, int v1, int v2, int vstride, int vorder, int points) {
        throw new ContextException();
    }

    default void glMapGrid1xOES(int n, int u1, int u2) {
        throw new ContextException();
    }

    default void glMapGrid2xOES(int n, int u1, int u2, int v1, int v2) {
        throw new ContextException();
    }

    default void glMultTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMultiTexCoord1xOES(int texture, int s) {
        throw new ContextException();
    }

    default void glMultiTexCoord1xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glMultiTexCoord2xOES(int texture, int s, int t) {
        throw new ContextException();
    }

    default void glMultiTexCoord2xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glMultiTexCoord3xOES(int texture, int s, int t, int r) {
        throw new ContextException();
    }

    default void glMultiTexCoord3xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glMultiTexCoord4xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormal3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glPassThroughxOES(int token) {
        throw new ContextException();
    }

    default void glPixelMapx(int map, int size, @NativeType("const GLfixed *") MemorySegment values) {
        throw new ContextException();
    }

    default void glPixelStorex(int pname, int param) {
        throw new ContextException();
    }

    default void glPixelTransferxOES(int pname, int param) {
        throw new ContextException();
    }

    default void glPixelZoomxOES(int xfactor, int yfactor) {
        throw new ContextException();
    }

    default void glPrioritizeTexturesxOES(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLfixed *") MemorySegment priorities) {
        throw new ContextException();
    }

    default void glRasterPos2xOES(int x, int y) {
        throw new ContextException();
    }

    default void glRasterPos2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glRasterPos3xOES(int x, int y, int z) {
        throw new ContextException();
    }

    default void glRasterPos3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glRasterPos4xOES(int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glRasterPos4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glRectxOES(int x1, int y1, int x2, int y2) {
        throw new ContextException();
    }

    default void glRectxvOES(@NativeType("const GLfixed *") MemorySegment v1, @NativeType("const GLfixed *") MemorySegment v2) {
        throw new ContextException();
    }

    default void glTexCoord1xOES(int s) {
        throw new ContextException();
    }

    default void glTexCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glTexCoord2xOES(int s, int t) {
        throw new ContextException();
    }

    default void glTexCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glTexCoord3xOES(int s, int t, int r) {
        throw new ContextException();
    }

    default void glTexCoord3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glTexCoord4xOES(int s, int t, int r, int q) {
        throw new ContextException();
    }

    default void glTexCoord4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glTexGenxOES(int coord, int pname, int param) {
        throw new ContextException();
    }

    default void glTexGenxvOES(int coord, int pname, @NativeType("const GLfixed *") MemorySegment params) {
        throw new ContextException();
    }

    default void glVertex2xOES(int x) {
        throw new ContextException();
    }

    default void glVertex2xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertex3xOES(int x, int y) {
        throw new ContextException();
    }

    default void glVertex3xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertex4xOES(int x, int y, int z) {
        throw new ContextException();
    }

    default void glVertex4xvOES(@NativeType("const GLfixed *") MemorySegment coords) {
        throw new ContextException();
    }

}
