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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glAlphaFuncxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearColorxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearDepthxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClipPlanexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColor4xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDepthRangexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFogxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFogxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFrustumxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetClipPlanexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFixedvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexEnvxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLightModelxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLightModelxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLightxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLightxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLineWidthxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLoadMatrixxOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMaterialxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMaterialxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultMatrixxOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNormal3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glOrthoxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPointParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPointSizexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPolygonOffsetxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRotatexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glScalexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexEnvxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexEnvxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexParameterxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTranslatexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetLightxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMaterialxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPointParameterxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSampleCoveragexOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glAccumxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBitmapxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBlendColorxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearAccumxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColor3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColor3xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColor4xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glConvolutionParameterxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glConvolutionParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glEvalCoord1xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEvalCoord1xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glEvalCoord2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEvalCoord2xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFeedbackBufferxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetConvolutionParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogramParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetLightxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMapxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMaterialxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetPixelMapxv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexGenxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexLevelParameterxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIndexxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIndexxvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLoadTransposeMatrixxOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMap1xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMap2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMapGrid1xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMapGrid2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultTransposeMatrixxOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord1xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord1xvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord2xvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoord3xvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoord4xvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormal3xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPassThroughxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPixelMapx = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPixelStorex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPixelTransferxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPixelZoomxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPrioritizeTexturesxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRasterPos2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRasterPos2xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRasterPos3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRasterPos3xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRasterPos4xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRasterPos4xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRectxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRectxvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord1xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoord1xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoord2xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoord3xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord4xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoord4xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexGenxOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexGenxvOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertex2xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertex2xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertex3xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertex3xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertex4xOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertex4xvOES = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glAlphaFuncxOES = RuntimeHelper.downcall(Descriptors.FD_glAlphaFuncxOES);
        public static final MethodHandle MH_glClearColorxOES = RuntimeHelper.downcall(Descriptors.FD_glClearColorxOES);
        public static final MethodHandle MH_glClearDepthxOES = RuntimeHelper.downcall(Descriptors.FD_glClearDepthxOES);
        public static final MethodHandle MH_glClipPlanexOES = RuntimeHelper.downcall(Descriptors.FD_glClipPlanexOES);
        public static final MethodHandle MH_glColor4xOES = RuntimeHelper.downcall(Descriptors.FD_glColor4xOES);
        public static final MethodHandle MH_glDepthRangexOES = RuntimeHelper.downcall(Descriptors.FD_glDepthRangexOES);
        public static final MethodHandle MH_glFogxOES = RuntimeHelper.downcall(Descriptors.FD_glFogxOES);
        public static final MethodHandle MH_glFogxvOES = RuntimeHelper.downcall(Descriptors.FD_glFogxvOES);
        public static final MethodHandle MH_glFrustumxOES = RuntimeHelper.downcall(Descriptors.FD_glFrustumxOES);
        public static final MethodHandle MH_glGetClipPlanexOES = RuntimeHelper.downcall(Descriptors.FD_glGetClipPlanexOES);
        public static final MethodHandle MH_glGetFixedvOES = RuntimeHelper.downcall(Descriptors.FD_glGetFixedvOES);
        public static final MethodHandle MH_glGetTexEnvxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetTexEnvxvOES);
        public static final MethodHandle MH_glGetTexParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetTexParameterxvOES);
        public static final MethodHandle MH_glLightModelxOES = RuntimeHelper.downcall(Descriptors.FD_glLightModelxOES);
        public static final MethodHandle MH_glLightModelxvOES = RuntimeHelper.downcall(Descriptors.FD_glLightModelxvOES);
        public static final MethodHandle MH_glLightxOES = RuntimeHelper.downcall(Descriptors.FD_glLightxOES);
        public static final MethodHandle MH_glLightxvOES = RuntimeHelper.downcall(Descriptors.FD_glLightxvOES);
        public static final MethodHandle MH_glLineWidthxOES = RuntimeHelper.downcall(Descriptors.FD_glLineWidthxOES);
        public static final MethodHandle MH_glLoadMatrixxOES = RuntimeHelper.downcall(Descriptors.FD_glLoadMatrixxOES);
        public static final MethodHandle MH_glMaterialxOES = RuntimeHelper.downcall(Descriptors.FD_glMaterialxOES);
        public static final MethodHandle MH_glMaterialxvOES = RuntimeHelper.downcall(Descriptors.FD_glMaterialxvOES);
        public static final MethodHandle MH_glMultMatrixxOES = RuntimeHelper.downcall(Descriptors.FD_glMultMatrixxOES);
        public static final MethodHandle MH_glMultiTexCoord4xOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4xOES);
        public static final MethodHandle MH_glNormal3xOES = RuntimeHelper.downcall(Descriptors.FD_glNormal3xOES);
        public static final MethodHandle MH_glOrthoxOES = RuntimeHelper.downcall(Descriptors.FD_glOrthoxOES);
        public static final MethodHandle MH_glPointParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glPointParameterxvOES);
        public static final MethodHandle MH_glPointSizexOES = RuntimeHelper.downcall(Descriptors.FD_glPointSizexOES);
        public static final MethodHandle MH_glPolygonOffsetxOES = RuntimeHelper.downcall(Descriptors.FD_glPolygonOffsetxOES);
        public static final MethodHandle MH_glRotatexOES = RuntimeHelper.downcall(Descriptors.FD_glRotatexOES);
        public static final MethodHandle MH_glScalexOES = RuntimeHelper.downcall(Descriptors.FD_glScalexOES);
        public static final MethodHandle MH_glTexEnvxOES = RuntimeHelper.downcall(Descriptors.FD_glTexEnvxOES);
        public static final MethodHandle MH_glTexEnvxvOES = RuntimeHelper.downcall(Descriptors.FD_glTexEnvxvOES);
        public static final MethodHandle MH_glTexParameterxOES = RuntimeHelper.downcall(Descriptors.FD_glTexParameterxOES);
        public static final MethodHandle MH_glTexParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glTexParameterxvOES);
        public static final MethodHandle MH_glTranslatexOES = RuntimeHelper.downcall(Descriptors.FD_glTranslatexOES);
        public static final MethodHandle MH_glGetLightxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetLightxvOES);
        public static final MethodHandle MH_glGetMaterialxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetMaterialxvOES);
        public static final MethodHandle MH_glPointParameterxOES = RuntimeHelper.downcall(Descriptors.FD_glPointParameterxOES);
        public static final MethodHandle MH_glSampleCoveragexOES = RuntimeHelper.downcall(Descriptors.FD_glSampleCoveragexOES);
        public static final MethodHandle MH_glAccumxOES = RuntimeHelper.downcall(Descriptors.FD_glAccumxOES);
        public static final MethodHandle MH_glBitmapxOES = RuntimeHelper.downcall(Descriptors.FD_glBitmapxOES);
        public static final MethodHandle MH_glBlendColorxOES = RuntimeHelper.downcall(Descriptors.FD_glBlendColorxOES);
        public static final MethodHandle MH_glClearAccumxOES = RuntimeHelper.downcall(Descriptors.FD_glClearAccumxOES);
        public static final MethodHandle MH_glColor3xOES = RuntimeHelper.downcall(Descriptors.FD_glColor3xOES);
        public static final MethodHandle MH_glColor3xvOES = RuntimeHelper.downcall(Descriptors.FD_glColor3xvOES);
        public static final MethodHandle MH_glColor4xvOES = RuntimeHelper.downcall(Descriptors.FD_glColor4xvOES);
        public static final MethodHandle MH_glConvolutionParameterxOES = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameterxOES);
        public static final MethodHandle MH_glConvolutionParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glConvolutionParameterxvOES);
        public static final MethodHandle MH_glEvalCoord1xOES = RuntimeHelper.downcall(Descriptors.FD_glEvalCoord1xOES);
        public static final MethodHandle MH_glEvalCoord1xvOES = RuntimeHelper.downcall(Descriptors.FD_glEvalCoord1xvOES);
        public static final MethodHandle MH_glEvalCoord2xOES = RuntimeHelper.downcall(Descriptors.FD_glEvalCoord2xOES);
        public static final MethodHandle MH_glEvalCoord2xvOES = RuntimeHelper.downcall(Descriptors.FD_glEvalCoord2xvOES);
        public static final MethodHandle MH_glFeedbackBufferxOES = RuntimeHelper.downcall(Descriptors.FD_glFeedbackBufferxOES);
        public static final MethodHandle MH_glGetConvolutionParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetConvolutionParameterxvOES);
        public static final MethodHandle MH_glGetHistogramParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramParameterxvOES);
        public static final MethodHandle MH_glGetLightxOES = RuntimeHelper.downcall(Descriptors.FD_glGetLightxOES);
        public static final MethodHandle MH_glGetMapxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetMapxvOES);
        public static final MethodHandle MH_glGetMaterialxOES = RuntimeHelper.downcall(Descriptors.FD_glGetMaterialxOES);
        public static final MethodHandle MH_glGetPixelMapxv = RuntimeHelper.downcall(Descriptors.FD_glGetPixelMapxv);
        public static final MethodHandle MH_glGetTexGenxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetTexGenxvOES);
        public static final MethodHandle MH_glGetTexLevelParameterxvOES = RuntimeHelper.downcall(Descriptors.FD_glGetTexLevelParameterxvOES);
        public static final MethodHandle MH_glIndexxOES = RuntimeHelper.downcall(Descriptors.FD_glIndexxOES);
        public static final MethodHandle MH_glIndexxvOES = RuntimeHelper.downcall(Descriptors.FD_glIndexxvOES);
        public static final MethodHandle MH_glLoadTransposeMatrixxOES = RuntimeHelper.downcall(Descriptors.FD_glLoadTransposeMatrixxOES);
        public static final MethodHandle MH_glMap1xOES = RuntimeHelper.downcall(Descriptors.FD_glMap1xOES);
        public static final MethodHandle MH_glMap2xOES = RuntimeHelper.downcall(Descriptors.FD_glMap2xOES);
        public static final MethodHandle MH_glMapGrid1xOES = RuntimeHelper.downcall(Descriptors.FD_glMapGrid1xOES);
        public static final MethodHandle MH_glMapGrid2xOES = RuntimeHelper.downcall(Descriptors.FD_glMapGrid2xOES);
        public static final MethodHandle MH_glMultTransposeMatrixxOES = RuntimeHelper.downcall(Descriptors.FD_glMultTransposeMatrixxOES);
        public static final MethodHandle MH_glMultiTexCoord1xOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1xOES);
        public static final MethodHandle MH_glMultiTexCoord1xvOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord1xvOES);
        public static final MethodHandle MH_glMultiTexCoord2xOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2xOES);
        public static final MethodHandle MH_glMultiTexCoord2xvOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord2xvOES);
        public static final MethodHandle MH_glMultiTexCoord3xOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3xOES);
        public static final MethodHandle MH_glMultiTexCoord3xvOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord3xvOES);
        public static final MethodHandle MH_glMultiTexCoord4xvOES = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoord4xvOES);
        public static final MethodHandle MH_glNormal3xvOES = RuntimeHelper.downcall(Descriptors.FD_glNormal3xvOES);
        public static final MethodHandle MH_glPassThroughxOES = RuntimeHelper.downcall(Descriptors.FD_glPassThroughxOES);
        public static final MethodHandle MH_glPixelMapx = RuntimeHelper.downcall(Descriptors.FD_glPixelMapx);
        public static final MethodHandle MH_glPixelStorex = RuntimeHelper.downcall(Descriptors.FD_glPixelStorex);
        public static final MethodHandle MH_glPixelTransferxOES = RuntimeHelper.downcall(Descriptors.FD_glPixelTransferxOES);
        public static final MethodHandle MH_glPixelZoomxOES = RuntimeHelper.downcall(Descriptors.FD_glPixelZoomxOES);
        public static final MethodHandle MH_glPrioritizeTexturesxOES = RuntimeHelper.downcall(Descriptors.FD_glPrioritizeTexturesxOES);
        public static final MethodHandle MH_glRasterPos2xOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos2xOES);
        public static final MethodHandle MH_glRasterPos2xvOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos2xvOES);
        public static final MethodHandle MH_glRasterPos3xOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos3xOES);
        public static final MethodHandle MH_glRasterPos3xvOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos3xvOES);
        public static final MethodHandle MH_glRasterPos4xOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos4xOES);
        public static final MethodHandle MH_glRasterPos4xvOES = RuntimeHelper.downcall(Descriptors.FD_glRasterPos4xvOES);
        public static final MethodHandle MH_glRectxOES = RuntimeHelper.downcall(Descriptors.FD_glRectxOES);
        public static final MethodHandle MH_glRectxvOES = RuntimeHelper.downcall(Descriptors.FD_glRectxvOES);
        public static final MethodHandle MH_glTexCoord1xOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord1xOES);
        public static final MethodHandle MH_glTexCoord1xvOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord1xvOES);
        public static final MethodHandle MH_glTexCoord2xOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2xOES);
        public static final MethodHandle MH_glTexCoord2xvOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2xvOES);
        public static final MethodHandle MH_glTexCoord3xOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord3xOES);
        public static final MethodHandle MH_glTexCoord3xvOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord3xvOES);
        public static final MethodHandle MH_glTexCoord4xOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4xOES);
        public static final MethodHandle MH_glTexCoord4xvOES = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4xvOES);
        public static final MethodHandle MH_glTexGenxOES = RuntimeHelper.downcall(Descriptors.FD_glTexGenxOES);
        public static final MethodHandle MH_glTexGenxvOES = RuntimeHelper.downcall(Descriptors.FD_glTexGenxvOES);
        public static final MethodHandle MH_glVertex2xOES = RuntimeHelper.downcall(Descriptors.FD_glVertex2xOES);
        public static final MethodHandle MH_glVertex2xvOES = RuntimeHelper.downcall(Descriptors.FD_glVertex2xvOES);
        public static final MethodHandle MH_glVertex3xOES = RuntimeHelper.downcall(Descriptors.FD_glVertex3xOES);
        public static final MethodHandle MH_glVertex3xvOES = RuntimeHelper.downcall(Descriptors.FD_glVertex3xvOES);
        public static final MethodHandle MH_glVertex4xOES = RuntimeHelper.downcall(Descriptors.FD_glVertex4xOES);
        public static final MethodHandle MH_glVertex4xvOES = RuntimeHelper.downcall(Descriptors.FD_glVertex4xvOES);
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

    public void AlphaFuncxOES(@CType("GLenum") int func, @CType("GLfixed") int ref) {
        if (Unmarshal.isNullPointer(handles.PFN_glAlphaFuncxOES)) throw new SymbolNotFoundError("Symbol not found: glAlphaFuncxOES");
        try { Handles.MH_glAlphaFuncxOES.invokeExact(handles.PFN_glAlphaFuncxOES, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaFuncxOES", e); }
    }

    public void ClearColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearColorxOES)) throw new SymbolNotFoundError("Symbol not found: glClearColorxOES");
        try { Handles.MH_glClearColorxOES.invokeExact(handles.PFN_glClearColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearColorxOES", e); }
    }

    public void ClearDepthxOES(@CType("GLfixed") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearDepthxOES)) throw new SymbolNotFoundError("Symbol not found: glClearDepthxOES");
        try { Handles.MH_glClearDepthxOES.invokeExact(handles.PFN_glClearDepthxOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthxOES", e); }
    }

    public void ClipPlanexOES(@CType("GLenum") int plane, @CType("const GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (Unmarshal.isNullPointer(handles.PFN_glClipPlanexOES)) throw new SymbolNotFoundError("Symbol not found: glClipPlanexOES");
        try { Handles.MH_glClipPlanexOES.invokeExact(handles.PFN_glClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glClipPlanexOES", e); }
    }

    public void Color4xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4xOES)) throw new SymbolNotFoundError("Symbol not found: glColor4xOES");
        try { Handles.MH_glColor4xOES.invokeExact(handles.PFN_glColor4xOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4xOES", e); }
    }

    public void DepthRangexOES(@CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangexOES)) throw new SymbolNotFoundError("Symbol not found: glDepthRangexOES");
        try { Handles.MH_glDepthRangexOES.invokeExact(handles.PFN_glDepthRangexOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangexOES", e); }
    }

    public void FogxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogxOES)) throw new SymbolNotFoundError("Symbol not found: glFogxOES");
        try { Handles.MH_glFogxOES.invokeExact(handles.PFN_glFogxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFogxOES", e); }
    }

    public void FogxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogxvOES)) throw new SymbolNotFoundError("Symbol not found: glFogxvOES");
        try { Handles.MH_glFogxvOES.invokeExact(handles.PFN_glFogxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFogxvOES", e); }
    }

    public void FrustumxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(handles.PFN_glFrustumxOES)) throw new SymbolNotFoundError("Symbol not found: glFrustumxOES");
        try { Handles.MH_glFrustumxOES.invokeExact(handles.PFN_glFrustumxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glFrustumxOES", e); }
    }

    public void GetClipPlanexOES(@CType("GLenum") int plane, @CType("GLfixed *") java.lang.foreign.MemorySegment equation) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetClipPlanexOES)) throw new SymbolNotFoundError("Symbol not found: glGetClipPlanexOES");
        try { Handles.MH_glGetClipPlanexOES.invokeExact(handles.PFN_glGetClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glGetClipPlanexOES", e); }
    }

    public void GetFixedvOES(@CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFixedvOES)) throw new SymbolNotFoundError("Symbol not found: glGetFixedvOES");
        try { Handles.MH_glGetFixedvOES.invokeExact(handles.PFN_glGetFixedvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFixedvOES", e); }
    }

    public void GetTexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexEnvxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexEnvxvOES");
        try { Handles.MH_glGetTexEnvxvOES.invokeExact(handles.PFN_glGetTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexEnvxvOES", e); }
    }

    public void GetTexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterxvOES");
        try { Handles.MH_glGetTexParameterxvOES.invokeExact(handles.PFN_glGetTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterxvOES", e); }
    }

    public void LightModelxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glLightModelxOES)) throw new SymbolNotFoundError("Symbol not found: glLightModelxOES");
        try { Handles.MH_glLightModelxOES.invokeExact(handles.PFN_glLightModelxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightModelxOES", e); }
    }

    public void LightModelxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glLightModelxvOES)) throw new SymbolNotFoundError("Symbol not found: glLightModelxvOES");
        try { Handles.MH_glLightModelxvOES.invokeExact(handles.PFN_glLightModelxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightModelxvOES", e); }
    }

    public void LightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glLightxOES)) throw new SymbolNotFoundError("Symbol not found: glLightxOES");
        try { Handles.MH_glLightxOES.invokeExact(handles.PFN_glLightxOES, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightxOES", e); }
    }

    public void LightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glLightxvOES)) throw new SymbolNotFoundError("Symbol not found: glLightxvOES");
        try { Handles.MH_glLightxvOES.invokeExact(handles.PFN_glLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glLightxvOES", e); }
    }

    public void LineWidthxOES(@CType("GLfixed") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glLineWidthxOES)) throw new SymbolNotFoundError("Symbol not found: glLineWidthxOES");
        try { Handles.MH_glLineWidthxOES.invokeExact(handles.PFN_glLineWidthxOES, width); }
        catch (Throwable e) { throw new RuntimeException("error in glLineWidthxOES", e); }
    }

    public void LoadMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glLoadMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glLoadMatrixxOES");
        try { Handles.MH_glLoadMatrixxOES.invokeExact(handles.PFN_glLoadMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadMatrixxOES", e); }
    }

    public void MaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMaterialxOES)) throw new SymbolNotFoundError("Symbol not found: glMaterialxOES");
        try { Handles.MH_glMaterialxOES.invokeExact(handles.PFN_glMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMaterialxOES", e); }
    }

    public void MaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMaterialxvOES)) throw new SymbolNotFoundError("Symbol not found: glMaterialxvOES");
        try { Handles.MH_glMaterialxvOES.invokeExact(handles.PFN_glMaterialxvOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMaterialxvOES", e); }
    }

    public void MultMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glMultMatrixxOES");
        try { Handles.MH_glMultMatrixxOES.invokeExact(handles.PFN_glMultMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultMatrixxOES", e); }
    }

    public void MultiTexCoord4xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xOES");
        try { Handles.MH_glMultiTexCoord4xOES.invokeExact(handles.PFN_glMultiTexCoord4xOES, texture, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xOES", e); }
    }

    public void Normal3xOES(@CType("GLfixed") int nx, @CType("GLfixed") int ny, @CType("GLfixed") int nz) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormal3xOES)) throw new SymbolNotFoundError("Symbol not found: glNormal3xOES");
        try { Handles.MH_glNormal3xOES.invokeExact(handles.PFN_glNormal3xOES, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3xOES", e); }
    }

    public void OrthoxOES(@CType("GLfixed") int l, @CType("GLfixed") int r, @CType("GLfixed") int b, @CType("GLfixed") int t, @CType("GLfixed") int n, @CType("GLfixed") int f) {
        if (Unmarshal.isNullPointer(handles.PFN_glOrthoxOES)) throw new SymbolNotFoundError("Symbol not found: glOrthoxOES");
        try { Handles.MH_glOrthoxOES.invokeExact(handles.PFN_glOrthoxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glOrthoxOES", e); }
    }

    public void PointParameterxvOES(@CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glPointParameterxvOES");
        try { Handles.MH_glPointParameterxvOES.invokeExact(handles.PFN_glPointParameterxvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterxvOES", e); }
    }

    public void PointSizexOES(@CType("GLfixed") int size) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointSizexOES)) throw new SymbolNotFoundError("Symbol not found: glPointSizexOES");
        try { Handles.MH_glPointSizexOES.invokeExact(handles.PFN_glPointSizexOES, size); }
        catch (Throwable e) { throw new RuntimeException("error in glPointSizexOES", e); }
    }

    public void PolygonOffsetxOES(@CType("GLfixed") int factor, @CType("GLfixed") int units) {
        if (Unmarshal.isNullPointer(handles.PFN_glPolygonOffsetxOES)) throw new SymbolNotFoundError("Symbol not found: glPolygonOffsetxOES");
        try { Handles.MH_glPolygonOffsetxOES.invokeExact(handles.PFN_glPolygonOffsetxOES, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonOffsetxOES", e); }
    }

    public void RotatexOES(@CType("GLfixed") int angle, @CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glRotatexOES)) throw new SymbolNotFoundError("Symbol not found: glRotatexOES");
        try { Handles.MH_glRotatexOES.invokeExact(handles.PFN_glRotatexOES, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glRotatexOES", e); }
    }

    public void ScalexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glScalexOES)) throw new SymbolNotFoundError("Symbol not found: glScalexOES");
        try { Handles.MH_glScalexOES.invokeExact(handles.PFN_glScalexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glScalexOES", e); }
    }

    public void TexEnvxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexEnvxOES)) throw new SymbolNotFoundError("Symbol not found: glTexEnvxOES");
        try { Handles.MH_glTexEnvxOES.invokeExact(handles.PFN_glTexEnvxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexEnvxOES", e); }
    }

    public void TexEnvxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexEnvxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexEnvxvOES");
        try { Handles.MH_glTexEnvxvOES.invokeExact(handles.PFN_glTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexEnvxvOES", e); }
    }

    public void TexParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glTexParameterxOES");
        try { Handles.MH_glTexParameterxOES.invokeExact(handles.PFN_glTexParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterxOES", e); }
    }

    public void TexParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexParameterxvOES");
        try { Handles.MH_glTexParameterxvOES.invokeExact(handles.PFN_glTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterxvOES", e); }
    }

    public void TranslatexOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTranslatexOES)) throw new SymbolNotFoundError("Symbol not found: glTranslatexOES");
        try { Handles.MH_glTranslatexOES.invokeExact(handles.PFN_glTranslatexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTranslatexOES", e); }
    }

    public void GetLightxvOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetLightxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetLightxvOES");
        try { Handles.MH_glGetLightxvOES.invokeExact(handles.PFN_glGetLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLightxvOES", e); }
    }

    public void GetMaterialxvOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMaterialxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetMaterialxvOES");
        try { Handles.MH_glGetMaterialxvOES.invokeExact(handles.PFN_glGetMaterialxvOES, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxvOES", e); }
    }

    public void PointParameterxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glPointParameterxOES");
        try { Handles.MH_glPointParameterxOES.invokeExact(handles.PFN_glPointParameterxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterxOES", e); }
    }

    public void SampleCoveragexOES(@CType("GLclampx") int value, @CType("GLboolean") boolean invert) {
        if (Unmarshal.isNullPointer(handles.PFN_glSampleCoveragexOES)) throw new SymbolNotFoundError("Symbol not found: glSampleCoveragexOES");
        try { Handles.MH_glSampleCoveragexOES.invokeExact(handles.PFN_glSampleCoveragexOES, value, invert); }
        catch (Throwable e) { throw new RuntimeException("error in glSampleCoveragexOES", e); }
    }

    public void AccumxOES(@CType("GLenum") int op, @CType("GLfixed") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glAccumxOES)) throw new SymbolNotFoundError("Symbol not found: glAccumxOES");
        try { Handles.MH_glAccumxOES.invokeExact(handles.PFN_glAccumxOES, op, value); }
        catch (Throwable e) { throw new RuntimeException("error in glAccumxOES", e); }
    }

    public void BitmapxOES(@CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLfixed") int xorig, @CType("GLfixed") int yorig, @CType("GLfixed") int xmove, @CType("GLfixed") int ymove, @CType("const GLubyte *") java.lang.foreign.MemorySegment bitmap) {
        if (Unmarshal.isNullPointer(handles.PFN_glBitmapxOES)) throw new SymbolNotFoundError("Symbol not found: glBitmapxOES");
        try { Handles.MH_glBitmapxOES.invokeExact(handles.PFN_glBitmapxOES, width, height, xorig, yorig, xmove, ymove, bitmap); }
        catch (Throwable e) { throw new RuntimeException("error in glBitmapxOES", e); }
    }

    public void BlendColorxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendColorxOES)) throw new SymbolNotFoundError("Symbol not found: glBlendColorxOES");
        try { Handles.MH_glBlendColorxOES.invokeExact(handles.PFN_glBlendColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendColorxOES", e); }
    }

    public void ClearAccumxOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue, @CType("GLfixed") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearAccumxOES)) throw new SymbolNotFoundError("Symbol not found: glClearAccumxOES");
        try { Handles.MH_glClearAccumxOES.invokeExact(handles.PFN_glClearAccumxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearAccumxOES", e); }
    }

    public void Color3xOES(@CType("GLfixed") int red, @CType("GLfixed") int green, @CType("GLfixed") int blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor3xOES)) throw new SymbolNotFoundError("Symbol not found: glColor3xOES");
        try { Handles.MH_glColor3xOES.invokeExact(handles.PFN_glColor3xOES, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3xOES", e); }
    }

    public void Color3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor3xvOES)) throw new SymbolNotFoundError("Symbol not found: glColor3xvOES");
        try { Handles.MH_glColor3xvOES.invokeExact(handles.PFN_glColor3xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3xvOES", e); }
    }

    public void Color4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment components) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4xvOES)) throw new SymbolNotFoundError("Symbol not found: glColor4xvOES");
        try { Handles.MH_glColor4xvOES.invokeExact(handles.PFN_glColor4xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4xvOES", e); }
    }

    public void ConvolutionParameterxOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterxOES)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxOES");
        try { Handles.MH_glConvolutionParameterxOES.invokeExact(handles.PFN_glConvolutionParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxOES", e); }
    }

    public void ConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterxvOES");
        try { Handles.MH_glConvolutionParameterxvOES.invokeExact(handles.PFN_glConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterxvOES", e); }
    }

    public void EvalCoord1xOES(@CType("GLfixed") int u) {
        if (Unmarshal.isNullPointer(handles.PFN_glEvalCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xOES");
        try { Handles.MH_glEvalCoord1xOES.invokeExact(handles.PFN_glEvalCoord1xOES, u); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xOES", e); }
    }

    public void EvalCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glEvalCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord1xvOES");
        try { Handles.MH_glEvalCoord1xvOES.invokeExact(handles.PFN_glEvalCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord1xvOES", e); }
    }

    public void EvalCoord2xOES(@CType("GLfixed") int u, @CType("GLfixed") int v) {
        if (Unmarshal.isNullPointer(handles.PFN_glEvalCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xOES");
        try { Handles.MH_glEvalCoord2xOES.invokeExact(handles.PFN_glEvalCoord2xOES, u, v); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xOES", e); }
    }

    public void EvalCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glEvalCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glEvalCoord2xvOES");
        try { Handles.MH_glEvalCoord2xvOES.invokeExact(handles.PFN_glEvalCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glEvalCoord2xvOES", e); }
    }

    public void FeedbackBufferxOES(@CType("GLsizei") int n, @CType("GLenum") int type, @CType("const GLfixed *") java.lang.foreign.MemorySegment buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFeedbackBufferxOES)) throw new SymbolNotFoundError("Symbol not found: glFeedbackBufferxOES");
        try { Handles.MH_glFeedbackBufferxOES.invokeExact(handles.PFN_glFeedbackBufferxOES, n, type, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glFeedbackBufferxOES", e); }
    }

    public void GetConvolutionParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterxvOES");
        try { Handles.MH_glGetConvolutionParameterxvOES.invokeExact(handles.PFN_glGetConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterxvOES", e); }
    }

    public void GetHistogramParameterxvOES(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterxvOES");
        try { Handles.MH_glGetHistogramParameterxvOES.invokeExact(handles.PFN_glGetHistogramParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterxvOES", e); }
    }

    public void GetLightxOES(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetLightxOES)) throw new SymbolNotFoundError("Symbol not found: glGetLightxOES");
        try { Handles.MH_glGetLightxOES.invokeExact(handles.PFN_glGetLightxOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetLightxOES", e); }
    }

    public void GetMapxvOES(@CType("GLenum") int target, @CType("GLenum") int query, @CType("GLfixed *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMapxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetMapxvOES");
        try { Handles.MH_glGetMapxvOES.invokeExact(handles.PFN_glGetMapxvOES, target, query, v); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMapxvOES", e); }
    }

    public void GetMaterialxOES(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMaterialxOES)) throw new SymbolNotFoundError("Symbol not found: glGetMaterialxOES");
        try { Handles.MH_glGetMaterialxOES.invokeExact(handles.PFN_glGetMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMaterialxOES", e); }
    }

    public void GetPixelMapxv(@CType("GLenum") int map, @CType("GLint") int size, @CType("GLfixed *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPixelMapxv)) throw new SymbolNotFoundError("Symbol not found: glGetPixelMapxv");
        try { Handles.MH_glGetPixelMapxv.invokeExact(handles.PFN_glGetPixelMapxv, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelMapxv", e); }
    }

    public void GetTexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexGenxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexGenxvOES");
        try { Handles.MH_glGetTexGenxvOES.invokeExact(handles.PFN_glGetTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexGenxvOES", e); }
    }

    public void GetTexLevelParameterxvOES(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexLevelParameterxvOES)) throw new SymbolNotFoundError("Symbol not found: glGetTexLevelParameterxvOES");
        try { Handles.MH_glGetTexLevelParameterxvOES.invokeExact(handles.PFN_glGetTexLevelParameterxvOES, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexLevelParameterxvOES", e); }
    }

    public void IndexxOES(@CType("GLfixed") int component) {
        if (Unmarshal.isNullPointer(handles.PFN_glIndexxOES)) throw new SymbolNotFoundError("Symbol not found: glIndexxOES");
        try { Handles.MH_glIndexxOES.invokeExact(handles.PFN_glIndexxOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexxOES", e); }
    }

    public void IndexxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment component) {
        if (Unmarshal.isNullPointer(handles.PFN_glIndexxvOES)) throw new SymbolNotFoundError("Symbol not found: glIndexxvOES");
        try { Handles.MH_glIndexxvOES.invokeExact(handles.PFN_glIndexxvOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexxvOES", e); }
    }

    public void LoadTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glLoadTransposeMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glLoadTransposeMatrixxOES");
        try { Handles.MH_glLoadTransposeMatrixxOES.invokeExact(handles.PFN_glLoadTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadTransposeMatrixxOES", e); }
    }

    public void Map1xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int stride, @CType("GLint") int order, @CType("GLfixed") int points) {
        if (Unmarshal.isNullPointer(handles.PFN_glMap1xOES)) throw new SymbolNotFoundError("Symbol not found: glMap1xOES");
        try { Handles.MH_glMap1xOES.invokeExact(handles.PFN_glMap1xOES, target, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in glMap1xOES", e); }
    }

    public void Map2xOES(@CType("GLenum") int target, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLint") int ustride, @CType("GLint") int uorder, @CType("GLfixed") int v1, @CType("GLfixed") int v2, @CType("GLint") int vstride, @CType("GLint") int vorder, @CType("GLfixed") int points) {
        if (Unmarshal.isNullPointer(handles.PFN_glMap2xOES)) throw new SymbolNotFoundError("Symbol not found: glMap2xOES");
        try { Handles.MH_glMap2xOES.invokeExact(handles.PFN_glMap2xOES, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in glMap2xOES", e); }
    }

    public void MapGrid1xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapGrid1xOES)) throw new SymbolNotFoundError("Symbol not found: glMapGrid1xOES");
        try { Handles.MH_glMapGrid1xOES.invokeExact(handles.PFN_glMapGrid1xOES, n, u1, u2); }
        catch (Throwable e) { throw new RuntimeException("error in glMapGrid1xOES", e); }
    }

    public void MapGrid2xOES(@CType("GLint") int n, @CType("GLfixed") int u1, @CType("GLfixed") int u2, @CType("GLfixed") int v1, @CType("GLfixed") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapGrid2xOES)) throw new SymbolNotFoundError("Symbol not found: glMapGrid2xOES");
        try { Handles.MH_glMapGrid2xOES.invokeExact(handles.PFN_glMapGrid2xOES, n, u1, u2, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glMapGrid2xOES", e); }
    }

    public void MultTransposeMatrixxOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultTransposeMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glMultTransposeMatrixxOES");
        try { Handles.MH_glMultTransposeMatrixxOES.invokeExact(handles.PFN_glMultTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMultTransposeMatrixxOES", e); }
    }

    public void MultiTexCoord1xOES(@CType("GLenum") int texture, @CType("GLfixed") int s) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xOES");
        try { Handles.MH_glMultiTexCoord1xOES.invokeExact(handles.PFN_glMultiTexCoord1xOES, texture, s); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xOES", e); }
    }

    public void MultiTexCoord1xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1xvOES");
        try { Handles.MH_glMultiTexCoord1xvOES.invokeExact(handles.PFN_glMultiTexCoord1xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1xvOES", e); }
    }

    public void MultiTexCoord2xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xOES");
        try { Handles.MH_glMultiTexCoord2xOES.invokeExact(handles.PFN_glMultiTexCoord2xOES, texture, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xOES", e); }
    }

    public void MultiTexCoord2xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2xvOES");
        try { Handles.MH_glMultiTexCoord2xvOES.invokeExact(handles.PFN_glMultiTexCoord2xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2xvOES", e); }
    }

    public void MultiTexCoord3xOES(@CType("GLenum") int texture, @CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3xOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xOES");
        try { Handles.MH_glMultiTexCoord3xOES.invokeExact(handles.PFN_glMultiTexCoord3xOES, texture, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xOES", e); }
    }

    public void MultiTexCoord3xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord3xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3xvOES");
        try { Handles.MH_glMultiTexCoord3xvOES.invokeExact(handles.PFN_glMultiTexCoord3xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3xvOES", e); }
    }

    public void MultiTexCoord4xvOES(@CType("GLenum") int texture, @CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoord4xvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4xvOES");
        try { Handles.MH_glMultiTexCoord4xvOES.invokeExact(handles.PFN_glMultiTexCoord4xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4xvOES", e); }
    }

    public void Normal3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormal3xvOES)) throw new SymbolNotFoundError("Symbol not found: glNormal3xvOES");
        try { Handles.MH_glNormal3xvOES.invokeExact(handles.PFN_glNormal3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3xvOES", e); }
    }

    public void PassThroughxOES(@CType("GLfixed") int token) {
        if (Unmarshal.isNullPointer(handles.PFN_glPassThroughxOES)) throw new SymbolNotFoundError("Symbol not found: glPassThroughxOES");
        try { Handles.MH_glPassThroughxOES.invokeExact(handles.PFN_glPassThroughxOES, token); }
        catch (Throwable e) { throw new RuntimeException("error in glPassThroughxOES", e); }
    }

    public void PixelMapx(@CType("GLenum") int map, @CType("GLint") int size, @CType("const GLfixed *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelMapx)) throw new SymbolNotFoundError("Symbol not found: glPixelMapx");
        try { Handles.MH_glPixelMapx.invokeExact(handles.PFN_glPixelMapx, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelMapx", e); }
    }

    public void PixelStorex(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelStorex)) throw new SymbolNotFoundError("Symbol not found: glPixelStorex");
        try { Handles.MH_glPixelStorex.invokeExact(handles.PFN_glPixelStorex, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelStorex", e); }
    }

    public void PixelTransferxOES(@CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTransferxOES)) throw new SymbolNotFoundError("Symbol not found: glPixelTransferxOES");
        try { Handles.MH_glPixelTransferxOES.invokeExact(handles.PFN_glPixelTransferxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransferxOES", e); }
    }

    public void PixelZoomxOES(@CType("GLfixed") int xfactor, @CType("GLfixed") int yfactor) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelZoomxOES)) throw new SymbolNotFoundError("Symbol not found: glPixelZoomxOES");
        try { Handles.MH_glPixelZoomxOES.invokeExact(handles.PFN_glPixelZoomxOES, xfactor, yfactor); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelZoomxOES", e); }
    }

    public void PrioritizeTexturesxOES(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment textures, @CType("const GLfixed *") java.lang.foreign.MemorySegment priorities) {
        if (Unmarshal.isNullPointer(handles.PFN_glPrioritizeTexturesxOES)) throw new SymbolNotFoundError("Symbol not found: glPrioritizeTexturesxOES");
        try { Handles.MH_glPrioritizeTexturesxOES.invokeExact(handles.PFN_glPrioritizeTexturesxOES, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in glPrioritizeTexturesxOES", e); }
    }

    public void RasterPos2xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos2xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos2xOES");
        try { Handles.MH_glRasterPos2xOES.invokeExact(handles.PFN_glRasterPos2xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xOES", e); }
    }

    public void RasterPos2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos2xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos2xvOES");
        try { Handles.MH_glRasterPos2xvOES.invokeExact(handles.PFN_glRasterPos2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos2xvOES", e); }
    }

    public void RasterPos3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos3xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos3xOES");
        try { Handles.MH_glRasterPos3xOES.invokeExact(handles.PFN_glRasterPos3xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xOES", e); }
    }

    public void RasterPos3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos3xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos3xvOES");
        try { Handles.MH_glRasterPos3xvOES.invokeExact(handles.PFN_glRasterPos3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos3xvOES", e); }
    }

    public void RasterPos4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z, @CType("GLfixed") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos4xOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos4xOES");
        try { Handles.MH_glRasterPos4xOES.invokeExact(handles.PFN_glRasterPos4xOES, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xOES", e); }
    }

    public void RasterPos4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glRasterPos4xvOES)) throw new SymbolNotFoundError("Symbol not found: glRasterPos4xvOES");
        try { Handles.MH_glRasterPos4xvOES.invokeExact(handles.PFN_glRasterPos4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glRasterPos4xvOES", e); }
    }

    public void RectxOES(@CType("GLfixed") int x1, @CType("GLfixed") int y1, @CType("GLfixed") int x2, @CType("GLfixed") int y2) {
        if (Unmarshal.isNullPointer(handles.PFN_glRectxOES)) throw new SymbolNotFoundError("Symbol not found: glRectxOES");
        try { Handles.MH_glRectxOES.invokeExact(handles.PFN_glRectxOES, x1, y1, x2, y2); }
        catch (Throwable e) { throw new RuntimeException("error in glRectxOES", e); }
    }

    public void RectxvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment v1, @CType("const GLfixed *") java.lang.foreign.MemorySegment v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glRectxvOES)) throw new SymbolNotFoundError("Symbol not found: glRectxvOES");
        try { Handles.MH_glRectxvOES.invokeExact(handles.PFN_glRectxvOES, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glRectxvOES", e); }
    }

    public void TexCoord1xOES(@CType("GLfixed") int s) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord1xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1xOES");
        try { Handles.MH_glTexCoord1xOES.invokeExact(handles.PFN_glTexCoord1xOES, s); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xOES", e); }
    }

    public void TexCoord1xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord1xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1xvOES");
        try { Handles.MH_glTexCoord1xvOES.invokeExact(handles.PFN_glTexCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1xvOES", e); }
    }

    public void TexCoord2xOES(@CType("GLfixed") int s, @CType("GLfixed") int t) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2xOES");
        try { Handles.MH_glTexCoord2xOES.invokeExact(handles.PFN_glTexCoord2xOES, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xOES", e); }
    }

    public void TexCoord2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2xvOES");
        try { Handles.MH_glTexCoord2xvOES.invokeExact(handles.PFN_glTexCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2xvOES", e); }
    }

    public void TexCoord3xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord3xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3xOES");
        try { Handles.MH_glTexCoord3xOES.invokeExact(handles.PFN_glTexCoord3xOES, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xOES", e); }
    }

    public void TexCoord3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord3xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3xvOES");
        try { Handles.MH_glTexCoord3xvOES.invokeExact(handles.PFN_glTexCoord3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3xvOES", e); }
    }

    public void TexCoord4xOES(@CType("GLfixed") int s, @CType("GLfixed") int t, @CType("GLfixed") int r, @CType("GLfixed") int q) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4xOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4xOES");
        try { Handles.MH_glTexCoord4xOES.invokeExact(handles.PFN_glTexCoord4xOES, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xOES", e); }
    }

    public void TexCoord4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4xvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4xvOES");
        try { Handles.MH_glTexCoord4xvOES.invokeExact(handles.PFN_glTexCoord4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4xvOES", e); }
    }

    public void TexGenxOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfixed") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexGenxOES)) throw new SymbolNotFoundError("Symbol not found: glTexGenxOES");
        try { Handles.MH_glTexGenxOES.invokeExact(handles.PFN_glTexGenxOES, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexGenxOES", e); }
    }

    public void TexGenxvOES(@CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLfixed *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexGenxvOES)) throw new SymbolNotFoundError("Symbol not found: glTexGenxvOES");
        try { Handles.MH_glTexGenxvOES.invokeExact(handles.PFN_glTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexGenxvOES", e); }
    }

    public void Vertex2xOES(@CType("GLfixed") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex2xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2xOES");
        try { Handles.MH_glVertex2xOES.invokeExact(handles.PFN_glVertex2xOES, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2xOES", e); }
    }

    public void Vertex2xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex2xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2xvOES");
        try { Handles.MH_glVertex2xvOES.invokeExact(handles.PFN_glVertex2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2xvOES", e); }
    }

    public void Vertex3xOES(@CType("GLfixed") int x, @CType("GLfixed") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex3xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3xOES");
        try { Handles.MH_glVertex3xOES.invokeExact(handles.PFN_glVertex3xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3xOES", e); }
    }

    public void Vertex3xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex3xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3xvOES");
        try { Handles.MH_glVertex3xvOES.invokeExact(handles.PFN_glVertex3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3xvOES", e); }
    }

    public void Vertex4xOES(@CType("GLfixed") int x, @CType("GLfixed") int y, @CType("GLfixed") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex4xOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4xOES");
        try { Handles.MH_glVertex4xOES.invokeExact(handles.PFN_glVertex4xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4xOES", e); }
    }

    public void Vertex4xvOES(@CType("const GLfixed *") java.lang.foreign.MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertex4xvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4xvOES");
        try { Handles.MH_glVertex4xvOES.invokeExact(handles.PFN_glVertex4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4xvOES", e); }
    }

}
