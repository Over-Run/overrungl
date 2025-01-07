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
    public final MemorySegment PFN_glAlphaFuncxOES;
    public static final MethodHandle MH_glClearColorxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClearColorxOES;
    public static final MethodHandle MH_glClearDepthxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClearDepthxOES;
    public static final MethodHandle MH_glClipPlanexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClipPlanexOES;
    public static final MethodHandle MH_glColor4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColor4xOES;
    public static final MethodHandle MH_glDepthRangexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDepthRangexOES;
    public static final MethodHandle MH_glFogxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFogxOES;
    public static final MethodHandle MH_glFogxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFogxvOES;
    public static final MethodHandle MH_glFrustumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFrustumxOES;
    public static final MethodHandle MH_glGetClipPlanexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetClipPlanexOES;
    public static final MethodHandle MH_glGetFixedvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFixedvOES;
    public static final MethodHandle MH_glGetTexEnvxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexEnvxvOES;
    public static final MethodHandle MH_glGetTexParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexParameterxvOES;
    public static final MethodHandle MH_glLightModelxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glLightModelxOES;
    public static final MethodHandle MH_glLightModelxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLightModelxvOES;
    public static final MethodHandle MH_glLightxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glLightxOES;
    public static final MethodHandle MH_glLightxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLightxvOES;
    public static final MethodHandle MH_glLineWidthxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glLineWidthxOES;
    public static final MethodHandle MH_glLoadMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLoadMatrixxOES;
    public static final MethodHandle MH_glMaterialxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMaterialxOES;
    public static final MethodHandle MH_glMaterialxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMaterialxvOES;
    public static final MethodHandle MH_glMultMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultMatrixxOES;
    public static final MethodHandle MH_glMultiTexCoord4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexCoord4xOES;
    public static final MethodHandle MH_glNormal3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNormal3xOES;
    public static final MethodHandle MH_glOrthoxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glOrthoxOES;
    public static final MethodHandle MH_glPointParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPointParameterxvOES;
    public static final MethodHandle MH_glPointSizexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPointSizexOES;
    public static final MethodHandle MH_glPolygonOffsetxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPolygonOffsetxOES;
    public static final MethodHandle MH_glRotatexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRotatexOES;
    public static final MethodHandle MH_glScalexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glScalexOES;
    public static final MethodHandle MH_glTexEnvxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexEnvxOES;
    public static final MethodHandle MH_glTexEnvxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexEnvxvOES;
    public static final MethodHandle MH_glTexParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexParameterxOES;
    public static final MethodHandle MH_glTexParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexParameterxvOES;
    public static final MethodHandle MH_glTranslatexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTranslatexOES;
    public static final MethodHandle MH_glGetLightxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetLightxvOES;
    public static final MethodHandle MH_glGetMaterialxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMaterialxvOES;
    public static final MethodHandle MH_glPointParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPointParameterxOES;
    public static final MethodHandle MH_glSampleCoveragexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glSampleCoveragexOES;
    public static final MethodHandle MH_glAccumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAccumxOES;
    public static final MethodHandle MH_glBitmapxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBitmapxOES;
    public static final MethodHandle MH_glBlendColorxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendColorxOES;
    public static final MethodHandle MH_glClearAccumxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClearAccumxOES;
    public static final MethodHandle MH_glColor3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColor3xOES;
    public static final MethodHandle MH_glColor3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor3xvOES;
    public static final MethodHandle MH_glColor4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor4xvOES;
    public static final MethodHandle MH_glConvolutionParameterxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glConvolutionParameterxOES;
    public static final MethodHandle MH_glConvolutionParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glConvolutionParameterxvOES;
    public static final MethodHandle MH_glEvalCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEvalCoord1xOES;
    public static final MethodHandle MH_glEvalCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glEvalCoord1xvOES;
    public static final MethodHandle MH_glEvalCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEvalCoord2xOES;
    public static final MethodHandle MH_glEvalCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glEvalCoord2xvOES;
    public static final MethodHandle MH_glFeedbackBufferxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFeedbackBufferxOES;
    public static final MethodHandle MH_glGetConvolutionParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetConvolutionParameterxvOES;
    public static final MethodHandle MH_glGetHistogramParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetHistogramParameterxvOES;
    public static final MethodHandle MH_glGetLightxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetLightxOES;
    public static final MethodHandle MH_glGetMapxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapxvOES;
    public static final MethodHandle MH_glGetMaterialxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetMaterialxOES;
    public static final MethodHandle MH_glGetPixelMapxv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPixelMapxv;
    public static final MethodHandle MH_glGetTexGenxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexGenxvOES;
    public static final MethodHandle MH_glGetTexLevelParameterxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexLevelParameterxvOES;
    public static final MethodHandle MH_glIndexxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIndexxOES;
    public static final MethodHandle MH_glIndexxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glIndexxvOES;
    public static final MethodHandle MH_glLoadTransposeMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glLoadTransposeMatrixxOES;
    public static final MethodHandle MH_glMap1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMap1xOES;
    public static final MethodHandle MH_glMap2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMap2xOES;
    public static final MethodHandle MH_glMapGrid1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapGrid1xOES;
    public static final MethodHandle MH_glMapGrid2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapGrid2xOES;
    public static final MethodHandle MH_glMultTransposeMatrixxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultTransposeMatrixxOES;
    public static final MethodHandle MH_glMultiTexCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexCoord1xOES;
    public static final MethodHandle MH_glMultiTexCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord1xvOES;
    public static final MethodHandle MH_glMultiTexCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexCoord2xOES;
    public static final MethodHandle MH_glMultiTexCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord2xvOES;
    public static final MethodHandle MH_glMultiTexCoord3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexCoord3xOES;
    public static final MethodHandle MH_glMultiTexCoord3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord3xvOES;
    public static final MethodHandle MH_glMultiTexCoord4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord4xvOES;
    public static final MethodHandle MH_glNormal3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNormal3xvOES;
    public static final MethodHandle MH_glPassThroughxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPassThroughxOES;
    public static final MethodHandle MH_glPixelMapx = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPixelMapx;
    public static final MethodHandle MH_glPixelStorex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPixelStorex;
    public static final MethodHandle MH_glPixelTransferxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPixelTransferxOES;
    public static final MethodHandle MH_glPixelZoomxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPixelZoomxOES;
    public static final MethodHandle MH_glPrioritizeTexturesxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPrioritizeTexturesxOES;
    public static final MethodHandle MH_glRasterPos2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRasterPos2xOES;
    public static final MethodHandle MH_glRasterPos2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glRasterPos2xvOES;
    public static final MethodHandle MH_glRasterPos3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRasterPos3xOES;
    public static final MethodHandle MH_glRasterPos3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glRasterPos3xvOES;
    public static final MethodHandle MH_glRasterPos4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRasterPos4xOES;
    public static final MethodHandle MH_glRasterPos4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glRasterPos4xvOES;
    public static final MethodHandle MH_glRectxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRectxOES;
    public static final MethodHandle MH_glRectxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glRectxvOES;
    public static final MethodHandle MH_glTexCoord1xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexCoord1xOES;
    public static final MethodHandle MH_glTexCoord1xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord1xvOES;
    public static final MethodHandle MH_glTexCoord2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexCoord2xOES;
    public static final MethodHandle MH_glTexCoord2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2xvOES;
    public static final MethodHandle MH_glTexCoord3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexCoord3xOES;
    public static final MethodHandle MH_glTexCoord3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord3xvOES;
    public static final MethodHandle MH_glTexCoord4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexCoord4xOES;
    public static final MethodHandle MH_glTexCoord4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord4xvOES;
    public static final MethodHandle MH_glTexGenxOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexGenxOES;
    public static final MethodHandle MH_glTexGenxvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexGenxvOES;
    public static final MethodHandle MH_glVertex2xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertex2xOES;
    public static final MethodHandle MH_glVertex2xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex2xvOES;
    public static final MethodHandle MH_glVertex3xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertex3xOES;
    public static final MethodHandle MH_glVertex3xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex3xvOES;
    public static final MethodHandle MH_glVertex4xOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertex4xOES;
    public static final MethodHandle MH_glVertex4xvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
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
        if (!Unmarshal.isNullPointer(PFN_glAlphaFuncxOES)) { try {
            MH_glAlphaFuncxOES.invokeExact(PFN_glAlphaFuncxOES, func, ref);
        } catch (Throwable e) { throw new RuntimeException("error in glAlphaFuncxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glAlphaFuncxOES"); }
    }

    public void ClearColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (!Unmarshal.isNullPointer(PFN_glClearColorxOES)) { try {
            MH_glClearColorxOES.invokeExact(PFN_glClearColorxOES, red, green, blue, alpha);
        } catch (Throwable e) { throw new RuntimeException("error in glClearColorxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearColorxOES"); }
    }

    public void ClearDepthxOES(@CType("GLfixed") int depth) {
        if (!Unmarshal.isNullPointer(PFN_glClearDepthxOES)) { try {
            MH_glClearDepthxOES.invokeExact(PFN_glClearDepthxOES, depth);
        } catch (Throwable e) { throw new RuntimeException("error in glClearDepthxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearDepthxOES"); }
    }

    public void ClipPlanexOES(@CType("GLenum") int plane, @CType("const GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (!Unmarshal.isNullPointer(PFN_glClipPlanexOES)) { try {
            MH_glClipPlanexOES.invokeExact(PFN_glClipPlanexOES, plane, equation);
        } catch (Throwable e) { throw new RuntimeException("error in glClipPlanexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClipPlanexOES"); }
    }

    public void Color4xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (!Unmarshal.isNullPointer(PFN_glColor4xOES)) { try {
            MH_glColor4xOES.invokeExact(PFN_glColor4xOES, red, green, blue, alpha);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4xOES"); }
    }

    public void DepthRangexOES(@CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangexOES)) { try {
            MH_glDepthRangexOES.invokeExact(PFN_glDepthRangexOES, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangexOES"); }
    }

    public void FogxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glFogxOES)) { try {
            MH_glFogxOES.invokeExact(PFN_glFogxOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glFogxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogxOES"); }
    }

    public void FogxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glFogxvOES)) { try {
            MH_glFogxvOES.invokeExact(PFN_glFogxvOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glFogxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogxvOES"); }
    }

    public void FrustumxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (!Unmarshal.isNullPointer(PFN_glFrustumxOES)) { try {
            MH_glFrustumxOES.invokeExact(PFN_glFrustumxOES, l, r, b, t, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glFrustumxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFrustumxOES"); }
    }

    public void GetClipPlanexOES(@CType("GLenum") int plane, @CType("GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (!Unmarshal.isNullPointer(PFN_glGetClipPlanexOES)) { try {
            MH_glGetClipPlanexOES.invokeExact(PFN_glGetClipPlanexOES, plane, equation);
        } catch (Throwable e) { throw new RuntimeException("error in glGetClipPlanexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetClipPlanexOES"); }
    }

    public void GetFixedvOES(@CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetFixedvOES)) { try {
            MH_glGetFixedvOES.invokeExact(PFN_glGetFixedvOES, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFixedvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFixedvOES"); }
    }

    public void GetTexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTexEnvxvOES)) { try {
            MH_glGetTexEnvxvOES.invokeExact(PFN_glGetTexEnvxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTexEnvxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTexEnvxvOES"); }
    }

    public void GetTexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTexParameterxvOES)) { try {
            MH_glGetTexParameterxvOES.invokeExact(PFN_glGetTexParameterxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTexParameterxvOES"); }
    }

    public void LightModelxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glLightModelxOES)) { try {
            MH_glLightModelxOES.invokeExact(PFN_glLightModelxOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glLightModelxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLightModelxOES"); }
    }

    public void LightModelxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glLightModelxvOES)) { try {
            MH_glLightModelxvOES.invokeExact(PFN_glLightModelxvOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glLightModelxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLightModelxvOES"); }
    }

    public void LightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glLightxOES)) { try {
            MH_glLightxOES.invokeExact(PFN_glLightxOES, light, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glLightxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLightxOES"); }
    }

    public void LightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glLightxvOES)) { try {
            MH_glLightxvOES.invokeExact(PFN_glLightxvOES, light, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glLightxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLightxvOES"); }
    }

    public void LineWidthxOES(@CType("GLfixed") int width) {
        if (!Unmarshal.isNullPointer(PFN_glLineWidthxOES)) { try {
            MH_glLineWidthxOES.invokeExact(PFN_glLineWidthxOES, width);
        } catch (Throwable e) { throw new RuntimeException("error in glLineWidthxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLineWidthxOES"); }
    }

    public void LoadMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (!Unmarshal.isNullPointer(PFN_glLoadMatrixxOES)) { try {
            MH_glLoadMatrixxOES.invokeExact(PFN_glLoadMatrixxOES, m);
        } catch (Throwable e) { throw new RuntimeException("error in glLoadMatrixxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLoadMatrixxOES"); }
    }

    public void MaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glMaterialxOES)) { try {
            MH_glMaterialxOES.invokeExact(PFN_glMaterialxOES, face, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glMaterialxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMaterialxOES"); }
    }

    public void MaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glMaterialxvOES)) { try {
            MH_glMaterialxvOES.invokeExact(PFN_glMaterialxvOES, face, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glMaterialxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMaterialxvOES"); }
    }

    public void MultMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (!Unmarshal.isNullPointer(PFN_glMultMatrixxOES)) { try {
            MH_glMultMatrixxOES.invokeExact(PFN_glMultMatrixxOES, m);
        } catch (Throwable e) { throw new RuntimeException("error in glMultMatrixxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultMatrixxOES"); }
    }

    public void MultiTexCoord4xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4xOES)) { try {
            MH_glMultiTexCoord4xOES.invokeExact(PFN_glMultiTexCoord4xOES, texture, s, t, r, q);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xOES"); }
    }

    public void Normal3xOES(@CType("GLfixed") int nx, @CType("GLfixed") int ny, @CType("GLfixed") int nz) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3xOES)) { try {
            MH_glNormal3xOES.invokeExact(PFN_glNormal3xOES, nx, ny, nz);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3xOES"); }
    }

    public void OrthoxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (!Unmarshal.isNullPointer(PFN_glOrthoxOES)) { try {
            MH_glOrthoxOES.invokeExact(PFN_glOrthoxOES, l, r, b, t, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glOrthoxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glOrthoxOES"); }
    }

    public void PointParameterxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameterxvOES)) { try {
            MH_glPointParameterxvOES.invokeExact(PFN_glPointParameterxvOES, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameterxvOES"); }
    }

    public void PointSizexOES(@CType("GLfixed") int size) {
        if (!Unmarshal.isNullPointer(PFN_glPointSizexOES)) { try {
            MH_glPointSizexOES.invokeExact(PFN_glPointSizexOES, size);
        } catch (Throwable e) { throw new RuntimeException("error in glPointSizexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointSizexOES"); }
    }

    public void PolygonOffsetxOES(@CType("GLfixed") int factor, @CType("GLfixed") int units) {
        if (!Unmarshal.isNullPointer(PFN_glPolygonOffsetxOES)) { try {
            MH_glPolygonOffsetxOES.invokeExact(PFN_glPolygonOffsetxOES, factor, units);
        } catch (Throwable e) { throw new RuntimeException("error in glPolygonOffsetxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPolygonOffsetxOES"); }
    }

    public void RotatexOES(@CType("GLfixed") int angle, @CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (!Unmarshal.isNullPointer(PFN_glRotatexOES)) { try {
            MH_glRotatexOES.invokeExact(PFN_glRotatexOES, angle, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glRotatexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRotatexOES"); }
    }

    public void ScalexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (!Unmarshal.isNullPointer(PFN_glScalexOES)) { try {
            MH_glScalexOES.invokeExact(PFN_glScalexOES, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glScalexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glScalexOES"); }
    }

    public void TexEnvxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glTexEnvxOES)) { try {
            MH_glTexEnvxOES.invokeExact(PFN_glTexEnvxOES, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTexEnvxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexEnvxOES"); }
    }

    public void TexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glTexEnvxvOES)) { try {
            MH_glTexEnvxvOES.invokeExact(PFN_glTexEnvxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glTexEnvxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexEnvxvOES"); }
    }

    public void TexParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glTexParameterxOES)) { try {
            MH_glTexParameterxOES.invokeExact(PFN_glTexParameterxOES, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTexParameterxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexParameterxOES"); }
    }

    public void TexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glTexParameterxvOES)) { try {
            MH_glTexParameterxvOES.invokeExact(PFN_glTexParameterxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glTexParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexParameterxvOES"); }
    }

    public void TranslatexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (!Unmarshal.isNullPointer(PFN_glTranslatexOES)) { try {
            MH_glTranslatexOES.invokeExact(PFN_glTranslatexOES, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTranslatexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTranslatexOES"); }
    }

    public void GetLightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetLightxvOES)) { try {
            MH_glGetLightxvOES.invokeExact(PFN_glGetLightxvOES, light, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetLightxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetLightxvOES"); }
    }

    public void GetMaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetMaterialxvOES)) { try {
            MH_glGetMaterialxvOES.invokeExact(PFN_glGetMaterialxvOES, face, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMaterialxvOES"); }
    }

    public void PointParameterxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameterxOES)) { try {
            MH_glPointParameterxOES.invokeExact(PFN_glPointParameterxOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameterxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameterxOES"); }
    }

    public void SampleCoveragexOES(@CType("GLclampx") int value, @CType("GLboolean") boolean invert) {
        if (!Unmarshal.isNullPointer(PFN_glSampleCoveragexOES)) { try {
            MH_glSampleCoveragexOES.invokeExact(PFN_glSampleCoveragexOES, value, invert);
        } catch (Throwable e) { throw new RuntimeException("error in glSampleCoveragexOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSampleCoveragexOES"); }
    }

    public void AccumxOES(@CType("GLenum") int op, @CType("GLfixed") int value) {
        if (!Unmarshal.isNullPointer(PFN_glAccumxOES)) { try {
            MH_glAccumxOES.invokeExact(PFN_glAccumxOES, op, value);
        } catch (Throwable e) { throw new RuntimeException("error in glAccumxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glAccumxOES"); }
    }

    public void BitmapxOES(@CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLfixed") int xorig, @CType("GLfixed") int yorig, @CType("GLfixed") int xmove, @CType("GLfixed") int ymove, @CType("const GLubyte *") java.lang.foreign.MemorySegment bitmap) {
        if (!Unmarshal.isNullPointer(PFN_glBitmapxOES)) { try {
            MH_glBitmapxOES.invokeExact(PFN_glBitmapxOES, width, height, xorig, yorig, xmove, ymove, bitmap);
        } catch (Throwable e) { throw new RuntimeException("error in glBitmapxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBitmapxOES"); }
    }

    public void BlendColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (!Unmarshal.isNullPointer(PFN_glBlendColorxOES)) { try {
            MH_glBlendColorxOES.invokeExact(PFN_glBlendColorxOES, red, green, blue, alpha);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendColorxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendColorxOES"); }
    }

    public void ClearAccumxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (!Unmarshal.isNullPointer(PFN_glClearAccumxOES)) { try {
            MH_glClearAccumxOES.invokeExact(PFN_glClearAccumxOES, red, green, blue, alpha);
        } catch (Throwable e) { throw new RuntimeException("error in glClearAccumxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearAccumxOES"); }
    }

    public void Color3xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue) {
        if (!Unmarshal.isNullPointer(PFN_glColor3xOES)) { try {
            MH_glColor3xOES.invokeExact(PFN_glColor3xOES, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3xOES"); }
    }

    public void Color3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (!Unmarshal.isNullPointer(PFN_glColor3xvOES)) { try {
            MH_glColor3xvOES.invokeExact(PFN_glColor3xvOES, components);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3xvOES"); }
    }

    public void Color4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (!Unmarshal.isNullPointer(PFN_glColor4xvOES)) { try {
            MH_glColor4xvOES.invokeExact(PFN_glColor4xvOES, components);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4xvOES"); }
    }

    public void ConvolutionParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glConvolutionParameterxOES)) { try {
            MH_glConvolutionParameterxOES.invokeExact(PFN_glConvolutionParameterxOES, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxOES"); }
    }

    public void ConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glConvolutionParameterxvOES)) { try {
            MH_glConvolutionParameterxvOES.invokeExact(PFN_glConvolutionParameterxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxvOES"); }
    }

    public void EvalCoord1xOES(@CType("GLfixed") int u) {
        if (!Unmarshal.isNullPointer(PFN_glEvalCoord1xOES)) { try {
            MH_glEvalCoord1xOES.invokeExact(PFN_glEvalCoord1xOES, u);
        } catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xOES"); }
    }

    public void EvalCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glEvalCoord1xvOES)) { try {
            MH_glEvalCoord1xvOES.invokeExact(PFN_glEvalCoord1xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xvOES"); }
    }

    public void EvalCoord2xOES(@CType("GLfixed") int u, @CType("GLfixed") int v) {
        if (!Unmarshal.isNullPointer(PFN_glEvalCoord2xOES)) { try {
            MH_glEvalCoord2xOES.invokeExact(PFN_glEvalCoord2xOES, u, v);
        } catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xOES"); }
    }

    public void EvalCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glEvalCoord2xvOES)) { try {
            MH_glEvalCoord2xvOES.invokeExact(PFN_glEvalCoord2xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xvOES"); }
    }

    public void FeedbackBufferxOES(@CType("GLsizei") int n, @CType("GLenum") int type, @CType("const GLfixed *") java.lang.foreign.MemorySegment buffer) {
        if (!Unmarshal.isNullPointer(PFN_glFeedbackBufferxOES)) { try {
            MH_glFeedbackBufferxOES.invokeExact(PFN_glFeedbackBufferxOES, n, type, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glFeedbackBufferxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFeedbackBufferxOES"); }
    }

    public void GetConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetConvolutionParameterxvOES)) { try {
            MH_glGetConvolutionParameterxvOES.invokeExact(PFN_glGetConvolutionParameterxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterxvOES"); }
    }

    public void GetHistogramParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetHistogramParameterxvOES)) { try {
            MH_glGetHistogramParameterxvOES.invokeExact(PFN_glGetHistogramParameterxvOES, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterxvOES"); }
    }

    public void GetLightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetLightxOES)) { try {
            MH_glGetLightxOES.invokeExact(PFN_glGetLightxOES, light, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetLightxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetLightxOES"); }
    }

    public void GetMapxvOES(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLfixed *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapxvOES)) { try {
            MH_glGetMapxvOES.invokeExact(PFN_glGetMapxvOES, target, query, v);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapxvOES"); }
    }

    public void GetMaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glGetMaterialxOES)) { try {
            MH_glGetMaterialxOES.invokeExact(PFN_glGetMaterialxOES, face, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMaterialxOES"); }
    }

    public void GetPixelMapxv(@CType("GLenum") int map, @CType("GLint") int size, @CType("GLfixed *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glGetPixelMapxv)) { try {
            MH_glGetPixelMapxv.invokeExact(PFN_glGetPixelMapxv, map, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPixelMapxv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPixelMapxv"); }
    }

    public void GetTexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTexGenxvOES)) { try {
            MH_glGetTexGenxvOES.invokeExact(PFN_glGetTexGenxvOES, coord, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTexGenxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTexGenxvOES"); }
    }

    public void GetTexLevelParameterxvOES(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTexLevelParameterxvOES)) { try {
            MH_glGetTexLevelParameterxvOES.invokeExact(PFN_glGetTexLevelParameterxvOES, target, level, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTexLevelParameterxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTexLevelParameterxvOES"); }
    }

    public void IndexxOES(@CType("GLfixed") int component) {
        if (!Unmarshal.isNullPointer(PFN_glIndexxOES)) { try {
            MH_glIndexxOES.invokeExact(PFN_glIndexxOES, component);
        } catch (Throwable e) { throw new RuntimeException("error in glIndexxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIndexxOES"); }
    }

    public void IndexxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment component) {
        if (!Unmarshal.isNullPointer(PFN_glIndexxvOES)) { try {
            MH_glIndexxvOES.invokeExact(PFN_glIndexxvOES, component);
        } catch (Throwable e) { throw new RuntimeException("error in glIndexxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIndexxvOES"); }
    }

    public void LoadTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (!Unmarshal.isNullPointer(PFN_glLoadTransposeMatrixxOES)) { try {
            MH_glLoadTransposeMatrixxOES.invokeExact(PFN_glLoadTransposeMatrixxOES, m);
        } catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixxOES"); }
    }

    public void Map1xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int stride, @CType("GLint") int order, @CType("GLfixed") int points) {
        if (!Unmarshal.isNullPointer(PFN_glMap1xOES)) { try {
            MH_glMap1xOES.invokeExact(PFN_glMap1xOES, target, u1, u2, stride, order, points);
        } catch (Throwable e) { throw new RuntimeException("error in glMap1xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMap1xOES"); }
    }

    public void Map2xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int ustride, @CType("GLint") int uorder, @CType("GLfixed") int v1, @CType("GLfixed") int v2, @CType("GLint") int vstride, @CType("GLint") int vorder, @CType("GLfixed") int points) {
        if (!Unmarshal.isNullPointer(PFN_glMap2xOES)) { try {
            MH_glMap2xOES.invokeExact(PFN_glMap2xOES, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) { throw new RuntimeException("error in glMap2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMap2xOES"); }
    }

    public void MapGrid1xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2) {
        if (!Unmarshal.isNullPointer(PFN_glMapGrid1xOES)) { try {
            MH_glMapGrid1xOES.invokeExact(PFN_glMapGrid1xOES, n, u1, u2);
        } catch (Throwable e) { throw new RuntimeException("error in glMapGrid1xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapGrid1xOES"); }
    }

    public void MapGrid2xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLfixed") int v1, @CType("GLfixed") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glMapGrid2xOES)) { try {
            MH_glMapGrid2xOES.invokeExact(PFN_glMapGrid2xOES, n, u1, u2, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glMapGrid2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapGrid2xOES"); }
    }

    public void MultTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (!Unmarshal.isNullPointer(PFN_glMultTransposeMatrixxOES)) { try {
            MH_glMultTransposeMatrixxOES.invokeExact(PFN_glMultTransposeMatrixxOES, m);
        } catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixxOES"); }
    }

    public void MultiTexCoord1xOES(@CType("GLenum") int texture, @CType("GLfixed") int s) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1xOES)) { try {
            MH_glMultiTexCoord1xOES.invokeExact(PFN_glMultiTexCoord1xOES, texture, s);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xOES"); }
    }

    public void MultiTexCoord1xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1xvOES)) { try {
            MH_glMultiTexCoord1xvOES.invokeExact(PFN_glMultiTexCoord1xvOES, texture, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xvOES"); }
    }

    public void MultiTexCoord2xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2xOES)) { try {
            MH_glMultiTexCoord2xOES.invokeExact(PFN_glMultiTexCoord2xOES, texture, s, t);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xOES"); }
    }

    public void MultiTexCoord2xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2xvOES)) { try {
            MH_glMultiTexCoord2xvOES.invokeExact(PFN_glMultiTexCoord2xvOES, texture, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xvOES"); }
    }

    public void MultiTexCoord3xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3xOES)) { try {
            MH_glMultiTexCoord3xOES.invokeExact(PFN_glMultiTexCoord3xOES, texture, s, t, r);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xOES"); }
    }

    public void MultiTexCoord3xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3xvOES)) { try {
            MH_glMultiTexCoord3xvOES.invokeExact(PFN_glMultiTexCoord3xvOES, texture, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xvOES"); }
    }

    public void MultiTexCoord4xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4xvOES)) { try {
            MH_glMultiTexCoord4xvOES.invokeExact(PFN_glMultiTexCoord4xvOES, texture, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xvOES"); }
    }

    public void Normal3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3xvOES)) { try {
            MH_glNormal3xvOES.invokeExact(PFN_glNormal3xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3xvOES"); }
    }

    public void PassThroughxOES(@CType("GLfixed") int token) {
        if (!Unmarshal.isNullPointer(PFN_glPassThroughxOES)) { try {
            MH_glPassThroughxOES.invokeExact(PFN_glPassThroughxOES, token);
        } catch (Throwable e) { throw new RuntimeException("error in glPassThroughxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPassThroughxOES"); }
    }

    public void PixelMapx(@CType("GLenum") int map, @CType("GLint") int size, @CType("const GLfixed *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glPixelMapx)) { try {
            MH_glPixelMapx.invokeExact(PFN_glPixelMapx, map, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelMapx", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelMapx"); }
    }

    public void PixelStorex(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glPixelStorex)) { try {
            MH_glPixelStorex.invokeExact(PFN_glPixelStorex, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelStorex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelStorex"); }
    }

    public void PixelTransferxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glPixelTransferxOES)) { try {
            MH_glPixelTransferxOES.invokeExact(PFN_glPixelTransferxOES, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelTransferxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelTransferxOES"); }
    }

    public void PixelZoomxOES(@CType("GLfixed") int xfactor, @CType("GLfixed") int yfactor) {
        if (!Unmarshal.isNullPointer(PFN_glPixelZoomxOES)) { try {
            MH_glPixelZoomxOES.invokeExact(PFN_glPixelZoomxOES, xfactor, yfactor);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelZoomxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelZoomxOES"); }
    }

    public void PrioritizeTexturesxOES(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment textures, @CType("const GLfixed *") java.lang.foreign.MemorySegment priorities) {
        if (!Unmarshal.isNullPointer(PFN_glPrioritizeTexturesxOES)) { try {
            MH_glPrioritizeTexturesxOES.invokeExact(PFN_glPrioritizeTexturesxOES, n, textures, priorities);
        } catch (Throwable e) { throw new RuntimeException("error in glPrioritizeTexturesxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPrioritizeTexturesxOES"); }
    }

    public void RasterPos2xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos2xOES)) { try {
            MH_glRasterPos2xOES.invokeExact(PFN_glRasterPos2xOES, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos2xOES"); }
    }

    public void RasterPos2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos2xvOES)) { try {
            MH_glRasterPos2xvOES.invokeExact(PFN_glRasterPos2xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos2xvOES"); }
    }

    public void RasterPos3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos3xOES)) { try {
            MH_glRasterPos3xOES.invokeExact(PFN_glRasterPos3xOES, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos3xOES"); }
    }

    public void RasterPos3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos3xvOES)) { try {
            MH_glRasterPos3xvOES.invokeExact(PFN_glRasterPos3xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos3xvOES"); }
    }

    public void RasterPos4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z, @CType("GLfixed") int w) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos4xOES)) { try {
            MH_glRasterPos4xOES.invokeExact(PFN_glRasterPos4xOES, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos4xOES"); }
    }

    public void RasterPos4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glRasterPos4xvOES)) { try {
            MH_glRasterPos4xvOES.invokeExact(PFN_glRasterPos4xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRasterPos4xvOES"); }
    }

    public void RectxOES(@CType("GLfixed") int x1, @CType("GLfixed") int y1, @CType("GLfixed") int x2, @CType("GLfixed") int y2) {
        if (!Unmarshal.isNullPointer(PFN_glRectxOES)) { try {
            MH_glRectxOES.invokeExact(PFN_glRectxOES, x1, y1, x2, y2);
        } catch (Throwable e) { throw new RuntimeException("error in glRectxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRectxOES"); }
    }

    public void RectxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment v1, @CType("const GLfixed *") java.lang.foreign.MemorySegment v2) {
        if (!Unmarshal.isNullPointer(PFN_glRectxvOES)) { try {
            MH_glRectxvOES.invokeExact(PFN_glRectxvOES, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glRectxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRectxvOES"); }
    }

    public void TexCoord1xOES(@CType("GLfixed") int s) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord1xOES)) { try {
            MH_glTexCoord1xOES.invokeExact(PFN_glTexCoord1xOES, s);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord1xOES"); }
    }

    public void TexCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord1xvOES)) { try {
            MH_glTexCoord1xvOES.invokeExact(PFN_glTexCoord1xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord1xvOES"); }
    }

    public void TexCoord2xOES(@CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2xOES)) { try {
            MH_glTexCoord2xOES.invokeExact(PFN_glTexCoord2xOES, s, t);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2xOES"); }
    }

    public void TexCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2xvOES)) { try {
            MH_glTexCoord2xvOES.invokeExact(PFN_glTexCoord2xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2xvOES"); }
    }

    public void TexCoord3xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord3xOES)) { try {
            MH_glTexCoord3xOES.invokeExact(PFN_glTexCoord3xOES, s, t, r);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord3xOES"); }
    }

    public void TexCoord3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord3xvOES)) { try {
            MH_glTexCoord3xvOES.invokeExact(PFN_glTexCoord3xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord3xvOES"); }
    }

    public void TexCoord4xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4xOES)) { try {
            MH_glTexCoord4xOES.invokeExact(PFN_glTexCoord4xOES, s, t, r, q);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4xOES"); }
    }

    public void TexCoord4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4xvOES)) { try {
            MH_glTexCoord4xvOES.invokeExact(PFN_glTexCoord4xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4xvOES"); }
    }

    public void TexGenxOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (!Unmarshal.isNullPointer(PFN_glTexGenxOES)) { try {
            MH_glTexGenxOES.invokeExact(PFN_glTexGenxOES, coord, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTexGenxOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexGenxOES"); }
    }

    public void TexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glTexGenxvOES)) { try {
            MH_glTexGenxvOES.invokeExact(PFN_glTexGenxvOES, coord, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glTexGenxvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexGenxvOES"); }
    }

    public void Vertex2xOES(@CType("GLfixed") int x) {
        if (!Unmarshal.isNullPointer(PFN_glVertex2xOES)) { try {
            MH_glVertex2xOES.invokeExact(PFN_glVertex2xOES, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex2xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex2xOES"); }
    }

    public void Vertex2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glVertex2xvOES)) { try {
            MH_glVertex2xvOES.invokeExact(PFN_glVertex2xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex2xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex2xvOES"); }
    }

    public void Vertex3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (!Unmarshal.isNullPointer(PFN_glVertex3xOES)) { try {
            MH_glVertex3xOES.invokeExact(PFN_glVertex3xOES, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex3xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex3xOES"); }
    }

    public void Vertex3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glVertex3xvOES)) { try {
            MH_glVertex3xvOES.invokeExact(PFN_glVertex3xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex3xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex3xvOES"); }
    }

    public void Vertex4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (!Unmarshal.isNullPointer(PFN_glVertex4xOES)) { try {
            MH_glVertex4xOES.invokeExact(PFN_glVertex4xOES, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex4xOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex4xOES"); }
    }

    public void Vertex4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (!Unmarshal.isNullPointer(PFN_glVertex4xvOES)) { try {
            MH_glVertex4xvOES.invokeExact(PFN_glVertex4xvOES, coords);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex4xvOES", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex4xvOES"); }
    }

}
