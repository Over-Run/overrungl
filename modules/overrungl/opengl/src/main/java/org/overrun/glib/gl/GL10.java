package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.0 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
//todo
@SuppressWarnings("unused")
public class GL10 extends GL10C {
    @Nullable
    public static MethodHandle
        glAccum, glAlphaFunc,
        glBegin, glBitmap,
        glCallList, glCallLists,
        glClearAccum, glClearIndex,
        glClipPlane,
        glColor3b, glColor3bv,
        glColor3d, glColor3dv,
        glColor3f, glColor3fv,
        glColor3i, glColor3iv,
        glColor3s, glColor3sv,
        glColor3ub, glColor3ubv,
        glColor3ui, glColor3uiv,
        glColor3us, glColor3usv,
        glColor4b, glColor4bv,
        glColor4d, glColor4dv,
        glColor4f, glColor4fv,
        glColor4i, glColor4iv,
        glColor4s, glColor4sv,
        glColor4ub, glColor4ubv,
        glColor4ui, glColor4uiv,
        glColor4us, glColor4usv,
        glColorMaterial, glCopyPixels,
        glDeleteLists, glDrawPixels,
        glEdgeFlag, glEdgeFlagv,
        glEnd, glEndList,
        glEvalCoord1d, glEvalCoord1dv,
        glEvalCoord1f, glEvalCoord1fv,
        glEvalCoord2d, glEvalCoord2dv,
        glEvalCoord2f, glEvalCoord2fv,
        glEvalMesh1, glEvalMesh2,
        glEvalPoint1, glEvalPoint2,
        glFeedbackBuffer,
        glFogf, glFogfv,
        glFogi, glFogiv,
        glFrustum,
        glGenLists, glGetClipPlane,
        glGetLightfv, glGetLightiv,
        glGetMapdv, glGetMapfv, glGetMapiv,
        glGetMaterialfv, glGetMaterialiv,
        glGetPixelMapfv, glGetPixelMapuiv, glGetPixelMapusv,
        glGetPolygonStipple,
        glGetTexEnvfv, glGetTexEnviv,
        glGetTexGendv, glGetTexGenfv, glGetTexGeniv,
        glIndexMask,
        glIndexd, glIndexdv,
        glIndexf, glIndexfv,
        glIndexi, glIndexiv,
        glIndexs, glIndexsv,
        glInitNames, glIsList,
        glLightModelf, glLightModelfv,
        glLightModeli, glLightModeliv,
        glLightf, glLightfv,
        glLighti, glLightiv,
        glLineStipple, glListBase,
        glLoadIdentity,
        glLoadMatrixd, glLoadMatrixf,
        glLoadName,
        glMap1d, glMap1f,
        glMap2d, glMap2f,
        glMapGrid1d, glMapGrid1f,
        glMapGrid2d, glMapGrid2f,
        glMaterialf, glMaterialfv,
        glMateriali, glMaterialiv,
        glMatrixMode,
        glMultMatrixd, glMultMatrixf,
        glNewList,
        glNormal3b, glNormal3bv,
        glNormal3d, glNormal3dv,
        glNormal3f, glNormal3fv,
        glNormal3i, glNormal3iv,
        glNormal3s, glNormal3sv,
        glOrtho,
        glPassThrough,
        glPixelMapfv, glPixelMapuiv, glPixelMapusv,
        glPixelTransferf, glPixelTransferi,
        glPixelZoom, glPolygonStipple,
        glPopAttrib, glPopMatrix, glPopName,
        glPushAttrib, glPushMatrix, glPushName,
        glRasterPos2d, glRasterPos2dv,
        glRasterPos2f, glRasterPos2fv,
        glRasterPos2i, glRasterPos2iv,
        glRasterPos2s, glRasterPos2sv,
        glRasterPos3d, glRasterPos3dv,
        glRasterPos3f, glRasterPos3fv,
        glRasterPos3i, glRasterPos3iv,
        glRasterPos3s, glRasterPos3sv,
        glRasterPos4d, glRasterPos4dv,
        glRasterPos4f, glRasterPos4fv,
        glRasterPos4i, glRasterPos4iv,
        glRasterPos4s, glRasterPos4sv,
        glRectd, glRectdv,
        glRectf, glRectfv,
        glRecti, glRectiv,
        glRects, glRectsv,
        glRenderMode,
        glRotated, glRotatef,
        glScaled, glScalef,
        glSelectBuffer, glShadeModel,
        glTexCoord1d, glTexCoord1dv,
        glTexCoord1f, glTexCoord1fv,
        glTexCoord1i, glTexCoord1iv,
        glTexCoord1s, glTexCoord1sv,
        glTexCoord2d, glTexCoord2dv,
        glTexCoord2f, glTexCoord2fv,
        glTexCoord2i, glTexCoord2iv,
        glTexCoord2s, glTexCoord2sv,
        glTexCoord3d, glTexCoord3dv,
        glTexCoord3f, glTexCoord3fv,
        glTexCoord3i, glTexCoord3iv,
        glTexCoord3s, glTexCoord3sv,
        glTexCoord4d, glTexCoord4dv,
        glTexCoord4f, glTexCoord4fv,
        glTexCoord4i, glTexCoord4iv,
        glTexCoord4s, glTexCoord4sv,
        glTexEnvf, glTexEnvfv,
        glTexEnvi, glTexEnviv,
        glTexGend, glTexGendv,
        glTexGenf, glTexGenfv,
        glTexGeni, glTexGeniv,
        glTranslated, glTranslatef,
        glVertex2d, glVertex2dv,
        glVertex2f, glVertex2fv,
        glVertex2i, glVertex2iv,
        glVertex2s, glVertex2sv,
        glVertex3d, glVertex3dv,
        glVertex3f, glVertex3fv,
        glVertex3i, glVertex3iv,
        glVertex3s, glVertex3sv,
        glVertex4d, glVertex4dv,
        glVertex4f, glVertex4fv,
        glVertex4i, glVertex4iv,
        glVertex4s, glVertex4sv;

