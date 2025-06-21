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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLOESFixedPoint {
    public static final int GL_FIXED_OES = 0x140C;
    private final Handles handles;
    public static final class Handles {
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
        public static final MethodHandle MH_glSampleCoveragexOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLOESFixedPoint(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glAlphaFuncxOES((unsigned int) GLenum func, ((int32_t) khronos_int32_t) GLfixed ref);
    /// ```
    public void AlphaFuncxOES(int func, int ref) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaFuncxOES)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaFuncxOES");
        try { Handles.MH_glAlphaFuncxOES.invokeExact(handles.PFN_glAlphaFuncxOES, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaFuncxOES", e); }
    }

    /// ```
    /// void glClearColorxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void ClearColorxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearColorxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearColorxOES");
        try { Handles.MH_glClearColorxOES.invokeExact(handles.PFN_glClearColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearColorxOES", e); }
    }

    /// ```
    /// void glClearDepthxOES(((int32_t) khronos_int32_t) GLfixed depth);
    /// ```
    public void ClearDepthxOES(int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearDepthxOES");
        try { Handles.MH_glClearDepthxOES.invokeExact(handles.PFN_glClearDepthxOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthxOES", e); }
    }

    /// ```
    /// void glClipPlanexOES((unsigned int) GLenum plane, const GLfixed* equation);
    /// ```
    public void ClipPlanexOES(int plane, MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClipPlanexOES)) throw new GLSymbolNotFoundError("Symbol not found: glClipPlanexOES");
        try { Handles.MH_glClipPlanexOES.invokeExact(handles.PFN_glClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in ClipPlanexOES", e); }
    }

    /// ```
    /// void glColor4xOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void Color4xOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor4xOES");
        try { Handles.MH_glColor4xOES.invokeExact(handles.PFN_glColor4xOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in Color4xOES", e); }
    }

    /// ```
    /// void glDepthRangexOES(((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void DepthRangexOES(int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangexOES)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangexOES");
        try { Handles.MH_glDepthRangexOES.invokeExact(handles.PFN_glDepthRangexOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangexOES", e); }
    }

    /// ```
    /// void glFogxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void FogxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFogxOES");
        try { Handles.MH_glFogxOES.invokeExact(handles.PFN_glFogxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FogxOES", e); }
    }

    /// ```
    /// void glFogxvOES((unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void FogxvOES(int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glFogxvOES");
        try { Handles.MH_glFogxvOES.invokeExact(handles.PFN_glFogxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FogxvOES", e); }
    }

    /// ```
    /// void glFrustumxOES(((int32_t) khronos_int32_t) GLfixed l, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed b, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void FrustumxOES(int l, int r, int b, int t, int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrustumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFrustumxOES");
        try { Handles.MH_glFrustumxOES.invokeExact(handles.PFN_glFrustumxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in FrustumxOES", e); }
    }

    /// ```
    /// void glGetClipPlanexOES((unsigned int) GLenum plane, GLfixed* equation);
    /// ```
    public void GetClipPlanexOES(int plane, MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetClipPlanexOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetClipPlanexOES");
        try { Handles.MH_glGetClipPlanexOES.invokeExact(handles.PFN_glGetClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in GetClipPlanexOES", e); }
    }

    /// ```
    /// void glGetFixedvOES((unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetFixedvOES(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFixedvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetFixedvOES");
        try { Handles.MH_glGetFixedvOES.invokeExact(handles.PFN_glGetFixedvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFixedvOES", e); }
    }

    /// ```
    /// void glGetTexEnvxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexEnvxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexEnvxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexEnvxvOES");
        try { Handles.MH_glGetTexEnvxvOES.invokeExact(handles.PFN_glGetTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexEnvxvOES", e); }
    }

    /// ```
    /// void glGetTexParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexParameterxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterxvOES");
        try { Handles.MH_glGetTexParameterxvOES.invokeExact(handles.PFN_glGetTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterxvOES", e); }
    }

    /// ```
    /// void glLightModelxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void LightModelxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightModelxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightModelxOES");
        try { Handles.MH_glLightModelxOES.invokeExact(handles.PFN_glLightModelxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightModelxOES", e); }
    }

    /// ```
    /// void glLightModelxvOES((unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void LightModelxvOES(int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightModelxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightModelxvOES");
        try { Handles.MH_glLightModelxvOES.invokeExact(handles.PFN_glLightModelxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightModelxvOES", e); }
    }

    /// ```
    /// void glLightxOES((unsigned int) GLenum light, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void LightxOES(int light, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightxOES");
        try { Handles.MH_glLightxOES.invokeExact(handles.PFN_glLightxOES, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightxOES", e); }
    }

    /// ```
    /// void glLightxvOES((unsigned int) GLenum light, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void LightxvOES(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightxvOES");
        try { Handles.MH_glLightxvOES.invokeExact(handles.PFN_glLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in LightxvOES", e); }
    }

    /// ```
    /// void glLineWidthxOES(((int32_t) khronos_int32_t) GLfixed width);
    /// ```
    public void LineWidthxOES(int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLineWidthxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLineWidthxOES");
        try { Handles.MH_glLineWidthxOES.invokeExact(handles.PFN_glLineWidthxOES, width); }
        catch (Throwable e) { throw new RuntimeException("error in LineWidthxOES", e); }
    }

    /// ```
    /// void glLoadMatrixxOES(const GLfixed* m);
    /// ```
    public void LoadMatrixxOES(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLoadMatrixxOES");
        try { Handles.MH_glLoadMatrixxOES.invokeExact(handles.PFN_glLoadMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadMatrixxOES", e); }
    }

    /// ```
    /// void glMaterialxOES((unsigned int) GLenum face, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void MaterialxOES(int face, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaterialxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMaterialxOES");
        try { Handles.MH_glMaterialxOES.invokeExact(handles.PFN_glMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MaterialxOES", e); }
    }

    /// ```
    /// void glMaterialxvOES((unsigned int) GLenum face, (unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void MaterialxvOES(int face, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaterialxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMaterialxvOES");
        try { Handles.MH_glMaterialxvOES.invokeExact(handles.PFN_glMaterialxvOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MaterialxvOES", e); }
    }

    /// ```
    /// void glMultMatrixxOES(const GLfixed* m);
    /// ```
    public void MultMatrixxOES(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultMatrixxOES");
        try { Handles.MH_glMultMatrixxOES.invokeExact(handles.PFN_glMultMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultMatrixxOES", e); }
    }

    /// ```
    /// void glMultiTexCoord4xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed q);
    /// ```
    public void MultiTexCoord4xOES(int texture, int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4xOES");
        try { Handles.MH_glMultiTexCoord4xOES.invokeExact(handles.PFN_glMultiTexCoord4xOES, texture, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4xOES", e); }
    }

    /// ```
    /// void glNormal3xOES(((int32_t) khronos_int32_t) GLfixed nx, ((int32_t) khronos_int32_t) GLfixed ny, ((int32_t) khronos_int32_t) GLfixed nz);
    /// ```
    public void Normal3xOES(int nx, int ny, int nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3xOES");
        try { Handles.MH_glNormal3xOES.invokeExact(handles.PFN_glNormal3xOES, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3xOES", e); }
    }

    /// ```
    /// void glOrthoxOES(((int32_t) khronos_int32_t) GLfixed l, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed b, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void OrthoxOES(int l, int r, int b, int t, int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glOrthoxOES)) throw new GLSymbolNotFoundError("Symbol not found: glOrthoxOES");
        try { Handles.MH_glOrthoxOES.invokeExact(handles.PFN_glOrthoxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in OrthoxOES", e); }
    }

    /// ```
    /// void glPointParameterxvOES((unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void PointParameterxvOES(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterxvOES");
        try { Handles.MH_glPointParameterxvOES.invokeExact(handles.PFN_glPointParameterxvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterxvOES", e); }
    }

    /// ```
    /// void glPointSizexOES(((int32_t) khronos_int32_t) GLfixed size);
    /// ```
    public void PointSizexOES(int size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointSizexOES)) throw new GLSymbolNotFoundError("Symbol not found: glPointSizexOES");
        try { Handles.MH_glPointSizexOES.invokeExact(handles.PFN_glPointSizexOES, size); }
        catch (Throwable e) { throw new RuntimeException("error in PointSizexOES", e); }
    }

    /// ```
    /// void glPolygonOffsetxOES(((int32_t) khronos_int32_t) GLfixed factor, ((int32_t) khronos_int32_t) GLfixed units);
    /// ```
    public void PolygonOffsetxOES(int factor, int units) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetxOES");
        try { Handles.MH_glPolygonOffsetxOES.invokeExact(handles.PFN_glPolygonOffsetxOES, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetxOES", e); }
    }

    /// ```
    /// void glRotatexOES(((int32_t) khronos_int32_t) GLfixed angle, ((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void RotatexOES(int angle, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRotatexOES)) throw new GLSymbolNotFoundError("Symbol not found: glRotatexOES");
        try { Handles.MH_glRotatexOES.invokeExact(handles.PFN_glRotatexOES, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in RotatexOES", e); }
    }

    /// ```
    /// void glScalexOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void ScalexOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScalexOES)) throw new GLSymbolNotFoundError("Symbol not found: glScalexOES");
        try { Handles.MH_glScalexOES.invokeExact(handles.PFN_glScalexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ScalexOES", e); }
    }

    /// ```
    /// void glTexEnvxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexEnvxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexEnvxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexEnvxOES");
        try { Handles.MH_glTexEnvxOES.invokeExact(handles.PFN_glTexEnvxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexEnvxOES", e); }
    }

    /// ```
    /// void glTexEnvxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexEnvxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexEnvxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexEnvxvOES");
        try { Handles.MH_glTexEnvxvOES.invokeExact(handles.PFN_glTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexEnvxvOES", e); }
    }

    /// ```
    /// void glTexParameterxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexParameterxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterxOES");
        try { Handles.MH_glTexParameterxOES.invokeExact(handles.PFN_glTexParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterxOES", e); }
    }

    /// ```
    /// void glTexParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexParameterxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterxvOES");
        try { Handles.MH_glTexParameterxvOES.invokeExact(handles.PFN_glTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterxvOES", e); }
    }

    /// ```
    /// void glTranslatexOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void TranslatexOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTranslatexOES)) throw new GLSymbolNotFoundError("Symbol not found: glTranslatexOES");
        try { Handles.MH_glTranslatexOES.invokeExact(handles.PFN_glTranslatexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TranslatexOES", e); }
    }

    /// ```
    /// void glGetLightxvOES((unsigned int) GLenum light, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetLightxvOES(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLightxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetLightxvOES");
        try { Handles.MH_glGetLightxvOES.invokeExact(handles.PFN_glGetLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetLightxvOES", e); }
    }

    /// ```
    /// void glGetMaterialxvOES((unsigned int) GLenum face, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetMaterialxvOES(int face, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMaterialxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetMaterialxvOES");
        try { Handles.MH_glGetMaterialxvOES.invokeExact(handles.PFN_glGetMaterialxvOES, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMaterialxvOES", e); }
    }

    /// ```
    /// void glPointParameterxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void PointParameterxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterxOES");
        try { Handles.MH_glPointParameterxOES.invokeExact(handles.PFN_glPointParameterxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterxOES", e); }
    }

    /// ```
    /// void glSampleCoveragexOES(((int32_t) khronos_int32_t) GLclampx value, GLboolean invert);
    /// ```
    public void SampleCoveragexOES(int value, boolean invert) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleCoveragexOES)) throw new GLSymbolNotFoundError("Symbol not found: glSampleCoveragexOES");
        try { Handles.MH_glSampleCoveragexOES.invokeExact(handles.PFN_glSampleCoveragexOES, value, ((invert) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in SampleCoveragexOES", e); }
    }

    /// ```
    /// void glAccumxOES((unsigned int) GLenum op, ((int32_t) khronos_int32_t) GLfixed value);
    /// ```
    public void AccumxOES(int op, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAccumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glAccumxOES");
        try { Handles.MH_glAccumxOES.invokeExact(handles.PFN_glAccumxOES, op, value); }
        catch (Throwable e) { throw new RuntimeException("error in AccumxOES", e); }
    }

    /// ```
    /// void glBitmapxOES((int) GLsizei width, (int) GLsizei height, ((int32_t) khronos_int32_t) GLfixed xorig, ((int32_t) khronos_int32_t) GLfixed yorig, ((int32_t) khronos_int32_t) GLfixed xmove, ((int32_t) khronos_int32_t) GLfixed ymove, const GLubyte* bitmap);
    /// ```
    public void BitmapxOES(int width, int height, int xorig, int yorig, int xmove, int ymove, MemorySegment bitmap) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBitmapxOES)) throw new GLSymbolNotFoundError("Symbol not found: glBitmapxOES");
        try { Handles.MH_glBitmapxOES.invokeExact(handles.PFN_glBitmapxOES, width, height, xorig, yorig, xmove, ymove, bitmap); }
        catch (Throwable e) { throw new RuntimeException("error in BitmapxOES", e); }
    }

    /// ```
    /// void glBlendColorxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void BlendColorxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColorxOES)) throw new GLSymbolNotFoundError("Symbol not found: glBlendColorxOES");
        try { Handles.MH_glBlendColorxOES.invokeExact(handles.PFN_glBlendColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColorxOES", e); }
    }

    /// ```
    /// void glClearAccumxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void ClearAccumxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearAccumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearAccumxOES");
        try { Handles.MH_glClearAccumxOES.invokeExact(handles.PFN_glClearAccumxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearAccumxOES", e); }
    }

    /// ```
    /// void glColor3xOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue);
    /// ```
    public void Color3xOES(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor3xOES");
        try { Handles.MH_glColor3xOES.invokeExact(handles.PFN_glColor3xOES, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in Color3xOES", e); }
    }

    /// ```
    /// void glColor3xvOES(const GLfixed* components);
    /// ```
    public void Color3xvOES(MemorySegment components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor3xvOES");
        try { Handles.MH_glColor3xvOES.invokeExact(handles.PFN_glColor3xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in Color3xvOES", e); }
    }

    /// ```
    /// void glColor4xvOES(const GLfixed* components);
    /// ```
    public void Color4xvOES(MemorySegment components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor4xvOES");
        try { Handles.MH_glColor4xvOES.invokeExact(handles.PFN_glColor4xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in Color4xvOES", e); }
    }

    /// ```
    /// void glConvolutionParameterxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void ConvolutionParameterxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterxOES)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterxOES");
        try { Handles.MH_glConvolutionParameterxOES.invokeExact(handles.PFN_glConvolutionParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterxOES", e); }
    }

    /// ```
    /// void glConvolutionParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void ConvolutionParameterxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterxvOES");
        try { Handles.MH_glConvolutionParameterxvOES.invokeExact(handles.PFN_glConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterxvOES", e); }
    }

    /// ```
    /// void glEvalCoord1xOES(((int32_t) khronos_int32_t) GLfixed u);
    /// ```
    public void EvalCoord1xOES(int u) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord1xOES");
        try { Handles.MH_glEvalCoord1xOES.invokeExact(handles.PFN_glEvalCoord1xOES, u); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord1xOES", e); }
    }

    /// ```
    /// void glEvalCoord1xvOES(const GLfixed* coords);
    /// ```
    public void EvalCoord1xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord1xvOES");
        try { Handles.MH_glEvalCoord1xvOES.invokeExact(handles.PFN_glEvalCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord1xvOES", e); }
    }

    /// ```
    /// void glEvalCoord2xOES(((int32_t) khronos_int32_t) GLfixed u, ((int32_t) khronos_int32_t) GLfixed v);
    /// ```
    public void EvalCoord2xOES(int u, int v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord2xOES");
        try { Handles.MH_glEvalCoord2xOES.invokeExact(handles.PFN_glEvalCoord2xOES, u, v); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord2xOES", e); }
    }

    /// ```
    /// void glEvalCoord2xvOES(const GLfixed* coords);
    /// ```
    public void EvalCoord2xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord2xvOES");
        try { Handles.MH_glEvalCoord2xvOES.invokeExact(handles.PFN_glEvalCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord2xvOES", e); }
    }

    /// ```
    /// void glFeedbackBufferxOES((int) GLsizei n, (unsigned int) GLenum type, const GLfixed* buffer);
    /// ```
    public void FeedbackBufferxOES(int n, int type, MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFeedbackBufferxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFeedbackBufferxOES");
        try { Handles.MH_glFeedbackBufferxOES.invokeExact(handles.PFN_glFeedbackBufferxOES, n, type, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in FeedbackBufferxOES", e); }
    }

    /// ```
    /// void glGetConvolutionParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetConvolutionParameterxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetConvolutionParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetConvolutionParameterxvOES");
        try { Handles.MH_glGetConvolutionParameterxvOES.invokeExact(handles.PFN_glGetConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetConvolutionParameterxvOES", e); }
    }

    /// ```
    /// void glGetHistogramParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetHistogramParameterxvOES(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameterxvOES");
        try { Handles.MH_glGetHistogramParameterxvOES.invokeExact(handles.PFN_glGetHistogramParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterxvOES", e); }
    }

    /// ```
    /// void glGetLightxOES((unsigned int) GLenum light, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetLightxOES(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLightxOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetLightxOES");
        try { Handles.MH_glGetLightxOES.invokeExact(handles.PFN_glGetLightxOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetLightxOES", e); }
    }

    /// ```
    /// void glGetMapxvOES((unsigned int) GLenum target, (unsigned int) GLenum query, GLfixed* v);
    /// ```
    public void GetMapxvOES(int target, int query, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapxvOES");
        try { Handles.MH_glGetMapxvOES.invokeExact(handles.PFN_glGetMapxvOES, target, query, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapxvOES", e); }
    }

    /// ```
    /// void glGetMaterialxOES((unsigned int) GLenum face, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void GetMaterialxOES(int face, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMaterialxOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetMaterialxOES");
        try { Handles.MH_glGetMaterialxOES.invokeExact(handles.PFN_glGetMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetMaterialxOES", e); }
    }

    /// ```
    /// void glGetPixelMapxv((unsigned int) GLenum map, (int) GLint size, GLfixed* values);
    /// ```
    public void GetPixelMapxv(int map, int size, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelMapxv)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelMapxv");
        try { Handles.MH_glGetPixelMapxv.invokeExact(handles.PFN_glGetPixelMapxv, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelMapxv", e); }
    }

    /// ```
    /// void glGetTexGenxvOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexGenxvOES(int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexGenxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexGenxvOES");
        try { Handles.MH_glGetTexGenxvOES.invokeExact(handles.PFN_glGetTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexGenxvOES", e); }
    }

    /// ```
    /// void glGetTexLevelParameterxvOES((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexLevelParameterxvOES(int target, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexLevelParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexLevelParameterxvOES");
        try { Handles.MH_glGetTexLevelParameterxvOES.invokeExact(handles.PFN_glGetTexLevelParameterxvOES, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexLevelParameterxvOES", e); }
    }

    /// ```
    /// void glIndexxOES(((int32_t) khronos_int32_t) GLfixed component);
    /// ```
    public void IndexxOES(int component) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexxOES)) throw new GLSymbolNotFoundError("Symbol not found: glIndexxOES");
        try { Handles.MH_glIndexxOES.invokeExact(handles.PFN_glIndexxOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in IndexxOES", e); }
    }

    /// ```
    /// void glIndexxvOES(const GLfixed* component);
    /// ```
    public void IndexxvOES(MemorySegment component) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glIndexxvOES");
        try { Handles.MH_glIndexxvOES.invokeExact(handles.PFN_glIndexxvOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in IndexxvOES", e); }
    }

    /// ```
    /// void glLoadTransposeMatrixxOES(const GLfixed* m);
    /// ```
    public void LoadTransposeMatrixxOES(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixxOES");
        try { Handles.MH_glLoadTransposeMatrixxOES.invokeExact(handles.PFN_glLoadTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixxOES", e); }
    }

    /// ```
    /// void glMap1xOES((unsigned int) GLenum target, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, (int) GLint stride, (int) GLint order, ((int32_t) khronos_int32_t) GLfixed points);
    /// ```
    public void Map1xOES(int target, int u1, int u2, int stride, int order, int points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMap1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMap1xOES");
        try { Handles.MH_glMap1xOES.invokeExact(handles.PFN_glMap1xOES, target, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in Map1xOES", e); }
    }

    /// ```
    /// void glMap2xOES((unsigned int) GLenum target, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, (int) GLint ustride, (int) GLint uorder, ((int32_t) khronos_int32_t) GLfixed v1, ((int32_t) khronos_int32_t) GLfixed v2, (int) GLint vstride, (int) GLint vorder, ((int32_t) khronos_int32_t) GLfixed points);
    /// ```
    public void Map2xOES(int target, int u1, int u2, int ustride, int uorder, int v1, int v2, int vstride, int vorder, int points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMap2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMap2xOES");
        try { Handles.MH_glMap2xOES.invokeExact(handles.PFN_glMap2xOES, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in Map2xOES", e); }
    }

    /// ```
    /// void glMapGrid1xOES((int) GLint n, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2);
    /// ```
    public void MapGrid1xOES(int n, int u1, int u2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapGrid1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMapGrid1xOES");
        try { Handles.MH_glMapGrid1xOES.invokeExact(handles.PFN_glMapGrid1xOES, n, u1, u2); }
        catch (Throwable e) { throw new RuntimeException("error in MapGrid1xOES", e); }
    }

    /// ```
    /// void glMapGrid2xOES((int) GLint n, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, ((int32_t) khronos_int32_t) GLfixed v1, ((int32_t) khronos_int32_t) GLfixed v2);
    /// ```
    public void MapGrid2xOES(int n, int u1, int u2, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapGrid2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMapGrid2xOES");
        try { Handles.MH_glMapGrid2xOES.invokeExact(handles.PFN_glMapGrid2xOES, n, u1, u2, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in MapGrid2xOES", e); }
    }

    /// ```
    /// void glMultTransposeMatrixxOES(const GLfixed* m);
    /// ```
    public void MultTransposeMatrixxOES(MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixxOES");
        try { Handles.MH_glMultTransposeMatrixxOES.invokeExact(handles.PFN_glMultTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixxOES", e); }
    }

    /// ```
    /// void glMultiTexCoord1xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s);
    /// ```
    public void MultiTexCoord1xOES(int texture, int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1xOES");
        try { Handles.MH_glMultiTexCoord1xOES.invokeExact(handles.PFN_glMultiTexCoord1xOES, texture, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1xOES", e); }
    }

    /// ```
    /// void glMultiTexCoord1xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord1xvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1xvOES");
        try { Handles.MH_glMultiTexCoord1xvOES.invokeExact(handles.PFN_glMultiTexCoord1xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1xvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord2xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t);
    /// ```
    public void MultiTexCoord2xOES(int texture, int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2xOES");
        try { Handles.MH_glMultiTexCoord2xOES.invokeExact(handles.PFN_glMultiTexCoord2xOES, texture, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2xOES", e); }
    }

    /// ```
    /// void glMultiTexCoord2xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord2xvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2xvOES");
        try { Handles.MH_glMultiTexCoord2xvOES.invokeExact(handles.PFN_glMultiTexCoord2xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2xvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord3xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r);
    /// ```
    public void MultiTexCoord3xOES(int texture, int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3xOES");
        try { Handles.MH_glMultiTexCoord3xOES.invokeExact(handles.PFN_glMultiTexCoord3xOES, texture, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3xOES", e); }
    }

    /// ```
    /// void glMultiTexCoord3xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord3xvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3xvOES");
        try { Handles.MH_glMultiTexCoord3xvOES.invokeExact(handles.PFN_glMultiTexCoord3xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3xvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord4xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord4xvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4xvOES");
        try { Handles.MH_glMultiTexCoord4xvOES.invokeExact(handles.PFN_glMultiTexCoord4xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4xvOES", e); }
    }

    /// ```
    /// void glNormal3xvOES(const GLfixed* coords);
    /// ```
    public void Normal3xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3xvOES");
        try { Handles.MH_glNormal3xvOES.invokeExact(handles.PFN_glNormal3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3xvOES", e); }
    }

    /// ```
    /// void glPassThroughxOES(((int32_t) khronos_int32_t) GLfixed token);
    /// ```
    public void PassThroughxOES(int token) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPassThroughxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPassThroughxOES");
        try { Handles.MH_glPassThroughxOES.invokeExact(handles.PFN_glPassThroughxOES, token); }
        catch (Throwable e) { throw new RuntimeException("error in PassThroughxOES", e); }
    }

    /// ```
    /// void glPixelMapx((unsigned int) GLenum map, (int) GLint size, const GLfixed* values);
    /// ```
    public void PixelMapx(int map, int size, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelMapx)) throw new GLSymbolNotFoundError("Symbol not found: glPixelMapx");
        try { Handles.MH_glPixelMapx.invokeExact(handles.PFN_glPixelMapx, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in PixelMapx", e); }
    }

    /// ```
    /// void glPixelStorex((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void PixelStorex(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelStorex)) throw new GLSymbolNotFoundError("Symbol not found: glPixelStorex");
        try { Handles.MH_glPixelStorex.invokeExact(handles.PFN_glPixelStorex, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelStorex", e); }
    }

    /// ```
    /// void glPixelTransferxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void PixelTransferxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransferxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransferxOES");
        try { Handles.MH_glPixelTransferxOES.invokeExact(handles.PFN_glPixelTransferxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransferxOES", e); }
    }

    /// ```
    /// void glPixelZoomxOES(((int32_t) khronos_int32_t) GLfixed xfactor, ((int32_t) khronos_int32_t) GLfixed yfactor);
    /// ```
    public void PixelZoomxOES(int xfactor, int yfactor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelZoomxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPixelZoomxOES");
        try { Handles.MH_glPixelZoomxOES.invokeExact(handles.PFN_glPixelZoomxOES, xfactor, yfactor); }
        catch (Throwable e) { throw new RuntimeException("error in PixelZoomxOES", e); }
    }

    /// ```
    /// void glPrioritizeTexturesxOES((int) GLsizei n, const GLuint* textures, const GLfixed* priorities);
    /// ```
    public void PrioritizeTexturesxOES(int n, MemorySegment textures, MemorySegment priorities) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPrioritizeTexturesxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPrioritizeTexturesxOES");
        try { Handles.MH_glPrioritizeTexturesxOES.invokeExact(handles.PFN_glPrioritizeTexturesxOES, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in PrioritizeTexturesxOES", e); }
    }

    /// ```
    /// void glRasterPos2xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y);
    /// ```
    public void RasterPos2xOES(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos2xOES");
        try { Handles.MH_glRasterPos2xOES.invokeExact(handles.PFN_glRasterPos2xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos2xOES", e); }
    }

    /// ```
    /// void glRasterPos2xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos2xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos2xvOES");
        try { Handles.MH_glRasterPos2xvOES.invokeExact(handles.PFN_glRasterPos2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos2xvOES", e); }
    }

    /// ```
    /// void glRasterPos3xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void RasterPos3xOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos3xOES");
        try { Handles.MH_glRasterPos3xOES.invokeExact(handles.PFN_glRasterPos3xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos3xOES", e); }
    }

    /// ```
    /// void glRasterPos3xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos3xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos3xvOES");
        try { Handles.MH_glRasterPos3xvOES.invokeExact(handles.PFN_glRasterPos3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos3xvOES", e); }
    }

    /// ```
    /// void glRasterPos4xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z, ((int32_t) khronos_int32_t) GLfixed w);
    /// ```
    public void RasterPos4xOES(int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos4xOES");
        try { Handles.MH_glRasterPos4xOES.invokeExact(handles.PFN_glRasterPos4xOES, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos4xOES", e); }
    }

    /// ```
    /// void glRasterPos4xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos4xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos4xvOES");
        try { Handles.MH_glRasterPos4xvOES.invokeExact(handles.PFN_glRasterPos4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos4xvOES", e); }
    }

    /// ```
    /// void glRectxOES(((int32_t) khronos_int32_t) GLfixed x1, ((int32_t) khronos_int32_t) GLfixed y1, ((int32_t) khronos_int32_t) GLfixed x2, ((int32_t) khronos_int32_t) GLfixed y2);
    /// ```
    public void RectxOES(int x1, int y1, int x2, int y2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRectxOES)) throw new GLSymbolNotFoundError("Symbol not found: glRectxOES");
        try { Handles.MH_glRectxOES.invokeExact(handles.PFN_glRectxOES, x1, y1, x2, y2); }
        catch (Throwable e) { throw new RuntimeException("error in RectxOES", e); }
    }

    /// ```
    /// void glRectxvOES(const GLfixed* v1, const GLfixed* v2);
    /// ```
    public void RectxvOES(MemorySegment v1, MemorySegment v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRectxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRectxvOES");
        try { Handles.MH_glRectxvOES.invokeExact(handles.PFN_glRectxvOES, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in RectxvOES", e); }
    }

    /// ```
    /// void glTexCoord1xOES(((int32_t) khronos_int32_t) GLfixed s);
    /// ```
    public void TexCoord1xOES(int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1xOES");
        try { Handles.MH_glTexCoord1xOES.invokeExact(handles.PFN_glTexCoord1xOES, s); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1xOES", e); }
    }

    /// ```
    /// void glTexCoord1xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord1xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1xvOES");
        try { Handles.MH_glTexCoord1xvOES.invokeExact(handles.PFN_glTexCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1xvOES", e); }
    }

    /// ```
    /// void glTexCoord2xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t);
    /// ```
    public void TexCoord2xOES(int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2xOES");
        try { Handles.MH_glTexCoord2xOES.invokeExact(handles.PFN_glTexCoord2xOES, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2xOES", e); }
    }

    /// ```
    /// void glTexCoord2xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord2xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2xvOES");
        try { Handles.MH_glTexCoord2xvOES.invokeExact(handles.PFN_glTexCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2xvOES", e); }
    }

    /// ```
    /// void glTexCoord3xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r);
    /// ```
    public void TexCoord3xOES(int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3xOES");
        try { Handles.MH_glTexCoord3xOES.invokeExact(handles.PFN_glTexCoord3xOES, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3xOES", e); }
    }

    /// ```
    /// void glTexCoord3xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord3xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3xvOES");
        try { Handles.MH_glTexCoord3xvOES.invokeExact(handles.PFN_glTexCoord3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3xvOES", e); }
    }

    /// ```
    /// void glTexCoord4xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed q);
    /// ```
    public void TexCoord4xOES(int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4xOES");
        try { Handles.MH_glTexCoord4xOES.invokeExact(handles.PFN_glTexCoord4xOES, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4xOES", e); }
    }

    /// ```
    /// void glTexCoord4xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord4xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4xvOES");
        try { Handles.MH_glTexCoord4xvOES.invokeExact(handles.PFN_glTexCoord4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4xvOES", e); }
    }

    /// ```
    /// void glTexGenxOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexGenxOES(int coord, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexGenxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexGenxOES");
        try { Handles.MH_glTexGenxOES.invokeExact(handles.PFN_glTexGenxOES, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexGenxOES", e); }
    }

    /// ```
    /// void glTexGenxvOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexGenxvOES(int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexGenxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexGenxvOES");
        try { Handles.MH_glTexGenxvOES.invokeExact(handles.PFN_glTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexGenxvOES", e); }
    }

    /// ```
    /// void glVertex2xOES(((int32_t) khronos_int32_t) GLfixed x);
    /// ```
    public void Vertex2xOES(int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2xOES");
        try { Handles.MH_glVertex2xOES.invokeExact(handles.PFN_glVertex2xOES, x); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2xOES", e); }
    }

    /// ```
    /// void glVertex2xvOES(const GLfixed* coords);
    /// ```
    public void Vertex2xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2xvOES");
        try { Handles.MH_glVertex2xvOES.invokeExact(handles.PFN_glVertex2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2xvOES", e); }
    }

    /// ```
    /// void glVertex3xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y);
    /// ```
    public void Vertex3xOES(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3xOES");
        try { Handles.MH_glVertex3xOES.invokeExact(handles.PFN_glVertex3xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3xOES", e); }
    }

    /// ```
    /// void glVertex3xvOES(const GLfixed* coords);
    /// ```
    public void Vertex3xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3xvOES");
        try { Handles.MH_glVertex3xvOES.invokeExact(handles.PFN_glVertex3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3xvOES", e); }
    }

    /// ```
    /// void glVertex4xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void Vertex4xOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4xOES");
        try { Handles.MH_glVertex4xOES.invokeExact(handles.PFN_glVertex4xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4xOES", e); }
    }

    /// ```
    /// void glVertex4xvOES(const GLfixed* coords);
    /// ```
    public void Vertex4xvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4xvOES");
        try { Handles.MH_glVertex4xvOES.invokeExact(handles.PFN_glVertex4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4xvOES", e); }
    }

}
