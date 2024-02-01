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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_OES_fixed_point}
 */
public interface GLOESFixedPoint {
    int GL_FIXED_OES = 0x140C;

    void glAlphaFuncxOES(int func, int ref);
    void glClearColorxOES(int red, int green, int blue, int alpha);
    void glClearDepthxOES(int depth);
    void glClipPlanexOES(int plane, @NativeType("const GLfixed *") MemorySegment equation);
    void glColor4xOES(int red, int green, int blue, int alpha);
    void glDepthRangexOES(int n, int f);
    void glFogxOES(int pname, int param);
    void glFogxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param);
    void glFrustumxOES(int l, int r, int b, int t, int n, int f);
    void glGetClipPlanexOES(int plane, @NativeType("GLfixed *") MemorySegment equation);
    void glGetFixedvOES(int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetTexEnvxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetTexParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glLightModelxOES(int pname, int param);
    void glLightModelxvOES(int pname, @NativeType("const GLfixed *") MemorySegment param);
    void glLightxOES(int light, int pname, int param);
    void glLightxvOES(int light, int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glLineWidthxOES(int width);
    void glLoadMatrixxOES(@NativeType("const GLfixed *") MemorySegment m);
    void glMaterialxOES(int face, int pname, int param);
    void glMaterialxvOES(int face, int pname, @NativeType("const GLfixed *") MemorySegment param);
    void glMultMatrixxOES(@NativeType("const GLfixed *") MemorySegment m);
    void glMultiTexCoord4xOES(int texture, int s, int t, int r, int q);
    void glNormal3xOES(int nx, int ny, int nz);
    void glOrthoxOES(int l, int r, int b, int t, int n, int f);
    void glPointParameterxvOES(int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glPointSizexOES(int size);
    void glPolygonOffsetxOES(int factor, int units);
    void glRotatexOES(int angle, int x, int y, int z);
    void glScalexOES(int x, int y, int z);
    void glTexEnvxOES(int target, int pname, int param);
    void glTexEnvxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glTexParameterxOES(int target, int pname, int param);
    void glTexParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glTranslatexOES(int x, int y, int z);
    void glAccumxOES(int op, int value);
    void glBitmapxOES(int width, int height, int xorig, int yorig, int xmove, int ymove, @NativeType("const GLubyte *") MemorySegment bitmap);
    void glBlendColorxOES(int red, int green, int blue, int alpha);
    void glClearAccumxOES(int red, int green, int blue, int alpha);
    void glColor3xOES(int red, int green, int blue);
    void glColor3xvOES(@NativeType("const GLfixed *") MemorySegment components);
    void glColor4xvOES(@NativeType("const GLfixed *") MemorySegment components);
    void glConvolutionParameterxOES(int target, int pname, int param);
    void glConvolutionParameterxvOES(int target, int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glEvalCoord1xOES(int u);
    void glEvalCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glEvalCoord2xOES(int u, int v);
    void glEvalCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glFeedbackBufferxOES(int n, int type, @NativeType("const GLfixed *") MemorySegment buffer);
    void glGetConvolutionParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetHistogramParameterxvOES(int target, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetLightxOES(int light, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetMapxvOES(int target, int query, @NativeType("GLfixed *") MemorySegment v);
    void glGetMaterialxOES(int face, int pname, int param);
    void glGetPixelMapxv(int map, int size, @NativeType("GLfixed *") MemorySegment values);
    void glGetTexGenxvOES(int coord, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glGetTexLevelParameterxvOES(int target, int level, int pname, @NativeType("GLfixed *") MemorySegment params);
    void glIndexxOES(int component);
    void glIndexxvOES(@NativeType("const GLfixed *") MemorySegment component);
    void glLoadTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m);
    void glMap1xOES(int target, int u1, int u2, int stride, int order, int points);
    void glMap2xOES(int target, int u1, int u2, int ustride, int uorder, int v1, int v2, int vstride, int vorder, int points);
    void glMapGrid1xOES(int n, int u1, int u2);
    void glMapGrid2xOES(int n, int u1, int u2, int v1, int v2);
    void glMultTransposeMatrixxOES(@NativeType("const GLfixed *") MemorySegment m);
    void glMultiTexCoord1xOES(int texture, int s);
    void glMultiTexCoord1xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords);
    void glMultiTexCoord2xOES(int texture, int s, int t);
    void glMultiTexCoord2xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords);
    void glMultiTexCoord3xOES(int texture, int s, int t, int r);
    void glMultiTexCoord3xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords);
    void glMultiTexCoord4xvOES(int texture, @NativeType("const GLfixed *") MemorySegment coords);
    void glNormal3xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glPassThroughxOES(int token);
    void glPixelMapx(int map, int size, @NativeType("const GLfixed *") MemorySegment values);
    void glPixelStorex(int pname, int param);
    void glPixelTransferxOES(int pname, int param);
    void glPixelZoomxOES(int xfactor, int yfactor);
    void glPrioritizeTexturesxOES(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLfixed *") MemorySegment priorities);
    void glRasterPos2xOES(int x, int y);
    void glRasterPos2xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glRasterPos3xOES(int x, int y, int z);
    void glRasterPos3xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glRasterPos4xOES(int x, int y, int z, int w);
    void glRasterPos4xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glRectxOES(int x1, int y1, int x2, int y2);
    void glRectxvOES(@NativeType("const GLfixed *") MemorySegment v1, @NativeType("const GLfixed *") MemorySegment v2);
    void glTexCoord1xOES(int s);
    void glTexCoord1xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glTexCoord2xOES(int s, int t);
    void glTexCoord2xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glTexCoord3xOES(int s, int t, int r);
    void glTexCoord3xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glTexCoord4xOES(int s, int t, int r, int q);
    void glTexCoord4xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glTexGenxOES(int coord, int pname, int param);
    void glTexGenxvOES(int coord, int pname, @NativeType("const GLfixed *") MemorySegment params);
    void glVertex2xOES(int x);
    void glVertex2xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glVertex3xOES(int x, int y);
    void glVertex3xvOES(@NativeType("const GLfixed *") MemorySegment coords);
    void glVertex4xOES(int x, int y, int z);
    void glVertex4xvOES(@NativeType("const GLfixed *") MemorySegment coords);
}
