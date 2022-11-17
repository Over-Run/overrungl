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
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.Ver10;
import static org.overrun.glib.gl.GLCaps.check;

/**
 * The OpenGL 1.0 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL10 extends GL10C {
    /**
     * Method handles
     */
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
        glAccum = load.invoke("glAccum", IFV);
        glAlphaFunc = load.invoke("glAlphaFunc", IFV);
        glBegin = load.invoke("glBegin", IV);
        glBitmap = load.invoke("glBitmap", IIFFFFPV);
        glCallList = load.invoke("glCallList", IV);
        glCallLists = load.invoke("glCallLists", IIPV);
        glClearAccum = load.invoke("glClearAccum", FFFFV);
        glClearIndex = load.invoke("glClearIndex", FV);
        glClipPlane = load.invoke("glClipPlane", IPV);
        glColor3b = load.invoke("glColor3b", BBBV);
        glColor3bv = load.invoke("glColor3bv", PV);
        glColor3d = load.invoke("glColor3d", DDDV);
        glColor3dv = load.invoke("glColor3dv", PV);
        glColor3f = load.invoke("glColor3f", FFFV);
        glColor3fv = load.invoke("glColor3fv", PV);
        glColor3i = load.invoke("glColor3i", IIIV);
        glColor3iv = load.invoke("glColor3iv", PV);
        glColor3s = load.invoke("glColor3s", SSSV);
        glColor3sv = load.invoke("glColor3sv", PV);
        glColor3ub = load.invoke("glColor3ub", BBBV);
        glColor3ubv = load.invoke("glColor3ubv", PV);
        glColor3ui = load.invoke("glColor3ui", IIIV);
        glColor3uiv = load.invoke("glColor3uiv", PV);
        glColor3us = load.invoke("glColor3us", SSSV);
        glColor3usv = load.invoke("glColor3usv", PV);
        glColor4b = load.invoke("glColor4b", BBBBV);
        glColor4bv = load.invoke("glColor4bv", PV);
        glColor4d = load.invoke("glColor4d", DDDDV);
        glColor4dv = load.invoke("glColor4dv", PV);
        glColor4f = load.invoke("glColor4f", FFFFV);
        glColor4fv = load.invoke("glColor4fv", PV);
        glColor4i = load.invoke("glColor4i", IIIIV);
        glColor4iv = load.invoke("glColor4iv", PV);
        glColor4s = load.invoke("glColor4s", SSSSV);
        glColor4sv = load.invoke("glColor4sv", PV);
        glColor4ub = load.invoke("glColor4ub", BBBBV);
        glColor4ubv = load.invoke("glColor4ubv", PV);
        glColor4ui = load.invoke("glColor4ui", IIIIV);
        glColor4uiv = load.invoke("glColor4uiv", PV);
        glColor4us = load.invoke("glColor4us", SSSSV);
        glColor4usv = load.invoke("glColor4usv", PV);
        glColorMaterial = load.invoke("glColorMaterial", IIV);
        glCopyPixels = load.invoke("glCopyPixels", IIIIIV);
        glDeleteLists = load.invoke("glDeleteLists", IIV);
        glDrawPixels = load.invoke("glDrawPixels", IIIIPV);
        glEdgeFlag = load.invoke("glEdgeFlag", ZV);
        glEdgeFlagv = load.invoke("glEdgeFlagv", PV);
        glEnd = load.invoke("glEnd", V);
        glEndList = load.invoke("glEndList", V);
        glEvalCoord1d = load.invoke("glEvalCoord1d", DV);
        glEvalCoord1dv = load.invoke("glEvalCoord1dv", PV);
        glEvalCoord1f = load.invoke("glEvalCoord1f", FV);
        glEvalCoord1fv = load.invoke("glEvalCoord1fv", PV);
        glEvalCoord2d = load.invoke("glEvalCoord2d", DDV);
        glEvalCoord2dv = load.invoke("glEvalCoord2dv", PV);
        glEvalCoord2f = load.invoke("glEvalCoord2f", FFV);
        glEvalCoord2fv = load.invoke("glEvalCoord2fv", PV);
        glEvalMesh1 = load.invoke("glEvalMesh1", IIIV);
        glEvalMesh2 = load.invoke("glEvalMesh2", IIIIIV);
        glEvalPoint1 = load.invoke("glEvalPoint1", IV);
        glEvalPoint2 = load.invoke("glEvalPoint2", IIV);
        glFeedbackBuffer = load.invoke("glFeedbackBuffer", IIPV);
        glFogf = load.invoke("glFogf", IFV);
        glFogfv = load.invoke("glFogfv", IPV);
        glFogi = load.invoke("glFogi", IIV);
        glFogiv = load.invoke("glFogiv", IPV);
        glFrustum = load.invoke("glFrustum", DDDDDDV);
        glGenLists = load.invoke("glGenLists", II);
        glGetClipPlane = load.invoke("glGetClipPlane", IPV);
        glGetLightfv = load.invoke("glGetLightfv", IIPV);
        glGetLightiv = load.invoke("glGetLightiv", IIPV);
        glGetMapdv = load.invoke("glGetMapdv", IIPV);
        glGetMapfv = load.invoke("glGetMapfv", IIPV);
        glGetMapiv = load.invoke("glGetMapiv", IIPV);
        glGetMaterialfv = load.invoke("glGetMaterialfv", IIPV);
        glGetMaterialiv = load.invoke("glGetMaterialiv", IIPV);
        glGetPixelMapfv = load.invoke("glGetPixelMapfv", IPV);
        glGetPixelMapuiv = load.invoke("glGetPixelMapuiv", IPV);
        glGetPixelMapusv = load.invoke("glGetPixelMapusv", IPV);
        glGetPolygonStipple = load.invoke("glGetPolygonStipple", PV);
        glGetTexEnvfv = load.invoke("glGetTexEnvfv", IIPV);
        glGetTexEnviv = load.invoke("glGetTexEnviv", IIPV);
        glGetTexGendv = load.invoke("glGetTexGendv", IIPV);
        glGetTexGenfv = load.invoke("glGetTexGenfv", IIPV);
        glGetTexGeniv = load.invoke("glGetTexGeniv", IIPV);
        glIndexMask = load.invoke("glIndexMask", IV);
        glIndexd = load.invoke("glIndexd", DV);
        glIndexdv = load.invoke("glIndexdv", PV);
        glIndexf = load.invoke("glIndexf", FV);
        glIndexfv = load.invoke("glIndexfv", PV);
        glIndexi = load.invoke("glIndexi", IV);
        glIndexiv = load.invoke("glIndexiv", PV);
        glIndexs = load.invoke("glIndexs", SV);
        glIndexsv = load.invoke("glIndexsv", PV);
        glInitNames = load.invoke("glInitNames", V);
        glIsList = load.invoke("glIsList", IZ);
        glLightModelf = load.invoke("glLightModelf", IFV);
        glLightModelfv = load.invoke("glLightModelfv", IPV);
        glLightModeli = load.invoke("glLightModeli", IIV);
        glLightModeliv = load.invoke("glLightModeliv", IPV);
        glLightf = load.invoke("glLightf", IIFV);
        glLightfv = load.invoke("glLightfv", IIPV);
        glLighti = load.invoke("glLighti", IIIV);
        glLightiv = load.invoke("glLightiv", IIPV);
        glLineStipple = load.invoke("glLineStipple", ISV);
        glListBase = load.invoke("glListBase", IV);
        glLoadIdentity = load.invoke("glLoadIdentity", V);
        glLoadMatrixd = load.invoke("glLoadMatrixd", PV);
        glLoadMatrixf = load.invoke("glLoadMatrixf", PV);
        glLoadName = load.invoke("glLoadName", IV);
        glMap1d = load.invoke("glMap1d", IDDIIPV);
        glMap1f = load.invoke("glMap1f", IFFIIPV);
        glMap2d = load.invoke("glMap2d", IDDIIDDIIPV);
        glMap2f = load.invoke("glMap2f", IFFIIFFIIPV);
        glMapGrid1d = load.invoke("glMapGrid1d", IDDV);
        glMapGrid1f = load.invoke("glMapGrid1f", IFFV);
        glMapGrid2d = load.invoke("glMapGrid2d", IDDIDDV);
        glMapGrid2f = load.invoke("glMapGrid2f", IFFIFFV);
        glMaterialf = load.invoke("glMaterialf", IIFV);
        glMaterialfv = load.invoke("glMaterialfv", IIPV);
        glMateriali = load.invoke("glMateriali", IIIV);
        glMaterialiv = load.invoke("glMaterialiv", IIPV);
        glMatrixMode = load.invoke("glMatrixMode", IV);
        glMultMatrixd = load.invoke("glMultMatrixd", PV);
        glMultMatrixf = load.invoke("glMultMatrixf", PV);
        glNewList = load.invoke("glNewList", IIV);
        glNormal3b = load.invoke("glNormal3b", BBBV);
        glNormal3bv = load.invoke("glNormal3bv", PV);
        glNormal3d = load.invoke("glNormal3d", DDDV);
        glNormal3dv = load.invoke("glNormal3dv", PV);
        glNormal3f = load.invoke("glNormal3f", FFFV);
        glNormal3fv = load.invoke("glNormal3fv", PV);
        glNormal3i = load.invoke("glNormal3i", IIIV);
        glNormal3iv = load.invoke("glNormal3iv", PV);
        glNormal3s = load.invoke("glNormal3s", SSSV);
        glNormal3sv = load.invoke("glNormal3sv", PV);
        glOrtho = load.invoke("glOrtho", DDDDDDV);
        glPassThrough = load.invoke("glPassThrough", FV);
        glPixelMapfv = load.invoke("glPixelMapfv", IIPV);
        glPixelMapuiv = load.invoke("glPixelMapuiv", IIPV);
        glPixelMapusv = load.invoke("glPixelMapusv", IIPV);
        glPixelTransferf = load.invoke("glPixelTransferf", IFV);
        glPixelTransferi = load.invoke("glPixelTransferi", IIV);
        glPixelZoom = load.invoke("glPixelZoom", FFV);
        glPolygonStipple = load.invoke("glPolygonStipple", PV);
        glPopAttrib = load.invoke("glPopAttrib", V);
        glPopMatrix = load.invoke("glPopMatrix", V);
        glPopName = load.invoke("glPopName", V);
        glPushAttrib = load.invoke("glPushAttrib", IV);
        glPushMatrix = load.invoke("glPushMatrix", V);
        glPushName = load.invoke("glPushName", IV);
        glRasterPos2d = load.invoke("glRasterPos2d", DDV);
        glRasterPos2dv = load.invoke("glRasterPos2dv", PV);
        glRasterPos2f = load.invoke("glRasterPos2f", FFV);
        glRasterPos2fv = load.invoke("glRasterPos2fv", PV);
        glRasterPos2i = load.invoke("glRasterPos2i", IIV);
        glRasterPos2iv = load.invoke("glRasterPos2iv", PV);
        glRasterPos2s = load.invoke("glRasterPos2s", SSV);
        glRasterPos2sv = load.invoke("glRasterPos2sv", PV);
        glRasterPos3d = load.invoke("glRasterPos3d", DDDV);
        glRasterPos3dv = load.invoke("glRasterPos3dv", PV);
        glRasterPos3f = load.invoke("glRasterPos3f", FFFV);
        glRasterPos3fv = load.invoke("glRasterPos3fv", PV);
        glRasterPos3i = load.invoke("glRasterPos3i", IIIV);
        glRasterPos3iv = load.invoke("glRasterPos3iv", PV);
        glRasterPos3s = load.invoke("glRasterPos3s", SSSV);
        glRasterPos3sv = load.invoke("glRasterPos3sv", PV);
        glRasterPos4d = load.invoke("glRasterPos4d", DDDDV);
        glRasterPos4dv = load.invoke("glRasterPos4dv", PV);
        glRasterPos4f = load.invoke("glRasterPos4f", FFFFV);
        glRasterPos4fv = load.invoke("glRasterPos4fv", PV);
        glRasterPos4i = load.invoke("glRasterPos4i", IIIIV);
        glRasterPos4iv = load.invoke("glRasterPos4iv", PV);
        glRasterPos4s = load.invoke("glRasterPos4s", SSSSV);
        glRasterPos4sv = load.invoke("glRasterPos4sv", PV);
        glRectd = load.invoke("glRectd", DDDDV);
        glRectdv = load.invoke("glRectdv", PPV);
        glRectf = load.invoke("glRectf", FFFFV);
        glRectfv = load.invoke("glRectfv", PPV);
        glRecti = load.invoke("glRecti", IIIIV);
        glRectiv = load.invoke("glRectiv", PPV);
        glRects = load.invoke("glRects", SSSSV);
        glRectsv = load.invoke("glRectsv", PPV);
        glRenderMode = load.invoke("glRenderMode", II);
        glRotated = load.invoke("glRotated", DDDDV);
        glRotatef = load.invoke("glRotatef", FFFFV);
        glScaled = load.invoke("glScaled", DDDV);
        glScalef = load.invoke("glScalef", FFFV);
        glSelectBuffer = load.invoke("glSelectBuffer", IPV);
        glShadeModel = load.invoke("glShadeModel", IV);
        glTexCoord1d = load.invoke("glTexCoord1d", DV);
        glTexCoord1dv = load.invoke("glTexCoord1dv", PV);
        glTexCoord1f = load.invoke("glTexCoord1f", FV);
        glTexCoord1fv = load.invoke("glTexCoord1fv", PV);
        glTexCoord1i = load.invoke("glTexCoord1i", IV);
        glTexCoord1iv = load.invoke("glTexCoord1iv", PV);
        glTexCoord1s = load.invoke("glTexCoord1s", SV);
        glTexCoord1sv = load.invoke("glTexCoord1sv", PV);
        glTexCoord2d = load.invoke("glTexCoord2d", DDV);
        glTexCoord2dv = load.invoke("glTexCoord2dv", PV);
        glTexCoord2f = load.invoke("glTexCoord2f", FFV);
        glTexCoord2fv = load.invoke("glTexCoord2fv", PV);
        glTexCoord2i = load.invoke("glTexCoord2i", IIV);
        glTexCoord2iv = load.invoke("glTexCoord2iv", PV);
        glTexCoord2s = load.invoke("glTexCoord2s", SSV);
        glTexCoord2sv = load.invoke("glTexCoord2sv", PV);
        glTexCoord3d = load.invoke("glTexCoord3d", DDDV);
        glTexCoord3dv = load.invoke("glTexCoord3dv", PV);
        glTexCoord3f = load.invoke("glTexCoord3f", FFFV);
        glTexCoord3fv = load.invoke("glTexCoord3fv", PV);
        glTexCoord3i = load.invoke("glTexCoord3i", IIIV);
        glTexCoord3iv = load.invoke("glTexCoord3iv", PV);
        glTexCoord3s = load.invoke("glTexCoord3s", SSSV);
        glTexCoord3sv = load.invoke("glTexCoord3sv", PV);
        glTexCoord4d = load.invoke("glTexCoord4d", DDDDV);
        glTexCoord4dv = load.invoke("glTexCoord4dv", PV);
        glTexCoord4f = load.invoke("glTexCoord4f", FFFFV);
        glTexCoord4fv = load.invoke("glTexCoord4fv", PV);
        glTexCoord4i = load.invoke("glTexCoord4i", IIIIV);
        glTexCoord4iv = load.invoke("glTexCoord4iv", PV);
        glTexCoord4s = load.invoke("glTexCoord4s", SSSSV);
        glTexCoord4sv = load.invoke("glTexCoord4sv", PV);
        glTexEnvf = load.invoke("glTexEnvf", IIFV);
        glTexEnvfv = load.invoke("glTexEnvfv", IIPV);
        glTexEnvi = load.invoke("glTexEnvi", IIIV);
        glTexEnviv = load.invoke("glTexEnviv", IIPV);
        glTexGend = load.invoke("glTexGend", IIDV);
        glTexGendv = load.invoke("glTexGendv", IIPV);
        glTexGenf = load.invoke("glTexGenf", IIFV);
        glTexGenfv = load.invoke("glTexGenfv", IIPV);
        glTexGeni = load.invoke("glTexGeni", IIIV);
        glTexGeniv = load.invoke("glTexGeniv", IIPV);
        glTranslated = load.invoke("glTranslated", DDDV);
        glTranslatef = load.invoke("glTranslatef", FFFV);
        glVertex2d = load.invoke("glVertex2d", DDV);
        glVertex2dv = load.invoke("glVertex2dv", PV);
        glVertex2f = load.invoke("glVertex2f", FFV);
        glVertex2fv = load.invoke("glVertex2fv", PV);
        glVertex2i = load.invoke("glVertex2i", IIV);
        glVertex2iv = load.invoke("glVertex2iv", PV);
        glVertex2s = load.invoke("glVertex2s", SSV);
        glVertex2sv = load.invoke("glVertex2sv", PV);
        glVertex3d = load.invoke("glVertex3d", DDDV);
        glVertex3dv = load.invoke("glVertex3dv", PV);
        glVertex3f = load.invoke("glVertex3f", FFFV);
        glVertex3fv = load.invoke("glVertex3fv", PV);
        glVertex3i = load.invoke("glVertex3i", IIIV);
        glVertex3iv = load.invoke("glVertex3iv", PV);
        glVertex3s = load.invoke("glVertex3s", SSSV);
        glVertex3sv = load.invoke("glVertex3sv", PV);
        glVertex4d = load.invoke("glVertex4d", DDDDV);
        glVertex4dv = load.invoke("glVertex4dv", PV);
        glVertex4f = load.invoke("glVertex4f", FFFFV);
        glVertex4fv = load.invoke("glVertex4fv", PV);
        glVertex4i = load.invoke("glVertex4i", IIIIV);
        glVertex4iv = load.invoke("glVertex4iv", PV);
        glVertex4s = load.invoke("glVertex4s", SSSSV);
        glVertex4sv = load.invoke("glVertex4sv", PV);
    }

    public static void accum(int op, float value) {
        try {
            check(glAccum).invokeExact(op, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void alphaFunc(int func, float ref) {
        try {
            check(glAlphaFunc).invokeExact(func, ref);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void begin(int mode) {
        try {
            check(glBegin).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Addressable bitmap) {
        try {
            check(glBitmap).invokeExact(width, height, xorig, yorig, xmove, ymove, bitmap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void callList(int list) {
        try {
            check(glCallList).invokeExact(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void callLists(int n, int type, Addressable lists) {
        try {
            check(glCallLists).invokeExact(n, type, lists);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearAccum(float red, float green, float blue, float alpha) {
        try {
            check(glClearAccum).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearIndex(float c) {
        try {
            check(glClearIndex).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clipPlane(int plane, Addressable equation) {
        try {
            check(glClipPlane).invokeExact(plane, equation);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clipPlane(SegmentAllocator allocator, int plane, double[] equation) {
        var pEq = allocator.allocateArray(JAVA_DOUBLE, equation);
        clipPlane(plane, pEq);
    }


    public static void color3b(byte red, byte green, byte blue) {
        try {
            check(glColor3b).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3bv(Addressable v) {
        try {
            check(glColor3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3bv(SegmentAllocator allocator, byte[] v) {
        var pv = allocator.allocateArray(JAVA_BYTE, v);
        color3bv(pv);
    }

    public static void color3d(double red, double green, double blue) {
        try {
            check(glColor3d).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3dv(Addressable v) {
        try {
            check(glColor3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3dv(SegmentAllocator allocator, double[] v) {
        var pv = allocator.allocateArray(JAVA_DOUBLE, v);
        color3dv(pv);
    }

    public static void color3f(float red, float green, float blue) {
        try {
            check(glColor3f).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3fv(Addressable v) {
        try {
            check(glColor3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3fv(SegmentAllocator allocator, float[] v) {
        var pv = allocator.allocateArray(JAVA_FLOAT, v);
        color3fv(pv);
    }

    public static void color3i(int red, int green, int blue) {
        try {
            check(glColor3i).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3iv(Addressable v) {
        try {
            check(glColor3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3iv(SegmentAllocator allocator, int[] v) {
        var pv = allocator.allocateArray(JAVA_INT, v);
        color3iv(pv);
    }

    public static void color3s(short red, short green, short blue) {
        try {
            check(glColor3s).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3sv(Addressable v) {
        try {
            check(glColor3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3sv(SegmentAllocator allocator, short[] v) {
        var pv = allocator.allocateArray(JAVA_SHORT, v);
        color3sv(pv);
    }

    public static void color3ub(byte red, byte green, byte blue) {
        try {
            check(glColor3ub).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3ubv(Addressable v) {
        try {
            check(glColor3ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3ubv(SegmentAllocator allocator, byte[] v) {
        var pv = allocator.allocateArray(JAVA_BYTE, v);
        color3ubv(pv);
    }

    public static void color3ui(int red, int green, int blue) {
        try {
            check(glColor3ui).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3uiv(Addressable v) {
        try {
            check(glColor3uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3uiv(SegmentAllocator allocator, int[] v) {
        var pv = allocator.allocateArray(JAVA_INT, v);
        color3uiv(pv);
    }

    public static void color3us(short red, short green, short blue) {
        try {
            check(glColor3us).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3usv(Addressable v) {
        try {
            check(glColor3usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3usv(SegmentAllocator allocator, short[] v) {
        var pv = allocator.allocateArray(JAVA_SHORT, v);
        color3usv(pv);
    }

    public static void color4b(byte red, byte green, byte blue, byte alpha) {
        try {
            check(glColor4b).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4bv(Addressable v) {
        try {
            check(glColor4bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4bv(SegmentAllocator allocator, byte[] v) {
        var pv = allocator.allocateArray(JAVA_BYTE, v);
        color4bv(pv);
    }

    public static void color4d(double red, double green, double blue, double alpha) {
        try {
            check(glColor4d).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4dv(Addressable v) {
        try {
            check(glColor4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4dv(SegmentAllocator allocator, double[] v) {
        var pv = allocator.allocateArray(JAVA_DOUBLE, v);
        color4dv(pv);
    }

    public static void color4f(float red, float green, float blue, float alpha) {
        try {
            check(glColor4f).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4fv(Addressable v) {
        try {
            check(glColor4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4fv(SegmentAllocator allocator, float[] v) {
        var pv = allocator.allocateArray(JAVA_FLOAT, v);
        color4fv(pv);
    }

    public static void color4i(int red, int green, int blue, int alpha) {
        try {
            check(glColor4i).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4iv(Addressable v) {
        try {
            check(glColor4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4iv(SegmentAllocator allocator, int[] v) {
        var pv = allocator.allocateArray(JAVA_INT, v);
        color4iv(pv);
    }

    public static void color4s(short red, short green, short blue, short alpha) {
        try {
            check(glColor4s).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4sv(Addressable v) {
        try {
            check(glColor4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4sv(SegmentAllocator allocator, short[] v) {
        var pv = allocator.allocateArray(JAVA_SHORT, v);
        color4sv(pv);
    }

    public static void color4ub(byte red, byte green, byte blue, byte alpha) {
        try {
            check(glColor4ub).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4ubv(Addressable v) {
        try {
            check(glColor4ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4ubv(SegmentAllocator allocator, byte[] v) {
        var pv = allocator.allocateArray(JAVA_BYTE, v);
        color4ubv(pv);
    }

    public static void color4ui(int red, int green, int blue, int alpha) {
        try {
            check(glColor4ui).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4uiv(Addressable v) {
        try {
            check(glColor4uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4uiv(SegmentAllocator allocator, int[] v) {
        var pv = allocator.allocateArray(JAVA_INT, v);
        color4uiv(pv);
    }

    public static void color4us(short red, short green, short blue, short alpha) {
        try {
            check(glColor4us).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4usv(Addressable v) {
        try {
            check(glColor4usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4usv(SegmentAllocator allocator, short[] v) {
        var pv = allocator.allocateArray(JAVA_SHORT, v);
        color4usv(pv);
    }

    public static void colorMaterial(int face, int mode) {
        try {
            check(glColorMaterial).invokeExact(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyPixels(int x, int y, int width, int height, int type) {
        try {
            check(glCopyPixels).invokeExact(x, y, width, height, type);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteLists(int list, int range) {
        try {
            check(glDeleteLists).invokeExact(list, range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawPixels(int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glDrawPixels).invokeExact(width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlag(boolean flag) {
        try {
            check(glEdgeFlag).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlagv(Addressable flag) {
        try {
            check(glEdgeFlagv).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlagv(SegmentAllocator allocator, boolean[] flag) {
        var pFlag = allocator.allocateArray(JAVA_BOOLEAN, flag.length);
        for (int i = 0; i < flag.length; i++) {
            pFlag.set(JAVA_BOOLEAN, i, flag[i]);
        }
        edgeFlagv(pFlag);
    }

    public static void end() {
        try {
            check(glEnd).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endList() {
        try {
            check(glEndList).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1d(double u) {
        try {
            check(glEvalCoord1d).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1dv(Addressable u) {
        try {
            check(glEvalCoord1dv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1dv(SegmentAllocator allocator, double[] u) {
        var pu = allocator.allocateArray(JAVA_DOUBLE, u);
        evalCoord1dv(pu);
    }

    public static void evalCoord1f(float u) {
        try {
            check(glEvalCoord1f).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1fv(Addressable u) {
        try {
            check(glEvalCoord1fv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1fv(SegmentAllocator allocator, float[] u) {
        var pu = allocator.allocateArray(JAVA_FLOAT, u);
        evalCoord1fv(pu);
    }

    public static void evalCoord2d(double u, double v) {
        try {
            check(glEvalCoord2d).invokeExact(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2dv(Addressable u) {
        try {
            check(glEvalCoord2dv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2dv(SegmentAllocator allocator, double[] u) {
        var pu = allocator.allocateArray(JAVA_DOUBLE, u);
        evalCoord2dv(pu);
    }

    public static void evalCoord2f(float u, float v) {
        try {
            check(glEvalCoord2f).invokeExact(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2fv(Addressable u) {
        try {
            check(glEvalCoord2fv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2fv(SegmentAllocator allocator, float[] u) {
        var pu = allocator.allocateArray(JAVA_FLOAT, u);
        evalCoord2fv(pu);
    }

    public static void evalMesh1(int mode, int i1, int i2) {
        try {
            check(glEvalMesh1).invokeExact(mode, i1, i2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalMesh2(int mode, int i1, int i2, int j1, int j2) {
        try {
            check(glEvalMesh2).invokeExact(mode, i1, i2, j1, j2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalPoint1(int mode, int i) {
        try {
            check(glEvalPoint1).invokeExact(mode, i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalPoint2(int mode, int i, int j) {
        try {
            check(glEvalPoint2).invokeExact(mode, i, j);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void feedbackBuffer(int size, int type, Addressable buffer) {
        try {
            check(glFeedbackBuffer).invokeExact(size, type, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void feedbackBuffer(SegmentAllocator allocator, int type, float[] buffer) {
        var pBuffer = allocator.allocateArray(JAVA_FLOAT, buffer.length);
        feedbackBuffer(buffer.length, type, pBuffer);
        RuntimeHelper.toArray(pBuffer, buffer);
    }

    public static void fogf(int pname, float param) {
        try {
            check(glFogf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogfv(int pname, Addressable params) {
        try {
            check(glFogfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogfv(SegmentAllocator allocator, int pname, float[] params) {
        var pParam = allocator.allocateArray(JAVA_FLOAT, params);
        fogfv(pname, pParam);
    }

    public static void fogi(int pname, int param) {
        try {
            check(glFogi).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogiv(int pname, Addressable params) {
        try {
            check(glFogiv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogiv(SegmentAllocator allocator, int pname, int[] params) {
        var pParam = allocator.allocateArray(JAVA_INT, params);
        fogiv(pname, pParam);
    }

    public static void frustum(double left, double right, double bottom, double top, double zNear, double zFar) {
        try {
            check(glFrustum).invokeExact(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int genLists(int range) {
        try {
            return (int) check(glGenLists).invokeExact(range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getClipPlane(int plane, Addressable equation) {
        try {
            check(glGetClipPlane).invokeExact(plane, equation);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static double[] getClipPlane(int plane) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pEq = stack.calloc(JAVA_DOUBLE, 4);
            getClipPlane(plane, pEq);
            return new double[]{
                pEq.get(JAVA_DOUBLE, 0),
                pEq.getAtIndex(JAVA_DOUBLE, 1),
                pEq.getAtIndex(JAVA_DOUBLE, 2),
                pEq.getAtIndex(JAVA_DOUBLE, 3)
            };
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getLightfv(int light, int pname, Addressable params) {
        try {
            check(glGetLightfv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getLightfv(SegmentAllocator allocator, int light, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getLightfv(light, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getLightf(int light, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getLightfv(light, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getLightiv(int light, int pname, Addressable params) {
        try {
            check(glGetLightiv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getLightiv(SegmentAllocator allocator, int light, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getLightiv(light, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getLighti(int light, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getLightiv(light, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMapdv(int target, int query, Addressable v) {
        try {
            check(glGetMapdv).invokeExact(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMapdv(SegmentAllocator allocator, int target, int query, double[] v) {
        var pv = allocator.allocateArray(JAVA_DOUBLE, v.length);
        getMapdv(target, query, pv);
        RuntimeHelper.toArray(pv, v);
    }

    public static double getMapd(int target, int query) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pv = stack.calloc(JAVA_DOUBLE);
            getMapdv(target, query, pv);
            return pv.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMapfv(int target, int query, Addressable v) {
        try {
            check(glGetMapfv).invokeExact(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMapfv(SegmentAllocator allocator, int target, int query, float[] v) {
        var pv = allocator.allocateArray(JAVA_FLOAT, v.length);
        getMapfv(target, query, pv);
        RuntimeHelper.toArray(pv, v);
    }

    public static float getMapf(int target, int query) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pv = stack.calloc(JAVA_FLOAT);
            getMapfv(target, query, pv);
            return pv.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMapiv(int target, int query, Addressable v) {
        try {
            check(glGetMapiv).invokeExact(target, query, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMapiv(SegmentAllocator allocator, int target, int query, int[] v) {
        var pv = allocator.allocateArray(JAVA_INT, v.length);
        getMapiv(target, query, pv);
        RuntimeHelper.toArray(pv, v);
    }

    public static int getMapi(int target, int query) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pv = stack.calloc(JAVA_INT);
            getMapiv(target, query, pv);
            return pv.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMaterialfv(int face, int pname, Addressable params) {
        try {
            check(glGetMaterialfv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMaterialfv(SegmentAllocator allocator, int face, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getMaterialfv(face, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getMaterialf(int face, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getMaterialfv(face, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMaterialiv(int face, int pname, Addressable params) {
        try {
            check(glGetMaterialiv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMaterialiv(SegmentAllocator allocator, int face, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getMaterialiv(face, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getMateriali(int face, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getMaterialiv(face, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getPixelMapfv(int map, Addressable values) {
        try {
            check(glGetPixelMapfv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapfv(SegmentAllocator allocator, int map, float[] values) {
        var pValues = allocator.allocateArray(JAVA_FLOAT, values.length);
        getPixelMapfv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPixelMapuiv(int map, Addressable values) {
        try {
            check(glGetPixelMapuiv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapuiv(SegmentAllocator allocator, int map, int[] values) {
        var pValues = allocator.allocateArray(JAVA_INT, values.length);
        getPixelMapuiv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPixelMapusv(int map, Addressable values) {
        try {
            check(glGetPixelMapusv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapusv(SegmentAllocator allocator, int map, short[] values) {
        var pValues = allocator.allocateArray(JAVA_SHORT, values.length);
        getPixelMapusv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPolygonStipple(Addressable mask) {
        try {
            check(glGetPolygonStipple).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPolygonStipple(SegmentAllocator allocator, byte[] mask) {
        var pMask = allocator.allocateArray(JAVA_BYTE, mask.length);
        getPolygonStipple(pMask);
        RuntimeHelper.toArray(pMask, mask);
    }

    public static void getTexEnvfv(int target, int pname, Addressable params) {
        try {
            check(glGetTexEnvfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexEnvfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexEnvfv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTexEnvf(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getTexEnvfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexEnviv(int target, int pname, Addressable params) {
        try {
            check(glGetTexEnviv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexEnviv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexEnviv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTexEnvi(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getTexEnviv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexGendv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGendv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexGendv(SegmentAllocator allocator, int coord, int pname, double[] params) {
        var pParams = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getTexGendv(coord, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static void getTexGenfv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGenfv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexGenfv(SegmentAllocator allocator, int coord, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexGenfv(coord, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static void getTexGeniv(int coord, int pname, Addressable params) {
        try {
            check(glGetTexGeniv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexGeniv(SegmentAllocator allocator, int coord, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexGeniv(coord, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static void indexMask(int mask) {
        try {
            check(glIndexMask).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexd(double c) {
        try {
            check(glIndexd).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexdv(Addressable c) {
        try {
            check(glIndexdv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexdv(SegmentAllocator allocator, double[] c) {
        var pc = allocator.allocateArray(JAVA_DOUBLE, c);
        indexdv(pc);
    }

    public static void indexf(float c) {
        try {
            check(glIndexf).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexfv(Addressable c) {
        try {
            check(glIndexfv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexfv(SegmentAllocator allocator, float[] c) {
        var pc = allocator.allocateArray(JAVA_FLOAT, c);
        indexfv(pc);
    }

    public static void indexi(int c) {
        try {
            check(glIndexi).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexiv(Addressable c) {
        try {
            check(glIndexiv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexiv(SegmentAllocator allocator, int[] c) {
        var pc = allocator.allocateArray(JAVA_INT, c);
        indexiv(pc);
    }

    public static void indexs(short c) {
        try {
            check(glIndexs).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexsv(Addressable c) {
        try {
            check(glIndexsv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexsv(SegmentAllocator allocator, short[] c) {
        var pc = allocator.allocateArray(JAVA_SHORT, c);
        indexsv(pc);
    }

    public static void initNames() {
        try {
            check(glInitNames).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isList(int list) {
        try {
            return (boolean) check(glIsList).invokeExact(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelf(int pname, float param) {
        try {
            check(glLightModelf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelfv(int pname, Addressable params) {
        try {
            check(glLightModelfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelfv(SegmentAllocator allocator, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params);
        lightModelfv(pname, pParams);
    }

    public static void lightModeli(int pname, int param) {
        try {
            check(glLightModeli).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModeliv(int pname, Addressable params) {
        try {
            check(glLightModeliv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModeliv(SegmentAllocator allocator, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params);
        lightModeliv(pname, pParams);
    }

    public static void lightf(int light, int pname, float param) {
        try {
            check(glLightf).invokeExact(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightfv(int light, int pname, Addressable params) {
        try {
            check(glLightfv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightfv(SegmentAllocator allocator, int light, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params);
        lightfv(light, pname, pParams);
    }

    public static void lighti(int light, int pname, int param) {
        try {
            check(glLighti).invokeExact(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightiv(int light, int pname, Addressable params) {
        try {
            check(glLightiv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightiv(SegmentAllocator allocator, int light, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params);
        lightiv(light, pname, pParams);
    }

    public static void lineStipple(int factor, short pattern) {
        try {
            check(glLineStipple).invokeExact(factor, pattern);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listBase(int base) {
        try {
            check(glListBase).invokeExact(base);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadIdentity() {
        try {
            check(glLoadIdentity).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixd(Addressable m) {
        try {
            check(glLoadMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixd(SegmentAllocator allocator, double[] m) {
        var pm = allocator.allocateArray(JAVA_DOUBLE, m);
        loadMatrixd(pm);
    }

    public static void loadMatrixf(Addressable m) {
        try {
            check(glLoadMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixf(SegmentAllocator allocator, float[] m) {
        var pm = allocator.allocateArray(JAVA_FLOAT, m);
        loadMatrixf(pm);
    }

    public static void loadName(int name) {
        try {
            check(glLoadName).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1d(int target, double u1, double u2, int stride, int order, Addressable points) {
        try {
            check(glMap1d).invokeExact(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1d(SegmentAllocator allocator, int target, double u1, double u2, int stride, int order, double[] points) {
        var pp = allocator.allocateArray(JAVA_DOUBLE, points);
        map1d(target, u1, u2, stride, order, pp);
    }

    public static void map1f(int target, float u1, float u2, int stride, int order, Addressable points) {
        try {
            check(glMap1f).invokeExact(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1f(SegmentAllocator allocator, int target, float u1, float u2, int stride, int order, float[] points) {
        var pp = allocator.allocateArray(JAVA_FLOAT, points);
        map1f(target, u1, u2, stride, order, pp);
    }

    public static void map2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, Addressable points) {
        try {
            check(glMap2d).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map2d(SegmentAllocator allocator, int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        var pp = allocator.allocateArray(JAVA_DOUBLE, points);
        map2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, pp);
    }

    public static void map2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, Addressable points) {
        try {
            check(glMap2f).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map2f(SegmentAllocator allocator, int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        var pp = allocator.allocateArray(JAVA_FLOAT, points);
        map2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, pp);
    }

    public static void mapGrid1d(int un, double u1, double u2) {
        try {
            check(glMapGrid1d).invokeExact(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid1f(int un, float u1, float u2) {
        try {
            check(glMapGrid1f).invokeExact(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        try {
            check(glMapGrid2d).invokeExact(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        try {
            check(glMapGrid2f).invokeExact(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialf(int face, int pname, float param) {
        try {
            check(glMaterialf).invokeExact(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialfv(int face, int pname, Addressable params) {
        try {
            check(glMaterialfv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialfv(SegmentAllocator allocator, int face, int pname, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params);
        materialfv(face, pname, seg);
    }

    public static void materiali(int face, int pname, int param) {
        try {
            check(glMateriali).invokeExact(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialiv(int face, int pname, Addressable params) {
        try {
            check(glMaterialiv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialiv(SegmentAllocator allocator, int face, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params);
        materialiv(face, pname, seg);
    }

    public static void matrixMode(int mode) {
        try {
            check(glMatrixMode).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixd(Addressable m) {
        try {
            check(glMultMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixd(SegmentAllocator allocator, double[] m) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, m);
        multMatrixd(seg);
    }

    public static void multMatrixf(Addressable m) {
        try {
            check(glMultMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixf(SegmentAllocator allocator, float[] m) {
        var seg = allocator.allocateArray(JAVA_FLOAT, m);
        multMatrixf(seg);
    }

    public static void newList(int list, int mode) {
        try {
            check(glNewList).invokeExact(list, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3b(byte nx, byte ny, byte nz) {
        try {
            check(glNormal3b).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3bv(Addressable v) {
        try {
            check(glNormal3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3bv(SegmentAllocator allocator, byte[] v) {
        var seg = allocator.allocateArray(JAVA_BYTE, v);
        normal3bv(seg);
    }

    public static void normal3d(double nx, double ny, double nz) {
        try {
            check(glNormal3d).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3dv(Addressable v) {
        try {
            check(glNormal3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        normal3dv(seg);
    }

    public static void normal3f(float nx, float ny, float nz) {
        try {
            check(glNormal3f).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3fv(Addressable v) {
        try {
            check(glNormal3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        normal3fv(seg);
    }

    public static void normal3i(int nx, int ny, int nz) {
        try {
            check(glNormal3i).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3iv(Addressable v) {
        try {
            check(glNormal3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        normal3iv(seg);
    }

    public static void normal3s(short nx, short ny, short nz) {
        try {
            check(glNormal3s).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3sv(Addressable v) {
        try {
            check(glNormal3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        normal3sv(seg);
    }

    public static void ortho(double left, double right, double bottom, double top, double zNear, double zFar) {
        try {
            check(glOrtho).invokeExact(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void passThrough(float token) {
        try {
            check(glPassThrough).invokeExact(token);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapfv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapfv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapfv(SegmentAllocator allocator, int map, int mapSize, float[] values) {
        var seg = allocator.allocateArray(JAVA_FLOAT, mapSize);
        for (int i = 0; i < mapSize; i++) {
            seg.setAtIndex(JAVA_FLOAT, i, values[i]);
        }
        pixelMapfv(map, mapSize, seg);
    }

    public static void pixelMapfv(SegmentAllocator allocator, int map, float[] values) {
        var seg = allocator.allocateArray(JAVA_FLOAT, values);
        pixelMapfv(map, values.length, seg);
    }

    public static void pixelMapuiv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapuiv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapuiv(SegmentAllocator allocator, int map, int mapSize, int[] values) {
        var seg = allocator.allocateArray(JAVA_INT, mapSize);
        for (int i = 0; i < mapSize; i++) {
            seg.setAtIndex(JAVA_INT, i, values[i]);
        }
        pixelMapuiv(map, mapSize, seg);
    }

    public static void pixelMapuiv(SegmentAllocator allocator, int map, int[] values) {
        var seg = allocator.allocateArray(JAVA_INT, values);
        pixelMapuiv(map, values.length, seg);
    }

    public static void pixelMapusv(int map, int mapSize, Addressable values) {
        try {
            check(glPixelMapusv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapusv(SegmentAllocator allocator, int map, int mapSize, short[] values) {
        var seg = allocator.allocateArray(JAVA_SHORT, mapSize);
        for (int i = 0; i < mapSize; i++) {
            seg.setAtIndex(JAVA_SHORT, i, values[i]);
        }
        pixelMapusv(map, mapSize, seg);
    }

    public static void pixelMapusv(SegmentAllocator allocator, int map, short[] values) {
        var seg = allocator.allocateArray(JAVA_SHORT, values);
        pixelMapusv(map, values.length, seg);
    }

    public static void pixelTransferf(int pname, float param) {
        try {
            check(glPixelTransferf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelTransferi(int pname, int param) {
        try {
            check(glPixelTransferi).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelZoom(float xfactor, float yfactor) {
        try {
            check(glPixelZoom).invokeExact(xfactor, yfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonStipple(Addressable mask) {
        try {
            check(glPolygonStipple).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonStipple(SegmentAllocator allocator, byte[] mask) {
        var seg = allocator.allocateArray(JAVA_BYTE, mask);
        polygonStipple(seg);
    }

    public static void popAttrib() {
        try {
            check(glPopAttrib).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void popMatrix() {
        try {
            check(glPopMatrix).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void popName() {
        try {
            check(glPopName).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushAttrib(int mask) {
        try {
            check(glPushAttrib).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushMatrix() {
        try {
            check(glPushMatrix).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushName(int name) {
        try {
            check(glPushName).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2d(double x, double y) {
        try {
            check(glRasterPos2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2dv(Addressable v) {
        try {
            check(glRasterPos2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        rasterPos2dv(seg);
    }

    public static void rasterPos2f(float x, float y) {
        try {
            check(glRasterPos2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2fv(Addressable v) {
        try {
            check(glRasterPos2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        rasterPos2fv(seg);
    }

    public static void rasterPos2i(int x, int y) {
        try {
            check(glRasterPos2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2iv(Addressable v) {
        try {
            check(glRasterPos2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        rasterPos2iv(seg);
    }

    public static void rasterPos2s(short x, short y) {
        try {
            check(glRasterPos2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2sv(Addressable v) {
        try {
            check(glRasterPos2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        rasterPos2sv(seg);
    }

    public static void rasterPos3d(double x, double y, double z) {
        try {
            check(glRasterPos3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3dv(Addressable v) {
        try {
            check(glRasterPos3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        rasterPos3dv(seg);
    }

    public static void rasterPos3f(float x, float y, float z) {
        try {
            check(glRasterPos3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3fv(Addressable v) {
        try {
            check(glRasterPos3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        rasterPos3fv(seg);
    }

    public static void rasterPos3i(int x, int y, int z) {
        try {
            check(glRasterPos3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3iv(Addressable v) {
        try {
            check(glRasterPos3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        rasterPos3iv(seg);
    }

    public static void rasterPos3s(short x, short y, short z) {
        try {
            check(glRasterPos3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3sv(Addressable v) {
        try {
            check(glRasterPos3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        rasterPos3sv(seg);
    }

    public static void rasterPos4d(double x, double y, double z, double w) {
        try {
            check(glRasterPos4d).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4dv(Addressable v) {
        try {
            check(glRasterPos4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        rasterPos4dv(seg);
    }

    public static void rasterPos4f(float x, float y, float z, float w) {
        try {
            check(glRasterPos4f).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4fv(Addressable v) {
        try {
            check(glRasterPos4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        rasterPos4fv(seg);
    }

    public static void rasterPos4i(int x, int y, int z, int w) {
        try {
            check(glRasterPos4i).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4iv(Addressable v) {
        try {
            check(glRasterPos4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        rasterPos4iv(seg);
    }

    public static void rasterPos4s(short x, short y, short z, short w) {
        try {
            check(glRasterPos4s).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4sv(Addressable v) {
        try {
            check(glRasterPos4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        rasterPos4sv(seg);
    }

    public static void rectd(double x1, double y1, double x2, double y2) {
        try {
            check(glRectd).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectdv(Addressable v1, Addressable v2) {
        try {
            check(glRectdv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectdv(SegmentAllocator allocator, double[] v1, double[] v2) {
        var seg1 = allocator.allocateArray(JAVA_DOUBLE, v1);
        var seg2 = allocator.allocateArray(JAVA_DOUBLE, v2);
        rectdv(seg1, seg2);
    }

    public static void rectf(float x1, float y1, float x2, float y2) {
        try {
            check(glRectf).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectfv(Addressable v1, Addressable v2) {
        try {
            check(glRectfv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectfv(SegmentAllocator allocator, float[] v1, float[] v2) {
        var seg1 = allocator.allocateArray(JAVA_FLOAT, v1);
        var seg2 = allocator.allocateArray(JAVA_FLOAT, v2);
        rectfv(seg1, seg2);
    }

    public static void recti(int x1, int y1, int x2, int y2) {
        try {
            check(glRecti).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectiv(Addressable v1, Addressable v2) {
        try {
            check(glRectiv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectiv(SegmentAllocator allocator, int[] v1, int[] v2) {
        var seg1 = allocator.allocateArray(JAVA_INT, v1);
        var seg2 = allocator.allocateArray(JAVA_INT, v2);
        rectiv(seg1, seg2);
    }

    public static void rects(short x1, short y1, short x2, short y2) {
        try {
            check(glRects).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectsv(Addressable v1, Addressable v2) {
        try {
            check(glRectsv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectsv(SegmentAllocator allocator, short[] v1, short[] v2) {
        var seg1 = allocator.allocateArray(JAVA_SHORT, v1);
        var seg2 = allocator.allocateArray(JAVA_SHORT, v2);
        rectsv(seg1, seg2);
    }

    public static int renderMode(int mode) {
        try {
            return (int) check(glRenderMode).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rotated(double angle, double x, double y, double z) {
        try {
            check(glRotated).invokeExact(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rotatef(float angle, float x, float y, float z) {
        try {
            check(glRotatef).invokeExact(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scaled(double x, double y, double z) {
        try {
            check(glScaled).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scalef(float x, float y, float z) {
        try {
            check(glScalef).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void selectBuffer(int size, Addressable buffer) {
        try {
            check(glSelectBuffer).invokeExact(size, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void selectBuffer(SegmentAllocator allocator, int[] buffer) {
        var seg = allocator.allocateArray(JAVA_INT, buffer.length);
        selectBuffer(buffer.length, seg);
        RuntimeHelper.toArray(seg, buffer);
    }

    public static void shadeModel(int mode) {
        try {
            check(glShadeModel).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1d(double s) {
        try {
            check(glTexCoord1d).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1dv(Addressable v) {
        try {
            check(glTexCoord1dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        texCoord1dv(seg);
    }

    public static void texCoord1f(float s) {
        try {
            check(glTexCoord1f).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1fv(Addressable v) {
        try {
            check(glTexCoord1fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        texCoord1fv(seg);
    }

    public static void texCoord1i(int s) {
        try {
            check(glTexCoord1i).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1iv(Addressable v) {
        try {
            check(glTexCoord1iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        texCoord1iv(seg);
    }

    public static void texCoord1s(short s) {
        try {
            check(glTexCoord1s).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1sv(Addressable v) {
        try {
            check(glTexCoord1sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        texCoord1sv(seg);
    }

    public static void texCoord2d(double s, double t) {
        try {
            check(glTexCoord2d).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2dv(Addressable v) {
        try {
            check(glTexCoord2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        texCoord2dv(seg);
    }

    public static void texCoord2f(float s, float t) {
        try {
            check(glTexCoord2f).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2fv(Addressable v) {
        try {
            check(glTexCoord2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        texCoord2fv(seg);
    }

    public static void texCoord2i(int s, int t) {
        try {
            check(glTexCoord2i).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2iv(Addressable v) {
        try {
            check(glTexCoord2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        texCoord2iv(seg);
    }

    public static void texCoord2s(short s, short t) {
        try {
            check(glTexCoord2s).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2sv(Addressable v) {
        try {
            check(glTexCoord2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        texCoord2sv(seg);
    }

    public static void texCoord3d(double s, double t, double r) {
        try {
            check(glTexCoord3d).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3dv(Addressable v) {
        try {
            check(glTexCoord3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        texCoord3dv(seg);
    }

    public static void texCoord3f(float s, float t, float r) {
        try {
            check(glTexCoord3f).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3fv(Addressable v) {
        try {
            check(glTexCoord3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        texCoord3fv(seg);
    }

    public static void texCoord3i(int s, int t, int r) {
        try {
            check(glTexCoord3i).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3iv(Addressable v) {
        try {
            check(glTexCoord3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        texCoord3iv(seg);
    }

    public static void texCoord3s(short s, short t, short r) {
        try {
            check(glTexCoord3s).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3sv(Addressable v) {
        try {
            check(glTexCoord3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        texCoord3sv(seg);
    }

    public static void texCoord4d(double s, double t, double r, double q) {
        try {
            check(glTexCoord4d).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4dv(Addressable v) {
        try {
            check(glTexCoord4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        texCoord4dv(seg);
    }

    public static void texCoord4f(float s, float t, float r, float q) {
        try {
            check(glTexCoord4f).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4fv(Addressable v) {
        try {
            check(glTexCoord4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        texCoord4fv(seg);
    }

    public static void texCoord4i(int s, int t, int r, int q) {
        try {
            check(glTexCoord4i).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4iv(Addressable v) {
        try {
            check(glTexCoord4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        texCoord4iv(seg);
    }

    public static void texCoord4s(short s, short t, short r, short q) {
        try {
            check(glTexCoord4s).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4sv(Addressable v) {
        try {
            check(glTexCoord4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        texCoord4sv(seg);
    }

    public static void texEnvf(int target, int pname, float param) {
        try {
            check(glTexEnvf).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnvfv(int target, int pname, Addressable params) {
        try {
            check(glTexEnvfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnvfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params);
        texEnvfv(target, pname, seg);
    }

    public static void texEnvi(int target, int pname, int param) {
        try {
            check(glTexEnvi).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnviv(int target, int pname, Addressable params) {
        try {
            check(glTexEnviv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnviv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params);
        texEnviv(target, pname, seg);
    }

    public static void texGend(int coord, int pname, double param) {
        try {
            check(glTexGend).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGendv(int coord, int pname, Addressable params) {
        try {
            check(glTexGendv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGendv(SegmentAllocator allocator, int coord, int pname, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params);
        texGendv(coord, pname, seg);
    }

    public static void texGenf(int coord, int pname, float param) {
        try {
            check(glTexGenf).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGenfv(int coord, int pname, Addressable params) {
        try {
            check(glTexGenfv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGenfv(SegmentAllocator allocator, int coord, int pname, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params);
        texGenfv(coord, pname, seg);
    }

    public static void texGeni(int coord, int pname, int param) {
        try {
            check(glTexGeni).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGeniv(int coord, int pname, Addressable params) {
        try {
            check(glTexGeniv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGeniv(SegmentAllocator allocator, int coord, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params);
        texGeniv(coord, pname, seg);
    }

    public static void translated(double x, double y, double z) {
        try {
            check(glTranslated).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void translatef(float x, float y, float z) {
        try {
            check(glTranslatef).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2d(double x, double y) {
        try {
            check(glVertex2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2dv(Addressable v) {
        try {
            check(glVertex2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        vertex2dv(seg);
    }

    public static void vertex2f(float x, float y) {
        try {
            check(glVertex2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2fv(Addressable v) {
        try {
            check(glVertex2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        vertex2fv(seg);
    }

    public static void vertex2i(int x, int y) {
        try {
            check(glVertex2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2iv(Addressable v) {
        try {
            check(glVertex2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        vertex2iv(seg);
    }

    public static void vertex2s(short x, short y) {
        try {
            check(glVertex2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2sv(Addressable v) {
        try {
            check(glVertex2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        vertex2sv(seg);
    }

    public static void vertex3d(double x, double y, double z) {
        try {
            check(glVertex3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3dv(Addressable v) {
        try {
            check(glVertex3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        vertex3dv(seg);
    }

    public static void vertex3f(float x, float y, float z) {
        try {
            check(glVertex3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3fv(Addressable v) {
        try {
            check(glVertex3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        vertex3fv(seg);
    }

    public static void vertex3i(int x, int y, int z) {
        try {
            check(glVertex3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3iv(Addressable v) {
        try {
            check(glVertex3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        vertex3iv(seg);
    }

    public static void vertex3s(short x, short y, short z) {
        try {
            check(glVertex3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3sv(Addressable v) {
        try {
            check(glVertex3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        vertex3sv(seg);
    }

    public static void vertex4d(double x, double y, double z, double w) {
        try {
            check(glVertex4d).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4dv(Addressable v) {
        try {
            check(glVertex4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4dv(SegmentAllocator allocator, double[] v) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, v);
        vertex4dv(seg);
    }

    public static void vertex4f(float x, float y, float z, float w) {
        try {
            check(glVertex4f).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4fv(Addressable v) {
        try {
            check(glVertex4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4fv(SegmentAllocator allocator, float[] v) {
        var seg = allocator.allocateArray(JAVA_FLOAT, v);
        vertex4fv(seg);
    }

    public static void vertex4i(int x, int y, int z, int w) {
        try {
            check(glVertex4i).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4iv(Addressable v) {
        try {
            check(glVertex4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4iv(SegmentAllocator allocator, int[] v) {
        var seg = allocator.allocateArray(JAVA_INT, v);
        vertex4iv(seg);
    }

    public static void vertex4s(short x, short y, short z, short w) {
        try {
            check(glVertex4s).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4sv(Addressable v) {
        try {
            check(glVertex4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4sv(SegmentAllocator allocator, short[] v) {
        var seg = allocator.allocateArray(JAVA_SHORT, v);
        vertex4sv(seg);
    }
}
