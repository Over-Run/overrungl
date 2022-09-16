/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.0 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL10 extends GL10C {
    @Nullable
    public static MethodHandle
        glAccum, glAlphaFunc, glBegin, glBitmap, glCallList, glCallLists, glClearAccum, glClearIndex, glClipPlane,
        glColor3b, glColor3bv, glColor3d, glColor3dv, glColor3f, glColor3fv, glColor3i, glColor3iv, glColor3s,
        glColor3sv, glColor3ub, glColor3ubv, glColor3ui, glColor3uiv, glColor3us, glColor3usv, glColor4b, glColor4bv,
        glColor4d, glColor4dv, glColor4f, glColor4fv, glColor4i, glColor4iv, glColor4s, glColor4sv, glColor4ub,
        glColor4ubv, glColor4ui, glColor4uiv, glColor4us, glColor4usv, glColorMaterial, glCopyPixels, glDeleteLists,
        glDrawPixels, glEdgeFlag, glEdgeFlagv, glEnd, glEndList, glEvalCoord1d, glEvalCoord1dv, glEvalCoord1f,
        glEvalCoord1fv, glEvalCoord2d, glEvalCoord2dv, glEvalCoord2f, glEvalCoord2fv, glEvalMesh1, glEvalMesh2,
        glEvalPoint1, glEvalPoint2, glFeedbackBuffer, glFogf, glFogfv, glFogi, glFogiv, glFrustum, glGenLists,
        glGetClipPlane, glGetLightfv, glGetLightiv, glGetMapdv, glGetMapfv, glGetMapiv, glGetMaterialfv,
        glGetMaterialiv, glGetPixelMapfv, glGetPixelMapuiv, glGetPixelMapusv, glGetPolygonStipple, glGetTexEnvfv,
        glGetTexEnviv, glGetTexGendv, glGetTexGenfv, glGetTexGeniv, glIndexMask, glIndexd, glIndexdv, glIndexf,
        glIndexfv, glIndexi, glIndexiv, glIndexs, glIndexsv, glInitNames, glIsList, glLightModelf, glLightModelfv,
        glLightModeli, glLightModeliv, glLightf, glLightfv, glLighti, glLightiv, glLineStipple, glListBase,
        glLoadIdentity, glLoadMatrixd, glLoadMatrixf, glLoadName, glMap1d, glMap1f, glMap2d, glMap2f, glMapGrid1d,
        glMapGrid1f, glMapGrid2d, glMapGrid2f, glMaterialf, glMaterialfv, glMateriali, glMaterialiv, glMatrixMode,
        glMultMatrixd, glMultMatrixf, glNewList, glNormal3b, glNormal3bv, glNormal3d, glNormal3dv, glNormal3f,
        glNormal3fv, glNormal3i, glNormal3iv, glNormal3s, glNormal3sv, glOrtho, glPassThrough, glPixelMapfv,
        glPixelMapuiv, glPixelMapusv, glPixelTransferf, glPixelTransferi, glPixelZoom, glPolygonStipple, glPopAttrib,
        glPopMatrix, glPopName, glPushAttrib, glPushMatrix, glPushName, glRasterPos2d, glRasterPos2dv, glRasterPos2f,
        glRasterPos2fv, glRasterPos2i, glRasterPos2iv, glRasterPos2s, glRasterPos2sv, glRasterPos3d, glRasterPos3dv,
        glRasterPos3f, glRasterPos3fv, glRasterPos3i, glRasterPos3iv, glRasterPos3s, glRasterPos3sv, glRasterPos4d,
        glRasterPos4dv, glRasterPos4f, glRasterPos4fv, glRasterPos4i, glRasterPos4iv, glRasterPos4s, glRasterPos4sv,
        glRectd, glRectdv, glRectf, glRectfv, glRecti, glRectiv, glRects, glRectsv, glRenderMode, glRotated, glRotatef,
        glScaled, glScalef, glSelectBuffer, glShadeModel, glTexCoord1d, glTexCoord1dv, glTexCoord1f, glTexCoord1fv,
        glTexCoord1i, glTexCoord1iv, glTexCoord1s, glTexCoord1sv, glTexCoord2d, glTexCoord2dv, glTexCoord2f,
        glTexCoord2fv, glTexCoord2i, glTexCoord2iv, glTexCoord2s, glTexCoord2sv, glTexCoord3d, glTexCoord3dv,
        glTexCoord3f, glTexCoord3fv, glTexCoord3i, glTexCoord3iv, glTexCoord3s, glTexCoord3sv, glTexCoord4d,
        glTexCoord4dv, glTexCoord4f, glTexCoord4fv, glTexCoord4i, glTexCoord4iv, glTexCoord4s, glTexCoord4sv,
        glTexEnvf, glTexEnvfv, glTexEnvi, glTexEnviv, glTexGend, glTexGendv, glTexGenf, glTexGenfv, glTexGeni,
        glTexGeniv, glTranslated, glTranslatef, glVertex2d, glVertex2dv, glVertex2f, glVertex2fv, glVertex2i,
        glVertex2iv, glVertex2s, glVertex2sv, glVertex3d, glVertex3dv, glVertex3f, glVertex3fv, glVertex3i, glVertex3iv,
        glVertex3s, glVertex3sv, glVertex4d, glVertex4dv, glVertex4f, glVertex4fv, glVertex4i, glVertex4iv, glVertex4s,
        glVertex4sv;

    static void load(GLLoadFunc load) {
        if (!Ver10) return;
        glAccum = downcallSafe(load.invoke("glAccum"), dIFV);
        glAlphaFunc = downcallSafe(load.invoke("glAlphaFunc"), dIFV);
        glBegin = downcallSafe(load.invoke("glBegin"), dIV);
        glBitmap = downcallSafe(load.invoke("glBitmap"), dIIFFFFPV);
        glCallList = downcallSafe(load.invoke("glCallList"), dIV);
        glCallLists = downcallSafe(load.invoke("glCallLists"), dIIPV);
        glClearAccum = downcallSafe(load.invoke("glClearAccum"), dFFFFV);
        glClearIndex = downcallSafe(load.invoke("glClearIndex"), dFV);
        glClipPlane = downcallSafe(load.invoke("glClipPlane"), dIPV);
        glColor3b = downcallSafe(load.invoke("glColor3b"), dBBBV);
        glColor3bv = downcallSafe(load.invoke("glColor3bv"), dPV);
        glColor3d = downcallSafe(load.invoke("glColor3d"), dDDDV);
        glColor3dv = downcallSafe(load.invoke("glColor3dv"), dPV);
        glColor3f = downcallSafe(load.invoke("glColor3f"), dFFFV);
        glColor3fv = downcallSafe(load.invoke("glColor3fv"), dPV);
        glColor3i = downcallSafe(load.invoke("glColor3i"), dIIIV);
        glColor3iv = downcallSafe(load.invoke("glColor3iv"), dPV);
        glColor3s = downcallSafe(load.invoke("glColor3s"), dSSSV);
        glColor3sv = downcallSafe(load.invoke("glColor3sv"), dPV);
        glColor3ub = downcallSafe(load.invoke("glColor3ub"), dBBBV);
        glColor3ubv = downcallSafe(load.invoke("glColor3ubv"), dPV);
        glColor3ui = downcallSafe(load.invoke("glColor3ui"), dIIIV);
        glColor3uiv = downcallSafe(load.invoke("glColor3uiv"), dPV);
        glColor3us = downcallSafe(load.invoke("glColor3us"), dSSSV);
        glColor3usv = downcallSafe(load.invoke("glColor3usv"), dPV);
        glColor4b = downcallSafe(load.invoke("glColor4b"), dBBBBV);
        glColor4bv = downcallSafe(load.invoke("glColor4bv"), dPV);
        glColor4d = downcallSafe(load.invoke("glColor4d"), dDDDDV);
        glColor4dv = downcallSafe(load.invoke("glColor4dv"), dPV);
        glColor4f = downcallSafe(load.invoke("glColor4f"), dFFFFV);
        glColor4fv = downcallSafe(load.invoke("glColor4fv"), dPV);
        glColor4i = downcallSafe(load.invoke("glColor4i"), dIIIIV);
        glColor4iv = downcallSafe(load.invoke("glColor4iv"), dPV);
        glColor4s = downcallSafe(load.invoke("glColor4s"), dSSSSV);
        glColor4sv = downcallSafe(load.invoke("glColor4sv"), dPV);
        glColor4ub = downcallSafe(load.invoke("glColor4ub"), dBBBBV);
        glColor4ubv = downcallSafe(load.invoke("glColor4ubv"), dPV);
        glColor4ui = downcallSafe(load.invoke("glColor4ui"), dIIIIV);
        glColor4uiv = downcallSafe(load.invoke("glColor4uiv"), dPV);
        glColor4us = downcallSafe(load.invoke("glColor4us"), dSSSSV);
        glColor4usv = downcallSafe(load.invoke("glColor4usv"), dPV);
        glColorMaterial = downcallSafe(load.invoke("glColorMaterial"), dIIV);
        glCopyPixels = downcallSafe(load.invoke("glCopyPixels"), dIIIIIV);
        glDeleteLists = downcallSafe(load.invoke("glDeleteLists"), dIIV);
        glDrawPixels = downcallSafe(load.invoke("glDrawPixels"), dIIIIPV);
        glEdgeFlag = downcallSafe(load.invoke("glEdgeFlag"), dZV);
        glEdgeFlagv = downcallSafe(load.invoke("glEdgeFlagv"), dPV);
        glEnd = downcallSafe(load.invoke("glEnd"), dV);
        glEndList = downcallSafe(load.invoke("glEndList"), dV);
        glEvalCoord1d = downcallSafe(load.invoke("glEvalCoord1d"), dDV);
        glEvalCoord1dv = downcallSafe(load.invoke("glEvalCoord1dv"), dPV);
        glEvalCoord1f = downcallSafe(load.invoke("glEvalCoord1f"), dFV);
        glEvalCoord1fv = downcallSafe(load.invoke("glEvalCoord1fv"), dPV);
        glEvalCoord2d = downcallSafe(load.invoke("glEvalCoord2d"), dDDV);
        glEvalCoord2dv = downcallSafe(load.invoke("glEvalCoord2dv"), dPV);
        glEvalCoord2f = downcallSafe(load.invoke("glEvalCoord2f"), dFFV);
        glEvalCoord2fv = downcallSafe(load.invoke("glEvalCoord2fv"), dPV);
        glEvalMesh1 = downcallSafe(load.invoke("glEvalMesh1"), dIIIV);
        glEvalMesh2 = downcallSafe(load.invoke("glEvalMesh2"), dIIIIIV);
        glEvalPoint1 = downcallSafe(load.invoke("glEvalPoint1"), dIV);
        glEvalPoint2 = downcallSafe(load.invoke("glEvalPoint2"), dIIV);
        glFeedbackBuffer = downcallSafe(load.invoke("glFeedbackBuffer"), dIIPV);
        glFogf = downcallSafe(load.invoke("glFogf"), dIFV);
        glFogfv = downcallSafe(load.invoke("glFogfv"), dIPV);
        glFogi = downcallSafe(load.invoke("glFogi"), dIIV);
        glFogiv = downcallSafe(load.invoke("glFogiv"), dIPV);
        glFrustum = downcallSafe(load.invoke("glFrustum"), dDDDDDDV);
        glGenLists = downcallSafe(load.invoke("glGenLists"), dII);
        glGetClipPlane = downcallSafe(load.invoke("glGetClipPlane"), dIPV);
        glGetLightfv = downcallSafe(load.invoke("glGetLightfv"), dIIPV);
        glGetLightiv = downcallSafe(load.invoke("glGetLightiv"), dIIPV);
        glGetMapdv = downcallSafe(load.invoke("glGetMapdv"), dIIPV);
        glGetMapfv = downcallSafe(load.invoke("glGetMapfv"), dIIPV);
        glGetMapiv = downcallSafe(load.invoke("glGetMapiv"), dIIPV);
        glGetMaterialfv = downcallSafe(load.invoke("glGetMaterialfv"), dIIPV);
        glGetMaterialiv = downcallSafe(load.invoke("glGetMaterialiv"), dIIPV);
        glGetPixelMapfv = downcallSafe(load.invoke("glGetPixelMapfv"), dIPV);
        glGetPixelMapuiv = downcallSafe(load.invoke("glGetPixelMapuiv"), dIPV);
        glGetPixelMapusv = downcallSafe(load.invoke("glGetPixelMapusv"), dIPV);
        glGetPolygonStipple = downcallSafe(load.invoke("glGetPolygonStipple"), dPV);
        glGetTexEnvfv = downcallSafe(load.invoke("glGetTexEnvfv"), dIIPV);
        glGetTexEnviv = downcallSafe(load.invoke("glGetTexEnviv"), dIIPV);
        glGetTexGendv = downcallSafe(load.invoke("glGetTexGendv"), dIIPV);
        glGetTexGenfv = downcallSafe(load.invoke("glGetTexGenfv"), dIIPV);
        glGetTexGeniv = downcallSafe(load.invoke("glGetTexGeniv"), dIIPV);
        glIndexMask = downcallSafe(load.invoke("glIndexMask"), dIV);
        glIndexd = downcallSafe(load.invoke("glIndexd"), dDV);
        glIndexdv = downcallSafe(load.invoke("glIndexdv"), dPV);
        glIndexf = downcallSafe(load.invoke("glIndexf"), dFV);
        glIndexfv = downcallSafe(load.invoke("glIndexfv"), dPV);
        glIndexi = downcallSafe(load.invoke("glIndexi"), dIV);
        glIndexiv = downcallSafe(load.invoke("glIndexiv"), dPV);
        glIndexs = downcallSafe(load.invoke("glIndexs"), dSV);
        glIndexsv = downcallSafe(load.invoke("glIndexsv"), dPV);
        glInitNames = downcallSafe(load.invoke("glInitNames"), dV);
        glIsList = downcallSafe(load.invoke("glIsList"), dIZ);
        glLightModelf = downcallSafe(load.invoke("glLightModelf"), dIFV);
        glLightModelfv = downcallSafe(load.invoke("glLightModelfv"), dIPV);
        glLightModeli = downcallSafe(load.invoke("glLightModeli"), dIIV);
        glLightModeliv = downcallSafe(load.invoke("glLightModeliv"), dIPV);
        glLightf = downcallSafe(load.invoke("glLightf"), dIIFV);
        glLightfv = downcallSafe(load.invoke("glLightfv"), dIIPV);
        glLighti = downcallSafe(load.invoke("glLighti"), dIIIV);
        glLightiv = downcallSafe(load.invoke("glLightiv"), dIIPV);
        glLineStipple = downcallSafe(load.invoke("glLineStipple"), dISV);
        glListBase = downcallSafe(load.invoke("glListBase"), dIV);
        glLoadIdentity = downcallSafe(load.invoke("glLoadIdentity"), dV);
        glLoadMatrixd = downcallSafe(load.invoke("glLoadMatrixd"), dPV);
        glLoadMatrixf = downcallSafe(load.invoke("glLoadMatrixf"), dPV);
        glLoadName = downcallSafe(load.invoke("glLoadName"), dIV);
        glMap1d = downcallSafe(load.invoke("glMap1d"), dIDDIIPV);
        glMap1f = downcallSafe(load.invoke("glMap1f"), dIFFIIPV);
        glMap2d = downcallSafe(load.invoke("glMap2d"), dIDDIIDDIIPV);
        glMap2f = downcallSafe(load.invoke("glMap2f"), dIFFIIFFIIPV);
        glMapGrid1d = downcallSafe(load.invoke("glMapGrid1d"), dIDDV);
        glMapGrid1f = downcallSafe(load.invoke("glMapGrid1f"), dIFFV);
        glMapGrid2d = downcallSafe(load.invoke("glMapGrid2d"), dIDDIDDV);
        glMapGrid2f = downcallSafe(load.invoke("glMapGrid2f"), dIFFIFFV);
        glMaterialf = downcallSafe(load.invoke("glMaterialf"), dIIFV);
        glMaterialfv = downcallSafe(load.invoke("glMaterialfv"), dIIPV);
        glMateriali = downcallSafe(load.invoke("glMateriali"), dIIIV);
        glMaterialiv = downcallSafe(load.invoke("glMaterialiv"), dIIPV);
        glMatrixMode = downcallSafe(load.invoke("glMatrixMode"), dIV);
        glMultMatrixd = downcallSafe(load.invoke("glMultMatrixd"), dPV);
        glMultMatrixf = downcallSafe(load.invoke("glMultMatrixf"), dPV);
        glNewList = downcallSafe(load.invoke("glNewList"), dIIV);
        glNormal3b = downcallSafe(load.invoke("glNormal3b"), dBBBV);
        glNormal3bv = downcallSafe(load.invoke("glNormal3bv"), dPV);
        glNormal3d = downcallSafe(load.invoke("glNormal3d"), dDDDV);
        glNormal3dv = downcallSafe(load.invoke("glNormal3dv"), dPV);
        glNormal3f = downcallSafe(load.invoke("glNormal3f"), dFFFV);
        glNormal3fv = downcallSafe(load.invoke("glNormal3fv"), dPV);
        glNormal3i = downcallSafe(load.invoke("glNormal3i"), dIIIV);
        glNormal3iv = downcallSafe(load.invoke("glNormal3iv"), dPV);
        glNormal3s = downcallSafe(load.invoke("glNormal3s"), dSSSV);
        glNormal3sv = downcallSafe(load.invoke("glNormal3sv"), dPV);
        glOrtho = downcallSafe(load.invoke("glOrtho"), dDDDDDDV);
        glPassThrough = downcallSafe(load.invoke("glPassThrough"), dFV);
        glPixelMapfv = downcallSafe(load.invoke("glPixelMapfv"), dIIPV);
        glPixelMapuiv = downcallSafe(load.invoke("glPixelMapuiv"), dIIPV);
        glPixelMapusv = downcallSafe(load.invoke("glPixelMapusv"), dIIPV);
        glPixelTransferf = downcallSafe(load.invoke("glPixelTransferf"), dIFV);
        glPixelTransferi = downcallSafe(load.invoke("glPixelTransferi"), dIIV);
        glPixelZoom = downcallSafe(load.invoke("glPixelZoom"), dFFV);
        glPolygonStipple = downcallSafe(load.invoke("glPolygonStipple"), dPV);
        glPopAttrib = downcallSafe(load.invoke("glPopAttrib"), dV);
        glPopMatrix = downcallSafe(load.invoke("glPopMatrix"), dV);
        glPopName = downcallSafe(load.invoke("glPopName"), dV);
        glPushAttrib = downcallSafe(load.invoke("glPushAttrib"), dIV);
        glPushMatrix = downcallSafe(load.invoke("glPushMatrix"), dV);
        glPushName = downcallSafe(load.invoke("glPushName"), dIV);
        glRasterPos2d = downcallSafe(load.invoke("glRasterPos2d"), dDDV);
        glRasterPos2dv = downcallSafe(load.invoke("glRasterPos2dv"), dPV);
        glRasterPos2f = downcallSafe(load.invoke("glRasterPos2f"), dFFV);
        glRasterPos2fv = downcallSafe(load.invoke("glRasterPos2fv"), dPV);
        glRasterPos2i = downcallSafe(load.invoke("glRasterPos2i"), dIIV);
        glRasterPos2iv = downcallSafe(load.invoke("glRasterPos2iv"), dPV);
        glRasterPos2s = downcallSafe(load.invoke("glRasterPos2s"), dSSV);
        glRasterPos2sv = downcallSafe(load.invoke("glRasterPos2sv"), dPV);
        glRasterPos3d = downcallSafe(load.invoke("glRasterPos3d"), dDDDV);
        glRasterPos3dv = downcallSafe(load.invoke("glRasterPos3dv"), dPV);
        glRasterPos3f = downcallSafe(load.invoke("glRasterPos3f"), dFFFV);
        glRasterPos3fv = downcallSafe(load.invoke("glRasterPos3fv"), dPV);
        glRasterPos3i = downcallSafe(load.invoke("glRasterPos3i"), dIIIV);
        glRasterPos3iv = downcallSafe(load.invoke("glRasterPos3iv"), dPV);
        glRasterPos3s = downcallSafe(load.invoke("glRasterPos3s"), dSSSV);
        glRasterPos3sv = downcallSafe(load.invoke("glRasterPos3sv"), dPV);
        glRasterPos4d = downcallSafe(load.invoke("glRasterPos4d"), dDDDDV);
        glRasterPos4dv = downcallSafe(load.invoke("glRasterPos4dv"), dPV);
        glRasterPos4f = downcallSafe(load.invoke("glRasterPos4f"), dFFFFV);
        glRasterPos4fv = downcallSafe(load.invoke("glRasterPos4fv"), dPV);
        glRasterPos4i = downcallSafe(load.invoke("glRasterPos4i"), dIIIIV);
        glRasterPos4iv = downcallSafe(load.invoke("glRasterPos4iv"), dPV);
        glRasterPos4s = downcallSafe(load.invoke("glRasterPos4s"), dSSSSV);
        glRasterPos4sv = downcallSafe(load.invoke("glRasterPos4sv"), dPV);
        glRectd = downcallSafe(load.invoke("glRectd"), dDDDDV);
        glRectdv = downcallSafe(load.invoke("glRectdv"), dPPV);
        glRectf = downcallSafe(load.invoke("glRectf"), dFFFFV);
        glRectfv = downcallSafe(load.invoke("glRectfv"), dPPV);
        glRecti = downcallSafe(load.invoke("glRecti"), dIIIIV);
        glRectiv = downcallSafe(load.invoke("glRectiv"), dPPV);
        glRects = downcallSafe(load.invoke("glRects"), dSSSSV);
        glRectsv = downcallSafe(load.invoke("glRectsv"), dPPV);
        glRenderMode = downcallSafe(load.invoke("glRenderMode"), dII);
        glRotated = downcallSafe(load.invoke("glRotated"), dDDDDV);
        glRotatef = downcallSafe(load.invoke("glRotatef"), dFFFFV);
        glScaled = downcallSafe(load.invoke("glScaled"), dDDDV);
        glScalef = downcallSafe(load.invoke("glScalef"), dFFFV);
        glSelectBuffer = downcallSafe(load.invoke("glSelectBuffer"), dIPV);
        glShadeModel = downcallSafe(load.invoke("glShadeModel"), dIV);
        glTexCoord1d = downcallSafe(load.invoke("glTexCoord1d"), dDV);
        glTexCoord1dv = downcallSafe(load.invoke("glTexCoord1dv"), dPV);
        glTexCoord1f = downcallSafe(load.invoke("glTexCoord1f"), dFV);
        glTexCoord1fv = downcallSafe(load.invoke("glTexCoord1fv"), dPV);
        glTexCoord1i = downcallSafe(load.invoke("glTexCoord1i"), dIV);
        glTexCoord1iv = downcallSafe(load.invoke("glTexCoord1iv"), dPV);
        glTexCoord1s = downcallSafe(load.invoke("glTexCoord1s"), dSV);
        glTexCoord1sv = downcallSafe(load.invoke("glTexCoord1sv"), dPV);
        glTexCoord2d = downcallSafe(load.invoke("glTexCoord2d"), dDDV);
        glTexCoord2dv = downcallSafe(load.invoke("glTexCoord2dv"), dPV);
        glTexCoord2f = downcallSafe(load.invoke("glTexCoord2f"), dFFV);
        glTexCoord2fv = downcallSafe(load.invoke("glTexCoord2fv"), dPV);
        glTexCoord2i = downcallSafe(load.invoke("glTexCoord2i"), dIIV);
        glTexCoord2iv = downcallSafe(load.invoke("glTexCoord2iv"), dPV);
        glTexCoord2s = downcallSafe(load.invoke("glTexCoord2s"), dSSV);
        glTexCoord2sv = downcallSafe(load.invoke("glTexCoord2sv"), dPV);
        glTexCoord3d = downcallSafe(load.invoke("glTexCoord3d"), dDDDV);
        glTexCoord3dv = downcallSafe(load.invoke("glTexCoord3dv"), dPV);
        glTexCoord3f = downcallSafe(load.invoke("glTexCoord3f"), dFFFV);
        glTexCoord3fv = downcallSafe(load.invoke("glTexCoord3fv"), dPV);
        glTexCoord3i = downcallSafe(load.invoke("glTexCoord3i"), dIIIV);
        glTexCoord3iv = downcallSafe(load.invoke("glTexCoord3iv"), dPV);
        glTexCoord3s = downcallSafe(load.invoke("glTexCoord3s"), dSSSV);
        glTexCoord3sv = downcallSafe(load.invoke("glTexCoord3sv"), dPV);
        glTexCoord4d = downcallSafe(load.invoke("glTexCoord4d"), dDDDDV);
        glTexCoord4dv = downcallSafe(load.invoke("glTexCoord4dv"), dPV);
        glTexCoord4f = downcallSafe(load.invoke("glTexCoord4f"), dFFFFV);
        glTexCoord4fv = downcallSafe(load.invoke("glTexCoord4fv"), dPV);
        glTexCoord4i = downcallSafe(load.invoke("glTexCoord4i"), dIIIIV);
        glTexCoord4iv = downcallSafe(load.invoke("glTexCoord4iv"), dPV);
        glTexCoord4s = downcallSafe(load.invoke("glTexCoord4s"), dSSSSV);
        glTexCoord4sv = downcallSafe(load.invoke("glTexCoord4sv"), dPV);
        glTexEnvf = downcallSafe(load.invoke("glTexEnvf"), dIIFV);
        glTexEnvfv = downcallSafe(load.invoke("glTexEnvfv"), dIIPV);
        glTexEnvi = downcallSafe(load.invoke("glTexEnvi"), dIIIV);
        glTexEnviv = downcallSafe(load.invoke("glTexEnviv"), dIIPV);
        glTexGend = downcallSafe(load.invoke("glTexGend"), dIIDV);
        glTexGendv = downcallSafe(load.invoke("glTexGendv"), dIIPV);
        glTexGenf = downcallSafe(load.invoke("glTexGenf"), dIIFV);
        glTexGenfv = downcallSafe(load.invoke("glTexGenfv"), dIIPV);
        glTexGeni = downcallSafe(load.invoke("glTexGeni"), dIIIV);
        glTexGeniv = downcallSafe(load.invoke("glTexGeniv"), dIIPV);
        glTranslated = downcallSafe(load.invoke("glTranslated"), dDDDV);
        glTranslatef = downcallSafe(load.invoke("glTranslatef"), dFFFV);
        glVertex2d = downcallSafe(load.invoke("glVertex2d"), dDDV);
        glVertex2dv = downcallSafe(load.invoke("glVertex2dv"), dPV);
        glVertex2f = downcallSafe(load.invoke("glVertex2f"), dFFV);
        glVertex2fv = downcallSafe(load.invoke("glVertex2fv"), dPV);
        glVertex2i = downcallSafe(load.invoke("glVertex2i"), dIIV);
        glVertex2iv = downcallSafe(load.invoke("glVertex2iv"), dPV);
        glVertex2s = downcallSafe(load.invoke("glVertex2s"), dSSV);
        glVertex2sv = downcallSafe(load.invoke("glVertex2sv"), dPV);
        glVertex3d = downcallSafe(load.invoke("glVertex3d"), dDDDV);
        glVertex3dv = downcallSafe(load.invoke("glVertex3dv"), dPV);
        glVertex3f = downcallSafe(load.invoke("glVertex3f"), dFFFV);
        glVertex3fv = downcallSafe(load.invoke("glVertex3fv"), dPV);
        glVertex3i = downcallSafe(load.invoke("glVertex3i"), dIIIV);
        glVertex3iv = downcallSafe(load.invoke("glVertex3iv"), dPV);
        glVertex3s = downcallSafe(load.invoke("glVertex3s"), dSSSV);
        glVertex3sv = downcallSafe(load.invoke("glVertex3sv"), dPV);
        glVertex4d = downcallSafe(load.invoke("glVertex4d"), dDDDDV);
        glVertex4dv = downcallSafe(load.invoke("glVertex4dv"), dPV);
        glVertex4f = downcallSafe(load.invoke("glVertex4f"), dFFFFV);
        glVertex4fv = downcallSafe(load.invoke("glVertex4fv"), dPV);
        glVertex4i = downcallSafe(load.invoke("glVertex4i"), dIIIIV);
        glVertex4iv = downcallSafe(load.invoke("glVertex4iv"), dPV);
        glVertex4s = downcallSafe(load.invoke("glVertex4s"), dSSSSV);
        glVertex4sv = downcallSafe(load.invoke("glVertex4sv"), dPV);
    }

    public static void accum(int op, float value) {
        try {
            check(glAccum).invoke(op, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void alphaFunc(int func, float ref) {
        try {
            check(glAlphaFunc).invoke(func, ref);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void begin(int mode) {
        try {
            check(glBegin).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Addressable bitmap) {
        try {
            check(glBitmap).invoke(width, height, xorig, yorig, xmove, ymove, bitmap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void callList(int list) {
        try {
            check(glCallList).invoke(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void callLists(int n, int type, Addressable lists) {
        try {
            check(glCallLists).invoke(n, type, lists);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearAccum(float red, float green, float blue, float alpha) {
        try {
            check(glClearAccum).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearIndex(float c) {
        try {
            check(glClearIndex).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clipPlane(int plane, Addressable equation) {
        try {
            check(glClipPlane).invoke(plane, equation);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clipPlane(int plane, double[] equation) {
        try (var session = MemorySession.openShared()) {
            var pEq = session.allocateArray(JAVA_DOUBLE, equation);
            clipPlane(plane, pEq);
        }
    }


    public static void color3b(byte red, byte green, byte blue) {
        try {
            check(glColor3b).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3bv(Addressable v) {
        try {
            check(glColor3bv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3bv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color3bv(pv);
        }
    }

    public static void color3d(double red, double green, double blue) {
        try {
            check(glColor3d).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3dv(Addressable v) {
        try {
            check(glColor3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v);
            color3dv(pv);
        }
    }

    public static void color3f(float red, float green, float blue) {
        try {
            check(glColor3f).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3fv(Addressable v) {
        try {
            check(glColor3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v);
            color3fv(pv);
        }
    }

    public static void color3i(int red, int green, int blue) {
        try {
            check(glColor3i).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3iv(Addressable v) {
        try {
            check(glColor3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color3iv(pv);
        }
    }

    public static void color3s(short red, short green, short blue) {
        try {
            check(glColor3s).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3sv(Addressable v) {
        try {
            check(glColor3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color3sv(pv);
        }
    }

    public static void color3ub(byte red, byte green, byte blue) {
        try {
            check(glColor3ub).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3ubv(Addressable v) {
        try {
            check(glColor3ubv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3ubv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color3ubv(pv);
        }
    }

    public static void color3ui(int red, int green, int blue) {
        try {
            check(glColor3ui).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3uiv(Addressable v) {
        try {
            check(glColor3uiv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3uiv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color3uiv(pv);
        }
    }

    public static void color3us(short red, short green, short blue) {
        try {
            check(glColor3us).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3usv(Addressable v) {
        try {
            check(glColor3usv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color3usv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color3usv(pv);
        }
    }

    public static void color4b(byte red, byte green, byte blue, byte alpha) {
        try {
            check(glColor4b).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4bv(Addressable v) {
        try {
            check(glColor4bv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4bv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color4bv(pv);
        }
    }

    public static void color4d(double red, double green, double blue, double alpha) {
        try {
            check(glColor4d).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4dv(Addressable v) {
        try {
            check(glColor4dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v);
            color4dv(pv);
        }
    }

    public static void color4f(float red, float green, float blue, float alpha) {
        try {
            check(glColor4f).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4fv(Addressable v) {
        try {
            check(glColor4fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v);
            color4fv(pv);
        }
    }

    public static void color4i(int red, int green, int blue, int alpha) {
        try {
            check(glColor4i).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4iv(Addressable v) {
        try {
            check(glColor4iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color4iv(pv);
        }
    }

    public static void color4s(short red, short green, short blue, short alpha) {
        try {
            check(glColor4s).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4sv(Addressable v) {
        try {
            check(glColor4sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color4sv(pv);
        }
    }

    public static void color4ub(byte red, byte green, byte blue, byte alpha) {
        try {
            check(glColor4ub).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4ubv(Addressable v) {
        try {
            check(glColor4ubv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4ubv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color4ubv(pv);
        }
    }

    public static void color4ui(int red, int green, int blue, int alpha) {
        try {
            check(glColor4ui).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4uiv(Addressable v) {
        try {
            check(glColor4uiv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4uiv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color4uiv(pv);
        }
    }

    public static void color4us(short red, short green, short blue, short alpha) {
        try {
            check(glColor4us).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4usv(Addressable v) {
        try {
            check(glColor4usv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void color4usv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color4usv(pv);
        }
    }

    public static void colorMaterial(int face, int mode) {
        try {
            check(glColorMaterial).invoke(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void copyPixels(int x, int y, int width, int height, int type) {
        try {
            check(glCopyPixels).invoke(x, y, width, height, type);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void deleteLists(int list, int range) {
        try {
            check(glDeleteLists).invoke(list, range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawPixels(int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glDrawPixels).invoke(width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void edgeFlag(boolean flag) {
        try {
            check(glEdgeFlag).invoke(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void edgeFlagv(Addressable flag) {
        try {
            check(glEdgeFlagv).invoke(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void edgeFlagv(boolean[] flag) {
        try (var session = MemorySession.openShared()) {
            var pFlag = session.allocateArray(JAVA_BOOLEAN, flag.length);
            for (int i = 0; i < flag.length; i++) {
                pFlag.set(JAVA_BOOLEAN, i, flag[i]);
            }
            edgeFlagv(pFlag);
        }
    }

    public static void end() {
        try {
            check(glEnd).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void endList() {
        try {
            check(glEndList).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord1d(double u) {
        try {
            check(glEvalCoord1d).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord1dv(Addressable u) {
        try {
            check(glEvalCoord1dv).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord1dv(double[] u) {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_DOUBLE, u);
            evalCoord1dv(pu);
        }
    }

    public static void evalCoord1f(float u) {
        try {
            check(glEvalCoord1f).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord1fv(Addressable u) {
        try {
            check(glEvalCoord1fv).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord1fv(float[] u) {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_FLOAT, u);
            evalCoord1fv(pu);
        }
    }

    public static void evalCoord2d(double u, double v) {
        try {
            check(glEvalCoord2d).invoke(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord2dv(Addressable u) {
        try {
            check(glEvalCoord2dv).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord2dv(double[] u) {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_DOUBLE, u);
            evalCoord2dv(pu);
        }
    }

    public static void evalCoord2f(float u, float v) {
        try {
            check(glEvalCoord2f).invoke(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord2fv(Addressable u) {
        try {
            check(glEvalCoord2fv).invoke(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalCoord2fv(float[] u) {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_FLOAT, u);
            evalCoord2fv(pu);
        }
    }

    public static void evalMesh1(int mode, int i1, int i2) {
        try {
            check(glEvalMesh1).invoke(mode, i1, i2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalMesh2(int mode, int i1, int i2, int j1, int j2) {
        try {
            check(glEvalMesh2).invoke(mode, i1, i2, j1, j2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalPoint1(int mode, int i) {
        try {
            check(glEvalPoint1).invoke(mode, i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void evalPoint2(int mode, int i, int j) {
        try {
            check(glEvalPoint2).invoke(mode, i, j);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void feedbackBuffer(int size, int type, Addressable buffer) {
        try {
            check(glFeedbackBuffer).invoke(size, type, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void feedbackBuffer(int type, float[] buffer) {
        try (var session = MemorySession.openShared()) {
            var pBuffer = session.allocateArray(JAVA_FLOAT, buffer.length);
            feedbackBuffer(buffer.length, type, pBuffer);
            RuntimeHelper.toArray(pBuffer, buffer);
        }
    }

    public static void fogf(int pname, float param) {
        try {
            check(glFogf).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogfv(int pname, Addressable params) {
        try {
            check(glFogfv).invoke(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogfv(int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParam = session.allocateArray(JAVA_FLOAT, params);
            fogfv(pname, pParam);
        }
    }

    public static void fogi(int pname, int param) {
        try {
            check(glFogi).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogiv(int pname, Addressable params) {
        try {
            check(glFogiv).invoke(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogiv(int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParam = session.allocateArray(JAVA_INT, params);
            fogiv(pname, pParam);
        }
    }

    public static void frustum(double left, double right, double bottom, double top, double zNear, double zFar) {
        try {
            check(glFrustum).invoke(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int genLists(int range) {
        try {
            return (int) check(glGenLists).invoke(range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getClipPlane(int plane, Addressable equation) {
        try {
            check(glGetClipPlane).invoke(plane, equation);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static double[] getClipPlane(int plane) {
        try (var session = MemorySession.openShared()) {
            var pEq = session.allocateArray(JAVA_DOUBLE, 4);
            getClipPlane(plane, pEq);
            return new double[]{
                pEq.get(JAVA_DOUBLE, 0),
                pEq.getAtIndex(JAVA_DOUBLE, 1),
                pEq.getAtIndex(JAVA_DOUBLE, 2),
                pEq.getAtIndex(JAVA_DOUBLE, 3)
            };
        }
    }

    public static void getLightfv(int light, int pname, Addressable params) {
        try {
            check(glGetLightfv).invoke(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getLightfv(int light, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getLightfv(light, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getLightf(int light, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getLightfv(light, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getLightiv(int light, int pname, Addressable params) {
        try {
            check(glGetLightiv).invoke(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getLightiv(int light, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getLightiv(light, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getLighti(int light, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getLightiv(light, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getMapdv(int target, int query, Addressable v) {
        try {
            check(glGetMapdv).invoke(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMapdv(int target, int query, double[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v.length);
            getMapdv(target, query, pv);
            RuntimeHelper.toArray(pv, v);
        }
    }

    public static double getMapdv(int target, int query) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_DOUBLE);
            getMapdv(target, query, pv);
            return pv.get(JAVA_DOUBLE, 0);
        }
    }

    public static void getMapfv(int target, int query, Addressable v) {
        try {
            check(glGetMapfv).invoke(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMapfv(int target, int query, float[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v.length);
            getMapfv(target, query, pv);
            RuntimeHelper.toArray(pv, v);
        }
    }

    public static float getMapfv(int target, int query) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_FLOAT);
            getMapfv(target, query, pv);
            return pv.get(JAVA_FLOAT, 0);
        }
    }

    public static void getMapiv(int target, int query, Addressable v) {
        try {
            check(glGetMapiv).invoke(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMapiv(int target, int query, int[] v) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v.length);
            getMapiv(target, query, pv);
            RuntimeHelper.toArray(pv, v);
        }
    }

    public static int getMapiv(int target, int query) {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_INT);
            getMapiv(target, query, pv);
            return pv.get(JAVA_INT, 0);
        }
    }

    public static void getMaterialfv(int face, int pname, Addressable params) {
        try {
            check(glGetMaterialfv).invoke(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMaterialfv(int face, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getMaterialfv(face, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getMaterialf(int face, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getMaterialfv(face, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getMaterialiv(int face, int pname, Addressable params) {
        try {
            check(glGetMaterialiv).invoke(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMaterialiv(int face, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getMaterialiv(face, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getMateriali(int face, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getMaterialiv(face, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getPixelMapfv(int map, Addressable values) {
        try {
            check(glGetPixelMapfv).invoke(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getPixelMapfv(int map, float[] values) {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_FLOAT, values.length);
            getPixelMapfv(map, pValues);
            RuntimeHelper.toArray(pValues, values);
        }
    }

    public static void getPixelMapuiv(int map, Addressable values) {
        try {
            check(glGetPixelMapuiv).invoke(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getPixelMapuiv(int map, int[] values) {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_INT, values.length);
            getPixelMapuiv(map, pValues);
            RuntimeHelper.toArray(pValues, values);
        }
    }

    public static void getPixelMapusv(int map, Addressable values) {
        try {
            check(glGetPixelMapusv).invoke(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getPixelMapusv(int map, short[] values) {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_SHORT, values.length);
            getPixelMapusv(map, pValues);
            RuntimeHelper.toArray(pValues, values);
        }
    }

    public static void getPolygonStipple(Addressable mask) {
        try {
            check(glGetPolygonStipple).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getPolygonStipple(byte[] mask) {
        try (var session = MemorySession.openShared()) {
            var pMask = session.allocateArray(JAVA_BYTE, mask.length);
            getPolygonStipple(pMask);
            RuntimeHelper.toArray(pMask, mask);
        }
    }

    public static void getTexEnvfv(int target, int pname, Addressable params) {
        try {
            check(glGetTexEnvfv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexEnvfv(int target, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexEnvfv(target, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getTexEnvf(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTexEnvfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getTexEnviv(int target, int pname, Addressable params) {
        try {
            check(glGetTexEnviv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexEnviv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexEnviv(target, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getTexEnvi(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTexEnviv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getTexGendv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGendv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexGendv(int coord, int pname, double[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_DOUBLE, params.length);
            getTexGendv(coord, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static void getTexGenfv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGenfv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexGenfv(int coord, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexGenfv(coord, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static void getTexGeniv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGeniv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexGeniv(int coord, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexGeniv(coord, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static void indexMask(int mask) {
        try {
            check(glIndexMask).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexd(double c) {
        try {
            check(glIndexd).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexdv(Addressable c) {
        try {
            check(glIndexdv).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexdv(double[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_DOUBLE, c);
            indexdv(pc);
        }
    }

    public static void indexf(float c) {
        try {
            check(glIndexf).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexfv(Addressable c) {
        try {
            check(glIndexfv).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexfv(float[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_FLOAT, c);
            indexfv(pc);
        }
    }

    public static void indexi(int c) {
        try {
            check(glIndexi).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexiv(Addressable c) {
        try {
            check(glIndexiv).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexiv(int[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_INT, c);
            indexiv(pc);
        }
    }

    public static void indexs(short c) {
        try {
            check(glIndexs).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexsv(Addressable c) {
        try {
            check(glIndexsv).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexsv(short[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_SHORT, c);
            indexsv(pc);
        }
    }

    public static void initNames() {
        try {
            check(glInitNames).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean isList(int list) {
        try {
            return (boolean) check(glIsList).invoke(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightModelf(int pname, float param) {
        try {
            check(glLightModelf).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightModelfv(int pname, Addressable params) {
        try {
            check(glLightModelfv).invoke(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightModelfv(int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params);
            lightModelfv(pname, pParams);
        }
    }

    public static void lightModeli(int pname, int param) {
        try {
            check(glLightModeli).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightModeliv(int pname, Addressable params) {
        try {
            check(glLightModeliv).invoke(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightModeliv(int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params);
            lightModeliv(pname, pParams);
        }
    }

    public static void lightf(int light, int pname, float param) {
        try {
            check(glLightf).invoke(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightfv(int light, int pname, Addressable params) {
        try {
            check(glLightfv).invoke(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightfv(int light, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params);
            lightfv(light, pname, pParams);
        }
    }

    public static void lighti(int light, int pname, int param) {
        try {
            check(glLighti).invoke(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightiv(int light, int pname, Addressable params) {
        try {
            check(glLightiv).invoke(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lightiv(int light, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params);
            lightiv(light, pname, pParams);
        }
    }

    public static void lineStipple(int factor, short pattern) {
        try {
            check(glLineStipple).invoke(factor, pattern);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void listBase(int base) {
        try {
            check(glListBase).invoke(base);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadIdentity() {
        try {
            check(glLoadIdentity).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadMatrixd(Addressable m) {
        try {
            check(glLoadMatrixd).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadMatrixd(double[] m) {
        try (var session = MemorySession.openShared()) {
            var pm = session.allocateArray(JAVA_DOUBLE, m);
            loadMatrixd(pm);
        }
    }

    public static void loadMatrixf(Addressable m) {
        try {
            check(glLoadMatrixf).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadMatrixf(float[] m) {
        try (var session = MemorySession.openShared()) {
            var pm = session.allocateArray(JAVA_FLOAT, m);
            loadMatrixf(pm);
        }
    }

    public static void loadName(int name) {
        try {
            check(glLoadName).invoke(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void map1d(int target, double u1, double u2, int stride, int order, Addressable points) {
        try {
            check(glMap1d).invoke(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void map1d(int target, double u1, double u2, int stride, int order, double[] points) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(JAVA_DOUBLE, points);
            map1d(target, u1, u2, stride, order, pp);
        }
    }

    public static void map1f(int target, float u1, float u2, int stride, int order, Addressable points) {
        try {
            check(glMap1f).invoke(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void map1f(int target, float u1, float u2, int stride, int order, float[] points) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(JAVA_FLOAT, points);
            map1f(target, u1, u2, stride, order, pp);
        }
    }

    public static void map2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, Addressable points) {
        try {
            check(glMap2d).invoke(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void map2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(JAVA_DOUBLE, points);
            map2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, pp);
        }
    }

    public static void map2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, Addressable points) {
        try {
            check(glMap2f).invoke(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void map2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(JAVA_FLOAT, points);
            map2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, pp);
        }
    }

    public static void mapGrid1d(int un, double u1, double u2) {
        try {
            check(glMapGrid1d).invoke(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void mapGrid1f(int un, float u1, float u2) {
        try {
            check(glMapGrid1f).invoke(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void mapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        try {
            check(glMapGrid2d).invoke(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void mapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        try {
            check(glMapGrid2f).invoke(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void materialf(int face, int pname, float param) {
        try {
            check(glMaterialf).invoke(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void materialfv(int face, int pname, Addressable params) {
        try {
            check(glMaterialfv).invoke(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void materialfv(int face, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params);
            materialfv(face, pname, seg);
        }
    }

    public static void materiali(int face, int pname, int param) {
        try {
            check(glMateriali).invoke(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void materialiv(int face, int pname, Addressable params) {
        try {
            check(glMaterialiv).invoke(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void materialiv(int face, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params);
            materialiv(face, pname, seg);
        }
    }

    public static void matrixMode(int mode) {
        try {
            check(glMatrixMode).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multMatrixd(Addressable m) {
        try {
            check(glMultMatrixd).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multMatrixd(double[] m) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, m);
            multMatrixd(seg);
        }
    }

    public static void multMatrixf(Addressable m) {
        try {
            check(glMultMatrixf).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multMatrixf(float[] m) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, m);
            multMatrixf(seg);
        }
    }

    public static void newList(int list, int mode) {
        try {
            check(glNewList).invoke(list, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3b(byte nx, byte ny, byte nz) {
        try {
            check(glNormal3b).invoke(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3bv(Addressable v) {
        try {
            check(glNormal3bv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3bv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, v);
            normal3bv(seg);
        }
    }

    public static void normal3d(double nx, double ny, double nz) {
        try {
            check(glNormal3d).invoke(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3dv(Addressable v) {
        try {
            check(glNormal3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            normal3dv(seg);
        }
    }

    public static void normal3f(float nx, float ny, float nz) {
        try {
            check(glNormal3f).invoke(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3fv(Addressable v) {
        try {
            check(glNormal3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            normal3fv(seg);
        }
    }

    public static void normal3i(int nx, int ny, int nz) {
        try {
            check(glNormal3i).invoke(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3iv(Addressable v) {
        try {
            check(glNormal3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            normal3iv(seg);
        }
    }

    public static void normal3s(short nx, short ny, short nz) {
        try {
            check(glNormal3s).invoke(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3sv(Addressable v) {
        try {
            check(glNormal3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normal3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            normal3sv(seg);
        }
    }

    public static void ortho(double left, double right, double bottom, double top, double zNear, double zFar) {
        try {
            check(glOrtho).invoke(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void passThrough(float token) {
        try {
            check(glPassThrough).invoke(token);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelMapfv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapfv).invoke(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelMapfv(int map, int mapSize, float[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, mapSize);
            for (int i = 0; i < mapSize; i++) {
                seg.setAtIndex(JAVA_FLOAT, i, values[i]);
            }
            pixelMapfv(map, mapSize, seg);
        }
    }

    public static void pixelMapfv(int map, float[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, values);
            pixelMapfv(map, values.length, seg);
        }
    }

    public static void pixelMapuiv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapuiv).invoke(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelMapuiv(int map, int mapSize, int[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, mapSize);
            for (int i = 0; i < mapSize; i++) {
                seg.setAtIndex(JAVA_INT, i, values[i]);
            }
            pixelMapuiv(map, mapSize, seg);
        }
    }

    public static void pixelMapuiv(int map, int[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, values);
            pixelMapuiv(map, values.length, seg);
        }
    }

    public static void pixelMapusv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapusv).invoke(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelMapusv(int map, int mapSize, short[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, mapSize);
            for (int i = 0; i < mapSize; i++) {
                seg.setAtIndex(JAVA_SHORT, i, values[i]);
            }
            pixelMapusv(map, mapSize, seg);
        }
    }

    public static void pixelMapusv(int map, short[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, values);
            pixelMapusv(map, values.length, seg);
        }
    }

    public static void pixelTransferf(int pname, float param) {
        try {
            check(glPixelTransferf).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelTransferi(int pname, int param) {
        try {
            check(glPixelTransferi).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelZoom(float xfactor, float yfactor) {
        try {
            check(glPixelZoom).invoke(xfactor, yfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void polygonStipple(Addressable mask) {
        try {
            check(glPolygonStipple).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void polygonStipple(byte[] mask) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, mask);
            polygonStipple(seg);
        }
    }

    public static void popAttrib() {
        try {
            check(glPopAttrib).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void popMatrix() {
        try {
            check(glPopMatrix).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void popName() {
        try {
            check(glPopName).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pushAttrib(int mask) {
        try {
            check(glPushAttrib).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pushMatrix() {
        try {
            check(glPushMatrix).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pushName(int name) {
        try {
            check(glPushName).invoke(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2d(double x, double y) {
        try {
            check(glRasterPos2d).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2dv(Addressable v) {
        try {
            check(glRasterPos2dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            rasterPos2dv(seg);
        }
    }

    public static void rasterPos2f(float x, float y) {
        try {
            check(glRasterPos2f).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2fv(Addressable v) {
        try {
            check(glRasterPos2fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            rasterPos2fv(seg);
        }
    }

    public static void rasterPos2i(int x, int y) {
        try {
            check(glRasterPos2i).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2iv(Addressable v) {
        try {
            check(glRasterPos2iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            rasterPos2iv(seg);
        }
    }

    public static void rasterPos2s(short x, short y) {
        try {
            check(glRasterPos2s).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2sv(Addressable v) {
        try {
            check(glRasterPos2sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos2sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            rasterPos2sv(seg);
        }
    }

    public static void rasterPos3d(double x, double y, double z) {
        try {
            check(glRasterPos3d).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3dv(Addressable v) {
        try {
            check(glRasterPos3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            rasterPos3dv(seg);
        }
    }

    public static void rasterPos3f(float x, float y, float z) {
        try {
            check(glRasterPos3f).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3fv(Addressable v) {
        try {
            check(glRasterPos3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            rasterPos3fv(seg);
        }
    }

    public static void rasterPos3i(int x, int y, int z) {
        try {
            check(glRasterPos3i).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3iv(Addressable v) {
        try {
            check(glRasterPos3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            rasterPos3iv(seg);
        }
    }

    public static void rasterPos3s(short x, short y, short z) {
        try {
            check(glRasterPos3s).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3sv(Addressable v) {
        try {
            check(glRasterPos3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            rasterPos3sv(seg);
        }
    }

    public static void rasterPos4d(double x, double y, double z, double w) {
        try {
            check(glRasterPos4d).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4dv(Addressable v) {
        try {
            check(glRasterPos4dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            rasterPos4dv(seg);
        }
    }

    public static void rasterPos4f(float x, float y, float z, float w) {
        try {
            check(glRasterPos4f).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4fv(Addressable v) {
        try {
            check(glRasterPos4fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            rasterPos4fv(seg);
        }
    }

    public static void rasterPos4i(int x, int y, int z, int w) {
        try {
            check(glRasterPos4i).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4iv(Addressable v) {
        try {
            check(glRasterPos4iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            rasterPos4iv(seg);
        }
    }

    public static void rasterPos4s(short x, short y, short z, short w) {
        try {
            check(glRasterPos4s).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4sv(Addressable v) {
        try {
            check(glRasterPos4sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rasterPos4sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            rasterPos4sv(seg);
        }
    }

    public static void rectd(double x1, double y1, double x2, double y2) {
        try {
            check(glRectd).invoke(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectdv(Addressable v1, Addressable v2) {
        try {
            check(glRectdv).invoke(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectdv(double[] v1, double[] v2) {
        try (var session = MemorySession.openShared()) {
            var seg1 = session.allocateArray(JAVA_DOUBLE, v1);
            var seg2 = session.allocateArray(JAVA_DOUBLE, v2);
            rectdv(seg1, seg2);
        }
    }

    public static void rectf(float x1, float y1, float x2, float y2) {
        try {
            check(glRectf).invoke(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectfv(Addressable v1, Addressable v2) {
        try {
            check(glRectfv).invoke(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectfv(float[] v1, float[] v2) {
        try (var session = MemorySession.openShared()) {
            var seg1 = session.allocateArray(JAVA_FLOAT, v1);
            var seg2 = session.allocateArray(JAVA_FLOAT, v2);
            rectfv(seg1, seg2);
        }
    }

    public static void recti(int x1, int y1, int x2, int y2) {
        try {
            check(glRecti).invoke(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectiv(Addressable v1, Addressable v2) {
        try {
            check(glRectiv).invoke(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectiv(int[] v1, int[] v2) {
        try (var session = MemorySession.openShared()) {
            var seg1 = session.allocateArray(JAVA_INT, v1);
            var seg2 = session.allocateArray(JAVA_INT, v2);
            rectiv(seg1, seg2);
        }
    }

    public static void rects(short x1, short y1, short x2, short y2) {
        try {
            check(glRects).invoke(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectsv(Addressable v1, Addressable v2) {
        try {
            check(glRectsv).invoke(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rectsv(short[] v1, short[] v2) {
        try (var session = MemorySession.openShared()) {
            var seg1 = session.allocateArray(JAVA_SHORT, v1);
            var seg2 = session.allocateArray(JAVA_SHORT, v2);
            rectsv(seg1, seg2);
        }
    }

    public static int renderMode(int mode) {
        try {
            return (int) check(glRenderMode).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rotated(double angle, double x, double y, double z) {
        try {
            check(glRotated).invoke(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void rotatef(float angle, float x, float y, float z) {
        try {
            check(glRotatef).invoke(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scaled(double x, double y, double z) {
        try {
            check(glScaled).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scalef(float x, float y, float z) {
        try {
            check(glScalef).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void selectBuffer(int size, Addressable buffer) {
        try {
            check(glSelectBuffer).invoke(size, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void selectBuffer(int[] buffer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, buffer.length);
            selectBuffer(buffer.length, seg);
            RuntimeHelper.toArray(seg, buffer);
        }
    }

    public static void shadeModel(int mode) {
        try {
            check(glShadeModel).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1d(double s) {
        try {
            check(glTexCoord1d).invoke(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1dv(Addressable v) {
        try {
            check(glTexCoord1dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            texCoord1dv(seg);
        }
    }

    public static void texCoord1f(float s) {
        try {
            check(glTexCoord1f).invoke(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1fv(Addressable v) {
        try {
            check(glTexCoord1fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            texCoord1fv(seg);
        }
    }

    public static void texCoord1i(int s) {
        try {
            check(glTexCoord1i).invoke(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1iv(Addressable v) {
        try {
            check(glTexCoord1iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            texCoord1iv(seg);
        }
    }

    public static void texCoord1s(short s) {
        try {
            check(glTexCoord1s).invoke(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1sv(Addressable v) {
        try {
            check(glTexCoord1sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord1sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            texCoord1sv(seg);
        }
    }

    public static void texCoord2d(double s, double t) {
        try {
            check(glTexCoord2d).invoke(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2dv(Addressable v) {
        try {
            check(glTexCoord2dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            texCoord2dv(seg);
        }
    }

    public static void texCoord2f(float s, float t) {
        try {
            check(glTexCoord2f).invoke(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2fv(Addressable v) {
        try {
            check(glTexCoord2fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            texCoord2fv(seg);
        }
    }

    public static void texCoord2i(int s, int t) {
        try {
            check(glTexCoord2i).invoke(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2iv(Addressable v) {
        try {
            check(glTexCoord2iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            texCoord2iv(seg);
        }
    }

    public static void texCoord2s(short s, short t) {
        try {
            check(glTexCoord2s).invoke(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2sv(Addressable v) {
        try {
            check(glTexCoord2sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord2sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            texCoord2sv(seg);
        }
    }

    public static void texCoord3d(double s, double t, double r) {
        try {
            check(glTexCoord3d).invoke(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3dv(Addressable v) {
        try {
            check(glTexCoord3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            texCoord3dv(seg);
        }
    }

    public static void texCoord3f(float s, float t, float r) {
        try {
            check(glTexCoord3f).invoke(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3fv(Addressable v) {
        try {
            check(glTexCoord3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            texCoord3fv(seg);
        }
    }

    public static void texCoord3i(int s, int t, int r) {
        try {
            check(glTexCoord3i).invoke(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3iv(Addressable v) {
        try {
            check(glTexCoord3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            texCoord3iv(seg);
        }
    }

    public static void texCoord3s(short s, short t, short r) {
        try {
            check(glTexCoord3s).invoke(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3sv(Addressable v) {
        try {
            check(glTexCoord3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            texCoord3sv(seg);
        }
    }

    public static void texCoord4d(double s, double t, double r, double q) {
        try {
            check(glTexCoord4d).invoke(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4dv(Addressable v) {
        try {
            check(glTexCoord4dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            texCoord4dv(seg);
        }
    }

    public static void texCoord4f(float s, float t, float r, float q) {
        try {
            check(glTexCoord4f).invoke(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4fv(Addressable v) {
        try {
            check(glTexCoord4fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            texCoord4fv(seg);
        }
    }

    public static void texCoord4i(int s, int t, int r, int q) {
        try {
            check(glTexCoord4i).invoke(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4iv(Addressable v) {
        try {
            check(glTexCoord4iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            texCoord4iv(seg);
        }
    }

    public static void texCoord4s(short s, short t, short r, short q) {
        try {
            check(glTexCoord4s).invoke(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4sv(Addressable v) {
        try {
            check(glTexCoord4sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoord4sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            texCoord4sv(seg);
        }
    }

    public static void texEnvf(int target, int pname, float param) {
        try {
            check(glTexEnvf).invoke(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texEnvfv(int target, int pname, Addressable params) {
        try {
            check(glTexEnvfv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texEnvfv(int target, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params);
            texEnvfv(target, pname, seg);
        }
    }

    public static void texEnvi(int target, int pname, int param) {
        try {
            check(glTexEnvi).invoke(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texEnviv(int target, int pname, Addressable params) {
        try {
            check(glTexEnviv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texEnviv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params);
            texEnviv(target, pname, seg);
        }
    }

    public static void texGend(int coord, int pname, double param) {
        try {
            check(glTexGend).invoke(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGendv(int coord, int pname, Addressable params) {
        try {
            check(glTexGendv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGendv(int coord, int pname, double[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, params);
            texGendv(coord, pname, seg);
        }
    }

    public static void texGenf(int coord, int pname, float param) {
        try {
            check(glTexGenf).invoke(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGenfv(int coord, int pname, Addressable params) {
        try {
            check(glTexGenfv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGenfv(int coord, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params);
            texGenfv(coord, pname, seg);
        }
    }

    public static void texGeni(int coord, int pname, int param) {
        try {
            check(glTexGeni).invoke(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGeniv(int coord, int pname, Addressable params) {
        try {
            check(glTexGeniv).invoke(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texGeniv(int coord, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params);
            texGeniv(coord, pname, seg);
        }
    }

    public static void translated(double x, double y, double z) {
        try {
            check(glTranslated).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void translatef(float x, float y, float z) {
        try {
            check(glTranslatef).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2d(double x, double y) {
        try {
            check(glVertex2d).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2dv(Addressable v) {
        try {
            check(glVertex2dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            vertex2dv(seg);
        }
    }

    public static void vertex2f(float x, float y) {
        try {
            check(glVertex2f).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2fv(Addressable v) {
        try {
            check(glVertex2fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            vertex2fv(seg);
        }
    }

    public static void vertex2i(int x, int y) {
        try {
            check(glVertex2i).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2iv(Addressable v) {
        try {
            check(glVertex2iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            vertex2iv(seg);
        }
    }

    public static void vertex2s(short x, short y) {
        try {
            check(glVertex2s).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2sv(Addressable v) {
        try {
            check(glVertex2sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex2sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            vertex2sv(seg);
        }
    }

    public static void vertex3d(double x, double y, double z) {
        try {
            check(glVertex3d).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3dv(Addressable v) {
        try {
            check(glVertex3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            vertex3dv(seg);
        }
    }

    public static void vertex3f(float x, float y, float z) {
        try {
            check(glVertex3f).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3fv(Addressable v) {
        try {
            check(glVertex3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            vertex3fv(seg);
        }
    }

    public static void vertex3i(int x, int y, int z) {
        try {
            check(glVertex3i).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3iv(Addressable v) {
        try {
            check(glVertex3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            vertex3iv(seg);
        }
    }

    public static void vertex3s(short x, short y, short z) {
        try {
            check(glVertex3s).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3sv(Addressable v) {
        try {
            check(glVertex3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            vertex3sv(seg);
        }
    }

    public static void vertex4d(double x, double y, double z, double w) {
        try {
            check(glVertex4d).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4dv(Addressable v) {
        try {
            check(glVertex4dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, v);
            vertex4dv(seg);
        }
    }

    public static void vertex4f(float x, float y, float z, float w) {
        try {
            check(glVertex4f).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4fv(Addressable v) {
        try {
            check(glVertex4fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, v);
            vertex4fv(seg);
        }
    }

    public static void vertex4i(int x, int y, int z, int w) {
        try {
            check(glVertex4i).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4iv(Addressable v) {
        try {
            check(glVertex4iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, v);
            vertex4iv(seg);
        }
    }

    public static void vertex4s(short x, short y, short z, short w) {
        try {
            check(glVertex4s).invoke(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4sv(Addressable v) {
        try {
            check(glVertex4sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertex4sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, v);
            vertex4sv(seg);
        }
    }
}
