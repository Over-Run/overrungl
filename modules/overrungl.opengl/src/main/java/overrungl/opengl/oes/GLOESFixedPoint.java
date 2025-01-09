/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.oes;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESFixedPoint {
    public static final int GL_FIXED_OES = 0x140C;
    public static final MethodHandle MH_glAlphaFuncxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClearColorxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClearDepthxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClipPlanexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glColor4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDepthRangexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFogxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFogxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFrustumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetClipPlanexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFixedvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexEnvxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLightModelxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glLightModelxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLightxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glLightxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLineWidthxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glLoadMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMaterialxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMaterialxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultiTexCoord4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glNormal3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glOrthoxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPointParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPointSizexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPolygonOffsetxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glRotatexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glScalexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexEnvxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexEnvxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTranslatexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetLightxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetMaterialxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPointParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glSampleCoveragexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public static final MethodHandle MH_glAccumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBitmapxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glBlendColorxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClearAccumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glColor3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glColor3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glColor4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glConvolutionParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glConvolutionParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glEvalCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glEvalCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glEvalCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glEvalCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFeedbackBufferxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetConvolutionParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetHistogramParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetLightxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetMapxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetMaterialxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetPixelMapxv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexGenxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexLevelParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIndexxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glIndexxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLoadTransposeMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMap1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMap2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMapGrid1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMapGrid2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultTransposeMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultiTexCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiTexCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultiTexCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiTexCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultiTexCoord3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glMultiTexCoord3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glMultiTexCoord4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glNormal3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPassThroughxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPixelMapx = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPixelStorex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPixelTransferxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPixelZoomxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPrioritizeTexturesxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glRasterPos2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glRasterPos2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glRasterPos3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glRasterPos3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glRasterPos4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glRasterPos4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glRectxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glRectxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexCoord3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexCoord3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexCoord4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexCoord4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexGenxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexGenxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertex2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertex2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertex3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertex3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertex4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertex4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glAlphaFuncxOES;
    public final MemorySegment PFN_glClearColorxOES;
    public final MemorySegment PFN_glClearDepthxOES;
    public final MemorySegment PFN_glClipPlanexOES;
    public final MemorySegment PFN_glColor4xOES;
    public final MemorySegment PFN_glDepthRangexOES;
    public final MemorySegment PFN_glFogxOES;
    public final MemorySegment PFN_glFogxvOES;
    public final MemorySegment PFN_glFrustumxOES;
    public final MemorySegment PFN_glGetClipPlanexOES;
    public final MemorySegment PFN_glGetFixedvOES;
    public final MemorySegment PFN_glGetTexEnvxvOES;
    public final MemorySegment PFN_glGetTexParameterxvOES;
    public final MemorySegment PFN_glLightModelxOES;
    public final MemorySegment PFN_glLightModelxvOES;
    public final MemorySegment PFN_glLightxOES;
    public final MemorySegment PFN_glLightxvOES;
    public final MemorySegment PFN_glLineWidthxOES;
    public final MemorySegment PFN_glLoadMatrixxOES;
    public final MemorySegment PFN_glMaterialxOES;
    public final MemorySegment PFN_glMaterialxvOES;
    public final MemorySegment PFN_glMultMatrixxOES;
    public final MemorySegment PFN_glMultiTexCoord4xOES;
    public final MemorySegment PFN_glNormal3xOES;
    public final MemorySegment PFN_glOrthoxOES;
    public final MemorySegment PFN_glPointParameterxvOES;
    public final MemorySegment PFN_glPointSizexOES;
    public final MemorySegment PFN_glPolygonOffsetxOES;
    public final MemorySegment PFN_glRotatexOES;
    public final MemorySegment PFN_glScalexOES;
    public final MemorySegment PFN_glTexEnvxOES;
    public final MemorySegment PFN_glTexEnvxvOES;
    public final MemorySegment PFN_glTexParameterxOES;
    public final MemorySegment PFN_glTexParameterxvOES;
    public final MemorySegment PFN_glTranslatexOES;
    public final MemorySegment PFN_glGetLightxvOES;
    public final MemorySegment PFN_glGetMaterialxvOES;
    public final MemorySegment PFN_glPointParameterxOES;
    public final MemorySegment PFN_glSampleCoveragexOES;
    public final MemorySegment PFN_glAccumxOES;
    public final MemorySegment PFN_glBitmapxOES;
    public final MemorySegment PFN_glBlendColorxOES;
    public final MemorySegment PFN_glClearAccumxOES;
    public final MemorySegment PFN_glColor3xOES;
    public final MemorySegment PFN_glColor3xvOES;
    public final MemorySegment PFN_glColor4xvOES;
    public final MemorySegment PFN_glConvolutionParameterxOES;
    public final MemorySegment PFN_glConvolutionParameterxvOES;
    public final MemorySegment PFN_glEvalCoord1xOES;
    public final MemorySegment PFN_glEvalCoord1xvOES;
    public final MemorySegment PFN_glEvalCoord2xOES;
    public final MemorySegment PFN_glEvalCoord2xvOES;
    public final MemorySegment PFN_glFeedbackBufferxOES;
    public final MemorySegment PFN_glGetConvolutionParameterxvOES;
    public final MemorySegment PFN_glGetHistogramParameterxvOES;
    public final MemorySegment PFN_glGetLightxOES;
    public final MemorySegment PFN_glGetMapxvOES;
    public final MemorySegment PFN_glGetMaterialxOES;
    public final MemorySegment PFN_glGetPixelMapxv;
    public final MemorySegment PFN_glGetTexGenxvOES;
    public final MemorySegment PFN_glGetTexLevelParameterxvOES;
    public final MemorySegment PFN_glIndexxOES;
    public final MemorySegment PFN_glIndexxvOES;
    public final MemorySegment PFN_glLoadTransposeMatrixxOES;
    public final MemorySegment PFN_glMap1xOES;
    public final MemorySegment PFN_glMap2xOES;
    public final MemorySegment PFN_glMapGrid1xOES;
    public final MemorySegment PFN_glMapGrid2xOES;
    public final MemorySegment PFN_glMultTransposeMatrixxOES;
    public final MemorySegment PFN_glMultiTexCoord1xOES;
    public final MemorySegment PFN_glMultiTexCoord1xvOES;
    public final MemorySegment PFN_glMultiTexCoord2xOES;
    public final MemorySegment PFN_glMultiTexCoord2xvOES;
    public final MemorySegment PFN_glMultiTexCoord3xOES;
    public final MemorySegment PFN_glMultiTexCoord3xvOES;
    public final MemorySegment PFN_glMultiTexCoord4xvOES;
    public final MemorySegment PFN_glNormal3xvOES;
    public final MemorySegment PFN_glPassThroughxOES;
    public final MemorySegment PFN_glPixelMapx;
    public final MemorySegment PFN_glPixelStorex;
    public final MemorySegment PFN_glPixelTransferxOES;
    public final MemorySegment PFN_glPixelZoomxOES;
    public final MemorySegment PFN_glPrioritizeTexturesxOES;
    public final MemorySegment PFN_glRasterPos2xOES;
    public final MemorySegment PFN_glRasterPos2xvOES;
    public final MemorySegment PFN_glRasterPos3xOES;
    public final MemorySegment PFN_glRasterPos3xvOES;
    public final MemorySegment PFN_glRasterPos4xOES;
    public final MemorySegment PFN_glRasterPos4xvOES;
    public final MemorySegment PFN_glRectxOES;
    public final MemorySegment PFN_glRectxvOES;
    public final MemorySegment PFN_glTexCoord1xOES;
    public final MemorySegment PFN_glTexCoord1xvOES;
    public final MemorySegment PFN_glTexCoord2xOES;
    public final MemorySegment PFN_glTexCoord2xvOES;
    public final MemorySegment PFN_glTexCoord3xOES;
    public final MemorySegment PFN_glTexCoord3xvOES;
    public final MemorySegment PFN_glTexCoord4xOES;
    public final MemorySegment PFN_glTexCoord4xvOES;
    public final MemorySegment PFN_glTexGenxOES;
    public final MemorySegment PFN_glTexGenxvOES;
    public final MemorySegment PFN_glVertex2xOES;
    public final MemorySegment PFN_glVertex2xvOES;
    public final MemorySegment PFN_glVertex3xOES;
    public final MemorySegment PFN_glVertex3xvOES;
    public final MemorySegment PFN_glVertex4xOES;
    public final MemorySegment PFN_glVertex4xvOES;

    public GLOESFixedPoint(overrungl.opengl.GLLoadFunc func) {
        PFN_glAlphaFuncxOES = func.invoke("glAlphaFuncxOES");
        PFN_glClearColorxOES = func.invoke("glClearColorxOES");
        PFN_glClearDepthxOES = func.invoke("glClearDepthxOES");
        PFN_glClipPlanexOES = func.invoke("glClipPlanexOES");
        PFN_glColor4xOES = func.invoke("glColor4xOES");
        PFN_glDepthRangexOES = func.invoke("glDepthRangexOES");
        PFN_glFogxOES = func.invoke("glFogxOES");
        PFN_glFogxvOES = func.invoke("glFogxvOES");
        PFN_glFrustumxOES = func.invoke("glFrustumxOES");
        PFN_glGetClipPlanexOES = func.invoke("glGetClipPlanexOES");
        PFN_glGetFixedvOES = func.invoke("glGetFixedvOES");
        PFN_glGetTexEnvxvOES = func.invoke("glGetTexEnvxvOES");
        PFN_glGetTexParameterxvOES = func.invoke("glGetTexParameterxvOES");
        PFN_glLightModelxOES = func.invoke("glLightModelxOES");
        PFN_glLightModelxvOES = func.invoke("glLightModelxvOES");
        PFN_glLightxOES = func.invoke("glLightxOES");
        PFN_glLightxvOES = func.invoke("glLightxvOES");
        PFN_glLineWidthxOES = func.invoke("glLineWidthxOES");
        PFN_glLoadMatrixxOES = func.invoke("glLoadMatrixxOES");
        PFN_glMaterialxOES = func.invoke("glMaterialxOES");
        PFN_glMaterialxvOES = func.invoke("glMaterialxvOES");
        PFN_glMultMatrixxOES = func.invoke("glMultMatrixxOES");
        PFN_glMultiTexCoord4xOES = func.invoke("glMultiTexCoord4xOES");
        PFN_glNormal3xOES = func.invoke("glNormal3xOES");
        PFN_glOrthoxOES = func.invoke("glOrthoxOES");
        PFN_glPointParameterxvOES = func.invoke("glPointParameterxvOES");
        PFN_glPointSizexOES = func.invoke("glPointSizexOES");
        PFN_glPolygonOffsetxOES = func.invoke("glPolygonOffsetxOES");
        PFN_glRotatexOES = func.invoke("glRotatexOES");
        PFN_glScalexOES = func.invoke("glScalexOES");
        PFN_glTexEnvxOES = func.invoke("glTexEnvxOES");
        PFN_glTexEnvxvOES = func.invoke("glTexEnvxvOES");
        PFN_glTexParameterxOES = func.invoke("glTexParameterxOES");
        PFN_glTexParameterxvOES = func.invoke("glTexParameterxvOES");
        PFN_glTranslatexOES = func.invoke("glTranslatexOES");PFN_glGetLightxvOES = func.invoke("glGetLightxvOES");
        PFN_glGetMaterialxvOES = func.invoke("glGetMaterialxvOES");
        PFN_glPointParameterxOES = func.invoke("glPointParameterxOES");
        PFN_glSampleCoveragexOES = func.invoke("glSampleCoveragexOES");PFN_glAccumxOES = func.invoke("glAccumxOES");
        PFN_glBitmapxOES = func.invoke("glBitmapxOES");
        PFN_glBlendColorxOES = func.invoke("glBlendColorxOES");
        PFN_glClearAccumxOES = func.invoke("glClearAccumxOES");
        PFN_glColor3xOES = func.invoke("glColor3xOES");
        PFN_glColor3xvOES = func.invoke("glColor3xvOES");
        PFN_glColor4xvOES = func.invoke("glColor4xvOES");
        PFN_glConvolutionParameterxOES = func.invoke("glConvolutionParameterxOES");
        PFN_glConvolutionParameterxvOES = func.invoke("glConvolutionParameterxvOES");
        PFN_glEvalCoord1xOES = func.invoke("glEvalCoord1xOES");
        PFN_glEvalCoord1xvOES = func.invoke("glEvalCoord1xvOES");
        PFN_glEvalCoord2xOES = func.invoke("glEvalCoord2xOES");
        PFN_glEvalCoord2xvOES = func.invoke("glEvalCoord2xvOES");
        PFN_glFeedbackBufferxOES = func.invoke("glFeedbackBufferxOES");
        PFN_glGetConvolutionParameterxvOES = func.invoke("glGetConvolutionParameterxvOES");
        PFN_glGetHistogramParameterxvOES = func.invoke("glGetHistogramParameterxvOES");
        PFN_glGetLightxOES = func.invoke("glGetLightxOES");
        PFN_glGetMapxvOES = func.invoke("glGetMapxvOES");
        PFN_glGetMaterialxOES = func.invoke("glGetMaterialxOES");
        PFN_glGetPixelMapxv = func.invoke("glGetPixelMapxv");
        PFN_glGetTexGenxvOES = func.invoke("glGetTexGenxvOES");
        PFN_glGetTexLevelParameterxvOES = func.invoke("glGetTexLevelParameterxvOES");
        PFN_glIndexxOES = func.invoke("glIndexxOES");
        PFN_glIndexxvOES = func.invoke("glIndexxvOES");
        PFN_glLoadTransposeMatrixxOES = func.invoke("glLoadTransposeMatrixxOES");
        PFN_glMap1xOES = func.invoke("glMap1xOES");
        PFN_glMap2xOES = func.invoke("glMap2xOES");
        PFN_glMapGrid1xOES = func.invoke("glMapGrid1xOES");
        PFN_glMapGrid2xOES = func.invoke("glMapGrid2xOES");
        PFN_glMultTransposeMatrixxOES = func.invoke("glMultTransposeMatrixxOES");
        PFN_glMultiTexCoord1xOES = func.invoke("glMultiTexCoord1xOES");
        PFN_glMultiTexCoord1xvOES = func.invoke("glMultiTexCoord1xvOES");
        PFN_glMultiTexCoord2xOES = func.invoke("glMultiTexCoord2xOES");
        PFN_glMultiTexCoord2xvOES = func.invoke("glMultiTexCoord2xvOES");
        PFN_glMultiTexCoord3xOES = func.invoke("glMultiTexCoord3xOES");
        PFN_glMultiTexCoord3xvOES = func.invoke("glMultiTexCoord3xvOES");
        PFN_glMultiTexCoord4xvOES = func.invoke("glMultiTexCoord4xvOES");
        PFN_glNormal3xvOES = func.invoke("glNormal3xvOES");
        PFN_glPassThroughxOES = func.invoke("glPassThroughxOES");
        PFN_glPixelMapx = func.invoke("glPixelMapx");
        PFN_glPixelStorex = func.invoke("glPixelStorex");
        PFN_glPixelTransferxOES = func.invoke("glPixelTransferxOES");
        PFN_glPixelZoomxOES = func.invoke("glPixelZoomxOES");
        PFN_glPrioritizeTexturesxOES = func.invoke("glPrioritizeTexturesxOES");
        PFN_glRasterPos2xOES = func.invoke("glRasterPos2xOES");
        PFN_glRasterPos2xvOES = func.invoke("glRasterPos2xvOES");
        PFN_glRasterPos3xOES = func.invoke("glRasterPos3xOES");
        PFN_glRasterPos3xvOES = func.invoke("glRasterPos3xvOES");
        PFN_glRasterPos4xOES = func.invoke("glRasterPos4xOES");
        PFN_glRasterPos4xvOES = func.invoke("glRasterPos4xvOES");
        PFN_glRectxOES = func.invoke("glRectxOES");
        PFN_glRectxvOES = func.invoke("glRectxvOES");
        PFN_glTexCoord1xOES = func.invoke("glTexCoord1xOES");
        PFN_glTexCoord1xvOES = func.invoke("glTexCoord1xvOES");
        PFN_glTexCoord2xOES = func.invoke("glTexCoord2xOES");
        PFN_glTexCoord2xvOES = func.invoke("glTexCoord2xvOES");
        PFN_glTexCoord3xOES = func.invoke("glTexCoord3xOES");
        PFN_glTexCoord3xvOES = func.invoke("glTexCoord3xvOES");
        PFN_glTexCoord4xOES = func.invoke("glTexCoord4xOES");
        PFN_glTexCoord4xvOES = func.invoke("glTexCoord4xvOES");
        PFN_glTexGenxOES = func.invoke("glTexGenxOES");
        PFN_glTexGenxvOES = func.invoke("glTexGenxvOES");
        PFN_glVertex2xOES = func.invoke("glVertex2xOES");
        PFN_glVertex2xvOES = func.invoke("glVertex2xvOES");
        PFN_glVertex3xOES = func.invoke("glVertex3xOES");
        PFN_glVertex3xvOES = func.invoke("glVertex3xvOES");
        PFN_glVertex4xOES = func.invoke("glVertex4xOES");
        PFN_glVertex4xvOES = func.invoke("glVertex4xvOES");
    }

    public void AlphaFuncxOES(@CType("GLenum") int func, @CType("GLfixed") int ref) {
        if (Unmarshal.isNullPointer(PFN_glAlphaFuncxOES)) throw new SymbolNotFoundError("Symbol not found: glAlphaFuncxOES");
        try { MH_glAlphaFuncxOES.invokeExact(PFN_glAlphaFuncxOES, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaFuncxOES", e); }
    }

    public void ClearColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(PFN_glClearColorxOES)) throw new SymbolNotFoundError("Symbol not found: glClearColorxOES");
        try { MH_glClearColorxOES.invokeExact(PFN_glClearColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearColorxOES", e); }
    }

    public void ClearDepthxOES(@CType("GLfixed") int depth) {
        if (Unmarshal.isNullPointer(PFN_glClearDepthxOES)) throw new SymbolNotFoundError("Symbol not found: glClearDepthxOES");
        try { MH_glClearDepthxOES.invokeExact(PFN_glClearDepthxOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthxOES", e); }
    }

    public void ClipPlanexOES(@CType("GLenum") int plane, @CType("const GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (Unmarshal.isNullPointer(PFN_glClipPlanexOES)) throw new SymbolNotFoundError("Symbol not found: glClipPlanexOES");
        try { MH_glClipPlanexOES.invokeExact(PFN_glClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glClipPlanexOES", e); }
    }

    public void Color4xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(PFN_glColor4xOES)) throw new SymbolNotFoundError("Symbol not found: glColor4xOES");
        try { MH_glColor4xOES.invokeExact(PFN_glColor4xOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4xOES", e); }
    }

    public void DepthRangexOES(@CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(PFN_glDepthRangexOES)) throw new SymbolNotFoundError("Symbol not found: glDepthRangexOES");
        try { MH_glDepthRangexOES.invokeExact(PFN_glDepthRangexOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangexOES", e); }
    }

    public void FogxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glFogxOES)) throw new SymbolNotFoundError("Symbol not found: glFogxOES");
        try { MH_glFogxOES.invokeExact(PFN_glFogxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFogxOES", e); }
    }

    public void FogxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glFogxvOES)) throw new SymbolNotFoundError("Symbol not found: glFogxvOES");
        try { MH_glFogxvOES.invokeExact(PFN_glFogxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFogxvOES", e); }
    }

    public void FrustumxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(PFN_glFrustumxOES)) throw new SymbolNotFoundError("Symbol not found: glFrustumxOES");
        try { MH_glFrustumxOES.invokeExact(PFN_glFrustumxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glFrustumxOES", e); }
    }

    public void GetClipPlanexOES(@CType("GLenum") int plane, @CType("GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (Unmarshal.isNullPointer(PFN_glGetClipPlanexOES)) throw new SymbolNotFoundError("Symbol not found: glGetClipPlanexOES");
        try { MH_glGetClipPlanexOES.invokeExact(PFN_glGetClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glGetClipPlanexOES", e); }
    }

    public void GetFixedvOES(@CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetFixedvOES)) throw new SymbolNotFoundError("Symbol not found: glGetFixedvOES");
        try { MH_glGetFixedvOES.invokeExact(PFN_glGetFixedvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFixedvOES", e); }
    }

    public void GetTexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexEnvxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexEnvxvOES");
        try { MH_glGetTexEnvxvOES.invokeExact(PFN_glGetTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexEnvxvOES", e); }
    }

    public void GetTexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterxvOES");
        try { MH_glGetTexParameterxvOES.invokeExact(PFN_glGetTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterxvOES", e); }
    }

    public void LightModelxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glLightModelxOES)) throw new SymbolNotFoundError("Symbol not found: glLightModelxOES");
        try { MH_glLightModelxOES.invokeExact(PFN_glLightModelxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightModelxOES", e); }
    }

    public void LightModelxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glLightModelxvOES)) throw new SymbolNotFoundError("Symbol not found: glLightModelxvOES");
        try { MH_glLightModelxvOES.invokeExact(PFN_glLightModelxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightModelxvOES", e); }
    }

    public void LightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glLightxOES)) throw new SymbolNotFoundError("Symbol not found: glLightxOES");
        try { MH_glLightxOES.invokeExact(PFN_glLightxOES, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightxOES", e); }
    }

    public void LightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glLightxvOES)) throw new SymbolNotFoundError("Symbol not found: glLightxvOES");
        try { MH_glLightxvOES.invokeExact(PFN_glLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glLightxvOES", e); }
    }

    public void LineWidthxOES(@CType("GLfixed") int width) {
        if (Unmarshal.isNullPointer(PFN_glLineWidthxOES)) throw new SymbolNotFoundError("Symbol not found: glLineWidthxOES");
        try { MH_glLineWidthxOES.invokeExact(PFN_glLineWidthxOES, width); }
        catch (Throwable e) { throw new RuntimeException("error in glLineWidthxOES", e); }
    }

    public void LoadMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glLoadMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glLoadMatrixxOES");
        try { MH_glLoadMatrixxOES.invokeExact(PFN_glLoadMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadMatrixxOES", e); }
    }

    public void MaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glMaterialxOES)) throw new SymbolNotFoundError("Symbol not found: glMaterialxOES");
        try { MH_glMaterialxOES.invokeExact(PFN_glMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMaterialxOES", e); }
    }

    public void MaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glMaterialxvOES)) throw new SymbolNotFoundError("Symbol not found: glMaterialxvOES");
        try { MH_glMaterialxvOES.invokeExact(PFN_glMaterialxvOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMaterialxvOES", e); }
    }

    public void MultMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glMultMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glMultMatrixxOES");
        try { MH_glMultMatrixxOES.invokeExact(PFN_glMultMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultMatrixxOES", e); }
    }

    public void MultiTexCoord4xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord4xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xOES");
        try { MH_glMultiTexCoord4xOES.invokeExact(PFN_glMultiTexCoord4xOES, texture, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xOES", e); }
    }

    public void Normal3xOES(@CType("GLfixed") int nx, @CType("GLfixed") int ny, @CType("GLfixed") int nz) {
        if (Unmarshal.isNullPointer(PFN_glNormal3xOES)) throw new SymbolNotFoundError("Symbol not found: glNormal3xOES");
        try { MH_glNormal3xOES.invokeExact(PFN_glNormal3xOES, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3xOES", e); }
    }

    public void OrthoxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(PFN_glOrthoxOES)) throw new SymbolNotFoundError("Symbol not found: glOrthoxOES");
        try { MH_glOrthoxOES.invokeExact(PFN_glOrthoxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glOrthoxOES", e); }
    }

    public void PointParameterxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glPointParameterxvOES");
        try { MH_glPointParameterxvOES.invokeExact(PFN_glPointParameterxvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterxvOES", e); }
    }

    public void PointSizexOES(@CType("GLfixed") int size) {
        if (Unmarshal.isNullPointer(PFN_glPointSizexOES)) throw new SymbolNotFoundError("Symbol not found: glPointSizexOES");
        try { MH_glPointSizexOES.invokeExact(PFN_glPointSizexOES, size); }
        catch (Throwable e) { throw new RuntimeException("error in glPointSizexOES", e); }
    }

    public void PolygonOffsetxOES(@CType("GLfixed") int factor, @CType("GLfixed") int units) {
        if (Unmarshal.isNullPointer(PFN_glPolygonOffsetxOES)) throw new SymbolNotFoundError("Symbol not found: glPolygonOffsetxOES");
        try { MH_glPolygonOffsetxOES.invokeExact(PFN_glPolygonOffsetxOES, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonOffsetxOES", e); }
    }

    public void RotatexOES(@CType("GLfixed") int angle, @CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(PFN_glRotatexOES)) throw new SymbolNotFoundError("Symbol not found: glRotatexOES");
        try { MH_glRotatexOES.invokeExact(PFN_glRotatexOES, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glRotatexOES", e); }
    }

    public void ScalexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(PFN_glScalexOES)) throw new SymbolNotFoundError("Symbol not found: glScalexOES");
        try { MH_glScalexOES.invokeExact(PFN_glScalexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glScalexOES", e); }
    }

    public void TexEnvxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glTexEnvxOES)) throw new SymbolNotFoundError("Symbol not found: glTexEnvxOES");
        try { MH_glTexEnvxOES.invokeExact(PFN_glTexEnvxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexEnvxOES", e); }
    }

    public void TexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glTexEnvxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexEnvxvOES");
        try { MH_glTexEnvxvOES.invokeExact(PFN_glTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexEnvxvOES", e); }
    }

    public void TexParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glTexParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glTexParameterxOES");
        try { MH_glTexParameterxOES.invokeExact(PFN_glTexParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterxOES", e); }
    }

    public void TexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glTexParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexParameterxvOES");
        try { MH_glTexParameterxvOES.invokeExact(PFN_glTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterxvOES", e); }
    }

    public void TranslatexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(PFN_glTranslatexOES)) throw new SymbolNotFoundError("Symbol not found: glTranslatexOES");
        try { MH_glTranslatexOES.invokeExact(PFN_glTranslatexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTranslatexOES", e); }
    }

    public void GetLightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetLightxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetLightxvOES");
        try { MH_glGetLightxvOES.invokeExact(PFN_glGetLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLightxvOES", e); }
    }

    public void GetMaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetMaterialxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetMaterialxvOES");
        try { MH_glGetMaterialxvOES.invokeExact(PFN_glGetMaterialxvOES, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxvOES", e); }
    }

    public void PointParameterxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glPointParameterxOES");
        try { MH_glPointParameterxOES.invokeExact(PFN_glPointParameterxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterxOES", e); }
    }

    public void SampleCoveragexOES(@CType("GLclampx") int value, @CType("GLboolean") boolean invert) {
        if (Unmarshal.isNullPointer(PFN_glSampleCoveragexOES)) throw new SymbolNotFoundError("Symbol not found: glSampleCoveragexOES");
        try { MH_glSampleCoveragexOES.invokeExact(PFN_glSampleCoveragexOES, value, invert); }
        catch (Throwable e) { throw new RuntimeException("error in glSampleCoveragexOES", e); }
    }

    public void AccumxOES(@CType("GLenum") int op, @CType("GLfixed") int value) {
        if (Unmarshal.isNullPointer(PFN_glAccumxOES)) throw new SymbolNotFoundError("Symbol not found: glAccumxOES");
        try { MH_glAccumxOES.invokeExact(PFN_glAccumxOES, op, value); }
        catch (Throwable e) { throw new RuntimeException("error in glAccumxOES", e); }
    }

    public void BitmapxOES(@CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLfixed") int xorig, @CType("GLfixed") int yorig, @CType("GLfixed") int xmove, @CType("GLfixed") int ymove, @CType("const GLubyte *") java.lang.foreign.MemorySegment bitmap) {
        if (Unmarshal.isNullPointer(PFN_glBitmapxOES)) throw new SymbolNotFoundError("Symbol not found: glBitmapxOES");
        try { MH_glBitmapxOES.invokeExact(PFN_glBitmapxOES, width, height, xorig, yorig, xmove, ymove, bitmap); }
        catch (Throwable e) { throw new RuntimeException("error in glBitmapxOES", e); }
    }

    public void BlendColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(PFN_glBlendColorxOES)) throw new SymbolNotFoundError("Symbol not found: glBlendColorxOES");
        try { MH_glBlendColorxOES.invokeExact(PFN_glBlendColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendColorxOES", e); }
    }

    public void ClearAccumxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(PFN_glClearAccumxOES)) throw new SymbolNotFoundError("Symbol not found: glClearAccumxOES");
        try { MH_glClearAccumxOES.invokeExact(PFN_glClearAccumxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearAccumxOES", e); }
    }

    public void Color3xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue) {
        if (Unmarshal.isNullPointer(PFN_glColor3xOES)) throw new SymbolNotFoundError("Symbol not found: glColor3xOES");
        try { MH_glColor3xOES.invokeExact(PFN_glColor3xOES, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3xOES", e); }
    }

    public void Color3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (Unmarshal.isNullPointer(PFN_glColor3xvOES)) throw new SymbolNotFoundError("Symbol not found: glColor3xvOES");
        try { MH_glColor3xvOES.invokeExact(PFN_glColor3xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3xvOES", e); }
    }

    public void Color4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (Unmarshal.isNullPointer(PFN_glColor4xvOES)) throw new SymbolNotFoundError("Symbol not found: glColor4xvOES");
        try { MH_glColor4xvOES.invokeExact(PFN_glColor4xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4xvOES", e); }
    }

    public void ConvolutionParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glConvolutionParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxOES");
        try { MH_glConvolutionParameterxOES.invokeExact(PFN_glConvolutionParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxOES", e); }
    }

    public void ConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glConvolutionParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxvOES");
        try { MH_glConvolutionParameterxvOES.invokeExact(PFN_glConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxvOES", e); }
    }

    public void EvalCoord1xOES(@CType("GLfixed") int u) {
        if (Unmarshal.isNullPointer(PFN_glEvalCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xOES");
        try { MH_glEvalCoord1xOES.invokeExact(PFN_glEvalCoord1xOES, u); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xOES", e); }
    }

    public void EvalCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glEvalCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xvOES");
        try { MH_glEvalCoord1xvOES.invokeExact(PFN_glEvalCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xvOES", e); }
    }

    public void EvalCoord2xOES(@CType("GLfixed") int u, @CType("GLfixed") int v) {
        if (Unmarshal.isNullPointer(PFN_glEvalCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xOES");
        try { MH_glEvalCoord2xOES.invokeExact(PFN_glEvalCoord2xOES, u, v); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xOES", e); }
    }

    public void EvalCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glEvalCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xvOES");
        try { MH_glEvalCoord2xvOES.invokeExact(PFN_glEvalCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xvOES", e); }
    }

    public void FeedbackBufferxOES(@CType("GLsizei") int n, @CType("GLenum") int type, @CType("const GLfixed *") java.lang.foreign.MemorySegment buffer) {
        if (Unmarshal.isNullPointer(PFN_glFeedbackBufferxOES)) throw new SymbolNotFoundError("Symbol not found: glFeedbackBufferxOES");
        try { MH_glFeedbackBufferxOES.invokeExact(PFN_glFeedbackBufferxOES, n, type, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glFeedbackBufferxOES", e); }
    }

    public void GetConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetConvolutionParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterxvOES");
        try { MH_glGetConvolutionParameterxvOES.invokeExact(PFN_glGetConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterxvOES", e); }
    }

    public void GetHistogramParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetHistogramParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterxvOES");
        try { MH_glGetHistogramParameterxvOES.invokeExact(PFN_glGetHistogramParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterxvOES", e); }
    }

    public void GetLightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetLightxOES)) throw new SymbolNotFoundError("Symbol not found: glGetLightxOES");
        try { MH_glGetLightxOES.invokeExact(PFN_glGetLightxOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLightxOES", e); }
    }

    public void GetMapxvOES(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLfixed *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glGetMapxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetMapxvOES");
        try { MH_glGetMapxvOES.invokeExact(PFN_glGetMapxvOES, target, query, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMapxvOES", e); }
    }

    public void GetMaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glGetMaterialxOES)) throw new SymbolNotFoundError("Symbol not found: glGetMaterialxOES");
        try { MH_glGetMaterialxOES.invokeExact(PFN_glGetMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxOES", e); }
    }

    public void GetPixelMapxv(@CType("GLenum") int map, @CType("GLint") int size, @CType("GLfixed *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glGetPixelMapxv)) throw new SymbolNotFoundError("Symbol not found: glGetPixelMapxv");
        try { MH_glGetPixelMapxv.invokeExact(PFN_glGetPixelMapxv, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelMapxv", e); }
    }

    public void GetTexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexGenxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexGenxvOES");
        try { MH_glGetTexGenxvOES.invokeExact(PFN_glGetTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexGenxvOES", e); }
    }

    public void GetTexLevelParameterxvOES(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexLevelParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexLevelParameterxvOES");
        try { MH_glGetTexLevelParameterxvOES.invokeExact(PFN_glGetTexLevelParameterxvOES, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexLevelParameterxvOES", e); }
    }

    public void IndexxOES(@CType("GLfixed") int component) {
        if (Unmarshal.isNullPointer(PFN_glIndexxOES)) throw new SymbolNotFoundError("Symbol not found: glIndexxOES");
        try { MH_glIndexxOES.invokeExact(PFN_glIndexxOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexxOES", e); }
    }

    public void IndexxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment component) {
        if (Unmarshal.isNullPointer(PFN_glIndexxvOES)) throw new SymbolNotFoundError("Symbol not found: glIndexxvOES");
        try { MH_glIndexxvOES.invokeExact(PFN_glIndexxvOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexxvOES", e); }
    }

    public void LoadTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glLoadTransposeMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixxOES");
        try { MH_glLoadTransposeMatrixxOES.invokeExact(PFN_glLoadTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixxOES", e); }
    }

    public void Map1xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int stride, @CType("GLint") int order, @CType("GLfixed") int points) {
        if (Unmarshal.isNullPointer(PFN_glMap1xOES)) throw new SymbolNotFoundError("Symbol not found: glMap1xOES");
        try { MH_glMap1xOES.invokeExact(PFN_glMap1xOES, target, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in glMap1xOES", e); }
    }

    public void Map2xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int ustride, @CType("GLint") int uorder, @CType("GLfixed") int v1, @CType("GLfixed") int v2, @CType("GLint") int vstride, @CType("GLint") int vorder, @CType("GLfixed") int points) {
        if (Unmarshal.isNullPointer(PFN_glMap2xOES)) throw new SymbolNotFoundError("Symbol not found: glMap2xOES");
        try { MH_glMap2xOES.invokeExact(PFN_glMap2xOES, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in glMap2xOES", e); }
    }

    public void MapGrid1xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2) {
        if (Unmarshal.isNullPointer(PFN_glMapGrid1xOES)) throw new SymbolNotFoundError("Symbol not found: glMapGrid1xOES");
        try { MH_glMapGrid1xOES.invokeExact(PFN_glMapGrid1xOES, n, u1, u2); }
        catch (Throwable e) { throw new RuntimeException("error in glMapGrid1xOES", e); }
    }

    public void MapGrid2xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLfixed") int v1, @CType("GLfixed") int v2) {
        if (Unmarshal.isNullPointer(PFN_glMapGrid2xOES)) throw new SymbolNotFoundError("Symbol not found: glMapGrid2xOES");
        try { MH_glMapGrid2xOES.invokeExact(PFN_glMapGrid2xOES, n, u1, u2, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glMapGrid2xOES", e); }
    }

    public void MultTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(PFN_glMultTransposeMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixxOES");
        try { MH_glMultTransposeMatrixxOES.invokeExact(PFN_glMultTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixxOES", e); }
    }

    public void MultiTexCoord1xOES(@CType("GLenum") int texture, @CType("GLfixed") int s) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xOES");
        try { MH_glMultiTexCoord1xOES.invokeExact(PFN_glMultiTexCoord1xOES, texture, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xOES", e); }
    }

    public void MultiTexCoord1xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xvOES");
        try { MH_glMultiTexCoord1xvOES.invokeExact(PFN_glMultiTexCoord1xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xvOES", e); }
    }

    public void MultiTexCoord2xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xOES");
        try { MH_glMultiTexCoord2xOES.invokeExact(PFN_glMultiTexCoord2xOES, texture, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xOES", e); }
    }

    public void MultiTexCoord2xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xvOES");
        try { MH_glMultiTexCoord2xvOES.invokeExact(PFN_glMultiTexCoord2xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xvOES", e); }
    }

    public void MultiTexCoord3xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord3xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xOES");
        try { MH_glMultiTexCoord3xOES.invokeExact(PFN_glMultiTexCoord3xOES, texture, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xOES", e); }
    }

    public void MultiTexCoord3xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord3xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xvOES");
        try { MH_glMultiTexCoord3xvOES.invokeExact(PFN_glMultiTexCoord3xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xvOES", e); }
    }

    public void MultiTexCoord4xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glMultiTexCoord4xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xvOES");
        try { MH_glMultiTexCoord4xvOES.invokeExact(PFN_glMultiTexCoord4xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xvOES", e); }
    }

    public void Normal3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glNormal3xvOES)) throw new SymbolNotFoundError("Symbol not found: glNormal3xvOES");
        try { MH_glNormal3xvOES.invokeExact(PFN_glNormal3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3xvOES", e); }
    }

    public void PassThroughxOES(@CType("GLfixed") int token) {
        if (Unmarshal.isNullPointer(PFN_glPassThroughxOES)) throw new SymbolNotFoundError("Symbol not found: glPassThroughxOES");
        try { MH_glPassThroughxOES.invokeExact(PFN_glPassThroughxOES, token); }
        catch (Throwable e) { throw new RuntimeException("error in glPassThroughxOES", e); }
    }

    public void PixelMapx(@CType("GLenum") int map, @CType("GLint") int size, @CType("const GLfixed *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(PFN_glPixelMapx)) throw new SymbolNotFoundError("Symbol not found: glPixelMapx");
        try { MH_glPixelMapx.invokeExact(PFN_glPixelMapx, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelMapx", e); }
    }

    public void PixelStorex(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glPixelStorex)) throw new SymbolNotFoundError("Symbol not found: glPixelStorex");
        try { MH_glPixelStorex.invokeExact(PFN_glPixelStorex, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelStorex", e); }
    }

    public void PixelTransferxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glPixelTransferxOES)) throw new SymbolNotFoundError("Symbol not found: glPixelTransferxOES");
        try { MH_glPixelTransferxOES.invokeExact(PFN_glPixelTransferxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransferxOES", e); }
    }

    public void PixelZoomxOES(@CType("GLfixed") int xfactor, @CType("GLfixed") int yfactor) {
        if (Unmarshal.isNullPointer(PFN_glPixelZoomxOES)) throw new SymbolNotFoundError("Symbol not found: glPixelZoomxOES");
        try { MH_glPixelZoomxOES.invokeExact(PFN_glPixelZoomxOES, xfactor, yfactor); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelZoomxOES", e); }
    }

    public void PrioritizeTexturesxOES(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment textures, @CType("const GLfixed *") java.lang.foreign.MemorySegment priorities) {
        if (Unmarshal.isNullPointer(PFN_glPrioritizeTexturesxOES)) throw new SymbolNotFoundError("Symbol not found: glPrioritizeTexturesxOES");
        try { MH_glPrioritizeTexturesxOES.invokeExact(PFN_glPrioritizeTexturesxOES, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in glPrioritizeTexturesxOES", e); }
    }

    public void RasterPos2xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos2xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos2xOES");
        try { MH_glRasterPos2xOES.invokeExact(PFN_glRasterPos2xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xOES", e); }
    }

    public void RasterPos2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos2xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos2xvOES");
        try { MH_glRasterPos2xvOES.invokeExact(PFN_glRasterPos2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xvOES", e); }
    }

    public void RasterPos3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos3xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos3xOES");
        try { MH_glRasterPos3xOES.invokeExact(PFN_glRasterPos3xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xOES", e); }
    }

    public void RasterPos3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos3xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos3xvOES");
        try { MH_glRasterPos3xvOES.invokeExact(PFN_glRasterPos3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xvOES", e); }
    }

    public void RasterPos4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z, @CType("GLfixed") int w) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos4xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos4xOES");
        try { MH_glRasterPos4xOES.invokeExact(PFN_glRasterPos4xOES, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xOES", e); }
    }

    public void RasterPos4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glRasterPos4xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos4xvOES");
        try { MH_glRasterPos4xvOES.invokeExact(PFN_glRasterPos4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xvOES", e); }
    }

    public void RectxOES(@CType("GLfixed") int x1, @CType("GLfixed") int y1, @CType("GLfixed") int x2, @CType("GLfixed") int y2) {
        if (Unmarshal.isNullPointer(PFN_glRectxOES)) throw new SymbolNotFoundError("Symbol not found: glRectxOES");
        try { MH_glRectxOES.invokeExact(PFN_glRectxOES, x1, y1, x2, y2); }
        catch (Throwable e) { throw new RuntimeException("error in glRectxOES", e); }
    }

    public void RectxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment v1, @CType("const GLfixed *") java.lang.foreign.MemorySegment v2) {
        if (Unmarshal.isNullPointer(PFN_glRectxvOES)) throw new SymbolNotFoundError("Symbol not found: glRectxvOES");
        try { MH_glRectxvOES.invokeExact(PFN_glRectxvOES, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glRectxvOES", e); }
    }

    public void TexCoord1xOES(@CType("GLfixed") int s) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1xOES");
        try { MH_glTexCoord1xOES.invokeExact(PFN_glTexCoord1xOES, s); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xOES", e); }
    }

    public void TexCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1xvOES");
        try { MH_glTexCoord1xvOES.invokeExact(PFN_glTexCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xvOES", e); }
    }

    public void TexCoord2xOES(@CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2xOES");
        try { MH_glTexCoord2xOES.invokeExact(PFN_glTexCoord2xOES, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xOES", e); }
    }

    public void TexCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2xvOES");
        try { MH_glTexCoord2xvOES.invokeExact(PFN_glTexCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xvOES", e); }
    }

    public void TexCoord3xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord3xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3xOES");
        try { MH_glTexCoord3xOES.invokeExact(PFN_glTexCoord3xOES, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xOES", e); }
    }

    public void TexCoord3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord3xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3xvOES");
        try { MH_glTexCoord3xvOES.invokeExact(PFN_glTexCoord3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xvOES", e); }
    }

    public void TexCoord4xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord4xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4xOES");
        try { MH_glTexCoord4xOES.invokeExact(PFN_glTexCoord4xOES, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xOES", e); }
    }

    public void TexCoord4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glTexCoord4xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4xvOES");
        try { MH_glTexCoord4xvOES.invokeExact(PFN_glTexCoord4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xvOES", e); }
    }

    public void TexGenxOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(PFN_glTexGenxOES)) throw new SymbolNotFoundError("Symbol not found: glTexGenxOES");
        try { MH_glTexGenxOES.invokeExact(PFN_glTexGenxOES, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexGenxOES", e); }
    }

    public void TexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glTexGenxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexGenxvOES");
        try { MH_glTexGenxvOES.invokeExact(PFN_glTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexGenxvOES", e); }
    }

    public void Vertex2xOES(@CType("GLfixed") int x) {
        if (Unmarshal.isNullPointer(PFN_glVertex2xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2xOES");
        try { MH_glVertex2xOES.invokeExact(PFN_glVertex2xOES, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2xOES", e); }
    }

    public void Vertex2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glVertex2xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2xvOES");
        try { MH_glVertex2xvOES.invokeExact(PFN_glVertex2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2xvOES", e); }
    }

    public void Vertex3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (Unmarshal.isNullPointer(PFN_glVertex3xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3xOES");
        try { MH_glVertex3xOES.invokeExact(PFN_glVertex3xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3xOES", e); }
    }

    public void Vertex3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glVertex3xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3xvOES");
        try { MH_glVertex3xvOES.invokeExact(PFN_glVertex3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3xvOES", e); }
    }

    public void Vertex4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(PFN_glVertex4xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4xOES");
        try { MH_glVertex4xOES.invokeExact(PFN_glVertex4xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4xOES", e); }
    }

    public void Vertex4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(PFN_glVertex4xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4xvOES");
        try { MH_glVertex4xvOES.invokeExact(PFN_glVertex4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4xvOES", e); }
    }

}