    static void load(GLLoadFunc load) throws Throwable {
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
        glMap1d = downcallSafe(load.invoke("glMap1d"), );
        glMap1f = downcallSafe(load.invoke("glMap1f"), );
        glMap2d = downcallSafe(load.invoke("glMap2d"), );
        glMap2f = downcallSafe(load.invoke("glMap2f"), );
        glMapGrid1d = downcallSafe(load.invoke("glMapGrid1d"), );
        glMapGrid1f = downcallSafe(load.invoke("glMapGrid1f"), );
        glMapGrid2d = downcallSafe(load.invoke("glMapGrid2d"), );
        glMapGrid2f = downcallSafe(load.invoke("glMapGrid2f"), );
        glMaterialf = downcallSafe(load.invoke("glMaterialf"), );
        glMaterialfv = downcallSafe(load.invoke("glMaterialfv"), );
        glMateriali = downcallSafe(load.invoke("glMateriali"), );
        glMaterialiv = downcallSafe(load.invoke("glMaterialiv"), );
        glMatrixMode = downcallSafe(load.invoke("glMatrixMode"), );
        glMultMatrixd = downcallSafe(load.invoke("glMultMatrixd"), );
        glMultMatrixf = downcallSafe(load.invoke("glMultMatrixf"), );
        glNewList = downcallSafe(load.invoke("glNewList"), );
        glNormal3b = downcallSafe(load.invoke("glNormal3b"), );
        glNormal3bv = downcallSafe(load.invoke("glNormal3bv"), );
        glNormal3d = downcallSafe(load.invoke("glNormal3d"), );
        glNormal3dv = downcallSafe(load.invoke("glNormal3dv"), );
        glNormal3f = downcallSafe(load.invoke("glNormal3f"), );
        glNormal3fv = downcallSafe(load.invoke("glNormal3fv"), );
        glNormal3i = downcallSafe(load.invoke("glNormal3i"), );
        glNormal3iv = downcallSafe(load.invoke("glNormal3iv"), );
        glNormal3s = downcallSafe(load.invoke("glNormal3s"), );
        glNormal3sv = downcallSafe(load.invoke("glNormal3sv"), );
        glOrtho = downcallSafe(load.invoke("glOrtho"), );
        glPassThrough = downcallSafe(load.invoke("glPassThrough"), );
        glPixelMapfv = downcallSafe(load.invoke("glPixelMapfv"), );
        glPixelMapuiv = downcallSafe(load.invoke("glPixelMapuiv"), );
        glPixelMapusv = downcallSafe(load.invoke("glPixelMapusv"), );
        glPixelTransferf = downcallSafe(load.invoke("glPixelTransferf"), );
        glPixelTransferi = downcallSafe(load.invoke("glPixelTransferi"), );
        glPixelZoom = downcallSafe(load.invoke("glPixelZoom"), );
        glPolygonStipple = downcallSafe(load.invoke("glPolygonStipple"), );
        glPopAttrib = downcallSafe(load.invoke("glPopAttrib"), );
        glPopMatrix = downcallSafe(load.invoke("glPopMatrix"), );
        glPopName = downcallSafe(load.invoke("glPopName"), );
        glPushAttrib = downcallSafe(load.invoke("glPushAttrib"), );
        glPushMatrix = downcallSafe(load.invoke("glPushMatrix"), );
        glPushName = downcallSafe(load.invoke("glPushName"), );
        glRasterPos2d = downcallSafe(load.invoke("glRasterPos2d"), );
        glRasterPos2dv = downcallSafe(load.invoke("glRasterPos2dv"), );
        glRasterPos2f = downcallSafe(load.invoke("glRasterPos2f"), );
        glRasterPos2fv = downcallSafe(load.invoke("glRasterPos2fv"), );
        glRasterPos2i = downcallSafe(load.invoke("glRasterPos2i"), );
        glRasterPos2iv = downcallSafe(load.invoke("glRasterPos2iv"), );
        glRasterPos2s = downcallSafe(load.invoke("glRasterPos2s"), );
        glRasterPos2sv = downcallSafe(load.invoke("glRasterPos2sv"), );
        glRasterPos3d = downcallSafe(load.invoke("glRasterPos3d"), );
        glRasterPos3dv = downcallSafe(load.invoke("glRasterPos3dv"), );
        glRasterPos3f = downcallSafe(load.invoke("glRasterPos3f"), );
        glRasterPos3fv = downcallSafe(load.invoke("glRasterPos3fv"), );
        glRasterPos3i = downcallSafe(load.invoke("glRasterPos3i"), );
        glRasterPos3iv = downcallSafe(load.invoke("glRasterPos3iv"), );
        glRasterPos3s = downcallSafe(load.invoke("glRasterPos3s"), );
        glRasterPos3sv = downcallSafe(load.invoke("glRasterPos3sv"), );
        glRasterPos4d = downcallSafe(load.invoke("glRasterPos4d"), );
        glRasterPos4dv = downcallSafe(load.invoke("glRasterPos4dv"), );
        glRasterPos4f = downcallSafe(load.invoke("glRasterPos4f"), );
        glRasterPos4fv = downcallSafe(load.invoke("glRasterPos4fv"), );
        glRasterPos4i = downcallSafe(load.invoke("glRasterPos4i"), );
        glRasterPos4iv = downcallSafe(load.invoke("glRasterPos4iv"), );
        glRasterPos4s = downcallSafe(load.invoke("glRasterPos4s"), );
        glRasterPos4sv = downcallSafe(load.invoke("glRasterPos4sv"), );
        glRectd = downcallSafe(load.invoke("glRectd"), );
        glRectdv = downcallSafe(load.invoke("glRectdv"), );
        glRectf = downcallSafe(load.invoke("glRectf"), );
        glRectfv = downcallSafe(load.invoke("glRectfv"), );
        glRecti = downcallSafe(load.invoke("glRecti"), );
        glRectiv = downcallSafe(load.invoke("glRectiv"), );
        glRects = downcallSafe(load.invoke("glRects"), );
        glRectsv = downcallSafe(load.invoke("glRectsv"), );
        glRenderMode = downcallSafe(load.invoke("glRenderMode"), );
        glRotated = downcallSafe(load.invoke("glRotated"), );
        glRotatef = downcallSafe(load.invoke("glRotatef"), );
        glScaled = downcallSafe(load.invoke("glScaled"), );
        glScalef = downcallSafe(load.invoke("glScalef"), );
        glSelectBuffer = downcallSafe(load.invoke("glSelectBuffer"), );
        glShadeModel = downcallSafe(load.invoke("glShadeModel"), );
        glTexCoord1d = downcallSafe(load.invoke("glTexCoord1d"), );
        glTexCoord1dv = downcallSafe(load.invoke("glTexCoord1dv"), );
        glTexCoord1f = downcallSafe(load.invoke("glTexCoord1f"), );
        glTexCoord1fv = downcallSafe(load.invoke("glTexCoord1fv"), );
        glTexCoord1i = downcallSafe(load.invoke("glTexCoord1i"), );
        glTexCoord1iv = downcallSafe(load.invoke("glTexCoord1iv"), );
        glTexCoord1s = downcallSafe(load.invoke("glTexCoord1s"), );
        glTexCoord1sv = downcallSafe(load.invoke("glTexCoord1sv"), );
        glTexCoord2d = downcallSafe(load.invoke("glTexCoord2d"), );
        glTexCoord2dv = downcallSafe(load.invoke("glTexCoord2dv"), );
        glTexCoord2f = downcallSafe(load.invoke("glTexCoord2f"), );
        glTexCoord2fv = downcallSafe(load.invoke("glTexCoord2fv"), );
        glTexCoord2i = downcallSafe(load.invoke("glTexCoord2i"), );
        glTexCoord2iv = downcallSafe(load.invoke("glTexCoord2iv"), );
        glTexCoord2s = downcallSafe(load.invoke("glTexCoord2s"), );
        glTexCoord2sv = downcallSafe(load.invoke("glTexCoord2sv"), );
        glTexCoord3d = downcallSafe(load.invoke("glTexCoord3d"), );
        glTexCoord3dv = downcallSafe(load.invoke("glTexCoord3dv"), );
        glTexCoord3f = downcallSafe(load.invoke("glTexCoord3f"), );
        glTexCoord3fv = downcallSafe(load.invoke("glTexCoord3fv"), );
        glTexCoord3i = downcallSafe(load.invoke("glTexCoord3i"), );
        glTexCoord3iv = downcallSafe(load.invoke("glTexCoord3iv"), );
        glTexCoord3s = downcallSafe(load.invoke("glTexCoord3s"), );
        glTexCoord3sv = downcallSafe(load.invoke("glTexCoord3sv"), );
        glTexCoord4d = downcallSafe(load.invoke("glTexCoord4d"), );
        glTexCoord4dv = downcallSafe(load.invoke("glTexCoord4dv"), );
        glTexCoord4f = downcallSafe(load.invoke("glTexCoord4f"), );
        glTexCoord4fv = downcallSafe(load.invoke("glTexCoord4fv"), );
        glTexCoord4i = downcallSafe(load.invoke("glTexCoord4i"), );
        glTexCoord4iv = downcallSafe(load.invoke("glTexCoord4iv"), );
        glTexCoord4s = downcallSafe(load.invoke("glTexCoord4s"), );
        glTexCoord4sv = downcallSafe(load.invoke("glTexCoord4sv"), );
        glTexEnvf = downcallSafe(load.invoke("glTexEnvf"), );
        glTexEnvfv = downcallSafe(load.invoke("glTexEnvfv"), );
        glTexEnvi = downcallSafe(load.invoke("glTexEnvi"), );
        glTexEnviv = downcallSafe(load.invoke("glTexEnviv"), );
        glTexGend = downcallSafe(load.invoke("glTexGend"), );
        glTexGendv = downcallSafe(load.invoke("glTexGendv"), );
        glTexGenf = downcallSafe(load.invoke("glTexGenf"), );
        glTexGenfv = downcallSafe(load.invoke("glTexGenfv"), );
        glTexGeni = downcallSafe(load.invoke("glTexGeni"), );
        glTexGeniv = downcallSafe(load.invoke("glTexGeniv"), );
        glTranslated = downcallSafe(load.invoke("glTranslated"), );
        glTranslatef = downcallSafe(load.invoke("glTranslatef"), );
        glVertex2d = downcallSafe(load.invoke("glVertex2d"), );
        glVertex2dv = downcallSafe(load.invoke("glVertex2dv"), );
        glVertex2f = downcallSafe(load.invoke("glVertex2f"), );
        glVertex2fv = downcallSafe(load.invoke("glVertex2fv"), );
        glVertex2i = downcallSafe(load.invoke("glVertex2i"), );
        glVertex2iv = downcallSafe(load.invoke("glVertex2iv"), );
        glVertex2s = downcallSafe(load.invoke("glVertex2s"), );
        glVertex2sv = downcallSafe(load.invoke("glVertex2sv"), );
        glVertex3d = downcallSafe(load.invoke("glVertex3d"), );
        glVertex3dv = downcallSafe(load.invoke("glVertex3dv"), );
        glVertex3f = downcallSafe(load.invoke("glVertex3f"), );
        glVertex3fv = downcallSafe(load.invoke("glVertex3fv"), );
        glVertex3i = downcallSafe(load.invoke("glVertex3i"), );
        glVertex3iv = downcallSafe(load.invoke("glVertex3iv"), );
        glVertex3s = downcallSafe(load.invoke("glVertex3s"), );
        glVertex3sv = downcallSafe(load.invoke("glVertex3sv"), );
        glVertex4d = downcallSafe(load.invoke("glVertex4d"), );
        glVertex4dv = downcallSafe(load.invoke("glVertex4dv"), );
        glVertex4f = downcallSafe(load.invoke("glVertex4f"), );
        glVertex4fv = downcallSafe(load.invoke("glVertex4fv"), );
        glVertex4i = downcallSafe(load.invoke("glVertex4i"), );
        glVertex4iv = downcallSafe(load.invoke("glVertex4iv"), );
        glVertex4s = downcallSafe(load.invoke("glVertex4s"), );
        glVertex4sv = downcallSafe(load.invoke("glVertex4sv"), );
    }

