/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl;

import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.check;
import static overrungl.opengl.GLLoader.getCapabilities;

/**
 * The OpenGL 1.0 functions.
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public final class GL10 extends GL10C {
    static void load(GLCapabilities caps, GLLoadFunc load) {
        if (!caps.Ver10) return;
        caps.glAccum = load.invoke("glAccum", IFV);
        caps.glAlphaFunc = load.invoke("glAlphaFunc", IFV);
        caps.glBegin = load.invoke("glBegin", IV);
        caps.glBitmap = load.invoke("glBitmap", IIFFFFPV);
        caps.glCallList = load.invoke("glCallList", IV);
        caps.glCallLists = load.invoke("glCallLists", IIPV);
        caps.glClearAccum = load.invoke("glClearAccum", FFFFV);
        caps.glClearIndex = load.invoke("glClearIndex", FV);
        caps.glClipPlane = load.invoke("glClipPlane", IPV);
        caps.glColor3b = load.invoke("glColor3b", BBBV);
        caps.glColor3bv = load.invoke("glColor3bv", PV);
        caps.glColor3d = load.invoke("glColor3d", DDDV);
        caps.glColor3dv = load.invoke("glColor3dv", PV);
        caps.glColor3f = load.invoke("glColor3f", FFFV);
        caps.glColor3fv = load.invoke("glColor3fv", PV);
        caps.glColor3i = load.invoke("glColor3i", IIIV);
        caps.glColor3iv = load.invoke("glColor3iv", PV);
        caps.glColor3s = load.invoke("glColor3s", SSSV);
        caps.glColor3sv = load.invoke("glColor3sv", PV);
        caps.glColor3ub = load.invoke("glColor3ub", BBBV);
        caps.glColor3ubv = load.invoke("glColor3ubv", PV);
        caps.glColor3ui = load.invoke("glColor3ui", IIIV);
        caps.glColor3uiv = load.invoke("glColor3uiv", PV);
        caps.glColor3us = load.invoke("glColor3us", SSSV);
        caps.glColor3usv = load.invoke("glColor3usv", PV);
        caps.glColor4b = load.invoke("glColor4b", BBBBV);
        caps.glColor4bv = load.invoke("glColor4bv", PV);
        caps.glColor4d = load.invoke("glColor4d", DDDDV);
        caps.glColor4dv = load.invoke("glColor4dv", PV);
        caps.glColor4f = load.invoke("glColor4f", FFFFV);
        caps.glColor4fv = load.invoke("glColor4fv", PV);
        caps.glColor4i = load.invoke("glColor4i", IIIIV);
        caps.glColor4iv = load.invoke("glColor4iv", PV);
        caps.glColor4s = load.invoke("glColor4s", SSSSV);
        caps.glColor4sv = load.invoke("glColor4sv", PV);
        caps.glColor4ub = load.invoke("glColor4ub", BBBBV);
        caps.glColor4ubv = load.invoke("glColor4ubv", PV);
        caps.glColor4ui = load.invoke("glColor4ui", IIIIV);
        caps.glColor4uiv = load.invoke("glColor4uiv", PV);
        caps.glColor4us = load.invoke("glColor4us", SSSSV);
        caps.glColor4usv = load.invoke("glColor4usv", PV);
        caps.glColorMaterial = load.invoke("glColorMaterial", IIV);
        caps.glCopyPixels = load.invoke("glCopyPixels", IIIIIV);
        caps.glDeleteLists = load.invoke("glDeleteLists", IIV);
        caps.glDrawPixels = load.invoke("glDrawPixels", IIIIPV);
        caps.glEdgeFlag = load.invoke("glEdgeFlag", ZV);
        caps.glEdgeFlagv = load.invoke("glEdgeFlagv", PV);
        caps.glEnd = load.invoke("glEnd", V);
        caps.glEndList = load.invoke("glEndList", V);
        caps.glEvalCoord1d = load.invoke("glEvalCoord1d", DV);
        caps.glEvalCoord1dv = load.invoke("glEvalCoord1dv", PV);
        caps.glEvalCoord1f = load.invoke("glEvalCoord1f", FV);
        caps.glEvalCoord1fv = load.invoke("glEvalCoord1fv", PV);
        caps.glEvalCoord2d = load.invoke("glEvalCoord2d", DDV);
        caps.glEvalCoord2dv = load.invoke("glEvalCoord2dv", PV);
        caps.glEvalCoord2f = load.invoke("glEvalCoord2f", FFV);
        caps.glEvalCoord2fv = load.invoke("glEvalCoord2fv", PV);
        caps.glEvalMesh1 = load.invoke("glEvalMesh1", IIIV);
        caps.glEvalMesh2 = load.invoke("glEvalMesh2", IIIIIV);
        caps.glEvalPoint1 = load.invoke("glEvalPoint1", IV);
        caps.glEvalPoint2 = load.invoke("glEvalPoint2", IIV);
        caps.glFeedbackBuffer = load.invoke("glFeedbackBuffer", IIPV);
        caps.glFogf = load.invoke("glFogf", IFV);
        caps.glFogfv = load.invoke("glFogfv", IPV);
        caps.glFogi = load.invoke("glFogi", IIV);
        caps.glFogiv = load.invoke("glFogiv", IPV);
        caps.glFrustum = load.invoke("glFrustum", DDDDDDV);
        caps.glGenLists = load.invoke("glGenLists", II);
        caps.glGetClipPlane = load.invoke("glGetClipPlane", IPV);
        caps.glGetLightfv = load.invoke("glGetLightfv", IIPV);
        caps.glGetLightiv = load.invoke("glGetLightiv", IIPV);
        caps.glGetMapdv = load.invoke("glGetMapdv", IIPV);
        caps.glGetMapfv = load.invoke("glGetMapfv", IIPV);
        caps.glGetMapiv = load.invoke("glGetMapiv", IIPV);
        caps.glGetMaterialfv = load.invoke("glGetMaterialfv", IIPV);
        caps.glGetMaterialiv = load.invoke("glGetMaterialiv", IIPV);
        caps.glGetPixelMapfv = load.invoke("glGetPixelMapfv", IPV);
        caps.glGetPixelMapuiv = load.invoke("glGetPixelMapuiv", IPV);
        caps.glGetPixelMapusv = load.invoke("glGetPixelMapusv", IPV);
        caps.glGetPolygonStipple = load.invoke("glGetPolygonStipple", PV);
        caps.glGetTexEnvfv = load.invoke("glGetTexEnvfv", IIPV);
        caps.glGetTexEnviv = load.invoke("glGetTexEnviv", IIPV);
        caps.glGetTexGendv = load.invoke("glGetTexGendv", IIPV);
        caps.glGetTexGenfv = load.invoke("glGetTexGenfv", IIPV);
        caps.glGetTexGeniv = load.invoke("glGetTexGeniv", IIPV);
        caps.glIndexMask = load.invoke("glIndexMask", IV);
        caps.glIndexd = load.invoke("glIndexd", DV);
        caps.glIndexdv = load.invoke("glIndexdv", PV);
        caps.glIndexf = load.invoke("glIndexf", FV);
        caps.glIndexfv = load.invoke("glIndexfv", PV);
        caps.glIndexi = load.invoke("glIndexi", IV);
        caps.glIndexiv = load.invoke("glIndexiv", PV);
        caps.glIndexs = load.invoke("glIndexs", SV);
        caps.glIndexsv = load.invoke("glIndexsv", PV);
        caps.glInitNames = load.invoke("glInitNames", V);
        caps.glIsList = load.invoke("glIsList", IZ);
        caps.glLightModelf = load.invoke("glLightModelf", IFV);
        caps.glLightModelfv = load.invoke("glLightModelfv", IPV);
        caps.glLightModeli = load.invoke("glLightModeli", IIV);
        caps.glLightModeliv = load.invoke("glLightModeliv", IPV);
        caps.glLightf = load.invoke("glLightf", IIFV);
        caps.glLightfv = load.invoke("glLightfv", IIPV);
        caps.glLighti = load.invoke("glLighti", IIIV);
        caps.glLightiv = load.invoke("glLightiv", IIPV);
        caps.glLineStipple = load.invoke("glLineStipple", ISV);
        caps.glListBase = load.invoke("glListBase", IV);
        caps.glLoadIdentity = load.invoke("glLoadIdentity", V);
        caps.glLoadMatrixd = load.invoke("glLoadMatrixd", PV);
        caps.glLoadMatrixf = load.invoke("glLoadMatrixf", PV);
        caps.glLoadName = load.invoke("glLoadName", IV);
        caps.glMap1d = load.invoke("glMap1d", IDDIIPV);
        caps.glMap1f = load.invoke("glMap1f", IFFIIPV);
        caps.glMap2d = load.invoke("glMap2d", IDDIIDDIIPV);
        caps.glMap2f = load.invoke("glMap2f", IFFIIFFIIPV);
        caps.glMapGrid1d = load.invoke("glMapGrid1d", IDDV);
        caps.glMapGrid1f = load.invoke("glMapGrid1f", IFFV);
        caps.glMapGrid2d = load.invoke("glMapGrid2d", IDDIDDV);
        caps.glMapGrid2f = load.invoke("glMapGrid2f", IFFIFFV);
        caps.glMaterialf = load.invoke("glMaterialf", IIFV);
        caps.glMaterialfv = load.invoke("glMaterialfv", IIPV);
        caps.glMateriali = load.invoke("glMateriali", IIIV);
        caps.glMaterialiv = load.invoke("glMaterialiv", IIPV);
        caps.glMatrixMode = load.invoke("glMatrixMode", IV);
        caps.glMultMatrixd = load.invoke("glMultMatrixd", PV);
        caps.glMultMatrixf = load.invoke("glMultMatrixf", PV);
        caps.glNewList = load.invoke("glNewList", IIV);
        caps.glNormal3b = load.invoke("glNormal3b", BBBV);
        caps.glNormal3bv = load.invoke("glNormal3bv", PV);
        caps.glNormal3d = load.invoke("glNormal3d", DDDV);
        caps.glNormal3dv = load.invoke("glNormal3dv", PV);
        caps.glNormal3f = load.invoke("glNormal3f", FFFV);
        caps.glNormal3fv = load.invoke("glNormal3fv", PV);
        caps.glNormal3i = load.invoke("glNormal3i", IIIV);
        caps.glNormal3iv = load.invoke("glNormal3iv", PV);
        caps.glNormal3s = load.invoke("glNormal3s", SSSV);
        caps.glNormal3sv = load.invoke("glNormal3sv", PV);
        caps.glOrtho = load.invoke("glOrtho", DDDDDDV);
        caps.glPassThrough = load.invoke("glPassThrough", FV);
        caps.glPixelMapfv = load.invoke("glPixelMapfv", IIPV);
        caps.glPixelMapuiv = load.invoke("glPixelMapuiv", IIPV);
        caps.glPixelMapusv = load.invoke("glPixelMapusv", IIPV);
        caps.glPixelTransferf = load.invoke("glPixelTransferf", IFV);
        caps.glPixelTransferi = load.invoke("glPixelTransferi", IIV);
        caps.glPixelZoom = load.invoke("glPixelZoom", FFV);
        caps.glPolygonStipple = load.invoke("glPolygonStipple", PV);
        caps.glPopAttrib = load.invoke("glPopAttrib", V);
        caps.glPopMatrix = load.invoke("glPopMatrix", V);
        caps.glPopName = load.invoke("glPopName", V);
        caps.glPushAttrib = load.invoke("glPushAttrib", IV);
        caps.glPushMatrix = load.invoke("glPushMatrix", V);
        caps.glPushName = load.invoke("glPushName", IV);
        caps.glRasterPos2d = load.invoke("glRasterPos2d", DDV);
        caps.glRasterPos2dv = load.invoke("glRasterPos2dv", PV);
        caps.glRasterPos2f = load.invoke("glRasterPos2f", FFV);
        caps.glRasterPos2fv = load.invoke("glRasterPos2fv", PV);
        caps.glRasterPos2i = load.invoke("glRasterPos2i", IIV);
        caps.glRasterPos2iv = load.invoke("glRasterPos2iv", PV);
        caps.glRasterPos2s = load.invoke("glRasterPos2s", SSV);
        caps.glRasterPos2sv = load.invoke("glRasterPos2sv", PV);
        caps.glRasterPos3d = load.invoke("glRasterPos3d", DDDV);
        caps.glRasterPos3dv = load.invoke("glRasterPos3dv", PV);
        caps.glRasterPos3f = load.invoke("glRasterPos3f", FFFV);
        caps.glRasterPos3fv = load.invoke("glRasterPos3fv", PV);
        caps.glRasterPos3i = load.invoke("glRasterPos3i", IIIV);
        caps.glRasterPos3iv = load.invoke("glRasterPos3iv", PV);
        caps.glRasterPos3s = load.invoke("glRasterPos3s", SSSV);
        caps.glRasterPos3sv = load.invoke("glRasterPos3sv", PV);
        caps.glRasterPos4d = load.invoke("glRasterPos4d", DDDDV);
        caps.glRasterPos4dv = load.invoke("glRasterPos4dv", PV);
        caps.glRasterPos4f = load.invoke("glRasterPos4f", FFFFV);
        caps.glRasterPos4fv = load.invoke("glRasterPos4fv", PV);
        caps.glRasterPos4i = load.invoke("glRasterPos4i", IIIIV);
        caps.glRasterPos4iv = load.invoke("glRasterPos4iv", PV);
        caps.glRasterPos4s = load.invoke("glRasterPos4s", SSSSV);
        caps.glRasterPos4sv = load.invoke("glRasterPos4sv", PV);
        caps.glRectd = load.invoke("glRectd", DDDDV);
        caps.glRectdv = load.invoke("glRectdv", PPV);
        caps.glRectf = load.invoke("glRectf", FFFFV);
        caps.glRectfv = load.invoke("glRectfv", PPV);
        caps.glRecti = load.invoke("glRecti", IIIIV);
        caps.glRectiv = load.invoke("glRectiv", PPV);
        caps.glRects = load.invoke("glRects", SSSSV);
        caps.glRectsv = load.invoke("glRectsv", PPV);
        caps.glRenderMode = load.invoke("glRenderMode", II);
        caps.glRotated = load.invoke("glRotated", DDDDV);
        caps.glRotatef = load.invoke("glRotatef", FFFFV);
        caps.glScaled = load.invoke("glScaled", DDDV);
        caps.glScalef = load.invoke("glScalef", FFFV);
        caps.glSelectBuffer = load.invoke("glSelectBuffer", IPV);
        caps.glShadeModel = load.invoke("glShadeModel", IV);
        caps.glTexCoord1d = load.invoke("glTexCoord1d", DV);
        caps.glTexCoord1dv = load.invoke("glTexCoord1dv", PV);
        caps.glTexCoord1f = load.invoke("glTexCoord1f", FV);
        caps.glTexCoord1fv = load.invoke("glTexCoord1fv", PV);
        caps.glTexCoord1i = load.invoke("glTexCoord1i", IV);
        caps.glTexCoord1iv = load.invoke("glTexCoord1iv", PV);
        caps.glTexCoord1s = load.invoke("glTexCoord1s", SV);
        caps.glTexCoord1sv = load.invoke("glTexCoord1sv", PV);
        caps.glTexCoord2d = load.invoke("glTexCoord2d", DDV);
        caps.glTexCoord2dv = load.invoke("glTexCoord2dv", PV);
        caps.glTexCoord2f = load.invoke("glTexCoord2f", FFV);
        caps.glTexCoord2fv = load.invoke("glTexCoord2fv", PV);
        caps.glTexCoord2i = load.invoke("glTexCoord2i", IIV);
        caps.glTexCoord2iv = load.invoke("glTexCoord2iv", PV);
        caps.glTexCoord2s = load.invoke("glTexCoord2s", SSV);
        caps.glTexCoord2sv = load.invoke("glTexCoord2sv", PV);
        caps.glTexCoord3d = load.invoke("glTexCoord3d", DDDV);
        caps.glTexCoord3dv = load.invoke("glTexCoord3dv", PV);
        caps.glTexCoord3f = load.invoke("glTexCoord3f", FFFV);
        caps.glTexCoord3fv = load.invoke("glTexCoord3fv", PV);
        caps.glTexCoord3i = load.invoke("glTexCoord3i", IIIV);
        caps.glTexCoord3iv = load.invoke("glTexCoord3iv", PV);
        caps.glTexCoord3s = load.invoke("glTexCoord3s", SSSV);
        caps.glTexCoord3sv = load.invoke("glTexCoord3sv", PV);
        caps.glTexCoord4d = load.invoke("glTexCoord4d", DDDDV);
        caps.glTexCoord4dv = load.invoke("glTexCoord4dv", PV);
        caps.glTexCoord4f = load.invoke("glTexCoord4f", FFFFV);
        caps.glTexCoord4fv = load.invoke("glTexCoord4fv", PV);
        caps.glTexCoord4i = load.invoke("glTexCoord4i", IIIIV);
        caps.glTexCoord4iv = load.invoke("glTexCoord4iv", PV);
        caps.glTexCoord4s = load.invoke("glTexCoord4s", SSSSV);
        caps.glTexCoord4sv = load.invoke("glTexCoord4sv", PV);
        caps.glTexEnvf = load.invoke("glTexEnvf", IIFV);
        caps.glTexEnvfv = load.invoke("glTexEnvfv", IIPV);
        caps.glTexEnvi = load.invoke("glTexEnvi", IIIV);
        caps.glTexEnviv = load.invoke("glTexEnviv", IIPV);
        caps.glTexGend = load.invoke("glTexGend", IIDV);
        caps.glTexGendv = load.invoke("glTexGendv", IIPV);
        caps.glTexGenf = load.invoke("glTexGenf", IIFV);
        caps.glTexGenfv = load.invoke("glTexGenfv", IIPV);
        caps.glTexGeni = load.invoke("glTexGeni", IIIV);
        caps.glTexGeniv = load.invoke("glTexGeniv", IIPV);
        caps.glTranslated = load.invoke("glTranslated", DDDV);
        caps.glTranslatef = load.invoke("glTranslatef", FFFV);
        caps.glVertex2d = load.invoke("glVertex2d", DDV);
        caps.glVertex2dv = load.invoke("glVertex2dv", PV);
        caps.glVertex2f = load.invoke("glVertex2f", FFV);
        caps.glVertex2fv = load.invoke("glVertex2fv", PV);
        caps.glVertex2i = load.invoke("glVertex2i", IIV);
        caps.glVertex2iv = load.invoke("glVertex2iv", PV);
        caps.glVertex2s = load.invoke("glVertex2s", SSV);
        caps.glVertex2sv = load.invoke("glVertex2sv", PV);
        caps.glVertex3d = load.invoke("glVertex3d", DDDV);
        caps.glVertex3dv = load.invoke("glVertex3dv", PV);
        caps.glVertex3f = load.invoke("glVertex3f", FFFV);
        caps.glVertex3fv = load.invoke("glVertex3fv", PV);
        caps.glVertex3i = load.invoke("glVertex3i", IIIV);
        caps.glVertex3iv = load.invoke("glVertex3iv", PV);
        caps.glVertex3s = load.invoke("glVertex3s", SSSV);
        caps.glVertex3sv = load.invoke("glVertex3sv", PV);
        caps.glVertex4d = load.invoke("glVertex4d", DDDDV);
        caps.glVertex4dv = load.invoke("glVertex4dv", PV);
        caps.glVertex4f = load.invoke("glVertex4f", FFFFV);
        caps.glVertex4fv = load.invoke("glVertex4fv", PV);
        caps.glVertex4i = load.invoke("glVertex4i", IIIIV);
        caps.glVertex4iv = load.invoke("glVertex4iv", PV);
        caps.glVertex4s = load.invoke("glVertex4s", SSSSV);
        caps.glVertex4sv = load.invoke("glVertex4sv", PV);
    }

    public static void accum(int op, float value) {
        var caps = getCapabilities();
        try {
            check(caps.glAccum).invokeExact(op, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void alphaFunc(int func, float ref) {
        var caps = getCapabilities();
        try {
            check(caps.glAlphaFunc).invokeExact(func, ref);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void begin(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glBegin).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, MemorySegment bitmap) {
        var caps = getCapabilities();
        try {
            check(caps.glBitmap).invokeExact(width, height, xorig, yorig, xmove, ymove, bitmap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void callList(int list) {
        var caps = getCapabilities();
        try {
            check(caps.glCallList).invokeExact(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void callLists(int n, int type, MemorySegment lists) {
        var caps = getCapabilities();
        try {
            check(caps.glCallLists).invokeExact(n, type, lists);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearAccum(float red, float green, float blue, float alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glClearAccum).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearIndex(float c) {
        var caps = getCapabilities();
        try {
            check(caps.glClearIndex).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clipPlane(int plane, MemorySegment equation) {
        var caps = getCapabilities();
        try {
            check(caps.glClipPlane).invokeExact(plane, equation);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clipPlane(SegmentAllocator allocator, int plane, double[] equation) {
        clipPlane(plane, allocator.allocateArray(JAVA_DOUBLE, equation));
    }


    public static void color3b(byte red, byte green, byte blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3b).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3bv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3bv(SegmentAllocator allocator, byte[] v) {
        color3bv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void color3d(double red, double green, double blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3d).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3dv(SegmentAllocator allocator, double[] v) {
        color3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void color3f(float red, float green, float blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3f).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3fv(SegmentAllocator allocator, float[] v) {
        color3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void color3i(int red, int green, int blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3i).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3iv(SegmentAllocator allocator, int[] v) {
        color3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void color3s(short red, short green, short blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3s).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3sv(SegmentAllocator allocator, short[] v) {
        color3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void color3ub(byte red, byte green, byte blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3ub).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3ubv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3ubv(SegmentAllocator allocator, byte[] v) {
        color3ubv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void color3ui(int red, int green, int blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3ui).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3uiv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3uiv(SegmentAllocator allocator, int[] v) {
        color3uiv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void color3us(short red, short green, short blue) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3us).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3usv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor3usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color3usv(SegmentAllocator allocator, short[] v) {
        color3usv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void color4b(byte red, byte green, byte blue, byte alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4b).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4bv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4bv(SegmentAllocator allocator, byte[] v) {
        color4bv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void color4d(double red, double green, double blue, double alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4d).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4dv(SegmentAllocator allocator, double[] v) {
        color4dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void color4f(float red, float green, float blue, float alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4f).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4fv(SegmentAllocator allocator, float[] v) {
        color4fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void color4i(int red, int green, int blue, int alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4i).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4iv(SegmentAllocator allocator, int[] v) {
        color4iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void color4s(short red, short green, short blue, short alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4s).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4sv(SegmentAllocator allocator, short[] v) {
        color4sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void color4ub(byte red, byte green, byte blue, byte alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4ub).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4ubv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4ubv(SegmentAllocator allocator, byte[] v) {
        color4ubv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void color4ui(int red, int green, int blue, int alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4ui).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4uiv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4uiv(SegmentAllocator allocator, int[] v) {
        color4uiv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void color4us(short red, short green, short blue, short alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4us).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4usv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glColor4usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void color4usv(SegmentAllocator allocator, short[] v) {
        color4usv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void colorMaterial(int face, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glColorMaterial).invokeExact(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyPixels(int x, int y, int width, int height, int type) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyPixels).invokeExact(x, y, width, height, type);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteLists(int list, int range) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteLists).invokeExact(list, range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawPixels(int width, int height, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawPixels).invokeExact(width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlag(boolean flag) {
        var caps = getCapabilities();
        try {
            check(caps.glEdgeFlag).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlagv(MemorySegment flag) {
        var caps = getCapabilities();
        try {
            check(caps.glEdgeFlagv).invokeExact(flag);
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
        var caps = getCapabilities();
        try {
            check(caps.glEnd).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endList() {
        var caps = getCapabilities();
        try {
            check(caps.glEndList).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1d(double u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord1d).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1dv(MemorySegment u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord1dv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1dv(SegmentAllocator allocator, double[] u) {
        evalCoord1dv(allocator.allocateArray(JAVA_DOUBLE, u));
    }

    public static void evalCoord1f(float u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord1f).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1fv(MemorySegment u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord1fv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord1fv(SegmentAllocator allocator, float[] u) {
        evalCoord1fv(allocator.allocateArray(JAVA_FLOAT, u));
    }

    public static void evalCoord2d(double u, double v) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord2d).invokeExact(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2dv(MemorySegment u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord2dv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2dv(SegmentAllocator allocator, double[] u) {
        evalCoord2dv(allocator.allocateArray(JAVA_DOUBLE, u));
    }

    public static void evalCoord2f(float u, float v) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord2f).invokeExact(u, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2fv(MemorySegment u) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalCoord2fv).invokeExact(u);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalCoord2fv(SegmentAllocator allocator, float[] u) {
        evalCoord2fv(allocator.allocateArray(JAVA_FLOAT, u));
    }

    public static void evalMesh1(int mode, int i1, int i2) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalMesh1).invokeExact(mode, i1, i2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalMesh2(int mode, int i1, int i2, int j1, int j2) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalMesh2).invokeExact(mode, i1, i2, j1, j2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalPoint1(int mode, int i) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalPoint1).invokeExact(mode, i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void evalPoint2(int mode, int i, int j) {
        var caps = getCapabilities();
        try {
            check(caps.glEvalPoint2).invokeExact(mode, i, j);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void feedbackBuffer(int size, int type, MemorySegment buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glFeedbackBuffer).invokeExact(size, type, buffer);
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
        var caps = getCapabilities();
        try {
            check(caps.glFogf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogfv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glFogfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogfv(SegmentAllocator allocator, int pname, float[] params) {
        fogfv(pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void fogi(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glFogi).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogiv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glFogiv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogiv(SegmentAllocator allocator, int pname, int[] params) {
        fogiv(pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void frustum(double left, double right, double bottom, double top, double zNear, double zFar) {
        var caps = getCapabilities();
        try {
            check(caps.glFrustum).invokeExact(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int genLists(int range) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGenLists).invokeExact(range);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getClipPlane(int plane, MemorySegment equation) {
        var caps = getCapabilities();
        try {
            check(caps.glGetClipPlane).invokeExact(plane, equation);
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

    public static void getLightfv(int light, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetLightfv).invokeExact(light, pname, params);
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

    public static void getLightiv(int light, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetLightiv).invokeExact(light, pname, params);
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

    public static void getMapdv(int target, int query, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMapdv).invokeExact(target, query, v);
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

    public static void getMapfv(int target, int query, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMapfv).invokeExact(target, query, v);
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

    public static void getMapiv(int target, int query, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMapiv).invokeExact(target, query, v);
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

    public static void getMaterialfv(int face, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMaterialfv).invokeExact(face, pname, params);
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

    public static void getMaterialiv(int face, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMaterialiv).invokeExact(face, pname, params);
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

    public static void getPixelMapfv(int map, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetPixelMapfv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapfv(SegmentAllocator allocator, int map, float[] values) {
        var pValues = allocator.allocateArray(JAVA_FLOAT, values.length);
        getPixelMapfv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPixelMapuiv(int map, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetPixelMapuiv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapuiv(SegmentAllocator allocator, int map, int[] values) {
        var pValues = allocator.allocateArray(JAVA_INT, values.length);
        getPixelMapuiv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPixelMapusv(int map, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetPixelMapusv).invokeExact(map, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPixelMapusv(SegmentAllocator allocator, int map, short[] values) {
        var pValues = allocator.allocateArray(JAVA_SHORT, values.length);
        getPixelMapusv(map, pValues);
        RuntimeHelper.toArray(pValues, values);
    }

    public static void getPolygonStipple(MemorySegment mask) {
        var caps = getCapabilities();
        try {
            check(caps.glGetPolygonStipple).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getPolygonStipple(SegmentAllocator allocator, byte[] mask) {
        var pMask = allocator.allocateArray(JAVA_BYTE, mask.length);
        getPolygonStipple(pMask);
        RuntimeHelper.toArray(pMask, mask);
    }

    public static void getTexEnvfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexEnvfv).invokeExact(target, pname, params);
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

    public static void getTexEnviv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexEnviv).invokeExact(target, pname, params);
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

    public static void getTexGendv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexGendv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexGendv(SegmentAllocator allocator, int coord, int pname, double[] params) {
        var pParams = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getTexGendv(coord, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static void getTexGenfv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexGenfv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexGenfv(SegmentAllocator allocator, int coord, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexGenfv(coord, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static void getTexGeniv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexGeniv).invokeExact(coord, pname, params);
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
        var caps = getCapabilities();
        try {
            check(caps.glIndexMask).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexd(double c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexd).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexdv(MemorySegment c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexdv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexdv(SegmentAllocator allocator, double[] c) {
        indexdv(allocator.allocateArray(JAVA_DOUBLE, c));
    }

    public static void indexf(float c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexf).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexfv(MemorySegment c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexfv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexfv(SegmentAllocator allocator, float[] c) {
        indexfv(allocator.allocateArray(JAVA_FLOAT, c));
    }

    public static void indexi(int c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexi).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexiv(MemorySegment c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexiv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexiv(SegmentAllocator allocator, int[] c) {
        indexiv(allocator.allocateArray(JAVA_INT, c));
    }

    public static void indexs(short c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexs).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexsv(MemorySegment c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexsv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexsv(SegmentAllocator allocator, short[] c) {
        indexsv(allocator.allocateArray(JAVA_SHORT, c));
    }

    public static void initNames() {
        var caps = getCapabilities();
        try {
            check(caps.glInitNames).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isList(int list) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsList).invokeExact(list);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelf(int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glLightModelf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelfv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glLightModelfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModelfv(SegmentAllocator allocator, int pname, float[] params) {
        lightModelfv(pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void lightModeli(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glLightModeli).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModeliv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glLightModeliv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightModeliv(SegmentAllocator allocator, int pname, int[] params) {
        lightModeliv(pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void lightf(int light, int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glLightf).invokeExact(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightfv(int light, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glLightfv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightfv(SegmentAllocator allocator, int light, int pname, float[] params) {
        lightfv(light, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void lighti(int light, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glLighti).invokeExact(light, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightiv(int light, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glLightiv).invokeExact(light, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lightiv(SegmentAllocator allocator, int light, int pname, int[] params) {
        lightiv(light, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void lineStipple(int factor, short pattern) {
        var caps = getCapabilities();
        try {
            check(caps.glLineStipple).invokeExact(factor, pattern);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listBase(int base) {
        var caps = getCapabilities();
        try {
            check(caps.glListBase).invokeExact(base);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadIdentity() {
        var caps = getCapabilities();
        try {
            check(caps.glLoadIdentity).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixd(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glLoadMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixd(SegmentAllocator allocator, double[] m) {
        loadMatrixd(allocator.allocateArray(JAVA_DOUBLE, m));
    }

    public static void loadMatrixf(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glLoadMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadMatrixf(SegmentAllocator allocator, float[] m) {
        loadMatrixf(allocator.allocateArray(JAVA_FLOAT, m));
    }

    public static void loadName(int name) {
        var caps = getCapabilities();
        try {
            check(caps.glLoadName).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1d(int target, double u1, double u2, int stride, int order, MemorySegment points) {
        var caps = getCapabilities();
        try {
            check(caps.glMap1d).invokeExact(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1d(SegmentAllocator allocator, int target, double u1, double u2, int stride, int order, double[] points) {
        map1d(target, u1, u2, stride, order, allocator.allocateArray(JAVA_DOUBLE, points));
    }

    public static void map1f(int target, float u1, float u2, int stride, int order, MemorySegment points) {
        var caps = getCapabilities();
        try {
            check(caps.glMap1f).invokeExact(target, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map1f(SegmentAllocator allocator, int target, float u1, float u2, int stride, int order, float[] points) {
        map1f(target, u1, u2, stride, order, allocator.allocateArray(JAVA_FLOAT, points));
    }

    public static void map2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, MemorySegment points) {
        var caps = getCapabilities();
        try {
            check(caps.glMap2d).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map2d(SegmentAllocator allocator, int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        map2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, allocator.allocateArray(JAVA_DOUBLE, points));
    }

    public static void map2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, MemorySegment points) {
        var caps = getCapabilities();
        try {
            check(caps.glMap2f).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void map2f(SegmentAllocator allocator, int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        map2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, allocator.allocateArray(JAVA_FLOAT, points));
    }

    public static void mapGrid1d(int un, double u1, double u2) {
        var caps = getCapabilities();
        try {
            check(caps.glMapGrid1d).invokeExact(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid1f(int un, float u1, float u2) {
        var caps = getCapabilities();
        try {
            check(caps.glMapGrid1f).invokeExact(un, u1, u2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        var caps = getCapabilities();
        try {
            check(caps.glMapGrid2d).invokeExact(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void mapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        var caps = getCapabilities();
        try {
            check(caps.glMapGrid2f).invokeExact(un, u1, u2, vn, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialf(int face, int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glMaterialf).invokeExact(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialfv(int face, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glMaterialfv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialfv(SegmentAllocator allocator, int face, int pname, float[] params) {
        materialfv(face, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void materiali(int face, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glMateriali).invokeExact(face, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialiv(int face, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glMaterialiv).invokeExact(face, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void materialiv(SegmentAllocator allocator, int face, int pname, int[] params) {
        materialiv(face, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void matrixMode(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glMatrixMode).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixd(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glMultMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixd(SegmentAllocator allocator, double[] m) {
        multMatrixd(allocator.allocateArray(JAVA_DOUBLE, m));
    }

    public static void multMatrixf(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glMultMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multMatrixf(SegmentAllocator allocator, float[] m) {
        multMatrixf(allocator.allocateArray(JAVA_FLOAT, m));
    }

    public static void newList(int list, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glNewList).invokeExact(list, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3b(byte nx, byte ny, byte nz) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3b).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3bv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3bv(SegmentAllocator allocator, byte[] v) {
        normal3bv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void normal3d(double nx, double ny, double nz) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3d).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3dv(SegmentAllocator allocator, double[] v) {
        normal3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void normal3f(float nx, float ny, float nz) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3f).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3fv(SegmentAllocator allocator, float[] v) {
        normal3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void normal3i(int nx, int ny, int nz) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3i).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3iv(SegmentAllocator allocator, int[] v) {
        normal3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void normal3s(short nx, short ny, short nz) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3s).invokeExact(nx, ny, nz);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glNormal3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normal3sv(SegmentAllocator allocator, short[] v) {
        normal3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void ortho(double left, double right, double bottom, double top, double zNear, double zFar) {
        var caps = getCapabilities();
        try {
            check(caps.glOrtho).invokeExact(left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void passThrough(float token) {
        var caps = getCapabilities();
        try {
            check(caps.glPassThrough).invokeExact(token);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapfv(int map, int mapSize, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelMapfv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapfv(SegmentAllocator allocator, int map, float[] values) {
        pixelMapfv(map, values.length, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void pixelMapuiv(int map, int mapSize, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelMapuiv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapuiv(SegmentAllocator allocator, int map, int[] values) {
        pixelMapuiv(map, values.length, allocator.allocateArray(JAVA_INT, values));
    }

    public static void pixelMapusv(int map, int mapSize, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelMapusv).invokeExact(map, mapSize, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelMapusv(SegmentAllocator allocator, int map, short[] values) {
        pixelMapusv(map, values.length, allocator.allocateArray(JAVA_SHORT, values));
    }

    public static void pixelTransferf(int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelTransferf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelTransferi(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelTransferi).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelZoom(float xfactor, float yfactor) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelZoom).invokeExact(xfactor, yfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonStipple(MemorySegment mask) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonStipple).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonStipple(SegmentAllocator allocator, byte[] mask) {
        polygonStipple(allocator.allocateArray(JAVA_BYTE, mask));
    }

    public static void popAttrib() {
        var caps = getCapabilities();
        try {
            check(caps.glPopAttrib).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void popMatrix() {
        var caps = getCapabilities();
        try {
            check(caps.glPopMatrix).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void popName() {
        var caps = getCapabilities();
        try {
            check(caps.glPopName).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushAttrib(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glPushAttrib).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushMatrix() {
        var caps = getCapabilities();
        try {
            check(caps.glPushMatrix).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushName(int name) {
        var caps = getCapabilities();
        try {
            check(caps.glPushName).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2d(double x, double y) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2dv(SegmentAllocator allocator, double[] v) {
        rasterPos2dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void rasterPos2f(float x, float y) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2fv(SegmentAllocator allocator, float[] v) {
        rasterPos2fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void rasterPos2i(int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2iv(SegmentAllocator allocator, int[] v) {
        rasterPos2iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void rasterPos2s(short x, short y) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos2sv(SegmentAllocator allocator, short[] v) {
        rasterPos2sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void rasterPos3d(double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3dv(SegmentAllocator allocator, double[] v) {
        rasterPos3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void rasterPos3f(float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3fv(SegmentAllocator allocator, float[] v) {
        rasterPos3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void rasterPos3i(int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3iv(SegmentAllocator allocator, int[] v) {
        rasterPos3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void rasterPos3s(short x, short y, short z) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos3sv(SegmentAllocator allocator, short[] v) {
        rasterPos3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void rasterPos4d(double x, double y, double z, double w) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4d).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4dv(SegmentAllocator allocator, double[] v) {
        rasterPos4dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void rasterPos4f(float x, float y, float z, float w) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4f).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4fv(SegmentAllocator allocator, float[] v) {
        rasterPos4fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void rasterPos4i(int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4i).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4iv(SegmentAllocator allocator, int[] v) {
        rasterPos4iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void rasterPos4s(short x, short y, short z, short w) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4s).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glRasterPos4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rasterPos4sv(SegmentAllocator allocator, short[] v) {
        rasterPos4sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void rectd(double x1, double y1, double x2, double y2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectd).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectdv(MemorySegment v1, MemorySegment v2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectdv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectdv(SegmentAllocator allocator, double[] v1, double[] v2) {
        rectdv(allocator.allocateArray(JAVA_DOUBLE, v1), allocator.allocateArray(JAVA_DOUBLE, v2));
    }

    public static void rectf(float x1, float y1, float x2, float y2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectf).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectfv(MemorySegment v1, MemorySegment v2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectfv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectfv(SegmentAllocator allocator, float[] v1, float[] v2) {
        rectfv(allocator.allocateArray(JAVA_FLOAT, v1), allocator.allocateArray(JAVA_FLOAT, v2));
    }

    public static void recti(int x1, int y1, int x2, int y2) {
        var caps = getCapabilities();
        try {
            check(caps.glRecti).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectiv(MemorySegment v1, MemorySegment v2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectiv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectiv(SegmentAllocator allocator, int[] v1, int[] v2) {
        rectiv(allocator.allocateArray(JAVA_INT, v1), allocator.allocateArray(JAVA_INT, v2));
    }

    public static void rects(short x1, short y1, short x2, short y2) {
        var caps = getCapabilities();
        try {
            check(caps.glRects).invokeExact(x1, y1, x2, y2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectsv(MemorySegment v1, MemorySegment v2) {
        var caps = getCapabilities();
        try {
            check(caps.glRectsv).invokeExact(v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rectsv(SegmentAllocator allocator, short[] v1, short[] v2) {
        rectsv(allocator.allocateArray(JAVA_SHORT, v1), allocator.allocateArray(JAVA_SHORT, v2));
    }

    public static int renderMode(int mode) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glRenderMode).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rotated(double angle, double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glRotated).invokeExact(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void rotatef(float angle, float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glRotatef).invokeExact(angle, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scaled(double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glScaled).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scalef(float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glScalef).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void selectBuffer(int size, MemorySegment buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glSelectBuffer).invokeExact(size, buffer);
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
        var caps = getCapabilities();
        try {
            check(caps.glShadeModel).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1d(double s) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1d).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1dv(SegmentAllocator allocator, double[] v) {
        texCoord1dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void texCoord1f(float s) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1f).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1fv(SegmentAllocator allocator, float[] v) {
        texCoord1fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void texCoord1i(int s) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1i).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1iv(SegmentAllocator allocator, int[] v) {
        texCoord1iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void texCoord1s(short s) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1s).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord1sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord1sv(SegmentAllocator allocator, short[] v) {
        texCoord1sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void texCoord2d(double s, double t) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2d).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2dv(SegmentAllocator allocator, double[] v) {
        texCoord2dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void texCoord2f(float s, float t) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2f).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2fv(SegmentAllocator allocator, float[] v) {
        texCoord2fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void texCoord2i(int s, int t) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2i).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2iv(SegmentAllocator allocator, int[] v) {
        texCoord2iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void texCoord2s(short s, short t) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2s).invokeExact(s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord2sv(SegmentAllocator allocator, short[] v) {
        texCoord2sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void texCoord3d(double s, double t, double r) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3d).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3dv(SegmentAllocator allocator, double[] v) {
        texCoord3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void texCoord3f(float s, float t, float r) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3f).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3fv(SegmentAllocator allocator, float[] v) {
        texCoord3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void texCoord3i(int s, int t, int r) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3i).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3iv(SegmentAllocator allocator, int[] v) {
        texCoord3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void texCoord3s(short s, short t, short r) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3s).invokeExact(s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord3sv(SegmentAllocator allocator, short[] v) {
        texCoord3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void texCoord4d(double s, double t, double r, double q) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4d).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4dv(SegmentAllocator allocator, double[] v) {
        texCoord4dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void texCoord4f(float s, float t, float r, float q) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4f).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4fv(SegmentAllocator allocator, float[] v) {
        texCoord4fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void texCoord4i(int s, int t, int r, int q) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4i).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4iv(SegmentAllocator allocator, int[] v) {
        texCoord4iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void texCoord4s(short s, short t, short r, short q) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4s).invokeExact(s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoord4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoord4sv(SegmentAllocator allocator, short[] v) {
        texCoord4sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void texEnvf(int target, int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexEnvf).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnvfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexEnvfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnvfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        texEnvfv(target, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void texEnvi(int target, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexEnvi).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnviv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexEnviv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texEnviv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texEnviv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void texGend(int coord, int pname, double param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGend).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGendv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGendv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGendv(SegmentAllocator allocator, int coord, int pname, double[] params) {
        texGendv(coord, pname, allocator.allocateArray(JAVA_DOUBLE, params));
    }

    public static void texGenf(int coord, int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGenf).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGenfv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGenfv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGenfv(SegmentAllocator allocator, int coord, int pname, float[] params) {
        texGenfv(coord, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void texGeni(int coord, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGeni).invokeExact(coord, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGeniv(int coord, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexGeniv).invokeExact(coord, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texGeniv(SegmentAllocator allocator, int coord, int pname, int[] params) {
        texGeniv(coord, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void translated(double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glTranslated).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void translatef(float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glTranslatef).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2d(double x, double y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2dv(SegmentAllocator allocator, double[] v) {
        vertex2dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertex2f(float x, float y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2fv(SegmentAllocator allocator, float[] v) {
        vertex2fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertex2i(int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2iv(SegmentAllocator allocator, int[] v) {
        vertex2iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertex2s(short x, short y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex2sv(SegmentAllocator allocator, short[] v) {
        vertex2sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertex3d(double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3dv(SegmentAllocator allocator, double[] v) {
        vertex3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertex3f(float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3fv(SegmentAllocator allocator, float[] v) {
        vertex3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertex3i(int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3iv(SegmentAllocator allocator, int[] v) {
        vertex3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertex3s(short x, short y, short z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex3sv(SegmentAllocator allocator, short[] v) {
        vertex3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertex4d(double x, double y, double z, double w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4d).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4dv(SegmentAllocator allocator, double[] v) {
        vertex4dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertex4f(float x, float y, float z, float w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4f).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4fv(SegmentAllocator allocator, float[] v) {
        vertex4fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertex4i(int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4i).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4iv(SegmentAllocator allocator, int[] v) {
        vertex4iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertex4s(short x, short y, short z, short w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4s).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertex4sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertex4sv(SegmentAllocator allocator, short[] v) {
        vertex4sv(allocator.allocateArray(JAVA_SHORT, v));
    }
}
