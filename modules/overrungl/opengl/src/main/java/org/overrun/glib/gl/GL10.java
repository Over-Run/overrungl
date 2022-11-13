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
import java.lang.foreign.MemorySession;
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