    public static void accum(int op, float value) throws Throwable {
        check(glAccum).invoke(op, value);
    }

    public static void alphaFunc(int func, float ref) throws Throwable {
        check(glAlphaFunc).invoke(func, ref);
    }

    public static void begin(int mode) throws Throwable {
        check(glBegin).invoke(mode);
    }

    public static void bitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, MemoryAddress bitmap) throws Throwable {
        check(glBitmap).invoke(width, height, xorig, yorig, xmove, ymove, bitmap);
    }

    public static void callList(int list) throws Throwable {
        check(glCallList).invoke(list);
    }

    public static void callLists(int n, int type, MemoryAddress lists) throws Throwable {
        check(glCallLists).invoke(n, type, lists);
    }

    public static void clearAccum(float red, float green, float blue, float alpha) throws Throwable {
        check(glClearAccum).invoke(red, green, blue, alpha);
    }

    public static void clearIndex(float c) throws Throwable {
        check(glClearIndex).invoke(c);
    }

    public static void clipPlane(int plane, MemoryAddress equation) throws Throwable {
        check(glClipPlane).invoke(plane, equation);
    }

    public static void clipPlane(int plane, double[] equation) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pEq = session.allocateArray(JAVA_DOUBLE, equation);
            clipPlane(plane, pEq.address());
        }
    }


    public static void color3b(byte red, byte green, byte blue) throws Throwable {
        check(glColor3b).invoke(red, green, blue);
    }

    public static void color3bv(MemoryAddress v) throws Throwable {
        check(glColor3bv).invoke(v);
    }

    public static void color3bv(byte[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color3bv(pv.address());
        }
    }

    public static void color3d(double red, double green, double blue) throws Throwable {
        check(glColor3d).invoke(red, green, blue);
    }

    public static void color3dv(MemoryAddress v) throws Throwable {
        check(glColor3dv).invoke(v);
    }

    public static void color3dv(double[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v);
            color3dv(pv.address());
        }
    }

    public static void color3f(float red, float green, float blue) throws Throwable {
        check(glColor3f).invoke(red, green, blue);
    }

    public static void color3fv(MemoryAddress v) throws Throwable {
        check(glColor3fv).invoke(v);
    }

    public static void color3fv(float[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v);
            color3fv(pv.address());
        }
    }

    public static void color3i(int red, int green, int blue) throws Throwable {
        check(glColor3i).invoke(red, green, blue);
    }

    public static void color3iv(MemoryAddress v) throws Throwable {
        check(glColor3iv).invoke(v);
    }

    public static void color3iv(int[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color3iv(pv.address());
        }
    }

    public static void color3s(short red, short green, short blue) throws Throwable {
        check(glColor3s).invoke(red, green, blue);
    }

    public static void color3sv(MemoryAddress v) throws Throwable {
        check(glColor3sv).invoke(v);
    }

    public static void color3sv(short[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color3sv(pv.address());
        }
    }

    public static void color3ub(byte red, byte green, byte blue) throws Throwable {
        check(glColor3ub).invoke(red, green, blue);
    }

    public static void color3ubv(MemoryAddress v) throws Throwable {
        check(glColor3ubv).invoke(v);
    }

    public static void color3ubv(byte[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color3ubv(pv.address());
        }
    }

    public static void color3ui(int red, int green, int blue) throws Throwable {
        check(glColor3ui).invoke(red, green, blue);
    }

    public static void color3uiv(MemoryAddress v) throws Throwable {
        check(glColor3uiv).invoke(v);
    }

    public static void color3uiv(int[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color3uiv(pv.address());
        }
    }

    public static void color3us(short red, short green, short blue) throws Throwable {
        check(glColor3us).invoke(red, green, blue);
    }

    public static void color3usv(MemoryAddress v) throws Throwable {
        check(glColor3usv).invoke(v);
    }

    public static void color3usv(short[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color3usv(pv.address());
        }
    }

    public static void color4b(byte red, byte green, byte blue, byte alpha) throws Throwable {
        check(glColor4b).invoke(red, green, blue, alpha);
    }

    public static void color4bv(MemoryAddress v) throws Throwable {
        check(glColor4bv).invoke(v);
    }

    public static void color4bv(byte[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color4bv(pv.address());
        }
    }

    public static void color4d(double red, double green, double blue, double alpha) throws Throwable {
        check(glColor4d).invoke(red, green, blue, alpha);
    }

    public static void color4dv(MemoryAddress v) throws Throwable {
        check(glColor4dv).invoke(v);
    }

    public static void color4dv(double[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v);
            color4dv(pv.address());
        }
    }

    public static void color4f(float red, float green, float blue, float alpha) throws Throwable {
        check(glColor4f).invoke(red, green, blue, alpha);
    }

    public static void color4fv(MemoryAddress v) throws Throwable {
        check(glColor4fv).invoke(v);
    }

    public static void color4fv(float[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v);
            color4fv(pv.address());
        }
    }

    public static void color4i(int red, int green, int blue, int alpha) throws Throwable {
        check(glColor4i).invoke(red, green, blue, alpha);
    }

    public static void color4iv(MemoryAddress v) throws Throwable {
        check(glColor4iv).invoke(v);
    }

    public static void color4iv(int[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color4iv(pv.address());
        }
    }

    public static void color4s(short red, short green, short blue, short alpha) throws Throwable {
        check(glColor4s).invoke(red, green, blue, alpha);
    }

    public static void color4sv(MemoryAddress v) throws Throwable {
        check(glColor4sv).invoke(v);
    }

    public static void color4sv(short[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color4sv(pv.address());
        }
    }

    public static void color4ub(byte red, byte green, byte blue, byte alpha) throws Throwable {
        check(glColor4ub).invoke(red, green, blue, alpha);
    }

    public static void color4ubv(MemoryAddress v) throws Throwable {
        check(glColor4ubv).invoke(v);
    }

    public static void color4ubv(byte[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_BYTE, v);
            color4ubv(pv.address());
        }
    }

    public static void color4ui(int red, int green, int blue, int alpha) throws Throwable {
        check(glColor4ui).invoke(red, green, blue, alpha);
    }

    public static void color4uiv(MemoryAddress v) throws Throwable {
        check(glColor4uiv).invoke(v);
    }

    public static void color4uiv(int[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v);
            color4uiv(pv.address());
        }
    }

    public static void color4us(short red, short green, short blue, short alpha) throws Throwable {
        check(glColor4us).invoke(red, green, blue, alpha);
    }

    public static void color4usv(MemoryAddress v) throws Throwable {
        check(glColor4usv).invoke(v);
    }

    public static void color4usv(short[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_SHORT, v);
            color4usv(pv.address());
        }
    }

    public static void colorMaterial(int face, int mode) throws Throwable {
        check(glColorMaterial).invoke(face, mode);
    }

    public static void copyPixels(int x, int y, int width, int height, int type) throws Throwable {
        check(glCopyPixels).invoke(x, y, width, height, type);
    }

    public static void deleteLists(int list, int range) throws Throwable {
        check(glDeleteLists).invoke(list, range);
    }

    public static void drawPixels(int width, int height, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glDrawPixels).invoke(width, height, format, type, pixels);
    }

    public static void edgeFlag(boolean flag) throws Throwable {
        check(glEdgeFlag).invoke(flag);
    }

    public static void edgeFlagv(MemoryAddress flag) throws Throwable {
        check(glEdgeFlagv).invoke(flag);
    }

    public static void edgeFlagv(boolean[] flag) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pFlag = session.allocateArray(JAVA_BOOLEAN, flag.length);
            for (int i = 0; i < flag.length; i++) {
                pFlag.set(JAVA_BOOLEAN, i, flag[i]);
            }
            edgeFlagv(pFlag.address());
        }
    }

    public static void end() throws Throwable {
        check(glEnd).invoke();
    }

    public static void endList() throws Throwable {
        check(glEndList).invoke();
    }

    public static void evalCoord1d(double u) throws Throwable {
        check(glEvalCoord1d).invoke(u);
    }

    public static void evalCoord1dv(MemoryAddress u) throws Throwable {
        check(glEvalCoord1dv).invoke(u);
    }

    public static void evalCoord1dv(double[] u) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_DOUBLE, u);
            evalCoord1dv(pu.address());
        }
    }

    public static void evalCoord1f(float u) throws Throwable {
        check(glEvalCoord1f).invoke(u);
    }

    public static void evalCoord1fv(MemoryAddress u) throws Throwable {
        check(glEvalCoord1fv).invoke(u);
    }

    public static void evalCoord1fv(float[] u) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_FLOAT, u);
            evalCoord1fv(pu.address());
        }
    }

    public static void evalCoord2d(double u, double v) throws Throwable {
        check(glEvalCoord2d).invoke(u, v);
    }

    public static void evalCoord2dv(MemoryAddress u) throws Throwable {
        check(glEvalCoord2dv).invoke(u);
    }

    public static void evalCoord2dv(double[] u) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_DOUBLE, u);
            evalCoord2dv(pu.address());
        }
    }

    public static void evalCoord2f(float u, float v) throws Throwable {
        check(glEvalCoord2f).invoke(u, v);
    }

    public static void evalCoord2fv(MemoryAddress u) throws Throwable {
        check(glEvalCoord2fv).invoke(u);
    }

    public static void evalCoord2fv(float[] u) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pu = session.allocateArray(JAVA_FLOAT, u);
            evalCoord2fv(pu.address());
        }
    }

    public static void evalMesh1(int mode, int i1, int i2) throws Throwable {
        check(glEvalMesh1).invoke(mode, i1, i2);
    }

    public static void evalMesh2(int mode, int i1, int i2, int j1, int j2) throws Throwable {
        check(glEvalMesh2).invoke(mode, i1, i2, j1, j2);
    }

    public static void evalPoint1(int mode, int i) throws Throwable {
        check(glEvalPoint1).invoke(mode, i);
    }

    public static void evalPoint2(int mode, int i, int j) throws Throwable {
        check(glEvalPoint2).invoke(mode, i, j);
    }

    public static void feedbackBuffer(int size, int type, MemoryAddress buffer) throws Throwable {
        check(glFeedbackBuffer).invoke(size, type, buffer);
    }

    public static void feedbackBuffer(int size, int type, float[] buffer) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pBuffer = session.allocateArray(JAVA_FLOAT, size);
            feedbackBuffer(size, type, pBuffer.address());
            for (int i = 0; i < size; i++) {
                buffer[i] = pBuffer.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static void feedbackBuffer(int type, float[] buffer) throws Throwable {
        feedbackBuffer(buffer.length, type, buffer);
    }

    public static void fogf(int pname, float param) throws Throwable {
        check(glFogf).invoke(pname, param);
    }

    public static void fogfv(int pname, MemoryAddress params) throws Throwable {
        check(glFogfv).invoke(pname, params);
    }

    public static void fogfv(int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParam = session.allocateArray(JAVA_FLOAT, params);
            fogfv(pname, pParam.address());
        }
    }

    public static void fogi(int pname, int param) throws Throwable {
        check(glFogi).invoke(pname, param);
    }

    public static void fogiv(int pname, MemoryAddress params) throws Throwable {
        check(glFogiv).invoke(pname, params);
    }

    public static void fogiv(int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParam = session.allocateArray(JAVA_INT, params);
            fogiv(pname, pParam.address());
        }
    }

    public static void frustum(double left, double right, double bottom, double top, double zNear, double zFar) throws Throwable {
        check(glFrustum).invoke(left, right, bottom, top, zNear, zFar);
    }

    public static int genLists(int range) throws Throwable {
        return (int) check(glGenLists).invoke(range);
    }

    public static void getClipPlane(int plane, MemoryAddress equation) throws Throwable {
        check(glGetClipPlane).invoke(plane, equation);
    }

    public static double[] getClipPlane(int plane) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pEq = session.allocateArray(JAVA_DOUBLE, 4L);
            getClipPlane(plane, pEq.address());
            return new double[]{
                pEq.get(JAVA_DOUBLE, 0L),
                pEq.getAtIndex(JAVA_DOUBLE, 1L),
                pEq.getAtIndex(JAVA_DOUBLE, 2L),
                pEq.getAtIndex(JAVA_DOUBLE, 3L)
            };
        }
    }

    public static void getLightfv(int light, int pname, MemoryAddress params) throws Throwable {
        check(glGetLightfv).invoke(light, pname, params);
    }

    public static void getLightfv(int light, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getLightfv(light, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getLightf(int light, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getLightfv(light, pname, pParams.address());
            return pParams.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getLightiv(int light, int pname, MemoryAddress params) throws Throwable {
        check(glGetLightiv).invoke(light, pname, params);
    }

    public static void getLightiv(int light, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getLightiv(light, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getLighti(int light, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getLightiv(light, pname, pParams.address());
            return pParams.get(JAVA_INT, 0L);
        }
    }

    public static void getMapdv(int target, int query, MemoryAddress v) throws Throwable {
        check(glGetMapdv).invoke(target, query, v);
    }

    public static void getMapdv(int target, int query, double[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_DOUBLE, v.length);
            getMapdv(target, query, pv.address());
            for (int i = 0; i < v.length; i++) {
                v[i] = pv.getAtIndex(JAVA_DOUBLE, i);
            }
        }
    }

    public static double getMapdv(int target, int query) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_DOUBLE);
            getMapdv(target, query, pv.address());
            return pv.get(JAVA_DOUBLE, 0L);
        }
    }

    public static void getMapfv(int target, int query, MemoryAddress v) throws Throwable {
        check(glGetMapfv).invoke(target, query, v);
    }

    public static void getMapfv(int target, int query, float[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_FLOAT, v.length);
            getMapfv(target, query, pv.address());
            for (int i = 0; i < v.length; i++) {
                v[i] = pv.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getMapfv(int target, int query) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_FLOAT);
            getMapfv(target, query, pv.address());
            return pv.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getMapiv(int target, int query, MemoryAddress v) throws Throwable {
        check(glGetMapiv).invoke(target, query, v);
    }

    public static void getMapiv(int target, int query, int[] v) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocateArray(JAVA_INT, v.length);
            getMapiv(target, query, pv.address());
            for (int i = 0; i < v.length; i++) {
                v[i] = pv.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getMapiv(int target, int query) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pv = session.allocate(JAVA_INT);
            getMapiv(target, query, pv.address());
            return pv.get(JAVA_INT, 0L);
        }
    }

    public static void getMaterialfv(int face, int pname, MemoryAddress params) throws Throwable {
        check(glGetMaterialfv).invoke(face, pname, params);
    }

    public static void getMaterialfv(int face, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getMaterialfv(face, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getMaterialf(int face, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getMaterialfv(face, pname, pParams.address());
            return pParams.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getMaterialiv(int face, int pname, MemoryAddress params) throws Throwable {
        check(glGetMaterialiv).invoke(face, pname, params);
    }

    public static void getMaterialiv(int face, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getMaterialiv(face, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getMateriali(int face, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getMaterialiv(face, pname, pParams.address());
            return pParams.get(JAVA_INT, 0L);
        }
    }

    public static void getPixelMapfv(int map, MemoryAddress values) throws Throwable {
        check(glGetPixelMapfv).invoke(map, values);
    }

    public static void getPixelMapfv(int map, float[] values) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_FLOAT, values.length);
            getPixelMapfv(map, pValues.address());
            for (int i = 0; i < values.length; i++) {
                values[i] = pValues.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static void getPixelMapuiv(int map, MemoryAddress values) throws Throwable {
        check(glGetPixelMapuiv).invoke(map, values);
    }

    public static void getPixelMapuiv(int map, int[] values) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_INT, values.length);
            getPixelMapuiv(map, pValues.address());
            for (int i = 0; i < values.length; i++) {
                values[i] = pValues.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static void getPixelMapusv(int map, MemoryAddress values) throws Throwable {
        check(glGetPixelMapusv).invoke(map, values);
    }

    public static void getPixelMapusv(int map, short[] values) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pValues = session.allocateArray(JAVA_SHORT, values.length);
            getPixelMapusv(map, pValues.address());
            for (int i = 0; i < values.length; i++) {
                values[i] = pValues.getAtIndex(JAVA_SHORT, i);
            }
        }
    }

    public static void getPolygonStipple(MemoryAddress mask) throws Throwable {
        check(glGetPolygonStipple).invoke(mask);
    }

    public static void getPolygonStipple(byte[] mask) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pMask = session.allocateArray(JAVA_BYTE, mask.length);
            getPolygonStipple(pMask.address());
            for (int i = 0; i < mask.length; i++) {
                mask[i] = pMask.get(JAVA_BYTE, i);
            }
        }
    }

    public static void getTexEnvfv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexEnvfv).invoke(target, pname, params);
    }

    public static void getTexEnvfv(int target, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexEnvfv(target, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getTexEnvf(int target, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTexEnvfv(target, pname, pParams.address());
            return pParams.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getTexEnviv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexEnviv).invoke(target, pname, params);
    }

    public static void getTexEnviv(int target, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexEnviv(target, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getTexEnvi(int target, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTexEnviv(target, pname, pParams.address());
            return pParams.get(JAVA_INT, 0L);
        }
    }

    public static void getTexGendv(int coord, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexGendv).invoke(coord, pname, params);
    }

    public static void getTexGendv(int coord, int pname, double[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_DOUBLE, params.length);
            getTexGendv(coord, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_DOUBLE, i);
            }
        }
    }

    public static void getTexGenfv(int coord, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexGenfv).invoke(coord, pname, params);
    }

    public static void getTexGenfv(int coord, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexGenfv(coord, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static void getTexGeniv(int coord, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexGeniv).invoke(coord, pname, params);
    }

    public static void getTexGeniv(int coord, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexGeniv(coord, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static void indexMask(int mask) throws Throwable {
        check(glIndexMask).invoke(mask);
    }

    public static void indexd(double c) throws Throwable {
        check(glIndexd).invoke(c);
    }

    public static void indexdv(MemoryAddress c) throws Throwable {
        check(glIndexdv).invoke(c);
    }

    public static void indexdv(double[] c) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_DOUBLE, c);
            indexdv(pc.address());
        }
    }

    public static void indexf(float c) throws Throwable {
        check(glIndexf).invoke(c);
    }

    public static void indexfv(MemoryAddress c) throws Throwable {
        check(glIndexfv).invoke(c);
    }

    public static void indexfv(float[] c) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_FLOAT, c);
            indexfv(pc.address());
        }
    }

    public static void indexi(int c) throws Throwable {
        check(glIndexi).invoke(c);
    }

    public static void indexiv(MemoryAddress c) throws Throwable {
        check(glIndexiv).invoke(c);
    }

    public static void indexiv(int[] c) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_INT, c);
            indexiv(pc.address());
        }
    }

    public static void indexs(short c) throws Throwable {
        check(glIndexs).invoke(c);
    }

    public static void indexsv(MemoryAddress c) throws Throwable {
        check(glIndexsv).invoke(c);
    }

    public static void indexsv(short[] c) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_SHORT, c);
            indexsv(pc.address());
        }
    }

    public static void initNames() throws Throwable {
        check(glInitNames).invoke();
    }

    public static boolean isList(int list) throws Throwable {
        return (boolean) check(glIsList).invoke(list);
    }

    public static void lightModelf(int pname, float param) throws Throwable {
        check(glLightModelf).invoke(pname, param);
    }

    public static void lightModelfv(int pname, MemoryAddress params) throws Throwable {
        check(glLightModelfv).invoke(pname, params);
    }

    public static void lightModelfv(int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params);
            lightModelfv(pname, pParams.address());
        }
    }

    public static void lightModeli(int pname, int param) throws Throwable {
        check(glLightModeli).invoke(pname, param);
    }

    public static void lightModeliv(int pname, MemoryAddress params) throws Throwable {
        check(glLightModeliv).invoke(pname, params);
    }

    public static void lightModeliv(int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params);
            lightModeliv(pname, pParams.address());
        }
    }

    public static void lightf(int light, int pname, float param) throws Throwable {
        check(glLightf).invoke(light, pname, param);
    }

    public static void lightfv(int light, int pname, MemoryAddress params) throws Throwable {
        check(glLightfv).invoke(light, pname, params);
    }

    public static void lightfv(int light, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params);
            lightfv(light, pname, pParams.address());
        }
    }

    public static void lighti(int light, int pname, int param) throws Throwable {
        check(glLighti).invoke(light, pname, param);
    }

    public static void lightiv(int light, int pname, MemoryAddress params) throws Throwable {
        check(glLightiv).invoke(light, pname, params);
    }

    public static void lightiv(int light, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params);
            lightiv(light, pname, pParams.address());
        }
    }

    public static void lineStipple(int factor, short pattern) throws Throwable {
        check(glLineStipple).invoke(factor, pattern);
    }

    public static void listBase(int base) throws Throwable {
        check(glListBase).invoke(base);
    }

    public static void loadIdentity() throws Throwable {
        check(glLoadIdentity).invoke();
    }

    public static void loadMatrixd(MemoryAddress m) throws Throwable {
        check(glLoadMatrixd).invoke(m);
    }

    public static void loadMatrixd(double[] m) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pm = session.allocateArray(JAVA_DOUBLE, m);
            loadMatrixd(pm.address());
        }
    }

    public static void loadMatrixf(MemoryAddress m) throws Throwable {
        check(glLoadMatrixf).invoke(m);
    }

    public static void loadMatrixf(float[] m) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pm = session.allocateArray(JAVA_FLOAT, m);
            loadMatrixf(pm.address());
        }
    }

    public static void loadName(int name) throws Throwable {
        check(glLoadName).invoke(name);
    }
}
